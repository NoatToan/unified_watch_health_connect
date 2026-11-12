package rx.internal.util;

import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;

/* JADX INFO: loaded from: classes23.dex */
public final class BackpressureDrainManager extends AtomicLong implements Producer {
    private static final long serialVersionUID = 2826241102729529449L;
    public boolean a;
    public volatile boolean b;
    public Throwable c;
    public final BackpressureQueueCallback d;

    public interface BackpressureQueueCallback {
        boolean accept(Object obj);

        void complete(Throwable th);

        Object peek();

        Object poll();
    }

    public BackpressureDrainManager(BackpressureQueueCallback backpressureQueueCallback) {
        this.d = backpressureQueueCallback;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0030 A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #2 {all -> 0x0084, blocks: (B:10:0x0012, B:26:0x0036, B:16:0x001f, B:24:0x0030, B:59:0x0077), top: B:80:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0077 A[Catch: all -> 0x0084, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0084, blocks: (B:10:0x0012, B:26:0x0036, B:16:0x001f, B:24:0x0030, B:59:0x0077), top: B:80:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x007e A[LOOP:1: B:12:0x0015->B:62:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x007d A[SYNTHETIC] */
    public void drain() throws Throwable {
        Object objPoll;
        synchronized (this) {
            if (this.a) {
                return;
            }
            boolean z = true;
            this.a = true;
            boolean z2 = this.b;
            long j = get();
            try {
                BackpressureQueueCallback backpressureQueueCallback = this.d;
                while (true) {
                    int i = 0;
                    while (true) {
                        try {
                            if (j <= 0 && !z2) {
                                break;
                            }
                            if (!z2) {
                                objPoll = backpressureQueueCallback.poll();
                                if (objPoll != null) {
                                    break;
                                }
                                if (backpressureQueueCallback.accept(objPoll)) {
                                    return;
                                }
                                j--;
                                i++;
                            } else if (backpressureQueueCallback.peek() != null) {
                                if (j == 0) {
                                    break;
                                }
                                objPoll = backpressureQueueCallback.poll();
                                if (objPoll != null) {
                                    break;
                                }
                                if (backpressureQueueCallback.accept(objPoll)) {
                                    return;
                                }
                                j--;
                                i++;
                            } else {
                                backpressureQueueCallback.complete(this.c);
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (!z) {
                                synchronized (this) {
                                    this.a = false;
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        synchronized (this) {
                            try {
                                z2 = this.b;
                                boolean z3 = backpressureQueueCallback.peek() != null;
                                if (get() != Long.MAX_VALUE) {
                                    long jAddAndGet = addAndGet(-i);
                                    if ((jAddAndGet != 0 && z3) || (z2 && !z3)) {
                                        j = jAddAndGet;
                                    }
                                    this.a = false;
                                    return;
                                }
                                if (!z3 && !z2) {
                                    this.a = false;
                                    return;
                                }
                                j = Long.MAX_VALUE;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z = false;
            }
        }
    }

    public boolean isTerminated() {
        return this.b;
    }

    @Override // rx.Producer
    public void request(long j) throws Throwable {
        boolean z;
        long j2;
        if (j == 0) {
            return;
        }
        while (true) {
            long j3 = get();
            boolean z2 = true;
            z = j3 == 0;
            if (j3 == Long.MAX_VALUE) {
                break;
            }
            if (j == Long.MAX_VALUE) {
                j2 = j;
            } else {
                j2 = j3 <= Long.MAX_VALUE - j ? j3 + j : Long.MAX_VALUE;
                z2 = z;
            }
            if (compareAndSet(j3, j2)) {
                z = z2;
                break;
            }
        }
        if (z) {
            drain();
        }
    }

    public void terminate() {
        this.b = true;
    }

    public void terminateAndDrain() throws Throwable {
        this.b = true;
        drain();
    }

    public void terminate(Throwable th) {
        if (this.b) {
            return;
        }
        this.c = th;
        this.b = true;
    }

    public void terminateAndDrain(Throwable th) throws Throwable {
        if (this.b) {
            return;
        }
        this.c = th;
        this.b = true;
        drain();
    }
}
