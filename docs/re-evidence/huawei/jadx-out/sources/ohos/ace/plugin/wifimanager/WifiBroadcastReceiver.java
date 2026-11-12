package ohos.ace.plugin.wifimanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* JADX INFO: loaded from: classes46.dex */
public class WifiBroadcastReceiver {
    private Context context;
    private WifiConnectReceiver mWifiConnectReceiver;
    private WifiBroadcastInterface mWifiInterface;
    private WifiSwitchBroadcastReceiver mWifiSwitchReceiver;

    public WifiBroadcastReceiver(Context context, WifiBroadcastInterface wifiBroadcastInterface) {
        this.context = context;
        this.mWifiInterface = wifiBroadcastInterface;
    }

    public void registerConnectReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        WifiConnectReceiver wifiConnectReceiver = new WifiConnectReceiver();
        this.mWifiConnectReceiver = wifiConnectReceiver;
        this.context.registerReceiver(wifiConnectReceiver, intentFilter);
    }

    public void unRegisterConnectReceiver() {
        if (this.mWifiConnectReceiver == null) {
            Log.e(WifiBroadcastInterface.TAG, "mWifiConnectReceiver is null");
        }
        this.context.unregisterReceiver(this.mWifiConnectReceiver);
    }

    class WifiConnectReceiver extends BroadcastReceiver {
        WifiConnectReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (WifiBroadcastReceiver.this.mWifiInterface == null || context == null || intent == null) {
                Log.e(WifiBroadcastInterface.TAG, "WifiConnectReceiver onReceive parameter is null");
                return;
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                Log.e(WifiBroadcastInterface.TAG, "WifiConnectReceiver action is not CONNECTIVITY_ACTION");
                return;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                Log.e(WifiBroadcastInterface.TAG, "WifiConnectReceiver connectivityManager is null");
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                WifiBroadcastReceiver.this.mWifiInterface.wifiConnectState(0);
            } else if (WifiDeviceUtils.NETWORKINFO_TYPE_NAME.equals(activeNetworkInfo.getTypeName())) {
                WifiBroadcastReceiver.this.mWifiInterface.wifiConnectState(1);
            } else {
                WifiBroadcastReceiver.this.mWifiInterface.wifiConnectState(0);
            }
        }
    }

    public void registerSwitchReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        WifiSwitchBroadcastReceiver wifiSwitchBroadcastReceiver = new WifiSwitchBroadcastReceiver();
        this.mWifiSwitchReceiver = wifiSwitchBroadcastReceiver;
        this.context.registerReceiver(wifiSwitchBroadcastReceiver, intentFilter);
    }

    public void unRegisterSwitchReceiver() {
        if (this.mWifiSwitchReceiver == null) {
            Log.e(WifiBroadcastInterface.TAG, "mWifiSwitchReceiver is null");
        }
        this.context.unregisterReceiver(this.mWifiSwitchReceiver);
    }

    class WifiSwitchBroadcastReceiver extends BroadcastReceiver {
        WifiSwitchBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (WifiBroadcastReceiver.this.mWifiInterface != null && context != null && intent != null) {
                WifiBroadcastReceiver.this.mWifiInterface.wifiSwitchState(intent.getIntExtra("wifi_state", 0));
            } else {
                Log.e(WifiBroadcastInterface.TAG, "WifiSwitchBroadcastReceiver onReceive parameter is null");
            }
        }
    }
}
