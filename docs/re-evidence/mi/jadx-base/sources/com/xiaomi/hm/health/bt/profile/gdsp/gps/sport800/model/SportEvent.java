package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/SportEvent;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NODE_EVENT_NONE", "NODE_EVENT_START", "NODE_EVENT_AUTO_PAUSE", "NODE_EVENT_AUTO_RESUME", "NODE_EVENT_PAUSE", "NODE_EVENT_RESUME", "NODE_EVENT_STOP", "NODE_EVENT_SECOND_HALF", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum SportEvent {
    NODE_EVENT_NONE(-1),
    NODE_EVENT_START(1),
    NODE_EVENT_AUTO_PAUSE(2),
    NODE_EVENT_AUTO_RESUME(3),
    NODE_EVENT_PAUSE(4),
    NODE_EVENT_RESUME(5),
    NODE_EVENT_STOP(6),
    NODE_EVENT_SECOND_HALF(7);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/SportEvent$Companion;", "", "()V", "fromValue", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/SportEvent;", "v", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final SportEvent fromValue(int v) {
            for (SportEvent sportEvent : SportEvent.values()) {
                if (sportEvent.getValue() == v) {
                    if (sportEvent == null) {
                        return SportEvent.NODE_EVENT_NONE;
                    }
                    return sportEvent;
                }
            }
            sportEvent = null;
            if (sportEvent == null) {
                return SportEvent.NODE_EVENT_NONE;
            }
            return sportEvent;
        }
    }

    SportEvent(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
