package com.xiaomi.fitness.keep_alive;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.keep_alive.KeepAliveService;
import com.xiaomi.wearable.wear.api.ProxyDataManager;
import defpackage.f0j;
import defpackage.gxi;
import defpackage.izd;
import defpackage.s33;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/keep_alive/KeepAliveService;", "Landroid/app/Service;", "<init>", "()V", "mCreateTime", "", "mCreateUpTime", "cancelTempNotificationRunnable", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "onCreate", "", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "startForeground", "tempNotification", "", "connected", "checkPermission", "permission", "", "stopForeground", LifecycleConstantKt.ON_DESTROY, "onBind", "Landroid/os/IBinder;", "onTaskRemoved", "Companion", "keep-alive_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeepAliveService extends Service {
    private static final int CANCEL_TEMP_NOTIFICATION_DELAY = 5000;

    @NotNull
    public static final String CHANNEL_ID = "com.xiaomi.wearable-keepaliveservice";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_STARTTYPE = "StartType";
    public static final int EXTRA_STARTYPE_VALUE = 1;

    @NotNull
    public static final String EXTRA_START_FOREGROUND = "extra_start_foreground";

    @NotNull
    public static final String EXTRA_START_TIME = "extra_start_time";

    @NotNull
    public static final String EXTRA_START_UPTIME = "extra_start_uptime";

    @NotNull
    public static final String EXTRA_TIMESTAMP = "TimeStamp";

    @NotNull
    public static final String MAIN_ACTIVITY = "com.xiaomi.fitness.main.MainActivity";
    private static final int NOTIFICATION_ID = 1001;

    @NotNull
    public static final String START_ACTION_BY_MIUI_NEARY_SCAN_SERVICE = "com.mi.health.KeepAliveService.START";

    @NotNull
    private static final String TAG = "KeepAliveService";
    private static boolean sCreated;
    private static boolean sHasCreateChannel;
    private static boolean sHasStartedForeground;
    private static boolean sIsForegroundStarted;
    private static boolean sSentTempNotification;

    @NotNull
    private final Runnable cancelTempNotificationRunnable = new Runnable() { // from class: kzd
        @Override // java.lang.Runnable
        public final void run() {
            KeepAliveService.cancelTempNotificationRunnable$lambda$0(this.f24447a);
        }
    };

    @NotNull
    private final Handler handler = new Handler();
    private long mCreateTime;
    private long mCreateUpTime;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007J\u0006\u0010\"\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/keep_alive/KeepAliveService$Companion;", "", "<init>", "()V", "TAG", "", "sIsForegroundStarted", "", "getSIsForegroundStarted", "()Z", "setSIsForegroundStarted", "(Z)V", "MAIN_ACTIVITY", "EXTRA_START_FOREGROUND", "EXTRA_START_TIME", "EXTRA_START_UPTIME", "START_ACTION_BY_MIUI_NEARY_SCAN_SERVICE", "EXTRA_STARTTYPE", "EXTRA_STARTYPE_VALUE", "", "EXTRA_TIMESTAMP", "NOTIFICATION_ID", "sHasCreateChannel", "sHasStartedForeground", "sCreated", "CHANNEL_ID", "sSentTempNotification", "CANCEL_TEMP_NOTIFICATION_DELAY", "addNotificationChannel", "", "context", "Landroid/content/Context;", "needStart", "hasConnected", "hasCreated", "keep-alive_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addNotificationChannel(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (KeepAliveService.sHasCreateChannel) {
                return;
            }
            KeepAliveService.sHasCreateChannel = true;
            String string = context.getString(f0j.f17263b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            NotificationChannel notificationChannel = new NotificationChannel(KeepAliveService.CHANNEL_ID, string, 2);
            Object systemService = context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }

        public final boolean getSIsForegroundStarted() {
            return KeepAliveService.sIsForegroundStarted;
        }

        public final boolean hasCreated() {
            return KeepAliveService.sCreated;
        }

        public final boolean needStart(boolean hasConnected) {
            boolean key_show_connection_notification = KeepAlivePreference.INSTANCE.getKEY_SHOW_CONNECTION_NOTIFICATION();
            Logger.i(KeepAliveService.TAG, "needStart: showConnectionNotification " + key_show_connection_notification + ", ");
            if (!KeepAliveService.sCreated) {
                return true;
            }
            if (key_show_connection_notification) {
                if (hasConnected != (KeepAliveService.sHasStartedForeground && !KeepAliveService.sSentTempNotification)) {
                    return true;
                }
            }
            return !key_show_connection_notification && hasConnected && KeepAliveService.sHasStartedForeground && !KeepAliveService.sSentTempNotification;
        }

        public final void setSIsForegroundStarted(boolean z) {
            KeepAliveService.sIsForegroundStarted = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancelTempNotificationRunnable$lambda$0(KeepAliveService this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        sSentTempNotification = false;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            izd.b("KeepAliveService.cancelTempNotificationRunnable  omit");
        } else {
            izd.b("KeepAliveService.cancelTempNotificationRunnable  stop foreground");
            this$0.stopForeground();
        }
    }

    private final boolean checkPermission(String permission) {
        return checkSelfPermission(permission) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStartCommand$lambda$1() {
        KeepAliveHelper.INSTANCE.getInstance().startConnect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStartCommand$lambda$2() {
        KeepAliveHelper.INSTANCE.getInstance().startConnect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTaskRemoved$lambda$3() {
        KeepAliveHelper.INSTANCE.getInstance().startConnect();
    }

    private final void startForeground(boolean tempNotification, boolean connected) {
        izd.b("KeepAliveService.startForeground");
        sIsForegroundStarted = true;
        if (sHasStartedForeground && !sSentTempNotification) {
            izd.b("KeepAliveService.startForeground  has started");
        }
        sHasStartedForeground = true;
        sSentTempNotification = false;
        this.handler.removeCallbacks(this.cancelTempNotificationRunnable);
        if (tempNotification) {
            sSentTempNotification = true;
            this.handler.postDelayed(this.cancelTempNotificationRunnable, 5000L);
        }
        Companion companion = INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.addNotificationChannel(applicationContext);
        Context applicationContext2 = getApplicationContext();
        Notification.Builder builder = new Notification.Builder(applicationContext2);
        builder.setSmallIcon(gxi.f19437b);
        builder.setLargeIcon(BitmapFactory.decodeResource(applicationContext2.getResources(), gxi.f19436a));
        String string = applicationContext2.getString(connected ? f0j.c : f0j.d);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        builder.setTicker(string);
        builder.setContentTitle(applicationContext2.getString(f0j.f17262a));
        builder.setContentText(string);
        int i = Build.VERSION.SDK_INT;
        builder.setChannelId(CHANNEL_ID);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(new ComponentName(getPackageName(), MAIN_ACTIVITY));
        Intrinsics.checkNotNull(applicationContext2);
        builder.setContentIntent(PendingIntentExtKt.getActivityPendingIntent$default(applicationContext2, 1001, intent, 0, 4, null));
        builder.setGroup("com.mi.health");
        builder.setOngoing(true);
        Notification notificationBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        try {
            if (i < 34) {
                startForeground(1001, notificationBuild);
                return;
            }
            int i2 = checkPermission("android.permission.BLUETOOTH_CONNECT") ? 16 : 0;
            if (checkPermission("android.permission.ACCESS_FINE_LOCATION")) {
                i2 |= 8;
            }
            Logger.i(TAG, "startForeground() called with: " + i2);
            if (i2 != 0) {
                startForeground(1001, notificationBuild, i2);
            } else {
                Logger.i(TAG, "startForeground lost permission BLUETOOTH_CONNECT ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.i(TAG, "startForeground: e " + e);
        }
    }

    private final void stopForeground() {
        izd.b("KeepAliveService.stopForeground");
        sSentTempNotification = false;
        sIsForegroundStarted = false;
        this.handler.removeCallbacks(this.cancelTempNotificationRunnable);
        if (!sHasStartedForeground) {
            izd.b("KeepAliveService.stopForeground  not foreground, just return");
        } else {
            sHasStartedForeground = false;
            stopForeground(true);
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
        izd.b("KeepAliveService.onCreate");
        super.onCreate();
        sCreated = true;
        this.mCreateTime = System.currentTimeMillis();
        this.mCreateUpTime = SystemClock.uptimeMillis();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.i("KeepAliveService onDestroy", new Object[0]);
        super.onDestroy();
        sHasStartedForeground = false;
        sSentTempNotification = false;
        this.handler.removeCallbacks(this.cancelTempNotificationRunnable);
        sCreated = false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x010a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0148  */
    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        boolean zHasConnected;
        boolean key_show_connection_notification;
        boolean z = false;
        boolean z2 = intent == null;
        izd.b("KeepAliveService.onStartCommand intentEmpty = " + z2);
        super.onStartCommand(intent, flags, startId);
        boolean z3 = intent != null && intent.getBooleanExtra(EXTRA_START_FOREGROUND, false);
        if (intent != null) {
            intent.getIntExtra(EXTRA_STARTTYPE, 0);
        }
        boolean z4 = intent != null && intent.hasExtra("device");
        izd.b("KeepAliveService.onStartCommand  createTime:" + this.mCreateTime + "  createUpTime:" + this.mCreateUpTime);
        izd.b("KeepAliveService.onStartCommand  current Time:" + System.currentTimeMillis() + "  current UpTime:" + SystemClock.uptimeMillis());
        List<WearableDeviceModel> needKeepAliveDeviceModel = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getNeedKeepAliveDeviceModel();
        if (!needKeepAliveDeviceModel.isEmpty()) {
            KeepAliveHelper.Companion companion = KeepAliveHelper.INSTANCE;
            if (companion.needKeepAlive()) {
                zHasConnected = companion.hasConnected(needKeepAliveDeviceModel);
            } else {
                izd.b("KeepAliveService.onStartCommand  no need keep alive, stop service");
            }
            Logger.i(TAG, "onStartCommand: from miui = " + z4 + ", permission = " + s33.d());
            if (z4 && s33.d() && intent != null) {
                ProxyDataManager.INSTANCE.restoreProxyData(intent);
                this.handler.post(new Runnable() { // from class: lzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        KeepAliveService.onStartCommand$lambda$1();
                    }
                });
            }
            if (z2) {
                Logger.i(TAG, "onStartCommand startConnect() ");
                this.handler.post(new Runnable() { // from class: mzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        KeepAliveService.onStartCommand$lambda$2();
                    }
                });
            }
            key_show_connection_notification = KeepAlivePreference.INSTANCE.getKEY_SHOW_CONNECTION_NOTIFICATION();
            if ((zHasConnected && z3) || (!key_show_connection_notification && z3)) {
            }
            if (z) {
                izd.b("KeepAliveService.onStartCommand  startForeground temporarily");
            }
            Logger.i(TAG, "onStartCommand: showConnectionNofication " + key_show_connection_notification + ", tempNotification = " + z + ",  connected = " + zHasConnected + ", fromMIUI = " + z4);
            if ((!key_show_connection_notification && zHasConnected) || z || z4) {
                startForeground(z, zHasConnected);
            } else if (!sSentTempNotification) {
                stopForeground();
            }
            return 1;
        }
        izd.b("KeepAliveService.onStartCommand  no current device, stop service");
        zHasConnected = false;
        Logger.i(TAG, "onStartCommand: from miui = " + z4 + ", permission = " + s33.d());
        if (z4) {
            ProxyDataManager.INSTANCE.restoreProxyData(intent);
            this.handler.post(new Runnable() { // from class: lzd
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveService.onStartCommand$lambda$1();
                }
            });
        }
        if (z2) {
            Logger.i(TAG, "onStartCommand startConnect() ");
            this.handler.post(new Runnable() { // from class: mzd
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveService.onStartCommand$lambda$2();
                }
            });
        }
        key_show_connection_notification = KeepAlivePreference.INSTANCE.getKEY_SHOW_CONNECTION_NOTIFICATION();
        z = zHasConnected ? true : true;
        if (z) {
            izd.b("KeepAliveService.onStartCommand  startForeground temporarily");
        }
        Logger.i(TAG, "onStartCommand: showConnectionNofication " + key_show_connection_notification + ", tempNotification = " + z + ",  connected = " + zHasConnected + ", fromMIUI = " + z4);
        if (!key_show_connection_notification) {
            if (!sSentTempNotification) {
                stopForeground();
            }
        } else if (!sSentTempNotification) {
            stopForeground();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        izd.b("KeepAliveService.onTaskRemoved");
        super.onTaskRemoved(intent);
        this.handler.post(new Runnable() { // from class: nzd
            @Override // java.lang.Runnable
            public final void run() {
                KeepAliveService.onTaskRemoved$lambda$3();
            }
        });
    }
}
