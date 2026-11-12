package com.xiaomi.fitness.medal;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/medal/MedalTurnDone;", "", "turnMedalId", "", "<init>", "(J)V", "getTurnMedalId", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MedalTurnDone {
    private final long turnMedalId;

    public MedalTurnDone(long j) {
        this.turnMedalId = j;
    }

    public static /* synthetic */ MedalTurnDone copy$default(MedalTurnDone medalTurnDone, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = medalTurnDone.turnMedalId;
        }
        return medalTurnDone.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTurnMedalId() {
        return this.turnMedalId;
    }

    @NotNull
    public final MedalTurnDone copy(long turnMedalId) {
        return new MedalTurnDone(turnMedalId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MedalTurnDone) && this.turnMedalId == ((MedalTurnDone) other).turnMedalId;
    }

    public final long getTurnMedalId() {
        return this.turnMedalId;
    }

    public int hashCode() {
        return Long.hashCode(this.turnMedalId);
    }

    @NotNull
    public String toString() {
        return "MedalTurnDone(turnMedalId=" + this.turnMedalId + ")";
    }
}
