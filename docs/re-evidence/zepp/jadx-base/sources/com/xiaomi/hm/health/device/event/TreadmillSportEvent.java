package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/event/TreadmillSportEvent;", "", "", "toString", "Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;", "component1", "command", "copy", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;", "getCommand", "()Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TreadmillSportEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SportCommand command;

    public TreadmillSportEvent(@NotNull SportCommand sportCommand) {
        this.command = sportCommand;
    }

    public static /* synthetic */ TreadmillSportEvent copy$default(TreadmillSportEvent treadmillSportEvent, SportCommand sportCommand, int i, Object obj) {
        if ((i & 1) != 0) {
            sportCommand = treadmillSportEvent.command;
        }
        return treadmillSportEvent.copy(sportCommand);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SportCommand getCommand() {
        return this.command;
    }

    @NotNull
    public final TreadmillSportEvent copy(@NotNull SportCommand command) {
        return new TreadmillSportEvent(command);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TreadmillSportEvent) && this.command == ((TreadmillSportEvent) other).command;
    }

    @NotNull
    public final SportCommand getCommand() {
        return this.command;
    }

    public int hashCode() {
        return this.command.hashCode();
    }

    @NotNull
    public String toString() {
        return "TreadmillSportEvent: " + this.command;
    }
}
