import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);

            System.out.println("Informe a primeira variavel: ");
            int parametro01 = scan.nextInt();

            System.out.println("Informe a segunda variavel: ");
            int parametro02 =  scan.nextInt();

            try {
                contar(parametro01, parametro02);

                
            } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro " + e.getMessage());
            }
           
        
            scan.close();
    }

    static void contar(int parametroUM, int parametroDOIS) throws ParametrosInvalidosException  {
        if(parametroUM >= parametroDOIS){
            throw new ParametrosInvalidosException();
        }
        else {
            int contar = parametroDOIS - parametroUM;
            for(int i = 1; i <= contar; i++){
                System.out.println("Imprimindo o numero " + i);
            }
        }
    }

   
        
    }





