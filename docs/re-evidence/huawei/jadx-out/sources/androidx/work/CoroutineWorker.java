package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.SettableFuture;
import com.alipay.sdk.m.s.e;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.C0468zhz;
import defpackage.RESUMED;
import defpackage.createFailure;
import defpackage.isActive;
import defpackage.probeCoroutineCreated;
import defpackage.yzc;
import defpackage.zbg;
import defpackage.zcp;
import defpackage.zgf;
import defpackage.zhf;
import java.util.concurrent.ExecutionException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0016\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0011\u0010\u0018\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010$J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bR\u001c\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "appContext", "Landroid/content/Context;", e.n, "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "Landroidx/work/ListenableWorker$Result;", "getFuture$work_runtime_release", "()Landroidx/work/impl/utils/futures/SettableFuture;", "job", "Lkotlinx/coroutines/CompletableJob;", "getJob$work_runtime_release", "()Lkotlinx/coroutines/CompletableJob;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfo", "Landroidx/work/ForegroundInfo;", "getForegroundInfoAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "onStopped", "", "setForeground", "foregroundInfo", "(Landroidx/work/ForegroundInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setProgress", "data", "Landroidx/work/Data;", "(Landroidx/work/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startWork", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CoroutineWorker extends ListenableWorker {
    private final CoroutineDispatcher coroutineContext;
    private final SettableFuture<ListenableWorker.Result> future;
    private final CompletableJob job;

    @Deprecated(message = "use withContext(...) inside doWork() instead.")
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public abstract Object doWork(Continuation<? super ListenableWorker.Result> continuation);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zcp.c(context, "");
        zcp.c(workerParameters, "");
        this.job = C0468zhz.a(null, 1, null);
        SettableFuture<ListenableWorker.Result> settableFutureCreate = SettableFuture.create();
        zcp.b((Object) settableFutureCreate, "");
        this.future = settableFutureCreate;
        settableFutureCreate.addListener(new Runnable() { // from class: androidx.work.CoroutineWorker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker._init_$lambda$0(this.f$0);
            }
        }, getTaskExecutor().getSerialTaskExecutor());
        this.coroutineContext = zhf.e();
    }

    /* JADX INFO: renamed from: getJob$work_runtime_release, reason: from getter */
    public final CompletableJob getJob() {
        return this.job;
    }

    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_release() {
        return this.future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CoroutineWorker coroutineWorker) {
        zcp.c(coroutineWorker, "");
        if (coroutineWorker.future.isCancelled()) {
            Job.b.c(coroutineWorker.job, null, 1, null);
        }
    }

    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$startWork$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    static final class C04221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super yzc>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA = zbg.a();
            int i = this.label;
            try {
                if (i == 0) {
                    createFailure.c(obj);
                    this.label = 1;
                    obj = CoroutineWorker.this.doWork(this);
                    if (obj == objA) {
                        return objA;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_release().set((ListenableWorker.Result) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture$work_runtime_release().setException(th);
            }
            return yzc.e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super yzc> continuation) {
            return ((C04221) create(coroutineScope, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new C04221(continuation);
        }

        C04221(Continuation<? super C04221> continuation) {
            super(2, continuation);
        }
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        RESUMED.b(isActive.e(getCoroutineContext().plus(this.job)), null, null, new C04221(null), 3, null);
        return this.future;
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, Continuation<? super ForegroundInfo> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    public final Object setProgress(Data data, Continuation<? super yzc> continuation) throws Throwable {
        ListenableFuture<Void> progressAsync = setProgressAsync(data);
        zcp.b((Object) progressAsync, "");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            zgf zgfVar = new zgf(zbg.c(continuation), 1);
            zgfVar.initCancellability();
            zgf zgfVar2 = zgfVar;
            progressAsync.addListener(new ListenableFutureKt$await$2$1(zgfVar2, progressAsync), DirectExecutor.INSTANCE);
            zgfVar2.invokeOnCancellation(new ListenableFutureKt$await$2$2(progressAsync));
            Object objB = zgfVar.b();
            if (objB == zbg.a()) {
                probeCoroutineCreated.e(continuation);
            }
            if (objB == zbg.a()) {
                return objB;
            }
        }
        return yzc.e;
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, Continuation<? super yzc> continuation) throws Throwable {
        ListenableFuture<Void> foregroundAsync = setForegroundAsync(foregroundInfo);
        zcp.b((Object) foregroundAsync, "");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            zgf zgfVar = new zgf(zbg.c(continuation), 1);
            zgfVar.initCancellability();
            zgf zgfVar2 = zgfVar;
            foregroundAsync.addListener(new ListenableFutureKt$await$2$1(zgfVar2, foregroundAsync), DirectExecutor.INSTANCE);
            zgfVar2.invokeOnCancellation(new ListenableFutureKt$await$2$2(foregroundAsync));
            Object objB = zgfVar.b();
            if (objB == zbg.a()) {
                probeCoroutineCreated.e(continuation);
            }
            if (objB == zbg.a()) {
                return objB;
            }
        }
        return yzc.e;
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ForegroundInfo> getForegroundInfoAsync() {
        CompletableJob completableJobA = C0468zhz.a(null, 1, null);
        CoroutineScope coroutineScopeE = isActive.e(getCoroutineContext().plus(completableJobA));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(completableJobA, null, 2, null);
        RESUMED.b(coroutineScopeE, null, null, new AnonymousClass1(jobListenableFuture, this, null), 3, null);
        return jobListenableFuture;
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super yzc>, Object> {
        final /* synthetic */ JobListenableFuture<ForegroundInfo> $jobFuture;
        Object L$0;
        int label;
        final /* synthetic */ CoroutineWorker this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            JobListenableFuture jobListenableFuture;
            Object objA = zbg.a();
            int i = this.label;
            if (i == 0) {
                createFailure.c(obj);
                JobListenableFuture<ForegroundInfo> jobListenableFuture2 = this.$jobFuture;
                this.L$0 = jobListenableFuture2;
                this.label = 1;
                Object foregroundInfo = this.this$0.getForegroundInfo(this);
                if (foregroundInfo == objA) {
                    return objA;
                }
                jobListenableFuture = jobListenableFuture2;
                obj = foregroundInfo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jobListenableFuture = (JobListenableFuture) this.L$0;
                createFailure.c(obj);
            }
            jobListenableFuture.complete(obj);
            return yzc.e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super yzc> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$jobFuture, this.this$0, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JobListenableFuture<ForegroundInfo> jobListenableFuture, CoroutineWorker coroutineWorker, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$jobFuture = jobListenableFuture;
            this.this$0 = coroutineWorker;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public Object getForegroundInfo(Continuation<? super ForegroundInfo> continuation) {
        return getForegroundInfo$suspendImpl(this, continuation);
    }
}
