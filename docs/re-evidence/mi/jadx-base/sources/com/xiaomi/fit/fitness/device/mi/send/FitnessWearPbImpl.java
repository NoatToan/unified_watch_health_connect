package com.xiaomi.fit.fitness.device.mi.send;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.device.mi.send.FitnessWearPbImpl;
import com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi;
import com.xiaomi.fit.fitness.sync.export.api.OnGetFitnessIdsCallback;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import defpackage.nu9;
import defpackage.s7r;
import defpackage.ur9;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b*\u0010\u0012J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/fit/fitness/device/mi/send/FitnessWearPbImpl;", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessDeviceSyncPbApi;", "", "did", "Ls7r;", "packet", "Lcom/xiaomi/fit/fitness/sync/export/api/OnGetFitnessIdsCallback;", "callback", "", "realGetFitnessIds", "(Ljava/lang/String;Ls7r;Lcom/xiaomi/fit/fitness/sync/export/api/OnGetFitnessIdsCallback;)V", "wearPacket", "", "needResponse", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "callTimeout", "(Ljava/lang/String;Ls7r;ZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;)V", "syncWearSportStatus", "()V", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataId", "Lkotlin/Function1;", "confirmFitnessId", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Lkotlin/jvm/functions/Function1;)V", "isBgAutoSync", "getTodayFitnessIds", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/xiaomi/fit/fitness/sync/export/api/OnGetFitnessIdsCallback;)V", "getHistoryFitnessIds", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/sync/export/api/OnGetFitnessIdsCallback;)V", "", "dataIds", "requestFitnessIds", "(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "call", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "sportStateCaller$delegate", "Lkotlin/Lazy;", "getSportStateCaller", "()Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "sportStateCaller", "<init>", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0})
public final class FitnessWearPbImpl implements FitnessDeviceSyncPbApi {

    @NotNull
    private static final String TAG = "FitnessWearPbImpl";
    private static final int TIMEOUT_WEAR_CALL = 60000;

    @NotNull
    private final DeviceContact call = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);

    /* JADX INFO: renamed from: sportStateCaller$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportStateCaller = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ow9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessWearPbImpl.sportStateCaller_delegate$lambda$0();
        }
    });

    private final void callTimeout(String did, s7r wearPacket, boolean needResponse, OnSyncCallback callback) {
        this.call.call(did, wearPacket, needResponse, callback, 60000);
    }

    private final ISportRemoteState getSportStateCaller() {
        return (ISportRemoteState) this.sportStateCaller.getValue();
    }

    private final void realGetFitnessIds(String did, s7r packet, final OnGetFitnessIdsCallback callback) {
        callTimeout(did, packet, true, new OnSyncCallback() { // from class: com.xiaomi.fit.fitness.device.mi.send.FitnessWearPbImpl.realGetFitnessIds.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                FitnessLogUtils.w(FitnessWearPbImpl.TAG, "realGetFitnessIds: did=" + did2 + ", errCode=" + code);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                byte[] bArrA;
                s7r packet2;
                ur9 ur9VarU = (result == null || (packet2 = result.getPacket()) == null) ? null : packet2.u();
                if (ur9VarU == null || !(ur9VarU.d0() || ur9VarU.e0())) {
                    FitnessLogUtils.w(FitnessWearPbImpl.TAG, "realGetFitnessIds, dataId is null (did=" + did2 + ")");
                    callback.onSuccess(null);
                    return;
                }
                if (ur9VarU.e0()) {
                    bArrA = ur9VarU.B();
                    Intrinsics.checkNotNullExpressionValue(bArrA, "getIds(...)");
                } else {
                    bArrA = ur9VarU.A();
                    Intrinsics.checkNotNullExpressionValue(bArrA, "getId(...)");
                }
                callback.onSuccess(bArrA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISportRemoteState sportStateCaller_delegate$lambda$0() {
        return SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi
    public void confirmFitnessId(@NotNull String did, @NotNull FitnessDataId dataId, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 5;
        ur9 ur9Var = new ur9();
        ur9Var.p0(dataId.toByteArray());
        s7rVar.S(ur9Var);
        callTimeout(did, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fit.fitness.device.mi.send.FitnessWearPbImpl.confirmFitnessId.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                FitnessLogUtils.w(FitnessWearPbImpl.TAG, "confirmFitnessId: did =" + did2 + ", onError code= " + code);
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                callback.invoke2(Boolean.TRUE);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi
    public void getHistoryFitnessIds(@NotNull String did, @NotNull OnGetFitnessIdsCallback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 2;
        realGetFitnessIds(did, s7rVar, callback);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi
    public void getTodayFitnessIds(@NotNull String did, @Nullable Boolean isBgAutoSync, @NotNull OnGetFitnessIdsCallback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 1;
        boolean zAreEqual = Intrinsics.areEqual(isBgAutoSync, Boolean.TRUE);
        FitnessLogUtils.i(TAG, "getTodayFitnessIds: isBgAutoSync=" + isBgAutoSync + ",reason=" + (zAreEqual ? 1 : 0));
        nu9 nu9Var = new nu9();
        nu9Var.c = zAreEqual ? 1 : 0;
        ur9 ur9Var = new ur9();
        ur9Var.P0(nu9Var);
        s7rVar.S(ur9Var);
        realGetFitnessIds(did, s7rVar, callback);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi
    public void requestFitnessIds(@NotNull String did, @NotNull byte[] dataIds, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(dataIds, "dataIds");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        ur9 ur9Var = new ur9();
        if (dataIds.length == 7) {
            s7rVar.f = 4;
            ur9Var.p0(dataIds);
        } else {
            s7rVar.f = 3;
            ur9Var.q0(dataIds);
        }
        s7rVar.S(ur9Var);
        callTimeout(did, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fit.fitness.device.mi.send.FitnessWearPbImpl.requestFitnessIds.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                FitnessLogUtils.w(FitnessWearPbImpl.TAG, "requestFitnessIds: did=" + did2 + ", errCode=" + code);
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                callback.invoke2(Boolean.TRUE);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi
    public void syncWearSportStatus() {
        getSportStateCaller().syncWearSportStatus();
    }
}
