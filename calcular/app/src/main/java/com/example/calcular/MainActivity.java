package com.example.calcular;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public EditText scrn;
    public double num1, num2, res;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrn=(EditText)findViewById(R.id.caja);
    }

    public void btn1 (View v){
        String cap= scrn.getText().toString();
        cap=cap+"1";
        scrn.setText(cap);
    }

    public void btn2 (View v){
        String cap= scrn.getText().toString();
        cap=cap+"2";
        scrn.setText(cap);

    }
    public void btn3 (View v){
        String cap= scrn.getText().toString();
        cap=cap+"3";
        scrn.setText(cap);

    }
    public void btn4 (View v){
        String cap= scrn.getText().toString();
        cap=cap+"4";
        scrn.setText(cap);

    }
    public void btn5 (View v){
        String cap= scrn.getText().toString();
        cap=cap+"5";
        scrn.setText(cap);

    }
    public void btn6 (View v){
        String cap= scrn.getText().toString();
        cap=cap+"6";
        scrn.setText(cap);

    }
    public void btn7 (View v){
        String cap= scrn.getText().toString();
        cap=cap+"7";
        scrn.setText(cap);

    }
    public void btn8 (View v){
        String cap= scrn.getText().toString();
        cap=cap+"8";
        scrn.setText(cap);
    }

    public void btn9 (View v){
        String cap= scrn.getText().toString();
        cap=cap+"9";
        scrn.setText(cap);
    }

    public void btn0 (View v){
        String cap= scrn.getText().toString();
        cap=cap+"0";
        scrn.setText(cap);

    }

    public void punto (View v){
        String cap=scrn.getText().toString();
        cap=cap+".";
        scrn.setText(cap);
    }

    public void parentecis(View v){
        String cap=scrn.getText().toString();
        cap=cap+"( )";
        scrn.setText(cap);
    }

    public void suma(View v){
        try{
            String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("");
        ope=1;
    }

    public void resta(View v){
        try{
            String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("");
        ope=2;
    }
    public void multiplicacion (View v){
        try{
            String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("");
        ope=3;
    }

    public void division (View v){
        try{
            String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("");
        ope=4;
    }

    public void potencia (View v){
        try{
            String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("");
        ope=5;
    }

    public void porcentaje (View v) {
        try{ String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("");
        ope=6;
    }

    public void raiz (View v) {
        try{
            String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText(" v(" +num1+")");
        ope=7;
    }


    public void sin (View v){
        try{ String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("Sin (" +num1+")");
        ope=8;
    }

    public void cos (View v){
        try{
            String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("Cos (" +num1+")");
        ope=9;
    }

    public void tan (View v){
        try{ String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("Tan (" +num1+")");
        ope=10;

    }

    public void csc (View v){
        try{
            String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("Csc (" +num1+")");
        ope=11;
    }

    public void sec (View v){
        try{
            String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("Sec (" +num1+")");
        ope=12;
    }

    public void ctg (View v){
        try{
            String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("Ctg (" +num1+")");
        ope=13;
    }

    public void factorial (View v) {
        try{
            String aux1= scrn.getText().toString();
            num1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        scrn.setText("");
        ope=14;
    }

    public void igual (View v){
        try{
            String aux2= scrn.getText().toString();
            num2= Double.parseDouble(aux2);
        }catch(NumberFormatException nfe){};
        scrn.setText("");

        if (ope==1){
            res=num1+num2;

        }else if (ope==2){
            res=num1-num2;

        }else if (ope==3){
            res=num1*num2;

        }else if (ope==4){
            if(num2==0){
                scrn.setText("No se puede dividir para 0");
            }else{
                res= num1/num2;
            }

        }else if (ope==5){
            res=Math.pow(num1, num2);

        }else if (ope==6){
            res=num2*(num1/100.0);

        }else if (ope==7){
            res=Math.sqrt(num1);

        }else if(ope==8){
            double rad=Math.toRadians(num1);
            res= (Math.sin(rad));

        }else if(ope==9){
            double rad=Math.toRadians(num1);
            res= (Math.cos(rad));

        }else if(ope==10){
            double rad=Math.toRadians(num1);
            res= (Math.tan(rad));

        }else if(ope==11){
            double angulo = (Math.asin(num1));
            res=Math.toDegrees(angulo);

        }else if(ope==12){
            double angulo = (Math.acos(num1));
            res=Math.toDegrees(angulo);

        }else if(ope==13){
            double angulo = (Math.atan(num1));
            res=Math.toDegrees(angulo);

        }else if (ope==14){
            res=1;
            for(double i=num1; i>=1; i--){
                res=res*i;
            }
        }
        scrn.setText(""+res);
        num1=res;
    }

    public void clear (View v){
        scrn.setText("");
        num1=0.0;
        num2=0.0;
        res=0.0;
    }

    public void borrar (View v){
        if (!scrn.getText().toString().equals("")){
            scrn.setText(scrn.getText().subSequence(0,scrn.getText().length()-1)+"");
        }
    }

    public void off (View v){
        finish();
    }
}