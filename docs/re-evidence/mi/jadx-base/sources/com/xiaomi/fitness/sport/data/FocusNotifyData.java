package com.xiaomi.fitness.sport.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J[\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/sport/data/FocusNotifyData;", "", "distanceValue", "", "distanceUnit", "timeValue", "timeTitle", "otherValue", "otherTitle", "ticker", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getDistanceValue", "()Ljava/lang/String;", "getDistanceUnit", "getTimeValue", "getTimeTitle", "getOtherValue", "getOtherTitle", "getTicker", "getTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FocusNotifyData {

    @NotNull
    private final String distanceUnit;

    @NotNull
    private final String distanceValue;

    @NotNull
    private final String otherTitle;

    @NotNull
    private final String otherValue;

    @Nullable
    private final String ticker;
    private final long time;

    @NotNull
    private final String timeTitle;

    @NotNull
    private final String timeValue;

    public FocusNotifyData(@NotNull String distanceValue, @NotNull String distanceUnit, @NotNull String timeValue, @NotNull String timeTitle, @NotNull String otherValue, @NotNull String otherTitle, @Nullable String str, long j) {
        Intrinsics.checkNotNullParameter(distanceValue, "distanceValue");
        Intrinsics.checkNotNullParameter(distanceUnit, "distanceUnit");
        Intrinsics.checkNotNullParameter(timeValue, "timeValue");
        Intrinsics.checkNotNullParameter(timeTitle, "timeTitle");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(otherTitle, "otherTitle");
        this.distanceValue = distanceValue;
        this.distanceUnit = distanceUnit;
        this.timeValue = timeValue;
        this.timeTitle = timeTitle;
        this.otherValue = otherValue;
        this.otherTitle = otherTitle;
        this.ticker = str;
        this.time = j;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDistanceValue() {
        return this.distanceValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDistanceUnit() {
        return this.distanceUnit;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTimeValue() {
        return this.timeValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimeTitle() {
        return this.timeTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOtherValue() {
        return this.otherValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOtherTitle() {
        return this.otherTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTicker() {
        return this.ticker;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final FocusNotifyData copy(@NotNull String distanceValue, @NotNull String distanceUnit, @NotNull String timeValue, @NotNull String timeTitle, @NotNull String otherValue, @NotNull String otherTitle, @Nullable String ticker, long time) {
        Intrinsics.checkNotNullParameter(distanceValue, "distanceValue");
        Intrinsics.checkNotNullParameter(distanceUnit, "distanceUnit");
        Intrinsics.checkNotNullParameter(timeValue, "timeValue");
        Intrinsics.checkNotNullParameter(timeTitle, "timeTitle");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(otherTitle, "otherTitle");
        return new FocusNotifyData(distanceValue, distanceUnit, timeValue, timeTitle, otherValue, otherTitle, ticker, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FocusNotifyData)) {
            return false;
        }
        FocusNotifyData focusNotifyData = (FocusNotifyData) other;
        return Intrinsics.areEqual(this.distanceValue, focusNotifyData.distanceValue) && Intrinsics.areEqual(this.distanceUnit, focusNotifyData.distanceUnit) && Intrinsics.areEqual(this.timeValue, focusNotifyData.timeValue) && Intrinsics.areEqual(this.timeTitle, focusNotifyData.timeTitle) && Intrinsics.areEqual(this.otherValue, focusNotifyData.otherValue) && Intrinsics.areEqual(this.otherTitle, focusNotifyData.otherTitle) && Intrinsics.areEqual(this.ticker, focusNotifyData.ticker) && this.time == focusNotifyData.time;
    }

    @NotNull
    public final String getDistanceUnit() {
        return this.distanceUnit;
    }

    @NotNull
    public final String getDistanceValue() {
        return this.distanceValue;
    }

    @NotNull
    public final String getOtherTitle() {
        return this.otherTitle;
    }

    @NotNull
    public final String getOtherValue() {
        return this.otherValue;
    }

    @Nullable
    public final String getTicker() {
        return this.ticker;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getTimeTitle() {
        return this.timeTitle;
    }

    @NotNull
    public final String getTimeValue() {
        return this.timeValue;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.distanceValue.hashCode() * 31) + this.distanceUnit.hashCode()) * 31) + this.timeValue.hashCode()) * 31) + this.timeTitle.hashCode()) * 31) + this.otherValue.hashCode()) * 31) + this.otherTitle.hashCode()) * 31;
        String str = this.ticker;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "FocusNotifyData(distanceValue=" + this.distanceValue + ", distanceUnit=" + this.distanceUnit + ", timeValue=" + this.timeValue + ", timeTitle=" + this.timeTitle + ", otherValue=" + this.otherValue + ", otherTitle=" + this.otherTitle + ", ticker=" + this.ticker + ", time=" + this.time + ")";
    }
}
