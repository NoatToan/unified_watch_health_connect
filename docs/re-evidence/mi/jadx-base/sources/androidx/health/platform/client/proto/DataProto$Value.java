package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class DataProto$Value extends GeneratedMessageLite<DataProto$Value, a> implements zrf {
    public static final int BOOLEAN_VAL_FIELD_NUMBER = 5;
    private static final DataProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_VAL_FIELD_NUMBER = 2;
    public static final int ENUM_VAL_FIELD_NUMBER = 4;
    public static final int LONG_VAL_FIELD_NUMBER = 1;
    private static volatile tkh<DataProto$Value> PARSER = null;
    public static final int STRING_VAL_FIELD_NUMBER = 3;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public enum ValueCase {
        LONG_VAL(1),
        DOUBLE_VAL(2),
        STRING_VAL(3),
        ENUM_VAL(4),
        BOOLEAN_VAL(5),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i) {
            this.value = i;
        }

        public static ValueCase forNumber(int i) {
            if (i == 0) {
                return VALUE_NOT_SET;
            }
            if (i == 1) {
                return LONG_VAL;
            }
            if (i == 2) {
                return DOUBLE_VAL;
            }
            if (i == 3) {
                return STRING_VAL;
            }
            if (i == 4) {
                return ENUM_VAL;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN_VAL;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ValueCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class a extends GeneratedMessageLite.a<DataProto$Value, a> implements zrf {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a A(String str) {
            n();
            ((DataProto$Value) this.f2461b).d0(str);
            return this;
        }

        public a B(long j) {
            n();
            ((DataProto$Value) this.f2461b).e0(j);
            return this;
        }

        public a C(String str) {
            n();
            ((DataProto$Value) this.f2461b).f0(str);
            return this;
        }

        public a y(boolean z) {
            n();
            ((DataProto$Value) this.f2461b).b0(z);
            return this;
        }

        public a z(double d) {
            n();
            ((DataProto$Value) this.f2461b).c0(d);
            return this;
        }

        public a() {
            super(DataProto$Value.DEFAULT_INSTANCE);
        }
    }

    static {
        DataProto$Value dataProto$Value = new DataProto$Value();
        DEFAULT_INSTANCE = dataProto$Value;
        GeneratedMessageLite.K(DataProto$Value.class, dataProto$Value);
    }

    public static DataProto$Value V() {
        return DEFAULT_INSTANCE;
    }

    public static a a0() {
        return DEFAULT_INSTANCE.p();
    }

    public boolean U() {
        if (this.valueCase_ == 5) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double W() {
        if (this.valueCase_ == 2) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public String X() {
        return this.valueCase_ == 4 ? (String) this.value_ : "";
    }

    public long Y() {
        if (this.valueCase_ == 1) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String Z() {
        return this.valueCase_ == 3 ? (String) this.value_ : "";
    }

    public final void b0(boolean z) {
        this.valueCase_ = 5;
        this.value_ = Boolean.valueOf(z);
    }

    public final void c0(double d) {
        this.valueCase_ = 2;
        this.value_ = Double.valueOf(d);
    }

    public final void d0(String str) {
        str.getClass();
        this.valueCase_ = 4;
        this.value_ = str;
    }

    public final void e0(long j) {
        this.valueCase_ = 1;
        this.value_ = Long.valueOf(j);
    }

    public final void f0(String str) {
        str.getClass();
        this.valueCase_ = 3;
        this.value_ = str;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        k kVar = null;
        switch (k.f2510a[methodToInvoke.ordinal()]) {
            case 1:
                return new DataProto$Value();
            case 2:
                return new a(kVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဵ\u0000\u0002ဳ\u0000\u0003ျ\u0000\u0004ျ\u0000\u0005်\u0000", new Object[]{"value_", "valueCase_", "bitField0_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<DataProto$Value> bVar = PARSER;
                if (bVar == null) {
                    synchronized (DataProto$Value.class) {
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
