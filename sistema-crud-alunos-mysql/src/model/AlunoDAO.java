package model;

import connection.ConnectionFactory;
import control.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Douglas Coelho Goveia de Almeida
 */

public class AlunoDAO {

    public void create(Aluno a) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO alunos (nome,curso,nota)VALUES(?,?,?)");
            stmt.setString(1, a.getNomeAluno());
            stmt.setString(2, a.getCurso());
            stmt.setDouble(3, a.getNota());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Aluno> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Aluno> Alunos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM alunos");
            rs = stmt.executeQuery();

            while (rs.next()) {

            	Aluno aluno = new Aluno();

            	aluno.setId(rs.getInt("id"));
            	aluno.setNomeAluno(rs.getString("nome"));
                aluno.setCurso(rs.getString("curso"));
                aluno.setNota(rs.getDouble("nota"));
                Alunos.add(aluno);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return Alunos;

    }
    public List<Aluno> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Aluno> alunos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM alunos WHERE nome LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

            	Aluno aluno = new Aluno();

            	aluno.setId(rs.getInt("id"));
            	aluno.setNomeAluno(rs.getString("nome"));
            	aluno.setCurso(rs.getString("curso"));
            	aluno.setNota(rs.getDouble("nota"));
                alunos.add(aluno);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return alunos;

    }

    public void update(Aluno a) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE alunos SET nome = ? ,curso = ?,nota = ? WHERE id = ?");
            stmt.setString(1, a.getNomeAluno());
            stmt.setString(2, a.getCurso());
            stmt.setDouble(3, a.getNota());
            stmt.setInt(4, a.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Aluno a) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM alunos WHERE id = ?");
            stmt.setInt(1, a.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
