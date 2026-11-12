package com.danikula.videocache;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ByteArraySource implements Source {
    private final byte[] a;
    private ByteArrayInputStream b;

    public ByteArraySource(byte[] bArr) {
        this.a = bArr;
    }

    @Override // com.danikula.videocache.Source
    public void close() throws ProxyCacheException {
    }

    @Override // com.danikula.videocache.Source
    public long length() throws ProxyCacheException {
        return this.a.length;
    }

    @Override // com.danikula.videocache.Source
    public void open(long j) throws ProxyCacheException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.a);
        this.b = byteArrayInputStream;
        byteArrayInputStream.skip(j);
    }

    @Override // com.danikula.videocache.Source
    public int read(byte[] bArr) throws ProxyCacheException {
        return this.b.read(bArr, 0, bArr.length);
    }
}
