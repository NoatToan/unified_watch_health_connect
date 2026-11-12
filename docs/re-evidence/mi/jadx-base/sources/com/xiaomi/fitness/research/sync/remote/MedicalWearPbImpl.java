package com.xiaomi.fitness.research.sync.remote;

import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.research.sync.remote.MedicalWearPbImpl;
import defpackage.nu9;
import defpackage.s7r;
import defpackage.ur9;
import defpackage.vnf;
import defpackage.wnf;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/research/sync/remote/MedicalWearPbImpl;", "", "", "did", "Ls7r;", "packet", "Lvnf;", "callback", "", "realGetFitnessIds", "(Ljava/lang/String;Ls7r;Lvnf;)V", "wearPacket", "", "needResponse", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "callTimeout", "(Ljava/lang/String;Ls7r;ZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;)V", "", "dataId", "confirmFitnessId", "(Ljava/lang/String;[BLvnf;)V", "isBgAutoSync", "getTodayFitnessIds", "(Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "getHistoryFitnessIds", "(Ljava/lang/String;Lvnf;)V", "dataIds", "Lwnf;", "requestMedicalData", "(Ljava/lang/String;[BLwnf;)V", "dataCallback", "Lwnf;", "getDataCallback", "()Lwnf;", "setDataCallback", "(Lwnf;)V", "<init>", "()V", "Companion", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MedicalWearPbImpl {

    @NotNull
    private static final String TAG = "Research_Sync_PbImpl";
    private static final int TIMEOUT_WEAR_CALL = 60000;

    @Nullable
    private wnf dataCallback;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<MedicalWearPbImpl> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xnf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MedicalWearPbImpl.instance_delegate$lambda$0();
        }
    });
    private static long initTime = System.currentTimeMillis();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/research/sync/remote/MedicalWearPbImpl$Companion;", "", "<init>", "()V", "TAG", "", "TIMEOUT_WEAR_CALL", "", "instance", "Lcom/xiaomi/fitness/research/sync/remote/MedicalWearPbImpl;", "getInstance", "()Lcom/xiaomi/fitness/research/sync/remote/MedicalWearPbImpl;", "instance$delegate", "Lkotlin/Lazy;", "initTime", "", "getInitTime", "()J", "setInitTime", "(J)V", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getInitTime() {
            return MedicalWearPbImpl.initTime;
        }

        @NotNull
        public final MedicalWearPbImpl getInstance() {
            return (MedicalWearPbImpl) MedicalWearPbImpl.instance$delegate.getValue();
        }

        public final void setInitTime(long j) {
            MedicalWearPbImpl.initTime = j;
        }
    }

    private final void callTimeout(String did, s7r wearPacket, boolean needResponse, OnSyncCallback callback) {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(did, wearPacket, needResponse, callback, 60000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MedicalWearPbImpl instance_delegate$lambda$0() {
        return new MedicalWearPbImpl();
    }

    private final void realGetFitnessIds(String did, s7r packet, final vnf callback) {
        callTimeout(did, packet, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.research.sync.remote.MedicalWearPbImpl.realGetFitnessIds.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                FitnessLogUtils.w("Research_Sync_PbImpl", "onError: did=" + did2 + ", errCode=" + code + " , binder:" + callback.asBinder().isBinderAlive());
                try {
                    if (callback.asBinder().isBinderAlive()) {
                        callback.k(did2, code);
                    }
                } catch (Exception e) {
                    FitnessLogUtils.e("Research_Sync_PbImpl", "e:" + e);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                byte[] bArrA;
                s7r packet2;
                ur9 ur9VarU = (result == null || (packet2 = result.getPacket()) == null) ? null : packet2.u();
                if (ur9VarU == null || !(ur9VarU.d0() || ur9VarU.e0())) {
                    FitnessLogUtils.w("Research_Sync_PbImpl", "realGetFitnessIds, dataId is null (did=" + did2 + ")");
                    callback.M0(did2, null);
                    return;
                }
                if (ur9VarU.e0()) {
                    bArrA = ur9VarU.B();
                    Intrinsics.checkNotNullExpressionValue(bArrA, "getIds(...)");
                } else {
                    bArrA = ur9VarU.A();
                    Intrinsics.checkNotNullExpressionValue(bArrA, "getId(...)");
                }
                String string = Arrays.toString(bArrA);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                FitnessLogUtils.i("Research_Sync_PbImpl", "onSuccess: did=" + did2 + " , dataIds:" + string);
                IBinder iBinderAsBinder = callback.asBinder();
                if (iBinderAsBinder == null || !iBinderAsBinder.isBinderAlive()) {
                    return;
                }
                callback.M0(did2, bArrA);
            }
        });
    }

    public final void confirmFitnessId(@NotNull String did, @NotNull byte[] dataId, @NotNull final vnf callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FitnessLogUtils.i("Research_Sync_PbImpl", "confirmFitnessId , did:" + did);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 75;
        ur9 ur9Var = new ur9();
        ur9Var.p0(dataId);
        s7rVar.S(ur9Var);
        callTimeout(did, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.research.sync.remote.MedicalWearPbImpl.confirmFitnessId.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) throws RemoteException {
                FitnessLogUtils.w("Research_Sync_PbImpl", "onError: did =" + did2 + ", code= " + code);
                callback.k(did2, code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                FitnessLogUtils.w("Research_Sync_PbImpl", "onSuccess: did =" + did2);
                callback.M0(did2, null);
            }
        });
    }

    @Nullable
    public final wnf getDataCallback() {
        return this.dataCallback;
    }

    public final void getHistoryFitnessIds(@NotNull String did, @NotNull vnf callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FitnessLogUtils.i("Research_Sync_PbImpl", "getHistoryFitnessIds , did:" + did);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 72;
        realGetFitnessIds(did, s7rVar, callback);
    }

    public final void getTodayFitnessIds(@NotNull String did, @Nullable Boolean isBgAutoSync, @NotNull vnf callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 71;
        boolean zAreEqual = Intrinsics.areEqual(isBgAutoSync, Boolean.TRUE);
        FitnessLogUtils.i("Research_Sync_PbImpl", "getTodayFitnessIds , did:" + did + ",isBgAutoSync=" + isBgAutoSync + ",reason=" + (zAreEqual ? 1 : 0));
        nu9 nu9Var = new nu9();
        nu9Var.c = zAreEqual ? 1 : 0;
        ur9 ur9Var = new ur9();
        ur9Var.P0(nu9Var);
        s7rVar.S(ur9Var);
        realGetFitnessIds(did, s7rVar, callback);
    }

    public final void requestMedicalData(@NotNull String did, @NotNull byte[] dataIds, @NotNull final wnf callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(dataIds, "dataIds");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FitnessLogUtils.i("Research_Sync_PbImpl", "requestMedicalData , did:" + did + " , dataIds:" + ArraysKt___ArraysKt.joinToString$default(dataIds, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        this.dataCallback = callback;
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        ur9 ur9Var = new ur9();
        if (dataIds.length == 7) {
            s7rVar.f = 74;
            ur9Var.p0(dataIds);
        } else {
            s7rVar.f = 73;
            ur9Var.q0(dataIds);
        }
        s7rVar.S(ur9Var);
        callTimeout(did, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.research.sync.remote.MedicalWearPbImpl.requestMedicalData.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) throws RemoteException {
                FitnessLogUtils.w("Research_Sync_PbImpl", "onError: did=" + did2 + ", errCode=" + code);
                callback.k(did2, code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                FitnessLogUtils.i("Research_Sync_PbImpl", "onSuccess , did:" + did2 + " ,type:" + type + " , result:" + result);
                callback.onSuccess(did2);
            }
        });
    }

    public final void setDataCallback(@Nullable wnf wnfVar) {
        this.dataCallback = wnfVar;
    }
}
