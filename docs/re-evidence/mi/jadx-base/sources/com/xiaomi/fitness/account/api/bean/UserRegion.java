package com.xiaomi.fitness.account.api.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/account/api/bean/UserRegion;", "", "region", "", "country", "adverseCountry", "adviseRegion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRegion", "()Ljava/lang/String;", "getCountry", "getAdverseCountry", "getAdviseRegion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserRegion {

    @SerializedName("advise_country")
    @NotNull
    private final String adverseCountry;

    @SerializedName("advise_region")
    @NotNull
    private final String adviseRegion;

    @SerializedName("country")
    @NotNull
    private final String country;

    @SerializedName("region")
    @NotNull
    private final String region;

    public UserRegion(@NotNull String region, @NotNull String country, @NotNull String adverseCountry, @NotNull String adviseRegion) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(adverseCountry, "adverseCountry");
        Intrinsics.checkNotNullParameter(adviseRegion, "adviseRegion");
        this.region = region;
        this.country = country;
        this.adverseCountry = adverseCountry;
        this.adviseRegion = adviseRegion;
    }

    public static /* synthetic */ UserRegion copy$default(UserRegion userRegion, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userRegion.region;
        }
        if ((i & 2) != 0) {
            str2 = userRegion.country;
        }
        if ((i & 4) != 0) {
            str3 = userRegion.adverseCountry;
        }
        if ((i & 8) != 0) {
            str4 = userRegion.adviseRegion;
        }
        return userRegion.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAdverseCountry() {
        return this.adverseCountry;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAdviseRegion() {
        return this.adviseRegion;
    }

    @NotNull
    public final UserRegion copy(@NotNull String region, @NotNull String country, @NotNull String adverseCountry, @NotNull String adviseRegion) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(adverseCountry, "adverseCountry");
        Intrinsics.checkNotNullParameter(adviseRegion, "adviseRegion");
        return new UserRegion(region, country, adverseCountry, adviseRegion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserRegion)) {
            return false;
        }
        UserRegion userRegion = (UserRegion) other;
        return Intrinsics.areEqual(this.region, userRegion.region) && Intrinsics.areEqual(this.country, userRegion.country) && Intrinsics.areEqual(this.adverseCountry, userRegion.adverseCountry) && Intrinsics.areEqual(this.adviseRegion, userRegion.adviseRegion);
    }

    @NotNull
    public final String getAdverseCountry() {
        return this.adverseCountry;
    }

    @NotNull
    public final String getAdviseRegion() {
        return this.adviseRegion;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return (((((this.region.hashCode() * 31) + this.country.hashCode()) * 31) + this.adverseCountry.hashCode()) * 31) + this.adviseRegion.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserRegion(region=" + this.region + ", country=" + this.country + ", adverseCountry=" + this.adverseCountry + ", adviseRegion=" + this.adviseRegion + ")";
    }
}
