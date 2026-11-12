package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.createFailure;
import defpackage.probeCoroutineCreated;
import defpackage.yzc;
import defpackage.zbg;
import defpackage.zcp;
import defpackage.zgf;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"await", "Landroidx/work/Operation$State$SUCCESS;", "Landroidx/work/Operation;", "(Landroidx/work/Operation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OperationKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object await(Operation operation, Continuation<? super Operation.State.SUCCESS> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objB = anonymousClass1.result;
        Object objA = zbg.a();
        int i = anonymousClass1.label;
        if (i == 0) {
            createFailure.c(objB);
            ListenableFuture<Operation.State.SUCCESS> result = operation.getResult();
            zcp.b((Object) result, "");
            if (result.isDone()) {
                try {
                    objB = result.get();
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause == null) {
                        throw e;
                    }
                    throw cause;
                }
            } else {
                anonymousClass1.L$0 = result;
                anonymousClass1.label = 1;
                AnonymousClass1 anonymousClass2 = anonymousClass1;
                zgf zgfVar = new zgf(zbg.c(anonymousClass2), 1);
                zgfVar.initCancellability();
                zgf zgfVar2 = zgfVar;
                result.addListener(new ListenableFutureKt$await$2$1(zgfVar2, result), DirectExecutor.INSTANCE);
                zgfVar2.invokeOnCancellation(new ListenableFutureKt$await$2$2(result));
                objB = zgfVar.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(anonymousClass2);
                }
                if (objB == objA) {
                    return objA;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createFailure.c(objB);
        }
        zcp.b(objB, "");
        return objB;
    }

    private static final Object await$$forInline(Operation operation, Continuation<? super Operation.State.SUCCESS> continuation) throws Throwable {
        Object objB;
        ListenableFuture<Operation.State.SUCCESS> result = operation.getResult();
        zcp.b((Object) result, "");
        if (result.isDone()) {
            try {
                objB = result.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e;
            }
        } else {
            zgf zgfVar = new zgf(zbg.c(continuation), 1);
            zgfVar.initCancellability();
            zgf zgfVar2 = zgfVar;
            result.addListener(new ListenableFutureKt$await$2$1(zgfVar2, result), DirectExecutor.INSTANCE);
            zgfVar2.invokeOnCancellation(new ListenableFutureKt$await$2$2(result));
            yzc yzcVar = yzc.e;
            objB = zgfVar.b();
            if (objB == zbg.a()) {
                probeCoroutineCreated.e(continuation);
            }
        }
        zcp.b(objB, "");
        return objB;
    }

    /* JADX INFO: renamed from: androidx.work.OperationKt$await$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    @DebugMetadata(c = "androidx.work.OperationKt", f = "Operation.kt", i = {0}, l = {39}, m = "await", n = {"$this$await$iv"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationKt.await(null, this);
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }
    }
}
