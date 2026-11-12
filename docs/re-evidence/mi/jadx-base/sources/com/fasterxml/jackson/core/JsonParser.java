package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.RequestPayload;
import defpackage.fud;
import defpackage.v3h;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonParser implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient RequestPayload f7622b;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public JsonParser() {
    }

    public JsonParser(int i) {
        this.f7621a = i;
    }

    public boolean A0(Feature feature) {
        return feature.enabledIn(this.f7621a);
    }

    public boolean B0() {
        return m() == JsonToken.START_ARRAY;
    }

    public boolean C0() {
        return m() == JsonToken.START_OBJECT;
    }

    public abstract v3h D();

    public boolean D0() throws IOException {
        return false;
    }

    public abstract JsonLocation E();

    public String E0() throws IOException {
        if (G0() == JsonToken.FIELD_NAME) {
            return J();
        }
        return null;
    }

    public String F0() throws IOException {
        if (G0() == JsonToken.VALUE_STRING) {
            return d0();
        }
        return null;
    }

    public abstract JsonToken G0() throws IOException;

    public abstract JsonToken H0() throws IOException;

    public JsonParser I0(int i, int i2) {
        throw new IllegalArgumentException("No FormatFeatures defined for parser of type " + getClass().getName());
    }

    public abstract String J() throws IOException;

    public JsonParser J0(int i, int i2) {
        return N0((i & i2) | (this.f7621a & (~i2)));
    }

    public abstract JsonToken K();

    public int K0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        b();
        return 0;
    }

    public boolean L0() {
        return false;
    }

    public abstract int M();

    public void M0(Object obj) {
        fud fudVarB0 = b0();
        if (fudVarB0 != null) {
            fudVarB0.i(obj);
        }
    }

    public abstract BigDecimal N() throws IOException;

    @Deprecated
    public JsonParser N0(int i) {
        this.f7621a = i;
        return this;
    }

    public abstract double O() throws IOException;

    public abstract JsonParser O0() throws IOException;

    public Object P() throws IOException {
        return null;
    }

    public abstract float Q() throws IOException;

    public abstract int R() throws IOException;

    public abstract long S() throws IOException;

    public abstract NumberType T() throws IOException;

    public abstract Number U() throws IOException;

    public Object Z() throws IOException {
        return null;
    }

    public JsonParseException a(String str) {
        return new JsonParseException(this, str).withRequestPayload(this.f7622b);
    }

    public void b() {
        throw new UnsupportedOperationException("Operation not supported by parser of type " + getClass().getName());
    }

    public abstract fud b0();

    public boolean c() {
        return false;
    }

    public short c0() throws IOException {
        int iR = R();
        if (iR >= -32768 && iR <= 32767) {
            return (short) iR;
        }
        throw a("Numeric value (" + d0() + ") out of range of Java short");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public boolean d() {
        return false;
    }

    public abstract String d0() throws IOException;

    public abstract char[] f0() throws IOException;

    public abstract int g0() throws IOException;

    public abstract int i0() throws IOException;

    public abstract void l();

    public JsonToken m() {
        return K();
    }

    public abstract JsonLocation m0();

    public JsonParser n(Feature feature) {
        this.f7621a = feature.getMask() | this.f7621a;
        return this;
    }

    public Object n0() throws IOException {
        return null;
    }

    public abstract BigInteger o() throws IOException;

    public int o0() throws IOException {
        return r0(0);
    }

    public byte[] p() throws IOException {
        return s(a.a());
    }

    public int r0(int i) throws IOException {
        return i;
    }

    public abstract byte[] s(Base64Variant base64Variant) throws IOException;

    public long s0() throws IOException {
        return t0(0L);
    }

    public long t0(long j) throws IOException {
        return j;
    }

    public String u0() throws IOException {
        return v0(null);
    }

    public abstract String v0(String str) throws IOException;

    public abstract boolean w0();

    public abstract boolean x0();

    public byte y() throws IOException {
        int iR = R();
        if (iR >= -128 && iR <= 255) {
            return (byte) iR;
        }
        throw a("Numeric value (" + d0() + ") out of range of Java byte");
    }

    public abstract boolean y0(JsonToken jsonToken);

    public abstract boolean z0(int i);
}
