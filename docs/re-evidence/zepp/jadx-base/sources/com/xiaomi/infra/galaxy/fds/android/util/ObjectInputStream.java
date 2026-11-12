package com.xiaomi.infra.galaxy.fds.android.util;

import com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata;
import com.xiaomi.infra.galaxy.fds.android.model.ProgressListener;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes22.dex */
public class ObjectInputStream extends FilterInputStream {
    private final ProgressListener a;
    private final ObjectMetadata b;
    private long c;
    private long d;

    public ObjectInputStream(InputStream inputStream, ObjectMetadata objectMetadata, ProgressListener progressListener) {
        super(inputStream);
        this.b = objectMetadata;
        this.a = progressListener;
    }

    private void a(boolean z) {
        if (this.a != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!z || jCurrentTimeMillis - this.c >= this.a.progressInterval()) {
                this.c = jCurrentTimeMillis;
                this.a.onProgress(this.d, this.b.getContentLength());
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        a(false);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.d += (long) i3;
            a(true);
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.d = 0L;
        a(true);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.d++;
            a(true);
        }
        return i;
    }
}
