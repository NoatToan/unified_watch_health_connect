package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;

/* JADX INFO: loaded from: classes5.dex */
public final class t1e extends GeneratedMessageLite<t1e, b> implements asf {
    private static final t1e DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile ukh<t1e> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private u1e params_;
    private int version_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34201a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f34201a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34201a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34201a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34201a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34201a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34201a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34201a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<t1e, b> implements asf {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b t(u1e u1eVar) {
            j();
            ((t1e) this.f9361b).J(u1eVar);
            return this;
        }

        public b u(int i) {
            j();
            ((t1e) this.f9361b).K(i);
            return this;
        }

        public b() {
            super(t1e.DEFAULT_INSTANCE);
        }
    }

    static {
        t1e t1eVar = new t1e();
        DEFAULT_INSTANCE = t1eVar;
        GeneratedMessageLite.A(t1e.class, t1eVar);
    }

    public static b H() {
        return DEFAULT_INSTANCE.i();
    }

    public static t1e I(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        return (t1e) GeneratedMessageLite.v(DEFAULT_INSTANCE, byteString, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(int i) {
        this.version_ = i;
    }

    public u1e F() {
        u1e u1eVar = this.params_;
        return u1eVar == null ? u1e.D() : u1eVar;
    }

    public int G() {
        return this.version_;
    }

    public final void J(u1e u1eVar) {
        u1eVar.getClass();
        this.params_ = u1eVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f34201a[methodToInvoke.ordinal()]) {
            case 1:
                return new t1e();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<t1e> bVar = PARSER;
                if (bVar == null) {
                    synchronized (t1e.class) {
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
