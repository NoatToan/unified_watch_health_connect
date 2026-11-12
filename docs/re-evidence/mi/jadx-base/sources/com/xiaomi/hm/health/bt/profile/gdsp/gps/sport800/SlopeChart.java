package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SlopeChart;", "", "uphillDistance", "", "downhillDistance", "uphillTime", "downhillTime", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDownhillDistance", "()Ljava/lang/Integer;", "setDownhillDistance", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDownhillTime", "setDownhillTime", "getUphillDistance", "setUphillDistance", "getUphillTime", "setUphillTime", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SlopeChart;", "equals", "", "other", "hashCode", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SlopeChart {

    @Nullable
    private Integer downhillDistance;

    @Nullable
    private Integer downhillTime;

    @Nullable
    private Integer uphillDistance;

    @Nullable
    private Integer uphillTime;

    public SlopeChart() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SlopeChart copy$default(SlopeChart slopeChart, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = slopeChart.uphillDistance;
        }
        if ((i & 2) != 0) {
            num2 = slopeChart.downhillDistance;
        }
        if ((i & 4) != 0) {
            num3 = slopeChart.uphillTime;
        }
        if ((i & 8) != 0) {
            num4 = slopeChart.downhillTime;
        }
        return slopeChart.copy(num, num2, num3, num4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getUphillDistance() {
        return this.uphillDistance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDownhillDistance() {
        return this.downhillDistance;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getUphillTime() {
        return this.uphillTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getDownhillTime() {
        return this.downhillTime;
    }

    @NotNull
    public final SlopeChart copy(@Nullable Integer uphillDistance, @Nullable Integer downhillDistance, @Nullable Integer uphillTime, @Nullable Integer downhillTime) {
        return new SlopeChart(uphillDistance, downhillDistance, uphillTime, downhillTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlopeChart)) {
            return false;
        }
        SlopeChart slopeChart = (SlopeChart) other;
        return Intrinsics.areEqual(this.uphillDistance, slopeChart.uphillDistance) && Intrinsics.areEqual(this.downhillDistance, slopeChart.downhillDistance) && Intrinsics.areEqual(this.uphillTime, slopeChart.uphillTime) && Intrinsics.areEqual(this.downhillTime, slopeChart.downhillTime);
    }

    @Nullable
    public final Integer getDownhillDistance() {
        return this.downhillDistance;
    }

    @Nullable
    public final Integer getDownhillTime() {
        return this.downhillTime;
    }

    @Nullable
    public final Integer getUphillDistance() {
        return this.uphillDistance;
    }

    @Nullable
    public final Integer getUphillTime() {
        return this.uphillTime;
    }

    public int hashCode() {
        Integer num = this.uphillDistance;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.downhillDistance;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.uphillTime;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.downhillTime;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final void setDownhillDistance(@Nullable Integer num) {
        this.downhillDistance = num;
    }

    public final void setDownhillTime(@Nullable Integer num) {
        this.downhillTime = num;
    }

    public final void setUphillDistance(@Nullable Integer num) {
        this.uphillDistance = num;
    }

    public final void setUphillTime(@Nullable Integer num) {
        this.uphillTime = num;
    }

    @NotNull
    public String toString() {
        return "SlopeChart(uphillDistance=" + this.uphillDistance + ", downhillDistance=" + this.downhillDistance + ", uphillTime=" + this.uphillTime + ", downhillTime=" + this.downhillTime + ')';
    }

    public SlopeChart(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.uphillDistance = num;
        this.downhillDistance = num2;
        this.uphillTime = num3;
        this.downhillTime = num4;
    }

    public /* synthetic */ SlopeChart(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }
}
