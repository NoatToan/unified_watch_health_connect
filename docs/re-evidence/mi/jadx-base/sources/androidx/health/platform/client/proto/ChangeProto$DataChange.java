package androidx.health.platform.client.proto;

import defpackage.tkh;
import defpackage.zrf;

/* JADX INFO: loaded from: classes.dex */
public final class ChangeProto$DataChange extends GeneratedMessageLite<ChangeProto$DataChange, a> implements zrf {
    private static final ChangeProto$DataChange DEFAULT_INSTANCE;
    public static final int DELETE_UID_FIELD_NUMBER = 2;
    private static volatile tkh<ChangeProto$DataChange> PARSER = null;
    public static final int UPSERT_DATA_POINT_FIELD_NUMBER = 1;
    private int bitField0_;
    private int changeCase_ = 0;
    private Object change_;

    public enum ChangeCase {
        UPSERT_DATA_POINT(1),
        DELETE_UID(2),
        CHANGE_NOT_SET(0);

        private final int value;

        ChangeCase(int i) {
            this.value = i;
        }

        public static ChangeCase forNumber(int i) {
            if (i == 0) {
                return CHANGE_NOT_SET;
            }
            if (i == 1) {
                return UPSERT_DATA_POINT;
            }
            if (i != 2) {
                return null;
            }
            return DELETE_UID;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ChangeCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class a extends GeneratedMessageLite.a<ChangeProto$DataChange, a> implements zrf {
        public /* synthetic */ a(f fVar) {
            this();
        }

        public a() {
            super(ChangeProto$DataChange.DEFAULT_INSTANCE);
        }
    }

    static {
        ChangeProto$DataChange changeProto$DataChange = new ChangeProto$DataChange();
        DEFAULT_INSTANCE = changeProto$DataChange;
        GeneratedMessageLite.K(ChangeProto$DataChange.class, changeProto$DataChange);
    }

    public String O() {
        return this.changeCase_ == 2 ? (String) this.change_ : "";
    }

    public o Q() {
        return this.changeCase_ == 1 ? (o) this.change_ : o.m0();
    }

    public boolean R() {
        return this.changeCase_ == 2;
    }

    public boolean S() {
        return this.changeCase_ == 1;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        f fVar = null;
        switch (f.f2488a[methodToInvoke.ordinal()]) {
            case 1:
                return new ChangeProto$DataChange();
            case 2:
                return new a(fVar);
            case 3:
                return GeneratedMessageLite.F(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ျ\u0000", new Object[]{"change_", "changeCase_", "bitField0_", o.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                tkh<ChangeProto$DataChange> bVar = PARSER;
                if (bVar == null) {
                    synchronized (ChangeProto$DataChange.class) {
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
