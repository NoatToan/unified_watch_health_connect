package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import rx.internal.schedulers.ScheduledAction;

/* JADX INFO: loaded from: classes3.dex */
public final class ag8 extends ifl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f978a;

    public static final class a extends ifl.a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f979a;
        public final ConcurrentLinkedQueue<ScheduledAction> c = new ConcurrentLinkedQueue<>();
        public final AtomicInteger d = new AtomicInteger();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final sa4 f980b = new sa4();
        public final ScheduledExecutorService e = gya.a();

        public a(Executor executor) {
            this.f979a = executor;
        }

        @Override // ifl.a
        public koo a(sc0 sc0Var) {
            if (isUnsubscribed()) {
                return noo.b();
            }
            ScheduledAction scheduledAction = new ScheduledAction(p5l.l(sc0Var), this.f980b);
            this.f980b.a(scheduledAction);
            this.c.offer(scheduledAction);
            if (this.d.getAndIncrement() == 0) {
                try {
                    this.f979a.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f980b.b(scheduledAction);
                    this.d.decrementAndGet();
                    p5l.f(e);
                    throw e;
                }
            }
            return scheduledAction;
        }

        @Override // defpackage.koo
        public boolean isUnsubscribed() {
            return this.f980b.isUnsubscribed();
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.f980b.isUnsubscribed()) {
                ScheduledAction scheduledActionPoll = this.c.poll();
                if (scheduledActionPoll == null) {
                    return;
                }
                if (!scheduledActionPoll.isUnsubscribed()) {
                    if (this.f980b.isUnsubscribed()) {
                        this.c.clear();
                        return;
                    }
                    scheduledActionPoll.run();
                }
                if (this.d.decrementAndGet() == 0) {
                    return;
                }
            }
            this.c.clear();
        }

        @Override // defpackage.koo
        public void unsubscribe() {
            this.f980b.unsubscribe();
            this.c.clear();
        }
    }

    public ag8(Executor executor) {
        this.f978a = executor;
    }

    @Override // defpackage.ifl
    public ifl.a a() {
        return new a(this.f978a);
    }
}
