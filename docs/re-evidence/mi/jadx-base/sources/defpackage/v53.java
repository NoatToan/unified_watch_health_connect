package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class v53 implements jpf, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f36488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36489b;
    public final long c = System.identityHashCode(this);

    public v53(int i) {
        this.f36488a = ByteBuffer.allocateDirect(i);
        this.f36489b = i;
    }

    public final void a(int i, jpf jpfVar, int i2, int i3) {
        if (!(jpfVar instanceof v53)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        b6i.i(!isClosed());
        b6i.i(!jpfVar.isClosed());
        kpf.b(i, jpfVar.getSize(), i2, i3, this.f36489b);
        this.f36488a.position(i);
        jpfVar.p().position(i2);
        byte[] bArr = new byte[i3];
        this.f36488a.get(bArr, 0, i3);
        jpfVar.p().put(bArr, 0, i3);
    }

    @Override // defpackage.jpf, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f36488a = null;
    }

    @Override // defpackage.jpf
    public int getSize() {
        return this.f36489b;
    }

    @Override // defpackage.jpf
    public synchronized int i(int i, byte[] bArr, int i2, int i3) {
        int iA;
        b6i.g(bArr);
        b6i.i(!isClosed());
        iA = kpf.a(i, i3, this.f36489b);
        kpf.b(i, bArr.length, i2, iA, this.f36489b);
        this.f36488a.position(i);
        this.f36488a.get(bArr, i2, iA);
        return iA;
    }

    @Override // defpackage.jpf
    public synchronized boolean isClosed() {
        return this.f36488a == null;
    }

    @Override // defpackage.jpf
    public synchronized byte k(int i) {
        b6i.i(!isClosed());
        b6i.b(i >= 0);
        b6i.b(i < this.f36489b);
        return this.f36488a.get(i);
    }

    @Override // defpackage.jpf
    public long l() {
        return this.c;
    }

    @Override // defpackage.jpf
    public synchronized int m(int i, byte[] bArr, int i2, int i3) {
        int iA;
        b6i.g(bArr);
        b6i.i(!isClosed());
        iA = kpf.a(i, i3, this.f36489b);
        kpf.b(i, bArr.length, i2, iA, this.f36489b);
        this.f36488a.position(i);
        this.f36488a.put(bArr, i2, iA);
        return iA;
    }

    @Override // defpackage.jpf
    public void n(int i, jpf jpfVar, int i2, int i3) {
        b6i.g(jpfVar);
        if (jpfVar.l() == l()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Copying from BufferMemoryChunk ");
            sb.append(Long.toHexString(l()));
            sb.append(" to BufferMemoryChunk ");
            sb.append(Long.toHexString(jpfVar.l()));
            sb.append(" which are the same ");
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
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // defpackage.jpf
    public synchronized ByteBuffer p() {
        return this.f36488a;
    }
}
