package com.xiaomi.smarthome.library.deviceId;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.xiaomi.smarthome.library.securecompact.SettingsSecureCompat;
import defpackage.ni4;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceIdCompat {
    private static final String SPFS_UUID = "spfs_uuid";
    private static final String SPFS_UUID_KEY = "spfs_uuid_key";
    private static final String TAG = "DeviceIdCompat";
    private static String sDeviceId = "";

    private DeviceIdCompat() {
    }

    @SuppressLint({"MissingPermission"})
    private static String getCompatId(Context context) {
        String serial;
        try {
            if (Build.VERSION.SDK_INT <= 28 && ni4.a(context, "android.permission.READ_PHONE_STATE") == 0) {
                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                if (isValidId(deviceId)) {
                    return UUID.nameUUIDFromBytes(deviceId.getBytes()).toString();
                }
            }
        } catch (Exception unused) {
        }
        String str = "35" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.DISPLAY.length() % 10) + (Build.HOST.length() % 10) + (Build.ID.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10) + (Build.TAGS.length() % 10) + (Build.TYPE.length() % 10) + (Build.USER.length() % 10);
        try {
            serial = Build.getSerial();
        } catch (Exception unused2) {
            serial = "serial";
        }
        return new UUID(str.hashCode(), serial.hashCode()).toString();
    }

    public static String getDeviceId(Context context) {
        if (isValidId(sDeviceId)) {
            return sDeviceId;
        }
        String deviceIdFromSpfs = getDeviceIdFromSpfs(context);
        if (isValidId(deviceIdFromSpfs)) {
            sDeviceId = deviceIdFromSpfs;
            return deviceIdFromSpfs;
        }
        String oaid = IdentifierManager.getOAID(context);
        if (!isValidId(oaid)) {
            oaid = SettingsSecureCompat.getAndroidId();
        }
        if (!isValidId(oaid)) {
            oaid = getCompatId(context);
        }
        sDeviceId = oaid;
        saveDeviceIdToSpfs(context, oaid);
        return sDeviceId;
    }

    private static String getDeviceIdFromSpfs(Context context) {
        return context.getSharedPreferences(SPFS_UUID, 0).getString(SPFS_UUID_KEY, "");
    }

    private static boolean isValidId(String str) {
        return (TextUtils.isEmpty(str) || "unknow".equalsIgnoreCase(str) || AbstractJsonLexerKt.NULL.equalsIgnoreCase(str)) ? false : true;
    }

    private static void saveDeviceIdToSpfs(Context context, String str) {
        context.getSharedPreferences(SPFS_UUID, 0).edit().putString(SPFS_UUID_KEY, str).commit();
    }
}
