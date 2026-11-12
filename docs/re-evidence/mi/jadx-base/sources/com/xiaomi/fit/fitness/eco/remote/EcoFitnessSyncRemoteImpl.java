package com.xiaomi.fit.fitness.eco.remote;

import android.os.RemoteException;
import com.xiaomi.fit.data.common.data.mi.FitnessDataHeader;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.eco.device.mi.FitnessDeviceSyncManager;
import com.xiaomi.fit.fitness.eco.remote.EcoFitnessSyncRemoteImpl;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import defpackage.pt7;
import defpackage.qt7;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\t\b\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/remote/EcoFitnessSyncRemoteImpl;", "Lqt7$a;", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataId", "", "data", "generateCompleteData", "(Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[B)[B", "", "did", "Lpt7;", "callback", "", "syncWithDevice", "(Ljava/lang/String;Lpt7;)V", "dataIds", "syncTheDataWithDevice", "(Ljava/lang/String;[BLpt7;)V", "idBytes", "dataValid", "syncTheData", "(Ljava/lang/String;[B[B[B)V", "syncData", "(Ljava/lang/String;[B[B)V", "addSyncResultListener", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fit/fitness/eco/device/mi/FitnessDeviceSyncManager;", "bleDeviceManager$delegate", "Lkotlin/Lazy;", "getBleDeviceManager", "()Lcom/xiaomi/fit/fitness/eco/device/mi/FitnessDeviceSyncManager;", "bleDeviceManager", "<init>", "()V", "Companion", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0})
public final class EcoFitnessSyncRemoteImpl extends qt7.a {
    public static final int KEY_FITNESS_SYNC_BINDER = 111;

    @NotNull
    private final String TAG = "EcoFitnessSyncRemoteImpl";

    /* JADX INFO: renamed from: bleDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bleDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rt7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoFitnessSyncRemoteImpl.bleDeviceManager_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDeviceSyncManager bleDeviceManager_delegate$lambda$0() {
        return FitnessDeviceSyncManager.INSTANCE.getInstance();
    }

    private final byte[] generateCompleteData(FitnessDataId dataId, byte[] data) {
        byte[] bArrConvertToServerDataId = dataId.convertToServerDataId();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrConvertToServerDataId.length + data.length);
        byteBufferAllocate.put(bArrConvertToServerDataId);
        byteBufferAllocate.put(data);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    private final FitnessDeviceSyncManager getBleDeviceManager() {
        return (FitnessDeviceSyncManager) this.bleDeviceManager.getValue();
    }

    @Override // defpackage.qt7
    public void addSyncResultListener(@NotNull String did, @Nullable pt7 callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        FitnessLogUtils.i(this.TAG, "addSyncResultListener");
        getBleDeviceManager().addSyncResultListener(did, callback);
    }

    @Override // defpackage.qt7
    public void syncData(@NotNull String did, @Nullable byte[] idBytes, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (idBytes == null || data == null) {
            FitnessLogUtils.e(this.TAG, "syncTheData: invalid param(did = " + did + ")");
            return;
        }
        FitnessDataId fitnessDataId = new FitnessDataId(idBytes);
        Logger.i(this.TAG, "syncData bytes(" + fitnessDataId + ")");
        getBleDeviceManager().syncTheData(did, fitnessDataId, generateCompleteData(fitnessDataId, data));
    }

    @Override // defpackage.qt7
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

    @Override // defpackage.qt7
    public void syncTheDataWithDevice(@NotNull String did, @Nullable byte[] dataIds, @Nullable pt7 callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (dataIds != null) {
            FitnessLogUtils.i(this.TAG, "syncData with the dataIds from device");
            getBleDeviceManager().syncWithDevice(did, dataIds, callback);
            return;
        }
        FitnessLogUtils.e(this.TAG, "syncTheData: invalid param(did = " + did + ")");
    }

    @Override // defpackage.qt7
    public void syncWithDevice(@NotNull String did, @Nullable pt7 callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        FitnessLogUtils.i(this.TAG, "start syncData");
        if (((EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did)) != null) {
            getBleDeviceManager().syncLocalData("xiaomiwear_app");
            getBleDeviceManager().syncWithDevice(did, callback);
            return;
        }
        FitnessLogUtils.w(this.TAG, did + " no deviceModel instance");
        if (callback != null) {
            callback.onSyncError(did, 1, "deviceModel is null");
        }
    }
}
