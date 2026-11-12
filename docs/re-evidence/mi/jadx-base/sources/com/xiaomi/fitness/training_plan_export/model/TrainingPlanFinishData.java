package com.xiaomi.fitness.training_plan_export.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/TrainingPlanFinishData;", "Ljava/io/Serializable;", "planId", "", "sportCourseId", "", "serverCourseId", "<init>", "(JLjava/lang/Integer;Ljava/lang/Long;)V", "getPlanId", "()J", "getSportCourseId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getServerCourseId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(JLjava/lang/Integer;Ljava/lang/Long;)Lcom/xiaomi/fitness/training_plan_export/model/TrainingPlanFinishData;", "equals", "", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrainingPlanFinishData implements Serializable {
    private final long planId;

    @Nullable
    private final Long serverCourseId;

    @Nullable
    private final Integer sportCourseId;

    public TrainingPlanFinishData() {
        this(0L, null, null, 7, null);
    }

    public static /* synthetic */ TrainingPlanFinishData copy$default(TrainingPlanFinishData trainingPlanFinishData, long j, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = trainingPlanFinishData.planId;
        }
        if ((i & 2) != 0) {
            num = trainingPlanFinishData.sportCourseId;
        }
        if ((i & 4) != 0) {
            l = trainingPlanFinishData.serverCourseId;
        }
        return trainingPlanFinishData.copy(j, num, l);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSportCourseId() {
        return this.sportCourseId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getServerCourseId() {
        return this.serverCourseId;
    }

    @NotNull
    public final TrainingPlanFinishData copy(long planId, @Nullable Integer sportCourseId, @Nullable Long serverCourseId) {
        return new TrainingPlanFinishData(planId, sportCourseId, serverCourseId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingPlanFinishData)) {
            return false;
        }
        TrainingPlanFinishData trainingPlanFinishData = (TrainingPlanFinishData) other;
        return this.planId == trainingPlanFinishData.planId && Intrinsics.areEqual(this.sportCourseId, trainingPlanFinishData.sportCourseId) && Intrinsics.areEqual(this.serverCourseId, trainingPlanFinishData.serverCourseId);
    }

    public final long getPlanId() {
        return this.planId;
    }

    @Nullable
    public final Long getServerCourseId() {
        return this.serverCourseId;
    }

    @Nullable
    public final Integer getSportCourseId() {
        return this.sportCourseId;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.planId) * 31;
        Integer num = this.sportCourseId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.serverCourseId;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TrainingPlanFinishData(planId=" + this.planId + ", sportCourseId=" + this.sportCourseId + ", serverCourseId=" + this.serverCourseId + ")";
    }

    public TrainingPlanFinishData(long j, @Nullable Integer num, @Nullable Long l) {
        this.planId = j;
        this.sportCourseId = num;
        this.serverCourseId = l;
    }

    public /* synthetic */ TrainingPlanFinishData(long j, Integer num, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l);
    }
}
