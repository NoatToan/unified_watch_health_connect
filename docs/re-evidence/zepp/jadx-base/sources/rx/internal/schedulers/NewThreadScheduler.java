package rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import rx.Scheduler;

/* JADX INFO: loaded from: classes23.dex */
public final class NewThreadScheduler extends Scheduler {
    private final ThreadFactory a;

    public NewThreadScheduler(ThreadFactory threadFactory) {
        this.a = threadFactory;
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new NewThreadWorker(this.a);
    }
}
