package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public class i8q extends zkh {
    public static final int[] a0 = xt3.i();
    public static final int[] b0 = xt3.g();
    public static final int c0 = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    public v3h P;
    public final r73 Q;
    public int[] R;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public int W;
    public InputStream X;
    public byte[] Y;
    public boolean Z;

    public i8q(xuc xucVar, int i, InputStream inputStream, v3h v3hVar, r73 r73Var, byte[] bArr, int i2, int i3, boolean z) {
        super(xucVar, i);
        this.R = new int[16];
        this.X = inputStream;
        this.P = v3hVar;
        this.Q = r73Var;
        this.Y = bArr;
        this.q = i2;
        this.f41402r = i3;
        this.u = i2;
        this.s = -i2;
        this.Z = z;
    }

    private final void F2() throws IOException {
        int[] iArrF = xt3.f();
        while (true) {
            if (this.q >= this.f41402r && !i2()) {
                break;
            }
            byte[] bArr = this.Y;
            int i = this.q;
            int i2 = i + 1;
            this.q = i2;
            int i3 = bArr[i] & 255;
            int i4 = iArrF[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    M2();
                } else if (i4 == 3) {
                    N2();
                } else if (i4 == 4) {
                    O2(i3);
                } else if (i4 == 10) {
                    this.t++;
                    this.u = i2;
                } else if (i4 == 13) {
                    G2();
                } else if (i4 == 42) {
                    if (i2 >= this.f41402r && !i2()) {
                        break;
                    }
                    byte[] bArr2 = this.Y;
                    int i5 = this.q;
                    if (bArr2[i5] == 47) {
                        this.q = i5 + 1;
                        return;
                    }
                } else {
                    z2(i3);
                }
            }
        }
        b1(" in a comment", null);
    }

    private final int H2() throws IOException {
        int i = this.q;
        if (i + 4 >= this.f41402r) {
            return I2(false);
        }
        byte[] bArr = this.Y;
        byte b2 = bArr[i];
        if (b2 == 58) {
            int i2 = i + 1;
            this.q = i2;
            byte b3 = bArr[i2];
            if (b3 > 32) {
                if (b3 == 47 || b3 == 35) {
                    return I2(true);
                }
                this.q = i + 2;
                return b3;
            }
            if (b3 == 32 || b3 == 9) {
                int i3 = i + 2;
                this.q = i3;
                byte b4 = bArr[i3];
                if (b4 > 32) {
                    if (b4 == 47 || b4 == 35) {
                        return I2(true);
                    }
                    this.q = i + 3;
                    return b4;
                }
            }
            return I2(true);
        }
        if (b2 == 32 || b2 == 9) {
            int i4 = i + 1;
            this.q = i4;
            b2 = bArr[i4];
        }
        if (b2 != 58) {
            return I2(false);
        }
        int i5 = this.q;
        int i6 = i5 + 1;
        this.q = i6;
        byte b5 = bArr[i6];
        if (b5 > 32) {
            if (b5 == 47 || b5 == 35) {
                return I2(true);
            }
            this.q = i5 + 2;
            return b5;
        }
        if (b5 == 32 || b5 == 9) {
            int i7 = i5 + 2;
            this.q = i7;
            byte b6 = bArr[i7];
            if (b6 > 32) {
                if (b6 == 47 || b6 == 35) {
                    return I2(true);
                }
                this.q = i5 + 3;
                return b6;
            }
        }
        return I2(true);
    }

    private final int I2(boolean z) throws IOException {
        while (true) {
            if (this.q >= this.f41402r && !i2()) {
                b1(" within/between " + this.y.j() + " entries", null);
                return -1;
            }
            byte[] bArr = this.Y;
            int i = this.q;
            int i2 = i + 1;
            this.q = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    J2();
                } else if (i3 != 35 || !T2()) {
                    if (z) {
                        return i3;
                    }
                    if (i3 != 58) {
                        e1(i3, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i3 != 32) {
                if (i3 == 10) {
                    this.t++;
                    this.u = i2;
                } else if (i3 == 13) {
                    G2();
                } else if (i3 != 9) {
                    g1(i3);
                }
            }
        }
    }

    private final void J2() throws IOException {
        if (!A0(JsonParser.Feature.ALLOW_COMMENTS)) {
            e1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.q >= this.f41402r && !i2()) {
            b1(" in a comment", null);
        }
        byte[] bArr = this.Y;
        int i = this.q;
        this.q = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 47) {
            K2();
        } else if (i2 == 42) {
            F2();
        } else {
            e1(i2, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void K2() throws IOException {
        int[] iArrF = xt3.f();
        while (true) {
            if (this.q >= this.f41402r && !i2()) {
                return;
            }
            byte[] bArr = this.Y;
            int i = this.q;
            int i2 = i + 1;
            this.q = i2;
            int i3 = bArr[i] & 255;
            int i4 = iArrF[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    M2();
                } else if (i4 == 3) {
                    N2();
                } else if (i4 == 4) {
                    O2(i3);
                } else if (i4 == 10) {
                    this.t++;
                    this.u = i2;
                    return;
                } else if (i4 == 13) {
                    G2();
                    return;
                } else if (i4 != 42 && i4 < 0) {
                    z2(i3);
                }
            }
        }
    }

    private final void M2() throws IOException {
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr = this.Y;
        int i = this.q;
        int i2 = i + 1;
        this.q = i2;
        byte b2 = bArr[i];
        if ((b2 & 192) != 128) {
            C2(b2 & 255, i2);
        }
    }

    private final void N2() throws IOException {
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr = this.Y;
        int i = this.q;
        int i2 = i + 1;
        this.q = i2;
        byte b2 = bArr[i];
        if ((b2 & 192) != 128) {
            C2(b2 & 255, i2);
        }
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr2 = this.Y;
        int i3 = this.q;
        int i4 = i3 + 1;
        this.q = i4;
        byte b3 = bArr2[i3];
        if ((b3 & 192) != 128) {
            C2(b3 & 255, i4);
        }
    }

    private final int P2() throws IOException {
        while (true) {
            int i = this.q;
            if (i >= this.f41402r) {
                return Q2();
            }
            byte[] bArr = this.Y;
            int i2 = i + 1;
            this.q = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 != 47 && i3 != 35) {
                    return i3;
                }
                this.q = i;
                return Q2();
            }
            if (i3 != 32) {
                if (i3 == 10) {
                    this.t++;
                    this.u = i2;
                } else if (i3 == 13) {
                    G2();
                } else if (i3 != 9) {
                    g1(i3);
                }
            }
        }
    }

    private final void Q1(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) V1(i2))) {
            D2(str.substring(0, i));
        }
    }

    private final int R2() throws IOException {
        if (this.q >= this.f41402r && !i2()) {
            return s1();
        }
        byte[] bArr = this.Y;
        int i = this.q;
        int i2 = i + 1;
        this.q = i2;
        int i3 = bArr[i] & 255;
        if (i3 > 32) {
            if (i3 != 47 && i3 != 35) {
                return i3;
            }
            this.q = i;
            return S2();
        }
        if (i3 != 32) {
            if (i3 == 10) {
                this.t++;
                this.u = i2;
            } else if (i3 == 13) {
                G2();
            } else if (i3 != 9) {
                g1(i3);
            }
        }
        while (true) {
            int i4 = this.q;
            if (i4 >= this.f41402r) {
                return S2();
            }
            byte[] bArr2 = this.Y;
            int i5 = i4 + 1;
            this.q = i5;
            int i6 = bArr2[i4] & 255;
            if (i6 > 32) {
                if (i6 != 47 && i6 != 35) {
                    return i6;
                }
                this.q = i4;
                return S2();
            }
            if (i6 != 32) {
                if (i6 == 10) {
                    this.t++;
                    this.u = i5;
                } else if (i6 == 13) {
                    G2();
                } else if (i6 != 9) {
                    g1(i6);
                }
            }
        }
    }

    private final int S2() throws IOException {
        while (true) {
            if (this.q >= this.f41402r && !i2()) {
                return s1();
            }
            byte[] bArr = this.Y;
            int i = this.q;
            int i2 = i + 1;
            this.q = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    J2();
                } else if (i3 != 35 || !T2()) {
                    return i3;
                }
            } else if (i3 != 32) {
                if (i3 == 10) {
                    this.t++;
                    this.u = i2;
                } else if (i3 == 13) {
                    G2();
                } else if (i3 != 9) {
                    g1(i3);
                }
            }
        }
    }

    private final boolean T2() throws IOException {
        if (!A0(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        K2();
        return true;
    }

    private final void U2() {
        this.w = this.t;
        int i = this.q;
        this.v = this.s + ((long) i);
        this.x = i - this.u;
    }

    private final void V2() {
        this.V = this.t;
        int i = this.q;
        this.U = i;
        this.W = i - this.u;
    }

    private final int W1(int i) throws IOException {
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr = this.Y;
        int i2 = this.q;
        int i3 = i2 + 1;
        this.q = i3;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            C2(b2 & 255, i3);
        }
        return ((i & 31) << 6) | (b2 & 63);
    }

    private final int X1(int i) throws IOException {
        if (this.q >= this.f41402r) {
            j2();
        }
        int i2 = i & 15;
        byte[] bArr = this.Y;
        int i3 = this.q;
        int i4 = i3 + 1;
        this.q = i4;
        byte b2 = bArr[i3];
        if ((b2 & 192) != 128) {
            C2(b2 & 255, i4);
        }
        int i5 = (i2 << 6) | (b2 & 63);
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr2 = this.Y;
        int i6 = this.q;
        int i7 = i6 + 1;
        this.q = i7;
        byte b3 = bArr2[i6];
        if ((b3 & 192) != 128) {
            C2(b3 & 255, i7);
        }
        return (i5 << 6) | (b3 & 63);
    }

    private final void X2(int i) throws IOException {
        int i2 = this.q + 1;
        this.q = i2;
        if (i != 9) {
            if (i == 10) {
                this.t++;
                this.u = i2;
            } else if (i == 13) {
                G2();
            } else if (i != 32) {
                d1(i);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9 A[PHI: r5 r14
      0x00b9: PHI (r5v17 int) = (r5v16 int), (r5v28 int) binds: [B:28:0x0082, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r14v6 int) = (r14v5 int), (r14v15 int) binds: [B:28:0x0082, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    private final String Y2(int[] iArr, int i, int i2) throws JsonParseException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = ((i << 2) - 4) + i2;
        if (i2 < 4) {
            int i13 = i - 1;
            i3 = iArr[i13];
            iArr[i13] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        char[] cArrM = this.A.m();
        int i14 = 0;
        int i15 = 0;
        while (i14 < i12) {
            int i16 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
            int i17 = i16 & 255;
            int i18 = i14 + 1;
            if (i17 > 127) {
                if ((i16 & SportReportBaseParser.ReportType.avgFreq) == 192) {
                    i4 = i16 & 31;
                } else {
                    if ((i16 & 240) == 224) {
                        i4 = i16 & 15;
                        i5 = 2;
                    } else if ((i16 & 248) == 240) {
                        i4 = i16 & 7;
                        i5 = 3;
                    } else {
                        A2(i17);
                        i4 = 1;
                    }
                    if (i18 + i5 > i12) {
                        b1(" in field name", JsonToken.FIELD_NAME);
                    }
                    i6 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                    i18 = i14 + 2;
                    if ((i6 & 192) != 128) {
                        B2(i6);
                    }
                    i7 = (i4 << 6) | (i6 & 63);
                    if (i5 > 1) {
                        i9 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                        i18 = i14 + 3;
                        if ((i9 & 192) != 128) {
                            B2(i9);
                        }
                        i10 = (i7 << 6) | (i9 & 63);
                        if (i5 > 2) {
                            i11 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                            i18 = i14 + 4;
                            if ((i11 & 192) != 128) {
                                B2(i11 & 255);
                            }
                            i7 = (i10 << 6) | (i11 & 63);
                            i17 = i7;
                            i8 = 2;
                        } else {
                            i17 = i10;
                            i8 = 2;
                        }
                    } else {
                        i17 = i7;
                        i8 = 2;
                    }
                    if (i5 > i8) {
                        int i19 = i17 - 65536;
                        if (i15 >= cArrM.length) {
                            cArrM = this.A.o();
                        }
                        cArrM[i15] = (char) ((i19 >> 10) + 55296);
                        i17 = (i19 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                        i15++;
                    }
                }
                i5 = 1;
                if (i18 + i5 > i12) {
                    b1(" in field name", JsonToken.FIELD_NAME);
                }
                i6 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                i18 = i14 + 2;
                if ((i6 & 192) != 128) {
                    B2(i6);
                }
                i7 = (i4 << 6) | (i6 & 63);
                if (i5 > 1) {
                    i9 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                    i18 = i14 + 3;
                    if ((i9 & 192) != 128) {
                        B2(i9);
                    }
                    i10 = (i7 << 6) | (i9 & 63);
                    if (i5 > 2) {
                        i11 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                        i18 = i14 + 4;
                        if ((i11 & 192) != 128) {
                            B2(i11 & 255);
                        }
                        i7 = (i10 << 6) | (i11 & 63);
                        i17 = i7;
                        i8 = 2;
                    } else {
                        i17 = i10;
                        i8 = 2;
                    }
                } else {
                    i17 = i7;
                    i8 = 2;
                }
                if (i5 > i8) {
                    int i110 = i17 - 65536;
                    if (i15 >= cArrM.length) {
                        cArrM = this.A.o();
                    }
                    cArrM[i15] = (char) ((i110 >> 10) + 55296);
                    i17 = (i110 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                    i15++;
                }
            }
            i14 = i18;
            if (i15 >= cArrM.length) {
                cArrM = this.A.o();
            }
            cArrM[i15] = (char) i17;
            i15++;
        }
        String str = new String(cArrM, 0, i15);
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this.Q.v(str, iArr, i);
    }

    private final int Z1(int i) throws IOException {
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr = this.Y;
        int i2 = this.q;
        int i3 = i2 + 1;
        this.q = i3;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            C2(b2 & 255, i3);
        }
        int i4 = ((i & 7) << 6) | (b2 & 63);
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr2 = this.Y;
        int i5 = this.q;
        int i6 = i5 + 1;
        this.q = i6;
        byte b3 = bArr2[i5];
        if ((b3 & 192) != 128) {
            C2(b3 & 255, i6);
        }
        int i7 = (i4 << 6) | (b3 & 63);
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr3 = this.Y;
        int i8 = this.q;
        int i9 = i8 + 1;
        this.q = i9;
        byte b4 = bArr3[i8];
        if ((b4 & 192) != 128) {
            C2(b4 & 255, i9);
        }
        return ((i7 << 6) | (b4 & 63)) - 65536;
    }

    private final String Z2(int i, int i2) throws JsonParseException {
        int iR2 = r2(i, i2);
        String strC = this.Q.C(iR2);
        if (strC != null) {
            return strC;
        }
        int[] iArr = this.R;
        iArr[0] = iR2;
        return Y2(iArr, 1, i2);
    }

    private final String a3(int i, int i2, int i3) throws JsonParseException {
        int iR2 = r2(i2, i3);
        String strD = this.Q.D(i, iR2);
        if (strD != null) {
            return strD;
        }
        int[] iArr = this.R;
        iArr[0] = i;
        iArr[1] = iR2;
        return Y2(iArr, 2, i3);
    }

    private final String b3(int i, int i2, int i3, int i4) throws JsonParseException {
        int iR2 = r2(i3, i4);
        String strE = this.Q.E(i, i2, iR2);
        if (strE != null) {
            return strE;
        }
        int[] iArr = this.R;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = r2(iR2, i4);
        return Y2(iArr, 3, i4);
    }

    private final String c3(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = zkh.J1(iArr, iArr.length);
            this.R = iArr;
        }
        int i4 = i + 1;
        iArr[i] = r2(i2, i3);
        String strF = this.Q.F(iArr, i4);
        return strF == null ? Y2(iArr, i4, i3) : strF;
    }

    private final String i3(int i, int i2, int i3) throws IOException {
        return e3(this.R, 0, i, i2, i3);
    }

    private final String j3(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = this.R;
        iArr[0] = i;
        return e3(iArr, 1, i2, i3, i4);
    }

    private final String k3(int i, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this.R;
        iArr[0] = i;
        iArr[1] = i2;
        return e3(iArr, 2, i3, i4, i5);
    }

    private final void n2(String str, int i) throws IOException {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this.q >= this.f41402r && !i2()) || this.Y[this.q] != str.charAt(i)) {
                D2(str.substring(0, i));
            }
            i2 = this.q + 1;
            this.q = i2;
            i++;
        } while (i < length);
        if ((i2 < this.f41402r || i2()) && (i3 = this.Y[this.q] & 255) >= 48 && i3 != 93 && i3 != 125) {
            Q1(str, i, i3);
        }
    }

    private final JsonToken p2() {
        this.C = false;
        JsonToken jsonToken = this.z;
        this.z = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this.y = this.y.m(this.w, this.x);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.y = this.y.n(this.w, this.x);
        }
        this.c = jsonToken;
        return jsonToken;
    }

    private final JsonToken q2(int i) throws IOException {
        if (i == 34) {
            this.S = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.c = jsonToken;
            return jsonToken;
        }
        if (i == 45) {
            JsonToken jsonTokenV2 = v2();
            this.c = jsonTokenV2;
            return jsonTokenV2;
        }
        if (i == 91) {
            this.y = this.y.m(this.w, this.x);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.c = jsonToken2;
            return jsonToken2;
        }
        if (i == 102) {
            k2();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.c = jsonToken3;
            return jsonToken3;
        }
        if (i == 110) {
            l2();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.c = jsonToken4;
            return jsonToken4;
        }
        if (i == 116) {
            o2();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this.c = jsonToken5;
            return jsonToken5;
        }
        if (i == 123) {
            this.y = this.y.n(this.w, this.x);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this.c = jsonToken6;
            return jsonToken6;
        }
        switch (i) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                JsonToken jsonTokenX2 = x2(i);
                this.c = jsonTokenX2;
                return jsonTokenX2;
            default:
                JsonToken jsonTokenH2 = h2(i);
                this.c = jsonTokenH2;
                return jsonTokenH2;
        }
    }

    private static final int r2(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    private final JsonToken t2(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        int i4;
        boolean z2;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.A.p();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            i4 = 0;
            while (true) {
                if (this.q >= this.f41402r && !i2()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.Y;
                int i6 = this.q;
                this.q = i6 + 1;
                i2 = bArr[i6] & 255;
                if (i2 < 48 || i2 > 57) {
                    z2 = false;
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = this.A.p();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i++;
            }
            if (i4 == 0) {
                m1(i2, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this.A.p();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            if (this.q >= this.f41402r) {
                j2();
            }
            byte[] bArr2 = this.Y;
            int i8 = this.q;
            this.q = i8 + 1;
            int i9 = bArr2[i8] & 255;
            if (i9 == 45 || i9 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this.A.p();
                    i7 = 0;
                }
                int i10 = i7 + 1;
                cArr[i7] = (char) i9;
                if (this.q >= this.f41402r) {
                    j2();
                }
                byte[] bArr3 = this.Y;
                int i11 = this.q;
                this.q = i11 + 1;
                i9 = bArr3[i11] & 255;
                i7 = i10;
            }
            i2 = i9;
            int i12 = 0;
            while (true) {
                if (i2 >= 48 && i2 <= 57) {
                    i12++;
                    if (i7 >= cArr.length) {
                        cArr = this.A.p();
                        i7 = 0;
                    }
                    int i13 = i7 + 1;
                    cArr[i7] = (char) i2;
                    if (this.q >= this.f41402r && !i2()) {
                        i5 = i12;
                        z2 = true;
                        i = i13;
                        break;
                    }
                    byte[] bArr4 = this.Y;
                    int i14 = this.q;
                    this.q = i14 + 1;
                    i2 = bArr4[i14] & 255;
                    i7 = i13;
                } else {
                    i5 = i12;
                    i = i7;
                    break;
                }
            }
            if (i5 == 0) {
                m1(i2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.q--;
            if (this.y.h()) {
                X2(i2);
            }
        }
        this.A.E(i);
        return O1(z, i3, i4, i5);
    }

    @Override // defpackage.zkh
    public void A1() throws IOException {
        byte[] bArr;
        super.A1();
        this.Q.M();
        if (!this.Z || (bArr = this.Y) == null) {
            return;
        }
        this.Y = alh.e;
        this.o.r(bArr);
    }

    public void A2(int i) throws JsonParseException {
        X0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    public void B2(int i) throws JsonParseException {
        X0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    public void C2(int i, int i2) throws JsonParseException {
        this.q = i2;
        B2(i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public v3h D() {
        return this.P;
    }

    public void D2(String str) throws IOException {
        E2(str, "'null', 'true', 'false' or NaN");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation E() {
        return new JsonLocation(u1(), this.s + ((long) this.q), -1L, this.t, (this.q - this.u) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String E0() throws IOException {
        JsonToken jsonTokenV2;
        this.F = 0;
        JsonToken jsonToken = this.c;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            p2();
            return null;
        }
        if (this.S) {
            L2();
        }
        int iR2 = R2();
        if (iR2 < 0) {
            close();
            this.c = null;
            return null;
        }
        this.E = null;
        if (iR2 == 93) {
            R1();
            this.c = JsonToken.END_ARRAY;
            return null;
        }
        if (iR2 == 125) {
            S1();
            this.c = JsonToken.END_OBJECT;
            return null;
        }
        if (this.y.p()) {
            if (iR2 != 44) {
                e1(iR2, "was expecting comma to separate " + this.y.j() + " entries");
            }
            iR2 = P2();
            if ((this.f7621a & c0) != 0 && (iR2 == 93 || iR2 == 125)) {
                T1(iR2);
                return null;
            }
        }
        if (!this.y.g()) {
            U2();
            q2(iR2);
            return null;
        }
        V2();
        String strU2 = u2(iR2);
        this.y.u(strU2);
        this.c = jsonToken2;
        int iH2 = H2();
        U2();
        if (iH2 == 34) {
            this.S = true;
            this.z = JsonToken.VALUE_STRING;
            return strU2;
        }
        if (iH2 == 45) {
            jsonTokenV2 = v2();
        } else if (iH2 == 91) {
            jsonTokenV2 = JsonToken.START_ARRAY;
        } else if (iH2 == 102) {
            k2();
            jsonTokenV2 = JsonToken.VALUE_FALSE;
        } else if (iH2 == 110) {
            l2();
            jsonTokenV2 = JsonToken.VALUE_NULL;
        } else if (iH2 == 116) {
            o2();
            jsonTokenV2 = JsonToken.VALUE_TRUE;
        } else if (iH2 != 123) {
            switch (iH2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonTokenV2 = x2(iH2);
                    break;
                default:
                    jsonTokenV2 = h2(iH2);
                    break;
            }
        } else {
            jsonTokenV2 = JsonToken.START_OBJECT;
        }
        this.z = jsonTokenV2;
        return strU2;
    }

    public void E2(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        do {
            if (this.q < this.f41402r || i2()) {
                byte[] bArr = this.Y;
                int i = this.q;
                this.q = i + 1;
                char cV1 = (char) V1(bArr[i]);
                if (Character.isJavaIdentifierPart(cV1)) {
                    sb.append(cV1);
                }
            }
            Z0("Unrecognized token '%s': was expecting %s", sb, str2);
        } while (sb.length() < 256);
        sb.append("...");
        Z0("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String F0() throws IOException {
        if (this.c != JsonToken.FIELD_NAME) {
            if (G0() == JsonToken.VALUE_STRING) {
                return d0();
            }
            return null;
        }
        this.C = false;
        JsonToken jsonToken = this.z;
        this.z = null;
        this.c = jsonToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this.S) {
                return this.A.l();
            }
            this.S = false;
            return a2();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this.y = this.y.m(this.w, this.x);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.y = this.y.n(this.w, this.x);
        }
        return null;
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public JsonToken G0() throws IOException {
        JsonToken jsonTokenV2;
        JsonToken jsonToken = this.c;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return p2();
        }
        this.F = 0;
        if (this.S) {
            L2();
        }
        int iR2 = R2();
        if (iR2 < 0) {
            close();
            this.c = null;
            return null;
        }
        this.E = null;
        if (iR2 == 93) {
            R1();
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            this.c = jsonToken3;
            return jsonToken3;
        }
        if (iR2 == 125) {
            S1();
            JsonToken jsonToken4 = JsonToken.END_OBJECT;
            this.c = jsonToken4;
            return jsonToken4;
        }
        if (this.y.p()) {
            if (iR2 != 44) {
                e1(iR2, "was expecting comma to separate " + this.y.j() + " entries");
            }
            iR2 = P2();
            if ((this.f7621a & c0) != 0 && (iR2 == 93 || iR2 == 125)) {
                return T1(iR2);
            }
        }
        if (!this.y.g()) {
            U2();
            return q2(iR2);
        }
        V2();
        this.y.u(u2(iR2));
        this.c = jsonToken2;
        int iH2 = H2();
        U2();
        if (iH2 == 34) {
            this.S = true;
            this.z = JsonToken.VALUE_STRING;
            return this.c;
        }
        if (iH2 == 45) {
            jsonTokenV2 = v2();
        } else if (iH2 == 91) {
            jsonTokenV2 = JsonToken.START_ARRAY;
        } else if (iH2 == 102) {
            k2();
            jsonTokenV2 = JsonToken.VALUE_FALSE;
        } else if (iH2 == 110) {
            l2();
            jsonTokenV2 = JsonToken.VALUE_NULL;
        } else if (iH2 == 116) {
            o2();
            jsonTokenV2 = JsonToken.VALUE_TRUE;
        } else if (iH2 != 123) {
            switch (iH2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonTokenV2 = x2(iH2);
                    break;
                default:
                    jsonTokenV2 = h2(iH2);
                    break;
            }
        } else {
            jsonTokenV2 = JsonToken.START_OBJECT;
        }
        this.z = jsonTokenV2;
        return this.c;
    }

    public final void G2() throws IOException {
        if (this.q < this.f41402r || i2()) {
            byte[] bArr = this.Y;
            int i = this.q;
            if (bArr[i] == 10) {
                this.q = i + 1;
            }
        }
        this.t++;
        this.u = this.q;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int K0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this.S || this.c != JsonToken.VALUE_STRING) {
            byte[] bArrS = s(base64Variant);
            outputStream.write(bArrS);
            return bArrS.length;
        }
        byte[] bArrD = this.o.d();
        try {
            return y2(base64Variant, outputStream, bArrD);
        } finally {
            this.o.o(bArrD);
        }
    }

    public void L2() throws IOException {
        this.S = false;
        int[] iArr = a0;
        byte[] bArr = this.Y;
        while (true) {
            int i = this.q;
            int i2 = this.f41402r;
            if (i >= i2) {
                j2();
                i = this.q;
                i2 = this.f41402r;
            }
            while (true) {
                if (i >= i2) {
                    this.q = i;
                    break;
                }
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                int i5 = iArr[i4];
                if (i5 != 0) {
                    this.q = i3;
                    if (i4 != 34) {
                        if (i5 == 1) {
                            r1();
                            break;
                        }
                        if (i5 == 2) {
                            M2();
                            break;
                        }
                        if (i5 == 3) {
                            N2();
                            break;
                        }
                        if (i5 == 4) {
                            O2(i4);
                            break;
                        } else if (i4 >= 32) {
                            z2(i4);
                            break;
                        } else {
                            h1(i4, "string value");
                            break;
                        }
                    }
                    return;
                }
                i = i3;
            }
        }
    }

    public final void O2(int i) throws IOException {
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr = this.Y;
        int i2 = this.q;
        int i3 = i2 + 1;
        this.q = i3;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            C2(b2 & 255, i3);
        }
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr2 = this.Y;
        int i4 = this.q;
        int i5 = i4 + 1;
        this.q = i5;
        byte b3 = bArr2[i4];
        if ((b3 & 192) != 128) {
            C2(b3 & 255, i5);
        }
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr3 = this.Y;
        int i6 = this.q;
        int i7 = i6 + 1;
        this.q = i7;
        byte b4 = bArr3[i6];
        if ((b4 & 192) != 128) {
            C2(b4 & 255, i7);
        }
    }

    public final int Q2() throws IOException {
        while (true) {
            if (this.q >= this.f41402r && !i2()) {
                throw a("Unexpected end-of-input within/between " + this.y.j() + " entries");
            }
            byte[] bArr = this.Y;
            int i = this.q;
            int i2 = i + 1;
            this.q = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    J2();
                } else if (i3 != 35 || !T2()) {
                    return i3;
                }
            } else if (i3 != 32) {
                if (i3 == 10) {
                    this.t++;
                    this.u = i2;
                } else if (i3 == 13) {
                    G2();
                } else if (i3 != 9) {
                    g1(i3);
                }
            }
        }
    }

    public final void R1() throws JsonParseException {
        U2();
        if (!this.y.f()) {
            B1(93, AbstractJsonLexerKt.END_OBJ);
        }
        this.y = this.y.l();
    }

    public final void S1() throws JsonParseException {
        U2();
        if (!this.y.g()) {
            B1(125, AbstractJsonLexerKt.END_LIST);
        }
        this.y = this.y.l();
    }

    public final JsonToken T1(int i) throws JsonParseException {
        if (i == 125) {
            S1();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this.c = jsonToken;
            return jsonToken;
        }
        R1();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this.c = jsonToken2;
        return jsonToken2;
    }

    public final byte[] U1(Base64Variant base64Variant) throws IOException {
        t63 t63VarT1 = t1();
        while (true) {
            if (this.q >= this.f41402r) {
                j2();
            }
            byte[] bArr = this.Y;
            int i = this.q;
            this.q = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(i2);
                if (iDecodeBase64Char < 0) {
                    if (i2 == 34) {
                        return t63VarT1.D();
                    }
                    iDecodeBase64Char = q1(base64Variant, i2, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this.q >= this.f41402r) {
                    j2();
                }
                byte[] bArr2 = this.Y;
                int i3 = this.q;
                this.q = i3 + 1;
                int i4 = bArr2[i3] & 255;
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(i4);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = q1(base64Variant, i4, 1);
                }
                int i5 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this.q >= this.f41402r) {
                    j2();
                }
                byte[] bArr3 = this.Y;
                int i6 = this.q;
                this.q = i6 + 1;
                int i7 = bArr3[i6] & 255;
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(i7);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i7 == 34) {
                            t63VarT1.b(i5 >> 4);
                            if (base64Variant.usesPadding()) {
                                this.q--;
                                v1(base64Variant);
                            }
                            return t63VarT1.D();
                        }
                        iDecodeBase64Char3 = q1(base64Variant, i7, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this.q >= this.f41402r) {
                            j2();
                        }
                        byte[] bArr4 = this.Y;
                        int i8 = this.q;
                        this.q = i8 + 1;
                        int i9 = bArr4[i8] & 255;
                        if (!base64Variant.usesPaddingChar(i9) && q1(base64Variant, i9, 3) != -2) {
                            throw L1(base64Variant, i9, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        t63VarT1.b(i5 >> 4);
                    }
                }
                int i10 = (i5 << 6) | iDecodeBase64Char3;
                if (this.q >= this.f41402r) {
                    j2();
                }
                byte[] bArr5 = this.Y;
                int i11 = this.q;
                this.q = i11 + 1;
                int i12 = bArr5[i11] & 255;
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i12);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i12 == 34) {
                            t63VarT1.d(i10 >> 2);
                            if (base64Variant.usesPadding()) {
                                this.q--;
                                v1(base64Variant);
                            }
                            return t63VarT1.D();
                        }
                        iDecodeBase64Char4 = q1(base64Variant, i12, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        t63VarT1.d(i10 >> 2);
                    }
                }
                t63VarT1.c((i10 << 6) | iDecodeBase64Char4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public int V1(int i) throws IOException {
        char c;
        int iD3;
        int i2;
        int iD4;
        int i3;
        int iD5;
        int i4 = i & 255;
        if (i4 <= 127) {
            return i4;
        }
        if ((i & SportReportBaseParser.ReportType.avgFreq) != 192) {
            if ((i & 240) == 224) {
                i4 = i & 15;
                c = 2;
            } else if ((i & 248) == 240) {
                i4 = i & 7;
                c = 3;
            } else {
                A2(i & 255);
            }
            iD3 = d3();
            if ((iD3 & 192) != 128) {
                B2(iD3 & 255);
            }
            i2 = (i4 << 6) | (iD3 & 63);
            if (c > 1) {
                return i2;
            }
            iD4 = d3();
            if ((iD4 & 192) != 128) {
                B2(iD4 & 255);
            }
            i3 = (i2 << 6) | (iD4 & 63);
            if (c > 2) {
                return i3;
            }
            iD5 = d3();
            if ((iD5 & 192) != 128) {
                B2(iD5 & 255);
            }
            return (i3 << 6) | (iD5 & 63);
        }
        i4 = i & 31;
        c = 1;
        iD3 = d3();
        if ((iD3 & 192) != 128) {
            B2(iD3 & 255);
        }
        i2 = (i4 << 6) | (iD3 & 63);
        if (c > 1) {
            return i2;
        }
        iD4 = d3();
        if ((iD4 & 192) != 128) {
            B2(iD4 & 255);
        }
        i3 = (i2 << 6) | (iD4 & 63);
        if (c > 2) {
            return i3;
        }
        iD5 = d3();
        if ((iD5 & 192) != 128) {
            B2(iD5 & 255);
        }
        return (i3 << 6) | (iD5 & 63);
    }

    public final int W2() throws IOException {
        int i;
        if ((this.q >= this.f41402r && !i2()) || (i = this.Y[this.q] & 255) < 48 || i > 57) {
            return 48;
        }
        if (!A0(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            j1("Leading zeroes not allowed");
        }
        this.q++;
        if (i == 48) {
            do {
                if (this.q >= this.f41402r && !i2()) {
                    break;
                }
                byte[] bArr = this.Y;
                int i2 = this.q;
                i = bArr[i2] & 255;
                if (i < 48 || i > 57) {
                    return 48;
                }
                this.q = i2 + 1;
            } while (i == 48);
        }
        return i;
    }

    public final int Y1(int i) throws IOException {
        int i2 = i & 15;
        byte[] bArr = this.Y;
        int i3 = this.q;
        int i4 = i3 + 1;
        this.q = i4;
        byte b2 = bArr[i3];
        if ((b2 & 192) != 128) {
            C2(b2 & 255, i4);
        }
        int i5 = (i2 << 6) | (b2 & 63);
        byte[] bArr2 = this.Y;
        int i6 = this.q;
        int i7 = i6 + 1;
        this.q = i7;
        byte b3 = bArr2[i6];
        if ((b3 & 192) != 128) {
            C2(b3 & 255, i7);
        }
        return (i5 << 6) | (b3 & 63);
    }

    public String a2() throws IOException {
        int i = this.q;
        if (i >= this.f41402r) {
            j2();
            i = this.q;
        }
        char[] cArrM = this.A.m();
        int[] iArr = a0;
        int iMin = Math.min(this.f41402r, cArrM.length + i);
        byte[] bArr = this.Y;
        int i2 = 0;
        while (i < iMin) {
            int i3 = bArr[i] & 255;
            if (iArr[i3] != 0) {
                if (i3 != 34) {
                    break;
                }
                this.q = i + 1;
                return this.A.D(i2);
            }
            i++;
            cArrM[i2] = (char) i3;
            i2++;
        }
        this.q = i;
        c2(cArrM, i2);
        return this.A.l();
    }

    public void b2() throws IOException {
        int i = this.q;
        if (i >= this.f41402r) {
            j2();
            i = this.q;
        }
        char[] cArrM = this.A.m();
        int[] iArr = a0;
        int iMin = Math.min(this.f41402r, cArrM.length + i);
        byte[] bArr = this.Y;
        int i2 = 0;
        while (i < iMin) {
            int i3 = bArr[i] & 255;
            if (iArr[i3] != 0) {
                if (i3 != 34) {
                    break;
                }
                this.q = i + 1;
                this.A.E(i2);
                return;
            }
            i++;
            cArrM[i2] = (char) i3;
            i2++;
        }
        this.q = i;
        c2(cArrM, i2);
    }

    public final void c2(char[] cArr, int i) throws IOException {
        int[] iArr = a0;
        byte[] bArr = this.Y;
        while (true) {
            int i2 = this.q;
            if (i2 >= this.f41402r) {
                j2();
                i2 = this.q;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this.A.p();
                i = 0;
            }
            int iMin = Math.min(this.f41402r, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= iMin) {
                    this.q = i2;
                    break;
                }
                int i4 = i2 + 1;
                int iR1 = bArr[i2] & 255;
                int i5 = iArr[iR1];
                if (i5 != 0) {
                    this.q = i4;
                    if (iR1 != 34) {
                        if (i5 == 1) {
                            iR1 = r1();
                        } else if (i5 == 2) {
                            iR1 = W1(iR1);
                        } else if (i5 == 3) {
                            iR1 = this.f41402r - i4 >= 2 ? Y1(iR1) : X1(iR1);
                        } else if (i5 == 4) {
                            int iZ1 = Z1(iR1);
                            int i6 = i + 1;
                            cArr[i] = (char) ((iZ1 >> 10) | 55296);
                            if (i6 >= cArr.length) {
                                cArr = this.A.p();
                                i = 0;
                            } else {
                                i = i6;
                            }
                            iR1 = (iZ1 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                        } else if (iR1 < 32) {
                            h1(iR1, "string value");
                        } else {
                            z2(iR1);
                        }
                        if (i >= cArr.length) {
                            cArr = this.A.p();
                        } else {
                            i3 = i;
                        }
                        i = i3 + 1;
                        cArr[i3] = (char) iR1;
                        break;
                    }
                    this.A.E(i);
                    return;
                }
                cArr[i] = (char) iR1;
                i2 = i4;
                i++;
            }
        }
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public String d0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return d2(jsonToken);
        }
        if (!this.S) {
            return this.A.l();
        }
        this.S = false;
        return a2();
    }

    public final String d2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            return (iId == 6 || iId == 7 || iId == 8) ? this.A.l() : jsonToken.asString();
        }
        return this.y.b();
    }

    public final int d3() throws IOException {
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr = this.Y;
        int i = this.q;
        this.q = i + 1;
        return bArr[i] & 255;
    }

    public JsonToken e2() throws IOException {
        char[] cArrM = this.A.m();
        int[] iArr = a0;
        byte[] bArr = this.Y;
        int i = 0;
        while (true) {
            if (this.q >= this.f41402r) {
                j2();
            }
            if (i >= cArrM.length) {
                cArrM = this.A.p();
                i = 0;
            }
            int i2 = this.f41402r;
            int length = this.q + (cArrM.length - i);
            if (length < i2) {
                i2 = length;
            }
            while (true) {
                int i3 = this.q;
                if (i3 >= i2) {
                    break;
                }
                int i4 = i3 + 1;
                this.q = i4;
                int iR1 = bArr[i3] & 255;
                if (iR1 == 39 || iArr[iR1] != 0) {
                    if (iR1 != 39) {
                        int i5 = iArr[iR1];
                        if (i5 == 1) {
                            iR1 = r1();
                        } else if (i5 == 2) {
                            iR1 = W1(iR1);
                        } else if (i5 == 3) {
                            iR1 = this.f41402r - i4 >= 2 ? Y1(iR1) : X1(iR1);
                        } else if (i5 != 4) {
                            if (iR1 < 32) {
                                h1(iR1, "string value");
                            }
                            z2(iR1);
                        } else {
                            int iZ1 = Z1(iR1);
                            int i6 = i + 1;
                            cArrM[i] = (char) ((iZ1 >> 10) | 55296);
                            if (i6 >= cArrM.length) {
                                cArrM = this.A.p();
                                i = 0;
                            } else {
                                i = i6;
                            }
                            iR1 = 56320 | (iZ1 & 1023);
                        }
                        if (i >= cArrM.length) {
                            cArrM = this.A.p();
                            i = 0;
                        }
                        cArrM[i] = (char) iR1;
                        i++;
                        break;
                    }
                    this.A.E(i);
                    return JsonToken.VALUE_STRING;
                }
                cArrM[i] = (char) iR1;
                i++;
            }
        }
    }

    public final String e3(int[] iArr, int i, int i2, int i3, int i4) throws IOException {
        int[] iArr2 = b0;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    h1(i3, "name");
                } else {
                    i3 = r1();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = zkh.J1(iArr, iArr.length);
                            this.R = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (i3 >> 6) | 192;
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | (i3 >> 12) | SportReportBaseParser.ReportType.avgFreq;
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = zkh.J1(iArr, iArr.length);
                                this.R = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = zkh.J1(iArr, iArr.length);
                    this.R = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.q >= this.f41402r && !i2()) {
                b1(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this.Y;
            int i8 = this.q;
            this.q = i8 + 1;
            i3 = bArr[i8] & 255;
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = zkh.J1(iArr, iArr.length);
                this.R = iArr;
            }
            iArr[i] = r2(i2, i4);
            i++;
        }
        String strF = this.Q.F(iArr, i);
        return strF == null ? Y2(iArr, i, i4) : strF;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] f0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            if (iId != 6) {
                if (iId != 7 && iId != 8) {
                    return this.c.asCharArray();
                }
            } else if (this.S) {
                this.S = false;
                b2();
            }
            return this.A.t();
        }
        if (!this.C) {
            String strB = this.y.b();
            int length = strB.length();
            char[] cArr = this.B;
            if (cArr == null) {
                this.B = this.o.f(length);
            } else if (cArr.length < length) {
                this.B = new char[length];
            }
            strB.getChars(0, length, this.B, 0);
            this.C = true;
        }
        return this.B;
    }

    public JsonToken f2(int i, boolean z) throws IOException {
        String str;
        while (i == 73) {
            if (this.q >= this.f41402r && !i2()) {
                c1(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this.Y;
            int i2 = this.q;
            this.q = i2 + 1;
            i = bArr[i2];
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            m2(str, 3);
            if (A0(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                return N1(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            Y0("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        m1(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    public final String f3(int i, int i2, int i3) throws IOException {
        int[] iArr = this.R;
        iArr[0] = this.T;
        iArr[1] = i2;
        iArr[2] = i3;
        byte[] bArr = this.Y;
        int[] iArr2 = b0;
        int i4 = i;
        int i5 = 3;
        while (true) {
            int i6 = this.q;
            if (i6 + 4 > this.f41402r) {
                return e3(this.R, i5, 0, i4, 0);
            }
            int i7 = i6 + 1;
            this.q = i7;
            int i8 = bArr[i6] & 255;
            if (iArr2[i8] != 0) {
                return i8 == 34 ? c3(this.R, i5, i4, 1) : e3(this.R, i5, i4, i8, 1);
            }
            int i9 = (i4 << 8) | i8;
            int i10 = i6 + 2;
            this.q = i10;
            int i11 = bArr[i7] & 255;
            if (iArr2[i11] != 0) {
                return i11 == 34 ? c3(this.R, i5, i9, 2) : e3(this.R, i5, i9, i11, 2);
            }
            int i12 = (i9 << 8) | i11;
            int i13 = i6 + 3;
            this.q = i13;
            int i14 = bArr[i10] & 255;
            if (iArr2[i14] != 0) {
                return i14 == 34 ? c3(this.R, i5, i12, 3) : e3(this.R, i5, i12, i14, 3);
            }
            int i15 = (i12 << 8) | i14;
            this.q = i6 + 4;
            int i16 = bArr[i13] & 255;
            if (iArr2[i16] != 0) {
                return i16 == 34 ? c3(this.R, i5, i15, 4) : e3(this.R, i5, i15, i16, 4);
            }
            int[] iArr3 = this.R;
            if (i5 >= iArr3.length) {
                this.R = zkh.J1(iArr3, i5);
            }
            this.R[i5] = i15;
            i4 = i16;
            i5++;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int g0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == null) {
            return 0;
        }
        int iId = jsonToken.id();
        if (iId == 5) {
            return this.y.b().length();
        }
        if (iId != 6) {
            if (iId != 7 && iId != 8) {
                return this.c.asCharArray().length;
            }
        } else if (this.S) {
            this.S = false;
            b2();
        }
        return this.A.F();
    }

    public String g2(int i) throws IOException {
        if (i == 39 && A0(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return s2();
        }
        if (!A0(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            e1((char) V1(i), "was expecting double-quote to start field name");
        }
        int[] iArrJ = xt3.j();
        if (iArrJ[i] != 0) {
            e1(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrJ1 = this.R;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i4 = i | (i4 << 8);
            } else {
                if (i3 >= iArrJ1.length) {
                    iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                    this.R = iArrJ1;
                }
                iArrJ1[i3] = i4;
                i4 = i;
                i3++;
                i2 = 1;
            }
            if (this.q >= this.f41402r && !i2()) {
                b1(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this.Y;
            int i5 = this.q;
            i = bArr[i5] & 255;
            if (iArrJ[i] != 0) {
                break;
            }
            this.q = i5 + 1;
        }
        if (i2 > 0) {
            if (i3 >= iArrJ1.length) {
                iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                this.R = iArrJ1;
            }
            iArrJ1[i3] = i4;
            i3++;
        }
        String strF = this.Q.F(iArrJ1, i3);
        return strF == null ? Y2(iArrJ1, i3, i2) : strF;
    }

    public final String g3(int i) throws IOException {
        byte[] bArr = this.Y;
        int[] iArr = b0;
        int i2 = this.q;
        int i3 = i2 + 1;
        this.q = i3;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            return i4 == 34 ? a3(this.T, i, 1) : j3(this.T, i, i4, 1);
        }
        int i5 = (i << 8) | i4;
        int i6 = i2 + 2;
        this.q = i6;
        int i7 = bArr[i3] & 255;
        if (iArr[i7] != 0) {
            return i7 == 34 ? a3(this.T, i5, 2) : j3(this.T, i5, i7, 2);
        }
        int i8 = (i5 << 8) | i7;
        int i9 = i2 + 3;
        this.q = i9;
        int i10 = bArr[i6] & 255;
        if (iArr[i10] != 0) {
            return i10 == 34 ? a3(this.T, i8, 3) : j3(this.T, i8, i10, 3);
        }
        int i11 = (i8 << 8) | i10;
        this.q = i2 + 4;
        int i12 = bArr[i9] & 255;
        if (iArr[i12] != 0) {
            return i12 == 34 ? a3(this.T, i11, 4) : j3(this.T, i11, i12, 4);
        }
        return h3(i12, i11);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3.y.f() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (A0(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        r3.q--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.core.JsonToken h2(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L95
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L7b
            r0 = 78
            if (r4 == r0) goto L61
            r0 = 93
            if (r4 == r0) goto L42
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L5b
            r0 = 43
            if (r4 == r0) goto L1f
            r0 = 44
            if (r4 == r0) goto L4b
            goto La2
        L1f:
            int r4 = r3.q
            int r0 = r3.f41402r
            if (r4 < r0) goto L30
            boolean r4 = r3.i2()
            if (r4 != 0) goto L30
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3.c1(r4)
        L30:
            byte[] r4 = r3.Y
            int r0 = r3.q
            int r1 = r0 + 1
            r3.q = r1
            r4 = r4[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3.f2(r4, r0)
            return r4
        L42:
            utd r0 = r3.y
            boolean r0 = r0.f()
            if (r0 != 0) goto L4b
            goto La2
        L4b:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.A0(r0)
            if (r0 == 0) goto L5b
            int r4 = r3.q
            int r4 = r4 - r1
            r3.q = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L5b:
            java.lang.String r0 = "expected a value"
            r3.e1(r4, r0)
            goto L95
        L61:
            java.lang.String r0 = "NaN"
            r3.m2(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.A0(r1)
            if (r1 == 0) goto L75
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.N1(r0, r1)
            return r4
        L75:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3.X0(r0)
            goto La2
        L7b:
            java.lang.String r0 = "Infinity"
            r3.m2(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.A0(r1)
            if (r1 == 0) goto L8f
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.N1(r0, r1)
            return r4
        L8f:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3.X0(r0)
            goto La2
        L95:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.A0(r0)
            if (r0 == 0) goto La2
            com.fasterxml.jackson.core.JsonToken r4 = r3.e2()
            return r4
        La2:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lbf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "('true', 'false' or 'null')"
            r3.E2(r0, r1)
        Lbf:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3.e1(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8q.h2(int):com.fasterxml.jackson.core.JsonToken");
    }

    public final String h3(int i, int i2) throws IOException {
        byte[] bArr = this.Y;
        int[] iArr = b0;
        int i3 = this.q;
        int i4 = i3 + 1;
        this.q = i4;
        int i5 = bArr[i3] & 255;
        if (iArr[i5] != 0) {
            return i5 == 34 ? b3(this.T, i2, i, 1) : k3(this.T, i2, i, i5, 1);
        }
        int i6 = (i << 8) | i5;
        int i7 = i3 + 2;
        this.q = i7;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            return i8 == 34 ? b3(this.T, i2, i6, 2) : k3(this.T, i2, i6, i8, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i3 + 3;
        this.q = i10;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            return i11 == 34 ? b3(this.T, i2, i9, 3) : k3(this.T, i2, i9, i11, 3);
        }
        int i12 = (i9 << 8) | i11;
        this.q = i3 + 4;
        int i13 = bArr[i10] & 255;
        if (iArr[i13] != 0) {
            return i13 == 34 ? b3(this.T, i2, i12, 4) : k3(this.T, i2, i12, i13, 4);
        }
        return f3(i13, i2, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int i0() throws java.io.IOException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3.c
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3.S
            if (r0 == 0) goto L1d
            r3.S = r1
            r3.b2()
        L1d:
            o7p r0 = r3.A
            int r0 = r0.u()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8q.i0():int");
    }

    public final boolean i2() throws IOException {
        byte[] bArr;
        int length;
        int i = this.f41402r;
        this.s += (long) i;
        this.u -= i;
        this.U -= i;
        InputStream inputStream = this.X;
        if (inputStream == null || (length = (bArr = this.Y).length) == 0) {
            return false;
        }
        int i2 = inputStream.read(bArr, 0, length);
        if (i2 > 0) {
            this.q = 0;
            this.f41402r = i2;
            return true;
        }
        o1();
        if (i2 == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.Y.length + " bytes");
        }
        return false;
    }

    public void j2() throws IOException {
        if (i2()) {
            return;
        }
        a1();
    }

    public final void k2() throws IOException {
        int i;
        int i2 = this.q;
        if (i2 + 4 < this.f41402r) {
            byte[] bArr = this.Y;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 115) {
                        int i6 = i2 + 4;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || i == 93 || i == 125)) {
                            this.q = i6;
                            return;
                        }
                    }
                }
            }
        }
        n2("false", 1);
    }

    public final void l2() throws IOException {
        int i;
        int i2 = this.q;
        if (i2 + 3 < this.f41402r) {
            byte[] bArr = this.Y;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.q = i5;
                        return;
                    }
                }
            }
        }
        n2(AbstractJsonLexerKt.NULL, 1);
    }

    public String l3() throws IOException {
        if (this.q >= this.f41402r && !i2()) {
            b1(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this.Y;
        int i = this.q;
        this.q = i + 1;
        int i2 = bArr[i] & 255;
        return i2 == 34 ? "" : e3(this.R, 0, 0, i2, 0);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation m0() {
        if (this.c != JsonToken.FIELD_NAME) {
            return new JsonLocation(u1(), this.v - 1, -1L, this.w, this.x);
        }
        return new JsonLocation(u1(), this.s + ((long) (this.U - 1)), -1L, this.V, this.W);
    }

    public final void m2(String str, int i) throws IOException {
        int i2;
        int length = str.length();
        if (this.q + length >= this.f41402r) {
            n2(str, i);
            return;
        }
        do {
            if (this.Y[this.q] != str.charAt(i)) {
                D2(str.substring(0, i));
            }
            i2 = this.q + 1;
            this.q = i2;
            i++;
        } while (i < length);
        int i3 = this.Y[i2] & 255;
        if (i3 < 48 || i3 == 93 || i3 == 125) {
            return;
        }
        Q1(str, i, i3);
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public int o0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.r0(0);
        }
        int i = this.F;
        if ((i & 1) == 0) {
            if (i == 0) {
                return w1();
            }
            if ((i & 1) == 0) {
                G1();
            }
        }
        return this.G;
    }

    @Override // defpackage.zkh
    public void o1() throws IOException {
        if (this.X != null) {
            if (this.o.n() || A0(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.X.close();
            }
            this.X = null;
        }
    }

    public final void o2() throws IOException {
        int i;
        int i2 = this.q;
        if (i2 + 3 < this.f41402r) {
            byte[] bArr = this.Y;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i2 + 2;
                if (bArr[i3] == 117) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.q = i5;
                        return;
                    }
                }
            }
        }
        n2("true", 1);
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public int r0(int i) throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.r0(i);
        }
        int i2 = this.F;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return w1();
            }
            if ((i2 & 1) == 0) {
                G1();
            }
        }
        return this.G;
    }

    @Override // defpackage.zkh
    public char r1() throws IOException {
        if (this.q >= this.f41402r && !i2()) {
            b1(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this.Y;
        int i = this.q;
        this.q = i + 1;
        byte b2 = bArr[i];
        if (b2 == 34 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return '\b';
        }
        if (b2 == 102) {
            return '\f';
        }
        if (b2 == 110) {
            return '\n';
        }
        if (b2 == 114) {
            return StringUtil.CARRIAGE_RETURN;
        }
        if (b2 == 116) {
            return '\t';
        }
        if (b2 != 117) {
            return T0((char) V1(b2));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.q >= this.f41402r && !i2()) {
                b1(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this.Y;
            int i4 = this.q;
            this.q = i4 + 1;
            byte b3 = bArr2[i4];
            int iB = xt3.b(b3);
            if (iB < 0) {
                e1(b3, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iB;
        }
        return (char) i2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] s(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this.E == null)) {
            X0("Current token (" + this.c + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.S) {
            try {
                this.E = U1(base64Variant);
                this.S = false;
            } catch (IllegalArgumentException e) {
                throw a("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
            }
        } else if (this.E == null) {
            t63 t63VarT1 = t1();
            Q0(d0(), t63VarT1, base64Variant);
            this.E = t63VarT1.D();
        }
        return this.E;
    }

    public String s2() throws IOException {
        if (this.q >= this.f41402r && !i2()) {
            b1(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this.Y;
        int i = this.q;
        this.q = i + 1;
        int iR1 = bArr[i] & 255;
        if (iR1 == 39) {
            return "";
        }
        int[] iArrJ1 = this.R;
        int[] iArr = b0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (iR1 != 39) {
            if (iArr[iR1] != 0 && iR1 != 34) {
                if (iR1 != 92) {
                    h1(iR1, "name");
                } else {
                    iR1 = r1();
                }
                if (iR1 > 127) {
                    if (i2 >= 4) {
                        if (i3 >= iArrJ1.length) {
                            iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                            this.R = iArrJ1;
                        }
                        iArrJ1[i3] = i4;
                        i4 = 0;
                        i3++;
                        i2 = 0;
                    }
                    if (iR1 < 2048) {
                        i4 = (i4 << 8) | (iR1 >> 6) | 192;
                        i2++;
                    } else {
                        int i5 = (i4 << 8) | (iR1 >> 12) | SportReportBaseParser.ReportType.avgFreq;
                        int i6 = i2 + 1;
                        if (i6 >= 4) {
                            if (i3 >= iArrJ1.length) {
                                iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                                this.R = iArrJ1;
                            }
                            iArrJ1[i3] = i5;
                            i5 = 0;
                            i3++;
                            i6 = 0;
                        }
                        i4 = (i5 << 8) | ((iR1 >> 6) & 63) | 128;
                        i2 = i6 + 1;
                    }
                    iR1 = (iR1 & 63) | 128;
                }
            }
            if (i2 < 4) {
                i2++;
                i4 = iR1 | (i4 << 8);
            } else {
                if (i3 >= iArrJ1.length) {
                    iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                    this.R = iArrJ1;
                }
                iArrJ1[i3] = i4;
                i4 = iR1;
                i3++;
                i2 = 1;
            }
            if (this.q >= this.f41402r && !i2()) {
                b1(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this.Y;
            int i7 = this.q;
            this.q = i7 + 1;
            iR1 = bArr2[i7] & 255;
        }
        if (i2 > 0) {
            if (i3 >= iArrJ1.length) {
                iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                this.R = iArrJ1;
            }
            iArrJ1[i3] = r2(i4, i2);
            i3++;
        }
        String strF = this.Q.F(iArrJ1, i3);
        return strF == null ? Y2(iArrJ1, i3, i2) : strF;
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public String u0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? J() : super.v0(null);
        }
        if (!this.S) {
            return this.A.l();
        }
        this.S = false;
        return a2();
    }

    public final String u2(int i) throws IOException {
        if (i != 34) {
            return g2(i);
        }
        int i2 = this.q;
        if (i2 + 13 > this.f41402r) {
            return l3();
        }
        byte[] bArr = this.Y;
        int[] iArr = b0;
        int i3 = i2 + 1;
        this.q = i3;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            return i4 == 34 ? "" : i3(0, i4, 0);
        }
        int i5 = i2 + 2;
        this.q = i5;
        int i6 = bArr[i3] & 255;
        if (iArr[i6] != 0) {
            return i6 == 34 ? Z2(i4, 1) : i3(i4, i6, 1);
        }
        int i7 = i6 | (i4 << 8);
        int i8 = i2 + 3;
        this.q = i8;
        int i9 = bArr[i5] & 255;
        if (iArr[i9] != 0) {
            return i9 == 34 ? Z2(i7, 2) : i3(i7, i9, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i2 + 4;
        this.q = i11;
        int i12 = bArr[i8] & 255;
        if (iArr[i12] != 0) {
            return i12 == 34 ? Z2(i10, 3) : i3(i10, i12, 3);
        }
        int i13 = (i10 << 8) | i12;
        this.q = i2 + 5;
        int i14 = bArr[i11] & 255;
        if (iArr[i14] != 0) {
            return i14 == 34 ? Z2(i13, 4) : i3(i13, i14, 4);
        }
        this.T = i13;
        return g3(i14);
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public String v0(String str) throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? J() : super.v0(str);
        }
        if (!this.S) {
            return this.A.l();
        }
        this.S = false;
        return a2();
    }

    public JsonToken v2() throws IOException {
        char[] cArrM = this.A.m();
        cArrM[0] = '-';
        if (this.q >= this.f41402r) {
            j2();
        }
        byte[] bArr = this.Y;
        int i = this.q;
        this.q = i + 1;
        int iW2 = bArr[i] & 255;
        if (iW2 <= 48) {
            if (iW2 != 48) {
                return f2(iW2, true);
            }
            iW2 = W2();
        } else if (iW2 > 57) {
            return f2(iW2, true);
        }
        cArrM[1] = (char) iW2;
        int i2 = 2;
        int iMin = Math.min(this.f41402r, (this.q + cArrM.length) - 2);
        int i3 = 1;
        while (true) {
            int i4 = this.q;
            if (i4 >= iMin) {
                return w2(cArrM, i2, true, i3);
            }
            byte[] bArr2 = this.Y;
            this.q = i4 + 1;
            int i5 = bArr2[i4] & 255;
            if (i5 < 48 || i5 > 57) {
                if (i5 == 46 || i5 == 101 || i5 == 69) {
                    return t2(cArrM, i2, i5, true, i3);
                }
                this.q = i4;
                this.A.E(i2);
                if (this.y.h()) {
                    X2(i5);
                }
                return P1(true, i3);
            }
            i3++;
            cArrM[i2] = (char) i5;
            i2++;
        }
    }

    public final JsonToken w2(char[] cArr, int i, boolean z, int i2) throws IOException {
        char[] cArrP = cArr;
        int i3 = i;
        int i4 = i2;
        while (true) {
            if (this.q >= this.f41402r && !i2()) {
                this.A.E(i3);
                return P1(z, i4);
            }
            byte[] bArr = this.Y;
            int i5 = this.q;
            this.q = i5 + 1;
            int i6 = bArr[i5] & 255;
            if (i6 > 57 || i6 < 48) {
                if (i6 == 46 || i6 == 101 || i6 == 69) {
                    return t2(cArrP, i3, i6, z, i4);
                }
                this.q = i5;
                this.A.E(i3);
                if (this.y.h()) {
                    X2(this.Y[this.q] & 255);
                }
                return P1(z, i4);
            }
            if (i3 >= cArrP.length) {
                i3 = 0;
                cArrP = this.A.p();
            }
            cArrP[i3] = (char) i6;
            i4++;
            i3++;
        }
    }

    public JsonToken x2(int i) throws IOException {
        char[] cArrM = this.A.m();
        if (i == 48) {
            i = W2();
        }
        cArrM[0] = (char) i;
        int iMin = Math.min(this.f41402r, (this.q + cArrM.length) - 1);
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int i4 = this.q;
            if (i4 >= iMin) {
                return w2(cArrM, i2, false, i3);
            }
            byte[] bArr = this.Y;
            this.q = i4 + 1;
            int i5 = bArr[i4] & 255;
            if (i5 < 48 || i5 > 57) {
                if (i5 == 46 || i5 == 101 || i5 == 69) {
                    return t2(cArrM, i2, i5, false, i3);
                }
                this.q = i4;
                this.A.E(i2);
                if (this.y.h()) {
                    X2(i5);
                }
                return P1(false, i3);
            }
            i3++;
            cArrM[i2] = (char) i5;
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c A[DONT_INVERT, PHI: r10
      0x003c: PHI (r10v4 int) = (r10v3 int), (r10v24 int) binds: [B:9:0x002d, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0125 A[EDGE_INSN: B:56:0x0125->B:57:0x012d BREAK  A[LOOP:0: B:3:0x000e->B:77:0x000e]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0136  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0150  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0112 A[SYNTHETIC] */
    public int y2(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i;
        int i2;
        int iDecodeBase64Char;
        int i3;
        int i4;
        int iDecodeBase64Char2;
        int i5;
        int i6;
        int iDecodeBase64Char3;
        int i7;
        int i8 = 3;
        int length = bArr.length - 3;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (this.q >= this.f41402r) {
                j2();
            }
            byte[] bArr2 = this.Y;
            int i11 = this.q;
            this.q = i11 + 1;
            int i12 = bArr2[i11] & 255;
            if (i12 > 32) {
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i12);
                if (iDecodeBase64Char4 < 0) {
                    if (i12 == 34) {
                        break;
                    }
                    iDecodeBase64Char4 = q1(base64Variant, i12, 0);
                    if (iDecodeBase64Char4 >= 0) {
                        if (i9 > length) {
                            i10 += i9;
                            outputStream.write(bArr, 0, i9);
                            i9 = 0;
                        }
                        if (this.q >= this.f41402r) {
                            j2();
                        }
                        byte[] bArr3 = this.Y;
                        int i13 = this.q;
                        this.q = i13 + 1;
                        i2 = bArr3[i13] & 255;
                        iDecodeBase64Char = base64Variant.decodeBase64Char(i2);
                        if (iDecodeBase64Char < 0) {
                            iDecodeBase64Char = q1(base64Variant, i2, 1);
                        }
                        i3 = (iDecodeBase64Char4 << 6) | iDecodeBase64Char;
                        if (this.q >= this.f41402r) {
                            j2();
                        }
                        byte[] bArr4 = this.Y;
                        int i14 = this.q;
                        this.q = i14 + 1;
                        i4 = bArr4[i14] & 255;
                        iDecodeBase64Char2 = base64Variant.decodeBase64Char(i4);
                        if (iDecodeBase64Char2 >= 0) {
                            if (iDecodeBase64Char2 != -2) {
                                if (i4 == 34) {
                                    int i15 = i9 + 1;
                                    bArr[i9] = (byte) (i3 >> 4);
                                    if (base64Variant.usesPadding()) {
                                        this.q--;
                                        v1(base64Variant);
                                    }
                                    i9 = i15;
                                    break;
                                }
                                iDecodeBase64Char2 = q1(base64Variant, i4, 2);
                            }
                            if (iDecodeBase64Char2 == -2) {
                                if (this.q >= this.f41402r) {
                                    j2();
                                }
                                byte[] bArr5 = this.Y;
                                int i16 = this.q;
                                this.q = i16 + 1;
                                i7 = bArr5[i16] & 255;
                                if (base64Variant.usesPaddingChar(i7)) {
                                }
                                bArr[i9] = (byte) (i3 >> 4);
                                i9++;
                            }
                        }
                        i5 = (i3 << 6) | iDecodeBase64Char2;
                        if (this.q >= this.f41402r) {
                            j2();
                        }
                        byte[] bArr6 = this.Y;
                        int i17 = this.q;
                        this.q = i17 + 1;
                        i6 = bArr6[i17] & 255;
                        iDecodeBase64Char3 = base64Variant.decodeBase64Char(i6);
                        if (iDecodeBase64Char3 < 0) {
                            if (iDecodeBase64Char3 != -2) {
                                i = 3;
                            } else {
                                if (i6 == 34) {
                                    int i18 = i9 + 1;
                                    bArr[i9] = (byte) (i5 >> 10);
                                    i9 += 2;
                                    bArr[i18] = (byte) (i5 >> 2);
                                    if (base64Variant.usesPadding()) {
                                        break;
                                    }
                                    this.q--;
                                    v1(base64Variant);
                                    break;
                                }
                                i = 3;
                                iDecodeBase64Char3 = q1(base64Variant, i6, 3);
                            }
                            if (iDecodeBase64Char3 == -2) {
                                int i19 = i9 + 1;
                                bArr[i9] = (byte) (i5 >> 10);
                                i9 += 2;
                                bArr[i19] = (byte) (i5 >> 2);
                            }
                            i8 = i;
                        } else {
                            i = 3;
                        }
                        int i20 = (i5 << 6) | iDecodeBase64Char3;
                        bArr[i9] = (byte) (i20 >> 16);
                        int i21 = i9 + 2;
                        bArr[i9 + 1] = (byte) (i20 >> 8);
                        i9 += 3;
                        bArr[i21] = (byte) i20;
                        i8 = i;
                    }
                } else {
                    if (i9 > length) {
                        i10 += i9;
                        outputStream.write(bArr, 0, i9);
                        i9 = 0;
                    }
                    if (this.q >= this.f41402r) {
                        j2();
                    }
                    byte[] bArr7 = this.Y;
                    int i110 = this.q;
                    this.q = i110 + 1;
                    i2 = bArr7[i110] & 255;
                    iDecodeBase64Char = base64Variant.decodeBase64Char(i2);
                    if (iDecodeBase64Char < 0) {
                        iDecodeBase64Char = q1(base64Variant, i2, 1);
                    }
                    i3 = (iDecodeBase64Char4 << 6) | iDecodeBase64Char;
                    if (this.q >= this.f41402r) {
                        j2();
                    }
                    byte[] bArr8 = this.Y;
                    int i111 = this.q;
                    this.q = i111 + 1;
                    i4 = bArr8[i111] & 255;
                    iDecodeBase64Char2 = base64Variant.decodeBase64Char(i4);
                    if (iDecodeBase64Char2 >= 0) {
                        if (iDecodeBase64Char2 != -2) {
                            if (i4 == 34) {
                                int i112 = i9 + 1;
                                bArr[i9] = (byte) (i3 >> 4);
                                if (base64Variant.usesPadding()) {
                                    this.q--;
                                    v1(base64Variant);
                                }
                                i9 = i112;
                                break;
                            }
                            iDecodeBase64Char2 = q1(base64Variant, i4, 2);
                        }
                        if (iDecodeBase64Char2 == -2) {
                            if (this.q >= this.f41402r) {
                                j2();
                            }
                            byte[] bArr9 = this.Y;
                            int i113 = this.q;
                            this.q = i113 + 1;
                            i7 = bArr9[i113] & 255;
                            if (base64Variant.usesPaddingChar(i7) && q1(base64Variant, i7, i8) != -2) {
                                throw L1(base64Variant, i7, i8, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                            }
                            bArr[i9] = (byte) (i3 >> 4);
                            i9++;
                        }
                    }
                    i5 = (i3 << 6) | iDecodeBase64Char2;
                    if (this.q >= this.f41402r) {
                        j2();
                    }
                    byte[] bArr10 = this.Y;
                    int i114 = this.q;
                    this.q = i114 + 1;
                    i6 = bArr10[i114] & 255;
                    iDecodeBase64Char3 = base64Variant.decodeBase64Char(i6);
                    if (iDecodeBase64Char3 < 0) {
                        if (iDecodeBase64Char3 != -2) {
                            i = 3;
                        } else {
                            if (i6 == 34) {
                                int i115 = i9 + 1;
                                bArr[i9] = (byte) (i5 >> 10);
                                i9 += 2;
                                bArr[i115] = (byte) (i5 >> 2);
                                if (base64Variant.usesPadding()) {
                                    break;
                                }
                                this.q--;
                                v1(base64Variant);
                                break;
                            }
                            i = 3;
                            iDecodeBase64Char3 = q1(base64Variant, i6, 3);
                        }
                        if (iDecodeBase64Char3 == -2) {
                            int i116 = i9 + 1;
                            bArr[i9] = (byte) (i5 >> 10);
                            i9 += 2;
                            bArr[i116] = (byte) (i5 >> 2);
                        }
                        i8 = i;
                    } else {
                        i = 3;
                    }
                    int i22 = (i5 << 6) | iDecodeBase64Char3;
                    bArr[i9] = (byte) (i22 >> 16);
                    int i23 = i9 + 2;
                    bArr[i9 + 1] = (byte) (i22 >> 8);
                    i9 += 3;
                    bArr[i23] = (byte) i22;
                    i8 = i;
                }
            }
            i = i8;
            i8 = i;
        }
        this.S = false;
        if (i9 <= 0) {
            return i10;
        }
        int i24 = i10 + i9;
        outputStream.write(bArr, 0, i9);
        return i24;
    }

    public void z2(int i) throws JsonParseException {
        if (i < 32) {
            g1(i);
        }
        A2(i);
    }
}
