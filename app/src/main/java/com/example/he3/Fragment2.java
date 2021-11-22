package com.example.he3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment2 extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void onStart() {
        super.onStart();
        TextView textView = getActivity().findViewById(R.id.t1);
        Button btn = (Button)getActivity().findViewById(R.id.button);
        Button btn2 = (Button)getActivity().findViewById(R.id.button2);
        Button btn3= (Button)getActivity().findViewById(R.id.button4);
        Button btn4 = (Button)getActivity().findViewById(R.id.button5);
        Button btn5 = (Button)getActivity().findViewById(R.id.button6);
        Button btn6 = (Button)getActivity().findViewById(R.id.button7);
        Button btn7 = (Button)getActivity().findViewById(R.id.button8);
        Button btn8 = (Button)getActivity().findViewById(R.id.button9);
        Button btn9 = (Button)getActivity().findViewById(R.id.button10);
        Button btn10 = (Button)getActivity().findViewById(R.id.button11);
        Button btn11 = (Button)getActivity().findViewById(R.id.button12);
        Button btn12 = (Button)getActivity().findViewById(R.id.button13);
        Button btn15= (Button)getActivity().findViewById(R.id.button15);
        Button btn16= (Button)getActivity().findViewById(R.id.button16);
        Button btn17= (Button)getActivity().findViewById(R.id.button17);
        Button btn18= (Button)getActivity().findViewById(R.id.button18);
        Button btn19= (Button)getActivity().findViewById(R.id.button19);
        Button btn20= (Button)getActivity().findViewById(R.id.button20);
        Button btn21= (Button)getActivity().findViewById(R.id.button21);
        Button btn22= (Button)getActivity().findViewById(R.id.button22);
        Button btn23= (Button)getActivity().findViewById(R.id.button23);
        Button btn24= (Button)getActivity().findViewById(R.id.button24);
        Button btn25= (Button)getActivity().findViewById(R.id.button25);
        Button btn26= (Button)getActivity().findViewById(R.id.button26);
        Button btn27= (Button)getActivity().findViewById(R.id.button27);
        Button btn28= (Button)getActivity().findViewById(R.id.button28);
        Button btn29= (Button)getActivity().findViewById(R.id.button29);
        Button btn30= (Button)getActivity().findViewById(R.id.button30);
        Button btn31= (Button)getActivity().findViewById(R.id.button31);
        Button btn32= (Button)getActivity().findViewById(R.id.button32);
        Button btn33= (Button)getActivity().findViewById(R.id.button33);
        Button btn34= (Button)getActivity().findViewById(R.id.button34);
        Button btn35= (Button)getActivity().findViewById(R.id.button35);
        Button btn36= (Button)getActivity().findViewById(R.id.button36);
        Button btn37= (Button)getActivity().findViewById(R.id.button37);
        Button btn38= (Button)getActivity().findViewById(R.id.button38);
        Button btn39= (Button)getActivity().findViewById(R.id.button39);
        Button btn40= (Button)getActivity().findViewById(R.id.button40);
        Button btn41= (Button)getActivity().findViewById(R.id.button41);
        Button btn42= (Button)getActivity().findViewById(R.id.button42);
        Button btn43= (Button)getActivity().findViewById(R.id.button43);
        Button btn44=(Button)getActivity().findViewById(R.id.button00);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText(""+textView.getText() +btn.getText());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn2.getText());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn3.getText());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn4.getText());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn5.getText());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn6.getText());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn7.getText());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn8.getText());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn9.getText());
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn10.getText());
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn11.getText());
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn12.getText());
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn15.getText());
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn16.getText());
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn17.getText());
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn18.getText());
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn19.getText());
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn20.getText());
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn21.getText());
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn22.getText());
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn23.getText());
            }
        });

        btn24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn24.getText());
            }
        });

        btn25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText(String.format("%s%s", textView.getText(), btn25.getText()));
            }
        });

        btn26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText(String.format("%s%s", textView.getText(), btn26.getText()));
            }
        });
        btn27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn27.getText());
            }
        });
        btn28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);
                tv.setText( textView.getText()+ ""+btn28.getText());
            }
        });
        btn29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn29.getText());
            }
        });
        btn30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn30.getText());
            }

        });
        btn31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn31.getText());
            }
        });

        btn32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn32.getText());
            }
        });
        btn33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn33.getText());
            }
        });

        btn34.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn34.getText());
            }
        });

        btn35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn35.getText());
            }
        });
        btn36.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn36.getText());
            }
        });
        btn37.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn37.getText());
            }
        });
        btn38.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn38.getText());
            }
        });

        btn39.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn39.getText());
            }
        });
        btn40.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn40.getText());
            }
        });

        btn41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn41.getText());
            }
        });
        btn42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn42.getText());
            }
        });
        btn43.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn43.getText());
            }
        });

        btn44.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView tv = (TextView) getActivity().findViewById(R.id.t1);

                tv.setText( textView.getText()+ ""+btn44.getText());
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, container, false);
    }
}

