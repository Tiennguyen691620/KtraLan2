package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GridItemActivity extends AppCompatActivity {
    ImageView imageView;
    TextView name,gia, nhanxet, giamgia;
    Button thoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);
        name=(TextView) findViewById(R.id.name);
        gia =(TextView) findViewById(R.id.gia);
        giamgia=(TextView) findViewById(R.id.giamgia);
        nhanxet= (TextView)findViewById(R.id.nhanxet);
        imageView=(ImageView)findViewById(R.id.img);
        Intent intent= getIntent();
        name.setText(intent.getStringExtra("name"));
        gia.setText(intent.getStringExtra("gia" ) + " đ");
        giamgia.setText(intent.getStringExtra("giamgia" )+ "%" );
        nhanxet.setText("(" + intent.getStringExtra("danhgia" )+ " xem đánh giá)");

        imageView.setImageResource(intent.getIntExtra("image",0));
        thoat=findViewById(R.id.cancell);
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}