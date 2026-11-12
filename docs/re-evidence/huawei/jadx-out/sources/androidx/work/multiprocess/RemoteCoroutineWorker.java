package androidx.work.multiprocess;

import android.content.Context;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.work.Data;
import androidx.work.DirectExecutor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.C0468zhz;
import defpackage.RESUMED;
import defpackage.createFailure;
import defpackage.isActive;
import defpackage.probeCoroutineCreated;
import defpackage.yyt;
import defpackage.yzc;
import defpackage.zbg;
import defpackage.zcp;
import defpackage.zgf;
import defpackage.zhf;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\f\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/work/multiprocess/RemoteCoroutineWorker;", "Landroidx/work/multiprocess/RemoteListenableWorker;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "Landroidx/work/ListenableWorker$Result;", "job", "Lkotlinx/coroutines/CompletableJob;", "doRemoteWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStopped", "", "setProgress", "data", "Landroidx/work/Data;", "(Landroidx/work/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startRemoteWork", "Lcom/google/common/util/concurrent/ListenableFuture;", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RemoteCoroutineWorker extends RemoteListenableWorker {
    private final SettableFuture<ListenableWorker.Result> future;
    private final CompletableJob job;

    public abstract Object doRemoteWork(Continuation<? super ListenableWorker.Result> continuation);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zcp.c(context, "");
        zcp.c(workerParameters, "");
        this.job = C0468zhz.a(null, 1, null);
        SettableFuture<ListenableWorker.Result> settableFutureCreate = SettableFuture.create();
        zcp.b((Object) settableFutureCreate, "");
        this.future = settableFutureCreate;
        settableFutureCreate.addListener(new Runnable() { // from class: androidx.work.multiprocess.RemoteCoroutineWorker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RemoteCoroutineWorker._init_$lambda$0(this.f$0);
            }
        }, getTaskExecutor().getSerialTaskExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RemoteCoroutineWorker remoteCoroutineWorker) {
        zcp.c(remoteCoroutineWorker, "");
        if (remoteCoroutineWorker.future.isCancelled()) {
            Job.b.c(remoteCoroutineWorker.job, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1", f = "RemoteCoroutineWorker.kt", i = {}, l = {ExerciseSessionRecord.EXERCISE_TYPE_TABLE_TENNIS}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super yzc>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA = zbg.a();
            int i = this.label;
            try {
                if (i == 0) {
                    createFailure.c(obj);
                    this.label = 1;
                    obj = RemoteCoroutineWorker.this.doRemoteWork(this);
                    if (obj == objA) {
                        return objA;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                }
                RemoteCoroutineWorker.this.future.set((ListenableWorker.Result) obj);
            } catch (Throwable th) {
                RemoteCoroutineWorker.this.future.setException(th);
            }
            return yzc.e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super yzc> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            return RemoteCoroutineWorker.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @Override // androidx.work.multiprocess.RemoteListenableWorker
    public ListenableFuture<ListenableWorker.Result> startRemoteWork() {
        RESUMED.b(isActive.e(zhf.e().plus(this.job)), null, null, new AnonymousClass1(null), 3, null);
        return this.future;
    }

    public final Object setProgress(Data data, Continuation<? super yzc> continuation) throws Throwable {
        final ListenableFuture<Void> progressAsync = setProgressAsync(data);
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
            final zgf zgfVar2 = zgfVar;
            progressAsync.addListener(new Runnable() { // from class: androidx.work.multiprocess.RemoteCoroutineWorker$setProgress$$inlined$await$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        CancellableContinuation cancellableContinuation = zgfVar2;
                        yyt.c cVar = yyt.f53903b;
                        cancellableContinuation.resumeWith(yyt.e(progressAsync.get()));
                    } catch (Throwable th) {
                        Throwable cause2 = th.getCause();
                        if (cause2 == null) {
                            cause2 = th;
                        }
                        if (th instanceof CancellationException) {
                            zgfVar2.cancel(cause2);
                            return;
                        }
                        CancellableContinuation cancellableContinuation2 = zgfVar2;
                        yyt.c cVar2 = yyt.f53903b;
                        cancellableContinuation2.resumeWith(yyt.e(createFailure.a(cause2)));
                    }
                }
            }, DirectExecutor.INSTANCE);
            zgfVar2.invokeOnCancellation(new Function1<Throwable, yzc>() { // from class: androidx.work.multiprocess.RemoteCoroutineWorker$setProgress$$inlined$await$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ yzc invoke(Throwable th) {
                    invoke2(th);
                    return yzc.e;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    progressAsync.cancel(false);
                }

                {
                    super(1);
                }
            });
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

    @Override // androidx.work.multiprocess.RemoteListenableWorker, androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(true);
    }
}
