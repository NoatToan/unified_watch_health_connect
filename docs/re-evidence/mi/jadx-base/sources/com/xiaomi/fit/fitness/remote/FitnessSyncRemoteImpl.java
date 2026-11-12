package com.xiaomi.fit.fitness.remote;

import android.os.RemoteException;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.data.mi.FitnessDataHeader;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl;
import com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager;
import com.xiaomi.fit.fitness.device.mi.FitnessDeviceSyncManager;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.sp.FitnessDataPreference;
import com.xiaomi.fit.fitness.remote.FitnessSyncRemoteImpl;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.iw9;
import defpackage.jw9;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b&\u0010'J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/xiaomi/fit/fitness/remote/FitnessSyncRemoteImpl;", "Ljw9$a;", "", "did", "Liw9;", "callback", "", "syncWithDevice", "(Ljava/lang/String;Liw9;)V", "", "dataIds", "syncTheDataWithDevice", "(Ljava/lang/String;[BLiw9;)V", "idBytes", "dataValid", "data", "syncTheData", "(Ljava/lang/String;[B[B[B)V", "", "manualForce", "triggerDataSync", "(Z)V", "triggerDataSyncByWidget", "isBgAuto", "testDeviceSync", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fit/fitness/device/mi/FitnessDeviceSyncManager;", "bleDeviceManager$delegate", "Lkotlin/Lazy;", "getBleDeviceManager", "()Lcom/xiaomi/fit/fitness/device/mi/FitnessDeviceSyncManager;", "bleDeviceManager", "Lcom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager;", "hmDeviceManager$delegate", "getHmDeviceManager", "()Lcom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager;", "hmDeviceManager", "<init>", "()V", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0})
public final class FitnessSyncRemoteImpl extends jw9.a {
    public static final int KEY_FITNESS_SYNC_BINDER = 11;

    @NotNull
    private final String TAG = "FitnessDataSyncRemote";

    /* JADX INFO: renamed from: bleDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bleDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kw9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessSyncRemoteImpl.bleDeviceManager_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: hmDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lw9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessSyncRemoteImpl.hmDeviceManager_delegate$lambda$1();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDeviceSyncManager bleDeviceManager_delegate$lambda$0() {
        return FitnessDeviceSyncManager.INSTANCE.getInstance();
    }

    private final FitnessDeviceSyncManager getBleDeviceManager() {
        return (FitnessDeviceSyncManager) this.bleDeviceManager.getValue();
    }

    private final HMDeviceSyncManager getHmDeviceManager() {
        return (HMDeviceSyncManager) this.hmDeviceManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HMDeviceSyncManager hmDeviceManager_delegate$lambda$1() {
        return HMDeviceSyncManager.INSTANCE.getInstance();
    }

    @Override // defpackage.jw9
    public void syncTheData(@NotNull String did, @Nullable byte[] idBytes, @Nullable byte[] dataValid, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (idBytes == null || dataValid == null || data == null) {
            FitnessLogUtils.e(this.TAG, "syncTheData: invalid param(did = " + did + ")");
            return;
        }
        FitnessDataId fitnessDataId = new FitnessDataId(idBytes);
        byte[] dataHeaderBytes = FitnessDataHeader.INSTANCE.toDataHeaderBytes(fitnessDataId, dataValid);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(dataHeaderBytes.length + data.length);
        byteBufferAllocate.put(dataHeaderBytes);
        byteBufferAllocate.put(data);
        FitnessDeviceSyncManager bleDeviceManager = getBleDeviceManager();
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        bleDeviceManager.syncTheData(did, fitnessDataId, bArrArray);
    }

    @Override // defpackage.jw9
    public void syncTheDataWithDevice(@NotNull String did, @Nullable byte[] dataIds, @Nullable iw9 callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (dataIds != null) {
            FitnessLogUtils.i(this.TAG, "syncData with the dataIds from device");
            getBleDeviceManager().syncWithDevice(did, dataIds, callback);
            return;
        }
        FitnessLogUtils.e(this.TAG, "syncTheData: invalid param(did = " + did + ")");
    }

    @Override // defpackage.jw9
    public void syncWithDevice(@NotNull String did, @Nullable iw9 callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        FitnessLogUtils.i(this.TAG, "start syncData");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel != null) {
            getBleDeviceManager().syncLocalData$fitness_sync_release("xiaomiwear_app");
            if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                FitnessDataSyncBaseImpl.syncWithDevice$default(getHmDeviceManager(), did, callback, null, 4, null);
                return;
            } else {
                FitnessDataSyncBaseImpl.syncWithDevice$default(getBleDeviceManager(), did, callback, null, 4, null);
                return;
            }
        }
        FitnessLogUtils.w(this.TAG, did + " no deviceModel instance");
        if (callback != null) {
            callback.onSyncError(did, 1, "deviceModel is null");
        }
    }

    @Override // defpackage.jw9
    public void testDeviceSync(boolean isBgAuto) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            FitnessLogUtils.i(this.TAG, "no current device or not connected");
        } else if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            getHmDeviceManager().syncWithDevice(wearableDeviceModel.getDid(), null, Boolean.valueOf(isBgAuto));
        } else {
            getBleDeviceManager().syncWithDevice(wearableDeviceModel.getDid(), (iw9) null, Boolean.valueOf(isBgAuto));
        }
    }

    @Override // defpackage.jw9
    public void triggerDataSync(boolean manualForce) {
        FitnessLogUtils.i(this.TAG, "triggerDataSync: manualForce = " + manualForce);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            FitnessLogUtils.i(this.TAG, "triggerDataSync: no bound device, and sync with server");
            FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), manualForce, "home_page", null, 4, null);
            return;
        }
        long device_sync_time = FitnessDataPreference.INSTANCE.getDEVICE_SYNC_TIME();
        boolean z = !manualForce && System.currentTimeMillis() - device_sync_time < FitnessDataConstants.INSTANCE.getSYNC_FORGOUND_INTERVAL_IN_MILLI();
        if (!DeviceManagerExtKt.getInstance(companion).isConnected() || z) {
            FitnessLogUtils.i(this.TAG, "triggerDataSync: not do device sync (" + device_sync_time + ") , and trigger server sync");
            FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), manualForce, "home_page", null, 4, null);
            return;
        }
        FitnessLogUtils.i(this.TAG, "triggerDataSync: device is connected, and sync with device");
        if (wearableDeviceModel.getDeviceStatus() == 6) {
            FitnessLogUtils.i(this.TAG, "triggerDataSync: device is syncing");
            return;
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            getHmDeviceManager().manualForceSync(manualForce);
        } else {
            getBleDeviceManager().manualForceSync(manualForce);
        }
        DeviceContact.DefaultImpls.syncData$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel.getDid(), false, 2, null);
    }

    @Override // defpackage.jw9
    public void triggerDataSyncByWidget(boolean manualForce) {
        FitnessLogUtils.i(this.TAG, "triggerDataSync: manualForce = " + manualForce);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            FitnessLogUtils.i(this.TAG, "triggerDataSync: no bound device, and sync with server");
            FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), manualForce, "home_page", null, 4, null);
            return;
        }
        long device_sync_time = FitnessDataPreference.INSTANCE.getDEVICE_SYNC_TIME();
        boolean z = !manualForce && System.currentTimeMillis() - device_sync_time < FitnessDataConstants.INSTANCE.getSYNC_FORGOUND_INTERVAL_IN_MILLI();
        if (!DeviceManagerExtKt.getInstance(companion).isConnected() || z) {
            FitnessLogUtils.i(this.TAG, "triggerDataSync: not do device sync (" + device_sync_time + ") , and trigger server sync");
            FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), manualForce, "home_page", null, 4, null);
            return;
        }
        FitnessLogUtils.i(this.TAG, "triggerDataSync: device is connected, and sync with device");
        if (wearableDeviceModel.getDeviceStatus() == 6) {
            FitnessLogUtils.i(this.TAG, "triggerDataSync: device is syncing");
            return;
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            getHmDeviceManager().manualForceSync(manualForce);
        } else {
            getBleDeviceManager().manualForceSync(manualForce);
        }
        DeviceContact.DefaultImpls.syncDataByWidget$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel.getDid(), false, 2, null);
    }
}
