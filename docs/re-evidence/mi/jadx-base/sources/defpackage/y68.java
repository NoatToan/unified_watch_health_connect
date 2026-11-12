package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes4.dex */
public class y68 implements w68 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f39860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZipEntry f39861b;
    public final ZipFile c;
    public final long d;
    public boolean e = true;
    public long f = 0;

    public y68(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.c = zipFile;
        this.f39861b = zipEntry;
        this.d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f39860a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    public w68 a(long j) throws IOException {
        InputStream inputStream = this.f39860a;
        if (inputStream == null) {
            throw new IOException(this.f39861b.getName() + "'s InputStream is null");
        }
        long j2 = this.f;
        if (j == j2) {
            return this;
        }
        long j3 = this.d;
        if (j > j3) {
            j = j3;
        }
        if (j >= j2) {
            inputStream.skip(j - j2);
        } else {
            inputStream.close();
            InputStream inputStream2 = this.c.getInputStream(this.f39861b);
            this.f39860a = inputStream2;
            if (inputStream2 == null) {
                throw new IOException(this.f39861b.getName() + "'s InputStream is null");
            }
            inputStream2.skip(j);
        }
        this.f = j;
        return this;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f39860a;
        if (inputStream != null) {
            inputStream.close();
            this.e = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.e;
    }

    @Override // defpackage.w68
    public int q(ByteBuffer byteBuffer, long j) throws IOException {
        if (this.f39860a == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j2 = this.d - j;
        if (j2 <= 0) {
            return -1;
        }
        int i = (int) j2;
        if (iRemaining > i) {
            iRemaining = i;
        }
        a(j);
        if (byteBuffer.hasArray()) {
            this.f39860a.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f39860a.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return q(byteBuffer, this.f);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
