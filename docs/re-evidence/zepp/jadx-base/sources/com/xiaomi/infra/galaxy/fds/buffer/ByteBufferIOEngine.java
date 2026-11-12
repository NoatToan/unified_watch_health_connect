package com.xiaomi.infra.galaxy.fds.buffer;

import java.util.Objects;

/* JADX INFO: loaded from: classes22.dex */
public class ByteBufferIOEngine implements IOEngine {
    private ByteBufferArray a;
    private final long b;
    private final boolean c;

    public ByteBufferIOEngine(long j, boolean z) {
        this.b = j;
        this.c = z;
        this.a = new ByteBufferArray(j, z);
    }

    @Override // com.xiaomi.infra.galaxy.fds.buffer.IOEngine
    public int read(byte[] bArr, int i, int i2, long j) {
        int i3;
        Objects.requireNonNull(bArr);
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        return this.a.getMultiple(j, i2, bArr, i);
    }

    public String toString() {
        return "ByteBufferIOEngine{, capacity=" + this.b + ", direct=" + this.c + '}';
    }

    @Override // com.xiaomi.infra.galaxy.fds.buffer.IOEngine
    public void write(byte[] bArr, int i, int i2, long j) {
        int i3;
        Objects.requireNonNull(bArr);
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.a.putMultiple(j, i2, bArr, i);
    }
}
