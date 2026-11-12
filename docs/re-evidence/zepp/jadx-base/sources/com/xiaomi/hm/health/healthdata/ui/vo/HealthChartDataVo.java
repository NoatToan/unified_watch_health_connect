package com.xiaomi.hm.health.healthdata.ui.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J5\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001a¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "", "", "component1", "", "component2", "Ljava/util/Date;", "component3", "component4", "index", "value", "uploadTime", "extra", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "c", "Ljava/util/Date;", "getUploadTime", "()Ljava/util/Date;", GoogleApiAvailabilityLight.a, "getExtra", "<init>", "(ILjava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HealthChartDataVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Date uploadTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String extra;

    public HealthChartDataVo(int i, @NotNull String str, @Nullable Date date, @Nullable String str2) {
        this.index = i;
        this.value = str;
        this.uploadTime = date;
        this.extra = str2;
    }

    public static /* synthetic */ HealthChartDataVo copy$default(HealthChartDataVo healthChartDataVo, int i, String str, Date date, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = healthChartDataVo.index;
        }
        if ((i2 & 2) != 0) {
            str = healthChartDataVo.value;
        }
        if ((i2 & 4) != 0) {
            date = healthChartDataVo.uploadTime;
        }
        if ((i2 & 8) != 0) {
            str2 = healthChartDataVo.extra;
        }
        return healthChartDataVo.copy(i, str, date, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUploadTime() {
        return this.uploadTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final HealthChartDataVo copy(int index, @NotNull String value, @Nullable Date uploadTime, @Nullable String extra) {
        return new HealthChartDataVo(index, value, uploadTime, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthChartDataVo)) {
            return false;
        }
        HealthChartDataVo healthChartDataVo = (HealthChartDataVo) other;
        return this.index == healthChartDataVo.index && Intrinsics.areEqual(this.value, healthChartDataVo.value) && Intrinsics.areEqual(this.uploadTime, healthChartDataVo.uploadTime) && Intrinsics.areEqual(this.extra, healthChartDataVo.extra);
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final Date getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((this.index * 31) + this.value.hashCode()) * 31;
        Date date = this.uploadTime;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.extra;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HealthChartDataVo(index=" + this.index + ", value=" + this.value + ", uploadTime=" + this.uploadTime + ", extra=" + this.extra + ")";
    }

    public /* synthetic */ HealthChartDataVo(int i, String str, Date date, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, date, (i2 & 8) != 0 ? null : str2);
    }
}
