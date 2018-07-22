package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import control.Aluno;
import model.AlunoDAO;

/**
 * @author Douglas Coelho Goveia de Almeida
 */

public class ViewJMenu extends javax.swing.JFrame {

    /**
     * Cria novo formulário ViewJMenu
     */
	
    public ViewJMenu() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTNomeAluno.getModel();
        jTNomeAluno.setRowSorter(new TableRowSorter(modelo));

        readJTable();

    }

    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTNomeAluno.getModel();
        modelo.setNumRows(0);
        
        AlunoDAO adao = new AlunoDAO();

        for (Aluno a : adao.read()) {

            modelo.addRow(new Object[]{
                a.getId(),
                a.getNomeAluno(),
                a.getCurso(),
                a.getNota()
            });

        }

    }
    public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTNomeAluno.getModel();
        modelo.setNumRows(0);
        AlunoDAO adao = new AlunoDAO();

        for (Aluno a : adao.readForDesc(desc)) {

            modelo.addRow(new Object[]{
                a.getId(),
                a.getNomeAluno(),
                a.getCurso(),
                a.getNota()
            });

        }

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNomeAluno = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtBuscaAluno = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTNomeAluno = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome do Aluno");

        jLabel2.setText("Curso");

        jLabel3.setText("Nota");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    	.addComponent(txtBuscaAluno)
                        .addComponent(jButton4)
                        .addGap(18, 18, 100)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(56, 56, 56)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                	.addComponent(txtBuscaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                	.addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(19, 19, 19))
        );

        jTNomeAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Aluno", "Curso", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTNomeAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosMouseClicked(evt);
            }
        });
        jTNomeAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTProdutosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTNomeAluno);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
     
    	Aluno a = new Aluno();
    	AlunoDAO dao = new AlunoDAO();

        a.setNomeAluno(txtNomeAluno.getText());
        a.setCurso(txtCurso.getText());
        a.setNota(Double.parseDouble(txtNota.getText()));
        dao.create(a);

        txtNomeAluno.setText("");
        txtCurso.setText("");
        txtNota.setText("");

        readJTable();

    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        if (jTNomeAluno.getSelectedRow() != -1) {

        	Aluno a = new Aluno();
        	AlunoDAO dao = new AlunoDAO();

            a.setId((int) jTNomeAluno.getValueAt(jTNomeAluno.getSelectedRow(), 0));
            
            dao.delete(a);

            txtNomeAluno.setText("");
            txtCurso.setText("");
            txtNota.setText("");

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um aluno para excluir.");
        }


    }

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {
      
        if (jTNomeAluno.getSelectedRow() != -1) {

            txtNomeAluno.setText(jTNomeAluno.getValueAt(jTNomeAluno.getSelectedRow(), 1).toString());
            txtCurso.setText(jTNomeAluno.getValueAt(jTNomeAluno.getSelectedRow(), 2).toString());
            txtNota.setText(jTNomeAluno.getValueAt(jTNomeAluno.getSelectedRow(), 3).toString());

        }

    }

    private void jTProdutosKeyReleased(java.awt.event.KeyEvent evt) {
      
        if (jTNomeAluno.getSelectedRow() != -1) {

            txtNomeAluno.setText(jTNomeAluno.getValueAt(jTNomeAluno.getSelectedRow(), 1).toString());
            txtCurso.setText(jTNomeAluno.getValueAt(jTNomeAluno.getSelectedRow(), 2).toString());
            txtNota.setText(jTNomeAluno.getValueAt(jTNomeAluno.getSelectedRow(), 3).toString());

        }

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        if (jTNomeAluno.getSelectedRow() != -1) {

        	Aluno a = new Aluno();
        	AlunoDAO dao = new AlunoDAO();

            a.setNomeAluno(txtNomeAluno.getText());
            a.setCurso(txtCurso.getText());
            a.setNota(Double.parseDouble(txtNota.getText()));
            a.setId((int) jTNomeAluno.getValueAt(jTNomeAluno.getSelectedRow(), 0));
            dao.update(a);

            txtNomeAluno.setText("");
            txtCurso.setText("");
            txtNota.setText("");

            readJTable();

        }


    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
                
        readJTableForDesc(txtBuscaAluno.getText());
        
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewJMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewJMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewJMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewJMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewJMenu().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTNomeAluno;
    private javax.swing.JTextField txtBuscaAluno;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtCurso;

}
