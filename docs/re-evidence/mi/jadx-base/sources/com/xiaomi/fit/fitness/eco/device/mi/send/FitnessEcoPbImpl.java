package com.xiaomi.fit.fitness.eco.device.mi.send;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.eco.device.mi.send.FitnessEcoPbImpl;
import com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi;
import com.xiaomi.fit.fitness.sync.export.api.OnGetFitnessIdsCallback;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import defpackage.ou9;
import defpackage.u7r;
import defpackage.vr9;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0001+B\t\b\u0002¢\u0006\u0004\b*\u0010\u0012J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/device/mi/send/FitnessEcoPbImpl;", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessDeviceSyncPbApi;", "", "did", "Lu7r;", "packet", "Lcom/xiaomi/fit/fitness/sync/export/api/OnGetFitnessIdsCallback;", "callback", "", "realGetFitnessIds", "(Ljava/lang/String;Lu7r;Lcom/xiaomi/fit/fitness/sync/export/api/OnGetFitnessIdsCallback;)V", "wearPacket", "", "needResponse", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "callTimeout", "(Ljava/lang/String;Lu7r;ZLcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;)V", "syncWearSportStatus", "()V", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataId", "Lkotlin/Function1;", "confirmFitnessId", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Lkotlin/jvm/functions/Function1;)V", "isBgAutoSync", "getTodayFitnessIds", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/xiaomi/fit/fitness/sync/export/api/OnGetFitnessIdsCallback;)V", "getHistoryFitnessIds", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/sync/export/api/OnGetFitnessIdsCallback;)V", "", "dataIds", "requestFitnessIds", "(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceContact;", "call", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceContact;", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "sportStateCaller$delegate", "Lkotlin/Lazy;", "getSportStateCaller", "()Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "sportStateCaller", "<init>", "Companion", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0})
public final class FitnessEcoPbImpl implements FitnessDeviceSyncPbApi {

    @NotNull
    private static final String TAG = "FitnessEcoPb";
    private static final int TIMEOUT_WEAR_CALL = 60000;

    @NotNull
    private final EcoDeviceContact call = EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE);

    /* JADX INFO: renamed from: sportStateCaller$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportStateCaller = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessEcoPbImpl.sportStateCaller_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FitnessEcoPbImpl instance = new FitnessEcoPbImpl();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/device/mi/send/FitnessEcoPbImpl$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/eco/device/mi/send/FitnessEcoPbImpl;", "getInstance", "()Lcom/xiaomi/fit/fitness/eco/device/mi/send/FitnessEcoPbImpl;", "TAG", "", "TIMEOUT_WEAR_CALL", "", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessEcoPbImpl getInstance() {
            return FitnessEcoPbImpl.instance;
        }
    }

    private FitnessEcoPbImpl() {
    }

    private final void callTimeout(String did, u7r wearPacket, boolean needResponse, OnEcoSyncCallback callback) {
        this.call.call(did, wearPacket, needResponse, callback, 60000);
    }

    private final IEcoSportRemoteState getSportStateCaller() {
        return (IEcoSportRemoteState) this.sportStateCaller.getValue();
    }

    private final void realGetFitnessIds(String did, u7r packet, final OnGetFitnessIdsCallback callback) {
        callTimeout(did, packet, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fit.fitness.eco.device.mi.send.FitnessEcoPbImpl.realGetFitnessIds.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                FitnessLogUtils.w(FitnessEcoPbImpl.TAG, "realGetFitnessIds: did=" + did2 + ", errCode=" + code);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                byte[] bArrX;
                u7r packet2;
                vr9 vr9VarR = (result == null || (packet2 = result.getPacket()) == null) ? null : packet2.r();
                if (vr9VarR == null || !(vr9VarR.H() || vr9VarR.I())) {
                    FitnessLogUtils.w(FitnessEcoPbImpl.TAG, "realGetFitnessIds, dataId is null (did=" + did2 + ")");
                    callback.onSuccess(null);
                    return;
                }
                if (vr9VarR.I()) {
                    bArrX = vr9VarR.y();
                    Intrinsics.checkNotNullExpressionValue(bArrX, "getIds(...)");
                } else {
                    bArrX = vr9VarR.x();
                    Intrinsics.checkNotNullExpressionValue(bArrX, "getId(...)");
                }
                callback.onSuccess(bArrX);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IEcoSportRemoteState sportStateCaller_delegate$lambda$0() {
        return SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi
    public void confirmFitnessId(@NotNull String did, @NotNull FitnessDataId dataId, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 5;
        vr9 vr9Var = new vr9();
        vr9Var.O(dataId.toByteArray());
        u7rVar.B(vr9Var);
        callTimeout(did, u7rVar, false, new OnEcoSyncCallback() { // from class: com.xiaomi.fit.fitness.eco.device.mi.send.FitnessEcoPbImpl.confirmFitnessId.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                FitnessLogUtils.w(FitnessEcoPbImpl.TAG, "confirmFitnessId: did =" + did2 + ", onError code= " + code);
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                callback.invoke2(Boolean.TRUE);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi
    public void getHistoryFitnessIds(@NotNull String did, @NotNull OnGetFitnessIdsCallback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 2;
        realGetFitnessIds(did, u7rVar, callback);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi
    public void getTodayFitnessIds(@NotNull String did, @Nullable Boolean isBgAutoSync, @NotNull OnGetFitnessIdsCallback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 1;
        boolean zAreEqual = Intrinsics.areEqual(isBgAutoSync, Boolean.TRUE);
        FitnessLogUtils.i(TAG, "getTodayFitnessIds: isBgAutoSync=" + isBgAutoSync + ",reason=" + (zAreEqual ? 1 : 0));
        ou9 ou9Var = new ou9();
        ou9Var.c = zAreEqual ? 1 : 0;
        vr9 vr9Var = new vr9();
        vr9Var.W(ou9Var);
        u7rVar.B(vr9Var);
        realGetFitnessIds(did, u7rVar, callback);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi
    public void requestFitnessIds(@NotNull String did, @NotNull byte[] dataIds, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(dataIds, "dataIds");
        Intrinsics.checkNotNullParameter(callback, "callback");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        vr9 vr9Var = new vr9();
        if (dataIds.length == 7) {
            u7rVar.f = 4;
            vr9Var.O(dataIds);
        } else {
            u7rVar.f = 3;
            vr9Var.P(dataIds);
        }
        u7rVar.B(vr9Var);
        callTimeout(did, u7rVar, false, new OnEcoSyncCallback() { // from class: com.xiaomi.fit.fitness.eco.device.mi.send.FitnessEcoPbImpl.requestFitnessIds.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                FitnessLogUtils.w(FitnessEcoPbImpl.TAG, "requestFitnessIds: did=" + did2 + ", errCode=" + code);
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                callback.invoke2(Boolean.TRUE);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi
    public void syncWearSportStatus() {
        getSportStateCaller().syncWearSportStatus();
    }
}
