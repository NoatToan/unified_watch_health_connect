package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes20.dex */
public final class SilenceModeOuterClass {

    public enum SilenceMode implements Internal.EnumLite {
        OFF(0),
        ON(1),
        SMART(2);

        public static final int OFF_VALUE = 0;
        public static final int ON_VALUE = 1;
        public static final int SMART_VALUE = 2;
        private static final Internal.EnumLiteMap<SilenceMode> internalValueMap = new Internal.EnumLiteMap<SilenceMode>() { // from class: com.xiaomi.hm.health.bt.proto.SilenceModeOuterClass.SilenceMode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SilenceMode findValueByNumber(int number) {
                return SilenceMode.forNumber(number);
            }
        };
        private final int value;

        public static final class SilenceModeVerifier implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier INSTANCE = new SilenceModeVerifier();

            private SilenceModeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int number) {
                return SilenceMode.forNumber(number) != null;
            }
        }

        SilenceMode(int value) {
            this.value = value;
        }

        public static SilenceMode forNumber(int value) {
            if (value == 0) {
                return OFF;
            }
            if (value == 1) {
                return ON;
            }
            if (value != 2) {
                return null;
            }
            return SMART;
        }

        public static Internal.EnumLiteMap<SilenceMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return SilenceModeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static SilenceMode valueOf(int value) {
            return forNumber(value);
        }
    }

    private SilenceModeOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
