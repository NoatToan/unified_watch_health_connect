package qj;

import dj.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f144965c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f144966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f144967b;

    static {
        char[] cArr = m.f144982a;
        f144965c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f144966a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f144966a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i14) {
        this.f144966a.mark(i14);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f144966a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f144966a.read();
        } catch (IOException e4) {
            this.f144967b = e4;
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f144966a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j8) throws IOException {
        try {
            return this.f144966a.skip(j8);
        } catch (IOException e4) {
            this.f144967b = e4;
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f144966a.read(bArr);
        } catch (IOException e4) {
            this.f144967b = e4;
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i14, int i15) throws IOException {
        try {
            return this.f144966a.read(bArr, i14, i15);
        } catch (IOException e4) {
            this.f144967b = e4;
            throw e4;
        }
    }
}
