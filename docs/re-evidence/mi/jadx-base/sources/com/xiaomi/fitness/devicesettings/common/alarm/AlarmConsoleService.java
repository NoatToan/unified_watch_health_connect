package com.xiaomi.fitness.devicesettings.common.alarm;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.android.deskclock.console.ConsoleAlarm;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.alarm.AlarmConsoleService;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import defpackage.epc;
import defpackage.k14;
import defpackage.n14;
import defpackage.s7r;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B\u0007¢\u0006\u0004\b>\u0010#J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u0012J\u0019\u0010 \u001a\u00020\u00162\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\r8\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/alarm/AlarmConsoleService;", "Landroid/app/Service;", "Lcom/android/deskclock/console/ConsoleAlarm;", "consoleAlarm", "", "alert", "(Lcom/android/deskclock/console/ConsoleAlarm;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "id", "", "alertTime", "", "label", "alertPhoneAlarm", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;IJLjava/lang/String;)V", "alertHuami", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;I)V", "did", "alertBle", "(Ljava/lang/String;IJLjava/lang/String;)V", "", "snooze", "dismiss", "(Lcom/android/deskclock/console/ConsoleAlarm;Z)V", "alarmId", "dismissBle", "(Ljava/lang/String;IZ)V", "dismissPhoneAlarm", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;IZ)V", "dismissHuami", "isExpectedDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "onCreate", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "Lepc;", "mCallback", "Lepc;", "mAlarmId", "I", "Landroid/os/IBinder$DeathRecipient;", "mDeathRecipient", "Landroid/os/IBinder$DeathRecipient;", "mBinder", "Landroid/os/IBinder;", "<init>", "Companion", "AlarmConsoleDeviceConnectStateListener", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AlarmConsoleService extends Service {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int INVALID_ALARM_ID = -1;

    @Nullable
    private epc mCallback;

    @Nullable
    private Handler mHandler;

    @NotNull
    private final String TAG = "AlarmConsole";
    private int mAlarmId = -1;

    @NotNull
    private final IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.xiaomi.fitness.devicesettings.common.alarm.AlarmConsoleService$mDeathRecipient$1
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            epc epcVar = this.this$0.mCallback;
            Intrinsics.checkNotNull(epcVar);
            epcVar.asBinder().unlinkToDeath(this, 0);
            this.this$0.mCallback = null;
            if (this.this$0.mAlarmId != -1) {
                ConsoleAlarm consoleAlarm = new ConsoleAlarm();
                consoleAlarm.e(this.this$0.mAlarmId);
                this.this$0.dismiss(consoleAlarm, true);
                this.this$0.mAlarmId = -1;
            }
        }
    };

    @NotNull
    private final IBinder mBinder = new AlarmConsoleService$mBinder$1(this);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/alarm/AlarmConsoleService$AlarmConsoleDeviceConnectStateListener;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "consoleAlarm", "Lcom/android/deskclock/console/ConsoleAlarm;", "processEnd", "Lkotlin/Function0;", "", "<init>", "(Lcom/xiaomi/fitness/devicesettings/common/alarm/AlarmConsoleService;Lcom/android/deskclock/console/ConsoleAlarm;Lkotlin/jvm/functions/Function0;)V", "onConnectStart", "did", "", "onConnectFailure", "errorCode", "", "retryTimes", "onConnectSuccess", "onDisconnect", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class AlarmConsoleDeviceConnectStateListener implements OnDeviceStatusListener {

        @NotNull
        private final ConsoleAlarm consoleAlarm;

        @NotNull
        private final Function0<Unit> processEnd;
        final /* synthetic */ AlarmConsoleService this$0;

        public AlarmConsoleDeviceConnectStateListener(@NotNull AlarmConsoleService alarmConsoleService, @NotNull ConsoleAlarm consoleAlarm, Function0<Unit> processEnd) {
            Intrinsics.checkNotNullParameter(consoleAlarm, "consoleAlarm");
            Intrinsics.checkNotNullParameter(processEnd, "processEnd");
            this.this$0 = alarmConsoleService;
            this.consoleAlarm = consoleAlarm;
            this.processEnd = processEnd;
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(@Nullable String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(@Nullable String did) {
            Logger.i(this.this$0.getTAG(), did + " onConnectSuccess");
            if (this.this$0.mAlarmId == -1) {
                Logger.i(this.this$0.getTAG(), did + " onConnectSuccess but alarm dismiss");
                this.processEnd.invoke();
                return;
            }
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (this.this$0.isExpectedDeviceModel(wearableDeviceModel)) {
                AlarmConsoleService alarmConsoleService = this.this$0;
                Intrinsics.checkNotNull(wearableDeviceModel);
                alarmConsoleService.alertPhoneAlarm(wearableDeviceModel, this.consoleAlarm.c(), this.consoleAlarm.a(), this.consoleAlarm.d());
                this.processEnd.invoke();
            }
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(@Nullable String did) {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/alarm/AlarmConsoleService$Companion;", "", "<init>", "()V", "INVALID_ALARM_ID", "", "dismissAlarm", "", "context", "Landroid/content/Context;", "alarmId", "snooze", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void dismissAlarm(@NotNull Context context, int alarmId, boolean snooze) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent();
            intent.setClass(context, AlarmConsoleService.class);
            intent.putExtra("alarm_id", alarmId);
            intent.putExtra("snooze", snooze);
            context.startService(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.xiaomi.fitness.devicesettings.common.alarm.AlarmConsoleService$AlarmConsoleDeviceConnectStateListener] */
    public final void alert(ConsoleAlarm consoleAlarm) {
        WearableDeviceModel wearableDeviceModel;
        Logger.i(this.TAG, "do alert consoleAlarm:" + consoleAlarm);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        List<T> deviceModels = DeviceManagerExtKt.getInstance(companion).getDeviceModels();
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (!isExpectedDeviceModel(wearableDeviceModel2)) {
            wearableDeviceModel2 = null;
        }
        if (wearableDeviceModel2 != null) {
            wearableDeviceModel = wearableDeviceModel2;
            break;
        }
        Iterator it = deviceModels.iterator();
        while (true) {
            if (!it.hasNext()) {
                wearableDeviceModel = wearableDeviceModel2;
                break;
            }
            WearableDeviceModel wearableDeviceModel3 = (WearableDeviceModel) it.next();
            if (isExpectedDeviceModel(wearableDeviceModel3)) {
                wearableDeviceModel = wearableDeviceModel3;
                break;
            }
        }
        Logger.i(this.TAG, "selectDeviceModel: " + wearableDeviceModel);
        if (wearableDeviceModel != null) {
            alertPhoneAlarm(wearableDeviceModel, consoleAlarm.c(), consoleAlarm.a(), consoleAlarm.d());
            return;
        }
        Logger.i(this.TAG, "wait for device connect");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new AlarmConsoleDeviceConnectStateListener(this, consoleAlarm, new Function0() { // from class: t31
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlarmConsoleService.alert$lambda$0(objectRef, this);
            }
        });
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener((OnDeviceStatusListener) objectRef.element);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: u31
                @Override // java.lang.Runnable
                public final void run() {
                    AlarmConsoleService.alert$lambda$1(this.f35326a, objectRef);
                }
            }, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit alert$lambda$0(Ref.ObjectRef listener, AlarmConsoleService this$0) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        T t = listener.element;
        Intrinsics.checkNotNull(t);
        deviceManagerExtKt.removeDeviceStatusListener((OnDeviceStatusListener) t);
        Handler handler = this$0.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void alert$lambda$1(AlarmConsoleService this$0, Ref.ObjectRef listener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Logger.i(this$0.TAG, "wait for 10s, give up");
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener((OnDeviceStatusListener) listener.element);
    }

    private final void alertBle(String did, int id, long alertTime, String label) {
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 16;
        k14 k14Var = new k14();
        n14 n14Var = new n14();
        n14Var.c = id;
        n14Var.d = (int) (alertTime / ((long) 1000));
        n14Var.e = label;
        n14.a aVar = new n14.a();
        aVar.c = 0;
        aVar.d = n14Var;
        k14Var.G(aVar);
        s7rVar.P(k14Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, (OnSyncCallback) null, 0, 16, (Object) null);
    }

    private final void alertHuami(WearableDeviceModel deviceModel, int id) {
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        Boolean boolValueOf = huaMiApiCaller != null ? Boolean.valueOf(huaMiApiCaller.alertMiuiAlarm(id)) : null;
        HuamiAlarmConsoleHelper.INSTANCE.handleHMAlert(id);
        Logger.i(this.TAG, "alertHuami: " + id + " " + boolValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void alertPhoneAlarm(WearableDeviceModel deviceModel, int id, long alertTime, String label) {
        if (DeviceModelExtKt.isHuaMi(deviceModel)) {
            alertHuami(deviceModel, id);
        } else {
            alertBle(deviceModel.getDid(), id, alertTime, label);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss(ConsoleAlarm consoleAlarm, boolean snooze) {
        for (T t : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels()) {
            if (isExpectedDeviceModel(t)) {
                dismissPhoneAlarm(t, consoleAlarm.c(), snooze);
            }
        }
    }

    private final void dismissBle(String did, int alarmId, boolean snooze) {
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 16;
        k14 k14Var = new k14();
        n14 n14Var = new n14();
        n14Var.c = alarmId;
        n14.a aVar = new n14.a();
        aVar.c = snooze ? 2 : 1;
        aVar.d = n14Var;
        k14Var.G(aVar);
        s7rVar.P(k14Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, (OnSyncCallback) null, 0, 16, (Object) null);
    }

    private final void dismissHuami(WearableDeviceModel deviceModel, int alarmId) {
        HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(deviceModel);
        if (huamiDevice != null) {
            huamiDevice.muteMiuiAlarm(alarmId);
        }
    }

    private final void dismissPhoneAlarm(WearableDeviceModel deviceModel, int alarmId, boolean snooze) {
        if (DeviceModelExtKt.isHuaMi(deviceModel)) {
            dismissHuami(deviceModel, alarmId);
        } else {
            dismissBle(deviceModel.getDid(), alarmId, snooze);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isExpectedDeviceModel(WearableDeviceModel deviceModel) {
        return deviceModel != null && deviceModel.getIsDeviceConnected() && DeviceModelExtKt.isSupportFeature(deviceModel, "miui_clock_alert") && DeviceSettingsPreference.INSTANCE.getKEY_SYNC_MIUI_ALARM();
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Logger.i(this.TAG, "onBind isXiaomi:" + RomUtils.isXiaomi());
        if (RomUtils.isXiaomi()) {
            return this.mBinder;
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Logger.i(this.TAG, "onCreate");
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    @Override // android.app.Service
    public int onStartCommand(@NotNull Intent intent, int flags, int startId) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Logger.i(this.TAG, "onStartCommand mCallback: " + this.mCallback);
        if (this.mCallback != null) {
            int intExtra = intent.getIntExtra("alarm_id", -1);
            Logger.i(this.TAG, "alarmId: " + intExtra);
            if (intExtra != -1) {
                boolean booleanExtra = intent.getBooleanExtra("snooze", false);
                Logger.i(this.TAG, "snooze: " + booleanExtra);
                if (booleanExtra) {
                    try {
                        epc epcVar = this.mCallback;
                        Intrinsics.checkNotNull(epcVar);
                        epcVar.c0(intExtra);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        epc epcVar2 = this.mCallback;
                        Intrinsics.checkNotNull(epcVar2);
                        epcVar2.e(intExtra);
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
                if (intExtra == this.mAlarmId) {
                    this.mAlarmId = -1;
                }
            }
        }
        stopSelf();
        return 2;
    }
}
