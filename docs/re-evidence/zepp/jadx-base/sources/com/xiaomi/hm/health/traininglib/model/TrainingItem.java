package com.xiaomi.hm.health.traininglib.model;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingItem implements Serializable, Comparable<TrainingItem> {

    @SerializedName("actionAmount")
    public Integer actionAmount;

    @SerializedName("label")
    public List<Label> courseLabels;

    @SerializedName("detailImgUrl")
    public String detailImgUrl;
    public transient boolean hasDownloaded;

    @SerializedName("instrument")
    public String instrument;

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

    @SerializedName("time")
    public String time;

    @SerializedName("id")
    public Long trainingId;

    @SerializedName("trainingType")
    public String trainingType;

    @SerializedName("difficultyDegree")
    public Integer difficultyDegree = 0;

    @SerializedName("status")
    public Integer status = 0;

    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    public Long updateTime = 0L;

    @SerializedName("lastTrainingTime")
    public Long lastTrainingTime = 0L;

    @SerializedName("isParticipate")
    public Boolean isParticipate = Boolean.FALSE;

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
}
