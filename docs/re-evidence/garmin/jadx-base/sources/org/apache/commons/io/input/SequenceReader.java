package org.apache.commons.io.input;

import ds.e0;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
public class SequenceReader extends Reader {
    private Reader reader;
    private Iterator<? extends Reader> readers;

    public SequenceReader(Iterable<? extends Reader> iterable) {
        Objects.requireNonNull(iterable, "readers");
        this.readers = iterable.iterator();
        this.reader = nextReader();
    }

    private Reader nextReader() {
        if (this.readers.hasNext()) {
            return this.readers.next();
        }
        return null;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.readers = null;
        this.reader = null;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i14, int i15) throws IOException {
        Objects.requireNonNull(cArr, "cbuf");
        if (i15 < 0 || i14 < 0 || i14 + i15 > cArr.length) {
            StringBuilder sb3 = new StringBuilder("Array Size=");
            e0.m(cArr.length, i14, ", offset=", ", length=", sb3);
            l2.j(i15, sb3);
            return 0;
        }
        int i16 = 0;
        while (true) {
            Reader reader = this.reader;
            if (reader == null) {
                break;
            }
            int i17 = reader.read(cArr, i14, i15);
            if (i17 == -1) {
                this.reader = nextReader();
            } else {
                i16 += i17;
                i14 += i17;
                i15 -= i17;
                if (i15 <= 0) {
                    break;
                }
            }
        }
        if (i16 > 0) {
            return i16;
        }
        return -1;
    }

    public SequenceReader(Reader... readerArr) {
        this(Arrays.asList(readerArr));
    }

    @Override // java.io.Reader
    public int read() {
        int i14 = -1;
        while (true) {
            Reader reader = this.reader;
            if (reader == null || (i14 = reader.read()) != -1) {
                break;
            }
            this.reader = nextReader();
        }
        return i14;
    }
}
