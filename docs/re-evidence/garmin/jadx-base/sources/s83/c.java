package s83;

import j83.o;
import java.io.PrintStream;
import java.util.Queue;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.unsafe.s;

/* JADX INFO: loaded from: classes11.dex */
public class c implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f157956b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<Object> f157957a;

    static {
        int i14 = b.f157955b ? 16 : 128;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i14 = Integer.parseInt(property);
            } catch (NumberFormatException e4) {
                PrintStream printStream = System.err;
                StringBuilder sbL = hb.a.l("Failed to set 'rx.buffer.size' with value ", property, " => ");
                sbL.append(e4.getMessage());
                printStream.println(sbL.toString());
            }
        }
        f157956b = i14;
    }

    private c(boolean z14, int i14) {
        this.f157957a = z14 ? new rx.internal.util.unsafe.d<>(i14) : new rx.internal.util.unsafe.l<>(i14);
    }

    public static c a() {
        return (s.f154926a == null || s.f154927b) ? new c() : new c(false, f157956b);
    }

    public final void b(Object obj) throws MissingBackpressureException {
        boolean z14;
        boolean z15;
        synchronized (this) {
            try {
                Queue<Object> queue = this.f157957a;
                z14 = true;
                z15 = false;
                if (queue != null) {
                    if (obj == null) {
                        obj = o83.e.f130874b;
                    } else {
                        o83.e.a aVar = o83.e.f130873a;
                    }
                    z14 = false;
                    z15 = !queue.offer(obj);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z14) {
            vb.h.z("This instance has been unsubscribed and the queue is no longer usable.");
        } else if (z15) {
            throw new MissingBackpressureException();
        }
    }

    @Override // j83.o
    public final boolean e() {
        return this.f157957a == null;
    }

    @Override // j83.o
    public final void f() {
        synchronized (this) {
        }
    }

    private c(Queue<Object> queue, int i14) {
        this.f157957a = queue;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        int i14 = f157956b;
        this(new t83.b(i14), i14);
    }
}
