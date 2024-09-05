public class ContarExemplo {
    public static void main(String[] args) {

    try {
            contar(2,5);

    } catch (ParametrosInvalidosException exception) {
        System.out.println("loucura");
    }
    }
    static void contar(int parametroUm , int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
            
        }else;
            for (int indice = parametroUm ; indice <= parametroDois ;indice++){
                System.out.println(indice);
            }
    }
}
    
