package com.afernandezcar.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {
    private WebView miVisorWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /*TextView mycontext=(TextView) findViewById(R.id.textClick);
        registerForContextMenu(mycontext);*/


        // casting a la vista a la que aplicamos un menu contextual
        // y la registramos
        WebView mycontext = (WebView) findViewById(R.id.vistaweb);
        registerForContextMenu(mycontext);


        // DENTRO del Oncreate
        // cast al Layout SwipeRefresh con el que rodeamos la vista
        // en el xml y le colocamos un listener
//        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
//        swipeLayout.setOnRefreshListener(mOnRefreshListener);

        //La vista dentro es un webview con permiso para zoom
        miVisorWeb = (WebView) findViewById(R.id.vistaweb);
        //  miVisorWeb.getSettings().setJavaScriptEnabled(true);
        miVisorWeb.getSettings().setBuiltInZoomControls(true);
        miVisorWeb.loadUrl("https://thispersondoesnotexist.com");
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.item1:
                Toast toast1 =Toast.makeText(this, "Item copied", Toast.LENGTH_LONG);
                toast1.show();
                return true;

            case R.id.item2:
                Toast toast2 =Toast.makeText(this, "Downloading item...", Toast.LENGTH_LONG);
                toast2.show();
                return true;

            default:
                return false;

        }
    }
}