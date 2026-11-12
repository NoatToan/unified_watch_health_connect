package com.xiaomi.fitness.nfc.bean.yoyo;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR,\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/yoyo/PullCommandResponse;", "", "stepStatus", "", "commands", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getStepStatus", "()Ljava/lang/String;", "setStepStatus", "(Ljava/lang/String;)V", "getCommands", "()Ljava/util/ArrayList;", "setCommands", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/util/ArrayList;)Lcom/xiaomi/fitness/nfc/bean/yoyo/PullCommandResponse;", "equals", "", "other", "hashCode", "", "toString", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PullCommandResponse {

    @NotNull
    private ArrayList<String> commands;

    @NotNull
    private String stepStatus;

    public PullCommandResponse(@NotNull String stepStatus, @NotNull ArrayList<String> commands) {
        Intrinsics.checkNotNullParameter(stepStatus, "stepStatus");
        Intrinsics.checkNotNullParameter(commands, "commands");
        this.stepStatus = stepStatus;
        this.commands = commands;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PullCommandResponse copy$default(PullCommandResponse pullCommandResponse, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pullCommandResponse.stepStatus;
        }
        if ((i & 2) != 0) {
            arrayList = pullCommandResponse.commands;
        }
        return pullCommandResponse.copy(str, arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStepStatus() {
        return this.stepStatus;
    }

    @NotNull
    public final ArrayList<String> component2() {
        return this.commands;
    }

    @NotNull
    public final PullCommandResponse copy(@NotNull String stepStatus, @NotNull ArrayList<String> commands) {
        Intrinsics.checkNotNullParameter(stepStatus, "stepStatus");
        Intrinsics.checkNotNullParameter(commands, "commands");
        return new PullCommandResponse(stepStatus, commands);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PullCommandResponse)) {
            return false;
        }
        PullCommandResponse pullCommandResponse = (PullCommandResponse) other;
        return Intrinsics.areEqual(this.stepStatus, pullCommandResponse.stepStatus) && Intrinsics.areEqual(this.commands, pullCommandResponse.commands);
    }

    @NotNull
    public final ArrayList<String> getCommands() {
        return this.commands;
    }

    @NotNull
    public final String getStepStatus() {
        return this.stepStatus;
    }

    public int hashCode() {
        return (this.stepStatus.hashCode() * 31) + this.commands.hashCode();
    }

    public final void setCommands(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.commands = arrayList;
    }

    public final void setStepStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stepStatus = str;
    }

    @NotNull
    public String toString() {
        return "PullCommandResponse(stepStatus=" + this.stepStatus + ", commands=" + this.commands + ")";
    }
}
