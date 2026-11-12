package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.s;

/* JADX INFO: loaded from: classes5.dex */
public enum OutputPrefixType implements s.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final s.d<OutputPrefixType> internalValueMap = new s.d<OutputPrefixType>() { // from class: com.google.crypto.tink.proto.OutputPrefixType.a
        @Override // com.google.crypto.tink.shaded.protobuf.s.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OutputPrefixType findValueByNumber(int i) {
            return OutputPrefixType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements s.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s.e f9344a = new b();

        @Override // com.google.crypto.tink.shaded.protobuf.s.e
        public boolean isInRange(int i) {
            return OutputPrefixType.forNumber(i) != null;
        }
    }

    OutputPrefixType(int i) {
        this.value = i;
    }

    public static OutputPrefixType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public static s.d<OutputPrefixType> internalGetValueMap() {
        return internalValueMap;
    }

    public static s.e internalGetVerifier() {
        return b.f9344a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OutputPrefixType valueOf(int i) {
        return forNumber(i);
    }
}
