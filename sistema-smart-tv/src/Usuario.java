public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
            System.out.println("Canal atual: " + smartTv.canal);
            smartTv.mudarCanal(13);
            System.out.println("Canal atual: " + smartTv.canal);



            System.out.println("Volume da tv: " + smartTv.volume);
            }
}
