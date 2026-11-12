package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Entity;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"id", DialWidgetType.DATE}, tableName = "training_plan_cur_date")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanCurDateEntity;", "", "type", "", "id", "", DialWidgetType.DATE, "curDatePlan", "", "<init>", "(IJJLjava/lang/String;)V", "getType", "()I", "getId", "()J", "getDate", "getCurDatePlan", "()Ljava/lang/String;", "setCurDatePlan", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrainingPlanCurDateEntity {

    @Nullable
    private String curDatePlan;
    private final long date;
    private final long id;
    private final int type;

    public TrainingPlanCurDateEntity(int i, long j, long j2, @Nullable String str) {
        this.type = i;
        this.id = j;
        this.date = j2;
        this.curDatePlan = str;
    }

    public static /* synthetic */ TrainingPlanCurDateEntity copy$default(TrainingPlanCurDateEntity trainingPlanCurDateEntity, int i, long j, long j2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = trainingPlanCurDateEntity.type;
        }
        if ((i2 & 2) != 0) {
            j = trainingPlanCurDateEntity.id;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = trainingPlanCurDateEntity.date;
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            str = trainingPlanCurDateEntity.curDatePlan;
        }
        return trainingPlanCurDateEntity.copy(i, j3, j4, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurDatePlan() {
        return this.curDatePlan;
    }

    @NotNull
    public final TrainingPlanCurDateEntity copy(int type, long id, long date, @Nullable String curDatePlan) {
        return new TrainingPlanCurDateEntity(type, id, date, curDatePlan);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingPlanCurDateEntity)) {
            return false;
        }
        TrainingPlanCurDateEntity trainingPlanCurDateEntity = (TrainingPlanCurDateEntity) other;
        return this.type == trainingPlanCurDateEntity.type && this.id == trainingPlanCurDateEntity.id && this.date == trainingPlanCurDateEntity.date && Intrinsics.areEqual(this.curDatePlan, trainingPlanCurDateEntity.curDatePlan);
    }

    @Nullable
    public final String getCurDatePlan() {
        return this.curDatePlan;
    }

    public final long getDate() {
        return this.date;
    }

    public final long getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.type) * 31) + Long.hashCode(this.id)) * 31) + Long.hashCode(this.date)) * 31;
        String str = this.curDatePlan;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setCurDatePlan(@Nullable String str) {
        this.curDatePlan = str;
    }

    @NotNull
    public String toString() {
        return "TrainingPlanCurDateEntity(type=" + this.type + ", id=" + this.id + ", date=" + this.date + ", curDatePlan=" + this.curDatePlan + ")";
    }
}
