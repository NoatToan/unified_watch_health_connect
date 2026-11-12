package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.s;

/* JADX INFO: loaded from: classes5.dex */
public enum EcPointFormat implements s.c {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);

    public static final int COMPRESSED_VALUE = 2;
    public static final int DO_NOT_USE_CRUNCHY_UNCOMPRESSED_VALUE = 3;
    public static final int UNCOMPRESSED_VALUE = 1;
    public static final int UNKNOWN_FORMAT_VALUE = 0;
    private static final s.d<EcPointFormat> internalValueMap = new s.d<EcPointFormat>() { // from class: com.google.crypto.tink.proto.EcPointFormat.a
        @Override // com.google.crypto.tink.shaded.protobuf.s.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EcPointFormat findValueByNumber(int i) {
            return EcPointFormat.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements s.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s.e f9337a = new b();

        @Override // com.google.crypto.tink.shaded.protobuf.s.e
        public boolean isInRange(int i) {
            return EcPointFormat.forNumber(i) != null;
        }
    }

    EcPointFormat(int i) {
        this.value = i;
    }

    public static EcPointFormat forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i == 1) {
            return UNCOMPRESSED;
        }
        if (i == 2) {
            return COMPRESSED;
        }
        if (i != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    public static s.d<EcPointFormat> internalGetValueMap() {
        return internalValueMap;
    }

    public static s.e internalGetVerifier() {
        return b.f9337a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EcPointFormat valueOf(int i) {
        return forNumber(i);
    }
}
