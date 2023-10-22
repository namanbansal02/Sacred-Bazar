package Client_side;

import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author descifrado
 */
public class cust_profile extends javax.swing.JFrame 
{
    private DefaultComboBoxModel model;
    private final Socket client;
    private final String user_name;
    private DataInputStream dis;
    private DataOutputStream dos;
    private int updateBTMode=0;
    
    public cust_profile(Socket client, String user_name) throws IOException
    {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int sht=(int)tk.getScreenSize().getHeight();
        int swd=(int)tk.getScreenSize().getWidth();
        int ht=500;
        int wd=900;
        int x=swd-wd;
        int y=sht-ht;
        this.setBounds(x/2, y/2, wd, ht+30);
        this.setResizable(false);
        this.setTitle("SACRED BAZAR: CUSTOMER DETAILS");   
        this.client=client;
        this.user_name=user_name;
        dos=new DataOutputStream(client.getOutputStream());
        dis=new DataInputStream(client.getInputStream());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LOGOLabel = new javax.swing.JLabel();
        TITLELabel = new javax.swing.JLabel();
        STLB = new javax.swing.JLabel();
        UNCB = new javax.swing.JComboBox();
        FNLB = new javax.swing.JLabel();
        LNLB = new javax.swing.JLabel();
        GLB = new javax.swing.JLabel();
        AGELB = new javax.swing.JLabel();
        PASSLB = new javax.swing.JLabel();
        CNLB = new javax.swing.JLabel();
        EIDLB = new javax.swing.JLabel();
        DJLB = new javax.swing.JLabel();
        OCLB = new javax.swing.JLabel();
        ODLB = new javax.swing.JLabel();
        OVLB = new javax.swing.JLabel();
        FNTF = new javax.swing.JTextField();
        LNTF = new javax.swing.JTextField();
        GTF = new javax.swing.JTextField();
        ATF = new javax.swing.JTextField();
        CNTF = new javax.swing.JTextField();
        EIDTF = new javax.swing.JTextField();
        DJTF = new javax.swing.JTextField();
        OCTF = new javax.swing.JTextField();
        ODTF = new javax.swing.JTextField();
        OVTF = new javax.swing.JTextField();
        UDBT = new javax.swing.JButton();
        PASSTF = new javax.swing.JPasswordField();
        BKBT = new javax.swing.JButton();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        LOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO_smaller.jpg"))); // NOI18N
        jPanel1.add(LOGOLabel);
        LOGOLabel.setBounds(70, 10, 60, 60);

        TITLELabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        TITLELabel.setText("YOUR PROFILE");
        jPanel1.add(TITLELabel);
        TITLELabel.setBounds(170, 20, 270, 40);

        STLB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        STLB.setText("SIGNED IN AS:");
        jPanel1.add(STLB);
        STLB.setBounds(480, 30, 110, 20);

        UNCB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UNCB.setModel(new DefaultComboBoxModel());
        UNCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNCBActionPerformed(evt);
            }
        });
        jPanel1.add(UNCB);
        UNCB.setBounds(660, 20, 180, 40);

        FNLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FNLB.setText("FIRST NAME");
        jPanel1.add(FNLB);
        FNLB.setBounds(70, 100, 90, 15);

        LNLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LNLB.setText("LAST NAME");
        jPanel1.add(LNLB);
        LNLB.setBounds(70, 160, 80, 15);

        GLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GLB.setText("GENDER");
        jPanel1.add(GLB);
        GLB.setBounds(70, 220, 70, 15);

        AGELB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AGELB.setText("AGE");
        jPanel1.add(AGELB);
        AGELB.setBounds(70, 280, 50, 15);

        PASSLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PASSLB.setText("PASSWORD");
        jPanel1.add(PASSLB);
        PASSLB.setBounds(70, 460, 80, 15);

        CNLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CNLB.setText("CONTACT NUMBER");
        jPanel1.add(CNLB);
        CNLB.setBounds(70, 340, 120, 15);

        EIDLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EIDLB.setText("EMAIL ADDRESS");
        jPanel1.add(EIDLB);
        EIDLB.setBounds(70, 400, 110, 15);

        DJLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DJLB.setText("DATE JOINED");
        jPanel1.add(DJLB);
        DJLB.setBounds(490, 100, 90, 15);

        OCLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OCLB.setText("OFFER CODE");
        jPanel1.add(OCLB);
        OCLB.setBounds(490, 160, 90, 15);

        ODLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ODLB.setText("OFFER DESCRIPTION");
        jPanel1.add(ODLB);
        ODLB.setBounds(490, 220, 130, 15);

        OVLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OVLB.setText("OFFER VALIDITY");
        jPanel1.add(OVLB);
        OVLB.setBounds(490, 280, 110, 15);

        FNTF.setEditable(false);
        jPanel1.add(FNTF);
        FNTF.setBounds(210, 90, 180, 30);

        LNTF.setEditable(false);
        jPanel1.add(LNTF);
        LNTF.setBounds(210, 150, 180, 30);

        GTF.setEditable(false);
        jPanel1.add(GTF);
        GTF.setBounds(210, 210, 180, 30);

        ATF.setEditable(false);
        jPanel1.add(ATF);
        ATF.setBounds(210, 270, 180, 30);

        CNTF.setEditable(false);
        jPanel1.add(CNTF);
        CNTF.setBounds(210, 330, 180, 30);

        EIDTF.setEditable(false);
        jPanel1.add(EIDTF);
        EIDTF.setBounds(210, 390, 180, 30);

        DJTF.setEditable(false);
        jPanel1.add(DJTF);
        DJTF.setBounds(660, 90, 180, 30);

        OCTF.setEditable(false);
        jPanel1.add(OCTF);
        OCTF.setBounds(660, 150, 180, 30);

        ODTF.setEditable(false);
        jPanel1.add(ODTF);
        ODTF.setBounds(660, 210, 180, 30);

        OVTF.setEditable(false);
        jPanel1.add(OVTF);
        OVTF.setBounds(660, 270, 180, 30);

        UDBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UDBT.setText("CLICK TO UPDATE DETAILS");
        UDBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UDBTActionPerformed(evt);
            }
        });
        jPanel1.add(UDBT);
        UDBT.setBounds(580, 370, 200, 40);

        PASSTF.setEditable(false);
        jPanel1.add(PASSTF);
        PASSTF.setBounds(210, 450, 180, 30);

        BKBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BKBT.setText("BACK");
        BKBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKBTActionPerformed(evt);
            }
        });
        jPanel1.add(BKBT);
        BKBT.setBounds(580, 440, 200, 40);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAckground.jpg"))); // NOI18N
        jPanel1.add(BGLabel);
        BGLabel.setBounds(0, 0, 900, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UNCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNCBActionPerformed
        // TODO add your handling code here:
        String select=(String)model.getSelectedItem();
        if(select.equals("My Cart"))
        {
            new my_cart(client,user_name).show();
            this.dispose();
        }
        if(select.equals("My Orders"))
        {
            new my_orders(client, user_name).show();
            this.dispose();
        }
        if(select.equals("Log out"))
        {
            int i=JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Log out?",null,JOptionPane.YES_NO_OPTION);
            if(i==0)
            {    
                try 
                {
                    dos.writeUTF("Log_out");
                    String conf=dis.readUTF();
                    if(conf.equals("done"))
                    {
                        JOptionPane.showMessageDialog(this,"Successfully Logged out");
                        client.close();
                        new MainPage().show();
                        this.dispose();
                    }
                }
                catch (IOException ex) 
                {
                    System.out.println(ex.getMessage());
                    Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_UNCBActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        model=(DefaultComboBoxModel)UNCB.getModel();
        model.addElement(user_name);
        model.addElement("My Cart");
        model.addElement("My Orders");
        model.addElement("Log out");
        try 
        {
            // Requesting Server For Customer Details
            dos.writeUTF("CDet"+user_name);
            String cust_det=dis.readUTF();
            String data[]=cust_det.split("`");
            FNTF.setText(data[0]);
            LNTF.setText(data[1]);
            GTF.setText(data[2]);
            ATF.setText(data[3]);
            CNTF.setText(data[4]);
            EIDTF.setText(data[5]);
            PASSTF.setText(data[6]);
            DJTF.setText(data[7]);
            OCTF.setText(data[8]);
            ODTF.setText(data[9]);
            OVTF.setText(data[10]);
            
        }
        catch (IOException ex) 
        {
            Logger.getLogger(cust_profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void UDBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UDBTActionPerformed
        // TODO add your handling code here:
        String pass=PASSTF.getText();
        if(updateBTMode==0)
        {
            String ver=JOptionPane.showInputDialog(this,"Enter Your Password..");
            if(ver.equals(PASSTF.getText()))
            {
                FNTF.setEditable(true);
                LNTF.setEditable(true);
                CNTF.setEditable(true);
                ATF.setEditable(true);
                GTF.setEditable(true);
                EIDTF.setEditable(true);
                PASSTF.setEditable(true);            
                updateBTMode=1;
                UDBT.setText("Update Details");                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Try Again");
            }
        }
        else if(updateBTMode==1)
        {
            try 
            {
                String newDetails="";
                String nfn=FNTF.getText();
                String nln=LNTF.getText();
                String ng=GTF.getText();
                String na=ATF.getText();
                String ncn=CNTF.getText();
                String neid=EIDTF.getText();
                String npass=PASSTF.getText();
                newDetails=nfn+'`'+nln+'`'+ng+'`'+na+'`'+ncn+'`'+neid+'`'+npass;
                if(npass.equals(pass)==false)
                {
                    String ver=JOptionPane.showInputDialog(this,"Re Enter Your New Password");
                    if(ver.equals(npass))
                    {
                        dos.writeUTF("UpdateCust");
                        dos.writeUTF(newDetails);
                        String conf=dis.readUTF();
                        if(conf.equals("yes"))
                            JOptionPane.showMessageDialog(this, "Record Successfully Updated");
                        else
                            JOptionPane.showMessageDialog(this, "Error Occured");
                    }                   
                }
                else
                {
                    dos.writeUTF("UpdateCust");
                    dos.writeUTF(newDetails);
                    String conf=dis.readUTF();
                    if(conf.equals("yes"))
                        JOptionPane.showMessageDialog(this, "Record Successfully Updated");
                    else
                        JOptionPane.showMessageDialog(this, "Error Occured");
                }
            }
            catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(this, ex.getMessage());
                Logger.getLogger(cust_profile.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_UDBTActionPerformed

    private void BKBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKBTActionPerformed
        try 
        {
            // TODO add your handling code here:
            new first_page(client, user_name).show();
        }
        catch (IOException ex) 
        {
            Logger.getLogger(cust_profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_BKBTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGELB;
    private javax.swing.JTextField ATF;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton BKBT;
    private javax.swing.JLabel CNLB;
    private javax.swing.JTextField CNTF;
    private javax.swing.JLabel DJLB;
    private javax.swing.JTextField DJTF;
    private javax.swing.JLabel EIDLB;
    private javax.swing.JTextField EIDTF;
    private javax.swing.JLabel FNLB;
    private javax.swing.JTextField FNTF;
    private javax.swing.JLabel GLB;
    private javax.swing.JTextField GTF;
    private javax.swing.JLabel LNLB;
    private javax.swing.JTextField LNTF;
    private javax.swing.JLabel LOGOLabel;
    private javax.swing.JLabel OCLB;
    private javax.swing.JTextField OCTF;
    private javax.swing.JLabel ODLB;
    private javax.swing.JTextField ODTF;
    private javax.swing.JLabel OVLB;
    private javax.swing.JTextField OVTF;
    private javax.swing.JLabel PASSLB;
    private javax.swing.JPasswordField PASSTF;
    private javax.swing.JLabel STLB;
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JButton UDBT;
    private javax.swing.JComboBox UNCB;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}