package rizzoli.ifts.com.esercizio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.primo:
                Toast.makeText(this, "Uno sono pochi",Toast.LENGTH_LONG).show();
                break;

            case R.id.secondo:
                Toast.makeText(this, "Tre son tanti",Toast.LENGTH_LONG).show();
                break;

            case R.id.terzo:
                Toast.makeText(this,"Du is megli' che one" ,Toast.LENGTH_LONG).show();
                break;

            case R.id.quarto:
                Intent i=new Intent(this, Immagine.class);
                startActivity(i);

        }
        return false;
    }
}