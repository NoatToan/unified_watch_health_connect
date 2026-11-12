package com.huawei.hms.network.embedded;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes34.dex */
public class b implements Closeable {
    public static final byte f = 13;
    public static final byte g = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f14584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f14585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f14586c;
    public int d;
    public int e;

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public String t() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f14584a) {
            if (this.f14586c == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.d >= this.e) {
                u();
            }
            for (int i3 = this.d; i3 != this.e; i3++) {
                byte[] bArr2 = this.f14586c;
                if (bArr2[i3] == 10) {
                    int i4 = this.d;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    String str = new String(bArr2, i4, i2 - i4, this.f14585b.name());
                    this.d = i3 + 1;
                    return str;
                }
            }
            a aVar = new a((this.e - this.d) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.f14586c;
                int i5 = this.d;
                aVar.write(bArr3, i5, this.e - i5);
                this.e = -1;
                u();
                i = this.d;
                while (i != this.e) {
                    bArr = this.f14586c;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.d;
            if (i != i6) {
                aVar.write(bArr, i6, i - i6);
            }
            this.d = i + 1;
            return aVar.toString();
        }
    }

    public boolean s() {
        return this.e == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f14584a) {
            if (this.f14586c != null) {
                this.f14586c = null;
                this.f14584a.close();
            }
        }
    }

    private void u() throws IOException {
        InputStream inputStream = this.f14584a;
        byte[] bArr = this.f14586c;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.d = 0;
        this.e = i;
    }

    public class a extends ByteArrayOutputStream {
        /* JADX WARN: Code duplicated, block: B:7:0x000f  */
        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i;
            int i2 = ((ByteArrayOutputStream) this).count;
            if (i2 > 0) {
                i = i2 - 1;
                if (((ByteArrayOutputStream) this).buf[i] != 13) {
                    i = ((ByteArrayOutputStream) this).count;
                }
            } else {
                i = ((ByteArrayOutputStream) this).count;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, b.this.f14585b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }

        public a(int i) {
            super(i);
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(c.f14659a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f14584a = inputStream;
        this.f14585b = charset;
        this.f14586c = new byte[i];
    }
}
