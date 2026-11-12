package io.reactivex.internal.subscriptions;

import defpackage.gx1;
import defpackage.joo;
import defpackage.x3h;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class SubscriptionArbiter extends AtomicInteger implements joo {
    private static final long serialVersionUID = -2189523197179400958L;
    joo actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<joo> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public SubscriptionArbiter(boolean z) {
        this.cancelOnReplace = z;
    }

    @Override // defpackage.joo
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        drain();
    }

    public final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    public final void drainLoop() {
        int iAddAndGet = 1;
        long jB = 0;
        joo jooVar = null;
        do {
            joo andSet = this.missedSubscription.get();
            if (andSet != null) {
                andSet = this.missedSubscription.getAndSet(null);
            }
            long andSet2 = this.missedRequested.get();
            if (andSet2 != 0) {
                andSet2 = this.missedRequested.getAndSet(0L);
            }
            long andSet3 = this.missedProduced.get();
            if (andSet3 != 0) {
                andSet3 = this.missedProduced.getAndSet(0L);
            }
            joo jooVar2 = this.actual;
            if (this.cancelled) {
                if (jooVar2 != null) {
                    jooVar2.cancel();
                    this.actual = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jB2 = this.requested;
                if (jB2 != Long.MAX_VALUE) {
                    jB2 = gx1.b(jB2, andSet2);
                    if (jB2 != Long.MAX_VALUE) {
                        jB2 -= andSet3;
                        if (jB2 < 0) {
                            SubscriptionHelper.reportMoreProduced(jB2);
                            jB2 = 0;
                        }
                    }
                    this.requested = jB2;
                }
                if (andSet != null) {
                    if (jooVar2 != null && this.cancelOnReplace) {
                        jooVar2.cancel();
                    }
                    this.actual = andSet;
                    if (jB2 != 0) {
                        jB = gx1.b(jB, jB2);
                        jooVar = andSet;
                    }
                } else if (jooVar2 != null && andSet2 != 0) {
                    jB = gx1.b(jB, andSet2);
                    jooVar = jooVar2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jB != 0) {
            jooVar.request(jB);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            gx1.a(this.missedProduced, j);
            drain();
            return;
        }
        long j2 = this.requested;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                SubscriptionHelper.reportMoreProduced(j3);
                j3 = 0;
            }
            this.requested = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        drainLoop();
    }

    @Override // defpackage.joo
    public final void request(long j) {
        if (!SubscriptionHelper.validate(j) || this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            gx1.a(this.missedRequested, j);
            drain();
            return;
        }
        long j2 = this.requested;
        if (j2 != Long.MAX_VALUE) {
            long jB = gx1.b(j2, j);
            this.requested = jB;
            if (jB == Long.MAX_VALUE) {
                this.unbounded = true;
            }
        }
        joo jooVar = this.actual;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (jooVar != null) {
            jooVar.request(j);
        }
    }

    public final void setSubscription(joo jooVar) {
        if (this.cancelled) {
            jooVar.cancel();
            return;
        }
        x3h.d(jooVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            joo andSet = this.missedSubscription.getAndSet(jooVar);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            drain();
            return;
        }
        joo jooVar2 = this.actual;
        if (jooVar2 != null && this.cancelOnReplace) {
            jooVar2.cancel();
        }
        this.actual = jooVar;
        long j = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j != 0) {
            jooVar.request(j);
        }
    }
}
