package com.xiaomi.hm.health.databases.model.trainning;

import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import com.ingenic.iwds.HardwareList;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class ActionAudio implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("id_")
    private Long a;

    @SerializedName("id")
    public Long audioId;

    @SerializedName("content")
    public String content;

    @SerializedName("group")
    public Integer group;

    @SerializedName("name")
    public String name;

    @SerializedName(HardwareList.VALUE_LCD_EXTERIOR_ROUND)
    public Integer round;

    @SerializedName("size")
    public Long size;

    @SerializedName("status")
    public Integer status;

    @SerializedName("time")
    public Integer time;

    @SerializedName("trainingId")
    public Long trainingId;

    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    public Long updateTime;

    @SerializedName("url")
    public String url;

    public ActionAudio(Long l, Long l2, Long l3, String str, String str2, Integer num, String str3, Long l4, Integer num2, Long l5, Integer num3, Integer num4) {
        this.time = 0;
        this.size = 0L;
        this.status = 0;
        this.round = 0;
        this.group = 0;
        this.a = l;
        this.audioId = l2;
        this.trainingId = l3;
        this.name = str;
        this.content = str2;
        this.time = num;
        this.url = str3;
        this.size = l4;
        this.status = num2;
        this.updateTime = l5;
        this.round = num3;
        this.group = num4;
    }

    public Long getAudioId() {
        return this.audioId;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getGroup() {
        return this.group;
    }

    public Long getId() {
        return this.a;
    }

    public String getName() {
        return this.name;
    }

    public Integer getRound() {
        return this.round;
    }

    public Long getSize() {
        return this.size;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getTime() {
        return this.time;
    }

    public Long getTrainingId() {
        return this.trainingId;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAudioId(Long l) {
        this.audioId = l;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setGroup(Integer num) {
        this.group = num;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRound(Integer num) {
        this.round = num;
    }

    public void setSize(Long l) {
        this.size = l;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public void setTrainingId(Long l) {
        this.trainingId = l;
    }

    public void setUpdateTime(Long l) {
        this.updateTime = l;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "ActionAudio{id=" + this.a + ", audioId=" + this.audioId + ", trainingId=" + this.trainingId + ", name='" + this.name + "', content='" + this.content + "', time=" + this.time + ", url='" + this.url + "', size=" + this.size + ", status=" + this.status + ", updateTime=" + this.updateTime + ", round=" + this.round + ", group=" + this.group + '}';
    }

    public ActionAudio() {
        this.time = 0;
        this.size = 0L;
        this.status = 0;
        this.round = 0;
        this.group = 0;
    }
}
