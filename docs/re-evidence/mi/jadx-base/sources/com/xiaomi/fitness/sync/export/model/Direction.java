package com.xiaomi.fitness.sync.export.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sync/export/model/Direction;", "", "from", "", "to", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "getTo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Direction {

    @SerializedName("from")
    @NotNull
    private final String from;

    @SerializedName("to")
    @NotNull
    private final String to;

    public Direction(@NotNull String from, @NotNull String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.from = from;
        this.to = to;
    }

    public static /* synthetic */ Direction copy$default(Direction direction, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = direction.from;
        }
        if ((i & 2) != 0) {
            str2 = direction.to;
        }
        return direction.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @NotNull
    public final Direction copy(@NotNull String from, @NotNull String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        return new Direction(from, to);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Direction)) {
            return false;
        }
        Direction direction = (Direction) other;
        return Intrinsics.areEqual(this.from, direction.from) && Intrinsics.areEqual(this.to, direction.to);
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        return (this.from.hashCode() * 31) + this.to.hashCode();
    }

    @NotNull
    public String toString() {
        return "Direction(from=" + this.from + ", to=" + this.to + ")";
    }
}
