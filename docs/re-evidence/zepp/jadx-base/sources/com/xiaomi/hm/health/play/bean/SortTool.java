package com.xiaomi.hm.health.play.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/play/bean/SortTool;", "", "", "component1", "", "component2", "key", "isShow", "copy", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Z", "()Z", "<init>", "(Ljava/lang/String;Z)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SortTool {
    private final boolean isShow;

    @NotNull
    private final String key;

    public SortTool(@NotNull String str, boolean z) {
        this.key = str;
        this.isShow = z;
    }

    public static /* synthetic */ SortTool copy$default(SortTool sortTool, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sortTool.key;
        }
        if ((i & 2) != 0) {
            z = sortTool.isShow;
        }
        return sortTool.copy(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    @NotNull
    public final SortTool copy(@NotNull String key, boolean isShow) {
        return new SortTool(key, isShow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortTool)) {
            return false;
        }
        SortTool sortTool = (SortTool) other;
        return Intrinsics.areEqual(this.key, sortTool.key) && this.isShow == sortTool.isShow;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        boolean z = this.isShow;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isShow() {
        return this.isShow;
    }

    @NotNull
    public String toString() {
        return "SortTool(key=" + this.key + ", isShow=" + this.isShow + ")";
    }
}
