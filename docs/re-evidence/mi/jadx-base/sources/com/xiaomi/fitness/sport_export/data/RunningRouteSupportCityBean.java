package com.xiaomi.fitness.sport_export.data;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", "", TSMAuthContants.PARAM_CITYCODE, "", "officialOpen", "", "aiOpen", "<init>", "(Ljava/lang/String;ZZ)V", "getCityCode", "()Ljava/lang/String;", "getOfficialOpen", "()Z", "getAiOpen", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "sport-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RunningRouteSupportCityBean {

    @SerializedName("ai_open")
    private final boolean aiOpen;

    @SerializedName("city_code")
    @NotNull
    private final String cityCode;

    @SerializedName("official_open")
    private final boolean officialOpen;

    public RunningRouteSupportCityBean(@NotNull String cityCode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        this.cityCode = cityCode;
        this.officialOpen = z;
        this.aiOpen = z2;
    }

    public static /* synthetic */ RunningRouteSupportCityBean copy$default(RunningRouteSupportCityBean runningRouteSupportCityBean, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runningRouteSupportCityBean.cityCode;
        }
        if ((i & 2) != 0) {
            z = runningRouteSupportCityBean.officialOpen;
        }
        if ((i & 4) != 0) {
            z2 = runningRouteSupportCityBean.aiOpen;
        }
        return runningRouteSupportCityBean.copy(str, z, z2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCityCode() {
        return this.cityCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getOfficialOpen() {
        return this.officialOpen;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAiOpen() {
        return this.aiOpen;
    }

    @NotNull
    public final RunningRouteSupportCityBean copy(@NotNull String cityCode, boolean officialOpen, boolean aiOpen) {
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        return new RunningRouteSupportCityBean(cityCode, officialOpen, aiOpen);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunningRouteSupportCityBean)) {
            return false;
        }
        RunningRouteSupportCityBean runningRouteSupportCityBean = (RunningRouteSupportCityBean) other;
        return Intrinsics.areEqual(this.cityCode, runningRouteSupportCityBean.cityCode) && this.officialOpen == runningRouteSupportCityBean.officialOpen && this.aiOpen == runningRouteSupportCityBean.aiOpen;
    }

    public final boolean getAiOpen() {
        return this.aiOpen;
    }

    @NotNull
    public final String getCityCode() {
        return this.cityCode;
    }

    public final boolean getOfficialOpen() {
        return this.officialOpen;
    }

    public int hashCode() {
        return (((this.cityCode.hashCode() * 31) + Boolean.hashCode(this.officialOpen)) * 31) + Boolean.hashCode(this.aiOpen);
    }

    @NotNull
    public String toString() {
        return "RunningRouteSupportCityBean(cityCode=" + this.cityCode + ", officialOpen=" + this.officialOpen + ", aiOpen=" + this.aiOpen + ")";
    }
}
