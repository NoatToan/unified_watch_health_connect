package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.xiaomi.push.db;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes22.dex */
public class aq {
    private static Context c;
    private static Object d;
    private static boolean e;
    private static WeakHashMap<Integer, aq> f = new WeakHashMap<>();
    private String a;
    private String b;

    private aq(String str) {
        this.a = str;
    }

    public static aq a(Context context, String str) {
        j(context);
        int iHashCode = str.hashCode();
        aq aqVar = f.get(Integer.valueOf(iHashCode));
        if (aqVar != null) {
            return aqVar;
        }
        aq aqVar2 = new aq(str);
        f.put(Integer.valueOf(iHashCode), aqVar2);
        return aqVar2;
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strF = f("mipush|%s|%s", str2, "");
        return str.startsWith(strF) ? f("mipush_%s_%s", str2, str.replace(strF, "")) : str;
    }

    public static boolean a(Context context) {
        j(context);
        return l();
    }

    private static int b(String str) {
        if (Build.VERSION.SDK_INT < 24) {
            return -1;
        }
        try {
            return c.getPackageManager().getPackageUid(str, 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    private static NotificationManager c() {
        return (NotificationManager) c.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
    }

    private static <T> T d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (T) obj.getClass().getMethod("getList", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object e(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(list);
    }

    private static String f(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) ? "" : String.format(str, str2, str3);
    }

    private static void j(Context context) {
        if (c == null) {
            c = context.getApplicationContext();
            NotificationManager notificationManagerC = c();
            Boolean bool = (Boolean) com.xiaomi.push.z.a((Object) notificationManagerC, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            k("fwk is support.init:" + bool);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            e = zBooleanValue;
            if (zBooleanValue) {
                d = com.xiaomi.push.z.a((Object) notificationManagerC, "getService", new Object[0]);
            }
        }
    }

    public static void k(String str) {
        com.xiaomi.channel.commonutils.logger.b.m3434a("NMHelper:" + str);
    }

    private static boolean l() {
        if (com.xiaomi.channel.commonutils.android.f.m3426a() && at.a(c).a(db.NotificationBelongToAppSwitch.a(), true)) {
            return e;
        }
        return false;
    }

    private StatusBarNotification[] m() {
        if (!com.xiaomi.channel.commonutils.android.f.m3427a(a())) {
            return null;
        }
        try {
            Object objA = com.xiaomi.push.z.a(d, "getActiveNotifications", a().getPackageName());
            if (objA instanceof StatusBarNotification[]) {
                return (StatusBarNotification[]) objA;
            }
            return null;
        } catch (Throwable th) {
            k("getAllNotifications error " + th);
            return null;
        }
    }

    private String o(String str) {
        return f(l() ? "mipush|%s|%s" : "mipush_%s_%s", this.a, str);
    }

    @TargetApi(26)
    public NotificationChannel a(String str) {
        NotificationChannel notificationChannel = null;
        try {
            if (l()) {
                List<NotificationChannel> listG = g();
                if (listG != null) {
                    for (NotificationChannel notificationChannel2 : listG) {
                        if (str.equals(notificationChannel2.getId())) {
                            notificationChannel = notificationChannel2;
                            break;
                        }
                    }
                }
            } else {
                notificationChannel = c().getNotificationChannel(str);
            }
        } catch (Exception e2) {
            k("getNotificationChannel error" + e2);
        }
        return notificationChannel;
    }

    public Context a() {
        return c;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3819a() {
        return this.a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3820a(String str) {
        if (TextUtils.isEmpty(str)) {
            return n();
        }
        return com.xiaomi.channel.commonutils.android.f.m3427a(a()) ? o(str) : str;
    }

    public void a(int i) {
        String str = this.a;
        try {
            if (!l()) {
                c().cancel(i);
                return;
            }
            int iA = com.xiaomi.channel.commonutils.android.c.a();
            String packageName = a().getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                com.xiaomi.push.z.b(d, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i), Integer.valueOf(iA));
            } else {
                com.xiaomi.push.z.b(d, "cancelNotificationWithTag", str, null, Integer.valueOf(i), Integer.valueOf(iA));
            }
            k("cancel succ:" + i);
        } catch (Exception e2) {
            k("cancel error" + e2);
        }
    }

    public void a(int i, Notification notification) {
        String str = this.a;
        NotificationManager notificationManagerC = c();
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (l()) {
                if (i2 >= 19) {
                    notification.extras.putString("xmsf_target_package", str);
                }
                if (i2 >= 29) {
                    notificationManagerC.notifyAsPackage(str, null, i, notification);
                    return;
                }
            }
            notificationManagerC.notify(i, notification);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3821a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(o(""));
    }

    public List<StatusBarNotification> b() {
        String str = this.a;
        NotificationManager notificationManagerC = c();
        ArrayList arrayList = null;
        try {
            if (l()) {
                int iA = com.xiaomi.channel.commonutils.android.c.a();
                if (iA != -1) {
                    return (List) d(com.xiaomi.push.z.a(d, "getAppActiveNotifications", str, Integer.valueOf(iA)));
                }
                return null;
            }
            StatusBarNotification[] activeNotifications = Build.VERSION.SDK_INT >= 23 ? notificationManagerC.getActiveNotifications() : m();
            if (activeNotifications == null || activeNotifications.length <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (str.equals(ar.c(statusBarNotification.getNotification()))) {
                        arrayList2.add(statusBarNotification);
                    }
                }
                return arrayList2;
            } catch (Throwable th) {
                th = th;
                arrayList = arrayList2;
                k("getActiveNotifications error " + th);
                return arrayList;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @TargetApi(26)
    public List<NotificationChannel> g() {
        String str;
        String str2 = this.a;
        List<NotificationChannel> notificationChannels = null;
        try {
            if (l()) {
                int iB = b(str2);
                if (iB != -1) {
                    Object obj = d;
                    Object[] objArr = {str2, Integer.valueOf(iB), Boolean.FALSE};
                    str = "mipush|%s|%s";
                    notificationChannels = (List) d(com.xiaomi.push.z.a(obj, "getNotificationChannelsForPackage", objArr));
                } else {
                    str = null;
                }
            } else {
                notificationChannels = c().getNotificationChannels();
                str = "mipush_%s_%s";
            }
            if (!com.xiaomi.channel.commonutils.android.f.m3426a() || notificationChannels == null) {
                return notificationChannels;
            }
            ArrayList arrayList = new ArrayList();
            String strF = f(str, str2, "");
            for (NotificationChannel notificationChannel : notificationChannels) {
                if (notificationChannel.getId().startsWith(strF)) {
                    arrayList.add(notificationChannel);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            k("getNotificationChannels error " + e2);
            return notificationChannels;
        }
    }

    @TargetApi(26)
    public void h(NotificationChannel notificationChannel) {
        String str = this.a;
        try {
            if (l()) {
                int iB = b(str);
                if (iB != -1) {
                    com.xiaomi.push.z.b(d, "createNotificationChannelsForPackage", str, Integer.valueOf(iB), e(Arrays.asList(notificationChannel)));
                }
            } else {
                c().createNotificationChannel(notificationChannel);
            }
        } catch (Exception e2) {
            k("createNotificationChannel error" + e2);
        }
    }

    public void i(NotificationChannel notificationChannel, boolean z) {
        String str = this.a;
        try {
            if (z) {
                int iB = b(str);
                if (iB != -1) {
                    com.xiaomi.push.z.b(d, "updateNotificationChannelForPackage", str, Integer.valueOf(iB), notificationChannel);
                }
            } else {
                h(notificationChannel);
            }
        } catch (Exception e2) {
            k("updateNotificationChannel error " + e2);
        }
    }

    public String n() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = o("default");
        }
        return this.b;
    }

    public String p(String str, String str2) {
        return l() ? str : str2;
    }

    public String toString() {
        return "NotificationManagerHelper{" + this.a + com.alipay.sdk.m.u.i.d;
    }
}
