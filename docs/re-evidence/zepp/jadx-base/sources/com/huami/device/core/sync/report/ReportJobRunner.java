package com.huami.device.core.sync.report;

import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.job.DefJobRunner;
import com.huami.device.core.sync.report.service.StoreServiceApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/huami/device/core/sync/report/ReportJobRunner;", "Lcom/huami/device/core/sync/impl/job/DefJobRunner;", "Ljava/util/Queue;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "jobQueue", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "statusChannel", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "runJobQueue", "(Ljava/util/Queue;Lkotlinx/coroutines/channels/Channel;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "job", "runItem", "Lcom/huami/device/core/sync/report/service/StoreServiceApi;", "storeService", "Lcom/huami/device/core/sync/report/service/StoreServiceApi;", "<init>", "(Lcom/huami/device/core/sync/report/service/StoreServiceApi;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class ReportJobRunner extends DefJobRunner {

    @NotNull
    private final StoreServiceApi storeService;

    /* JADX INFO: renamed from: com.huami.device.core.sync.report.ReportJobRunner$runJobQueue$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.report.ReportJobRunner", f = "ReportJobRunner.kt", i = {0, 0, 0}, l = {35}, m = "runJobQueue", n = {"this", "scope", "startTime"}, s = {"L$0", "L$1", "J$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReportJobRunner.this.runJobQueue(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.huami.device.core.sync.report.ReportJobRunner$runJobQueue$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.report.ReportJobRunner$runJobQueue$2", f = "ReportJobRunner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ReportJobRunner.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ReportJobRunner.this.storeService.flush();
            return Unit.INSTANCE;
        }
    }

    public ReportJobRunner(@NotNull StoreServiceApi storeServiceApi) {
        this.storeService = storeServiceApi;
    }

    @Override // com.huami.device.core.sync.impl.job.DefJobRunner, com.huami.device.core.sync.report.JobRunner
    public void runItem(@NotNull SyncJob job) {
        TimeRecordProxy timeRecordProxy = new TimeRecordProxy(job);
        timeRecordProxy.start();
        this.storeService.push(timeRecordProxy.report());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.device.core.sync.impl.job.DefJobRunner, com.huami.device.core.sync.report.JobRunner
    @Nullable
    public Object runJobQueue(@NotNull Queue<SyncJob> queue, @NotNull Channel<WorkStatusDto> channel, @NotNull HMBaseDevice hMBaseDevice, @NotNull CoroutineScope coroutineScope, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        CoroutineScope coroutineScope2;
        ReportJobRunner reportJobRunner;
        long j;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            anonymousClass2.L$0 = this;
            coroutineScope2 = coroutineScope;
            anonymousClass2.L$1 = coroutineScope2;
            anonymousClass2.J$0 = jCurrentTimeMillis;
            anonymousClass2.label = 1;
            if (super.runJobQueue(queue, channel, hMBaseDevice, coroutineScope, anonymousClass2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            reportJobRunner = this;
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = anonymousClass2.J$0;
            CoroutineScope coroutineScope3 = (CoroutineScope) anonymousClass2.L$1;
            reportJobRunner = (ReportJobRunner) anonymousClass2.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope2 = coroutineScope3;
        }
        reportJobRunner.storeService.push(new ReportJobItem(-1, "ALL", System.currentTimeMillis() - j, -1L, -1L, null, 32, null));
        e.f(coroutineScope2, Dispatchers.getIO(), null, reportJobRunner.new AnonymousClass2(null), 2, null);
        return Unit.INSTANCE;
    }
}
