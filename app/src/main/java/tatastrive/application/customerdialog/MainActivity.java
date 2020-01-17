package tatastrive.application.customerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        button=findViewById( R.id.buttonShowCustomDialog );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog( context );
                dialog.setContentView( R.layout.activity_custom_custom_alert );
                Button dialogButton = (Button) dialog.findViewById( R.id.dialogButtonOK );
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        //startActivity( new Intent( CustomAlertActivty.this, ExpandedListViewActivity.class ) );
                        Toast.makeText( getApplicationContext(), "Dismissed..!!", Toast.LENGTH_SHORT ).show();
                    }
                } );
                dialog.show();
            }
            });
    }


    public void exit(View view) {
    }
}

