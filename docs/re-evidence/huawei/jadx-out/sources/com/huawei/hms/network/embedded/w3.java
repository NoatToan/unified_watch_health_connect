package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public class w3 extends x3 {
    public static final long g;
    public static final long h;

    @Nullable
    public static w3 i;
    public boolean d;

    @Nullable
    public w3 e;
    public long f;

    public void timedOut() {
    }

    public final boolean exit() {
        if (!this.d) {
            return false;
        }
        this.d = false;
        return a(this);
    }

    public final void enter() {
        if (this.d) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            this.d = true;
            a(this, jTimeoutNanos, zHasDeadline);
        }
    }

    public static boolean a(w3 w3Var) {
        synchronized (w3.class) {
            w3 w3Var2 = i;
            while (w3Var2 != null) {
                w3 w3Var3 = w3Var2.e;
                if (w3Var3 == w3Var) {
                    w3Var2.e = w3Var.e;
                    w3Var.e = null;
                    return false;
                }
                w3Var2 = w3Var3;
            }
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0016, B:10:0x0022, B:12:0x002e, B:15:0x003a, B:16:0x0040, B:18:0x0044, B:21:0x004d, B:22:0x0050, B:24:0x005a, B:14:0x0034, B:27:0x0061, B:28:0x0066), top: B:32:0x0003 }] */
    public static void a(w3 w3Var, long j, boolean z) {
        w3 w3Var2;
        w3 w3Var3;
        synchronized (w3.class) {
            if (i == null) {
                i = new w3();
                new a().start();
            }
            long jNanoTime = System.nanoTime();
            if (j == 0 || !z) {
                if (j == 0) {
                    if (!z) {
                        throw new AssertionError();
                    }
                    w3Var.f = w3Var.deadlineNanoTime();
                }
                long jA = w3Var.a(jNanoTime);
                w3Var2 = i;
                while (true) {
                    w3Var3 = w3Var2.e;
                    if (w3Var3 != null || jA < w3Var3.a(jNanoTime)) {
                        break;
                        break;
                    }
                    w3Var2 = w3Var2.e;
                }
                w3Var.e = w3Var2.e;
                w3Var2.e = w3Var;
                if (w3Var2 == i) {
                    w3.class.notifyAll();
                }
            } else {
                j = Math.min(j, w3Var.deadlineNanoTime() - jNanoTime);
            }
            w3Var.f = j + jNanoTime;
            long jA2 = w3Var.a(jNanoTime);
            w3Var2 = i;
            while (true) {
                w3Var3 = w3Var2.e;
                if (w3Var3 != null) {
                    break;
                } else {
                    w3Var2 = w3Var2.e;
                }
            }
            w3Var.e = w3Var2.e;
            w3Var2.e = w3Var;
            if (w3Var2 == i) {
                w3.class.notifyAll();
            }
        }
    }

    @Nullable
    public static w3 a() throws InterruptedException {
        w3 w3Var = i.e;
        long jNanoTime = System.nanoTime();
        if (w3Var == null) {
            w3.class.wait(g);
            if (i.e != null || System.nanoTime() - jNanoTime < h) {
                return null;
            }
            return i;
        }
        long jA = w3Var.a(jNanoTime);
        if (jA > 0) {
            long j = jA / 1000000;
            w3.class.wait(j, (int) (jA - (1000000 * j)));
            return null;
        }
        i.e = w3Var.e;
        w3Var.e = null;
        return w3Var;
    }

    public static final class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f15559a = "Watchdog";

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
        
            r1.timedOut();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            while (true) {
                try {
                    synchronized (w3.class) {
                        try {
                            w3 w3VarA = w3.a();
                            if (w3VarA != null) {
                                if (w3VarA == w3.i) {
                                    w3.i = null;
                                    return;
                                }
                                Logger.i(f15559a, e.getMessage());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (InterruptedException e) {
                    Logger.i(f15559a, e.getMessage());
                }
            }
        }

        public a() {
            super(f15559a);
            setDaemon(true);
        }
    }

    private long a(long j) {
        return this.f - j;
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        g = millis;
        h = TimeUnit.MILLISECONDS.toNanos(millis);
    }
}
