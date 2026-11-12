package com.xiaomi.fitness.sport_eco_manager;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.xiaomi.fit.fitness.eco.sync.export.api.EcoFitnessSyncer;
import com.xiaomi.fit.fitness.eco.sync.export.di.EcoFitnessSyncExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.motion.recognition.MotionRecognizer;
import com.xiaomi.fitness.motion.recognition.extensions.RecognizerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import com.xiaomi.hm.health.bt.sdk.ISportHrCallback;
import defpackage.bsc;
import defpackage.fs9;
import defpackage.ir9;
import defpackage.j7r;
import defpackage.psc;
import defpackage.sr9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001d\u0010\u0012J\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010\"J\r\u0010$\u001a\u00020\u001a¢\u0006\u0004\b$\u0010\u001cJ'\u0010)\u001a\u00020 2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J/\u0010/\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u00052\u0010\u0010-\u001a\f\u0012\u0006\b\u0001\u0012\u00020,\u0018\u00010+2\u0006\u0010\u001f\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020 2\u0006\u00101\u001a\u00020\u0010¢\u0006\u0004\b2\u00103J\u001b\u00106\u001a\u0004\u0018\u00010 2\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u001b\u00108\u001a\u0004\u0018\u00010 2\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b8\u00107J+\u00109\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010\u001f\u001a\u00020.¢\u0006\u0004\b9\u00100J%\u0010=\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010;\u001a\u00020:2\u0006\u0010\u001f\u001a\u00020<¢\u0006\u0004\b=\u0010>J'\u0010A\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010\u001f\u001a\u00020.¢\u0006\u0004\bA\u0010BR\u0013\u0010F\u001a\u0004\u0018\u00010C8G¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010J\u001a\u0004\u0018\u00010G8G¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/SportDeviceModel;", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "curDeviceModelOld", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "curDeviceModel", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "curGymDeviceModel", "", "curDeviceDid", "()Ljava/lang/String;", "did", "getDeviceModelByDid", "(Ljava/lang/String;)Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "deviceModel", "", "isHuami", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)Z", MediaMetaData.IS_LOCAL, "isBle", "isEcg", "isWearOS", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceContact;", "getDeviceSyncManager", "()Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceContact;", "Lcom/xiaomi/fit/fitness/eco/sync/export/api/EcoFitnessSyncer;", "getFitnessSyncer", "()Lcom/xiaomi/fit/fitness/eco/sync/export/api/EcoFitnessSyncer;", "isDeviceConnected", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addDeviceStatusListener", "(Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;)V", "removeDeviceStatusListener", "fitnessSyncer", "", DailyRecordKey.sportType, "Lj7r;", "callBack", "isSupportLaunchSport", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;ILj7r;)V", "", "Lfs9;", "gymSettingsList", "Lbsc;", "hasLock", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;[Lfs9;Lbsc;)V", "isOpen", "setMotionRecognizer", "(Z)V", "Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;", "huamiCallback", "startHr", "(Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;)Lkotlin/Unit;", "stopHr", "hasEcoGymSetting", "Lsr9;", "ftpState", "Lpsc;", "hasFtpState", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Lsr9;Lpsc;)V", "Lir9;", "deviceFault", "hasDeviceFault", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Lir9;Lbsc;)V", "Lcom/xiaomi/hm/health/bt/sdk/HuamiDevice;", "getHuamiApiCaller", "()Lcom/xiaomi/hm/health/bt/sdk/HuamiDevice;", "huamiApiCaller", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "getHuamiCaller", "()Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "huamiCaller", "<init>", "()V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDeviceModel {

    @NotNull
    public static final SportDeviceModel INSTANCE = new SportDeviceModel();

    private SportDeviceModel() {
    }

    @JvmStatic
    @Nullable
    public static final HuamiDevice getHuamiApiCaller() {
        return null;
    }

    @JvmStatic
    @Nullable
    public static final HuamiApiCaller getHuamiCaller() {
        String mac;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (mac = DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            mac = "";
        }
        return deviceManagerExtKt.getHuaMiApiCaller(mac);
    }

    public static /* synthetic */ Unit startHr$default(SportDeviceModel sportDeviceModel, ISportHrCallback iSportHrCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            iSportHrCallback = null;
        }
        return sportDeviceModel.startHr(iSportHrCallback);
    }

    public static /* synthetic */ Unit stopHr$default(SportDeviceModel sportDeviceModel, ISportHrCallback iSportHrCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            iSportHrCallback = null;
        }
        return sportDeviceModel.stopHr(iSportHrCallback);
    }

    public final void addDeviceStatusListener(@NotNull OnEcoDeviceStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(listener);
    }

    @Nullable
    public final String curDeviceDid() {
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (ecoDeviceModel != null) {
            return ecoDeviceModel.getDid();
        }
        return null;
    }

    @Nullable
    public final EcoDeviceModel curDeviceModel() {
        return (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @Nullable
    public final WearableDeviceModel curDeviceModelOld() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @Nullable
    public final EcoDeviceModel curGymDeviceModel() {
        return EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
    }

    @NotNull
    public final EcoFitnessSyncer fitnessSyncer() {
        return EcoFitnessSyncExtKt.getInstance(EcoFitnessSyncer.INSTANCE);
    }

    @Nullable
    public final EcoDeviceModel getDeviceModelByDid(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
    }

    @NotNull
    public final EcoDeviceContact getDeviceSyncManager() {
        return EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE);
    }

    @NotNull
    public final EcoFitnessSyncer getFitnessSyncer() {
        return EcoFitnessSyncExtKt.getInstance(EcoFitnessSyncer.INSTANCE);
    }

    public final void hasDeviceFault(@NotNull EcoDeviceModel deviceModel, @Nullable ir9 deviceFault, @NotNull bsc listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.xiaomi.fitness.sport_eco_manager.extension.DeviceModelExtKt.ecoDeviceFault(deviceModel, deviceFault, listener);
    }

    public final void hasEcoGymSetting(@NotNull EcoDeviceModel deviceModel, @NotNull fs9[] gymSettingsList, @NotNull bsc listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(gymSettingsList, "gymSettingsList");
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.xiaomi.fitness.sport_eco_manager.extension.DeviceModelExtKt.ecoGymSetting(deviceModel, gymSettingsList, listener);
    }

    public final void hasFtpState(@NotNull EcoDeviceModel deviceModel, @NotNull sr9 ftpState, @NotNull psc listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(ftpState, "ftpState");
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.xiaomi.fitness.sport_eco_manager.extension.DeviceModelExtKt.ftpState(deviceModel, ftpState, listener);
    }

    public final void hasLock(@NotNull EcoDeviceModel deviceModel, @Nullable fs9[] gymSettingsList, @NotNull bsc listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.xiaomi.fitness.sport_eco_manager.extension.DeviceModelExtKt.locks(deviceModel, gymSettingsList, listener);
    }

    public final boolean isBle(@Nullable EcoDeviceModel deviceModel) {
        return (deviceModel != null && EcoDeviceModelExtKt.isBle(deviceModel)) || (deviceModel != null && EcoDeviceModelExtKt.isBluetooth(deviceModel));
    }

    public final boolean isDeviceConnected(@Nullable EcoDeviceModel deviceModel) {
        if (deviceModel != null) {
            return deviceModel.getIsDeviceConnected();
        }
        return false;
    }

    public final boolean isEcg(@NotNull EcoDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return EcoDeviceModelExtKt.isEcg(deviceModel);
    }

    public final boolean isHuami(@Nullable EcoDeviceModel deviceModel) {
        if (deviceModel != null) {
            return EcoDeviceModelExtKt.isHuaMi(deviceModel);
        }
        return false;
    }

    public final boolean isLocal(@Nullable EcoDeviceModel deviceModel) {
        if (deviceModel != null) {
            return EcoDeviceModelExtKt.isLocalDevice(deviceModel);
        }
        return false;
    }

    public final void isSupportLaunchSport(@Nullable EcoDeviceModel deviceModel, int sportType, @NotNull j7r callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (deviceModel == null) {
            callBack.a(Boolean.FALSE);
        } else if (deviceModel.getIsDeviceConnected()) {
            com.xiaomi.fitness.sport_eco_manager.extension.DeviceModelExtKt.isSupportLaunchSport(deviceModel, sportType, callBack);
        } else {
            callBack.a(Boolean.FALSE);
        }
    }

    public final boolean isWearOS(@Nullable EcoDeviceModel deviceModel) {
        if (deviceModel != null) {
            return EcoDeviceModelExtKt.isWearOS(deviceModel);
        }
        return false;
    }

    public final void removeDeviceStatusListener(@NotNull OnEcoDeviceStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).removeDeviceStatusListener(listener);
    }

    public final void setMotionRecognizer(boolean isOpen) {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        RecognizerExtKt.getInstance(MotionRecognizer.INSTANCE).setStart(isOpen);
    }

    @Nullable
    public final Unit startHr(@Nullable ISportHrCallback huamiCallback) {
        WearableDeviceModel wearableDeviceModelCurDeviceModelOld = curDeviceModelOld();
        if (wearableDeviceModelCurDeviceModelOld == null) {
            return null;
        }
        com.xiaomi.fitness.sport_eco_manager.extension.DeviceModelExtKt.startDeviceHr$default(wearableDeviceModelCurDeviceModelOld, null, 1, null);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Unit stopHr(@Nullable ISportHrCallback huamiCallback) {
        WearableDeviceModel wearableDeviceModelCurDeviceModelOld = curDeviceModelOld();
        if (wearableDeviceModelCurDeviceModelOld == null) {
            return null;
        }
        com.xiaomi.fitness.sport_eco_manager.extension.DeviceModelExtKt.stopDeviceHr(wearableDeviceModelCurDeviceModelOld);
        return Unit.INSTANCE;
    }
}
