package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class x extends j0<x, a> implements d1 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final x DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile l1<x> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int code_;
    private String message_ = "";
    private l0.d<o1> permission_ = s1.f7778d;

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        j0.r(x.class, xVar);
    }

    private x() {
    }

    public static void t(x xVar, int i14) {
        xVar.bitField0_ |= 1;
        xVar.code_ = i14;
    }

    public static void u(x xVar, String str) {
        xVar.getClass();
        str.getClass();
        xVar.bitField0_ |= 2;
        xVar.message_ = str;
    }

    public static a y() {
        return DEFAULT_INSTANCE.h();
    }

    public static x z(byte[] bArr) {
        return (x) j0.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.j0
    public final Object i(j0.f fVar) {
        l1 bVar;
        w wVar = null;
        switch (w.f7804a[fVar.ordinal()]) {
            case 1:
                return new x();
            case 2:
                return new a(wVar);
            case 3:
                return new t1(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"bitField0_", "code_", "message_", "permission_", o1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                l1<x> l1Var = PARSER;
                if (l1Var != null) {
                    return l1Var;
                }
                synchronized (x.class) {
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

    public final int v() {
        return this.code_;
    }

    public final String w() {
        return this.message_;
    }

    public final boolean x() {
        return (this.bitField0_ & 2) != 0;
    }

    public static final class a extends j0.a<x, a> implements d1 {
        private a() {
            super(x.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }
}
