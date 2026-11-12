package defpackage;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.s;

/* JADX INFO: loaded from: classes5.dex */
public final class j1e extends GeneratedMessageLite<j1e, b> implements asf {
    private static final j1e DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile ukh<j1e> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private s.i<c> keyInfo_ = GeneratedMessageLite.m();
    private int primaryKeyId_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22326a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22326a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22326a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22326a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22326a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22326a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22326a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22326a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<j1e, b> implements asf {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b t(c cVar) {
            j();
            ((j1e) this.f9361b).F(cVar);
            return this;
        }

        public b u(int i) {
            j();
            ((j1e) this.f9361b).J(i);
            return this;
        }

        public b() {
            super(j1e.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends GeneratedMessageLite<c, a> implements asf {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile ukh<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        public static final class a extends GeneratedMessageLite.a<c, a> implements asf {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a t(int i) {
                j();
                ((c) this.f9361b).J(i);
                return this;
            }

            public a u(OutputPrefixType outputPrefixType) {
                j();
                ((c) this.f9361b).K(outputPrefixType);
                return this;
            }

            public a v(KeyStatusType keyStatusType) {
                j();
                ((c) this.f9361b).L(keyStatusType);
                return this;
            }

            public a w(String str) {
                j();
                ((c) this.f9361b).M(str);
                return this;
            }

            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.A(c.class, cVar);
        }

        public static a I() {
            return DEFAULT_INSTANCE.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J(int i) {
            this.keyId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K(OutputPrefixType outputPrefixType) {
            this.outputPrefixType_ = outputPrefixType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L(KeyStatusType keyStatusType) {
            this.status_ = keyStatusType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int H() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f22326a[methodToInvoke.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    ukh<c> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (c.class) {
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

    static {
        j1e j1eVar = new j1e();
        DEFAULT_INSTANCE = j1eVar;
        GeneratedMessageLite.A(j1e.class, j1eVar);
    }

    public static b I() {
        return DEFAULT_INSTANCE.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(int i) {
        this.primaryKeyId_ = i;
    }

    public final void F(c cVar) {
        cVar.getClass();
        G();
        this.keyInfo_.add(cVar);
    }

    public final void G() {
        if (this.keyInfo_.c()) {
            return;
        }
        this.keyInfo_ = GeneratedMessageLite.s(this.keyInfo_);
    }

    public c H(int i) {
        return this.keyInfo_.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f22326a[methodToInvoke.ordinal()]) {
            case 1:
                return new j1e();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<j1e> bVar = PARSER;
                if (bVar == null) {
                    synchronized (j1e.class) {
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
