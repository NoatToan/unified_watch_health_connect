package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/SportEvent;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "NODE_EVENT_NONE", "NODE_EVENT_START", "NODE_EVENT_AUTO_PAUSE", "NODE_EVENT_AUTO_RESUME", "NODE_EVENT_PAUSE", "NODE_EVENT_RESUME", "NODE_EVENT_STOP", "NODE_EVENT_SECOND_HALF", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/SportEvent$Companion;", "", "", "v", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/SportEvent;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
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
