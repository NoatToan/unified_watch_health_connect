package defpackage;

import androidx.annotation.GuardedBy;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public final class lf8 extends InputStream {

    @GuardedBy("POOL")
    public static final Queue<lf8> c = ulq.g(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f25003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f25004b;

    public static lf8 b(InputStream inputStream) {
        lf8 lf8VarPoll;
        Queue<lf8> queue = c;
        synchronized (queue) {
            lf8VarPoll = queue.poll();
        }
        if (lf8VarPoll == null) {
            lf8VarPoll = new lf8();
        }
        lf8VarPoll.d(inputStream);
        return lf8VarPoll;
    }

    public IOException a() {
        return this.f25004b;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f25003a.available();
    }

    public void c() {
        this.f25004b = null;
        this.f25003a = null;
        Queue<lf8> queue = c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f25003a.close();
    }

    public void d(InputStream inputStream) {
        this.f25003a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f25003a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f25003a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f25003a.read();
        } catch (IOException e) {
            this.f25004b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f25003a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.f25003a.skip(j);
        } catch (IOException e) {
            this.f25004b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f25003a.read(bArr);
        } catch (IOException e) {
            this.f25004b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f25003a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f25004b = e;
            throw e;
        }
    }
}
