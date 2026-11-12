package defpackage;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ufs {
    public static int a(Map<String, String> map) {
        return Math.max(0, det.a(map.get("notification_top_period"), 0));
    }

    public static k5s.a b(Context context, String str, int i, String str2, Notification notification) {
        return new zfs(i, str2, context, str, notification);
    }

    @TargetApi(19)
    public static Notification c(Notification notification, int i, String str, p8s p8sVar) {
        if (notification != null) {
            if (!str.equals(notification.extras.getString("message_id"))) {
                notification = null;
            }
            return notification;
        }
        List<StatusBarNotification> listY = p8sVar.y();
        if (listY == null) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : listY) {
            Notification notification2 = statusBarNotification.getNotification();
            String string = notification2.extras.getString("message_id");
            if (i == statusBarNotification.getId() && str.equals(string)) {
                return notification2;
            }
        }
        return null;
    }

    @TargetApi(19)
    public static void e(Context context, String str, int i, String str2, Notification notification) {
        if (y0t.j(context) && notification != null && notification.extras.getBoolean("mipush_n_top_flag", false)) {
            k(context, str, i, str2, notification);
        }
    }

    public static void f(Context context, Map<String, String> map, sss sssVar, long j) {
        if (map == null || sssVar == null || !y0t.j(context) || !g(map)) {
            return;
        }
        int iA = a(map);
        int iH = h(map);
        if (iA <= 0 || iH > iA) {
            x9s.D("set top notification failed - period:" + iA + " frequency:" + iH);
            return;
        }
        sssVar.setPriority(2);
        Bundle bundle = new Bundle();
        bundle.putLong("mipush_org_when", j);
        bundle.putBoolean("mipush_n_top_flag", true);
        if (iH > 0) {
            bundle.putInt("mipush_n_top_fre", iH);
        }
        bundle.putInt("mipush_n_top_prd", iA);
        sssVar.addExtras(bundle);
    }

    public static boolean g(Map<String, String> map) {
        String str = map.get("notification_top_repeat");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean z = Boolean.parseBoolean(str);
        x9s.B("top notification' repeat is " + z);
        return z;
    }

    public static int h(Map<String, String> map) {
        return Math.max(0, det.a(map.get("notification_top_frequency"), 0));
    }

    public static String i(int i, String str) {
        return "n_top_update_" + i + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str;
    }

    @TargetApi(19)
    public static void k(Context context, String str, int i, String str2, Notification notification) {
        p8s p8sVarE;
        Notification notificationC;
        int iMin;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (notificationC = c(notification, i, str2, (p8sVarE = p8s.e(context, str)))) == null) {
            return;
        }
        boolean z = notification != null;
        if (notificationC.getGroupAlertBehavior() != 1) {
            zbs.j(notificationC, "mGroupAlertBehavior", 1);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = notificationC.extras.getLong("mipush_org_when", 0L);
        int i2 = notificationC.extras.getInt("mipush_n_top_fre", 0);
        int i3 = notificationC.extras.getInt("mipush_n_top_prd", 0);
        if (i3 <= 0 || i3 < i2) {
            return;
        }
        long j2 = ((long) (i3 * 1000)) + j;
        if (j >= jCurrentTimeMillis || jCurrentTimeMillis >= j2) {
            iMin = 0;
        } else if (i2 > 0) {
            iMin = (int) Math.min((j2 - jCurrentTimeMillis) / 1000, i2);
        }
        if (!z) {
            if (iMin > 0) {
                notificationC.when = jCurrentTimeMillis;
                x9s.o("update top notification: " + str2);
                p8sVarE.n(i, notificationC);
            } else {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notificationC);
                builderRecoverBuilder.setPriority(0);
                builderRecoverBuilder.setWhen(jCurrentTimeMillis);
                Bundle extras = builderRecoverBuilder.getExtras();
                if (extras != null) {
                    extras.remove("mipush_n_top_flag");
                    extras.remove("mipush_org_when");
                    extras.remove("mipush_n_top_fre");
                    extras.remove("mipush_n_top_prd");
                    builderRecoverBuilder.setExtras(extras);
                }
                x9s.o("update top notification to common: " + str2);
                p8sVarE.n(i, builderRecoverBuilder.build());
            }
        }
        if (iMin > 0) {
            x9s.o("schedule top notification next update delay: " + iMin);
            k5s.a(context).m(i(i, str2));
            k5s.a(context).n(b(context, str, i, str2, null), iMin);
        }
    }
}
