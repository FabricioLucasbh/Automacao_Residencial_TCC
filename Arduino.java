import javax.swing.JButton;
 
/**
 * @author Fabricio
 */
public class Arduino extends javax.swing.JFrame{
private  ControleDePorta arduino;

  
  /**
   * Construtor da classe Arduino
   */
  public Arduino(){
      arduino = new ControleDePorta("COM3",9600);//Windows - porta e taxa de transmissão
     
    }    
 
  /**
   * Envia o comando para a porta serial
   * @param button - Botão que é clicado na interface Java
   */
  public void comunicacaoArduinoVaranda(JButton button) {        
    if("Ligar".equals(button.getActionCommand())){
      arduino.enviaDados(1);
      System.out.println(button.getText());//Imprime o nome do botão pressionado
    }
    else if("Desligar".equals(button.getActionCommand())){
      arduino.enviaDados(2);
      System.out.println(button.getText());
    } 
  }
  public void comunicacaoArduinoQuarto(JButton button) {        
    if("Ligar".equals(button.getActionCommand())){
      arduino.enviaDados(3);
      System.out.println(button.getText());//Imprime o nome do botão pressionado
    }
    else if("Desligar".equals(button.getActionCommand())){
      arduino.enviaDados(4);
      System.out.println(button.getText());
    } 
  }
   public void comunicacaoArduinoSala(JButton button) {        
    if("Ligar".equals(button.getActionCommand())){
      arduino.enviaDados(5);
      System.out.println(button.getText());//Imprime o nome do botão pressionado
    }
    else if("Desligar".equals(button.getActionCommand())){
      arduino.enviaDados(6);
      System.out.println(button.getText());
    } 
}
    public void comunicacaoArduinoVaranda2(JButton button) {        
    if("Ligar".equals(button.getActionCommand())){
      arduino.enviaDados(7);
      System.out.println(button.getText());//Imprime o nome do botão pressionado
    }
    else if("Desligar".equals(button.getActionCommand())){
      arduino.enviaDados(8);
      System.out.println(button.getText());
    } 
}
     public void comunicacaoArduinoSalaJantar(JButton button) {        
    if("Ligar".equals(button.getActionCommand())){
      arduino.enviaDados(9);
      System.out.println(button.getText());//Imprime o nome do botão pressionado
    }
    else if("Desligar".equals(button.getActionCommand())){
      arduino.enviaDados(10);
      System.out.println(button.getText());
    } 
}
     public void comunicacaoArduinoCozinha(JButton button) {        
    if("Ligar".equals(button.getActionCommand())){
      arduino.enviaDados(11);
      System.out.println(button.getText());//Imprime o nome do botão pressionado
    }
    else if("Desligar".equals(button.getActionCommand())){
      arduino.enviaDados(12);
      System.out.println(button.getText());
    } 
}   
}