package com.miui.tsmclient.common.util;

import android.util.Base64;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.smarthome.framework.api.UserConfig;

/* JADX INFO: loaded from: classes4.dex */
public class Coder {
    private static final String[] HEX_DIGITS = {"0", "1", "2", "3", "4", UserConfig.KEY_DEVICE_LITE_SORT_GROUP, "6", UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, UserConfig.KEY_MI_BRAIN_SETTING, UserConfig.KEY_LITE_SCENE_ORDER, PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR};
    private static final String[] HEX_DIGITS_UPPERCASE = {"0", "1", "2", "3", "4", UserConfig.KEY_DEVICE_LITE_SORT_GROUP, "6", UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, UserConfig.KEY_MI_BRAIN_SETTING, UserConfig.KEY_LITE_SCENE_ORDER, "A", c.f13755a, "C", "D", "E", "F"};

    private Coder() {
    }

    public static String byteArrayToString(byte[] bArr) {
        return byteArrayToString(bArr, false);
    }

    public static String byteToHexString(byte b2) {
        return byteToHexString(b2, false);
    }

    public static final String decodeBase64(String str) {
        return new String(Base64.decode(str, 0));
    }

    public static final byte[] decodeBase64Bytes(String str) {
        return Base64.decode(str, 0);
    }

    public static final byte[] encodeBase64BytesNoWrap(String str) {
        return Base64.encode(str.getBytes(), 2);
    }

    public static final String encodeBase64NoWrap(String str) {
        return Base64.encodeToString(str.getBytes(), 2);
    }

    public static String stringToHexString(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 = str2 + Integer.toHexString(str.charAt(i));
        }
        return str2;
    }

    public static String byteArrayToString(byte[] bArr, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(byteToHexString(b2, z));
        }
        return sb.toString();
    }

    public static String byteToHexString(byte b2, boolean z) {
        int i = b2;
        if (b2 < 0) {
            i = b2 + 256;
        }
        int i2 = i / 16;
        int i3 = i % 16;
        if (z) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = HEX_DIGITS_UPPERCASE;
            sb.append(strArr[i2]);
            sb.append(strArr[i3]);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        String[] strArr2 = HEX_DIGITS;
        sb2.append(strArr2[i2]);
        sb2.append(strArr2[i3]);
        return sb2.toString();
    }

    public static final String encodeBase64NoWrap(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }
}
