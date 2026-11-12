package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes23.dex */
public class BoundedReader extends Reader {
    private static final int f = -1;
    private final Reader a;
    private int b = 0;
    private int c = -1;
    private int d;
    private final int e;

    public BoundedReader(Reader reader, int i) throws IOException {
        this.a = reader;
        this.e = i;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        int i2 = this.b;
        this.d = i - i2;
        this.c = i2;
        this.a.mark(i);
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        int i = this.b;
        if (i >= this.e) {
            return -1;
        }
        int i2 = this.c;
        if (i2 >= 0 && i - i2 >= this.d) {
            return -1;
        }
        this.b = i + 1;
        return this.a.read();
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        this.b = this.c;
        this.a.reset();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = read();
            if (i4 == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            cArr[i + i3] = (char) i4;
        }
        return i2;
    }
}
