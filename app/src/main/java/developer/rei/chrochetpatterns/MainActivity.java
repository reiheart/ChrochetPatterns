package developer.rei.chrochetpatterns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTemp = (Button) findViewById(R.id.buttonTemp);
        buttonTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent patternIntent = createIntent(PatternActivity.class);
                startActivity(patternIntent);
            }
        });
    }

    protected Intent createIntent(Class<?> cls) {
        return new Intent(this, cls);
    }
}
