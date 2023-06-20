package jp.suntech.s22033.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);
        Button btCname = findViewById(R.id.btCname);
        btCname.setOnClickListener(listener);
        Button btCsumai = findViewById(R.id.btCsumai);
        btCsumai.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            EditText input = findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etSumai);
            TextView output = findViewById(R.id.tvOutput);
            int id = v.getId();
            if (id == R.id.btClick) {
                String inputStr = input.getText().toString();
                String inputStr2 = input2.getText().toString();
                output.setText(inputStr2 + "にお住いの" + inputStr + "さん、こんにちは！");
            } else if (id == R.id.btCname) {
                input.setText("");
                output.setText("");
            }else if (id == R.id.btCsumai) {
                input2.setText("");
                output.setText("");
            }
        }
    }
}