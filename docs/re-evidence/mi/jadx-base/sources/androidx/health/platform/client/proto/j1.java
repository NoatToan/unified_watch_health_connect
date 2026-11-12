package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends GeneratedMessageLite<j1, a> implements zrf {
    public static final int CALLING_PACKAGE_FIELD_NUMBER = 1;
    private static final j1 DEFAULT_INSTANCE;
    public static final int IS_IN_FOREGROUND_FIELD_NUMBER = 4;
    private static volatile tkh<j1> PARSER = null;
    public static final int PERMISSION_TOKEN_FIELD_NUMBER = 3;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isInForeground_;
    private int sdkVersion_;
    private String callingPackage_ = "";
    private String permissionToken_ = "";

    public static final class a extends GeneratedMessageLite.a<j1, a> implements zrf {
        public /* synthetic */ a(x0 x0Var) {
            this();
        }

        public a A(String str) {
            n();
            ((j1) this.f2461b).b0(str);
            return this;
        }

        public a B(int i) {
            n();
            ((j1) this.f2461b).c0(i);
            return this;
        }

        public a y(String str) {
            n();
            ((j1) this.f2461b).Z(str);
            return this;
        }

        public a z(boolean z) {
            n();
            ((j1) this.f2461b).a0(z);
            return this;
        }

        public a() {
            super(j1.DEFAULT_INSTANCE);
        }
    }

    static {
        j1 j1Var = new j1();
        DEFAULT_INSTANCE = j1Var;
        GeneratedMessageLite.K(j1.class, j1Var);
    }

    public static a X() {
        return DEFAULT_INSTANCE.p();
    }

    public static j1 Y(byte[] bArr) throws InvalidProtocolBufferException {
        return (j1) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public String T() {
        return this.callingPackage_;
    }

    public boolean U() {
        return this.isInForeground_;
    }

    public String V() {
        return this.permissionToken_;
    }

    public int W() {
        return this.sdkVersion_;
    }

    public final void Z(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.callingPackage_ = str;
    }

    public final void a0(boolean z) {
        this.bitField0_ |= 8;
        this.isInForeground_ = z;
    }

    public final void b0(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.permissionToken_ = str;
    }

    public final void c0(int i) {
        this.bitField0_ |= 2;
        this.sdkVersion_ = i;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.f2548a[methodToInvoke.ordinal()]) {
            case 1:
                return new j1();
            case 2:
                return new a(x0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "callingPackage_", "sdkVersion_", "permissionToken_", "isInForeground_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<j1> bVar = PARSER;
                if (bVar == null) {
                    synchronized (j1.class) {
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
