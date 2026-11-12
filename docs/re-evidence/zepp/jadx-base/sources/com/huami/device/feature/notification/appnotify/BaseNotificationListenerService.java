package com.huami.device.feature.notification.appnotify;

import android.content.Intent;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0012\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u0012\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/device/feature/notification/appnotify/BaseNotificationListenerService;", "Landroid/service/notification/NotificationListenerService;", "", "onCreate", "onListenerConnected", "onListenerDisconnected", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", "onUnbind", "onDestroy", "Landroid/service/notification/StatusBarNotification;", "sbn", "onNotificationPosted", "Landroid/service/notification/NotificationListenerService$RankingMap;", "rankingMap", "onNotificationRemoved", "Lcom/huami/device/feature/notification/appnotify/NotificationListener;", "a", "Lcom/huami/device/feature/notification/appnotify/NotificationListener;", "mNotificationListener", "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseNotificationListenerService extends NotificationListenerService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private NotificationListener mNotificationListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "OnBind!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "OnCreate!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "OnDestroy!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onListenerConnected!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onListenerDisconnected!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "OnUnbind!!";
        }
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        HMLog.info("Noti-Service", a.a);
        return super.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        HMLog.info("Noti-Service", b.a);
        NotificationListener notificationListener = new NotificationListener(this);
        this.mNotificationListener = notificationListener;
        notificationListener.onInit();
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        HMLog.info("Noti-Service", c.a);
        super.onDestroy();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        super.onListenerConnected();
        HMLog.info("Noti-Service", d.a);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        super.onListenerDisconnected();
        HMLog.info("Noti-Service", e.a);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(@Nullable StatusBarNotification sbn) {
        onNotificationPosted(sbn, null);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(@Nullable StatusBarNotification sbn) {
        onNotificationRemoved(sbn, null);
    }

    @Override // android.app.Service
    public boolean onUnbind(@Nullable Intent intent) {
        HMLog.info("Noti-Service", f.a);
        return super.onUnbind(intent);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(@Nullable StatusBarNotification sbn, @Nullable NotificationListenerService.RankingMap rankingMap) {
        NotificationListener notificationListener = this.mNotificationListener;
        if (notificationListener == null) {
            return;
        }
        notificationListener.onNotificationPosted(sbn, rankingMap);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(@Nullable StatusBarNotification sbn, @Nullable NotificationListenerService.RankingMap rankingMap) {
        NotificationListener notificationListener = this.mNotificationListener;
        if (notificationListener == null) {
            return;
        }
        notificationListener.onNotificationRemoved(sbn, rankingMap);
    }
}
