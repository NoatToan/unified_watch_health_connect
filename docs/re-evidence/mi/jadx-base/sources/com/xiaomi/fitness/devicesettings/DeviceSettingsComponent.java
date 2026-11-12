package com.xiaomi.fitness.devicesettings;

import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.RemoteException;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.entity.health.Health;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.SettingsLanguageV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.cache.sp.SpExtKt;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ComponentState;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.ChangeListenerWrapper;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.DeviceSettingsComponent;
import com.xiaomi.fitness.devicesettings.base.clock.AlarmWeekdayHelper;
import com.xiaomi.fitness.devicesettings.bigdata.BigDataHandler;
import com.xiaomi.fitness.devicesettings.bigdata.ExistRecordSyncer;
import com.xiaomi.fitness.devicesettings.bigdata.RecorderBigDataHandler;
import com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactHelper;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.TodoExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoSettingHelper;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoSyncDeviceManager;
import com.xiaomi.fitness.devicesettings.common.alarm.AlarmConsoleService;
import com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderUtil;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.common.language.LanguageReceiver;
import com.xiaomi.fitness.devicesettings.common.language.LanguageSettingChangeHandler;
import com.xiaomi.fitness.devicesettings.common.phonemute.PhoneMuteManager;
import com.xiaomi.fitness.devicesettings.export.sleepai.SleepAiExtKt;
import com.xiaomi.fitness.devicesettings.huami.callback.DeviceProgressCallBack;
import com.xiaomi.fitness.devicesettings.huami.handler.HealthSettingChangeHandler;
import com.xiaomi.fitness.devicesettings.huami.screenwake.DisplaySettingChangeHandler;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateSpUtils;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.devicesettings.utils.HuamiDeviceTool;
import com.xiaomi.fitness.devicesettings.utils.ZenUtils;
import com.xiaomi.fitness.keep_alive.KeepAliveService;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.SettingItemPreference;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSetting;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import defpackage.aed;
import defpackage.dg4;
import defpackage.gg4;
import defpackage.k14;
import defpackage.ld8;
import defpackage.n14;
import defpackage.puc;
import defpackage.s7r;
import defpackage.udd;
import defpackage.y08;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0006\r\u0010\u0013\u0016\u0019\u001c\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0003=>?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0006H\u0002J\b\u0010%\u001a\u00020#H\u0007J\b\u0010&\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020#H\u0007J\b\u0010(\u001a\u00020#H\u0002J\u0016\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006J\b\u00104\u001a\u00020#H\u0007J\b\u00105\u001a\u00020#H\u0002J\b\u00106\u001a\u00020#H\u0002J\u000e\u00109\u001a\u0002082\u0006\u0010$\u001a\u00020\u0006J\u000e\u0010;\u001a\u0002082\u0006\u0010$\u001a\u00020\u0006J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0006H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002080\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002080\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/DeviceSettingsComponent;", "", "<init>", "()V", "mChangeListenerWrappers", "", "", "Lcom/xiaomi/fitness/device/manager/export/ChangeListenerWrapper;", "updateListener", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager$UpdateDeviceSettingListener;", "getUpdateListener", "()Lcom/xiaomi/fitness/settingitem/DeviceSettingManager$UpdateDeviceSettingListener;", "clockDataHandler", "com/xiaomi/fitness/devicesettings/DeviceSettingsComponent$clockDataHandler$1", "Lcom/xiaomi/fitness/devicesettings/DeviceSettingsComponent$clockDataHandler$1;", "interconnectionDataHandler", "com/xiaomi/fitness/devicesettings/DeviceSettingsComponent$interconnectionDataHandler$1", "Lcom/xiaomi/fitness/devicesettings/DeviceSettingsComponent$interconnectionDataHandler$1;", "miuiSosDataHandler", "com/xiaomi/fitness/devicesettings/DeviceSettingsComponent$miuiSosDataHandler$1", "Lcom/xiaomi/fitness/devicesettings/DeviceSettingsComponent$miuiSosDataHandler$1;", "fallDetectionDataHandler", "com/xiaomi/fitness/devicesettings/DeviceSettingsComponent$fallDetectionDataHandler$1", "Lcom/xiaomi/fitness/devicesettings/DeviceSettingsComponent$fallDetectionDataHandler$1;", "mainSystemHandler", "com/xiaomi/fitness/devicesettings/DeviceSettingsComponent$mainSystemHandler$1", "Lcom/xiaomi/fitness/devicesettings/DeviceSettingsComponent$mainSystemHandler$1;", "deviceSystemHandler", "com/xiaomi/fitness/devicesettings/DeviceSettingsComponent$deviceSystemHandler$1", "Lcom/xiaomi/fitness/devicesettings/DeviceSettingsComponent$deviceSystemHandler$1;", "receiver", "Lcom/xiaomi/fitness/devicesettings/PackageInstalledReceiver;", "registerPackageReceiver", "", "registerPackageChangeReceiver", "", "did", "initClockDataHandler", "initComponentState", "initDeviceDataHandler", "unregisterPackageChangeReceiver", "activityCount", "", "getActivityCount", "()I", "setActivityCount", "(I)V", "handleLifeCycle", LifecycleConstantKt.TYPE_ACTIVITY, "lifecycle", "syncStateListener", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", "initTask", "syncMiuiTodoIfNeed", "initUnlockServiceVersion", "ilfEventCallbacksDevice", "Lcom/xiaomi/fitness/device/manager/export/LFEventCallbackWrapper;", "getEventCallbackDevice", "ilfEventCallbacks", "getEventCallback", "getChangeListenerWrapper", "ILFEventCallbackImpl", "IChangerListenerWrapperImpl", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "DeviceSettings")
public final class DeviceSettingsComponent {

    @NotNull
    public static final String SERVER_ACTION = "miui.bluetooth.mible.BluetoothUnlockService";

    @NotNull
    public static final String SERVER_CLASSNAME = "com.android.bluetooth.ble.BluetoothUnlockService";

    @NotNull
    public static final String SERVER_PACKAGE = "com.xiaomi.bluetooth";

    @NotNull
    private static final String TAG = "DeviceSettingsComponent";
    private int activityCount;
    private boolean registerPackageReceiver;

    @Nullable
    private SyncStateListener syncStateListener;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int unlockVersion = -1;

    @NotNull
    private final Map<String, ChangeListenerWrapper> mChangeListenerWrappers = new LinkedHashMap();

    @NotNull
    private final DeviceSettingManager.UpdateDeviceSettingListener updateListener = new DeviceSettingManager.UpdateDeviceSettingListener() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$updateListener$1
        @Override // com.xiaomi.fitness.settingitem.DeviceSettingManager.UpdateDeviceSettingListener
        public void onDeviceSettingUpdated(String did) {
            WearableDeviceModel wearableDeviceModel;
            if (did == null || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)) == null) {
                return;
            }
            ScopeExtKt.scope$default(null, new DeviceSettingsComponent$updateListener$1$onDeviceSettingUpdated$1(did, wearableDeviceModel, null), 1, null);
            SettingItemPreference.INSTANCE.setSettingItemUpdating(did, false);
        }
    };

    @NotNull
    private final DeviceSettingsComponent$clockDataHandler$1 clockDataHandler = new DataHandlerWrapper() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$clockDataHandler$1
        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(String did, int type, s7r packet) {
            int i;
            Intrinsics.checkNotNullParameter(did, "did");
            if (type == 17) {
                Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
                if (numValueOf != null && numValueOf.intValue() == 16) {
                    if (packet.q() != null) {
                        n14.a aVarT = packet.q().t();
                        if ((aVarT != null ? aVarT.d : null) != null && ((i = aVarT.c) == 1 || i == 2)) {
                            Logger.i("DeviceSettingsComponent", "AlarmConsoleService.dismissAlarm id: " + aVarT.d.c + " opCode: " + i);
                            AlarmConsoleService.INSTANCE.dismissAlarm(ApplicationExtKt.getApplication(), aVarT.d.c, aVarT.c == 2);
                        }
                        return true;
                    }
                } else {
                    if (numValueOf != null && numValueOf.intValue() == 7) {
                        k14 k14VarQ = packet.q();
                        if ((k14VarQ != null ? k14VarQ.p() : null) != null) {
                            int i2 = packet.q().p().c;
                            Logger.i("DeviceSettingsComponent", "request holiday year by: " + i2);
                            AlarmWeekdayHelper.INSTANCE.getWeekdayInfo(i2);
                        } else {
                            AlarmWeekdayHelper.getWeekdayInfo$default(AlarmWeekdayHelper.INSTANCE, 0, 1, null);
                        }
                        return true;
                    }
                    if (numValueOf != null && numValueOf.intValue() == 20) {
                        k14 k14VarQ2 = packet.q();
                        TodoExtKt.markReminderFromDevice(k14VarQ2 != null ? k14VarQ2.v() : null);
                        return true;
                    }
                    if (numValueOf != null && numValueOf.intValue() == 21) {
                        Logger.i("DeviceSettingsComponent", "receive request miui reminders from device ..");
                        this.this$0.syncMiuiTodoIfNeed();
                        return true;
                    }
                }
            }
            return false;
        }
    };

    @NotNull
    private final DeviceSettingsComponent$interconnectionDataHandler$1 interconnectionDataHandler = new DataHandlerWrapper() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$interconnectionDataHandler$1
        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(String did, int type, s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
            int i = 0;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                s7r s7rVar = new s7r();
                s7rVar.e = 23;
                s7rVar.f = 1;
                udd uddVar = new udd();
                aed aedVar = new aed();
                Object systemService = ApplicationExtKt.getApplication().getSystemService("keyguard");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
                Object systemService2 = ApplicationExtKt.getApplication().getSystemService("power");
                Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
                boolean zIsKeyguardLocked = ((KeyguardManager) systemService).isKeyguardLocked();
                boolean zIsInteractive = ((PowerManager) systemService2).isInteractive();
                if (zIsInteractive) {
                    i = (zIsKeyguardLocked && zIsInteractive) ? 1 : 2;
                }
                Logger.i("DeviceSettingsComponent", "handlePacket REQUEST_PHONE_STATUS phoneStatus = " + i);
                aedVar.c = i;
                uddVar.w(aedVar);
                s7rVar.U(uddVar);
                DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$interconnectionDataHandler$1$handlePacket$1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did2, int type2, int code) {
                        Logger.e("DeviceSettingsComponent", "handlePacket REQUEST_PHONE_STATUS " + did2 + "  error:" + code);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did2, int type2, SyncResult result) {
                        Logger.i("DeviceSettingsComponent", "handlePacket REQUEST_PHONE_STATUS phoneStatus result = " + (result != null ? Integer.valueOf(result.getCode()) : null));
                    }
                }, 0, 16, (Object) null);
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == 17) {
                if (SleepAiExtKt.getMiAicrManagerImp().isSupportMIAIPhoneStateListen()) {
                    Logger.i("DeviceSettingsComponent", "handlePacket REGISTER_PHONE_USAGE");
                    SleepAiExtKt.getMiAicrManagerImp().bindMIAIPhoneStateService();
                } else {
                    Logger.i("DeviceSettingsComponent", "handlePacket REGISTER_PHONE_USAGE NOT SUPPORT");
                }
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == 18) {
                if (SleepAiExtKt.getMiAicrManagerImp().isSupportMIAIPhoneStateListen()) {
                    Logger.i("DeviceSettingsComponent", "handlePacket UNREGISTER_PHONE_USAGE");
                    SleepAiExtKt.getMiAicrManagerImp().stopMIAIPhoneStateListen();
                }
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == 20) {
                if (SleepAiExtKt.getMiAicrManagerImp().isSupportMIAIPhoneStateListen()) {
                    Logger.i("DeviceSettingsComponent", "handlePacket START_PHONE_TRACE");
                    SleepAiExtKt.getMiAicrManagerImp().startDeviceTrace();
                }
                return true;
            }
            if (numValueOf == null || numValueOf.intValue() != 21) {
                return false;
            }
            if (SleepAiExtKt.getMiAicrManagerImp().isSupportMIAIPhoneStateListen()) {
                Logger.i("DeviceSettingsComponent", "handlePacket FINISH_PHONE_TRACE");
                SleepAiExtKt.getMiAicrManagerImp().stopDeviceTrace();
            }
            return true;
        }
    };

    @NotNull
    private final DeviceSettingsComponent$miuiSosDataHandler$1 miuiSosDataHandler = new DataHandlerWrapper() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$miuiSosDataHandler$1
        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(String did, int type, s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (packet == null || type != 21 || packet.f != 8) {
                return false;
            }
            EmergencyContactHelper.INSTANCE.requestMIUISos();
            return true;
        }
    };

    @NotNull
    private final DeviceSettingsComponent$fallDetectionDataHandler$1 fallDetectionDataHandler = new DataHandlerWrapper() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$fallDetectionDataHandler$1
        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(String did, int type, s7r packet) {
            gg4 gg4VarQ;
            Intrinsics.checkNotNullParameter(did, "did");
            if (type == 21) {
                Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
                if (numValueOf != null && numValueOf.intValue() == 10) {
                    dg4 dg4VarR = packet.r();
                    if (dg4VarR == null || (gg4VarQ = dg4VarR.q()) == null) {
                        return false;
                    }
                    String[] strArr = gg4VarQ.c;
                    Logger.i("DeviceSettingsComponent", "request fall detection, contact size: " + (strArr != null ? Integer.valueOf(strArr.length) : null));
                    int i = gg4VarQ.d;
                    FallDetectionHelper fallDetectionHelper = FallDetectionHelper.INSTANCE;
                    if (i == fallDetectionHelper.getREASON_FALL_DETECTION()) {
                        fallDetectionHelper.applyFallDetection(gg4VarQ);
                        return true;
                    }
                    if (i == fallDetectionHelper.getREASON_ONLYSOS()) {
                        fallDetectionHelper.applySos(gg4VarQ);
                        return true;
                    }
                    if (i != fallDetectionHelper.getREASON_SHARE_DETECTION()) {
                        return true;
                    }
                    fallDetectionHelper.applyShareLocation(gg4VarQ);
                    return true;
                }
                if (numValueOf != null && numValueOf.intValue() == 11) {
                    Logger.i("DeviceSettingsComponent", "end fall detection");
                    FallDetectionHelper.INSTANCE.endFallDetectionHelp();
                }
            }
            return false;
        }
    };

    @NotNull
    private final DeviceSettingsComponent$mainSystemHandler$1 mainSystemHandler = new DeviceSettingsComponent$mainSystemHandler$1();

    @NotNull
    private final DeviceSettingsComponent$deviceSystemHandler$1 deviceSystemHandler = new DataHandlerWrapper() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$deviceSystemHandler$1
        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(String did, int type, s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (packet == null || packet.e != 2) {
                return false;
            }
            int i = packet.f;
            if (i == 43) {
                if ((packet.E().z().c & 1) != 0) {
                    Logger.i("DeviceSettingsComponent", "request phone mute");
                    PhoneMuteManager.syncMuteMode$default(PhoneMuteManager.INSTANCE, null, true, 1, null);
                }
                return true;
            }
            if (i != 45) {
                return false;
            }
            boolean z = packet.E().y().c.c;
            Logger.i("DeviceSettingsComponent", "modify phone mute: " + z);
            PhoneMuteManager.INSTANCE.modifyMuteMode(z);
            return true;
        }
    };

    @NotNull
    private final PackageInstalledReceiver receiver = new PackageInstalledReceiver();

    @NotNull
    private final Map<String, LFEventCallbackWrapper> ilfEventCallbacksDevice = new LinkedHashMap();

    @NotNull
    private final Map<String, LFEventCallbackWrapper> ilfEventCallbacks = new LinkedHashMap();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/DeviceSettingsComponent$Companion;", "", "<init>", "()V", "TAG", "", "SERVER_ACTION", "SERVER_PACKAGE", "SERVER_CLASSNAME", "unlockVersion", "", "isSupportUnlockPhone", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isSupportUnlockPhone() {
            Logger.i(DeviceSettingsComponent.TAG, "isSupportUnlockPhone by unlockVersion:" + DeviceSettingsComponent.unlockVersion);
            return DeviceSettingsComponent.unlockVersion >= 1;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\b\u001a\u00020\t2\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000ej\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000bH\u0016¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/DeviceSettingsComponent$IChangerListenerWrapperImpl;", "Lcom/xiaomi/fitness/device/manager/export/ChangeListenerWrapper;", "did", "", "<init>", "(Ljava/lang/String;)V", "getDid", "()Ljava/lang/String;", "onChange", "", "settings", "Lkotlin/collections/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Ljava/util/HashMap;", "(Ljava/util/HashMap;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IChangerListenerWrapperImpl extends ChangeListenerWrapper {

        @NotNull
        private final String did;

        public IChangerListenerWrapperImpl(@NotNull String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            this.did = did;
        }

        @NotNull
        public final String getDid() {
            return this.did;
        }

        @Override // com.xiaomi.fitness.device.manager.export.ChangeListenerWrapper
        public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Settings settings2 = settings.get(SettingsGroupType.HEALTH);
            Health health = settings2 instanceof Health ? (Health) settings2 : null;
            if (health != null) {
                HealthSettingChangeHandler.INSTANCE.handleSettingChanged(this.did, health);
            }
            Settings settings3 = settings.get(SettingsGroupType.LANGUAGE);
            SettingsLanguageV2 settingsLanguageV2 = settings3 instanceof SettingsLanguageV2 ? (SettingsLanguageV2) settings3 : null;
            if (settingsLanguageV2 != null) {
                LanguageSettingChangeHandler.INSTANCE.handleSettingChanged(this.did, settingsLanguageV2);
            }
            Settings settings4 = settings.get(SettingsGroupType.DISPLAY);
            DisplayAndBrightnessV2 displayAndBrightnessV2 = settings4 instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) settings4 : null;
            if (displayAndBrightnessV2 != null) {
                DisplaySettingChangeHandler.INSTANCE.handleSettingChanged(this.did, displayAndBrightnessV2);
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/DeviceSettingsComponent$ILFEventCallbackImpl;", "Lcom/xiaomi/fitness/device/manager/export/LFEventCallbackWrapper;", "did", "", "<init>", "(Ljava/lang/String;)V", "getDid", "()Ljava/lang/String;", "onAlarmChange", "", "arrayList", "", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "onSettingsChange", "empty", "", "onFindPhone", "isStart", "phoneMuteState", "onReminderChange", "remindList", "Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ILFEventCallbackImpl extends LFEventCallbackWrapper {

        @NotNull
        private final String did;

        public ILFEventCallbackImpl(@NotNull String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            this.did = did;
        }

        @NotNull
        public final String getDid() {
            return this.did;
        }

        @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper
        public void onAlarmChange(@Nullable List<? extends AlarmClockExt> arrayList) {
            String did;
            Logger.i(DeviceSettingsComponent.TAG, "onAlarmChange:" + (arrayList != null ? Integer.valueOf(arrayList.size()) : "0"));
            AlarmSetting defaultAlarmClocks = HuamiDeviceTool.INSTANCE.getDefaultAlarmClocks();
            if (arrayList == null || !(!arrayList.isEmpty())) {
                return;
            }
            Iterator<? extends AlarmClockExt> it = arrayList.iterator();
            while (it.hasNext()) {
                AlarmSettingItem alarmSettingItemClockExtToClockBean = HuamiDeviceTool.INSTANCE.clockExtToClockBean(it.next());
                defaultAlarmClocks.replaceItem(alarmSettingItemClockExtToClockBean, alarmSettingItemClockExtToClockBean.getId());
            }
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
                return;
            }
            DeviceSettingsSyncer.INSTANCE.setDeviceAlarmSyncSrc(did, 2);
            DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(did, DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK, defaultAlarmClocks);
            HuamiDeviceTool huamiDeviceTool = HuamiDeviceTool.INSTANCE;
            List<AlarmSettingItem> alarmItems = defaultAlarmClocks.getAlarmItems();
            Intrinsics.checkNotNullExpressionValue(alarmItems, "getAlarmItems(...)");
            ld8.c().l(new y08(huamiDeviceTool.getVisibleAlarmClock(alarmItems)));
        }

        @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
        public void onFindPhone(boolean isStart) {
            Logger.i(DeviceSettingsComponent.TAG, "onFindPhone onMainProcess");
        }

        @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper
        public void onReminderChange(@Nullable List<? extends HMReminderInfo> remindList) {
            List<? extends HMReminderInfo> list;
            Logger.i(DeviceSettingsComponent.TAG, "onReminderChange remindList.size = " + (remindList != null ? Integer.valueOf(remindList.size()) : null));
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (list = remindList) == null || list.isEmpty()) {
                return;
            }
            EventMinderUtil.INSTANCE.getEventMinderModel().updateMindersByXiaoAiSetting(wearableDeviceModel, DeviceModelExtKt.toEventMinderList(remindList));
        }

        @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
        public void onSettingsChange(boolean empty) {
            Logger.i(DeviceSettingsComponent.TAG, "onSettingsChange");
            ScopeExtKt.scope$default(null, new DeviceSettingsComponent$ILFEventCallbackImpl$onSettingsChange$1(null), 1, null);
        }

        @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
        public void phoneMuteState() {
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$initTask$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$initTask$3", f = "DeviceSettingsComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceSettingsComponent.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceSettingsComponent.this.initUnlockServiceVersion();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChangeListenerWrapper getChangeListenerWrapper(String did) {
        ChangeListenerWrapper changeListenerWrapper = this.mChangeListenerWrappers.get(did);
        if (changeListenerWrapper != null) {
            return changeListenerWrapper;
        }
        IChangerListenerWrapperImpl iChangerListenerWrapperImpl = new IChangerListenerWrapperImpl(did);
        this.mChangeListenerWrappers.put(did, iChangerListenerWrapperImpl);
        return iChangerListenerWrapperImpl;
    }

    private final void initComponentState() {
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        regionPreference.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: vd6
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                DeviceSettingsComponent.initComponentState$lambda$0(sharedPreferences, str);
            }
        });
        ComponentState.INSTANCE.enableComponent(regionPreference.getPRIVACY_AGREE(), LanguageReceiver.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initComponentState$lambda$0(SharedPreferences sharedPreferences, String str) {
        final RegionPreference regionPreference = RegionPreference.INSTANCE;
        if (Intrinsics.areEqual(str, SpExtKt.getKey(new MutablePropertyReference0Impl(regionPreference) { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$initComponentState$1$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((RegionPreference) this.receiver).getPRIVACY_AGREE());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((RegionPreference) this.receiver).setPRIVACY_AGREE(((Boolean) obj).booleanValue());
            }
        }))) {
            Logger.i("DeviceSettingsComponet", "initComponentState() called with:  key = " + str);
            ComponentState.INSTANCE.enableComponent(regionPreference.getPRIVACY_AGREE(), LanguageReceiver.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTask$lambda$1(boolean z) {
        if (!z) {
            AnyExtKt.io$default(null, new DeviceSettingsComponent$initTask$1$1(null), 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTask$lambda$2(DeviceSettingsComponent this$0, String activity, String lifecycle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        AnyExtKt.io$default(null, new DeviceSettingsComponent$initTask$2$1(this$0, activity, lifecycle, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initUnlockServiceVersion() {
        boolean z = false;
        if (RomUtils.isXiaomi()) {
            Intent intent = new Intent("miui.bluetooth.mible.BluetoothUnlockService");
            intent.setComponent(new ComponentName("com.xiaomi.bluetooth", "com.android.bluetooth.ble.BluetoothUnlockService"));
            if (AppUtil.getApp().getApplicationContext().getPackageManager().resolveService(intent, 0) != null) {
                z = true;
            }
        }
        Logger.i(TAG, "initUnlockServiceVersion support:" + z);
        if (z) {
            Intent intent2 = new Intent("miui.bluetooth.mible.BluetoothUnlockService");
            intent2.setComponent(new ComponentName("com.xiaomi.bluetooth", "com.android.bluetooth.ble.BluetoothUnlockService"));
            AppUtil.getApp().bindService(intent2, new ServiceConnection() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent.initUnlockServiceVersion.1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName name, IBinder service) {
                    puc pucVarS2 = puc.a.s2(service);
                    if (pucVarS2 != null) {
                        try {
                            Companion companion = DeviceSettingsComponent.INSTANCE;
                            DeviceSettingsComponent.unlockVersion = pucVarS2.getVersion();
                            Logger.i(DeviceSettingsComponent.TAG, "initUnlockServiceVersion version:" + DeviceSettingsComponent.unlockVersion);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                    AppUtil.getApp().unbindService(this);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName name) {
                }
            }, 1);
        }
    }

    @JvmStatic
    public static final boolean isSupportUnlockPhone() {
        return INSTANCE.isSupportUnlockPhone();
    }

    private final void registerPackageChangeReceiver(String did) {
        boolean z = (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(did) & 524288) != 0;
        Logger.i(TAG, "isSupportSyncRecord " + z);
        if (RomUtils.INSTANCE.isAtLeastHyperOS2(ApplicationExtKt.getApplication()) && z) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addDataScheme("package");
            ApplicationExtKt.getApplication().registerReceiver(this.receiver, intentFilter);
            this.registerPackageReceiver = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncMiuiTodoIfNeed() {
        Logger.i(TAG, "sync onStart syncMiuiTodoIfNeed..");
        if (TodoExtKt.getShowMiuiTodoEntranceEnable()) {
            MiuiTodoSyncDeviceManager.INSTANCE.syncMiuiTodoListToDeviceIfNeed(MiuiTodoSettingHelper.INSTANCE.queryCurrentDeviceMiuiTodoSwitchStatus());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterPackageChangeReceiver() {
        if (this.registerPackageReceiver) {
            Logger.i(TAG, "unregisterPackageChangeReceiver");
            try {
                ApplicationExtKt.getApplication().unregisterReceiver(this.receiver);
            } catch (Exception e) {
                Logger.e(TAG, e.getMessage());
            }
            this.registerPackageReceiver = false;
        }
    }

    public final int getActivityCount() {
        return this.activityCount;
    }

    @NotNull
    public final LFEventCallbackWrapper getEventCallback(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        LFEventCallbackWrapper lFEventCallbackWrapper = this.ilfEventCallbacks.get(did);
        if (lFEventCallbackWrapper != null) {
            return lFEventCallbackWrapper;
        }
        ILFEventCallbackImpl iLFEventCallbackImpl = new ILFEventCallbackImpl(did);
        this.ilfEventCallbacks.put(did, iLFEventCallbackImpl);
        return iLFEventCallbackImpl;
    }

    @NotNull
    public final LFEventCallbackWrapper getEventCallbackDevice(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        LFEventCallbackWrapper lFEventCallbackWrapper = this.ilfEventCallbacksDevice.get(did);
        if (lFEventCallbackWrapper != null) {
            return lFEventCallbackWrapper;
        }
        DeviceProgressCallBack deviceProgressCallBack = new DeviceProgressCallBack();
        this.ilfEventCallbacksDevice.put(did, deviceProgressCallBack);
        return deviceProgressCallBack;
    }

    @NotNull
    public final DeviceSettingManager.UpdateDeviceSettingListener getUpdateListener() {
        return this.updateListener;
    }

    public final void handleLifeCycle(@NotNull String activity, @NotNull String lifecycle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_START)) {
            this.activityCount++;
            return;
        }
        if (Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_STOP)) {
            int i = this.activityCount - 1;
            this.activityCount = i;
            if (i == 0 && StringsKt__StringsKt.contains$default((CharSequence) activity, (CharSequence) KeepAliveService.MAIN_ACTIVITY, false, 2, (Object) null) && AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                Logger.i(TAG, "app on background , sendUnUploadSettingItems");
                DeviceSettingManager.INSTANCE.getInstance().sendUnUploadSettingItems();
            }
        }
    }

    @ComponentTask(notLaterThan = 2, processName = ":device")
    public final void initClockDataHandler() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(17, this.clockDataHandler);
        initComponentState();
    }

    @ComponentTask(notEarlierThan = 4, notLaterThan = 4, onMainThread = true, processName = ":device")
    public final void initDeviceDataHandler() {
        Logger.i(TAG, "initDeviceDataHandler on device");
        DeviceContact.Companion companion = DeviceContact.INSTANCE;
        DeviceSyncExtKt.getInstance(companion).addDataHandler(23, this.interconnectionDataHandler);
        DeviceSyncExtKt.getInstance(companion).addDataHandler(21, this.miuiSosDataHandler);
        DeviceSyncExtKt.getInstance(companion).addDataHandler(21, this.fallDetectionDataHandler);
        DeviceSyncExtKt.getInstance(companion).addDataHandler(2, this.deviceSystemHandler);
        RecorderBigDataHandler recorderBigDataHandler = new RecorderBigDataHandler();
        DeviceSyncExtKt.getInstance(companion).addDataHandler(22, recorderBigDataHandler);
        DeviceSyncExtKt.getInstance(companion).addDataHandler(104, recorderBigDataHandler);
        DeviceSyncExtKt.getInstance(companion).addDataHandler(18, recorderBigDataHandler);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnDeviceFullStatusListener() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent.initDeviceDataHandler.1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                DeviceSettingManager.INSTANCE.getInstance().addUpdateDeviceListener(DeviceSettingsComponent.this.getUpdateListener());
                if (did == null || did.length() == 0) {
                    return;
                }
                WearableDeviceManager.Companion companion2 = WearableDeviceManager.INSTANCE;
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion2).getDeviceModel(did);
                if (wearableDeviceModel == null) {
                    return;
                }
                if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                    HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion2).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
                    LFEventCallbackWrapper eventCallbackDevice = DeviceSettingsComponent.this.getEventCallbackDevice(did);
                    Logger.i(DeviceSettingsComponent.TAG, "deviceProgressCallBack did:" + eventCallbackDevice);
                    if (huaMiApiCaller != null) {
                        huaMiApiCaller.addLFEventCallback(eventCallbackDevice);
                    }
                    Logger.d(DeviceSettingsComponent.TAG, "huami startHttpProxy and setToken:" + did);
                    AnyExtKt.io$default(null, new DeviceSettingsComponent$initDeviceDataHandler$1$onConnectSuccess$1(huaMiApiCaller, wearableDeviceModel, did, null), 1, null);
                } else if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel) || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
                    PhoneMuteManager.syncMuteMode$default(PhoneMuteManager.INSTANCE, wearableDeviceModel, false, 2, null);
                    AnyExtKt.io$default(null, new DeviceSettingsComponent$initDeviceDataHandler$1$onConnectSuccess$2(wearableDeviceModel, null), 1, null);
                }
                AnyExtKt.io$default(null, new DeviceSettingsComponent$initDeviceDataHandler$1$onConnectSuccess$3(wearableDeviceModel, null), 1, null);
                ExistRecordSyncer.INSTANCE.sync(did);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onDestroy(String did, boolean isRemoved) {
                super.onDestroy(did, isRemoved);
                Logger.i(DeviceSettingsComponent.TAG, "addDeviceStatusListener onDestroy did:" + did + " isRemoved:" + isRemoved);
                if (!isRemoved || did == null) {
                    return;
                }
                SyncPreference.INSTANCE.setNeedSyncWeather(did, false);
                DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
                deviceSettingsPreference.setLimitBindStatus(did, false);
                deviceSettingsPreference.isZenModeOpen(did, false);
                VibrateSpUtils.INSTANCE.initVibrateSettings(did);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
                HuamiApiCaller huaMiApiCaller;
                DeviceSettingManager.INSTANCE.getInstance().removeUpdateDeviceListener(DeviceSettingsComponent.this.getUpdateListener());
                if (did != null) {
                    WearableDeviceManager.Companion companion2 = WearableDeviceManager.INSTANCE;
                    WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion2).getDeviceModel(did);
                    if (wearableDeviceModel == null) {
                        return;
                    }
                    if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel) && (huaMiApiCaller = DeviceManagerExtKt.getInstance(companion2).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel))) != null) {
                        huaMiApiCaller.stopHttpProxy();
                    }
                    AnyExtKt.io$default(null, new DeviceSettingsComponent$initDeviceDataHandler$1$onDisconnect$1(null), 1, null);
                }
                DeviceSettingsComponent.this.unregisterPackageChangeReceiver();
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onInit(String did, boolean isReadded) {
                super.onInit(did, isReadded);
                Logger.i(DeviceSettingsComponent.TAG, "addDeviceStatusListener onInit did:" + did + " isReadded:" + isReadded);
                if (!isReadded || did == null) {
                    return;
                }
                DeviceSettingsPreference.INSTANCE.setLimitBindStatus(did, false);
            }
        });
    }

    @ComponentTask(notEarlierThan = 2, notLaterThan = 2)
    public final void initTask() {
        Logger.i(TAG, "initTask on main process");
        DeviceContact.Companion companion = DeviceContact.INSTANCE;
        DeviceSyncExtKt.getInstance(companion).addDataHandler(2, this.mainSystemHandler);
        final BigDataHandler bigDataHandler = new BigDataHandler();
        DeviceSyncExtKt.getInstance(companion).addDataHandler(22, bigDataHandler);
        DeviceSyncExtKt.getInstance(companion).addDataHandler(104, bigDataHandler);
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).addAccountListener(new Function1() { // from class: wd6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceSettingsComponent.initTask$lambda$1(((Boolean) obj).booleanValue());
            }
        });
        ZenUtils.INSTANCE.registerZenListener();
        AppManager.INSTANCE.getInstance().registerLifecycleListener(new Function2() { // from class: xd6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceSettingsComponent.initTask$lambda$2(this.f39011a, (String) obj, (String) obj2);
            }
        });
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass3(null));
        if (this.syncStateListener == null) {
            this.syncStateListener = new SyncStateListener() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent.initTask.4
                @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
                public void onFinish(String did, int code) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    AnyExtKt.io$default(null, new DeviceSettingsComponent$initTask$4$onFinish$1(did, null), 1, null);
                }

                @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
                public void onStart(String did) {
                    Intrinsics.checkNotNullParameter(did, "did");
                    Logger.i(DeviceSettingsComponent.TAG, "on device start sync:" + did + " " + Thread.currentThread().getName());
                    WearableDeviceManager.Companion companion2 = WearableDeviceManager.INSTANCE;
                    WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion2).getDeviceModel(did);
                    if (wearableDeviceModel == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                        AnyExtKt.io$default(null, new DeviceSettingsComponent$initTask$4$onStart$2(wearableDeviceModel, did, DeviceSettingsComponent.this, null), 1, null);
                        return;
                    }
                    Logger.i(DeviceSettingsComponent.TAG, "addLFEventCallback :" + did);
                    HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion2).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
                    if (huaMiApiCaller != null) {
                        huaMiApiCaller.addLFEventCallback(DeviceSettingsComponent.this.getEventCallback(did));
                    }
                    if (huaMiApiCaller != null) {
                        huaMiApiCaller.observeHealthSettingChange(DeviceSettingsComponent.this.getChangeListenerWrapper(did));
                    }
                    boolean settingItemUpdating = SettingItemPreference.INSTANCE.getSettingItemUpdating(did);
                    if (settingItemUpdating) {
                        Logger.i(DeviceSettingsComponent.TAG, "ItemUpdating:" + settingItemUpdating);
                        Unit unit = Unit.INSTANCE;
                        return;
                    }
                    Logger.i(DeviceSettingsComponent.TAG, "getHuamiSynced did:" + did + " false");
                    ScopeExtKt.scope$default(null, new DeviceSettingsComponent$initTask$4$onStart$1(did, null), 1, null);
                }

                @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
                public void onSyncing(String did, int progress) {
                    Intrinsics.checkNotNullParameter(did, "did");
                }
            };
        }
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(companion);
        SyncStateListener syncStateListener = this.syncStateListener;
        Intrinsics.checkNotNull(syncStateListener);
        deviceSyncExtKt.addSyncStateListener(syncStateListener);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsComponent.initTask.5
            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
                bigDataHandler.reset();
            }
        });
    }

    public final void setActivityCount(int i) {
        this.activityCount = i;
    }
}
