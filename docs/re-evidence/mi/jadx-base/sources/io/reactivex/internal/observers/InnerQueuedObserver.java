package io.reactivex.internal.observers;

import defpackage.bgi;
import defpackage.cgi;
import defpackage.jdm;
import defpackage.jz6;
import defpackage.nad;
import defpackage.z5h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<jz6> implements z5h<T>, jz6 {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final nad<T> parent;
    final int prefetch;
    jdm<T> queue;

    public InnerQueuedObserver(nad<T> nadVar, int i) {
        this.prefetch = i;
    }

    @Override // defpackage.jz6
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public int fusionMode() {
        return this.fusionMode;
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // defpackage.z5h
    public void onComplete() {
        throw null;
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        throw null;
    }

    @Override // defpackage.z5h
    public void onNext(T t) {
        if (this.fusionMode != 0) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.z5h
    public void onSubscribe(jz6 jz6Var) {
        if (DisposableHelper.setOnce(this, jz6Var)) {
            if (jz6Var instanceof bgi) {
                bgi bgiVar = (bgi) jz6Var;
                int iRequestFusion = bgiVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = bgiVar;
                    this.done = true;
                    throw null;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = bgiVar;
                    return;
                }
            }
            this.queue = cgi.a(-this.prefetch);
        }
    }

    public jdm<T> queue() {
        return this.queue;
    }

    public void setDone() {
        this.done = true;
    }
}
