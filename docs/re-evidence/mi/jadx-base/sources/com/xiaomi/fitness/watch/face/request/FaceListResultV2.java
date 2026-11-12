package com.xiaomi.fitness.watch.face.request;

import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceListResultV2;", "", "watchface_list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "<init>", "(Ljava/util/List;)V", "getWatchface_list", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceListResultV2 {

    @NotNull
    private final List<FaceData> watchface_list;

    public FaceListResultV2(@NotNull List<FaceData> watchface_list) {
        Intrinsics.checkNotNullParameter(watchface_list, "watchface_list");
        this.watchface_list = watchface_list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceListResultV2 copy$default(FaceListResultV2 faceListResultV2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = faceListResultV2.watchface_list;
        }
        return faceListResultV2.copy(list);
    }

    @NotNull
    public final List<FaceData> component1() {
        return this.watchface_list;
    }

    @NotNull
    public final FaceListResultV2 copy(@NotNull List<FaceData> watchface_list) {
        Intrinsics.checkNotNullParameter(watchface_list, "watchface_list");
        return new FaceListResultV2(watchface_list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FaceListResultV2) && Intrinsics.areEqual(this.watchface_list, ((FaceListResultV2) other).watchface_list);
    }

    @NotNull
    public final List<FaceData> getWatchface_list() {
        return this.watchface_list;
    }

    public int hashCode() {
        return this.watchface_list.hashCode();
    }

    @NotNull
    public String toString() {
        return "FaceListResultV2(watchface_list=" + this.watchface_list + ")";
    }
}
