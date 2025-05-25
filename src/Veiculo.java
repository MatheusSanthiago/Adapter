
import javax.swing.JOptionPane;

public class Veiculo {

    private String Veiculo_model; // Nome do Modelo do carro 1-Etios \n 2-Corolla \n 3-Hilux
    private String variar; // Variavel do carro 1-XR 2-XRE 3-XRX
    private String cor; // Escolher cor do veiculo 1-Vermelho Ruby \n 2-Azul Galaxia \n 3-Roxo miado
    private String Tipo; // 1-Combustão 2-Hibrido 3-Eletrico
    public String p_respVei;
    public String p_respVar;
    public String p_respCor;
    public String p_respTipo;
    
    //metodos
    
    //Metodos especificos
    
    public void ContrutorVeiculo(){
        int p_vei = Integer.parseInt(JOptionPane.showInputDialog("Qual o Modelo do carro desejado? \n \n 1-Etios \n 2-Corolla \n 3-Hilux: ")); 
        int p_var = Integer.parseInt(JOptionPane.showInputDialog("Qual a Variante do carro desejado? \n \n 1-XR \n 2-XRE \n 3-XRX: "));
        int p_cor = Integer.parseInt(JOptionPane.showInputDialog("Qual a Cor do carro desejado? \n \n 1-Vermelho Ruby \n 2-Azul Galaxia \n 3-Roxo miado: "));
        int p_tipo = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo do carro desejado? \n \n 1-Combustão 2-Hibrido 3-Eletrico: "));
        
        switch (p_vei){
            case 1:
                p_respVei = "Etios";
                break;
            case 2:
                p_respVei = "Corolla";
                break; 
            case 3:
                p_respVei = "Hilux";
                break;     
        }
        switch (p_var){
            case 1:
                p_respVar = "XR";
                break;
            case 2:
                p_respVar = "XRE";
                break; 
            case 3:
                p_respVar = "XRX";
                break;
        } 
        switch (p_var){
            case 1:
                p_respVar = "XR";
                break;
            case 2:
                p_respVar = "XRE";
                break; 
            case 3:
                p_respVar = "XRX";
                break;
        } 
        switch (p_cor){
            case 1:
                p_respCor = "Vermelho Ruby";
                break;
            case 2:
                p_respCor = "Azul Galaxia";
                break; 
            case 3:
                p_respCor = "Roxo miado";
                break;
        }
        switch (p_tipo){
            case 1:
                p_respTipo = "Combustão";
                break;
            case 2:
                p_respTipo = "Hibrido";
                break; 
            case 3:
                p_respTipo = "Elétrico";
                break;
        }
        
        this.Veiculo_model = p_respVei;
        this.variar = p_respVar;
        this.cor = p_respCor;
        this.Tipo = p_respTipo;
        
        JOptionPane.showMessageDialog(null, "As configurações do carro que voçê criou foi: \n \n Modelo: " +this.getVeiculo()+ "\n \n Variação: " +this.getVariar()+ "\n \n Cor: " +this.getCor()+ "\n \n Tipo: " +this.getTipo());
    }
    
    //Getters
    
    public String getVeiculo() {
        return Veiculo_model;
    }

    public String getVariar() {
        return variar;
    }

    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return Tipo;
    }
    
    
    //Setters

    public void setVeiculo(String Veiculo) {
        this.Veiculo_model = Veiculo;
    }

    public void setVariar(String variar) {
        this.variar = variar;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
}
