package com.huawei.hms.network.embedded;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class y9 {
    public static final /* synthetic */ boolean m = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15634a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15636c;
    public final v9 d;
    public final Deque<j7> e;
    public boolean f;
    public final b g;
    public final a h;
    public final c i;
    public final c j;

    @Nullable
    public r9 k;

    @Nullable
    public IOException l;

    public ac n() {
        return this.j;
    }

    public void m() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public j7 l() throws IOException {
        j7 j7Var;
        synchronized (this) {
            r9 r9Var = this.k;
            if (r9Var != null) {
                IOException iOException = this.l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new da(r9Var);
            }
            b bVar = this.g;
            if (!bVar.f || !bVar.f15640a.i() || !this.g.f15641b.i()) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            j7Var = this.g.d != null ? this.g.d : f8.f14778c;
        }
        return j7Var;
    }

    public j7 k() throws IOException {
        j7 j7VarRemoveFirst;
        synchronized (this) {
            this.i.f();
            while (this.e.isEmpty() && this.k == null) {
                try {
                    m();
                } catch (Throwable th) {
                    this.i.i();
                    throw th;
                }
            }
            this.i.i();
            if (this.e.isEmpty()) {
                IOException iOException = this.l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new da(this.k);
            }
            j7VarRemoveFirst = this.e.removeFirst();
        }
        return j7VarRemoveFirst;
    }

    public ac j() {
        return this.i;
    }

    public boolean i() {
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            b bVar = this.g;
            if (bVar.f || bVar.e) {
                a aVar = this.h;
                if ((aVar.d || aVar.f15639c) && this.f) {
                    return false;
                }
            }
            return true;
        }
    }

    public boolean h() {
        return this.d.f15513a == ((this.f15636c & 1) == 1);
    }

    public zb g() {
        return this.g;
    }

    public yb f() {
        synchronized (this) {
            if (!this.f && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    public int e() {
        return this.f15636c;
    }

    public r9 d() {
        r9 r9Var;
        synchronized (this) {
            r9Var = this.k;
        }
        return r9Var;
    }

    public v9 c() {
        return this.d;
    }

    public void b(r9 r9Var) {
        synchronized (this) {
            if (this.k == null) {
                this.k = r9Var;
                notifyAll();
            }
        }
    }

    public final class b implements zb {
        public static final /* synthetic */ boolean h = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bb f15640a = new bb();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bb f15641b = new bb();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f15642c;
        public j7 d;
        public boolean e;
        public boolean f;

        @Override // com.huawei.hms.network.embedded.zb, com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return y9.this.i;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x009e  */
        /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x00a4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
        @Override // com.huawei.hms.network.embedded.zb
        public long read(bb bbVar, long j) throws Throwable {
            Throwable daVar;
            long j2;
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            while (true) {
                synchronized (y9.this) {
                    y9.this.i.f();
                    try {
                        if (y9.this.k != null) {
                            daVar = y9.this.l != null ? y9.this.l : new da(y9.this.k);
                        } else {
                            daVar = null;
                        }
                        if (this.e) {
                            throw new IOException("stream closed");
                        }
                        if (this.f15641b.B() > 0) {
                            bb bbVar2 = this.f15641b;
                            j2 = bbVar2.read(bbVar, Math.min(j, bbVar2.B()));
                            y9.this.f15634a += j2;
                            if (daVar != null || y9.this.f15634a < y9.this.d.t.c() / 2) {
                                break;
                                break;
                            }
                            y9.this.d.a(y9.this.f15636c, y9.this.f15634a);
                            y9.this.f15634a = 0L;
                            break;
                        }
                        if (this.f || daVar != null) {
                            j2 = -1;
                            break;
                        }
                        y9.this.m();
                        y9.this.i.i();
                    } catch (Throwable th) {
                        y9.this.i.i();
                        throw th;
                    }
                }
                if (j2 != -1) {
                    a(j2);
                    return j2;
                }
                if (daVar == null) {
                    return -1L;
                }
                throw daVar;
            }
            y9.this.i.i();
            if (j2 != -1) {
                a(j2);
                return j2;
            }
            if (daVar == null) {
                return -1L;
            }
            throw daVar;
        }

        @Override // com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
        public void close() throws IOException {
            long jB;
            synchronized (y9.this) {
                this.e = true;
                jB = this.f15641b.B();
                this.f15641b.s();
                y9.this.notifyAll();
            }
            if (jB > 0) {
                a(jB);
            }
            y9.this.a();
        }

        public void a(db dbVar, long j) throws IOException {
            boolean z;
            boolean z2;
            long jB;
            if (!h && Thread.holdsLock(y9.this)) {
                throw new AssertionError();
            }
            while (j > 0) {
                synchronized (y9.this) {
                    z = this.f;
                    z2 = this.f15641b.B() + j > this.f15642c;
                }
                if (z2) {
                    dbVar.skip(j);
                    y9.this.a(r9.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    dbVar.skip(j);
                    return;
                }
                long j2 = dbVar.read(this.f15640a, j);
                if (j2 == -1) {
                    throw new EOFException();
                }
                j -= j2;
                synchronized (y9.this) {
                    if (this.e) {
                        jB = this.f15640a.B();
                        this.f15640a.s();
                    } else {
                        boolean z3 = this.f15641b.B() == 0;
                        this.f15641b.a((zb) this.f15640a);
                        if (z3) {
                            y9.this.notifyAll();
                        }
                        jB = 0;
                    }
                }
                if (jB > 0) {
                    a(jB);
                }
            }
        }

        private void a(long j) {
            if (!h && Thread.holdsLock(y9.this)) {
                throw new AssertionError();
            }
            y9.this.d.k(j);
        }

        public b(long j) {
            this.f15642c = j;
        }
    }

    public void b() throws IOException {
        a aVar = this.h;
        if (aVar.f15639c) {
            throw new IOException("stream closed");
        }
        if (aVar.d) {
            throw new IOException("stream finished");
        }
        r9 r9Var = this.k;
        if (r9Var != null) {
            IOException iOException = this.l;
            if (iOException == null) {
                throw new da(r9Var);
            }
        }
    }

    public void a(List<s9> list, boolean z, boolean z2) throws IOException {
        if (!m && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (list == null) {
            throw new NullPointerException("headers == null");
        }
        synchronized (this) {
            this.f = true;
            if (z) {
                this.h.d = true;
            }
        }
        if (!z2) {
            synchronized (this.d) {
                z2 = this.d.s == 0;
            }
        }
        this.d.a(this.f15636c, z, list);
        if (z2) {
            this.d.flush();
        }
    }

    public void a(r9 r9Var, @Nullable IOException iOException) throws IOException {
        if (b(r9Var, iOException)) {
            this.d.b(this.f15636c, r9Var);
        }
    }

    public final class a implements yb {
        public static final long f = 16384;
        public static final /* synthetic */ boolean g = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bb f15637a = new bb();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j7 f15638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15639c;
        public boolean d;

        @Override // com.huawei.hms.network.embedded.yb
        public void write(bb bbVar, long j) throws IOException {
            if (!g && Thread.holdsLock(y9.this)) {
                throw new AssertionError();
            }
            this.f15637a.write(bbVar, j);
            while (this.f15637a.B() >= 16384) {
                a(false);
            }
        }

        @Override // com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return y9.this.j;
        }

        @Override // com.huawei.hms.network.embedded.yb, java.io.Flushable
        public void flush() throws IOException {
            if (!g && Thread.holdsLock(y9.this)) {
                throw new AssertionError();
            }
            synchronized (y9.this) {
                y9.this.b();
            }
            while (this.f15637a.B() > 0) {
                a(false);
                y9.this.d.flush();
            }
        }

        @Override // com.huawei.hms.network.embedded.yb, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            if (!g && Thread.holdsLock(y9.this)) {
                throw new AssertionError();
            }
            synchronized (y9.this) {
                if (this.f15639c) {
                    return;
                }
                if (!y9.this.h.d) {
                    boolean z = this.f15637a.B() > 0;
                    if (this.f15638b != null) {
                        while (this.f15637a.B() > 0) {
                            a(false);
                        }
                        y9 y9Var = y9.this;
                        y9Var.d.a(y9Var.f15636c, true, f8.a(this.f15638b));
                    } else if (z) {
                        while (this.f15637a.B() > 0) {
                            a(true);
                        }
                    } else {
                        y9 y9Var2 = y9.this;
                        y9Var2.d.a(y9Var2.f15636c, true, (bb) null, 0L);
                    }
                }
                synchronized (y9.this) {
                    this.f15639c = true;
                }
                y9.this.d.flush();
                y9.this.a();
            }
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0061  */
        private void a(boolean z) throws IOException {
            long jMin;
            boolean z2;
            synchronized (y9.this) {
                y9.this.j.f();
                while (y9.this.f15635b <= 0 && !this.d && !this.f15639c && y9.this.k == null) {
                    try {
                        y9.this.m();
                    } catch (Throwable th) {
                        y9.this.j.i();
                        throw th;
                    }
                }
                y9.this.j.i();
                y9.this.b();
                jMin = Math.min(y9.this.f15635b, this.f15637a.B());
                y9.this.f15635b -= jMin;
            }
            y9.this.j.f();
            if (z) {
                try {
                    if (jMin == this.f15637a.B()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } finally {
                    y9.this.j.i();
                }
            } else {
                z2 = false;
            }
            y9.this.d.a(y9.this.f15636c, z2, this.f15637a, jMin);
        }

        public a() {
        }
    }

    public void a(r9 r9Var) {
        if (b(r9Var, null)) {
            this.d.c(this.f15636c, r9Var);
        }
    }

    public void a(j7 j7Var, boolean z) {
        boolean zI;
        if (!m && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.f && z) {
                this.g.d = j7Var;
            } else {
                this.f = true;
                this.e.add(j7Var);
            }
            if (z) {
                this.g.f = true;
            }
            zI = i();
            notifyAll();
        }
        if (zI) {
            return;
        }
        this.d.f(this.f15636c);
    }

    public void a(j7 j7Var) {
        synchronized (this) {
            if (this.h.d) {
                throw new IllegalStateException("already finished");
            }
            if (j7Var.d() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0");
            }
            this.h.f15638b = j7Var;
        }
    }

    public void a(db dbVar, int i) throws IOException {
        if (!m && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.g.a(dbVar, i);
    }

    public class c extends za {
        @Override // com.huawei.hms.network.embedded.za
        public void timedOut() {
            y9.this.a(r9.CANCEL);
            y9.this.d.v();
        }

        @Override // com.huawei.hms.network.embedded.za
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void i() throws IOException {
            if (g()) {
                throw newTimeoutException(null);
            }
        }

        public c() {
        }
    }

    public void a(long j) {
        this.f15635b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public void a() throws IOException {
        boolean z;
        boolean zI;
        if (!m && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            z = !this.g.f && this.g.e && (this.h.d || this.h.f15639c);
            zI = i();
        }
        if (z) {
            a(r9.CANCEL, (IOException) null);
        } else {
            if (zI) {
                return;
            }
            this.d.f(this.f15636c);
        }
    }

    private boolean b(r9 r9Var, @Nullable IOException iOException) {
        if (!m && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.k == null && (!this.g.f || !this.h.d)) {
                this.k = r9Var;
                this.l = iOException;
                notifyAll();
                this.d.f(this.f15636c);
                return true;
            }
            return false;
        }
    }

    public y9(int i, v9 v9Var, boolean z, boolean z2, @Nullable j7 j7Var) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.i = new c();
        this.j = new c();
        if (v9Var == null) {
            throw new NullPointerException("connection == null");
        }
        this.f15636c = i;
        this.d = v9Var;
        this.f15635b = v9Var.u.c();
        b bVar = new b(v9Var.t.c());
        this.g = bVar;
        a aVar = new a();
        this.h = aVar;
        bVar.f = z2;
        aVar.d = z;
        if (j7Var != null) {
            arrayDeque.add(j7Var);
        }
        if (h() && j7Var != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!h() && j7Var == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }
}
