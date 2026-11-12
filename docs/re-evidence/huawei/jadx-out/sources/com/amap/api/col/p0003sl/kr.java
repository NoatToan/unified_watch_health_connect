package com.amap.api.col.p0003sl;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class kr implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2977a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f2978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Charset f2979c;
    private byte[] d;
    private int e;
    private int f;

    public kr(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private kr(InputStream inputStream, Charset charset, byte b2) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (!charset.equals(f2977a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f2978b = inputStream;
        this.f2979c = charset;
        this.d = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f2978b) {
            if (this.d != null) {
                this.d = null;
                this.f2978b.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public final String a() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f2978b) {
            if (this.d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.e >= this.f) {
                b();
            }
            for (int i3 = this.e; i3 != this.f; i3++) {
                byte[] bArr2 = this.d;
                if (bArr2[i3] == 10) {
                    int i4 = this.e;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    String str = new String(bArr2, i4, i2 - i4, this.f2979c.name());
                    this.e = i3 + 1;
                    return str;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.f - this.e) + 80) { // from class: com.amap.api.col.3sl.kr.1
                @Override // java.io.ByteArrayOutputStream
                public final String toString() {
                    try {
                        return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, kr.this.f2979c.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
            };
            loop1: while (true) {
                byte[] bArr3 = this.d;
                int i5 = this.e;
                byteArrayOutputStream.write(bArr3, i5, this.f - i5);
                this.f = -1;
                b();
                i = this.e;
                while (i != this.f) {
                    bArr = this.d;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.e;
            if (i != i6) {
                byteArrayOutputStream.write(bArr, i6, i - i6);
            }
            this.e = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    private void b() throws IOException {
        InputStream inputStream = this.f2978b;
        byte[] bArr = this.d;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.e = 0;
        this.f = i;
    }
}
