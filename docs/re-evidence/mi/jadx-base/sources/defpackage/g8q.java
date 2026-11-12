package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import io.netty.util.internal.StringUtil;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public class g8q extends zkh {
    public static final int[] W = xt3.i();
    public static final int[] X = xt3.g();
    public v3h P;
    public final r73 Q;
    public int[] R;
    public boolean S;
    public int T;
    public DataInput U;
    public int V;

    public g8q(xuc xucVar, int i, DataInput dataInput, v3h v3hVar, r73 r73Var, int i2) {
        super(xucVar, i);
        this.R = new int[16];
        this.P = v3hVar;
        this.Q = r73Var;
        this.U = dataInput;
        this.V = i2;
    }

    private final void B2() throws IOException {
        if (!A0(JsonParser.Feature.ALLOW_COMMENTS)) {
            e1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int unsignedByte = this.U.readUnsignedByte();
        if (unsignedByte == 47) {
            C2();
        } else if (unsignedByte == 42) {
            y2();
        } else {
            e1(unsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void C2() throws IOException {
        int[] iArrF = xt3.f();
        while (true) {
            int unsignedByte = this.U.readUnsignedByte();
            int i = iArrF[unsignedByte];
            if (i != 0) {
                if (i == 2) {
                    E2();
                } else if (i == 3) {
                    F2();
                } else if (i == 4) {
                    G2();
                } else if (i == 10 || i == 13) {
                    break;
                } else if (i != 42 && i < 0) {
                    t2(unsignedByte);
                }
            }
        }
        this.t++;
    }

    private final int J2() throws IOException {
        int unsignedByte = this.V;
        if (unsignedByte < 0) {
            try {
                unsignedByte = this.U.readUnsignedByte();
            } catch (EOFException unused) {
                return s1();
            }
        } else {
            this.V = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this.t++;
            }
            try {
                unsignedByte = this.U.readUnsignedByte();
            } catch (EOFException unused2) {
                return s1();
            }
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? I2(unsignedByte) : unsignedByte;
    }

    private final boolean K2() throws IOException {
        if (!A0(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        C2();
        return true;
    }

    private final void Q1(String str, int i, int i2) throws IOException {
        char cT1 = (char) T1(i2);
        if (Character.isJavaIdentifierPart(cT1)) {
            w2(cT1, str.substring(0, i));
        }
    }

    private void R1(int i) throws JsonParseException {
        if (i == 93) {
            if (!this.y.f()) {
                B1(i, AbstractJsonLexerKt.END_OBJ);
            }
            this.y = this.y.l();
            this.c = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            if (!this.y.g()) {
                B1(i, AbstractJsonLexerKt.END_LIST);
            }
            this.y = this.y.l();
            this.c = JsonToken.END_OBJECT;
        }
    }

    public static final int R2(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    private String X1() throws IOException {
        char[] cArrM = this.A.m();
        int[] iArr = W;
        int length = cArrM.length;
        int i = 0;
        while (true) {
            int unsignedByte = this.U.readUnsignedByte();
            if (iArr[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    return this.A.D(i);
                }
                Z1(cArrM, i, unsignedByte);
                return this.A.l();
            }
            int i2 = i + 1;
            cArrM[i] = (char) unsignedByte;
            if (i2 >= length) {
                Z1(cArrM, i2, this.U.readUnsignedByte());
                return this.A.l();
            }
            i = i2;
        }
    }

    public static int[] b2(int[] iArr, int i) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    private final JsonToken i2() {
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

    private final JsonToken j2(int i) throws IOException {
        if (i == 34) {
            this.S = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.c = jsonToken;
            return jsonToken;
        }
        if (i == 45) {
            JsonToken jsonTokenQ2 = q2();
            this.c = jsonTokenQ2;
            return jsonTokenQ2;
        }
        if (i == 91) {
            this.y = this.y.m(this.w, this.x);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.c = jsonToken2;
            return jsonToken2;
        }
        if (i == 102) {
            h2("false", 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.c = jsonToken3;
            return jsonToken3;
        }
        if (i == 110) {
            h2(AbstractJsonLexerKt.NULL, 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.c = jsonToken4;
            return jsonToken4;
        }
        if (i == 116) {
            h2("true", 1);
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
                JsonToken jsonTokenR2 = r2(i);
                this.c = jsonTokenR2;
                return jsonTokenR2;
            default:
                JsonToken jsonTokenG2 = g2(i);
                this.c = jsonTokenG2;
                return jsonTokenG2;
        }
    }

    private void v2(int i) throws JsonParseException {
        X0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    private final void y2() throws IOException {
        int[] iArrF = xt3.f();
        int unsignedByte = this.U.readUnsignedByte();
        while (true) {
            int i = iArrF[unsignedByte];
            if (i != 0) {
                if (i == 2) {
                    E2();
                } else if (i == 3) {
                    F2();
                } else if (i == 4) {
                    G2();
                } else if (i == 10 || i == 13) {
                    this.t++;
                } else if (i != 42) {
                    t2(unsignedByte);
                } else {
                    unsignedByte = this.U.readUnsignedByte();
                    if (unsignedByte == 47) {
                        return;
                    }
                }
            }
            unsignedByte = this.U.readUnsignedByte();
        }
    }

    private final int z2() throws IOException {
        int unsignedByte = this.V;
        if (unsignedByte < 0) {
            unsignedByte = this.U.readUnsignedByte();
        } else {
            this.V = -1;
        }
        if (unsignedByte == 58) {
            int unsignedByte2 = this.U.readUnsignedByte();
            if (unsignedByte2 > 32) {
                return (unsignedByte2 == 47 || unsignedByte2 == 35) ? A2(unsignedByte2, true) : unsignedByte2;
            }
            if ((unsignedByte2 == 32 || unsignedByte2 == 9) && (unsignedByte2 = this.U.readUnsignedByte()) > 32) {
                return (unsignedByte2 == 47 || unsignedByte2 == 35) ? A2(unsignedByte2, true) : unsignedByte2;
            }
            return A2(unsignedByte2, true);
        }
        if (unsignedByte == 32 || unsignedByte == 9) {
            unsignedByte = this.U.readUnsignedByte();
        }
        if (unsignedByte != 58) {
            return A2(unsignedByte, false);
        }
        int unsignedByte3 = this.U.readUnsignedByte();
        if (unsignedByte3 > 32) {
            return (unsignedByte3 == 47 || unsignedByte3 == 35) ? A2(unsignedByte3, true) : unsignedByte3;
        }
        if ((unsignedByte3 == 32 || unsignedByte3 == 9) && (unsignedByte3 = this.U.readUnsignedByte()) > 32) {
            return (unsignedByte3 == 47 || unsignedByte3 == 35) ? A2(unsignedByte3, true) : unsignedByte3;
        }
        return A2(unsignedByte3, true);
    }

    @Override // defpackage.zkh
    public void A1() throws IOException {
        super.A1();
        this.Q.M();
    }

    public final int A2(int i, boolean z) throws IOException {
        while (true) {
            if (i > 32) {
                if (i == 47) {
                    B2();
                } else if (i != 35 || !K2()) {
                    if (z) {
                        return i;
                    }
                    if (i != 58) {
                        e1(i, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i == 13 || i == 10) {
                this.t++;
            }
            i = this.U.readUnsignedByte();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public v3h D() {
        return this.P;
    }

    public void D2() throws IOException {
        this.S = false;
        int[] iArr = W;
        while (true) {
            int unsignedByte = this.U.readUnsignedByte();
            int i = iArr[unsignedByte];
            if (i != 0) {
                if (unsignedByte == 34) {
                    return;
                }
                if (i == 1) {
                    r1();
                } else if (i == 2) {
                    E2();
                } else if (i == 3) {
                    F2();
                } else if (i == 4) {
                    G2();
                } else if (unsignedByte < 32) {
                    h1(unsignedByte, "string value");
                } else {
                    t2(unsignedByte);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation E() {
        return new JsonLocation(u1(), -1L, -1L, this.t, -1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String E0() throws IOException {
        JsonToken jsonTokenQ2;
        this.F = 0;
        JsonToken jsonToken = this.c;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            i2();
            return null;
        }
        if (this.S) {
            D2();
        }
        int iH2 = H2();
        this.E = null;
        this.w = this.t;
        if (iH2 == 93 || iH2 == 125) {
            R1(iH2);
            return null;
        }
        if (this.y.p()) {
            if (iH2 != 44) {
                e1(iH2, "was expecting comma to separate " + this.y.j() + " entries");
            }
            iH2 = H2();
            if (JsonParser.Feature.ALLOW_TRAILING_COMMA.enabledIn(this.f7621a) && (iH2 == 93 || iH2 == 125)) {
                R1(iH2);
                return null;
            }
        }
        if (!this.y.g()) {
            j2(iH2);
            return null;
        }
        String strP2 = p2(iH2);
        this.y.u(strP2);
        this.c = jsonToken2;
        int iZ2 = z2();
        if (iZ2 == 34) {
            this.S = true;
            this.z = JsonToken.VALUE_STRING;
            return strP2;
        }
        if (iZ2 == 45) {
            jsonTokenQ2 = q2();
        } else if (iZ2 == 91) {
            jsonTokenQ2 = JsonToken.START_ARRAY;
        } else if (iZ2 == 102) {
            h2("false", 1);
            jsonTokenQ2 = JsonToken.VALUE_FALSE;
        } else if (iZ2 == 110) {
            h2(AbstractJsonLexerKt.NULL, 1);
            jsonTokenQ2 = JsonToken.VALUE_NULL;
        } else if (iZ2 == 116) {
            h2("true", 1);
            jsonTokenQ2 = JsonToken.VALUE_TRUE;
        } else if (iZ2 != 123) {
            switch (iZ2) {
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
                    jsonTokenQ2 = r2(iZ2);
                    break;
                default:
                    jsonTokenQ2 = g2(iZ2);
                    break;
            }
        } else {
            jsonTokenQ2 = JsonToken.START_OBJECT;
        }
        this.z = jsonTokenQ2;
        return strP2;
    }

    public final void E2() throws IOException {
        int unsignedByte = this.U.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            v2(unsignedByte & 255);
        }
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
            return X1();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this.y = this.y.m(this.w, this.x);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.y = this.y.n(this.w, this.x);
        }
        return null;
    }

    public final void F2() throws IOException {
        int unsignedByte = this.U.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            v2(unsignedByte & 255);
        }
        int unsignedByte2 = this.U.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            v2(unsignedByte2 & 255);
        }
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public JsonToken G0() throws IOException {
        JsonToken jsonTokenQ2;
        if (this.p) {
            return null;
        }
        JsonToken jsonToken = this.c;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return i2();
        }
        this.F = 0;
        if (this.S) {
            D2();
        }
        int iJ2 = J2();
        if (iJ2 < 0) {
            close();
            this.c = null;
            return null;
        }
        this.E = null;
        this.w = this.t;
        if (iJ2 == 93 || iJ2 == 125) {
            R1(iJ2);
            return this.c;
        }
        if (this.y.p()) {
            if (iJ2 != 44) {
                e1(iJ2, "was expecting comma to separate " + this.y.j() + " entries");
            }
            iJ2 = H2();
            if (JsonParser.Feature.ALLOW_TRAILING_COMMA.enabledIn(this.f7621a) && (iJ2 == 93 || iJ2 == 125)) {
                R1(iJ2);
                return this.c;
            }
        }
        if (!this.y.g()) {
            return j2(iJ2);
        }
        this.y.u(p2(iJ2));
        this.c = jsonToken2;
        int iZ2 = z2();
        if (iZ2 == 34) {
            this.S = true;
            this.z = JsonToken.VALUE_STRING;
            return this.c;
        }
        if (iZ2 == 45) {
            jsonTokenQ2 = q2();
        } else if (iZ2 == 91) {
            jsonTokenQ2 = JsonToken.START_ARRAY;
        } else if (iZ2 == 102) {
            h2("false", 1);
            jsonTokenQ2 = JsonToken.VALUE_FALSE;
        } else if (iZ2 == 110) {
            h2(AbstractJsonLexerKt.NULL, 1);
            jsonTokenQ2 = JsonToken.VALUE_NULL;
        } else if (iZ2 == 116) {
            h2("true", 1);
            jsonTokenQ2 = JsonToken.VALUE_TRUE;
        } else if (iZ2 != 123) {
            switch (iZ2) {
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
                    jsonTokenQ2 = r2(iZ2);
                    break;
                default:
                    jsonTokenQ2 = g2(iZ2);
                    break;
            }
        } else {
            jsonTokenQ2 = JsonToken.START_OBJECT;
        }
        this.z = jsonTokenQ2;
        return this.c;
    }

    public final void G2() throws IOException {
        int unsignedByte = this.U.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            v2(unsignedByte & 255);
        }
        int unsignedByte2 = this.U.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            v2(unsignedByte2 & 255);
        }
        int unsignedByte3 = this.U.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            v2(unsignedByte3 & 255);
        }
    }

    public final int H2() throws IOException {
        int unsignedByte = this.V;
        if (unsignedByte < 0) {
            unsignedByte = this.U.readUnsignedByte();
        } else {
            this.V = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this.t++;
            }
            unsignedByte = this.U.readUnsignedByte();
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? I2(unsignedByte) : unsignedByte;
    }

    public final int I2(int i) throws IOException {
        while (true) {
            if (i > 32) {
                if (i == 47) {
                    B2();
                } else if (i != 35 || !K2()) {
                    break;
                }
            } else if (i == 13 || i == 10) {
                this.t++;
            }
            i = this.U.readUnsignedByte();
        }
        return i;
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
            return s2(base64Variant, outputStream, bArrD);
        } finally {
            this.o.o(bArrD);
        }
    }

    public final void L2() throws IOException {
        int i = this.V;
        if (i > 32) {
            d1(i);
            return;
        }
        this.V = -1;
        if (i == 13 || i == 10) {
            this.t++;
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
    public final String M2(int[] iArr, int i, int i2) throws JsonParseException {
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
                        u2(i17);
                        i4 = 1;
                    }
                    if (i18 + i5 > i12) {
                        b1(" in field name", JsonToken.FIELD_NAME);
                    }
                    i6 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                    i18 = i14 + 2;
                    if ((i6 & 192) != 128) {
                        v2(i6);
                    }
                    i7 = (i4 << 6) | (i6 & 63);
                    if (i5 > 1) {
                        i9 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                        i18 = i14 + 3;
                        if ((i9 & 192) != 128) {
                            v2(i9);
                        }
                        i10 = (i7 << 6) | (i9 & 63);
                        if (i5 > 2) {
                            i11 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                            i18 = i14 + 4;
                            if ((i11 & 192) != 128) {
                                v2(i11 & 255);
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
                    v2(i6);
                }
                i7 = (i4 << 6) | (i6 & 63);
                if (i5 > 1) {
                    i9 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                    i18 = i14 + 3;
                    if ((i9 & 192) != 128) {
                        v2(i9);
                    }
                    i10 = (i7 << 6) | (i9 & 63);
                    if (i5 > 2) {
                        i11 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                        i18 = i14 + 4;
                        if ((i11 & 192) != 128) {
                            v2(i11 & 255);
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

    public final String N2(int i, int i2) throws JsonParseException {
        int iR2 = R2(i, i2);
        String strC = this.Q.C(iR2);
        if (strC != null) {
            return strC;
        }
        int[] iArr = this.R;
        iArr[0] = iR2;
        return M2(iArr, 1, i2);
    }

    public final String O2(int i, int i2, int i3) throws JsonParseException {
        int iR2 = R2(i2, i3);
        String strD = this.Q.D(i, iR2);
        if (strD != null) {
            return strD;
        }
        int[] iArr = this.R;
        iArr[0] = i;
        iArr[1] = iR2;
        return M2(iArr, 2, i3);
    }

    public final String P2(int i, int i2, int i3, int i4) throws JsonParseException {
        int iR2 = R2(i3, i4);
        String strE = this.Q.E(i, i2, iR2);
        if (strE != null) {
            return strE;
        }
        int[] iArr = this.R;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = R2(iR2, i4);
        return M2(iArr, 3, i4);
    }

    public final String Q2(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = b2(iArr, iArr.length);
            this.R = iArr;
        }
        int i4 = i + 1;
        iArr[i] = R2(i2, i3);
        String strF = this.Q.F(iArr, i4);
        return strF == null ? M2(iArr, i4, i3) : strF;
    }

    public final byte[] S1(Base64Variant base64Variant) throws IOException {
        t63 t63VarT1 = t1();
        while (true) {
            int unsignedByte = this.U.readUnsignedByte();
            if (unsignedByte > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(unsignedByte);
                if (iDecodeBase64Char < 0) {
                    if (unsignedByte == 34) {
                        return t63VarT1.D();
                    }
                    iDecodeBase64Char = q1(base64Variant, unsignedByte, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                int unsignedByte2 = this.U.readUnsignedByte();
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(unsignedByte2);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = q1(base64Variant, unsignedByte2, 1);
                }
                int i = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                int unsignedByte3 = this.U.readUnsignedByte();
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(unsignedByte3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (unsignedByte3 == 34) {
                            t63VarT1.b(i >> 4);
                            if (base64Variant.usesPadding()) {
                                v1(base64Variant);
                            }
                            return t63VarT1.D();
                        }
                        iDecodeBase64Char3 = q1(base64Variant, unsignedByte3, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        int unsignedByte4 = this.U.readUnsignedByte();
                        if (!base64Variant.usesPaddingChar(unsignedByte4) && (unsignedByte4 != 92 || q1(base64Variant, unsignedByte4, 3) != -2)) {
                            throw L1(base64Variant, unsignedByte4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        t63VarT1.b(i >> 4);
                    }
                }
                int i2 = (i << 6) | iDecodeBase64Char3;
                int unsignedByte5 = this.U.readUnsignedByte();
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(unsignedByte5);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (unsignedByte5 == 34) {
                            t63VarT1.d(i2 >> 2);
                            if (base64Variant.usesPadding()) {
                                v1(base64Variant);
                            }
                            return t63VarT1.D();
                        }
                        iDecodeBase64Char4 = q1(base64Variant, unsignedByte5, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        t63VarT1.d(i2 >> 2);
                    }
                }
                t63VarT1.c((i2 << 6) | iDecodeBase64Char4);
            }
        }
    }

    public final String S2(int[] iArr, int i, int i2, int i3, int i4) throws IOException {
        int[] iArr2 = X;
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
                            iArr = b2(iArr, iArr.length);
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
                                iArr = b2(iArr, iArr.length);
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
                    iArr = b2(iArr, iArr.length);
                    this.R = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            i3 = this.U.readUnsignedByte();
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = b2(iArr, iArr.length);
                this.R = iArr;
            }
            iArr[i] = R2(i2, i4);
            i++;
        }
        String strF = this.Q.F(iArr, i);
        return strF == null ? M2(iArr, i, i4) : strF;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public int T1(int i) throws IOException {
        char c;
        int unsignedByte;
        int i2;
        int unsignedByte2;
        int i3;
        int unsignedByte3;
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
                u2(i & 255);
            }
            unsignedByte = this.U.readUnsignedByte();
            if ((unsignedByte & 192) != 128) {
                v2(unsignedByte & 255);
            }
            i2 = (i4 << 6) | (unsignedByte & 63);
            if (c > 1) {
                return i2;
            }
            unsignedByte2 = this.U.readUnsignedByte();
            if ((unsignedByte2 & 192) != 128) {
                v2(unsignedByte2 & 255);
            }
            i3 = (i2 << 6) | (unsignedByte2 & 63);
            if (c > 2) {
                return i3;
            }
            unsignedByte3 = this.U.readUnsignedByte();
            if ((unsignedByte3 & 192) != 128) {
                v2(unsignedByte3 & 255);
            }
            return (i3 << 6) | (unsignedByte3 & 63);
        }
        i4 = i & 31;
        c = 1;
        unsignedByte = this.U.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            v2(unsignedByte & 255);
        }
        i2 = (i4 << 6) | (unsignedByte & 63);
        if (c > 1) {
            return i2;
        }
        unsignedByte2 = this.U.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            v2(unsignedByte2 & 255);
        }
        i3 = (i2 << 6) | (unsignedByte2 & 63);
        if (c > 2) {
            return i3;
        }
        unsignedByte3 = this.U.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            v2(unsignedByte3 & 255);
        }
        return (i3 << 6) | (unsignedByte3 & 63);
    }

    public final String T2(int i, int i2, int i3) throws IOException {
        return S2(this.R, 0, i, i2, i3);
    }

    public final int U1(int i) throws IOException {
        int unsignedByte = this.U.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            v2(unsignedByte & 255);
        }
        return ((i & 31) << 6) | (unsignedByte & 63);
    }

    public final String U2(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = this.R;
        iArr[0] = i;
        return S2(iArr, 1, i2, i3, i4);
    }

    public final int V1(int i) throws IOException {
        int i2 = i & 15;
        int unsignedByte = this.U.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            v2(unsignedByte & 255);
        }
        int i3 = (i2 << 6) | (unsignedByte & 63);
        int unsignedByte2 = this.U.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            v2(unsignedByte2 & 255);
        }
        return (i3 << 6) | (unsignedByte2 & 63);
    }

    public final String V2(int i, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this.R;
        iArr[0] = i;
        iArr[1] = i2;
        return S2(iArr, 2, i3, i4, i5);
    }

    public final int W1(int i) throws IOException {
        int unsignedByte = this.U.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            v2(unsignedByte & 255);
        }
        int i2 = ((i & 7) << 6) | (unsignedByte & 63);
        int unsignedByte2 = this.U.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            v2(unsignedByte2 & 255);
        }
        int i3 = (i2 << 6) | (unsignedByte2 & 63);
        int unsignedByte3 = this.U.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            v2(unsignedByte3 & 255);
        }
        return ((i3 << 6) | (unsignedByte3 & 63)) - 65536;
    }

    public void Y1() throws IOException {
        char[] cArrM = this.A.m();
        int[] iArr = W;
        int length = cArrM.length;
        int i = 0;
        while (true) {
            int unsignedByte = this.U.readUnsignedByte();
            if (iArr[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    this.A.E(i);
                    return;
                } else {
                    Z1(cArrM, i, unsignedByte);
                    return;
                }
            }
            int i2 = i + 1;
            cArrM[i] = (char) unsignedByte;
            if (i2 >= length) {
                Z1(cArrM, i2, this.U.readUnsignedByte());
                return;
            }
            i = i2;
        }
    }

    public final void Z1(char[] cArr, int i, int i2) throws IOException {
        int[] iArr = W;
        int length = cArr.length;
        while (true) {
            int i3 = iArr[i2];
            int i4 = 0;
            if (i3 == 0) {
                if (i >= length) {
                    cArr = this.A.p();
                    length = cArr.length;
                    i = 0;
                }
                cArr[i] = (char) i2;
                i2 = this.U.readUnsignedByte();
                i++;
            } else {
                if (i2 == 34) {
                    this.A.E(i);
                    return;
                }
                if (i3 == 1) {
                    i2 = r1();
                } else if (i3 == 2) {
                    i2 = U1(i2);
                } else if (i3 == 3) {
                    i2 = V1(i2);
                } else if (i3 == 4) {
                    int iW1 = W1(i2);
                    int i5 = i + 1;
                    cArr[i] = (char) ((iW1 >> 10) | 55296);
                    if (i5 >= cArr.length) {
                        cArr = this.A.p();
                        length = cArr.length;
                        i = 0;
                    } else {
                        i = i5;
                    }
                    i2 = (iW1 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                } else if (i2 < 32) {
                    h1(i2, "string value");
                } else {
                    t2(i2);
                }
                if (i >= cArr.length) {
                    cArr = this.A.p();
                    length = cArr.length;
                } else {
                    i4 = i;
                }
                i = i4 + 1;
                cArr[i4] = (char) i2;
                i2 = this.U.readUnsignedByte();
            }
        }
    }

    public final String a2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            return (iId == 6 || iId == 7 || iId == 8) ? this.A.l() : jsonToken.asString();
        }
        return this.y.b();
    }

    public JsonToken c2() throws IOException {
        int i;
        char[] cArrM = this.A.m();
        int[] iArr = W;
        int i2 = 0;
        while (true) {
            int length = cArrM.length;
            if (i2 >= cArrM.length) {
                cArrM = this.A.p();
                length = cArrM.length;
                i2 = 0;
            }
            do {
                int unsignedByte = this.U.readUnsignedByte();
                if (unsignedByte == 39) {
                    this.A.E(i2);
                    return JsonToken.VALUE_STRING;
                }
                int i3 = iArr[unsignedByte];
                if (i3 != 0) {
                    if (i3 == 1) {
                        unsignedByte = r1();
                    } else if (i3 == 2) {
                        unsignedByte = U1(unsignedByte);
                    } else if (i3 == 3) {
                        unsignedByte = V1(unsignedByte);
                    } else if (i3 != 4) {
                        if (unsignedByte < 32) {
                            h1(unsignedByte, "string value");
                        }
                        t2(unsignedByte);
                    } else {
                        int iW1 = W1(unsignedByte);
                        int i4 = i2 + 1;
                        cArrM[i2] = (char) ((iW1 >> 10) | 55296);
                        if (i4 >= cArrM.length) {
                            cArrM = this.A.p();
                            i2 = 0;
                        } else {
                            i2 = i4;
                        }
                        unsignedByte = 56320 | (iW1 & 1023);
                    }
                    if (i2 >= cArrM.length) {
                        cArrM = this.A.p();
                        i2 = 0;
                    }
                    cArrM[i2] = (char) unsignedByte;
                    i2++;
                    break;
                }
                i = i2 + 1;
                cArrM[i2] = (char) unsignedByte;
                i2 = i;
            } while (i < length);
        }
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public String d0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return a2(jsonToken);
        }
        if (!this.S) {
            return this.A.l();
        }
        this.S = false;
        return X1();
    }

    public JsonToken d2(int i, boolean z) throws IOException {
        String str;
        while (i == 73) {
            i = this.U.readUnsignedByte();
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            h2(str, 3);
            if (A0(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                return N1(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            X0("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        }
        m1(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    public final int e2() throws IOException {
        int unsignedByte = this.U.readUnsignedByte();
        if (unsignedByte >= 48 && unsignedByte <= 57) {
            if (!A0(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
                j1("Leading zeroes not allowed");
            }
            while (unsignedByte == 48) {
                unsignedByte = this.U.readUnsignedByte();
            }
        }
        return unsignedByte;
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
                Y1();
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

    public String f2(int i) throws IOException {
        if (i == 39 && A0(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return k2();
        }
        if (!A0(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            e1((char) T1(i), "was expecting double-quote to start field name");
        }
        int[] iArrJ = xt3.j();
        if (iArrJ[i] != 0) {
            e1(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrB2 = this.R;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        do {
            if (i2 < 4) {
                i2++;
                i4 = i | (i4 << 8);
            } else {
                if (i3 >= iArrB2.length) {
                    iArrB2 = b2(iArrB2, iArrB2.length);
                    this.R = iArrB2;
                }
                iArrB2[i3] = i4;
                i4 = i;
                i3++;
                i2 = 1;
            }
            i = this.U.readUnsignedByte();
        } while (iArrJ[i] == 0);
        this.V = i;
        if (i2 > 0) {
            if (i3 >= iArrB2.length) {
                iArrB2 = b2(iArrB2, iArrB2.length);
                this.R = iArrB2;
            }
            iArrB2[i3] = i4;
            i3++;
        }
        String strF = this.Q.F(iArrB2, i3);
        return strF == null ? M2(iArrB2, i3, i2) : strF;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int g0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.S) {
                this.S = false;
                Y1();
            }
            return this.A.F();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.y.b().length();
        }
        if (jsonToken != null) {
            return jsonToken.isNumeric() ? this.A.F() : this.c.asCharArray().length;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r3.y.f() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        if (A0(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        r3.V = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.core.JsonToken g2(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L7a
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L60
            r0 = 78
            if (r4 == r0) goto L46
            r0 = 93
            if (r4 == r0) goto L2a
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L40
            r0 = 43
            if (r4 == r0) goto L1e
            r0 = 44
            if (r4 == r0) goto L33
            goto L87
        L1e:
            java.io.DataInput r4 = r3.U
            int r4 = r4.readUnsignedByte()
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3.d2(r4, r0)
            return r4
        L2a:
            utd r0 = r3.y
            boolean r0 = r0.f()
            if (r0 != 0) goto L33
            goto L87
        L33:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.A0(r0)
            if (r0 == 0) goto L40
            r3.V = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L40:
            java.lang.String r0 = "expected a value"
            r3.e1(r4, r0)
            goto L7a
        L46:
            java.lang.String r0 = "NaN"
            r3.h2(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.A0(r1)
            if (r1 == 0) goto L5a
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.N1(r0, r1)
            return r4
        L5a:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3.X0(r0)
            goto L87
        L60:
            java.lang.String r0 = "Infinity"
            r3.h2(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.A0(r1)
            if (r1 == 0) goto L74
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.N1(r0, r1)
            return r4
        L74:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3.X0(r0)
            goto L87
        L7a:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.A0(r0)
            if (r0 == 0) goto L87
            com.fasterxml.jackson.core.JsonToken r4 = r3.c2()
            return r4
        L87:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto La4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "('true', 'false' or 'null')"
            r3.x2(r4, r0, r1)
        La4:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3.e1(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8q.g2(int):com.fasterxml.jackson.core.JsonToken");
    }

    public final void h2(String str, int i) throws IOException {
        int length = str.length();
        do {
            int unsignedByte = this.U.readUnsignedByte();
            if (unsignedByte != str.charAt(i)) {
                w2(unsignedByte, str.substring(0, i));
            }
            i++;
        } while (i < length);
        int unsignedByte2 = this.U.readUnsignedByte();
        if (unsignedByte2 >= 48 && unsignedByte2 != 93 && unsignedByte2 != 125) {
            Q1(str, i, unsignedByte2);
        }
        this.V = unsignedByte2;
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
            r3.Y1()
        L1d:
            o7p r0 = r3.A
            int r0 = r0.u()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8q.i0():int");
    }

    public String k2() throws IOException {
        int unsignedByte = this.U.readUnsignedByte();
        if (unsignedByte == 39) {
            return "";
        }
        int[] iArrB2 = this.R;
        int[] iArr = X;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (unsignedByte != 39) {
            if (unsignedByte != 34 && iArr[unsignedByte] != 0) {
                if (unsignedByte != 92) {
                    h1(unsignedByte, "name");
                } else {
                    unsignedByte = r1();
                }
                if (unsignedByte > 127) {
                    if (i >= 4) {
                        if (i2 >= iArrB2.length) {
                            iArrB2 = b2(iArrB2, iArrB2.length);
                            this.R = iArrB2;
                        }
                        iArrB2[i2] = i3;
                        i3 = 0;
                        i2++;
                        i = 0;
                    }
                    if (unsignedByte < 2048) {
                        i3 = (i3 << 8) | (unsignedByte >> 6) | 192;
                        i++;
                    } else {
                        int i4 = (i3 << 8) | (unsignedByte >> 12) | SportReportBaseParser.ReportType.avgFreq;
                        int i5 = i + 1;
                        if (i5 >= 4) {
                            if (i2 >= iArrB2.length) {
                                iArrB2 = b2(iArrB2, iArrB2.length);
                                this.R = iArrB2;
                            }
                            iArrB2[i2] = i4;
                            i4 = 0;
                            i2++;
                            i5 = 0;
                        }
                        i3 = (i4 << 8) | ((unsignedByte >> 6) & 63) | 128;
                        i = i5 + 1;
                    }
                    unsignedByte = (unsignedByte & 63) | 128;
                }
            }
            if (i < 4) {
                i++;
                i3 = unsignedByte | (i3 << 8);
            } else {
                if (i2 >= iArrB2.length) {
                    iArrB2 = b2(iArrB2, iArrB2.length);
                    this.R = iArrB2;
                }
                iArrB2[i2] = i3;
                i3 = unsignedByte;
                i2++;
                i = 1;
            }
            unsignedByte = this.U.readUnsignedByte();
        }
        if (i > 0) {
            if (i2 >= iArrB2.length) {
                iArrB2 = b2(iArrB2, iArrB2.length);
                this.R = iArrB2;
            }
            iArrB2[i2] = R2(i3, i);
            i2++;
        }
        String strF = this.Q.F(iArrB2, i2);
        return strF == null ? M2(iArrB2, i2, i) : strF;
    }

    public final JsonToken l2(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        int i4;
        int unsignedByte;
        int i5 = 0;
        if (i2 == 46) {
            cArr[i] = (char) i2;
            i++;
            int i6 = 0;
            while (true) {
                unsignedByte = this.U.readUnsignedByte();
                if (unsignedByte < 48 || unsignedByte > 57) {
                    break;
                }
                i6++;
                if (i >= cArr.length) {
                    cArr = this.A.p();
                    i = 0;
                }
                cArr[i] = (char) unsignedByte;
                i++;
            }
            if (i6 == 0) {
                m1(unsignedByte, "Decimal point not followed by a digit");
            }
            i4 = i6;
            i2 = unsignedByte;
        } else {
            i4 = 0;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this.A.p();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            int unsignedByte2 = this.U.readUnsignedByte();
            if (unsignedByte2 == 45 || unsignedByte2 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this.A.p();
                    i7 = 0;
                }
                cArr[i7] = (char) unsignedByte2;
                i2 = this.U.readUnsignedByte();
                i = i7 + 1;
            } else {
                i2 = unsignedByte2;
                i = i7;
            }
            while (i2 <= 57 && i2 >= 48) {
                i5++;
                if (i >= cArr.length) {
                    cArr = this.A.p();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i2 = this.U.readUnsignedByte();
                i++;
            }
            if (i5 == 0) {
                m1(i2, "Exponent indicator not followed by a digit");
            }
            i5 = i5;
        }
        this.V = i2;
        if (this.y.h()) {
            L2();
        }
        this.A.E(i);
        return O1(z, i3, i4, i5);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation m0() {
        return new JsonLocation(u1(), -1L, -1L, this.w, -1);
    }

    public final String m2(int i, int i2, int i3) throws IOException {
        int[] iArr = this.R;
        iArr[0] = this.T;
        iArr[1] = i2;
        iArr[2] = i3;
        int[] iArr2 = X;
        int i4 = i;
        int i5 = 3;
        while (true) {
            int unsignedByte = this.U.readUnsignedByte();
            if (iArr2[unsignedByte] != 0) {
                return unsignedByte == 34 ? Q2(this.R, i5, i4, 1) : S2(this.R, i5, i4, unsignedByte, 1);
            }
            int i6 = (i4 << 8) | unsignedByte;
            int unsignedByte2 = this.U.readUnsignedByte();
            if (iArr2[unsignedByte2] != 0) {
                return unsignedByte2 == 34 ? Q2(this.R, i5, i6, 2) : S2(this.R, i5, i6, unsignedByte2, 2);
            }
            int i7 = (i6 << 8) | unsignedByte2;
            int unsignedByte3 = this.U.readUnsignedByte();
            if (iArr2[unsignedByte3] != 0) {
                return unsignedByte3 == 34 ? Q2(this.R, i5, i7, 3) : S2(this.R, i5, i7, unsignedByte3, 3);
            }
            int i8 = (i7 << 8) | unsignedByte3;
            int unsignedByte4 = this.U.readUnsignedByte();
            if (iArr2[unsignedByte4] != 0) {
                return unsignedByte4 == 34 ? Q2(this.R, i5, i8, 4) : S2(this.R, i5, i8, unsignedByte4, 4);
            }
            int[] iArr3 = this.R;
            if (i5 >= iArr3.length) {
                this.R = b2(iArr3, i5);
            }
            this.R[i5] = i8;
            i5++;
            i4 = unsignedByte4;
        }
    }

    public final String n2(int i) throws IOException {
        int[] iArr = X;
        int unsignedByte = this.U.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            return unsignedByte == 34 ? O2(this.T, i, 1) : U2(this.T, i, unsignedByte, 1);
        }
        int i2 = (i << 8) | unsignedByte;
        int unsignedByte2 = this.U.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            return unsignedByte2 == 34 ? O2(this.T, i2, 2) : U2(this.T, i2, unsignedByte2, 2);
        }
        int i3 = (i2 << 8) | unsignedByte2;
        int unsignedByte3 = this.U.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            return unsignedByte3 == 34 ? O2(this.T, i3, 3) : U2(this.T, i3, unsignedByte3, 3);
        }
        int i4 = (i3 << 8) | unsignedByte3;
        int unsignedByte4 = this.U.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            return unsignedByte4 == 34 ? O2(this.T, i4, 4) : U2(this.T, i4, unsignedByte4, 4);
        }
        return o2(unsignedByte4, i4);
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
    }

    public final String o2(int i, int i2) throws IOException {
        int[] iArr = X;
        int unsignedByte = this.U.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            return unsignedByte == 34 ? P2(this.T, i2, i, 1) : V2(this.T, i2, i, unsignedByte, 1);
        }
        int i3 = (i << 8) | unsignedByte;
        int unsignedByte2 = this.U.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            return unsignedByte2 == 34 ? P2(this.T, i2, i3, 2) : V2(this.T, i2, i3, unsignedByte2, 2);
        }
        int i4 = (i3 << 8) | unsignedByte2;
        int unsignedByte3 = this.U.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            return unsignedByte3 == 34 ? P2(this.T, i2, i4, 3) : V2(this.T, i2, i4, unsignedByte3, 3);
        }
        int i5 = (i4 << 8) | unsignedByte3;
        int unsignedByte4 = this.U.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            return unsignedByte4 == 34 ? P2(this.T, i2, i5, 4) : V2(this.T, i2, i5, unsignedByte4, 4);
        }
        return m2(unsignedByte4, i2, i5);
    }

    public final String p2(int i) throws IOException {
        if (i != 34) {
            return f2(i);
        }
        int[] iArr = X;
        int unsignedByte = this.U.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            return unsignedByte == 34 ? "" : T2(0, unsignedByte, 0);
        }
        int unsignedByte2 = this.U.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            return unsignedByte2 == 34 ? N2(unsignedByte, 1) : T2(unsignedByte, unsignedByte2, 1);
        }
        int i2 = (unsignedByte << 8) | unsignedByte2;
        int unsignedByte3 = this.U.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            return unsignedByte3 == 34 ? N2(i2, 2) : T2(i2, unsignedByte3, 2);
        }
        int i3 = (i2 << 8) | unsignedByte3;
        int unsignedByte4 = this.U.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            return unsignedByte4 == 34 ? N2(i3, 3) : T2(i3, unsignedByte4, 3);
        }
        int i4 = (i3 << 8) | unsignedByte4;
        int unsignedByte5 = this.U.readUnsignedByte();
        if (iArr[unsignedByte5] != 0) {
            return unsignedByte5 == 34 ? N2(i4, 4) : T2(i4, unsignedByte5, 4);
        }
        this.T = i4;
        return n2(unsignedByte5);
    }

    public JsonToken q2() throws IOException {
        int unsignedByte;
        char[] cArrM = this.A.m();
        cArrM[0] = '-';
        int unsignedByte2 = this.U.readUnsignedByte();
        cArrM[1] = (char) unsignedByte2;
        if (unsignedByte2 <= 48) {
            if (unsignedByte2 != 48) {
                return d2(unsignedByte2, true);
            }
            unsignedByte = e2();
        } else {
            if (unsignedByte2 > 57) {
                return d2(unsignedByte2, true);
            }
            unsignedByte = this.U.readUnsignedByte();
        }
        int i = 2;
        int i2 = 1;
        while (unsignedByte <= 57 && unsignedByte >= 48) {
            i2++;
            cArrM[i] = (char) unsignedByte;
            unsignedByte = this.U.readUnsignedByte();
            i++;
        }
        if (unsignedByte == 46 || unsignedByte == 101 || unsignedByte == 69) {
            return l2(cArrM, i, unsignedByte, true, i2);
        }
        this.A.E(i);
        this.V = unsignedByte;
        if (this.y.h()) {
            L2();
        }
        return P1(true, i2);
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
        int unsignedByte = this.U.readUnsignedByte();
        if (unsignedByte == 34 || unsignedByte == 47 || unsignedByte == 92) {
            return (char) unsignedByte;
        }
        if (unsignedByte == 98) {
            return '\b';
        }
        if (unsignedByte == 102) {
            return '\f';
        }
        if (unsignedByte == 110) {
            return '\n';
        }
        if (unsignedByte == 114) {
            return StringUtil.CARRIAGE_RETURN;
        }
        if (unsignedByte == 116) {
            return '\t';
        }
        if (unsignedByte != 117) {
            return T0((char) T1(unsignedByte));
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int unsignedByte2 = this.U.readUnsignedByte();
            int iB = xt3.b(unsignedByte2);
            if (iB < 0) {
                e1(unsignedByte2, "expected a hex-digit for character escape sequence");
            }
            i = (i << 4) | iB;
        }
        return (char) i;
    }

    public JsonToken r2(int i) throws IOException {
        int unsignedByte;
        char[] cArrM = this.A.m();
        int i2 = 1;
        if (i == 48) {
            unsignedByte = e2();
            if (unsignedByte > 57 || unsignedByte < 48) {
                cArrM[0] = '0';
            } else {
                i2 = 0;
            }
        } else {
            cArrM[0] = (char) i;
            unsignedByte = this.U.readUnsignedByte();
        }
        int unsignedByte2 = unsignedByte;
        int i3 = i2;
        int i4 = i3;
        while (unsignedByte2 <= 57 && unsignedByte2 >= 48) {
            i4++;
            cArrM[i3] = (char) unsignedByte2;
            unsignedByte2 = this.U.readUnsignedByte();
            i3++;
        }
        if (unsignedByte2 == 46 || unsignedByte2 == 101 || unsignedByte2 == 69) {
            return l2(cArrM, i3, unsignedByte2, false, i4);
        }
        this.A.E(i3);
        if (this.y.h()) {
            L2();
        } else {
            this.V = unsignedByte2;
        }
        return P1(false, i4);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] s(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this.E == null)) {
            X0("Current token (" + this.c + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.S) {
            try {
                this.E = S1(base64Variant);
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

    public int s2(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length - 3;
        int i = 0;
        int i2 = 0;
        while (true) {
            int unsignedByte = this.U.readUnsignedByte();
            if (unsignedByte > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(unsignedByte);
                if (iDecodeBase64Char < 0) {
                    if (unsignedByte == 34) {
                        break;
                    }
                    iDecodeBase64Char = q1(base64Variant, unsignedByte, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i > length) {
                    i2 += i;
                    outputStream.write(bArr, 0, i);
                    i = 0;
                }
                int unsignedByte2 = this.U.readUnsignedByte();
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(unsignedByte2);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = q1(base64Variant, unsignedByte2, 1);
                }
                int i3 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                int unsignedByte3 = this.U.readUnsignedByte();
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(unsignedByte3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (unsignedByte3 == 34) {
                            int i4 = i + 1;
                            bArr[i] = (byte) (i3 >> 4);
                            if (base64Variant.usesPadding()) {
                                v1(base64Variant);
                            }
                            i = i4;
                            break;
                        }
                        iDecodeBase64Char3 = q1(base64Variant, unsignedByte3, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        int unsignedByte4 = this.U.readUnsignedByte();
                        if (!base64Variant.usesPaddingChar(unsignedByte4) && (unsignedByte4 != 92 || q1(base64Variant, unsignedByte4, 3) != -2)) {
                            throw L1(base64Variant, unsignedByte4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        bArr[i] = (byte) (i3 >> 4);
                        i++;
                    }
                }
                int i5 = (i3 << 6) | iDecodeBase64Char3;
                int unsignedByte5 = this.U.readUnsignedByte();
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(unsignedByte5);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (unsignedByte5 == 34) {
                            int i6 = i + 1;
                            bArr[i] = (byte) (i5 >> 10);
                            i += 2;
                            bArr[i6] = (byte) (i5 >> 2);
                            if (!base64Variant.usesPadding()) {
                                break;
                            }
                            v1(base64Variant);
                            break;
                        }
                        iDecodeBase64Char4 = q1(base64Variant, unsignedByte5, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        int i7 = i + 1;
                        bArr[i] = (byte) (i5 >> 10);
                        i += 2;
                        bArr[i7] = (byte) (i5 >> 2);
                    }
                }
                int i8 = (i5 << 6) | iDecodeBase64Char4;
                bArr[i] = (byte) (i8 >> 16);
                int i9 = i + 2;
                bArr[i + 1] = (byte) (i8 >> 8);
                i += 3;
                bArr[i9] = (byte) i8;
            }
        }
        this.S = false;
        if (i <= 0) {
            return i2;
        }
        int i10 = i2 + i;
        outputStream.write(bArr, 0, i);
        return i10;
    }

    public void t2(int i) throws JsonParseException {
        if (i < 32) {
            g1(i);
        }
        u2(i);
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
        return X1();
    }

    public void u2(int i) throws JsonParseException {
        X0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
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
        return X1();
    }

    public void w2(int i, String str) throws IOException {
        x2(i, str, "'null', 'true', 'false' or NaN");
    }

    public void x2(int i, String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            char cT1 = (char) T1(i);
            if (!Character.isJavaIdentifierPart(cT1)) {
                X0("Unrecognized token '" + sb.toString() + "': was expecting " + str2);
                return;
            }
            sb.append(cT1);
            i = this.U.readUnsignedByte();
        }
    }
}
