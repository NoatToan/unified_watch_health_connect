package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends GeneratedMessageLite<a2, a> implements zrf {
    private static final a2 DEFAULT_INSTANCE;
    public static final int END_LOCAL_DATE_TIME_FIELD_NUMBER = 4;
    public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
    private static volatile tkh<a2> PARSER = null;
    public static final int START_LOCAL_DATE_TIME_FIELD_NUMBER = 3;
    public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long endTimeEpochMs_;
    private long startTimeEpochMs_;
    private String startLocalDateTime_ = "";
    private String endLocalDateTime_ = "";

    public static final class a extends GeneratedMessageLite.a<a2, a> implements zrf {
        public /* synthetic */ a(z1 z1Var) {
            this();
        }

        public a A(String str) {
            n();
            ((a2) this.f2461b).W(str);
            return this;
        }

        public a B(long j) {
            n();
            ((a2) this.f2461b).X(j);
            return this;
        }

        public a y(String str) {
            n();
            ((a2) this.f2461b).U(str);
            return this;
        }

        public a z(long j) {
            n();
            ((a2) this.f2461b).V(j);
            return this;
        }

        public a() {
            super(a2.DEFAULT_INSTANCE);
        }
    }

    static {
        a2 a2Var = new a2();
        DEFAULT_INSTANCE = a2Var;
        GeneratedMessageLite.K(a2.class, a2Var);
    }

    public static a T() {
        return DEFAULT_INSTANCE.p();
    }

    public final void U(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.endLocalDateTime_ = str;
    }

    public final void V(long j) {
        this.bitField0_ |= 2;
        this.endTimeEpochMs_ = j;
    }

    public final void W(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.startLocalDateTime_ = str;
    }

    public final void X(long j) {
        this.bitField0_ |= 1;
        this.startTimeEpochMs_ = j;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        z1 z1Var = null;
        switch (z1.f2567a[methodToInvoke.ordinal()]) {
            case 1:
                return new a2();
            case 2:
                return new a(z1Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "startLocalDateTime_", "endLocalDateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<a2> bVar = PARSER;
                if (bVar == null) {
                    synchronized (a2.class) {
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
