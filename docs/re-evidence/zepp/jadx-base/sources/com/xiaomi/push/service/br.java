package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class br {
    private static int a(Map<String, String> map) {
        return Math.max(0, com.xiaomi.channel.commonutils.android.l.a(map.get("notification_top_period"), 0));
    }

    @TargetApi(19)
    private static Notification b(Notification notification, int i, String str, aq aqVar) {
        if (notification != null) {
            if (!str.equals(notification.extras.getString("message_id"))) {
                notification = null;
            }
            return notification;
        }
        List<StatusBarNotification> listB = aqVar.b();
        if (listB == null) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : listB) {
            Notification notification2 = statusBarNotification.getNotification();
            String string = notification2.extras.getString("message_id");
            if (i == statusBarNotification.getId() && str.equals(string)) {
                return notification2;
            }
        }
        return null;
    }

    private static com.xiaomi.push.o.a c(Context context, String str, int i, String str2, Notification notification) {
        return new i0(i, str2, context, str, notification);
    }

    @TargetApi(19)
    public static void e(Context context, String str, int i, String str2, Notification notification) {
        if (com.xiaomi.channel.commonutils.android.f.m3427a(context) && notification != null && notification.extras.getBoolean("mipush_n_top_flag", false)) {
            k(context, str, i, str2, notification);
        }
    }

    public static void f(Context context, Map<String, String> map, com.xiaomi.push.ay ayVar, long j) {
        if (map == null || ayVar == null || !com.xiaomi.channel.commonutils.android.f.m3427a(context) || !g(map)) {
            return;
        }
        int iA = a(map);
        int iH = h(map);
        if (iA <= 0 || iH > iA) {
            com.xiaomi.channel.commonutils.logger.b.d("set top notification failed - period:" + iA + " frequency:" + iH);
            return;
        }
        ayVar.setPriority(2);
        Bundle bundle = new Bundle();
        bundle.putLong("mipush_org_when", j);
        bundle.putBoolean("mipush_n_top_flag", true);
        if (iH > 0) {
            bundle.putInt("mipush_n_top_fre", iH);
        }
        bundle.putInt("mipush_n_top_prd", iA);
        ayVar.addExtras(bundle);
    }

    private static boolean g(Map<String, String> map) {
        String str = map.get("notification_top_repeat");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean z = Boolean.parseBoolean(str);
        com.xiaomi.channel.commonutils.logger.b.c("top notification' repeat is " + z);
        return z;
    }

    private static int h(Map<String, String> map) {
        return Math.max(0, com.xiaomi.channel.commonutils.android.l.a(map.get("notification_top_frequency"), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(int i, String str) {
        return "n_top_update_" + i + "_" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(19)
    public static void k(Context context, String str, int i, String str2, Notification notification) {
        aq aqVarA;
        Notification notificationB;
        int iMin;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || Build.VERSION.SDK_INT < 26 || (notificationB = b(notification, i, str2, (aqVarA = aq.a(context, str)))) == null) {
            return;
        }
        boolean z = notification != null;
        if (notificationB.getGroupAlertBehavior() != 1) {
            com.xiaomi.push.z.a((Object) notificationB, "mGroupAlertBehavior", (Object) 1);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = notificationB.extras.getLong("mipush_org_when", 0L);
        int i2 = notificationB.extras.getInt("mipush_n_top_fre", 0);
        int i3 = notificationB.extras.getInt("mipush_n_top_prd", 0);
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
                notificationB.when = jCurrentTimeMillis;
                com.xiaomi.channel.commonutils.logger.b.m3434a("update top notification: " + str2);
                aqVarA.a(i, notificationB);
            } else {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notificationB);
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
                com.xiaomi.channel.commonutils.logger.b.m3434a("update top notification to common: " + str2);
                aqVarA.a(i, builderRecoverBuilder.build());
            }
        }
        if (iMin > 0) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("schedule top notification next update delay: " + iMin);
            com.xiaomi.push.o.a(context).a(i(i, str2));
            com.xiaomi.push.o.a(context).b(c(context, str, i, str2, null), iMin);
        }
    }
}
