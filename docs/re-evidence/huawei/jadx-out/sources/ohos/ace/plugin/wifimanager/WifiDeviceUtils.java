package ohos.ace.plugin.wifimanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class WifiDeviceUtils {
    public static final String NETWORKINFO_TYPE_NAME = "WIFI";
    private Context context;
    private WifiManager mWifiManager;

    public WifiDeviceUtils(Context context) {
        if (context == null) {
            Log.e(WifiBroadcastInterface.TAG, "WifiDeviceUtils context is null");
        } else {
            this.context = context;
            this.mWifiManager = (WifiManager) context.getSystemService("wifi");
        }
    }

    public String getWifiInfo() {
        WifiManager wifiManager = this.mWifiManager;
        if (wifiManager == null) {
            Log.e(WifiBroadcastInterface.TAG, "WifiDeviceUtils getWifiInfo mWifiManager is null");
            return "";
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null) {
            Log.e(WifiBroadcastInterface.TAG, "WifiDeviceUtils getWifiInfo wifiInfo is null");
            return "";
        }
        String ssid = connectionInfo.getSSID();
        if (!TextUtils.isEmpty(ssid) && ssid.contains("\"")) {
            ssid = ssid.replace("\"", "");
        }
        String bssid = connectionInfo.getBSSID();
        int networkId = connectionInfo.getNetworkId();
        int rssi = connectionInfo.getRssi();
        int linkSpeed = connectionInfo.getLinkSpeed();
        int frequency = connectionInfo.getFrequency();
        boolean hiddenSSID = connectionInfo.getHiddenSSID();
        JSONObject jSONObject = new JSONObject();
        if (ssid == null) {
            ssid = "";
        }
        try {
            jSONObject.put("ssid", ssid);
            if (bssid == null) {
                bssid = "";
            }
            jSONObject.put("bssid", bssid);
            jSONObject.put("networkId", networkId);
            jSONObject.put("rssi", rssi);
            jSONObject.put("linkSpeed", linkSpeed);
            jSONObject.put("frequency", frequency);
            jSONObject.put("isHidden", hiddenSSID);
            return jSONObject.toString();
        } catch (JSONException unused) {
            Log.e(WifiBroadcastInterface.TAG, "WifiDeviceUtils getWifiInfo jsonObject.put JSONException");
            return "";
        }
    }

    public boolean getWifiActive() {
        WifiManager wifiManager = this.mWifiManager;
        if (wifiManager != null) {
            return wifiManager.getWifiState() == 3;
        }
        Log.e(WifiBroadcastInterface.TAG, "WifiDeviceUtils mWifiManager is null");
        return false;
    }

    public boolean getIsConnected() {
        Context context = this.context;
        if (context == null) {
            Log.e(WifiBroadcastInterface.TAG, "WifiDeviceUtils getIsConnected context is null");
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            Log.e(WifiBroadcastInterface.TAG, "WifiDeviceUtils getIsConnected connectivityManager is null");
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return false;
        }
        return NETWORKINFO_TYPE_NAME.equals(activeNetworkInfo.getTypeName());
    }
}
