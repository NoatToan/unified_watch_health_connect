package com.huawei.hms.network.embedded;

import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15308a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15310c;
    public boolean d;

    @Nullable
    public yb g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bb f15309b = new bb();
    public final yb e = new a();
    public final zb f = new b();

    public final class a implements yb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sb f15311a = new sb();

        @Override // com.huawei.hms.network.embedded.yb
        public void write(bb bbVar, long j) throws IOException {
            yb ybVar;
            synchronized (rb.this.f15309b) {
                if (!rb.this.f15310c) {
                    while (true) {
                        if (j <= 0) {
                            ybVar = null;
                            break;
                        }
                        if (rb.this.g != null) {
                            ybVar = rb.this.g;
                            break;
                        }
                        if (rb.this.d) {
                            throw new IOException("source is closed");
                        }
                        long jB = rb.this.f15308a - rb.this.f15309b.B();
                        if (jB == 0) {
                            this.f15311a.a(rb.this.f15309b);
                        } else {
                            long jMin = Math.min(jB, j);
                            rb.this.f15309b.write(bbVar, jMin);
                            j -= jMin;
                            rb.this.f15309b.notifyAll();
                        }
                    }
                } else {
                    throw new IllegalStateException("closed");
                }
            }
            if (ybVar != null) {
                this.f15311a.a(ybVar.timeout());
                try {
                    ybVar.write(bbVar, j);
                } finally {
                    this.f15311a.f();
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return this.f15311a;
        }

        @Override // com.huawei.hms.network.embedded.yb, java.io.Flushable
        public void flush() throws IOException {
            yb ybVar;
            synchronized (rb.this.f15309b) {
                if (rb.this.f15310c) {
                    throw new IllegalStateException("closed");
                }
                if (rb.this.g != null) {
                    ybVar = rb.this.g;
                } else {
                    if (rb.this.d && rb.this.f15309b.B() > 0) {
                        throw new IOException("source is closed");
                    }
                    ybVar = null;
                }
            }
            if (ybVar != null) {
                this.f15311a.a(ybVar.timeout());
                try {
                    ybVar.flush();
                } finally {
                    this.f15311a.f();
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.yb, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            yb ybVar;
            synchronized (rb.this.f15309b) {
                if (rb.this.f15310c) {
                    return;
                }
                if (rb.this.g != null) {
                    ybVar = rb.this.g;
                } else {
                    if (rb.this.d && rb.this.f15309b.B() > 0) {
                        throw new IOException("source is closed");
                    }
                    rb.this.f15310c = true;
                    rb.this.f15309b.notifyAll();
                    ybVar = null;
                }
                if (ybVar != null) {
                    this.f15311a.a(ybVar.timeout());
                    try {
                        ybVar.close();
                    } finally {
                        this.f15311a.f();
                    }
                }
            }
        }

        public a() {
        }
    }

    public final class b implements zb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ac f15313a = new ac();

        @Override // com.huawei.hms.network.embedded.zb, com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return this.f15313a;
        }

        @Override // com.huawei.hms.network.embedded.zb
        public long read(bb bbVar, long j) throws IOException {
            synchronized (rb.this.f15309b) {
                if (rb.this.d) {
                    throw new IllegalStateException("closed");
                }
                while (rb.this.f15309b.B() == 0) {
                    if (rb.this.f15310c) {
                        return -1L;
                    }
                    this.f15313a.a(rb.this.f15309b);
                }
                long j2 = rb.this.f15309b.read(bbVar, j);
                rb.this.f15309b.notifyAll();
                return j2;
            }
        }

        @Override // com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
        public void close() throws IOException {
            synchronized (rb.this.f15309b) {
                rb.this.d = true;
                rb.this.f15309b.notifyAll();
            }
        }

        public b() {
        }
    }

    public final zb b() {
        return this.f;
    }

    public void a(yb ybVar) throws IOException {
        boolean z;
        bb bbVar;
        while (true) {
            synchronized (this.f15309b) {
                if (this.g != null) {
                    throw new IllegalStateException("sink already folded");
                }
                if (this.f15309b.i()) {
                    this.d = true;
                    this.g = ybVar;
                    return;
                } else {
                    z = this.f15310c;
                    bbVar = new bb();
                    bb bbVar2 = this.f15309b;
                    bbVar.write(bbVar2, bbVar2.f14653b);
                    this.f15309b.notifyAll();
                }
            }
            try {
                ybVar.write(bbVar, bbVar.f14653b);
                if (z) {
                    ybVar.close();
                } else {
                    ybVar.flush();
                }
            } catch (Throwable th) {
                synchronized (this.f15309b) {
                    this.d = true;
                    this.f15309b.notifyAll();
                    throw th;
                }
            }
        }
    }

    public final yb a() {
        return this.e;
    }

    public rb(long j) {
        if (j >= 1) {
            this.f15308a = j;
        } else {
            throw new IllegalArgumentException("maxBufferSize < 1: " + j);
        }
    }
}
