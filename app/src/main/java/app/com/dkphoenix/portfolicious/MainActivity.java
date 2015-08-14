package app.com.dkphoenix.portfolicious;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when the user touches the button
     * Formats a message for a toast
     */
    public void sendMessage(View view) {
        //get the id of the button that was clicked
        int temp = view.getId();
        //build initial message
        String message = "This button will launch my ";

        //change the message sent to the toast based on the ID of the button clicked.
        switch (temp) {
            case R.id.media_streamer:
                toastMessage(message + "Spotify Streamer app.");
                break;

            case R.id.super_duo1:
                toastMessage(message + "Scores app.");
                break;

            case R.id.super_duo2:
                toastMessage(message + "Library app.");
                break;

            case R.id.ant_terminator:
                toastMessage(message + "Build It Bigger app.");
                break;

            case R.id.materialize:
                toastMessage(message + "Bacon Reader app.");
                break;

            case R.id.capstone:
                toastMessage(message + "capstone app.");
                break;
        }
    }

    /**
     * Displays a toast message to the screen
     */
    private void toastMessage(String message) {
        Context context = getApplicationContext();

        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
