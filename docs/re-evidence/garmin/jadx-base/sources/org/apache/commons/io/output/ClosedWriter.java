package org.apache.commons.io.output;

import am.j;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class ClosedWriter extends Writer {
    public static final ClosedWriter CLOSED_WRITER = new ClosedWriter();

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        throw new IOException("flush() failed: stream is closed");
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i14, int i15) throws IOException {
        StringBuilder sb3 = new StringBuilder("write(");
        sb3.append(new String(cArr));
        sb3.append(", ");
        sb3.append(i14);
        sb3.append(", ");
        throw new IOException(j.q(sb3, i15, ") failed: stream is closed"));
    }
}
