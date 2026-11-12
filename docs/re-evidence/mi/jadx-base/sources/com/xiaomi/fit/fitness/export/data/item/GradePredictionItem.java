package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010JH\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012¨\u0006,"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/GradePredictionItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "fiveKilometreGradePrediction", "", "tenKilometreGradePrediction", "fullMarathonGradePrediction", "halfMarathonGradePrediction", "<init>", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTime", "()J", "setTime", "(J)V", "getFiveKilometreGradePrediction", "()Ljava/lang/Integer;", "setFiveKilometreGradePrediction", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTenKilometreGradePrediction", "setTenKilometreGradePrediction", "getFullMarathonGradePrediction", "setFullMarathonGradePrediction", "getHalfMarathonGradePrediction", "setHalfMarathonGradePrediction", "getTimestamp", "setTimestamp", "", "getGradePredictionValid", "", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/GradePredictionItem;", "equals", "other", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GradePredictionItem extends DailyRecordItem {

    @SerializedName("five_kilometre_grade_prediction_duration")
    @Nullable
    private Integer fiveKilometreGradePrediction;

    @SerializedName("full_marathon_grade_prediction_duration")
    @Nullable
    private Integer fullMarathonGradePrediction;

    @SerializedName("half_marathon_grade_prediction_duration")
    @Nullable
    private Integer halfMarathonGradePrediction;

    @SerializedName("ten_kilometre_grade_prediction_duration")
    @Nullable
    private Integer tenKilometreGradePrediction;

    @SerializedName("time")
    private long time;

    public GradePredictionItem(long j, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        super(null);
        this.time = j;
        this.fiveKilometreGradePrediction = num;
        this.tenKilometreGradePrediction = num2;
        this.fullMarathonGradePrediction = num3;
        this.halfMarathonGradePrediction = num4;
    }

    public static /* synthetic */ GradePredictionItem copy$default(GradePredictionItem gradePredictionItem, long j, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = gradePredictionItem.time;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            num = gradePredictionItem.fiveKilometreGradePrediction;
        }
        Integer num5 = num;
        if ((i & 4) != 0) {
            num2 = gradePredictionItem.tenKilometreGradePrediction;
        }
        Integer num6 = num2;
        if ((i & 8) != 0) {
            num3 = gradePredictionItem.fullMarathonGradePrediction;
        }
        Integer num7 = num3;
        if ((i & 16) != 0) {
            num4 = gradePredictionItem.halfMarathonGradePrediction;
        }
        return gradePredictionItem.copy(j2, num5, num6, num7, num4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getFiveKilometreGradePrediction() {
        return this.fiveKilometreGradePrediction;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTenKilometreGradePrediction() {
        return this.tenKilometreGradePrediction;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getFullMarathonGradePrediction() {
        return this.fullMarathonGradePrediction;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getHalfMarathonGradePrediction() {
        return this.halfMarathonGradePrediction;
    }

    @NotNull
    public final GradePredictionItem copy(long time, @Nullable Integer fiveKilometreGradePrediction, @Nullable Integer tenKilometreGradePrediction, @Nullable Integer fullMarathonGradePrediction, @Nullable Integer halfMarathonGradePrediction) {
        return new GradePredictionItem(time, fiveKilometreGradePrediction, tenKilometreGradePrediction, fullMarathonGradePrediction, halfMarathonGradePrediction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradePredictionItem)) {
            return false;
        }
        GradePredictionItem gradePredictionItem = (GradePredictionItem) other;
        return this.time == gradePredictionItem.time && Intrinsics.areEqual(this.fiveKilometreGradePrediction, gradePredictionItem.fiveKilometreGradePrediction) && Intrinsics.areEqual(this.tenKilometreGradePrediction, gradePredictionItem.tenKilometreGradePrediction) && Intrinsics.areEqual(this.fullMarathonGradePrediction, gradePredictionItem.fullMarathonGradePrediction) && Intrinsics.areEqual(this.halfMarathonGradePrediction, gradePredictionItem.halfMarathonGradePrediction);
    }

    @Nullable
    public final Integer getFiveKilometreGradePrediction() {
        return this.fiveKilometreGradePrediction;
    }

    @Nullable
    public final Integer getFullMarathonGradePrediction() {
        return this.fullMarathonGradePrediction;
    }

    public final boolean getGradePredictionValid() {
        Integer num = this.fiveKilometreGradePrediction;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = this.tenKilometreGradePrediction;
        int iIntValue2 = iIntValue + (num2 != null ? num2.intValue() : 0);
        Integer num3 = this.halfMarathonGradePrediction;
        int iIntValue3 = iIntValue2 + (num3 != null ? num3.intValue() : 0);
        Integer num4 = this.fullMarathonGradePrediction;
        return iIntValue3 + (num4 != null ? num4.intValue() : 0) > 0;
    }

    @Nullable
    public final Integer getHalfMarathonGradePrediction() {
        return this.halfMarathonGradePrediction;
    }

    @Nullable
    public final Integer getTenKilometreGradePrediction() {
        return this.tenKilometreGradePrediction;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        Integer num = this.fiveKilometreGradePrediction;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.tenKilometreGradePrediction;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.fullMarathonGradePrediction;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.halfMarathonGradePrediction;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final void setFiveKilometreGradePrediction(@Nullable Integer num) {
        this.fiveKilometreGradePrediction = num;
    }

    public final void setFullMarathonGradePrediction(@Nullable Integer num) {
        this.fullMarathonGradePrediction = num;
    }

    public final void setHalfMarathonGradePrediction(@Nullable Integer num) {
        this.halfMarathonGradePrediction = num;
    }

    public final void setTenKilometreGradePrediction(@Nullable Integer num) {
        this.tenKilometreGradePrediction = num;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    @NotNull
    public String toString() {
        return "GradePredictionItem(time=" + this.time + ", fiveKilometreGradePrediction=" + this.fiveKilometreGradePrediction + ", tenKilometreGradePrediction=" + this.tenKilometreGradePrediction + ", fullMarathonGradePrediction=" + this.fullMarathonGradePrediction + ", halfMarathonGradePrediction=" + this.halfMarathonGradePrediction + ")";
    }
}
