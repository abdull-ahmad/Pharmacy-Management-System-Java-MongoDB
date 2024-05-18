
import javax.swing.*;

import com.mongodb.client.*;
import org.bson.Document;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Add_User extends javax.swing.JFrame {
    private String emailpattren = "^[A-Za-z0-9+_.-]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    private String mobileNumberPattern = "^[0-9]*$";
    private String namepattren = "^[a-zA-Z\\s]+";
    private String passpattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private String usernamepattern = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
    private int checkUsername = 0;



    /**
     * Creates new form Add_User
     */
    public Add_User() {
        initComponents();
        iconLabel.setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        role_ComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        name_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateofbirth_field = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        number_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        username_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pass_tf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        iconLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setText("Add User");

        jLabel2.setText("Role");

        role_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pharmacy Manager", "Sales Person"}));
        role_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                role_ComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("Date of Birth");

        jLabel5.setText("Mobile Number");

        jLabel6.setText("Email");

        jLabel7.setText("Username");

        username_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                username_tfKeyReleased(evt);
            }
        });

        jLabel8.setText("Password");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel9.setText("Password must contain at least one digit [0-9].");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel10.setText("Password must contain at least one lowercase Latin character [a-z].");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel11.setText("Password must contain at least one uppercase Latin character [A-Z].");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel12.setText("Password must contain at least one special character like ! @ # & ( ).");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel13.setText("Password must contain a length of at least 8 characters and a maximum of 20 characters.");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel14.setText("The number of characters must be between 5 to 20.");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel16.setText("The dot (.), underscore (_), or hyphen (-) does not appear consecutively");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel17.setText("The dot (.), underscore (_), or hyphen (-) must not be the first or last character.");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel18.setText("Username consists of alphanumeric characters or alphabets");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel19.setText("No dashes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addGap(28, 28, 28)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(name_tf)
                                                                .addComponent(role_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(dateofbirth_field, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                                                .addComponent(number_tf)
                                                                .addComponent(email_tf))
                                                        .addComponent(jLabel19))
                                                .addGap(135, 135, 135)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel12)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(jLabel9)
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                        .addComponent(jLabel8)
                                                                                                                        .addComponent(jLabel7))
                                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(30, 30, 30)
                                                                                                                                .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                .addComponent(pass_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(2, 2, 2))))
                                                                                                        .addComponent(jLabel10)
                                                                                                        .addComponent(jLabel14)
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel16)
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(31, 31, 31))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel17)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                                                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel11)
                                                                        .addComponent(jLabel18))
                                                                .addGap(0, 30, Short.MAX_VALUE)))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(299, 299, 299)
                                                .addComponent(jLabel1)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(role_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7)
                                        .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(iconLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(dateofbirth_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pass_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(number_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(61, 61, 61)
                                .addComponent(jButton1)
                                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String userRole =  (String) role_ComboBox.getSelectedItem();
        String name = name_tf.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dateofbirth_field.getDate();
        String dob = "";
        if (date != null){
            dob = dFormat.format(dateofbirth_field.getDate());
        }
        String mobilenumber = number_tf.getText();
        String email = email_tf.getText();
        String username  = username_tf.getText();
        String password = pass_tf.getText();

        if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name Field is Required");
        }else if (!name.matches(namepattren)){
            JOptionPane.showMessageDialog(null,"Enter a Valid name");
        } else if (mobilenumber.equals("")) {
            JOptionPane.showMessageDialog(null,"Mobile Number Field is Required");
        } else if (!mobilenumber.matches(mobileNumberPattern) || mobilenumber.length() !=11) {
            JOptionPane.showMessageDialog(null,"Mobile Number Field is Invalid");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null,"Email Field is Required");
        } else if (!email.matches(emailpattren)) {
            JOptionPane.showMessageDialog(null,"Email Field is Invalid");
        } else if (username.equals("")) {
            JOptionPane.showMessageDialog(null,"Username Field is Required");
        }else if (!username.matches(usernamepattern) ) {
            JOptionPane.showMessageDialog(null,"Username Field is Invalid");
        } else if (checkUsername == 1) {
            JOptionPane.showMessageDialog(null,"Username Already Exist");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null,"Password Field is Required");
        } else if (!password.matches(passpattern)){
            JOptionPane.showMessageDialog(null,"Password Field is Invalid");
        }
        else {
            MongoClient mongoClient = null;
            try {
                mongoClient = MongoClients.create("mongodb://localhost:27017");

// Accessing the database
                MongoDatabase database = mongoClient.getDatabase("Pharmacy");

// Accessing the collection
                MongoCollection<Document> collection = database.getCollection("sys_user");

// Creating a new document to insert
                Document document = new Document()
                        .append("userrole", userRole)
                        .append("name", name)
                        .append("DOB", dob)
                        .append("mobilenumber", mobilenumber)
                        .append("email", email)
                        .append("username", username)
                        .append("password", password);

// Inserting the document into the collection
                collection.insertOne(document);

// Displaying a success message
                JOptionPane.showMessageDialog(null, "User Added Successfully");

// Closing the MongoDB client connection


// Replace the code to hide the current window and open a new window here
                setVisible(false);
                new Add_User().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            mongoClient.close();
        }

    }

    private void role_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void username_tfKeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        String username = username_tf.getText();
        if(!username.equals("")){
            iconLabel.setVisible(true);
            iconLabel.setIcon(new ImageIcon("C:\\Users\\Abdullah Ahmad\\Desktop\\Pharmacy-Management-System-master\\Pharmacy_Management_System\\IMG\\yes.png"));
            iconLabel.setText("");
            checkUsername = 0 ;

            try{
                MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

// Accessing the database
                MongoDatabase database = mongoClient.getDatabase("Pharmacy");

// Accessing the collection
                MongoCollection<Document> collection = database.getCollection("sys_user");

// Creating a query filter
                Document query = new Document("username", username);

// Executing the query
                MongoCursor<Document> cursor = collection.find(query).iterator();

// Checking if the username exists
                boolean usernameExists = cursor.hasNext();

// Updating the icon and label based on the result
                if (usernameExists) {
                    checkUsername = 1;
                    iconLabel.setIcon(new ImageIcon("C:\\Users\\Abdullah Ahmad\\Desktop\\Pharmacy-Management-System-master\\Pharmacy_Management_System\\IMG\\no.png"));
                    iconLabel.setText("");
                }

// Closing the cursor
                cursor.close();

// Closing the MongoDB client connection
                mongoClient.close();

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }else {
            iconLabel.setVisible(false);
        }
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        new AdminDashboard().setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(Add_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private com.toedter.calendar.JDateChooser dateofbirth_field;
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField name_tf;
    private javax.swing.JTextField number_tf;
    private javax.swing.JTextField pass_tf;
    private javax.swing.JComboBox<String> role_ComboBox;
    private javax.swing.JTextField username_tf;
    // End of variables declaration
}
