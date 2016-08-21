package xyz.claiger.claigersporftolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(5R.layout.activity_main);
    }

    public void sendMessage(View contentView)
    {
        switch (contentView.getId())

        {
            case R.id.Movies:
                Toast.makeText(this, "Check out the hottest movies!", Toast.LENGTH_LONG).show();
                break;
            case R.id.Capstone:
                Toast.makeText(this, "Character Sheets A'hoy!", Toast.LENGTH_LONG).show();
                break;
            case R.id.Ubiquitous:
                Toast.makeText(this, "Let there be LIGHT!", Toast.LENGTH_LONG).show();
                break;
            case R.id.Material:
                Toast.makeText(this, "Putting it together!", Toast.LENGTH_LONG).show();
                break;
            case R.id.Bigger:
                Toast.makeText(this, "Go BIG or go HOME!", Toast.LENGTH_LONG).show();
                break;
            case R.id.Stock:
                Toast.makeText(this, "What the market's saying!", Toast.LENGTH_LONG).show();
                break;
        }
    }

}
