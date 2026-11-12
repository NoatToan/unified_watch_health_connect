package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum SessionVerbosity implements Internal.EnumLite {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final Internal.EnumLiteMap<SessionVerbosity> internalValueMap = new Internal.EnumLiteMap<SessionVerbosity>() { // from class: com.google.firebase.perf.v1.SessionVerbosity.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public SessionVerbosity findValueByNumber(int i14) {
            return SessionVerbosity.forNumber(i14);
        }
    };
    private final int value;

    public static final class SessionVerbosityVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new SessionVerbosityVerifier();

        private SessionVerbosityVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i14) {
            return SessionVerbosity.forNumber(i14) != null;
        }
    }

    SessionVerbosity(int i14) {
        this.value = i14;
    }

    public static SessionVerbosity forNumber(int i14) {
        if (i14 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i14 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static Internal.EnumLiteMap<SessionVerbosity> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SessionVerbosityVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static SessionVerbosity valueOf(int i14) {
        return forNumber(i14);
    }
}
