package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public enum KeyStatusType implements Internal.EnumLite {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final Internal.EnumLiteMap<KeyStatusType> internalValueMap = new Internal.EnumLiteMap<KeyStatusType>() { // from class: com.google.crypto.tink.proto.KeyStatusType.1
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public KeyStatusType findValueByNumber(int i14) {
            return KeyStatusType.forNumber(i14);
        }
    };
    private final int value;

    public static final class KeyStatusTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new KeyStatusTypeVerifier();

        private KeyStatusTypeVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i14) {
            return KeyStatusType.forNumber(i14) != null;
        }
    }

    KeyStatusType(int i14) {
        this.value = i14;
    }

    public static KeyStatusType forNumber(int i14) {
        if (i14 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i14 == 1) {
            return ENABLED;
        }
        if (i14 == 2) {
            return DISABLED;
        }
        if (i14 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static Internal.EnumLiteMap<KeyStatusType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return KeyStatusTypeVerifier.INSTANCE;
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
    public static KeyStatusType valueOf(int i14) {
        return forNumber(i14);
    }
}
