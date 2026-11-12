package defpackage;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class npf implements PooledByteBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w14<jpf> f28228b;

    public npf(w14<jpf> w14Var, int i) {
        b6i.g(w14Var);
        b6i.b(i >= 0 && i <= w14Var.n().getSize());
        this.f28228b = w14Var.clone();
        this.f28227a = i;
    }

    public synchronized void a() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        w14.l(this.f28228b);
        this.f28228b = null;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int i(int i, byte[] bArr, int i2, int i3) {
        a();
        b6i.b(i + i3 <= this.f28227a);
        return this.f28228b.n().i(i, bArr, i2, i3);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized boolean isClosed() {
        return !w14.y(this.f28228b);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized byte k(int i) {
        a();
        b6i.b(i >= 0);
        b6i.b(i < this.f28227a);
        return this.f28228b.n().k(i);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int size() {
        a();
        return this.f28227a;
    }
}
