package com.xiaomi.fitness.keep_alive;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.keep_alive.KeepAliveHelper;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import defpackage.a33;
import defpackage.izd;
import defpackage.lem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002'&B\u0007¢\u0006\u0004\b%\u0010\u000eJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u000eJ\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u0019\u0010\u001e\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010!R\"\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00050\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/keep_alive/KeepAliveHelper;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "La33;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "onReadyToConnect", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "", TSMAuthContants.PARAM_DEVICE_MODELS, "", "containsShowNotificationDevice", "(Ljava/util/List;)Z", "init", "()V", "updateKeepAlive", "cancelKeepAlive", "startConnect", "startService", "stopService", "", "did", "onConnectStart", "(Ljava/lang/String;)V", "", "errorCode", "times", "onConnectFailure", "(Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "state", "onStateChanged", "(I)V", "Lkotlin/Function1;", "deviceChangeListener", "Lkotlin/jvm/functions/Function1;", "<init>", "Companion", "Holder", "keep-alive_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nKeepAliveHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeepAliveHelper.kt\ncom/xiaomi/fitness/keep_alive/KeepAliveHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n1863#2,2:301\n1863#2,2:303\n*S KotlinDebug\n*F\n+ 1 KeepAliveHelper.kt\ncom/xiaomi/fitness/keep_alive/KeepAliveHelper\n*L\n78#1:301,2\n182#1:303,2\n*E\n"})
public final class KeepAliveHelper implements OnDeviceStatusListener, a33 {
    private static final long ALARM_INTERVAL = 3600000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "KeepAliveHelper";

    @NotNull
    private final Function1<WearableDeviceModel, Unit> deviceChangeListener = new Function1() { // from class: hzd
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return KeepAliveHelper.deviceChangeListener$lambda$0(this.f20620a, (WearableDeviceModel) obj);
        }
    };

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\tJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/keep_alive/KeepAliveHelper$Companion;", "", "Landroid/content/Context;", "context", "Landroid/app/PendingIntent;", "constructAlarmPendingIntent", "(Landroid/content/Context;)Landroid/app/PendingIntent;", "", "setupAlarm", "(Landroid/content/Context;)V", "cancelAlarm", "", "needKeepAlive", "()Z", "Landroid/content/Intent;", "intent", "Llem;", "restoreDataFromIntent", "(Landroid/content/Intent;)Llem;", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", TSMAuthContants.PARAM_DEVICE_MODELS, "hasConnected", "(Ljava/util/List;)Z", "Lcom/xiaomi/fitness/keep_alive/KeepAliveHelper;", "getInstance", "()Lcom/xiaomi/fitness/keep_alive/KeepAliveHelper;", "instance", "", "TAG", "Ljava/lang/String;", "", "ALARM_INTERVAL", "J", "<init>", "()V", "keep-alive_release"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nKeepAliveHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeepAliveHelper.kt\ncom/xiaomi/fitness/keep_alive/KeepAliveHelper$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n1863#2,2:301\n*S KotlinDebug\n*F\n+ 1 KeepAliveHelper.kt\ncom/xiaomi/fitness/keep_alive/KeepAliveHelper$Companion\n*L\n287#1:301,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cancelAlarm(Context context) {
            izd.b("KeepAliveHelper.cancelAlarm");
            Object systemService = context.getSystemService(DialWidgetType.ALARM);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            ((AlarmManager) systemService).cancel(constructAlarmPendingIntent(context));
        }

        private final PendingIntent constructAlarmPendingIntent(Context context) {
            return PendingIntentExtKt.getBroadcastPendingIntent$default(context, 0, new Intent(context, (Class<?>) AlarmBroadcastReceiver.class), 0, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setupAlarm(Context context) {
            izd.b("KeepAliveHelper.setupAlarm");
            try {
                Object systemService = context.getSystemService(DialWidgetType.ALARM);
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                ((AlarmManager) systemService).setInexactRepeating(2, SystemClock.elapsedRealtime() + 3600000, 3600000L, constructAlarmPendingIntent(context));
            } catch (RemoteException e) {
                Logger.e("Can't set alarm, because throw exception(" + e + ")", new Object[0]);
            } catch (IllegalStateException e2) {
                Logger.e("Can't set alarm, because throw exception(" + e2 + ")", new Object[0]);
            }
        }

        @NotNull
        public final KeepAliveHelper getInstance() {
            return Holder.INSTANCE.getInstance();
        }

        public final boolean hasConnected(@NotNull List<? extends WearableDeviceModel> deviceModels) {
            Intrinsics.checkNotNullParameter(deviceModels, "deviceModels");
            for (WearableDeviceModel wearableDeviceModel : deviceModels) {
                if (wearableDeviceModel.isDeviceConnected()) {
                    Logger.i(KeepAliveHelper.TAG, wearableDeviceModel.getDid() + " isConnected = " + wearableDeviceModel.isDeviceConnected());
                    return true;
                }
            }
            return false;
        }

        public final boolean needKeepAlive() {
            return RegionPreference.INSTANCE.getPRIVACY_AGREE();
        }

        @NotNull
        public final lem restoreDataFromIntent(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            lem lemVar = new lem();
            lemVar.f24978a = (BluetoothDevice) intent.getParcelableExtra("device");
            lemVar.f24979b = intent.getIntExtra("status", 0);
            lemVar.c = intent.getIntExtra("newState", 0);
            lemVar.e = intent.getStringExtra("characterUuid");
            lemVar.d = intent.getStringExtra("serviceUuid");
            lemVar.g = intent.getIntExtra("mtu", 0);
            lemVar.h = intent.getIntExtra("rssi", 0);
            lemVar.i = intent.getByteArrayExtra("data");
            lemVar.j = intent.getLongExtra("time", 0L);
            Logger.i(KeepAliveHelper.TAG, "restoreDataFromIntent: " + lemVar);
            return lemVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/keep_alive/KeepAliveHelper$Holder;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/keep_alive/KeepAliveHelper;", "getInstance", "()Lcom/xiaomi/fitness/keep_alive/KeepAliveHelper;", "keep-alive_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Holder {

        @NotNull
        public static final Holder INSTANCE = new Holder();

        @NotNull
        private static final KeepAliveHelper instance = new KeepAliveHelper();

        private Holder() {
        }

        @NotNull
        public final KeepAliveHelper getInstance() {
            return instance;
        }
    }

    private final boolean containsShowNotificationDevice(List<? extends WearableDeviceModel> deviceModels) {
        if (deviceModels.isEmpty()) {
            return false;
        }
        Iterator<T> it = deviceModels.iterator();
        while (it.hasNext()) {
            if (!DeviceModelExtKt.isWearOS((WearableDeviceModel) it.next()) || Build.VERSION.SDK_INT <= 33) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deviceChangeListener$lambda$0(KeepAliveHelper this$0, WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "startConnect: addDeviceChangeListener onDeviceChange " + wearableDeviceModel);
        this$0.onReadyToConnect(wearableDeviceModel);
        return Unit.INSTANCE;
    }

    private final void onReadyToConnect(WearableDeviceModel deviceModel) {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        DeviceManagerExtKt.getInstance(companion).removeDeviceChangeListener(this.deviceChangeListener);
        if (deviceModel != null && com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.needBackgroundConnect(deviceModel)) {
            DeviceManagerExtKt.getInstance(companion).connectDevice(deviceModel.getDid());
        }
    }

    public final void cancelKeepAlive() {
        izd.b("KeepAliveHelper.cancelKeepAlive");
        Context applicationContext = AppUtil.getApp().getApplicationContext();
        KeepAliveJobSchedulerService.a(applicationContext);
        Companion companion = INSTANCE;
        Intrinsics.checkNotNull(applicationContext);
        companion.cancelAlarm(applicationContext);
        stopService();
    }

    public final void init() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this);
        BluetoothManager.INSTANCE.get().addBluetoothStateListener(this);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int times) {
        Logger.e("KeepAliveHelper.onConnectFailure", new Object[0]);
        startService();
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
        izd.b("KeepAliveHelper.onConnectPrepare");
        startService();
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        Logger.e("KeepAliveHelper.onConnectSuccess", new Object[0]);
        startService();
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
        Logger.i(TAG, "onDisconnect() called with: did = " + did);
        startService();
    }

    @Override // defpackage.a33
    public void onStateChanged(int state) {
        izd.b("KeepAliveHelper.onStateChanged state " + state);
        if (state == 10) {
            startService();
        }
    }

    public final void startConnect() {
        Logger.i(TAG, "startConnect() called ");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        List<WearableDeviceModel> needKeepAliveDeviceModel = DeviceManagerExtKt.getInstance(companion).getNeedKeepAliveDeviceModel();
        if (needKeepAliveDeviceModel.isEmpty()) {
            DeviceManagerExtKt.getInstance(companion).addDeviceChangeListener(this.deviceChangeListener);
            return;
        }
        Iterator<T> it = needKeepAliveDeviceModel.iterator();
        while (it.hasNext()) {
            onReadyToConnect((WearableDeviceModel) it.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e9 A[Catch: Exception -> 0x00ce, SecurityException -> 0x00d0, IllegalStateException -> 0x00d2, TRY_LEAVE, TryCatch #3 {IllegalStateException -> 0x00d2, SecurityException -> 0x00d0, Exception -> 0x00ce, blocks: (B:20:0x00a4, B:22:0x00a8, B:24:0x00b4, B:26:0x00bd, B:28:0x00c9, B:35:0x00d4, B:36:0x00dc, B:37:0x00e0, B:38:0x00e9), top: B:47:0x00a4 }] */
    public final void startService() {
        izd.b("KeepAliveHelper.startService");
        Context applicationContext = AppUtil.getApp().getApplicationContext();
        Companion companion = INSTANCE;
        if (!companion.needKeepAlive()) {
            izd.b("KeepAliveHelper.startService  no need, just return");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(KeepAliveService.EXTRA_START_TIME, System.currentTimeMillis());
        intent.putExtra(KeepAliveService.EXTRA_START_UPTIME, SystemClock.uptimeMillis());
        izd.b("KeepAliveHelper.startService  KeepAliveService");
        intent.setClass(applicationContext, KeepAliveService.class);
        List<WearableDeviceModel> needKeepAliveDeviceModel = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getNeedKeepAliveDeviceModel();
        izd.b("KeepAliveHelper.startService  containsShowNotificationDevice = " + containsShowNotificationDevice(needKeepAliveDeviceModel));
        if (!containsShowNotificationDevice(needKeepAliveDeviceModel)) {
            try {
                applicationContext.startService(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
            izd.b("startService: deviceModel = null return");
            return;
        }
        boolean zHasConnected = companion.hasConnected(needKeepAliveDeviceModel);
        KeepAliveService.Companion companion2 = KeepAliveService.INSTANCE;
        if (!companion2.needStart(zHasConnected)) {
            izd.b("KeepAliveHelper.startService the service has started");
            return;
        }
        boolean key_show_connection_notification = KeepAlivePreference.INSTANCE.getKEY_SHOW_CONNECTION_NOTIFICATION();
        Logger.i(TAG, "startService: showConnectionNotification = " + key_show_connection_notification);
        if (zHasConnected) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (key_show_connection_notification) {
                    intent.putExtra(KeepAliveService.EXTRA_START_FOREGROUND, true);
                    if (companion2.hasCreated()) {
                        izd.b("KeepAliveHelper.startService  the service has been started, just startService ");
                        applicationContext.startService(intent);
                    } else {
                        izd.b("KeepAliveHelper.startService  startForegroundService");
                        if (i < 34 || DeviceManagerExtKt.getInstance(BluetoothPermissionTool.INSTANCE).hasBluetoothConnectPermission()) {
                            applicationContext.startForegroundService(intent);
                        } else {
                            izd.b("KeepAliveHelper.startService  lost permission ");
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                } else {
                    izd.b("KeepAliveHelper.startService  startService");
                    applicationContext.startService(intent);
                }
            } catch (IllegalStateException e2) {
                izd.a("KeepAliveHelper.startService  fail to start service, " + e2.getMessage(), e2);
                e2.printStackTrace();
            } catch (SecurityException e3) {
                izd.a("KeepAliveHelper.startService  fail to start service, " + e3.getMessage(), e3);
                e3.printStackTrace();
            } catch (Exception e4) {
                izd.a("KeepAliveHelper.startService  fail to start service, " + e4.getMessage(), e4);
                e4.printStackTrace();
            }
        } else {
            izd.b("KeepAliveHelper.startService  startService");
            applicationContext.startService(intent);
        }
    }

    public final void stopService() {
        izd.b("KeepAliveHelper.stopService");
        Context applicationContext = AppUtil.getApp().getApplicationContext();
        Intent intent = new Intent();
        intent.setClass(applicationContext, KeepAliveService.class);
        applicationContext.stopService(intent);
    }

    public final void updateKeepAlive() {
        Context applicationContext = AppUtil.getApp().getApplicationContext();
        Companion companion = INSTANCE;
        if (!companion.needKeepAlive()) {
            izd.b("KeepAliveHelper.updateKeepAlive  cancel");
            cancelKeepAlive();
            return;
        }
        izd.b("KeepAliveHelper.updateKeepAlive  keep alive");
        KeepAliveJobSchedulerService.b(applicationContext);
        Intrinsics.checkNotNull(applicationContext);
        companion.setupAlarm(applicationContext);
        startService();
    }
}
