package ohos.ace.plugin.wifimanager;

/* JADX INFO: loaded from: classes46.dex */
public interface WifiBroadcastInterface {
    public static final String TAG = "WifiManagerAndroid";
    public static final int WIFI_STATE_DISABLED = 1;
    public static final int WIFI_STATE_DISABLING = 0;
    public static final int WIFI_STATE_DISCONNECT = 0;
    public static final int WIFI_STATE_ENABLED = 3;
    public static final int WIFI_STATE_ENABLING = 2;
    public static final int WIFI_STATE_LINKED = 1;

    void wifiConnectState(int i);

    void wifiSwitchState(int i);
}
