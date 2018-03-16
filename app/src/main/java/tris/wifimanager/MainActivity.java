package tris.wifimanager;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
WifiManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=(WifiManager) getApplicationContext()
                .getSystemService(Context.WIFI_SERVICE);
            }

    public void ON(View view) {
        manager.setWifiEnabled(true);
       Toast.makeText(this, "wifi on", Toast.LENGTH_SHORT).show();
    }

    public void OFF(View view) {
        manager.setWifiEnabled(false);
        Toast.makeText(this, "wifi off", Toast.LENGTH_SHORT).show();

    }

    public void SCAN(View view) {
        manager.setWifiEnabled(true);
        registerReceiver(new MyBroad(),new IntentFilter(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION));


    }
}
