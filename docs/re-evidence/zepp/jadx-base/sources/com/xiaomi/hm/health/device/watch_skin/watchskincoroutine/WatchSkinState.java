package com.xiaomi.hm.health.device.watch_skin.watchskincoroutine;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/WatchSkinState;", "", "Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/WatchSkinError;", "component1", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "component2", "pageState", "progress", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/WatchSkinError;", "getPageState", "()Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/WatchSkinError;", "b", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "getProgress", "()Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "setProgress", "(Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;)V", "<init>", "(Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/WatchSkinError;Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WatchSkinState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final WatchSkinError pageState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Progress progress;

    public WatchSkinState(@NotNull WatchSkinError watchSkinError, @Nullable Progress progress) {
        this.pageState = watchSkinError;
        this.progress = progress;
    }

    public static /* synthetic */ WatchSkinState copy$default(WatchSkinState watchSkinState, WatchSkinError watchSkinError, Progress progress, int i, Object obj) {
        if ((i & 1) != 0) {
            watchSkinError = watchSkinState.pageState;
        }
        if ((i & 2) != 0) {
            progress = watchSkinState.progress;
        }
        return watchSkinState.copy(watchSkinError, progress);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WatchSkinError getPageState() {
        return this.pageState;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Progress getProgress() {
        return this.progress;
    }

    @NotNull
    public final WatchSkinState copy(@NotNull WatchSkinError pageState, @Nullable Progress progress) {
        return new WatchSkinState(pageState, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchSkinState)) {
            return false;
        }
        WatchSkinState watchSkinState = (WatchSkinState) other;
        return this.pageState == watchSkinState.pageState && Intrinsics.areEqual(this.progress, watchSkinState.progress);
    }

    @NotNull
    public final WatchSkinError getPageState() {
        return this.pageState;
    }

    @Nullable
    public final Progress getProgress() {
        return this.progress;
    }

    public int hashCode() {
        int iHashCode = this.pageState.hashCode() * 31;
        Progress progress = this.progress;
        return iHashCode + (progress == null ? 0 : progress.hashCode());
    }

    public final void setProgress(@Nullable Progress progress) {
        this.progress = progress;
    }

    @NotNull
    public String toString() {
        return "WatchSkinState(pageState=" + this.pageState + ", progress=" + this.progress + ")";
    }

    public /* synthetic */ WatchSkinState(WatchSkinError watchSkinError, Progress progress, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(watchSkinError, (i & 2) != 0 ? null : progress);
    }
}
