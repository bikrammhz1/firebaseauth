package com.rbmhz.volunteer.dashboard;
import android.os.Bundle;
import android.widget.Button;
import com.rbmhz.volunteer.BaseActivity;
import com.rbmhz.volunteer.R;

public class MainActivity extends BaseActivity {

    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        handlingUI();
    }

    private void initUI() {
        btnLogout = findViewById(R.id.btn_logout);
    }

    private void handlingUI() {
        btnLogout.setOnClickListener(v -> {
            logout();
        });
    }
}