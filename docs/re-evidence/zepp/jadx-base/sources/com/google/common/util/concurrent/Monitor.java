package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import com.xiaomi.hm.health.HMIntentHandler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public final class Monitor {
    private final boolean a;
    private final ReentrantLock b;

    @GuardedBy("lock")
    private Guard c;

    @Beta
    public static abstract class Guard {

        @Weak
        public final Monitor a;
        public final Condition b;

        @GuardedBy("monitor.lock")
        public int c = 0;

        @NullableDecl
        @GuardedBy("monitor.lock")
        public Guard d;

        public Guard(Monitor monitor) {
            this.a = (Monitor) Preconditions.checkNotNull(monitor, HMIntentHandler.TARGET_SNORE_MONITOR);
            this.b = monitor.b.newCondition();
        }

        public abstract boolean isSatisfied();
    }

    public Monitor() {
        this(false);
    }

    @GuardedBy("lock")
    private void b(Guard guard, boolean z) throws InterruptedException {
        if (z) {
            k();
        }
        e(guard);
        do {
            try {
                guard.b.await();
            } finally {
                f(guard);
            }
        } while (!guard.isSatisfied());
    }

    @GuardedBy("lock")
    private boolean c(Guard guard, long j, boolean z) throws InterruptedException {
        boolean z2 = true;
        while (j > 0) {
            if (z2) {
                if (z) {
                    try {
                        k();
                    } catch (Throwable th) {
                        if (!z2) {
                            f(guard);
                        }
                        throw th;
                    }
                }
                e(guard);
                z2 = false;
            }
            j = guard.b.awaitNanos(j);
            if (guard.isSatisfied()) {
                if (!z2) {
                    f(guard);
                }
                return true;
            }
        }
        if (!z2) {
            f(guard);
        }
        return false;
    }

    @GuardedBy("lock")
    private void d(Guard guard, boolean z) {
        if (z) {
            k();
        }
        e(guard);
        do {
            try {
                guard.b.awaitUninterruptibly();
            } finally {
                f(guard);
            }
        } while (!guard.isSatisfied());
    }

    @GuardedBy("lock")
    private void e(Guard guard) {
        int i = guard.c;
        guard.c = i + 1;
        if (i == 0) {
            guard.d = this.c;
            this.c = guard;
        }
    }

    @GuardedBy("lock")
    private void f(Guard guard) {
        int i = guard.c - 1;
        guard.c = i;
        if (i == 0) {
            Guard guard2 = this.c;
            Guard guard3 = null;
            while (guard2 != guard) {
                guard3 = guard2;
                guard2 = guard2.d;
            }
            if (guard3 == null) {
                this.c = guard2.d;
            } else {
                guard3.d = guard2.d;
            }
            guard2.d = null;
        }
    }

    private static long g(long j) {
        if (j <= 0) {
            return 0L;
        }
        long jNanoTime = System.nanoTime();
        if (jNanoTime == 0) {
            return 1L;
        }
        return jNanoTime;
    }

    @GuardedBy("lock")
    private boolean h(Guard guard) {
        try {
            return guard.isSatisfied();
        } catch (Throwable th) {
            j();
            throw th;
        }
    }

    private static long i(long j, long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        return j2 - (System.nanoTime() - j);
    }

    @GuardedBy("lock")
    private void j() {
        for (Guard guard = this.c; guard != null; guard = guard.d) {
            guard.b.signalAll();
        }
    }

    @GuardedBy("lock")
    private void k() {
        for (Guard guard = this.c; guard != null; guard = guard.d) {
            if (h(guard)) {
                guard.b.signal();
                return;
            }
        }
    }

    private static long l(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 0) {
            return 0L;
        }
        if (nanos > 6917529027641081853L) {
            return 6917529027641081853L;
        }
        return nanos;
    }

    public void enter() {
        this.b.lock();
    }

    public boolean enterIf(Guard guard) {
        if (guard.a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
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

    public boolean enterIfInterruptibly(Guard guard) throws InterruptedException {
        if (guard.a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lockInterruptibly();
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

    public void enterInterruptibly() throws InterruptedException {
        this.b.lockInterruptibly();
    }

    public void enterWhen(Guard guard) throws InterruptedException {
        if (guard.a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            b(guard, zIsHeldByCurrentThread);
        } catch (Throwable th) {
            leave();
            throw th;
        }
    }

    public void enterWhenUninterruptibly(Guard guard) {
        if (guard.a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            d(guard, zIsHeldByCurrentThread);
        } catch (Throwable th) {
            leave();
            throw th;
        }
    }

    public int getOccupiedDepth() {
        return this.b.getHoldCount();
    }

    public int getQueueLength() {
        return this.b.getQueueLength();
    }

    public int getWaitQueueLength(Guard guard) {
        if (guard.a != this) {
            throw new IllegalMonitorStateException();
        }
        this.b.lock();
        try {
            return guard.c;
        } finally {
            this.b.unlock();
        }
    }

    public boolean hasQueuedThread(Thread thread) {
        return this.b.hasQueuedThread(thread);
    }

    public boolean hasQueuedThreads() {
        return this.b.hasQueuedThreads();
    }

    public boolean hasWaiters(Guard guard) {
        return getWaitQueueLength(guard) > 0;
    }

    public boolean isFair() {
        return this.a;
    }

    public boolean isOccupied() {
        return this.b.isLocked();
    }

    public boolean isOccupiedByCurrentThread() {
        return this.b.isHeldByCurrentThread();
    }

    public void leave() {
        ReentrantLock reentrantLock = this.b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                k();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean tryEnter() {
        return this.b.tryLock();
    }

    public boolean tryEnterIf(Guard guard) {
        if (guard.a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.b;
        if (!reentrantLock.tryLock()) {
            return false;
        }
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

    public void waitFor(Guard guard) throws InterruptedException {
        if (!(guard.a == this) || !this.b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        b(guard, true);
    }

    public void waitForUninterruptibly(Guard guard) {
        if (!(guard.a == this) || !this.b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        d(guard, true);
    }

    public Monitor(boolean z) {
        this.c = null;
        this.a = z;
        this.b = new ReentrantLock(z);
    }

    public boolean enter(long j, TimeUnit timeUnit) throws Throwable {
        boolean zTryLock;
        long jL = l(j, timeUnit);
        ReentrantLock reentrantLock = this.b;
        boolean z = true;
        if (!this.a && reentrantLock.tryLock()) {
            return true;
        }
        boolean zInterrupted = Thread.interrupted();
        try {
            long jNanoTime = System.nanoTime();
            long jI = jL;
            while (true) {
                try {
                    try {
                        zTryLock = reentrantLock.tryLock(jI, TimeUnit.NANOSECONDS);
                        break;
                    } catch (Throwable th) {
                        th = th;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    jI = i(jNanoTime, jL);
                    zInterrupted = true;
                }
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (Throwable th2) {
            th = th2;
            z = zInterrupted;
        }
    }

    public boolean enterInterruptibly(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.b.tryLock(j, timeUnit);
    }

    public boolean waitFor(Guard guard, long j, TimeUnit timeUnit) throws InterruptedException {
        long jL = l(j, timeUnit);
        if ((guard.a == this) & this.b.isHeldByCurrentThread()) {
            if (guard.isSatisfied()) {
                return true;
            }
            if (!Thread.interrupted()) {
                return c(guard, jL, true);
            }
            throw new InterruptedException();
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    public boolean waitForUninterruptibly(Guard guard, long j, TimeUnit timeUnit) throws Throwable {
        long jL = l(j, timeUnit);
        boolean z = true;
        if ((guard.a == this) & this.b.isHeldByCurrentThread()) {
            if (guard.isSatisfied()) {
                return true;
            }
            long jG = g(jL);
            boolean zInterrupted = Thread.interrupted();
            long jI = jL;
            boolean z2 = true;
            while (true) {
                try {
                    try {
                        boolean zC = c(guard, jI, z2);
                        if (zInterrupted) {
                            Thread.currentThread().interrupt();
                        }
                        return zC;
                    } catch (Throwable th) {
                        th = th;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    if (guard.isSatisfied()) {
                        Thread.currentThread().interrupt();
                        return true;
                    }
                    jI = i(jG, jL);
                    zInterrupted = true;
                    z2 = false;
                } catch (Throwable th2) {
                    th = th2;
                    z = zInterrupted;
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    public boolean enterIf(Guard guard, long j, TimeUnit timeUnit) {
        if (guard.a == this) {
            if (!enter(j, timeUnit)) {
                return false;
            }
            try {
                boolean zIsSatisfied = guard.isSatisfied();
                if (!zIsSatisfied) {
                    this.b.unlock();
                }
                return zIsSatisfied;
            } catch (Throwable th) {
                this.b.unlock();
                throw th;
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean enterIfInterruptibly(Guard guard, long j, TimeUnit timeUnit) throws InterruptedException {
        if (guard.a == this) {
            ReentrantLock reentrantLock = this.b;
            if (!reentrantLock.tryLock(j, timeUnit)) {
                return false;
            }
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
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    public boolean enterWhen(Guard guard, long j, TimeUnit timeUnit) throws InterruptedException {
        long jG;
        boolean z;
        long jL = l(j, timeUnit);
        if (guard.a == this) {
            ReentrantLock reentrantLock = this.b;
            boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            if (!this.a) {
                if (!Thread.interrupted()) {
                    if (reentrantLock.tryLock()) {
                        jG = 0;
                    } else {
                        jG = g(jL);
                        if (!reentrantLock.tryLock(j, timeUnit)) {
                            return false;
                        }
                    }
                } else {
                    throw new InterruptedException();
                }
            } else {
                jG = g(jL);
                if (!reentrantLock.tryLock(j, timeUnit)) {
                    return false;
                }
            }
            try {
                if (!guard.isSatisfied()) {
                    if (jG != 0) {
                        jL = i(jG, jL);
                    }
                    z = c(guard, jL, zIsHeldByCurrentThread);
                }
                if (!z) {
                    reentrantLock.unlock();
                }
                return z;
            } catch (Throwable th) {
                if (!zIsHeldByCurrentThread) {
                    try {
                        k();
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                throw th;
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean enterWhenUninterruptibly(Guard guard, long j, TimeUnit timeUnit) throws Throwable {
        long jG;
        long jI;
        long jL = l(j, timeUnit);
        if (guard.a == this) {
            ReentrantLock reentrantLock = this.b;
            boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            boolean zInterrupted = Thread.interrupted();
            boolean zC = true;
            try {
                if (this.a || !reentrantLock.tryLock()) {
                    jG = g(jL);
                    long jI2 = jL;
                    while (true) {
                        try {
                            try {
                                break;
                            } catch (Throwable th) {
                                th = th;
                                zInterrupted = true;
                                if (zInterrupted) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        } catch (InterruptedException unused) {
                            jI2 = i(jG, jL);
                            zInterrupted = true;
                        }
                    }
                    if (!reentrantLock.tryLock(jI2, TimeUnit.NANOSECONDS)) {
                        if (zInterrupted) {
                            Thread.currentThread().interrupt();
                        }
                        return false;
                    }
                } else {
                    jG = 0;
                }
                while (!guard.isSatisfied()) {
                    try {
                        if (jG == 0) {
                            jG = g(jL);
                            jI = jL;
                        } else {
                            jI = i(jG, jL);
                        }
                        zC = c(guard, jI, zIsHeldByCurrentThread);
                    } catch (InterruptedException unused2) {
                        zIsHeldByCurrentThread = false;
                        zInterrupted = true;
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                }
                if (!zC) {
                    reentrantLock.unlock();
                }
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                return zC;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }
}
