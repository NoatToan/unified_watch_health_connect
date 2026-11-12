package com.huami.heartrate.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/heartrate/vo/BarPeriodInfo;", "", "", "component1", "component2", "", "component3", "component4", "min", "max", "periodFrom", "periodEnd", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getMin", "()I", "b", "getMax", "c", "Ljava/lang/String;", "getPeriodFrom", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getPeriodEnd", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BarPeriodInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int min;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int max;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String periodFrom;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String periodEnd;

    public BarPeriodInfo(int i, int i2, @Nullable String str, @Nullable String str2) {
        this.min = i;
        this.max = i2;
        this.periodFrom = str;
        this.periodEnd = str2;
    }

    public static /* synthetic */ BarPeriodInfo copy$default(BarPeriodInfo barPeriodInfo, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = barPeriodInfo.min;
        }
        if ((i3 & 2) != 0) {
            i2 = barPeriodInfo.max;
        }
        if ((i3 & 4) != 0) {
            str = barPeriodInfo.periodFrom;
        }
        if ((i3 & 8) != 0) {
            str2 = barPeriodInfo.periodEnd;
        }
        return barPeriodInfo.copy(i, i2, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPeriodFrom() {
        return this.periodFrom;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPeriodEnd() {
        return this.periodEnd;
    }

    @NotNull
    public final BarPeriodInfo copy(int min, int max, @Nullable String periodFrom, @Nullable String periodEnd) {
        return new BarPeriodInfo(min, max, periodFrom, periodEnd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarPeriodInfo)) {
            return false;
        }
        BarPeriodInfo barPeriodInfo = (BarPeriodInfo) other;
        return this.min == barPeriodInfo.min && this.max == barPeriodInfo.max && Intrinsics.areEqual(this.periodFrom, barPeriodInfo.periodFrom) && Intrinsics.areEqual(this.periodEnd, barPeriodInfo.periodEnd);
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    @Nullable
    public final String getPeriodEnd() {
        return this.periodEnd;
    }

    @Nullable
    public final String getPeriodFrom() {
        return this.periodFrom;
    }

    public int hashCode() {
        int i = ((this.min * 31) + this.max) * 31;
        String str = this.periodFrom;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.periodEnd;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BarPeriodInfo(min=" + this.min + ", max=" + this.max + ", periodFrom=" + this.periodFrom + ", periodEnd=" + this.periodEnd + ")";
    }

    public /* synthetic */ BarPeriodInfo(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, (i3 & 8) != 0 ? str : str2);
    }
}
