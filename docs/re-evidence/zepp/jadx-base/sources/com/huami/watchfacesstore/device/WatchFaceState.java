package com.huami.watchfacesstore.device;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/watchfacesstore/device/WatchFaceState;", "", "Lcom/huami/watchfacesstore/device/WatchFaceStatus;", "component1", "Lcom/huami/watchfacesstore/device/WFProgress;", "component2", "status", "progress", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/watchfacesstore/device/WatchFaceStatus;", "getStatus", "()Lcom/huami/watchfacesstore/device/WatchFaceStatus;", "b", "Lcom/huami/watchfacesstore/device/WFProgress;", "getProgress", "()Lcom/huami/watchfacesstore/device/WFProgress;", "setProgress", "(Lcom/huami/watchfacesstore/device/WFProgress;)V", "<init>", "(Lcom/huami/watchfacesstore/device/WatchFaceStatus;Lcom/huami/watchfacesstore/device/WFProgress;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WatchFaceState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final WatchFaceStatus status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private WFProgress progress;

    public WatchFaceState(@NotNull WatchFaceStatus watchFaceStatus, @Nullable WFProgress wFProgress) {
        this.status = watchFaceStatus;
        this.progress = wFProgress;
    }

    public static /* synthetic */ WatchFaceState copy$default(WatchFaceState watchFaceState, WatchFaceStatus watchFaceStatus, WFProgress wFProgress, int i, Object obj) {
        if ((i & 1) != 0) {
            watchFaceStatus = watchFaceState.status;
        }
        if ((i & 2) != 0) {
            wFProgress = watchFaceState.progress;
        }
        return watchFaceState.copy(watchFaceStatus, wFProgress);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WatchFaceStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WFProgress getProgress() {
        return this.progress;
    }

    @NotNull
    public final WatchFaceState copy(@NotNull WatchFaceStatus status, @Nullable WFProgress progress) {
        return new WatchFaceState(status, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchFaceState)) {
            return false;
        }
        WatchFaceState watchFaceState = (WatchFaceState) other;
        return this.status == watchFaceState.status && Intrinsics.areEqual(this.progress, watchFaceState.progress);
    }

    @Nullable
    public final WFProgress getProgress() {
        return this.progress;
    }

    @NotNull
    public final WatchFaceStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        WFProgress wFProgress = this.progress;
        return iHashCode + (wFProgress == null ? 0 : wFProgress.hashCode());
    }

    public final void setProgress(@Nullable WFProgress wFProgress) {
        this.progress = wFProgress;
    }

    @NotNull
    public String toString() {
        return "WatchFaceState(status=" + this.status + ", progress=" + this.progress + ")";
    }

    public /* synthetic */ WatchFaceState(WatchFaceStatus watchFaceStatus, WFProgress wFProgress, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(watchFaceStatus, (i & 2) != 0 ? null : wFProgress);
    }
}
