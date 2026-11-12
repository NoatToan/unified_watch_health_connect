package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class d5h<T, K> extends AtomicInteger implements jz6, o5h<T> {
    private static final long serialVersionUID = -3852313036005250360L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f15106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c8o<T> f15107b;
    public final ObservableGroupBy$GroupByObserver<?, K, T> c;
    public final boolean d;
    public volatile boolean e;
    public Throwable f;
    public final AtomicBoolean g = new AtomicBoolean();
    public final AtomicBoolean h = new AtomicBoolean();
    public final AtomicReference<z5h<? super T>> i = new AtomicReference<>();

    public d5h(int i, ObservableGroupBy$GroupByObserver<?, K, T> observableGroupBy$GroupByObserver, K k2, boolean z) {
        this.f15107b = new c8o<>(i);
        this.c = observableGroupBy$GroupByObserver;
        this.f15106a = k2;
        this.d = z;
    }

    @Override // defpackage.o5h
    public void a(z5h<? super T> z5hVar) {
        if (!this.h.compareAndSet(false, true)) {
            EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), z5hVar);
            return;
        }
        z5hVar.onSubscribe(this);
        this.i.lazySet(z5hVar);
        if (this.g.get()) {
            this.i.lazySet(null);
        } else {
            c();
        }
    }

    public boolean b(boolean z, boolean z2, z5h<? super T> z5hVar, boolean z3) {
        if (this.g.get()) {
            this.f15107b.clear();
            this.c.cancel(this.f15106a);
            this.i.lazySet(null);
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            Throwable th = this.f;
            this.i.lazySet(null);
            if (th != null) {
                z5hVar.onError(th);
            } else {
                z5hVar.onComplete();
            }
            return true;
        }
        Throwable th2 = this.f;
        if (th2 != null) {
            this.f15107b.clear();
            this.i.lazySet(null);
            z5hVar.onError(th2);
            return true;
        }
        if (!z2) {
            return false;
        }
        this.i.lazySet(null);
        z5hVar.onComplete();
        return true;
    }

    public void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        c8o<T> c8oVar = this.f15107b;
        boolean z = this.d;
        z5h<? super T> z5hVar = this.i.get();
        int iAddAndGet = 1;
        while (true) {
            if (z5hVar != null) {
                while (true) {
                    boolean z2 = this.e;
                    T tPoll = c8oVar.poll();
                    boolean z3 = tPoll == null;
                    if (b(z2, z3, z5hVar, z)) {
                        return;
                    }
                    if (z3) {
                        break;
                    } else {
                        z5hVar.onNext(tPoll);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (z5hVar == null) {
                z5hVar = this.i.get();
            }
        }
    }

    public void d() {
        this.e = true;
        c();
    }

    @Override // defpackage.jz6
    public void dispose() {
        if (this.g.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.i.lazySet(null);
            this.c.cancel(this.f15106a);
        }
    }

    public void e(Throwable th) {
        this.f = th;
        this.e = true;
        c();
    }

    public void f(T t) {
        this.f15107b.offer(t);
        c();
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this.g.get();
    }
}
