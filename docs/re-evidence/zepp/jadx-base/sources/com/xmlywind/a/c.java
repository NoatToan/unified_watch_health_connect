package com.xmlywind.a;

import java.io.InputStream;

/* JADX INFO: loaded from: classes22.dex */
public abstract class c extends InputStream {
    private byte[] a = new byte[1];
    private long b = 0;

    private void a(long j) {
        if (j != -1) {
            this.b += j;
        }
    }

    public long a() {
        return this.b;
    }

    public void a(int i) {
        a(i);
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.a, 0, 1) == -1) {
            return -1;
        }
        return this.a[0] & 255;
    }
}
