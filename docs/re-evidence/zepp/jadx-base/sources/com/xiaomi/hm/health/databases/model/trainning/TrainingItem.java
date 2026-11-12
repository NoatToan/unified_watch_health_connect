package com.xiaomi.hm.health.databases.model.trainning;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class TrainingItem implements Serializable, Comparable<TrainingItem> {
    private static final long serialVersionUID = 1;

    @SerializedName("actionAmount")
    public Integer actionAmount;

    @SerializedName("detailImgUrl")
    public String detailImgUrl;

    @SerializedName("difficultyDegree")
    public Integer difficultyDegree;
    public transient boolean hasDownloaded;

    @SerializedName("instrument")
    public String instrument;

    @SerializedName("isParticipate")
    public Boolean isParticipate;

    @SerializedName("lastTrainingTime")
    public Long lastTrainingTime;

    @SerializedName("listImgUrl")
    public String listImgUrl;

    @SerializedName("listPageIllustrated")
    public String listPageIllustrated;

    @SerializedName("location")
    public String location;

    @SerializedName("name")
    public String name;

    @SerializedName("participantNumber")
    public Long participantNumber;

    @SerializedName("recommendedPageIllustrated")
    public String recommendedPageIllustrated;

    @SerializedName("remainingTime")
    public long remainingTime;

    @SerializedName("status")
    public Integer status;

    @SerializedName("time")
    public String time;

    @SerializedName("id")
    public Long trainingId;

    @SerializedName("trainingType")
    public String trainingType;

    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    public Long updateTime;

    public TrainingItem(Long l, String str, Long l2, String str2, String str3, String str4, Integer num, String str5, Integer num2, Long l3, Long l4, Boolean bool, String str6, String str7, String str8, Integer num3) {
        this.difficultyDegree = 0;
        this.status = 0;
        this.updateTime = 0L;
        this.lastTrainingTime = 0L;
        this.isParticipate = Boolean.FALSE;
        this.trainingId = l;
        this.name = str;
        this.participantNumber = l2;
        this.instrument = str2;
        this.location = str3;
        this.time = str4;
        this.difficultyDegree = num;
        this.listPageIllustrated = str5;
        this.status = num2;
        this.updateTime = l3;
        this.lastTrainingTime = l4;
        this.isParticipate = bool;
        this.listImgUrl = str6;
        this.detailImgUrl = str7;
        this.trainingType = str8;
        this.actionAmount = num3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TrainingItem)) {
            return false;
        }
        TrainingItem trainingItem = (TrainingItem) obj;
        Long l = this.trainingId;
        return (l == null || trainingItem.trainingId == null || l.longValue() != trainingItem.trainingId.longValue()) ? false : true;
    }

    public Integer getActionAmount() {
        return this.actionAmount;
    }

    public String getDetailImgUrl() {
        return this.detailImgUrl;
    }

    public Integer getDifficultyDegree() {
        return this.difficultyDegree;
    }

    public String getInstrument() {
        return this.instrument;
    }

    public Boolean getIsParticipate() {
        return this.isParticipate;
    }

    public Long getLastTrainingTime() {
        return this.lastTrainingTime;
    }

    public String getListImgUrl() {
        return this.listImgUrl;
    }

    public String getListPageIllustrated() {
        return this.listPageIllustrated;
    }

    public String getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public Long getParticipantNumber() {
        return this.participantNumber;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getTime() {
        return this.time;
    }

    public Long getTrainingId() {
        return this.trainingId;
    }

    public String getTrainingType() {
        return this.trainingType;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public void setActionAmount(Integer num) {
        this.actionAmount = num;
    }

    public void setDetailImgUrl(String str) {
        this.detailImgUrl = str;
    }

    public void setDifficultyDegree(Integer num) {
        this.difficultyDegree = num;
    }

    public void setInstrument(String str) {
        this.instrument = str;
    }

    public void setIsParticipate(Boolean bool) {
        this.isParticipate = bool;
    }

    public void setLastTrainingTime(Long l) {
        this.lastTrainingTime = l;
    }

    public void setListImgUrl(String str) {
        this.listImgUrl = str;
    }

    public void setListPageIllustrated(String str) {
        this.listPageIllustrated = str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParticipantNumber(Long l) {
        this.participantNumber = l;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setTrainingId(Long l) {
        this.trainingId = l;
    }

    public void setTrainingType(String str) {
        this.trainingType = str;
    }

    public void setUpdateTime(Long l) {
        this.updateTime = l;
    }

    public String toString() {
        return "TrainingItem{trainingId=" + this.trainingId + ", name='" + this.name + "', lastTrainingTime=" + this.lastTrainingTime + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull TrainingItem trainingItem) {
        return this.updateTime.longValue() - trainingItem.updateTime.longValue() > 0 ? -1 : 1;
    }

    public TrainingItem() {
        this.difficultyDegree = 0;
        this.status = 0;
        this.updateTime = 0L;
        this.lastTrainingTime = 0L;
        this.isParticipate = Boolean.FALSE;
    }
}
