package com.xiaomi.fitness.devicesettings.di;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.bpremind.BloodPressureRemindDeviceHelper;
import com.xiaomi.fitness.devicesettings.export.model.DeviceBPRemind;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import defpackage.dxo;
import defpackage.s7r;
import defpackage.txo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u0017\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/di/DeviceSettingsSyncHelperImpl;", "Lcom/xiaomi/fitness/devicesettings/export/sync/DeviceSettingsSyncHelper;", "<init>", "()V", "setHuamiDeviceAlarmSyncSrc", "", "did", "", "source", "", "getHuamiGoalRemindEnable", "", "setBloodPressureRemind", "remind", "Lcom/xiaomi/fitness/devicesettings/export/model/DeviceBPRemind;", "getBloodPressureRemind", "oneTrackDeviceSetting", "syncPhoneNetState2Device", "isConnect", "(Ljava/lang/Boolean;)V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceSettingsSyncHelperImpl implements DeviceSettingsSyncHelper {

    @NotNull
    public static final String KEY_SYNC_ALARM_SRC = "huami_%s_sync_alarm_source";

    @NotNull
    public static final String TAG = "DeviceSettingsSyncHelperImpl";

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.di.DeviceSettingsSyncHelperImpl$oneTrackDeviceSetting$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.di.DeviceSettingsSyncHelperImpl$oneTrackDeviceSetting$1", f = "DeviceSettingsSyncHelperImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $currentDevice;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WearableDeviceModel wearableDeviceModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentDevice = wearableDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$currentDevice, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.80.1.1.34303");
            DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
            oneTrackExtKt.reportData(oneTrackStatBean, "name", "set_item_status", "notify_status", Boxing.boxInt(NotifyHelperExtKt.getNotificationManagerExport().isNotifySwitchStatusEnable() ? 1 : 0), "call_reminder_status", Boxing.boxInt(NotifyHelperExtKt.getNotificationManagerExport().isCallSwitchStatusEnable() ? 1 : 0), "donotdisturb_status", Boxing.boxInt(deviceSettingsPreference.isZenModeOpen(this.$currentDevice.getDid()) ? 1 : 0), "shcedule_status", Boxing.boxInt(deviceSettingsPreference.isNeedSyncSchedule() ? 1 : 0));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper
    @NotNull
    public String getBloodPressureRemind() {
        return DeviceSettingsPreference.INSTANCE.getDEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND();
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper
    public boolean getHuamiGoalRemindEnable() {
        return DeviceSettingsPreference.INSTANCE.getKEY_GOAL_REMIND_ENABLE();
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper
    public void oneTrackDeviceSetting() {
        String did;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null || did.length() == 0) {
            return;
        }
        AnyExtKt.io$default(null, new AnonymousClass1(wearableDeviceModel, null), 1, null);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper
    public void setBloodPressureRemind(@NotNull DeviceBPRemind remind) {
        Intrinsics.checkNotNullParameter(remind, "remind");
        BloodPressureRemindDeviceHelper.INSTANCE.updateBloodPressureMeasureRemindDataToDevice(remind);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper
    public void setHuamiDeviceAlarmSyncSrc(@NotNull String did, int source) {
        Intrinsics.checkNotNullParameter(did, "did");
        String str = String.format(KEY_SYNC_ALARM_SRC, did);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.d(TAG, "setHuamiDeviceAlarmSyncSrc " + did + " " + source);
        DeviceSettingsPreference.INSTANCE.putValue(str, Integer.valueOf(source));
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper
    public void syncPhoneNetState2Device(@Nullable Boolean isConnect) {
        String str;
        boolean zBooleanValue = isConnect != null ? isConnect.booleanValue() : NetworkExtKt.isNetworkAvailable();
        if (((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) != null) {
            dxo dxoVar = new dxo();
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 92;
            s7rVar.c0(new txo());
            if (zBooleanValue) {
                dxoVar.c = NetworkExtKt.isWifiConnected() ? 2 : 1;
            } else {
                dxoVar.c = 0;
            }
            int i = dxoVar.c;
            if (i != 1) {
                str = i != 2 ? "No Connect" : NetworkUtils.NETWORK_TYPE_WIFI;
            } else {
                str = "Mobile Data";
            }
            Logger.i(TAG, "Phone NetState change : " + str);
            s7rVar.E().d0(dxoVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.di.DeviceSettingsSyncHelperImpl$syncPhoneNetState2Device$1$1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(DeviceSettingsSyncHelperImpl.TAG, "sync Phone NetWorkState to Device onError did: " + did + " type: " + type + " code:" + code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i(DeviceSettingsSyncHelperImpl.TAG, "sync Phone NetWorkState to Device onSuccess ");
                }
            }, 0, 8, null);
        }
    }
}
