package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class kgt implements t7s {
    @Override // defpackage.f8s
    public final /* synthetic */ Object a() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: r8t
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "UpdateListenerExecutor");
            }
        });
        n7s.a(executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }
}
