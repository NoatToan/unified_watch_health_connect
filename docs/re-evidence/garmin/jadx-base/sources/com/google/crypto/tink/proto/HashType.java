package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public enum HashType implements Internal.EnumLite {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final Internal.EnumLiteMap<HashType> internalValueMap = new Internal.EnumLiteMap<HashType>() { // from class: com.google.crypto.tink.proto.HashType.1
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public HashType findValueByNumber(int i14) {
            return HashType.forNumber(i14);
        }
    };
    private final int value;

    public static final class HashTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new HashTypeVerifier();

        private HashTypeVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i14) {
            return HashType.forNumber(i14) != null;
        }
    }

    HashType(int i14) {
        this.value = i14;
    }

    public static HashType forNumber(int i14) {
        if (i14 == 0) {
            return UNKNOWN_HASH;
        }
        if (i14 == 1) {
            return SHA1;
        }
        if (i14 == 2) {
            return SHA384;
        }
        if (i14 == 3) {
            return SHA256;
        }
        if (i14 != 4) {
            return null;
        }
        return SHA512;
    }

    public static Internal.EnumLiteMap<HashType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return HashTypeVerifier.INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        h.s("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static HashType valueOf(int i14) {
        return forNumber(i14);
    }
}
