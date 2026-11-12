package com.danikula.videocache;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.ByteArrayInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ByteArrayCache implements Cache {
    private volatile byte[] a;
    private volatile boolean b;

    public ByteArrayCache() {
        this(new byte[0]);
    }

    @Override // com.danikula.videocache.Cache
    public void append(byte[] bArr, int i) throws ProxyCacheException {
        Preconditions.checkNotNull(this.a);
        Preconditions.a(i >= 0 && i <= bArr.length);
        byte[] bArrCopyOf = Arrays.copyOf(this.a, this.a.length + i);
        System.arraycopy(bArr, 0, bArrCopyOf, this.a.length, i);
        this.a = bArrCopyOf;
    }

    @Override // com.danikula.videocache.Cache
    public long available() throws ProxyCacheException {
        return this.a.length;
    }

    @Override // com.danikula.videocache.Cache
    public void close() throws ProxyCacheException {
    }

    @Override // com.danikula.videocache.Cache
    public void complete() {
        this.b = true;
    }

    @Override // com.danikula.videocache.Cache
    public boolean isCompleted() {
        return this.b;
    }

    @Override // com.danikula.videocache.Cache
    public int read(byte[] bArr, long j, int i) throws ProxyCacheException {
        if (j >= this.a.length) {
            return -1;
        }
        if (j <= ParserMinimalBase.MAX_INT_L) {
            return new ByteArrayInputStream(this.a).read(bArr, (int) j, i);
        }
        throw new IllegalArgumentException("Too long offset for memory cache " + j);
    }

    public ByteArrayCache(byte[] bArr) {
        this.a = (byte[]) Preconditions.checkNotNull(bArr);
    }
}
