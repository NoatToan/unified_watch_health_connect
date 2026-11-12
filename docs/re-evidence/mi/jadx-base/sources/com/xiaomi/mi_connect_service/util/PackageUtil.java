package com.xiaomi.mi_connect_service.util;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PackageUtil {
    private static final String TAG = "PackkageUtil";

    public static boolean checkAllAndroidPermission(Context context, String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        if (strArr != null && strArr.length > 0) {
            for (String str2 : strArr) {
                if (packageManager.checkPermission(str2, str) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkAndroidPermission(Context context, String str, String str2) {
        return TextUtils.isEmpty(str) || context.getPackageManager().checkPermission(str2, str) == 0;
    }

    public static final boolean checkAnyAndroidPermission(Context context, String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        if (strArr != null && strArr.length > 0) {
            for (String str2 : strArr) {
                if (packageManager.checkPermission(str2, str) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkPackageInstalled(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Exception e) {
            e.printStackTrace();
            LogUtil.e(TAG, e.getMessage(), new Object[0]);
            return false;
        }
    }

    public static String getCallingPackage(Context context, int i, int i2) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && packagesForUid.length == 1) {
            return packagesForUid[0];
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.size() <= 0) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == i2) {
                String[] strArr = runningAppProcessInfo.pkgList;
                if (strArr == null || strArr.length <= 0) {
                    return runningAppProcessInfo.processName;
                }
                LogUtil.d(TAG, "pkg " + runningAppProcessInfo.pkgList[0], new Object[0]);
                return runningAppProcessInfo.pkgList[0];
            }
        }
        return null;
    }

    public static final String getForegroundApp(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
        return (runningTasks == null || runningTasks.size() == 0) ? "" : activityManager.getRunningTasks(1).get(0).topActivity.getPackageName();
    }

    public static final ComponentName getForegroundComponet(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
        if (runningTasks == null || runningTasks.size() == 0) {
            return null;
        }
        return activityManager.getRunningTasks(1).get(0).topActivity;
    }

    public static String getPackageByPid(Context context, int i) {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == i) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static String getPackageSha1(Context context, String str) {
        try {
            Signature[] apkContentsSigners = Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(str, 134217728).signingInfo.getApkContentsSigners() : context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (apkContentsSigners == null || apkContentsSigners.length <= 0) {
                return null;
            }
            byte[] byteArray = apkContentsSigners[0].toByteArray();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            if (messageDigest == null) {
                return null;
            }
            byte[] bArrDigest = messageDigest.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append("0");
                }
                sb.append(hexString);
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1);
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.e(TAG, "", e);
            return null;
        } catch (RuntimeException e2) {
            LogUtil.e(TAG, "", e2);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            LogUtil.e(TAG, "", e3);
            return null;
        }
    }

    public static String[] getPackagesByUid(Context context, int i) {
        return context.getPackageManager().getPackagesForUid(i);
    }

    public static int getPidByPackage(Context context, String str) {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getRunningAppProcesses()) {
            if (str.equals(runningAppProcessInfo.processName)) {
                return runningAppProcessInfo.pid;
            }
        }
        return -1;
    }

    public static int getUidByPackage(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public static String getUidSha1(Context context, int i) {
        String[] packagesByUid = getPackagesByUid(context, i);
        if (packagesByUid == null || packagesByUid.length <= 0) {
            return null;
        }
        return getPackageSha1(context, packagesByUid[0]);
    }

    public static boolean checkAndroidPermission(Context context, int i, int i2, String str) {
        return i2 == 0 || i == 0 || context.checkPermission(str, i2, i) == 0;
    }
}
