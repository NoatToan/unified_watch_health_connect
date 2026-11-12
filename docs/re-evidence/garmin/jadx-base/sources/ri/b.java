package ri;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f152793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f152794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f152795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f152796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f152797e;

    public class a extends ByteArrayOutputStream {
        public a(int i14) {
            super(i14);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i14 = ((ByteArrayOutputStream) this).count;
            if (i14 > 0 && ((ByteArrayOutputStream) this).buf[i14 - 1] == 13) {
                i14--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i14, b.this.f152794b.name());
            } catch (UnsupportedEncodingException e4) {
                h.q(e4);
                return null;
            }
        }
    }

    public b(InputStream inputStream, int i14, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i14 < 0) {
            h.s("capacity <= 0");
            throw null;
        }
        if (!charset.equals(c.f152799a)) {
            h.s("Unsupported encoding");
            throw null;
        }
        this.f152793a = inputStream;
        this.f152794b = charset;
        this.f152795c = new byte[i14];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String a() {
        int i14;
        synchronized (this.f152793a) {
            try {
                byte[] bArr = this.f152795c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f152796d >= this.f152797e) {
                    int i15 = this.f152793a.read(bArr, 0, bArr.length);
                    if (i15 == -1) {
                        throw new EOFException();
                    }
                    this.f152796d = 0;
                    this.f152797e = i15;
                }
                for (int i16 = this.f152796d; i16 != this.f152797e; i16++) {
                    byte[] bArr2 = this.f152795c;
                    if (bArr2[i16] == 10) {
                        int i17 = this.f152796d;
                        if (i16 != i17) {
                            i14 = i16 - 1;
                            if (bArr2[i14] != 13) {
                                i14 = i16;
                            }
                        } else {
                            i14 = i16;
                        }
                        String str = new String(bArr2, i17, i14 - i17, this.f152794b.name());
                        this.f152796d = i16 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f152797e - this.f152796d) + 80);
                while (true) {
                    byte[] bArr3 = this.f152795c;
                    int i18 = this.f152796d;
                    aVar.write(bArr3, i18, this.f152797e - i18);
                    this.f152797e = -1;
                    InputStream inputStream = this.f152793a;
                    byte[] bArr4 = this.f152795c;
                    int i19 = inputStream.read(bArr4, 0, bArr4.length);
                    if (i19 == -1) {
                        throw new EOFException();
                    }
                    this.f152796d = 0;
                    this.f152797e = i19;
                    for (int i24 = 0; i24 != this.f152797e; i24++) {
                        byte[] bArr5 = this.f152795c;
                        if (bArr5[i24] == 10) {
                            int i25 = this.f152796d;
                            if (i24 != i25) {
                                aVar.write(bArr5, i25, i24 - i25);
                            }
                            this.f152796d = i24 + 1;
                            return aVar.toString();
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f152793a) {
            try {
                if (this.f152795c != null) {
                    this.f152795c = null;
                    this.f152793a.close();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }
}
