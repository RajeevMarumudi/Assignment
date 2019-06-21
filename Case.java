public class Case {
    private static void alphabet(char a){
        if((a>='a')&&(a<='z')){
            System.out.println("This character is a Lower Case alphabet.");
        }
        else if((a>='A')&&(a<='Z')){
            System.out.println("This character is an Upper Case alphabet.");
        }
        else{
            System.out.println("This is not an alphabet");
        }
    }

    public static void main(String[] args) {
        char a='P';
        alphabet(a);
    }
}
