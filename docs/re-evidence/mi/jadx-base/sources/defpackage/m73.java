package defpackage;

import androidx.annotation.RequiresApi;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class m73 extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f25832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteOrder f25833b;

    public m73(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f25832a = outputStream;
        this.f25833b = byteOrder;
    }

    public void a(ByteOrder byteOrder) {
        this.f25833b = byteOrder;
    }

    public void b(int i) throws IOException {
        this.f25832a.write(i);
    }

    public void c(int i) throws IOException {
        ByteOrder byteOrder = this.f25833b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f25832a.write(i & 255);
            this.f25832a.write((i >>> 8) & 255);
            this.f25832a.write((i >>> 16) & 255);
            this.f25832a.write((i >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f25832a.write((i >>> 24) & 255);
            this.f25832a.write((i >>> 16) & 255);
            this.f25832a.write((i >>> 8) & 255);
            this.f25832a.write(i & 255);
        }
    }

    public void d(short s) throws IOException {
        ByteOrder byteOrder = this.f25833b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f25832a.write(s & 255);
            this.f25832a.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f25832a.write((s >>> 8) & 255);
            this.f25832a.write(s & 255);
        }
    }

    public void l(long j) throws IOException {
        c((int) j);
    }

    public void m(int i) throws IOException {
        d((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f25832a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f25832a.write(bArr, i, i2);
    }
}
