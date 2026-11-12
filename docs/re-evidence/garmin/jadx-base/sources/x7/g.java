package x7;

import androidx.datastore.preferences.protobuf.e1;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends x<g, a> implements r0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final g DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile z0<g> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);

        b(int i14) {
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        x.n(g.class, gVar);
    }

    private g() {
    }

    public static a H() {
        g gVar = DEFAULT_INSTANCE;
        gVar.getClass();
        return (a) ((x.a) gVar.f(x.f.NEW_BUILDER));
    }

    public static void o(g gVar, long j8) {
        gVar.valueCase_ = 4;
        gVar.value_ = Long.valueOf(j8);
    }

    public static void p(g gVar, String str) {
        gVar.getClass();
        gVar.valueCase_ = 5;
        gVar.value_ = str;
    }

    public static void q(g gVar, f fVar) {
        gVar.getClass();
        gVar.value_ = fVar;
        gVar.valueCase_ = 6;
    }

    public static void r(g gVar, double d14) {
        gVar.valueCase_ = 7;
        gVar.value_ = Double.valueOf(d14);
    }

    public static void s(g gVar, androidx.datastore.preferences.protobuf.h.C0094h c0094h) {
        gVar.getClass();
        gVar.valueCase_ = 8;
        gVar.value_ = c0094h;
    }

    public static void u(g gVar, boolean z14) {
        gVar.valueCase_ = 1;
        gVar.value_ = Boolean.valueOf(z14);
    }

    public static void v(g gVar, float f14) {
        gVar.valueCase_ = 2;
        gVar.value_ = Float.valueOf(f14);
    }

    public static void w(g gVar, int i14) {
        gVar.valueCase_ = 3;
        gVar.value_ = Integer.valueOf(i14);
    }

    public static g z() {
        return DEFAULT_INSTANCE;
    }

    public final double A() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float B() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int C() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long D() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String E() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final f F() {
        return this.valueCase_ == 6 ? (f) this.value_ : f.q();
    }

    public final b G() {
        switch (this.valueCase_) {
            case 0:
                return b.VALUE_NOT_SET;
            case 1:
                return b.BOOLEAN;
            case 2:
                return b.FLOAT;
            case 3:
                return b.INTEGER;
            case 4:
                return b.LONG;
            case 5:
                return b.STRING;
            case 6:
                return b.STRING_SET;
            case 7:
                return b.DOUBLE;
            case 8:
                return b.BYTES;
            default:
                b bVar = b.BOOLEAN;
                return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final Object f(x.f fVar) {
        z0 bVar;
        d dVar = null;
        switch (d.f189361a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(dVar);
            case 3:
                return new e1(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", f.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<g> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (g.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new x.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                com.google.protobuf.a.m();
                return null;
        }
    }

    public final boolean x() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final androidx.datastore.preferences.protobuf.h y() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.h) this.value_ : androidx.datastore.preferences.protobuf.h.f6707b;
    }

    public static final class a extends x.a<g, a> implements r0 {
        private a() {
            super(g.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(d dVar) {
            this();
        }
    }
}
