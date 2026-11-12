package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public final class gud {
    public static final char[] d = xt3.d();
    public static final byte[] e = xt3.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o7p f19336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t63 f19337b;
    public final char[] c = {AbstractJsonLexerKt.STRING_ESC, 0, '0', '0', 0, 0};

    public static int d(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + 65536 + (i2 - Utf8.LOG_SURROGATE_HEADER);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    public static void e(int i) {
        throw new IllegalArgumentException(j8q.c(i));
    }

    public final int a(int i, int i2, t63 t63Var, int i3) {
        t63Var.y(i3);
        t63Var.b(92);
        if (i2 < 0) {
            t63Var.b(117);
            if (i > 255) {
                byte[] bArr = e;
                t63Var.b(bArr[i >> 12]);
                t63Var.b(bArr[(i >> 8) & 15]);
                i &= 255;
            } else {
                t63Var.b(48);
                t63Var.b(48);
            }
            byte[] bArr2 = e;
            t63Var.b(bArr2[i >> 4]);
            t63Var.b(bArr2[i & 15]);
        } else {
            t63Var.b((byte) i2);
        }
        return t63Var.o();
    }

    public final int b(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    public final int c(int i, char[] cArr) {
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        char[] cArr2 = d;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc A[SYNTHETIC] */
    public byte[] f(String str) {
        int i;
        int i2;
        t63 t63Var = this.f19337b;
        if (t63Var == null) {
            t63Var = new t63((x53) null);
            this.f19337b = t63Var;
        }
        int length = str.length();
        byte[] bArrS = t63Var.s();
        int length2 = bArrS.length;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i3 < length) {
            int i5 = i3 + 1;
            char cCharAt = str.charAt(i3);
            while (cCharAt <= 127) {
                if (i4 >= length2) {
                    bArrS = t63Var.m();
                    length2 = bArrS.length;
                    i4 = 0;
                }
                int i6 = i4 + 1;
                bArrS[i4] = (byte) cCharAt;
                if (i5 >= length) {
                    i4 = i6;
                    break loop0;
                }
                char cCharAt2 = str.charAt(i5);
                i5++;
                cCharAt = cCharAt2;
                i4 = i6;
            }
            if (i4 >= length2) {
                bArrS = t63Var.m();
                length2 = bArrS.length;
                i4 = 0;
            }
            if (cCharAt < 2048) {
                i = i4 + 1;
                bArrS[i4] = (byte) ((cCharAt >> 6) | 192);
            } else {
                if (cCharAt < 55296 || cCharAt > 57343) {
                    int i7 = i4 + 1;
                    bArrS[i4] = (byte) ((cCharAt >> '\f') | SportReportBaseParser.ReportType.avgFreq);
                    if (i7 >= length2) {
                        bArrS = t63Var.m();
                        length2 = bArrS.length;
                        i7 = 0;
                    }
                    bArrS[i7] = (byte) (((cCharAt >> 6) & 63) | 128);
                    i = i7 + 1;
                } else {
                    if (cCharAt > 56319) {
                        e(cCharAt);
                    }
                    if (i5 >= length) {
                        e(cCharAt);
                    }
                    int i8 = i5 + 1;
                    int iD = d(cCharAt, str.charAt(i5));
                    if (iD > 1114111) {
                        e(iD);
                    }
                    int i9 = i4 + 1;
                    bArrS[i4] = (byte) ((iD >> 18) | 240);
                    if (i9 >= length2) {
                        bArrS = t63Var.m();
                        length2 = bArrS.length;
                        i9 = 0;
                    }
                    int i10 = i9 + 1;
                    bArrS[i9] = (byte) (((iD >> 12) & 63) | 128);
                    if (i10 >= length2) {
                        bArrS = t63Var.m();
                        length2 = bArrS.length;
                        i10 = 0;
                    }
                    int i11 = i10 + 1;
                    bArrS[i10] = (byte) (((iD >> 6) & 63) | 128);
                    i2 = iD;
                    i3 = i8;
                    i = i11;
                }
                if (i >= length2) {
                    bArrS = t63Var.m();
                    length2 = bArrS.length;
                    i = 0;
                }
                bArrS[i] = (byte) ((i2 & 63) | 128);
                i4 = i + 1;
            }
            i2 = cCharAt;
            i3 = i5;
            if (i >= length2) {
                bArrS = t63Var.m();
                length2 = bArrS.length;
                i = 0;
            }
            bArrS[i] = (byte) ((i2 & 63) | 128);
            i4 = i + 1;
        }
        return this.f19337b.l(i4);
    }

    public char[] g(String str) {
        o7p o7pVar = this.f19336a;
        if (o7pVar == null) {
            o7pVar = new o7p(null);
            this.f19336a = o7pVar;
        }
        char[] cArrM = o7pVar.m();
        int[] iArrE = xt3.e();
        int length = iArrE.length;
        int length2 = str.length();
        int i = 0;
        int i2 = 0;
        loop0: while (i < length2) {
            while (true) {
                char cCharAt = str.charAt(i);
                if (cCharAt >= length || iArrE[cCharAt] == 0) {
                    if (i2 >= cArrM.length) {
                        cArrM = o7pVar.p();
                        i2 = 0;
                    }
                    int i3 = i2 + 1;
                    cArrM[i2] = cCharAt;
                    i++;
                    if (i >= length2) {
                        i2 = i3;
                        break loop0;
                    }
                    i2 = i3;
                }
            }
            int i4 = i + 1;
            char cCharAt2 = str.charAt(i);
            int i5 = iArrE[cCharAt2];
            int iC = i5 < 0 ? c(cCharAt2, this.c) : b(i5, this.c);
            int i6 = i2 + iC;
            if (i6 > cArrM.length) {
                int length3 = cArrM.length - i2;
                if (length3 > 0) {
                    System.arraycopy(this.c, 0, cArrM, i2, length3);
                }
                cArrM = o7pVar.p();
                int i7 = iC - length3;
                System.arraycopy(this.c, length3, cArrM, 0, i7);
                i2 = i7;
            } else {
                System.arraycopy(this.c, 0, cArrM, i2, iC);
                i2 = i6;
            }
            i = i4;
        }
        o7pVar.E(i2);
        return o7pVar.g();
    }

    public byte[] h(String str) {
        int i;
        int i2;
        int i3;
        t63 t63Var = this.f19337b;
        if (t63Var == null) {
            t63Var = new t63((x53) null);
            this.f19337b = t63Var;
        }
        int length = str.length();
        byte[] bArrS = t63Var.s();
        int i4 = 0;
        int iA = 0;
        loop0: while (i4 < length) {
            int[] iArrE = xt3.e();
            while (true) {
                char cCharAt = str.charAt(i4);
                if (cCharAt > 127 || iArrE[cCharAt] != 0) {
                    break;
                }
                if (iA >= bArrS.length) {
                    bArrS = t63Var.m();
                    iA = 0;
                }
                int i5 = iA + 1;
                bArrS[iA] = (byte) cCharAt;
                i4++;
                if (i4 >= length) {
                    iA = i5;
                    break loop0;
                }
                iA = i5;
            }
            if (iA >= bArrS.length) {
                bArrS = t63Var.m();
                iA = 0;
            }
            int i6 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 <= 127) {
                iA = a(cCharAt2, iArrE[cCharAt2], t63Var, iA);
                bArrS = t63Var.n();
            } else {
                if (cCharAt2 <= 2047) {
                    i3 = iA + 1;
                    bArrS[iA] = (byte) ((cCharAt2 >> 6) | 192);
                    i2 = (cCharAt2 & '?') | 128;
                } else {
                    if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                        int i7 = iA + 1;
                        bArrS[iA] = (byte) ((cCharAt2 >> '\f') | SportReportBaseParser.ReportType.avgFreq);
                        if (i7 >= bArrS.length) {
                            bArrS = t63Var.m();
                            i7 = 0;
                        }
                        bArrS[i7] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                        i = i7 + 1;
                        i2 = (cCharAt2 & '?') | 128;
                    } else {
                        if (cCharAt2 > 56319) {
                            e(cCharAt2);
                        }
                        if (i6 >= length) {
                            e(cCharAt2);
                        }
                        int i8 = i4 + 2;
                        int iD = d(cCharAt2, str.charAt(i6));
                        if (iD > 1114111) {
                            e(iD);
                        }
                        int i9 = iA + 1;
                        bArrS[iA] = (byte) ((iD >> 18) | 240);
                        if (i9 >= bArrS.length) {
                            bArrS = t63Var.m();
                            i9 = 0;
                        }
                        int i10 = i9 + 1;
                        bArrS[i9] = (byte) (((iD >> 12) & 63) | 128);
                        if (i10 >= bArrS.length) {
                            bArrS = t63Var.m();
                            i10 = 0;
                        }
                        int i11 = i10 + 1;
                        bArrS[i10] = (byte) (((iD >> 6) & 63) | 128);
                        i2 = (iD & 63) | 128;
                        i = i11;
                        i6 = i8;
                    }
                    i3 = i;
                }
                if (i3 >= bArrS.length) {
                    bArrS = t63Var.m();
                    i3 = 0;
                }
                bArrS[i3] = (byte) i2;
                iA = i3 + 1;
            }
            i4 = i6;
        }
        return this.f19337b.l(iA);
    }
}
