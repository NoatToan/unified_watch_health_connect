package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class alh extends JsonParser {
    public static final byte[] e = new byte[0];
    public static final int[] f = new int[0];
    public static final BigInteger g;
    public static final BigInteger h;
    public static final BigInteger i;
    public static final BigInteger j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final BigDecimal f1174k;
    public static final BigDecimal l;
    public static final BigDecimal m;
    public static final BigDecimal n;
    public JsonToken c;
    public JsonToken d;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        g = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        h = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        i = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        j = bigIntegerValueOf4;
        f1174k = new BigDecimal(bigIntegerValueOf3);
        l = new BigDecimal(bigIntegerValueOf4);
        m = new BigDecimal(bigIntegerValueOf);
        n = new BigDecimal(bigIntegerValueOf2);
    }

    public alh(int i2) {
        super(i2);
    }

    public static final String R0(int i2) {
        char c = (char) i2;
        if (Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + i2 + ")";
        }
        if (i2 <= 255) {
            return "'" + c + "' (code " + i2 + ")";
        }
        return "'" + c + "' (code " + i2 + " / 0x" + Integer.toHexString(i2) + ")";
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean B0() {
        return this.c == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean C0() {
        return this.c == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract JsonToken G0() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken H0() throws IOException {
        JsonToken jsonTokenG0 = G0();
        return jsonTokenG0 == JsonToken.FIELD_NAME ? G0() : jsonTokenG0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String J() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken K() {
        return this.c;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int M() {
        JsonToken jsonToken = this.c;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser O0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i2 = 1;
        while (true) {
            JsonToken jsonTokenG0 = G0();
            if (jsonTokenG0 == null) {
                S0();
                return this;
            }
            if (jsonTokenG0.isStructStart()) {
                i2++;
            } else if (jsonTokenG0.isStructEnd()) {
                i2--;
                if (i2 == 0) {
                    return this;
                }
            } else if (jsonTokenG0 == JsonToken.NOT_AVAILABLE) {
                Y0("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
            }
        }
    }

    public final JsonParseException P0(String str, Throwable th) {
        return new JsonParseException(this, str, th);
    }

    public void Q0(String str, t63 t63Var, Base64Variant base64Variant) throws IOException {
        try {
            base64Variant.decode(str, t63Var);
        } catch (IllegalArgumentException e2) {
            X0(e2.getMessage());
        }
    }

    public abstract void S0() throws JsonParseException;

    public char T0(char c) throws JsonProcessingException {
        if (A0(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && A0(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        X0("Unrecognized character escape " + R0(c));
        return c;
    }

    public boolean U0(String str) {
        return AbstractJsonLexerKt.NULL.equals(str);
    }

    public String V0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public String W0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    public final void X0(String str) throws JsonParseException {
        throw a(str);
    }

    public final void Y0(String str, Object obj) throws JsonParseException {
        throw a(String.format(str, obj));
    }

    public final void Z0(String str, Object obj, Object obj2) throws JsonParseException {
        throw a(String.format(str, obj, obj2));
    }

    public void a1() throws JsonParseException {
        b1(" in " + this.c, this.c);
    }

    public void b1(String str, JsonToken jsonToken) throws JsonParseException {
        throw new JsonEOFException(this, jsonToken, "Unexpected end-of-input" + str);
    }

    public void c1(JsonToken jsonToken) throws JsonParseException {
        String str;
        if (jsonToken == JsonToken.VALUE_STRING) {
            str = " in a String value";
        } else {
            str = (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value";
        }
        b1(str, jsonToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String d0() throws IOException;

    public void d1(int i2) throws JsonParseException {
        e1(i2, "Expected space separating root-level values");
    }

    public void e1(int i2, String str) throws JsonParseException {
        if (i2 < 0) {
            a1();
        }
        String str2 = String.format("Unexpected character (%s)", R0(i2));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        X0(str2);
    }

    public final void f1() {
        jpq.c();
    }

    public void g1(int i2) throws JsonParseException {
        X0("Illegal character (" + R0((char) i2) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    public void h1(int i2, String str) throws JsonParseException {
        if (!A0(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i2 > 32) {
            X0("Illegal unquoted character (" + R0((char) i2) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    public final void i1(String str, Throwable th) throws JsonParseException {
        throw P0(str, th);
    }

    public void j1(String str) throws JsonParseException {
        X0("Invalid numeric value: " + str);
    }

    public void k1() throws IOException {
        X0(String.format("Numeric value (%s) out of range of int (%d - %s)", V0(d0()), Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void l() {
        JsonToken jsonToken = this.c;
        if (jsonToken != null) {
            this.d = jsonToken;
            this.c = null;
        }
    }

    public void l1() throws IOException {
        X0(String.format("Numeric value (%s) out of range of long (%d - %s)", V0(d0()), Long.MIN_VALUE, Long.MAX_VALUE));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken m() {
        return this.c;
    }

    public void m1(int i2, String str) throws JsonParseException {
        String str2 = String.format("Unexpected character (%s) in numeric value", R0(i2));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        X0(str2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int o0() throws IOException {
        JsonToken jsonToken = this.c;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? R() : r0(0);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int r0(int i2) throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return R();
        }
        if (jsonToken == null) {
            return i2;
        }
        int iId = jsonToken.id();
        if (iId == 6) {
            String strD0 = d0();
            if (U0(strD0)) {
                return 0;
            }
            return n2h.d(strD0, i2);
        }
        switch (iId) {
            case 9:
                return 1;
            case 10:
            case 11:
                return 0;
            case 12:
                Object objP = P();
                return objP instanceof Number ? ((Number) objP).intValue() : i2;
            default:
                return i2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long s0() throws IOException {
        JsonToken jsonToken = this.c;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? S() : t0(0L);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long t0(long j2) throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return S();
        }
        if (jsonToken == null) {
            return j2;
        }
        int iId = jsonToken.id();
        if (iId == 6) {
            String strD0 = d0();
            if (U0(strD0)) {
                return 0L;
            }
            return n2h.e(strD0, j2);
        }
        switch (iId) {
            case 9:
                return 1L;
            case 10:
            case 11:
                return 0L;
            case 12:
                Object objP = P();
                return objP instanceof Number ? ((Number) objP).longValue() : j2;
            default:
                return j2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String u0() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return d0();
        }
        return jsonToken == JsonToken.FIELD_NAME ? J() : v0(null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String v0(String str) throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return d0();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return J();
        }
        return (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : d0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean w0() {
        return this.c != null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean y0(JsonToken jsonToken) {
        return this.c == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean z0(int i2) {
        JsonToken jsonToken = this.c;
        if (jsonToken == null) {
            return i2 == 0;
        }
        return jsonToken.id() == i2;
    }
}
