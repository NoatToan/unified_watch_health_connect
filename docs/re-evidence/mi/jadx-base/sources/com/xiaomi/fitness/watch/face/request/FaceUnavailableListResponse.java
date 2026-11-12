package com.xiaomi.fitness.watch.face.request;

import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceUnavailableListResponse;", "", "unavailable_id_list", "", "", "watchface_list", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getUnavailable_id_list", "()Ljava/util/List;", "getWatchface_list", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceUnavailableListResponse {

    @Nullable
    private final List<String> unavailable_id_list;

    @Nullable
    private final List<FaceData> watchface_list;

    public FaceUnavailableListResponse(@Nullable List<String> list, @Nullable List<FaceData> list2) {
        this.unavailable_id_list = list;
        this.watchface_list = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceUnavailableListResponse copy$default(FaceUnavailableListResponse faceUnavailableListResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = faceUnavailableListResponse.unavailable_id_list;
        }
        if ((i & 2) != 0) {
            list2 = faceUnavailableListResponse.watchface_list;
        }
        return faceUnavailableListResponse.copy(list, list2);
    }

    @Nullable
    public final List<String> component1() {
        return this.unavailable_id_list;
    }

    @Nullable
    public final List<FaceData> component2() {
        return this.watchface_list;
    }

    @NotNull
    public final FaceUnavailableListResponse copy(@Nullable List<String> unavailable_id_list, @Nullable List<FaceData> watchface_list) {
        return new FaceUnavailableListResponse(unavailable_id_list, watchface_list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceUnavailableListResponse)) {
            return false;
        }
        FaceUnavailableListResponse faceUnavailableListResponse = (FaceUnavailableListResponse) other;
        return Intrinsics.areEqual(this.unavailable_id_list, faceUnavailableListResponse.unavailable_id_list) && Intrinsics.areEqual(this.watchface_list, faceUnavailableListResponse.watchface_list);
    }

    @Nullable
    public final List<String> getUnavailable_id_list() {
        return this.unavailable_id_list;
    }

    @Nullable
    public final List<FaceData> getWatchface_list() {
        return this.watchface_list;
    }

    public int hashCode() {
        List<String> list = this.unavailable_id_list;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<FaceData> list2 = this.watchface_list;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FaceUnavailableListResponse(unavailable_id_list=" + this.unavailable_id_list + ", watchface_list=" + this.watchface_list + ")";
    }
}
