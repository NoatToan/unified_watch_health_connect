package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.tencent.connect.common.Constants;
import health.compact.a.DeviceUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public class cgl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<cgp> f1582b = Collections.unmodifiableList(Arrays.asList(new cgp("com.huawei.calendar", "calendar_notification_main_channel_id", 1, 15), new cgp("com.huawei.calendar", "calendar_notification_screen_lock_channel_id", 1, 15), new cgp("com.huawei.calendar", "calendar_notification_later_channel_id", 1, 0), new cgp("com.huawei.calendar", "calendar_notification_refresh_channel_id", 1, 0), new cgp("com.android.calendar", "calendar_notification_main_channel_id", 1, 15), new cgp("com.android.calendar", "calendar_notification_screen_lock_channel_id", 1, 15), new cgp("com.android.calendar", "calendar_notification_later_channel_id", 1, 0), new cgp("com.android.calendar", "calendar_notification_refresh_channel_id", 1, 0), new cgp("com.hihonor.calendar", "calendar_notification_main_channel_id", 1, 15), new cgp("com.hihonor.calendar", "calendar_notification_screen_lock_channel_id", 1, 15), new cgp("com.hihonor.calendar", "calendar_notification_later_channel_id", 1, 0), new cgp("com.hihonor.calendar", "calendar_notification_refresh_channel_id", 1, 0), new cgp("com.whatsapp", "slient_notifications_", 0, 0), new cgp("com.gbox.com.whatsapp", "slient_notifications_", 0, 0)));

    public static boolean d() {
        return false;
    }

    public static String d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString(NotificationCompat.EXTRA_TITLE);
        Object obj = bundle.get(NotificationCompat.EXTRA_TITLE);
        if (TextUtils.isEmpty(string) && obj != null) {
            string = obj.toString();
        }
        Object obj2 = bundle.get(NotificationCompat.EXTRA_TITLE_BIG);
        return (string != null || obj2 == null) ? string : obj2.toString();
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT);
        if (charSequence != null) {
            return charSequence.toString();
        }
        CharSequence charSequence2 = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
        if (charSequence2 == null) {
            return null;
        }
        return charSequence2.toString();
    }

    public static String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence.toString();
        }
        return "";
    }

    public static String c(Bundle bundle) {
        CharSequence charSequence;
        if (bundle == null || (charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_SUB_TEXT)) == null) {
            return null;
        }
        return charSequence.toString();
    }

    public static String e(Bundle bundle) {
        CharSequence charSequence;
        if (bundle == null || (charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT)) == null) {
            return null;
        }
        return charSequence.toString();
    }

    public static String d(Notification notification) {
        if (notification != null) {
            return notification.getChannelId();
        }
        return "";
    }

    public static String d(StatusBarNotification statusBarNotification) {
        if (statusBarNotification != null) {
            return statusBarNotification.getTag();
        }
        return "";
    }

    public static String c(Notification notification) {
        if (notification != null) {
            return notification.category;
        }
        return "";
    }

    public static String e(Notification notification) {
        if (notification != null) {
            String group = notification.getGroup();
            return !TextUtils.isEmpty(group) ? group : "";
        }
        return "";
    }

    public static String b(StatusBarNotification statusBarNotification) {
        if (statusBarNotification == null) {
            LogUtil.j("NotifiPush", "getPackageName statusBarNotification is null");
            return "";
        }
        return c(statusBarNotification);
    }

    private static String c(StatusBarNotification statusBarNotification) {
        String packageName = statusBarNotification.getPackageName();
        if (!TextUtils.isEmpty(packageName) && "com.meizu.cloud".equals(packageName)) {
            String[] strArrSplit = statusBarNotification.getKey().split("\\|");
            if (strArrSplit.length >= 2) {
                return strArrSplit[1];
            }
        }
        return e(packageName);
    }

    public static String e(String str) {
        if (!TextUtils.isEmpty(str)) {
            String strB = ndj.b("NotifiPush");
            if (!TextUtils.isEmpty(strB) && str.contains(strB)) {
                return strB;
            }
        }
        return str;
    }

    public static void b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            LogUtil.j("NotifiPush", "onNotificationPosted packageMessage: notification.extras IS NULL!");
            return;
        }
        try {
            c(bundle, bundle2);
            a(bundle, bundle2);
            d(bundle, bundle2);
            e(bundle, bundle2);
        } catch (IllegalArgumentException e) {
            LogUtil.e("NotifiPush", "onNotificationPosted packageMessage IllegalArgumentException: ", ExceptionUtils.c(e));
        }
    }

    private static void c(Bundle bundle, Bundle bundle2) {
        int i = bundle.getInt("notification.live.operation");
        String strA = a(bundle, "notification.live.event", "OTHER");
        int i2 = bundle.getInt("notification.live.type");
        long j = bundle.getLong("notification.live.keepTime");
        bundle2.putInt("liveOperation", i);
        bundle2.putString("liveEvent", strA);
        bundle2.putInt("liveType", i2);
        if (j > 3600) {
            j = 3600;
        }
        bundle2.putInt("liveKeepTime", (int) j);
    }

    public static String a(Bundle bundle, String str, String str2) {
        Object obj;
        String string = bundle.getString(str, str2);
        return (TextUtils.isEmpty(string) && (obj = bundle.get(str)) != null) ? obj.toString() : string;
    }

    private static void a(Bundle bundle, Bundle bundle2) {
        String strA = a(bundle, "notification.live.titleOverlay", "");
        String strA2 = a(bundle, "notification.live.contentOverlay", "");
        bundle2.putString("titleOverlay", k(strA));
        bundle2.putString("contentOverlay", k(strA2));
    }

    private static void d(Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle("notification.live.feature");
        if (bundle3 == null) {
            return;
        }
        String strA = a(bundle3, "notification.live.feature.titleText", "");
        String strA2 = a(bundle3, "notification.live.feature.contentText", "");
        bundle2.putString("featureTitleText", k(strA));
        bundle2.putString("featureContentText", k(strA2));
    }

    private static void e(Bundle bundle, Bundle bundle2) {
        boolean z = bundle.getBoolean("notification.live.externalEnable", false);
        bundle2.putBoolean("externalEnable", z);
        if (z) {
            String strA = a(bundle, "notification.live.externalTitle", "");
            String strA2 = a(bundle, "notification.live.externalBody", "");
            bundle2.putString("externalTitle", k(strA));
            bundle2.putString("externalBody", k(strA2));
        }
    }

    private static String k(String str) {
        if (str.length() <= 128) {
            return str;
        }
        String strSubstring = str.substring(128);
        LogUtil.a("NotifiPush", "param is oversize 128,subString content.");
        return strSubstring;
    }

    public static boolean a() {
        if (eei.e() == 1) {
            ReleaseLogUtil.d("Notify_NotifiPush", "onNotificationRemoved filter isMidWareAuthority is true");
            return true;
        }
        if (!NotificationContentProviderUtil.i()) {
            ReleaseLogUtil.d("Notify_NotifiPush", "onNotificationRemoved filter capability not support");
            return true;
        }
        if (DeviceUtil.b()) {
            return false;
        }
        ReleaseLogUtil.d("Notify_NotifiPush", "onNotificationRemoved filter not device");
        return true;
    }

    public static boolean a(Notification notification, boolean z, String str) {
        if (notification == null) {
            LogUtil.j("NotifiPush", "onNotificationRemoved isFilterRemoveByFlay notification is null");
            return true;
        }
        int i = notification.flags;
        if ((i & 32) == 32 && !z) {
            ReleaseLogUtil.d("Notify_NotifiPush", "onNotificationRemoved filter FLAG_NO_CLEAR");
            return true;
        }
        if ((i & 2) != 2 || z) {
            return false;
        }
        if (cgr.d(notification, str)) {
            ReleaseLogUtil.d("Notify_NotifiPush", "onNotificationRemoved continue because it is a live type info");
            return false;
        }
        if (!e(notification, (String) null) || !g(str)) {
            ReleaseLogUtil.d("Notify_NotifiPush", "onNotificationRemoved filter FLAG_ONGOING_EVENT");
            return true;
        }
        ReleaseLogUtil.d("Notify_NotifiPush", "onNotificationRemoved continue because it is a live type info");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            LogUtil.e("NotifiPush", "onNotificationRemoved liveInfoDelete ERROR: ", ExceptionUtils.c(e));
        }
        return false;
    }

    public static boolean e(Notification notification, String str) {
        if (notification != null && notification.extras != null) {
            try {
                int i = notification.extras.getInt("notification.live.type", 0);
                String strA = a(notification.extras, "notification.live.event", "OTHER");
                if (!TextUtils.isEmpty(str)) {
                    ReleaseLogUtil.d("Notify_NotifiPush", "onNotificationPosted or onNotificationRemoved liveInfo liveType0x20: ", Integer.valueOf(i), ",liveEvent0x1F: ", strA, ",pkg=", str);
                }
                return i != 0 && cis.e.contains(strA.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException e) {
                LogUtil.e("NotifiPush", "isMatchLiveInfoAndEvent ERROR: ", ExceptionUtils.c(e));
            }
        }
        return false;
    }

    public static boolean g(String str) {
        if (!NotificationContentProviderUtil.f()) {
            ReleaseLogUtil.e("Notify_NotifiPush", "onNotificationPosted FILTERED because LIVEINFO_SWITCH_IS_OFF,pkg=", str);
            return false;
        }
        if (!l(str)) {
            ReleaseLogUtil.e("Notify_NotifiPush", "onNotificationPosted FILTERED because LIVEINFO_WHITELIST_INCAPABLE,pkg=", str);
            return false;
        }
        ReleaseLogUtil.d("Notify_NotifiPush", "onNotificationPosted or onNotificationRemoved received liveInfo allowing continue,pkg=", str);
        return true;
    }

    public static boolean l(String str) {
        List<String> listD = NotificationContentProviderUtil.d();
        if (listD != null) {
            return listD.contains(str);
        }
        return false;
    }

    public static int a(String str, String str2, String str3, boolean z) {
        if (!TextUtils.isEmpty(str) && !b(str)) {
            if (z) {
                LogUtil.a("NotifiPush", "onNotificationPosted or onNotificationRemoved CONSIDERING_GOOGLESMS_IS_RCS");
                return 127;
            }
            if (TextUtils.equals(str, ndj.b("NotifiPush"))) {
                return 2;
            }
            if (TextUtils.equals(str, "com.tencent.mm")) {
                return 3;
            }
            if (j(str)) {
                return 11;
            }
            if (c(str, str2, str3)) {
                return 14;
            }
            if (c(str)) {
                return 15;
            }
            if (TextUtils.equals(str, cio.d)) {
                return 128;
            }
            ReleaseLogUtil.d("Notify_NotifiPush", "onNotificationPosted or onNotificationRemoved getMsgType type is else");
        }
        return 127;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    public static boolean f(String str) {
        str.hashCode();
        switch (str) {
            case "com.hihonor.contacts":
            case "com.huawei.contacts":
            case "com.android.contacts":
            case "com.android.incallui":
            case "com.google.android.dialer":
            case "com.android.server.telecom":
            case "com.android.dialer":
            case "com.samsung.android.dialer":
            case "com.android.phone":
                return true;
            default:
                return false;
        }
    }

    public static boolean j(String str) {
        return TextUtils.equals(str, "com.tencent.mqq") || TextUtils.equals(str, "com.tencent.mobileqq") || TextUtils.equals(str, "com.tencent.mobileqqi") || TextUtils.equals(str, Constants.PACKAGE_QQ_PAD) || TextUtils.equals(str, Constants.PACKAGE_QQ_SPEED) || TextUtils.equals(str, "com.tencent.eim");
    }

    public static boolean c(String str, String str2, String str3) {
        if (TextUtils.equals(str, "com.android.phone") && !TextUtils.isEmpty(str2) && str2.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL")) {
            return true;
        }
        if (TextUtils.equals(str, "com.android.phone") && !TextUtils.isEmpty(str3) && str3.toUpperCase(Locale.ENGLISH).contains("PHONE_MISS")) {
            ReleaseLogUtil.d("Notify_NotifiPush", "isCallPost PHONE_MISS channel found");
            return true;
        }
        return b(str, str2, str3);
    }

    public static boolean b(String str, String str2, String str3) {
        if (TextUtils.equals(str, "com.android.server.telecom")) {
            return true;
        }
        if (TextUtils.equals(str, "com.oneplus.dialer") && !TextUtils.isEmpty(str2) && str2.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL")) {
            return true;
        }
        if (TextUtils.equals(str, "com.samsung.android.dialer") && !TextUtils.isEmpty(str2) && str2.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL")) {
            return true;
        }
        if (TextUtils.equals(str, "com.samsung.android.dialer") && !TextUtils.isEmpty(str3) && str3.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL")) {
            return true;
        }
        if (TextUtils.equals(str, "com.android.dialer") && !TextUtils.isEmpty(str2) && str2.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL")) {
            return true;
        }
        boolean zA = a(str, str2, str3);
        if (zA) {
            return zA;
        }
        if (!TextUtils.equals(str, "com.android.incallui") || TextUtils.isEmpty(str3)) {
            return false;
        }
        return str3.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL");
    }

    private static boolean a(String str, String str2, String str3) {
        if (TextUtils.equals(str, "com.android.dialer") && !TextUtils.isEmpty(str3) && str3.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL")) {
            return true;
        }
        if (TextUtils.equals(str, "com.google.android.dialer") && !TextUtils.isEmpty(str2) && str2.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL")) {
            return true;
        }
        boolean z = !TextUtils.isEmpty(str2) && str2.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL");
        boolean z2 = !TextUtils.isEmpty(str3) && (str3.toUpperCase(Locale.ENGLISH).contains("PHONE_MISS") || str3.toUpperCase(Locale.ENGLISH).contains("MISSED_CALL"));
        if (TextUtils.equals(str, "com.android.contacts") && (z || z2)) {
            return true;
        }
        if (TextUtils.equals(str, "com.huawei.contacts") && !TextUtils.isEmpty(str2)) {
            return str2.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL");
        }
        if (!TextUtils.equals(str, "com.hihonor.contacts") || TextUtils.isEmpty(str2)) {
            return TextUtils.equals(str, "com.huawei.meetime") && !TextUtils.isEmpty(str3) && str3.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL");
        }
        return str2.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    public static boolean c(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "com.huawei.email":
                b2 = 0;
                break;
            case "com.hihonor.email":
                b2 = 1;
                break;
            case "com.android.email":
                b2 = 2;
                break;
            case "com.netease.mobimail":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        return b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3;
    }

    public static boolean d(String str) {
        return TextUtils.equals(str, "com.android.dialer") || TextUtils.equals(str, "com.samsung.android.dialer") || TextUtils.equals(str, "com.google.android.dialer");
    }

    public static boolean a(String str) {
        return TextUtils.equals(str, "com.android.contacts") || TextUtils.equals(str, "com.huawei.contacts") || TextUtils.equals(str, "com.hihonor.contacts");
    }

    public static boolean e(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("NotifiPush", "onNotificationPosted isFilterForMissCall PACKAGENAME_IS_EMPTY");
            return true;
        }
        boolean zM = m(str2);
        boolean zM2 = m(str3);
        TextUtils.equals(str, "com.android.phone");
        if (d(str) && !zM && !zM2) {
            ReleaseLogUtil.e("Notify_NotifiPush", "onNotificationPosted FAILED: ", str, " is not missedCall");
            return true;
        }
        if (a(str) && !zM) {
            if (!TextUtils.isEmpty(str3) && (str3.toUpperCase(Locale.ENGLISH).contains("PHONE_MISS") || str3.toUpperCase(Locale.ENGLISH).contains("MISSED_CALL"))) {
                LogUtil.a("NotifiPush", "onNotificationPosted missedCall continue.");
                return false;
            }
            ReleaseLogUtil.e("Notify_NotifiPush", "onNotificationPosted FAILED: ", str, " is not missedCall");
            return true;
        }
        if (TextUtils.equals(str, "com.android.incallui") && !zM && !zM2) {
            ReleaseLogUtil.d("Notify_NotifiPush", "onNotificationPosted FAILED: ", str, " is not missedCall");
            return true;
        }
        if (!TextUtils.equals(str, "com.oneplus.dialer") || zM || zM2) {
            return false;
        }
        ReleaseLogUtil.d("Notify_NotifiPush", "onNotificationPosted FAILED: ", str, " is not missedCall");
        return true;
    }

    private static boolean m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toUpperCase(Locale.ENGLISH).contains("MISSEDCALL");
    }

    public static boolean i(String str) {
        return TextUtils.equals(str, "com.instagram.android") || TextUtils.equals(str, "com.gbox.com.instagram.android");
    }

    public static boolean o(String str) {
        return TextUtils.equals(str, "com.whatsapp") || TextUtils.equals(str, "com.gbox.com.whatsapp");
    }

    public static boolean b(String str) {
        return TextUtils.equals(str, "com.facebook.orca");
    }

    public static String c(Notification.Action action) {
        String shortString = "";
        try {
            Intent intent = (Intent) PendingIntent.class.getDeclaredMethod("getIntent", new Class[0]).invoke(action.actionIntent, new Object[0]);
            if (intent != null) {
                String action2 = intent.getAction() == null ? "" : intent.getAction();
                try {
                    if (intent.getComponent() != null) {
                        shortString = intent.getComponent().toShortString();
                    }
                    LogUtil.j("NotifiPush", "getIntentAction componentString is :", shortString);
                    shortString = action2;
                } catch (Exception e) {
                    e = e;
                    shortString = action2;
                    LogUtil.e("NotifiPush", "getIntentAction occur exception:", ExceptionUtils.c(e));
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        LogUtil.j("NotifiPush", "getIntentAction actionIntentString is :", shortString);
        return shortString;
    }

    public static String b(Notification.Action action) {
        String className;
        try {
            Intent intent = (Intent) PendingIntent.class.getDeclaredMethod("getIntent", new Class[0]).invoke(action.actionIntent, new Object[0]);
            className = (intent == null || intent.getComponent() == null) ? "" : intent.getComponent().getClassName();
        } catch (Exception e) {
            LogUtil.e("NotifiPush", "getIntentAction occur exception:", ExceptionUtils.c(e));
        }
        LogUtil.j("NotifiPush", "getIntentAction componentString is :", className);
        return className;
    }

    public static boolean h(String str) {
        return TextUtils.equals("com.google.android.apps.messaging", str);
    }

    public static boolean d(String str, long j) {
        if (!h(str) || j == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList(10);
        ncp.b(j, arrayList);
        if (!arrayList.isEmpty() && arrayList.get(0) != null) {
            LogUtil.a("NotifiPush", "onNotificationPosted or onNotificationRemoved googleSms received SMS_FROM_INBOX,amount: ", Integer.valueOf(arrayList.size()));
            return false;
        }
        ReleaseLogUtil.e("Notify_NotifiPush", "onNotificationPosted or onNotificationRemoved GOOGLESMS_RCS_MESSAGE_SPECIFICATIONS_INCAPABLE");
        return true;
    }

    public static void e(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long j3 = j - j2;
        ReleaseLogUtil.d("Notify_NotifiPush", str, " require milliSeconds:", Long.valueOf(j3));
        xjt.ab(str + ":" + j3);
    }
}
