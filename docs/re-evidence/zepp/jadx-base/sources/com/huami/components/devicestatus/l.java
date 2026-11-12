package com.huami.components.devicestatus;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
class l {
    public static void a(Activity activity, int i) {
        if (c()) {
            activity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), i);
        }
    }

    public static boolean b() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static boolean c() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return (defaultAdapter == null || defaultAdapter.isEnabled()) ? false : true;
    }
}
