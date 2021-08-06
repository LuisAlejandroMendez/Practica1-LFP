package gui;

import java.util.ArrayList;

public class JFrameGeneral extends javax.swing.JFrame {
    //Arreglo de palabras que seran clasificadas por tokens
    ArrayList<String> arregloPalabras = new ArrayList<>();

    public JFrameGeneral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jButtonVerificarTxt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTextAreaEntradaTxt = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextAreaSalidaTxt = new javax.swing.JTextArea();
        jLabelSalidaTxt = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelEntradaTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(255, 204, 102));

        jButtonVerificarTxt.setBackground(new java.awt.Color(0, 204, 153));
        jButtonVerificarTxt.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jButtonVerificarTxt.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerificarTxt.setText("Verificar texto");
        jButtonVerificarTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonVerificarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarTxtActionPerformed(evt);
            }
        });

        JTextAreaEntradaTxt.setColumns(20);
        JTextAreaEntradaTxt.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        JTextAreaEntradaTxt.setRows(5);
        jScrollPane3.setViewportView(JTextAreaEntradaTxt);

        JTextAreaSalidaTxt.setColumns(20);
        JTextAreaSalidaTxt.setRows(5);
        JTextAreaSalidaTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        JTextAreaSalidaTxt.setEnabled(false);
        jScrollPane1.setViewportView(JTextAreaSalidaTxt);

        jLabelSalidaTxt.setBackground(new java.awt.Color(0, 204, 102));
        jLabelSalidaTxt.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabelSalidaTxt.setForeground(new java.awt.Color(0, 153, 102));
        jLabelSalidaTxt.setText("SALIDA DE TEXTO =");

        jLabelTitulo.setFont(new java.awt.Font("Ebrima", 3, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 102, 0));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("VERIFICADOR DE CADENAS DE TEXTO");

        jLabelEntradaTxt.setBackground(new java.awt.Color(0, 204, 102));
        jLabelEntradaTxt.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabelEntradaTxt.setForeground(new java.awt.Color(0, 153, 102));
        jLabelEntradaTxt.setText("ENTRADA DE TEXTO =");

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabelEntradaTxt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabelSalidaTxt)
                        .addGap(227, 227, 227))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(jButtonVerificarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEntradaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSalidaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButtonVerificarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerificarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarTxtActionPerformed
        JTextAreaSalidaTxt.setText("");
        arregloPalabras.removeAll(arregloPalabras);
        String texto = JTextAreaEntradaTxt.getText();
        separarCadena(texto);
    }//GEN-LAST:event_jButtonVerificarTxtActionPerformed

    //Metodo para separar frases de la cadena de texto
    public void separarCadena(String frase) {
        String palabra = "";
        for (int x = 0; x < frase.length(); x++) {
            if (frase.charAt(x) != ' ' && frase.charAt(x) != '\n') {
                palabra = palabra + frase.charAt(x);
            } 
            else {
                arregloPalabras.add(palabra);
                palabra = "";
            }
        }
        if (!palabra.equals("")) { //"!" Explicacion del video de Alvarito :3
            arregloPalabras.add(palabra);
        }
        //Se manda a comparar los chars
        for (String item : arregloPalabras) {
            if (verificarEntero(item) == false && verificarDecimal(item) == false && verificarSimbolo(item) == false && verificarID(item) == false) {
                JTextAreaSalidaTxt.append(EnumTokens.ERROR.getTipoDeToken() + item + "\n"); //Uso de Enumeracion para dictar errores
            }
        } //Me llevo la ñonga haciendo esto, gracias YouTube
    }

    //Metodos de verificacion de tipo de numero, entero o decimal
    public boolean verificarEntero(String palabra) {
        for (int x = 0; x < palabra.length(); x++) {
            if (palabra.charAt(x) >= 48 && palabra.charAt(x) <= 57) {
            } 
            else {
                return false;
            }
        }
        JTextAreaSalidaTxt.append(EnumTokens.ENTERO.getTipoDeToken() + palabra + "\n"); //Uso de Enum ENTERO
        return true;
    }
    
    //Metodos de verificacion de tipo de numero, entero o decimal
    public boolean verificarDecimal(String palabra) {
        int contadorPuntoDecimal = 0;
        //Analizar el primer char... si es numero
        if (palabra.charAt(0) < 48 || palabra.charAt(0) > 57) {
            return false;
        }
        //Analizar el ultimo char... si es numero
        if (palabra.charAt(palabra.length() - 1) < 48 || palabra.charAt(palabra.length() - 1) > 57) {
            return false;
        }
        //Contar puntos "."
        for (int x = 0; x < palabra.length(); x++) {
            if (palabra.charAt(x) == '.') {
                contadorPuntoDecimal++;
            }
        }
        //Condicion: se cumple cuando hay mas de 1 "." o ninguno 
        if (contadorPuntoDecimal > 1 || contadorPuntoDecimal == 0) {
            return false;
        } 
        else { // si no entonces solo hay un punto decimal
            for (int x = 0; x < palabra.length(); x++) {
                if ((palabra.charAt(x) >= 48 && palabra.charAt(x) <= 57) || palabra.charAt(x) == '.') {

                }
                else {
                    return false;
                }
            }
        }
        JTextAreaSalidaTxt.append(EnumTokens.DECIMAL.getTipoDeToken() + palabra + "\n"); //Uso de Enum DECIMAL
        return true;
    }

    //Metodo de verificacion de simbolo
    public boolean verificarSimbolo(String palabra) {
        if ("{".equals(palabra) || "}".equals(palabra) || "[".equals(palabra) || "]".equals(palabra) || ";".equals(palabra) || ",".equals(palabra)) {
            JTextAreaSalidaTxt.append(EnumTokens.SIMBOLO.getTipoDeToken() + palabra + "\n"); //Uso de Enuu SIMBOLO
            return true;
        }
        else {
            return false; //Jajaja use al reves el true y false (segun el orden en que lo hice en las otras verifys)
        }
    }

    //Metodo de verificacion de ID
    public boolean verificarID(String palabra) {
        if ((palabra.charAt(0) < 65 || palabra.charAt(0) > 90) && (palabra.charAt(0) < 97 || palabra.charAt(0) > 122)) {
            return false;
        }
        for (int x = 0; x < palabra.length(); x++) {
            if ((palabra.charAt(x) >= 48 && palabra.charAt(x) <= 57) || ((palabra.charAt(x) >= 65 && palabra.charAt(x) <= 90) || (palabra.charAt(x) >= 97 && palabra.charAt(x) <= 122))) {

            }
            else {
                return false;
            }
        }
        JTextAreaSalidaTxt.append(EnumTokens.ID.getTipoDeToken() + palabra + "\n"); //Uso de Enum ID
        return true;
    }
    //Ya ni use los Scroll Panel
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JTextAreaEntradaTxt;
    private javax.swing.JTextArea JTextAreaSalidaTxt;
    private javax.swing.JButton jButtonVerificarTxt;
    private javax.swing.JLabel jLabelEntradaTxt;
    private javax.swing.JLabel jLabelSalidaTxt;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
