package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.s;
import defpackage.asf;
import defpackage.ukh;

/* JADX INFO: loaded from: classes5.dex */
public final class KeyData extends GeneratedMessageLite<KeyData, b> implements asf {
    private static final KeyData DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile ukh<KeyData> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    public enum KeyMaterialType implements s.c {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
        public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
        public static final int REMOTE_VALUE = 4;
        public static final int SYMMETRIC_VALUE = 1;
        public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
        private static final s.d<KeyMaterialType> internalValueMap = new a();
        private final int value;

        public class a implements s.d<KeyMaterialType> {
            @Override // com.google.crypto.tink.shaded.protobuf.s.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public KeyMaterialType findValueByNumber(int i) {
                return KeyMaterialType.forNumber(i);
            }
        }

        public static final class b implements s.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final s.e f9341a = new b();

            @Override // com.google.crypto.tink.shaded.protobuf.s.e
            public boolean isInRange(int i) {
                return KeyMaterialType.forNumber(i) != null;
            }
        }

        KeyMaterialType(int i) {
            this.value = i;
        }

        public static KeyMaterialType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        public static s.d<KeyMaterialType> internalGetValueMap() {
            return internalValueMap;
        }

        public static s.e internalGetVerifier() {
            return b.f9341a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static KeyMaterialType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9342a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f9342a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9342a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9342a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9342a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9342a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9342a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9342a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.a<KeyData, b> implements asf {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b t(KeyMaterialType keyMaterialType) {
            j();
            ((KeyData) this.f9361b).L(keyMaterialType);
            return this;
        }

        public b u(String str) {
            j();
            ((KeyData) this.f9361b).M(str);
            return this;
        }

        public b v(ByteString byteString) {
            j();
            ((KeyData) this.f9361b).N(byteString);
            return this;
        }

        public b() {
            super(KeyData.DEFAULT_INSTANCE);
        }
    }

    static {
        KeyData keyData = new KeyData();
        DEFAULT_INSTANCE = keyData;
        GeneratedMessageLite.A(KeyData.class, keyData);
    }

    public static KeyData G() {
        return DEFAULT_INSTANCE;
    }

    public static b K() {
        return DEFAULT_INSTANCE.i();
    }

    public KeyMaterialType H() {
        KeyMaterialType keyMaterialTypeForNumber = KeyMaterialType.forNumber(this.keyMaterialType_);
        return keyMaterialTypeForNumber == null ? KeyMaterialType.UNRECOGNIZED : keyMaterialTypeForNumber;
    }

    public String I() {
        return this.typeUrl_;
    }

    public ByteString J() {
        return this.value_;
    }

    public final void L(KeyMaterialType keyMaterialType) {
        this.keyMaterialType_ = keyMaterialType.getNumber();
    }

    public final void M(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void N(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f9342a[methodToInvoke.ordinal()]) {
            case 1:
                return new KeyData();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ukh<KeyData> bVar = PARSER;
                if (bVar == null) {
                    synchronized (KeyData.class) {
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
