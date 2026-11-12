package com.huami.module.homepage.cards.business.heartrate;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.dataflow.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b0\u00101J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004\"\u0004\b\u001d\u0010\u001eR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0004\"\u0004\b!\u0010\u001eR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u0004\"\u0004\b$\u0010\u001eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u0004\"\u0004\b'\u0010\u001eR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u0004\"\u0004\b*\u0010\u001eR$\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/huami/module/homepage/cards/business/heartrate/HeartRateEntry;", "", "", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "", "component6", "()Ljava/lang/Long;", "restHeartRate", "minHeartRate", "maxHeartRate", "avgHeartRate", Constant.KEY_HR_VALUE, "time", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/huami/module/homepage/cards/business/heartrate/HeartRateEntry;", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "getRestHeartRate", "setRestHeartRate", "(Ljava/lang/Integer;)V", "b", "getMinHeartRate", "setMinHeartRate", "c", "getMaxHeartRate", "setMaxHeartRate", GoogleApiAvailabilityLight.a, "getAvgHeartRate", "setAvgHeartRate", "e", "getHeartRate", "setHeartRate", "f", "Ljava/lang/Long;", "getTime", "setTime", "(Ljava/lang/Long;)V", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeartRateEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer restHeartRate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer minHeartRate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer maxHeartRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer avgHeartRate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer heartRate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private Long time;

    public HeartRateEntry() {
        this(null, null, null, null, null, null, 63, null);
    }

    public HeartRateEntry(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Long l) {
        this.restHeartRate = num;
        this.minHeartRate = num2;
        this.maxHeartRate = num3;
        this.avgHeartRate = num4;
        this.heartRate = num5;
        this.time = l;
    }

    public static /* synthetic */ HeartRateEntry copy$default(HeartRateEntry heartRateEntry, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            num = heartRateEntry.restHeartRate;
        }
        if ((i & 2) != 0) {
            num2 = heartRateEntry.minHeartRate;
        }
        Integer num6 = num2;
        if ((i & 4) != 0) {
            num3 = heartRateEntry.maxHeartRate;
        }
        Integer num7 = num3;
        if ((i & 8) != 0) {
            num4 = heartRateEntry.avgHeartRate;
        }
        Integer num8 = num4;
        if ((i & 16) != 0) {
            num5 = heartRateEntry.heartRate;
        }
        Integer num9 = num5;
        if ((i & 32) != 0) {
            l = heartRateEntry.time;
        }
        return heartRateEntry.copy(num, num6, num7, num8, num9, l);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRestHeartRate() {
        return this.restHeartRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMinHeartRate() {
        return this.minHeartRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMaxHeartRate() {
        return this.maxHeartRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getAvgHeartRate() {
        return this.avgHeartRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getHeartRate() {
        return this.heartRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @NotNull
    public final HeartRateEntry copy(@Nullable Integer restHeartRate, @Nullable Integer minHeartRate, @Nullable Integer maxHeartRate, @Nullable Integer avgHeartRate, @Nullable Integer heartRate, @Nullable Long time) {
        return new HeartRateEntry(restHeartRate, minHeartRate, maxHeartRate, avgHeartRate, heartRate, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateEntry)) {
            return false;
        }
        HeartRateEntry heartRateEntry = (HeartRateEntry) other;
        return Intrinsics.areEqual(this.restHeartRate, heartRateEntry.restHeartRate) && Intrinsics.areEqual(this.minHeartRate, heartRateEntry.minHeartRate) && Intrinsics.areEqual(this.maxHeartRate, heartRateEntry.maxHeartRate) && Intrinsics.areEqual(this.avgHeartRate, heartRateEntry.avgHeartRate) && Intrinsics.areEqual(this.heartRate, heartRateEntry.heartRate) && Intrinsics.areEqual(this.time, heartRateEntry.time);
    }

    @Nullable
    public final Integer getAvgHeartRate() {
        return this.avgHeartRate;
    }

    @Nullable
    public final Integer getHeartRate() {
        return this.heartRate;
    }

    @Nullable
    public final Integer getMaxHeartRate() {
        return this.maxHeartRate;
    }

    @Nullable
    public final Integer getMinHeartRate() {
        return this.minHeartRate;
    }

    @Nullable
    public final Integer getRestHeartRate() {
        return this.restHeartRate;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        Integer num = this.restHeartRate;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.minHeartRate;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxHeartRate;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.avgHeartRate;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.heartRate;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l = this.time;
        return iHashCode5 + (l != null ? l.hashCode() : 0);
    }

    public final void setAvgHeartRate(@Nullable Integer num) {
        this.avgHeartRate = num;
    }

    public final void setHeartRate(@Nullable Integer num) {
        this.heartRate = num;
    }

    public final void setMaxHeartRate(@Nullable Integer num) {
        this.maxHeartRate = num;
    }

    public final void setMinHeartRate(@Nullable Integer num) {
        this.minHeartRate = num;
    }

    public final void setRestHeartRate(@Nullable Integer num) {
        this.restHeartRate = num;
    }

    public final void setTime(@Nullable Long l) {
        this.time = l;
    }

    @NotNull
    public String toString() {
        return "HeartRateEntry(restHeartRate=" + this.restHeartRate + ", minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", avgHeartRate=" + this.avgHeartRate + ", heartRate=" + this.heartRate + ", time=" + this.time + ")";
    }

    public /* synthetic */ HeartRateEntry(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : l);
    }
}
