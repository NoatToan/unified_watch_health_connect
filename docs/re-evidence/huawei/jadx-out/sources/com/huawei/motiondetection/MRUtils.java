package com.huawei.motiondetection;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Settings;
import com.huawei.hms.network.embedded.k;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public final class MRUtils {
    private static final Uri HWMOTIONS_CONTENT_URI = Uri.parse("content://com.huawei.providers.motions/hwmotions");
    public static final int MOTION_DETECTION_VERSION_CODE = 81301;
    public static final String MOTION_DETECTION_VERSION_NAME = "8.1.301";
    private static final int MOTION_SERVICE_CONFIG_VERSION_CODE = 81301;

    public static int getMotionDetectionVersionCode() {
        return 81301;
    }

    private MRUtils() {
    }

    public static String localProcess(String str) {
        if (str == null) {
            return "";
        }
        return str.toLowerCase(Locale.getDefault()).trim();
    }

    public static void setMotionEnableState(Context context, String str, int i) {
        if (isMotionServiceConfigurable(context)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(k.g, Integer.valueOf(i));
            context.getContentResolver().update(HWMOTIONS_CONTENT_URI, contentValues, "name='" + str + "'", null);
            return;
        }
        Settings.System.putInt(context.getContentResolver(), str, i);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069 A[Catch: Exception -> 0x006d, TRY_LEAVE, TryCatch #0 {Exception -> 0x006d, blocks: (B:4:0x000b, B:6:0x0031, B:18:0x0069, B:10:0x003a, B:11:0x003d, B:13:0x005f), top: B:25:0x000b }] */
    public static int getMotionEnableState(Context context, String str) {
        int i = -1;
        if (isMotionServiceConfigurable(context)) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = HWMOTIONS_CONTENT_URI;
                int i2 = 1;
                Cursor cursorQuery = contentResolver.query(uri, new String[]{"name"}, "enable=1 and name='" + str + "'", null, null);
                if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    cursorQuery = context.getContentResolver().query(uri, new String[]{"name"}, "enable=0 and name='" + str + "'", null, null);
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        i2 = 0;
                    } else if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
                i = i2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            i = Settings.System.getInt(context.getContentResolver(), str, -1);
        }
        MRLog.d("MRUtils", "getMotionEnableState enabled: " + i);
        return i;
    }

    public static boolean isMotionConfigSupported(Context context, String str) {
        boolean z = false;
        try {
            Cursor cursorQuery = context.getContentResolver().query(HWMOTIONS_CONTENT_URI, new String[]{"name"}, "support=1 and name='" + str + "'", null, null);
            if (cursorQuery != null) {
                z = cursorQuery.getCount() > 0;
                cursorQuery.close();
            }
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }

    public static boolean isServiceRunning(Context context, String str) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        if (runningServices == null) {
            MRLog.d("MRUtils", "isServiceRunning serviceList == null");
            return false;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
            if (runningServiceInfo.process.equals(str) && runningServiceInfo.pid > 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMotionServiceConfigurable(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(MotionConfig.MOTION_SERVICE_PROCESS, 1);
            return packageInfo != null && packageInfo.versionCode >= 81301;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String getMotionDetectionVersionName() {
        return MOTION_DETECTION_VERSION_NAME;
    }
}
