package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ChunkedWriter extends FilterWriter {
    private static final int DEFAULT_CHUNK_SIZE = 4096;
    private final int chunkSize;

    public ChunkedWriter(Writer writer, int i14) {
        super(writer);
        if (i14 > 0) {
            this.chunkSize = i14;
        } else {
            h.w();
            throw null;
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i14, int i15) throws IOException {
        while (i15 > 0) {
            int iMin = Math.min(i15, this.chunkSize);
            ((FilterWriter) this).out.write(cArr, i14, iMin);
            i15 -= iMin;
            i14 += iMin;
        }
    }

    public ChunkedWriter(Writer writer) {
        this(writer, 4096);
    }
}
