package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
final class MultiInputStream extends InputStream {

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private InputStream f53584in;
    private Iterator<? extends ByteSource> it;

    public MultiInputStream(Iterator<? extends ByteSource> it) {
        this.it = (Iterator) Preconditions.checkNotNull(it);
        advance();
    }

    private void advance() {
        close();
        if (this.it.hasNext()) {
            this.f53584in = this.it.next().openStream();
        }
    }

    @Override // java.io.InputStream
    public int available() {
        InputStream inputStream = this.f53584in;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.f53584in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f53584in = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) throws IOException {
        Preconditions.checkNotNull(bArr);
        while (true) {
            InputStream inputStream = this.f53584in;
            if (inputStream == null) {
                return -1;
            }
            int i16 = inputStream.read(bArr, i14, i15);
            if (i16 != -1) {
                return i16;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j8) throws IOException {
        InputStream inputStream = this.f53584in;
        if (inputStream == null || j8 <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j8);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f53584in.skip(j8 - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f53584in;
            if (inputStream == null) {
                return -1;
            }
            int i14 = inputStream.read();
            if (i14 != -1) {
                return i14;
            }
            advance();
        }
    }
}
