package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes3.dex */
public class BoundedReader extends Reader {
    private static final int INVALID = -1;
    private int charsRead = 0;
    private int markedAt = -1;
    private final int maxCharsFromTargetReader;
    private int readAheadLimit;
    private final Reader target;

    public BoundedReader(Reader reader, int i14) {
        this.target = reader;
        this.maxCharsFromTargetReader = i14;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.target.close();
    }

    @Override // java.io.Reader
    public void mark(int i14) throws IOException {
        int i15 = this.charsRead;
        this.readAheadLimit = i14 - i15;
        this.markedAt = i15;
        this.target.mark(i14);
    }

    @Override // java.io.Reader
    public int read() {
        int i14 = this.charsRead;
        if (i14 >= this.maxCharsFromTargetReader) {
            return -1;
        }
        int i15 = this.markedAt;
        if (i15 >= 0 && i14 - i15 >= this.readAheadLimit) {
            return -1;
        }
        this.charsRead = i14 + 1;
        return this.target.read();
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        this.charsRead = this.markedAt;
        this.target.reset();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i14, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = read();
            if (i17 == -1) {
                if (i16 == 0) {
                    return -1;
                }
                return i16;
            }
            cArr[i14 + i16] = (char) i17;
        }
        return i15;
    }
}
