package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import net.lingala.zip4j.exception.ZipException;

/* JADX INFO: loaded from: classes20.dex */
public class zqn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f54484a = new byte[2];
    private final byte[] d = new byte[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f54485b = new byte[8];

    public long e(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.readFully(this.f54485b);
        return e(this.f54485b, 0);
    }

    public long e(RandomAccessFile randomAccessFile, int i) throws IOException {
        c(this.f54485b);
        randomAccessFile.readFully(this.f54485b, 0, i);
        return e(this.f54485b, 0);
    }

    public long a(InputStream inputStream) throws IOException {
        byte[] bArr = this.f54485b;
        c(inputStream, bArr, bArr.length);
        return e(this.f54485b, 0);
    }

    public long d(InputStream inputStream, int i) throws IOException {
        c(this.f54485b);
        c(inputStream, this.f54485b, i);
        return e(this.f54485b, 0);
    }

    public long e(byte[] bArr, int i) {
        if (bArr.length - i < 8) {
            c(this.f54485b);
        }
        System.arraycopy(bArr, i, this.f54485b, 0, Math.min(bArr.length - i, 8));
        byte[] bArr2 = this.f54485b;
        long j = bArr2[7] & 255;
        long j2 = bArr2[6] & 255;
        long j3 = bArr2[5] & 255;
        long j4 = bArr2[4] & 255;
        long j5 = bArr2[3] & 255;
        return ((long) (bArr2[0] & 255)) | (((((((((((((j << 8) | j2) << 8) | j3) << 8) | j4) << 8) | j5) << 8) | (bArr2[2] & 255)) << 8) | ((long) (bArr2[1] & 255))) << 8);
    }

    public int b(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.readFully(this.d);
        return a(this.d);
    }

    public int d(InputStream inputStream) throws IOException {
        c(inputStream, this.d, 4);
        return a(this.d);
    }

    public int a(byte[] bArr) {
        return c(bArr, 0);
    }

    public int c(byte[] bArr, int i) {
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        return ((((bArr[i + 3] & 255) << 8) | (bArr[i + 2] & 255)) << 16) | (b2 & 255) | ((b3 & 255) << 8);
    }

    public int c(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.readFully(this.f54484a);
        return b(this.f54484a, 0);
    }

    public int b(InputStream inputStream) throws IOException {
        byte[] bArr = this.f54484a;
        c(inputStream, bArr, bArr.length);
        return b(this.f54484a, 0);
    }

    public int b(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public void e(OutputStream outputStream, int i) throws IOException {
        c(this.f54484a, 0, i);
        outputStream.write(this.f54484a);
    }

    public void c(byte[] bArr, int i, int i2) {
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i] = (byte) (i2 & 255);
    }

    public void d(OutputStream outputStream, int i) throws IOException {
        d(this.d, 0, i);
        outputStream.write(this.d);
    }

    public void d(byte[] bArr, int i, int i2) {
        bArr[i + 3] = (byte) (i2 >>> 24);
        bArr[i + 2] = (byte) (i2 >>> 16);
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i] = (byte) (i2 & 255);
    }

    public void c(OutputStream outputStream, long j) throws IOException {
        d(this.f54485b, 0, j);
        outputStream.write(this.f54485b);
    }

    public void d(byte[] bArr, int i, long j) {
        bArr[i + 7] = (byte) (j >>> 56);
        bArr[i + 6] = (byte) (j >>> 48);
        bArr[i + 5] = (byte) (j >>> 40);
        bArr[i + 4] = (byte) (j >>> 32);
        bArr[i + 3] = (byte) (j >>> 24);
        bArr[i + 2] = (byte) (j >>> 16);
        bArr[i + 1] = (byte) (j >>> 8);
        bArr[i] = (byte) (j & 255);
    }

    private void c(InputStream inputStream, byte[] bArr, int i) throws IOException {
        if (zqp.d(inputStream, bArr, 0, i) != i) {
            throw new ZipException("Could not fill buffer");
        }
    }

    private void c(byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
    }
}
