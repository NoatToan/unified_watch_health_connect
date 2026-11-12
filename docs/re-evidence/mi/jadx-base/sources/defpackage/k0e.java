package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes5.dex */
public final class k0e extends GeneratedMessageLite<k0e, b> implements asf {
    private static final k0e DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile ukh<k0e> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23291a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23291a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23291a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23291a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23291a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23291a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23291a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23291a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<k0e, b> implements asf {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b t(OutputPrefixType outputPrefixType) {
            j();
            ((k0e) this.f9361b).L(outputPrefixType);
            return this;
        }

        public b u(String str) {
            j();
            ((k0e) this.f9361b).M(str);
            return this;
        }

        public b v(ByteString byteString) {
            j();
            ((k0e) this.f9361b).N(byteString);
            return this;
        }

        public b() {
            super(k0e.DEFAULT_INSTANCE);
        }
    }

    static {
        k0e k0eVar = new k0e();
        DEFAULT_INSTANCE = k0eVar;
        GeneratedMessageLite.A(k0e.class, k0eVar);
    }

    public static k0e G() {
        return DEFAULT_INSTANCE;
    }

    public static b K() {
        return DEFAULT_INSTANCE.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    public OutputPrefixType H() {
        OutputPrefixType outputPrefixTypeForNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
        return outputPrefixTypeForNumber == null ? OutputPrefixType.UNRECOGNIZED : outputPrefixTypeForNumber;
    }

    public String I() {
        return this.typeUrl_;
    }

    public ByteString J() {
        return this.value_;
    }

    public final void L(OutputPrefixType outputPrefixType) {
        this.outputPrefixType_ = outputPrefixType.getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f23291a[methodToInvoke.ordinal()]) {
            case 1:
                return new k0e();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<k0e> bVar = PARSER;
                if (bVar == null) {
                    synchronized (k0e.class) {
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
