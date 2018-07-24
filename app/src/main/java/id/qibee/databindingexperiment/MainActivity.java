package id.qibee.databindingexperiment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import id.qibee.databindingexperiment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding layoutBinding;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    layoutBinding.message.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    layoutBinding.message.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    layoutBinding.message.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layoutBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        layoutBinding.navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
