package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\"\u001a\u00020\u0003H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0006\u0010%\u001a\u00020\u0005J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJX\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u00068"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/VitalityItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "dayLowIntensityVitality", "", "dayMediumIntensityVitality", "dayHighIntensityVitality", "total7daysVitality", "suggestActivityType", "suggestActivityDuration", "<init>", "(JIIIILjava/lang/Integer;Ljava/lang/Integer;)V", "getTime", "()J", "setTime", "(J)V", "getDayLowIntensityVitality", "()I", "setDayLowIntensityVitality", "(I)V", "getDayMediumIntensityVitality", "setDayMediumIntensityVitality", "getDayHighIntensityVitality", "setDayHighIntensityVitality", "getTotal7daysVitality", "setTotal7daysVitality", "getSuggestActivityType", "()Ljava/lang/Integer;", "setSuggestActivityType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSuggestActivityDuration", "setSuggestActivityDuration", "getTimestamp", "setTimestamp", "", "getDayTotalVitality", "getPrimaryValue", "", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JIIIILjava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/VitalityItem;", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VitalityItem extends DailyRecordItem {

    /* JADX INFO: renamed from: dayHighIntensityVitality, reason: from kotlin metadata and from toString */
    @SerializedName("daily_high_intensity_vitality")
    private int highVitality;

    /* JADX INFO: renamed from: dayLowIntensityVitality, reason: from kotlin metadata and from toString */
    @SerializedName("daily_low_intensity_vitality")
    private int lowVitality;

    /* JADX INFO: renamed from: dayMediumIntensityVitality, reason: from kotlin metadata and from toString */
    @SerializedName("daily_medium_intensity_vitality")
    private int mediumVitality;

    /* JADX INFO: renamed from: suggestActivityDuration, reason: from kotlin metadata and from toString */
    @SerializedName("suggested_activity_duration")
    @Nullable
    private Integer activityDuration;

    /* JADX INFO: renamed from: suggestActivityType, reason: from kotlin metadata and from toString */
    @SerializedName("suggested_activity_type")
    @Nullable
    private Integer activityType;

    @SerializedName("date_time")
    private long time;

    /* JADX INFO: renamed from: total7daysVitality, reason: from kotlin metadata and from toString */
    @SerializedName("latest_accumulated_vitality")
    private int totalVitality;

    public /* synthetic */ VitalityItem(long j, int i, int i2, int i3, int i4, Integer num, Integer num2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4, (i5 & 32) != 0 ? null : num, (i5 & 64) != 0 ? null : num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLowVitality() {
        return this.lowVitality;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMediumVitality() {
        return this.mediumVitality;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHighVitality() {
        return this.highVitality;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalVitality() {
        return this.totalVitality;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getActivityType() {
        return this.activityType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getActivityDuration() {
        return this.activityDuration;
    }

    @NotNull
    public final VitalityItem copy(long time, int dayLowIntensityVitality, int dayMediumIntensityVitality, int dayHighIntensityVitality, int total7daysVitality, @com.xiaomi.fit.data.common.data.annotation.VitalitySuggestActivityType @Nullable Integer suggestActivityType, @Nullable Integer suggestActivityDuration) {
        return new VitalityItem(time, dayLowIntensityVitality, dayMediumIntensityVitality, dayHighIntensityVitality, total7daysVitality, suggestActivityType, suggestActivityDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VitalityItem)) {
            return false;
        }
        VitalityItem vitalityItem = (VitalityItem) other;
        return this.time == vitalityItem.time && this.lowVitality == vitalityItem.lowVitality && this.mediumVitality == vitalityItem.mediumVitality && this.highVitality == vitalityItem.highVitality && this.totalVitality == vitalityItem.totalVitality && Intrinsics.areEqual(this.activityType, vitalityItem.activityType) && Intrinsics.areEqual(this.activityDuration, vitalityItem.activityDuration);
    }

    public final int getDayHighIntensityVitality() {
        return this.highVitality;
    }

    public final int getDayLowIntensityVitality() {
        return this.lowVitality;
    }

    public final int getDayMediumIntensityVitality() {
        return this.mediumVitality;
    }

    public final int getDayTotalVitality() {
        return this.lowVitality + this.mediumVitality + this.highVitality;
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.DailyRecordItem, com.xiaomi.fit.fitness.export.data.item.IPointTimeData
    @NotNull
    public Number getPrimaryValue() {
        return Integer.valueOf(this.totalVitality);
    }

    @Nullable
    public final Integer getSuggestActivityDuration() {
        return this.activityDuration;
    }

    @Nullable
    public final Integer getSuggestActivityType() {
        return this.activityType;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public final int getTotal7daysVitality() {
        return this.totalVitality;
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.lowVitality)) * 31) + Integer.hashCode(this.mediumVitality)) * 31) + Integer.hashCode(this.highVitality)) * 31) + Integer.hashCode(this.totalVitality)) * 31;
        Integer num = this.activityType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.activityDuration;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setDayHighIntensityVitality(int i) {
        this.highVitality = i;
    }

    public final void setDayLowIntensityVitality(int i) {
        this.lowVitality = i;
    }

    public final void setDayMediumIntensityVitality(int i) {
        this.mediumVitality = i;
    }

    public final void setSuggestActivityDuration(@Nullable Integer num) {
        this.activityDuration = num;
    }

    public final void setSuggestActivityType(@Nullable Integer num) {
        this.activityType = num;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    public final void setTotal7daysVitality(int i) {
        this.totalVitality = i;
    }

    @NotNull
    public String toString() {
        return "VitalityItem(time=" + this.time + ", lowVitality=" + this.lowVitality + ", mediumVitality=" + this.mediumVitality + ", highVitality=" + this.highVitality + ", totalVitality=" + this.totalVitality + ", activityType=" + this.activityType + ", activityDuration=" + this.activityDuration + ")";
    }

    public VitalityItem(long j, int i, int i2, int i3, int i4, @com.xiaomi.fit.data.common.data.annotation.VitalitySuggestActivityType @Nullable Integer num, @Nullable Integer num2) {
        super(null);
        this.time = j;
        this.lowVitality = i;
        this.mediumVitality = i2;
        this.highVitality = i3;
        this.totalVitality = i4;
        this.activityType = num;
        this.activityDuration = num2;
    }
}
