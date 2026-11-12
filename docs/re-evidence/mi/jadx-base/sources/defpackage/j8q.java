package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public final class j8q extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xuc f22535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OutputStream f22536b;
    public byte[] c;
    public final int d;
    public int e;
    public int f;

    public j8q(xuc xucVar, OutputStream outputStream) {
        this.f22535a = xucVar;
        this.f22536b = outputStream;
        byte[] bArrJ = xucVar.j();
        this.c = bArrJ;
        this.d = bArrJ.length - 4;
        this.e = 0;
    }

    public static void b(int i) throws IOException {
        throw new IOException(c(i));
    }

    public static String c(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output";
        }
        if (i <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")";
    }

    public int a(int i) throws IOException {
        int i2 = this.f;
        this.f = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - 55296) << 10) + 65536 + (i - Utf8.LOG_SURROGATE_HEADER);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f22536b;
        if (outputStream != null) {
            int i = this.e;
            if (i > 0) {
                outputStream.write(this.c, 0, i);
                this.e = 0;
            }
            OutputStream outputStream2 = this.f22536b;
            this.f22536b = null;
            byte[] bArr = this.c;
            if (bArr != null) {
                this.c = null;
                this.f22535a.t(bArr);
            }
            outputStream2.close();
            int i2 = this.f;
            this.f = 0;
            if (i2 > 0) {
                b(i2);
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f22536b;
        if (outputStream != null) {
            int i = this.e;
            if (i > 0) {
                outputStream.write(this.c, 0, i);
                this.e = 0;
            }
            this.f22536b.flush();
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write(str.charAt(i));
                return;
            }
            return;
        }
        if (this.f > 0) {
            i2--;
            write(a(str.charAt(i)));
            i++;
        }
        int i3 = this.e;
        byte[] bArr = this.c;
        int i4 = this.d;
        int i5 = i2 + i;
        while (i < i5) {
            if (i3 >= i4) {
                this.f22536b.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) cCharAt;
                int i8 = i5 - i6;
                int i9 = i4 - i7;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i8 + i6;
                while (true) {
                    i = i6;
                    i3 = i7;
                    if (i >= i10) {
                        continue;
                    } else {
                        i6 = i + 1;
                        cCharAt = str.charAt(i);
                        if (cCharAt < 128) {
                            i7 = i3 + 1;
                            bArr[i3] = (byte) cCharAt;
                        }
                    }
                }
            }
            if (cCharAt < 2048) {
                int i11 = i3 + 1;
                bArr[i3] = (byte) ((cCharAt >> 6) | 192);
                i3 += 2;
                bArr[i11] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i3] = (byte) ((cCharAt >> '\f') | SportReportBaseParser.ReportType.avgFreq);
                int i12 = i3 + 2;
                bArr[i3 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i3 += 3;
                bArr[i12] = (byte) ((cCharAt & '?') | 128);
            } else {
                if (cCharAt > 56319) {
                    this.e = i3;
                    b(cCharAt);
                }
                this.f = cCharAt;
                if (i6 >= i5) {
                    break;
                }
                i = i6 + 1;
                int iA = a(str.charAt(i6));
                if (iA > 1114111) {
                    this.e = i3;
                    b(iA);
                }
                bArr[i3] = (byte) ((iA >> 18) | 240);
                bArr[i3 + 1] = (byte) (((iA >> 12) & 63) | 128);
                int i13 = i3 + 3;
                bArr[i3 + 2] = (byte) (((iA >> 6) & 63) | 128);
                i3 += 4;
                bArr[i13] = (byte) ((iA & 63) | 128);
            }
            i = i6;
        }
        this.e = i3;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write(cArr[i]);
                return;
            }
            return;
        }
        if (this.f > 0) {
            i2--;
            write(a(cArr[i]));
            i++;
        }
        int i3 = this.e;
        byte[] bArr = this.c;
        int i4 = this.d;
        int i5 = i2 + i;
        while (i < i5) {
            if (i3 >= i4) {
                this.f22536b.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char c = cArr[i];
            if (c < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) c;
                int i8 = i5 - i6;
                int i9 = i4 - i7;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i8 + i6;
                while (true) {
                    i = i6;
                    i3 = i7;
                    if (i >= i10) {
                        continue;
                    } else {
                        i6 = i + 1;
                        c = cArr[i];
                        if (c < 128) {
                            i7 = i3 + 1;
                            bArr[i3] = (byte) c;
                        }
                    }
                }
            }
            if (c < 2048) {
                int i11 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 += 2;
                bArr[i11] = (byte) ((c & '?') | 128);
            } else if (c >= 55296 && c <= 57343) {
                if (c > 56319) {
                    this.e = i3;
                    b(c);
                }
                this.f = c;
                if (i6 >= i5) {
                    break;
                }
                i = i6 + 1;
                int iA = a(cArr[i6]);
                if (iA > 1114111) {
                    this.e = i3;
                    b(iA);
                }
                bArr[i3] = (byte) ((iA >> 18) | 240);
                bArr[i3 + 1] = (byte) (((iA >> 12) & 63) | 128);
                int i12 = i3 + 3;
                bArr[i3 + 2] = (byte) (((iA >> 6) & 63) | 128);
                i3 += 4;
                bArr[i12] = (byte) ((iA & 63) | 128);
            } else {
                bArr[i3] = (byte) ((c >> '\f') | SportReportBaseParser.ReportType.avgFreq);
                int i13 = i3 + 2;
                bArr[i3 + 1] = (byte) (((c >> 6) & 63) | 128);
                i3 += 3;
                bArr[i13] = (byte) ((c & '?') | 128);
            }
            i = i6;
        }
        this.e = i3;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        int i2;
        if (this.f > 0) {
            i = a(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                b(i);
            }
            this.f = i;
            return;
        }
        int i3 = this.e;
        if (i3 >= this.d) {
            this.f22536b.write(this.c, 0, i3);
            this.e = 0;
        }
        if (i < 128) {
            byte[] bArr = this.c;
            int i4 = this.e;
            this.e = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.e;
        if (i < 2048) {
            byte[] bArr2 = this.c;
            int i6 = i5 + 1;
            bArr2[i5] = (byte) ((i >> 6) | 192);
            i2 = i5 + 2;
            bArr2[i6] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.c;
            bArr3[i5] = (byte) ((i >> 12) | SportReportBaseParser.ReportType.avgFreq);
            int i7 = i5 + 2;
            bArr3[i5 + 1] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 3;
            bArr3[i7] = (byte) ((i & 63) | 128);
        } else {
            if (i > 1114111) {
                b(i);
            }
            byte[] bArr4 = this.c;
            bArr4[i5] = (byte) ((i >> 18) | 240);
            bArr4[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            int i8 = i5 + 3;
            bArr4[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 4;
            bArr4[i8] = (byte) ((i & 63) | 128);
        }
        this.e = i2;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }
}
