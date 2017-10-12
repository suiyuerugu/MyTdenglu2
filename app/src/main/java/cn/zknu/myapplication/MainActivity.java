package cn.zknu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Person p=new Person

    private EditText etUserName,etPassword;
    private Button btnLogin,btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserName=(EditText)findViewById(R.id.et_user_name);
        etPassword=(EditText)findViewById(R.id.et_password);
        btnLogin=(Button)findViewById(R.id.btn_login);
        btnCancel=(Button)findViewById(R.id.btn_cancel);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });//匿名内部类
        btnCancel.setOnClickListener(this);
    }

    private void login(){
        String strUserName=etUserName.getText().toString();
        String strPassword=etPassword.getText().toString();
        if (strUserName.equals("abc") && strPassword.equals("123")){
            Toast.makeText(this,"登陆成功！",Toast.LENGTH_LONG).show();//Toast显示提示消息
        }else{
            Toast.makeText(this,"用户名或密码错误！",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                login();
                break;
            case R.id.btn_cancel:
                finish();
                break;
        }
    }
}
