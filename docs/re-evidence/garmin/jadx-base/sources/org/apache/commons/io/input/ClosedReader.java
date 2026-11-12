package org.apache.commons.io.input;

import java.io.Reader;

/* JADX INFO: loaded from: classes3.dex */
public class ClosedReader extends Reader {
    public static final ClosedReader CLOSED_READER = new ClosedReader();

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i14, int i15) {
        return -1;
    }
}
