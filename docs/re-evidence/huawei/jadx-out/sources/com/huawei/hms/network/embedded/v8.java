package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9 f15506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6 f15507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g7 f15508c;
    public final w8 d;
    public final g9 e;
    public boolean f;

    public void m() {
        a(-1L, true, true, null);
    }

    public j7 l() throws IOException {
        return this.e.b();
    }

    public void k() {
        this.f15506a.timeoutEarlyExit();
    }

    public void j() {
        this.f15508c.responseHeadersStart(this.f15507b);
    }

    public void i() {
        this.f15506a.exchangeMessageDone(this, true, false, null);
    }

    public void h() {
        this.e.a().h();
    }

    public ua.f g() throws SocketException {
        this.f15506a.timeoutEarlyExit();
        return this.e.a().a(this);
    }

    public boolean f() {
        return this.f;
    }

    public void e() throws IOException {
        try {
            this.e.d();
        } catch (IOException e) {
            this.f15508c.requestFailed(this.f15507b, e);
            a(e);
            throw e;
        }
    }

    public void d() throws IOException {
        try {
            this.e.c();
        } catch (IOException e) {
            this.f15508c.requestFailed(this.f15507b, e);
            a(e);
            throw e;
        }
    }

    public void c() {
        this.e.cancel();
        this.f15506a.exchangeMessageDone(this, true, true, null);
    }

    public void b(v7 v7Var) {
        this.f15508c.responseHeadersEnd(this.f15507b, v7Var);
    }

    public y8 b() {
        return this.e.a();
    }

    public void a(IOException iOException) {
        this.d.e();
        this.e.a().a(iOException);
    }

    public void a(t7 t7Var) throws IOException {
        try {
            this.f15508c.requestHeadersStart(this.f15507b);
            this.e.a(t7Var);
            this.f15508c.requestHeadersEnd(this.f15507b, t7Var);
        } catch (IOException e) {
            this.f15508c.requestFailed(this.f15507b, e);
            a(e);
            throw e;
        }
    }

    public final class a extends gb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15510c;
        public long d;
        public boolean e;

        @Override // com.huawei.hms.network.embedded.gb, com.huawei.hms.network.embedded.yb
        public void write(bb bbVar, long j) throws IOException {
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f15510c;
            if (j2 == -1 || this.d + j <= j2) {
                try {
                    super.write(bbVar, j);
                    this.d += j;
                    return;
                } catch (IOException e) {
                    throw a(e);
                }
            }
            throw new ProtocolException("expected " + this.f15510c + " bytes but received " + (this.d + j));
        }

        @Override // com.huawei.hms.network.embedded.gb, com.huawei.hms.network.embedded.yb, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // com.huawei.hms.network.embedded.gb, com.huawei.hms.network.embedded.yb, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            if (this.e) {
                return;
            }
            this.e = true;
            long j = this.f15510c;
            if (j != -1 && this.d != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Nullable
        private IOException a(@Nullable IOException iOException) {
            if (this.f15509b) {
                return iOException;
            }
            this.f15509b = true;
            return v8.this.a(this.d, false, true, iOException);
        }

        public a(yb ybVar, long j) {
            super(ybVar);
            this.f15510c = j;
        }
    }

    public void a() {
        this.e.cancel();
    }

    public final class b extends hb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15512c;
        public boolean d;
        public boolean e;

        @Override // com.huawei.hms.network.embedded.hb, com.huawei.hms.network.embedded.zb
        public long read(bb bbVar, long j) throws IOException {
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            try {
                long j2 = b().read(bbVar, j);
                if (j2 == -1) {
                    a(null);
                    return -1L;
                }
                long j3 = this.f15512c + j2;
                long j4 = this.f15511b;
                if (j4 != -1 && j3 > j4) {
                    throw new ProtocolException("expected " + this.f15511b + " bytes but received " + j3);
                }
                this.f15512c = j3;
                if (j3 == j4) {
                    a(null);
                }
                return j2;
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // com.huawei.hms.network.embedded.hb, com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
        public void close() throws IOException {
            if (this.e) {
                return;
            }
            this.e = true;
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Nullable
        public IOException a(@Nullable IOException iOException) {
            if (this.d) {
                return iOException;
            }
            this.d = true;
            return v8.this.a(this.f15512c, true, false, iOException);
        }

        public b(zb zbVar, long j) {
            super(zbVar);
            this.f15511b = j;
            if (j == 0) {
                a(null);
            }
        }
    }

    @Nullable
    public IOException a(long j, boolean z, boolean z2, @Nullable IOException iOException) {
        if (iOException != null) {
            a(iOException);
        }
        if (z2) {
            g7 g7Var = this.f15508c;
            t6 t6Var = this.f15507b;
            if (iOException != null) {
                g7Var.requestFailed(t6Var, iOException);
            } else {
                g7Var.requestBodyEnd(t6Var, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f15508c.responseFailed(this.f15507b, iOException);
            } else {
                this.f15508c.responseBodyEnd(this.f15507b, j);
            }
        }
        return this.f15506a.exchangeMessageDone(this, z2, z, iOException);
    }

    public yb a(t7 t7Var, boolean z) throws IOException {
        this.f = z;
        long jContentLength = t7Var.b().contentLength();
        this.f15508c.requestBodyStart(this.f15507b);
        return new a(this.e.a(t7Var, jContentLength), jContentLength);
    }

    public w7 a(v7 v7Var) throws IOException {
        try {
            this.f15508c.responseBodyStart(this.f15507b);
            String strB = v7Var.b("Content-Type");
            long jA = this.e.a(v7Var);
            return new l9(strB, jA, ob.a(new b(this.e.b(v7Var), jA)));
        } catch (IOException e) {
            this.f15508c.responseFailed(this.f15507b, e);
            a(e);
            throw e;
        }
    }

    @Nullable
    public v7.a a(boolean z) throws IOException {
        try {
            v7.a aVarA = this.e.a(z);
            if (aVarA != null) {
                c8.f14676a.a(aVarA, this);
            }
            return aVarA;
        } catch (IOException e) {
            this.f15508c.responseFailed(this.f15507b, e);
            a(e);
            throw e;
        }
    }

    public v8(d9 d9Var, t6 t6Var, g7 g7Var, w8 w8Var, g9 g9Var) {
        this.f15506a = d9Var;
        this.f15507b = t6Var;
        this.f15508c = g7Var;
        this.d = w8Var;
        this.e = g9Var;
    }
}
