package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import defpackage.fud;
import defpackage.jpq;
import defpackage.owl;
import defpackage.r7i;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonGenerator implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r7i f7619a;

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        ESCAPE_NON_ASCII(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);

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

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7620a;

        static {
            int[] iArr = new int[WritableTypeId.Inclusion.values().length];
            f7620a = iArr;
            try {
                iArr[WritableTypeId.Inclusion.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7620a[WritableTypeId.Inclusion.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7620a[WritableTypeId.Inclusion.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7620a[WritableTypeId.Inclusion.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7620a[WritableTypeId.Inclusion.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public void A0(short s) throws IOException {
        v0(s);
    }

    public abstract void B0(Object obj) throws IOException;

    public void C0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public r7i D() {
        return this.f7619a;
    }

    public void D0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public JsonGenerator E(int i, int i2) {
        throw new IllegalArgumentException("No FormatFeatures defined for generator of type " + getClass().getName());
    }

    public void E0(String str) throws IOException {
    }

    public abstract void F0(char c) throws IOException;

    public void G0(owl owlVar) throws IOException {
        H0(owlVar.getValue());
    }

    public abstract void H0(String str) throws IOException;

    public abstract void I0(char[] cArr, int i, int i2) throws IOException;

    public JsonGenerator J(int i, int i2) {
        return N((i & i2) | (s() & (~i2)));
    }

    public void J0(owl owlVar) throws IOException {
        K0(owlVar.getValue());
    }

    public JsonGenerator K(CharacterEscapes characterEscapes) {
        return this;
    }

    public abstract void K0(String str) throws IOException;

    public abstract void L0() throws IOException;

    public void M(Object obj) {
        fud fudVarY = y();
        if (fudVarY != null) {
            fudVarY.i(obj);
        }
    }

    public void M0(int i) throws IOException {
        L0();
    }

    @Deprecated
    public abstract JsonGenerator N(int i);

    public abstract void N0() throws IOException;

    public abstract JsonGenerator O(int i);

    public void O0(Object obj) throws IOException {
        N0();
        M(obj);
    }

    public JsonGenerator P(r7i r7iVar) {
        this.f7619a = r7iVar;
        return this;
    }

    public abstract void P0(owl owlVar) throws IOException;

    public JsonGenerator Q(owl owlVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void Q0(String str) throws IOException;

    public void R(double[] dArr, int i, int i2) throws IOException {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        c(dArr.length, i, i2);
        L0();
        int i3 = i2 + i;
        while (i < i3) {
            t0(dArr[i]);
            i++;
        }
        i0();
    }

    public abstract void R0(char[] cArr, int i, int i2) throws IOException;

    public void S(int[] iArr, int i, int i2) throws IOException {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        c(iArr.length, i, i2);
        L0();
        int i3 = i2 + i;
        while (i < i3) {
            v0(iArr[i]);
            i++;
        }
        i0();
    }

    public void S0(String str, String str2) throws IOException {
        r0(str);
        Q0(str2);
    }

    public void T(long[] jArr, int i, int i2) throws IOException {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        c(jArr.length, i, i2);
        L0();
        int i3 = i2 + i;
        while (i < i3) {
            w0(jArr[i]);
            i++;
        }
        i0();
    }

    public void T0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public abstract int U(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException;

    public WritableTypeId U0(WritableTypeId writableTypeId) throws IOException {
        Object obj = writableTypeId.c;
        JsonToken jsonToken = writableTypeId.f;
        if (o()) {
            writableTypeId.g = false;
            T0(obj);
        } else {
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.g = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.e;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.e = inclusion;
            }
            int i = a.f7620a[inclusion.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    O0(writableTypeId.f7625a);
                    S0(writableTypeId.d, strValueOf);
                    return writableTypeId;
                }
                if (i != 4) {
                    L0();
                    Q0(strValueOf);
                } else {
                    N0();
                    r0(strValueOf);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            O0(writableTypeId.f7625a);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            L0();
        }
        return writableTypeId;
    }

    public WritableTypeId V0(WritableTypeId writableTypeId) throws IOException {
        JsonToken jsonToken = writableTypeId.f;
        if (jsonToken == JsonToken.START_OBJECT) {
            m0();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            i0();
        }
        if (writableTypeId.g) {
            int i = a.f7620a[writableTypeId.e.ordinal()];
            if (i == 1) {
                Object obj = writableTypeId.c;
                S0(writableTypeId.d, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i != 2 && i != 3) {
                if (i != 5) {
                    m0();
                } else {
                    i0();
                }
            }
        }
        return writableTypeId;
    }

    public int Z(InputStream inputStream, int i) throws IOException {
        return U(com.fasterxml.jackson.core.a.a(), inputStream, i);
    }

    public void a(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public final void b() {
        jpq.c();
    }

    public abstract void b0(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException;

    public final void c(int i, int i2, int i3) {
        if (i2 < 0 || i2 + i3 > i) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i)));
        }
    }

    public void c0(byte[] bArr) throws IOException {
        b0(com.fasterxml.jackson.core.a.a(), bArr, 0, bArr.length);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public void d(Object obj) throws IOException {
        if (obj == null) {
            s0();
            return;
        }
        if (obj instanceof String) {
            Q0((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                v0(number.intValue());
                return;
            }
            if (number instanceof Long) {
                w0(number.longValue());
                return;
            }
            if (number instanceof Double) {
                t0(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                u0(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                A0(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                A0(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                z0((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                y0((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                v0(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                w0(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            c0((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            f0(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            f0(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }

    public void d0(byte[] bArr, int i, int i2) throws IOException {
        b0(com.fasterxml.jackson.core.a.a(), bArr, i, i2);
    }

    public abstract void f0(boolean z) throws IOException;

    public abstract void flush() throws IOException;

    public void g0(Object obj) throws IOException {
        if (obj == null) {
            s0();
        } else {
            if (obj instanceof byte[]) {
                c0((byte[]) obj);
                return;
            }
            throw new JsonGenerationException("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    public abstract void i0() throws IOException;

    public boolean l() {
        return true;
    }

    public boolean m() {
        return false;
    }

    public abstract void m0() throws IOException;

    public boolean n() {
        return false;
    }

    public void n0(long j) throws IOException {
        r0(Long.toString(j));
    }

    public boolean o() {
        return false;
    }

    public abstract void o0(owl owlVar) throws IOException;

    public abstract JsonGenerator p(Feature feature);

    public abstract void r0(String str) throws IOException;

    public abstract int s();

    public abstract void s0() throws IOException;

    public abstract void t0(double d) throws IOException;

    public abstract void u0(float f) throws IOException;

    public abstract void v0(int i) throws IOException;

    public abstract void w0(long j) throws IOException;

    public abstract void x0(String str) throws IOException;

    public abstract fud y();

    public abstract void y0(BigDecimal bigDecimal) throws IOException;

    public abstract void z0(BigInteger bigInteger) throws IOException;
}
