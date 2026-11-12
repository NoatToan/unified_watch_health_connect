package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public class awg extends bwg {
    public static final int[] i0 = xt3.i();
    public static final int[] j0 = xt3.g();
    public byte[] h0;

    public awg(xuc xucVar, int i, r73 r73Var) {
        super(xucVar, i, r73Var);
        this.h0 = alh.e;
    }

    public JsonToken A2() throws IOException {
        do {
            int i = this.q;
            if (i >= this.f41402r) {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.h0;
            this.q = i + 1;
            char c = (char) bArr[i];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.A.a(c);
        } while (this.A.F() < 256);
        return W2(this.A.l());
    }

    public JsonToken B2() throws IOException {
        return W2(this.A.l());
    }

    public final JsonToken C2() throws IOException {
        int i;
        int i2;
        int iN2 = n2(this.V, this.W);
        if (iN2 < 0) {
            this.Z = 8;
            return JsonToken.NOT_AVAILABLE;
        }
        int i3 = this.R;
        int[] iArr = this.Q;
        if (i3 >= iArr.length) {
            this.Q = zkh.J1(iArr, 32);
        }
        int i4 = this.T;
        int i5 = this.U;
        int i6 = 1;
        if (iN2 > 127) {
            int i7 = 0;
            if (i5 >= 4) {
                int[] iArr2 = this.Q;
                int i8 = this.R;
                this.R = i8 + 1;
                iArr2[i8] = i4;
                i4 = 0;
                i5 = 0;
            }
            if (iN2 < 2048) {
                i = i4 << 8;
                i2 = (iN2 >> 6) | 192;
            } else {
                int i9 = (i4 << 8) | (iN2 >> 12) | SportReportBaseParser.ReportType.avgFreq;
                i5++;
                if (i5 >= 4) {
                    int[] iArr3 = this.Q;
                    int i10 = this.R;
                    this.R = i10 + 1;
                    iArr3[i10] = i9;
                    i5 = 0;
                } else {
                    i7 = i9;
                }
                i = i7 << 8;
                i2 = ((iN2 >> 6) & 63) | 128;
            }
            i4 = i | i2;
            i5++;
            iN2 = (iN2 & 63) | 128;
        }
        if (i5 < 4) {
            i6 = 1 + i5;
            iN2 |= i4 << 8;
        } else {
            int[] iArr4 = this.Q;
            int i11 = this.R;
            this.R = i11 + 1;
            iArr4[i11] = i4;
        }
        return this.a0 == 9 ? v2(this.R, iN2, i6) : T2(this.R, iN2, i6);
    }

    public JsonToken D2(boolean z, int i) throws IOException {
        if (z) {
            this.Z = 32;
            if (i == 45 || i == 43) {
                this.A.a((char) i);
                int i2 = this.q;
                if (i2 >= this.f41402r) {
                    this.Z = 32;
                    this.O = 0;
                    return JsonToken.NOT_AVAILABLE;
                }
                byte[] bArr = this.h0;
                this.q = i2 + 1;
                i = bArr[i2];
            }
        }
        char[] cArrQ = this.A.q();
        int iS = this.A.s();
        int i3 = this.O;
        while (i >= 48 && i <= 57) {
            i3++;
            if (iS >= cArrQ.length) {
                cArrQ = this.A.o();
            }
            int i4 = iS + 1;
            cArrQ[iS] = (char) i;
            int i5 = this.q;
            if (i5 >= this.f41402r) {
                this.A.E(i4);
                this.O = i3;
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr2 = this.h0;
            this.q = i5 + 1;
            i = bArr2[i5];
            iS = i4;
        }
        int i6 = i & 255;
        if (i3 == 0) {
            m1(i6, "Exponent indicator not followed by a digit");
        }
        this.q--;
        this.A.E(iS);
        this.O = i3;
        return i2(JsonToken.VALUE_NUMBER_FLOAT);
    }

    public JsonToken E2() throws IOException {
        byte b2;
        int i = this.N;
        char[] cArrQ = this.A.q();
        int iS = this.A.s();
        while (true) {
            byte[] bArr = this.h0;
            int i2 = this.q;
            this.q = i2 + 1;
            b2 = bArr[i2];
            if (b2 < 48 || b2 > 57) {
                break;
            }
            i++;
            if (iS >= cArrQ.length) {
                cArrQ = this.A.o();
            }
            int i3 = iS + 1;
            cArrQ[iS] = (char) b2;
            if (this.q >= this.f41402r) {
                this.A.E(i3);
                this.N = i;
                return JsonToken.NOT_AVAILABLE;
            }
            iS = i3;
        }
        if (i == 0) {
            m1(b2, "Decimal point not followed by a digit");
        }
        this.N = i;
        this.A.E(iS);
        if (b2 != 101 && b2 != 69) {
            this.q--;
            this.A.E(iS);
            this.O = 0;
            return i2(JsonToken.VALUE_NUMBER_FLOAT);
        }
        this.A.a((char) b2);
        this.O = 0;
        int i4 = this.q;
        if (i4 >= this.f41402r) {
            this.Z = 31;
            return JsonToken.NOT_AVAILABLE;
        }
        this.Z = 32;
        byte[] bArr2 = this.h0;
        this.q = i4 + 1;
        return D2(true, bArr2[i4] & 255);
    }

    public final JsonToken F2(int i) throws IOException {
        if (!JsonParser.Feature.ALLOW_YAML_COMMENTS.enabledIn(this.f7621a)) {
            e1(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (true) {
            int i2 = this.q;
            if (i2 >= this.f41402r) {
                this.Z = 55;
                this.T = i;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.h0;
            int i3 = i2 + 1;
            this.q = i3;
            int i4 = bArr[i2] & 255;
            if (i4 < 32) {
                if (i4 == 10) {
                    this.t++;
                    this.u = i3;
                } else if (i4 == 13) {
                    this.e0++;
                    this.u = i3;
                } else if (i4 != 9) {
                    g1(i4);
                }
                return Y2(i);
            }
        }
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public JsonToken G0() throws IOException {
        int i = this.q;
        if (i >= this.f41402r) {
            if (this.p) {
                return null;
            }
            if (this.b0) {
                return this.c == JsonToken.NOT_AVAILABLE ? Q2() : T1();
            }
            return JsonToken.NOT_AVAILABLE;
        }
        if (this.c == JsonToken.NOT_AVAILABLE) {
            return P2();
        }
        this.F = 0;
        this.v = this.s + ((long) i);
        this.E = null;
        byte[] bArr = this.h0;
        this.q = i + 1;
        int i2 = bArr[i] & 255;
        switch (this.X) {
            case 0:
                return a3(i2);
            case 1:
                return n3(i2);
            case 2:
                return c3(i2);
            case 3:
                return d3(i2);
            case 4:
                return p3(i2);
            case 5:
                return n3(i2);
            case 6:
                return q3(i2);
            default:
                jpq.c();
                return null;
        }
    }

    public JsonToken G2(String str, int i, JsonToken jsonToken) throws IOException {
        int length = str.length();
        while (true) {
            int i2 = this.q;
            if (i2 >= this.f41402r) {
                this.T = i;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken2;
                return jsonToken2;
            }
            byte b2 = this.h0[i2];
            if (i == length) {
                if (b2 >= 48 && b2 != 93 && b2 != 125) {
                    break;
                }
                return i2(jsonToken);
            }
            if (b2 != str.charAt(i)) {
                break;
            }
            i++;
            this.q++;
        }
        this.Z = 50;
        this.A.x(str, 0, i);
        return A2();
    }

    public JsonToken H2(String str, int i, JsonToken jsonToken) throws IOException {
        if (i == str.length()) {
            this.c = jsonToken;
            return jsonToken;
        }
        this.A.x(str, 0, i);
        return B2();
    }

    public JsonToken I2(int i, int i2) throws IOException {
        String strZ1 = Z1(i);
        int length = strZ1.length();
        while (true) {
            int i3 = this.q;
            if (i3 >= this.f41402r) {
                this.c0 = i;
                this.T = i2;
                this.Z = 19;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken;
                return jsonToken;
            }
            byte b2 = this.h0[i3];
            if (i2 == length) {
                if (b2 >= 48 && b2 != 93 && b2 != 125) {
                    break;
                }
                return k2(i);
            }
            if (b2 != strZ1.charAt(i2)) {
                break;
            }
            i2++;
            this.q++;
        }
        this.Z = 50;
        this.A.x(strZ1, 0, i2);
        return A2();
    }

    public JsonToken J2(int i, int i2) throws IOException {
        String strZ1 = Z1(i);
        if (i2 == strZ1.length()) {
            return k2(i);
        }
        this.A.x(strZ1, 0, i2);
        return B2();
    }

    public JsonToken K2(char[] cArr, int i) throws IOException {
        int i2 = this.L ? -1 : 0;
        while (true) {
            int i3 = this.q;
            if (i3 >= this.f41402r) {
                this.Z = 26;
                this.A.E(i);
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken;
                return jsonToken;
            }
            int i4 = this.h0[i3] & 255;
            if (i4 < 48) {
                if (i4 != 46) {
                    break;
                }
                this.M = i2 + i;
                this.q = i3 + 1;
                return e3(cArr, i, i4);
            }
            if (i4 > 57) {
                if (i4 != 101 && i4 != 69) {
                    break;
                }
                this.M = i2 + i;
                this.q = i3 + 1;
                return e3(cArr, i, i4);
            }
            this.q = i3 + 1;
            if (i >= cArr.length) {
                cArr = this.A.o();
            }
            cArr[i] = (char) i4;
            i++;
        }
        this.M = i2 + i;
        this.A.E(i);
        return i2(JsonToken.VALUE_NUMBER_INT);
    }

    public JsonToken L2() throws IOException {
        int i;
        do {
            int i2 = this.q;
            if (i2 >= this.f41402r) {
                this.Z = 25;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.h0;
            this.q = i2 + 1;
            i = bArr[i2] & 255;
            if (i < 48) {
                if (i == 46) {
                    char[] cArrM = this.A.m();
                    cArrM[0] = '-';
                    cArrM[1] = '0';
                    this.M = 1;
                    return e3(cArrM, 2, i);
                }
            } else if (i > 57) {
                if (i == 101 || i == 69) {
                    char[] cArrM2 = this.A.m();
                    cArrM2[0] = '-';
                    cArrM2[1] = '0';
                    this.M = 1;
                    return e3(cArrM2, 2, i);
                }
                if (i != 93 && i != 125) {
                    m1(i, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if (!A0(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
                j1("Leading zeroes not allowed");
            }
            this.q--;
            return j2(0, "0");
        } while (i == 48);
        char[] cArrM3 = this.A.m();
        cArrM3[0] = '-';
        cArrM3[1] = (char) i;
        this.M = 1;
        return K2(cArrM3, 2);
    }

    public JsonToken M2() throws IOException {
        int i;
        do {
            int i2 = this.q;
            if (i2 >= this.f41402r) {
                this.Z = 24;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.h0;
            this.q = i2 + 1;
            i = bArr[i2] & 255;
            if (i < 48) {
                if (i == 46) {
                    char[] cArrM = this.A.m();
                    cArrM[0] = '0';
                    this.M = 1;
                    return e3(cArrM, 1, i);
                }
            } else if (i > 57) {
                if (i == 101 || i == 69) {
                    char[] cArrM2 = this.A.m();
                    cArrM2[0] = '0';
                    this.M = 1;
                    return e3(cArrM2, 1, i);
                }
                if (i != 93 && i != 125) {
                    m1(i, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if (!A0(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
                j1("Leading zeroes not allowed");
            }
            this.q--;
            return j2(0, "0");
        } while (i == 48);
        char[] cArrM3 = this.A.m();
        cArrM3[0] = (char) i;
        this.M = 1;
        return K2(cArrM3, 1);
    }

    public JsonToken N2(int i) throws IOException {
        if (i <= 48) {
            if (i == 48) {
                return L2();
            }
            m1(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i > 57) {
            if (i == 73) {
                return I2(3, 2);
            }
            m1(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] cArrM = this.A.m();
        cArrM[0] = '-';
        cArrM[1] = (char) i;
        this.M = 1;
        return K2(cArrM, 2);
    }

    public final JsonToken O2() throws IOException {
        int[] iArr = i0;
        byte[] bArr = this.h0;
        char[] cArrQ = this.A.q();
        int iS = this.A.s();
        int i = this.q;
        int i2 = this.f41402r - 5;
        while (i < this.f41402r) {
            int i3 = 0;
            if (iS >= cArrQ.length) {
                cArrQ = this.A.p();
                iS = 0;
            }
            int iMin = Math.min(this.f41402r, (cArrQ.length - iS) + i);
            while (i < iMin) {
                int i4 = i + 1;
                int iM2 = bArr[i] & 255;
                int i5 = iArr[iM2];
                if (i5 != 0) {
                    if (iM2 != 34) {
                        if (i4 < i2) {
                            if (i5 == 1) {
                                this.q = i4;
                                iM2 = m2();
                                i = this.q;
                            } else if (i5 == 2) {
                                i += 2;
                                iM2 = r2(iM2, this.h0[i4]);
                            } else if (i5 == 3) {
                                byte[] bArr2 = this.h0;
                                int i6 = i + 2;
                                i += 3;
                                iM2 = s2(iM2, bArr2[i4], bArr2[i6]);
                            } else if (i5 != 4) {
                                if (iM2 < 32) {
                                    h1(iM2, "string value");
                                } else {
                                    b2(iM2);
                                }
                                i = i4;
                            } else {
                                byte[] bArr3 = this.h0;
                                byte b2 = bArr3[i4];
                                int i7 = i + 3;
                                byte b3 = bArr3[i + 2];
                                i += 4;
                                int iT2 = t2(iM2, b2, b3, bArr3[i7]);
                                int i8 = iS + 1;
                                cArrQ[iS] = (char) ((iT2 >> 10) | 55296);
                                if (i8 >= cArrQ.length) {
                                    cArrQ = this.A.p();
                                    iS = 0;
                                } else {
                                    iS = i8;
                                }
                                iM2 = (iT2 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                            }
                            if (iS >= cArrQ.length) {
                                cArrQ = this.A.p();
                            } else {
                                i3 = iS;
                            }
                            iS = i3 + 1;
                            cArrQ[i3] = (char) iM2;
                            break;
                        }
                        this.q = i4;
                        this.A.E(iS);
                        if (o2(iM2, iArr[iM2], i4 < this.f41402r)) {
                            cArrQ = this.A.q();
                            iS = this.A.s();
                            i = this.q;
                            break;
                        }
                        this.a0 = 40;
                        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                        this.c = jsonToken;
                        return jsonToken;
                    }
                    this.q = i4;
                    this.A.E(iS);
                    return i2(JsonToken.VALUE_STRING);
                }
                cArrQ[iS] = (char) iM2;
                iS++;
                i = i4;
            }
        }
        this.q = i;
        this.Z = 40;
        this.A.E(iS);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this.c = jsonToken2;
        return jsonToken2;
    }

    public final JsonToken P2() throws IOException {
        int i = this.Z;
        if (i == 1) {
            return x2(this.T);
        }
        if (i == 4) {
            byte[] bArr = this.h0;
            int i2 = this.q;
            this.q = i2 + 1;
            return c3(bArr[i2] & 255);
        }
        if (i == 5) {
            byte[] bArr2 = this.h0;
            int i3 = this.q;
            this.q = i3 + 1;
            return d3(bArr2[i3] & 255);
        }
        switch (i) {
            case 7:
                return T2(this.R, this.T, this.U);
            case 8:
                return C2();
            case 9:
                return v2(this.R, this.T, this.U);
            case 10:
                return R2(this.R, this.T, this.U);
            default:
                switch (i) {
                    case 12:
                        byte[] bArr3 = this.h0;
                        int i4 = this.q;
                        this.q = i4 + 1;
                        return n3(bArr3[i4] & 255);
                    case 13:
                        byte[] bArr4 = this.h0;
                        int i5 = this.q;
                        this.q = i5 + 1;
                        return q3(bArr4[i5] & 255);
                    case 14:
                        byte[] bArr5 = this.h0;
                        int i6 = this.q;
                        this.q = i6 + 1;
                        return p3(bArr5[i6] & 255);
                    case 15:
                        byte[] bArr6 = this.h0;
                        int i7 = this.q;
                        this.q = i7 + 1;
                        return o3(bArr6[i7] & 255);
                    case 16:
                        return G2(AbstractJsonLexerKt.NULL, this.T, JsonToken.VALUE_NULL);
                    case 17:
                        return G2("true", this.T, JsonToken.VALUE_TRUE);
                    case 18:
                        return G2("false", this.T, JsonToken.VALUE_FALSE);
                    case 19:
                        return I2(this.c0, this.T);
                    default:
                        switch (i) {
                            case 23:
                                byte[] bArr7 = this.h0;
                                int i8 = this.q;
                                this.q = i8 + 1;
                                return N2(bArr7[i8] & 255);
                            case 24:
                                return M2();
                            case 25:
                                return L2();
                            case 26:
                                return K2(this.A.q(), this.A.s());
                            default:
                                switch (i) {
                                    case 30:
                                        return E2();
                                    case 31:
                                        byte[] bArr8 = this.h0;
                                        int i9 = this.q;
                                        this.q = i9 + 1;
                                        return D2(true, bArr8[i9] & 255);
                                    case 32:
                                        byte[] bArr9 = this.h0;
                                        int i10 = this.q;
                                        this.q = i10 + 1;
                                        return D2(false, bArr9[i10] & 255);
                                    default:
                                        switch (i) {
                                            case 40:
                                                return O2();
                                            case 41:
                                                int iN2 = n2(this.V, this.W);
                                                if (iN2 < 0) {
                                                    return JsonToken.NOT_AVAILABLE;
                                                }
                                                this.A.a((char) iN2);
                                                return this.a0 == 45 ? w2() : O2();
                                            case 42:
                                                o7p o7pVar = this.A;
                                                int i11 = this.T;
                                                byte[] bArr10 = this.h0;
                                                int i12 = this.q;
                                                this.q = i12 + 1;
                                                o7pVar.a((char) r2(i11, bArr10[i12]));
                                                return this.a0 == 45 ? w2() : O2();
                                            case 43:
                                                int i13 = this.T;
                                                int i14 = this.U;
                                                byte[] bArr11 = this.h0;
                                                int i15 = this.q;
                                                this.q = i15 + 1;
                                                if (p2(i13, i14, bArr11[i15])) {
                                                    return this.a0 == 45 ? w2() : O2();
                                                }
                                                return JsonToken.NOT_AVAILABLE;
                                            case 44:
                                                int i16 = this.T;
                                                int i17 = this.U;
                                                byte[] bArr12 = this.h0;
                                                int i18 = this.q;
                                                this.q = i18 + 1;
                                                if (q2(i16, i17, bArr12[i18])) {
                                                    return this.a0 == 45 ? w2() : O2();
                                                }
                                                return JsonToken.NOT_AVAILABLE;
                                            case 45:
                                                return w2();
                                            default:
                                                switch (i) {
                                                    case 50:
                                                        return A2();
                                                    case 51:
                                                        return j3(this.T);
                                                    case 52:
                                                        return y2(this.T, true);
                                                    case 53:
                                                        return y2(this.T, false);
                                                    case 54:
                                                        return z2(this.T);
                                                    case 55:
                                                        return F2(this.T);
                                                    default:
                                                        jpq.c();
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final JsonToken Q2() throws IOException {
        JsonToken jsonToken = this.c;
        int i = this.Z;
        if (i != 3 && i != 12) {
            if (i == 50) {
                return B2();
            }
            switch (i) {
                case 16:
                    return H2(AbstractJsonLexerKt.NULL, this.T, JsonToken.VALUE_NULL);
                case 17:
                    return H2("true", this.T, JsonToken.VALUE_TRUE);
                case 18:
                    return H2("false", this.T, JsonToken.VALUE_FALSE);
                case 19:
                    return J2(this.c0, this.T);
                default:
                    switch (i) {
                        case 24:
                        case 25:
                            return j2(0, "0");
                        case 26:
                            int iS = this.A.s();
                            if (this.L) {
                                iS--;
                            }
                            this.M = iS;
                            return i2(JsonToken.VALUE_NUMBER_INT);
                        default:
                            switch (i) {
                                case 30:
                                    this.O = 0;
                                    return i2(JsonToken.VALUE_NUMBER_FLOAT);
                                case 31:
                                    b1(": was expecting fraction after exponent marker", JsonToken.VALUE_NUMBER_FLOAT);
                                    b1(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                    return T1();
                                case 32:
                                    return i2(JsonToken.VALUE_NUMBER_FLOAT);
                                default:
                                    switch (i) {
                                        case 52:
                                        case 53:
                                            b1(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                            break;
                                        case 54:
                                        case 55:
                                            break;
                                        default:
                                            b1(": was expecting rest of token (internal state: " + this.Z + ")", this.c);
                                            return jsonToken;
                                    }
                                    return T1();
                            }
                    }
            }
        }
        return T1();
    }

    public final JsonToken R2(int i, int i2, int i3) throws IOException {
        int[] iArrJ1 = this.Q;
        int[] iArrJ = xt3.j();
        while (true) {
            int i4 = this.q;
            if (i4 >= this.f41402r) {
                this.R = i;
                this.T = i2;
                this.U = i3;
                this.Z = 10;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken;
                return jsonToken;
            }
            int i5 = this.h0[i4] & 255;
            if (iArrJ[i5] != 0) {
                if (i3 > 0) {
                    if (i >= iArrJ1.length) {
                        iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                        this.Q = iArrJ1;
                    }
                    iArrJ1[i] = i2;
                    i++;
                }
                String strF = this.P.F(iArrJ1, i);
                if (strF == null) {
                    strF = Q1(iArrJ1, i, i3);
                }
                return U1(strF);
            }
            this.q = i4 + 1;
            if (i3 < 4) {
                i3++;
                i2 = (i2 << 8) | i5;
            } else {
                if (i >= iArrJ1.length) {
                    iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                    this.Q = iArrJ1;
                }
                iArrJ1[i] = i2;
                i2 = i5;
                i3 = 1;
                i++;
            }
        }
    }

    public final JsonToken S2(int i) throws IOException {
        if (i != 35) {
            if (i != 39) {
                if (i == 47) {
                    return j3(4);
                }
                if (i == 93) {
                    return R1();
                }
            } else if (A0(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
                return v2(0, 0, 0);
            }
        } else if (JsonParser.Feature.ALLOW_YAML_COMMENTS.enabledIn(this.f7621a)) {
            return F2(4);
        }
        if (!A0(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            e1((char) i, "was expecting double-quote to start field name");
        }
        if (xt3.j()[i] != 0) {
            e1(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return R2(0, i, 1);
    }

    public final JsonToken T2(int i, int i2, int i3) throws IOException {
        int i4;
        int[] iArrJ1 = this.Q;
        int[] iArr = j0;
        while (true) {
            int i5 = this.q;
            if (i5 >= this.f41402r) {
                this.R = i;
                this.T = i2;
                this.U = i3;
                this.Z = 7;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.h0;
            this.q = i5 + 1;
            int iL2 = bArr[i5] & 255;
            if (iArr[iL2] == 0) {
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | iL2;
                } else {
                    if (i >= iArrJ1.length) {
                        int[] iArrJ2 = zkh.J1(iArrJ1, iArrJ1.length);
                        this.Q = iArrJ2;
                        iArrJ1 = iArrJ2;
                    }
                    i4 = i + 1;
                    iArrJ1[i] = i2;
                    i = i4;
                    i2 = iL2;
                    i3 = 1;
                }
            } else {
                if (iL2 == 34) {
                    if (i3 > 0) {
                        if (i >= iArrJ1.length) {
                            iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                            this.Q = iArrJ1;
                        }
                        iArrJ1[i] = bwg.a2(i2, i3);
                        i++;
                    } else if (i == 0) {
                        return U1("");
                    }
                    String strF = this.P.F(iArrJ1, i);
                    if (strF == null) {
                        strF = Q1(iArrJ1, i, i3);
                    }
                    return U1(strF);
                }
                if (iL2 != 92) {
                    h1(iL2, "name");
                } else {
                    iL2 = l2();
                    if (iL2 < 0) {
                        this.Z = 8;
                        this.a0 = 7;
                        this.R = i;
                        this.T = i2;
                        this.U = i3;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this.c = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i >= iArrJ1.length) {
                    iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                    this.Q = iArrJ1;
                }
                if (iL2 > 127) {
                    int i6 = 0;
                    if (i3 >= 4) {
                        iArrJ1[i] = i2;
                        i++;
                        i2 = 0;
                        i3 = 0;
                    }
                    if (iL2 < 2048) {
                        i2 = (i2 << 8) | (iL2 >> 6) | 192;
                        i3++;
                    } else {
                        int i7 = (i2 << 8) | (iL2 >> 12) | SportReportBaseParser.ReportType.avgFreq;
                        int i8 = i3 + 1;
                        if (i8 >= 4) {
                            iArrJ1[i] = i7;
                            i++;
                            i8 = 0;
                        } else {
                            i6 = i7;
                        }
                        i2 = (i6 << 8) | ((iL2 >> 6) & 63) | 128;
                        i3 = i8 + 1;
                    }
                    iL2 = (iL2 & 63) | 128;
                }
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | iL2;
                } else {
                    i4 = i + 1;
                    iArrJ1[i] = i2;
                    i = i4;
                    i2 = iL2;
                    i3 = 1;
                }
            }
        }
    }

    public final String U2(int i, int i2) throws IOException {
        byte[] bArr = this.h0;
        int[] iArr = j0;
        int i3 = i + 1;
        int i4 = bArr[i] & 255;
        if (iArr[i4] != 0) {
            if (i4 != 34) {
                return null;
            }
            this.q = i3;
            return W1(this.S, i2, 1);
        }
        int i5 = (i2 << 8) | i4;
        int i6 = i + 2;
        int i7 = bArr[i3] & 255;
        if (iArr[i7] != 0) {
            if (i7 != 34) {
                return null;
            }
            this.q = i6;
            return W1(this.S, i5, 2);
        }
        int i8 = (i5 << 8) | i7;
        int i9 = i + 3;
        int i10 = bArr[i6] & 255;
        if (iArr[i10] != 0) {
            if (i10 != 34) {
                return null;
            }
            this.q = i9;
            return W1(this.S, i8, 3);
        }
        int i11 = (i8 << 8) | i10;
        int i12 = i + 4;
        int i13 = bArr[i9] & 255;
        if (iArr[i13] == 0) {
            return V2(i12, i13, i11);
        }
        if (i13 != 34) {
            return null;
        }
        this.q = i12;
        return W1(this.S, i11, 4);
    }

    public final String V2(int i, int i2, int i3) throws IOException {
        byte[] bArr = this.h0;
        int[] iArr = j0;
        int i4 = i + 1;
        int i5 = bArr[i] & 255;
        if (iArr[i5] != 0) {
            if (i5 != 34) {
                return null;
            }
            this.q = i4;
            return X1(this.S, i3, i2, 1);
        }
        int i6 = (i2 << 8) | i5;
        int i7 = i + 2;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            if (i8 != 34) {
                return null;
            }
            this.q = i7;
            return X1(this.S, i3, i6, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i + 3;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            if (i11 != 34) {
                return null;
            }
            this.q = i10;
            return X1(this.S, i3, i9, 3);
        }
        int i12 = (i9 << 8) | i11;
        int i13 = i + 4;
        if ((bArr[i10] & 255) != 34) {
            return null;
        }
        this.q = i13;
        return X1(this.S, i3, i12, 4);
    }

    public JsonToken W2(String str) throws IOException {
        Z0("Unrecognized token '%s': was expecting %s", this.A.l(), "'null', 'true' or 'false'");
        return JsonToken.NOT_AVAILABLE;
    }

    public final int X2(int i) throws IOException {
        do {
            if (i != 32) {
                if (i == 10) {
                    this.t++;
                    this.u = this.q;
                } else if (i == 13) {
                    this.e0++;
                    this.u = this.q;
                } else if (i != 9) {
                    g1(i);
                }
            }
            int i2 = this.q;
            if (i2 >= this.f41402r) {
                this.c = JsonToken.NOT_AVAILABLE;
                return 0;
            }
            byte[] bArr = this.h0;
            this.q = i2 + 1;
            i = bArr[i2] & 255;
        } while (i <= 32);
        return i;
    }

    public final JsonToken Y2(int i) throws IOException {
        int i2 = this.q;
        if (i2 >= this.f41402r) {
            this.Z = i;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.c = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this.h0;
        this.q = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (i == 4) {
            return c3(i3);
        }
        if (i == 5) {
            return d3(i3);
        }
        switch (i) {
            case 12:
                return n3(i3);
            case 13:
                return q3(i3);
            case 14:
                return p3(i3);
            case 15:
                return o3(i3);
            default:
                jpq.c();
                return null;
        }
    }

    public JsonToken Z2() throws IOException {
        int i = this.q;
        char[] cArrM = this.A.m();
        int[] iArr = i0;
        int iMin = Math.min(this.f41402r, cArrM.length + i);
        byte[] bArr = this.h0;
        int i2 = 0;
        while (i < iMin) {
            int i3 = bArr[i] & 255;
            if (i3 == 39) {
                this.q = i + 1;
                this.A.E(i2);
                return i2(JsonToken.VALUE_STRING);
            }
            if (iArr[i3] != 0) {
                break;
            }
            i++;
            cArrM[i2] = (char) i3;
            i2++;
        }
        this.A.E(i2);
        this.q = i;
        return w2();
    }

    public final JsonToken a3(int i) throws IOException {
        int i2 = i & 255;
        if (i2 == 239 && this.Z != 1) {
            return x2(1);
        }
        while (i2 <= 32) {
            if (i2 != 32) {
                if (i2 == 10) {
                    this.t++;
                    this.u = this.q;
                } else if (i2 == 13) {
                    this.e0++;
                    this.u = this.q;
                } else if (i2 != 9) {
                    g1(i2);
                }
            }
            int i3 = this.q;
            if (i3 >= this.f41402r) {
                this.Z = 3;
                if (this.p) {
                    return null;
                }
                return this.b0 ? T1() : JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr = this.h0;
            this.q = i3 + 1;
            i2 = bArr[i3] & 255;
        }
        return n3(i2);
    }

    public JsonToken b3() throws IOException {
        int i;
        int i2 = this.q;
        if (i2 + 4 < this.f41402r) {
            byte[] bArr = this.h0;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 115) {
                        int i6 = i2 + 4;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || i == 93 || i == 125)) {
                            this.q = i6;
                            return i2(JsonToken.VALUE_FALSE);
                        }
                    }
                }
            }
        }
        this.Z = 18;
        return G2("false", 1, JsonToken.VALUE_FALSE);
    }

    public final JsonToken c3(int i) throws IOException {
        String strU2;
        if (i <= 32 && (i = X2(i)) <= 0) {
            this.Z = 4;
            return this.c;
        }
        h2();
        if (i != 34) {
            return i == 125 ? S1() : S2(i);
        }
        return (this.q + 13 > this.f41402r || (strU2 = u2()) == null) ? T2(0, 0, 0) : U1(strU2);
    }

    public final JsonToken d3(int i) throws IOException {
        String strU2;
        if (i <= 32 && (i = X2(i)) <= 0) {
            this.Z = 5;
            return this.c;
        }
        if (i != 44) {
            if (i == 125) {
                return S1();
            }
            if (i == 35) {
                return F2(5);
            }
            if (i == 47) {
                return j3(5);
            }
            e1(i, "was expecting comma to separate " + this.y.j() + " entries");
        }
        int i2 = this.q;
        if (i2 >= this.f41402r) {
            this.Z = 4;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.c = jsonToken;
            return jsonToken;
        }
        int iX2 = this.h0[i2];
        this.q = i2 + 1;
        if (iX2 <= 32 && (iX2 = X2(iX2)) <= 0) {
            this.Z = 4;
            return this.c;
        }
        h2();
        if (iX2 != 34) {
            return (iX2 == 125 && JsonParser.Feature.ALLOW_TRAILING_COMMA.enabledIn(this.f7621a)) ? S1() : S2(iX2);
        }
        return (this.q + 13 > this.f41402r || (strU2 = u2()) == null) ? T2(0, 0, 0) : U1(strU2);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00ee -> B:40:0x009a). Please report as a decompilation issue!!! */
    public JsonToken e3(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        byte b2;
        int i6 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.A.o();
            }
            cArr[i] = '.';
            i++;
            i4 = 0;
            while (true) {
                int i7 = this.q;
                if (i7 >= this.f41402r) {
                    this.A.E(i);
                    this.Z = 30;
                    this.N = i4;
                    JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                    this.c = jsonToken;
                    return jsonToken;
                }
                byte[] bArr = this.h0;
                this.q = i7 + 1;
                b2 = bArr[i7];
                if (b2 < 48 || b2 > 57) {
                    break;
                }
                if (i >= cArr.length) {
                    cArr = this.A.o();
                }
                cArr[i] = (char) b2;
                i4++;
                i++;
            }
            i3 = b2 & 255;
            if (i4 == 0) {
                m1(i3, "Decimal point not followed by a digit");
            }
        } else {
            i3 = i2;
            i4 = 0;
        }
        this.N = i4;
        if (i3 == 101 || i3 == 69) {
            if (i >= cArr.length) {
                cArr = this.A.o();
            }
            int i8 = i + 1;
            cArr[i] = (char) i3;
            int i9 = this.q;
            if (i9 >= this.f41402r) {
                this.A.E(i8);
                this.Z = 31;
                this.O = 0;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken2;
                return jsonToken2;
            }
            byte[] bArr2 = this.h0;
            this.q = i9 + 1;
            byte b3 = bArr2[i9];
            if (b3 == 45 || b3 == 43) {
                if (i8 >= cArr.length) {
                    cArr = this.A.o();
                }
                i += 2;
                cArr[i8] = (char) b3;
                int i10 = this.q;
                if (i10 >= this.f41402r) {
                    this.A.E(i);
                    this.Z = 32;
                    this.O = 0;
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this.c = jsonToken3;
                    return jsonToken3;
                }
                byte[] bArr3 = this.h0;
                this.q = i10 + 1;
                b3 = bArr3[i10];
            } else {
                i = i8;
            }
            if (b3 >= 48 || b3 > 57) {
                i5 = b3 & 255;
                if (i6 == 0) {
                    m1(i5, "Exponent indicator not followed by a digit");
                }
            } else {
                i6++;
                if (i >= cArr.length) {
                    cArr = this.A.o();
                }
                i8 = i + 1;
                cArr[i] = (char) b3;
                int i11 = this.q;
                if (i11 >= this.f41402r) {
                    this.A.E(i8);
                    this.Z = 32;
                    this.O = i6;
                    JsonToken jsonToken4 = JsonToken.NOT_AVAILABLE;
                    this.c = jsonToken4;
                    return jsonToken4;
                }
                byte[] bArr4 = this.h0;
                this.q = i11 + 1;
                b3 = bArr4[i11];
                i = i8;
                if (b3 >= 48) {
                }
                i5 = b3 & 255;
                if (i6 == 0) {
                    m1(i5, "Exponent indicator not followed by a digit");
                }
            }
        }
        this.q--;
        this.A.E(i);
        this.O = i6;
        return i2(JsonToken.VALUE_NUMBER_FLOAT);
    }

    public JsonToken f3() throws IOException {
        this.L = true;
        int i = this.q;
        if (i >= this.f41402r) {
            this.Z = 23;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.c = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this.h0;
        this.q = i + 1;
        int i2 = bArr[i] & 255;
        int i3 = 2;
        if (i2 <= 48) {
            if (i2 == 48) {
                return L2();
            }
            m1(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i2 > 57) {
            if (i2 == 73) {
                return I2(3, 2);
            }
            m1(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] cArrM = this.A.m();
        cArrM[0] = '-';
        cArrM[1] = (char) i2;
        int i4 = this.q;
        if (i4 >= this.f41402r) {
            this.Z = 26;
            this.A.E(2);
            this.M = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this.c = jsonToken2;
            return jsonToken2;
        }
        int i5 = this.h0[i4];
        while (i5 >= 48) {
            if (i5 > 57) {
                if (i5 == 101 || i5 == 69) {
                    this.M = i3 - 1;
                    this.q++;
                    return e3(cArrM, i3, i5);
                }
                this.M = i3 - 1;
                this.A.E(i3);
                return i2(JsonToken.VALUE_NUMBER_INT);
            }
            if (i3 >= cArrM.length) {
                cArrM = this.A.o();
            }
            int i6 = i3 + 1;
            cArrM[i3] = (char) i5;
            int i7 = this.q + 1;
            this.q = i7;
            if (i7 >= this.f41402r) {
                this.Z = 26;
                this.A.E(i6);
                JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken3;
                return jsonToken3;
            }
            i5 = this.h0[i7] & 255;
            i3 = i6;
        }
        if (i5 == 46) {
            this.M = i3 - 1;
            this.q++;
            return e3(cArrM, i3, i5);
        }
        this.M = i3 - 1;
        this.A.E(i3);
        return i2(JsonToken.VALUE_NUMBER_INT);
    }

    public JsonToken g3() throws IOException {
        int i;
        int i2 = this.q;
        if (i2 + 3 < this.f41402r) {
            byte[] bArr = this.h0;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.q = i5;
                        return i2(JsonToken.VALUE_NULL);
                    }
                }
            }
        }
        this.Z = 16;
        return G2(AbstractJsonLexerKt.NULL, 1, JsonToken.VALUE_NULL);
    }

    public JsonToken h3() throws IOException {
        int i = this.q;
        if (i >= this.f41402r) {
            this.Z = 24;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.c = jsonToken;
            return jsonToken;
        }
        int i2 = i + 1;
        int i3 = this.h0[i] & 255;
        if (i3 < 48) {
            if (i3 == 46) {
                this.q = i2;
                this.M = 1;
                char[] cArrM = this.A.m();
                cArrM[0] = '0';
                return e3(cArrM, 1, i3);
            }
        } else {
            if (i3 <= 57) {
                return M2();
            }
            if (i3 == 101 || i3 == 69) {
                this.q = i2;
                this.M = 1;
                char[] cArrM2 = this.A.m();
                cArrM2[0] = '0';
                return e3(cArrM2, 1, i3);
            }
            if (i3 != 93 && i3 != 125) {
                m1(i3, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return j2(0, "0");
    }

    public JsonToken i3(int i) throws IOException {
        this.L = false;
        char[] cArrM = this.A.m();
        cArrM[0] = (char) i;
        int i2 = this.q;
        if (i2 >= this.f41402r) {
            this.Z = 26;
            this.A.E(1);
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.c = jsonToken;
            return jsonToken;
        }
        int i3 = this.h0[i2] & 255;
        int i4 = 1;
        while (i3 >= 48) {
            if (i3 > 57) {
                if (i3 == 101 || i3 == 69) {
                    this.M = i4;
                    this.q++;
                    return e3(cArrM, i4, i3);
                }
                this.M = i4;
                this.A.E(i4);
                return i2(JsonToken.VALUE_NUMBER_INT);
            }
            if (i4 >= cArrM.length) {
                cArrM = this.A.o();
            }
            int i5 = i4 + 1;
            cArrM[i4] = (char) i3;
            int i6 = this.q + 1;
            this.q = i6;
            if (i6 >= this.f41402r) {
                this.Z = 26;
                this.A.E(i5);
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken2;
                return jsonToken2;
            }
            i3 = this.h0[i6] & 255;
            i4 = i5;
        }
        if (i3 == 46) {
            this.M = i4;
            this.q++;
            return e3(cArrM, i4, i3);
        }
        this.M = i4;
        this.A.E(i4);
        return i2(JsonToken.VALUE_NUMBER_INT);
    }

    public final JsonToken j3(int i) throws IOException {
        if (!JsonParser.Feature.ALLOW_COMMENTS.enabledIn(this.f7621a)) {
            e1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int i2 = this.q;
        if (i2 >= this.f41402r) {
            this.T = i;
            this.Z = 51;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.c = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this.h0;
        this.q = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 == 42) {
            return y2(i, false);
        }
        if (b2 == 47) {
            return z2(i);
        }
        e1(b2 & 255, "was expecting either '*' or '/' for a comment");
        return null;
    }

    public JsonToken k3() throws IOException {
        int i = this.q;
        char[] cArrM = this.A.m();
        int[] iArr = i0;
        int iMin = Math.min(this.f41402r, cArrM.length + i);
        byte[] bArr = this.h0;
        int i2 = 0;
        while (i < iMin) {
            int i3 = bArr[i] & 255;
            if (iArr[i3] != 0) {
                if (i3 != 34) {
                    break;
                }
                this.q = i + 1;
                this.A.E(i2);
                return i2(JsonToken.VALUE_STRING);
            }
            i++;
            cArrM[i2] = (char) i3;
            i2++;
        }
        this.A.E(i2);
        this.q = i;
        return O2();
    }

    public final int l2() throws IOException {
        return this.f41402r - this.q < 5 ? n2(0, -1) : m2();
    }

    public JsonToken l3() throws IOException {
        int i;
        int i2 = this.q;
        if (i2 + 3 < this.f41402r) {
            byte[] bArr = this.h0;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i2 + 2;
                if (bArr[i3] == 117) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.q = i5;
                        return i2(JsonToken.VALUE_TRUE);
                    }
                }
            }
        }
        this.Z = 17;
        return G2("true", 1, JsonToken.VALUE_TRUE);
    }

    public final int m2() throws IOException {
        byte[] bArr = this.h0;
        int i = this.q;
        int i2 = i + 1;
        this.q = i2;
        byte b2 = bArr[i];
        if (b2 == 34 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return 8;
        }
        if (b2 == 102) {
            return 12;
        }
        if (b2 == 110) {
            return 10;
        }
        if (b2 == 114) {
            return 13;
        }
        if (b2 == 116) {
            return 9;
        }
        if (b2 != 117) {
            return T0((char) b2);
        }
        this.q = i + 2;
        byte b3 = bArr[i2];
        int iB = xt3.b(b3);
        if (iB >= 0) {
            byte[] bArr2 = this.h0;
            int i3 = this.q;
            this.q = i3 + 1;
            b3 = bArr2[i3];
            int iB2 = xt3.b(b3);
            if (iB2 >= 0) {
                int i4 = (iB << 4) | iB2;
                byte[] bArr3 = this.h0;
                int i5 = this.q;
                this.q = i5 + 1;
                byte b4 = bArr3[i5];
                int iB3 = xt3.b(b4);
                if (iB3 >= 0) {
                    int i6 = (i4 << 4) | iB3;
                    byte[] bArr4 = this.h0;
                    int i7 = this.q;
                    this.q = i7 + 1;
                    b4 = bArr4[i7];
                    int iB4 = xt3.b(b4);
                    if (iB4 >= 0) {
                        return (i6 << 4) | iB4;
                    }
                }
                b3 = b4;
            }
        }
        e1(b3 & 255, "expected a hex-digit for character escape sequence");
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0035  */
    public JsonToken m3(boolean z, int i) throws IOException {
        if (i != 39) {
            if (i == 73) {
                return I2(1, 1);
            }
            if (i == 78) {
                return I2(0, 1);
            }
            if (i != 93) {
                if (i != 125) {
                    if (i == 43) {
                        return I2(2, 1);
                    }
                    if (i == 44) {
                        if (A0(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
                            this.q--;
                            return i2(JsonToken.VALUE_NULL);
                        }
                    }
                }
            } else if (this.y.f()) {
                if (A0(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
                    this.q--;
                    return i2(JsonToken.VALUE_NULL);
                }
            }
        } else if (A0(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return Z2();
        }
        e1(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    public final int n2(int i, int i2) throws IOException {
        int i3 = this.q;
        int i4 = this.f41402r;
        if (i3 >= i4) {
            this.V = i;
            this.W = i2;
            return -1;
        }
        byte[] bArr = this.h0;
        int i5 = i3 + 1;
        this.q = i5;
        byte b2 = bArr[i3];
        if (i2 == -1) {
            if (b2 == 34 || b2 == 47 || b2 == 92) {
                return b2;
            }
            if (b2 == 98) {
                return 8;
            }
            if (b2 == 102) {
                return 12;
            }
            if (b2 == 110) {
                return 10;
            }
            if (b2 == 114) {
                return 13;
            }
            if (b2 == 116) {
                return 9;
            }
            if (b2 != 117) {
                return T0((char) b2);
            }
            i2 = 0;
            if (i5 >= i4) {
                this.W = 0;
                this.V = 0;
                return -1;
            }
            this.q = i3 + 2;
            b2 = bArr[i5];
        }
        int i6 = b2 & 255;
        while (true) {
            int iB = xt3.b(i6);
            if (iB < 0) {
                e1(i6, "expected a hex-digit for character escape sequence");
            }
            i = (i << 4) | iB;
            i2++;
            if (i2 == 4) {
                return i;
            }
            int i7 = this.q;
            if (i7 >= this.f41402r) {
                this.W = i2;
                this.V = i;
                return -1;
            }
            byte[] bArr2 = this.h0;
            this.q = i7 + 1;
            i6 = bArr2[i7] & 255;
        }
    }

    public final JsonToken n3(int i) throws IOException {
        if (i <= 32 && (i = X2(i)) <= 0) {
            this.Z = 12;
            return this.c;
        }
        h2();
        if (i == 34) {
            return k3();
        }
        if (i == 35) {
            return F2(12);
        }
        if (i == 45) {
            return f3();
        }
        if (i == 91) {
            return f2();
        }
        if (i == 93) {
            return R1();
        }
        if (i == 102) {
            return b3();
        }
        if (i == 110) {
            return g3();
        }
        if (i == 116) {
            return l3();
        }
        if (i == 123) {
            return g2();
        }
        if (i == 125) {
            return S1();
        }
        switch (i) {
            case 47:
                return j3(12);
            case 48:
                return h3();
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return i3(i);
            default:
                return m3(false, i);
        }
    }

    public final boolean o2(int i, int i2, boolean z) throws IOException {
        if (i2 == 1) {
            int iN2 = n2(0, -1);
            if (iN2 < 0) {
                this.Z = 41;
                return false;
            }
            this.A.a((char) iN2);
            return true;
        }
        if (i2 == 2) {
            if (!z) {
                this.Z = 42;
                this.T = i;
                return false;
            }
            byte[] bArr = this.h0;
            int i3 = this.q;
            this.q = i3 + 1;
            this.A.a((char) r2(i, bArr[i3]));
            return true;
        }
        if (i2 == 3) {
            int i4 = i & 15;
            if (z) {
                byte[] bArr2 = this.h0;
                int i5 = this.q;
                this.q = i5 + 1;
                return p2(i4, 1, bArr2[i5]);
            }
            this.Z = 43;
            this.T = i4;
            this.U = 1;
            return false;
        }
        if (i2 != 4) {
            if (i < 32) {
                h1(i, "string value");
            } else {
                b2(i);
            }
            this.A.a((char) i);
            return true;
        }
        int i6 = i & 7;
        if (z) {
            byte[] bArr3 = this.h0;
            int i7 = this.q;
            this.q = i7 + 1;
            return q2(i6, 1, bArr3[i7]);
        }
        this.T = i6;
        this.U = 1;
        this.Z = 44;
        return false;
    }

    public final JsonToken o3(int i) throws IOException {
        if (i <= 32 && (i = X2(i)) <= 0) {
            this.Z = 15;
            return this.c;
        }
        h2();
        if (i == 34) {
            return k3();
        }
        if (i == 35) {
            return F2(15);
        }
        if (i == 45) {
            return f3();
        }
        if (i == 91) {
            return f2();
        }
        if (i != 93) {
            if (i == 102) {
                return b3();
            }
            if (i == 110) {
                return g3();
            }
            if (i == 116) {
                return l3();
            }
            if (i == 123) {
                return g2();
            }
            if (i != 125) {
                switch (i) {
                    case 47:
                        return j3(15);
                    case 48:
                        return h3();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return i3(i);
                }
            }
            if (A0(JsonParser.Feature.ALLOW_TRAILING_COMMA)) {
                return S1();
            }
        } else if (A0(JsonParser.Feature.ALLOW_TRAILING_COMMA)) {
            return R1();
        }
        return m3(true, i);
    }

    public final boolean p2(int i, int i2, int i3) throws IOException {
        if (i2 == 1) {
            if ((i3 & 192) != 128) {
                e2(i3 & 255, this.q);
            }
            i = (i << 6) | (i3 & 63);
            int i4 = this.q;
            if (i4 >= this.f41402r) {
                this.Z = 43;
                this.T = i;
                this.U = 2;
                return false;
            }
            byte[] bArr = this.h0;
            this.q = i4 + 1;
            i3 = bArr[i4];
        }
        if ((i3 & 192) != 128) {
            e2(i3 & 255, this.q);
        }
        this.A.a((char) ((i << 6) | (i3 & 63)));
        return true;
    }

    public final JsonToken p3(int i) throws IOException {
        if (i <= 32 && (i = X2(i)) <= 0) {
            this.Z = 14;
            return this.c;
        }
        if (i != 58) {
            if (i == 47) {
                return j3(14);
            }
            if (i == 35) {
                return F2(14);
            }
            e1(i, "was expecting a colon to separate field name and value");
        }
        int i2 = this.q;
        if (i2 >= this.f41402r) {
            this.Z = 12;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.c = jsonToken;
            return jsonToken;
        }
        int iX2 = this.h0[i2];
        this.q = i2 + 1;
        if (iX2 <= 32 && (iX2 = X2(iX2)) <= 0) {
            this.Z = 12;
            return this.c;
        }
        h2();
        if (iX2 == 34) {
            return k3();
        }
        if (iX2 == 35) {
            return F2(12);
        }
        if (iX2 == 45) {
            return f3();
        }
        if (iX2 == 91) {
            return f2();
        }
        if (iX2 == 102) {
            return b3();
        }
        if (iX2 == 110) {
            return g3();
        }
        if (iX2 == 116) {
            return l3();
        }
        if (iX2 == 123) {
            return g2();
        }
        switch (iX2) {
            case 47:
                return j3(12);
            case 48:
                return h3();
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return i3(iX2);
            default:
                return m3(false, iX2);
        }
    }

    public final boolean q2(int i, int i2, int i3) throws IOException {
        if (i2 == 1) {
            if ((i3 & 192) != 128) {
                e2(i3 & 255, this.q);
            }
            i = (i << 6) | (i3 & 63);
            int i4 = this.q;
            if (i4 >= this.f41402r) {
                this.Z = 44;
                this.T = i;
                this.U = 2;
                return false;
            }
            byte[] bArr = this.h0;
            this.q = i4 + 1;
            i3 = bArr[i4];
            i2 = 2;
        }
        if (i2 == 2) {
            if ((i3 & 192) != 128) {
                e2(i3 & 255, this.q);
            }
            i = (i << 6) | (i3 & 63);
            int i5 = this.q;
            if (i5 >= this.f41402r) {
                this.Z = 44;
                this.T = i;
                this.U = 3;
                return false;
            }
            byte[] bArr2 = this.h0;
            this.q = i5 + 1;
            i3 = bArr2[i5];
        }
        if ((i3 & 192) != 128) {
            e2(i3 & 255, this.q);
        }
        int i6 = ((i << 6) | (i3 & 63)) - 65536;
        this.A.a((char) ((i6 >> 10) | 55296));
        this.A.a((char) ((i6 & 1023) | Utf8.LOG_SURROGATE_HEADER));
        return true;
    }

    public final JsonToken q3(int i) throws IOException {
        if (i <= 32 && (i = X2(i)) <= 0) {
            this.Z = 13;
            return this.c;
        }
        if (i != 44) {
            if (i == 93) {
                return R1();
            }
            if (i == 125) {
                return S1();
            }
            if (i == 47) {
                return j3(13);
            }
            if (i == 35) {
                return F2(13);
            }
            e1(i, "was expecting comma to separate " + this.y.j() + " entries");
        }
        int i2 = this.q;
        if (i2 >= this.f41402r) {
            this.Z = 15;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this.c = jsonToken;
            return jsonToken;
        }
        int iX2 = this.h0[i2];
        this.q = i2 + 1;
        if (iX2 <= 32 && (iX2 = X2(iX2)) <= 0) {
            this.Z = 15;
            return this.c;
        }
        h2();
        if (iX2 == 34) {
            return k3();
        }
        if (iX2 == 35) {
            return F2(15);
        }
        if (iX2 == 45) {
            return f3();
        }
        if (iX2 == 91) {
            return f2();
        }
        if (iX2 != 93) {
            if (iX2 == 102) {
                return b3();
            }
            if (iX2 == 110) {
                return g3();
            }
            if (iX2 == 116) {
                return l3();
            }
            if (iX2 == 123) {
                return g2();
            }
            if (iX2 != 125) {
                switch (iX2) {
                    case 47:
                        return j3(15);
                    case 48:
                        return h3();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return i3(iX2);
                }
            }
            if (A0(JsonParser.Feature.ALLOW_TRAILING_COMMA)) {
                return S1();
            }
        } else if (A0(JsonParser.Feature.ALLOW_TRAILING_COMMA)) {
            return R1();
        }
        return m3(true, iX2);
    }

    @Override // defpackage.zkh
    public char r1() throws IOException {
        jpq.c();
        return ' ';
    }

    public final int r2(int i, int i2) throws IOException {
        if ((i2 & 192) != 128) {
            e2(i2 & 255, this.q);
        }
        return ((i & 31) << 6) | (i2 & 63);
    }

    public final int s2(int i, int i2, int i3) throws IOException {
        int i4 = i & 15;
        if ((i2 & 192) != 128) {
            e2(i2 & 255, this.q);
        }
        int i5 = (i4 << 6) | (i2 & 63);
        if ((i3 & 192) != 128) {
            e2(i3 & 255, this.q);
        }
        return (i5 << 6) | (i3 & 63);
    }

    public final int t2(int i, int i2, int i3, int i4) throws IOException {
        if ((i2 & 192) != 128) {
            e2(i2 & 255, this.q);
        }
        int i5 = ((i & 7) << 6) | (i2 & 63);
        if ((i3 & 192) != 128) {
            e2(i3 & 255, this.q);
        }
        int i6 = (i5 << 6) | (i3 & 63);
        if ((i4 & 192) != 128) {
            e2(i4 & 255, this.q);
        }
        return ((i6 << 6) | (i4 & 63)) - 65536;
    }

    public final String u2() throws IOException {
        byte[] bArr = this.h0;
        int[] iArr = j0;
        int i = this.q;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        if (iArr[i3] != 0) {
            if (i3 != 34) {
                return null;
            }
            this.q = i2;
            return "";
        }
        int i4 = i + 2;
        int i5 = bArr[i2] & 255;
        if (iArr[i5] != 0) {
            if (i5 != 34) {
                return null;
            }
            this.q = i4;
            return V1(i3, 1);
        }
        int i6 = i5 | (i3 << 8);
        int i7 = i + 3;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            if (i8 != 34) {
                return null;
            }
            this.q = i7;
            return V1(i6, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i + 4;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            if (i11 != 34) {
                return null;
            }
            this.q = i10;
            return V1(i9, 3);
        }
        int i12 = (i9 << 8) | i11;
        int i13 = i + 5;
        int i14 = bArr[i10] & 255;
        if (iArr[i14] == 0) {
            this.S = i12;
            return U2(i13, i14);
        }
        if (i14 != 34) {
            return null;
        }
        this.q = i13;
        return V1(i12, 4);
    }

    public final JsonToken v2(int i, int i2, int i3) throws IOException {
        int[] iArrJ1 = this.Q;
        int[] iArr = j0;
        while (true) {
            int i4 = this.q;
            if (i4 >= this.f41402r) {
                this.R = i;
                this.T = i2;
                this.U = i3;
                this.Z = 9;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.h0;
            this.q = i4 + 1;
            int iL2 = bArr[i4] & 255;
            if (iL2 == 39) {
                if (i3 > 0) {
                    if (i >= iArrJ1.length) {
                        iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                        this.Q = iArrJ1;
                    }
                    iArrJ1[i] = bwg.a2(i2, i3);
                    i++;
                } else if (i == 0) {
                    return U1("");
                }
                String strF = this.P.F(iArrJ1, i);
                if (strF == null) {
                    strF = Q1(iArrJ1, i, i3);
                }
                return U1(strF);
            }
            if (iL2 != 34 && iArr[iL2] != 0) {
                if (iL2 != 92) {
                    h1(iL2, "name");
                } else {
                    iL2 = l2();
                    if (iL2 < 0) {
                        this.Z = 8;
                        this.a0 = 9;
                        this.R = i;
                        this.T = i2;
                        this.U = i3;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this.c = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (iL2 > 127) {
                    int i5 = 0;
                    if (i3 >= 4) {
                        if (i >= iArrJ1.length) {
                            iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                            this.Q = iArrJ1;
                        }
                        iArrJ1[i] = i2;
                        i++;
                        i2 = 0;
                        i3 = 0;
                    }
                    if (iL2 < 2048) {
                        i2 = (i2 << 8) | (iL2 >> 6) | 192;
                        i3++;
                    } else {
                        int i6 = (i2 << 8) | (iL2 >> 12) | SportReportBaseParser.ReportType.avgFreq;
                        int i7 = i3 + 1;
                        if (i7 >= 4) {
                            if (i >= iArrJ1.length) {
                                iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                                this.Q = iArrJ1;
                            }
                            iArrJ1[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((iL2 >> 6) & 63) | 128;
                        i3 = i7 + 1;
                    }
                    iL2 = (iL2 & 63) | 128;
                }
            }
            if (i3 < 4) {
                i3++;
                i2 = (i2 << 8) | iL2;
            } else {
                if (i >= iArrJ1.length) {
                    iArrJ1 = zkh.J1(iArrJ1, iArrJ1.length);
                    this.Q = iArrJ1;
                }
                iArrJ1[i] = i2;
                i++;
                i2 = iL2;
                i3 = 1;
            }
        }
    }

    public final JsonToken w2() throws IOException {
        int[] iArr = i0;
        byte[] bArr = this.h0;
        char[] cArrQ = this.A.q();
        int iS = this.A.s();
        int i = this.q;
        int i2 = this.f41402r - 5;
        while (i < this.f41402r) {
            int i3 = 0;
            if (iS >= cArrQ.length) {
                cArrQ = this.A.p();
                iS = 0;
            }
            int iMin = Math.min(this.f41402r, (cArrQ.length - iS) + i);
            while (i < iMin) {
                int i4 = i + 1;
                int iM2 = bArr[i] & 255;
                int i5 = iArr[iM2];
                if (i5 != 0 && iM2 != 34) {
                    if (i4 < i2) {
                        if (i5 == 1) {
                            this.q = i4;
                            iM2 = m2();
                            i = this.q;
                        } else if (i5 == 2) {
                            i += 2;
                            iM2 = r2(iM2, this.h0[i4]);
                        } else if (i5 == 3) {
                            byte[] bArr2 = this.h0;
                            int i6 = i + 2;
                            i += 3;
                            iM2 = s2(iM2, bArr2[i4], bArr2[i6]);
                        } else if (i5 != 4) {
                            if (iM2 < 32) {
                                h1(iM2, "string value");
                            } else {
                                b2(iM2);
                            }
                            i = i4;
                        } else {
                            byte[] bArr3 = this.h0;
                            byte b2 = bArr3[i4];
                            int i7 = i + 3;
                            byte b3 = bArr3[i + 2];
                            i += 4;
                            int iT2 = t2(iM2, b2, b3, bArr3[i7]);
                            int i8 = iS + 1;
                            cArrQ[iS] = (char) ((iT2 >> 10) | 55296);
                            if (i8 >= cArrQ.length) {
                                cArrQ = this.A.p();
                                iS = 0;
                            } else {
                                iS = i8;
                            }
                            iM2 = (iT2 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                        }
                        if (iS >= cArrQ.length) {
                            cArrQ = this.A.p();
                        } else {
                            i3 = iS;
                        }
                        iS = i3 + 1;
                        cArrQ[i3] = (char) iM2;
                        break;
                    }
                    this.q = i4;
                    this.A.E(iS);
                    if (o2(iM2, iArr[iM2], i4 < this.f41402r)) {
                        cArrQ = this.A.q();
                        iS = this.A.s();
                        i = this.q;
                        break;
                    }
                    this.a0 = 45;
                    JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                    this.c = jsonToken;
                    return jsonToken;
                }
                if (iM2 == 39) {
                    this.q = i4;
                    this.A.E(iS);
                    return i2(JsonToken.VALUE_STRING);
                }
                cArrQ[iS] = (char) iM2;
                iS++;
                i = i4;
            }
        }
        this.q = i;
        this.Z = 45;
        this.A.E(iS);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this.c = jsonToken2;
        return jsonToken2;
    }

    public final JsonToken x2(int i) throws IOException {
        while (true) {
            int i2 = this.q;
            if (i2 >= this.f41402r) {
                this.T = i;
                this.Z = 1;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.h0;
            this.q = i2 + 1;
            int i3 = bArr[i2] & 255;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.s -= 3;
                        return a3(i3);
                    }
                } else if (i3 != 191) {
                    Y0("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(i3));
                }
            } else if (i3 != 187) {
                Y0("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(i3));
            }
            i++;
        }
    }

    public final JsonToken y2(int i, boolean z) throws IOException {
        while (true) {
            int i2 = this.q;
            if (i2 >= this.f41402r) {
                this.Z = z ? 52 : 53;
                this.T = i;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.h0;
            int i3 = i2 + 1;
            this.q = i3;
            int i4 = bArr[i2] & 255;
            if (i4 < 32) {
                if (i4 == 10) {
                    this.t++;
                    this.u = i3;
                } else if (i4 == 13) {
                    this.e0++;
                    this.u = i3;
                } else if (i4 != 9) {
                    g1(i4);
                }
            } else if (i4 == 42) {
                z = true;
            } else if (i4 == 47 && z) {
                return Y2(i);
            }
            z = false;
        }
    }

    public final JsonToken z2(int i) throws IOException {
        while (true) {
            int i2 = this.q;
            if (i2 >= this.f41402r) {
                this.Z = 54;
                this.T = i;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this.c = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this.h0;
            int i3 = i2 + 1;
            this.q = i3;
            int i4 = bArr[i2] & 255;
            if (i4 < 32) {
                if (i4 == 10) {
                    this.t++;
                    this.u = i3;
                } else if (i4 == 13) {
                    this.e0++;
                    this.u = i3;
                } else if (i4 != 9) {
                    g1(i4);
                }
                return Y2(i);
            }
        }
    }
}
