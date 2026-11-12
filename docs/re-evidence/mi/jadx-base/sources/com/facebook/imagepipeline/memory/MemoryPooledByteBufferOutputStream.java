package com.facebook.imagepipeline.memory;

import defpackage.b6i;
import defpackage.jpf;
import defpackage.npf;
import defpackage.p3i;
import defpackage.w14;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class MemoryPooledByteBufferOutputStream extends p3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f7116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w14<jpf> f7117b;
    public int c;

    public static class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    public MemoryPooledByteBufferOutputStream(b bVar) {
        this(bVar, bVar.B());
    }

    public final void b() {
        if (!w14.y(this.f7117b)) {
            throw new InvalidStreamException();
        }
    }

    public void c(int i) throws Throwable {
        b();
        if (i <= this.f7117b.n().getSize()) {
            return;
        }
        jpf jpfVar = this.f7116a.get(i);
        this.f7117b.n().n(0, jpfVar, 0, this.c);
        this.f7117b.close();
        this.f7117b = w14.K(jpfVar, this.f7116a);
    }

    @Override // defpackage.p3i, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        w14.l(this.f7117b);
        this.f7117b = null;
        this.c = -1;
        super.close();
    }

    @Override // defpackage.p3i
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public npf a() {
        b();
        return new npf(this.f7117b, this.c);
    }

    @Override // defpackage.p3i
    public int size() {
        return this.c;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public MemoryPooledByteBufferOutputStream(b bVar, int i) {
        b6i.b(i > 0);
        b bVar2 = (b) b6i.g(bVar);
        this.f7116a = bVar2;
        this.c = 0;
        this.f7117b = w14.K(bVar2.get(i), bVar2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws Throwable {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            b();
            c(this.c + i2);
            this.f7117b.n().m(this.c, bArr, i, i2);
            this.c += i2;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
    }
}
