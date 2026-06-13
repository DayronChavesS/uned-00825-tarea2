/*
UNIVERSIDAD ESTATAL A DISTANCIA
VICERRECTORIA ACADÉMICA
ESCUELA DE CIENCIAS EXACTAS Y NATURALES
CARRERA DE INGENIERÍA INFORMÁTICA

TAREA 2
PILAS ESTATICAS EN JAVA

GRUPO 03
PROFESORA MIRIAM MORA MORALES

DAYRON ANTONY CHAVES SANDOVAL
305240018

CENTRO UNIVERSITARIO DE TURRIALBA

FECHA DE ENTREGA
11 DE ABRIL DEL 2021

PRIMER CUATRIMESTRE, 2021.
*/
package GUI;

import CLASES.*;
import LOGICA.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FormPantallaPrincipal extends javax.swing.JFrame {

    public FormPantallaPrincipal() 
    {
        initComponents();
        GrupoDePestañas.setEnabledAt(0, true);
        GrupoDePestañas.setEnabledAt(1, false);
        GrupoDePestañas.setEnabledAt(2, false);
        GrupoDePestañas.setEnabledAt(3, false);
        GrupoDePestañas.setEnabledAt(4, false);
        GrupoDePestañas.setEnabledAt(5, false);
        GrupoDePestañas.setEnabledAt(6, false);
        GrupoDePestañas.setEnabledAt(7, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoDePestañas = new javax.swing.JTabbedPane();
        Tab1_CrearPila = new javax.swing.JPanel();
        TAB1_TXT_Info = new javax.swing.JLabel();
        TAB1_TXTField_TamañoVector = new javax.swing.JTextField();
        TAB1_BTN_Aceptar = new javax.swing.JButton();
        Tab2_Apilar = new javax.swing.JPanel();
        TAB2_TXT_Info = new javax.swing.JLabel();
        TAB2_TXT_IngIdentificador = new javax.swing.JLabel();
        TAB2_TXTField_Identificador = new javax.swing.JTextField();
        TAB2_TXT_IngNombre = new javax.swing.JLabel();
        TAB2_TXTField_Nombre = new javax.swing.JTextField();
        TAB2_TXT_IngDirector = new javax.swing.JLabel();
        TAB2_TXTField_Director = new javax.swing.JTextField();
        TAB2_TXT_IngDuracion = new javax.swing.JLabel();
        TAB2_TXTField_Duracion = new javax.swing.JTextField();
        TAB2_BTN_Aceptar = new javax.swing.JButton();
        Tab3_Desarpilar = new javax.swing.JPanel();
        TAB3_TXT_Info = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_REMOVERPELICULA = new javax.swing.JTable();
        TAB2_TXT_Objeto = new javax.swing.JLabel();
        TAB3_BTN_REMOVER = new javax.swing.JButton();
        Tab4_MostrarTamaño = new javax.swing.JPanel();
        TAB4_TXT_Info = new javax.swing.JLabel();
        TAB4_TXT_NumeroDePeliculas = new javax.swing.JLabel();
        Tab5_EstaVacia = new javax.swing.JPanel();
        TAB5_TXT_Info = new javax.swing.JLabel();
        TAB5_TXT_SiNo = new javax.swing.JLabel();
        Tab6_MostrarElementos = new javax.swing.JPanel();
        TAB6_TXT_Info = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLA_TODASPELICULAS = new javax.swing.JTable();
        Tab7_VaciarPilas = new javax.swing.JPanel();
        TAB7_TXT_Info = new javax.swing.JLabel();
        TAB7_TXT_Info2 = new javax.swing.JLabel();
        TAB7_BTN_ELIMINARTODO = new javax.swing.JButton();
        Tab8_MostrarValor = new javax.swing.JPanel();
        TAB8_TXT_Info = new javax.swing.JLabel();
        TAB8_TXTField_Posicion = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLA_ESPECIFICAPELICULA = new javax.swing.JTable();
        TAB8_TXT_Pelicula = new javax.swing.JLabel();
        TAB8_BTN_VER = new javax.swing.JButton();
        BarraDeMenu = new javax.swing.JMenuBar();
        MenuPrincipal = new javax.swing.JMenu();
        MENUITM_CrearPila = new javax.swing.JMenuItem();
        MENUITM_Apilar = new javax.swing.JMenuItem();
        MENUITM_Desapilar = new javax.swing.JMenuItem();
        MENUITM_MostrarTamaño = new javax.swing.JMenuItem();
        MENUITM_EstaVacia = new javax.swing.JMenuItem();
        MENUITM_MostrarElementos = new javax.swing.JMenuItem();
        MENUITM_VaciarPila = new javax.swing.JMenuItem();
        MENUITM_MostrarValor = new javax.swing.JMenuItem();
        MENUITM_Terminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        GrupoDePestañas.setBackground(new java.awt.Color(255, 255, 255));
        GrupoDePestañas.setForeground(new java.awt.Color(0, 0, 0));

        Tab1_CrearPila.setBackground(new java.awt.Color(255, 255, 255));
        Tab1_CrearPila.setForeground(new java.awt.Color(0, 0, 0));

        TAB1_TXT_Info.setText("Ingrese el tamaño del vector:");

        TAB1_BTN_Aceptar.setBackground(new java.awt.Color(255, 255, 255));
        TAB1_BTN_Aceptar.setForeground(new java.awt.Color(0, 0, 0));
        TAB1_BTN_Aceptar.setText("ACEPTAR");
        TAB1_BTN_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB1_BTN_AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Tab1_CrearPilaLayout = new javax.swing.GroupLayout(Tab1_CrearPila);
        Tab1_CrearPila.setLayout(Tab1_CrearPilaLayout);
        Tab1_CrearPilaLayout.setHorizontalGroup(
            Tab1_CrearPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab1_CrearPilaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab1_CrearPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TAB1_TXT_Info)
                    .addComponent(TAB1_TXTField_TamañoVector, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Tab1_CrearPilaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(TAB1_BTN_Aceptar)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        Tab1_CrearPilaLayout.setVerticalGroup(
            Tab1_CrearPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab1_CrearPilaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TAB1_TXT_Info)
                .addGap(18, 18, 18)
                .addComponent(TAB1_TXTField_TamañoVector, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TAB1_BTN_Aceptar)
                .addContainerGap(357, Short.MAX_VALUE))
        );

        GrupoDePestañas.addTab("1", Tab1_CrearPila);

        Tab2_Apilar.setBackground(new java.awt.Color(255, 255, 255));
        Tab2_Apilar.setForeground(new java.awt.Color(0, 0, 0));

        TAB2_TXT_Info.setText("Ingrese los siguientes datos:");

        TAB2_TXT_IngIdentificador.setText("Identificador:");

        TAB2_TXT_IngNombre.setText("Nombre:");

        TAB2_TXT_IngDirector.setText("Director:");

        TAB2_TXT_IngDuracion.setText("Duracion:");

        TAB2_BTN_Aceptar.setBackground(new java.awt.Color(255, 255, 255));
        TAB2_BTN_Aceptar.setForeground(new java.awt.Color(0, 0, 0));
        TAB2_BTN_Aceptar.setText("ACEPTAR");
        TAB2_BTN_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB2_BTN_AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Tab2_ApilarLayout = new javax.swing.GroupLayout(Tab2_Apilar);
        Tab2_Apilar.setLayout(Tab2_ApilarLayout);
        Tab2_ApilarLayout.setHorizontalGroup(
            Tab2_ApilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab2_ApilarLayout.createSequentialGroup()
                .addGroup(Tab2_ApilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tab2_ApilarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Tab2_ApilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TAB2_TXT_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TAB2_TXT_IngIdentificador)
                            .addComponent(TAB2_TXTField_Identificador)
                            .addComponent(TAB2_TXT_IngNombre)
                            .addComponent(TAB2_TXTField_Nombre)
                            .addComponent(TAB2_TXT_IngDirector)
                            .addComponent(TAB2_TXTField_Director)
                            .addComponent(TAB2_TXT_IngDuracion)
                            .addComponent(TAB2_TXTField_Duracion)))
                    .addGroup(Tab2_ApilarLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(TAB2_BTN_Aceptar)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        Tab2_ApilarLayout.setVerticalGroup(
            Tab2_ApilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab2_ApilarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TAB2_TXT_Info)
                .addGap(18, 18, 18)
                .addComponent(TAB2_TXT_IngIdentificador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAB2_TXTField_Identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAB2_TXT_IngNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAB2_TXTField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TAB2_TXT_IngDirector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAB2_TXTField_Director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAB2_TXT_IngDuracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAB2_TXTField_Duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TAB2_BTN_Aceptar)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        GrupoDePestañas.addTab("2", Tab2_Apilar);

        Tab3_Desarpilar.setBackground(new java.awt.Color(255, 255, 255));
        Tab3_Desarpilar.setForeground(new java.awt.Color(0, 0, 0));

        TAB3_TXT_Info.setText("¿Desea remover la ultima pelicula que entro al vector?");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        TABLA_REMOVERPELICULA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TABLA_REMOVERPELICULA);

        TAB2_TXT_Objeto.setText("Objeto:");

        TAB3_BTN_REMOVER.setBackground(new java.awt.Color(255, 255, 255));
        TAB3_BTN_REMOVER.setForeground(new java.awt.Color(0, 0, 0));
        TAB3_BTN_REMOVER.setText("REMOVER");
        TAB3_BTN_REMOVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB3_BTN_REMOVERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Tab3_DesarpilarLayout = new javax.swing.GroupLayout(Tab3_Desarpilar);
        Tab3_Desarpilar.setLayout(Tab3_DesarpilarLayout);
        Tab3_DesarpilarLayout.setHorizontalGroup(
            Tab3_DesarpilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab3_DesarpilarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab3_DesarpilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TAB3_TXT_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TAB2_TXT_Objeto)
                    .addComponent(TAB3_BTN_REMOVER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab3_DesarpilarLayout.setVerticalGroup(
            Tab3_DesarpilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab3_DesarpilarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TAB3_TXT_Info)
                .addGap(18, 18, 18)
                .addComponent(TAB2_TXT_Objeto)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TAB3_BTN_REMOVER)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        GrupoDePestañas.addTab("3", Tab3_Desarpilar);

        Tab4_MostrarTamaño.setBackground(new java.awt.Color(255, 255, 255));
        Tab4_MostrarTamaño.setForeground(new java.awt.Color(0, 0, 0));

        TAB4_TXT_Info.setForeground(new java.awt.Color(0, 0, 0));
        TAB4_TXT_Info.setText("Cantidad de peliculas en el vector:");

        TAB4_TXT_NumeroDePeliculas.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TAB4_TXT_NumeroDePeliculas.setForeground(new java.awt.Color(0, 0, 0));
        TAB4_TXT_NumeroDePeliculas.setText("N");

        javax.swing.GroupLayout Tab4_MostrarTamañoLayout = new javax.swing.GroupLayout(Tab4_MostrarTamaño);
        Tab4_MostrarTamaño.setLayout(Tab4_MostrarTamañoLayout);
        Tab4_MostrarTamañoLayout.setHorizontalGroup(
            Tab4_MostrarTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab4_MostrarTamañoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab4_MostrarTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TAB4_TXT_Info)
                    .addComponent(TAB4_TXT_NumeroDePeliculas))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        Tab4_MostrarTamañoLayout.setVerticalGroup(
            Tab4_MostrarTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab4_MostrarTamañoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TAB4_TXT_Info)
                .addGap(18, 18, 18)
                .addComponent(TAB4_TXT_NumeroDePeliculas)
                .addContainerGap(371, Short.MAX_VALUE))
        );

        GrupoDePestañas.addTab("4", Tab4_MostrarTamaño);

        Tab5_EstaVacia.setBackground(new java.awt.Color(255, 255, 255));
        Tab5_EstaVacia.setForeground(new java.awt.Color(0, 0, 0));

        TAB5_TXT_Info.setText("¿El vector no contiene a ningun objeto?");

        TAB5_TXT_SiNo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TAB5_TXT_SiNo.setText("S/N");

        javax.swing.GroupLayout Tab5_EstaVaciaLayout = new javax.swing.GroupLayout(Tab5_EstaVacia);
        Tab5_EstaVacia.setLayout(Tab5_EstaVaciaLayout);
        Tab5_EstaVaciaLayout.setHorizontalGroup(
            Tab5_EstaVaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab5_EstaVaciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab5_EstaVaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TAB5_TXT_Info)
                    .addComponent(TAB5_TXT_SiNo))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        Tab5_EstaVaciaLayout.setVerticalGroup(
            Tab5_EstaVaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab5_EstaVaciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TAB5_TXT_Info)
                .addGap(18, 18, 18)
                .addComponent(TAB5_TXT_SiNo)
                .addContainerGap(371, Short.MAX_VALUE))
        );

        GrupoDePestañas.addTab("5", Tab5_EstaVacia);

        Tab6_MostrarElementos.setBackground(new java.awt.Color(255, 255, 255));
        Tab6_MostrarElementos.setForeground(new java.awt.Color(0, 0, 0));

        TAB6_TXT_Info.setText("Peliculas actuales en el vector:");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        TABLA_TODASPELICULAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TABLA_TODASPELICULAS);

        javax.swing.GroupLayout Tab6_MostrarElementosLayout = new javax.swing.GroupLayout(Tab6_MostrarElementos);
        Tab6_MostrarElementos.setLayout(Tab6_MostrarElementosLayout);
        Tab6_MostrarElementosLayout.setHorizontalGroup(
            Tab6_MostrarElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab6_MostrarElementosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab6_MostrarElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TAB6_TXT_Info)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab6_MostrarElementosLayout.setVerticalGroup(
            Tab6_MostrarElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab6_MostrarElementosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TAB6_TXT_Info)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        GrupoDePestañas.addTab("6", Tab6_MostrarElementos);

        Tab7_VaciarPilas.setBackground(new java.awt.Color(255, 255, 255));
        Tab7_VaciarPilas.setForeground(new java.awt.Color(0, 0, 0));

        TAB7_TXT_Info.setText("¿Esta seguro de que desea eliminar todas las peliculas?");

        TAB7_TXT_Info2.setText("Esta accion no se puede deshacer.");

        TAB7_BTN_ELIMINARTODO.setBackground(new java.awt.Color(255, 255, 255));
        TAB7_BTN_ELIMINARTODO.setForeground(new java.awt.Color(0, 0, 0));
        TAB7_BTN_ELIMINARTODO.setText("ELIMINAR TODO");
        TAB7_BTN_ELIMINARTODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB7_BTN_ELIMINARTODOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Tab7_VaciarPilasLayout = new javax.swing.GroupLayout(Tab7_VaciarPilas);
        Tab7_VaciarPilas.setLayout(Tab7_VaciarPilasLayout);
        Tab7_VaciarPilasLayout.setHorizontalGroup(
            Tab7_VaciarPilasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab7_VaciarPilasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab7_VaciarPilasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TAB7_TXT_Info)
                    .addComponent(TAB7_TXT_Info2)
                    .addComponent(TAB7_BTN_ELIMINARTODO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab7_VaciarPilasLayout.setVerticalGroup(
            Tab7_VaciarPilasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab7_VaciarPilasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TAB7_TXT_Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAB7_TXT_Info2)
                .addGap(18, 18, 18)
                .addComponent(TAB7_BTN_ELIMINARTODO)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        GrupoDePestañas.addTab("7", Tab7_VaciarPilas);

        Tab8_MostrarValor.setBackground(new java.awt.Color(255, 255, 255));
        Tab8_MostrarValor.setForeground(new java.awt.Color(0, 0, 0));

        TAB8_TXT_Info.setText("Ingrese la posicion de la pelicula en el vector:");

        TABLA_ESPECIFICAPELICULA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TABLA_ESPECIFICAPELICULA);

        TAB8_TXT_Pelicula.setText("Pelicula:");

        TAB8_BTN_VER.setBackground(new java.awt.Color(255, 255, 255));
        TAB8_BTN_VER.setText("VER");
        TAB8_BTN_VER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB8_BTN_VERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Tab8_MostrarValorLayout = new javax.swing.GroupLayout(Tab8_MostrarValor);
        Tab8_MostrarValor.setLayout(Tab8_MostrarValorLayout);
        Tab8_MostrarValorLayout.setHorizontalGroup(
            Tab8_MostrarValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab8_MostrarValorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab8_MostrarValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TAB8_TXTField_Posicion)
                    .addGroup(Tab8_MostrarValorLayout.createSequentialGroup()
                        .addGroup(Tab8_MostrarValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TAB8_TXT_Info)
                            .addComponent(TAB8_BTN_VER)
                            .addComponent(TAB8_TXT_Pelicula))
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        Tab8_MostrarValorLayout.setVerticalGroup(
            Tab8_MostrarValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab8_MostrarValorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TAB8_TXT_Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAB8_TXTField_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAB8_BTN_VER)
                .addGap(35, 35, 35)
                .addComponent(TAB8_TXT_Pelicula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        GrupoDePestañas.addTab("8", Tab8_MostrarValor);

        BarraDeMenu.setBackground(new java.awt.Color(255, 255, 255));
        BarraDeMenu.setForeground(new java.awt.Color(0, 0, 0));
        BarraDeMenu.setAlignmentY(0.5F);

        MenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        MenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        MenuPrincipal.setText("Menu Principal");

        MENUITM_CrearPila.setBackground(new java.awt.Color(255, 255, 255));
        MENUITM_CrearPila.setForeground(new java.awt.Color(0, 0, 0));
        MENUITM_CrearPila.setText("Crear Pila");
        MENUITM_CrearPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_CrearPilaActionPerformed(evt);
            }
        });
        MenuPrincipal.add(MENUITM_CrearPila);

        MENUITM_Apilar.setBackground(new java.awt.Color(255, 255, 255));
        MENUITM_Apilar.setForeground(new java.awt.Color(0, 0, 0));
        MENUITM_Apilar.setText("Apilar");
        MENUITM_Apilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_ApilarActionPerformed(evt);
            }
        });
        MenuPrincipal.add(MENUITM_Apilar);

        MENUITM_Desapilar.setBackground(new java.awt.Color(255, 255, 255));
        MENUITM_Desapilar.setForeground(new java.awt.Color(0, 0, 0));
        MENUITM_Desapilar.setText("Desapilar");
        MENUITM_Desapilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_DesapilarActionPerformed(evt);
            }
        });
        MenuPrincipal.add(MENUITM_Desapilar);

        MENUITM_MostrarTamaño.setBackground(new java.awt.Color(255, 255, 255));
        MENUITM_MostrarTamaño.setForeground(new java.awt.Color(0, 0, 0));
        MENUITM_MostrarTamaño.setText("Mostrar Tamaño de Pila");
        MENUITM_MostrarTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_MostrarTamañoActionPerformed(evt);
            }
        });
        MenuPrincipal.add(MENUITM_MostrarTamaño);

        MENUITM_EstaVacia.setBackground(new java.awt.Color(255, 255, 255));
        MENUITM_EstaVacia.setForeground(new java.awt.Color(0, 0, 0));
        MENUITM_EstaVacia.setText("¿Esta vacia la pila?");
        MENUITM_EstaVacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_EstaVaciaActionPerformed(evt);
            }
        });
        MenuPrincipal.add(MENUITM_EstaVacia);

        MENUITM_MostrarElementos.setBackground(new java.awt.Color(255, 255, 255));
        MENUITM_MostrarElementos.setForeground(new java.awt.Color(0, 0, 0));
        MENUITM_MostrarElementos.setText("Mostrar elementos de la pila");
        MENUITM_MostrarElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_MostrarElementosActionPerformed(evt);
            }
        });
        MenuPrincipal.add(MENUITM_MostrarElementos);

        MENUITM_VaciarPila.setBackground(new java.awt.Color(255, 255, 255));
        MENUITM_VaciarPila.setForeground(new java.awt.Color(0, 0, 0));
        MENUITM_VaciarPila.setText("Vaciar Pila Completa");
        MENUITM_VaciarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_VaciarPilaActionPerformed(evt);
            }
        });
        MenuPrincipal.add(MENUITM_VaciarPila);

        MENUITM_MostrarValor.setBackground(new java.awt.Color(255, 255, 255));
        MENUITM_MostrarValor.setForeground(new java.awt.Color(0, 0, 0));
        MENUITM_MostrarValor.setText("Mostrar Valor de Posicion Determinada");
        MENUITM_MostrarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_MostrarValorActionPerformed(evt);
            }
        });
        MenuPrincipal.add(MENUITM_MostrarValor);

        MENUITM_Terminar.setBackground(new java.awt.Color(255, 255, 255));
        MENUITM_Terminar.setForeground(new java.awt.Color(0, 0, 0));
        MENUITM_Terminar.setText("Terminar");
        MENUITM_Terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_TerminarActionPerformed(evt);
            }
        });
        MenuPrincipal.add(MENUITM_Terminar);

        BarraDeMenu.add(MenuPrincipal);

        setJMenuBar(BarraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GrupoDePestañas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GrupoDePestañas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MENUITM_CrearPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_CrearPilaActionPerformed
        GrupoDePestañas.setSelectedIndex(0);
        GrupoDePestañas.setEnabledAt(0, true);
        GrupoDePestañas.setEnabledAt(1, false);
        GrupoDePestañas.setEnabledAt(2, false);
        GrupoDePestañas.setEnabledAt(3, false);
        GrupoDePestañas.setEnabledAt(4, false);
        GrupoDePestañas.setEnabledAt(5, false);
        GrupoDePestañas.setEnabledAt(6, false);
        GrupoDePestañas.setEnabledAt(7, false);
    }//GEN-LAST:event_MENUITM_CrearPilaActionPerformed

    private void MENUITM_ApilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_ApilarActionPerformed
        
        if(Vector.VectorPeliculas.length == 0)
        {
            JOptionPane.showMessageDialog(this, "Usted aun no puede ingresar aqui.", "ERROR.", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        { 
            GrupoDePestañas.setSelectedIndex(1);
            GrupoDePestañas.setEnabledAt(0, false);
            GrupoDePestañas.setEnabledAt(1, true);
            GrupoDePestañas.setEnabledAt(2, false);
            GrupoDePestañas.setEnabledAt(3, false);
            GrupoDePestañas.setEnabledAt(4, false);
            GrupoDePestañas.setEnabledAt(5, false);
            GrupoDePestañas.setEnabledAt(6, false);
            GrupoDePestañas.setEnabledAt(7, false);
        }
    }//GEN-LAST:event_MENUITM_ApilarActionPerformed

    private void MENUITM_DesapilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_DesapilarActionPerformed
        if(Vector.VectorPeliculas.length == 0)
        {
            JOptionPane.showMessageDialog(this, "Usted aun no puede ingresar aqui.", "ERROR.", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GrupoDePestañas.setSelectedIndex(2);
            GrupoDePestañas.setEnabledAt(0, false);
            GrupoDePestañas.setEnabledAt(1, false);
            GrupoDePestañas.setEnabledAt(2, true);
            GrupoDePestañas.setEnabledAt(3, false);
            GrupoDePestañas.setEnabledAt(4, false);
            GrupoDePestañas.setEnabledAt(5, false);
            GrupoDePestañas.setEnabledAt(6, false);
            GrupoDePestañas.setEnabledAt(7, false);
            VectorATabla_ULTIMAPELICULA( Vector.VectorPeliculas, TABLA_REMOVERPELICULA );
        }
    }//GEN-LAST:event_MENUITM_DesapilarActionPerformed

    private void MENUITM_MostrarTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_MostrarTamañoActionPerformed
        GrupoDePestañas.setSelectedIndex(3);
        GrupoDePestañas.setEnabledAt(0, false);
        GrupoDePestañas.setEnabledAt(1, false);
        GrupoDePestañas.setEnabledAt(2, false);
        GrupoDePestañas.setEnabledAt(3, true);
        GrupoDePestañas.setEnabledAt(4, false);
        GrupoDePestañas.setEnabledAt(5, false);
        GrupoDePestañas.setEnabledAt(6, false);
        GrupoDePestañas.setEnabledAt(7, false);
        TAB4_TXT_NumeroDePeliculas.setText(String.valueOf(Metodo.CantidadDePeliculasEnVector()));
    }//GEN-LAST:event_MENUITM_MostrarTamañoActionPerformed

    private void MENUITM_EstaVaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_EstaVaciaActionPerformed
        GrupoDePestañas.setSelectedIndex(4);
        GrupoDePestañas.setEnabledAt(0, false);
        GrupoDePestañas.setEnabledAt(1, false);
        GrupoDePestañas.setEnabledAt(2, false);
        GrupoDePestañas.setEnabledAt(3, false);
        GrupoDePestañas.setEnabledAt(4, true);
        GrupoDePestañas.setEnabledAt(5, false);
        GrupoDePestañas.setEnabledAt(6, false);
        GrupoDePestañas.setEnabledAt(7, false);
        
        if(Metodo.VectorEstaVacio() == true)
        {
            TAB5_TXT_SiNo.setText("Si.");
        }
        else
        {
            TAB5_TXT_SiNo.setText("No.");
        }
    }//GEN-LAST:event_MENUITM_EstaVaciaActionPerformed

    private void MENUITM_MostrarElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_MostrarElementosActionPerformed
        if(Vector.VectorPeliculas.length == 0)
        {
            JOptionPane.showMessageDialog(this, "Usted aun no puede ingresar aqui.", "ERROR.", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GrupoDePestañas.setSelectedIndex(5);
            GrupoDePestañas.setEnabledAt(0, false);
            GrupoDePestañas.setEnabledAt(1, false);
            GrupoDePestañas.setEnabledAt(2, false);
            GrupoDePestañas.setEnabledAt(3, false);
            GrupoDePestañas.setEnabledAt(4, false);
            GrupoDePestañas.setEnabledAt(5, true);
            GrupoDePestañas.setEnabledAt(6, false);
            GrupoDePestañas.setEnabledAt(7, false);
            VectorATabla_TODO( Vector.VectorPeliculas, TABLA_TODASPELICULAS);
        }
    }//GEN-LAST:event_MENUITM_MostrarElementosActionPerformed

    private void MENUITM_VaciarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_VaciarPilaActionPerformed
        GrupoDePestañas.setSelectedIndex(6);
        GrupoDePestañas.setEnabledAt(0, false);
        GrupoDePestañas.setEnabledAt(1, false);
        GrupoDePestañas.setEnabledAt(2, false);
        GrupoDePestañas.setEnabledAt(3, false);
        GrupoDePestañas.setEnabledAt(4, false);
        GrupoDePestañas.setEnabledAt(5, false);
        GrupoDePestañas.setEnabledAt(6, true);
        GrupoDePestañas.setEnabledAt(7, false);
    }//GEN-LAST:event_MENUITM_VaciarPilaActionPerformed

    private void MENUITM_MostrarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_MostrarValorActionPerformed
        if(Vector.VectorPeliculas.length == 0)
        {
            JOptionPane.showMessageDialog(this, "Usted aun no puede ingresar aqui.", "ERROR.", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            GrupoDePestañas.setSelectedIndex(7);
            GrupoDePestañas.setEnabledAt(0, false);
            GrupoDePestañas.setEnabledAt(1, false);
            GrupoDePestañas.setEnabledAt(2, false);
            GrupoDePestañas.setEnabledAt(3, false);
            GrupoDePestañas.setEnabledAt(4, false);
            GrupoDePestañas.setEnabledAt(5, false);
            GrupoDePestañas.setEnabledAt(6, false);
            GrupoDePestañas.setEnabledAt(7, true);
        }
    }//GEN-LAST:event_MENUITM_MostrarValorActionPerformed

    private void MENUITM_TerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_TerminarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MENUITM_TerminarActionPerformed

    private void TAB1_BTN_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB1_BTN_AceptarActionPerformed
        
        String Tamaño = TAB1_TXTField_TamañoVector.getText();
        
        if( Metodo.TamañoEsValido(Tamaño) == false )
        {
            JOptionPane.showMessageDialog(this, "El valor que usted ingreso no es valido.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(Vector.VectorPeliculas.length == 0)
            {
                Metodo.ExpandirVector( Integer.parseInt(Tamaño) );
                JOptionPane.showMessageDialog(this, "Se ha creado el vector correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }
            else //se verifica que no existan un vector
            {
                int Confirmacion = JOptionPane.showConfirmDialog(this, "Ya existe un vector, si continua se borrara junto con todos los datos.", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
                if( Confirmacion == 0 )
                {
                    Metodo.ExpandirVector( Integer.parseInt(Tamaño) );
                    JOptionPane.showMessageDialog(this, "Se ha creado el vector correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_TAB1_BTN_AceptarActionPerformed

    private void TAB2_BTN_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB2_BTN_AceptarActionPerformed
        
        String Identificador = TAB2_TXTField_Identificador.getText();
        String Nombre = TAB2_TXTField_Nombre.getText();
        String Director = TAB2_TXTField_Director.getText();
        String Duracion = TAB2_TXTField_Duracion.getText();
        
        
        if(Metodo.FormularioEsValido( Identificador, Nombre, Director, Duracion) == false )
        {
            JOptionPane.showMessageDialog(this, "Los datos son invalidos, intentelo de nuevo.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(Metodo.Apilar(Identificador, Nombre, Director, Duracion) == false )
        {
            JOptionPane.showMessageDialog(this, "El vector esta lleno.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Se ha guardado la informacion.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_TAB2_BTN_AceptarActionPerformed

    private void TAB7_BTN_ELIMINARTODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB7_BTN_ELIMINARTODOActionPerformed
        Metodo.EliminarTodo();
        JOptionPane.showMessageDialog(this, "Se ha borrado toda la informacion.", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_TAB7_BTN_ELIMINARTODOActionPerformed

    private void TAB8_BTN_VERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB8_BTN_VERActionPerformed
        String Posicion = TAB8_TXTField_Posicion.getText();
        
        Pelicula PeliculaObtenida = new Pelicula();
        PeliculaObtenida = Metodo.ObtenerObjetoEnPosicion(Posicion);
        
        if(PeliculaObtenida != null)
        {
            VectorATabla_PELICULAESPECIFICA( PeliculaObtenida, TABLA_ESPECIFICAPELICULA );
        }
        else
        {
            JOptionPane.showMessageDialog(this, "La posicion es invalida, intentelo de nuevo.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TAB8_BTN_VERActionPerformed

    private void TAB3_BTN_REMOVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB3_BTN_REMOVERActionPerformed
        //se remueve el objeto
        Metodo.Desapilar();
        //se actualiza la tabla de vista previa
        VectorATabla_ULTIMAPELICULA( Vector.VectorPeliculas, TABLA_REMOVERPELICULA );
    }//GEN-LAST:event_TAB3_BTN_REMOVERActionPerformed
    
    //Metodo que crea un modelo de tabla con todos los objetos del vector
    private void VectorATabla_TODO( Pelicula[] VectorPorParametro, JTable TablaPorParametro )
    {   
        //se crea un nuevo modelo de tabla
        DefaultTableModel NuevoModelo = new DefaultTableModel();
        //se añaden las siguientes columnas
        NuevoModelo.addColumn("Identificador");
        NuevoModelo.addColumn("Nombre");
        NuevoModelo.addColumn("Director");
        NuevoModelo.addColumn("Duracion");
        
        //se calcula el tamaño del arreglo y se inicia un ciclo
        for (int row = 0; row < VectorPorParametro.length; row++)
        {
            //si el objeto en la fila especificada del arreglo es diferente de nulo.
            if(VectorPorParametro[row] != null)
            {
                //se obtiene la informacion del arreglo
                int IdentificadorObtenido = VectorPorParametro[row].getIdentificador();
                String NombreObtenido = VectorPorParametro[row].getNombre();
                String DirectorObtenido = VectorPorParametro[row].getDirector();
                int DuracionObtenido = VectorPorParametro[row].getDuracion();
                //se crea una nueva fila con la informacion obtenida
                Object[] NuevaFila = {IdentificadorObtenido, NombreObtenido, DirectorObtenido, DuracionObtenido};
                //se añade la nueva fila al modelo
                NuevoModelo.addRow(NuevaFila);
            }
        }
        
        //se setea el nuevo modelo en la tabla especificada
        TablaPorParametro.setModel(NuevoModelo);
    
    }
    
    //Metodo que crea un modelo de tabla con el objeto en la ultima posicion del vector
    private void VectorATabla_ULTIMAPELICULA( Pelicula[] VectorPorParametro, JTable TablaPorParametro )
    {   
        //se crea un nuevo modelo de tabla
        DefaultTableModel NuevoModelo = new DefaultTableModel();
        //se añaden las siguientes columnas
        NuevoModelo.addColumn("Identificador");
        NuevoModelo.addColumn("Nombre");
        NuevoModelo.addColumn("Director");
        NuevoModelo.addColumn("Duracion");

        Pelicula PeliculaObtenida = new Pelicula();
        try
        {
            PeliculaObtenida =  VectorPorParametro[Metodo.CantidadDePeliculasEnVector() - 1];
            //se crea una nueva fila con la informacion obtenida
            Object[] NuevaFila = {PeliculaObtenida.getIdentificador(), PeliculaObtenida.getNombre(), PeliculaObtenida.getDirector(), PeliculaObtenida.getDuracion()};
            //se añade la nueva fila al modelo
            NuevoModelo.addRow(NuevaFila);
        }
        catch(Exception e)
        {
            Object[] NuevaFila = {"SIN PELICULAS","SIN PELICULAS","SIN PELICULAS","SIN PELICULAS"};

            NuevoModelo.addRow(NuevaFila);
        }

        //se setea el nuevo modelo en la tabla especificada
        TablaPorParametro.setModel(NuevoModelo);
    
    }
    
    //Metodo que crea un modelo de tabla con la pelicula que especifica el usuario
    private void VectorATabla_PELICULAESPECIFICA( Pelicula PeliculaPorParametro, JTable TablaPorParametro )
    {   
        //se crea un nuevo modelo de tabla
        DefaultTableModel NuevoModelo = new DefaultTableModel();
        //se añaden las siguientes columnas
        NuevoModelo.addColumn("Identificador");
        NuevoModelo.addColumn("Nombre");
        NuevoModelo.addColumn("Director");
        NuevoModelo.addColumn("Duracion");

        //se crea una nueva fila con la informacion obtenida
        Object[] NuevaFila = {PeliculaPorParametro.getIdentificador(), PeliculaPorParametro.getNombre(), PeliculaPorParametro.getDirector(), PeliculaPorParametro.getDuracion()};
        //se añade la nueva fila al modelo
        NuevoModelo.addRow(NuevaFila);

        //se setea el nuevo modelo en la tabla especificada
        TablaPorParametro.setModel(NuevoModelo);
    
    }

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new FormPantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraDeMenu;
    private javax.swing.JTabbedPane GrupoDePestañas;
    private javax.swing.JMenuItem MENUITM_Apilar;
    private javax.swing.JMenuItem MENUITM_CrearPila;
    private javax.swing.JMenuItem MENUITM_Desapilar;
    private javax.swing.JMenuItem MENUITM_EstaVacia;
    private javax.swing.JMenuItem MENUITM_MostrarElementos;
    private javax.swing.JMenuItem MENUITM_MostrarTamaño;
    private javax.swing.JMenuItem MENUITM_MostrarValor;
    private javax.swing.JMenuItem MENUITM_Terminar;
    private javax.swing.JMenuItem MENUITM_VaciarPila;
    private javax.swing.JMenu MenuPrincipal;
    private javax.swing.JButton TAB1_BTN_Aceptar;
    private javax.swing.JTextField TAB1_TXTField_TamañoVector;
    private javax.swing.JLabel TAB1_TXT_Info;
    private javax.swing.JButton TAB2_BTN_Aceptar;
    private javax.swing.JTextField TAB2_TXTField_Director;
    private javax.swing.JTextField TAB2_TXTField_Duracion;
    private javax.swing.JTextField TAB2_TXTField_Identificador;
    private javax.swing.JTextField TAB2_TXTField_Nombre;
    private javax.swing.JLabel TAB2_TXT_Info;
    private javax.swing.JLabel TAB2_TXT_IngDirector;
    private javax.swing.JLabel TAB2_TXT_IngDuracion;
    private javax.swing.JLabel TAB2_TXT_IngIdentificador;
    private javax.swing.JLabel TAB2_TXT_IngNombre;
    private javax.swing.JLabel TAB2_TXT_Objeto;
    private javax.swing.JButton TAB3_BTN_REMOVER;
    private javax.swing.JLabel TAB3_TXT_Info;
    private javax.swing.JLabel TAB4_TXT_Info;
    private javax.swing.JLabel TAB4_TXT_NumeroDePeliculas;
    private javax.swing.JLabel TAB5_TXT_Info;
    private javax.swing.JLabel TAB5_TXT_SiNo;
    private javax.swing.JLabel TAB6_TXT_Info;
    private javax.swing.JButton TAB7_BTN_ELIMINARTODO;
    private javax.swing.JLabel TAB7_TXT_Info;
    private javax.swing.JLabel TAB7_TXT_Info2;
    private javax.swing.JButton TAB8_BTN_VER;
    private javax.swing.JTextField TAB8_TXTField_Posicion;
    private javax.swing.JLabel TAB8_TXT_Info;
    private javax.swing.JLabel TAB8_TXT_Pelicula;
    private javax.swing.JTable TABLA_ESPECIFICAPELICULA;
    private javax.swing.JTable TABLA_REMOVERPELICULA;
    private javax.swing.JTable TABLA_TODASPELICULAS;
    private javax.swing.JPanel Tab1_CrearPila;
    private javax.swing.JPanel Tab2_Apilar;
    private javax.swing.JPanel Tab3_Desarpilar;
    private javax.swing.JPanel Tab4_MostrarTamaño;
    private javax.swing.JPanel Tab5_EstaVacia;
    private javax.swing.JPanel Tab6_MostrarElementos;
    private javax.swing.JPanel Tab7_VaciarPilas;
    private javax.swing.JPanel Tab8_MostrarValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
