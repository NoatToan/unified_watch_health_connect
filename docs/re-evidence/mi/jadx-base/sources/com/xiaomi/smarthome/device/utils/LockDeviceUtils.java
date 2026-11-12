package com.xiaomi.smarthome.device.utils;

import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;

/* JADX INFO: loaded from: classes10.dex */
public class LockDeviceUtils {
    public static boolean isBluetoothSecurityChipDevice(String str) {
        return false;
    }

    public static boolean isDeviceSupportEncryptLtmk(String str, String str2) {
        return false;
    }

    public static boolean isLockCanShare(String str) {
        return BluetoothService.getBleCoreProvider().isLockCanShare(str);
    }

    public static boolean isVersionSupportEncryptLtmk(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArrSplit = str.split("[._]");
        if (strArrSplit.length < 2) {
            return false;
        }
        try {
            int iIntValue = Integer.valueOf(strArrSplit[0]).intValue();
            return iIntValue > 2 || (iIntValue == 2 && Integer.valueOf(strArrSplit[1]).intValue() >= 2);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
