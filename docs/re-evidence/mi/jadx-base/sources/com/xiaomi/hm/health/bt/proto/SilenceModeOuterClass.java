package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.d0;
import com.google.protobuf.t;

/* JADX INFO: loaded from: classes11.dex */
public final class SilenceModeOuterClass {

    public enum SilenceMode implements d0.c {
        OFF(0),
        ON(1),
        SMART(2);

        public static final int OFF_VALUE = 0;
        public static final int ON_VALUE = 1;
        public static final int SMART_VALUE = 2;
        private static final d0.d<SilenceMode> internalValueMap = new d0.d<SilenceMode>() { // from class: com.xiaomi.hm.health.bt.proto.SilenceModeOuterClass.SilenceMode.1
            @Override // com.google.protobuf.d0.d
            public SilenceMode findValueByNumber(int i) {
                return SilenceMode.forNumber(i);
            }
        };
        private final int value;

        public static final class SilenceModeVerifier implements d0.e {
            public static final d0.e INSTANCE = new SilenceModeVerifier();

            private SilenceModeVerifier() {
            }

            @Override // com.google.protobuf.d0.e
            public boolean isInRange(int i) {
                return SilenceMode.forNumber(i) != null;
            }
        }

        SilenceMode(int i) {
            this.value = i;
        }

        public static SilenceMode forNumber(int i) {
            if (i == 0) {
                return OFF;
            }
            if (i == 1) {
                return ON;
            }
            if (i != 2) {
                return null;
            }
            return SMART;
        }

        public static d0.d<SilenceMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static d0.e internalGetVerifier() {
            return SilenceModeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.d0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static SilenceMode valueOf(int i) {
            return forNumber(i);
        }
    }

    private SilenceModeOuterClass() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
