package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WorkForegroundKt;
import defpackage.lhe;
import defpackage.m1p;
import defpackage.ppe;
import defpackage.t0a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/a$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/work/a$a;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", i = {}, l = {300, 311}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nWorkerWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerWrapper.kt\nandroidx/work/impl/WorkerWrapper$runWorker$result$1\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,607:1\n19#2:608\n*S KotlinDebug\n*F\n+ 1 WorkerWrapper.kt\nandroidx/work/impl/WorkerWrapper$runWorker$result$1\n*L\n307#1:608\n*E\n"})
public final class WorkerWrapper$runWorker$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super androidx.work.a.AbstractC0080a>, Object> {
    final /* synthetic */ t0a $foregroundUpdater;
    final /* synthetic */ androidx.work.a $worker;
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$runWorker$result$1(WorkerWrapper workerWrapper, androidx.work.a aVar, t0a t0aVar, Continuation<? super WorkerWrapper$runWorker$result$1> continuation) {
        super(2, continuation);
        this.this$0 = workerWrapper;
        this.$worker = aVar;
        this.$foregroundUpdater = t0aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkerWrapper$runWorker$result$1(this.this$0, this.$worker, this.$foregroundUpdater, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        }
        ResultKt.throwOnFailure(obj);
        Context context = this.this$0.appContext;
        WorkSpec workSpec = this.this$0.getWorkSpec();
        androidx.work.a aVar = this.$worker;
        t0a t0aVar = this.$foregroundUpdater;
        m1p m1pVar = this.this$0.workTaskExecutor;
        this.label = 1;
        if (WorkForegroundKt.workForeground(context, workSpec, aVar, t0aVar, m1pVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        String str = WorkerWrapperKt.TAG;
        WorkerWrapper workerWrapper = this.this$0;
        ppe.e().a(str, "Starting work for " + workerWrapper.getWorkSpec().workerClassName);
        lhe<androidx.work.a.AbstractC0080a> lheVarStartWork = this.$worker.startWork();
        Intrinsics.checkNotNullExpressionValue(lheVarStartWork, "worker.startWork()");
        androidx.work.a aVar2 = this.$worker;
        this.label = 2;
        obj = WorkerWrapperKt.awaitWithin(lheVarStartWork, aVar2, this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super androidx.work.a.AbstractC0080a> continuation) {
        return ((WorkerWrapper$runWorker$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
