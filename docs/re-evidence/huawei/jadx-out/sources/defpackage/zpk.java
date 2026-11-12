package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes20.dex */
public class zpk extends OutputStream {
    private OutputStream d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f54438a = 0;
    private boolean e = false;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public zpk(OutputStream outputStream) {
        this.d = outputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.e) {
            throw new IllegalStateException("ZipEntryOutputStream is closed");
        }
        this.d.write(bArr, i, i2);
        this.f54438a += (long) i2;
    }

    public void b() throws IOException {
        this.e = true;
    }

    public long a() {
        return this.f54438a;
    }
}
