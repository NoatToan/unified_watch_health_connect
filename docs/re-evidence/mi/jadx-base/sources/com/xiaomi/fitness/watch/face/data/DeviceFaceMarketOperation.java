package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketOperation;", "", "recommend_list", "", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceRecommendListItem;", "banner_list", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceBannerListItem;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getRecommend_list", "()Ljava/util/List;", "getBanner_list", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceFaceMarketOperation {

    @SerializedName("banner_list")
    @Nullable
    private final List<DeviceFaceBannerListItem> banner_list;

    @SerializedName("recommend_info_list")
    @NotNull
    private final List<DeviceFaceRecommendListItem> recommend_list;

    public DeviceFaceMarketOperation(@NotNull List<DeviceFaceRecommendListItem> recommend_list, @Nullable List<DeviceFaceBannerListItem> list) {
        Intrinsics.checkNotNullParameter(recommend_list, "recommend_list");
        this.recommend_list = recommend_list;
        this.banner_list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceFaceMarketOperation copy$default(DeviceFaceMarketOperation deviceFaceMarketOperation, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deviceFaceMarketOperation.recommend_list;
        }
        if ((i & 2) != 0) {
            list2 = deviceFaceMarketOperation.banner_list;
        }
        return deviceFaceMarketOperation.copy(list, list2);
    }

    @NotNull
    public final List<DeviceFaceRecommendListItem> component1() {
        return this.recommend_list;
    }

    @Nullable
    public final List<DeviceFaceBannerListItem> component2() {
        return this.banner_list;
    }

    @NotNull
    public final DeviceFaceMarketOperation copy(@NotNull List<DeviceFaceRecommendListItem> recommend_list, @Nullable List<DeviceFaceBannerListItem> banner_list) {
        Intrinsics.checkNotNullParameter(recommend_list, "recommend_list");
        return new DeviceFaceMarketOperation(recommend_list, banner_list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceFaceMarketOperation)) {
            return false;
        }
        DeviceFaceMarketOperation deviceFaceMarketOperation = (DeviceFaceMarketOperation) other;
        return Intrinsics.areEqual(this.recommend_list, deviceFaceMarketOperation.recommend_list) && Intrinsics.areEqual(this.banner_list, deviceFaceMarketOperation.banner_list);
    }

    @Nullable
    public final List<DeviceFaceBannerListItem> getBanner_list() {
        return this.banner_list;
    }

    @NotNull
    public final List<DeviceFaceRecommendListItem> getRecommend_list() {
        return this.recommend_list;
    }

    public int hashCode() {
        int iHashCode = this.recommend_list.hashCode() * 31;
        List<DeviceFaceBannerListItem> list = this.banner_list;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "DeviceFaceMarketOperation(recommend_list=" + this.recommend_list + ", banner_list=" + this.banner_list + ")";
    }
}
