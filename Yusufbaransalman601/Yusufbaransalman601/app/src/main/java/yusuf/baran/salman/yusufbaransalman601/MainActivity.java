package yusuf.baran.salman.yusufbaransalman601;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import yusuf.baran.salman.yusufbaransalman601.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(binding.editTextTextPassword.getText().toString())){
                    binding.editTextTextPassword.setError("Boş bırakmayınız");
                }
                else{
                    Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                    String veri1 =(binding.editTextTextPassword.getText().toString());
                    i.putExtra("veri1",veri1);
                    startActivity(i);
                }
            }
        });




    }
}