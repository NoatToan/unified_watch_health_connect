package io.reactivex.internal.schedulers;

import defpackage.l00;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduledDirectTask extends l00 implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectTask(Runnable runnable) {
        super(runnable);
    }

    @Override // defpackage.l00
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            return null;
        } finally {
            lazySet(l00.FINISHED);
            this.runner = null;
        }
    }
}
