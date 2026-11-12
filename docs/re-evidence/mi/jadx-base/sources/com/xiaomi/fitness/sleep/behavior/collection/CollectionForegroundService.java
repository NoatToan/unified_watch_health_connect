package com.xiaomi.fitness.sleep.behavior.collection;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sleep.behavior.collection.CollectionForegroundService;
import defpackage.b1j;
import defpackage.owg;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import services.reminder.notification.NotificationFactory;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/CollectionForegroundService;", "Landroid/app/Service;", "<init>", "()V", "onCreate", "", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", LifecycleConstantKt.ON_DESTROY, "onBind", "Landroid/os/IBinder;", "createNotification", "Landroid/app/Notification;", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CollectionForegroundService extends Service {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NOTIFICATION_TYPE = "notification_type";

    @Nullable
    private static WeakReference<CollectionForegroundService> sService;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/CollectionForegroundService$Companion;", "", "<init>", "()V", "NOTIFICATION_TYPE", "", "sService", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/sleep/behavior/collection/CollectionForegroundService;", "isRunning", "", "()Z", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isRunning() {
            WeakReference weakReference = CollectionForegroundService.sService;
            return (weakReference != null ? (CollectionForegroundService) weakReference.get() : null) != null;
        }
    }

    private final Notification createNotification() {
        owg owgVar = new owg();
        owg.b bVar = new owg.b();
        bVar.f29767a = "channel:background_service";
        bVar.f29768b = getString(b1j.c);
        owgVar.c = bVar;
        Intent intent = new Intent();
        intent.setAction(getPackageName() + ".action.SLEEP_DETECT");
        intent.setPackage(getPackageName());
        owgVar.r(intent);
        owgVar.g = getString(b1j.c);
        owgVar.e = 2;
        owgVar.h = getString(b1j.f3686a);
        return NotificationFactory.INSTANCE.create(this, owgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStartCommand$lambda$0(CollectionForegroundService this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stopSelf(i);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        sService = new WeakReference<>(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        sService = null;
        stopForeground(true);
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, final int startId) {
        Notification notificationCreateNotification = createNotification();
        String stringExtra = intent != null ? intent.getStringExtra(NOTIFICATION_TYPE) : null;
        if (stringExtra == null || stringExtra.length() == 0) {
            ExecutorHelper.INSTANCE.postInWorker(new Runnable() { // from class: k44
                @Override // java.lang.Runnable
                public final void run() {
                    CollectionForegroundService.onStartCommand$lambda$0(this.f23413a, startId);
                }
            }, 5000L);
        } else {
            notificationCreateNotification = createNotification();
        }
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                int i = PermissionsUtil.INSTANCE.checkPermission("android.permission.RECORD_AUDIO") ? 1073741952 : 1073741824;
                Intrinsics.checkNotNull(notificationCreateNotification);
                startForeground(100, notificationCreateNotification, i);
            } else {
                Intrinsics.checkNotNull(notificationCreateNotification);
                startForeground(100, notificationCreateNotification);
            }
        } catch (Throwable th) {
            Logger.i("CollectionForegroundService", "startForeground exception", th);
        }
        return super.onStartCommand(intent, flags, startId);
    }
}
