package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class t1q extends alh {
    public v3h o;
    public qvg p;
    public JsonToken q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f34210r;
    public boolean s;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34211a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f34211a = iArr;
            try {
                iArr[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34211a[JsonToken.VALUE_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34211a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34211a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34211a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public t1q(zsd zsdVar, v3h v3hVar) {
        super(0);
        this.o = v3hVar;
        if (zsdVar.C()) {
            this.q = JsonToken.START_ARRAY;
            this.p = new qvg.a(zsdVar, null);
        } else if (!zsdVar.H()) {
            this.p = new qvg.c(zsdVar, null);
        } else {
            this.q = JsonToken.START_OBJECT;
            this.p = new qvg.b(zsdVar, null);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public v3h D() {
        return this.o;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean D0() {
        if (this.s) {
            return false;
        }
        zsd zsdVarN1 = n1();
        if (zsdVarN1 instanceof u2h) {
            return ((u2h) zsdVarN1).V();
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation E() {
        return JsonLocation.NA;
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public JsonToken G0() throws IOException {
        JsonToken jsonToken = this.q;
        if (jsonToken != null) {
            this.c = jsonToken;
            this.q = null;
            return jsonToken;
        }
        if (this.f34210r) {
            this.f34210r = false;
            if (!this.p.k()) {
                JsonToken jsonToken2 = this.c == JsonToken.START_OBJECT ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
                this.c = jsonToken2;
                return jsonToken2;
            }
            qvg qvgVarO = this.p.o();
            this.p = qvgVarO;
            JsonToken jsonTokenP = qvgVarO.p();
            this.c = jsonTokenP;
            if (jsonTokenP == JsonToken.START_OBJECT || jsonTokenP == JsonToken.START_ARRAY) {
                this.f34210r = true;
            }
            return jsonTokenP;
        }
        qvg qvgVar = this.p;
        if (qvgVar == null) {
            this.s = true;
            return null;
        }
        JsonToken jsonTokenP2 = qvgVar.p();
        this.c = jsonTokenP2;
        if (jsonTokenP2 == null) {
            this.c = this.p.m();
            this.p = this.p.n();
            return this.c;
        }
        if (jsonTokenP2 == JsonToken.START_OBJECT || jsonTokenP2 == JsonToken.START_ARRAY) {
            this.f34210r = true;
        }
        return jsonTokenP2;
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public String J() {
        qvg qvgVar = this.p;
        if (qvgVar == null) {
            return null;
        }
        return qvgVar.b();
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
        return o1().q();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double O() throws IOException {
        return o1().t();
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public JsonParser O0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.START_OBJECT) {
            this.f34210r = false;
            this.c = JsonToken.END_OBJECT;
        } else if (jsonToken == JsonToken.START_ARRAY) {
            this.f34210r = false;
            this.c = JsonToken.END_ARRAY;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object P() {
        zsd zsdVarN1;
        if (this.s || (zsdVarN1 = n1()) == null) {
            return null;
        }
        if (zsdVarN1.I()) {
            return ((kgh) zsdVarN1).W();
        }
        if (zsdVarN1.E()) {
            return ((dj2) zsdVarN1).o();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float Q() throws IOException {
        return (float) o1().t();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int R() throws IOException {
        return o1().B();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long S() throws IOException {
        return o1().P();
    }

    @Override // defpackage.alh
    public void S0() throws JsonParseException {
        f1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType T() throws IOException {
        zsd zsdVarO1 = o1();
        if (zsdVarO1 == null) {
            return null;
        }
        return zsdVarO1.e();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number U() throws IOException {
        return o1().R();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public fud b0() {
        return this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.s) {
            return;
        }
        this.s = true;
        this.p = null;
        this.c = null;
    }

    @Override // defpackage.alh, com.fasterxml.jackson.core.JsonParser
    public String d0() {
        zsd zsdVarN1;
        if (this.s) {
            return null;
        }
        int i = a.f34211a[this.c.ordinal()];
        if (i == 1) {
            return this.p.b();
        }
        if (i == 2) {
            return n1().U();
        }
        if (i == 3 || i == 4) {
            return String.valueOf(n1().R());
        }
        if (i == 5 && (zsdVarN1 = n1()) != null && zsdVarN1.E()) {
            return zsdVarN1.l();
        }
        JsonToken jsonToken = this.c;
        if (jsonToken == null) {
            return null;
        }
        return jsonToken.asString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] f0() throws IOException {
        return d0().toCharArray();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int g0() throws IOException {
        return d0().length();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int i0() throws IOException {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation m0() {
        return JsonLocation.NA;
    }

    public zsd n1() {
        qvg qvgVar;
        if (this.s || (qvgVar = this.p) == null) {
            return null;
        }
        return qvgVar.l();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger o() throws IOException {
        return o1().m();
    }

    public zsd o1() throws JsonParseException {
        zsd zsdVarN1 = n1();
        if (zsdVarN1 != null && zsdVarN1.G()) {
            return zsdVarN1;
        }
        throw a("Current token (" + (zsdVarN1 == null ? null : zsdVarN1.f()) + ") not numeric, cannot use numeric value accessors");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] s(Base64Variant base64Variant) throws IOException {
        zsd zsdVarN1 = n1();
        if (zsdVarN1 != null) {
            return zsdVarN1 instanceof i8p ? ((i8p) zsdVarN1).W(base64Variant) : zsdVarN1.o();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean x0() {
        return false;
    }
}
