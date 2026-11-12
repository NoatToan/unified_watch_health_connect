package sz0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lsz0/f;", "", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f161394a = new a(null);

    public static final void a(Context context, Notification notification, int i14, e eVar) {
        f161394a.getClass();
        a.f(context, notification, i14, eVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsz0/f$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(int i14, Context context) {
            context.getClass();
            d(context).cancel(i14);
        }

        public static void b(Context context) {
            context.getClass();
            StatusBarNotification[] activeNotifications = d(context).getActiveNotifications();
            activeNotifications.getClass();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (p005kotlin.jvm.internal.s.g(statusBarNotification.getNotification().getChannelId(), "PENDING_ACTIVITIES_CHANNEL_ID")) {
                    f.f161394a.getClass();
                    d(context).cancel(statusBarNotification.getId());
                }
            }
        }

        public static void c(Context context, e eVar) {
            context.getClass();
            eVar.getClass();
            NotificationChannel notificationChannel = new NotificationChannel(eVar.f161386a, eVar.b(new l22.a(context)), eVar.f161389d);
            notificationChannel.setDescription(eVar.a(new l22.a(context)));
            d(context).createNotificationChannel(notificationChannel);
        }

        public static NotificationManager d(Context context) {
            Object systemService = context.getSystemService("notification");
            systemService.getClass();
            return (NotificationManager) systemService;
        }

        public static boolean e(int i14, Context context) {
            context.getClass();
            StatusBarNotification[] activeNotifications = d(context).getActiveNotifications();
            activeNotifications.getClass();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getId() == i14) {
                    return true;
                }
            }
            return false;
        }

        public static void f(Context context, Notification notification, int i14, e eVar) {
            context.getClass();
            notification.getClass();
            eVar.getClass();
            NotificationManager notificationManagerD = d(context);
            NotificationChannel notificationChannel = new NotificationChannel(eVar.f161386a, eVar.b(new l22.a(context)), eVar.f161389d);
            notificationChannel.setDescription(eVar.a(new l22.a(context)));
            notificationManagerD.createNotificationChannel(notificationChannel);
            notificationManagerD.notify(i14, notification);
        }

        private a() {
        }
    }
}
