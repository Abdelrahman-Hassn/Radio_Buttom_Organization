package io.pisoftware.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton radioButton1 ;
    RadioButton radioButton2 ;
    RadioButton radioButton3 ;
    RadioButton radioButton4 ;
    RadioButton radioButton5 ;
    RadioButton radioButton6 ;
    EditText editText ;
    Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton ) ;
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2) ;
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3) ;
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4) ;
        radioButton5 = (RadioButton) findViewById(R.id.radioButton5) ;
        radioButton6 = (RadioButton) findViewById(R.id.radioButton6) ;
        editText     = (EditText   ) findViewById(R.id.editText    ) ;
        button       = (Button     ) findViewById(R.id.button      ) ;


    }

    public void equation(View view){
        // الميثود اللي فالكلاس التاني بترجعلنا string ف بتخزنه فالvariable دا
       String text =  Equation.checkCheckedButtons(radioButton1.isChecked() , radioButton2.isChecked() ,radioButton3.isChecked(),
                radioButton4.isChecked() , radioButton5.isChecked() , radioButton6.isChecked()  ) ;

       editText.setText(text);

        //هنا بنلغي اختيار المستخدم عشان لو حب يختار تاني
        // عشان انت عارف طبعا ان لو انت عملتcheck للRadioButton مينفعش تلغيه تاني
        radioButton1.setChecked(false);
        radioButton2.setChecked(false);
        radioButton3.setChecked(false);
        radioButton4.setChecked(false);
        radioButton5.setChecked(false);
        radioButton6.setChecked(false);
    }
}
