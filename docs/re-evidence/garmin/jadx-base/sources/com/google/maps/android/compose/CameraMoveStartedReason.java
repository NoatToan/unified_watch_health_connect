package com.google.maps.android.compose;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/google/maps/android/compose/CameraMoveStartedReason;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "NO_MOVEMENT_YET", "GESTURE", "API_ANIMATION", "DEVELOPER_ANIMATION", "Companion", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum CameraMoveStartedReason {
    UNKNOWN(-2),
    NO_MOVEMENT_YET(-1),
    GESTURE(1),
    API_ANIMATION(2),
    DEVELOPER_ANIMATION(3);

    private final int value;
    private static final /* synthetic */ w13.a $ENTRIES = w13.b.g(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    CameraMoveStartedReason(int i14) {
        this.value = i14;
    }

    public static w13.a<CameraMoveStartedReason> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/google/maps/android/compose/CameraMoveStartedReason$Companion;", "", "<init>", "()V", "fromInt", "Lcom/google/maps/android/compose/CameraMoveStartedReason;", "value", "", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final CameraMoveStartedReason fromInt(int value) {
            for (CameraMoveStartedReason cameraMoveStartedReason : CameraMoveStartedReason.values()) {
                if (cameraMoveStartedReason.getValue() == value) {
                    if (cameraMoveStartedReason == null) {
                        return CameraMoveStartedReason.UNKNOWN;
                    }
                    return cameraMoveStartedReason;
                }
            }
            cameraMoveStartedReason = null;
            if (cameraMoveStartedReason == null) {
                return CameraMoveStartedReason.UNKNOWN;
            }
            return cameraMoveStartedReason;
        }

        private Companion() {
        }
    }
}
