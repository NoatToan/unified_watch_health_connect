package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSourceInputStream extends InputStream {
    private final DataSource a;
    private final DataSpec b;
    private long f;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public DataSourceInputStream(DataSource dataSource, DataSpec dataSpec) {
        this.a = dataSource;
        this.b = dataSpec;
    }

    private void a() throws IOException {
        if (this.d) {
            return;
        }
        this.a.open(this.b);
        this.d = true;
    }

    public long bytesRead() {
        return this.f;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    public void open() throws IOException {
        a();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer) throws IOException {
        return read(buffer, 0, buffer.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer, int offset, int length) throws IOException {
        Assertions.checkState(!this.e);
        a();
        int i = this.a.read(buffer, offset, length);
        if (i == -1) {
            return -1;
        }
        this.f += (long) i;
        return i;
    }
}
