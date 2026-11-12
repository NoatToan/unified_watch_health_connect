package com.xiaomi.fitness.watch.face.request;

import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FacePaidListResponse;", "", RouteRequest.KEY_NEXT_KEY, "", "user_watchface_list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getNext_key", "()Ljava/lang/String;", "getUser_watchface_list", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FacePaidListResponse {

    @Nullable
    private final String next_key;

    @Nullable
    private final List<FaceData> user_watchface_list;

    public FacePaidListResponse(@Nullable String str, @Nullable List<FaceData> list) {
        this.next_key = str;
        this.user_watchface_list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FacePaidListResponse copy$default(FacePaidListResponse facePaidListResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = facePaidListResponse.next_key;
        }
        if ((i & 2) != 0) {
            list = facePaidListResponse.user_watchface_list;
        }
        return facePaidListResponse.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNext_key() {
        return this.next_key;
    }

    @Nullable
    public final List<FaceData> component2() {
        return this.user_watchface_list;
    }

    @NotNull
    public final FacePaidListResponse copy(@Nullable String next_key, @Nullable List<FaceData> user_watchface_list) {
        return new FacePaidListResponse(next_key, user_watchface_list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FacePaidListResponse)) {
            return false;
        }
        FacePaidListResponse facePaidListResponse = (FacePaidListResponse) other;
        return Intrinsics.areEqual(this.next_key, facePaidListResponse.next_key) && Intrinsics.areEqual(this.user_watchface_list, facePaidListResponse.user_watchface_list);
    }

    @Nullable
    public final String getNext_key() {
        return this.next_key;
    }

    @Nullable
    public final List<FaceData> getUser_watchface_list() {
        return this.user_watchface_list;
    }

    public int hashCode() {
        String str = this.next_key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<FaceData> list = this.user_watchface_list;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FacePaidListResponse(next_key=" + this.next_key + ", user_watchface_list=" + this.user_watchface_list + ")";
    }
}
