package com.huami.device.core.sync.impl.job;

import com.huami.device.core.sync.api.Interruptable;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.sync.ConstKt;
import com.huami.device.core.sync.report.JobRunner;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationHelperKt;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/huami/device/core/sync/impl/job/DefJobRunner;", "Lcom/huami/device/core/sync/report/JobRunner;", "Ljava/util/Queue;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "jobQueue", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "statusChannel", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "runJobQueue", "(Ljava/util/Queue;Lkotlinx/coroutines/channels/Channel;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "job", "runItem", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public class DefJobRunner implements JobRunner {

    /* JADX INFO: renamed from: com.huami.device.core.sync.impl.job.DefJobRunner$runJobQueue$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.impl.job.DefJobRunner", f = "DefJobRunner.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {61}, m = "runJobQueue$suspendImpl", n = {"this", "jobQueue", "statusChannel", "device", "scope", "errorList", "errorCode"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
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
            return DefJobRunner.runJobQueue$suspendImpl(DefJobRunner.this, null, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static /* synthetic */ Object runJobQueue$suspendImpl(DefJobRunner defJobRunner, Queue queue, Channel channel, HMBaseDevice hMBaseDevice, CoroutineScope coroutineScope, Continuation continuation) throws SyncException {
        AnonymousClass1 anonymousClass1;
        CoroutineScope coroutineScope2;
        LinkedList linkedList;
        Ref.IntRef intRef;
        Queue queue2;
        Channel channel2;
        HMBaseDevice hMBaseDevice2;
        Function0<String> function0;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = defJobRunner.new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = defJobRunner.new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope2 = coroutineScope;
            linkedList = new LinkedList();
            intRef = new Ref.IntRef();
            queue2 = queue;
            channel2 = channel;
            hMBaseDevice2 = hMBaseDevice;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.IntRef intRef2 = (Ref.IntRef) anonymousClass1.L$6;
            LinkedList linkedList2 = (LinkedList) anonymousClass1.L$5;
            coroutineScope2 = (CoroutineScope) anonymousClass1.L$4;
            HMBaseDevice hMBaseDevice3 = (HMBaseDevice) anonymousClass1.L$3;
            Channel channel3 = (Channel) anonymousClass1.L$2;
            Queue queue3 = (Queue) anonymousClass1.L$1;
            DefJobRunner defJobRunner2 = (DefJobRunner) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            queue2 = queue3;
            channel2 = channel3;
            intRef = intRef2;
            defJobRunner = defJobRunner2;
            linkedList = linkedList2;
            hMBaseDevice2 = hMBaseDevice3;
        }
        while (true) {
            final int i3 = 0;
            if (!(!queue2.isEmpty())) {
                if (!(!linkedList.isEmpty())) {
                    return Unit.INSTANCE;
                }
                for (Object obj2 : linkedList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    final Exception exc = (Exception) obj2;
                    HMLog.error$default(MenstruationHelperKt.TAG, null, exc, new Function0<String>() { // from class: com.huami.device.core.sync.impl.job.DefJobRunner$runJobQueue$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "exception index (" + i3 + ") " + ((Object) exc.getMessage());
                        }
                    }, 2, null);
                    if (intRef.element == 0 && (exc instanceof SyncException)) {
                        intRef.element = ((SyncException) exc).getErrorCode();
                    }
                    i3 = i4;
                }
                throw new SyncException("同步发生了(" + linkedList.size() + ")个错误.", (Exception) linkedList.getFirst(), intRef.element);
            }
            final SyncJob syncJob = (SyncJob) queue2.poll();
            if (syncJob == null) {
                HMLog.w("SyncCenter", "current queue size (" + queue2.size() + "), item is null", new Object[0]);
            } else {
                ConstKt.injectDevice(syncJob, hMBaseDevice2);
                ConstKt.injectScope(syncJob, coroutineScope2);
                ConstKt.injectStatusChannel(syncJob, channel2);
                if ((syncJob instanceof Interruptable) && ((Interruptable) syncJob).isInterrupted()) {
                    throw new SyncException("主动打断或取消了同步", null, 0, 6, null);
                }
                try {
                    try {
                        HMLog.info("SyncCenter", new Function0<String>() { // from class: com.huami.device.core.sync.impl.job.DefJobRunner.runJobQueue.2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            public final String invoke() {
                                return "======== " + ((Object) syncJob.getClass().getSimpleName()) + " ======= start";
                            }
                        });
                        defJobRunner.runItem(syncJob);
                        function0 = new Function0<String>() { // from class: com.huami.device.core.sync.impl.job.DefJobRunner.runJobQueue.3
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            public final String invoke() {
                                return "======== " + ((Object) syncJob.getClass().getSimpleName()) + " ======= end";
                            }
                        };
                    } catch (CancellationException e) {
                        throw new SyncException("cancel sync jobs by user.", e, 0, 4, null);
                    } catch (Exception e2) {
                        linkedList.add(e2);
                        function0 = new Function0<String>() { // from class: com.huami.device.core.sync.impl.job.DefJobRunner.runJobQueue.3
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            public final String invoke() {
                                return "======== " + ((Object) syncJob.getClass().getSimpleName()) + " ======= end";
                            }
                        };
                    }
                    HMLog.info("SyncCenter", function0);
                    anonymousClass1.L$0 = defJobRunner;
                    anonymousClass1.L$1 = queue2;
                    anonymousClass1.L$2 = channel2;
                    anonymousClass1.L$3 = hMBaseDevice2;
                    anonymousClass1.L$4 = coroutineScope2;
                    anonymousClass1.L$5 = linkedList;
                    anonymousClass1.L$6 = intRef;
                    anonymousClass1.label = 1;
                    if (DelayKt.delay(100L, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    HMLog.info("SyncCenter", new Function0<String>() { // from class: com.huami.device.core.sync.impl.job.DefJobRunner.runJobQueue.3
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "======== " + ((Object) syncJob.getClass().getSimpleName()) + " ======= end";
                        }
                    });
                    throw th;
                }
            }
        }
    }

    @Override // com.huami.device.core.sync.report.JobRunner
    public void runItem(@NotNull SyncJob job) {
        job.start();
    }

    @Override // com.huami.device.core.sync.report.JobRunner
    @Nullable
    public Object runJobQueue(@NotNull Queue<SyncJob> queue, @NotNull Channel<WorkStatusDto> channel, @NotNull HMBaseDevice hMBaseDevice, @NotNull CoroutineScope coroutineScope, @NotNull Continuation<? super Unit> continuation) {
        return runJobQueue$suspendImpl(this, queue, channel, hMBaseDevice, coroutineScope, continuation);
    }
}
