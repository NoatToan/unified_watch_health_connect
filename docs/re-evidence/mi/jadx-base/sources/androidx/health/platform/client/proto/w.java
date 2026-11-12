package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class w extends GeneratedMessageLite<w, a> implements zrf {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final w DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile tkh<w> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int code_;
    private String message_ = "";
    private f0.i<u0> permission_ = GeneratedMessageLite.t();

    public static final class a extends GeneratedMessageLite.a<w, a> implements zrf {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a y(int i) {
            n();
            ((w) this.f2461b).W(i);
            return this;
        }

        public a z(String str) {
            n();
            ((w) this.f2461b).X(str);
            return this;
        }

        public a() {
            super(w.DEFAULT_INSTANCE);
        }
    }

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        GeneratedMessageLite.K(w.class, wVar);
    }

    public static a U() {
        return DEFAULT_INSTANCE.p();
    }

    public static w V(byte[] bArr) throws InvalidProtocolBufferException {
        return (w) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public int R() {
        return this.code_;
    }

    public String S() {
        return this.message_;
    }

    public boolean T() {
        return (this.bitField0_ & 2) != 0;
    }

    public final void W(int i) {
        this.bitField0_ |= 1;
        this.code_ = i;
    }

    public final void X(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.message_ = str;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        v vVar = null;
        switch (v.f2537a[methodToInvoke.ordinal()]) {
            case 1:
                return new w();
            case 2:
                return new a(vVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"bitField0_", "code_", "message_", "permission_", u0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<w> bVar = PARSER;
                if (bVar == null) {
                    synchronized (w.class) {
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
