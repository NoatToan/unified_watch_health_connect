package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
final class u<V> extends FluentFuture.a<V> {

    @NullableDecl
    private ListenableFuture<V> i;

    @NullableDecl
    private ScheduledFuture<?> j;

    public static final class b<V> implements Runnable {

        @NullableDecl
        public u<V> a;

        public b(u<V> uVar) {
            this.a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture<? extends V> listenableFuture;
            u<V> uVar = this.a;
            if (uVar == null || (listenableFuture = ((u) uVar).i) == null) {
                return;
            }
            this.a = null;
            if (listenableFuture.isDone()) {
                uVar.setFuture(listenableFuture);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = ((u) uVar).j;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                }
                ((u) uVar).j = null;
                uVar.setException(new c(str + ": " + listenableFuture));
            } finally {
                listenableFuture.cancel(true);
            }
        }
    }

    public static final class c extends TimeoutException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }

        private c(String str) {
            super(str);
        }
    }

    private u(ListenableFuture<V> listenableFuture) {
        this.i = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    public static <V> ListenableFuture<V> z(ListenableFuture<V> listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        u uVar = new u(listenableFuture);
        b bVar = new b(uVar);
        uVar.j = scheduledExecutorService.schedule(bVar, j, timeUnit);
        listenableFuture.addListener(bVar, MoreExecutors.directExecutor());
        return uVar;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public void afterDone() {
        s(this.i);
        ScheduledFuture<?> scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.i = null;
        this.j = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
        ListenableFuture<V> listenableFuture = this.i;
        ScheduledFuture<?> scheduledFuture = this.j;
        if (listenableFuture == null) {
            return null;
        }
        String str = "inputFuture=[" + listenableFuture + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }
}
