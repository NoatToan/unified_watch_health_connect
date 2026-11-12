package com.huawei.hwdevice.phoneprocess.mgr.exercise;

/* JADX INFO: loaded from: classes10.dex */
public class WorkoutSyncSuccessDetailData {
    private int detailCount;
    private long endTime;
    private boolean isClassDataSyncSuccess;
    private boolean isHaveClassData;
    private boolean isHaveTrackData;
    private boolean isSportDataSyncSuccess;
    private long startTime;
    private int workoutId;

    public WorkoutSyncSuccessDetailData(int i, long j, long j2) {
        this.workoutId = i;
        this.startTime = j;
        this.endTime = j2;
    }

    public int getWorkoutId() {
        return this.workoutId;
    }

    public void setWorkoutId(int i) {
        this.workoutId = i;
    }

    public int getDetailCount() {
        return this.detailCount;
    }

    public void setDetailCount(int i) {
        this.detailCount = i;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public boolean getSportDataSyncSuccess() {
        return this.isSportDataSyncSuccess;
    }

    public boolean getClassDataSyncSuccess() {
        return this.isClassDataSyncSuccess;
    }

    public boolean isNeedResync() {
        if (!this.isHaveTrackData || this.isSportDataSyncSuccess) {
            return this.isHaveClassData && !this.isClassDataSyncSuccess;
        }
        return true;
    }

    public void updateTrackDataParameter(boolean z, boolean z2) {
        this.isHaveTrackData = z;
        this.isSportDataSyncSuccess = z2;
    }

    public void updateClassDataParameter(boolean z, boolean z2) {
        this.isHaveClassData = z;
        this.isClassDataSyncSuccess = z2;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof WorkoutSyncSuccessDetailData) {
            WorkoutSyncSuccessDetailData workoutSyncSuccessDetailData = (WorkoutSyncSuccessDetailData) obj;
            if (getDetailCount() == workoutSyncSuccessDetailData.getDetailCount() && getStartTime() == workoutSyncSuccessDetailData.getStartTime() && getEndTime() == workoutSyncSuccessDetailData.getEndTime() && getWorkoutId() == workoutSyncSuccessDetailData.getWorkoutId() && getSportDataSyncSuccess() == workoutSyncSuccessDetailData.getSportDataSyncSuccess() && getClassDataSyncSuccess() == workoutSyncSuccessDetailData.getClassDataSyncSuccess() && this.isHaveClassData == workoutSyncSuccessDetailData.isHaveClassData && this.isHaveTrackData == workoutSyncSuccessDetailData.isHaveTrackData) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "WorkoutDetailSync{workoutId=" + this.workoutId + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", detailCount=" + this.detailCount + ", isHaveClassData=" + this.isHaveClassData + ", isHaveTrackData=" + this.isHaveTrackData + ", sportDataSyncStatus=" + this.isSportDataSyncSuccess + ", classDataSyncStatus=" + this.isClassDataSyncSuccess + '}';
    }
}
