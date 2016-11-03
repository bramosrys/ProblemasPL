/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plsolver.view;

import plsolver.controller.ControlWelcomePanel;

/**
 *
 * @author jdiaz
 */
public class WelcomePanel extends javax.swing.JPanel {

    /**
     * Creates new form WelcomePanel
     */
    public WelcomePanel() {
        initComponents();
        myinitComponents();
    }
    public void myinitComponents(){
        ControlWelcomePanel cwelcomepanel = new ControlWelcomePanel(this);
        welcomeBannerIcon.addMouseListener(cwelcomepanel);
        maxButton.addMouseListener(cwelcomepanel);
        minButton.addMouseListener(cwelcomepanel);
        verifyObjectiveFunction.addActionListener(cwelcomepanel);
        resttriction1Button.addActionListener(cwelcomepanel);
        resttriction2Button.addActionListener(cwelcomepanel);
        resttriction3Button.addActionListener(cwelcomepanel);
        resttriction4Button.addActionListener(cwelcomepanel);
        resttriction5Button.addActionListener(cwelcomepanel);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomePanelContainer = new javax.swing.JPanel();
        welcomePanel = new javax.swing.JPanel();
        welcomeBannerIcon = new javax.swing.JLabel();
        fieldsRequerimentPanel = new javax.swing.JPanel();
        requerimentTitlePanel = new javax.swing.JPanel();
        requerimentTitleLabel = new javax.swing.JLabel();
        requerimentContainerPanel = new javax.swing.JPanel();
        requerimentChoosePanel = new javax.swing.JPanel();
        maxButton = new javax.swing.JLabel();
        minButton = new javax.swing.JLabel();
        requerimentIntroducePanel = new javax.swing.JPanel();
        objectiveFunctionPanel = new javax.swing.JPanel();
        objectiveFunctionTitleLabel = new javax.swing.JLabel();
        objectiveFunctionZLabel = new javax.swing.JLabel();
        objectiveFunctionTitleSeparator = new javax.swing.JSeparator();
        objectiveFunctionFiled = new javax.swing.JTextField();
        verifyObjectiveFunction = new javax.swing.JButton();
        restrictionsPanel = new javax.swing.JPanel();
        restrictionsTitlePanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        restrictionsTitleSeparator = new javax.swing.JSeparator();
        restrictionGridPanel = new javax.swing.JPanel();
        restriction1panel = new javax.swing.JPanel();
        restriction1Label = new javax.swing.JLabel();
        restriction1Field = new javax.swing.JTextField();
        resttriction1Button = new javax.swing.JButton();
        restriction2panel = new javax.swing.JPanel();
        restriction2Label = new javax.swing.JLabel();
        restriction2Field = new javax.swing.JTextField();
        resttriction2Button = new javax.swing.JButton();
        restriction3panel = new javax.swing.JPanel();
        restriction3Label = new javax.swing.JLabel();
        restriction3Field = new javax.swing.JTextField();
        resttriction3Button = new javax.swing.JButton();
        restriction4panel = new javax.swing.JPanel();
        restriction4Label = new javax.swing.JLabel();
        restriction4Field = new javax.swing.JTextField();
        resttriction4Button = new javax.swing.JButton();
        restriction5panel = new javax.swing.JPanel();
        restriction5Label = new javax.swing.JLabel();
        restriction5Field = new javax.swing.JTextField();
        resttriction5Button = new javax.swing.JButton();
        resultsPanelContainer = new javax.swing.JPanel();
        resultsPanelTittle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        resultsPanel = new javax.swing.JPanel();
        resultsTableContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        resultsTableScroll = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(810, 410));
        setMinimumSize(new java.awt.Dimension(810, 410));
        setPreferredSize(new java.awt.Dimension(810, 410));
        setLayout(new java.awt.CardLayout());

        welcomePanelContainer.setLayout(new java.awt.CardLayout());

        welcomeBannerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plsolver/view/images/PLSOLVER.png"))); // NOI18N
        welcomeBannerIcon.setToolTipText("");
        welcomeBannerIcon.setName("welcomeBannerIcon"); // NOI18N
        welcomeBannerIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                welcomeBannerIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(welcomeBannerIcon)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(welcomeBannerIcon)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        welcomePanelContainer.add(welcomePanel, "welcomePanel");

        fieldsRequerimentPanel.setBackground(new java.awt.Color(255, 255, 255));
        fieldsRequerimentPanel.setLayout(new java.awt.BorderLayout());

        requerimentTitlePanel.setBackground(new java.awt.Color(118, 40, 52));
        requerimentTitlePanel.setMaximumSize(new java.awt.Dimension(810, 80));
        requerimentTitlePanel.setMinimumSize(new java.awt.Dimension(810, 80));

        requerimentTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        requerimentTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        requerimentTitleLabel.setText("¿Qué problema lineal tienes?");

        javax.swing.GroupLayout requerimentTitlePanelLayout = new javax.swing.GroupLayout(requerimentTitlePanel);
        requerimentTitlePanel.setLayout(requerimentTitlePanelLayout);
        requerimentTitlePanelLayout.setHorizontalGroup(
            requerimentTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requerimentTitlePanelLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(requerimentTitleLabel)
                .addContainerGap(263, Short.MAX_VALUE))
        );
        requerimentTitlePanelLayout.setVerticalGroup(
            requerimentTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requerimentTitlePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(requerimentTitleLabel)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        fieldsRequerimentPanel.add(requerimentTitlePanel, java.awt.BorderLayout.PAGE_START);

        requerimentContainerPanel.setMaximumSize(new java.awt.Dimension(810, 330));
        requerimentContainerPanel.setMinimumSize(new java.awt.Dimension(810, 330));
        requerimentContainerPanel.setLayout(new java.awt.BorderLayout());

        requerimentChoosePanel.setBackground(new java.awt.Color(255, 255, 255));
        requerimentChoosePanel.setLayout(new java.awt.GridLayout(2, 0));

        maxButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plsolver/view/images/Max.png"))); // NOI18N
        maxButton.setName("maxButton"); // NOI18N
        requerimentChoosePanel.add(maxButton);
        maxButton.getAccessibleContext().setAccessibleName("maxButton");

        minButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plsolver/view/images/Min.png"))); // NOI18N
        minButton.setName("mixButton"); // NOI18N
        requerimentChoosePanel.add(minButton);
        minButton.getAccessibleContext().setAccessibleName("mixButton");

        requerimentContainerPanel.add(requerimentChoosePanel, java.awt.BorderLayout.LINE_START);

        requerimentIntroducePanel.setBackground(new java.awt.Color(255, 255, 255));
        requerimentIntroducePanel.setMaximumSize(new java.awt.Dimension(660, 330));
        requerimentIntroducePanel.setMinimumSize(new java.awt.Dimension(660, 330));
        requerimentIntroducePanel.setLayout(new java.awt.BorderLayout());

        objectiveFunctionPanel.setBackground(new java.awt.Color(255, 255, 255));
        objectiveFunctionPanel.setMaximumSize(new java.awt.Dimension(660, 100));
        objectiveFunctionPanel.setMinimumSize(new java.awt.Dimension(660, 100));
        objectiveFunctionPanel.setPreferredSize(new java.awt.Dimension(660, 100));

        objectiveFunctionTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        objectiveFunctionTitleLabel.setText("Función Objetivo");

        objectiveFunctionZLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        objectiveFunctionZLabel.setText("Z= ");

        objectiveFunctionFiled.setText("3x+5y");
        objectiveFunctionFiled.setToolTipText("A+B+C+D");
        objectiveFunctionFiled.setName("objectiveFunctionFiled"); // NOI18N

        verifyObjectiveFunction.setText("Analizar");
        verifyObjectiveFunction.setActionCommand("verifyObjectiveFunction");
        verifyObjectiveFunction.setName("verifyObjectiveFunction"); // NOI18N

        javax.swing.GroupLayout objectiveFunctionPanelLayout = new javax.swing.GroupLayout(objectiveFunctionPanel);
        objectiveFunctionPanel.setLayout(objectiveFunctionPanelLayout);
        objectiveFunctionPanelLayout.setHorizontalGroup(
            objectiveFunctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(objectiveFunctionPanelLayout.createSequentialGroup()
                .addGroup(objectiveFunctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(objectiveFunctionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(objectiveFunctionTitleSeparator))
                    .addGroup(objectiveFunctionPanelLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(objectiveFunctionTitleLabel)
                        .addGap(0, 277, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(objectiveFunctionPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(objectiveFunctionZLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(objectiveFunctionFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verifyObjectiveFunction)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        objectiveFunctionPanelLayout.setVerticalGroup(
            objectiveFunctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(objectiveFunctionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(objectiveFunctionTitleLabel)
                .addGap(1, 1, 1)
                .addComponent(objectiveFunctionTitleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(objectiveFunctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(objectiveFunctionZLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(objectiveFunctionPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(objectiveFunctionFiled))
                    .addComponent(verifyObjectiveFunction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        verifyObjectiveFunction.getAccessibleContext().setAccessibleName("verifyObjectiveFunction");

        requerimentIntroducePanel.add(objectiveFunctionPanel, java.awt.BorderLayout.PAGE_START);

        restrictionsPanel.setMaximumSize(new java.awt.Dimension(660, 230));
        restrictionsPanel.setMinimumSize(new java.awt.Dimension(660, 230));
        restrictionsPanel.setLayout(new java.awt.BorderLayout());

        restrictionsTitlePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Restricciones");

        javax.swing.GroupLayout restrictionsTitlePanelLayout = new javax.swing.GroupLayout(restrictionsTitlePanel);
        restrictionsTitlePanel.setLayout(restrictionsTitlePanelLayout);
        restrictionsTitlePanelLayout.setHorizontalGroup(
            restrictionsTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restrictionsTitlePanelLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel7)
                .addContainerGap(311, Short.MAX_VALUE))
            .addGroup(restrictionsTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(restrictionsTitleSeparator)
                .addContainerGap())
        );
        restrictionsTitlePanelLayout.setVerticalGroup(
            restrictionsTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restrictionsTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restrictionsTitleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        restrictionsPanel.add(restrictionsTitlePanel, java.awt.BorderLayout.PAGE_START);

        restrictionGridPanel.setBackground(new java.awt.Color(255, 255, 255));
        restrictionGridPanel.setLayout(new java.awt.GridLayout(5, 0));

        restriction1panel.setBackground(new java.awt.Color(255, 255, 255));

        restriction1Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        restriction1Label.setText("1)");

        restriction1Field.setText("2x+1y<=75");
        restriction1Field.setToolTipText("a+b+c+d>1");

        resttriction1Button.setText("Agregar");
        resttriction1Button.setActionCommand("resttriction1Button");
        resttriction1Button.setName("resttriction1Button"); // NOI18N

        javax.swing.GroupLayout restriction1panelLayout = new javax.swing.GroupLayout(restriction1panel);
        restriction1panel.setLayout(restriction1panelLayout);
        restriction1panelLayout.setHorizontalGroup(
            restriction1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restriction1panelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(restriction1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restriction1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resttriction1Button)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        restriction1panelLayout.setVerticalGroup(
            restriction1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restriction1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(restriction1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restriction1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(resttriction1Button))
        );

        restrictionGridPanel.add(restriction1panel);

        restriction2panel.setBackground(new java.awt.Color(255, 255, 255));

        restriction2Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        restriction2Label.setText("2)");

        restriction2Field.setText("2x+3y>=10");
        restriction2Field.setToolTipText("a+b+c+d>1");

        resttriction2Button.setText("Agregar");
        resttriction2Button.setActionCommand("resttriction2Button");
        resttriction2Button.setName("resttriction2Button"); // NOI18N

        javax.swing.GroupLayout restriction2panelLayout = new javax.swing.GroupLayout(restriction2panel);
        restriction2panel.setLayout(restriction2panelLayout);
        restriction2panelLayout.setHorizontalGroup(
            restriction2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restriction2panelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(restriction2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restriction2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resttriction2Button)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        restriction2panelLayout.setVerticalGroup(
            restriction2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restriction2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(restriction2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restriction2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(resttriction2Button))
        );

        resttriction2Button.getAccessibleContext().setAccessibleName("resttriction2Button");

        restrictionGridPanel.add(restriction2panel);

        restriction3panel.setBackground(new java.awt.Color(255, 255, 255));

        restriction3Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        restriction3Label.setText("3)");

        restriction3Field.setToolTipText("a+b+c+d>1");

        resttriction3Button.setText("Agregar");
        resttriction3Button.setActionCommand("resttriction3Button");
        resttriction3Button.setName("resttriction3Button"); // NOI18N

        javax.swing.GroupLayout restriction3panelLayout = new javax.swing.GroupLayout(restriction3panel);
        restriction3panel.setLayout(restriction3panelLayout);
        restriction3panelLayout.setHorizontalGroup(
            restriction3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restriction3panelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(restriction3Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restriction3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resttriction3Button)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        restriction3panelLayout.setVerticalGroup(
            restriction3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restriction3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(restriction3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restriction3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(resttriction3Button))
        );

        resttriction3Button.getAccessibleContext().setAccessibleName("resttriction3Button");

        restrictionGridPanel.add(restriction3panel);

        restriction4panel.setBackground(new java.awt.Color(255, 255, 255));

        restriction4Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        restriction4Label.setText("4)");

        restriction4Field.setToolTipText("a+b+c+d>1");

        resttriction4Button.setText("Agregar");
        resttriction4Button.setActionCommand("resttriction4Button");
        resttriction4Button.setName("resttriction4Button"); // NOI18N

        javax.swing.GroupLayout restriction4panelLayout = new javax.swing.GroupLayout(restriction4panel);
        restriction4panel.setLayout(restriction4panelLayout);
        restriction4panelLayout.setHorizontalGroup(
            restriction4panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restriction4panelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(restriction4Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restriction4Field, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resttriction4Button)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        restriction4panelLayout.setVerticalGroup(
            restriction4panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restriction4panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(restriction4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restriction4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(resttriction4Button))
        );

        resttriction4Button.getAccessibleContext().setAccessibleName("resttriction4Button");

        restrictionGridPanel.add(restriction4panel);

        restriction5panel.setBackground(new java.awt.Color(255, 255, 255));

        restriction5Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        restriction5Label.setText("5)");

        restriction5Field.setToolTipText("a+b+c+d>1");

        resttriction5Button.setText("Agregar");
        resttriction5Button.setActionCommand("resttriction5Button");
        resttriction5Button.setName("resttriction5Button"); // NOI18N

        javax.swing.GroupLayout restriction5panelLayout = new javax.swing.GroupLayout(restriction5panel);
        restriction5panel.setLayout(restriction5panelLayout);
        restriction5panelLayout.setHorizontalGroup(
            restriction5panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restriction5panelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(restriction5Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restriction5Field, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resttriction5Button)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        restriction5panelLayout.setVerticalGroup(
            restriction5panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restriction5panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(restriction5Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restriction5Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(resttriction5Button))
        );

        resttriction5Button.getAccessibleContext().setAccessibleName("resttriction5Button");

        restrictionGridPanel.add(restriction5panel);

        restrictionsPanel.add(restrictionGridPanel, java.awt.BorderLayout.CENTER);

        requerimentIntroducePanel.add(restrictionsPanel, java.awt.BorderLayout.CENTER);

        requerimentContainerPanel.add(requerimentIntroducePanel, java.awt.BorderLayout.CENTER);

        fieldsRequerimentPanel.add(requerimentContainerPanel, java.awt.BorderLayout.CENTER);

        welcomePanelContainer.add(fieldsRequerimentPanel, "fieldsRequerimentPanel");

        resultsPanelContainer.setLayout(new java.awt.BorderLayout());

        resultsPanelTittle.setBackground(new java.awt.Color(118, 40, 52));
        resultsPanelTittle.setMaximumSize(new java.awt.Dimension(810, 80));
        resultsPanelTittle.setMinimumSize(new java.awt.Dimension(810, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resultados");

        javax.swing.GroupLayout resultsPanelTittleLayout = new javax.swing.GroupLayout(resultsPanelTittle);
        resultsPanelTittle.setLayout(resultsPanelTittleLayout);
        resultsPanelTittleLayout.setHorizontalGroup(
            resultsPanelTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsPanelTittleLayout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(jLabel1)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        resultsPanelTittleLayout.setVerticalGroup(
            resultsPanelTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultsPanelTittleLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        resultsPanelContainer.add(resultsPanelTittle, java.awt.BorderLayout.PAGE_START);

        resultsPanel.setBackground(new java.awt.Color(255, 255, 255));
        resultsPanel.setMaximumSize(new java.awt.Dimension(810, 332));
        resultsPanel.setMinimumSize(new java.awt.Dimension(810, 332));
        resultsPanel.setLayout(new java.awt.BorderLayout());

        resultsTableContainer.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        resultsTableContainer.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        resultsTableScroll.setBackground(new java.awt.Color(255, 255, 255));
        resultsTableScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        resultsTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        resultsTable.setToolTipText("");
        resultsTableScroll.setViewportView(resultsTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(resultsTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(resultsTableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        resultsTableContainer.add(jPanel2, java.awt.BorderLayout.CENTER);

        resultsPanel.add(resultsTableContainer, java.awt.BorderLayout.CENTER);

        resultsPanelContainer.add(resultsPanel, java.awt.BorderLayout.CENTER);

        welcomePanelContainer.add(resultsPanelContainer, "resultsPanelContainer");

        add(welcomePanelContainer, "welcomePanelContainer");
    }// </editor-fold>//GEN-END:initComponents

    private void welcomeBannerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomeBannerIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomeBannerIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel fieldsRequerimentPanel;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JLabel maxButton;
    public javax.swing.JLabel minButton;
    public javax.swing.JTextField objectiveFunctionFiled;
    public javax.swing.JPanel objectiveFunctionPanel;
    public javax.swing.JLabel objectiveFunctionTitleLabel;
    public javax.swing.JSeparator objectiveFunctionTitleSeparator;
    public javax.swing.JLabel objectiveFunctionZLabel;
    public javax.swing.JPanel requerimentChoosePanel;
    public javax.swing.JPanel requerimentContainerPanel;
    public javax.swing.JPanel requerimentIntroducePanel;
    public javax.swing.JLabel requerimentTitleLabel;
    public javax.swing.JPanel requerimentTitlePanel;
    public javax.swing.JTextField restriction1Field;
    public javax.swing.JLabel restriction1Label;
    public javax.swing.JPanel restriction1panel;
    public javax.swing.JTextField restriction2Field;
    public javax.swing.JLabel restriction2Label;
    public javax.swing.JPanel restriction2panel;
    public javax.swing.JTextField restriction3Field;
    public javax.swing.JLabel restriction3Label;
    public javax.swing.JPanel restriction3panel;
    public javax.swing.JTextField restriction4Field;
    public javax.swing.JLabel restriction4Label;
    public javax.swing.JPanel restriction4panel;
    public javax.swing.JTextField restriction5Field;
    public javax.swing.JLabel restriction5Label;
    public javax.swing.JPanel restriction5panel;
    public javax.swing.JPanel restrictionGridPanel;
    public javax.swing.JPanel restrictionsPanel;
    public javax.swing.JPanel restrictionsTitlePanel;
    public javax.swing.JSeparator restrictionsTitleSeparator;
    public javax.swing.JButton resttriction1Button;
    public javax.swing.JButton resttriction2Button;
    public javax.swing.JButton resttriction3Button;
    public javax.swing.JButton resttriction4Button;
    public javax.swing.JButton resttriction5Button;
    public javax.swing.JPanel resultsPanel;
    public javax.swing.JPanel resultsPanelContainer;
    public javax.swing.JPanel resultsPanelTittle;
    public javax.swing.JTable resultsTable;
    public javax.swing.JPanel resultsTableContainer;
    public javax.swing.JScrollPane resultsTableScroll;
    public javax.swing.JButton verifyObjectiveFunction;
    public javax.swing.JLabel welcomeBannerIcon;
    public javax.swing.JPanel welcomePanel;
    public javax.swing.JPanel welcomePanelContainer;
    // End of variables declaration//GEN-END:variables
}
