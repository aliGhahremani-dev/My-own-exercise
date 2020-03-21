public class CreateLozengeWithStar
{
    public void Craete(){
        int counter = 1;
        int SpaceCounter = 3;
        for (int i=0;i<4;i++){
            System.out.print(RepeatStr(" ",SpaceCounter));
            System.out.print(RepeatStr("*",counter));
            counter +=2;
            SpaceCounter--;
            System.out.println("");
        }

        counter = 5;
        SpaceCounter = 1;
        for (int i=counter;i>0;i--){

            System.out.print(RepeatStr(" ",SpaceCounter));
            System.out.print(RepeatStr("*",counter));
            counter -=2;
            SpaceCounter++;
            System.out.println("");
        }
    }

    static String RepeatStr(String str,int counter){
        String result = "";
        for (int i=0;i<counter;i++){
            result += str;
        }
        return result;
    }


}
