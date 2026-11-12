package com.xiaomi.fitness.devicesettings.bigdata;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.IBinder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ServiceCompat;
import com.xiaomi.fitness.devicesettings.common.language.LanguageSettingFragment;
import defpackage.exi;
import defpackage.wzi;
import defpackage.xc6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bigdata/UploadRecorderForegroundService;", "Landroid/app/Service;", "<init>", "()V", "onCreate", "", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", LifecycleConstantKt.ON_DESTROY, "onBind", "Landroid/os/IBinder;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UploadRecorderForegroundService extends Service {

    @NotNull
    public static final String CHANNEL_ID = "com.mi.health.uploadRecord";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String sIsStart = "sIsStart";

    @NotNull
    public static final String sName = "拉取录音";
    private static final int sNotificationId = 1100;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bigdata/UploadRecorderForegroundService$Companion;", "", "<init>", "()V", UploadRecorderForegroundService.sIsStart, "", "sNotificationId", "", "CHANNEL_ID", LanguageSettingFragment.sName, "stopForegroundServiceIfNeed", "", "context", "Landroid/content/Context;", "startForegroundNotificationIfNeed", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startForegroundNotificationIfNeed(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) UploadRecorderForegroundService.class);
            intent.putExtra(UploadRecorderForegroundService.sIsStart, true);
            ServiceCompat.INSTANCE.startForegroundService(context, intent);
        }

        public final void stopForegroundServiceIfNeed(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) UploadRecorderForegroundService.class);
            intent.putExtra(UploadRecorderForegroundService.sIsStart, false);
            ServiceCompat.INSTANCE.startForegroundService(context, intent);
        }
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
        int i = Build.VERSION.SDK_INT;
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(new NotificationChannel(CHANNEL_ID, sName, 4));
        Notification notificationBuild = new Notification.Builder(getApplicationContext(), CHANNEL_ID).setContentTitle(getString(wzi.c)).setContentText(getString(wzi.z0)).setWhen(System.currentTimeMillis()).setSmallIcon(exi.f17164a).setLargeIcon(BitmapFactory.decodeResource(getResources(), exi.f17164a)).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        if (i >= 29) {
            xc6.d("UploadRecorderForegroundService >= Build.VERSION_CODES.Q");
            startForeground(1100, notificationBuild, 16);
        } else {
            xc6.d("UploadRecorderForegroundService < Build.VERSION_CODES.Q");
            startForeground(1100, notificationBuild);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        xc6.d("UploadRecorderForegroundService onDestroy");
        stopForeground(true);
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        if (intent != null && intent.getBooleanExtra(sIsStart, false)) {
            return 2;
        }
        stopSelf();
        return 2;
    }
}
