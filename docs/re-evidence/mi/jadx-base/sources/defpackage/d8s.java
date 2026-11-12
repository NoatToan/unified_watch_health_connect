package defpackage;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.ig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(24)
public class d8s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d8s f15236a = new d8s();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<b> f15237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<b> f15238b;

        public a() {
            this.f15237a = new ArrayList();
            this.f15238b = new ArrayList();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Notification f15240b;

        public b(int i, Notification notification) {
            this.f15239a = i;
            this.f15240b = notification;
        }

        public String toString() {
            return "id:" + this.f15239a;
        }
    }

    public static d8s b() {
        return f15236a;
    }

    public final int a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    public final String c(Notification notification) {
        Bundle bundle;
        if (notification == null || (bundle = notification.extras) == null) {
            return null;
        }
        return bundle.getString("push_src_group_name");
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

    public final List<StatusBarNotification> e(p8s p8sVar) {
        List<StatusBarNotification> listY = p8sVar != null ? p8sVar.y() : null;
        if (listY == null || listY.size() == 0) {
            return null;
        }
        return listY;
    }

    public void f(Context context, int i, Notification notification) {
        if (k()) {
            if (m(context)) {
                try {
                    o(context, i, notification);
                } catch (Exception e) {
                    x9s.o("group notify handle restore error " + e);
                }
            }
            if (q(context)) {
                try {
                    g(context, i, notification, true);
                } catch (Exception e2) {
                    x9s.o("group notify handle auto error " + e2);
                }
            }
        }
    }

    public final void g(Context context, int i, Notification notification, boolean z) {
        Notification notification2;
        String strX = s8s.x(notification);
        if (TextUtils.isEmpty(strX)) {
            x9s.o("group auto not extract pkg from notification:" + i);
            return;
        }
        List<StatusBarNotification> listE = e(p8s.e(context, strX));
        if (listE == null) {
            x9s.o("group auto not get notifications");
            return;
        }
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
                    b bVar = new b(i, notification);
                    if (l(notification)) {
                        value.f15238b.add(bVar);
                    } else {
                        value.f15237a.add(bVar);
                    }
                }
                int size = value.f15237a.size();
                if (value.f15238b.size() <= 0) {
                    if (z && size >= 2) {
                        i(context, strX, key, value.f15237a.get(0).f15240b);
                    }
                } else if (size <= 0) {
                    h(context, strX, key);
                } else if (vas.d(context).m(ig.NotificationGroupUpdateTimeSwitch.a(), false) && (notification2 = value.f15238b.get(0).f15240b) != null) {
                    notification2.when = System.currentTimeMillis();
                    i(context, strX, key, notification2);
                }
            }
        }
    }

    public final void h(Context context, String str, String str2) {
        x9s.y("group cancel summary:" + str2);
        p8s.e(context, str).m(a(str, str2));
    }

    public final void i(Context context, String str, String str2, Notification notification) {
        try {
            if (TextUtils.isEmpty(str2)) {
                x9s.o("group show summary group is null");
                return;
            }
            int iB = s8s.b(context, str);
            if (iB == 0) {
                x9s.o("group show summary not get icon from " + str);
                return;
            }
            p8s p8sVarE = p8s.e(context, str);
            String strX = p8sVarE.x(notification.getChannelId(), "groupSummary");
            NotificationChannel notificationChannelB = p8sVarE.b(strX);
            if ("groupSummary".equals(strX) && notificationChannelB == null) {
                p8sVarE.o(new NotificationChannel(strX, "group_summary", 3));
            }
            Notification.Builder builder = new Notification.Builder(context, strX);
            s8s.q(builder, true);
            Notification notificationBuild = builder.setContentTitle("GroupSummary").setContentText("GroupSummary").setSmallIcon(Icon.createWithResource(str, iB)).setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
            if (!y0t.r() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                s8s.l(notificationBuild, str);
            }
            int iA = a(str, str2);
            p8sVarE.n(iA, notificationBuild);
            x9s.y("group show summary notify:" + iA);
        } catch (Exception e) {
            x9s.o("group show summary error " + e);
        }
    }

    public final void j(Map<String, a> map, StatusBarNotification statusBarNotification) {
        String strN = n(statusBarNotification.getNotification());
        a aVar = map.get(strN);
        if (aVar == null) {
            aVar = new a();
            map.put(strN, aVar);
        }
        b bVar = new b(statusBarNotification.getId(), statusBarNotification.getNotification());
        if (l(statusBarNotification.getNotification())) {
            aVar.f15238b.add(bVar);
        } else {
            aVar.f15237a.add(bVar);
        }
    }

    public final boolean k() {
        return true;
    }

    public final boolean l(Notification notification) {
        if (notification == null) {
            return false;
        }
        Object objE = zbs.e(notification, "isGroupSummary", null);
        if (objE instanceof Boolean) {
            return ((Boolean) objE).booleanValue();
        }
        return false;
    }

    public final boolean m(Context context) {
        if (q(context) && p8s.t(context)) {
            return vas.d(context).m(ig.LatestNotificationNotIntoGroupSwitch.a(), false);
        }
        return false;
    }

    public final String n(Notification notification) {
        if (notification == null) {
            return null;
        }
        return p(notification) ? c(notification) : notification.getGroup();
    }

    public final void o(Context context, int i, Notification notification) {
        String strX = s8s.x(notification);
        if (TextUtils.isEmpty(strX)) {
            x9s.o("group restore not extract pkg from notification:" + i);
            return;
        }
        p8s p8sVarE = p8s.e(context, strX);
        List<StatusBarNotification> listE = e(p8sVarE);
        if (listE == null) {
            x9s.o("group restore not get notifications");
            return;
        }
        for (StatusBarNotification statusBarNotification : listE) {
            Notification notification2 = statusBarNotification.getNotification();
            if (notification2 != null && p(notification2) && statusBarNotification.getId() != i) {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                builderRecoverBuilder.setGroup(c(notification2));
                s8s.q(builderRecoverBuilder, l(notification2));
                p8sVarE.n(statusBarNotification.getId(), builderRecoverBuilder.build());
                x9s.y("group restore notification:" + statusBarNotification.getId());
            }
        }
    }

    public final boolean p(Notification notification) {
        Bundle bundle;
        if (notification == null || notification.getGroup() == null || (bundle = notification.extras) == null) {
            return false;
        }
        return notification.getGroup().equals(String.format("pushmask_%s_%s", Long.valueOf(bundle.getLong("push_src_group_time")), c(notification)));
    }

    public final boolean q(Context context) {
        return vas.d(context).m(ig.NotificationAutoGroupSwitch.a(), true);
    }
}
