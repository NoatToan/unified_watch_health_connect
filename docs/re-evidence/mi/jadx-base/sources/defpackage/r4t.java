package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class r4t implements Closeable {
    public static final Charset f = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f32192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f32193b;
    public byte[] c;
    public int d;
    public int e;

    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, r4t.this.f32193b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public r4t(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public final String a() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f32192a) {
            try {
                if (this.c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.d >= this.e) {
                    c();
                }
                for (int i3 = this.d; i3 != this.e; i3++) {
                    byte[] bArr2 = this.c;
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
                        String str = new String(bArr2, i4, i2 - i4, this.f32193b.name());
                        this.d = i3 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.e - this.d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.c;
                    int i5 = this.d;
                    aVar.write(bArr3, i5, this.e - i5);
                    this.e = -1;
                    c();
                    i = this.d;
                    while (i != this.e) {
                        bArr = this.c;
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() throws IOException {
        InputStream inputStream = this.f32192a;
        byte[] bArr = this.c;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.d = 0;
        this.e = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f32192a) {
            try {
                if (this.c != null) {
                    this.c = null;
                    this.f32192a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public r4t(InputStream inputStream, Charset charset, byte b2) {
        if (inputStream != null && charset != null) {
            if (charset.equals(f)) {
                this.f32192a = inputStream;
                this.f32193b = charset;
                this.c = new byte[8192];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }
}
