package com.huami.worldclock.bean;

import com.amap.api.mapcore.util.hl;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0007HÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\"\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010#R\"\u00103\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\u0016\u00105\u001a\u00020\u00078V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001cR\u0016\u00106\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010%¨\u00069"}, d2 = {"Lcom/huami/worldclock/bean/WorldClockCityBean;", "Lcom/huami/worldclock/bean/BaseIndexAlphabeticBean;", "", "isShowSuspension", "visible", "", "setVisibleSuspension", "", "toString", "component1", "component2", "component3", "component4", "component5", "cityCN", "city", "mainCity", "identifier", "cityCode", "copy", "", "hashCode", "", "other", "equals", "e", "Ljava/lang/String;", "getCityCN", "()Ljava/lang/String;", "setCityCN", "(Ljava/lang/String;)V", "f", "getCity", "setCity", "g", "Z", "getMainCity", "()Z", "setMainCity", "(Z)V", "h", "getIdentifier", "setIdentifier", "i", "getCityCode", "setCityCode", z.j, "isVisibleSuspension", hl.k, "getCityLocal", "setCityLocal", "cityLocal", "getTarget", "target", "isNeedToAlphabetic", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WorldClockCityBean extends BaseIndexAlphabeticBean {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private String cityCN;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private String city;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean mainCity;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private String identifier;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private String cityCode;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isVisibleSuspension;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private String cityLocal;

    public WorldClockCityBean() {
        this(null, null, false, null, null, 31, null);
    }

    public /* synthetic */ WorldClockCityBean(String str, String str2, boolean z, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }

    public static /* synthetic */ WorldClockCityBean copy$default(WorldClockCityBean worldClockCityBean, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = worldClockCityBean.cityCN;
        }
        if ((i & 2) != 0) {
            str2 = worldClockCityBean.city;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            z = worldClockCityBean.mainCity;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = worldClockCityBean.identifier;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = worldClockCityBean.cityCode;
        }
        return worldClockCityBean.copy(str, str5, z2, str6, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCityCN() {
        return this.cityCN;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getMainCity() {
        return this.mainCity;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCityCode() {
        return this.cityCode;
    }

    @NotNull
    public final WorldClockCityBean copy(@NotNull String cityCN, @NotNull String city, boolean mainCity, @NotNull String identifier, @NotNull String cityCode) {
        return new WorldClockCityBean(cityCN, city, mainCity, identifier, cityCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorldClockCityBean)) {
            return false;
        }
        WorldClockCityBean worldClockCityBean = (WorldClockCityBean) other;
        return Intrinsics.areEqual(this.cityCN, worldClockCityBean.cityCN) && Intrinsics.areEqual(this.city, worldClockCityBean.city) && this.mainCity == worldClockCityBean.mainCity && Intrinsics.areEqual(this.identifier, worldClockCityBean.identifier) && Intrinsics.areEqual(this.cityCode, worldClockCityBean.cityCode);
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getCityCN() {
        return this.cityCN;
    }

    @NotNull
    public final String getCityCode() {
        return this.cityCode;
    }

    @NotNull
    public final String getCityLocal() {
        return this.cityLocal;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    public final boolean getMainCity() {
        return this.mainCity;
    }

    @Override // com.huami.worldclock.bean.BaseIndexAlphabeticBean
    @NotNull
    public String getTarget() {
        return this.cityLocal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((this.cityCN.hashCode() * 31) + this.city.hashCode()) * 31;
        boolean z = this.mainCity;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.identifier.hashCode()) * 31) + this.cityCode.hashCode();
    }

    @Override // com.huami.worldclock.bean.BaseIndexAlphabeticBean
    public boolean isNeedToAlphabetic() {
        return true;
    }

    @Override // com.huami.worldclock.bean.BaseIndexBean, com.huami.worldclock.add.alphabetic.ISuspensionInterface
    /* JADX INFO: renamed from: isShowSuspension, reason: from getter */
    public boolean getIsVisibleSuspension() {
        return this.isVisibleSuspension;
    }

    public final void setCity(@NotNull String str) {
        this.city = str;
    }

    public final void setCityCN(@NotNull String str) {
        this.cityCN = str;
    }

    public final void setCityCode(@NotNull String str) {
        this.cityCode = str;
    }

    public final void setCityLocal(@NotNull String str) {
        this.cityLocal = str;
    }

    public final void setIdentifier(@NotNull String str) {
        this.identifier = str;
    }

    public final void setMainCity(boolean z) {
        this.mainCity = z;
    }

    public final void setVisibleSuspension(boolean visible) {
        this.isVisibleSuspension = visible;
    }

    @NotNull
    public String toString() {
        return "cityCN:" + this.cityCN + ",city:" + this.cityCN + ",identifier:" + this.identifier + ",cityCode:" + this.cityCode;
    }

    public WorldClockCityBean(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        this.cityCN = str;
        this.city = str2;
        this.mainCity = z;
        this.identifier = str3;
        this.cityCode = str4;
        this.isVisibleSuspension = true;
        this.cityLocal = "";
    }
}
