package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes23.dex */
public class ChunkedOutputStream extends FilterOutputStream {
    private static final int b = 4096;
    private final int a;

    public ChunkedOutputStream(OutputStream outputStream, int i) {
        super(outputStream);
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.a = i;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int iMin = Math.min(i2, this.a);
            ((FilterOutputStream) this).out.write(bArr, i, iMin);
            i2 -= iMin;
            i += iMin;
        }
    }

    public ChunkedOutputStream(OutputStream outputStream) {
        this(outputStream, 4096);
    }
}
