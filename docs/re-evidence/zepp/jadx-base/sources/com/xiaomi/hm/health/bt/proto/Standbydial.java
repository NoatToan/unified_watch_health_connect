package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes20.dex */
public final class Standbydial {

    public enum StandbydialMode implements Internal.EnumLite {
        ONOFF(0),
        ISSMART(1),
        SPECIALTIME(2),
        ALWAYS(3);

        public static final int ALWAYS_VALUE = 3;
        public static final int ISSMART_VALUE = 1;
        public static final int ONOFF_VALUE = 0;
        public static final int SPECIALTIME_VALUE = 2;
        private static final Internal.EnumLiteMap<StandbydialMode> internalValueMap = new Internal.EnumLiteMap<StandbydialMode>() { // from class: com.xiaomi.hm.health.bt.proto.Standbydial.StandbydialMode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public StandbydialMode findValueByNumber(int number) {
                return StandbydialMode.forNumber(number);
            }
        };
        private final int value;

        public static final class StandbydialModeVerifier implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier INSTANCE = new StandbydialModeVerifier();

            private StandbydialModeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int number) {
                return StandbydialMode.forNumber(number) != null;
            }
        }

        StandbydialMode(int value) {
            this.value = value;
        }

        public static StandbydialMode forNumber(int value) {
            if (value == 0) {
                return ONOFF;
            }
            if (value == 1) {
                return ISSMART;
            }
            if (value == 2) {
                return SPECIALTIME;
            }
            if (value != 3) {
                return null;
            }
            return ALWAYS;
        }

        public static Internal.EnumLiteMap<StandbydialMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return StandbydialModeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static StandbydialMode valueOf(int value) {
            return forNumber(value);
        }
    }

    public enum StandbydialPattern implements Internal.EnumLite {
        NONE(0),
        DIGIT(1),
        POINTER(2);

        public static final int DIGIT_VALUE = 1;
        public static final int NONE_VALUE = 0;
        public static final int POINTER_VALUE = 2;
        private static final Internal.EnumLiteMap<StandbydialPattern> internalValueMap = new Internal.EnumLiteMap<StandbydialPattern>() { // from class: com.xiaomi.hm.health.bt.proto.Standbydial.StandbydialPattern.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public StandbydialPattern findValueByNumber(int number) {
                return StandbydialPattern.forNumber(number);
            }
        };
        private final int value;

        public static final class StandbydialPatternVerifier implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier INSTANCE = new StandbydialPatternVerifier();

            private StandbydialPatternVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int number) {
                return StandbydialPattern.forNumber(number) != null;
            }
        }

        StandbydialPattern(int value) {
            this.value = value;
        }

        public static StandbydialPattern forNumber(int value) {
            if (value == 0) {
                return NONE;
            }
            if (value == 1) {
                return DIGIT;
            }
            if (value != 2) {
                return null;
            }
            return POINTER;
        }

        public static Internal.EnumLiteMap<StandbydialPattern> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return StandbydialPatternVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static StandbydialPattern valueOf(int value) {
            return forNumber(value);
        }
    }

    private Standbydial() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
