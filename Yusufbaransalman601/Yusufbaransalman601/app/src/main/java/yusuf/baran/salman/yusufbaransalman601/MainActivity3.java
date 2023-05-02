package yusuf.baran.salman.yusufbaransalman601;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import yusuf.baran.salman.yusufbaransalman601.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {
private ActivityMain3Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent g = getIntent();
        String gveri1 =g.getStringExtra("metin");
        String gveri2 =g.getStringExtra("veri1");
        String gveri3 =g.getStringExtra("sayi1");
        String gveri4 =g.getStringExtra("sayi2");
        String gtoplam =g.getStringExtra("gtoplam");

        binding.textView15.setText(gveri1);
        binding.textView16.setText(gveri2);
        binding.textView26.setText(gveri3);
        binding.textView25.setText(gveri4);
        binding.textView23.setText(gtoplam);

    }
}