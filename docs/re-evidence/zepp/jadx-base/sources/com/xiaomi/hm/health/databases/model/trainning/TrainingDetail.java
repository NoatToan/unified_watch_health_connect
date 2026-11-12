package com.xiaomi.hm.health.databases.model.trainning;

import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class TrainingDetail implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("trainingMusic")
    public BgMusic bgMusic;

    @SerializedName("coach")
    public Coach coach;

    @SerializedName("coachGender")
    public Integer coachGender;

    @SerializedName("coachId")
    public Long coachId;

    @SerializedName("consumption")
    public Integer consumption;

    @SerializedName("content")
    public List<ActionContent> content;

    @SerializedName("detailsPageIllustrated")
    public String detailsPageIllustrated;

    @SerializedName("difficultyDegree")
    public Integer difficultyDegree;

    @SerializedName("finishNumber")
    public Integer finishNumber;

    @SerializedName("function")
    public String function;

    @SerializedName("instrument")
    public String instrument;

    @SerializedName("introduction")
    public String introduction;

    @SerializedName("listPageIllustrated")
    public String listPageIllustrated;

    @SerializedName("location")
    public String location;

    @SerializedName("name")
    public String name;

    @SerializedName("participantNumber")
    public Long participantNumber;

    @SerializedName("status")
    public Integer status;

    @SerializedName("suitableGender")
    public String suitableGender;

    @SerializedName("time")
    public String time;

    @SerializedName("id")
    public Long trainingId;

    @SerializedName("trainingType")
    public String trainingType;

    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    public Long updateTime;

    @SerializedName("size")
    public long videoSize;

    @SerializedName("yogaUrl")
    public String yogaUrl;

    public TrainingDetail(Long l, String str, Integer num, Long l2, String str2, String str3, String str4, String str5, String str6, Long l3, String str7, String str8, String str9, Integer num2, Integer num3, Integer num4, Integer num5, Long l4, String str10, String str11, long j) {
        this.consumption = 0;
        this.participantNumber = 0L;
        this.coachGender = 0;
        this.status = 0;
        this.finishNumber = 0;
        this.trainingId = l;
        this.name = str;
        this.consumption = num;
        this.participantNumber = l2;
        this.instrument = str2;
        this.suitableGender = str3;
        this.function = str4;
        this.location = str5;
        this.time = str6;
        this.updateTime = l3;
        this.detailsPageIllustrated = str7;
        this.listPageIllustrated = str8;
        this.introduction = str9;
        this.difficultyDegree = num2;
        this.coachGender = num3;
        this.status = num4;
        this.finishNumber = num5;
        this.coachId = l4;
        this.trainingType = str10;
        this.yogaUrl = str11;
        this.videoSize = j;
    }

    public Integer getCoachGender() {
        return this.coachGender;
    }

    public Long getCoachId() {
        return this.coachId;
    }

    public Integer getConsumption() {
        return this.consumption;
    }

    public String getDetailsPageIllustrated() {
        return this.detailsPageIllustrated;
    }

    public Integer getDifficultyDegree() {
        return this.difficultyDegree;
    }

    public Integer getFinishNumber() {
        return this.finishNumber;
    }

    public String getFunction() {
        return this.function;
    }

    public String getInstrument() {
        return this.instrument;
    }

    public String getIntroduction() {
        return this.introduction;
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

    public String getSuitableGender() {
        return this.suitableGender;
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

    public long getVideoSize() {
        return this.videoSize;
    }

    public String getYogaUrl() {
        return this.yogaUrl;
    }

    public void setCoachGender(Integer num) {
        this.coachGender = num;
    }

    public void setCoachId(Long l) {
        this.coachId = l;
    }

    public void setConsumption(Integer num) {
        this.consumption = num;
    }

    public void setDetailsPageIllustrated(String str) {
        this.detailsPageIllustrated = str;
    }

    public void setDifficultyDegree(Integer num) {
        this.difficultyDegree = num;
    }

    public void setFinishNumber(Integer num) {
        this.finishNumber = num;
    }

    public void setFunction(String str) {
        this.function = str;
    }

    public void setInstrument(String str) {
        this.instrument = str;
    }

    public void setIntroduction(String str) {
        this.introduction = str;
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

    public void setSuitableGender(String str) {
        this.suitableGender = str;
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

    public void setVideoSize(long j) {
        this.videoSize = j;
    }

    public void setYogaUrl(String str) {
        this.yogaUrl = str;
    }

    public TrainingDetail() {
        this.consumption = 0;
        this.participantNumber = 0L;
        this.coachGender = 0;
        this.status = 0;
        this.finishNumber = 0;
    }
}
