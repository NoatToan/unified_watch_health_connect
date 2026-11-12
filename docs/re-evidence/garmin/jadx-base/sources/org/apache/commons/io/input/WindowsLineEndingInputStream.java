package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class WindowsLineEndingInputStream extends InputStream {
    private final boolean ensureLineFeedAtEndOfFile;
    private final InputStream target;
    private boolean slashRSeen = false;
    private boolean slashNSeen = false;
    private boolean injectSlashN = false;
    private boolean eofSeen = false;

    public WindowsLineEndingInputStream(InputStream inputStream, boolean z14) {
        this.target = inputStream;
        this.ensureLineFeedAtEndOfFile = z14;
    }

    private int eofGame() {
        if (!this.ensureLineFeedAtEndOfFile) {
            return -1;
        }
        boolean z14 = this.slashNSeen;
        if (!z14 && !this.slashRSeen) {
            this.slashRSeen = true;
            return 13;
        }
        if (z14) {
            return -1;
        }
        this.slashRSeen = false;
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
        this.slashRSeen = i14 == 13;
        this.slashNSeen = i14 == 10;
        return i14;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.target.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i14) {
        throw new UnsupportedOperationException("Mark not supported");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.eofSeen) {
            return eofGame();
        }
        if (this.injectSlashN) {
            this.injectSlashN = false;
            return 10;
        }
        boolean z14 = this.slashRSeen;
        int withUpdate = readWithUpdate();
        if (this.eofSeen) {
            return eofGame();
        }
        if (withUpdate != 10 || z14) {
            return withUpdate;
        }
        this.injectSlashN = true;
        return 13;
    }
}
