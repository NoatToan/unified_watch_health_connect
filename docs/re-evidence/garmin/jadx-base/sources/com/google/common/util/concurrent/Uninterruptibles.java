package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Uninterruptibles {
    private Uninterruptibles() {
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean awaitTerminationUninterruptibly(ExecutorService executorService, long j8, TimeUnit timeUnit) {
        boolean zAwaitTermination;
        boolean z14 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwaitTermination = executorService.awaitTermination(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z14 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
            return zAwaitTermination;
        } catch (Throwable th3) {
            if (z14) {
                Thread.currentThread().interrupt();
            }
            throw th3;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j8, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z14 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z14 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th3) {
            if (z14) {
                Thread.currentThread().interrupt();
            }
            throw th3;
        }
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @J2ktIncompatible
    @ParametricNullness
    public static <V> V getUninterruptibly(Future<V> future, long j8, TimeUnit timeUnit) {
        V v14;
        boolean z14 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    v14 = future.get(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z14 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
            return v14;
        } catch (Throwable th3) {
            if (z14) {
                Thread.currentThread().interrupt();
            }
            throw th3;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void joinUninterruptibly(Thread thread, long j8, TimeUnit timeUnit) {
        Preconditions.checkNotNull(thread);
        boolean z14 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(thread, nanos);
                    break;
                } catch (InterruptedException unused) {
                    z14 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th3) {
            if (z14) {
                Thread.currentThread().interrupt();
            }
            throw th3;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> void putUninterruptibly(BlockingQueue<E> blockingQueue, E e4) {
        boolean z14 = false;
        while (true) {
            try {
                blockingQueue.put(e4);
                break;
            } catch (InterruptedException unused) {
                z14 = true;
            } catch (Throwable th3) {
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void sleepUninterruptibly(long j8, TimeUnit timeUnit) {
        boolean z14 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (InterruptedException unused) {
                    z14 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th3) {
            if (z14) {
                Thread.currentThread().interrupt();
            }
            throw th3;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> E takeUninterruptibly(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z14 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z14 = true;
            } catch (Throwable th3) {
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean tryAcquireUninterruptibly(Semaphore semaphore, int i14, long j8, TimeUnit timeUnit) {
        boolean zTryAcquire;
        boolean z14 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zTryAcquire = semaphore.tryAcquire(i14, nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z14 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
            return zTryAcquire;
        } catch (Throwable th3) {
            if (z14) {
                Thread.currentThread().interrupt();
            }
            throw th3;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean tryLockUninterruptibly(Lock lock, long j8, TimeUnit timeUnit) {
        boolean zTryLock;
        boolean z14 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zTryLock = lock.tryLock(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z14 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (Throwable th3) {
            if (z14) {
                Thread.currentThread().interrupt();
            }
            throw th3;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void awaitTerminationUninterruptibly(ExecutorService executorService) {
        Verify.verify(awaitTerminationUninterruptibly(executorService, Long.MAX_VALUE, TimeUnit.NANOSECONDS));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void awaitUninterruptibly(CountDownLatch countDownLatch) {
        boolean z14 = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z14 = true;
            } catch (Throwable th3) {
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V> V getUninterruptibly(Future<V> future) {
        V v14;
        boolean z14 = false;
        while (true) {
            try {
                v14 = future.get();
                break;
            } catch (InterruptedException unused) {
                z14 = true;
            } catch (Throwable th3) {
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
        return v14;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean tryAcquireUninterruptibly(Semaphore semaphore, long j8, TimeUnit timeUnit) {
        return tryAcquireUninterruptibly(semaphore, 1, j8, timeUnit);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void joinUninterruptibly(Thread thread) {
        boolean z14 = false;
        while (true) {
            try {
                thread.join();
                break;
            } catch (InterruptedException unused) {
                z14 = true;
            } catch (Throwable th3) {
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean awaitUninterruptibly(Condition condition, long j8, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z14 = false;
        try {
            long nanos = timeUnit.toNanos(j8);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = condition.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z14 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th3) {
            if (z14) {
                Thread.currentThread().interrupt();
            }
            throw th3;
        }
    }
}
