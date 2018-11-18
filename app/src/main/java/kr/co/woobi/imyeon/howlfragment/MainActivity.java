package kr.co.woobi.imyeon.howlfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout menu1=(LinearLayout)findViewById(R.id.menu1);
        LinearLayout menu2=(LinearLayout)findViewById(R.id.menu2);
        LinearLayout menu3=(LinearLayout)findViewById(R.id.menu3);
        LinearLayout menu4=(LinearLayout)findViewById(R.id.menu4);

        menu1.setOnClickListener(this);
        menu2.setOnClickListener(this);
        menu3.setOnClickListener(this);
        menu4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.menu1:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.animator.enter_anim2,R.animator.exit_anim).replace(R.id.main_frame, new MyFragement()).commit();

                break;
            case R.id.menu2:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.animator.enter_anim2,R.animator.exit_anim).replace(R.id.main_frame, new MyFragement2()).commit();
                break;
            case R.id.menu3:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.animator.enter_anim,R.animator.exit_anim).replace(R.id.main_frame, new MyFragement3()).commit();
                break;
            case R.id.menu4:
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.animator.enter_anim,R.animator.exit_anim).replace(R.id.main_frame, new MyFragement4()).commit();
                break;
        }

    }


}
