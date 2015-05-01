/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CharacterSet.java
 *
 * Created on 21 Jul, 2014, 10:01:18 PM
 */
package crypto;
import AES.LSLAESCrypto;
import AES.LSLAESCrypto.LSLAESCryptoMode;
import AES.LSLAESCrypto.LSLAESCryptoPad;
import aes.*;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.NoSuchPaddingException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.imageio.ImageIO;
/**
 *
 * @author pioneer
 */
public class CharacterSet extends javax.swing.JFrame {

    int height,width;
    int subrows=0;
     int trie[][];
     String key="";
      BufferedImage img;
    /** Creates new form CharacterSet */
    public CharacterSet() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        txtmonth = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        labelkey = new javax.swing.JLabel();
        txtplain = new javax.swing.JTextField();
        labelenc = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Create Unique Character Set");

        jLabel2.setText("DAY");

        jLabel3.setText("MONTH");

        txtdate.setText("thirteen");

        txtmonth.setText("tuesday");

        jButton1.setText("Create Trie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Select Image");

        jButton2.setText("Browse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Generate Key");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Encrypt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Enter Plain Text For Encryption");

        labelkey.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelenc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Encrypted Text");

        jButton5.setText("Embed in CoverImage");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(187, 187, 187)
                                    .addComponent(jLabel1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(44, 44, 44)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jButton3)
                                                    .addGap(77, 77, 77)
                                                    .addComponent(labelkey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(24, 24, 24)
                                                            .addComponent(jLabel7)))
                                                    .addGap(37, 37, 37)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelenc, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtplain, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(100, 100, 100)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(27, 27, 27)
                                                    .addComponent(jLabel2))
                                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(70, 70, 70)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(txtmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(44, 44, 44)))
                            .addComponent(jButton4))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jButton5)
                .addContainerGap(680, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelkey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtplain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelenc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    
    //Create a matrix of 13 *26 by taking  random chars from both the textfields
    
    
    String date=txtdate.getText();
    String month=txtmonth.getText();
    
    String total=date+month;
    
    //remove duplicates
     String rowdata="";
    char[]arr=total.toCharArray();
    
    for(int i=0;i<arr.length;i++)
    {
        
        if(i==0)
        {
         rowdata+=arr[0];   
        }
        else
        {
            boolean flag=false;
            
            for(int j=0;j<rowdata.length();j++)
            {
                if(arr[i]==rowdata.charAt(j))
                {
                    flag=true;
                }
            }
            
            if(flag==false)
            {
               rowdata+=arr[i];
            }
        }
        
        
    }
    
   
      System.out.println(rowdata);
      
      //create matrix of rowdata*26
      
       subrows=rowdata.length();
      
      char[]alpha={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      int cols=26;
     trie=new int[subrows][cols];
      
         for(int i=0;i<subrows;i++)
      {
          outer:     for(int j=0;j<cols;j++)
          {
              
              for(int k=0;k<26;k++)
              {
              if(alpha[k]==rowdata.charAt(i))
              {
                  trie[i][k]=1;
                 
                  break outer;
              }
              
          }
       }
          
          
      }
         
           System.out.println();
           for(int i=0;i<subrows;i++)
            {
             for(int j=0;j<cols;j++)
            {
               System.out.print(trie[i][j]);
                
            }
           System.out.println();
          }
      
         
      
    
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
                JFileChooser jf=new JFileChooser();
                jf.showOpenDialog(this);
                String fname=jf.getSelectedFile().getPath();
                txtfname.setText(fname);
               // Segment the image in 26*26
                
                ImageIcon ico=new ImageIcon(fname);
                jLabel5.setIcon(ico);
               img=ImageIO.read(new File(fname));
                
                
        } catch (IOException ex) {
            Logger.getLogger(CharacterSet.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
                
                height=img.getHeight();
                width=img.getWidth();
                
                
                
                 int[] pixel = new int[width * height];

                  PixelGrabber pg = new PixelGrabber(img, 0, 0, width, height, pixel, 0, width);
                  try {
                    pg.grabPixels();
                  } catch (InterruptedException e) {
                    throw new IllegalStateException("Error: Interrupted Waiting for Pixels");
                  }

                
                
                int cols=width/26;  //size of column block
                int rows=height;    
                
                int divrows=rows/subrows; //size of row block              
                
                
                // get the first element of trie.
                
                int maprow=0;
                int mapcol=0;
                int p=0,q=0;
                for(int i=0;i<subrows;i++)
                {
                    
                    for(int j=0;j<26;j++)
                    {
                        
                        if(trie[i][j]==1)
                        {
                            
                                //Store the location of colno
                            
                            maprow=i;
                            mapcol=j;
                            break;
                        }
                    }
                        
                        // first row 20th column
                        
                        float temp[][]=new float[divrows][cols];
                        
                        int imgrowno=0;
                        
                        if(maprow==0)
                        {                            
                        imgrowno=maprow;    
                        }
                        else
                            imgrowno=maprow*divrows;
                        
                        for(int m=imgrowno;m<imgrowno+divrows;m++)
                        {
                            
                            for(int n=(mapcol*cols);n<(mapcol*cols)+cols;n++)
                            {
                                
                               

                                int clr=  img.getRGB(n,m);  //colno,rowno
                                int  r = (clr & 0x00ff0000) >> 16; //notation for red
                                int  g = (clr & 0x0000ff00) >> 8; //notation for green
                                int  b = clr & 0x000000ff;	 //notation for blue     
                              //  System.out.println("row   "+m+"col   "+n);
                               // 
                                
                                temp[p][q]= Math.round(0.2989 * r + 0.5870 * g + 0.1140 * b) ;//intensity of image coods[m][n];
                                
                            }
                            
                        }
                        
                        //Find the mean
                        
                        float mean=0;
                        
                        for(int a1=0;a1<divrows;a1++ )
                        {
                            for(int a2=0;a2<cols;a2++)
                            {
                                
                                mean=mean+temp[a1][a2];
                            }
                            
                            
                        }
                        
                        
                        
                     //   System.out.println(mean);
                        
                        mean=mean/(1.0F*(divrows*cols));
                        
                        
                        //Convert each mean value to binary bits of 8
                        
                        
                        String binaryclr1= "";
                                           int x =(int) mean;
                                           for (int i1 = 0; i1 < 8; i1++) {
                                           int digit = 0;
                                            
                                            digit = x % 2;
                                            x = x / 2;
                                            binaryclr1 = digit + binaryclr1;
                        
                                           }
                        
                        
                        key=key+binaryclr1;
                        
                    
                    
                }
                
                
                System.out.println(key);
                int remain=0;
                
                if(key.length()<=192)
                {
                 //remain=192-key.length();   
                   
                    remain=192/key.length();
                }
                
                for(int j=0;j<remain;j++)
                {
                    key=key+key;
                }
                   
                     
                key=key.substring(0,192);
                
                System.out.println("The key length is "+key.length());
                
                String hexString="";
                int offset=0;
                
                String totalkey="";
                for(int j=0;j<32;j++)
                {
                    
                    String temp=key.substring(offset,offset+6);
                
                    
                int i= Integer.parseInt(temp,2);
                              
              if(i==0)
                  i=1;
              
                
   hexString = Integer.toHexString(i);
  
  totalkey=totalkey+hexString;
 
  offset=offset+6;
                }	
              
                 totalkey=totalkey.substring(0,32);
              
                    labelkey.setText(totalkey);
                    
    				
                                
                                
    				

        } catch (Exception ex) {
            Logger.getLogger(CharacterSet.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
          final String myKey =  labelkey.getText();//"1234567890ABCDEF0123456789ABCDEF";  //32
    				final String myIV = "89ABCDEF0123456789ABCDEF01234567";

    		 
    				final LSLAESCrypto aes = new LSLAESCrypto(LSLAESCryptoMode.CFB,LSLAESCryptoPad.NONE,128,myKey,myIV);
                                String g=aes.encrypt(txtplain.getText());
    				 
                                System.out.println(g);
                                labelenc.setText(g);
                     
      
        } catch (Exception ex) {
            Logger.getLogger(CharacterSet.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
    ImageStego is=new ImageStego(labelkey.getText(),labelenc.getText());
    is.setVisible(true);
    is.setSize(800,800);
    
}//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(CharacterSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacterSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacterSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacterSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CharacterSet().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelenc;
    private javax.swing.JLabel labelkey;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtmonth;
    private javax.swing.JTextField txtplain;
    // End of variables declaration//GEN-END:variables
}
