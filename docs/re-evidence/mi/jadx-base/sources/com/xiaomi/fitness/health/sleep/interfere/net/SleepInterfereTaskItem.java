package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereTaskItem;", "", "type", "", "status", "", "<init>", "(Ljava/lang/String;I)V", "getType", "()Ljava/lang/String;", "getStatus", "()I", "setStatus", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepInterfereTaskItem {

    @SerializedName("status")
    private int status;

    @SerializedName("type")
    @NotNull
    private final String type;

    public SleepInterfereTaskItem(@NotNull String type, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.status = i;
    }

    public static /* synthetic */ SleepInterfereTaskItem copy$default(SleepInterfereTaskItem sleepInterfereTaskItem, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sleepInterfereTaskItem.type;
        }
        if ((i2 & 2) != 0) {
            i = sleepInterfereTaskItem.status;
        }
        return sleepInterfereTaskItem.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final SleepInterfereTaskItem copy(@NotNull String type, int status) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new SleepInterfereTaskItem(type, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepInterfereTaskItem)) {
            return false;
        }
        SleepInterfereTaskItem sleepInterfereTaskItem = (SleepInterfereTaskItem) other;
        return Intrinsics.areEqual(this.type, sleepInterfereTaskItem.type) && this.status == sleepInterfereTaskItem.status;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + Integer.hashCode(this.status);
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "SleepInterfereTaskItem(type=" + this.type + ", status=" + this.status + ")";
    }
}
