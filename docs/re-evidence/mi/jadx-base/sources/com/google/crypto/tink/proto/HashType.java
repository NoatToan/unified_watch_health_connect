package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.s;

/* JADX INFO: loaded from: classes5.dex */
public enum HashType implements s.c {
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
    private static final s.d<HashType> internalValueMap = new s.d<HashType>() { // from class: com.google.crypto.tink.proto.HashType.a
        @Override // com.google.crypto.tink.shaded.protobuf.s.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashType findValueByNumber(int i) {
            return HashType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements s.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s.e f9340a = new b();

        @Override // com.google.crypto.tink.shaded.protobuf.s.e
        public boolean isInRange(int i) {
            return HashType.forNumber(i) != null;
        }
    }

    HashType(int i) {
        this.value = i;
    }

    public static HashType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    public static s.d<HashType> internalGetValueMap() {
        return internalValueMap;
    }

    public static s.e internalGetVerifier() {
        return b.f9340a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HashType valueOf(int i) {
        return forNumber(i);
    }
}
