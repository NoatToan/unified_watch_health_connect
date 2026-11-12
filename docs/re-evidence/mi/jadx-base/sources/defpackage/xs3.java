package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;

/* JADX INFO: loaded from: classes5.dex */
public final class xs3 extends GeneratedMessageLite<xs3, b> implements asf {
    private static final xs3 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile ukh<xs3> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private int version_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39404a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f39404a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39404a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39404a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39404a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39404a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39404a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39404a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<xs3, b> implements asf {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b t(ByteString byteString) {
            j();
            ((xs3) this.f9361b).J(byteString);
            return this;
        }

        public b u(int i) {
            j();
            ((xs3) this.f9361b).K(i);
            return this;
        }

        public b() {
            super(xs3.DEFAULT_INSTANCE);
        }
    }

    static {
        xs3 xs3Var = new xs3();
        DEFAULT_INSTANCE = xs3Var;
        GeneratedMessageLite.A(xs3.class, xs3Var);
    }

    public static b H() {
        return DEFAULT_INSTANCE.i();
    }

    public static xs3 I(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        return (xs3) GeneratedMessageLite.v(DEFAULT_INSTANCE, byteString, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(int i) {
        this.version_ = i;
    }

    public ByteString F() {
        return this.keyValue_;
    }

    public int G() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f39404a[methodToInvoke.ordinal()]) {
            case 1:
                return new xs3();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<xs3> bVar = PARSER;
                if (bVar == null) {
                    synchronized (xs3.class) {
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
