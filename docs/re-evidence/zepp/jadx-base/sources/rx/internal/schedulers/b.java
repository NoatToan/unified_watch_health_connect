package rx.internal.schedulers;

import rx.Scheduler;
import rx.exceptions.Exceptions;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
class b implements Action0 {
    private final Action0 a;
    private final Scheduler.Worker b;
    private final long c;

    public b(Action0 action0, Scheduler.Worker worker, long j) {
        this.a = action0;
        this.b = worker;
        this.c = j;
    }

    @Override // rx.functions.Action0
    public void call() {
        if (this.b.isUnsubscribed()) {
            return;
        }
        long jNow = this.c - this.b.now();
        if (jNow > 0) {
            try {
                Thread.sleep(jNow);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Exceptions.propagate(e);
            }
        }
        if (this.b.isUnsubscribed()) {
            return;
        }
        this.a.call();
    }
}
