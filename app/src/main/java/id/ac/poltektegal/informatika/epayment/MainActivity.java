package id.ac.poltektegal.informatika.epayment;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ActionBarDrawerToggle toggle;
    DrawerLayout drawerlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toggle = new ActionBarDrawerToggle(this, drawerlayout, R.string.open, R.string.close);
        toggle.syncState();
        drawerlayout.addDrawerListener(toggle);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigasi);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public boolean onOptionItemSelected(MenuItem item){
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public boolean onNavigationItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.nama :
                Toast.makeText(this, "Nama Dapat Diakses", Toast.LENGTH_SHORT);
                break;
            case R.id.saldo :
                Toast.makeText(this, "saldo Dapat Diakses", Toast.LENGTH_SHORT);
                break;
            case R.id.profil :
                Toast.makeText(this, "Profil Dapat Diakses", Toast.LENGTH_SHORT);
                break;
            case R.id.setting :
                Toast.makeText(this, "Setting Dapat Diakses", Toast.LENGTH_SHORT);
                break;
            case R.id.btn_logout :
                Toast.makeText(this, "Lgout Dapat Diakses", Toast.LENGTH_SHORT);
                break;
        }
        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.menu_utama);
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        return false;
    }
}
