package androidx.work;

import androidx.work.WorkerKt;
import defpackage.cb3;
import defpackage.lhe;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Ljava/util/concurrent/Executor;", "Lkotlin/Function0;", "block", "Llhe;", "future", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Llhe;", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
public final class WorkerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> lhe<T> future(final Executor executor, final Function0<? extends T> function0) {
        lhe<T> lheVarA = cb3.a(new cb3.c() { // from class: rnr
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return WorkerKt.future$lambda$2(executor, function0, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarA, "getFuture {\n        val …        }\n        }\n    }");
        return lheVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit future$lambda$2(Executor executor, final Function0 function0, final cb3.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        it.a(new Runnable() { // from class: pnr
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(true);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: qnr
            @Override // java.lang.Runnable
            public final void run() {
                WorkerKt.future$lambda$2$lambda$1(atomicBoolean, it, function0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void future$lambda$2$lambda$1(AtomicBoolean atomicBoolean, cb3.a aVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(function0.invoke());
        } catch (Throwable th) {
            aVar.f(th);
        }
    }
}
