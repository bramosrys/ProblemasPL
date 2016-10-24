package plsolver.controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import plsolver.view.WelcomePanel;

public class ControlWelcomePanel implements ActionListener,MouseListener{
    private WelcomePanel panel;
    public ControlWelcomePanel(WelcomePanel panel){
        this.panel = panel;
        showWelcomePanel();
    }
    public void  showWelcomePanel(){
        CardLayout welcomeLayout = (CardLayout) panel.welcomePanelContainer.getLayout();
        welcomeLayout.show(panel.welcomePanelContainer, "welcomePanel");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch(e.getComponent().getName()){
            case "welcomeBannerIcon":
                System.out.println("si entro 2");
                CardLayout welcomeLayout = (CardLayout) panel.welcomePanelContainer.getLayout();
                welcomeLayout.show(panel.welcomePanelContainer, "fieldsRequerimentPanel");
            break;
            default:
            break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
     
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
   
    }
    
}