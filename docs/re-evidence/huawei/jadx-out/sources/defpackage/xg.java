package defpackage;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.huawei.operation.utils.Constants;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes21.dex */
public class xg extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f52859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f52860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f52861c;
    protected final xa d;
    protected byte[] e;
    protected final boolean f;
    protected InputStream g;
    protected int h;
    protected int i;
    protected char j = 0;
    protected char[] m;

    public xg(xa xaVar, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.d = xaVar;
        this.g = inputStream;
        this.e = bArr;
        this.h = i;
        this.i = i2;
        this.f52860b = z;
        this.f = inputStream != null;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.g;
        if (inputStream != null) {
            this.g = null;
            a();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.m == null) {
            this.m = new char[1];
        }
        if (read(this.m, 0, 1) < 1) {
            return -1;
        }
        return this.m[0];
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ce A[LOOP:0: B:24:0x003d->B:41:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc A[SYNTHETIC] */
    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.e == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            b(cArr, i, i2);
        }
        int i7 = i2 + i;
        char c2 = this.j;
        if (c2 != 0) {
            i3 = i + 1;
            cArr[i] = c2;
            this.j = (char) 0;
        } else {
            int i8 = this.i - this.h;
            if (i8 < 4 && !c(i8)) {
                if (i8 == 0) {
                    return -1;
                }
                b(this.i - this.h, 4);
            }
            i3 = i;
        }
        int i9 = this.i;
        while (i3 < i7) {
            int i10 = this.h;
            if (this.f52860b) {
                byte[] bArr = this.e;
                i4 = (bArr[i10] << 8) | (bArr[i10 + 1] & 255);
                i5 = (bArr[i10 + 3] & 255) | ((bArr[i10 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this.e;
                int i11 = (bArr2[i10] & 255) | ((bArr2[i10 + 1] & 255) << 8);
                i4 = (bArr2[i10 + 3] << 8) | (bArr2[i10 + 2] & 255);
                i5 = i11;
            }
            this.h = i10 + 4;
            if (i4 != 0) {
                int i12 = 65535 & i4;
                int i13 = i5 | ((i12 - 1) << 16);
                if (i12 > 16) {
                    b(i13, i3 - i, String.format(" (above 0x%08x)", 1114111));
                }
                i6 = i3 + 1;
                cArr[i3] = (char) ((i13 >> 10) + GeneratorBase.SURR1_FIRST);
                if (i6 >= i7) {
                    this.j = (char) i13;
                } else {
                    i5 = 56320 | (i13 & 1023);
                    i3 = i6;
                    i6 = i3 + 1;
                    cArr[i3] = (char) i5;
                    if (this.h > i9 - 4) {
                        i3 = i6;
                    }
                }
            } else {
                i6 = i3 + 1;
                cArr[i3] = (char) i5;
                if (this.h > i9 - 4) {
                    i3 = i6;
                }
            }
            i3 = i6;
            break;
        }
        int i14 = i3 - i;
        this.f52861c += i14;
        return i14;
    }

    private void b(int i, int i2) throws IOException {
        int i3 = this.f52859a;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + this.f52861c + ", byte #" + (i3 + i) + Constants.RIGHT_BRACKET_ONLY);
    }

    private void b(int i, int i2, String str) throws IOException {
        int i3 = this.f52859a;
        int i4 = this.h;
        int i5 = this.f52861c;
        StringBuilder sb = new StringBuilder("Invalid UTF-32 character 0x");
        sb.append(Integer.toHexString(i));
        sb.append(str);
        sb.append(" at char #");
        sb.append(i5 + i2);
        sb.append(", byte #");
        sb.append((i3 + i4) - 1);
        sb.append(Constants.RIGHT_BRACKET_ONLY);
        throw new CharConversionException(sb.toString());
    }

    private boolean c(int i) throws IOException {
        int i2;
        this.f52859a += this.i - i;
        if (i > 0) {
            int i3 = this.h;
            if (i3 > 0) {
                byte[] bArr = this.e;
                System.arraycopy(bArr, i3, bArr, 0, i);
                this.h = 0;
            }
            this.i = i;
        } else {
            this.h = 0;
            InputStream inputStream = this.g;
            int i4 = inputStream == null ? -1 : inputStream.read(this.e);
            if (i4 < 1) {
                this.i = 0;
                if (i4 < 0) {
                    if (this.f) {
                        a();
                    }
                    return false;
                }
                c();
            }
            this.i = i4;
        }
        while (true) {
            int i5 = this.i;
            if (i5 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.g;
            if (inputStream2 == null) {
                i2 = -1;
            } else {
                byte[] bArr2 = this.e;
                i2 = inputStream2.read(bArr2, i5, bArr2.length - i5);
            }
            if (i2 < 1) {
                if (i2 < 0) {
                    if (this.f) {
                        a();
                    }
                    b(this.i, 4);
                }
                c();
            }
            this.i += i2;
        }
    }

    private void a() {
        byte[] bArr = this.e;
        if (bArr != null) {
            this.e = null;
            this.d.e(bArr);
        }
    }

    private void b(char[] cArr, int i, int i2) throws IOException {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i + "," + i2 + "), cbuf[" + cArr.length + "]");
    }

    private void c() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }
}
