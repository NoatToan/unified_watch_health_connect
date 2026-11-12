package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes22.dex */
public final class NewThreadScheduler extends Scheduler {
    public final ThreadFactory b;
    private static final String c = "RxNewThreadScheduler";
    private static final String e = "rx2.newthread-priority";
    private static final RxThreadFactory d = new RxThreadFactory(c, Math.max(1, Math.min(10, Integer.getInteger(e, 5).intValue())));

    public NewThreadScheduler() {
        this(d);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new NewThreadWorker(this.b);
    }

    public NewThreadScheduler(ThreadFactory threadFactory) {
        this.b = threadFactory;
    }
}
