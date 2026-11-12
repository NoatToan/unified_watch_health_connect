package com.xiaomi.passport.ui.settings.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.utils.RomUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes11.dex */
public class PermissionUtils {
    private static final String MANUFACTURER = Build.MANUFACTURER.toLowerCase();

    @SuppressLint({"PrivateApi"})
    private static String getModDevice() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.product.mod_device");
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public static void openPermissionSetting(Activity activity, int i) {
        Intent intent;
        String str = MANUFACTURER;
        if (str.contains("xiaomi")) {
            String modDevice = getModDevice();
            if (modDevice == null || modDevice.contains("_global")) {
                intent = null;
            } else {
                intent = new Intent(Constants.ACTION_APP_PERM_EDITOR);
                intent.putExtra(Constants.EXTRA_PKG_NAME, activity.getPackageName());
            }
        } else if (str.contains(RomUtils.HUAWEI) || str.contains(RomUtils.OPPO)) {
            intent = null;
        } else if (str.contains(RomUtils.VIVO)) {
            intent = new Intent();
            intent.putExtra("packagename", activity.getPackageName());
            intent.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"));
        } else {
            if (!str.contains(RomUtils.SAMSUNG) && !str.contains("meizu")) {
                str.contains("smartisan");
            }
            intent = null;
        }
        if (intent != null) {
            try {
                activity.startActivityForResult(intent, i);
            } catch (ActivityNotFoundException | SecurityException unused) {
                intent = null;
            }
        }
        if (intent == null) {
            Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.fromParts("package", activity.getPackageName(), null));
            activity.startActivityForResult(intent2, i);
        }
    }
}
