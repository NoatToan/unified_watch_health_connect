package com.xiaomi.hm.health.device.setting.vo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/WeatherSettingVo;", "", "", "component1", "", "component2", "isSupport", "cityName", "copy", "toString", "", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "Ljava/lang/String;", "getCityName", "()Ljava/lang/String;", "<init>", "(ZLjava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeatherSettingVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String cityName;

    public WeatherSettingVo(boolean z, @NotNull String str) {
        this.isSupport = z;
        this.cityName = str;
    }

    public static /* synthetic */ WeatherSettingVo copy$default(WeatherSettingVo weatherSettingVo, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = weatherSettingVo.isSupport;
        }
        if ((i & 2) != 0) {
            str = weatherSettingVo.cityName;
        }
        return weatherSettingVo.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCityName() {
        return this.cityName;
    }

    @NotNull
    public final WeatherSettingVo copy(boolean isSupport, @NotNull String cityName) {
        return new WeatherSettingVo(isSupport, cityName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeatherSettingVo)) {
            return false;
        }
        WeatherSettingVo weatherSettingVo = (WeatherSettingVo) other;
        return this.isSupport == weatherSettingVo.isSupport && Intrinsics.areEqual(this.cityName, weatherSettingVo.cityName);
    }

    @NotNull
    public final String getCityName() {
        return this.cityName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.cityName.hashCode();
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "WeatherSettingVo(isSupport=" + this.isSupport + ", cityName=" + this.cityName + ")";
    }
}
