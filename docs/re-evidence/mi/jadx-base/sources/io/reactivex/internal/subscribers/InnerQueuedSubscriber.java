package io.reactivex.internal.subscribers;

import defpackage.cgi;
import defpackage.fgi;
import defpackage.jdm;
import defpackage.joo;
import defpackage.oad;
import defpackage.yno;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<joo> implements yno, joo {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final oad<T> parent;
    final int prefetch;
    long produced;
    volatile jdm<T> queue;

    public InnerQueuedSubscriber(oad<T> oadVar, int i) {
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    @Override // defpackage.joo
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // defpackage.yno
    public void onComplete() {
        throw null;
    }

    @Override // defpackage.yno
    public void onError(Throwable th) {
        throw null;
    }

    @Override // defpackage.yno
    public void onNext(T t) {
        if (this.fusionMode != 0) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.yno
    public void onSubscribe(joo jooVar) {
        if (SubscriptionHelper.setOnce(this, jooVar)) {
            if (jooVar instanceof fgi) {
                fgi fgiVar = (fgi) jooVar;
                int iRequestFusion = fgiVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = fgiVar;
                    this.done = true;
                    throw null;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = fgiVar;
                    cgi.b(jooVar, this.prefetch);
                    return;
                }
            }
            this.queue = cgi.a(this.prefetch);
            cgi.b(jooVar, this.prefetch);
        }
    }

    public jdm<T> queue() {
        return this.queue;
    }

    @Override // defpackage.joo
    public void request(long j) {
        if (this.fusionMode != 1) {
            long j2 = this.produced + j;
            if (j2 < this.limit) {
                this.produced = j2;
            } else {
                this.produced = 0L;
                get().request(j2);
            }
        }
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j = this.produced + 1;
            if (j != this.limit) {
                this.produced = j;
            } else {
                this.produced = 0L;
                get().request(j);
            }
        }
    }

    public void setDone() {
        this.done = true;
    }
}
