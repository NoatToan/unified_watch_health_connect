package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;

/* JADX INFO: loaded from: classes5.dex */
public final class tv0 extends GeneratedMessageLite<tv0, b> implements asf {
    private static final tv0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile ukh<tv0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private wv0 params_;
    private int version_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35069a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f35069a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35069a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35069a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35069a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35069a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35069a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35069a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<tv0, b> implements asf {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b t(ByteString byteString) {
            j();
            ((tv0) this.f9361b).L(byteString);
            return this;
        }

        public b u(wv0 wv0Var) {
            j();
            ((tv0) this.f9361b).M(wv0Var);
            return this;
        }

        public b v(int i) {
            j();
            ((tv0) this.f9361b).N(i);
            return this;
        }

        public b() {
            super(tv0.DEFAULT_INSTANCE);
        }
    }

    static {
        tv0 tv0Var = new tv0();
        DEFAULT_INSTANCE = tv0Var;
        GeneratedMessageLite.A(tv0.class, tv0Var);
    }

    public static b J() {
        return DEFAULT_INSTANCE.i();
    }

    public static tv0 K(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        return (tv0) GeneratedMessageLite.v(DEFAULT_INSTANCE, byteString, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i) {
        this.version_ = i;
    }

    public ByteString G() {
        return this.keyValue_;
    }

    public wv0 H() {
        wv0 wv0Var = this.params_;
        return wv0Var == null ? wv0.H() : wv0Var;
    }

    public int I() {
        return this.version_;
    }

    public final void M(wv0 wv0Var) {
        wv0Var.getClass();
        this.params_ = wv0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f35069a[methodToInvoke.ordinal()]) {
            case 1:
                return new tv0();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<tv0> bVar = PARSER;
                if (bVar == null) {
                    synchronized (tv0.class) {
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
