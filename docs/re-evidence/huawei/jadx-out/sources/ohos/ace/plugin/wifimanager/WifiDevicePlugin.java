package ohos.ace.plugin.wifimanager;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes46.dex */
public class WifiDevicePlugin implements WifiBroadcastInterface {
    private static final String WIFI_CONNECTION_CHANGE = "wifiConnectionChange";
    private static final long WIFI_CONNECT_CONNECTED = 1;
    private static final long WIFI_CONNECT_DISCONNECTED = 0;
    private static final String WIFI_STATE_CHANGE = "wifiStateChange";
    private static final long WIFI_SWITCH_ACTIVATING = 2;
    private static final long WIFI_SWITCH_ACTIVE = 1;
    private static final long WIFI_SWITCH_DEACTIVATING = 3;
    private static final long WIFI_SWITCH_NOT_ACTIVE = 0;
    private Context context;
    private WifiDeviceUtils mWifiDeviceUtils;
    private WifiBroadcastReceiver mWifiReceiver;

    protected native void nativeInit();

    protected native void nativeReceiveCallback(String str, long j);

    public WifiDevicePlugin(Context context) {
        if (context == null) {
            Log.e(WifiBroadcastInterface.TAG, " WifiDevicePlugin context is null");
            return;
        }
        this.context = context;
        nativeInit();
        this.mWifiDeviceUtils = new WifiDeviceUtils(context);
        this.mWifiReceiver = new WifiBroadcastReceiver(context, this);
    }

    public String getLinkedInfo() {
        if (this.mWifiDeviceUtils == null) {
            this.mWifiDeviceUtils = new WifiDeviceUtils(this.context);
        }
        if (this.mWifiDeviceUtils.getWifiActive()) {
            return this.mWifiDeviceUtils.getWifiInfo();
        }
        return "";
    }

    public boolean isWifiActive() {
        if (this.mWifiDeviceUtils == null) {
            this.mWifiDeviceUtils = new WifiDeviceUtils(this.context);
        }
        return this.mWifiDeviceUtils.getWifiActive();
    }

    public boolean isConnected() {
        if (this.mWifiDeviceUtils == null) {
            this.mWifiDeviceUtils = new WifiDeviceUtils(this.context);
        }
        try {
            return this.mWifiDeviceUtils.getIsConnected();
        } catch (Exception unused) {
            Log.e(WifiBroadcastInterface.TAG, "getIsConnected exception");
            return false;
        }
    }

    public void on(String str) {
        try {
            if (this.mWifiReceiver == null) {
                this.mWifiReceiver = new WifiBroadcastReceiver(this.context, this);
            }
            if (TextUtils.equals(str, WIFI_STATE_CHANGE)) {
                this.mWifiReceiver.registerSwitchReceiver();
            } else {
                if (TextUtils.equals(str, WIFI_CONNECTION_CHANGE)) {
                    this.mWifiReceiver.registerConnectReceiver();
                    return;
                }
                Log.e(WifiBroadcastInterface.TAG, "on is invalid value: " + str);
            }
        } catch (Exception unused) {
            Log.e(WifiBroadcastInterface.TAG, "on exception");
        }
    }

    public void off(String str) {
        if (this.mWifiReceiver == null) {
            this.mWifiReceiver = new WifiBroadcastReceiver(this.context, this);
        }
        if (TextUtils.equals(str, WIFI_STATE_CHANGE)) {
            this.mWifiReceiver.unRegisterSwitchReceiver();
        } else {
            if (TextUtils.equals(str, WIFI_CONNECTION_CHANGE)) {
                this.mWifiReceiver.unRegisterConnectReceiver();
                return;
            }
            Log.e(WifiBroadcastInterface.TAG, "off is invalid value: " + str);
        }
    }

    @Override // ohos.ace.plugin.wifimanager.WifiBroadcastInterface
    public void wifiSwitchState(int i) {
        if (i == 0) {
            nativeReceiveCallback(WIFI_STATE_CHANGE, 3L);
            return;
        }
        if (i == 1) {
            nativeReceiveCallback(WIFI_STATE_CHANGE, 0L);
            return;
        }
        if (i == 2) {
            nativeReceiveCallback(WIFI_STATE_CHANGE, 2L);
        } else {
            if (i == 3) {
                nativeReceiveCallback(WIFI_STATE_CHANGE, 1L);
                return;
            }
            Log.e(WifiBroadcastInterface.TAG, "WifiDevicePlugins wifiSwitchState invalid parameter state: " + i);
        }
    }

    @Override // ohos.ace.plugin.wifimanager.WifiBroadcastInterface
    public void wifiConnectState(int i) {
        if (i == 0) {
            nativeReceiveCallback(WIFI_CONNECTION_CHANGE, 0L);
        } else {
            if (i == 1) {
                nativeReceiveCallback(WIFI_CONNECTION_CHANGE, 1L);
                return;
            }
            Log.e(WifiBroadcastInterface.TAG, "WifiDevicePlugins wifiConnectState invalid parameter state: " + i);
        }
    }
}
