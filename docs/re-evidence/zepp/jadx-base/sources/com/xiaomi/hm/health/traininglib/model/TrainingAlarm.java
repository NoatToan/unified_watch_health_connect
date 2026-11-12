package com.xiaomi.hm.health.traininglib.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingAlarm implements Serializable {

    @SerializedName("bandEnable")
    public boolean bandEnable;

    @SerializedName("phoneEnable")
    public boolean phoneEnable;

    @SerializedName("startH")
    public int startH;

    @SerializedName("startM")
    public int startM;

    public String toString() {
        return "TrainingAlarm{phoneEnable=" + this.phoneEnable + ", bandEnable=" + this.bandEnable + ", startH=" + this.startH + ", startM=" + this.startM + '}';
    }
}
