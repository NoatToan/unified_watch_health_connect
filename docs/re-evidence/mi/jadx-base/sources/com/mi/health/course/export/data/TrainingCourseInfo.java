package com.mi.health.course.export.data;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/mi/health/course/export/data/TrainingCourseInfo;", "Ljava/io/Serializable;", "planId", "", "status", "", "<init>", "(JI)V", "getPlanId", "()J", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrainingCourseInfo implements Serializable {
    private final long planId;
    private final int status;

    public TrainingCourseInfo(long j, int i) {
        this.planId = j;
        this.status = i;
    }

    public static /* synthetic */ TrainingCourseInfo copy$default(TrainingCourseInfo trainingCourseInfo, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = trainingCourseInfo.planId;
        }
        if ((i2 & 2) != 0) {
            i = trainingCourseInfo.status;
        }
        return trainingCourseInfo.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final TrainingCourseInfo copy(long planId, int status) {
        return new TrainingCourseInfo(planId, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingCourseInfo)) {
            return false;
        }
        TrainingCourseInfo trainingCourseInfo = (TrainingCourseInfo) other;
        return this.planId == trainingCourseInfo.planId && this.status == trainingCourseInfo.status;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (Long.hashCode(this.planId) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "TrainingCourseInfo(planId=" + this.planId + ", status=" + this.status + ")";
    }
}
