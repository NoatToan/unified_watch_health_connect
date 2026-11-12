package com.xiaomi.fitness.aivs.request.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/aivs/request/model/DebugInfo;", "", "primary", "", "queue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrimary", "()Ljava/lang/String;", "getQueue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DebugInfo {

    @NotNull
    private final String primary;

    @NotNull
    private final String queue;

    public DebugInfo(@NotNull String primary, @NotNull String queue) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.primary = primary;
        this.queue = queue;
    }

    public static /* synthetic */ DebugInfo copy$default(DebugInfo debugInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = debugInfo.primary;
        }
        if ((i & 2) != 0) {
            str2 = debugInfo.queue;
        }
        return debugInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrimary() {
        return this.primary;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQueue() {
        return this.queue;
    }

    @NotNull
    public final DebugInfo copy(@NotNull String primary, @NotNull String queue) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(queue, "queue");
        return new DebugInfo(primary, queue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebugInfo)) {
            return false;
        }
        DebugInfo debugInfo = (DebugInfo) other;
        return Intrinsics.areEqual(this.primary, debugInfo.primary) && Intrinsics.areEqual(this.queue, debugInfo.queue);
    }

    @NotNull
    public final String getPrimary() {
        return this.primary;
    }

    @NotNull
    public final String getQueue() {
        return this.queue;
    }

    public int hashCode() {
        return (this.primary.hashCode() * 31) + this.queue.hashCode();
    }

    @NotNull
    public String toString() {
        return "DebugInfo(primary=" + this.primary + ", queue=" + this.queue + ")";
    }
}
