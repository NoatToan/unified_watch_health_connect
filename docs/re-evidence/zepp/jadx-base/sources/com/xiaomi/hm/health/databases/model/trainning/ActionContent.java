package com.xiaomi.hm.health.databases.model.trainning;

import com.google.gson.annotations.SerializedName;
import com.ingenic.iwds.HardwareList;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ActionContent implements Serializable {
    public static final String TYPE_COUNT = "COUNT";
    public static final String TYPE_TIME = "TIME";
    private static final long serialVersionUID = 1;

    @SerializedName("id_")
    private Long a;
    public ActionVideo actionVideo;

    @SerializedName("audio")
    public ActionAudio audio;

    @SerializedName("duration")
    public String duration;

    @SerializedName("group")
    public Integer group;

    @SerializedName("nextRestTime")
    public Long nextRestTime;

    @SerializedName("repeatNumber")
    public Integer repeatNumber;

    @SerializedName(HardwareList.VALUE_LCD_EXTERIOR_ROUND)
    public Integer round;

    @SerializedName("id")
    public Long trainingId;

    @SerializedName("type")
    public String type;

    @SerializedName("videos")
    public List<ActionVideo> videos;

    public ActionContent(Long l, Long l2, Integer num, Integer num2, String str, Long l3, String str2, Integer num3) {
        this.round = 0;
        this.group = 0;
        this.nextRestTime = 0L;
        this.repeatNumber = 0;
        this.a = l;
        this.trainingId = l2;
        this.round = num;
        this.group = num2;
        this.duration = str;
        this.nextRestTime = l3;
        this.type = str2;
        this.repeatNumber = num3;
    }

    public String getDuration() {
        return this.duration;
    }

    public Integer getGroup() {
        return this.group;
    }

    public Long getId() {
        return this.a;
    }

    public Long getNextRestTime() {
        return this.nextRestTime;
    }

    public Integer getRepeatNumber() {
        return this.repeatNumber;
    }

    public Integer getRound() {
        return this.round;
    }

    public Long getTrainingId() {
        return this.trainingId;
    }

    public String getType() {
        return this.type;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setGroup(Integer num) {
        this.group = num;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setNextRestTime(Long l) {
        this.nextRestTime = l;
    }

    public void setRepeatNumber(Integer num) {
        this.repeatNumber = num;
    }

    public void setRound(Integer num) {
        this.round = num;
    }

    public void setTrainingId(Long l) {
        this.trainingId = l;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "ActionContent{id=" + this.a + ", trainingId=" + this.trainingId + ", round=" + this.round + ", group=" + this.group + ", duration='" + this.duration + "', nextRestTime=" + this.nextRestTime + ", type='" + this.type + "', repeatNumber=" + this.repeatNumber + ", audio=" + this.audio + ", videos=" + this.videos + ", actionVideo=" + this.actionVideo + '}';
    }

    public ActionContent() {
        this.round = 0;
        this.group = 0;
        this.nextRestTime = 0L;
        this.repeatNumber = 0;
    }
}
