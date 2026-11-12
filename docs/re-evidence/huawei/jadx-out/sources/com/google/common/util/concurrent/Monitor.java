package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class Monitor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantLock f4706b;

    @CheckForNull
    private Guard d;
    private final boolean e;

    public static abstract class Guard {
        final Condition condition;
        final Monitor monitor;

        @CheckForNull
        Guard next;
        int waiterCount = 0;

        public abstract boolean isSatisfied();

        protected Guard(Monitor monitor) {
            this.monitor = (Monitor) Preconditions.checkNotNull(monitor, MapKeyNames.THIRD_MONITORS);
            this.condition = monitor.f4706b.newCondition();
        }
    }

    public Monitor() {
        this(false);
    }

    public Monitor(boolean z) {
        this.d = null;
        this.e = z;
        this.f4706b = new ReentrantLock(z);
    }

    public void c() {
        this.f4706b.lock();
    }

    public void d(Guard guard) {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f4706b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            b(guard, zIsHeldByCurrentThread);
        } catch (Throwable th) {
            b();
            throw th;
        }
    }

    public boolean e(Guard guard, long j, TimeUnit timeUnit) throws Throwable {
        boolean zB;
        long jE;
        long jC;
        long jB = b(j, timeUnit);
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f4706b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        boolean zInterrupted = Thread.interrupted();
        try {
            zB = true;
            if (this.e || !reentrantLock.tryLock()) {
                jE = e(jB);
                long jC2 = jB;
                while (true) {
                    try {
                        try {
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (zB) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        jC2 = c(jE, jB);
                        zInterrupted = true;
                    }
                }
                if (!reentrantLock.tryLock(jC2, TimeUnit.NANOSECONDS)) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return false;
                }
            } else {
                jE = 0;
            }
            while (!guard.isSatisfied()) {
                try {
                    if (jE == 0) {
                        jE = e(jB);
                        jC = jB;
                    } else {
                        jC = c(jE, jB);
                    }
                    zB = b(guard, jC, zIsHeldByCurrentThread);
                } catch (InterruptedException unused2) {
                    zIsHeldByCurrentThread = false;
                    zInterrupted = zB;
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            if (!zB) {
                reentrantLock.unlock();
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zB;
        } catch (Throwable th3) {
            th = th3;
            zB = zInterrupted;
        }
    }

    public boolean b(Guard guard) {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f4706b;
        reentrantLock.lock();
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
                reentrantLock.unlock();
            }
            return zIsSatisfied;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void b() {
        ReentrantLock reentrantLock = this.f4706b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                a();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean d() {
        return this.f4706b.isHeldByCurrentThread();
    }

    private static long b(long j, TimeUnit timeUnit) {
        return Longs.a(timeUnit.toNanos(j), 0L, 6917529027641081853L);
    }

    private static long e(long j) {
        if (j <= 0) {
            return 0L;
        }
        long jNanoTime = System.nanoTime();
        if (jNanoTime == 0) {
            return 1L;
        }
        return jNanoTime;
    }

    private static long c(long j, long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        return j2 - (System.nanoTime() - j);
    }

    private void a() {
        for (Guard guard = this.d; guard != null; guard = guard.next) {
            if (e(guard)) {
                guard.condition.signal();
                return;
            }
        }
    }

    private boolean e(Guard guard) {
        try {
            return guard.isSatisfied();
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    private void e() {
        for (Guard guard = this.d; guard != null; guard = guard.next) {
            guard.condition.signalAll();
        }
    }

    private void a(Guard guard) {
        int i = guard.waiterCount;
        guard.waiterCount = i + 1;
        if (i == 0) {
            guard.next = this.d;
            this.d = guard;
        }
    }

    private void c(Guard guard) {
        int i = guard.waiterCount - 1;
        guard.waiterCount = i;
        if (i == 0) {
            Guard guard2 = this.d;
            Guard guard3 = null;
            while (guard2 != guard) {
                guard3 = guard2;
                guard2 = guard2.next;
            }
            if (guard3 == null) {
                this.d = guard2.next;
            } else {
                guard3.next = guard2.next;
            }
            guard2.next = null;
        }
    }

    private void b(Guard guard, boolean z) {
        if (z) {
            a();
        }
        a(guard);
        do {
            try {
                guard.condition.awaitUninterruptibly();
            } finally {
                c(guard);
            }
        } while (!guard.isSatisfied());
    }

    private boolean b(Guard guard, long j, boolean z) throws InterruptedException {
        boolean z2 = true;
        while (j > 0) {
            if (z2) {
                if (z) {
                    try {
                        a();
                    } catch (Throwable th) {
                        if (!z2) {
                            c(guard);
                        }
                        throw th;
                    }
                }
                a(guard);
                z2 = false;
            }
            j = guard.condition.awaitNanos(j);
            if (guard.isSatisfied()) {
                if (!z2) {
                    c(guard);
                }
                return true;
            }
        }
        if (!z2) {
            c(guard);
        }
        return false;
    }
}
