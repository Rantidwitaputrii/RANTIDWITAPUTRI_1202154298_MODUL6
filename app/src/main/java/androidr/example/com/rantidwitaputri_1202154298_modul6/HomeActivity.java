package androidr.example.com.rantidwitaputri_1202154298_modul6;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home );
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout); //untuk menambahkan tab

        tabLayout.addTab(tabLayout.newTab().setText("TERBARU")); //tab 1
        tabLayout.addTab(tabLayout.newTab().setText("FOTO SAYA")); //tab 2

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        FloatingActionButton fab = (FloatingActionButton) findViewById( R.id.fab ); //biar ada aksi
        fab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make( view, "Replace with your own action", Snackbar.LENGTH_LONG )
                        .setAction( "Action", null ).show();

            }
        } );

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //biar menu nya ada
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void klik(View view) {

    }

    public void logout(MenuItem item) { //agar menu logout pindah class
        Intent intent = new Intent( HomeActivity.this,MainActivity.class );
        startActivity( intent );
    }
}
