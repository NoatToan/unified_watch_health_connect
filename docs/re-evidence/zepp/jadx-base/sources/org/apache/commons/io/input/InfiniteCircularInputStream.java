package org.apache.commons.io.input;

import java.io.InputStream;

/* JADX INFO: loaded from: classes23.dex */
public class InfiniteCircularInputStream extends InputStream {
    private final byte[] a;
    private int b = -1;

    public InfiniteCircularInputStream(byte[] bArr) {
        this.a = bArr;
    }

    @Override // java.io.InputStream
    public int read() {
        int i = this.b + 1;
        byte[] bArr = this.a;
        int length = i % bArr.length;
        this.b = length;
        return bArr[length] & 255;
    }
}
