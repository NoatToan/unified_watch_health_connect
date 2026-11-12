package io.reactivex.internal.operators.flowable;

import defpackage.c8o;
import defpackage.gx1;
import defpackage.pei;
import defpackage.yno;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T, K> extends BasicIntQueueSubscription<T> implements pei<T> {
    private static final long serialVersionUID = -3852313036005250360L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f21339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c8o<T> f21340b;
    public final FlowableGroupBy$GroupBySubscriber<?, K, T> c;
    public final boolean d;
    public volatile boolean f;
    public Throwable g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21341k;
    public int l;
    public final AtomicLong e = new AtomicLong();
    public final AtomicBoolean h = new AtomicBoolean();
    public final AtomicReference<yno<? super T>> i = new AtomicReference<>();
    public final AtomicBoolean j = new AtomicBoolean();

    public a(int i, FlowableGroupBy$GroupBySubscriber<?, K, T> flowableGroupBy$GroupBySubscriber, K k2, boolean z) {
        this.f21340b = new c8o<>(i);
        this.c = flowableGroupBy$GroupBySubscriber;
        this.f21339a = k2;
        this.d = z;
    }

    public boolean a(boolean z, boolean z2, yno<? super T> ynoVar, boolean z3, long j) {
        if (this.h.get()) {
            while (this.f21340b.poll() != null) {
                j++;
            }
            if (j != 0) {
                this.c.upstream.request(j);
            }
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            Throwable th = this.g;
            if (th != null) {
                ynoVar.onError(th);
            } else {
                ynoVar.onComplete();
            }
            return true;
        }
        Throwable th2 = this.g;
        if (th2 != null) {
            this.f21340b.clear();
            ynoVar.onError(th2);
            return true;
        }
        if (!z2) {
            return false;
        }
        ynoVar.onComplete();
        return true;
    }

    public void b() {
        int i = this.l;
        if (i != 0) {
            this.l = 0;
            this.c.upstream.request(i);
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.joo
    public void cancel() {
        if (this.h.compareAndSet(false, true)) {
            this.c.cancel(this.f21339a);
            drain();
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.jdm
    public void clear() {
        c8o<T> c8oVar = this.f21340b;
        while (c8oVar.poll() != null) {
            this.l++;
        }
        b();
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        if (this.f21341k) {
            drainFused();
        } else {
            drainNormal();
        }
    }

    public void drainFused() {
        Throwable th;
        c8o<T> c8oVar = this.f21340b;
        yno<? super T> ynoVar = this.i.get();
        int iAddAndGet = 1;
        while (true) {
            if (ynoVar != null) {
                if (this.h.get()) {
                    return;
                }
                boolean z = this.f;
                if (z && !this.d && (th = this.g) != null) {
                    c8oVar.clear();
                    ynoVar.onError(th);
                    return;
                }
                ynoVar.onNext(null);
                if (z) {
                    Throwable th2 = this.g;
                    if (th2 != null) {
                        ynoVar.onError(th2);
                        return;
                    } else {
                        ynoVar.onComplete();
                        return;
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (ynoVar == null) {
                ynoVar = this.i.get();
            }
        }
    }

    public void drainNormal() {
        c8o<T> c8oVar = this.f21340b;
        boolean z = this.d;
        yno<? super T> ynoVar = this.i.get();
        int iAddAndGet = 1;
        while (true) {
            if (ynoVar != null) {
                long j = this.e.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = this.f;
                    T tPoll = c8oVar.poll();
                    boolean z3 = tPoll == null;
                    long j3 = j2;
                    if (a(z2, z3, ynoVar, z, j2)) {
                        return;
                    }
                    if (z3) {
                        j2 = j3;
                        break;
                    } else {
                        ynoVar.onNext(tPoll);
                        j2 = j3 + 1;
                    }
                }
                if (j2 == j) {
                    long j4 = j2;
                    if (a(this.f, c8oVar.isEmpty(), ynoVar, z, j2)) {
                        return;
                    } else {
                        j2 = j4;
                    }
                }
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        this.e.addAndGet(-j2);
                    }
                    this.c.upstream.request(j2);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (ynoVar == null) {
                ynoVar = this.i.get();
            }
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.jdm
    public boolean isEmpty() {
        if (!this.f21340b.isEmpty()) {
            return false;
        }
        b();
        return true;
    }

    public void onComplete() {
        this.f = true;
        drain();
    }

    public void onError(Throwable th) {
        this.g = th;
        this.f = true;
        drain();
    }

    public void onNext(T t) {
        this.f21340b.offer(t);
        drain();
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.jdm
    public T poll() {
        T tPoll = this.f21340b.poll();
        if (tPoll != null) {
            this.l++;
            return tPoll;
        }
        b();
        return null;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.joo
    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            gx1.a(this.e, j);
            drain();
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.dgi
    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.f21341k = true;
        return 2;
    }
}
