package com.huami.device.core.sync.impl.woker;

import com.huami.device.core.sync.api.WorkerExecutor;
import com.huami.device.core.sync.api.worker.AfterSyncWorkerApi;
import com.huami.device.core.sync.api.worker.Worker;
import com.huami.device.core.sync.impl.sync.ConstKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.e;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/device/core/sync/impl/woker/WorkerExecutorImpl;", "Lcom/huami/device/core/sync/api/WorkerExecutor;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "run", "Lcom/huami/device/core/sync/api/worker/Worker;", "item", "doWorker", "", "info", "debugInfo", "start", "Lcom/huami/device/core/sync/api/worker/AfterSyncWorkerApi;", "api", "Lcom/huami/device/core/sync/api/worker/AfterSyncWorkerApi;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/channels/Channel;", "runJobQueueChannel", "Lkotlinx/coroutines/channels/Channel;", "Ljava/util/concurrent/ExecutorService;", "threadPool$delegate", "Lkotlin/Lazy;", "getThreadPool", "()Ljava/util/concurrent/ExecutorService;", "threadPool", "<init>", "(Lcom/huami/device/core/sync/api/worker/AfterSyncWorkerApi;)V", "Companion", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class WorkerExecutorImpl implements WorkerExecutor, CoroutineScope {
    private static final int CACHE_POOL_SIZE = 20;

    @NotNull
    private static final String TAG = "WorkerExecutor";
    private static final long WORKER_QUITE_TIME_OUT = 30000;
    private static final long WORKER_TIME_OUT = 120000;

    @NotNull
    private final AfterSyncWorkerApi api;

    @NotNull
    private final CoroutineContext coroutineContext = Dispatchers.getIO();

    @NotNull
    private final Channel<Worker> runJobQueueChannel = ChannelKt.Channel(20);

    /* JADX INFO: renamed from: threadPool$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy threadPool = LazyKt__LazyJVMKt.lazy(new Function0<ExecutorService>() { // from class: com.huami.device.core.sync.impl.woker.WorkerExecutorImpl$threadPool$2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ExecutorService getA() {
            return Executors.newFixedThreadPool(1);
        }
    });

    /* JADX INFO: renamed from: com.huami.device.core.sync.impl.woker.WorkerExecutorImpl$run$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.impl.woker.WorkerExecutorImpl$run$1", f = "WorkerExecutorImpl.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ HMBaseDevice $device;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HMBaseDevice hMBaseDevice, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$device = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorkerExecutorImpl.this.new AnonymousClass1(this.$device, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0037 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:12:0x0038  */
        /* JADX WARN: Code duplicated, block: B:15:0x0045  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0038 -> B:13:0x003d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                kotlin.ResultKt.throwOnFailure(r8)
                r3 = r1
                r1 = r0
                r0 = r7
                goto L3d
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                kotlin.ResultKt.throwOnFailure(r8)
                com.huami.device.core.sync.impl.woker.WorkerExecutorImpl r8 = com.huami.device.core.sync.impl.woker.WorkerExecutorImpl.this
                kotlinx.coroutines.channels.Channel r8 = com.huami.device.core.sync.impl.woker.WorkerExecutorImpl.access$getRunJobQueueChannel$p(r8)
                kotlinx.coroutines.channels.ChannelIterator r8 = r8.iterator()
                r1 = r8
                r8 = r7
            L2d:
                r8.L$0 = r1
                r8.label = r2
                java.lang.Object r3 = r1.hasNext(r8)
                if (r3 != r0) goto L38
                return r0
            L38:
                r6 = r0
                r0 = r8
                r8 = r3
                r3 = r1
                r1 = r6
            L3d:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L56
                java.lang.Object r8 = r3.next()
                com.huami.device.core.sync.api.worker.Worker r8 = (com.huami.device.core.sync.api.worker.Worker) r8
                com.huami.device.core.sync.impl.woker.WorkerExecutorImpl r4 = com.huami.device.core.sync.impl.woker.WorkerExecutorImpl.this
                com.xiaomi.hm.health.bt.device.HMBaseDevice r5 = r0.$device
                com.huami.device.core.sync.impl.woker.WorkerExecutorImpl.access$doWorker(r4, r5, r8)
                r8 = r0
                r0 = r1
                r1 = r3
                goto L2d
            L56:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.device.core.sync.impl.woker.WorkerExecutorImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.huami.device.core.sync.impl.woker.WorkerExecutorImpl$start$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.impl.woker.WorkerExecutorImpl$start$1", f = "WorkerExecutorImpl.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ HMBaseDevice $device;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15261(HMBaseDevice hMBaseDevice, Continuation<? super C15261> continuation) {
            super(2, continuation);
            this.$device = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorkerExecutorImpl.this.new C15261(this.$device, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WorkerExecutorImpl workerExecutorImpl;
            Iterator it2;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<Worker> listCrateAfterJob = WorkerExecutorImpl.this.api.crateAfterJob(this.$device);
                workerExecutorImpl = WorkerExecutorImpl.this;
                it2 = listCrateAfterJob.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (Iterator) this.L$1;
                workerExecutorImpl = (WorkerExecutorImpl) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it2.hasNext()) {
                Worker worker = (Worker) it2.next();
                Channel channel = workerExecutorImpl.runJobQueueChannel;
                this.L$0 = workerExecutorImpl;
                this.L$1 = it2;
                this.label = 1;
                if (channel.send(worker, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public WorkerExecutorImpl(@NotNull AfterSyncWorkerApi afterSyncWorkerApi) {
        this.api = afterSyncWorkerApi;
    }

    private final void debugInfo(String info) {
        System.out.println((Object) info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doWorker(final HMBaseDevice device, final Worker item) {
        try {
            try {
                try {
                    debugInfo("do worker");
                    Future<?> futureSubmit = getThreadPool().submit(new Runnable() { // from class: ow8
                        @Override // java.lang.Runnable
                        public final void run() {
                            item.onStart(device);
                        }
                    });
                    debugInfo("do worker in block [" + item + JsonLexerKt.END_LIST);
                    futureSubmit.get(120000L, TimeUnit.MILLISECONDS);
                    debugInfo("do worker in block out [" + item + "] ");
                } catch (TimeoutException e) {
                    HMLog.w(TAG, "run worker save out time out.", new Object[0]);
                    e.printStackTrace();
                    debugInfo(String.valueOf(Unit.INSTANCE));
                    return;
                }
            } catch (TimeoutException unused) {
                debugInfo("do worker time out [" + item + JsonLexerKt.END_LIST);
                HMLog.w(TAG, "run " + ((Object) item.getClass().getSimpleName()) + " --> onStart time out.", new Object[0]);
                getThreadPool().submit(new Runnable() { // from class: nw8
                    @Override // java.lang.Runnable
                    public final void run() {
                        item.onTimeOut();
                    }
                }).get(30000L, TimeUnit.SECONDS);
            }
            debugInfo("do worker finish [" + item + "] ");
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            debugInfo(String.valueOf(Unit.INSTANCE));
        } catch (Throwable th) {
            HMLog.e(TAG, Intrinsics.stringPlus("run worker error ", item.getClass().getSimpleName()), th);
            item.onError(th);
        }
    }

    private final ExecutorService getThreadPool() {
        return (ExecutorService) this.threadPool.getValue();
    }

    private final void run(HMBaseDevice device) {
        e.f(this, ConstKt.createSyncContext(), null, new AnonymousClass1(device, null), 2, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // com.huami.device.core.sync.api.WorkerExecutor
    public void start(@NotNull HMBaseDevice device) {
        try {
            e.f(this, ConstKt.createSyncContext(), null, new C15261(device, null), 2, null);
            run(device);
        } catch (Throwable th) {
            HMLog.e(TAG, "start work executor error", th);
        }
    }
}
