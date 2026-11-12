package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.DeductConstants;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J[\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0018\"\u0004\b\u001a\u0010\u001bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "Ljava/io/Serializable;", "planId", "", "isRestDay", "", "distance", "", DialWidgetType.DATE, "dayOfWeek", "", "status", "sportKey", "Lcom/xiaomi/fitness/training_plan_export/model/SportKey;", "isCreateTestRunning", "<init>", "(JZFJIILcom/xiaomi/fitness/training_plan_export/model/SportKey;Z)V", "getPlanId", "()J", "()Z", "getDistance", "()F", "getDate", "getDayOfWeek", "()I", "getStatus", "setStatus", "(I)V", "getSportKey", "()Lcom/xiaomi/fitness/training_plan_export/model/SportKey;", "setSportKey", "(Lcom/xiaomi/fitness/training_plan_export/model/SportKey;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HabitDayPlan implements Serializable {

    @SerializedName(DialWidgetType.DATE)
    private final long date;

    @SerializedName("day_of_week")
    private final int dayOfWeek;

    @SerializedName("running_distance")
    private final float distance;
    private final boolean isCreateTestRunning;

    @SerializedName("is_rest_day")
    private final boolean isRestDay;

    @SerializedName(DeductConstants.KEY_WX_PLAN_ID)
    private final long planId;

    @SerializedName(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_RECORD_KEY)
    @Nullable
    private SportKey sportKey;

    @SerializedName("course_status")
    private int status;

    public HabitDayPlan(long j, boolean z, float f, long j2, int i, int i2, @Nullable SportKey sportKey, boolean z2) {
        this.planId = j;
        this.isRestDay = z;
        this.distance = f;
        this.date = j2;
        this.dayOfWeek = i;
        this.status = i2;
        this.sportKey = sportKey;
        this.isCreateTestRunning = z2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsRestDay() {
        return this.isRestDay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SportKey getSportKey() {
        return this.sportKey;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsCreateTestRunning() {
        return this.isCreateTestRunning;
    }

    @NotNull
    public final HabitDayPlan copy(long planId, boolean isRestDay, float distance, long date, int dayOfWeek, int status, @Nullable SportKey sportKey, boolean isCreateTestRunning) {
        return new HabitDayPlan(planId, isRestDay, distance, date, dayOfWeek, status, sportKey, isCreateTestRunning);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HabitDayPlan)) {
            return false;
        }
        HabitDayPlan habitDayPlan = (HabitDayPlan) other;
        return this.planId == habitDayPlan.planId && this.isRestDay == habitDayPlan.isRestDay && Float.compare(this.distance, habitDayPlan.distance) == 0 && this.date == habitDayPlan.date && this.dayOfWeek == habitDayPlan.dayOfWeek && this.status == habitDayPlan.status && Intrinsics.areEqual(this.sportKey, habitDayPlan.sportKey) && this.isCreateTestRunning == habitDayPlan.isCreateTestRunning;
    }

    public final long getDate() {
        return this.date;
    }

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final long getPlanId() {
        return this.planId;
    }

    @Nullable
    public final SportKey getSportKey() {
        return this.sportKey;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Long.hashCode(this.planId) * 31) + Boolean.hashCode(this.isRestDay)) * 31) + Float.hashCode(this.distance)) * 31) + Long.hashCode(this.date)) * 31) + Integer.hashCode(this.dayOfWeek)) * 31) + Integer.hashCode(this.status)) * 31;
        SportKey sportKey = this.sportKey;
        return ((iHashCode + (sportKey == null ? 0 : sportKey.hashCode())) * 31) + Boolean.hashCode(this.isCreateTestRunning);
    }

    public final boolean isCreateTestRunning() {
        return this.isCreateTestRunning;
    }

    public final boolean isRestDay() {
        return this.isRestDay;
    }

    public final void setSportKey(@Nullable SportKey sportKey) {
        this.sportKey = sportKey;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "HabitDayPlan(planId=" + this.planId + ", isRestDay=" + this.isRestDay + ", distance=" + this.distance + ", date=" + this.date + ", dayOfWeek=" + this.dayOfWeek + ", status=" + this.status + ", sportKey=" + this.sportKey + ", isCreateTestRunning=" + this.isCreateTestRunning + ")";
    }

    public /* synthetic */ HabitDayPlan(long j, boolean z, float f, long j2, int i, int i2, SportKey sportKey, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? false : z, f, j2, i, i2, (i3 & 64) != 0 ? null : sportKey, (i3 & 128) != 0 ? false : z2);
    }
}
