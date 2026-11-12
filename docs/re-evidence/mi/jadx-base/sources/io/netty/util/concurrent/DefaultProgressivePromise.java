package io.netty.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultProgressivePromise<V> extends DefaultPromise<V> implements ProgressivePromise<V> {
    public DefaultProgressivePromise(EventExecutor eventExecutor) {
        super(eventExecutor);
    }

    @Override // io.netty.util.concurrent.ProgressivePromise
    public ProgressivePromise<V> setProgress(long j, long j2) {
        if (j2 < 0) {
            if (j < 0) {
                throw new IllegalArgumentException("progress: " + j + " (expected: >= 0)");
            }
            j2 = -1;
        } else if (j < 0 || j > j2) {
            throw new IllegalArgumentException("progress: " + j + " (expected: 0 <= progress <= total (" + j2 + "))");
        }
        if (isDone()) {
            throw new IllegalStateException("complete already");
        }
        notifyProgressiveListeners(j, j2);
        return this;
    }

    @Override // io.netty.util.concurrent.ProgressivePromise
    public boolean tryProgress(long j, long j2) {
        if (j2 < 0) {
            if (j < 0 || isDone()) {
                return false;
            }
            j2 = -1;
        } else if (j < 0 || j > j2 || isDone()) {
            return false;
        }
        notifyProgressiveListeners(j, j2);
        return true;
    }

    public DefaultProgressivePromise() {
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise, io.netty.util.concurrent.ProgressivePromise
    public ProgressivePromise<V> setFailure(Throwable th) {
        super.setFailure(th);
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise, io.netty.util.concurrent.ProgressivePromise
    public ProgressivePromise<V> setSuccess(V v) {
        super.setSuccess((Object) v);
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public ProgressivePromise<V> addListener(GenericFutureListener<? extends Future<? super V>> genericFutureListener) {
        super.addListener((GenericFutureListener) genericFutureListener);
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public ProgressivePromise<V> addListeners(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr) {
        super.addListeners((GenericFutureListener[]) genericFutureListenerArr);
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public ProgressivePromise<V> await() throws InterruptedException {
        super.await();
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public ProgressivePromise<V> awaitUninterruptibly() {
        super.awaitUninterruptibly();
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public ProgressivePromise<V> removeListener(GenericFutureListener<? extends Future<? super V>> genericFutureListener) {
        super.removeListener((GenericFutureListener) genericFutureListener);
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public ProgressivePromise<V> removeListeners(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr) {
        super.removeListeners((GenericFutureListener[]) genericFutureListenerArr);
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public ProgressivePromise<V> sync() throws Throwable {
        super.sync();
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public ProgressivePromise<V> syncUninterruptibly() throws Throwable {
        super.syncUninterruptibly();
        return this;
    }
}
