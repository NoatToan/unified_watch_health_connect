package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends j0<h2, a> implements d1 {
    public static final int CALLING_PACKAGE_FIELD_NUMBER = 1;
    private static final h2 DEFAULT_INSTANCE;
    public static final int IS_IN_FOREGROUND_FIELD_NUMBER = 4;
    private static volatile l1<h2> PARSER = null;
    public static final int PERMISSION_TOKEN_FIELD_NUMBER = 3;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isInForeground_;
    private int sdkVersion_;
    private String callingPackage_ = "";
    private String permissionToken_ = "";

    static {
        h2 h2Var = new h2();
        DEFAULT_INSTANCE = h2Var;
        j0.r(h2.class, h2Var);
    }

    private h2() {
    }

    public static a B() {
        return DEFAULT_INSTANCE.h();
    }

    public static h2 C(byte[] bArr) {
        return (h2) j0.q(DEFAULT_INSTANCE, bArr);
    }

    public static void t(h2 h2Var, String str) {
        h2Var.getClass();
        str.getClass();
        h2Var.bitField0_ |= 1;
        h2Var.callingPackage_ = str;
    }

    public static void u(h2 h2Var, int i14) {
        h2Var.bitField0_ |= 2;
        h2Var.sdkVersion_ = i14;
    }

    public static void v(h2 h2Var, String str) {
        h2Var.getClass();
        str.getClass();
        h2Var.bitField0_ |= 4;
        h2Var.permissionToken_ = str;
    }

    public static void w(h2 h2Var, boolean z14) {
        h2Var.bitField0_ |= 8;
        h2Var.isInForeground_ = z14;
    }

    public final int A() {
        return this.sdkVersion_;
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        v1 v1Var = null;
        switch (v1.f7803a[fVar.ordinal()]) {
            case 1:
                return new h2();
            case 2:
                return new a(v1Var);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "callingPackage_", "sdkVersion_", "permissionToken_", "isInForeground_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<h2> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (h2.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new j0.b(DEFAULT_INSTANCE);
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

    public final String x() {
        return this.callingPackage_;
    }

    public final boolean y() {
        return this.isInForeground_;
    }

    public final String z() {
        return this.permissionToken_;
    }

    public static final class a extends j0.a<h2, a> implements d1 {
        private a() {
            super(h2.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(v1 v1Var) {
            this();
        }
    }
}
