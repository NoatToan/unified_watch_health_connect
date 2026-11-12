package defpackage;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: renamed from: zhr, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\b\u0003\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001*\u0010\b\u0007\u0010\u0007\"\u00020\u00042\u00020\u0004B\u0002\b\b¨\u0006\t"}, d2 = {"asCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "from", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/ExecutorService;", "asExecutor", "CloseableCoroutineDispatcher", "Lkotlinx/coroutines/ExperimentalCoroutinesApi;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class asCoroutineDispatcher {
    public static final CoroutineDispatcher d(Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        zhg zhgVar = executor instanceof zhg ? (zhg) executor : null;
        return (zhgVar == null || (coroutineDispatcher = zhgVar.f54101a) == null) ? new zhm(executor) : coroutineDispatcher;
    }

    public static final Executor d(CoroutineDispatcher coroutineDispatcher) {
        Executor executor;
        ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof ExecutorCoroutineDispatcher ? (ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        return (executorCoroutineDispatcher == null || (executor = executorCoroutineDispatcher.getF54104b()) == null) ? new zhg(coroutineDispatcher) : executor;
    }
}
