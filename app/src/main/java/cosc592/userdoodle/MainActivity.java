package cosc592.userdoodle;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final static String TAG = "Main";
    private DrawerView myDrawView;
    private int colorCount;
    private ImageView btnRed;
    private int[] color = {0xFF000000, 0xFF000000, 0xFFffffff, 0xFF808080, 0xFFff0000,
            0xFF00ff00, 0xFF0000ff, 0xFFffff00, 0xFFA52A2A, 0xFF8B4513};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDrawView = findViewById(R.id.draw);

        btnRed = findViewById(R.id.color);
        btnRed.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.color:
                colorCount = colorCount % 8 + 1;
                btnRed.setBackgroundColor(color[colorCount]);
                myDrawView.setPathColor(color[colorCount]);
                break;

            default:
                break;
        }
    }


}