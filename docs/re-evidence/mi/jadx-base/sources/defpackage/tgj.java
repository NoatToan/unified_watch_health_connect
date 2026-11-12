package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class tgj extends zkh {
    public static final int Z = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    public static final int[] a0 = xt3.g();
    public Reader P;
    public char[] Q;
    public boolean R;
    public v3h S;
    public final zt3 T;
    public final int U;
    public boolean V;
    public long W;
    public int X;
    public int Y;

    public tgj(xuc xucVar, int i, Reader reader, v3h v3hVar, zt3 zt3Var, char[] cArr, int i2, int i3, boolean z) {
        super(xucVar, i);
        this.P = reader;
        this.Q = cArr;
        this.q = i2;
        this.f41402r = i3;
        this.S = v3hVar;
        this.T = zt3Var;
        this.U = zt3Var.p();
        this.R = z;
    }

    private final void d2() throws IOException {
        int i;
        char c;
        int i2 = this.q;
        if (i2 + 4 < this.f41402r) {
            char[] cArr = this.Q;
            if (cArr[i2] == 'a' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 's' && cArr[i2 + 3] == 'e' && ((c = cArr[(i = i2 + 4)]) < '0' || c == ']' || c == '}')) {
                this.q = i;
                return;
            }
        }
        f2("false", 1);
    }

    private final void e2() throws IOException {
        int i;
        char c;
        int i2 = this.q;
        if (i2 + 3 < this.f41402r) {
            char[] cArr = this.Q;
            if (cArr[i2] == 'u' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 'l' && ((c = cArr[(i = i2 + 3)]) < '0' || c == ']' || c == '}')) {
                this.q = i;
                return;
            }
        }
        f2(AbstractJsonLexerKt.NULL, 1);
    }

    private final void h2() throws IOException {
        int i;
        char c;
        int i2 = this.q;
        if (i2 + 3 < this.f41402r) {
            char[] cArr = this.Q;
            if (cArr[i2] == 'r' && cArr[i2 + 1] == 'u' && cArr[i2 + 2] == 'e' && ((c = cArr[(i = i2 + 3)]) < '0' || c == ']' || c == '}')) {
                this.q = i;
                return;
            }
        }
        f2("true", 1);
    }

    @Override // defpackage.zkh
    public void A1() throws IOException {
        char[] cArr;
        super.A1();
        this.T.u();
        if (!this.R || (cArr = this.Q) == null) {
            return;
        }
        this.Q = null;
        this.o.s(cArr);
    }

    public final void A2() throws IOException {
        if (!A0(JsonParser.Feature.ALLOW_COMMENTS)) {
            e1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.q >= this.f41402r && !b2()) {
            b1(" in a comment", null);
        }
        char[] cArr = this.Q;
        int i = this.q;
        this.q = i + 1;
        char c = cArr[i];
        if (c == '/') {
            B2();
        } else if (c == '*') {
            v2();
        } else {
            e1(c, "was expecting either '*' or '/' for a comment");
        }
    }

    public final void B2() throws IOException {
        while (true) {
            if (this.q >= this.f41402r && !b2()) {
                return;
            }
            char[] cArr = this.Q;
            int i = this.q;
            int i2 = i + 1;
            this.q = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    this.t++;
                    this.u = i2;
                    return;
                } else if (c == '\r') {
                    w2();
                    return;
                } else if (c != '\t') {
                    g1(c);
                }
            }
        }
    }

    public final void C2() throws IOException {
        this.V = false;
        int i = this.q;
        int i2 = this.f41402r;
        char[] cArr = this.Q;
        while (true) {
            if (i >= i2) {
                this.q = i;
                if (!b2()) {
                    b1(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i = this.q;
                i2 = this.f41402r;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this.q = i3;
                    r1();
                    i = this.q;
                    i2 = this.f41402r;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.q = i3;
                        return;
                    } else if (c < ' ') {
                        this.q = i3;
                        h1(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public v3h D() {
        return this.S;
    }

    public final int D2() throws IOException {
        if (this.q >= this.f41402r && !b2()) {
            return s1();
        }
        char[] cArr = this.Q;
        int i = this.q;
        int i2 = i + 1;
        this.q = i2;
        char c = cArr[i];
        if (c > ' ') {
            if (c != '/' && c != '#') {
                return c;
            }
            this.q = i;
            return E2();
        }
        if (c != ' ') {
            if (c == '\n') {
                this.t++;
                this.u = i2;
            } else if (c == '\r') {
                w2();
            } else if (c != '\t') {
                g1(c);
            }
        }
        while (true) {
            int i3 = this.q;
            if (i3 >= this.f41402r) {
                return E2();
            }
            char[] cArr2 = this.Q;
            int i4 = i3 + 1;
            this.q = i4;
            char c2 = cArr2[i3];
            if (c2 > ' ') {
                if (c2 != '/' && c2 != '#') {
                    return c2;
                }
                this.q = i3;
                return E2();
            }
            if (c2 != ' ') {
                if (c2 == '\n') {
                    this.t++;
                    this.u = i4;
                } else if (c2 == '\r') {
                    w2();
                } else if (c2 != '\t') {
                    g1(c2);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation E() {
        int i = (this.q - this.u) + 1;
        return new JsonLocation(u1(), -1L, ((long) this.q) + this.s, this.t, i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String E0() throws IOException {
        JsonToken jsonTokenO2;
        this.F = 0;
        JsonToken jsonToken = this.c;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            i2();
            return null;
        }
        if (this.V) {
            C2();
        }
        int iD2 = D2();
        if (iD2 < 0) {
            close();
            this.c = null;
            return null;
        }
        this.E = null;
        if (iD2 == 93 || iD2 == 125) {
            R1(iD2);
            return null;
        }
        if (this.y.p()) {
            iD2 = z2(iD2);
            if ((this.f7621a & Z) != 0 && (iD2 == 93 || iD2 == 125)) {
                R1(iD2);
                return null;
            }
        }
        if (!this.y.g()) {
            G2();
            j2(iD2);
            return null;
        }
        H2();
        String strM2 = iD2 == 34 ? m2() : Y1(iD2);
        this.y.u(strM2);
        this.c = jsonToken2;
        int iX2 = x2();
        G2();
        if (iX2 == 34) {
            this.V = true;
            this.z = JsonToken.VALUE_STRING;
            return strM2;
        }
        if (iX2 == 45) {
            jsonTokenO2 = o2();
        } else if (iX2 == 91) {
            jsonTokenO2 = JsonToken.START_ARRAY;
        } else if (iX2 == 102) {
            d2();
            jsonTokenO2 = JsonToken.VALUE_FALSE;
        } else if (iX2 == 110) {
            e2();
            jsonTokenO2 = JsonToken.VALUE_NULL;
        } else if (iX2 == 116) {
            h2();
            jsonTokenO2 = JsonToken.VALUE_TRUE;
        } else if (iX2 != 123) {
            switch (iX2) {
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
                    jsonTokenO2 = q2(iX2);
                    break;
                default:
                    jsonTokenO2 = a2(iX2);
                    break;
            }
        } else {
            jsonTokenO2 = JsonToken.START_OBJECT;
        }
        this.z = jsonTokenO2;
        return strM2;
    }

    public final int E2() throws IOException {
        while (true) {
            if (this.q >= this.f41402r && !b2()) {
                return s1();
            }
            char[] cArr = this.Q;
            int i = this.q;
            int i2 = i + 1;
            this.q = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    A2();
                } else if (c != '#' || !F2()) {
                    return c;
                }
            } else if (c != ' ') {
                if (c == '\n') {
                    this.t++;
                    this.u = i2;
                } else if (c == '\r') {
                    w2();
                } else if (c != '\t') {
                    g1(c);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String F0() throws IOException {
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
            if (this.V) {
                this.V = false;
                T1();
            }
            return this.A.l();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this.y = this.y.m(this.w, this.x);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.y = this.y.n(this.w, this.x);
        }
        return null;
    }

    public final boolean F2() throws IOException {
        if (!A0(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        B2();
        return true;
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public final JsonToken G0() throws IOException {
        JsonToken jsonTokenO2;
        JsonToken jsonToken = this.c;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return i2();
        }
        this.F = 0;
        if (this.V) {
            C2();
        }
        int iD2 = D2();
        if (iD2 < 0) {
            close();
            this.c = null;
            return null;
        }
        this.E = null;
        if (iD2 == 93 || iD2 == 125) {
            R1(iD2);
            return this.c;
        }
        if (this.y.p()) {
            iD2 = z2(iD2);
            if ((this.f7621a & Z) != 0 && (iD2 == 93 || iD2 == 125)) {
                R1(iD2);
                return this.c;
            }
        }
        boolean zG = this.y.g();
        if (zG) {
            H2();
            this.y.u(iD2 == 34 ? m2() : Y1(iD2));
            this.c = jsonToken2;
            iD2 = x2();
        }
        G2();
        if (iD2 == 34) {
            this.V = true;
            jsonTokenO2 = JsonToken.VALUE_STRING;
        } else if (iD2 == 45) {
            jsonTokenO2 = o2();
        } else if (iD2 == 91) {
            if (!zG) {
                this.y = this.y.m(this.w, this.x);
            }
            jsonTokenO2 = JsonToken.START_ARRAY;
        } else if (iD2 == 102) {
            d2();
            jsonTokenO2 = JsonToken.VALUE_FALSE;
        } else if (iD2 == 110) {
            e2();
            jsonTokenO2 = JsonToken.VALUE_NULL;
        } else if (iD2 == 116) {
            h2();
            jsonTokenO2 = JsonToken.VALUE_TRUE;
        } else if (iD2 == 123) {
            if (!zG) {
                this.y = this.y.n(this.w, this.x);
            }
            jsonTokenO2 = JsonToken.START_OBJECT;
        } else if (iD2 != 125) {
            switch (iD2) {
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
                    jsonTokenO2 = q2(iD2);
                    break;
                default:
                    jsonTokenO2 = a2(iD2);
                    break;
            }
        } else {
            e1(iD2, "expected a value");
            h2();
            jsonTokenO2 = JsonToken.VALUE_TRUE;
        }
        if (zG) {
            this.z = jsonTokenO2;
            return this.c;
        }
        this.c = jsonTokenO2;
        return jsonTokenO2;
    }

    public final void G2() {
        int i = this.q;
        this.v = this.s + ((long) i);
        this.w = this.t;
        this.x = i - this.u;
    }

    public final void H2() {
        int i = this.q;
        this.W = i;
        this.X = this.t;
        this.Y = i - this.u;
    }

    public final char I2() throws IOException {
        char c;
        if ((this.q >= this.f41402r && !b2()) || (c = this.Q[this.q]) < '0' || c > '9') {
            return '0';
        }
        if (!A0(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            j1("Leading zeroes not allowed");
        }
        this.q++;
        if (c == '0') {
            do {
                if (this.q >= this.f41402r && !b2()) {
                    break;
                }
                char[] cArr = this.Q;
                int i = this.q;
                c = cArr[i];
                if (c < '0' || c > '9') {
                    return '0';
                }
                this.q = i + 1;
            } while (c == '0');
        }
        return c;
    }

    public final char J2() throws IOException {
        char c;
        int i = this.q;
        if (i >= this.f41402r || ((c = this.Q[i]) >= '0' && c <= '9')) {
            return I2();
        }
        return '0';
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int K0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this.V || this.c != JsonToken.VALUE_STRING) {
            byte[] bArrS = s(base64Variant);
            outputStream.write(bArrS);
            return bArrS.length;
        }
        byte[] bArrD = this.o.d();
        try {
            return r2(base64Variant, outputStream, bArrD);
        } finally {
            this.o.o(bArrD);
        }
    }

    public final void K2(int i) throws IOException {
        int i2 = this.q + 1;
        this.q = i2;
        if (i != 9) {
            if (i == 10) {
                this.t++;
                this.u = i2;
            } else if (i == 13) {
                w2();
            } else if (i != 32) {
                d1(i);
            }
        }
    }

    @Deprecated
    public char L2(String str) throws IOException {
        return M2(str, null);
    }

    public char M2(String str, JsonToken jsonToken) throws IOException {
        if (this.q >= this.f41402r && !b2()) {
            b1(str, jsonToken);
        }
        char[] cArr = this.Q;
        int i = this.q;
        this.q = i + 1;
        return cArr[i];
    }

    public final void Q1(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) i2)) {
            s2(str.substring(0, i));
        }
    }

    public final void R1(int i) throws JsonParseException {
        if (i == 93) {
            G2();
            if (!this.y.f()) {
                B1(i, AbstractJsonLexerKt.END_OBJ);
            }
            this.y = this.y.l();
            this.c = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            G2();
            if (!this.y.g()) {
                B1(i, AbstractJsonLexerKt.END_LIST);
            }
            this.y = this.y.l();
            this.c = JsonToken.END_OBJECT;
        }
    }

    public byte[] S1(Base64Variant base64Variant) throws IOException {
        t63 t63VarT1 = t1();
        while (true) {
            if (this.q >= this.f41402r) {
                c2();
            }
            char[] cArr = this.Q;
            int i = this.q;
            this.q = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(c);
                if (iDecodeBase64Char < 0) {
                    if (c == '\"') {
                        return t63VarT1.D();
                    }
                    iDecodeBase64Char = p1(base64Variant, c, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this.q >= this.f41402r) {
                    c2();
                }
                char[] cArr2 = this.Q;
                int i2 = this.q;
                this.q = i2 + 1;
                char c2 = cArr2[i2];
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(c2);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = p1(base64Variant, c2, 1);
                }
                int i3 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this.q >= this.f41402r) {
                    c2();
                }
                char[] cArr3 = this.Q;
                int i4 = this.q;
                this.q = i4 + 1;
                char c3 = cArr3[i4];
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(c3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (c3 == '\"') {
                            t63VarT1.b(i3 >> 4);
                            if (base64Variant.usesPadding()) {
                                this.q--;
                                v1(base64Variant);
                            }
                            return t63VarT1.D();
                        }
                        iDecodeBase64Char3 = p1(base64Variant, c3, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this.q >= this.f41402r) {
                            c2();
                        }
                        char[] cArr4 = this.Q;
                        int i5 = this.q;
                        this.q = i5 + 1;
                        char c4 = cArr4[i5];
                        if (!base64Variant.usesPaddingChar(c4) && p1(base64Variant, c4, 3) != -2) {
                            throw L1(base64Variant, c4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        t63VarT1.b(i3 >> 4);
                    }
                }
                int i6 = (i3 << 6) | iDecodeBase64Char3;
                if (this.q >= this.f41402r) {
                    c2();
                }
                char[] cArr5 = this.Q;
                int i7 = this.q;
                this.q = i7 + 1;
                char c5 = cArr5[i7];
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(c5);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (c5 == '\"') {
                            t63VarT1.d(i6 >> 2);
                            if (base64Variant.usesPadding()) {
                                this.q--;
                                v1(base64Variant);
                            }
                            return t63VarT1.D();
                        }
                        iDecodeBase64Char4 = p1(base64Variant, c5, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        t63VarT1.d(i6 >> 2);
                    }
                }
                t63VarT1.c((i6 << 6) | iDecodeBase64Char4);
            }
        }
    }

    public final void T1() throws IOException {
        int i = this.q;
        int i2 = this.f41402r;
        if (i < i2) {
            int[] iArr = a0;
            int length = iArr.length;
            do {
                char[] cArr = this.Q;
                char c = cArr[i];
                if (c < length && iArr[c] != 0) {
                    if (c != '\"') {
                        break;
                    }
                    o7p o7pVar = this.A;
                    int i3 = this.q;
                    o7pVar.A(cArr, i3, i - i3);
                    this.q = i + 1;
                    return;
                }
                i++;
            } while (i < i2);
        }
        o7p o7pVar2 = this.A;
        char[] cArr2 = this.Q;
        int i4 = this.q;
        o7pVar2.y(cArr2, i4, i - i4);
        this.q = i;
        U1();
    }

    public void U1() throws IOException {
        char[] cArrR = this.A.r();
        int iS = this.A.s();
        int[] iArr = a0;
        int length = iArr.length;
        while (true) {
            if (this.q >= this.f41402r && !b2()) {
                b1(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this.Q;
            int i = this.q;
            this.q = i + 1;
            char cR1 = cArr[i];
            if (cR1 < length && iArr[cR1] != 0) {
                if (cR1 == '\"') {
                    this.A.E(iS);
                    return;
                } else if (cR1 == '\\') {
                    cR1 = r1();
                } else if (cR1 < ' ') {
                    h1(cR1, "string value");
                }
            }
            if (iS >= cArrR.length) {
                cArrR = this.A.p();
                iS = 0;
            }
            cArrR[iS] = cR1;
            iS++;
        }
    }

    public final String V1(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            return (iId == 6 || iId == 7 || iId == 8) ? this.A.l() : jsonToken.asString();
        }
        return this.y.b();
    }

    public JsonToken W1() throws IOException {
        char[] cArrM = this.A.m();
        int iS = this.A.s();
        while (true) {
            if (this.q >= this.f41402r && !b2()) {
                b1(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this.Q;
            int i = this.q;
            this.q = i + 1;
            char cR1 = cArr[i];
            if (cR1 <= '\\') {
                if (cR1 == '\\') {
                    cR1 = r1();
                } else if (cR1 <= '\'') {
                    if (cR1 == '\'') {
                        this.A.E(iS);
                        return JsonToken.VALUE_STRING;
                    }
                    if (cR1 < ' ') {
                        h1(cR1, "string value");
                    }
                }
            }
            if (iS >= cArrM.length) {
                cArrM = this.A.p();
                iS = 0;
            }
            cArrM[iS] = cR1;
            iS++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public com.fasterxml.jackson.core.JsonToken X1(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public String Y1(int i) throws IOException {
        if (i == 39 && A0(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return k2();
        }
        if (!A0(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            e1(i, "was expecting double-quote to start field name");
        }
        int[] iArrH = xt3.h();
        int length = iArrH.length;
        if (i >= length ? !Character.isJavaIdentifierPart((char) i) : iArrH[i] != 0) {
            e1(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i2 = this.q;
        int i3 = this.U;
        int i4 = this.f41402r;
        if (i2 < i4) {
            do {
                char[] cArr = this.Q;
                char c = cArr[i2];
                if (c < length) {
                    if (iArrH[c] != 0) {
                        int i5 = this.q - 1;
                        this.q = i2;
                        return this.T.o(cArr, i5, i2 - i5, i3);
                    }
                } else if (!Character.isJavaIdentifierPart(c)) {
                    int i6 = this.q - 1;
                    this.q = i2;
                    return this.T.o(this.Q, i6, i2 - i6, i3);
                }
                i3 = (i3 * 33) + c;
                i2++;
            } while (i2 < i4);
        }
        int i7 = this.q - 1;
        this.q = i2;
        return Z1(i7, i3, iArrH);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[SYNTHETIC] */
    public final String Z1(int i, int i2, int[] iArr) throws IOException {
        int i3;
        this.A.A(this.Q, i, this.q - i);
        char[] cArrR = this.A.r();
        int iS = this.A.s();
        int length = iArr.length;
        while (true) {
            if (this.q >= this.f41402r && !b2()) {
                break;
            }
            char c = this.Q[this.q];
            if (c < length) {
                if (iArr[c] != 0) {
                    break;
                }
                this.q++;
                i2 = (i2 * 33) + c;
                i3 = iS + 1;
                cArrR[iS] = c;
                if (i3 >= cArrR.length) {
                    cArrR = this.A.p();
                    iS = 0;
                } else {
                    iS = i3;
                }
            } else {
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
                this.q++;
                i2 = (i2 * 33) + c;
                i3 = iS + 1;
                cArrR[iS] = c;
                if (i3 >= cArrR.length) {
                    cArrR = this.A.p();
                    iS = 0;
                } else {
                    iS = i3;
                }
            }
        }
        this.A.E(iS);
        o7p o7pVar = this.A;
        return this.T.o(o7pVar.t(), o7pVar.u(), o7pVar.F(), i2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    public JsonToken a2(int i) throws IOException {
        if (i != 39) {
            if (i == 73) {
                f2("Infinity", 1);
                if (A0(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return N1("Infinity", Double.POSITIVE_INFINITY);
                }
                X0("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i == 78) {
                f2("NaN", 1);
                if (A0(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return N1("NaN", Double.NaN);
                }
                X0("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i != 93) {
                if (i == 43) {
                    if (this.q >= this.f41402r && !b2()) {
                        c1(JsonToken.VALUE_NUMBER_INT);
                    }
                    char[] cArr = this.Q;
                    int i2 = this.q;
                    this.q = i2 + 1;
                    return X1(cArr[i2], false);
                }
                if (i == 44) {
                    if (A0(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
                        this.q--;
                        return JsonToken.VALUE_NULL;
                    }
                }
            } else if (this.y.f()) {
                if (A0(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
                    this.q--;
                    return JsonToken.VALUE_NULL;
                }
            }
        } else if (A0(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return W1();
        }
        if (Character.isJavaIdentifierStart(i)) {
            t2("" + ((char) i), "('true', 'false' or 'null')");
        }
        e1(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    public boolean b2() throws IOException {
        int i = this.f41402r;
        long j = i;
        this.s += j;
        this.u -= i;
        this.W -= j;
        Reader reader = this.P;
        if (reader != null) {
            char[] cArr = this.Q;
            int i2 = reader.read(cArr, 0, cArr.length);
            if (i2 > 0) {
                this.q = 0;
                this.f41402r = i2;
                return true;
            }
            o1();
            if (i2 == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.f41402r);
            }
        }
        return false;
    }

    public void c2() throws IOException {
        if (b2()) {
            return;
        }
        a1();
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public final String d0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return V1(jsonToken);
        }
        if (this.V) {
            this.V = false;
            T1();
        }
        return this.A.l();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] f0() throws IOException {
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
            } else if (this.V) {
                this.V = false;
                T1();
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

    public final void f2(String str, int i) throws IOException {
        int i2;
        int length = str.length();
        if (this.q + length >= this.f41402r) {
            g2(str, i);
            return;
        }
        do {
            if (this.Q[this.q] != str.charAt(i)) {
                s2(str.substring(0, i));
            }
            i2 = this.q + 1;
            this.q = i2;
            i++;
        } while (i < length);
        char c = this.Q[i2];
        if (c < '0' || c == ']' || c == '}') {
            return;
        }
        Q1(str, i, c);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int g0() throws IOException {
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
        } else if (this.V) {
            this.V = false;
            T1();
        }
        return this.A.F();
    }

    public final void g2(String str, int i) throws IOException {
        int i2;
        char c;
        int length = str.length();
        do {
            if ((this.q >= this.f41402r && !b2()) || this.Q[this.q] != str.charAt(i)) {
                s2(str.substring(0, i));
            }
            i2 = this.q + 1;
            this.q = i2;
            i++;
        } while (i < length);
        if ((i2 < this.f41402r || b2()) && (c = this.Q[this.q]) >= '0' && c != ']' && c != '}') {
            Q1(str, i, c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i0() throws java.io.IOException {
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
            boolean r0 = r3.V
            if (r0 == 0) goto L1d
            r3.V = r1
            r3.T1()
        L1d:
            o7p r0 = r3.A
            int r0 = r0.u()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgj.i0():int");
    }

    public final JsonToken i2() {
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

    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    public final JsonToken j2(int i) throws IOException {
        if (i == 34) {
            this.V = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.c = jsonToken;
            return jsonToken;
        }
        if (i == 44) {
            if (A0(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
                this.q--;
                JsonToken jsonToken2 = JsonToken.VALUE_NULL;
                this.c = jsonToken2;
                return jsonToken2;
            }
        } else {
            if (i == 45) {
                JsonToken jsonTokenO2 = o2();
                this.c = jsonTokenO2;
                return jsonTokenO2;
            }
            if (i == 91) {
                this.y = this.y.m(this.w, this.x);
                JsonToken jsonToken3 = JsonToken.START_ARRAY;
                this.c = jsonToken3;
                return jsonToken3;
            }
            if (i != 93) {
                if (i == 102) {
                    f2("false", 1);
                    JsonToken jsonToken4 = JsonToken.VALUE_FALSE;
                    this.c = jsonToken4;
                    return jsonToken4;
                }
                if (i == 110) {
                    f2(AbstractJsonLexerKt.NULL, 1);
                    JsonToken jsonToken5 = JsonToken.VALUE_NULL;
                    this.c = jsonToken5;
                    return jsonToken5;
                }
                if (i == 116) {
                    f2("true", 1);
                    JsonToken jsonToken6 = JsonToken.VALUE_TRUE;
                    this.c = jsonToken6;
                    return jsonToken6;
                }
                if (i != 123) {
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
                            JsonToken jsonTokenQ2 = q2(i);
                            this.c = jsonTokenQ2;
                            return jsonTokenQ2;
                    }
                }
                this.y = this.y.n(this.w, this.x);
                JsonToken jsonToken7 = JsonToken.START_OBJECT;
                this.c = jsonToken7;
                return jsonToken7;
            }
            if (A0(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
                this.q--;
                JsonToken jsonToken8 = JsonToken.VALUE_NULL;
                this.c = jsonToken8;
                return jsonToken8;
            }
        }
        JsonToken jsonTokenA2 = a2(i);
        this.c = jsonTokenA2;
        return jsonTokenA2;
    }

    public String k2() throws IOException {
        int i = this.q;
        int i2 = this.U;
        int i3 = this.f41402r;
        if (i < i3) {
            int[] iArr = a0;
            int length = iArr.length;
            do {
                char[] cArr = this.Q;
                char c = cArr[i];
                if (c != '\'') {
                    if (c < length && iArr[c] != 0) {
                        break;
                    }
                    i2 = (i2 * 33) + c;
                    i++;
                } else {
                    int i4 = this.q;
                    this.q = i + 1;
                    return this.T.o(cArr, i4, i - i4, i2);
                }
            } while (i < i3);
        }
        int i5 = this.q;
        this.q = i;
        return n2(i5, i2, 39);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final com.fasterxml.jackson.core.JsonToken l2(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation m0() {
        if (this.c != JsonToken.FIELD_NAME) {
            return new JsonLocation(u1(), -1L, this.v - 1, this.w, this.x);
        }
        return new JsonLocation(u1(), -1L, this.s + (this.W - 1), this.X, this.Y);
    }

    public final String m2() throws IOException {
        int i = this.q;
        int i2 = this.U;
        int[] iArr = a0;
        while (i < this.f41402r) {
            char[] cArr = this.Q;
            char c = cArr[i];
            if (c < iArr.length && iArr[c] != 0) {
                if (c != '\"') {
                    break;
                }
                int i3 = this.q;
                this.q = i + 1;
                return this.T.o(cArr, i3, i - i3, i2);
            }
            i2 = (i2 * 33) + c;
            i++;
        }
        int i4 = this.q;
        this.q = i;
        return n2(i4, i2, 34);
    }

    public final String n2(int i, int i2, int i3) throws IOException {
        this.A.A(this.Q, i, this.q - i);
        char[] cArrR = this.A.r();
        int iS = this.A.s();
        while (true) {
            if (this.q >= this.f41402r && !b2()) {
                b1(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this.Q;
            int i4 = this.q;
            this.q = i4 + 1;
            char cR1 = cArr[i4];
            if (cR1 <= '\\') {
                if (cR1 == '\\') {
                    cR1 = r1();
                } else if (cR1 <= i3) {
                    if (cR1 == i3) {
                        this.A.E(iS);
                        o7p o7pVar = this.A;
                        return this.T.o(o7pVar.t(), o7pVar.u(), o7pVar.F(), i2);
                    }
                    if (cR1 < ' ') {
                        h1(cR1, "name");
                    }
                }
            }
            i2 = (i2 * 33) + cR1;
            int i5 = iS + 1;
            cArrR[iS] = cR1;
            if (i5 >= cArrR.length) {
                cArrR = this.A.p();
                iS = 0;
            } else {
                iS = i5;
            }
        }
    }

    @Override // defpackage.zkh
    public void o1() throws IOException {
        if (this.P != null) {
            if (this.o.n() || A0(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.P.close();
            }
            this.P = null;
        }
    }

    public final JsonToken o2() throws IOException {
        int i = this.q;
        int i2 = i - 1;
        int i3 = this.f41402r;
        if (i >= i3) {
            return p2(true, i2);
        }
        int i4 = i + 1;
        char c = this.Q[i];
        if (c > '9' || c < '0') {
            this.q = i4;
            return X1(c, true);
        }
        if (c == '0') {
            return p2(true, i2);
        }
        int i5 = 1;
        while (i4 < i3) {
            int i6 = i4 + 1;
            char c2 = this.Q[i4];
            if (c2 < '0' || c2 > '9') {
                if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this.q = i6;
                    return l2(c2, i2, i6, true, i5);
                }
                this.q = i4;
                if (this.y.h()) {
                    K2(c2);
                }
                this.A.A(this.Q, i2, i4 - i2);
                return P1(true, i5);
            }
            i5++;
            i4 = i6;
        }
        return p2(true, i2);
    }

    public final JsonToken p2(boolean z, int i) throws IOException {
        int i2;
        char cM2;
        boolean z2;
        int i3;
        char cL2;
        if (z) {
            i++;
        }
        this.q = i;
        char[] cArrM = this.A.m();
        int i4 = 0;
        if (z) {
            cArrM[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = this.q;
        if (i5 < this.f41402r) {
            char[] cArr = this.Q;
            this.q = i5 + 1;
            cM2 = cArr[i5];
        } else {
            cM2 = M2("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (cM2 == '0') {
            cM2 = J2();
        }
        int i6 = 0;
        while (true) {
            if (cM2 >= '0' && cM2 <= '9') {
                i6++;
                if (i2 >= cArrM.length) {
                    cArrM = this.A.p();
                    i2 = 0;
                }
                int i7 = i2 + 1;
                cArrM[i2] = cM2;
                if (this.q >= this.f41402r && !b2()) {
                    cM2 = 0;
                    i2 = i7;
                    z2 = true;
                    break;
                }
                char[] cArr2 = this.Q;
                int i8 = this.q;
                this.q = i8 + 1;
                cM2 = cArr2[i8];
                i2 = i7;
            } else {
                z2 = false;
                break;
            }
        }
        if (i6 == 0) {
            return X1(cM2, z);
        }
        if (cM2 == '.') {
            if (i2 >= cArrM.length) {
                cArrM = this.A.p();
                i2 = 0;
            }
            cArrM[i2] = cM2;
            i2++;
            i3 = 0;
            while (true) {
                if (this.q >= this.f41402r && !b2()) {
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.Q;
                int i9 = this.q;
                this.q = i9 + 1;
                cM2 = cArr3[i9];
                if (cM2 < '0' || cM2 > '9') {
                    break;
                }
                i3++;
                if (i2 >= cArrM.length) {
                    cArrM = this.A.p();
                    i2 = 0;
                }
                cArrM[i2] = cM2;
                i2++;
            }
            if (i3 == 0) {
                m1(cM2, "Decimal point not followed by a digit");
            }
        } else {
            i3 = 0;
        }
        if (cM2 == 'e' || cM2 == 'E') {
            if (i2 >= cArrM.length) {
                cArrM = this.A.p();
                i2 = 0;
            }
            int i10 = i2 + 1;
            cArrM[i2] = cM2;
            int i11 = this.q;
            if (i11 < this.f41402r) {
                char[] cArr4 = this.Q;
                this.q = i11 + 1;
                cL2 = cArr4[i11];
            } else {
                cL2 = L2("expected a digit for number exponent");
            }
            if (cL2 == '-' || cL2 == '+') {
                if (i10 >= cArrM.length) {
                    cArrM = this.A.p();
                    i10 = 0;
                }
                int i12 = i10 + 1;
                cArrM[i10] = cL2;
                int i13 = this.q;
                if (i13 < this.f41402r) {
                    char[] cArr5 = this.Q;
                    this.q = i13 + 1;
                    cL2 = cArr5[i13];
                } else {
                    cL2 = L2("expected a digit for number exponent");
                }
                i10 = i12;
            }
            int i14 = 0;
            cM2 = cL2;
            while (true) {
                if (cM2 <= '9' && cM2 >= '0') {
                    i14++;
                    if (i10 >= cArrM.length) {
                        cArrM = this.A.p();
                        i10 = 0;
                    }
                    i2 = i10 + 1;
                    cArrM[i10] = cM2;
                    if (this.q >= this.f41402r && !b2()) {
                        i4 = i14;
                        z2 = true;
                        break;
                    }
                    char[] cArr6 = this.Q;
                    int i15 = this.q;
                    this.q = i15 + 1;
                    cM2 = cArr6[i15];
                    i10 = i2;
                } else {
                    i4 = i14;
                    i2 = i10;
                    break;
                }
            }
            if (i4 == 0) {
                m1(cM2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.q--;
            if (this.y.h()) {
                K2(cM2);
            }
        }
        this.A.E(i2);
        return M1(z, i6, i3, i4);
    }

    public final JsonToken q2(int i) throws IOException {
        int i2 = this.q;
        int i3 = i2 - 1;
        int i4 = this.f41402r;
        if (i == 48) {
            return p2(false, i3);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            char c = this.Q[i2];
            if (c < '0' || c > '9') {
                if (c == '.' || c == 'e' || c == 'E') {
                    this.q = i6;
                    return l2(c, i3, i6, false, i5);
                }
                this.q = i2;
                if (this.y.h()) {
                    K2(c);
                }
                this.A.A(this.Q, i3, i2 - i3);
                return P1(false, i5);
            }
            i5++;
            i2 = i6;
        }
        this.q = i3;
        return p2(false, i3);
    }

    @Override // defpackage.zkh
    public char r1() throws IOException {
        if (this.q >= this.f41402r && !b2()) {
            b1(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this.Q;
        int i = this.q;
        this.q = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return StringUtil.CARRIAGE_RETURN;
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            return T0(c);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.q >= this.f41402r && !b2()) {
                b1(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this.Q;
            int i4 = this.q;
            this.q = i4 + 1;
            char c2 = cArr2[i4];
            int iB = xt3.b(c2);
            if (iB < 0) {
                e1(c2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iB;
        }
        return (char) i2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a A[DONT_INVERT, PHI: r10
      0x003a: PHI (r10v4 int) = (r10v3 int), (r10v22 int) binds: [B:9:0x002b, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x011b A[EDGE_INSN: B:56:0x011b->B:57:0x0123 BREAK  A[LOOP:0: B:3:0x000e->B:77:0x000e]] */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:64:0x0135  */
    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0108 A[SYNTHETIC] */
    public int r2(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i;
        char c;
        int iDecodeBase64Char;
        int i2;
        char c2;
        int iDecodeBase64Char2;
        int i3;
        char c3;
        int iDecodeBase64Char3;
        char c4;
        int i4 = 3;
        int length = bArr.length - 3;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (this.q >= this.f41402r) {
                c2();
            }
            char[] cArr = this.Q;
            int i7 = this.q;
            this.q = i7 + 1;
            char c5 = cArr[i7];
            if (c5 > ' ') {
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(c5);
                if (iDecodeBase64Char4 < 0) {
                    if (c5 == '\"') {
                        break;
                    }
                    iDecodeBase64Char4 = p1(base64Variant, c5, 0);
                    if (iDecodeBase64Char4 >= 0) {
                        if (i5 > length) {
                            i6 += i5;
                            outputStream.write(bArr, 0, i5);
                            i5 = 0;
                        }
                        if (this.q >= this.f41402r) {
                            c2();
                        }
                        char[] cArr2 = this.Q;
                        int i8 = this.q;
                        this.q = i8 + 1;
                        c = cArr2[i8];
                        iDecodeBase64Char = base64Variant.decodeBase64Char(c);
                        if (iDecodeBase64Char < 0) {
                            iDecodeBase64Char = p1(base64Variant, c, 1);
                        }
                        i2 = (iDecodeBase64Char4 << 6) | iDecodeBase64Char;
                        if (this.q >= this.f41402r) {
                            c2();
                        }
                        char[] cArr3 = this.Q;
                        int i9 = this.q;
                        this.q = i9 + 1;
                        c2 = cArr3[i9];
                        iDecodeBase64Char2 = base64Variant.decodeBase64Char(c2);
                        if (iDecodeBase64Char2 >= 0) {
                            if (iDecodeBase64Char2 != -2) {
                                if (c2 == '\"') {
                                    int i10 = i5 + 1;
                                    bArr[i5] = (byte) (i2 >> 4);
                                    if (base64Variant.usesPadding()) {
                                        this.q--;
                                        v1(base64Variant);
                                    }
                                    i5 = i10;
                                    break;
                                }
                                iDecodeBase64Char2 = p1(base64Variant, c2, 2);
                            }
                            if (iDecodeBase64Char2 == -2) {
                                if (this.q >= this.f41402r) {
                                    c2();
                                }
                                char[] cArr4 = this.Q;
                                int i11 = this.q;
                                this.q = i11 + 1;
                                c4 = cArr4[i11];
                                if (base64Variant.usesPaddingChar(c4)) {
                                }
                                bArr[i5] = (byte) (i2 >> 4);
                                i5++;
                            }
                        }
                        i3 = (i2 << 6) | iDecodeBase64Char2;
                        if (this.q >= this.f41402r) {
                            c2();
                        }
                        char[] cArr5 = this.Q;
                        int i12 = this.q;
                        this.q = i12 + 1;
                        c3 = cArr5[i12];
                        iDecodeBase64Char3 = base64Variant.decodeBase64Char(c3);
                        if (iDecodeBase64Char3 < 0) {
                            if (iDecodeBase64Char3 != -2) {
                                i = 3;
                            } else {
                                if (c3 == '\"') {
                                    int i13 = i5 + 1;
                                    bArr[i5] = (byte) (i3 >> 10);
                                    i5 += 2;
                                    bArr[i13] = (byte) (i3 >> 2);
                                    if (base64Variant.usesPadding()) {
                                        break;
                                    }
                                    this.q--;
                                    v1(base64Variant);
                                    break;
                                }
                                i = 3;
                                iDecodeBase64Char3 = p1(base64Variant, c3, 3);
                            }
                            if (iDecodeBase64Char3 == -2) {
                                int i14 = i5 + 1;
                                bArr[i5] = (byte) (i3 >> 10);
                                i5 += 2;
                                bArr[i14] = (byte) (i3 >> 2);
                            }
                            i4 = i;
                        } else {
                            i = 3;
                        }
                        int i15 = (i3 << 6) | iDecodeBase64Char3;
                        bArr[i5] = (byte) (i15 >> 16);
                        int i16 = i5 + 2;
                        bArr[i5 + 1] = (byte) (i15 >> 8);
                        i5 += 3;
                        bArr[i16] = (byte) i15;
                        i4 = i;
                    }
                } else {
                    if (i5 > length) {
                        i6 += i5;
                        outputStream.write(bArr, 0, i5);
                        i5 = 0;
                    }
                    if (this.q >= this.f41402r) {
                        c2();
                    }
                    char[] cArr6 = this.Q;
                    int i17 = this.q;
                    this.q = i17 + 1;
                    c = cArr6[i17];
                    iDecodeBase64Char = base64Variant.decodeBase64Char(c);
                    if (iDecodeBase64Char < 0) {
                        iDecodeBase64Char = p1(base64Variant, c, 1);
                    }
                    i2 = (iDecodeBase64Char4 << 6) | iDecodeBase64Char;
                    if (this.q >= this.f41402r) {
                        c2();
                    }
                    char[] cArr7 = this.Q;
                    int i18 = this.q;
                    this.q = i18 + 1;
                    c2 = cArr7[i18];
                    iDecodeBase64Char2 = base64Variant.decodeBase64Char(c2);
                    if (iDecodeBase64Char2 >= 0) {
                        if (iDecodeBase64Char2 != -2) {
                            if (c2 == '\"') {
                                int i19 = i5 + 1;
                                bArr[i5] = (byte) (i2 >> 4);
                                if (base64Variant.usesPadding()) {
                                    this.q--;
                                    v1(base64Variant);
                                }
                                i5 = i19;
                                break;
                            }
                            iDecodeBase64Char2 = p1(base64Variant, c2, 2);
                        }
                        if (iDecodeBase64Char2 == -2) {
                            if (this.q >= this.f41402r) {
                                c2();
                            }
                            char[] cArr8 = this.Q;
                            int i110 = this.q;
                            this.q = i110 + 1;
                            c4 = cArr8[i110];
                            if (base64Variant.usesPaddingChar(c4) && p1(base64Variant, c4, i4) != -2) {
                                throw L1(base64Variant, c4, i4, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                            }
                            bArr[i5] = (byte) (i2 >> 4);
                            i5++;
                        }
                    }
                    i3 = (i2 << 6) | iDecodeBase64Char2;
                    if (this.q >= this.f41402r) {
                        c2();
                    }
                    char[] cArr9 = this.Q;
                    int i111 = this.q;
                    this.q = i111 + 1;
                    c3 = cArr9[i111];
                    iDecodeBase64Char3 = base64Variant.decodeBase64Char(c3);
                    if (iDecodeBase64Char3 < 0) {
                        if (iDecodeBase64Char3 != -2) {
                            i = 3;
                        } else {
                            if (c3 == '\"') {
                                int i112 = i5 + 1;
                                bArr[i5] = (byte) (i3 >> 10);
                                i5 += 2;
                                bArr[i112] = (byte) (i3 >> 2);
                                if (base64Variant.usesPadding()) {
                                    break;
                                }
                                this.q--;
                                v1(base64Variant);
                                break;
                            }
                            i = 3;
                            iDecodeBase64Char3 = p1(base64Variant, c3, 3);
                        }
                        if (iDecodeBase64Char3 == -2) {
                            int i113 = i5 + 1;
                            bArr[i5] = (byte) (i3 >> 10);
                            i5 += 2;
                            bArr[i113] = (byte) (i3 >> 2);
                        }
                        i4 = i;
                    } else {
                        i = 3;
                    }
                    int i114 = (i3 << 6) | iDecodeBase64Char3;
                    bArr[i5] = (byte) (i114 >> 16);
                    int i115 = i5 + 2;
                    bArr[i5 + 1] = (byte) (i114 >> 8);
                    i5 += 3;
                    bArr[i115] = (byte) i114;
                    i4 = i;
                }
            }
            i = i4;
            i4 = i;
        }
        this.V = false;
        if (i5 <= 0) {
            return i6;
        }
        int i20 = i6 + i5;
        outputStream.write(bArr, 0, i5);
        return i20;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] s(Base64Variant base64Variant) throws IOException {
        byte[] bArr;
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this.E) != null) {
            return bArr;
        }
        if (jsonToken != JsonToken.VALUE_STRING) {
            X0("Current token (" + this.c + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.V) {
            try {
                this.E = S1(base64Variant);
                this.V = false;
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

    public void s2(String str) throws IOException {
        t2(str, "'null', 'true', 'false' or NaN");
    }

    public void t2(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        do {
            if (this.q < this.f41402r || b2()) {
                char c = this.Q[this.q];
                if (Character.isJavaIdentifierPart(c)) {
                    this.q++;
                    sb.append(c);
                }
            }
            Z0("Unrecognized token '%s': was expecting %s", sb, str2);
        } while (sb.length() < 256);
        sb.append("...");
        Z0("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public final String u0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? J() : super.v0(null);
        }
        if (this.V) {
            this.V = false;
            T1();
        }
        return this.A.l();
    }

    public final int u2() throws IOException {
        while (true) {
            if (this.q >= this.f41402r && !b2()) {
                throw a("Unexpected end-of-input within/between " + this.y.j() + " entries");
            }
            char[] cArr = this.Q;
            int i = this.q;
            int i2 = i + 1;
            this.q = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    A2();
                } else if (c != '#' || !F2()) {
                    return c;
                }
            } else if (c < ' ') {
                if (c == '\n') {
                    this.t++;
                    this.u = i2;
                } else if (c == '\r') {
                    w2();
                } else if (c != '\t') {
                    g1(c);
                }
            }
        }
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public final String v0(String str) throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? J() : super.v0(str);
        }
        if (this.V) {
            this.V = false;
            T1();
        }
        return this.A.l();
    }

    public final void v2() throws IOException {
        while (true) {
            if (this.q >= this.f41402r && !b2()) {
                break;
            }
            char[] cArr = this.Q;
            int i = this.q;
            int i2 = i + 1;
            this.q = i2;
            char c = cArr[i];
            if (c <= '*') {
                if (c == '*') {
                    if (i2 >= this.f41402r && !b2()) {
                        break;
                    }
                    char[] cArr2 = this.Q;
                    int i3 = this.q;
                    if (cArr2[i3] == '/') {
                        this.q = i3 + 1;
                        return;
                    }
                } else if (c < ' ') {
                    if (c == '\n') {
                        this.t++;
                        this.u = i2;
                    } else if (c == '\r') {
                        w2();
                    } else if (c != '\t') {
                        g1(c);
                    }
                }
            }
        }
        b1(" in a comment", null);
    }

    public final void w2() throws IOException {
        if (this.q < this.f41402r || b2()) {
            char[] cArr = this.Q;
            int i = this.q;
            if (cArr[i] == '\n') {
                this.q = i + 1;
            }
        }
        this.t++;
        this.u = this.q;
    }

    public final int x2() throws IOException {
        int i = this.q;
        if (i + 4 >= this.f41402r) {
            return y2(false);
        }
        char[] cArr = this.Q;
        char c = cArr[i];
        if (c == ':') {
            int i2 = i + 1;
            this.q = i2;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/' || c2 == '#') {
                    return y2(true);
                }
                this.q = i + 2;
                return c2;
            }
            if (c2 == ' ' || c2 == '\t') {
                int i3 = i + 2;
                this.q = i3;
                char c3 = cArr[i3];
                if (c3 > ' ') {
                    if (c3 == '/' || c3 == '#') {
                        return y2(true);
                    }
                    this.q = i + 3;
                    return c3;
                }
            }
            return y2(true);
        }
        if (c == ' ' || c == '\t') {
            int i4 = i + 1;
            this.q = i4;
            c = cArr[i4];
        }
        if (c != ':') {
            return y2(false);
        }
        int i5 = this.q;
        int i6 = i5 + 1;
        this.q = i6;
        char c4 = cArr[i6];
        if (c4 > ' ') {
            if (c4 == '/' || c4 == '#') {
                return y2(true);
            }
            this.q = i5 + 2;
            return c4;
        }
        if (c4 == ' ' || c4 == '\t') {
            int i7 = i5 + 2;
            this.q = i7;
            char c5 = cArr[i7];
            if (c5 > ' ') {
                if (c5 == '/' || c5 == '#') {
                    return y2(true);
                }
                this.q = i5 + 3;
                return c5;
            }
        }
        return y2(true);
    }

    public final int y2(boolean z) throws IOException {
        while (true) {
            if (this.q >= this.f41402r && !b2()) {
                b1(" within/between " + this.y.j() + " entries", null);
                return -1;
            }
            char[] cArr = this.Q;
            int i = this.q;
            int i2 = i + 1;
            this.q = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    A2();
                } else if (c != '#' || !F2()) {
                    if (z) {
                        return c;
                    }
                    if (c != ':') {
                        e1(c, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (c < ' ') {
                if (c == '\n') {
                    this.t++;
                    this.u = i2;
                } else if (c == '\r') {
                    w2();
                } else if (c != '\t') {
                    g1(c);
                }
            }
        }
    }

    public final int z2(int i) throws IOException {
        if (i != 44) {
            e1(i, "was expecting comma to separate " + this.y.j() + " entries");
        }
        while (true) {
            int i2 = this.q;
            if (i2 >= this.f41402r) {
                return u2();
            }
            char[] cArr = this.Q;
            int i3 = i2 + 1;
            this.q = i3;
            char c = cArr[i2];
            if (c > ' ') {
                if (c != '/' && c != '#') {
                    return c;
                }
                this.q = i2;
                return u2();
            }
            if (c < ' ') {
                if (c == '\n') {
                    this.t++;
                    this.u = i3;
                } else if (c == '\r') {
                    w2();
                } else if (c != '\t') {
                    g1(c);
                }
            }
        }
    }

    public tgj(xuc xucVar, int i, Reader reader, v3h v3hVar, zt3 zt3Var) {
        super(xucVar, i);
        this.P = reader;
        this.Q = xucVar.h();
        this.q = 0;
        this.f41402r = 0;
        this.S = v3hVar;
        this.T = zt3Var;
        this.U = zt3Var.p();
        this.R = true;
    }
}
