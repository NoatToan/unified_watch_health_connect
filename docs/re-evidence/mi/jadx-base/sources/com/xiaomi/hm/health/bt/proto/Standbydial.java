package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.d0;
import com.google.protobuf.t;

/* JADX INFO: loaded from: classes11.dex */
public final class Standbydial {

    public enum StandbydialMode implements d0.c {
        ONOFF(0),
        ISSMART(1),
        SPECIALTIME(2),
        ALWAYS(3);

        public static final int ALWAYS_VALUE = 3;
        public static final int ISSMART_VALUE = 1;
        public static final int ONOFF_VALUE = 0;
        public static final int SPECIALTIME_VALUE = 2;
        private static final d0.d<StandbydialMode> internalValueMap = new d0.d<StandbydialMode>() { // from class: com.xiaomi.hm.health.bt.proto.Standbydial.StandbydialMode.1
            @Override // com.google.protobuf.d0.d
            public StandbydialMode findValueByNumber(int i) {
                return StandbydialMode.forNumber(i);
            }
        };
        private final int value;

        public static final class StandbydialModeVerifier implements d0.e {
            public static final d0.e INSTANCE = new StandbydialModeVerifier();

            private StandbydialModeVerifier() {
            }

            @Override // com.google.protobuf.d0.e
            public boolean isInRange(int i) {
                return StandbydialMode.forNumber(i) != null;
            }
        }

        StandbydialMode(int i) {
            this.value = i;
        }

        public static StandbydialMode forNumber(int i) {
            if (i == 0) {
                return ONOFF;
            }
            if (i == 1) {
                return ISSMART;
            }
            if (i == 2) {
                return SPECIALTIME;
            }
            if (i != 3) {
                return null;
            }
            return ALWAYS;
        }

        public static d0.d<StandbydialMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static d0.e internalGetVerifier() {
            return StandbydialModeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.d0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static StandbydialMode valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum StandbydialPattern implements d0.c {
        NONE(0),
        DIGIT(1),
        POINTER(2);

        public static final int DIGIT_VALUE = 1;
        public static final int NONE_VALUE = 0;
        public static final int POINTER_VALUE = 2;
        private static final d0.d<StandbydialPattern> internalValueMap = new d0.d<StandbydialPattern>() { // from class: com.xiaomi.hm.health.bt.proto.Standbydial.StandbydialPattern.1
            @Override // com.google.protobuf.d0.d
            public StandbydialPattern findValueByNumber(int i) {
                return StandbydialPattern.forNumber(i);
            }
        };
        private final int value;

        public static final class StandbydialPatternVerifier implements d0.e {
            public static final d0.e INSTANCE = new StandbydialPatternVerifier();

            private StandbydialPatternVerifier() {
            }

            @Override // com.google.protobuf.d0.e
            public boolean isInRange(int i) {
                return StandbydialPattern.forNumber(i) != null;
            }
        }

        StandbydialPattern(int i) {
            this.value = i;
        }

        public static StandbydialPattern forNumber(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return DIGIT;
            }
            if (i != 2) {
                return null;
            }
            return POINTER;
        }

        public static d0.d<StandbydialPattern> internalGetValueMap() {
            return internalValueMap;
        }

        public static d0.e internalGetVerifier() {
            return StandbydialPatternVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.d0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static StandbydialPattern valueOf(int i) {
            return forNumber(i);
        }
    }

    private Standbydial() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
