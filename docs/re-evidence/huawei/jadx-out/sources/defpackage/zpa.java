package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import net.lingala.zip4j.io.inputstream.CipherInputStream;
import net.lingala.zip4j.io.inputstream.DecompressedInputStream;

/* JADX INFO: loaded from: classes46.dex */
public class zpa extends DecompressedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Inflater f54422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54423b;
    private byte[] d;
    private byte[] e;

    public zpa(CipherInputStream<?> cipherInputStream, int i) {
        super(cipherInputStream);
        this.d = new byte[1];
        this.f54422a = new Inflater(true);
        this.e = new byte[i];
    }

    @Override // net.lingala.zip4j.io.inputstream.DecompressedInputStream, java.io.InputStream
    public int read() throws IOException {
        if (read(this.d) == -1) {
            return -1;
        }
        return this.d[0];
    }

    @Override // net.lingala.zip4j.io.inputstream.DecompressedInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.io.inputstream.DecompressedInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            try {
                int iInflate = this.f54422a.inflate(bArr, i, i2);
                if (iInflate != 0) {
                    return iInflate;
                }
                if (!this.f54422a.finished() && !this.f54422a.needsDictionary()) {
                    if (this.f54422a.needsInput()) {
                        d();
                    }
                }
                return -1;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    @Override // net.lingala.zip4j.io.inputstream.DecompressedInputStream
    public void endOfEntryReached(InputStream inputStream, int i) throws IOException {
        Inflater inflater = this.f54422a;
        if (inflater != null) {
            inflater.end();
            this.f54422a = null;
        }
        super.endOfEntryReached(inputStream, i);
    }

    @Override // net.lingala.zip4j.io.inputstream.DecompressedInputStream
    public int pushBackInputStreamIfNecessary(PushbackInputStream pushbackInputStream) throws IOException {
        int remaining = this.f54422a.getRemaining();
        if (remaining > 0) {
            pushbackInputStream.unread(getLastReadRawDataCache(), this.f54423b - remaining, remaining);
        }
        return remaining;
    }

    @Override // net.lingala.zip4j.io.inputstream.DecompressedInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Inflater inflater = this.f54422a;
        if (inflater != null) {
            inflater.end();
        }
        super.close();
    }

    private void d() throws IOException {
        byte[] bArr = this.e;
        int i = super.read(bArr, 0, bArr.length);
        this.f54423b = i;
        if (i == -1) {
            throw new EOFException("Unexpected end of input stream");
        }
        this.f54422a.setInput(this.e, 0, i);
    }
}
