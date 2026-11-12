package com.huami.watch.companion.notification;

import android.app.Notification;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.facebook.internal.ServerProtocol;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.notification.bean.MiPushNotificationData;
import com.huami.watch.notification.data.MiPushSupport;
import com.huami.watch.notification.data.NotificationData;
import com.huami.watch.notification.data.NotificationKeyData;
import com.huami.watch.notification.data.StatusBarNotificationData;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.NotificationBuilder;
import com.huami.watch.util.Rx;
import com.huami.watch.util.StringUtil;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationUtil {
    private static final String a = "Noti-Util";
    private static final String b = "com.tencent.mobileqq";
    private static final String c = "com.tencent.qqlite";
    private static final String d = "com.tencent.tim";
    private static final String e = "com.tencent.mm";
    private static final String f = "com.eg.android.AlipayGphone";
    private static final String g = "com.sina.weibo";
    private static final String h = "jp.naver.line.android";

    public static final class NLS {

        public class a implements Runnable {
            public final /* synthetic */ Context a;
            public final /* synthetic */ ComponentName b;

            public a(Context context, ComponentName componentName) {
                this.a = context;
                this.b = componentName;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(NotificationUtil.a, "Enable NLS!!", new Object[0]);
                try {
                    this.a.getPackageManager().setComponentEnabledSetting(this.b, 1, 1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ Context a;

            public b(Context context) {
                this.a = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                NLS.refreshNLS(this.a);
            }
        }

        public static boolean a(Context context) {
            if (Build.VERSION.SDK_INT < 20) {
                return ((PowerManager) context.getSystemService("power")).isScreenOn();
            }
            boolean z = false;
            for (Display display : ((DisplayManager) context.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY)).getDisplays()) {
                if (display.getState() == 2) {
                    z = true;
                }
            }
            return z;
        }

        public static boolean b(Context context) {
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            boolean z = !TextUtils.isEmpty(string) && string.contains(context.getApplicationContext().getPackageName());
            Log.d(NotificationUtil.a, "IsSystemNLSPermissionEnabled : " + z, new Object[0]);
            return z;
        }

        public static void c(Context context) {
            try {
                context.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }

        public static void checkNLSPermission(Context context) {
            if (b(context)) {
                return;
            }
            c(context);
        }

        public static void delayRefreshNLS(Context context) {
            if (NotificationManager.getManager(context).isUserON()) {
                Log.d(NotificationUtil.a, "Refresh NLS Start...", new Object[0]);
                Rx.delayMainThread(new b(context), 3L, TimeUnit.SECONDS);
            }
        }

        public static void refreshNLS(Context context) {
            ComponentName componentName = new ComponentName(context, "com.xiaomi.hm.health.ui.smartplay.NotificationAccessService");
            Log.d(NotificationUtil.a, "Disable NLS!!", new Object[0]);
            try {
                context.getPackageManager().setComponentEnabledSetting(componentName, 2, 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Rx.delayMainThread(new a(context, componentName), 500L, TimeUnit.MILLISECONDS);
        }
    }

    public static final class a {
        private static final String a = "[微信红包]";
        private static final String b = "[QQ红包]";
        private static final String c = "一个红包";
        private static final String d = "你收到了一个微博红包";

        private static boolean a(String str, String str2) {
            return (!NotificationUtil.d(str) || TextUtils.isEmpty(str2) || !str2.contains(c) || str2.contains(":") || str2.contains("：")) ? false : true;
        }

        public static boolean b(String str, StatusBarNotification statusBarNotification) {
            Bundle extras;
            Notification notification = statusBarNotification.getNotification();
            if (notification == null || (extras = NotificationCompat.getExtras(notification)) == null) {
                return false;
            }
            return c(str, StringUtil.toString(extras.getCharSequence(NotificationCompat.EXTRA_TEXT)));
        }

        public static boolean c(String str, String str2) {
            return e(str, str2) || d(str, str2) || a(str, str2);
        }

        private static boolean d(String str, String str2) {
            return NotificationUtil.f(str) && !TextUtils.isEmpty(str2) && str2.contains(b);
        }

        private static boolean e(String str, String str2) {
            return NotificationUtil.i(str) && !TextUtils.isEmpty(str2) && str2.contains(a);
        }

        private static boolean f(String str, String str2) {
            return (!NotificationUtil.j(str) || TextUtils.isEmpty(str2) || !str2.contains(d) || str2.contains(":") || str2.contains("：")) ? false : true;
        }

        public static StatusBarNotificationData g(StatusBarNotificationData statusBarNotificationData) {
            statusBarNotificationData.pkg += ".hmhb";
            return statusBarNotificationData;
        }
    }

    public static boolean c(Context context, NotificationManager notificationManager, StatusBarNotification statusBarNotification) {
        String packageName = statusBarNotification.getPackageName();
        if ((!statusBarNotification.isClearable() && !f(packageName) && !h(packageName)) || notificationManager == null) {
            return true;
        }
        boolean zIsUserON = notificationManager.isUserON();
        boolean z = (!notificationManager.isWatchNoDisturbON() || DeviceUtil.isCurrentXihuSeries(context) || DeviceManager.getManager(context).isCurrentDeviceBLE()) ? false : true;
        if (!zIsUserON || z) {
            return true;
        }
        String strK = k(statusBarNotification);
        Notification notification = statusBarNotification.getNotification();
        if (notificationManager.isAppFiltered(strK, null, true)) {
            return true;
        }
        if (a.b(strK, statusBarNotification)) {
            return false;
        }
        if (notificationManager.isKeywordFilter(strK, getContents(statusBarNotification.getNotification())) && Config.isLocaleChina(context)) {
            return true;
        }
        if (isSummaryGroup(statusBarNotification) && e(packageName)) {
            return true;
        }
        return (notification.flags & NotificationBuilder.FLAG_NOT_TO_WATCH) == -1879048192 && g(context, strK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(String str) {
        return "com.eg.android.AlipayGphone".equalsIgnoreCase(str);
    }

    private static boolean e(String str) {
        return "jp.naver.line.android".equalsIgnoreCase(str);
    }

    public static boolean f(String str) {
        return "com.tencent.mobileqq".equalsIgnoreCase(str) || "com.tencent.qqlite".equalsIgnoreCase(str);
    }

    public static boolean g(Context context, String str) {
        boolean zIsSelf = AppUtil.isSelf(context, str);
        Log.d(a, str + ", IsFromSelf : " + zIsSelf, new Object[0]);
        return zIsSelf;
    }

    public static StatusBarNotificationData generateStatusBarData(Context context, MiPushNotificationData miPushNotificationData) {
        String packageName = context.getPackageName();
        int id = miPushNotificationData.getId();
        String str = "0|" + packageName + AESEncryptionHelper.SEPARATOR + id + AESEncryptionHelper.SEPARATOR + ((Object) null) + AESEncryptionHelper.SEPARATOR + AppUtil.getUID(context, packageName);
        StatusBarNotificationData statusBarNotificationDataEmpty = StatusBarNotificationData.empty();
        statusBarNotificationDataEmpty.pkg = packageName;
        statusBarNotificationDataEmpty.id = id;
        statusBarNotificationDataEmpty.key = str;
        statusBarNotificationDataEmpty.groupKey = str;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentTitle(miPushNotificationData.getTitle());
        builder.setContentText(miPushNotificationData.getText());
        statusBarNotificationDataEmpty.notification = NotificationData.from(context, NotificationKeyData.from(packageName, id, null, str, null), builder.build(), false);
        return statusBarNotificationDataEmpty;
    }

    @NonNull
    public static String[] getContents(Notification notification) {
        String[] strArr = new String[3];
        if (notification == null) {
            return strArr;
        }
        Bundle extras = NotificationCompat.getExtras(notification);
        String string = StringUtil.toString(extras.getCharSequence(NotificationCompat.EXTRA_TITLE));
        String string2 = StringUtil.toString(extras.getCharSequence(NotificationCompat.EXTRA_TEXT));
        String string3 = StringUtil.toString(extras.getCharSequence(NotificationCompat.EXTRA_INFO_TEXT));
        strArr[0] = string;
        strArr[1] = string2;
        strArr[2] = string3;
        return strArr;
    }

    public static String getKey(StatusBarNotification statusBarNotification) {
        return statusBarNotification.getPackageName() + AESEncryptionHelper.SEPARATOR + statusBarNotification.getId();
    }

    public static boolean h(String str) {
        return "com.tencent.tim".equalsIgnoreCase(str);
    }

    public static boolean i(String str) {
        return "com.tencent.mm".equalsIgnoreCase(str);
    }

    public static boolean isSummaryGroup(StatusBarNotification statusBarNotification) {
        if (!NotificationCompat.isGroupSummary(statusBarNotification.getNotification())) {
            return false;
        }
        Log.d(a, "IsGroupSummary!!", new Object[0]);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(String str) {
        return "com.sina.weibo".equalsIgnoreCase(str);
    }

    public static String k(@NonNull StatusBarNotification statusBarNotification) {
        String packageName = statusBarNotification.getPackageName();
        if (!MiPushSupport.isFromMiPush(packageName)) {
            return packageName;
        }
        String strRetrieveTargetPkgName = MiPushSupport.retrieveTargetPkgName(statusBarNotification.getNotification());
        if (Config.isDebug()) {
            Log.d(a, "From MiPush, TargetPkg : " + strRetrieveTargetPkgName, new Object[0]);
        }
        return strRetrieveTargetPkgName != null ? strRetrieveTargetPkgName : packageName;
    }
}
