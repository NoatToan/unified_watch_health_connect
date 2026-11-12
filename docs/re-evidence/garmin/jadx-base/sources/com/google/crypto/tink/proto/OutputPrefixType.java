package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public enum OutputPrefixType implements Internal.EnumLite {
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
    private static final Internal.EnumLiteMap<OutputPrefixType> internalValueMap = new Internal.EnumLiteMap<OutputPrefixType>() { // from class: com.google.crypto.tink.proto.OutputPrefixType.1
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public OutputPrefixType findValueByNumber(int i14) {
            return OutputPrefixType.forNumber(i14);
        }
    };
    private final int value;

    public static final class OutputPrefixTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new OutputPrefixTypeVerifier();

        private OutputPrefixTypeVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i14) {
            return OutputPrefixType.forNumber(i14) != null;
        }
    }

    OutputPrefixType(int i14) {
        this.value = i14;
    }

    public static OutputPrefixType forNumber(int i14) {
        if (i14 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i14 == 1) {
            return TINK;
        }
        if (i14 == 2) {
            return LEGACY;
        }
        if (i14 == 3) {
            return RAW;
        }
        if (i14 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public static Internal.EnumLiteMap<OutputPrefixType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return OutputPrefixTypeVerifier.INSTANCE;
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
    public static OutputPrefixType valueOf(int i14) {
        return forNumber(i14);
    }
}
