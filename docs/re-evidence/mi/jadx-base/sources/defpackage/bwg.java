package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;
import java.io.OutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bwg extends zkh {
    public static final String[] f0 = {"NaN", "Infinity", "+Infinity", "-Infinity"};
    public static final double[] g0 = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
    public final r73 P;
    public int[] Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public boolean b0;
    public int c0;
    public int d0;
    public int e0;

    public bwg(xuc xucVar, int i, r73 r73Var) {
        super(xucVar, i);
        this.Q = new int[8];
        this.b0 = false;
        this.d0 = 0;
        this.e0 = 1;
        this.P = r73Var;
        this.c = null;
        this.X = 0;
        this.Y = 1;
    }

    public static final int a2(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    @Override // defpackage.zkh
    public void A1() throws IOException {
        super.A1();
        this.P.M();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public v3h D() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation E() {
        int i = (this.q - this.u) + 1;
        return new JsonLocation(u1(), this.s + ((long) (this.q - this.d0)), -1L, Math.max(this.t, this.e0), i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int K0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        byte[] bArrS = s(base64Variant);
        outputStream.write(bArrS);
        return bArrS.length;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object P() throws IOException {
        if (this.c == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this.E;
        }
        return null;
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
    public final String Q1(int[] iArr, int i, int i2) throws JsonParseException {
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
                        c2(i17);
                        i4 = 1;
                    }
                    if (i18 + i5 > i12) {
                        b1(" in field name", JsonToken.FIELD_NAME);
                    }
                    i6 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                    i18 = i14 + 2;
                    if ((i6 & 192) != 128) {
                        d2(i6);
                    }
                    i7 = (i4 << 6) | (i6 & 63);
                    if (i5 > 1) {
                        i9 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                        i18 = i14 + 3;
                        if ((i9 & 192) != 128) {
                            d2(i9);
                        }
                        i10 = (i7 << 6) | (i9 & 63);
                        if (i5 > 2) {
                            i11 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                            i18 = i14 + 4;
                            if ((i11 & 192) != 128) {
                                d2(i11 & 255);
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
                    d2(i6);
                }
                i7 = (i4 << 6) | (i6 & 63);
                if (i5 > 1) {
                    i9 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                    i18 = i14 + 3;
                    if ((i9 & 192) != 128) {
                        d2(i9);
                    }
                    i10 = (i7 << 6) | (i9 & 63);
                    if (i5 > 2) {
                        i11 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                        i18 = i14 + 4;
                        if ((i11 & 192) != 128) {
                            d2(i11 & 255);
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
        return this.P.v(str, iArr, i);
    }

    public final JsonToken R1() throws IOException {
        int i;
        if (!this.y.f()) {
            B1(93, AbstractJsonLexerKt.END_OBJ);
        }
        utd utdVarE = this.y.e();
        this.y = utdVarE;
        if (utdVarE.g()) {
            i = 3;
        } else {
            i = utdVarE.f() ? 6 : 1;
        }
        this.X = i;
        this.Y = i;
        JsonToken jsonToken = JsonToken.END_ARRAY;
        this.c = jsonToken;
        return jsonToken;
    }

    public final JsonToken S1() throws IOException {
        int i;
        if (!this.y.g()) {
            B1(125, AbstractJsonLexerKt.END_LIST);
        }
        utd utdVarE = this.y.e();
        this.y = utdVarE;
        if (utdVarE.g()) {
            i = 3;
        } else {
            i = utdVarE.f() ? 6 : 1;
        }
        this.X = i;
        this.Y = i;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        this.c = jsonToken;
        return jsonToken;
    }

    public final JsonToken T1() throws IOException {
        this.X = 7;
        if (!this.y.h()) {
            S0();
        }
        close();
        this.c = null;
        return null;
    }

    public final JsonToken U1(String str) throws IOException {
        this.X = 4;
        this.y.u(str);
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        this.c = jsonToken;
        return jsonToken;
    }

    public final String V1(int i, int i2) throws JsonParseException {
        int iA2 = a2(i, i2);
        String strC = this.P.C(iA2);
        if (strC != null) {
            return strC;
        }
        int[] iArr = this.Q;
        iArr[0] = iA2;
        return Q1(iArr, 1, i2);
    }

    public final String W1(int i, int i2, int i3) throws JsonParseException {
        int iA2 = a2(i2, i3);
        String strD = this.P.D(i, iA2);
        if (strD != null) {
            return strD;
        }
        int[] iArr = this.Q;
        iArr[0] = i;
        iArr[1] = iA2;
        return Q1(iArr, 2, i3);
    }

    public final String X1(int i, int i2, int i3, int i4) throws JsonParseException {
        int iA2 = a2(i3, i4);
        String strE = this.P.E(i, i2, iA2);
        if (strE != null) {
            return strE;
        }
        int[] iArr = this.Q;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = a2(iA2, i4);
        return Q1(iArr, 3, i4);
    }

    public final String Y1(JsonToken jsonToken) {
        int iId;
        if (jsonToken == null || (iId = jsonToken.id()) == -1) {
            return null;
        }
        if (iId != 5) {
            return (iId == 6 || iId == 7 || iId == 8) ? this.A.l() : jsonToken.asString();
        }
        return this.y.b();
    }

    public final String Z1(int i) {
        return f0[i];
    }

    public void b2(int i) throws JsonParseException {
        if (i < 32) {
            g1(i);
        }
        c2(i);
    }

    public void c2(int i) throws JsonParseException {
        X0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public String d0() throws IOException {
        JsonToken jsonToken = this.c;
        return jsonToken == JsonToken.VALUE_STRING ? this.A.l() : Y1(jsonToken);
    }

    public void d2(int i) throws JsonParseException {
        X0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    public void e2(int i, int i2) throws JsonParseException {
        this.q = i2;
        d2(i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] f0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            return (iId == 6 || iId == 7 || iId == 8) ? this.A.t() : this.c.asCharArray();
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

    public final JsonToken f2() throws IOException {
        this.y = this.y.m(-1, -1);
        this.X = 5;
        this.Y = 6;
        JsonToken jsonToken = JsonToken.START_ARRAY;
        this.c = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int g0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == null) {
            return 0;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            return (iId == 6 || iId == 7 || iId == 8) ? this.A.F() : this.c.asCharArray().length;
        }
        return this.y.b().length();
    }

    public final JsonToken g2() throws IOException {
        this.y = this.y.n(-1, -1);
        this.X = 2;
        this.Y = 3;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        this.c = jsonToken;
        return jsonToken;
    }

    public final void h2() {
        this.w = Math.max(this.t, this.e0);
        int i = this.q;
        this.x = i - this.u;
        this.v = this.s + ((long) (i - this.d0));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int i0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == null) {
            return 0;
        }
        int iId = jsonToken.id();
        if (iId == 6 || iId == 7 || iId == 8) {
            return this.A.u();
        }
        return 0;
    }

    public final JsonToken i2(JsonToken jsonToken) throws IOException {
        this.X = this.Y;
        this.c = jsonToken;
        return jsonToken;
    }

    public final JsonToken j2(int i, String str) throws IOException {
        this.A.B(str);
        this.M = str.length();
        this.F = 1;
        this.G = i;
        this.X = this.Y;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        this.c = jsonToken;
        return jsonToken;
    }

    public final JsonToken k2(int i) throws IOException {
        String str = f0[i];
        this.A.B(str);
        if (!A0(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
            Y0("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        this.M = 0;
        this.F = 8;
        this.I = g0[i];
        this.X = this.Y;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
        this.c = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation m0() {
        return new JsonLocation(u1(), this.v, -1L, this.w, this.x);
    }

    @Override // defpackage.zkh
    public void o1() throws IOException {
        this.d0 = 0;
        this.f41402r = 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] s(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_STRING) {
            Y0("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", jsonToken);
        }
        if (this.E == null) {
            t63 t63VarT1 = t1();
            Q0(d0(), t63VarT1, base64Variant);
            this.E = t63VarT1.D();
        }
        return this.E;
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public String u0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.A.l();
        }
        return jsonToken == JsonToken.FIELD_NAME ? J() : super.v0(null);
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public String v0(String str) throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.A.l();
        }
        return jsonToken == JsonToken.FIELD_NAME ? J() : super.v0(str);
    }

    @Override // defpackage.zkh, com.fasterxml.jackson.core.JsonParser
    public boolean x0() {
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.A.v();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.C;
        }
        return false;
    }
}
