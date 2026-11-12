package com.huawei.watchface.utils.permission;

import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hihealth.dictionary.model.HealthDataMergePolicy;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.c0;
import com.huawei.watchface.s4;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import defpackage.orf;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class PermissionUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30623a = Build.MANUFACTURER.toLowerCase(Locale.ROOT);

    public enum PermissionType {
        STORAGE("STORAGE"),
        LOCATION("LOCATION"),
        LOCATION_WITH_BACKGROUND("LOCATION_WITH_BACKGROUND"),
        STORAGE_LOCATION("STORAGE_LOCATION"),
        MEDIA_VIDEO_IMAGES("MEDIA_VIDEO_IMAGES"),
        MEDIA_AUDIO("MEDIA_AUDIO"),
        CAMERA_IMAGE("CAMERA_IMAGE"),
        NONE(HealthDataMergePolicy.NONE),
        STORAGE_NETWORK_WIFI("STORAGE_NETWORK_WIFI"),
        AUDIO_CALLS("AUDIO_CALLS"),
        PHONE_STATE("PHONE_STATE"),
        READ_CONTACT("READ_CONTACT"),
        READ_WRITE_CONTACT("READ_WRITE_CONTACT"),
        CAMERA("CAMERA"),
        DISTRIBUTED_DATASYNC("DISTRIBUTED_DATASYNC"),
        RECORD_AUDIO("RECORD_AUDIO"),
        CALENDAR("CALENDAR"),
        SCAN("SCAN"),
        AUDIO_LOCATION("AUDIO_LOCATION"),
        MANAGE_EXTERNAL_STORAGE("MANAGE_EXTERNAL_STORAGE");

        private final String permission;

        PermissionType(String str) {
            this.permission = str;
        }

        public String getPermission() {
            return this.permission;
        }
    }

    public static int a(Context context) {
        StringBuilder sb = new StringBuilder("manufacturer = ");
        String str = f30623a;
        sb.append(str);
        sb.append(", api level= ");
        sb.append(Build.VERSION.SDK_INT);
        HwLog.i("PermissionUtil", sb.toString());
        if (str.contains("huawei")) {
            return b(context);
        }
        if (str.contains("xiaomi")) {
            return c(context);
        }
        if (str.contains("oppo")) {
            return d(context);
        }
        if (str.contains("vivo")) {
            return e(context);
        }
        return (str.contains("samsung") || str.contains("meizu")) ? 0 : 2;
    }

    public static int b(Context context) {
        HwLog.i("PermissionUtil", "checkOnEMUI");
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        try {
            Class<?> cls = Class.forName("com.huawei.hsm.permission.PermissionManager");
            Object objInvoke = cls.getDeclaredMethod("canSendBroadcast", Context.class, Intent.class).invoke(cls, context, intent);
            if (objInvoke == null) {
                return 2;
            }
            boolean zBooleanValue = ((Boolean) objInvoke).booleanValue();
            HwLog.i("PermissionUtil", "checkOnEMUI check permission canSendBroadcast invoke result = " + zBooleanValue);
            return zBooleanValue ? 0 : -1;
        } catch (ClassNotFoundException e) {
            e = e;
            HwLog.i("PermissionUtil", "checkOnEMUI error:" + HwLog.printException(e));
            return 2;
        } catch (IllegalAccessException e2) {
            e = e2;
            HwLog.i("PermissionUtil", "checkOnEMUI error:" + HwLog.printException(e));
            return 2;
        } catch (NoSuchMethodException e3) {
            e = e3;
            HwLog.i("PermissionUtil", "checkOnEMUI error:" + HwLog.printException(e));
            return 2;
        } catch (InvocationTargetException e4) {
            e = e4;
            HwLog.i("PermissionUtil", "checkOnEMUI error:" + HwLog.printException(e));
            return 2;
        } catch (Exception e5) {
            HwLog.i("PermissionUtil", "checkOnEMUI unknown error:" + HwLog.printException(e5));
            return 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    public static int c(Context context) {
        byte b2;
        HwLog.i("PermissionUtil", "checkOnMIUI");
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            String packageName = context.getApplicationContext().getPackageName();
            int i = context.getApplicationInfo().uid;
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Object objInvoke = cls.getDeclaredMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, 10017, Integer.valueOf(i), packageName);
            if (objInvoke == null) {
                HwLog.i("PermissionUtil", "checkOnMIUI check permission checkOpNoThrowMethod(AppOpsManager) invoke result is null");
                return 2;
            }
            String string = objInvoke.toString();
            HwLog.i("PermissionUtil", "checkOnMIUI check permission checkOpNoThrowMethod(AppOpsManager) invoke result = " + string);
            int iHashCode = string.hashCode();
            if (iHashCode != 48) {
                if (iHashCode != 49) {
                    if (iHashCode == 53 && string.equals("5")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (string.equals("1")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (string.equals("0")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                return 0;
            }
            if (b2 != 1) {
                return b2 != 2 ? 2 : 1;
            }
            return -1;
        } catch (Exception e) {
            HwLog.i("PermissionUtil", "checkOnMIUI error:" + HwLog.printException(e));
            return 2;
        }
    }

    public static int d(Context context) {
        HwLog.i("PermissionUtil", "checkOnOPPO");
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            HwLog.i("PermissionUtil", "checkOnOPPO contentResolver is null");
            return 2;
        }
        Uri uri = Uri.parse("content://settings/secure/launcher_shortcut_permission_settings");
        if (uri != null && !s4.a(context, uri)) {
            HwLog.i("PermissionUtil", "Uri is not valid");
            return 2;
        }
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
        if (cursorQuery == null) {
            HwLog.i("PermissionUtil", "checkOnOPPO cursor is null");
            return 2;
        }
        try {
            String packageName = context.getApplicationContext().getPackageName();
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                HwLog.i("PermissionUtil", "permission value is " + string);
                if (!TextUtils.isEmpty(string)) {
                    if (string.contains(packageName + ", 1")) {
                        return 0;
                    }
                    if (string.contains(packageName + ", 0")) {
                        return -1;
                    }
                    c0.a(cursorQuery);
                }
            }
            return 2;
        } catch (Exception e) {
            HwLog.e("PermissionUtil", "checkOnOPPO error:" + HwLog.printException(e));
            return 2;
        } finally {
            c0.a(cursorQuery);
        }
    }

    public static int e(Context context) {
        HwLog.i("PermissionUtil", "checkOnVIVO enter");
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            HwLog.i("PermissionUtil", "contentResolver is null");
            return 2;
        }
        try {
            try {
                Uri uri = Uri.parse("content://com.bbk.launcher2.settings/favorites");
                if (uri != null && !s4.a(context, uri)) {
                    HwLog.i("PermissionUtil", "Uri is not valid");
                    c0.a(null);
                    return 2;
                }
                Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
                if (cursorQuery == null) {
                    HwLog.i("PermissionUtil", "checkOnVIVO cursor is null");
                    c0.a(cursorQuery);
                    return 2;
                }
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("title"));
                    HwLog.i("PermissionUtil", "title by query is " + string);
                    if (!TextUtils.isEmpty(string) && string.equals(g(context))) {
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("shortcutPermission"));
                        HwLog.i("PermissionUtil", "permission value is " + i);
                        if (i == 1 || i == 17) {
                            c0.a(cursorQuery);
                            return -1;
                        }
                        if (i == 16) {
                            c0.a(cursorQuery);
                            return 0;
                        }
                        if (i == 18) {
                            c0.a(cursorQuery);
                            return 1;
                        }
                    }
                }
                c0.a(cursorQuery);
                return 2;
            } catch (Exception e) {
                HwLog.e("PermissionUtil", "checkOnVIVO error:" + HwLog.printException(e));
                c0.a(null);
            }
        } catch (Throwable th) {
            c0.a(null);
            throw th;
        }
    }

    public static Intent f(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    public static String g(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getApplicationContext().getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e) {
            HwLog.e("PermissionUtil", "getAppName error:" + HwLog.printException((Exception) e));
            return "";
        } catch (RuntimeException e2) {
            HwLog.e("PermissionUtil", "runtimeException " + HwLog.printException((Exception) e2));
            return "";
        }
    }

    public static Intent i(Context context) {
        Intent intent = new Intent();
        intent.putExtra("packageName", context.getPackageName());
        intent.setClassName("com.oppo.launcher", "com.oppo.launcher.shortcut.ShortcutSettingsActivity");
        if (a(context, intent)) {
            return intent;
        }
        intent.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity"));
        return intent;
    }

    public static boolean isAndroidQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static void j(Context context) {
        Intent intentH;
        String str = f30623a;
        if (str.contains("huawei")) {
            intentH = a();
        } else if (str.contains("xiaomi")) {
            intentH = l(context);
        } else if (str.contains("oppo")) {
            intentH = i(context);
        } else if (str.contains("vivo")) {
            intentH = k(context);
        } else {
            intentH = str.contains("meizu") ? h(context) : f(context);
        }
        try {
            intentH.addFlags(268435456);
            context.startActivity(intentH);
        } catch (Exception e) {
            HwLog.e("PermissionUtil", "start error:" + HwLog.printException(e));
            Intent intentF = f(context);
            intentF.addFlags(268435456);
            orf.a(context, intentF);
        }
    }

    public static Intent k(Context context) {
        Intent intent = new Intent();
        intent.putExtra("packagename", context.getPackageName());
        intent.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"));
        if (a(context, intent)) {
            return intent;
        }
        intent.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity"));
        return intent;
    }

    public static Intent l(Context context) {
        String strB = CommonUtils.b("ro.miui.ui.version.name", (String) null);
        if (TextUtils.isEmpty(strB)) {
            return f(context);
        }
        try {
            int i = Integer.parseInt(SafeString.substring(strB, 1));
            if (i >= 9) {
                return a(context, "com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
            }
            return i >= 7 ? a(context, null, null) : f(context);
        } catch (NumberFormatException e) {
            HwLog.e("PermissionUtil", "Failed to parse MIUI version: " + strB + ", error: " + HwLog.printException((Exception) e));
            return f(context);
        }
    }

    public static Intent h(Context context) {
        return f(context);
    }

    public static Intent a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
        return intent;
    }

    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            intent.setComponent(new ComponentName(str, str2));
        }
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }

    public static boolean a(Context context, Intent intent) {
        return context.getPackageManager().resolveActivity(intent, 65536) != null;
    }
}
