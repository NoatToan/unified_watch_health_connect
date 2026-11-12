package defpackage;

import java.util.Queue;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.unsafe.SpmcArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public class x5l implements koo {
    public static final int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Queue<Object> f38730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38731b;
    public volatile Object c;

    static {
        int i = j0i.b() ? 16 : 128;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        d = i;
    }

    public x5l(Queue<Object> queue, int i) {
        this.f38730a = queue;
        this.f38731b = i;
    }

    public static x5l a() {
        return UnsafeAccess.isUnsafeAvailable() ? new x5l(false, d) : new x5l();
    }

    public boolean b() {
        Queue<Object> queue = this.f38730a;
        return queue == null || queue.isEmpty();
    }

    public void c(Object obj) throws MissingBackpressureException {
        boolean z;
        boolean z2;
        synchronized (this) {
            try {
                Queue<Object> queue = this.f38730a;
                z = true;
                z2 = false;
                if (queue != null) {
                    z = false;
                    z2 = !queue.offer(bxg.g(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        if (z2) {
            throw new MissingBackpressureException();
        }
    }

    public Object d() {
        synchronized (this) {
            try {
                Queue<Object> queue = this.f38730a;
                if (queue == null) {
                    return null;
                }
                Object objPoll = queue.poll();
                Object obj = this.c;
                if (objPoll == null && obj != null && queue.peek() == null) {
                    this.c = null;
                    objPoll = obj;
                }
                return objPoll;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void e() {
    }

    @Override // defpackage.koo
    public boolean isUnsubscribed() {
        return this.f38730a == null;
    }

    @Override // defpackage.koo
    public void unsubscribe() {
        e();
    }

    public x5l(boolean z, int i) {
        this.f38730a = z ? new SpmcArrayQueue<>(i) : new SpscArrayQueue<>(i);
        this.f38731b = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x5l() {
        int i = d;
        this(new b8o(i), i);
    }
}
