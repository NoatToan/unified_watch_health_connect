package com.huami.nfc.web.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J5\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/nfc/web/entity/Command;", "", "", "component1", "component2", "component3", "component4", "index", "command", "checker", "result", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getIndex", "()Ljava/lang/String;", "b", "getCommand", "c", "getChecker", GoogleApiAvailabilityLight.a, "getResult", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Command {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("index")
    @NotNull
    private final String index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("command")
    @NotNull
    private final String command;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("checker")
    @Nullable
    private final String checker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("result")
    @Nullable
    private final String result;

    public Command(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
        this.index = str;
        this.command = str2;
        this.checker = str3;
        this.result = str4;
    }

    public static /* synthetic */ Command copy$default(Command command, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = command.index;
        }
        if ((i & 2) != 0) {
            str2 = command.command;
        }
        if ((i & 4) != 0) {
            str3 = command.checker;
        }
        if ((i & 8) != 0) {
            str4 = command.result;
        }
        return command.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChecker() {
        return this.checker;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @NotNull
    public final Command copy(@NotNull String index, @NotNull String command, @Nullable String checker, @Nullable String result) {
        return new Command(index, command, checker, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Command)) {
            return false;
        }
        Command command = (Command) other;
        return Intrinsics.areEqual(this.index, command.index) && Intrinsics.areEqual(this.command, command.command) && Intrinsics.areEqual(this.checker, command.checker) && Intrinsics.areEqual(this.result, command.result);
    }

    @Nullable
    public final String getChecker() {
        return this.checker;
    }

    @NotNull
    public final String getCommand() {
        return this.command;
    }

    @NotNull
    public final String getIndex() {
        return this.index;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        int iHashCode = ((this.index.hashCode() * 31) + this.command.hashCode()) * 31;
        String str = this.checker;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.result;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Command(index=" + this.index + ", command=" + this.command + ", checker=" + ((Object) this.checker) + ", result=" + ((Object) this.result) + ')';
    }
}
