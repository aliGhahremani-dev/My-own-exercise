public class CreateAWithStar {
    public void create(){
        int conter = 1;
        int spaceCount = 4;
        for (int i = 0; i < 5; i++) {
            System.out.print(returnString(" ", spaceCount));
            if(conter == 1 || conter == 5) {
                System.out.print(returnString("*", conter));
            }else {
                System.out.print("*"+returnString(" ",conter-2)+"*");
            }
            spaceCount--;
            conter += 2;
            System.out.println("");
        }
    }

    static String returnString(String str, int count) {

        String save = "";
        for (int i = 0; i < count; i++) {
            save += str;
        }
        return save;
    }
    }

