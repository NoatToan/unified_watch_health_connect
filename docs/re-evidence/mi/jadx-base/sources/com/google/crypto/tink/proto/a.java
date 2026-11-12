package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.s;
import defpackage.asf;
import defpackage.ukh;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends GeneratedMessageLite<a, b> implements asf {
    private static final a DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile ukh<a> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private s.i<c> key_ = GeneratedMessageLite.m();
    private int primaryKeyId_;

    /* JADX INFO: renamed from: com.google.crypto.tink.proto.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0252a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9345a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f9345a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9345a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9345a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9345a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9345a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9345a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9345a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<a, b> implements asf {
        public /* synthetic */ b(C0252a c0252a) {
            this();
        }

        public b t(c cVar) {
            j();
            ((a) this.f9361b).F(cVar);
            return this;
        }

        public c u(int i) {
            return ((a) this.f9361b).H(i);
        }

        public int v() {
            return ((a) this.f9361b).I();
        }

        public List<c> w() {
            return Collections.unmodifiableList(((a) this.f9361b).J());
        }

        public b x(int i) {
            j();
            ((a) this.f9361b).N(i);
            return this;
        }

        public b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends GeneratedMessageLite<c, C0253a> implements asf {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile ukh<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* JADX INFO: renamed from: com.google.crypto.tink.proto.a$c$a, reason: collision with other inner class name */
        public static final class C0253a extends GeneratedMessageLite.a<c, C0253a> implements asf {
            public /* synthetic */ C0253a(C0252a c0252a) {
                this();
            }

            public C0253a t(KeyData keyData) {
                j();
                ((c) this.f9361b).N(keyData);
                return this;
            }

            public C0253a u(int i) {
                j();
                ((c) this.f9361b).O(i);
                return this;
            }

            public C0253a v(OutputPrefixType outputPrefixType) {
                j();
                ((c) this.f9361b).P(outputPrefixType);
                return this;
            }

            public C0253a w(KeyStatusType keyStatusType) {
                j();
                ((c) this.f9361b).Q(keyStatusType);
                return this;
            }

            public C0253a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.A(c.class, cVar);
        }

        public static C0253a M() {
            return DEFAULT_INSTANCE.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void P(OutputPrefixType outputPrefixType) {
            this.outputPrefixType_ = outputPrefixType.getNumber();
        }

        public KeyData H() {
            KeyData keyData = this.keyData_;
            return keyData == null ? KeyData.G() : keyData;
        }

        public int I() {
            return this.keyId_;
        }

        public OutputPrefixType J() {
            OutputPrefixType outputPrefixTypeForNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
            return outputPrefixTypeForNumber == null ? OutputPrefixType.UNRECOGNIZED : outputPrefixTypeForNumber;
        }

        public KeyStatusType K() {
            KeyStatusType keyStatusTypeForNumber = KeyStatusType.forNumber(this.status_);
            return keyStatusTypeForNumber == null ? KeyStatusType.UNRECOGNIZED : keyStatusTypeForNumber;
        }

        public boolean L() {
            return this.keyData_ != null;
        }

        public final void N(KeyData keyData) {
            keyData.getClass();
            this.keyData_ = keyData;
        }

        public final void O(int i) {
            this.keyId_ = i;
        }

        public final void Q(KeyStatusType keyStatusType) {
            this.status_ = keyStatusType.getNumber();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C0252a c0252a = null;
            switch (C0252a.f9345a[methodToInvoke.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new C0253a(c0252a);
                case 3:
                    return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.A(a.class, aVar);
    }

    public static b L() {
        return DEFAULT_INSTANCE.i();
    }

    public static a M(byte[] bArr, l lVar) throws InvalidProtocolBufferException {
        return (a) GeneratedMessageLite.w(DEFAULT_INSTANCE, bArr, lVar);
    }

    public final void F(c cVar) {
        cVar.getClass();
        G();
        this.key_.add(cVar);
    }

    public final void G() {
        if (this.key_.c()) {
            return;
        }
        this.key_ = GeneratedMessageLite.s(this.key_);
    }

    public c H(int i) {
        return this.key_.get(i);
    }

    public int I() {
        return this.key_.size();
    }

    public List<c> J() {
        return this.key_;
    }

    public int K() {
        return this.primaryKeyId_;
    }

    public final void N(int i) {
        this.primaryKeyId_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C0252a c0252a = null;
        switch (C0252a.f9345a[methodToInvoke.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0252a);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<a> bVar = PARSER;
                if (bVar == null) {
                    synchronized (a.class) {
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
