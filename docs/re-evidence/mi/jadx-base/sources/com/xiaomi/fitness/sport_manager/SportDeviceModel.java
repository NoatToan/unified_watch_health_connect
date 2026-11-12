package com.xiaomi.fitness.sport_manager;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fit.fitness.sync.export.di.FitnessSyncExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.motion.recognition.MotionRecognizer;
import com.xiaomi.fitness.motion.recognition.extensions.RecognizerExtKt;
import com.xiaomi.fitness.sport_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.hm.health.bt.sdk.ISportHrCallback;
import defpackage.f2o;
import defpackage.gs9;
import defpackage.i7r;
import defpackage.ptc;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\u0017¢\u0006\u0004\b#\u0010\u0019J'\u0010(\u001a\u00020\u001f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J/\u0010.\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u00022\u0010\u0010,\u001a\f\u0012\u0006\b\u0001\u0012\u00020+\u0018\u00010*2\u0006\u0010\u001e\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\r¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u001b\u00107\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b8\u00109J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020:¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\r¢\u0006\u0004\b=\u0010\u001cJ\r\u0010>\u001a\u00020\r¢\u0006\u0004\b>\u0010\u001cJ\r\u0010?\u001a\u00020\r¢\u0006\u0004\b?\u0010\u001cJ!\u0010A\u001a\u00020\r2\u0012\u0010@\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060*\"\u00020\u0006¢\u0006\u0004\bA\u0010BR\u0013\u0010F\u001a\u0004\u0018\u00010C8G¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010H\u001a\u0004\u0018\u00010C8G¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0011\u0010I\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bI\u0010\u001c¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/SportDeviceModel;", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "curDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "curGymDeviceModel", "", "curDeviceDid", "()Ljava/lang/String;", "did", "getDeviceModelByDid", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "isHuami", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", MediaMetaData.IS_LOCAL, "isBle", "isEcg", "isWearOS", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "getDeviceSyncManager", "()Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "getFitnessSyncer", "()Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "isDeviceConnected", "isMainDeviceConnected", "()Z", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addDeviceStatusListener", "(Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;)V", "removeDeviceStatusListener", "fitnessSyncer", "", DailyRecordKey.sportType, "Li7r;", "callBack", "isSupportLaunchSport", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ILi7r;)V", "", "Lgs9;", "gymSettingsList", "Lptc;", "hasLock", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;[Lgs9;Lptc;)V", "isOpen", "setMotionRecognizer", "(Z)V", "Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;", "huamiCallback", "startHr", "(Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;)Lkotlin/Unit;", "stopHr", "isAccessoryDevice", "(Ljava/lang/String;)Z", "", "getAcessoryDeviceModels", "()Ljava/util/List;", "noMainDevice", "noDevice", "mainDeviceJoinSport", "permissions", "isPermissionGranted", "([Ljava/lang/String;)Z", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "getHuamiApiCaller", "()Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "huamiApiCaller", "getHuamiCaller", "huamiCaller", "isHasAccessoryDevices", "<init>", "()V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDeviceModel {

    @NotNull
    public static final SportDeviceModel INSTANCE = new SportDeviceModel();

    private SportDeviceModel() {
    }

    @JvmStatic
    @Nullable
    public static final HuamiApiCaller getHuamiApiCaller() {
        String mac;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (mac = DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            mac = "";
        }
        return deviceManagerExtKt.getHuaMiApiCaller(mac);
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

    public final void addDeviceStatusListener(@NotNull OnDeviceStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(listener);
    }

    @Nullable
    public final String curDeviceDid() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return wearableDeviceModel.getDid();
        }
        return null;
    }

    @Nullable
    public final WearableDeviceModel curDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @Nullable
    public final WearableDeviceModel curGymDeviceModel() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
    }

    @NotNull
    public final FitnessSyncer fitnessSyncer() {
        return FitnessSyncExtKt.getInstance(FitnessSyncer.INSTANCE);
    }

    @NotNull
    public final List<WearableDeviceModel> getAcessoryDeviceModels() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels();
    }

    @Nullable
    public final WearableDeviceModel getDeviceModelByDid(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
    }

    @NotNull
    public final DeviceContact getDeviceSyncManager() {
        return DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
    }

    @NotNull
    public final FitnessSyncer getFitnessSyncer() {
        return FitnessSyncExtKt.getInstance(FitnessSyncer.INSTANCE);
    }

    public final void hasLock(@NotNull WearableDeviceModel deviceModel, @Nullable gs9[] gymSettingsList, @NotNull ptc listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.xiaomi.fitness.sport_manager.extension.DeviceModelExtKt.locks(deviceModel, gymSettingsList, listener);
    }

    public final boolean isAccessoryDevice(@Nullable String did) {
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        if (did == null) {
            did = "";
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(did);
        if (wearableDeviceModel != null) {
            return com.xiaomi.fitness.sport_manager.extension.DeviceModelExtKt.isAccessory(wearableDeviceModel);
        }
        return false;
    }

    public final boolean isBle(@Nullable WearableDeviceModel deviceModel) {
        return (deviceModel != null && DeviceModelExtKt.isBle(deviceModel)) || (deviceModel != null && DeviceModelExtKt.isBluetooth(deviceModel));
    }

    public final boolean isDeviceConnected(@Nullable WearableDeviceModel deviceModel) {
        if (deviceModel != null) {
            return deviceModel.getIsDeviceConnected();
        }
        return false;
    }

    public final boolean isEcg(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isEcg(deviceModel);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[ORIG_RETURN, RETURN] */
    public final boolean isHasAccessoryDevices() {
        for (Object obj : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels()) {
            if (((WearableDeviceModel) obj).getIsDeviceConnected()) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final boolean isHuami(@Nullable WearableDeviceModel deviceModel) {
        if (deviceModel != null) {
            return DeviceModelExtKt.isHuaMi(deviceModel);
        }
        return false;
    }

    public final boolean isLocal(@Nullable WearableDeviceModel deviceModel) {
        if (deviceModel != null) {
            return DeviceModelExtKt.isLocalDevice(deviceModel);
        }
        return false;
    }

    public final boolean isMainDeviceConnected() {
        WearableDeviceModel wearableDeviceModelCurDeviceModel = curDeviceModel();
        if (wearableDeviceModelCurDeviceModel != null) {
            return wearableDeviceModelCurDeviceModel.getIsDeviceConnected();
        }
        return false;
    }

    public final boolean isPermissionGranted(@NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return PermissionExtKt.isPermissionGranted(AppUtil.getApp(), (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    public final void isSupportLaunchSport(@Nullable WearableDeviceModel deviceModel, int sportType, @NotNull i7r callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (deviceModel == null || !deviceModel.getIsDeviceConnected()) {
            callBack.a(Boolean.FALSE);
        } else {
            com.xiaomi.fitness.sport_manager.extension.DeviceModelExtKt.isSupportLaunchSport(deviceModel, deviceModel.getDid(), sportType, callBack);
        }
    }

    public final boolean isWearOS(@Nullable WearableDeviceModel deviceModel) {
        if (deviceModel != null) {
            return DeviceModelExtKt.isWearOS(deviceModel);
        }
        return false;
    }

    public final boolean mainDeviceJoinSport() {
        Object next;
        WearableDeviceModel wearableDeviceModelCurDeviceModel = curDeviceModel();
        boolean z = wearableDeviceModelCurDeviceModel != null && wearableDeviceModelCurDeviceModel.getIsDeviceConnected();
        Iterator<T> it = f2o.x().r().getSwitchModeList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual((String) next, INSTANCE.curDeviceDid()));
        boolean z2 = next == null;
        int iT = f2o.x().t();
        return z && z2 && (iT == 3 || iT == 1) && !(f2o.x().L() == 2);
    }

    public final boolean noDevice() {
        Object next;
        WearableDeviceModel wearableDeviceModelCurDeviceModel = curDeviceModel();
        if (wearableDeviceModelCurDeviceModel != null) {
            wearableDeviceModelCurDeviceModel.getIsDeviceConnected();
        }
        Iterator<T> it = getAcessoryDeviceModels().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!com.xiaomi.fitness.sport_manager.extension.DeviceModelExtKt.isAccessoryConnected((WearableDeviceModel) next));
        return next == null && !mainDeviceJoinSport();
    }

    public final boolean noMainDevice() {
        WearableDeviceModel wearableDeviceModelCurDeviceModel;
        return curDeviceModel() == null || !((wearableDeviceModelCurDeviceModel = curDeviceModel()) == null || wearableDeviceModelCurDeviceModel.getIsDeviceConnected());
    }

    public final void removeDeviceStatusListener(@NotNull OnDeviceStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(listener);
    }

    public final void setMotionRecognizer(boolean isOpen) {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        RecognizerExtKt.getInstance(MotionRecognizer.INSTANCE).setStart(isOpen);
    }

    @Nullable
    public final Unit startHr(@Nullable ISportHrCallback huamiCallback) {
        WearableDeviceModel wearableDeviceModelCurDeviceModel = curDeviceModel();
        if (wearableDeviceModelCurDeviceModel == null) {
            return null;
        }
        com.xiaomi.fitness.sport_manager.extension.DeviceModelExtKt.startDeviceHr$default(wearableDeviceModelCurDeviceModel, null, 1, null);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Unit stopHr(@Nullable ISportHrCallback huamiCallback) {
        WearableDeviceModel wearableDeviceModelCurDeviceModel = curDeviceModel();
        if (wearableDeviceModelCurDeviceModel == null) {
            return null;
        }
        com.xiaomi.fitness.sport_manager.extension.DeviceModelExtKt.stopDeviceHr(wearableDeviceModelCurDeviceModel);
        return Unit.INSTANCE;
    }
}
