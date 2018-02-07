package com.example.awesomefat.csc548_spring2018_numberconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    private TextView bitsTV;
    private TextView kilobitsTV;
    private TextView megabitsTV;
    private TextView gigabitsTV;
    private TextView terabitsTV;

    private TextView bytesTV;
    private TextView kilobytesTV;
    private TextView megabytesTV;
    private TextView gigabytesTV;
    private TextView terabytesTV;

    private EditText mbET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.bitsTV = (TextView) this.findViewById(R.id.bitsTV);
        this.kilobitsTV = (TextView) this.findViewById(R.id.KbTV);
        this.megabitsTV = (TextView) this.findViewById(R.id.MbTV);
        this.gigabitsTV = (TextView) this.findViewById(R.id.GbTV);
        this.terabitsTV = (TextView) this.findViewById(R.id.TbTV);

        this.bytesTV =(TextView) this.findViewById(R.id.BTV);
        this.kilobytesTV = (TextView)this.findViewById(R.id.KBTV);
        this.megabytesTV = (TextView) this.findViewById(R.id.MBTV);
        this.gigabytesTV = (TextView)this.findViewById(R.id.GBTV);
        this.terabytesTV = (TextView) this.findViewById(R.id.TBTV);

        this.mbET = (EditText)this.findViewById(R.id.mbET);
    }

    public void clickMeButtonPressed(View v)
    {
        String sValue = this.mbET.getText().toString();
        //int iValue = Integer.parseInt(sValue);
        Double iValue = Double.valueOf(sValue);

        bitsTV.setText((iValue * 1024 * 1024 * 8) + " bits");
        kilobitsTV.setText((iValue * 1024 * 8) + " Kb");
        megabitsTV.setText((iValue * 8) + " Mb");
        gigabitsTV.setText(String.format("%.7f", (iValue / 1024) * 8) + " Gb");
        terabitsTV.setText(String.format("%.7f", ((iValue / 1024) / 1024) * 8) + " Tb");

        bytesTV.setText((iValue * 1024 * 1024) + " Bytes");
        kilobytesTV.setText((iValue * 1024) + " KB");
        megabytesTV.setText(iValue + " MB");
        gigabytesTV.setText(String.format("%.7f",(iValue / 1024)) + " GB");
        terabytesTV.setText(String.format("%.7f", (iValue / 1024) / 1024) + " TB");

    }
}
