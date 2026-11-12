package com.huawei.hms.network.embedded;

import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public class za extends ac {
    public static final int h = 65536;
    public static final long i;
    public static final long j;

    @Nullable
    public static za k;
    public boolean e;

    @Nullable
    public za f;
    public long g;

    public void timedOut() {
    }

    public IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final boolean g() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return a(this);
    }

    public final void f() {
        if (this.e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jE = e();
        boolean zD = d();
        if (jE != 0 || zD) {
            this.e = true;
            a(this, jE, zD);
        }
    }

    public final void a(boolean z) throws IOException {
        if (g() && z) {
            throw newTimeoutException(null);
        }
    }

    public final IOException a(IOException iOException) throws IOException {
        return !g() ? iOException : newTimeoutException(iOException);
    }

    public final zb a(zb zbVar) {
        return new b(zbVar);
    }

    public class a implements yb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ yb f15658a;

        @Override // com.huawei.hms.network.embedded.yb
        public void write(bb bbVar, long j) throws IOException {
            cc.a(bbVar.f14653b, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                vb vbVar = bbVar.f14652a;
                while (j2 < 65536) {
                    j2 += (long) (vbVar.f15548c - vbVar.f15547b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    vbVar = vbVar.f;
                }
                za.this.f();
                try {
                    try {
                        this.f15658a.write(bbVar, j2);
                        j -= j2;
                        za.this.a(true);
                    } catch (IOException e) {
                        throw za.this.a(e);
                    }
                } catch (Throwable th) {
                    za.this.a(false);
                    throw th;
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f15658a + Constants.RIGHT_BRACKET_ONLY;
        }

        @Override // com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return za.this;
        }

        @Override // com.huawei.hms.network.embedded.yb, java.io.Flushable
        public void flush() throws IOException {
            za.this.f();
            try {
                try {
                    this.f15658a.flush();
                    za.this.a(true);
                } catch (IOException e) {
                    throw za.this.a(e);
                }
            } catch (Throwable th) {
                za.this.a(false);
                throw th;
            }
        }

        @Override // com.huawei.hms.network.embedded.yb, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            za.this.f();
            try {
                try {
                    this.f15658a.close();
                    za.this.a(true);
                } catch (IOException e) {
                    throw za.this.a(e);
                }
            } catch (Throwable th) {
                za.this.a(false);
                throw th;
            }
        }

        public a(yb ybVar) {
            this.f15658a = ybVar;
        }
    }

    public final yb a(yb ybVar) {
        return new a(ybVar);
    }

    public class b implements zb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zb f15660a;

        public String toString() {
            return "AsyncTimeout.source(" + this.f15660a + Constants.RIGHT_BRACKET_ONLY;
        }

        @Override // com.huawei.hms.network.embedded.zb, com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return za.this;
        }

        @Override // com.huawei.hms.network.embedded.zb
        public long read(bb bbVar, long j) throws IOException {
            za.this.f();
            try {
                try {
                    long j2 = this.f15660a.read(bbVar, j);
                    za.this.a(true);
                    return j2;
                } catch (IOException e) {
                    throw za.this.a(e);
                }
            } catch (Throwable th) {
                za.this.a(false);
                throw th;
            }
        }

        @Override // com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
        public void close() throws IOException {
            za.this.f();
            try {
                try {
                    this.f15660a.close();
                    za.this.a(true);
                } catch (IOException e) {
                    throw za.this.a(e);
                }
            } catch (Throwable th) {
                za.this.a(false);
                throw th;
            }
        }

        public b(zb zbVar) {
            this.f15660a = zbVar;
        }
    }

    @Nullable
    public static za h() throws InterruptedException {
        za zaVar = k.f;
        long jNanoTime = System.nanoTime();
        if (zaVar == null) {
            za.class.wait(i);
            if (k.f != null || System.nanoTime() - jNanoTime < j) {
                return null;
            }
            return k;
        }
        long jA = zaVar.a(jNanoTime);
        if (jA > 0) {
            long j2 = jA / 1000000;
            za.class.wait(j2, (int) (jA - (1000000 * j2)));
            return null;
        }
        k.f = zaVar.f;
        zaVar.f = null;
        return zaVar;
    }

    public static boolean a(za zaVar) {
        synchronized (za.class) {
            za zaVar2 = k;
            while (zaVar2 != null) {
                za zaVar3 = zaVar2.f;
                if (zaVar3 == zaVar) {
                    zaVar2.f = zaVar.f;
                    zaVar.f = null;
                    return false;
                }
                zaVar2 = zaVar3;
            }
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0016, B:10:0x0022, B:12:0x002e, B:15:0x003a, B:16:0x0040, B:18:0x0044, B:21:0x004d, B:22:0x0050, B:24:0x005a, B:14:0x0034, B:27:0x0061, B:28:0x0066), top: B:32:0x0003 }] */
    public static void a(za zaVar, long j2, boolean z) {
        za zaVar2;
        za zaVar3;
        synchronized (za.class) {
            if (k == null) {
                k = new za();
                new c().start();
            }
            long jNanoTime = System.nanoTime();
            if (j2 == 0 || !z) {
                if (j2 == 0) {
                    if (!z) {
                        throw new AssertionError();
                    }
                    zaVar.g = zaVar.c();
                }
                long jA = zaVar.a(jNanoTime);
                zaVar2 = k;
                while (true) {
                    zaVar3 = zaVar2.f;
                    if (zaVar3 != null || jA < zaVar3.a(jNanoTime)) {
                        break;
                        break;
                    }
                    zaVar2 = zaVar2.f;
                }
                zaVar.f = zaVar2.f;
                zaVar2.f = zaVar;
                if (zaVar2 == k) {
                    za.class.notify();
                }
            } else {
                j2 = Math.min(j2, zaVar.c() - jNanoTime);
            }
            zaVar.g = j2 + jNanoTime;
            long jA2 = zaVar.a(jNanoTime);
            zaVar2 = k;
            while (true) {
                zaVar3 = zaVar2.f;
                if (zaVar3 != null) {
                    break;
                } else {
                    zaVar2 = zaVar2.f;
                }
            }
            zaVar.f = zaVar2.f;
            zaVar2.f = zaVar;
            if (zaVar2 == k) {
                za.class.notify();
            }
        }
    }

    public static final class c extends Thread {
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
                    synchronized (za.class) {
                        za zaVarH = za.h();
                        if (zaVarH != null) {
                            if (zaVarH == za.k) {
                                za.k = null;
                                return;
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                }
            }
        }

        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }
    }

    private long a(long j2) {
        return this.g - j2;
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        i = millis;
        j = TimeUnit.MILLISECONDS.toNanos(millis);
    }
}
