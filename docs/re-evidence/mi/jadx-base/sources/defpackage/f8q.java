package defpackage;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public class f8q extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xuc f17537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputStream f17538b;
    public byte[] c;
    public int d;
    public int e;
    public final boolean f;
    public char g = 0;
    public int h;
    public int i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public char[] f17539k;

    public f8q(xuc xucVar, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.f17537a = xucVar;
        this.f17538b = inputStream;
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.j = inputStream != null;
    }

    public final void a() {
        byte[] bArr = this.c;
        if (bArr != null) {
            this.c = null;
            this.f17537a.r(bArr);
        }
    }

    public final boolean b(int i) throws IOException {
        int i2;
        this.i += this.e - i;
        if (i > 0) {
            int i3 = this.d;
            if (i3 > 0) {
                byte[] bArr = this.c;
                System.arraycopy(bArr, i3, bArr, 0, i);
                this.d = 0;
            }
            this.e = i;
        } else {
            this.d = 0;
            InputStream inputStream = this.f17538b;
            int i4 = inputStream == null ? -1 : inputStream.read(this.c);
            if (i4 < 1) {
                this.e = 0;
                if (i4 < 0) {
                    if (this.j) {
                        a();
                    }
                    return false;
                }
                l();
            }
            this.e = i4;
        }
        while (true) {
            int i5 = this.e;
            if (i5 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.f17538b;
            if (inputStream2 == null) {
                i2 = -1;
            } else {
                byte[] bArr2 = this.c;
                i2 = inputStream2.read(bArr2, i5, bArr2.length - i5);
            }
            if (i2 < 1) {
                if (i2 < 0) {
                    if (this.j) {
                        a();
                    }
                    m(this.e, 4);
                }
                l();
            }
            this.e += i2;
        }
    }

    public final void c(char[] cArr, int i, int i2) throws IOException {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i + "," + i2 + "), cbuf[" + cArr.length + "]");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f17538b;
        if (inputStream != null) {
            this.f17538b = null;
            a();
            inputStream.close();
        }
    }

    public final void d(int i, int i2, String str) throws IOException {
        int i3 = (this.i + this.d) - 1;
        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i) + str + " at char #" + (this.h + i2) + ", byte #" + i3 + ")");
    }

    public final void l() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    public final void m(int i, int i2) throws IOException {
        int i3 = this.i + i;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + this.h + ", byte #" + i3 + ")");
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.f17539k == null) {
            this.f17539k = new char[1];
        }
        if (read(this.f17539k, 0, 1) < 1) {
            return -1;
        }
        return this.f17539k[0];
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ce A[LOOP:0: B:24:0x003e->B:42:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0 A[SYNTHETIC] */
    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.c == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            c(cArr, i, i2);
        }
        int i7 = i2 + i;
        char c = this.g;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this.g = (char) 0;
        } else {
            int i8 = this.e - this.d;
            if (i8 < 4 && !b(i8)) {
                if (i8 == 0) {
                    return -1;
                }
                m(this.e - this.d, 4);
            }
            i3 = i;
        }
        int i9 = this.e - 4;
        while (i3 < i7) {
            int i10 = this.d;
            if (this.f) {
                byte[] bArr = this.c;
                i4 = (bArr[i10] << 8) | (bArr[i10 + 1] & 255);
                i5 = (bArr[i10 + 3] & 255) | ((bArr[i10 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this.c;
                int i11 = (bArr2[i10] & 255) | ((bArr2[i10 + 1] & 255) << 8);
                i4 = (bArr2[i10 + 3] << 8) | (bArr2[i10 + 2] & 255);
                i5 = i11;
            }
            this.d = i10 + 4;
            if (i4 != 0) {
                int i12 = 65535 & i4;
                int i13 = i5 | ((i12 - 1) << 16);
                if (i12 > 16) {
                    d(i13, i3 - i, String.format(" (above 0x%08x)", 1114111));
                }
                i6 = i3 + 1;
                cArr[i3] = (char) ((i13 >> 10) + 55296);
                int i14 = (i13 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                if (i6 >= i7) {
                    this.g = (char) i13;
                } else {
                    i5 = i14;
                    i3 = i6;
                    i6 = i3 + 1;
                    cArr[i3] = (char) i5;
                    if (this.d > i9) {
                        i3 = i6;
                    }
                }
            } else {
                i6 = i3 + 1;
                cArr[i3] = (char) i5;
                if (this.d > i9) {
                    i3 = i6;
                }
            }
            i3 = i6;
            break;
        }
        int i15 = i3 - i;
        this.h += i15;
        return i15;
    }
}
