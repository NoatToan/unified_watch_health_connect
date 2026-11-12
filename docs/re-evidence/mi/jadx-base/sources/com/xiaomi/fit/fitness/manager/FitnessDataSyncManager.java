package com.xiaomi.fit.fitness.manager;

import android.os.IBinder;
import com.amap.api.maps.model.MyLocationStyle;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.device.cgm.thirdparty.ThirdPartyDataManager;
import com.xiaomi.fit.fitness.manager.FitnessDataSyncManager;
import com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncManager;
import com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi;
import com.xiaomi.fit.fitness.sync.export.api.FitnessExternalSyncer;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import defpackage.iw9;
import defpackage.jw9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u000201B\t\b\u0007¢\u0006\u0004\b/\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\r\u0010\u0012J!\u0010\r\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\r\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R/\u0010.\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/xiaomi/fit/fitness/manager/FitnessDataSyncManager;", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessExternalSyncer;", "", "checkRemoteServerReady", "()V", "", "sid", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataId", "", "dataValid", "data", "syncData", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[B[B)V", "dataIds", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "callBack", "(Ljava/lang/String;[BLcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;)V", "did", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;)V", "", "manualForce", "triggerDataSync", "(Z)V", "triggerDataSyncByWidget", "isBgAuto", "testDeviceSync", "packageName", "isBloodSugarThirdParty", "(Ljava/lang/String;)Z", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessDeviceSyncPbApi;", "api", "Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncManager;", "getSyncManager", "(Lcom/xiaomi/fit/fitness/sync/export/api/FitnessDeviceSyncPbApi;)Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncManager;", "TAG", "Ljava/lang/String;", "Ljw9;", "<set-?>", "mRemoteSyncImplManager$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMRemoteSyncImplManager", "()Ljw9;", "setMRemoteSyncImplManager", "(Ljw9;)V", "mRemoteSyncImplManager", "<init>", "Companion", "SyncCallbackInternal", "fitness-sync_release"}, k = 1, mv = {2, 0, 0})
public final class FitnessDataSyncManager implements FitnessSyncer, FitnessExternalSyncer {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataSyncManager.class, "mRemoteSyncImplManager", "getMRemoteSyncImplManager()Lcom/xiaomi/fit/fitness/FitnessSyncRemote;", 0))};

    @NotNull
    private final String TAG = "FitnessDataSyncManager";

    /* JADX INFO: renamed from: mRemoteSyncImplManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mRemoteSyncImplManager = new BinderDelegate("mRemoteSyncImplManager");

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/manager/FitnessDataSyncManager$SyncCallbackInternal;", "Liw9$a;", "", "did", "", "type", "", "onSyncSuccess", "(Ljava/lang/String;I)V", MyLocationStyle.ERROR_INFO, "onSyncError", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "callBack", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "<init>", "(Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;)V", "fitness-sync_release"}, k = 1, mv = {2, 0, 0})
    public static final class SyncCallbackInternal extends iw9.a {

        @Nullable
        private final DeviceSyncCallback callBack;

        public SyncCallbackInternal(@Nullable DeviceSyncCallback deviceSyncCallback) {
            this.callBack = deviceSyncCallback;
        }

        @Override // defpackage.iw9
        public void onSyncError(@NotNull String did, int type, @Nullable String errorInfo) {
            Intrinsics.checkNotNullParameter(did, "did");
            DeviceSyncCallback deviceSyncCallback = this.callBack;
            if (deviceSyncCallback != null) {
                deviceSyncCallback.onSyncError(did, type, errorInfo);
            }
        }

        @Override // defpackage.iw9
        public void onSyncSuccess(@NotNull String did, int type) {
            Intrinsics.checkNotNullParameter(did, "did");
            DeviceSyncCallback deviceSyncCallback = this.callBack;
            if (deviceSyncCallback != null) {
                deviceSyncCallback.onSyncSuccess(did, type, null);
            }
        }
    }

    public FitnessDataSyncManager() {
        ServiceConnector.INSTANCE.getBinder(11, new Function1() { // from class: gq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FitnessDataSyncManager._init_$lambda$0(this.f19231a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(FitnessDataSyncManager this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, "getBinder");
        if (iBinder != null) {
            FitnessLogUtils.i(this$0.TAG, "init sync impl");
            this$0.setMRemoteSyncImplManager(jw9.a.asInterface(iBinder));
        }
        return Unit.INSTANCE;
    }

    private final void checkRemoteServerReady() {
        if (getMRemoteSyncImplManager() == null) {
            FitnessLogUtils.i(this.TAG, "remote service has not ready");
        }
    }

    private final jw9 getMRemoteSyncImplManager() {
        return (jw9) this.mRemoteSyncImplManager.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setMRemoteSyncImplManager(jw9 jw9Var) {
        this.mRemoteSyncImplManager.setValue((Object) this, $$delegatedProperties[0], jw9Var);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessExternalSyncer
    @NotNull
    public ExternalFitnessSyncManager getSyncManager(@NotNull FitnessDeviceSyncPbApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        return new ExternalFitnessDataSyncImpl(api);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer
    public boolean isBloodSugarThirdParty(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return ThirdPartyDataManager.INSTANCE.getInstance().checkIsBloodSugarThirdApp(packageName);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer
    public void syncData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull byte[] dataValid, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dataValid, "dataValid");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            FitnessLogUtils.i(this.TAG, "start syncTheData");
            checkRemoteServerReady();
            jw9 mRemoteSyncImplManager = getMRemoteSyncImplManager();
            if (mRemoteSyncImplManager != null) {
                mRemoteSyncImplManager.syncTheData(sid, dataId.toByteArray(), dataValid, data);
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "syncTheData", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer
    public void testDeviceSync(boolean isBgAuto) {
        try {
            FitnessLogUtils.i(this.TAG, "start testBgDeviceSync(" + isBgAuto + ")");
            checkRemoteServerReady();
            jw9 mRemoteSyncImplManager = getMRemoteSyncImplManager();
            if (mRemoteSyncImplManager != null) {
                mRemoteSyncImplManager.testDeviceSync(isBgAuto);
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "testBgDeviceSync", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer
    public void triggerDataSync(boolean manualForce) {
        try {
            FitnessLogUtils.i(this.TAG, "start triggerDataSync");
            checkRemoteServerReady();
            jw9 mRemoteSyncImplManager = getMRemoteSyncImplManager();
            if (mRemoteSyncImplManager != null) {
                mRemoteSyncImplManager.triggerDataSync(manualForce);
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "triggerDataSync", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer
    public void triggerDataSyncByWidget(boolean manualForce) {
        try {
            FitnessLogUtils.i(this.TAG, "start triggerDataSyncByWidget");
            checkRemoteServerReady();
            jw9 mRemoteSyncImplManager = getMRemoteSyncImplManager();
            if (mRemoteSyncImplManager != null) {
                mRemoteSyncImplManager.triggerDataSyncByWidget(manualForce);
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "triggerDataSyncByWidget", e);
        }
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer
    public void syncData(@NotNull String sid, @NotNull byte[] dataIds, @Nullable DeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataIds, "dataIds");
        try {
            FitnessLogUtils.i(this.TAG, "start syncTheDataWithDevice");
            checkRemoteServerReady();
            jw9 mRemoteSyncImplManager = getMRemoteSyncImplManager();
            if (mRemoteSyncImplManager != null) {
                mRemoteSyncImplManager.syncTheDataWithDevice(sid, dataIds, new SyncCallbackInternal(callBack));
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "syncTheDataWithDevice", e);
        }
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncer
    public void syncData(@NotNull String did, @Nullable DeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        try {
            FitnessLogUtils.i(this.TAG, "start syncWithDevice");
            checkRemoteServerReady();
            jw9 mRemoteSyncImplManager = getMRemoteSyncImplManager();
            if (mRemoteSyncImplManager != null) {
                mRemoteSyncImplManager.syncWithDevice(did, new SyncCallbackInternal(callBack));
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "syncWithDevice", e);
        }
    }
}
