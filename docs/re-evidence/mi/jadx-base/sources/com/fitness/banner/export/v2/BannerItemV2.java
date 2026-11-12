package com.fitness.banner.export.v2;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/fitness/banner/export/v2/BannerItemV2;", "Ljava/io/Serializable;", "resourceId", "", "resourceTitle", "", "bannerInfoList", "", "Lcom/fitness/banner/export/v2/BannerItemDetail;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getResourceId", "()I", "getResourceTitle", "()Ljava/lang/String;", "getBannerInfoList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BannerItemV2 implements Serializable {

    @SerializedName("banner_info_list")
    @Nullable
    private final List<BannerItemDetail> bannerInfoList;

    @SerializedName("resource_id")
    private final int resourceId;

    @SerializedName("resource_title")
    @NotNull
    private final String resourceTitle;

    public BannerItemV2(int i, @NotNull String resourceTitle, @Nullable List<BannerItemDetail> list) {
        Intrinsics.checkNotNullParameter(resourceTitle, "resourceTitle");
        this.resourceId = i;
        this.resourceTitle = resourceTitle;
        this.bannerInfoList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerItemV2 copy$default(BannerItemV2 bannerItemV2, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bannerItemV2.resourceId;
        }
        if ((i2 & 2) != 0) {
            str = bannerItemV2.resourceTitle;
        }
        if ((i2 & 4) != 0) {
            list = bannerItemV2.bannerInfoList;
        }
        return bannerItemV2.copy(i, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResourceId() {
        return this.resourceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResourceTitle() {
        return this.resourceTitle;
    }

    @Nullable
    public final List<BannerItemDetail> component3() {
        return this.bannerInfoList;
    }

    @NotNull
    public final BannerItemV2 copy(int resourceId, @NotNull String resourceTitle, @Nullable List<BannerItemDetail> bannerInfoList) {
        Intrinsics.checkNotNullParameter(resourceTitle, "resourceTitle");
        return new BannerItemV2(resourceId, resourceTitle, bannerInfoList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerItemV2)) {
            return false;
        }
        BannerItemV2 bannerItemV2 = (BannerItemV2) other;
        return this.resourceId == bannerItemV2.resourceId && Intrinsics.areEqual(this.resourceTitle, bannerItemV2.resourceTitle) && Intrinsics.areEqual(this.bannerInfoList, bannerItemV2.bannerInfoList);
    }

    @Nullable
    public final List<BannerItemDetail> getBannerInfoList() {
        return this.bannerInfoList;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    @NotNull
    public final String getResourceTitle() {
        return this.resourceTitle;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.resourceId) * 31) + this.resourceTitle.hashCode()) * 31;
        List<BannerItemDetail> list = this.bannerInfoList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "BannerItemV2(resourceId=" + this.resourceId + ", resourceTitle=" + this.resourceTitle + ", bannerInfoList=" + this.bannerInfoList + ")";
    }

    public /* synthetic */ BannerItemV2(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : list);
    }
}
