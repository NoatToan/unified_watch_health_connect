package com.xiaomi.fitness.nfc.manager;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/nfc/manager/APDUOpenCommand;", "", "isExpectCmd", "", "commands", "", "", "expectCommands", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "()Z", "getCommands", "()Ljava/util/List;", "getExpectCommands", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class APDUOpenCommand {

    @NotNull
    private final List<String> commands;

    @Nullable
    private final List<String> expectCommands;
    private final boolean isExpectCmd;

    public APDUOpenCommand(boolean z, @NotNull List<String> commands, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        this.isExpectCmd = z;
        this.commands = commands;
        this.expectCommands = list;
    }

    @NotNull
    public final List<String> getCommands() {
        return this.commands;
    }

    @Nullable
    public final List<String> getExpectCommands() {
        return this.expectCommands;
    }

    /* JADX INFO: renamed from: isExpectCmd, reason: from getter */
    public final boolean getIsExpectCmd() {
        return this.isExpectCmd;
    }

    public /* synthetic */ APDUOpenCommand(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, list, (i & 4) != 0 ? null : list2);
    }
}
