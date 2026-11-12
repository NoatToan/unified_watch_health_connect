package com.xiaomi.fitness.watch.face.pay.userlist;

import com.xiaomi.fitness.watch.face.export.data.FaceData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidItem;", "", "data", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "loadTime", "", "<init>", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceData;J)V", "getData", "()Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "getLoadTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FacePaidItem {

    @NotNull
    private final FaceData data;
    private final long loadTime;

    public FacePaidItem(@NotNull FaceData data, long j) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.loadTime = j;
    }

    public static /* synthetic */ FacePaidItem copy$default(FacePaidItem facePaidItem, FaceData faceData, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            faceData = facePaidItem.data;
        }
        if ((i & 2) != 0) {
            j = facePaidItem.loadTime;
        }
        return facePaidItem.copy(faceData, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FaceData getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLoadTime() {
        return this.loadTime;
    }

    @NotNull
    public final FacePaidItem copy(@NotNull FaceData data, long loadTime) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new FacePaidItem(data, loadTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FacePaidItem)) {
            return false;
        }
        FacePaidItem facePaidItem = (FacePaidItem) other;
        return Intrinsics.areEqual(this.data, facePaidItem.data) && this.loadTime == facePaidItem.loadTime;
    }

    @NotNull
    public final FaceData getData() {
        return this.data;
    }

    public final long getLoadTime() {
        return this.loadTime;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + Long.hashCode(this.loadTime);
    }

    @NotNull
    public String toString() {
        return "FacePaidItem(data=" + this.data + ", loadTime=" + this.loadTime + ")";
    }
}
