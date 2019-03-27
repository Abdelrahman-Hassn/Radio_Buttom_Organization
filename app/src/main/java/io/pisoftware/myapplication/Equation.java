package io.pisoftware.myapplication;

public class Equation {

    // الميثود دي بتاخد 6 parameters كل parameter بيعبر عن اذا كان المستخدم مختار الزار دا ولا لأ
    // فالنهاية الميثود بترجعلك string value اللي هتستخدمها فالEditText
    public static String checkCheckedButtons(boolean button1, boolean button2, boolean button3,
                                             boolean button4, boolean button5, boolean button6){
        String text = "0" ;


        if(button1 && button2 && button3){
            text = String.valueOf(5+5) ;
        }

        else if(button4 && button5 && button6){
            text = String.valueOf(6+6) ;
        }

        else {
            text = "البيانات المدخلة خاطئة" ;
        }

        return text ;

    }

}
