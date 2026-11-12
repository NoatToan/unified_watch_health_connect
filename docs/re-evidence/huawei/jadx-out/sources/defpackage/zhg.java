package defpackage;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/DispatcherExecutor;", "Ljava/util/concurrent/Executor;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class zhg implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f54101a;

    public zhg(CoroutineDispatcher coroutineDispatcher) {
        this.f54101a = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable block) {
        if (this.f54101a.isDispatchNeeded(zbf.f53962b)) {
            this.f54101a.dispatch(zbf.f53962b, block);
        } else {
            block.run();
        }
    }

    public String toString() {
        return this.f54101a.toString();
    }
}
