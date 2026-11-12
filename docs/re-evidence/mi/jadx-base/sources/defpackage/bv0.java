package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;

/* JADX INFO: loaded from: classes5.dex */
public final class bv0 extends GeneratedMessageLite<bv0, b> implements asf {
    private static final bv0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile ukh<bv0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private ev0 params_;
    private int version_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4629a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f4629a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4629a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4629a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4629a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4629a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4629a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4629a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<bv0, b> implements asf {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b t(ByteString byteString) {
            j();
            ((bv0) this.f9361b).L(byteString);
            return this;
        }

        public b u(ev0 ev0Var) {
            j();
            ((bv0) this.f9361b).M(ev0Var);
            return this;
        }

        public b v(int i) {
            j();
            ((bv0) this.f9361b).N(i);
            return this;
        }

        public b() {
            super(bv0.DEFAULT_INSTANCE);
        }
    }

    static {
        bv0 bv0Var = new bv0();
        DEFAULT_INSTANCE = bv0Var;
        GeneratedMessageLite.A(bv0.class, bv0Var);
    }

    public static b J() {
        return DEFAULT_INSTANCE.i();
    }

    public static bv0 K(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        return (bv0) GeneratedMessageLite.v(DEFAULT_INSTANCE, byteString, lVar);
    }

    public ByteString G() {
        return this.keyValue_;
    }

    public ev0 H() {
        ev0 ev0Var = this.params_;
        return ev0Var == null ? ev0.D() : ev0Var;
    }

    public int I() {
        return this.version_;
    }

    public final void L(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    public final void M(ev0 ev0Var) {
        ev0Var.getClass();
        this.params_ = ev0Var;
    }

    public final void N(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f4629a[methodToInvoke.ordinal()]) {
            case 1:
                return new bv0();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<bv0> bVar = PARSER;
                if (bVar == null) {
                    synchronized (bv0.class) {
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
