package xyz.android.ss06ejemplo03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    private Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragmento1 fragmento1 = new Fragmento1();
        Fragment2 fragmento2 = new Fragment2();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fragmento1);
        btn1 = findViewById(R.id.btnFragmento1);
        btn2 = findViewById(R.id.btnFragmento2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFragmento1:
                Fragmento1 fragmento1 = new Fragmento1();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.contenedor, fragmento1);
                transaction.commit();
                break;
            case R.id.btnFragmento2:
                Fragment2 fragment2 = new Fragment2();
                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.contenedor, fragment2);
                transaction1.commit();
        }
    }
}