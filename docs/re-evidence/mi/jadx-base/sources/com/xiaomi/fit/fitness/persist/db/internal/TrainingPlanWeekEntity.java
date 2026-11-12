package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"id"}, tableName = "training_plan_week")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanWeekEntity;", "", "type", "", "id", "", "curWeekPlan", "", "stopped", "<init>", "(IJLjava/lang/String;I)V", "getType", "()I", "getId", "()J", "getCurWeekPlan", "()Ljava/lang/String;", "setCurWeekPlan", "(Ljava/lang/String;)V", "getStopped", "setStopped", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrainingPlanWeekEntity {

    @Nullable
    private String curWeekPlan;
    private final long id;
    private int stopped;
    private final int type;

    public TrainingPlanWeekEntity(int i, long j, @Nullable String str, int i2) {
        this.type = i;
        this.id = j;
        this.curWeekPlan = str;
        this.stopped = i2;
    }

    public static /* synthetic */ TrainingPlanWeekEntity copy$default(TrainingPlanWeekEntity trainingPlanWeekEntity, int i, long j, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = trainingPlanWeekEntity.type;
        }
        if ((i3 & 2) != 0) {
            j = trainingPlanWeekEntity.id;
        }
        long j2 = j;
        if ((i3 & 4) != 0) {
            str = trainingPlanWeekEntity.curWeekPlan;
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            i2 = trainingPlanWeekEntity.stopped;
        }
        return trainingPlanWeekEntity.copy(i, j2, str2, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurWeekPlan() {
        return this.curWeekPlan;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStopped() {
        return this.stopped;
    }

    @NotNull
    public final TrainingPlanWeekEntity copy(int type, long id, @Nullable String curWeekPlan, int stopped) {
        return new TrainingPlanWeekEntity(type, id, curWeekPlan, stopped);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingPlanWeekEntity)) {
            return false;
        }
        TrainingPlanWeekEntity trainingPlanWeekEntity = (TrainingPlanWeekEntity) other;
        return this.type == trainingPlanWeekEntity.type && this.id == trainingPlanWeekEntity.id && Intrinsics.areEqual(this.curWeekPlan, trainingPlanWeekEntity.curWeekPlan) && this.stopped == trainingPlanWeekEntity.stopped;
    }

    @Nullable
    public final String getCurWeekPlan() {
        return this.curWeekPlan;
    }

    public final long getId() {
        return this.id;
    }

    public final int getStopped() {
        return this.stopped;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.type) * 31) + Long.hashCode(this.id)) * 31;
        String str = this.curWeekPlan;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.stopped);
    }

    public final void setCurWeekPlan(@Nullable String str) {
        this.curWeekPlan = str;
    }

    public final void setStopped(int i) {
        this.stopped = i;
    }

    @NotNull
    public String toString() {
        return "TrainingPlanWeekEntity(type=" + this.type + ", id=" + this.id + ", curWeekPlan=" + this.curWeekPlan + ", stopped=" + this.stopped + ")";
    }

    public /* synthetic */ TrainingPlanWeekEntity(int i, long j, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, str, (i3 & 8) != 0 ? 0 : i2);
    }
}
