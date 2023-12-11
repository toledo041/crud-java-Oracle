/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exampleapp.login;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.CallableStatement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oracle.jdbc.OracleTypes;


public class ConsultaEmpleados extends javax.swing.JFrame {
    private ArrayList<ComplementaryActivityCompanyModel> elementos = new ArrayList<>();
    private int idUser;
    /**
     * Creates new form Login
     */
    public ConsultaEmpleados() {
        initComponents();
        llenarTabla(); 
        centrarVentanaEnPantalla();
        setVisible(true);
        
        ConsultaEmpleados.this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.out.println(".windowClosing()");                               
                // Cierra el formulario actual
                ConsultaEmpleados.this.dispose();
                
                LoginForm form = new LoginForm();
                form.setVisible(true);
            }
        });
        ConsultaEmpleados.this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ComplementaryActivityCompany");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setName("TablaEmpleados"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Register new element");
        jButton2.setActionCommand("");
        jButton2.setName("registrarBtn"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 603, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        EmpleadoElement element = new EmpleadoElement("Crear");
        element.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                                           
            ConsultaEmpleados instancia = new ConsultaEmpleados();
            instancia.llenarTabla(); 
            instancia.centrarVentanaEnPantalla();
            instancia.setVisible(true);
            }
        });
    }
    
    
    public void llenarTabla(){
        
        elementos = new ArrayList<>();
        // Crear el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel();
        //EmpleadoModeloTabla model = new EmpleadoModeloTabla();
        
        // Añadir las columnas al modelo (puedes adaptar esto a tu estructura de tabla)
        model.addColumn("IdComplementaryActivityCompany");
        model.addColumn("Idcompany");
        model.addColumn("Name");
        model.addColumn("Idcomplementaryactivity");
        model.addColumn("Activityname");
        model.addColumn("Update");
        model.addColumn("Delete");
                                
        
        
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe"; 
        String username = "system";
        String password = "123456789";
        

        try {
            Connection connection = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Resto del código sin cambios
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Controlador JDBC no encontrado.");
        }
            
        //Connection 
        connection = DriverManager.getConnection(jdbcUrl, username, password);
        //Se hace la consulta a la base de datos con el query 
        String selectQuery = "select idComplementaryActivityCompany,company.idcompany as idcompany,company.name as name, complementaryactivitycompany.idcomplementaryactivity as idcomplementaryactivity, complementaryactivity.activityname as  from ComplementaryActivityCompany INNER JOIN Company on company.idcompany = complementaryactivitycompany.idcompany  INNER JOIN complementaryactivity on complementaryactivity.idcomplementaryactivity = complementaryactivitycompany.idcomplementaryactivity where ComplementaryActivityCompany.status = 1 order by idComplementaryActivityCompany";
            System.out.println("consulta\n"+selectQuery);
                //"select id_empleado,nombre,correo,telefono from Empleados";//SYSTEM.
        //Se ejecuta la consulta
        /*PreparedStatement preparedStatement = connection.prepareStatement(
                selectQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("exampleapp.login.ConsultaEmpleados.llenarTabla() "+resultSet.first());
        //Si trae información se recorren los registros para agregarlos a la tabla
        while (resultSet.next()) {
            System.out.println("exampleapp.login.ConsultaEmpleados.llenarTabla()");
            int id = resultSet.getInt("idComplementaryActivityCompany");
            int idcompany = Integer.getInteger(resultSet.getString("idcompany"));
            String name = resultSet.getString("name");
            int idcomplementaryactivity = Integer.getInteger(resultSet.getString("idcomplementaryactivity"));
            String activityname = resultSet.getString("activityname");                
            //arreglo de columnas por cada renglon de la consulta
            Object[] row = new Object[5]; 
            row[0] = (Object)id; 
            row[1] = (Object)idcompany;
            row[2] = (Object)name; 
            row[3] = (Object)idcomplementaryactivity;
            row[4] = (Object)activityname;
            // Se agrega el row al modelo de la tabla
            model.addRow(row);
            elementos.add(new ComplementaryActivityCompanyModel(id,idcompany,""+name,idcomplementaryactivity,""+activityname,0));
            System.out.println("Id: " + id +"id company: "+idcompany+ ", name: " + name + " idcomplementaryactivity " + idcomplementaryactivity + ", activityname: " + activityname);
        }*/

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            CallableStatement callableStatement = conn.prepareCall("{call ObtenerDatosComplementaryActivityCompany(?)}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();

            ResultSet rs = (ResultSet) callableStatement.getObject(1);

            //DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            while (rs.next()) {
                int idComplementaryActivityCompany = rs.getInt("idComplementaryActivityCompany");
                int idCompany = rs.getInt("idcompany");
                String name = rs.getString("name");
                int idComplementaryActivity = rs.getInt("idcomplementaryactivity");
                String activityName = rs.getString("activityname");

                // Agregar fila a la tabla
                Object[] row = new Object[5]; 
                row[0] = (Object)idComplementaryActivityCompany; 
                row[1] = (Object)idCompany;
                row[2] = (Object)name; 
                row[3] = (Object)idComplementaryActivity;
                row[4] = (Object)activityName;
                // Se agrega el row al modelo de la tabla
                model.addRow(row);
                elementos.add(new ComplementaryActivityCompanyModel(idComplementaryActivityCompany,idCompany,name,idComplementaryActivity,activityName,0));
            }
            
            rs.close();
            callableStatement.close();
            conn.close();
            //jTable1.setModel(model.get);
        } catch (SQLException e) {
            e.printStackTrace();
        } 

        //Se asigna el modelo a la tabla para que dibuje la informacion
        jTable1.setModel(model);
        // Agregar el renderizador de botones a la columna de botones
        jTable1.getColumnModel().getColumn(5).setCellRenderer(new BotonRenderer());
        jTable1.getColumnModel().getColumn(6).setCellRenderer(new BotonRenderer());

        JTextField actualizaTxt= new JTextField("Actualiza");
        // Agregar el editor de botones a la columna de botones
        jTable1.getColumnModel().getColumn(4).setCellEditor(new BotonEditor(actualizaTxt));
        // Agregar un MouseListener para manejar los clics en las filas
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = jTable1.rowAtPoint(e.getPoint());
                int columnaSeleccionada = jTable1.columnAtPoint(e.getPoint());

                if (filaSeleccionada != -1 && (columnaSeleccionada == 5 ||columnaSeleccionada == 6)) {
                    System.out.println("num row: "+filaSeleccionada);
                    System.out.println("num col: "+columnaSeleccionada);
                    // Obtener los datos de la fila seleccionada
                    ComplementaryActivityCompanyModel datosFila = elementos.get(filaSeleccionada); //model.getFila(filaSeleccionada);

                    // Realizar la acción con los datos de la fila
                    realizarAccionConDatosFila(datosFila,columnaSeleccionada);
                }
            }
        });
        //se cierra la conexion a la base
        /*resultSet.close();
        preparedStatement.close();
        connection.close();*/

    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error");
    }

    }
    
    /**
     * Se realizará la acción de actualizar o eliminar
     * @param datosFila
     * @param accion 
     */
    private void realizarAccionConDatosFila(ComplementaryActivityCompanyModel datosFila,int accion) {
        // Implementa la lógica de la acción aquí
        System.out.println("Acción realizada con los datos de la fila: " + datosFila);
        // Puedes usar los datos de la fila como parámetros para tu acción
        
        
        //modifica
        if(accion == 5){
            EmpleadoElement element = new EmpleadoElement("Modificar");
            //se pasa la información del empleado a actualizar
            element.setEmpleadoUpdate(datosFila);
            element.setVisible(true);
            this.setVisible(false);
        }else{
            //elimina
            // Mostrar un cuadro de diálogo de confirmación de eliminación (Sí/No)
                int respuesta = JOptionPane.showConfirmDialog(this, "You want to delete this item?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // Verificar la respuesta del usuario
                if (respuesta == JOptionPane.YES_OPTION) {
                    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe"; 
                    String username = "system";
                    String password = "123456789";

                    try {
                        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

                        String deleteQuery = "UPDATE ComplementaryActivityCompany SET status=0 WHERE idComplementaryActivityCompany = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
                        preparedStatement.setInt(1, datosFila.getIdComplementaryActivityCompany());                     
                        preparedStatement.executeUpdate();

                        preparedStatement.close();
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    llenarTabla();
                } else {
                    // El usuario seleccionó "No" o cerró el cuadro de diálogo
                    System.out.println("El usuario seleccionó No o cerró el cuadro de diálogo.");
                }
        }
        
        
    }
    
    public void centrarVentanaEnPantalla() {
        // Obtener el tamaño de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcular la posición para centrar la ventana
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;

        // Establecer la posición de la ventana
        setLocation(x, y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
