package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ChunkedOutputStream extends FilterOutputStream {
    private static final int DEFAULT_CHUNK_SIZE = 4096;
    private final int chunkSize;

    public ChunkedOutputStream(OutputStream outputStream, int i14) {
        super(outputStream);
        if (i14 > 0) {
            this.chunkSize = i14;
        } else {
            h.w();
            throw null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i14, int i15) throws IOException {
        while (i15 > 0) {
            int iMin = Math.min(i15, this.chunkSize);
            ((FilterOutputStream) this).out.write(bArr, i14, iMin);
            i15 -= iMin;
            i14 += iMin;
        }
    }

    public ChunkedOutputStream(OutputStream outputStream) {
        this(outputStream, 4096);
    }
}
