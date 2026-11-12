package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;

/* JADX INFO: loaded from: classes5.dex */
public final class fv0 extends GeneratedMessageLite<fv0, b> implements asf {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final fv0 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile ukh<fv0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private jv0 aesCtrKey_;
    private bac hmacKey_;
    private int version_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18274a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f18274a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18274a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18274a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18274a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18274a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18274a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18274a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<fv0, b> implements asf {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b t(jv0 jv0Var) {
            j();
            ((fv0) this.f9361b).L(jv0Var);
            return this;
        }

        public b u(bac bacVar) {
            j();
            ((fv0) this.f9361b).M(bacVar);
            return this;
        }

        public b v(int i) {
            j();
            ((fv0) this.f9361b).N(i);
            return this;
        }

        public b() {
            super(fv0.DEFAULT_INSTANCE);
        }
    }

    static {
        fv0 fv0Var = new fv0();
        DEFAULT_INSTANCE = fv0Var;
        GeneratedMessageLite.A(fv0.class, fv0Var);
    }

    public static b J() {
        return DEFAULT_INSTANCE.i();
    }

    public static fv0 K(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        return (fv0) GeneratedMessageLite.v(DEFAULT_INSTANCE, byteString, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i) {
        this.version_ = i;
    }

    public jv0 G() {
        jv0 jv0Var = this.aesCtrKey_;
        return jv0Var == null ? jv0.G() : jv0Var;
    }

    public bac H() {
        bac bacVar = this.hmacKey_;
        return bacVar == null ? bac.G() : bacVar;
    }

    public int I() {
        return this.version_;
    }

    public final void L(jv0 jv0Var) {
        jv0Var.getClass();
        this.aesCtrKey_ = jv0Var;
    }

    public final void M(bac bacVar) {
        bacVar.getClass();
        this.hmacKey_ = bacVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f18274a[methodToInvoke.ordinal()]) {
            case 1:
                return new fv0();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<fv0> bVar = PARSER;
                if (bVar == null) {
                    synchronized (fv0.class) {
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
