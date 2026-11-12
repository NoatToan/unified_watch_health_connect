package com.baidu.ocr.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.watch.ota.UpdateUtils;
import java.util.UUID;
import org.cybergarage.upnp.device.ST;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceUtil {
    public static String getBuildVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getDeviceId(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("ocr_sdk_uuid", 0);
        String string = sharedPreferences.getString(ST.UUID_DEVICE, "");
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(ST.UUID_DEVICE, string);
            editorEdit.commit();
        }
        return string == null ? "" : string;
    }

    public static String getDeviceInfo(Context context) {
        return "Android#" + getBuildVersion() + UpdateUtils.CMD_FILTER + Build.BRAND + AESEncryptionHelper.SEPARATOR + Build.MODEL + AESEncryptionHelper.SEPARATOR + Build.BOARD + UpdateUtils.CMD_FILTER + getDeviceId(context);
    }

    public static String getVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
