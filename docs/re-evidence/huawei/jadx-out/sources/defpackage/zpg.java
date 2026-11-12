package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport;

/* JADX INFO: loaded from: classes20.dex */
public class zpg extends OutputStream implements OutputStreamWithSplitZipSupport {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OutputStream f54430b;
    private long e = 0;

    public zpg(OutputStream outputStream) {
        this.f54430b = outputStream;
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
        this.f54430b.write(bArr, i, i2);
        this.e += (long) i2;
    }

    @Override // net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport
    public int getCurrentSplitFileCounter() {
        if (e()) {
            return ((zpl) this.f54430b).getCurrentSplitFileCounter();
        }
        return 0;
    }

    public long d() throws IOException {
        OutputStream outputStream = this.f54430b;
        if (outputStream instanceof zpl) {
            return ((zpl) outputStream).getFilePointer();
        }
        return this.e;
    }

    public long c() {
        if (e()) {
            return ((zpl) this.f54430b).c();
        }
        return 0L;
    }

    public boolean e() {
        OutputStream outputStream = this.f54430b;
        return (outputStream instanceof zpl) && ((zpl) outputStream).e();
    }

    public long a() throws IOException {
        OutputStream outputStream = this.f54430b;
        if (outputStream instanceof zpl) {
            return ((zpl) outputStream).getFilePointer();
        }
        return this.e;
    }

    public boolean e(int i) throws ZipException {
        if (e()) {
            return ((zpl) this.f54430b).b(i);
        }
        return false;
    }

    @Override // net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport
    public long getFilePointer() throws IOException {
        OutputStream outputStream = this.f54430b;
        if (outputStream instanceof zpl) {
            return ((zpl) outputStream).getFilePointer();
        }
        return this.e;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f54430b.close();
    }
}
