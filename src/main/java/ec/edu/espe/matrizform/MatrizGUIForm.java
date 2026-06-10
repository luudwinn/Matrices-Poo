package ec.edu.espe.matrizform;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MatrizGUIForm extends javax.swing.JFrame {

    public MatrizGUIForm() {
        initComponents();
        generarTablas(4);
    }

    private void generarTablas(int n) {
        tblA.setModel(crearModelo(n, false));
        tblB.setModel(crearModelo(n, false));
        tblResultado.setModel(crearModelo(n, true));

        tblA.setRowHeight(35);
        tblB.setRowHeight(35);
        tblResultado.setRowHeight(35);

        tblResultado.setEnabled(false);

        lblEstado.setText("Matrices de " + n + " x " + n + " generadas correctamente.");
    }

    private DefaultTableModel crearModelo(int n, boolean resultado) {
        String[] columnas = new String[n];

        for (int i = 0; i < n; i++) {
            if (resultado) {
                columnas[i] = "C" + (i + 1) + " ▼";
            } else {
                columnas[i] = "C" + (i + 1);
            }
        }

        DefaultTableModel modelo = new DefaultTableModel(columnas, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                modelo.setValueAt(0, i, j);
            }
        }

        return modelo;
    }

    private Matriz leerMatriz(JTable tabla) {
        int filas = tabla.getRowCount();
        int columnas = tabla.getColumnCount();

        Matriz matriz = new Matriz(filas, columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Object valor = tabla.getValueAt(i, j);
                int numero = Integer.parseInt(valor.toString());
                matriz.setValor(i, j, numero);
            }
        }

        return matriz;
    }

    private void mostrarResultado(Matriz resultado) {
        int filas = resultado.getFilas();
        int columnas = resultado.getColumnas();

        DefaultTableModel modelo = crearModelo(columnas, true);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                modelo.setValueAt(resultado.getValor(i, j), i, j);
            }
        }

        tblResultado.setModel(modelo);
        tblResultado.setRowHeight(35);
        tblResultado.setEnabled(false);
    }

    private void llenarAleatorio(JTable tabla) {
        Random random = new Random();

        for (int i = 0; i < tabla.getRowCount(); i++) {
            for (int j = 0; j < tabla.getColumnCount(); j++) {
                tabla.setValueAt(random.nextInt(10), i, j);
            }
        }
    }

    private void limpiarTabla(JTable tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            for (int j = 0; j < tabla.getColumnCount(); j++) {
                tabla.setValueAt(0, i, j);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDimension = new javax.swing.JLabel();
        txtDimension = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        btnAleatorio = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblA = new javax.swing.JLabel();
        lblMultiplicar = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblIgual = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        scrollA = new javax.swing.JScrollPane();
        tblA = new javax.swing.JTable();
        scrollB = new javax.swing.JScrollPane();
        tblB = new javax.swing.JTable();
        scrollResultado = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        lblEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multiplicacion de Matrices - JFrame Form");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MULTIPLICACION DE MATRICES POO JAVA");

        lblDimension.setText("Dimension:");

        txtDimension.setText("4");

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(this::btnGenerarActionPerformed);

        btnAleatorio.setText("Aleatorio");
        btnAleatorio.addActionListener(this::btnAleatorioActionPerformed);

        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.addActionListener(this::btnMultiplicarActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        lblA.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA.setText("A");

        lblMultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblMultiplicar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMultiplicar.setText("x");

        lblB.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB.setText("B");

        lblIgual.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblIgual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIgual.setText("=");

        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("RESULTADO");

        tblA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            },
            new String [] {
                "C1", "C2", "C3", "C4"
            }
        ));
        scrollA.setViewportView(tblA);

        tblB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            },
            new String [] {
                "C1", "C2", "C3", "C4"
            }
        ));
        scrollB.setViewportView(tblB);

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            },
            new String [] {
                "C1 ▼", "C2 ▼", "C3 ▼", "C4 ▼"
            }
        ));
        scrollResultado.setViewportView(tblResultado);

        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado.setText("Ingrese valores y presione Multiplicar.");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblDimension)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDimension, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAleatorio)
                        .addGap(18, 18, 18)
                        .addComponent(btnMultiplicar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addGap(25, 25, 25)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDimension)
                    .addComponent(txtDimension, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar)
                    .addComponent(btnAleatorio)
                    .addComponent(btnMultiplicar)
                    .addComponent(btnLimpiar))
                .addGap(30, 30, 30)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblA)
                    .addComponent(lblB)
                    .addComponent(lblResultado))
                .addGap(10, 10, 10)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblMultiplicar))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblIgual)))
                .addGap(25, 25, 25)
                .addComponent(lblEstado)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try {
            int n = Integer.parseInt(txtDimension.getText());

            if (n <= 0) {
                JOptionPane.showMessageDialog(this, "La dimension debe ser mayor que cero.");
                return;
            }

            generarTablas(n);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese una dimension numerica valida.");
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatorioActionPerformed
        llenarAleatorio(tblA);
        llenarAleatorio(tblB);
        lblEstado.setText("Matrices A y B llenadas automaticamente.");
    }//GEN-LAST:event_btnAleatorioActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        try {
            Matriz matrizA = leerMatriz(tblA);
            Matriz matrizB = leerMatriz(tblB);

            OperacionMatriz operacion = new MultiplicacionMatriz();
            Matriz resultado = operacion.calcular(matrizA, matrizB);

            mostrarResultado(resultado);

            lblEstado.setText("Multiplicacion realizada correctamente.");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Todos los datos deben ser numeros enteros.");
        } catch (DimensionInvalidaException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTabla(tblA);
        limpiarTabla(tblB);
        limpiarTabla(tblResultado);
        lblEstado.setText("Tablas limpiadas.");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MatrizGUIForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAleatorio;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblDimension;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblIgual;
    private javax.swing.JLabel lblMultiplicar;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scrollA;
    private javax.swing.JScrollPane scrollB;
    private javax.swing.JScrollPane scrollResultado;
    private javax.swing.JTable tblA;
    private javax.swing.JTable tblB;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTextField txtDimension;
    // End of variables declaration//GEN-END:variables
}
