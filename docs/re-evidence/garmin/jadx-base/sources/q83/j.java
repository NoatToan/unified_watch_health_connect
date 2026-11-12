package q83;

import java.util.LinkedList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.OnErrorNotImplementedException;
import v83.s;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends AtomicReference<Thread> implements Runnable, j83.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s83.k f143422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n83.a f143423b;

    public final class a implements j83.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future<?> f143424a;

        public a(Future<?> future) {
            this.f143424a = future;
        }

        @Override // j83.o
        public final boolean e() {
            return this.f143424a.isCancelled();
        }

        @Override // j83.o
        public final void f() {
            Thread thread = j.this.get();
            Thread threadCurrentThread = Thread.currentThread();
            Future<?> future = this.f143424a;
            if (thread != threadCurrentThread) {
                future.cancel(true);
            } else {
                future.cancel(false);
            }
        }
    }

    public static final class b extends AtomicBoolean implements j83.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f143426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s83.k f143427b;

        public b(j jVar, s83.k kVar) {
            this.f143426a = jVar;
            this.f143427b = kVar;
        }

        @Override // j83.o
        public final boolean e() {
            return this.f143426a.f143422a.f157986b;
        }

        @Override // j83.o
        public final void f() {
            if (compareAndSet(false, true)) {
                s83.k kVar = this.f143427b;
                j jVar = this.f143426a;
                if (kVar.f157986b) {
                    return;
                }
                synchronized (kVar) {
                    LinkedList linkedList = kVar.f157985a;
                    if (!kVar.f157986b && linkedList != null) {
                        boolean zRemove = linkedList.remove(jVar);
                        if (zRemove) {
                            jVar.f();
                        }
                    }
                }
            }
        }
    }

    public static final class c extends AtomicBoolean implements j83.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f143428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y83.b f143429b;

        public c(j jVar, y83.b bVar) {
            this.f143428a = jVar;
            this.f143429b = bVar;
        }

        @Override // j83.o
        public final boolean e() {
            return this.f143428a.f143422a.f157986b;
        }

        @Override // j83.o
        public final void f() {
            if (compareAndSet(false, true)) {
                this.f143429b.b(this.f143428a);
            }
        }
    }

    public j(n83.a aVar, y83.b bVar) {
        this.f143423b = aVar;
        this.f143422a = new s83.k(new c(this, bVar));
    }

    @Override // j83.o
    public final boolean e() {
        return this.f143422a.f157986b;
    }

    @Override // j83.o
    public final void f() {
        if (this.f143422a.f157986b) {
            return;
        }
        this.f143422a.f();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.f143423b.d();
                f();
            } catch (Throwable th3) {
                f();
                throw th3;
            }
        } catch (OnErrorNotImplementedException e4) {
            IllegalStateException illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e4);
            s.a(illegalStateException);
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, illegalStateException);
            f();
        } catch (Throwable th4) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th4);
            s.a(illegalStateException2);
            Thread threadCurrentThread2 = Thread.currentThread();
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, illegalStateException2);
            f();
        }
    }

    public j(n83.a aVar) {
        this.f143423b = aVar;
        this.f143422a = new s83.k();
    }

    public j(n83.a aVar, s83.k kVar) {
        this.f143423b = aVar;
        this.f143422a = new s83.k(new b(this, kVar));
    }
}
