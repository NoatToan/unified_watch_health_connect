package com.huami.watch.companion.IME;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes16.dex */
public class ConnectSettings {
    public static final String ACTION_DEVICE_CONNECTION_CHANGED_IOS = "com.huami.watch.action.DEVICE_CONNECTION_CHANGED_IOS";
    public static final String ACTION_HUAMI_DATASEND_IOS_DIRECT = "com.huami.watch.datasend_ios_direct";
    public static final String ACTION_HUAMI_DATASEND_IOS_MYWATCH = "com.huami.watch.datasend_ios_mywatch";
    public static final String CONN_BLE_CTRL = "com.huami.watch.extra.conn.ctrl";
    public static final String EXTRA_DEVICE_CONNECTION_STATUS = "com.huami.watch.extra.DEVICE_CONNECTION_STATUS";
    public static final String INPUT_CANCEL = "input_cancel";
    public static final String INPUT_REQUEST = "input_request";
    public static final String INPUT_SEND = "input_send";
    public static final String MSG_CONTENT = "msg_content";
    public static final String name = "com.huami.watch.input.IMETransportCmd";

    public static boolean isAndroidConnect(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "com.huami.watch.extra.DEVICE_CONNECTION_STATUS", 0) > 0;
    }

    public static boolean isIosConnected(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "com.huami.watch.extra.conn.ctrl", 0) > 0;
    }

    public static boolean isPhoneConnected(Context context) {
        return isAndroidConnect(context) || isIosConnected(context);
    }
}
