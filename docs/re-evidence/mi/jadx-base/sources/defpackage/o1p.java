package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes11.dex */
public class o1p<T> implements Future<T> {
    private static final int EXC = 3;
    private static final int ING = 1;
    private static final int NEW = 0;
    private static final int NOR = 2;
    private Object result;
    private volatile int state = 0;
    private volatile a waiters;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f28651a = Thread.currentThread();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile a f28652b;
    }

    private void finishSet() {
        a aVar = this.waiters;
        if (aVar == null) {
            return;
        }
        this.waiters = null;
        while (true) {
            Thread thread = aVar.f28651a;
            if (thread != null) {
                aVar.f28651a = null;
                LockSupport.unpark(thread);
            }
            a aVar2 = aVar.f28652b;
            if (aVar2 == null) {
                return;
            }
            aVar.f28652b = null;
            aVar = aVar2;
        }
    }

    private void removeWaiter(a aVar) {
        if (aVar != null) {
            aVar.f28651a = null;
            while (true) {
                a aVar2 = this.waiters;
                a aVar3 = null;
                while (aVar2 != null) {
                    a aVar4 = aVar2.f28652b;
                    if (aVar2.f28651a != null) {
                        aVar3 = aVar2;
                    } else if (aVar3 != null) {
                        aVar3.f28652b = aVar4;
                        if (aVar3.f28651a == null) {
                        }
                    } else {
                        synchronized (this) {
                            try {
                                if (this.waiters == aVar2) {
                                    this.waiters = aVar4;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    aVar2 = aVar4;
                }
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private T returnGet(int i) throws ExecutionException, InterruptedException {
        T t = (T) this.result;
        if (i == 2) {
            return t;
        }
        Throwable th = (Throwable) t;
        throw new ExecutionException(th.getMessage(), th);
    }

    private int waitGet(boolean z, long j) throws InterruptedException {
        long j2;
        boolean z2 = false;
        long jNanoTime = 0;
        a aVar = null;
        while (true) {
            int i = this.state;
            if (i > 1) {
                if (aVar != null) {
                    aVar.f28651a = null;
                }
                return i;
            }
            if (i == 1) {
                Thread.yield();
            } else {
                if (Thread.interrupted()) {
                    removeWaiter(aVar);
                    throw new InterruptedException();
                }
                if (aVar == null) {
                    if (z && j <= 0) {
                        return i;
                    }
                    aVar = new a();
                } else if (!z2) {
                    synchronized (this) {
                        aVar.f28652b = this.waiters;
                        this.waiters = aVar;
                    }
                    z2 = true;
                } else if (z) {
                    if (jNanoTime == 0) {
                        jNanoTime = System.nanoTime();
                        if (jNanoTime == 0) {
                            jNanoTime = 1;
                        }
                        j2 = j;
                    } else {
                        long jNanoTime2 = System.nanoTime() - jNanoTime;
                        if (jNanoTime2 >= j) {
                            removeWaiter(aVar);
                            return this.state;
                        }
                        j2 = j - jNanoTime2;
                    }
                    if (this.state < 1) {
                        LockSupport.parkNanos(this, j2);
                    }
                } else {
                    LockSupport.park(this);
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        int iWaitGet = this.state;
        if (iWaitGet <= 1) {
            iWaitGet = waitGet(false, 0L);
        }
        return returnGet(iWaitGet);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.result != null && this.state > 1;
    }

    public void obtrudeException(Throwable th, boolean z) {
        th.getClass();
        synchronized (this) {
            try {
                if (this.state == 0) {
                    this.result = th;
                    this.state = 1;
                }
                if (this.state == 1) {
                    this.state = 3;
                }
                if (z) {
                    this.result = th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        finishSet();
    }

    public void obtrudeValue(T t, boolean z) {
        synchronized (this) {
            try {
                if (this.state == 0) {
                    this.state = 1;
                    this.result = t;
                }
                if (this.state == 1) {
                    this.state = 2;
                }
                if (z) {
                    this.result = t;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        finishSet();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        timeUnit.getClass();
        int iWaitGet = this.state;
        if (iWaitGet <= 1 && (iWaitGet = waitGet(true, timeUnit.toNanos(j))) <= 1) {
            throw new TimeoutException();
        }
        return returnGet(iWaitGet);
    }
}
