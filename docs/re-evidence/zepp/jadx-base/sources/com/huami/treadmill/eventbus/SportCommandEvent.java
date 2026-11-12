package com.huami.treadmill.eventbus;

import com.huami.treadmill.data.BoltSportCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/treadmill/eventbus/SportCommandEvent;", "", "Lcom/huami/treadmill/data/BoltSportCommand;", "a", "Lcom/huami/treadmill/data/BoltSportCommand;", "getCommand", "()Lcom/huami/treadmill/data/BoltSportCommand;", "setCommand", "(Lcom/huami/treadmill/data/BoltSportCommand;)V", "command", "<init>", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class SportCommandEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private BoltSportCommand command;

    public SportCommandEvent(@NotNull BoltSportCommand boltSportCommand) {
        this.command = boltSportCommand;
    }

    @NotNull
    public final BoltSportCommand getCommand() {
        return this.command;
    }

    public final void setCommand(@NotNull BoltSportCommand boltSportCommand) {
        this.command = boltSportCommand;
    }
}
