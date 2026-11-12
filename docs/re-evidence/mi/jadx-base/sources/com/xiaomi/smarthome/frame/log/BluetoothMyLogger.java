package com.xiaomi.smarthome.frame.log;

import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.crypto.Base64Coder;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothMyLogger {
    public static void d(String str) {
        log(str);
    }

    public static void e(String str) {
        log(str);
    }

    public static String getBase64(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!BluetoothContextManager.isReleaseBuild()) {
            return str;
        }
        try {
            return Base64Coder.encodeBytes(str.getBytes("UTF-8"), 24);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getHalfHidePassword(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 4) {
            return "";
        }
        if (!BluetoothContextManager.isReleaseBuild()) {
            return str;
        }
        try {
            return str.substring(0, 2) + "***" + str.substring(str.length() - 2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void i(String str) {
        log(str);
    }

    private static void log(String str) {
        BluetoothService.getBleCoreProvider().writeLogOnAll("core-bluetooth", str);
    }

    public static void v(String str) {
        log(str);
    }

    public static void w(String str) {
        log(str);
    }
}
