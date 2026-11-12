package rx.internal.schedulers;

import defpackage.koo;
import defpackage.moo;
import defpackage.p5l;
import defpackage.sa4;
import defpackage.sc0;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, koo {
    private static final long serialVersionUID = -3962399486978279857L;
    final sc0 action;
    final moo cancel;

    public final class a implements koo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future<?> f33001a;

        public a(Future<?> future) {
            this.f33001a = future;
        }

        @Override // defpackage.koo
        public boolean isUnsubscribed() {
            return this.f33001a.isCancelled();
        }

        @Override // defpackage.koo
        public void unsubscribe() {
            if (ScheduledAction.this.get() != Thread.currentThread()) {
                this.f33001a.cancel(true);
            } else {
                this.f33001a.cancel(false);
            }
        }
    }

    public static final class b extends AtomicBoolean implements koo {
        private static final long serialVersionUID = 247232374289553518L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScheduledAction f33003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final moo f33004b;

        public b(ScheduledAction scheduledAction, moo mooVar) {
            this.f33003a = scheduledAction;
            this.f33004b = mooVar;
        }

        @Override // defpackage.koo
        public boolean isUnsubscribed() {
            return this.f33003a.isUnsubscribed();
        }

        @Override // defpackage.koo
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f33004b.b(this.f33003a);
            }
        }
    }

    public static final class c extends AtomicBoolean implements koo {
        private static final long serialVersionUID = 247232374289553518L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScheduledAction f33005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final sa4 f33006b;

        public c(ScheduledAction scheduledAction, sa4 sa4Var) {
            this.f33005a = scheduledAction;
            this.f33006b = sa4Var;
        }

        @Override // defpackage.koo
        public boolean isUnsubscribed() {
            return this.f33005a.isUnsubscribed();
        }

        @Override // defpackage.koo
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.f33006b.b(this.f33005a);
            }
        }
    }

    public ScheduledAction(sc0 sc0Var) {
        this.action = sc0Var;
        this.cancel = new moo();
    }

    public void add(koo kooVar) {
        this.cancel.a(kooVar);
    }

    public void addParent(sa4 sa4Var) {
        this.cancel.a(new c(this, sa4Var));
    }

    @Override // defpackage.koo
    public boolean isUnsubscribed() {
        return this.cancel.isUnsubscribed();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.action.call();
            } catch (Throwable th) {
                unsubscribe();
                throw th;
            }
        } catch (OnErrorNotImplementedException e) {
            signalError(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
        } catch (Throwable th2) {
            signalError(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th2));
        }
        unsubscribe();
    }

    public void signalError(Throwable th) {
        p5l.f(th);
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    @Override // defpackage.koo
    public void unsubscribe() {
        if (this.cancel.isUnsubscribed()) {
            return;
        }
        this.cancel.unsubscribe();
    }

    public void add(Future<?> future) {
        this.cancel.a(new a(future));
    }

    public void addParent(moo mooVar) {
        this.cancel.a(new b(this, mooVar));
    }

    public ScheduledAction(sc0 sc0Var, sa4 sa4Var) {
        this.action = sc0Var;
        this.cancel = new moo(new c(this, sa4Var));
    }

    public ScheduledAction(sc0 sc0Var, moo mooVar) {
        this.action = sc0Var;
        this.cancel = new moo(new b(this, mooVar));
    }
}
