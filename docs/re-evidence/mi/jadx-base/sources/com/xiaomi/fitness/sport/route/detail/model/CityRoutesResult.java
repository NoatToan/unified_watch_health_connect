package com.xiaomi.fitness.sport.route.detail.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/CityRoutesResult;", "", "supportCity", "", "Lcom/xiaomi/fitness/sport/route/detail/model/CityRouteCount;", "<init>", "(Ljava/util/List;)V", "getSupportCity", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CityRoutesResult {

    @SerializedName("support_city")
    @NotNull
    private final List<CityRouteCount> supportCity;

    public CityRoutesResult(@NotNull List<CityRouteCount> supportCity) {
        Intrinsics.checkNotNullParameter(supportCity, "supportCity");
        this.supportCity = supportCity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CityRoutesResult copy$default(CityRoutesResult cityRoutesResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cityRoutesResult.supportCity;
        }
        return cityRoutesResult.copy(list);
    }

    @NotNull
    public final List<CityRouteCount> component1() {
        return this.supportCity;
    }

    @NotNull
    public final CityRoutesResult copy(@NotNull List<CityRouteCount> supportCity) {
        Intrinsics.checkNotNullParameter(supportCity, "supportCity");
        return new CityRoutesResult(supportCity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CityRoutesResult) && Intrinsics.areEqual(this.supportCity, ((CityRoutesResult) other).supportCity);
    }

    @NotNull
    public final List<CityRouteCount> getSupportCity() {
        return this.supportCity;
    }

    public int hashCode() {
        return this.supportCity.hashCode();
    }

    @NotNull
    public String toString() {
        return "CityRoutesResult(supportCity=" + this.supportCity + ")";
    }
}
