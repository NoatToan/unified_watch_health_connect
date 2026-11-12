package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* JADX INFO: loaded from: classes21.dex */
public final class xk extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xa f53139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53140c;
    private OutputStream d;
    private byte[] e;
    private int j;

    public xk(xa xaVar, OutputStream outputStream) {
        this.f53139b = xaVar;
        this.d = outputStream;
        byte[] bArrA = xaVar.a();
        this.e = bArrA;
        this.f53140c = bArrA.length - 4;
        this.f53138a = 0;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c2) throws IOException {
        write(c2);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.d;
        if (outputStream != null) {
            int i = this.f53138a;
            if (i > 0) {
                outputStream.write(this.e, 0, i);
                this.f53138a = 0;
            }
            OutputStream outputStream2 = this.d;
            this.d = null;
            byte[] bArr = this.e;
            if (bArr != null) {
                this.e = null;
                this.f53139b.d(bArr);
            }
            outputStream2.close();
            int i2 = this.j;
            this.j = 0;
            if (i2 > 0) {
                e(i2);
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.d;
        if (outputStream != null) {
            int i = this.f53138a;
            if (i > 0) {
                outputStream.write(this.e, 0, i);
                this.f53138a = 0;
            }
            this.d.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        int i3;
        if (i2 < 2) {
            if (i2 == 1) {
                write(cArr[i]);
                return;
            }
            return;
        }
        if (this.j > 0) {
            i2--;
            write(b(cArr[i]));
            i++;
        }
        int i4 = this.f53138a;
        byte[] bArr = this.e;
        int i5 = this.f53140c;
        int i6 = i2 + i;
        while (i < i6) {
            if (i4 >= i5) {
                this.d.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = i + 1;
            char c2 = cArr[i];
            if (c2 < 128) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) c2;
                int i9 = i6 - i7;
                int i10 = i5 - i8;
                int i11 = i9 > i10 ? i10 : i9;
                i = i7;
                i4 = i8;
                while (true) {
                    if (i >= i11 + i7) {
                        continue;
                    } else {
                        int i12 = i + 1;
                        c2 = cArr[i];
                        if (c2 >= 128) {
                            i7 = i12;
                        } else {
                            bArr[i4] = (byte) c2;
                            i = i12;
                            i4++;
                        }
                    }
                }
            }
            if (c2 < 2048) {
                bArr[i4] = (byte) ((c2 >> 6) | PsExtractor.AUDIO_STREAM);
                i3 = i4 + 2;
                bArr[i4 + 1] = (byte) ((c2 & '?') | 128);
            } else if (c2 < 55296 || c2 > 57343) {
                bArr[i4] = (byte) ((c2 >> '\f') | 224);
                bArr[i4 + 1] = (byte) (((c2 >> 6) & 63) | 128);
                i3 = i4 + 3;
                bArr[i4 + 2] = (byte) ((c2 & '?') | 128);
            } else {
                if (c2 > 56319) {
                    this.f53138a = i4;
                    e(c2);
                }
                this.j = c2;
                if (i7 >= i6) {
                    break;
                }
                i = i7 + 1;
                int iB = b(cArr[i7]);
                if (iB > 1114111) {
                    this.f53138a = i4;
                    e(iB);
                }
                bArr[i4] = (byte) ((iB >> 18) | 240);
                bArr[i4 + 1] = (byte) (((iB >> 12) & 63) | 128);
                bArr[i4 + 2] = (byte) (((iB >> 6) & 63) | 128);
                bArr[i4 + 3] = (byte) ((iB & 63) | 128);
                i4 += 4;
            }
            i4 = i3;
            i = i7;
        }
        this.f53138a = i4;
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        int i2;
        if (this.j > 0) {
            i = b(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                e(i);
            }
            this.j = i;
            return;
        }
        int i3 = this.f53138a;
        if (i3 >= this.f53140c) {
            this.d.write(this.e, 0, i3);
            this.f53138a = 0;
        }
        if (i < 128) {
            byte[] bArr = this.e;
            int i4 = this.f53138a;
            this.f53138a = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.f53138a;
        if (i < 2048) {
            byte[] bArr2 = this.e;
            bArr2[i5] = (byte) ((i >> 6) | PsExtractor.AUDIO_STREAM);
            i2 = i5 + 2;
            bArr2[i5 + 1] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.e;
            bArr3[i5] = (byte) ((i >> 12) | 224);
            bArr3[i5 + 1] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 3;
            bArr3[i5 + 2] = (byte) ((i & 63) | 128);
        } else {
            if (i > 1114111) {
                e(i);
            }
            byte[] bArr4 = this.e;
            bArr4[i5] = (byte) ((i >> 18) | 240);
            bArr4[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr4[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 4;
            bArr4[i5 + 3] = (byte) ((i & 63) | 128);
        }
        this.f53138a = i2;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        int i3;
        if (i2 < 2) {
            if (i2 == 1) {
                write(str.charAt(i));
                return;
            }
            return;
        }
        if (this.j > 0) {
            i2--;
            write(b(str.charAt(i)));
            i++;
        }
        int i4 = this.f53138a;
        byte[] bArr = this.e;
        int i5 = this.f53140c;
        int i6 = i2 + i;
        while (i < i6) {
            if (i4 >= i5) {
                this.d.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) cCharAt;
                int i9 = i6 - i7;
                int i10 = i5 - i8;
                int i11 = i9 > i10 ? i10 : i9;
                i = i7;
                i4 = i8;
                while (true) {
                    if (i >= i11 + i7) {
                        continue;
                    } else {
                        int i12 = i + 1;
                        cCharAt = str.charAt(i);
                        if (cCharAt >= 128) {
                            i7 = i12;
                        } else {
                            bArr[i4] = (byte) cCharAt;
                            i = i12;
                            i4++;
                        }
                    }
                }
            }
            if (cCharAt < 2048) {
                bArr[i4] = (byte) ((cCharAt >> 6) | PsExtractor.AUDIO_STREAM);
                i3 = i4 + 2;
                bArr[i4 + 1] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i4] = (byte) ((cCharAt >> '\f') | 224);
                bArr[i4 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i3 = i4 + 3;
                bArr[i4 + 2] = (byte) ((cCharAt & '?') | 128);
            } else {
                if (cCharAt > 56319) {
                    this.f53138a = i4;
                    e(cCharAt);
                }
                this.j = cCharAt;
                if (i7 >= i6) {
                    break;
                }
                i = i7 + 1;
                int iB = b(str.charAt(i7));
                if (iB > 1114111) {
                    this.f53138a = i4;
                    e(iB);
                }
                bArr[i4] = (byte) ((iB >> 18) | 240);
                bArr[i4 + 1] = (byte) (((iB >> 12) & 63) | 128);
                bArr[i4 + 2] = (byte) (((iB >> 6) & 63) | 128);
                bArr[i4 + 3] = (byte) ((iB & 63) | 128);
                i4 += 4;
            }
            i4 = i3;
            i = i7;
        }
        this.f53138a = i4;
    }

    protected int b(int i) throws IOException {
        int i2 = this.j;
        this.j = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - GeneratorBase.SURR1_FIRST) << 10) + 65536 + (i - 56320);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
    }

    protected static void e(int i) throws IOException {
        throw new IOException(a(i));
    }

    protected static String a(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output";
        }
        if (i <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + Constants.RIGHT_BRACKET_ONLY;
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + Constants.RIGHT_BRACKET_ONLY;
    }
}
