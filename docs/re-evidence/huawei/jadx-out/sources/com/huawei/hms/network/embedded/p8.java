package com.huawei.hms.network.embedded;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes34.dex */
public final class p8 {
    public static final int k = 1;
    public static final int l = 2;
    public static final eb m = eb.d("OkHttp cache v1\n");
    public static final eb n = eb.d("OkHttp DIRTY :(\n");
    public static final long o = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RandomAccessFile f15191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f15192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zb f15193c;
    public long e;
    public boolean f;
    public final eb g;
    public final long i;
    public int j;
    public final bb d = new bb();
    public final bb h = new bb();

    public zb c() {
        synchronized (this) {
            if (this.f15191a == null) {
                return null;
            }
            this.j++;
            return new a();
        }
    }

    public eb b() {
        return this.g;
    }

    public boolean a() {
        return this.f15191a == null;
    }

    public void a(long j) throws IOException {
        b(j);
        this.f15191a.getChannel().force(false);
        a(m, j, this.g.j());
        this.f15191a.getChannel().force(false);
        synchronized (this) {
            this.f = true;
        }
        f8.a(this.f15193c);
        this.f15193c = null;
    }

    private void b(long j) throws IOException {
        bb bbVar = new bb();
        bbVar.a(this.g);
        new o8(this.f15191a.getChannel()).b(32 + j, bbVar, this.g.j());
    }

    public class a implements zb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ac f15194a = new ac();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o8 f15195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15196c;

        @Override // com.huawei.hms.network.embedded.zb, com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return this.f15194a;
        }

        @Override // com.huawei.hms.network.embedded.zb
        public long read(bb bbVar, long j) throws IOException {
            long j2;
            char c2;
            if (this.f15195b == null) {
                throw new IllegalStateException("closed");
            }
            synchronized (p8.this) {
                while (true) {
                    long j3 = this.f15196c;
                    j2 = p8.this.e;
                    long jMin = -1;
                    if (j3 != j2) {
                        long jB = j2 - p8.this.h.B();
                        long j4 = this.f15196c;
                        if (j4 < jB) {
                            c2 = 2;
                            break;
                        }
                        jMin = Math.min(j, j2 - j4);
                        p8.this.h.a(bbVar, this.f15196c - jB, jMin);
                        this.f15196c += jMin;
                        return jMin;
                    }
                    if (!p8.this.f) {
                        if (p8.this.f15192b == null) {
                            p8.this.f15192b = Thread.currentThread();
                            c2 = 1;
                            break;
                        }
                        this.f15194a.a(p8.this);
                    } else {
                        return jMin;
                    }
                }
                if (c2 == 2) {
                    long jMin2 = Math.min(j, j2 - this.f15196c);
                    this.f15195b.a(this.f15196c + 32, bbVar, jMin2);
                    this.f15196c += jMin2;
                    return jMin2;
                }
                try {
                    long j5 = p8.this.f15193c.read(p8.this.d, p8.this.i);
                    if (j5 == -1) {
                        p8.this.a(j2);
                        synchronized (p8.this) {
                            p8.this.f15192b = null;
                            p8.this.notifyAll();
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j5, j);
                    p8.this.d.a(bbVar, 0L, jMin3);
                    this.f15196c += jMin3;
                    this.f15195b.b(j2 + 32, p8.this.d.m1383clone(), j5);
                    synchronized (p8.this) {
                        p8.this.h.write(p8.this.d, j5);
                        if (p8.this.h.B() > p8.this.i) {
                            p8.this.h.skip(p8.this.h.B() - p8.this.i);
                        }
                        p8.this.e += j5;
                    }
                    synchronized (p8.this) {
                        p8.this.f15192b = null;
                        p8.this.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th) {
                    synchronized (p8.this) {
                        p8.this.f15192b = null;
                        p8.this.notifyAll();
                        throw th;
                    }
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
        public void close() throws IOException {
            if (this.f15195b == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.f15195b = null;
            synchronized (p8.this) {
                p8.this.j--;
                if (p8.this.j == 0) {
                    RandomAccessFile randomAccessFile2 = p8.this.f15191a;
                    p8.this.f15191a = null;
                    randomAccessFile = randomAccessFile2;
                }
            }
            if (randomAccessFile != null) {
                f8.a(randomAccessFile);
            }
        }

        public a() {
            this.f15195b = new o8(p8.this.f15191a.getChannel());
        }
    }

    private void a(eb ebVar, long j, long j2) throws IOException {
        bb bbVar = new bb();
        bbVar.a(ebVar);
        bbVar.writeLong(j);
        bbVar.writeLong(j2);
        if (bbVar.B() != 32) {
            throw new IllegalArgumentException();
        }
        new o8(this.f15191a.getChannel()).b(0L, bbVar, 32L);
    }

    public static p8 a(File file, zb zbVar, eb ebVar, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        p8 p8Var = new p8(randomAccessFile, zbVar, 0L, ebVar, j);
        randomAccessFile.setLength(0L);
        p8Var.a(n, -1L, -1L);
        return p8Var;
    }

    public static p8 a(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        o8 o8Var = new o8(randomAccessFile.getChannel());
        bb bbVar = new bb();
        o8Var.a(0L, bbVar, 32L);
        eb ebVar = m;
        if (!bbVar.d(ebVar.j()).equals(ebVar)) {
            throw new IOException("unreadable cache file");
        }
        long j = bbVar.readLong();
        long j2 = bbVar.readLong();
        bb bbVar2 = new bb();
        o8Var.a(j + 32, bbVar2, j2);
        return new p8(randomAccessFile, null, j, bbVar2.r(), 0L);
    }

    public p8(RandomAccessFile randomAccessFile, zb zbVar, long j, eb ebVar, long j2) {
        this.f15191a = randomAccessFile;
        this.f15193c = zbVar;
        this.f = zbVar == null;
        this.e = j;
        this.g = ebVar;
        this.i = j2;
    }
}
