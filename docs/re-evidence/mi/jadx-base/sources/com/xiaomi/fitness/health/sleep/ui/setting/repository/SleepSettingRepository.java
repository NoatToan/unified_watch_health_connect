package com.xiaomi.fitness.health.sleep.ui.setting.repository;

import androidx.lifecycle.LiveData;
import com.xiaomi.fit.fitness.export.sleepsnore.SleepSnoreAudioAutoDeleteSP;
import com.xiaomi.fit.fitness.export.utils.SleepAudioFileUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepSettingRepository;
import com.xiaomi.fitness.health.sleep.utils.SleepSettingPreference;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import com.xiaomi.fitness.sleep.trace.SleepTracer;
import com.xiaomi.fitness.sleep.trace.extensions.TraceExtKt;
import defpackage.dt9;
import defpackage.ls9;
import defpackage.s7r;
import defpackage.ur9;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u0016\u001a\u00020\u000bJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aJ\"\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u001dJ\"\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u001dJ$\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u001dH\u0002J$\u0010 \u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u001dH\u0002J\u0006\u0010!\u001a\u00020\u0010J\"\u0010\"\u001a\u00020\r2\u001a\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\r0\u001d0#J,\u0010$\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u001a\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\r0\u001d0#H\u0002J,\u0010%\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u001a\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\r0\u001d0#H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "", "<init>", "()V", "mSleepTracer", "Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "getMSleepTracer", "()Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "mSleepTracer$delegate", "Lkotlin/Lazy;", "getAutoClearAudioFileValue", "", "setAutoClearAudioFileEnabled", "", "enabled", "getSleepSnoreSwitchStatus", "", "getSnoreDetectSwitchStateLiveData", "Landroidx/lifecycle/LiveData;", "setSnoreAndSleepWordsDetectionStatusToSP", "status", "setDeepLightSleepDetectEnable", "getDeepLightDetectEnable", "getDeepLightDetectEnableLiveData", "getSleepAssistSwitchOnlyAppCache", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "loadSleepAssistSwitchWithAppCache", "callback", "Lkotlin/Function1;", "loadSleepAssistSwitchOnlyDevice", "loadHuaMiAssistSleepSwitch", "loadBleAssistSleepSwitch", "getSleepGoal", "loadPressureSwitchOnlyDevice", "Ljava/lang/ref/WeakReference;", "loadBleAssistPressureSwitch", "loadHuaMiPressureSwitch", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepSettingRepository {

    @NotNull
    public static final String TAG = "SleepSettingRepo";

    /* JADX INFO: renamed from: mSleepTracer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepTracer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yxm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepSettingRepository.mSleepTracer_delegate$lambda$0();
        }
    });

    private final SleepTracer getMSleepTracer() {
        return (SleepTracer) this.mSleepTracer.getValue();
    }

    private final void loadBleAssistPressureSwitch(WearableDeviceModel deviceModel, final WeakReference<Function1<Boolean, Unit>> callback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 14;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), deviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepSettingRepository.loadBleAssistPressureSwitch.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(SleepSettingRepository.TAG, "loadBleAssistPressureSwitch onError " + code);
                Function1<Boolean, Unit> function1 = callback.get();
                if (function1 != null) {
                    function1.invoke2(null);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                ur9 ur9VarU;
                dt9 dt9VarI = (result == null || (packet = result.getPacket()) == null || (ur9VarU = packet.u()) == null) ? null : ur9VarU.I();
                Logger.i(SleepSettingRepository.TAG, "loadBleAssistPressureSwitch onSuccess " + dt9VarI);
                Function1<Boolean, Unit> function1 = callback.get();
                if (function1 != null) {
                    function1.invoke2(dt9VarI != null ? Boolean.valueOf(dt9VarI.c) : null);
                }
            }
        }, 0, 16, (Object) null);
    }

    private final void loadBleAssistSleepSwitch(WearableDeviceModel deviceModel, Function1<? super Boolean, Unit> callback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 10;
        final SoftReference softReference = new SoftReference(callback);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), deviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepSettingRepository.loadBleAssistSleepSwitch.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(SleepSettingRepository.TAG, "loadAssistSleepSwitch onError " + code);
                Function1<Boolean, Unit> function1 = softReference.get();
                if (function1 != null) {
                    function1.invoke2(Boolean.FALSE);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                ur9 ur9VarU;
                ls9 ls9VarZ;
                Unit unit;
                if (result != null && (packet = result.getPacket()) != null && (ur9VarU = packet.u()) != null && (ls9VarZ = ur9VarU.z()) != null) {
                    SoftReference<Function1<Boolean, Unit>> softReference2 = softReference;
                    ls9.a aVar = ls9VarZ.j;
                    boolean z = aVar != null ? aVar.c : false;
                    Logger.i(SleepSettingRepository.TAG, "loadAssistSleepSwitch onSuccess " + z + " " + softReference2.get());
                    Function1<Boolean, Unit> function1 = softReference2.get();
                    if (function1 != null) {
                        function1.invoke2(Boolean.valueOf(z));
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        return;
                    }
                }
                Function1<Boolean, Unit> function2 = softReference.get();
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }, 0, 16, (Object) null);
    }

    private final void loadHuaMiAssistSleepSwitch(WearableDeviceModel deviceModel, Function1<? super Boolean, Unit> callback) {
        SettingItemEntity settingItemValue = DeviceSettingManager.INSTANCE.getInstance().readSettingItemValue(deviceModel.getDid(), DeviceSettingConfigKey.KE_HRDETECT);
        HRDetect hRDetect = (HRDetect) (settingItemValue != null ? settingItemValue.valueToObject(HRDetect.class) : null);
        Logger.i(TAG, "loadHuaMiAssistSleepSwitch" + hRDetect);
        SoftReference softReference = new SoftReference(callback);
        if (hRDetect == null) {
            Function1 function1 = (Function1) softReference.get();
            if (function1 != null) {
                function1.invoke2(Boolean.FALSE);
                return;
            }
            return;
        }
        int type = hRDetect.getType();
        Function1 function2 = (Function1) softReference.get();
        if (function2 != null) {
            boolean z = true;
            if (type != 1 && type != 3) {
                z = false;
            }
            function2.invoke2(Boolean.valueOf(z));
        }
    }

    private final void loadHuaMiPressureSwitch(WearableDeviceModel deviceModel, WeakReference<Function1<Boolean, Unit>> callback) {
        SettingItemEntity settingItemValue = DeviceSettingManager.INSTANCE.getInstance().readSettingItemValue(deviceModel.getDid(), DeviceSettingConfigKey.KE_HRDETECT);
        Object objValueToObject = settingItemValue != null ? settingItemValue.valueToObject(HRDetect.class) : null;
        HRDetect hRDetect = objValueToObject instanceof HRDetect ? (HRDetect) objValueToObject : null;
        Function1<Boolean, Unit> function1 = callback.get();
        if (function1 != null) {
            function1.invoke2(hRDetect != null ? Boolean.valueOf(hRDetect.isPressureEnable()) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepTracer mSleepTracer_delegate$lambda$0() {
        return TraceExtKt.getInstance(SleepTracer.INSTANCE);
    }

    public final boolean getAutoClearAudioFileValue() {
        return SleepSnoreAudioAutoDeleteSP.INSTANCE.getAUTO_CLEAN_AUDIO_FILE();
    }

    public final boolean getDeepLightDetectEnable() {
        return getMSleepTracer().isDeepLightSleepDetectionEnable();
    }

    @NotNull
    public final LiveData<Boolean> getDeepLightDetectEnableLiveData() {
        return new DeepLightDetectEnableLiveData();
    }

    public final boolean getSleepAssistSwitchOnlyAppCache(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return SleepSettingPreference.INSTANCE.getLastSleepAssistSwitchStatus(deviceModel.getDid());
    }

    public final int getSleepGoal() {
        boolean zIsLogin = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin();
        int dailySleepGoal = zIsLogin ? UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getDailySleepGoal() : HealthPrefer.INSTANCE.getSLEEP_GOAL_TIME_LOCAL();
        if (zIsLogin && dailySleepGoal == 0) {
            return 480;
        }
        return dailySleepGoal;
    }

    public final int getSleepSnoreSwitchStatus() {
        return getMSleepTracer().getSnoreDetectionStatus();
    }

    @NotNull
    public final LiveData<Integer> getSnoreDetectSwitchStateLiveData() {
        return new SleepSnoreSwitchStateLiveData();
    }

    public final void loadPressureSwitchOnlyDevice(@NotNull WeakReference<Function1<Boolean, Unit>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            Function1<Boolean, Unit> function1 = callback.get();
            if (function1 != null) {
                function1.invoke2(null);
                return;
            }
            return;
        }
        if (!DeviceModelExtKt.isHuaMi(wearableDeviceModel) && !com.xiaomi.fitness.util.DeviceModelExtKt.isSupportPressureMonitor(wearableDeviceModel)) {
            Function1<Boolean, Unit> function2 = callback.get();
            if (function2 != null) {
                function2.invoke2(null);
                return;
            }
            return;
        }
        if (wearableDeviceModel.getIsDeviceConnected()) {
            if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                loadHuaMiPressureSwitch(wearableDeviceModel, callback);
                return;
            } else {
                loadBleAssistPressureSwitch(wearableDeviceModel, callback);
                return;
            }
        }
        Function1<Boolean, Unit> function3 = callback.get();
        if (function3 != null) {
            function3.invoke2(null);
        }
    }

    public final void loadSleepAssistSwitchOnlyDevice(@NotNull WearableDeviceModel deviceModel, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (deviceModel.getIsDeviceConnected()) {
            if (DeviceModelExtKt.isHuaMi(deviceModel)) {
                loadHuaMiAssistSleepSwitch(deviceModel, callback);
            } else {
                loadBleAssistSleepSwitch(deviceModel, callback);
            }
        }
    }

    public final void loadSleepAssistSwitchWithAppCache(@NotNull WearableDeviceModel deviceModel, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (deviceModel.getIsDeviceConnected()) {
            loadSleepAssistSwitchOnlyDevice(deviceModel, callback);
        } else {
            callback.invoke2(Boolean.valueOf(SleepSettingPreference.INSTANCE.getLastSleepAssistSwitchStatus(deviceModel.getDid())));
        }
    }

    public final void setAutoClearAudioFileEnabled(boolean enabled) {
        SleepSnoreAudioAutoDeleteSP.INSTANCE.setAUTO_CLEAN_AUDIO_FILE(enabled);
        SleepAudioFileUtils.INSTANCE.checkSwitchAndDeleteAudioIfOver();
    }

    public final void setDeepLightSleepDetectEnable(boolean enabled) {
        getMSleepTracer().setDeepLightSleepDetectionEnable(enabled);
    }

    public final void setSnoreAndSleepWordsDetectionStatusToSP(int status) {
        getMSleepTracer().setSnoreDetectionStatus(status);
    }
}
