package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zkh extends alh {
    public final o7p A;
    public char[] B;
    public boolean C;
    public t63 D;
    public byte[] E;
    public int F;
    public int G;
    public long H;
    public double I;
    public BigInteger J;
    public BigDecimal K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public final xuc o;
    public boolean p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f41402r;
    public long s;
    public int t;
    public int u;
    public long v;
    public int w;
    public int x;
    public utd y;
    public JsonToken z;

    public zkh(xuc xucVar, int i) {
        super(i);
        this.t = 1;
        this.w = 1;
        this.F = 0;
        this.o = xucVar;
        this.A = xucVar.k();
        this.y = utd.o(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? q67.f(this) : null);
    }

    public static int[] J1(int[] iArr, int i) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    public void A1() throws IOException {
        this.A.w();
        char[] cArr = this.B;
        if (cArr != null) {
            this.B = null;
            this.o.q(cArr);
        }
    }

    public void B1(int i, char c) throws JsonParseException {
        utd utdVarB0 = b0();
        X0(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), utdVarB0.j(), utdVarB0.s(u1())));
    }

    public void C1(int i, String str) throws IOException {
        Z0("Numeric value (%s) out of range of %s", V0(str), i == 2 ? "long" : "int");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean D0() {
        if (this.c != JsonToken.VALUE_NUMBER_FLOAT || (this.F & 8) == 0) {
            return false;
        }
        double d = this.I;
        return Double.isNaN(d) || Double.isInfinite(d);
    }

    public void D1() throws IOException {
        int i = this.F;
        if ((i & 8) != 0) {
            this.K = n2h.f(d0());
        } else if ((i & 4) != 0) {
            this.K = new BigDecimal(this.J);
        } else if ((i & 2) != 0) {
            this.K = BigDecimal.valueOf(this.H);
        } else if ((i & 1) != 0) {
            this.K = BigDecimal.valueOf(this.G);
        } else {
            f1();
        }
        this.F |= 16;
    }

    public void E1() throws IOException {
        int i = this.F;
        if ((i & 16) != 0) {
            this.J = this.K.toBigInteger();
        } else if ((i & 2) != 0) {
            this.J = BigInteger.valueOf(this.H);
        } else if ((i & 1) != 0) {
            this.J = BigInteger.valueOf(this.G);
        } else if ((i & 8) != 0) {
            this.J = BigDecimal.valueOf(this.I).toBigInteger();
        } else {
            f1();
        }
        this.F |= 4;
    }

    public void F1() throws IOException {
        int i = this.F;
        if ((i & 16) != 0) {
            this.I = this.K.doubleValue();
        } else if ((i & 4) != 0) {
            this.I = this.J.doubleValue();
        } else if ((i & 2) != 0) {
            this.I = this.H;
        } else if ((i & 1) != 0) {
            this.I = this.G;
        } else {
            f1();
        }
        this.F |= 8;
    }

    public void G1() throws IOException {
        int i = this.F;
        if ((i & 2) != 0) {
            long j = this.H;
            int i2 = (int) j;
            if (i2 != j) {
                X0("Numeric value (" + d0() + ") out of range of int");
            }
            this.G = i2;
        } else if ((i & 4) != 0) {
            if (alh.g.compareTo(this.J) > 0 || alh.h.compareTo(this.J) < 0) {
                k1();
            }
            this.G = this.J.intValue();
        } else if ((i & 8) != 0) {
            double d = this.I;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                k1();
            }
            this.G = (int) this.I;
        } else if ((i & 16) != 0) {
            if (alh.m.compareTo(this.K) > 0 || alh.n.compareTo(this.K) < 0) {
                k1();
            }
            this.G = this.K.intValue();
        } else {
            f1();
        }
        this.F |= 1;
    }

    public void H1() throws IOException {
        int i = this.F;
        if ((i & 1) != 0) {
            this.H = this.G;
        } else if ((i & 4) != 0) {
            if (alh.i.compareTo(this.J) > 0 || alh.j.compareTo(this.J) < 0) {
                l1();
            }
            this.H = this.J.longValue();
        } else if ((i & 8) != 0) {
            double d = this.I;
            if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                l1();
            }
            this.H = (long) this.I;
        } else if ((i & 16) != 0) {
            if (alh.f1174k.compareTo(this.K) > 0 || alh.l.compareTo(this.K) < 0) {
                l1();
            }
            this.H = this.K.longValue();
        } else {
            f1();
        }
        this.F |= 2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] */
    public utd b0() {
        return this.y;
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public String J() throws IOException {
        utd utdVarE;
        JsonToken jsonToken = this.c;
        return ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (utdVarE = this.y.e()) != null) ? utdVarE.b() : this.y.b();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser J0(int i, int i2) {
        int i3 = this.f7621a;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this.f7621a = i4;
            n1(i4, i5);
        }
        return this;
    }

    public IllegalArgumentException K1(Base64Variant base64Variant, int i, int i2) throws IllegalArgumentException {
        return L1(base64Variant, i, i2, null);
    }

    public IllegalArgumentException L1(Base64Variant base64Variant, int i, int i2, String str) throws IllegalArgumentException {
        String str2;
        if (i <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i), Integer.valueOf(i2 + 1));
        } else if (base64Variant.usesPaddingChar(i)) {
            str2 = "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i) || Character.isISOControl(i)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i) + "' (code 0x" + Integer.toHexString(i) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void M0(Object obj) {
        this.y.i(obj);
    }

    public final JsonToken M1(boolean z, int i, int i2, int i3) {
        return (i2 >= 1 || i3 >= 1) ? O1(z, i, i2, i3) : P1(z, i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal N() throws IOException {
        int i = this.F;
        if ((i & 16) == 0) {
            if (i == 0) {
                x1(16);
            }
            if ((this.F & 16) == 0) {
                D1();
            }
        }
        return this.K;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser N0(int i) {
        int i2 = this.f7621a ^ i;
        if (i2 != 0) {
            this.f7621a = i;
            n1(i, i2);
        }
        return this;
    }

    public final JsonToken N1(String str, double d) {
        this.A.B(str);
        this.I = d;
        this.F = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double O() throws IOException {
        int i = this.F;
        if ((i & 8) == 0) {
            if (i == 0) {
                x1(8);
            }
            if ((this.F & 8) == 0) {
                F1();
            }
        }
        return this.I;
    }

    public final JsonToken O1(boolean z, int i, int i2, int i3) {
        this.L = z;
        this.M = i;
        this.N = i2;
        this.O = i3;
        this.F = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken P1(boolean z, int i) {
        this.L = z;
        this.M = i;
        this.N = 0;
        this.O = 0;
        this.F = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float Q() throws IOException {
        return (float) O();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int R() throws IOException {
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

    @Override // com.fasterxml.jackson.core.JsonParser
    public long S() throws IOException {
        int i = this.F;
        if ((i & 2) == 0) {
            if (i == 0) {
                x1(2);
            }
            if ((this.F & 2) == 0) {
                H1();
            }
        }
        return this.H;
    }

    @Override // defpackage.alh
    public void S0() throws JsonParseException {
        if (this.y.h()) {
            return;
        }
        b1(String.format(": expected close marker for %s (start marker at %s)", this.y.f() ? "Array" : "Object", this.y.s(u1())), null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType T() throws IOException {
        if (this.F == 0) {
            x1(0);
        }
        if (this.c != JsonToken.VALUE_NUMBER_INT) {
            return (this.F & 16) != 0 ? JsonParser.NumberType.BIG_DECIMAL : JsonParser.NumberType.DOUBLE;
        }
        int i = this.F;
        if ((i & 1) != 0) {
            return JsonParser.NumberType.INT;
        }
        return (i & 2) != 0 ? JsonParser.NumberType.LONG : JsonParser.NumberType.BIG_INTEGER;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number U() throws IOException {
        if (this.F == 0) {
            x1(0);
        }
        if (this.c == JsonToken.VALUE_NUMBER_INT) {
            int i = this.F;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.G);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.H);
            }
            return (i & 4) != 0 ? this.J : this.K;
        }
        int i2 = this.F;
        if ((i2 & 16) != 0) {
            return this.K;
        }
        if ((i2 & 8) == 0) {
            f1();
        }
        return Double.valueOf(this.I);
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.p) {
            return;
        }
        this.q = Math.max(this.q, this.f41402r);
        this.p = true;
        try {
            o1();
        } finally {
            A1();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser n(JsonParser.Feature feature) {
        this.f7621a |= feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION && this.y.q() == null) {
            this.y = this.y.v(q67.f(this));
        }
        return this;
    }

    public void n1(int i, int i2) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i2 & mask) == 0 || (i & mask) == 0) {
            return;
        }
        if (this.y.q() == null) {
            this.y = this.y.v(q67.f(this));
        } else {
            this.y = this.y.v(null);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger o() throws IOException {
        int i = this.F;
        if ((i & 4) == 0) {
            if (i == 0) {
                x1(4);
            }
            if ((this.F & 4) == 0) {
                E1();
            }
        }
        return this.J;
    }

    public abstract void o1() throws IOException;

    public final int p1(Base64Variant base64Variant, char c, int i) throws IOException {
        if (c != '\\') {
            throw K1(base64Variant, c, i);
        }
        char cR1 = r1();
        if (cR1 <= ' ' && i == 0) {
            return -1;
        }
        int iDecodeBase64Char = base64Variant.decodeBase64Char(cR1);
        if (iDecodeBase64Char >= 0 || (iDecodeBase64Char == -2 && i >= 2)) {
            return iDecodeBase64Char;
        }
        throw K1(base64Variant, cR1, i);
    }

    public final int q1(Base64Variant base64Variant, int i, int i2) throws IOException {
        if (i != 92) {
            throw K1(base64Variant, i, i2);
        }
        char cR1 = r1();
        if (cR1 <= ' ' && i2 == 0) {
            return -1;
        }
        int iDecodeBase64Char = base64Variant.decodeBase64Char((int) cR1);
        if (iDecodeBase64Char >= 0 || iDecodeBase64Char == -2) {
            return iDecodeBase64Char;
        }
        throw K1(base64Variant, cR1, i2);
    }

    public abstract char r1() throws IOException;

    public final int s1() throws JsonParseException {
        S0();
        return -1;
    }

    public t63 t1() {
        t63 t63Var = this.D;
        if (t63Var == null) {
            this.D = new t63();
        } else {
            t63Var.reset();
        }
        return this.D;
    }

    public Object u1() {
        if (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this.f7621a)) {
            return this.o.m();
        }
        return null;
    }

    public void v1(Base64Variant base64Variant) throws IOException {
        X0(base64Variant.missingPaddingMessage());
    }

    public int w1() throws IOException {
        if (this.c != JsonToken.VALUE_NUMBER_INT || this.M > 9) {
            x1(1);
            if ((this.F & 1) == 0) {
                G1();
            }
            return this.G;
        }
        int iJ = this.A.j(this.L);
        this.G = iJ;
        this.F = 1;
        return iJ;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean x0() {
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.C;
        }
        return false;
    }

    public void x1(int i) throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT) {
            if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
                y1(i);
                return;
            } else {
                Y0("Current token (%s) not numeric, can not use numeric value accessors", jsonToken);
                return;
            }
        }
        int i2 = this.M;
        if (i2 <= 9) {
            this.G = this.A.j(this.L);
            this.F = 1;
            return;
        }
        if (i2 > 18) {
            z1(i);
            return;
        }
        long jK = this.A.k(this.L);
        if (i2 == 10) {
            if (this.L) {
                if (jK >= -2147483648L) {
                    this.G = (int) jK;
                    this.F = 1;
                    return;
                }
            } else if (jK <= 2147483647L) {
                this.G = (int) jK;
                this.F = 1;
                return;
            }
        }
        this.H = jK;
        this.F = 2;
    }

    public final void y1(int i) throws IOException {
        try {
            if (i == 16) {
                this.K = this.A.h();
                this.F = 16;
            } else {
                this.I = this.A.i();
                this.F = 8;
            }
        } catch (NumberFormatException e) {
            i1("Malformed numeric value (" + W0(this.A.l()) + ")", e);
        }
    }

    public final void z1(int i) throws IOException {
        String strL = this.A.l();
        try {
            int i2 = this.M;
            char[] cArrT = this.A.t();
            int iU = this.A.u();
            boolean z = this.L;
            if (z) {
                iU++;
            }
            if (n2h.c(cArrT, iU, i2, z)) {
                this.H = Long.parseLong(strL);
                this.F = 2;
                return;
            }
            if (i == 1 || i == 2) {
                C1(i, strL);
            }
            if (i != 8 && i != 32) {
                this.J = new BigInteger(strL);
                this.F = 4;
                return;
            }
            this.I = n2h.i(strL);
            this.F = 8;
        } catch (NumberFormatException e) {
            i1("Malformed numeric value (" + W0(strL) + ")", e);
        }
    }
}
