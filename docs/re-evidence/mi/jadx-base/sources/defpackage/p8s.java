package defpackage;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.ig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class p8s {
    public static Context c;
    public static Object d;
    public static boolean e;
    public static WeakHashMap<Integer, p8s> f = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30131b;

    public p8s(String str) {
        this.f30130a = str;
    }

    public static int a(String str) {
        try {
            return c.getPackageManager().getPackageUid(str, 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static NotificationManager c() {
        return (NotificationManager) c.getSystemService("notification");
    }

    public static p8s e(Context context, String str) {
        q(context);
        int iHashCode = str.hashCode();
        p8s p8sVar = f.get(Integer.valueOf(iHashCode));
        if (p8sVar != null) {
            return p8sVar;
        }
        p8s p8sVar2 = new p8s(str);
        f.put(Integer.valueOf(iHashCode), p8sVar2);
        return p8sVar2;
    }

    public static <T> T f(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (T) obj.getClass().getMethod("getList", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object g(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(list);
    }

    public static String j(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strK = k("mipush|%s|%s", str2, "");
        return str.startsWith(strK) ? k("mipush_%s_%s", str2, str.replace(strK, "")) : str;
    }

    public static String k(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) ? "" : String.format(str, str2, str3);
    }

    public static void q(Context context) {
        if (c == null) {
            c = context.getApplicationContext();
            NotificationManager notificationManagerC = c();
            Boolean bool = (Boolean) zbs.e(notificationManagerC, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            r("fwk is support.init:" + bool);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            e = zBooleanValue;
            if (zBooleanValue) {
                d = zbs.e(notificationManagerC, "getService", new Object[0]);
            }
        }
    }

    public static void r(String str) {
        x9s.o("NMHelper:" + str);
    }

    public static boolean s() {
        if (y0t.i() && vas.d(c).m(ig.NotificationBelongToAppSwitch.a(), true)) {
            return e;
        }
        return false;
    }

    public static boolean t(Context context) {
        q(context);
        return s();
    }

    @TargetApi(26)
    public NotificationChannel b(String str) {
        NotificationChannel notificationChannel = null;
        try {
            if (s()) {
                List<NotificationChannel> listL = l();
                if (listL != null) {
                    for (NotificationChannel notificationChannel2 : listL) {
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
            r("getNotificationChannel error" + e2);
        }
        return notificationChannel;
    }

    public Context d() {
        return c;
    }

    public String h() {
        return this.f30130a;
    }

    public String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return v();
        }
        return y0t.j(d()) ? w(str) : str;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @TargetApi(26)
    public List<NotificationChannel> l() {
        String str;
        String str2 = this.f30130a;
        List<NotificationChannel> notificationChannels = null;
        try {
            if (s()) {
                int iA = a(str2);
                if (iA != -1) {
                    Object obj = d;
                    Object[] objArr = {str2, Integer.valueOf(iA), Boolean.FALSE};
                    str = "mipush|%s|%s";
                    notificationChannels = (List) f(zbs.e(obj, "getNotificationChannelsForPackage", objArr));
                } else {
                    str = null;
                }
            } else {
                notificationChannels = c().getNotificationChannels();
                str = "mipush_%s_%s";
            }
            if (!y0t.i() || notificationChannels == null) {
                return notificationChannels;
            }
            ArrayList arrayList = new ArrayList();
            String strK = k(str, str2, "");
            for (NotificationChannel notificationChannel : notificationChannels) {
                if (notificationChannel.getId().startsWith(strK)) {
                    arrayList.add(notificationChannel);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            r("getNotificationChannels error " + e2);
            return notificationChannels;
        }
    }

    public void m(int i) {
        String str = this.f30130a;
        try {
            if (!s()) {
                c().cancel(i);
                return;
            }
            int iC = lzs.c();
            String packageName = d().getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                zbs.n(d, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i), Integer.valueOf(iC));
            } else {
                zbs.n(d, "cancelNotificationWithTag", str, null, Integer.valueOf(i), Integer.valueOf(iC));
            }
            r("cancel succ:" + i);
        } catch (Exception e2) {
            r("cancel error" + e2);
        }
    }

    public void n(int i, Notification notification) {
        String str = this.f30130a;
        NotificationManager notificationManagerC = c();
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (s()) {
                notification.extras.putString("xmsf_target_package", str);
                if (i2 >= 29) {
                    notificationManagerC.notifyAsPackage(str, null, i, notification);
                } else {
                    notificationManagerC.notify(i, notification);
                }
            } else {
                notificationManagerC.notify(i, notification);
            }
        } catch (Exception unused) {
        }
    }

    @TargetApi(26)
    public void o(NotificationChannel notificationChannel) {
        String str = this.f30130a;
        try {
            if (s()) {
                int iA = a(str);
                if (iA != -1) {
                    zbs.n(d, "createNotificationChannelsForPackage", str, Integer.valueOf(iA), g(Arrays.asList(notificationChannel)));
                }
            } else {
                c().createNotificationChannel(notificationChannel);
            }
        } catch (Exception e2) {
            r("createNotificationChannel error" + e2);
        }
    }

    public void p(NotificationChannel notificationChannel, boolean z) {
        String str = this.f30130a;
        try {
            if (z) {
                int iA = a(str);
                if (iA != -1) {
                    zbs.n(d, "updateNotificationChannelForPackage", str, Integer.valueOf(iA), notificationChannel);
                }
            } else {
                o(notificationChannel);
            }
        } catch (Exception e2) {
            r("updateNotificationChannel error " + e2);
        }
    }

    public String toString() {
        return "NotificationManagerHelper{" + this.f30130a + "}";
    }

    public boolean u(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(w(""));
    }

    public String v() {
        if (TextUtils.isEmpty(this.f30131b)) {
            this.f30131b = w("default");
        }
        return this.f30131b;
    }

    public final String w(String str) {
        return k(s() ? "mipush|%s|%s" : "mipush_%s_%s", this.f30130a, str);
    }

    public String x(String str, String str2) {
        return s() ? str : str2;
    }

    public List<StatusBarNotification> y() {
        String str = this.f30130a;
        NotificationManager notificationManagerC = c();
        List<StatusBarNotification> list = null;
        try {
            if (s()) {
                int iC = lzs.c();
                if (iC != -1) {
                    list = (List) f(zbs.e(d, "getAppActiveNotifications", str, Integer.valueOf(iC)));
                }
            } else {
                StatusBarNotification[] activeNotifications = notificationManagerC.getActiveNotifications();
                if (activeNotifications != null && activeNotifications.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        for (StatusBarNotification statusBarNotification : activeNotifications) {
                            if (str.equals(s8s.x(statusBarNotification.getNotification()))) {
                                arrayList.add(statusBarNotification);
                            }
                        }
                        list = arrayList;
                    } catch (Throwable th) {
                        th = th;
                        list = arrayList;
                        r("getActiveNotifications error " + th);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return list;
    }
}
