package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum ApplicationProcessState implements Internal.EnumLite {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final Internal.EnumLiteMap<ApplicationProcessState> internalValueMap = new Internal.EnumLiteMap<ApplicationProcessState>() { // from class: com.google.firebase.perf.v1.ApplicationProcessState.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ApplicationProcessState findValueByNumber(int i14) {
            return ApplicationProcessState.forNumber(i14);
        }
    };
    private final int value;

    public static final class ApplicationProcessStateVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ApplicationProcessStateVerifier();

        private ApplicationProcessStateVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i14) {
            return ApplicationProcessState.forNumber(i14) != null;
        }
    }

    ApplicationProcessState(int i14) {
        this.value = i14;
    }

    public static ApplicationProcessState forNumber(int i14) {
        if (i14 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i14 == 1) {
            return FOREGROUND;
        }
        if (i14 == 2) {
            return BACKGROUND;
        }
        if (i14 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static Internal.EnumLiteMap<ApplicationProcessState> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ApplicationProcessStateVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static ApplicationProcessState valueOf(int i14) {
        return forNumber(i14);
    }
}
