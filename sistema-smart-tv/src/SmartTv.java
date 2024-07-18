public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;
        /*
         * @param         * 
         * 
         */
    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    } 

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void abaixarVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);

    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Diminuindo o canal para: " + canal);

    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);

    }
    

    public void mudarCanal(int novocanal){
            canal = novocanal;

    }


}
