package com.xiaomi.fitness.sport_manager.location.signal;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport_manager.location.signal.SignalService;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import defpackage.aje;
import defpackage.eoe;
import defpackage.g1j;
import defpackage.ywi;
import defpackage.yyc;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0006\u0010\u0010\u001a\u00020\rJ\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/location/signal/SignalService;", "Landroid/app/Service;", "<init>", "()V", "mNotificationManager", "Landroid/app/NotificationManager;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onStartCommand", "", "flags", "startId", "getGps", LifecycleConstantKt.ON_DESTROY, "buildNotification", "Landroid/app/Notification;", "context", "Landroid/content/Context;", "getNotificationManager", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SignalService extends Service {

    @NotNull
    public static final String NOTIFICATION_CHANNEL_ID = "com.mi.health-signal";

    @Nullable
    private NotificationManager mNotificationManager;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "SignalService";

    @NotNull
    private static final String SIGNAL_ACTION_BROADCAST = "sport_location_signal_update_broadcast";

    @NotNull
    private static final String EXTRA_LOCATION_SIGNAL = "sport_update_location_signal";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/location/signal/SignalService$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "SIGNAL_ACTION_BROADCAST", "getSIGNAL_ACTION_BROADCAST", "EXTRA_LOCATION_SIGNAL", "getEXTRA_LOCATION_SIGNAL", "NOTIFICATION_CHANNEL_ID", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getEXTRA_LOCATION_SIGNAL() {
            return SignalService.EXTRA_LOCATION_SIGNAL;
        }

        @NotNull
        public final String getSIGNAL_ACTION_BROADCAST() {
            return SignalService.SIGNAL_ACTION_BROADCAST;
        }

        @NotNull
        public final String getTAG() {
            return SignalService.TAG;
        }
    }

    private final Notification buildNotification(Context context) {
        context.getPackageName();
        NotificationManager notificationManager = getNotificationManager(AppUtil.getApp());
        String string = getString(g1j.i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, string, 4);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Notification.Builder builder = new Notification.Builder(context, NOTIFICATION_CHANNEL_ID);
        String string2 = context.getString(g1j.j);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return builder.setSmallIcon(ywi.f40644a).setContentTitle(context.getString(g1j.f18470a)).setContentText(string2).setOngoing(true).setGroup("com.mi.health").setAutoCancel(true).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getGps$lambda$0(SignalService this$0, SportLocationResult sportLocationResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(SIGNAL_ACTION_BROADCAST);
        intent.putExtra(EXTRA_LOCATION_SIGNAL, sportLocationResult != null ? Integer.valueOf(sportLocationResult.getGpsAccuracyStatus()) : null);
        aje.b(this$0.getApplicationContext()).d(intent);
    }

    private final NotificationManager getNotificationManager(Context context) {
        if (this.mNotificationManager == null) {
            Object systemService = context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            this.mNotificationManager = (NotificationManager) systemService;
        }
        return this.mNotificationManager;
    }

    public final int getGps() {
        new eoe(this, TimeUnit.SECONDS.toMillis(1L), new yyc() { // from class: nbm
            @Override // defpackage.yyc
            public final void onLocationChanged(SportLocationResult sportLocationResult) {
                SignalService.getGps$lambda$0(this.f27756a, sportLocationResult);
            }
        }).j();
        return 3;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}
