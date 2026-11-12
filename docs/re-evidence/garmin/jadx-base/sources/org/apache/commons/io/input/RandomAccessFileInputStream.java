package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class RandomAccessFileInputStream extends InputStream {
    private final boolean closeOnClose;
    private final RandomAccessFile randomAccessFile;

    public RandomAccessFileInputStream(RandomAccessFile randomAccessFile, boolean z14) {
        Objects.requireNonNull(randomAccessFile, "file");
        this.randomAccessFile = randomAccessFile;
        this.closeOnClose = z14;
    }

    private void seek(long j8) throws IOException {
        this.randomAccessFile.seek(j8);
    }

    @Override // java.io.InputStream
    public int available() {
        long jAvailableLong = availableLong();
        if (jAvailableLong > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jAvailableLong;
    }

    public long availableLong() {
        return this.randomAccessFile.length() - this.randomAccessFile.getFilePointer();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.closeOnClose) {
            this.randomAccessFile.close();
        }
    }

    public RandomAccessFile getRandomAccessFile() {
        return this.randomAccessFile;
    }

    public boolean isCloseOnClose() {
        return this.closeOnClose;
    }

    @Override // java.io.InputStream
    public int read() {
        return this.randomAccessFile.read();
    }

    @Override // java.io.InputStream
    public long skip(long j8) throws IOException {
        if (j8 <= 0) {
            return 0L;
        }
        long filePointer = this.randomAccessFile.getFilePointer();
        long length = this.randomAccessFile.length();
        if (filePointer >= length) {
            return 0L;
        }
        long j14 = j8 + filePointer;
        if (j14 > length) {
            j14 = length - 1;
        }
        if (j14 > 0) {
            seek(j14);
        }
        return this.randomAccessFile.getFilePointer() - filePointer;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.randomAccessFile.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) {
        return this.randomAccessFile.read(bArr, i14, i15);
    }

    public RandomAccessFileInputStream(RandomAccessFile randomAccessFile) {
        this(randomAccessFile, false);
    }
}
