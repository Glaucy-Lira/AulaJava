package primeiraaplicacao;

/**
 *
 * @author Matheus Santos
 */
public class PrimeiraAplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro meuCarro = new Carro();
        meuCarro.setChassi("AB1234");
        meuCarro.setCor("Azul");
        meuCarro.setModelo("Uno");
        
        System.out.println(meuCarro.toString());
        
        meuCarro.setCor("Amarelo");
        
        System.out.println(meuCarro.toString());
        
    }
    
}
