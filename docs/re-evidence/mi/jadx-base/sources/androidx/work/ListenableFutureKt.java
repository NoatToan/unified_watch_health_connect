package androidx.work;

import androidx.work.ListenableFutureKt;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.cb3;
import defpackage.lhe;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", StatConstants.PARAM_START, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Llhe;", "launchFuture", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Llhe;", "V", "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "executeAsync", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Llhe;", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
public final class ListenableFutureKt {
    @NotNull
    public static final <V> lhe<V> executeAsync(@NotNull final Executor executor, @NotNull final String debugTag, @NotNull final Function0<? extends V> block) {
        Intrinsics.checkNotNullParameter(executor, "<this>");
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(block, "block");
        lhe<V> lheVarA = cb3.a(new cb3.c() { // from class: nhe
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return ListenableFutureKt.executeAsync$lambda$4(executor, debugTag, block, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarA, "getFuture { completer ->… }\n        debugTag\n    }");
        return lheVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object executeAsync$lambda$4(Executor executor, String str, final Function0 function0, final cb3.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.a(new Runnable() { // from class: phe
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(true);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: qhe
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.executeAsync$lambda$4$lambda$3(atomicBoolean, completer, function0);
            }
        });
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAsync$lambda$4$lambda$3(AtomicBoolean atomicBoolean, cb3.a aVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(function0.invoke());
        } catch (Throwable th) {
            aVar.f(th);
        }
    }

    @NotNull
    public static final <T> lhe<T> launchFuture(@NotNull final CoroutineContext context, @NotNull final CoroutineStart start, @NotNull final Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        lhe<T> lheVarA = cb3.a(new cb3.c() { // from class: ohe
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return ListenableFutureKt.launchFuture$lambda$1(context, start, block, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarA, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return lheVarA;
    }

    public static /* synthetic */ lhe launchFuture$default(CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return launchFuture(coroutineContext, coroutineStart, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object launchFuture$lambda$1(CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, cb3.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        final Job job = (Job) coroutineContext.get(Job.INSTANCE);
        completer.a(new Runnable() { // from class: rhe
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.launchFuture$lambda$1$lambda$0(job);
            }
        }, DirectExecutor.INSTANCE);
        return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineContext), null, coroutineStart, new ListenableFutureKt$launchFuture$1$2(function2, completer, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchFuture$lambda$1$lambda$0(Job job) {
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}
