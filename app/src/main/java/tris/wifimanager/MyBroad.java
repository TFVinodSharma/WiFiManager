package tris.wifimanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Dell on 3/10/2018.
 */

class MyBroad  extends BroadcastReceiver{
    WifiManager manager;

    StringBuffer buf = new StringBuffer();

    @Override
    public void onReceive(Context context, Intent intent) {
       // manager= getAbortBroadcast()
        manager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        List<ScanResult> res = manager.getScanResults();
        for (ScanResult s : res) {
            Toast.makeText(context, "SCANNING", Toast.LENGTH_SHORT).show();
            buf.append(s);
        }
        Toast.makeText(context, "RESULT "+buf.toString(), Toast.LENGTH_SHORT).show();
    }


    }

