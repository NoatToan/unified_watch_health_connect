package com.facebook.imagepipeline.memory;

import defpackage.b6i;
import defpackage.jpf;
import defpackage.kpf;
import defpackage.n5d;
import defpackage.w07;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@w07
public class NativeMemoryChunk implements jpf, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7119b;
    public boolean c;

    static {
        n5d.a();
    }

    public NativeMemoryChunk(int i) {
        b6i.b(i > 0);
        this.f7119b = i;
        this.f7118a = nativeAllocate(i);
        this.c = false;
    }

    private void a(int i, jpf jpfVar, int i2, int i3) {
        if (!(jpfVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        b6i.i(!isClosed());
        b6i.i(!jpfVar.isClosed());
        kpf.b(i, jpfVar.getSize(), i2, i3, this.f7119b);
        nativeMemcpy(jpfVar.o() + ((long) i2), this.f7118a + ((long) i), i3);
    }

    @w07
    private static native long nativeAllocate(int i);

    @w07
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @w07
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @w07
    private static native void nativeFree(long j);

    @w07
    private static native void nativeMemcpy(long j, long j2, int i);

    @w07
    private static native byte nativeReadByte(long j);

    @Override // defpackage.jpf, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.c) {
            this.c = true;
            nativeFree(this.f7118a);
        }
    }

    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("finalize: Chunk ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.jpf
    public int getSize() {
        return this.f7119b;
    }

    @Override // defpackage.jpf
    public synchronized int i(int i, byte[] bArr, int i2, int i3) {
        int iA;
        b6i.g(bArr);
        b6i.i(!isClosed());
        iA = kpf.a(i, i3, this.f7119b);
        kpf.b(i, bArr.length, i2, iA, this.f7119b);
        nativeCopyToByteArray(this.f7118a + ((long) i), bArr, i2, iA);
        return iA;
    }

    @Override // defpackage.jpf
    public synchronized boolean isClosed() {
        return this.c;
    }

    @Override // defpackage.jpf
    public synchronized byte k(int i) {
        b6i.i(!isClosed());
        b6i.b(i >= 0);
        b6i.b(i < this.f7119b);
        return nativeReadByte(this.f7118a + ((long) i));
    }

    @Override // defpackage.jpf
    public long l() {
        return this.f7118a;
    }

    @Override // defpackage.jpf
    public synchronized int m(int i, byte[] bArr, int i2, int i3) {
        int iA;
        b6i.g(bArr);
        b6i.i(!isClosed());
        iA = kpf.a(i, i3, this.f7119b);
        kpf.b(i, bArr.length, i2, iA, this.f7119b);
        nativeCopyFromByteArray(this.f7118a + ((long) i), bArr, i2, iA);
        return iA;
    }

    @Override // defpackage.jpf
    public void n(int i, jpf jpfVar, int i2, int i3) {
        b6i.g(jpfVar);
        if (jpfVar.l() == l()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Copying from NativeMemoryChunk ");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" to NativeMemoryChunk ");
            sb.append(Integer.toHexString(System.identityHashCode(jpfVar)));
            sb.append(" which share the same address ");
            sb.append(Long.toHexString(this.f7118a));
            b6i.b(false);
        }
        if (jpfVar.l() < l()) {
            synchronized (jpfVar) {
                synchronized (this) {
                    a(i, jpfVar, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (jpfVar) {
                    a(i, jpfVar, i2, i3);
                }
            }
        }
    }

    @Override // defpackage.jpf
    public long o() {
        return this.f7118a;
    }

    @Override // defpackage.jpf
    public ByteBuffer p() {
        return null;
    }

    public NativeMemoryChunk() {
        this.f7119b = 0;
        this.f7118a = 0L;
        this.c = true;
    }
}
