package com.xiaomi.fit.fitness.eco.manager;

import android.os.IBinder;
import android.os.RemoteException;
import com.amap.api.maps.model.MyLocationStyle;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.eco.device.mi.receive.FitnessReceiverHandler;
import com.xiaomi.fit.fitness.eco.manager.EcoFitnessDataSyncManager;
import com.xiaomi.fit.fitness.eco.sync.export.api.EcoFitnessSyncer;
import com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import defpackage.pt7;
import defpackage.qt7;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B\t\b\u0007¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J/\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0010J)\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\r\u0010\u0014J!\u0010\r\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\r\u0010\u0016J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R/\u0010-\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/manager/EcoFitnessDataSyncManager;", "Lcom/xiaomi/fit/fitness/eco/sync/export/api/EcoFitnessSyncer;", "", "checkRemoteServerReady", "()V", "addDataReceiverHandler", "", "sid", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataId", "", "dataValid", "data", "syncData", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[B[B)V", "dataIdBytes", "(Ljava/lang/String;[B[B)V", "dataIds", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;", "callBack", "(Ljava/lang/String;[BLcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;)V", "did", "(Ljava/lang/String;Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;)V", "addSyncResultListener", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceContact;", "deviceSync$delegate", "Lkotlin/Lazy;", "getDeviceSync", "()Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceContact;", "deviceSync", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandlerWrapper;", "fitnessDataHandler$delegate", "getFitnessDataHandler", "()Lcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandlerWrapper;", "fitnessDataHandler", "Lqt7;", "<set-?>", "mRemoteEcoSyncImplManager$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMRemoteEcoSyncImplManager", "()Lqt7;", "setMRemoteEcoSyncImplManager", "(Lqt7;)V", "mRemoteEcoSyncImplManager", "<init>", "Companion", "SyncCallbackInternal", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0})
public final class EcoFitnessDataSyncManager implements EcoFitnessSyncer {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoFitnessDataSyncManager.class, "mRemoteEcoSyncImplManager", "getMRemoteEcoSyncImplManager()Lcom/xiaomi/fit/fitness/eco/EcoFitnessSyncRemote;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String TAG = "EcoFitnessDataSyncManager";

    /* JADX INFO: renamed from: deviceSync$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSync = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lt7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoFitnessDataSyncManager.deviceSync_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: fitnessDataHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fitnessDataHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mt7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoFitnessDataSyncManager.fitnessDataHandler_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: mRemoteEcoSyncImplManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mRemoteEcoSyncImplManager = new BinderDelegate("mRemoteEcoSyncImplManager");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/manager/EcoFitnessDataSyncManager$Companion;", "", "<init>", "()V", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/manager/EcoFitnessDataSyncManager$SyncCallbackInternal;", "Lpt7$a;", "", "did", "", "type", "", "onSyncSuccess", "(Ljava/lang/String;I)V", MyLocationStyle.ERROR_INFO, "onSyncError", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;", "callBack", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;", "<init>", "(Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;)V", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0})
    public static final class SyncCallbackInternal extends pt7.a {

        @Nullable
        private final EcoDeviceSyncCallback callBack;

        public SyncCallbackInternal(@Nullable EcoDeviceSyncCallback ecoDeviceSyncCallback) {
            this.callBack = ecoDeviceSyncCallback;
        }

        @Override // defpackage.pt7
        public void onSyncError(@NotNull String did, int type, @Nullable String errorInfo) {
            Intrinsics.checkNotNullParameter(did, "did");
            EcoDeviceSyncCallback ecoDeviceSyncCallback = this.callBack;
            if (ecoDeviceSyncCallback != null) {
                ecoDeviceSyncCallback.onSyncError(did, type, errorInfo);
            }
        }

        @Override // defpackage.pt7
        public void onSyncSuccess(@NotNull String did, int type) {
            Intrinsics.checkNotNullParameter(did, "did");
            EcoDeviceSyncCallback ecoDeviceSyncCallback = this.callBack;
            if (ecoDeviceSyncCallback != null) {
                ecoDeviceSyncCallback.onSyncSuccess(did, type, null);
            }
        }
    }

    public EcoFitnessDataSyncManager() {
        ServiceConnector.INSTANCE.getBinder(111, new Function1() { // from class: nt7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoFitnessDataSyncManager._init_$lambda$2(this.f28352a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(EcoFitnessDataSyncManager this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, "getBinder");
        if (iBinder != null) {
            FitnessLogUtils.i(this$0.TAG, "init sync impl");
            this$0.setMRemoteEcoSyncImplManager(qt7.a.asInterface(iBinder));
        }
        return Unit.INSTANCE;
    }

    private final void checkRemoteServerReady() {
        if (getMRemoteEcoSyncImplManager() == null) {
            FitnessLogUtils.i(this.TAG, "remote service has not ready");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceContact deviceSync_delegate$lambda$0() {
        return EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessReceiverHandler fitnessDataHandler_delegate$lambda$1() {
        return new FitnessReceiverHandler();
    }

    private final EcoDeviceContact getDeviceSync() {
        return (EcoDeviceContact) this.deviceSync.getValue();
    }

    private final EcoDataHandlerWrapper getFitnessDataHandler() {
        return (EcoDataHandlerWrapper) this.fitnessDataHandler.getValue();
    }

    private final qt7 getMRemoteEcoSyncImplManager() {
        return (qt7) this.mRemoteEcoSyncImplManager.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setMRemoteEcoSyncImplManager(qt7 qt7Var) {
        this.mRemoteEcoSyncImplManager.setValue((Object) this, $$delegatedProperties[0], qt7Var);
    }

    public final void addDataReceiverHandler() {
        FitnessLogUtils.i(this.TAG, "addDataReceiverHandler");
        getDeviceSync().removeDataHandler(102, getFitnessDataHandler());
        getDeviceSync().addDataHandler(102, getFitnessDataHandler());
    }

    @Override // com.xiaomi.fit.fitness.eco.sync.export.api.EcoFitnessSyncer
    public void addSyncResultListener(@NotNull String sid, @Nullable EcoDeviceSyncCallback callBack) throws RemoteException {
        Intrinsics.checkNotNullParameter(sid, "sid");
        FitnessLogUtils.i(this.TAG, "addSyncResultListener");
        qt7 mRemoteEcoSyncImplManager = getMRemoteEcoSyncImplManager();
        if (mRemoteEcoSyncImplManager != null) {
            mRemoteEcoSyncImplManager.addSyncResultListener(sid, new SyncCallbackInternal(callBack));
        }
    }

    @Override // com.xiaomi.fit.fitness.eco.sync.export.api.EcoFitnessSyncer
    public void syncData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull byte[] dataValid, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dataValid, "dataValid");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            FitnessLogUtils.i(this.TAG, "start syncTheData");
            checkRemoteServerReady();
            qt7 mRemoteEcoSyncImplManager = getMRemoteEcoSyncImplManager();
            if (mRemoteEcoSyncImplManager != null) {
                mRemoteEcoSyncImplManager.syncTheData(sid, dataId.toByteArray(), dataValid, data);
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "syncTheData", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.eco.sync.export.api.EcoFitnessSyncer
    public void syncData(@NotNull String sid, @NotNull byte[] dataIdBytes, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataIdBytes, "dataIdBytes");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            FitnessLogUtils.i(this.TAG, "start syncData");
            checkRemoteServerReady();
            qt7 mRemoteEcoSyncImplManager = getMRemoteEcoSyncImplManager();
            if (mRemoteEcoSyncImplManager != null) {
                mRemoteEcoSyncImplManager.syncData(sid, dataIdBytes, data);
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "syncData", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.eco.sync.export.api.EcoFitnessSyncer
    public void syncData(@NotNull String sid, @NotNull byte[] dataIds, @Nullable EcoDeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataIds, "dataIds");
        try {
            FitnessLogUtils.i(this.TAG, "start syncTheDataWithDevice");
            checkRemoteServerReady();
            qt7 mRemoteEcoSyncImplManager = getMRemoteEcoSyncImplManager();
            if (mRemoteEcoSyncImplManager != null) {
                mRemoteEcoSyncImplManager.syncTheDataWithDevice(sid, dataIds, new SyncCallbackInternal(callBack));
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "syncTheDataWithDevice", e);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncer
    public void syncData(@NotNull String did, @Nullable EcoDeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        try {
            FitnessLogUtils.i(this.TAG, "start syncWithDevice, did is " + did);
            checkRemoteServerReady();
            qt7 mRemoteEcoSyncImplManager = getMRemoteEcoSyncImplManager();
            if (mRemoteEcoSyncImplManager != null) {
                mRemoteEcoSyncImplManager.syncWithDevice(did, new SyncCallbackInternal(callBack));
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "syncWithDevice", e);
        }
    }
}
