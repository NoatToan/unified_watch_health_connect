package com.xiaomi.hm.health.databases.model.trainning;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class TrainingHeartRate implements Serializable, Comparable<TrainingHeartRate> {
    private static final long serialVersionUID = 1;

    @SerializedName("id_")
    private Long a;
    public transient Long duration;
    public Integer heartRate;
    public Long index;
    public Long recordTime;
    public transient Long seconds;
    public Long trainingId;
    public Long trainingPlanId;
    public Long trainingStartTime;

    public TrainingHeartRate(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Integer num) {
        this.index = 0L;
        this.recordTime = 0L;
        this.heartRate = 0;
        this.duration = 0L;
        this.seconds = 0L;
        this.a = l;
        this.trainingId = l2;
        this.trainingPlanId = l3;
        this.trainingStartTime = l4;
        this.index = l5;
        this.recordTime = l6;
        this.heartRate = num;
    }

    public Long getDuration() {
        return this.duration;
    }

    public Integer getHeartRate() {
        return this.heartRate;
    }

    public Long getId() {
        return this.a;
    }

    public Long getIndex() {
        return this.index;
    }

    public Long getRecordTime() {
        return this.recordTime;
    }

    public Long getSeconds() {
        return this.seconds;
    }

    public Long getTrainingId() {
        return this.trainingId;
    }

    public Long getTrainingPlanId() {
        return this.trainingPlanId;
    }

    public Long getTrainingStartTime() {
        return this.trainingStartTime;
    }

    public void setDuration(Long l) {
        this.duration = l;
    }

    public void setHeartRate(Integer num) {
        this.heartRate = num;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setIndex(Long l) {
        this.index = l;
    }

    public void setRecordTime(Long l) {
        this.recordTime = l;
    }

    public void setSeconds(Long l) {
        this.seconds = l;
    }

    public void setTrainingId(Long l) {
        this.trainingId = l;
    }

    public void setTrainingPlanId(Long l) {
        this.trainingPlanId = l;
    }

    public void setTrainingStartTime(Long l) {
        this.trainingStartTime = l;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull TrainingHeartRate trainingHeartRate) {
        return this.recordTime.longValue() - trainingHeartRate.recordTime.longValue() > 0 ? 1 : -1;
    }

    public TrainingHeartRate() {
        this.index = 0L;
        this.recordTime = 0L;
        this.heartRate = 0;
        this.duration = 0L;
        this.seconds = 0L;
    }
}
