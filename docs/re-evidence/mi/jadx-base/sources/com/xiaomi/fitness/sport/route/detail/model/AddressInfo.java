package com.xiaomi.fitness.sport.route.detail.model;

import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u0003H\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/AddressInfo;", "", "title", "", TSMAuthContants.PARAM_CITYCODE, "city", "startName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getCityCode", "getCity", "getStartName", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddressInfo {

    @NotNull
    private final String city;

    @NotNull
    private final String cityCode;

    @NotNull
    private final String startName;

    @NotNull
    private final String title;

    public AddressInfo(@NotNull String title, @NotNull String cityCode, @NotNull String city, @NotNull String startName) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(startName, "startName");
        this.title = title;
        this.cityCode = cityCode;
        this.city = city;
        this.startName = startName;
    }

    public static /* synthetic */ AddressInfo copy$default(AddressInfo addressInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = addressInfo.cityCode;
        }
        if ((i & 4) != 0) {
            str3 = addressInfo.city;
        }
        if ((i & 8) != 0) {
            str4 = addressInfo.startName;
        }
        return addressInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCityCode() {
        return this.cityCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStartName() {
        return this.startName;
    }

    @NotNull
    public final AddressInfo copy(@NotNull String title, @NotNull String cityCode, @NotNull String city, @NotNull String startName) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(startName, "startName");
        return new AddressInfo(title, cityCode, city, startName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressInfo)) {
            return false;
        }
        AddressInfo addressInfo = (AddressInfo) other;
        return Intrinsics.areEqual(this.title, addressInfo.title) && Intrinsics.areEqual(this.cityCode, addressInfo.cityCode) && Intrinsics.areEqual(this.city, addressInfo.city) && Intrinsics.areEqual(this.startName, addressInfo.startName);
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getCityCode() {
        return this.cityCode;
    }

    @NotNull
    public final String getStartName() {
        return this.startName;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.cityCode.hashCode()) * 31) + this.city.hashCode()) * 31) + this.startName.hashCode();
    }

    @NotNull
    public String toString() {
        return "{title:" + this.title + ",cityCode:" + this.cityCode + ",city:" + this.city + ",startName:" + this.startName + "}";
    }
}
