package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;

/* JADX INFO: loaded from: classes5.dex */
public final class uv0 extends GeneratedMessageLite<uv0, b> implements asf {
    private static final uv0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile ukh<uv0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private wv0 params_;
    private int version_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36175a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f36175a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36175a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36175a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36175a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36175a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36175a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36175a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<uv0, b> implements asf {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b t(int i) {
            j();
            ((uv0) this.f9361b).J(i);
            return this;
        }

        public b u(wv0 wv0Var) {
            j();
            ((uv0) this.f9361b).K(wv0Var);
            return this;
        }

        public b() {
            super(uv0.DEFAULT_INSTANCE);
        }
    }

    static {
        uv0 uv0Var = new uv0();
        DEFAULT_INSTANCE = uv0Var;
        GeneratedMessageLite.A(uv0.class, uv0Var);
    }

    public static b H() {
        return DEFAULT_INSTANCE.i();
    }

    public static uv0 I(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        return (uv0) GeneratedMessageLite.v(DEFAULT_INSTANCE, byteString, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(wv0 wv0Var) {
        wv0Var.getClass();
        this.params_ = wv0Var;
    }

    public int F() {
        return this.keySize_;
    }

    public wv0 G() {
        wv0 wv0Var = this.params_;
        return wv0Var == null ? wv0.H() : wv0Var;
    }

    public final void J(int i) {
        this.keySize_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f36175a[methodToInvoke.ordinal()]) {
            case 1:
                return new uv0();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<uv0> bVar = PARSER;
                if (bVar == null) {
                    synchronized (uv0.class) {
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
