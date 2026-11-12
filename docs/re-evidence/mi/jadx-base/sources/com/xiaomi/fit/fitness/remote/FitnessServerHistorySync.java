package com.xiaomi.fit.fitness.remote;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedSource;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedType;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.persist.data.CloudSyncCheckResult;
import com.xiaomi.fit.fitness.persist.process.CrossYearSyncController;
import com.xiaomi.fit.fitness.persist.process.SyncRequestResult;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fit.fitness.persist.utils.FitnessServerSyncTracker;
import com.xiaomi.fit.fitness.remote.FitnessServerHistorySync;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\u00020\u0001:\u0001+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0010J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u000e\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\u000e\u0010\u001b\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001c\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ$\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060#J&\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010&J\u0018\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018H\u0002R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/xiaomi/fit/fitness/remote/FitnessServerHistorySync;", "Landroid/os/Handler$Callback;", "<init>", "()V", "fullPullFitnessKeys", "", "", "[Ljava/lang/String;", "isPullingSportData", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPullingFitnessData", "crossYearSyncInstance", "Lcom/xiaomi/fit/fitness/persist/process/CrossYearSyncController;", "handler", "Landroid/os/Handler;", "sendScheduledBroadcast", "", "handleMessage", "", "msg", "Landroid/os/Message;", "pullRecentLeastOneYearData", "pullAllSportReport", "pullAllSportReportFromServer", "Lcom/xiaomi/fit/fitness/persist/process/SyncRequestResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullLeastOneYearFitnessData", "pullOneYearFitnessFromServer", "pullAllFitnessDataOfSpecialKeys", "pullSportReport", "startTime", "", "endTime", "pullFitnessData", "keys", "", "pullPagingFullFitnessData", "persistKey", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSyncResult", "type", "Lcom/xiaomi/fit/data/common/constant/FitnessDataChangedType;", "requestResult", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessServerHistorySync implements Handler.Callback {
    private static final int HANDLER_MSG_WHAT_ID = 10;

    @NotNull
    private static final String TAG = "FitnessServerSyncHistory";
    private Handler handler;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FitnessServerHistorySync instance = new FitnessServerHistorySync();
    private static final long FIX_NOTIFY_CHANGED_TIME = TimeUnit.SECONDS.toMillis(10);

    @NotNull
    private final String[] fullPullFitnessKeys = {FitnessPersistKey.WomenHealthStatus, FitnessPersistKey.WomenHealthSymptoms, "weight", "pai"};

    @NotNull
    private final AtomicBoolean isPullingSportData = new AtomicBoolean(false);

    @NotNull
    private final AtomicBoolean isPullingFitnessData = new AtomicBoolean(false);

    @NotNull
    private final CrossYearSyncController crossYearSyncInstance = CrossYearSyncController.INSTANCE.getInstance();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fit/fitness/remote/FitnessServerHistorySync$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/remote/FitnessServerHistorySync;", "getInstance", "()Lcom/xiaomi/fit/fitness/remote/FitnessServerHistorySync;", "TAG", "", "HANDLER_MSG_WHAT_ID", "", "FIX_NOTIFY_CHANGED_TIME", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessServerHistorySync getInstance() {
            return FitnessServerHistorySync.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerHistorySync$pullAllFitnessDataOfSpecialKeys$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerHistorySync", f = "FitnessServerHistorySync.kt", i = {}, l = {181}, m = "pullAllFitnessDataOfSpecialKeys", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessServerHistorySync.this.pullAllFitnessDataOfSpecialKeys(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerHistorySync$pullAllSportReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerHistorySync$pullAllSportReport$1", f = "FitnessServerHistorySync.kt", i = {0}, l = {99}, m = "invokeSuspend", n = {"startSyncTime"}, s = {"J$0"})
    public static final class C17041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        public C17041(Continuation<? super C17041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17041 c17041 = FitnessServerHistorySync.this.new C17041(continuation);
            c17041.L$0 = obj;
            return c17041;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FitnessServerHistorySync.this.isPullingSportData.set(true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FitnessServerHistorySync$pullAllSportReport$1$requestResult$1(FitnessServerHistorySync.this, null), 3, null);
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                obj = deferredAsync$default.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = jCurrentTimeMillis;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
            }
            SyncRequestResult syncRequestResult = (SyncRequestResult) obj;
            FitnessLogUtils.d(FitnessServerHistorySync.TAG, "pullFullSportReport: hasData = " + syncRequestResult.getHasNewData() + ", cost(" + (System.currentTimeMillis() - j) + ")ms");
            FitnessServerHistorySync.this.isPullingSportData.set(false);
            FitnessServerHistorySync.this.handleSyncResult(FitnessDataChangedType.Sport, syncRequestResult);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerHistorySync$pullAllSportReportFromServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerHistorySync", f = "FitnessServerHistorySync.kt", i = {}, l = {115}, m = "pullAllSportReportFromServer", n = {}, s = {})
    public static final class C17051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17051(Continuation<? super C17051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessServerHistorySync.this.pullAllSportReportFromServer(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerHistorySync$pullFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerHistorySync$pullFitnessData$1", f = "FitnessServerHistorySync.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTime;
        final /* synthetic */ List<String> $keys;
        final /* synthetic */ long $startTime;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17061(List<String> list, long j, long j2, Continuation<? super C17061> continuation) {
            super(2, continuation);
            this.$keys = list;
            this.$startTime = j;
            this.$endTime = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FitnessServerHistorySync.this.new C17061(this.$keys, this.$startTime, this.$endTime, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SyncRequestResult syncRequestResult;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CrossYearSyncController crossYearSyncController = FitnessServerHistorySync.this.crossYearSyncInstance;
                    List<String> list = this.$keys;
                    long j = this.$startTime;
                    long j2 = this.$endTime;
                    this.label = 1;
                    obj = crossYearSyncController.pullCrossYearFitnessData(list, j, j2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                syncRequestResult = (SyncRequestResult) obj;
            } catch (Throwable th) {
                FitnessLogUtils.e(FitnessServerHistorySync.TAG, "pullFitnessData", th);
                syncRequestResult = new SyncRequestResult(false, null, th.getMessage());
            }
            FitnessLogUtils.i(FitnessServerHistorySync.TAG, "pullFitnessData: hasData = " + syncRequestResult.getHasNewData());
            FitnessServerHistorySync.this.handleSyncResult(FitnessDataChangedType.Fitness, syncRequestResult);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerHistorySync$pullLeastOneYearFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerHistorySync$pullLeastOneYearFitnessData$1", f = "FitnessServerHistorySync.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3}, l = {134, 135, 136, 148}, m = "invokeSuspend", n = {"mediaJob", "projectJob", "startSyncTime", "projectJob", "oneYearRequestResult", "startSyncTime", "oneYearRequestResult", "medicalRequestResult", "startSyncTime", "hasData", "success"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "I$0", "I$1"})
    public static final class C17071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C17071(Continuation<? super C17071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17071 c17071 = FitnessServerHistorySync.this.new C17071(continuation);
            c17071.L$0 = obj;
            return c17071;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00ec A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:33:0x0104  */
        /* JADX WARN: Code duplicated, block: B:36:0x010b  */
        /* JADX WARN: Code duplicated, block: B:41:0x0119  */
        /* JADX WARN: Code duplicated, block: B:44:0x014f  */
        /* JADX WARN: Code duplicated, block: B:47:0x016d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:48:0x016e  */
        /* JADX WARN: Code duplicated, block: B:51:0x0192  */
        /* JADX WARN: Code duplicated, block: B:52:0x0195  */
        /* JADX WARN: Code duplicated, block: B:54:0x0199  */
        /* JADX WARN: Code duplicated, block: B:55:0x019c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objAwait;
            Deferred deferred;
            Deferred deferred2;
            long j;
            Object objAwait2;
            long j2;
            SyncRequestResult syncRequestResult;
            SyncRequestResult syncRequestResult2;
            Object objAwait3;
            ?? r7;
            int i;
            Handler handler;
            Object objPullAllFitnessDataOfSpecialKeys;
            int i2;
            ?? r2;
            boolean z;
            boolean z2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 == 1) {
                    j = this.J$0;
                    deferred2 = (Deferred) this.L$1;
                    deferred = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait = obj;
                } else if (i3 == 2) {
                    long j3 = this.J$0;
                    SyncRequestResult syncRequestResult3 = (SyncRequestResult) this.L$1;
                    Deferred deferred3 = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwait2 = obj;
                    syncRequestResult = syncRequestResult3;
                    deferred2 = deferred3;
                    j2 = j3;
                    syncRequestResult2 = (SyncRequestResult) objAwait2;
                    this.L$0 = syncRequestResult;
                    this.L$1 = syncRequestResult2;
                    this.J$0 = j2;
                    this.label = 3;
                    objAwait3 = deferred2.await(this);
                    if (objAwait3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    SyncRequestResult syncRequestResult4 = (SyncRequestResult) objAwait3;
                    if (syncRequestResult.getHasNewData()) {
                        r7 = 1;
                    } else {
                        r7 = 1;
                    }
                    if (!syncRequestResult.getSuccess()) {
                        i = 0;
                    } else {
                        i = 0;
                    }
                    FitnessLogUtils.d(FitnessServerHistorySync.TAG, "pullRecentLeastOneYearData: hasData = " + r7 + ", cost(" + (System.currentTimeMillis() - j2) + ")ms");
                    FitnessServerHistorySync.this.handleSyncResult(FitnessDataChangedType.Fitness, syncRequestResult);
                    handler = FitnessServerHistorySync.this.handler;
                    if (handler == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("handler");
                        handler = null;
                    }
                    handler.removeMessages(10);
                    FitnessServerHistorySync fitnessServerHistorySync = FitnessServerHistorySync.this;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = r7;
                    this.I$1 = i;
                    this.label = 4;
                    objPullAllFitnessDataOfSpecialKeys = fitnessServerHistorySync.pullAllFitnessDataOfSpecialKeys(this);
                    if (objPullAllFitnessDataOfSpecialKeys == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = i;
                    r2 = r7;
                } else if (i3 == 3) {
                    j2 = this.J$0;
                    SyncRequestResult syncRequestResult5 = (SyncRequestResult) this.L$1;
                    syncRequestResult = (SyncRequestResult) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    syncRequestResult2 = syncRequestResult5;
                    objAwait3 = obj;
                    SyncRequestResult syncRequestResult6 = (SyncRequestResult) objAwait3;
                    if (syncRequestResult.getHasNewData() || syncRequestResult2.getHasNewData() || syncRequestResult6.getHasNewData()) {
                        r7 = 1;
                    } else {
                        r7 = 0;
                    }
                    if (!syncRequestResult.getSuccess() && syncRequestResult2.getSuccess() && syncRequestResult6.getSuccess()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    FitnessLogUtils.d(FitnessServerHistorySync.TAG, "pullRecentLeastOneYearData: hasData = " + r7 + ", cost(" + (System.currentTimeMillis() - j2) + ")ms");
                    FitnessServerHistorySync.this.handleSyncResult(FitnessDataChangedType.Fitness, syncRequestResult);
                    handler = FitnessServerHistorySync.this.handler;
                    if (handler == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("handler");
                        handler = null;
                    }
                    handler.removeMessages(10);
                    FitnessServerHistorySync fitnessServerHistorySync2 = FitnessServerHistorySync.this;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = r7;
                    this.I$1 = i;
                    this.label = 4;
                    objPullAllFitnessDataOfSpecialKeys = fitnessServerHistorySync2.pullAllFitnessDataOfSpecialKeys(this);
                    if (objPullAllFitnessDataOfSpecialKeys == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = i;
                    r2 = r7;
                } else {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.I$1;
                    int i4 = this.I$0;
                    ResultKt.throwOnFailure(obj);
                    objPullAllFitnessDataOfSpecialKeys = obj;
                    r2 = i4;
                }
                FitnessLogUtils.d(FitnessServerHistorySync.TAG, "pullAllFitnessDataOfSpecialKeys: hasData = " + ((SyncRequestResult) objPullAllFitnessDataOfSpecialKeys).getHasNewData());
                FitnessServerHistorySync fitnessServerHistorySync3 = FitnessServerHistorySync.this;
                FitnessDataChangedType fitnessDataChangedType = FitnessDataChangedType.Fitness;
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (r2 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                fitnessServerHistorySync3.handleSyncResult(fitnessDataChangedType, new SyncRequestResult(z, z2, false, null, null, false, 60, null));
                FitnessServerHistorySync.this.isPullingFitnessData.set(false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FitnessServerHistorySync.this.sendScheduledBroadcast();
            FitnessServerHistorySync.this.isPullingFitnessData.set(true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FitnessServerHistorySync$pullLeastOneYearFitnessData$1$fitnessJob$1(FitnessServerHistorySync.this, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FitnessServerHistorySync$pullLeastOneYearFitnessData$1$mediaJob$1(FitnessServerHistorySync.this, null), 3, null);
            Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FitnessServerHistorySync$pullLeastOneYearFitnessData$1$projectJob$1(FitnessServerHistorySync.this, null), 3, null);
            this.L$0 = deferredAsync$default2;
            this.L$1 = deferredAsync$default3;
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            objAwait = deferredAsync$default.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred = deferredAsync$default2;
            deferred2 = deferredAsync$default3;
            j = jCurrentTimeMillis;
            SyncRequestResult syncRequestResult7 = (SyncRequestResult) objAwait;
            this.L$0 = deferred2;
            this.L$1 = syncRequestResult7;
            this.J$0 = j;
            this.label = 2;
            objAwait2 = deferred.await(this);
            if (objAwait2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            j2 = j;
            syncRequestResult = syncRequestResult7;
            syncRequestResult2 = (SyncRequestResult) objAwait2;
            this.L$0 = syncRequestResult;
            this.L$1 = syncRequestResult2;
            this.J$0 = j2;
            this.label = 3;
            objAwait3 = deferred2.await(this);
            if (objAwait3 == coroutine_suspended) {
                return coroutine_suspended;
            }
            SyncRequestResult syncRequestResult8 = (SyncRequestResult) objAwait3;
            if (syncRequestResult.getHasNewData()) {
                r7 = 1;
            } else {
                r7 = 1;
            }
            if (!syncRequestResult.getSuccess()) {
                i = 0;
            } else {
                i = 0;
            }
            FitnessLogUtils.d(FitnessServerHistorySync.TAG, "pullRecentLeastOneYearData: hasData = " + r7 + ", cost(" + (System.currentTimeMillis() - j2) + ")ms");
            FitnessServerHistorySync.this.handleSyncResult(FitnessDataChangedType.Fitness, syncRequestResult);
            handler = FitnessServerHistorySync.this.handler;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handler");
                handler = null;
            }
            handler.removeMessages(10);
            FitnessServerHistorySync fitnessServerHistorySync4 = FitnessServerHistorySync.this;
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = r7;
            this.I$1 = i;
            this.label = 4;
            objPullAllFitnessDataOfSpecialKeys = fitnessServerHistorySync4.pullAllFitnessDataOfSpecialKeys(this);
            if (objPullAllFitnessDataOfSpecialKeys == coroutine_suspended) {
                return coroutine_suspended;
            }
            i2 = i;
            r2 = r7;
            FitnessLogUtils.d(FitnessServerHistorySync.TAG, "pullAllFitnessDataOfSpecialKeys: hasData = " + ((SyncRequestResult) objPullAllFitnessDataOfSpecialKeys).getHasNewData());
            FitnessServerHistorySync fitnessServerHistorySync5 = FitnessServerHistorySync.this;
            FitnessDataChangedType fitnessDataChangedType2 = FitnessDataChangedType.Fitness;
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (r2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            fitnessServerHistorySync5.handleSyncResult(fitnessDataChangedType2, new SyncRequestResult(z, z2, false, null, null, false, 60, null));
            FitnessServerHistorySync.this.isPullingFitnessData.set(false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerHistorySync$pullOneYearFitnessFromServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerHistorySync", f = "FitnessServerHistorySync.kt", i = {0}, l = {168}, m = "pullOneYearFitnessFromServer", n = {"startTime"}, s = {"J$0"})
    public static final class C17081 extends ContinuationImpl {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public C17081(Continuation<? super C17081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessServerHistorySync.this.pullOneYearFitnessFromServer(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessServerHistorySync$pullPagingFullFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessServerHistorySync", f = "FitnessServerHistorySync.kt", i = {}, l = {234}, m = "pullPagingFullFitnessData", n = {}, s = {})
    public static final class C17091 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17091(Continuation<? super C17091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessServerHistorySync.this.pullPagingFullFitnessData(null, 0L, 0L, this);
        }
    }

    private FitnessServerHistorySync() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSyncResult(FitnessDataChangedType type, SyncRequestResult requestResult) {
        if (requestResult.getHasNewData()) {
            FitnessDataChangedUtils.INSTANCE.sendHistoryDataChangedBroadcast(FitnessDataChangedSource.CloudSync, type);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pullAllFitnessDataOfSpecialKeys(Continuation<? super SyncRequestResult> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objPullAllFitnessDataByKey = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPullAllFitnessDataByKey);
                CrossYearSyncController crossYearSyncController = this.crossYearSyncInstance;
                List<String> list = ArraysKt___ArraysKt.toList(this.fullPullFitnessKeys);
                anonymousClass1.label = 1;
                objPullAllFitnessDataByKey = crossYearSyncController.pullAllFitnessDataByKey(list, anonymousClass1);
                if (objPullAllFitnessDataByKey == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPullAllFitnessDataByKey);
            }
            return objPullAllFitnessDataByKey;
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "pullOneYearFitnessFromServer", th);
            return new SyncRequestResult(false, null, th.getMessage());
        }
    }

    private final void pullAllSportReport() {
        if (this.isPullingSportData.get()) {
            FitnessLogUtils.i(TAG, "pullRecentLeastOneYearData: last task is doing, and abort");
        } else {
            ScopeExtKt.scopeNet(Dispatchers.getIO(), new C17041(null)).m503catch(new Function2() { // from class: kv9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FitnessServerHistorySync.pullAllSportReport$lambda$0(this.f24329a, (AndroidScope) obj, (Throwable) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pullAllSportReport$lambda$0(FitnessServerHistorySync this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.e(TAG, "pullAllSportReport", it);
        this$0.isPullingSportData.set(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pullAllSportReportFromServer(Continuation<? super SyncRequestResult> continuation) {
        C17051 c17051;
        if (continuation instanceof C17051) {
            c17051 = (C17051) continuation;
            int i = c17051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17051.label = i - Integer.MIN_VALUE;
            } else {
                c17051 = new C17051(continuation);
            }
        } else {
            c17051 = new C17051(continuation);
        }
        Object objPullAllSportReport = c17051.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17051.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPullAllSportReport);
                CrossYearSyncController crossYearSyncController = this.crossYearSyncInstance;
                c17051.label = 1;
                objPullAllSportReport = crossYearSyncController.pullAllSportReport(c17051);
                if (objPullAllSportReport == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPullAllSportReport);
            }
            return (SyncRequestResult) objPullAllSportReport;
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "syncSportReportWithServer", th);
            return new SyncRequestResult(false, null, null, 6, null);
        }
    }

    private final void pullLeastOneYearFitnessData() {
        if (this.isPullingFitnessData.get()) {
            FitnessLogUtils.i(TAG, "pullRecentLeastOneYearData: last task is doing, and abort");
        } else {
            ScopeExtKt.scopeNet(Dispatchers.getIO(), new C17071(null)).m503catch(new Function2() { // from class: lv9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FitnessServerHistorySync.pullLeastOneYearFitnessData$lambda$1(this.f25466a, (AndroidScope) obj, (Throwable) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pullLeastOneYearFitnessData$lambda$1(FitnessServerHistorySync this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.e(TAG, "pullLeastOneYearFitnessData", it);
        this$0.isPullingFitnessData.set(false);
        Handler handler = this$0.handler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
            handler = null;
        }
        handler.removeMessages(10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pullOneYearFitnessFromServer(Continuation<? super SyncRequestResult> continuation) {
        C17081 c17081;
        long j;
        SyncRequestResult syncRequestResult;
        if (continuation instanceof C17081) {
            c17081 = (C17081) continuation;
            int i = c17081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17081.label = i - Integer.MIN_VALUE;
            } else {
                c17081 = new C17081(continuation);
            }
        } else {
            c17081 = new C17081(continuation);
        }
        Object objPullRecentOneYearFitnessData = c17081.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPullRecentOneYearFitnessData);
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                CrossYearSyncController crossYearSyncController = this.crossYearSyncInstance;
                c17081.J$0 = jCurrentTimeMillis;
                c17081.label = 1;
                objPullRecentOneYearFitnessData = crossYearSyncController.pullRecentOneYearFitnessData(c17081);
                if (objPullRecentOneYearFitnessData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = jCurrentTimeMillis;
            } catch (Throwable th) {
                th = th;
                j = jCurrentTimeMillis;
                FitnessLogUtils.e(TAG, "pullOneYearFitnessFromServer", th);
                syncRequestResult = new SyncRequestResult(false, null, th.getMessage());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c17081.J$0;
            try {
                ResultKt.throwOnFailure(objPullRecentOneYearFitnessData);
            } catch (Throwable th2) {
                th = th2;
                FitnessLogUtils.e(TAG, "pullOneYearFitnessFromServer", th);
                syncRequestResult = new SyncRequestResult(false, null, th.getMessage());
            }
        }
        syncRequestResult = (SyncRequestResult) objPullRecentOneYearFitnessData;
        FitnessServerSyncTracker.INSTANCE.getInstance().trackOneYearPullFitness(j, syncRequestResult);
        return syncRequestResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendScheduledBroadcast() {
        if (this.handler == null) {
            HandlerThread handlerThread = new HandlerThread(TAG);
            handlerThread.start();
            this.handler = new Handler(handlerThread.getLooper(), this);
        }
        Handler handler = this.handler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
            handler = null;
        }
        handler.sendEmptyMessageDelayed(10, FIX_NOTIFY_CHANGED_TIME);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what != 10) {
            return false;
        }
        FitnessLogUtils.i(TAG, "postScheduledBroadcast(" + FIX_NOTIFY_CHANGED_TIME + " ms)");
        handleSyncResult(FitnessDataChangedType.Fitness, new SyncRequestResult(true, true, false, null, null, false, 60, null));
        sendScheduledBroadcast();
        return true;
    }

    public final void pullFitnessData(long startTime, long endTime, @NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        CloudSyncCheckResult cloudSyncCheckResultCheckServerRequestEnable = FitnessPersistUtils.INSTANCE.checkServerRequestEnable();
        if (cloudSyncCheckResultCheckServerRequestEnable == CloudSyncCheckResult.SUCCESS || cloudSyncCheckResultCheckServerRequestEnable == CloudSyncCheckResult.BACKGROUND_RUNNING) {
            ScopeExtKt.scopeNet(Dispatchers.getIO(), new C17061(keys, startTime, endTime, null));
            return;
        }
        FitnessLogUtils.i(TAG, "pullFitnessData: checkResult = " + cloudSyncCheckResultCheckServerRequestEnable.getMsg() + ", and abort");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object pullPagingFullFitnessData(@NotNull String str, long j, long j2, @NotNull Continuation<? super Boolean> continuation) {
        C17091 c17091;
        if (continuation instanceof C17091) {
            c17091 = (C17091) continuation;
            int i = c17091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17091.label = i - Integer.MIN_VALUE;
            } else {
                c17091 = new C17091(continuation);
            }
        } else {
            c17091 = new C17091(continuation);
        }
        C17091 c17092 = c17091;
        Object objPullPagingFullFitnessData = c17092.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17092.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPullPagingFullFitnessData);
                CloudSyncCheckResult cloudSyncCheckResultCheckServerRequestEnable = FitnessPersistUtils.INSTANCE.checkServerRequestEnable();
                if (cloudSyncCheckResultCheckServerRequestEnable != CloudSyncCheckResult.SUCCESS) {
                    FitnessLogUtils.i(TAG, "pullPagingFullFitnessData: checkResult = " + cloudSyncCheckResultCheckServerRequestEnable.getMsg() + ", and abort");
                    return Boxing.boxBoolean(false);
                }
                CrossYearSyncController crossYearSyncController = this.crossYearSyncInstance;
                c17092.label = 1;
                objPullPagingFullFitnessData = crossYearSyncController.pullPagingFullFitnessData(str, j, j2, c17092);
                if (objPullPagingFullFitnessData == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPullPagingFullFitnessData);
            }
            return objPullPagingFullFitnessData;
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "pullPagingFullFitnessData", th);
            return Boxing.boxBoolean(false);
        }
    }

    public final void pullRecentLeastOneYearData() {
        FitnessLogUtils.i(TAG, "pullRecentLeastOneYearData");
        CloudSyncCheckResult cloudSyncCheckResultCheckServerRequestEnable = FitnessPersistUtils.INSTANCE.checkServerRequestEnable();
        if (cloudSyncCheckResultCheckServerRequestEnable == CloudSyncCheckResult.SUCCESS) {
            pullLeastOneYearFitnessData();
            pullAllSportReport();
            return;
        }
        FitnessLogUtils.i(TAG, "pullRecentLeastOneYearData: checkResult = " + cloudSyncCheckResultCheckServerRequestEnable.getMsg() + ", and abort");
    }

    public final void pullSportReport(long startTime, long endTime) {
        CloudSyncCheckResult cloudSyncCheckResultCheckServerRequestEnable = FitnessPersistUtils.INSTANCE.checkServerRequestEnable();
        if (cloudSyncCheckResultCheckServerRequestEnable == CloudSyncCheckResult.SUCCESS || cloudSyncCheckResultCheckServerRequestEnable == CloudSyncCheckResult.BACKGROUND_RUNNING) {
            pullAllSportReport();
            return;
        }
        FitnessLogUtils.i(TAG, "pullSportReport: checkResult = " + cloudSyncCheckResultCheckServerRequestEnable.getMsg() + ", and abort");
    }
}
