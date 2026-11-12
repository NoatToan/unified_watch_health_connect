package org.apache.commons.io;

import a73.o;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import n23.j;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
public class LineIterator implements Iterator<String>, Closeable {
    private final BufferedReader bufferedReader;
    private String cachedLine;
    private boolean finished = false;

    public LineIterator(Reader reader) {
        if (reader == null) {
            h.s("Reader must not be null");
            throw null;
        }
        if (reader instanceof BufferedReader) {
            this.bufferedReader = (BufferedReader) reader;
        } else {
            this.bufferedReader = new BufferedReader(reader);
        }
    }

    @Deprecated
    public static void closeQuietly(LineIterator lineIterator) {
        IOUtils.closeQuietly(lineIterator);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.finished = true;
        this.cachedLine = null;
        IOUtils.close(this.bufferedReader);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        String line;
        if (this.cachedLine != null) {
            return true;
        }
        if (this.finished) {
            return false;
        }
        do {
            try {
                line = this.bufferedReader.readLine();
                if (line == null) {
                    this.finished = true;
                    return false;
                }
            } catch (IOException e4) {
                IOUtils.closeQuietly(this, new o(e4, 5));
                l2.p(e4);
                return false;
            }
        } while (!isValidLine(line));
        this.cachedLine = line;
        return true;
    }

    public boolean isValidLine(String str) {
        return true;
    }

    public String nextLine() {
        if (!hasNext()) {
            j.s("No more lines");
            return null;
        }
        String str = this.cachedLine;
        this.cachedLine = null;
        return str;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Remove unsupported on LineIterator");
    }

    @Override // java.util.Iterator
    public String next() {
        return nextLine();
    }
}
