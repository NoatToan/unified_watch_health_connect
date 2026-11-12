package ohos.ace.plugin.notificationmanager;

import android.app.Notification;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes46.dex */
public class BadgeUtils {
    private static final String TAG = "BadgeUtils";

    public static void setBadgeNumber(Context context, int i, Notification notification) {
        if (context == null) {
            return;
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        Log.d(TAG, "manufacturer:" + lowerCase);
        if (lowerCase.contains("xiaomi")) {
            setXiaoMiBadge(i, context, notification);
        } else {
            setBadgeNumber(context, i);
        }
    }

    public static void setBadgeNumber(Context context, int i) {
        if (context == null) {
            return;
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        if (lowerCase.contains("huawei") || lowerCase.contains("honor")) {
            setHWOrHonorBadge(i, context);
            return;
        }
        if (lowerCase.contains("samsung")) {
            setSamsungBadge(i, context);
            return;
        }
        if (lowerCase.contains("oppo")) {
            setOPPOBadge(i, context);
        } else if (lowerCase.contains("vivo")) {
            setVivoBadge(i, context);
        } else {
            Log.d(TAG, "other phone");
            setBadgeCount(i, context);
        }
    }

    private static void setBadgeCount(int i, Context context) {
        try {
            Uri uri = Uri.parse("content://com.android.badge/badge");
            ContentValues contentValues = new ContentValues();
            contentValues.put("package", context.getPackageName());
            contentValues.put("class", getLauncherClassName(context));
            contentValues.put("badgecount", Integer.valueOf(i));
            context.getContentResolver().update(uri, contentValues, null, null);
        } catch (RuntimeException unused) {
            Log.e(TAG, "setBadgeCount except");
        }
    }

    private static void setXiaoMiBadge(int i, Context context, Notification notification) {
        if (notification == null) {
            return;
        }
        try {
            Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
            obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (SecurityException e5) {
            e5.printStackTrace();
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
        }
    }

    private static void setHWOrHonorBadge(int i, Context context) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName());
            bundle.putInt("badgenumber", i);
            context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
        } catch (RuntimeException unused) {
            Log.e(TAG, "setBadgeCount except");
        }
    }

    private static void setSamsungBadge(int i, Context context) {
        String launcherClassName = getLauncherClassName(context);
        if (TextUtils.isEmpty(launcherClassName)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", context.getPackageName());
        intent.putExtra("badge_count_class_name", launcherClassName);
        context.sendBroadcast(intent);
    }

    private static void setOPPOBadge(int i, Context context) {
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            context.sendBroadcast(intent);
        } else {
            setAppBadgeCount(i, context);
        }
    }

    private static void setAppBadgeCount(int i, Context context) {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", String.valueOf(i), bundle);
        } catch (RuntimeException unused) {
            Log.e(TAG, "setAppBadgeCount except");
        }
    }

    private static void setVivoBadge(int i, Context context) {
        String launcherClassName = getLauncherClassName(context);
        if (TextUtils.isEmpty(launcherClassName)) {
            return;
        }
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", launcherClassName);
        intent.putExtra("notificationNum", i);
        context.sendBroadcast(intent);
    }

    private static String getLauncherClassName(Context context) {
        ComponentName launcherComponentName = getLauncherComponentName(context);
        if (launcherComponentName == null) {
            return "";
        }
        return launcherComponentName.getClassName();
    }

    private static ComponentName getLauncherComponentName(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            return launchIntentForPackage.getComponent();
        }
        return null;
    }
}
