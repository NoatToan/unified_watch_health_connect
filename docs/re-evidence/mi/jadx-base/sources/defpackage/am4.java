package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class am4 extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1205a;

    public am4(OutputStream outputStream) {
        super(outputStream);
        this.f1205a = 0L;
    }

    public long a() {
        return this.f1205a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f1205a += (long) i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.f1205a++;
    }
}
