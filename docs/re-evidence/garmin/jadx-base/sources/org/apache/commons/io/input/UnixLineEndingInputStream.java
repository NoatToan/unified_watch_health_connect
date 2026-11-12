package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class UnixLineEndingInputStream extends InputStream {
    private final boolean ensureLineFeedAtEndOfFile;
    private final InputStream target;
    private boolean slashNSeen = false;
    private boolean slashRSeen = false;
    private boolean eofSeen = false;

    public UnixLineEndingInputStream(InputStream inputStream, boolean z14) {
        this.target = inputStream;
        this.ensureLineFeedAtEndOfFile = z14;
    }

    private int eofGame(boolean z14) {
        if (z14 || !this.ensureLineFeedAtEndOfFile || this.slashNSeen) {
            return -1;
        }
        this.slashNSeen = true;
        return 10;
    }

    private int readWithUpdate() throws IOException {
        int i14 = this.target.read();
        boolean z14 = i14 == -1;
        this.eofSeen = z14;
        if (z14) {
            return i14;
        }
        this.slashNSeen = i14 == 10;
        this.slashRSeen = i14 == 13;
        return i14;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.target.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i14) {
        throw new UnsupportedOperationException("Mark notsupported");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        boolean z14 = this.slashRSeen;
        if (this.eofSeen) {
            return eofGame(z14);
        }
        int withUpdate = readWithUpdate();
        if (this.eofSeen) {
            return eofGame(z14);
        }
        if (this.slashRSeen) {
            return 10;
        }
        return (z14 && this.slashNSeen) ? read() : withUpdate;
    }
}
