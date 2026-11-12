package com.fitness.banner.export.compare;

import com.fitness.banner.export.BannerItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/fitness/banner/export/compare/BannerResponseResultV1;", "", "bannerList", "", "Lcom/fitness/banner/export/BannerItem;", "<init>", "(Ljava/util/List;)V", "getBannerList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BannerResponseResultV1 {

    @SerializedName("list")
    @Nullable
    private final List<BannerItem> bannerList;

    public BannerResponseResultV1(@Nullable List<BannerItem> list) {
        this.bannerList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerResponseResultV1 copy$default(BannerResponseResultV1 bannerResponseResultV1, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bannerResponseResultV1.bannerList;
        }
        return bannerResponseResultV1.copy(list);
    }

    @Nullable
    public final List<BannerItem> component1() {
        return this.bannerList;
    }

    @NotNull
    public final BannerResponseResultV1 copy(@Nullable List<BannerItem> bannerList) {
        return new BannerResponseResultV1(bannerList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BannerResponseResultV1) && Intrinsics.areEqual(this.bannerList, ((BannerResponseResultV1) other).bannerList);
    }

    @Nullable
    public final List<BannerItem> getBannerList() {
        return this.bannerList;
    }

    public int hashCode() {
        List<BannerItem> list = this.bannerList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "BannerResponseResultV1(bannerList=" + this.bannerList + ")";
    }
}
