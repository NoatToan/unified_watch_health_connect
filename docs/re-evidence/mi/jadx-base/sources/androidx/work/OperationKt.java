package androidx.work;

import androidx.lifecycle.MutableLiveData;
import androidx.work.OperationKt;
import defpackage.cb3;
import defpackage.lhe;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/work/b;", "Landroidx/work/b$b$c;", "await", "(Landroidx/work/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/Tracer;", "tracer", "", "label", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "", "block", "launchOperation", "(Landroidx/work/Tracer;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Landroidx/work/b;", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/work/OperationKt\n+ 2 Tracer.kt\nandroidx/work/TracerKt\n*L\n1#1,71:1\n53#2,9:72\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/work/OperationKt\n*L\n48#1:72,9\n*E\n"})
public final class OperationKt {

    /* JADX INFO: renamed from: androidx.work.OperationKt$await$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    @DebugMetadata(c = "androidx.work.OperationKt", f = "Operation.kt", i = {}, l = {36}, m = "await", n = {}, s = {})
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
            return OperationKt.await(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object await(@NotNull b bVar, @NotNull Continuation<? super b.AbstractC0082b.c> continuation) throws Throwable {
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
        Object objAwait = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            lhe<b.AbstractC0082b.c> result = bVar.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "result");
            anonymousClass1.label = 1;
            objAwait = androidx.concurrent.futures.ListenableFutureKt.await(result, anonymousClass1);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
        }
        Intrinsics.checkNotNullExpressionValue(objAwait, "result.await()");
        return objAwait;
    }

    private static final Object await$$forInline(b bVar, Continuation<? super b.AbstractC0082b.c> continuation) throws Throwable {
        lhe<b.AbstractC0082b.c> result = bVar.getResult();
        Intrinsics.checkNotNullExpressionValue(result, "result");
        InlineMarker.mark(0);
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(result, continuation);
        InlineMarker.mark(1);
        Intrinsics.checkNotNullExpressionValue(objAwait, "result.await()");
        return objAwait;
    }

    @NotNull
    public static final b launchOperation(@NotNull final Tracer tracer, @NotNull final String label, @NotNull final Executor executor, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(block, "block");
        final MutableLiveData mutableLiveData = new MutableLiveData(b.f3187b);
        lhe lheVarA = cb3.a(new cb3.c() { // from class: gbh
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return OperationKt.launchOperation$lambda$2(executor, tracer, label, block, mutableLiveData, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarA, "getFuture { completer ->…}\n            }\n        }");
        return new OperationImpl(mutableLiveData, lheVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchOperation$lambda$2(Executor executor, final Tracer tracer, final String str, final Function0 function0, final MutableLiveData mutableLiveData, final cb3.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        executor.execute(new Runnable() { // from class: hbh
            @Override // java.lang.Runnable
            public final void run() {
                OperationKt.launchOperation$lambda$2$lambda$1(tracer, str, function0, mutableLiveData, completer);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchOperation$lambda$2$lambda$1(Tracer tracer, String str, Function0 function0, MutableLiveData mutableLiveData, cb3.a aVar) {
        boolean zIsEnabled = tracer.isEnabled();
        if (zIsEnabled) {
            try {
                tracer.beginSection(str);
            } catch (Throwable th) {
                if (zIsEnabled) {
                    tracer.endSection();
                }
                throw th;
            }
        }
        try {
            function0.invoke();
            b.AbstractC0082b.c cVar = b.f3186a;
            mutableLiveData.postValue(cVar);
            aVar.c(cVar);
        } catch (Throwable th2) {
            mutableLiveData.postValue(new b.AbstractC0082b.a(th2));
            aVar.f(th2);
        }
        Unit unit = Unit.INSTANCE;
        if (zIsEnabled) {
            tracer.endSection();
        }
    }
}
