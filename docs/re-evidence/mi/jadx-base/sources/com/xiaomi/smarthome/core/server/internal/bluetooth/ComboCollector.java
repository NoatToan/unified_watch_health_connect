package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes10.dex */
public class ComboCollector extends BluetoothContextManager {
    private static ConcurrentMap<String, String> mAddressMap = new ConcurrentHashMap();
    private static ConcurrentMap<String, Integer> mMacAuthModeMap = new ConcurrentHashMap();

    public static void addCombo(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        BluetoothLog.v(String.format("addCombo: key = %s, mac = %s", str, str2));
        if (mAddressMap.containsKey(str)) {
            return;
        }
        mAddressMap.put(str, str2);
    }

    public static void addComboAuthMode(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BluetoothLog.v(String.format("addComboAuthMode: mac = %s, authMode = %d", str, Integer.valueOf(i)));
        if (mMacAuthModeMap.containsKey(str)) {
            return;
        }
        mMacAuthModeMap.put(str.toUpperCase(), Integer.valueOf(i));
    }

    public static String getAddress(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return mAddressMap.get(str.toUpperCase());
    }

    public static int getAuthMode(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return mMacAuthModeMap.get(str.toUpperCase()).intValue();
    }
}
