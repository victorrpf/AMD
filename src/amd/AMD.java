package amd;

public class AMD {

    public static void main(String[] args) {
        int EntradaDias = Integer.parseInt(args[0]);
        int años = EntradaDias/360;
        int meses = EntradaDias/30;
        int dias = EntradaDias%30;          
        
        System.out.print(EntradaDias);
        System.out.print(" días equivalen aproximadamente a ");
        System.out.print(años + " año/s, ");
        System.out.print(meses + " mes/es, ");
        System.out.println(dias + " días.");

    }
    
}
