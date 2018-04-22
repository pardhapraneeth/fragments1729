package praneeth.com.fragments1729;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fragment1=(Button)findViewById(R.id.button);
        Button fragment2=(Button)findViewById(R.id.button2);

        loadFragment(new fragmentOne());

        fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new fragmentOne());
            }

        });

        fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment1(new fragmentTwo());
            }
        });
    }



    public void loadFragment(Fragment fragment){

        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction transaction= fragmentManager.beginTransaction();
        transaction.add(R.id.frame1,fragment);
        transaction.commit();

    }

    public void loadFragment1(Fragment fragment1){

        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction transaction= fragmentManager.beginTransaction();
        transaction.add(R.id.frame1,fragment1);
        transaction.commit();

    }







}
