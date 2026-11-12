package com.xiaomi.hm.health.databases.model.trainning;

import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.ingenic.iwds.HardwareList;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class ActionVideo implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("id_")
    private Long a;

    @SerializedName("actionNumber")
    public Integer actionNumber;

    @SerializedName("actionPosition")
    public String actionPosition;

    @SerializedName("breathGist")
    public String breathGist;
    public Integer consumption;

    @SerializedName("difficultyDegree")
    public Integer difficultyDegree;

    @SerializedName("function")
    public String function;

    @SerializedName("gender")
    public Integer gender;

    @SerializedName("group")
    public Integer group;

    @SerializedName("instrument")
    public String instrument;

    @SerializedName("interpretationDocument")
    public String interpretationDocument;

    @SerializedName("location")
    public String location;

    @SerializedName("name")
    public String name;

    @SerializedName(HardwareList.VALUE_LCD_EXTERIOR_ROUND)
    public Integer round;

    @SerializedName("singleActionTime")
    public Long singleActionTime;

    @SerializedName("size")
    public Long size;

    @SerializedName("status")
    public Integer status;

    @SerializedName(DeviceSettingApiImpl.META_KEY_THUMBNAIL)
    public String thumbnail;

    @SerializedName("time")
    public Integer time;

    @SerializedName("trainingId")
    public Long trainingId;

    @SerializedName("type")
    public String type;

    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    public Long updateTime;

    @SerializedName("url")
    public String url;

    @SerializedName("usualError")
    public String usualError;

    @SerializedName("id")
    public Long videoId;

    public ActionVideo(Long l, Long l2, Long l3, Integer num, String str, Integer num2, Long l4, String str2, Long l5, String str3, String str4, String str5, String str6, Integer num3, String str7, String str8, String str9, Integer num4, Long l6, Integer num5, Integer num6, Integer num7, String str10, String str11, Integer num8) {
        this.gender = 0;
        this.time = 0;
        this.size = 0L;
        this.difficultyDegree = 0;
        this.status = 0;
        this.round = 0;
        this.group = 0;
        this.actionNumber = 0;
        this.usualError = "";
        this.breathGist = "";
        this.consumption = 0;
        this.a = l;
        this.videoId = l2;
        this.trainingId = l3;
        this.gender = num;
        this.name = str;
        this.time = num2;
        this.singleActionTime = l4;
        this.thumbnail = str2;
        this.size = l5;
        this.url = str3;
        this.location = str4;
        this.interpretationDocument = str5;
        this.type = str6;
        this.difficultyDegree = num3;
        this.instrument = str7;
        this.actionPosition = str8;
        this.function = str9;
        this.status = num4;
        this.updateTime = l6;
        this.round = num5;
        this.group = num6;
        this.actionNumber = num7;
        this.usualError = str10;
        this.breathGist = str11;
        this.consumption = num8;
    }

    public Integer getActionNumber() {
        return this.actionNumber;
    }

    public String getActionPosition() {
        return this.actionPosition;
    }

    public String getBreathGist() {
        return this.breathGist;
    }

    public Integer getConsumption() {
        return this.consumption;
    }

    public Integer getDifficultyDegree() {
        return this.difficultyDegree;
    }

    public String getFunction() {
        return this.function;
    }

    public Integer getGender() {
        return this.gender;
    }

    public Integer getGroup() {
        return this.group;
    }

    public Long getId() {
        return this.a;
    }

    public String getInstrument() {
        return this.instrument;
    }

    public String getInterpretationDocument() {
        return this.interpretationDocument;
    }

    public String getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public Integer getRound() {
        return this.round;
    }

    public Long getSingleActionTime() {
        return this.singleActionTime;
    }

    public Long getSize() {
        return this.size;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public Integer getTime() {
        return this.time;
    }

    public Long getTrainingId() {
        return this.trainingId;
    }

    public String getType() {
        return this.type;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUsualError() {
        return this.usualError;
    }

    public Long getVideoId() {
        return this.videoId;
    }

    public void setActionNumber(Integer num) {
        this.actionNumber = num;
    }

    public void setActionPosition(String str) {
        this.actionPosition = str;
    }

    public void setBreathGist(String str) {
        this.breathGist = str;
    }

    public void setConsumption(Integer num) {
        this.consumption = num;
    }

    public void setDifficultyDegree(Integer num) {
        this.difficultyDegree = num;
    }

    public void setFunction(String str) {
        this.function = str;
    }

    public void setGender(Integer num) {
        this.gender = num;
    }

    public void setGroup(Integer num) {
        this.group = num;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setInstrument(String str) {
        this.instrument = str;
    }

    public void setInterpretationDocument(String str) {
        this.interpretationDocument = str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRound(Integer num) {
        this.round = num;
    }

    public void setSingleActionTime(Long l) {
        this.singleActionTime = l;
    }

    public void setSize(Long l) {
        this.size = l;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public void setTrainingId(Long l) {
        this.trainingId = l;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUpdateTime(Long l) {
        this.updateTime = l;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUsualError(String str) {
        this.usualError = str;
    }

    public void setVideoId(Long l) {
        this.videoId = l;
    }

    public String toString() {
        return "ActionVideo{id=" + this.a + ", videoId=" + this.videoId + ", trainingId=" + this.trainingId + ", gender=" + this.gender + ", name='" + this.name + "', time=" + this.time + ", singleActionTime=" + this.singleActionTime + ", thumbnail='" + this.thumbnail + "', size=" + this.size + ", url='" + this.url + "', location='" + this.location + "', interpretationDocument='" + this.interpretationDocument + "', type='" + this.type + "', difficultyDegree=" + this.difficultyDegree + ", instrument='" + this.instrument + "', actionPosition='" + this.actionPosition + "', function='" + this.function + "', status=" + this.status + ", updateTime=" + this.updateTime + ", round=" + this.round + ", group=" + this.group + ", actionNumber=" + this.actionNumber + '}';
    }

    public ActionVideo() {
        this.gender = 0;
        this.time = 0;
        this.size = 0L;
        this.difficultyDegree = 0;
        this.status = 0;
        this.round = 0;
        this.group = 0;
        this.actionNumber = 0;
        this.usualError = "";
        this.breathGist = "";
        this.consumption = 0;
    }
}
