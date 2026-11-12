package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends GeneratedMessageLite<m1, a> implements zrf {
    private static final m1 DEFAULT_INSTANCE;
    public static final int EXERCISEROUTE_FIELD_NUMBER = 2;
    private static volatile tkh<m1> PARSER = null;
    public static final int SESSIONUID_FIELD_NUMBER = 1;
    private int bitField0_;
    private o exerciseRoute_;
    private String sessionUid_ = "";

    public static final class a extends GeneratedMessageLite.a<m1, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a y(o oVar) {
            n();
            ((m1) this.f2461b).V(oVar);
            return this;
        }

        public a z(String str) {
            n();
            ((m1) this.f2461b).W(str);
            return this;
        }

        public a() {
            super(m1.DEFAULT_INSTANCE);
        }
    }

    static {
        m1 m1Var = new m1();
        DEFAULT_INSTANCE = m1Var;
        GeneratedMessageLite.K(m1.class, m1Var);
    }

    public static a T() {
        return DEFAULT_INSTANCE.p();
    }

    public static m1 U(byte[] bArr) throws InvalidProtocolBufferException {
        return (m1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public o R() {
        o oVar = this.exerciseRoute_;
        return oVar == null ? o.m0() : oVar;
    }

    public String S() {
        return this.sessionUid_;
    }

    public final void V(o oVar) {
        oVar.getClass();
        this.exerciseRoute_ = oVar;
        this.bitField0_ |= 2;
    }

    public final void W(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionUid_ = str;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new m1();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "sessionUid_", "exerciseRoute_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<m1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (m1.class) {
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
