package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class a0a extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f469b;

    public a0a(OutputStream outputStream) {
        this.f468a = outputStream;
    }

    public void a(int i) throws IOException {
        b(i);
    }

    public void b(long j) throws IOException {
        write((byte) ((j >> 24) & 255));
        write((byte) ((j >> 16) & 255));
        write((byte) ((j >> 8) & 255));
        write((byte) (j & 255));
    }

    public void c(int i) throws IOException {
        write((byte) ((i >> 8) & 255));
        write((byte) (i & 255));
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        this.f468a.write(bArr, i, i2);
        this.f469b += (long) i2;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f468a.write(i);
        this.f469b++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
