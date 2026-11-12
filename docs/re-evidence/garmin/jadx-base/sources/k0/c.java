package k0;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile c f101926a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
