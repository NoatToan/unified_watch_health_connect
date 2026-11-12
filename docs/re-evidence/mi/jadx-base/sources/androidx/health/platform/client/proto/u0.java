package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends GeneratedMessageLite<u0, a> implements zrf {
    public static final int ACCESS_TYPE_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final u0 DEFAULT_INSTANCE;
    private static volatile tkh<u0> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 3;
    private int accessType_;
    private int bitField0_;
    private q dataType_;
    private String permission_ = "";

    public static final class a extends GeneratedMessageLite.a<u0, a> implements zrf {
        public /* synthetic */ a(t0 t0Var) {
            this();
        }

        public a A(String str) {
            n();
            ((u0) this.f2461b).Z(str);
            return this;
        }

        public a y(PermissionProto$AccessType permissionProto$AccessType) {
            n();
            ((u0) this.f2461b).X(permissionProto$AccessType);
            return this;
        }

        public a z(q qVar) {
            n();
            ((u0) this.f2461b).Y(qVar);
            return this;
        }

        public a() {
            super(u0.DEFAULT_INSTANCE);
        }
    }

    static {
        u0 u0Var = new u0();
        DEFAULT_INSTANCE = u0Var;
        GeneratedMessageLite.K(u0.class, u0Var);
    }

    public static a V() {
        return DEFAULT_INSTANCE.p();
    }

    public static u0 W(byte[] bArr) throws InvalidProtocolBufferException {
        return (u0) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(q qVar) {
        qVar.getClass();
        this.dataType_ = qVar;
        this.bitField0_ |= 1;
    }

    public PermissionProto$AccessType S() {
        PermissionProto$AccessType permissionProto$AccessTypeForNumber = PermissionProto$AccessType.forNumber(this.accessType_);
        return permissionProto$AccessTypeForNumber == null ? PermissionProto$AccessType.ACCESS_TYPE_UNKNOWN : permissionProto$AccessTypeForNumber;
    }

    public q T() {
        q qVar = this.dataType_;
        return qVar == null ? q.Q() : qVar;
    }

    public String U() {
        return this.permission_;
    }

    public final void X(PermissionProto$AccessType permissionProto$AccessType) {
        this.accessType_ = permissionProto$AccessType.getNumber();
        this.bitField0_ |= 2;
    }

    public final void Z(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.permission_ = str;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        t0 t0Var = null;
        switch (t0.f2535a[methodToInvoke.ordinal()]) {
            case 1:
                return new u0();
            case 2:
                return new a(t0Var);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "dataType_", "accessType_", PermissionProto$AccessType.internalGetVerifier(), "permission_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<u0> bVar = PARSER;
                if (bVar == null) {
                    synchronized (u0.class) {
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
