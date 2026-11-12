package net.lingala.zip4j.io.inputstream;

import defpackage.zpi;
import defpackage.zpz;
import defpackage.zqp;
import java.io.IOException;
import java.io.InputStream;
import net.lingala.zip4j.crypto.Decrypter;
import net.lingala.zip4j.model.enums.CompressionMethod;

/* JADX INFO: loaded from: classes46.dex */
public abstract class CipherInputStream<T extends Decrypter> extends InputStream {
    private T decrypter;
    private byte[] lastReadRawDataCache;
    private zpz localFileHeader;
    private byte[] singleByteBuffer = new byte[1];
    private zpi zipEntryInputStream;

    protected void endOfEntryReached(InputStream inputStream, int i) throws IOException {
    }

    protected abstract T initializeDecrypter(zpz zpzVar, char[] cArr, boolean z) throws IOException;

    public CipherInputStream(zpi zpiVar, zpz zpzVar, char[] cArr, int i, boolean z) throws IOException {
        this.zipEntryInputStream = zpiVar;
        this.decrypter = (T) initializeDecrypter(zpzVar, cArr, z);
        this.localFileHeader = zpzVar;
        if (zqp.c(zpzVar).equals(CompressionMethod.DEFLATE)) {
            this.lastReadRawDataCache = new byte[i];
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.singleByteBuffer) == -1) {
            return -1;
        }
        return this.singleByteBuffer[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int iD = zqp.d(this.zipEntryInputStream, bArr, i, i2);
        if (iD > 0) {
            cacheRawData(bArr, iD);
            this.decrypter.decryptData(bArr, i, iD);
        }
        return iD;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.zipEntryInputStream.close();
    }

    public byte[] getLastReadRawDataCache() {
        return this.lastReadRawDataCache;
    }

    protected int readRaw(byte[] bArr) throws IOException {
        return this.zipEntryInputStream.a(bArr);
    }

    private void cacheRawData(byte[] bArr, int i) {
        byte[] bArr2 = this.lastReadRawDataCache;
        if (bArr2 != null) {
            System.arraycopy(bArr, 0, bArr2, 0, i);
        }
    }

    public T getDecrypter() {
        return this.decrypter;
    }

    protected long getNumberOfBytesReadForThisEntry() {
        return this.zipEntryInputStream.b();
    }

    public zpz getLocalFileHeader() {
        return this.localFileHeader;
    }
}
