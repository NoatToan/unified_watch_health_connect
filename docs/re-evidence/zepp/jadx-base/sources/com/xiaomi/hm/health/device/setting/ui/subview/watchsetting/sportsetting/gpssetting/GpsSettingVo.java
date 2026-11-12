package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsFrequency;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsMode;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.LocationCombination;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.SearchStarPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJJ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\f\"\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingVo;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "component1", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsFrequency;", "component2", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;", "component3", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/SearchStarPreference;", "component4", "", "component5", "()Ljava/lang/Integer;", "gpsMode", "gpsFrequency", "locationCombination", "searchStarPreference", "dataInterval", "copy", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsFrequency;Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/SearchStarPreference;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingVo;", "", "toString", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "getGpsMode", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "b", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsFrequency;", "getGpsFrequency", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsFrequency;", "setGpsFrequency", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsFrequency;)V", "c", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;", "getLocationCombination", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;", "setLocationCombination", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;)V", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/SearchStarPreference;", "getSearchStarPreference", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/SearchStarPreference;", "setSearchStarPreference", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/SearchStarPreference;)V", "e", "Ljava/lang/Integer;", "getDataInterval", "setDataInterval", "(Ljava/lang/Integer;)V", "<init>", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsFrequency;Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/SearchStarPreference;Ljava/lang/Integer;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GpsSettingVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final GpsMode gpsMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private GpsFrequency gpsFrequency;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private LocationCombination locationCombination;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private SearchStarPreference searchStarPreference;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer dataInterval;

    public GpsSettingVo(@NotNull GpsMode gpsMode, @Nullable GpsFrequency gpsFrequency, @Nullable LocationCombination locationCombination, @Nullable SearchStarPreference searchStarPreference, @Nullable Integer num) {
        this.gpsMode = gpsMode;
        this.gpsFrequency = gpsFrequency;
        this.locationCombination = locationCombination;
        this.searchStarPreference = searchStarPreference;
        this.dataInterval = num;
    }

    public static /* synthetic */ GpsSettingVo copy$default(GpsSettingVo gpsSettingVo, GpsMode gpsMode, GpsFrequency gpsFrequency, LocationCombination locationCombination, SearchStarPreference searchStarPreference, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            gpsMode = gpsSettingVo.gpsMode;
        }
        if ((i & 2) != 0) {
            gpsFrequency = gpsSettingVo.gpsFrequency;
        }
        GpsFrequency gpsFrequency2 = gpsFrequency;
        if ((i & 4) != 0) {
            locationCombination = gpsSettingVo.locationCombination;
        }
        LocationCombination locationCombination2 = locationCombination;
        if ((i & 8) != 0) {
            searchStarPreference = gpsSettingVo.searchStarPreference;
        }
        SearchStarPreference searchStarPreference2 = searchStarPreference;
        if ((i & 16) != 0) {
            num = gpsSettingVo.dataInterval;
        }
        return gpsSettingVo.copy(gpsMode, gpsFrequency2, locationCombination2, searchStarPreference2, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GpsMode getGpsMode() {
        return this.gpsMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GpsFrequency getGpsFrequency() {
        return this.gpsFrequency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LocationCombination getLocationCombination() {
        return this.locationCombination;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SearchStarPreference getSearchStarPreference() {
        return this.searchStarPreference;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getDataInterval() {
        return this.dataInterval;
    }

    @NotNull
    public final GpsSettingVo copy(@NotNull GpsMode gpsMode, @Nullable GpsFrequency gpsFrequency, @Nullable LocationCombination locationCombination, @Nullable SearchStarPreference searchStarPreference, @Nullable Integer dataInterval) {
        return new GpsSettingVo(gpsMode, gpsFrequency, locationCombination, searchStarPreference, dataInterval);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsSettingVo)) {
            return false;
        }
        GpsSettingVo gpsSettingVo = (GpsSettingVo) other;
        return this.gpsMode == gpsSettingVo.gpsMode && this.gpsFrequency == gpsSettingVo.gpsFrequency && this.locationCombination == gpsSettingVo.locationCombination && this.searchStarPreference == gpsSettingVo.searchStarPreference && Intrinsics.areEqual(this.dataInterval, gpsSettingVo.dataInterval);
    }

    @Nullable
    public final Integer getDataInterval() {
        return this.dataInterval;
    }

    @Nullable
    public final GpsFrequency getGpsFrequency() {
        return this.gpsFrequency;
    }

    @NotNull
    public final GpsMode getGpsMode() {
        return this.gpsMode;
    }

    @Nullable
    public final LocationCombination getLocationCombination() {
        return this.locationCombination;
    }

    @Nullable
    public final SearchStarPreference getSearchStarPreference() {
        return this.searchStarPreference;
    }

    public int hashCode() {
        int iHashCode = this.gpsMode.hashCode() * 31;
        GpsFrequency gpsFrequency = this.gpsFrequency;
        int iHashCode2 = (iHashCode + (gpsFrequency == null ? 0 : gpsFrequency.hashCode())) * 31;
        LocationCombination locationCombination = this.locationCombination;
        int iHashCode3 = (iHashCode2 + (locationCombination == null ? 0 : locationCombination.hashCode())) * 31;
        SearchStarPreference searchStarPreference = this.searchStarPreference;
        int iHashCode4 = (iHashCode3 + (searchStarPreference == null ? 0 : searchStarPreference.hashCode())) * 31;
        Integer num = this.dataInterval;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final void setDataInterval(@Nullable Integer num) {
        this.dataInterval = num;
    }

    public final void setGpsFrequency(@Nullable GpsFrequency gpsFrequency) {
        this.gpsFrequency = gpsFrequency;
    }

    public final void setLocationCombination(@Nullable LocationCombination locationCombination) {
        this.locationCombination = locationCombination;
    }

    public final void setSearchStarPreference(@Nullable SearchStarPreference searchStarPreference) {
        this.searchStarPreference = searchStarPreference;
    }

    @NotNull
    public String toString() {
        return "GpsSettingVo(gpsMode=" + this.gpsMode + ", gpsFrequency=" + this.gpsFrequency + ", locationCombination=" + this.locationCombination + ", searchStarPreference=" + this.searchStarPreference + ", dataInterval=" + this.dataInterval + ")";
    }
}
