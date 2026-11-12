package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingRecordSimple {

    @SerializedName("actionNumber")
    public int actionCount;

    @SerializedName("consumption")
    public long consumption;

    @SerializedName("duration")
    public long duration;

    @SerializedName("endTime")
    public long endTime;

    @SerializedName("finishNumber")
    public int finishNumber;

    @SerializedName("name")
    public String name;

    @SerializedName("startTime")
    public long startTime;

    @SerializedName(ParamKey.createTime)
    public long syncTime;

    @SerializedName("trainingId")
    public long trainingId;

    @SerializedName("trainingType")
    public String trainingType;

    public String toString() {
        return "TrainingRecordSimple{trainingId=" + this.trainingId + ", trainingType='" + this.trainingType + "', name='" + this.name + "', startTime=" + this.startTime + '}';
    }
}
