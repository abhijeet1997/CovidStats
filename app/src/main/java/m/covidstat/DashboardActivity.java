package m.covidstat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

import m.covidstat.R;

public class DashboardActivity extends AppCompatActivity {

    private CardView statsCard;
    private AppCompatImageView close;
    private CardView volunteerCard, requestCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        setContentView(R.layout.activity_dashboard);

        statsCard = findViewById(R.id.stats_card);
        close = findViewById(R.id.close);
        volunteerCard = findViewById(R.id.volunteer_card);
        requestCard = findViewById(R.id.request_card);

        close.setOnClickListener(v -> finish());

        statsCard.setOnClickListener(v -> startScreen(2));
        requestCard.setOnClickListener(v -> startScreen(3));


        volunteerCard.setOnClickListener(v -> startScreen(4));
    }

    private void startScreen(int num) {
        Intent intent;
        switch (num){
            case 2:
                 intent = new Intent(getApplicationContext(), MainActivity.class);
                 startActivity(intent);
                 break;
            case 4:
                 intent = new Intent(getApplicationContext(), FormActivity.class);
                 startActivity(intent);
                 break;
            case 3:
                intent = new Intent(getApplicationContext(), RequestActivity.class);
                startActivity(intent);
                break;

        }

    }


}
