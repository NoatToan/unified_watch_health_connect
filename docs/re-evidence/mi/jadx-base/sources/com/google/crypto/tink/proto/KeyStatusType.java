package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.s;

/* JADX INFO: loaded from: classes5.dex */
public enum KeyStatusType implements s.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final s.d<KeyStatusType> internalValueMap = new s.d<KeyStatusType>() { // from class: com.google.crypto.tink.proto.KeyStatusType.a
        @Override // com.google.crypto.tink.shaded.protobuf.s.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public KeyStatusType findValueByNumber(int i) {
            return KeyStatusType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements s.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s.e f9343a = new b();

        @Override // com.google.crypto.tink.shaded.protobuf.s.e
        public boolean isInRange(int i) {
            return KeyStatusType.forNumber(i) != null;
        }
    }

    KeyStatusType(int i) {
        this.value = i;
    }

    public static KeyStatusType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static s.d<KeyStatusType> internalGetValueMap() {
        return internalValueMap;
    }

    public static s.e internalGetVerifier() {
        return b.f9343a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static KeyStatusType valueOf(int i) {
        return forNumber(i);
    }
}
