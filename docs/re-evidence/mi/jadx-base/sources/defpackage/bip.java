package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class bip extends JsonGenerator {
    public static final int q = JsonGenerator.Feature.collectDefaults();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v3h f4259b;
    public fud c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f4260k;
    public int l;
    public Object m;
    public Object n;
    public boolean o;
    public xud p;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f4262b;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            f4262b = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4262b[JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4262b[JsonParser.NumberType.BIG_DECIMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4262b[JsonParser.NumberType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4262b[JsonParser.NumberType.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            f4261a = iArr2;
            try {
                iArr2[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4261a[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4261a[JsonToken.START_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4261a[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4261a[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4261a[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4261a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4261a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4261a[JsonToken.VALUE_TRUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4261a[JsonToken.VALUE_FALSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4261a[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4261a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class b extends alh {
        public v3h o;
        public final boolean p;
        public final boolean q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f4263r;
        public c s;
        public int t;
        public cip u;
        public boolean v;
        public transient t63 w;
        public JsonLocation x;

        public b(c cVar, v3h v3hVar, boolean z, boolean z2, fud fudVar) {
            super(0);
            this.x = null;
            this.s = cVar;
            this.t = -1;
            this.o = v3hVar;
            this.u = cip.m(fudVar);
            this.p = z;
            this.q = z2;
            this.f4263r = z | z2;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public v3h D() {
            return this.o;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean D0() {
            if (this.c != JsonToken.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object objQ1 = q1();
            if (objQ1 instanceof Double) {
                Double d = (Double) objQ1;
                return d.isNaN() || d.isInfinite();
            }
            if (!(objQ1 instanceof Float)) {
                return false;
            }
            Float f = (Float) objQ1;
            return f.isNaN() || f.isInfinite();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation E() {
            JsonLocation jsonLocation = this.x;
            return jsonLocation == null ? JsonLocation.NA : jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String E0() throws IOException {
            c cVar;
            if (this.v || (cVar = this.s) == null) {
                return null;
            }
            int i = this.t + 1;
            if (i < 16) {
                JsonToken jsonTokenS = cVar.s(i);
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                if (jsonTokenS == jsonToken) {
                    this.t = i;
                    this.c = jsonToken;
                    Object objL = this.s.l(i);
                    String string = objL instanceof String ? (String) objL : objL.toString();
                    this.u.o(string);
                    return string;
                }
            }
            if (G0() == JsonToken.FIELD_NAME) {
                return J();
            }
            return null;
        }

        @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
        public JsonToken G0() throws IOException {
            c cVar;
            if (this.v || (cVar = this.s) == null) {
                return null;
            }
            int i = this.t + 1;
            this.t = i;
            if (i >= 16) {
                this.t = 0;
                c cVarN = cVar.n();
                this.s = cVarN;
                if (cVarN == null) {
                    return null;
                }
            }
            JsonToken jsonTokenS = this.s.s(this.t);
            this.c = jsonTokenS;
            if (jsonTokenS == JsonToken.FIELD_NAME) {
                Object objQ1 = q1();
                this.u.o(objQ1 instanceof String ? (String) objQ1 : objQ1.toString());
            } else if (jsonTokenS == JsonToken.START_OBJECT) {
                this.u = this.u.l();
            } else if (jsonTokenS == JsonToken.START_ARRAY) {
                this.u = this.u.k();
            } else if (jsonTokenS == JsonToken.END_OBJECT || jsonTokenS == JsonToken.END_ARRAY) {
                this.u = this.u.n();
            }
            return this.c;
        }

        @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
        public String J() {
            JsonToken jsonToken = this.c;
            return (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) ? this.u.e().b() : this.u.b();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int K0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
            byte[] bArrS = s(base64Variant);
            if (bArrS == null) {
                return 0;
            }
            outputStream.write(bArrS, 0, bArrS.length);
            return bArrS.length;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigDecimal N() throws IOException {
            Number numberU = U();
            if (numberU instanceof BigDecimal) {
                return (BigDecimal) numberU;
            }
            int i = a.f4262b[T().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new BigDecimal((BigInteger) numberU);
                }
                if (i != 5) {
                    return BigDecimal.valueOf(numberU.doubleValue());
                }
            }
            return BigDecimal.valueOf(numberU.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public double O() throws IOException {
            return U().doubleValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object P() {
            if (this.c == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return q1();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public float Q() throws IOException {
            return U().floatValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int R() throws IOException {
            Number numberU = this.c == JsonToken.VALUE_NUMBER_INT ? (Number) q1() : U();
            return ((numberU instanceof Integer) || r1(numberU)) ? numberU.intValue() : o1(numberU);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public long S() throws IOException {
            Number numberU = this.c == JsonToken.VALUE_NUMBER_INT ? (Number) q1() : U();
            return ((numberU instanceof Long) || s1(numberU)) ? numberU.longValue() : p1(numberU);
        }

        @Override // defpackage.alh
        public void S0() throws JsonParseException {
            f1();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonParser.NumberType T() throws IOException {
            Number numberU = U();
            if (numberU instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (numberU instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (numberU instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (numberU instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (numberU instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (numberU instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (numberU instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Number U() throws IOException {
            n1();
            Object objQ1 = q1();
            if (objQ1 instanceof Number) {
                return (Number) objQ1;
            }
            if (objQ1 instanceof String) {
                String str = (String) objQ1;
                return str.indexOf(46) >= 0 ? Double.valueOf(Double.parseDouble(str)) : Long.valueOf(Long.parseLong(str));
            }
            if (objQ1 == null) {
                return null;
            }
            throw new IllegalStateException("Internal error: entry should be a Number, but is of type " + objQ1.getClass().getName());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object Z() {
            return this.s.j(this.t);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public fud b0() {
            return this.u;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean c() {
            return this.q;
        }

        @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.v) {
                return;
            }
            this.v = true;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean d() {
            return this.p;
        }

        @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
        public String d0() {
            JsonToken jsonToken = this.c;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object objQ1 = q1();
                return objQ1 instanceof String ? (String) objQ1 : h04.W(objQ1);
            }
            if (jsonToken == null) {
                return null;
            }
            int i = a.f4261a[jsonToken.ordinal()];
            return (i == 7 || i == 8) ? h04.W(q1()) : this.c.asString();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public char[] f0() {
            String strD0 = d0();
            if (strD0 == null) {
                return null;
            }
            return strD0.toCharArray();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int g0() {
            String strD0 = d0();
            if (strD0 == null) {
                return 0;
            }
            return strD0.length();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int i0() {
            return 0;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation m0() {
            return E();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object n0() {
            return this.s.k(this.t);
        }

        public final void n1() throws JsonParseException {
            JsonToken jsonToken = this.c;
            if (jsonToken == null || !jsonToken.isNumeric()) {
                throw a("Current token (" + this.c + ") not numeric, cannot use numeric value accessors");
            }
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigInteger o() throws IOException {
            Number numberU = U();
            if (numberU instanceof BigInteger) {
                return (BigInteger) numberU;
            }
            return T() == JsonParser.NumberType.BIG_DECIMAL ? ((BigDecimal) numberU).toBigInteger() : BigInteger.valueOf(numberU.longValue());
        }

        public int o1(Number number) throws IOException {
            if (number instanceof Long) {
                long jLongValue = number.longValue();
                int i = (int) jLongValue;
                if (i != jLongValue) {
                    k1();
                }
                return i;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (alh.g.compareTo(bigInteger) > 0 || alh.h.compareTo(bigInteger) < 0) {
                    k1();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -2.147483648E9d || dDoubleValue > 2.147483647E9d) {
                        k1();
                    }
                    return (int) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (alh.m.compareTo(bigDecimal) > 0 || alh.n.compareTo(bigDecimal) < 0) {
                        k1();
                    }
                } else {
                    f1();
                }
            }
            return number.intValue();
        }

        public long p1(Number number) throws IOException {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (alh.i.compareTo(bigInteger) > 0 || alh.j.compareTo(bigInteger) < 0) {
                    l1();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -9.223372036854776E18d || dDoubleValue > 9.223372036854776E18d) {
                        l1();
                    }
                    return (long) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (alh.f1174k.compareTo(bigDecimal) > 0 || alh.l.compareTo(bigDecimal) < 0) {
                        l1();
                    }
                } else {
                    f1();
                }
            }
            return number.longValue();
        }

        public final Object q1() {
            return this.s.l(this.t);
        }

        public final boolean r1(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public byte[] s(Base64Variant base64Variant) throws IOException {
            if (this.c == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object objQ1 = q1();
                if (objQ1 instanceof byte[]) {
                    return (byte[]) objQ1;
                }
            }
            if (this.c != JsonToken.VALUE_STRING) {
                throw a("Current token (" + this.c + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            String strD0 = d0();
            if (strD0 == null) {
                return null;
            }
            t63 t63Var = this.w;
            if (t63Var == null) {
                t63Var = new t63(100);
                this.w = t63Var;
            } else {
                t63Var.reset();
            }
            Q0(strD0, t63Var, base64Variant);
            return t63Var.D();
        }

        public final boolean s1(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        public void t1(JsonLocation jsonLocation) {
            this.x = jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean x0() {
            return false;
        }
    }

    public static final class c {
        public static final JsonToken[] e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f4264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f4265b;
        public final Object[] c = new Object[16];
        public TreeMap<Integer, Object> d;

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            e = jsonTokenArr;
            JsonToken[] jsonTokenArrValues = JsonToken.values();
            System.arraycopy(jsonTokenArrValues, 1, jsonTokenArr, 1, Math.min(15, jsonTokenArrValues.length - 1));
        }

        public final int a(int i) {
            return i + i + 1;
        }

        public final int b(int i) {
            return i + i;
        }

        public c e(int i, JsonToken jsonToken) {
            if (i < 16) {
                o(i, jsonToken);
                return null;
            }
            c cVar = new c();
            this.f4264a = cVar;
            cVar.o(0, jsonToken);
            return this.f4264a;
        }

        public c f(int i, JsonToken jsonToken, Object obj) {
            if (i < 16) {
                p(i, jsonToken, obj);
                return null;
            }
            c cVar = new c();
            this.f4264a = cVar;
            cVar.p(0, jsonToken, obj);
            return this.f4264a;
        }

        public c g(int i, JsonToken jsonToken, Object obj, Object obj2) {
            if (i < 16) {
                q(i, jsonToken, obj, obj2);
                return null;
            }
            c cVar = new c();
            this.f4264a = cVar;
            cVar.q(0, jsonToken, obj, obj2);
            return this.f4264a;
        }

        public c h(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i < 16) {
                r(i, jsonToken, obj, obj2, obj3);
                return null;
            }
            c cVar = new c();
            this.f4264a = cVar;
            cVar.r(0, jsonToken, obj, obj2, obj3);
            return this.f4264a;
        }

        public final void i(int i, Object obj, Object obj2) {
            if (this.d == null) {
                this.d = new TreeMap<>();
            }
            if (obj != null) {
                this.d.put(Integer.valueOf(a(i)), obj);
            }
            if (obj2 != null) {
                this.d.put(Integer.valueOf(b(i)), obj2);
            }
        }

        public final Object j(int i) {
            TreeMap<Integer, Object> treeMap = this.d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(a(i)));
        }

        public final Object k(int i) {
            TreeMap<Integer, Object> treeMap = this.d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(b(i)));
        }

        public Object l(int i) {
            return this.c[i];
        }

        public boolean m() {
            return this.d != null;
        }

        public c n() {
            return this.f4264a;
        }

        public final void o(int i, JsonToken jsonToken) {
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.f4265b |= jOrdinal;
        }

        public final void p(int i, JsonToken jsonToken, Object obj) {
            this.c[i] = obj;
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.f4265b |= jOrdinal;
        }

        public final void q(int i, JsonToken jsonToken, Object obj, Object obj2) {
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.f4265b = jOrdinal | this.f4265b;
            i(i, obj, obj2);
        }

        public final void r(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this.c[i] = obj;
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.f4265b = jOrdinal | this.f4265b;
            i(i, obj2, obj3);
        }

        public JsonToken s(int i) {
            long j = this.f4265b;
            if (i > 0) {
                j >>= i << 2;
            }
            return e[((int) j) & 15];
        }
    }

    public bip(JsonParser jsonParser) {
        this(jsonParser, (DeserializationContext) null);
    }

    public static bip e1(JsonParser jsonParser) throws IOException {
        bip bipVar = new bip(jsonParser);
        bipVar.k1(jsonParser);
        return bipVar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void A0(short s) throws IOException {
        a1(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void B0(Object obj) throws IOException {
        if (obj == null) {
            s0();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof fcj)) {
            a1(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        v3h v3hVar = this.f4259b;
        if (v3hVar == null) {
            a1(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            v3hVar.writeValue(this, obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void C0(Object obj) {
        this.n = obj;
        this.o = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void F0(char c2) throws IOException {
        c1();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void G0(owl owlVar) throws IOException {
        c1();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void H0(String str) throws IOException {
        c1();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void I0(char[] cArr, int i, int i2) throws IOException {
        c1();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator J(int i, int i2) {
        this.d = (i & i2) | (s() & (~i2));
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void K0(String str) throws IOException {
        a1(JsonToken.VALUE_EMBEDDED_OBJECT, new fcj(str));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void L0() throws IOException {
        this.p.u();
        W0(JsonToken.START_ARRAY);
        this.p = this.p.m();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator N(int i) {
        this.d = i;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void N0() throws IOException {
        this.p.u();
        W0(JsonToken.START_OBJECT);
        this.p = this.p.n();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void O0(Object obj) throws IOException {
        this.p.u();
        W0(JsonToken.START_OBJECT);
        xud xudVarN = this.p.n();
        this.p = xudVarN;
        if (obj != null) {
            xudVarN.i(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void P0(owl owlVar) throws IOException {
        if (owlVar == null) {
            s0();
        } else {
            a1(JsonToken.VALUE_STRING, owlVar);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void Q0(String str) throws IOException {
        if (str == null) {
            s0();
        } else {
            a1(JsonToken.VALUE_STRING, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void R0(char[] cArr, int i, int i2) throws IOException {
        Q0(new String(cArr, i, i2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void T0(Object obj) {
        this.m = obj;
        this.o = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int U(Base64Variant base64Variant, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    public final void W0(JsonToken jsonToken) {
        c cVarG = this.o ? this.f4260k.g(this.l, jsonToken, this.n, this.m) : this.f4260k.e(this.l, jsonToken);
        if (cVarG == null) {
            this.l++;
        } else {
            this.f4260k = cVarG;
            this.l = 1;
        }
    }

    public final void X0(JsonToken jsonToken, Object obj) {
        c cVarH = this.o ? this.f4260k.h(this.l, jsonToken, obj, this.n, this.m) : this.f4260k.f(this.l, jsonToken, obj);
        if (cVarH == null) {
            this.l++;
        } else {
            this.f4260k = cVarH;
            this.l = 1;
        }
    }

    public final void Y0(StringBuilder sb) {
        Object objJ = this.f4260k.j(this.l - 1);
        if (objJ != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(objJ));
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        Object objK = this.f4260k.k(this.l - 1);
        if (objK != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(objK));
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
    }

    public final void Z0(JsonToken jsonToken) {
        this.p.u();
        c cVarG = this.o ? this.f4260k.g(this.l, jsonToken, this.n, this.m) : this.f4260k.e(this.l, jsonToken);
        if (cVarG == null) {
            this.l++;
        } else {
            this.f4260k = cVarG;
            this.l = 1;
        }
    }

    public final void a1(JsonToken jsonToken, Object obj) {
        this.p.u();
        c cVarH = this.o ? this.f4260k.h(this.l, jsonToken, obj, this.n, this.m) : this.f4260k.f(this.l, jsonToken, obj);
        if (cVarH == null) {
            this.l++;
        } else {
            this.f4260k = cVarH;
            this.l = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b0(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        B0(bArr2);
    }

    public final void b1(JsonParser jsonParser) throws IOException {
        Object objN0 = jsonParser.n0();
        this.m = objN0;
        if (objN0 != null) {
            this.o = true;
        }
        Object objZ = jsonParser.Z();
        this.n = objZ;
        if (objZ != null) {
            this.o = true;
        }
    }

    public void c1() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.e = true;
    }

    public bip d1(bip bipVar) throws IOException {
        if (!this.f) {
            this.f = bipVar.o();
        }
        if (!this.g) {
            this.g = bipVar.n();
        }
        this.h = this.f | this.g;
        JsonParser jsonParserF1 = bipVar.f1();
        while (jsonParserF1.G0() != null) {
            k1(jsonParserF1);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void f0(boolean z) throws IOException {
        Z0(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    public JsonParser f1() {
        return g1(this.f4259b);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void g0(Object obj) throws IOException {
        a1(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    public JsonParser g1(v3h v3hVar) {
        return new b(this.j, v3hVar, this.f, this.g, this.c);
    }

    public JsonParser h1(JsonParser jsonParser) {
        b bVar = new b(this.j, jsonParser.D(), this.f, this.g, this.c);
        bVar.t1(jsonParser.m0());
        return bVar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i0() throws IOException {
        W0(JsonToken.END_ARRAY);
        xud xudVarE = this.p.e();
        if (xudVarE != null) {
            this.p = xudVarE;
        }
    }

    public JsonParser i1() throws IOException {
        JsonParser jsonParserG1 = g1(this.f4259b);
        jsonParserG1.G0();
        return jsonParserG1;
    }

    public void j1(JsonParser jsonParser) throws IOException {
        if (this.h) {
            b1(jsonParser);
        }
        switch (a.f4261a[jsonParser.K().ordinal()]) {
            case 1:
                N0();
                return;
            case 2:
                m0();
                return;
            case 3:
                L0();
                return;
            case 4:
                i0();
                return;
            case 5:
                r0(jsonParser.J());
                return;
            case 6:
                if (jsonParser.x0()) {
                    R0(jsonParser.f0(), jsonParser.i0(), jsonParser.g0());
                    return;
                } else {
                    Q0(jsonParser.d0());
                    return;
                }
            case 7:
                int i = a.f4262b[jsonParser.T().ordinal()];
                if (i == 1) {
                    v0(jsonParser.R());
                    return;
                } else if (i != 2) {
                    w0(jsonParser.S());
                    return;
                } else {
                    z0(jsonParser.o());
                    return;
                }
            case 8:
                if (this.i) {
                    y0(jsonParser.N());
                    return;
                }
                int i2 = a.f4262b[jsonParser.T().ordinal()];
                if (i2 == 3) {
                    y0(jsonParser.N());
                    return;
                } else if (i2 != 4) {
                    t0(jsonParser.O());
                    return;
                } else {
                    u0(jsonParser.Q());
                    return;
                }
            case 9:
                f0(true);
                return;
            case 10:
                f0(false);
                return;
            case 11:
                s0();
                return;
            case 12:
                B0(jsonParser.P());
                return;
            default:
                throw new RuntimeException("Internal error: should never end up through this code path");
        }
    }

    public void k1(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK == JsonToken.FIELD_NAME) {
            if (this.h) {
                b1(jsonParser);
            }
            r0(jsonParser.J());
            jsonTokenK = jsonParser.G0();
        }
        if (this.h) {
            b1(jsonParser);
        }
        int i = a.f4261a[jsonTokenK.ordinal()];
        if (i == 1) {
            N0();
            while (jsonParser.G0() != JsonToken.END_OBJECT) {
                k1(jsonParser);
            }
            m0();
            return;
        }
        if (i != 3) {
            j1(jsonParser);
            return;
        }
        L0();
        while (jsonParser.G0() != JsonToken.END_ARRAY) {
            k1(jsonParser);
        }
        i0();
    }

    public bip l1(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenG0;
        if (jsonParser.M() != JsonToken.FIELD_NAME.id()) {
            k1(jsonParser);
            return this;
        }
        N0();
        do {
            k1(jsonParser);
            jsonTokenG0 = jsonParser.G0();
        } while (jsonTokenG0 == JsonToken.FIELD_NAME);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        if (jsonTokenG0 != jsonToken) {
            deserializationContext.reportWrongTokenException(bip.class, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + jsonTokenG0, new Object[0]);
        }
        m0();
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean m() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void m0() throws IOException {
        W0(JsonToken.END_OBJECT);
        xud xudVarE = this.p.e();
        if (xudVarE != null) {
            this.p = xudVarE;
        }
    }

    public JsonToken m1() {
        return this.j.s(0);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean n() {
        return this.g;
    }

    public bip n1(boolean z) {
        this.i = z;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean o() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void o0(owl owlVar) throws IOException {
        this.p.t(owlVar.getValue());
        X0(JsonToken.FIELD_NAME, owlVar);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public final xud y() {
        return this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator p(JsonGenerator.Feature feature) {
        this.d = (~feature.getMask()) & this.d;
        return this;
    }

    public void p1(JsonGenerator jsonGenerator) throws IOException {
        c cVarN = this.j;
        boolean z = this.h;
        boolean z2 = z && cVarN.m();
        int i = -1;
        while (true) {
            i++;
            if (i >= 16) {
                cVarN = cVarN.n();
                if (cVarN == null) {
                    return;
                }
                z2 = z && cVarN.m();
                i = 0;
            }
            JsonToken jsonTokenS = cVarN.s(i);
            if (jsonTokenS == null) {
                return;
            }
            if (z2) {
                Object objJ = cVarN.j(i);
                if (objJ != null) {
                    jsonGenerator.C0(objJ);
                }
                Object objK = cVarN.k(i);
                if (objK != null) {
                    jsonGenerator.T0(objK);
                }
            }
            switch (a.f4261a[jsonTokenS.ordinal()]) {
                case 1:
                    jsonGenerator.N0();
                    break;
                case 2:
                    jsonGenerator.m0();
                    break;
                case 3:
                    jsonGenerator.L0();
                    break;
                case 4:
                    jsonGenerator.i0();
                    break;
                case 5:
                    Object objL = cVarN.l(i);
                    if (!(objL instanceof owl)) {
                        jsonGenerator.r0((String) objL);
                    } else {
                        jsonGenerator.o0((owl) objL);
                    }
                    break;
                case 6:
                    Object objL2 = cVarN.l(i);
                    if (!(objL2 instanceof owl)) {
                        jsonGenerator.Q0((String) objL2);
                    } else {
                        jsonGenerator.P0((owl) objL2);
                    }
                    break;
                case 7:
                    Object objL3 = cVarN.l(i);
                    if (objL3 instanceof Integer) {
                        jsonGenerator.v0(((Integer) objL3).intValue());
                    } else if (objL3 instanceof BigInteger) {
                        jsonGenerator.z0((BigInteger) objL3);
                    } else if (objL3 instanceof Long) {
                        jsonGenerator.w0(((Long) objL3).longValue());
                    } else if (!(objL3 instanceof Short)) {
                        jsonGenerator.v0(((Number) objL3).intValue());
                    } else {
                        jsonGenerator.A0(((Short) objL3).shortValue());
                    }
                    break;
                case 8:
                    Object objL4 = cVarN.l(i);
                    if (objL4 instanceof Double) {
                        jsonGenerator.t0(((Double) objL4).doubleValue());
                    } else if (objL4 instanceof BigDecimal) {
                        jsonGenerator.y0((BigDecimal) objL4);
                    } else if (objL4 instanceof Float) {
                        jsonGenerator.u0(((Float) objL4).floatValue());
                    } else if (objL4 == null) {
                        jsonGenerator.s0();
                    } else {
                        if (!(objL4 instanceof String)) {
                            throw new JsonGenerationException(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", objL4.getClass().getName()), jsonGenerator);
                        }
                        jsonGenerator.x0((String) objL4);
                    }
                    break;
                case 9:
                    jsonGenerator.f0(true);
                    break;
                case 10:
                    jsonGenerator.f0(false);
                    break;
                case 11:
                    jsonGenerator.s0();
                    break;
                case 12:
                    Object objL5 = cVarN.l(i);
                    if (objL5 instanceof fcj) {
                        ((fcj) objL5).b(jsonGenerator);
                    } else if (!(objL5 instanceof bud)) {
                        jsonGenerator.g0(objL5);
                    } else {
                        jsonGenerator.B0(objL5);
                    }
                    break;
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void r0(String str) throws IOException {
        this.p.t(str);
        X0(JsonToken.FIELD_NAME, str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int s() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void s0() throws IOException {
        Z0(JsonToken.VALUE_NULL);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void t0(double d) throws IOException {
        a1(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[TokenBuffer: ");
        JsonParser jsonParserF1 = f1();
        int i = 0;
        boolean z = this.f || this.g;
        while (true) {
            try {
                JsonToken jsonTokenG0 = jsonParserF1.G0();
                if (jsonTokenG0 == null) {
                    break;
                }
                if (z) {
                    Y0(sb);
                }
                if (i < 100) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(jsonTokenG0.toString());
                    if (jsonTokenG0 == JsonToken.FIELD_NAME) {
                        sb.append('(');
                        sb.append(jsonParserF1.J());
                        sb.append(')');
                    }
                }
                i++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        if (i >= 100) {
            sb.append(" ... (truncated ");
            sb.append(i - 100);
            sb.append(" entries)");
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void u0(float f) throws IOException {
        a1(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void v0(int i) throws IOException {
        a1(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void w0(long j) throws IOException {
        a1(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void x0(String str) throws IOException {
        a1(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void y0(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            s0();
        } else {
            a1(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void z0(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            s0();
        } else {
            a1(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    public bip(v3h v3hVar, boolean z) {
        this.o = false;
        this.f4259b = v3hVar;
        this.d = q;
        this.p = xud.o(null);
        c cVar = new c();
        this.f4260k = cVar;
        this.j = cVar;
        this.l = 0;
        this.f = z;
        this.g = z;
        this.h = z | z;
    }

    public bip(JsonParser jsonParser, DeserializationContext deserializationContext) {
        this.o = false;
        this.f4259b = jsonParser.D();
        this.c = jsonParser.b0();
        this.d = q;
        this.p = xud.o(null);
        c cVar = new c();
        this.f4260k = cVar;
        this.j = cVar;
        this.l = 0;
        this.f = jsonParser.d();
        boolean zC = jsonParser.c();
        this.g = zC;
        this.h = zC | this.f;
        this.i = deserializationContext != null ? deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : false;
    }
}
