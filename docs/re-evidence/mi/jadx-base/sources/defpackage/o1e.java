package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;

/* JADX INFO: loaded from: classes5.dex */
public final class o1e extends GeneratedMessageLite<o1e, b> implements asf {
    private static final o1e DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile ukh<o1e> PARSER;
    private String keyUri_ = "";

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28641a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f28641a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28641a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28641a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28641a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28641a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28641a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28641a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<o1e, b> implements asf {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(o1e.DEFAULT_INSTANCE);
        }
    }

    static {
        o1e o1eVar = new o1e();
        DEFAULT_INSTANCE = o1eVar;
        GeneratedMessageLite.A(o1e.class, o1eVar);
    }

    public static o1e D() {
        return DEFAULT_INSTANCE;
    }

    public static o1e F(ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        return (o1e) GeneratedMessageLite.v(DEFAULT_INSTANCE, byteString, lVar);
    }

    public String E() {
        return this.keyUri_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28641a[methodToInvoke.ordinal()]) {
            case 1:
                return new o1e();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<o1e> bVar = PARSER;
                if (bVar == null) {
                    synchronized (o1e.class) {
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
