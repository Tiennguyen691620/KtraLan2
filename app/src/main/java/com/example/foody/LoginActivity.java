package com.example.foody;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText edtuser , edtpass;
    Button btndangky, btndangnhap;
    Button Btnfb, Btnsdt, Btngoogle;
    String ten,mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangnhap);
        Anhxa();
//        btndangnhap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (edtuser.getText().length()!=0&& edtpass.getText().length()!=0){
//                    if (edtuser.getText().toString().equals())
//                }
//            }
//        });
        btndangky.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(LoginActivity.this);
                dialog.setTitle("HỘP THỌA XỬ LÍ");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.customdialog);
                final EditText edttk=(EditText) dialog.findViewById(R.id.edttk);
                final EditText edtmk=(EditText) dialog.findViewById(R.id.edtmk);
                Button btnhuy=(Button) dialog.findViewById(R.id.btnhuy);
                Button btndongy=(Button) dialog.findViewById(R.id.btndongy);
                btndongy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ten=edttk.getText().toString().trim();
                        mk=edtmk.getText().toString().trim();
                        edtuser.setText(ten);
                        edtpass.setText(mk);
                        dialog.cancel();
                    }
                });
                btnhuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        }));
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtuser.getText().length()!=0&& edtpass.getText().length()!=0) {
                    if (edtuser.getText().toString().equals(ten) && edtpass.getText().toString().equals(mk)) {
                        Toast.makeText(LoginActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, com.example.foody.MainActivity.class);
                        startActivity(intent);
                    }else
                    if (edtuser.getText().toString().equals("thang") && edtpass.getText().toString().equals("010100")) {
                        Toast.makeText(LoginActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, com.example.foody.MainActivity.class);
                       startActivity(intent);
                    } else {
                        Toast.makeText(LoginActivity.this, "Sai mật khẩu hoặc tên đăng nhập", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(LoginActivity.this, "Hảy điền thông tin ", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }

    private void Anhxa() {
        edtuser =(EditText) findViewById(R.id.edittextuser);
        edtpass =(EditText) findViewById(R.id.edittextpass);
        btndangky=(Button) findViewById(R.id.btndangky);
        btndangnhap=(Button) findViewById(R.id.btndangnhap);

    }

}