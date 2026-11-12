package defpackage;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes5.dex */
public final class wv0 extends GeneratedMessageLite<wv0, b> implements asf {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final wv0 DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile ukh<wv0> PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38388a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f38388a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38388a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38388a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38388a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38388a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38388a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38388a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<wv0, b> implements asf {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b t(int i) {
            j();
            ((wv0) this.f9361b).L(i);
            return this;
        }

        public b u(int i) {
            j();
            ((wv0) this.f9361b).M(i);
            return this;
        }

        public b v(HashType hashType) {
            j();
            ((wv0) this.f9361b).N(hashType);
            return this;
        }

        public b() {
            super(wv0.DEFAULT_INSTANCE);
        }
    }

    static {
        wv0 wv0Var = new wv0();
        DEFAULT_INSTANCE = wv0Var;
        GeneratedMessageLite.A(wv0.class, wv0Var);
    }

    public static wv0 H() {
        return DEFAULT_INSTANCE;
    }

    public static b K() {
        return DEFAULT_INSTANCE.i();
    }

    public int G() {
        return this.ciphertextSegmentSize_;
    }

    public int I() {
        return this.derivedKeySize_;
    }

    public HashType J() {
        HashType hashTypeForNumber = HashType.forNumber(this.hkdfHashType_);
        return hashTypeForNumber == null ? HashType.UNRECOGNIZED : hashTypeForNumber;
    }

    public final void L(int i) {
        this.ciphertextSegmentSize_ = i;
    }

    public final void M(int i) {
        this.derivedKeySize_ = i;
    }

    public final void N(HashType hashType) {
        this.hkdfHashType_ = hashType.getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f38388a[methodToInvoke.ordinal()]) {
            case 1:
                return new wv0();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<wv0> bVar = PARSER;
                if (bVar == null) {
                    synchronized (wv0.class) {
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
