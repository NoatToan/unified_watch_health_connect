package com.huami.watch.wifi;

import android.util.Log;
import com.huami.watch.ota.cloud.RomInfo;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;

/* JADX INFO: loaded from: classes11.dex */
public class WifiTransportHandler {
    public static final String ACTION_ADD_EAP_WIFI = "add_wifi_eap";
    public static final String ACTION_ADD_WIFI = "add_wifi_ssid";
    public static final String ACTION_CANCEL_SLIENT_UPDATE = "cancel_slient_update";
    public static final String ACTION_CANCEL_WIFI_ADD = "cancel_wifi_add";
    public static final String ACTION_CANCEL_WIFI_PASSWORD = "cancel_wifi_password";
    public static final String ACTION_CHECK_UPDATE = "check_update";
    public static final String ACTION_PHONE_WIFI_DISCONNECT = "phone_wifi_disconnect";
    public static final String ACTION_SEND_PASSWORD = "send_password";
    public static final String ACTION_SEND_RESULT = "send_result";
    public static final String ACTION_SEND_ROM_INFO = "send_rom_info";
    public static final String ACTION_SEND_SSID = "send_ssid";
    public static final String ACTION_SEND_WIFI_INFO = "send_wifi_info";
    public static final String ACTION_UPDATE_WIFI_STATE = "update_wifi_state";
    public static final String ACTION_WATCH_START_RECOVERY = "watch_start_recovery";
    public static final String PASSWORD_VALUE = "password_value";
    public static final int RESULT_CONNECT_FAILED = 3;
    public static final int RESULT_CONNECT_SUCCESS = 2;
    public static final int RESULT_NONE = 0;
    public static final int RESULT_PASSWORD_ERROR = 1;
    public static final String RESULT_VALUE = "result_value";
    public static final String ROM_VALUE = "rom_value";
    public static final String SSID_VALUE = "ssid_value";
    public static final String TAG = "WifiHandler";
    public static final String WIFI_TIPS = "wifi_tips";
    public static final String WIFI_TYPE_INFO = "wifi_type_info";

    public static TransportDataItem BuildAddEapWifi(String str, String str2) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(SSID_VALUE, str2);
        transportDataItem.setData(dataBundle);
        transportDataItem.addAction(ACTION_ADD_EAP_WIFI);
        return transportDataItem;
    }

    public static TransportDataItem BuildAddWifi(String str) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        transportDataItem.setData(new DataBundle());
        transportDataItem.addAction(ACTION_ADD_WIFI);
        return transportDataItem;
    }

    public static TransportDataItem BuildCancelSlientUpdate(String str) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        transportDataItem.setData(new DataBundle());
        transportDataItem.addAction(ACTION_CANCEL_SLIENT_UPDATE);
        return transportDataItem;
    }

    public static TransportDataItem BuildCancelWifiItemAdd(String str) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        transportDataItem.setData(new DataBundle());
        transportDataItem.addAction(ACTION_CANCEL_WIFI_ADD);
        return transportDataItem;
    }

    public static TransportDataItem BuildCancelWifiPassword(String str) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        transportDataItem.setData(new DataBundle());
        transportDataItem.addAction(ACTION_CANCEL_WIFI_PASSWORD);
        return transportDataItem;
    }

    public static TransportDataItem BuildCheckUpdate(String str) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        transportDataItem.setData(new DataBundle());
        transportDataItem.addAction(ACTION_CHECK_UPDATE);
        return transportDataItem;
    }

    public static TransportDataItem BuildPhoneWifiDisconnect(String str) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        transportDataItem.setData(new DataBundle());
        transportDataItem.addAction(ACTION_PHONE_WIFI_DISCONNECT);
        return transportDataItem;
    }

    public static TransportDataItem BuildSendPasswordHandler(String str, String str2, String str3) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        WifiInfo wifiInfo = new WifiInfo(str2, str3);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putParcelable(PASSWORD_VALUE, wifiInfo);
        transportDataItem.setData(dataBundle);
        transportDataItem.addAction(ACTION_SEND_PASSWORD);
        return transportDataItem;
    }

    public static TransportDataItem BuildSendResultItem(String str, int i) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putInt(RESULT_VALUE, i);
        transportDataItem.setData(dataBundle);
        transportDataItem.addAction(ACTION_SEND_RESULT);
        return transportDataItem;
    }

    public static TransportDataItem BuildSendRomInfo(String str, RomInfo romInfo) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putParcelable(ROM_VALUE, romInfo);
        transportDataItem.setData(dataBundle);
        transportDataItem.addAction(ACTION_SEND_ROM_INFO);
        return transportDataItem;
    }

    public static TransportDataItem BuildSendSsidHandler(String str, String str2) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        WifiInfo wifiInfo = new WifiInfo(str2, "");
        DataBundle dataBundle = new DataBundle();
        dataBundle.putParcelable(SSID_VALUE, wifiInfo);
        transportDataItem.setData(dataBundle);
        transportDataItem.addAction(ACTION_SEND_SSID);
        return transportDataItem;
    }

    public static TransportDataItem BuildSendWifiTypeInfo(String str, WifiTypeInfo wifiTypeInfo) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putParcelable(WIFI_TYPE_INFO, wifiTypeInfo);
        transportDataItem.setData(dataBundle);
        transportDataItem.addAction(ACTION_SEND_WIFI_INFO);
        return transportDataItem;
    }

    public static TransportDataItem BuildUpdateWifiInfo(String str, String str2) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(WIFI_TIPS, str2);
        transportDataItem.setData(dataBundle);
        transportDataItem.addAction(ACTION_UPDATE_WIFI_STATE);
        return transportDataItem;
    }

    public static TransportDataItem BuildWatchStartRecovery(String str) {
        TransportDataItem transportDataItem = new TransportDataItem(str);
        transportDataItem.setData(new DataBundle());
        transportDataItem.addAction(ACTION_WATCH_START_RECOVERY);
        return transportDataItem;
    }

    public static WifiInfo OnSendPasswordHandler(TransportDataItem transportDataItem) {
        return (WifiInfo) transportDataItem.getData().getParcelable(PASSWORD_VALUE);
    }

    public static int OnSendResultHandler(TransportDataItem transportDataItem) {
        return transportDataItem.getData().getInt(RESULT_VALUE);
    }

    public static WifiInfo OnSendSsidHandler(TransportDataItem transportDataItem) {
        return (WifiInfo) transportDataItem.getData().getParcelable(SSID_VALUE);
    }

    public static WifiTypeInfo OnSendWifiTypeInfo(TransportDataItem transportDataItem) {
        return (WifiTypeInfo) transportDataItem.getData().getParcelable(WIFI_TYPE_INFO);
    }

    public static String onAddEapWifi(TransportDataItem transportDataItem) {
        String string = transportDataItem.getData().getString(SSID_VALUE);
        Log.i(TAG, "EAP wifi ssid : " + string);
        return string;
    }

    public static RomInfo onSendRomInfoHandler(TransportDataItem transportDataItem) {
        RomInfo romInfo = (RomInfo) transportDataItem.getData().getParcelable(ROM_VALUE);
        if (romInfo == null) {
            Log.d(TAG, "receive ROM info : null ");
        }
        return romInfo;
    }

    public static String onUpdateWifiInfoHandler(TransportDataItem transportDataItem) {
        String string = transportDataItem.getData().getString(WIFI_TIPS);
        Log.d(TAG, "wifi  tips : " + string);
        return string;
    }
}
