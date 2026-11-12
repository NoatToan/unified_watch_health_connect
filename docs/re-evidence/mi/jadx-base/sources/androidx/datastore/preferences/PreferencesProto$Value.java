package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import defpackage.csf;
import defpackage.h7i;
import defpackage.ykh;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesProto$Value extends GeneratedMessageLite<PreferencesProto$Value, a> implements csf {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final PreferencesProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile ykh<PreferencesProto$Value> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public enum ValueCase {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i) {
            this.value = i;
        }

        public static ValueCase forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ValueCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class a extends GeneratedMessageLite.a<PreferencesProto$Value, a> implements csf {
        public /* synthetic */ a(h7i h7iVar) {
            this();
        }

        public a A(androidx.datastore.preferences.a.C0029a c0029a) {
            l();
            ((PreferencesProto$Value) this.f2174b).a0(c0029a);
            return this;
        }

        public a u(boolean z) {
            l();
            ((PreferencesProto$Value) this.f2174b).U(z);
            return this;
        }

        public a v(double d) {
            l();
            ((PreferencesProto$Value) this.f2174b).V(d);
            return this;
        }

        public a w(float f) {
            l();
            ((PreferencesProto$Value) this.f2174b).W(f);
            return this;
        }

        public a x(int i) {
            l();
            ((PreferencesProto$Value) this.f2174b).X(i);
            return this;
        }

        public a y(long j) {
            l();
            ((PreferencesProto$Value) this.f2174b).Y(j);
            return this;
        }

        public a z(String str) {
            l();
            ((PreferencesProto$Value) this.f2174b).Z(str);
            return this;
        }

        public a() {
            super(PreferencesProto$Value.DEFAULT_INSTANCE);
        }
    }

    static {
        PreferencesProto$Value preferencesProto$Value = new PreferencesProto$Value();
        DEFAULT_INSTANCE = preferencesProto$Value;
        GeneratedMessageLite.A(PreferencesProto$Value.class, preferencesProto$Value);
    }

    public static PreferencesProto$Value L() {
        return DEFAULT_INSTANCE;
    }

    public static a T() {
        return DEFAULT_INSTANCE.k();
    }

    public boolean K() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double M() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float N() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int O() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long P() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String Q() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public androidx.datastore.preferences.a R() {
        return this.valueCase_ == 6 ? (androidx.datastore.preferences.a) this.value_ : androidx.datastore.preferences.a.G();
    }

    public ValueCase S() {
        return ValueCase.forNumber(this.valueCase_);
    }

    public final void U(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final void V(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void W(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    public final void X(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void Y(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void Z(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void a0(androidx.datastore.preferences.a.C0029a c0029a) {
        this.value_ = c0029a.build();
        this.valueCase_ = 6;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        h7i h7iVar = null;
        switch (h7i.f19778a[methodToInvoke.ordinal()]) {
            case 1:
                return new PreferencesProto$Value();
            case 2:
                return new a(h7iVar);
            case 3:
                return GeneratedMessageLite.x(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", androidx.datastore.preferences.a.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ykh<PreferencesProto$Value> bVar = PARSER;
                if (bVar == null) {
                    synchronized (PreferencesProto$Value.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
