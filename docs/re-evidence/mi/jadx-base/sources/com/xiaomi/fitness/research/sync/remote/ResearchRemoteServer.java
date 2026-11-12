package com.xiaomi.fitness.research.sync.remote;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.ByteUtil;
import defpackage.r72;
import defpackage.vnf;
import defpackage.vtc;
import defpackage.wnf;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\t\b\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\u0010\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0013\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/research/sync/remote/ResearchRemoteServer;", "Lvtc$a;", "", "fileName", "", "deleteFile", "(Ljava/lang/String;)V", "did", "Lvnf;", "callback", "getTodayMedicalIds", "(Ljava/lang/String;Lvnf;)V", "getHistoryMedicalIds", "", "ids", "Lwnf;", "requestMedicalData", "(Ljava/lang/String;[BLwnf;)V", "id", "confirmMedicalId", "(Ljava/lang/String;[BLvnf;)V", "delOriginalData", "([B)V", "", "getVersion", "()I", "<init>", "()V", "Companion", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ResearchRemoteServer extends vtc.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int KEY_HEALTH_RESEARCH_SERVER = 701;

    @NotNull
    public static final String TAG = "Research_Sync_Server";

    @Nullable
    private static wnf dataCallback;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/research/sync/remote/ResearchRemoteServer$Companion;", "", "Lwnf;", "dataCallback", "Lwnf;", "getDataCallback", "()Lwnf;", "setDataCallback", "(Lwnf;)V", "", "TAG", "Ljava/lang/String;", "", "KEY_HEALTH_RESEARCH_SERVER", "I", "<init>", "()V", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final wnf getDataCallback() {
            return ResearchRemoteServer.dataCallback;
        }

        public final void setDataCallback(@Nullable wnf wnfVar) {
            ResearchRemoteServer.dataCallback = wnfVar;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.research.sync.remote.ResearchRemoteServer$delOriginalData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.research.sync.remote.ResearchRemoteServer$delOriginalData$1", f = "ResearchRemoteServer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $ids;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(byte[] bArr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ids = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ResearchRemoteServer.this.new AnonymousClass1(this.$ids, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ResearchRemoteServer.this.deleteFile(ByteUtil.byteToString(this.$ids));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ResearchRemoteServer() {
        FitnessLogUtils.i("Research_Sync_Server", ">>>>>>> ResearchRemoteServer init");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(String fileName) {
        File file = new File(r72.l(), fileName);
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // defpackage.vtc
    public void confirmMedicalId(@Nullable String did, @Nullable byte[] id, @Nullable vnf callback) {
        FitnessLogUtils.i("Research_Sync_Server", "confirmMedicalId , did:" + did + " , byte:" + ByteUtil.byteToString(id));
        MedicalWearPbImpl companion = MedicalWearPbImpl.INSTANCE.getInstance();
        Intrinsics.checkNotNull(did);
        Intrinsics.checkNotNull(id);
        Intrinsics.checkNotNull(callback);
        companion.confirmFitnessId(did, id, callback);
    }

    @Override // defpackage.vtc
    public void delOriginalData(@Nullable byte[] ids) {
        FitnessLogUtils.i("Research_Sync_Server", "delOriginalData , id:" + ByteUtil.byteToString(ids));
        AnyExtKt.io$default(null, new AnonymousClass1(ids, null), 1, null);
    }

    @Override // defpackage.vtc
    public void getHistoryMedicalIds(@Nullable String did, @Nullable vnf callback) {
        FitnessLogUtils.i("Research_Sync_Server", "getHistoryMedicalIds , did:" + did);
        if (did != null && did.length() == 0) {
            FitnessLogUtils.i("Research_Sync_Server", "getHistoryMedicalIds , did == null");
        } else {
            if (callback == null) {
                FitnessLogUtils.i("Research_Sync_Server", "getHistoryMedicalIds , callback == null");
                return;
            }
            MedicalWearPbImpl companion = MedicalWearPbImpl.INSTANCE.getInstance();
            Intrinsics.checkNotNull(did);
            companion.getHistoryFitnessIds(did, callback);
        }
    }

    @Override // defpackage.vtc
    public void getTodayMedicalIds(@Nullable String did, @Nullable vnf callback) {
        FitnessLogUtils.i("Research_Sync_Server", "getTodayMedicalIds , did:" + did);
        if (did != null && did.length() == 0) {
            FitnessLogUtils.i("Research_Sync_Server", "getTodayMedicalIds , did == null");
            return;
        }
        MedicalWearPbImpl companion = MedicalWearPbImpl.INSTANCE.getInstance();
        Intrinsics.checkNotNull(did);
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNull(callback);
        companion.getTodayFitnessIds(did, bool, callback);
    }

    @Override // defpackage.vtc
    public int getVersion() {
        return 0;
    }

    @Override // defpackage.vtc
    public void requestMedicalData(@Nullable String did, @Nullable byte[] ids, @Nullable wnf callback) {
        FitnessLogUtils.i("Research_Sync_Server", "requestMedicalData , did:" + did);
        if (did != null && did.length() == 0) {
            FitnessLogUtils.i("Research_Sync_Server", "requestMedicalData , did == null");
            return;
        }
        if (ids != null && ids.length == 0) {
            FitnessLogUtils.i("Research_Sync_Server", "requestMedicalData , ids == null");
            return;
        }
        dataCallback = callback;
        MedicalWearPbImpl companion = MedicalWearPbImpl.INSTANCE.getInstance();
        Intrinsics.checkNotNull(did);
        Intrinsics.checkNotNull(ids);
        Intrinsics.checkNotNull(callback);
        companion.requestMedicalData(did, ids, callback);
    }
}
