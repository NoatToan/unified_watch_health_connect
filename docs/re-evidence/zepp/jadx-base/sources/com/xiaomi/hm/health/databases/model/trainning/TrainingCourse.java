package com.xiaomi.hm.health.databases.model.trainning;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class TrainingCourse implements Serializable {
    public static final String DIFFICULTY_LEVEL_HIGH_LEVEL = "HIGH_LEVEL";
    public static final String DIFFICULTY_LEVEL_JUNIOR_LEVEL = "JUNIOR_LEVEL";
    public static final String DIFFICULTY_LEVEL_MIDDLE_LEVEL = "MIDDLE_LEVEL";
    public static final String END = "END";
    public static final String FINISHED = "FINISHED";
    public static final String FINISHED_WITH_WEEK = "FINISHED_WITH_WEEK";
    public static final String NOT_CUSTOM = "NOT_CUSTOME";
    public static final String UNDER_WAY = "UNDER_WAY";
    public static final String WAITING_PERIOD = "WAITING_PERIOD";
    private static final long serialVersionUID = 1;

    @SerializedName("consumption")
    public Integer consumption;

    @SerializedName("dayTrainingItems")
    public List<TrainingCourseItem> dayTrainingItems;

    @SerializedName("detailsPageIllustrated")
    public String detailsPageIllustrated;

    @SerializedName("difficultyDegree")
    public String difficultyDegree;

    @SerializedName("introduction")
    public String introduction;

    @SerializedName("name")
    public String name;

    @SerializedName("startDay")
    public String startDay;

    @SerializedName("status")
    public String status;

    @SerializedName("time")
    public long time;

    @SerializedName("totalDays")
    public int totalDays;

    @SerializedName("trainingDays")
    public int trainingDays;

    @SerializedName("trainingPlanId")
    public Long trainingPlanId;

    public TrainingCourse(Long l, String str, String str2, Integer num, String str3, String str4, String str5, String str6, long j, int i, int i2) {
        this.consumption = 0;
        this.trainingPlanId = l;
        this.name = str;
        this.detailsPageIllustrated = str2;
        this.consumption = num;
        this.introduction = str3;
        this.difficultyDegree = str4;
        this.startDay = str5;
        this.status = str6;
        this.time = j;
        this.totalDays = i;
        this.trainingDays = i2;
    }

    public Integer getConsumption() {
        return this.consumption;
    }

    public String getDetailsPageIllustrated() {
        return this.detailsPageIllustrated;
    }

    public String getDifficultyDegree() {
        return this.difficultyDegree;
    }

    public String getIntroduction() {
        return this.introduction;
    }

    public String getName() {
        return this.name;
    }

    public String getStartDay() {
        return this.startDay;
    }

    public String getStatus() {
        return this.status;
    }

    public long getTime() {
        return this.time;
    }

    public int getTotalDays() {
        return this.totalDays;
    }

    public int getTrainingDays() {
        return this.trainingDays;
    }

    public Long getTrainingPlanId() {
        return this.trainingPlanId;
    }

    public void setConsumption(Integer num) {
        this.consumption = num;
    }

    public void setDetailsPageIllustrated(String str) {
        this.detailsPageIllustrated = str;
    }

    public void setDifficultyDegree(String str) {
        this.difficultyDegree = str;
    }

    public void setIntroduction(String str) {
        this.introduction = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStartDay(String str) {
        this.startDay = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public void setTotalDays(int i) {
        this.totalDays = i;
    }

    public void setTrainingDays(int i) {
        this.trainingDays = i;
    }

    public void setTrainingPlanId(Long l) {
        this.trainingPlanId = l;
    }

    public String toString() {
        return "TrainingCourse{trainingPlanId=" + this.trainingPlanId + ", name='" + this.name + "'}";
    }

    public TrainingCourse() {
        this.consumption = 0;
    }
}
