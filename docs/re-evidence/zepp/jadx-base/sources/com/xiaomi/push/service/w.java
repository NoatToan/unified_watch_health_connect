package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.huami.device.feature.notification.statistics.RefusedReason;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.xiaomi.push.db;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
@TargetApi(24)
class w {
    private static w a = new w();

    public class a {
        public List<b> a;
        public List<b> b;

        private a() {
            this.a = new ArrayList();
            this.b = new ArrayList();
        }
    }

    public class b {
        public int a;
        public Notification b;

        public b(int i, Notification notification) {
            this.a = i;
            this.b = notification;
        }

        public String toString() {
            return "id:" + this.a;
        }
    }

    private w() {
    }

    private int a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    public static w b() {
        return a;
    }

    private String c(Notification notification) {
        Bundle bundle;
        if (notification == null || (bundle = notification.extras) == null) {
            return null;
        }
        return bundle.getString("push_src_group_name");
    }

    private List<StatusBarNotification> e(aq aqVar) {
        List<StatusBarNotification> listB = aqVar != null ? aqVar.b() : null;
        if (listB == null || listB.size() == 0) {
            return null;
        }
        return listB;
    }

    private void g(Context context, int i, Notification notification, boolean z) {
        String str;
        String strC = ar.c(notification);
        if (TextUtils.isEmpty(strC)) {
            str = "group auto not extract pkg from notification:" + i;
        } else {
            List<StatusBarNotification> listE = e(aq.a(context, strC));
            if (listE != null) {
                String strN = n(notification);
                HashMap map = new HashMap();
                for (StatusBarNotification statusBarNotification : listE) {
                    if (statusBarNotification.getNotification() != null && statusBarNotification.getId() != i) {
                        j(map, statusBarNotification);
                    }
                }
                for (Map.Entry<String, a> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        a value = entry.getValue();
                        if (z && key.equals(strN) && !p(notification)) {
                            (l(notification) ? value.b : value.a).add(new b(i, notification));
                        }
                        int size = value.a.size();
                        if (value.b.size() <= 0) {
                            if (z && size >= 2) {
                                i(context, strC, key, value.a.get(0).b);
                            }
                        } else if (size <= 0) {
                            h(context, strC, key);
                        }
                    }
                }
                return;
            }
            str = "group auto not get notifications";
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a(str);
    }

    private void h(Context context, String str, String str2) {
        com.xiaomi.channel.commonutils.logger.b.b("group cancel summary:" + str2);
        aq.a(context, str).a(a(str, str2));
    }

    private void i(Context context, String str, String str2, Notification notification) {
        Notification.Builder defaults;
        try {
            if (TextUtils.isEmpty(str2)) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("group show summary group is null");
                return;
            }
            int iB = ar.b(context, str);
            if (iB == 0) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("group show summary not get icon from " + str);
                return;
            }
            aq aqVarA = aq.a(context, str);
            if (Build.VERSION.SDK_INT >= 26) {
                String strP = aqVarA.p(notification.getChannelId(), "groupSummary");
                NotificationChannel notificationChannelA = aqVarA.a(strP);
                if ("groupSummary".equals(strP) && notificationChannelA == null) {
                    aqVarA.h(new NotificationChannel(strP, RefusedReason.GROUP_SUMMARY, 3));
                }
                defaults = new Notification.Builder(context, strP);
            } else {
                defaults = new Notification.Builder(context).setPriority(0).setDefaults(-1);
            }
            ar.a(defaults, true);
            Notification notificationBuild = defaults.setContentTitle("GroupSummary").setContentText("GroupSummary").setSmallIcon(Icon.createWithResource(str, iB)).setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
            if (!com.xiaomi.channel.commonutils.android.f.m3429b() && PkgNameConstants.XMSF.equals(context.getPackageName())) {
                ar.f(notificationBuild, str);
            }
            int iA = a(str, str2);
            aqVarA.a(iA, notificationBuild);
            com.xiaomi.channel.commonutils.logger.b.b("group show summary notify:" + iA);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("group show summary error " + e);
        }
    }

    private void j(Map<String, a> map, StatusBarNotification statusBarNotification) {
        String strN = n(statusBarNotification.getNotification());
        a aVar = map.get(strN);
        if (aVar == null) {
            aVar = new a();
            map.put(strN, aVar);
        }
        (l(statusBarNotification.getNotification()) ? aVar.b : aVar.a).add(new b(statusBarNotification.getId(), statusBarNotification.getNotification()));
    }

    private boolean k() {
        return Build.VERSION.SDK_INT >= 24;
    }

    private boolean l(Notification notification) {
        if (notification == null) {
            return false;
        }
        Object objA = com.xiaomi.push.z.a((Object) notification, "isGroupSummary", (Object[]) null);
        if (objA instanceof Boolean) {
            return ((Boolean) objA).booleanValue();
        }
        return false;
    }

    private boolean m(Context context) {
        if (!q(context)) {
            return false;
        }
        aq.a(context);
        return false;
    }

    private String n(Notification notification) {
        if (notification == null) {
            return null;
        }
        return p(notification) ? c(notification) : notification.getGroup();
    }

    private void o(Context context, int i, Notification notification) {
        String str;
        String strC = ar.c(notification);
        if (TextUtils.isEmpty(strC)) {
            str = "group restore not extract pkg from notification:" + i;
        } else {
            aq aqVarA = aq.a(context, strC);
            List<StatusBarNotification> listE = e(aqVarA);
            if (listE != null) {
                for (StatusBarNotification statusBarNotification : listE) {
                    Notification notification2 = statusBarNotification.getNotification();
                    if (notification2 != null && p(notification2) && statusBarNotification.getId() != i) {
                        Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                        builderRecoverBuilder.setGroup(c(notification2));
                        ar.a(builderRecoverBuilder, l(notification2));
                        aqVarA.a(statusBarNotification.getId(), builderRecoverBuilder.build());
                        com.xiaomi.channel.commonutils.logger.b.b("group restore notification:" + statusBarNotification.getId());
                    }
                }
                return;
            }
            str = "group restore not get notifications";
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a(str);
    }

    private boolean p(Notification notification) {
        Bundle bundle;
        if (notification == null || notification.getGroup() == null || (bundle = notification.extras) == null) {
            return false;
        }
        return notification.getGroup().equals(String.format("pushmask_%s_%s", Long.valueOf(bundle.getLong("push_src_group_time")), c(notification)));
    }

    private boolean q(Context context) {
        return at.a(context).a(db.NotificationAutoGroupSwitch.a(), true);
    }

    public String d(Context context, Notification.Builder builder, String str) {
        if (!k() || !m(context)) {
            return str;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bundle extras = builder.getExtras();
        extras.putString("push_src_group_name", str);
        extras.putLong("push_src_group_time", jCurrentTimeMillis);
        return String.format("pushmask_%s_%s", Long.valueOf(jCurrentTimeMillis), str);
    }

    public void f(Context context, int i, Notification notification) {
        if (k()) {
            if (m(context)) {
                try {
                    o(context, i, notification);
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("group notify handle restore error " + e);
                }
            }
            if (q(context)) {
                try {
                    g(context, i, notification, true);
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("group notify handle auto error " + e2);
                }
            }
        }
    }
}
