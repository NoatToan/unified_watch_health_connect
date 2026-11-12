package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f21846a;

    public static final class a extends AbstractQueuedSynchronizer {
        private static final long serialVersionUID = 5970133580157457018L;

        public a(int i) {
            setState(i);
        }

        public final void d() {
            releaseShared(1);
        }

        public final int e() {
            return getState();
        }

        public final void f() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i) {
            int state;
            int i2;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i2 = state - 1;
            } while (!compareAndSetState(state, i2));
            return i2 == 0;
        }
    }

    public a0(int i) {
        if (i >= 0) {
            this.f21846a = new a(i);
            return;
        }
        throw new IllegalArgumentException("negative initial count '" + i + "' is not allowed");
    }

    public void a() {
        this.f21846a.d();
    }

    public int b() {
        return this.f21846a.e();
    }

    public void c() {
        this.f21846a.f();
    }

    public boolean d(long j, @NotNull TimeUnit timeUnit) throws InterruptedException {
        return this.f21846a.tryAcquireSharedNanos(1, timeUnit.toNanos(j));
    }

    public a0() {
        this(0);
    }
}
