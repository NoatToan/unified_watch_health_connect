package com.huami.nfc.web.entity;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/nfc/web/entity/RequestCommand;", "", "", "component1", "", "Lcom/huami/nfc/web/entity/Command;", "component2", "success", "commands", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getSuccess", "()Z", "b", "Ljava/util/List;", "getCommands", "()Ljava/util/List;", "<init>", "(ZLjava/util/List;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RequestCommand {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("succeed")
    private final boolean success;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("results")
    @NotNull
    private final List<Command> commands;

    public RequestCommand(boolean z, @NotNull List<Command> list) {
        this.success = z;
        this.commands = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestCommand copy$default(RequestCommand requestCommand, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = requestCommand.success;
        }
        if ((i & 2) != 0) {
            list = requestCommand.commands;
        }
        return requestCommand.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final List<Command> component2() {
        return this.commands;
    }

    @NotNull
    public final RequestCommand copy(boolean success, @NotNull List<Command> commands) {
        return new RequestCommand(success, commands);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestCommand)) {
            return false;
        }
        RequestCommand requestCommand = (RequestCommand) other;
        return this.success == requestCommand.success && Intrinsics.areEqual(this.commands, requestCommand.commands);
    }

    @NotNull
    public final List<Command> getCommands() {
        return this.commands;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.commands.hashCode();
    }

    @NotNull
    public String toString() {
        return "RequestCommand(success=" + this.success + ", commands=" + this.commands + ')';
    }
}
