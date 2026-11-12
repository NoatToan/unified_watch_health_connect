package com.fitness.banner.export;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0014J@\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/fitness/banner/export/BannerRequestParamV2;", "", "resourceIdList", "", "", "country", "", "cityId", "", "limit", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "getResourceIdList", "()Ljava/util/List;", "getCountry", "()Ljava/lang/String;", "getCityId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/fitness/banner/export/BannerRequestParamV2;", "equals", "", "other", "hashCode", "toString", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BannerRequestParamV2 {

    @Nullable
    private final Long cityId;

    @NotNull
    private final String country;

    @Nullable
    private final Integer limit;

    @NotNull
    private final List<Integer> resourceIdList;

    public BannerRequestParamV2(@NotNull List<Integer> resourceIdList, @NotNull String country, @Nullable Long l, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(resourceIdList, "resourceIdList");
        Intrinsics.checkNotNullParameter(country, "country");
        this.resourceIdList = resourceIdList;
        this.country = country;
        this.cityId = l;
        this.limit = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerRequestParamV2 copy$default(BannerRequestParamV2 bannerRequestParamV2, List list, String str, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bannerRequestParamV2.resourceIdList;
        }
        if ((i & 2) != 0) {
            str = bannerRequestParamV2.country;
        }
        if ((i & 4) != 0) {
            l = bannerRequestParamV2.cityId;
        }
        if ((i & 8) != 0) {
            num = bannerRequestParamV2.limit;
        }
        return bannerRequestParamV2.copy(list, str, l, num);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.resourceIdList;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCityId() {
        return this.cityId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    @NotNull
    public final BannerRequestParamV2 copy(@NotNull List<Integer> resourceIdList, @NotNull String country, @Nullable Long cityId, @Nullable Integer limit) {
        Intrinsics.checkNotNullParameter(resourceIdList, "resourceIdList");
        Intrinsics.checkNotNullParameter(country, "country");
        return new BannerRequestParamV2(resourceIdList, country, cityId, limit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerRequestParamV2)) {
            return false;
        }
        BannerRequestParamV2 bannerRequestParamV2 = (BannerRequestParamV2) other;
        return Intrinsics.areEqual(this.resourceIdList, bannerRequestParamV2.resourceIdList) && Intrinsics.areEqual(this.country, bannerRequestParamV2.country) && Intrinsics.areEqual(this.cityId, bannerRequestParamV2.cityId) && Intrinsics.areEqual(this.limit, bannerRequestParamV2.limit);
    }

    @Nullable
    public final Long getCityId() {
        return this.cityId;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final Integer getLimit() {
        return this.limit;
    }

    @NotNull
    public final List<Integer> getResourceIdList() {
        return this.resourceIdList;
    }

    public int hashCode() {
        int iHashCode = ((this.resourceIdList.hashCode() * 31) + this.country.hashCode()) * 31;
        Long l = this.cityId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.limit;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BannerRequestParamV2(resourceIdList=" + this.resourceIdList + ", country=" + this.country + ", cityId=" + this.cityId + ", limit=" + this.limit + ")";
    }

    public /* synthetic */ BannerRequestParamV2(List list, String str, Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num);
    }
}
