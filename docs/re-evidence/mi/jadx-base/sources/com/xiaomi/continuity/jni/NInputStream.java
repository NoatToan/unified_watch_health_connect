package com.xiaomi.continuity.jni;

import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class NInputStream extends InputStream {
    private final NInputReader mNReader;

    public NInputStream(NInputReader nInputReader) {
        this.mNReader = nInputReader;
    }

    @Override // java.io.InputStream
    public int read() {
        return this.mNReader.read();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.mNReader.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.mNReader.read(bArr, i, i2);
    }
}
