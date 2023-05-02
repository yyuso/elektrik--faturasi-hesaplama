package yusuf.baran.salman.yusufbaransalman601;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import yusuf.baran.salman.yusufbaransalman601.databinding.ActivityMain2Binding;
import yusuf.baran.salman.yusufbaransalman601.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.radioButton.isChecked()){
                    Intent ı = new Intent(getApplicationContext(),MainActivity3.class);
                    Intent i = getIntent();
                    String gelenv = i.getStringExtra("veri1");
                    ı.putExtra("veri1",gelenv);
                    int sayi1 = Integer.parseInt(binding.editTextTextPassword2.getText().toString());
                    int sayi2 = Integer.parseInt(binding.editTextTextPassword3.getText().toString());
                    int toplam1 = sayi1*2;
                    int toplam2 = (sayi2/2)/2;
                    int gtoplam = toplam1+toplam2;
                    String metin = "4 AG TTTZ Mesken";
                    ı.putExtra("sayi1",toplam1);
                    ı.putExtra("sayi2",toplam2);
                    ı.putExtra("gtoplam",gtoplam);
                    ı.putExtra("metin",metin);
                    startActivity(ı);


                }
                else if (binding.radioButton2.isChecked()){
                    Intent ı = new Intent(getApplicationContext(),MainActivity3.class);
                    Intent i = getIntent();
                    String gelenv = i.getStringExtra("veri1");
                    ı.putExtra("veri1",gelenv);
                    int sayi1 = Integer.parseInt(binding.editTextTextPassword2.getText().toString());
                    int sayi2 = Integer.parseInt(binding.editTextTextPassword3.getText().toString());
                    int toplam4 =  sayi1*4;

                    int toplam5 =  (sayi2*4)/2;
                    int gtoplam = toplam4+toplam5;
                    String metin ="4 OG CTCZ Sanayi";
                    ı.putExtra("sayi1",toplam4);
                    ı.putExtra("sayi2",toplam5);
                    ı.putExtra("gtoplam",gtoplam);
                    ı.putExtra("metin",metin);
                    startActivity(ı);


                }
                else {
                    Toast.makeText(MainActivity2.this, "Lütfen Boş Geçmeyiniz", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}