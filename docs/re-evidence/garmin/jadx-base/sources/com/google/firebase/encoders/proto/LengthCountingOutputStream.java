package com.google.firebase.encoders.proto;

import java.io.OutputStream;
import o2.c;

/* JADX INFO: loaded from: classes2.dex */
final class LengthCountingOutputStream extends OutputStream {
    private long length = 0;

    public long getLength() {
        return this.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i14, int i15) {
        int i16;
        if (i14 < 0 || i14 > bArr.length || i15 < 0 || (i16 = i14 + i15) > bArr.length || i16 < 0) {
            c.q();
        } else {
            this.length += (long) i15;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.length += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(int i14) {
        this.length++;
    }
}
