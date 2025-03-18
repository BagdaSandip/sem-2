public class CommandLine {
    public static void main(String[]args){
        if(args.length==0){
            System.out.println(" Hello:) ");

        }
        for(int i=0;i<args.length;i++){
            System.out.println("Argument"+(i+1)+" : "+args[i]);
        }
    }
}
