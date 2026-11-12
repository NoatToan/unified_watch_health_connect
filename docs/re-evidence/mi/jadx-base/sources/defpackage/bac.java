package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;

/* JADX INFO: loaded from: classes5.dex */
public final class bac extends GeneratedMessageLite<bac, b> implements asf {
    private static final bac DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile ukh<bac> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private eac params_;
    private int version_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3984a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f3984a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3984a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3984a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3984a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3984a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3984a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3984a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<bac, b> implements asf {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b t(ByteString byteString) {
            j();
            ((bac) this.f9361b).M(byteString);
            return this;
        }

        public b u(eac eacVar) {
            j();
            ((bac) this.f9361b).N(eacVar);
            return this;
        }

        public b v(int i) {
            j();
            ((bac) this.f9361b).O(i);
            return this;
        }

        public b() {
            super(bac.DEFAULT_INSTANCE);
        }
    }

    static {
        bac bacVar = new bac();
        DEFAULT_INSTANCE = bacVar;
        GeneratedMessageLite.A(bac.class, bacVar);
    }

    public static bac G() {
        return DEFAULT_INSTANCE;
    }

    public static b K() {
        return DEFAULT_INSTANCE.i();
    }

    public static bac L(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        return (bac) GeneratedMessageLite.v(DEFAULT_INSTANCE, byteString, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(int i) {
        this.version_ = i;
    }

    public ByteString H() {
        return this.keyValue_;
    }

    public eac I() {
        eac eacVar = this.params_;
        return eacVar == null ? eac.D() : eacVar;
    }

    public int J() {
        return this.version_;
    }

    public final void N(eac eacVar) {
        eacVar.getClass();
        this.params_ = eacVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3984a[methodToInvoke.ordinal()]) {
            case 1:
                return new bac();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<bac> bVar = PARSER;
                if (bVar == null) {
                    synchronized (bac.class) {
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
