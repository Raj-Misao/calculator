package misao.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_add, btn_sub, btn_div, btn_multiply;
    EditText et_num1, et_num2;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_num1 = (EditText)findViewById(R.id.et_num1);
        et_num2 = (EditText)findViewById(R.id.et_num2);

        btn_add = (Button)findViewById(R.id.btn_add);
        btn_sub = (Button)findViewById(R.id.btn_sub);
        btn_div = (Button)findViewById(R.id.btn_div);
        btn_multiply = (Button)findViewById(R.id.btn_multiply);

        btn_add.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int number1 = Integer.parseInt(et_num1.getText().toString());
        int number2 = Integer.parseInt(et_num2.getText().toString());

        switch (view.getId())
        {
            case R.id.btn_add:
                result = number1 + number2;

                break;

            case R.id.btn_sub:
                result = number1 - number2;
                break;

            case R.id.btn_div:
                result = number1 / number2;
                break;

            case R.id.btn_multiply:
                result = number1 * number2;
                break;
        }

        Toast.makeText(getApplicationContext(),""+result,Toast.LENGTH_LONG).show();
    }
}
