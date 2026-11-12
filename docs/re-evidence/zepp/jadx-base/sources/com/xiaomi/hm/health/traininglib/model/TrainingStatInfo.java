package com.xiaomi.hm.health.traininglib.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingStatInfo {

    @SerializedName("backgroundImage")
    public String backgroundImage;

    @SerializedName("oldUser")
    public OldUserBean oldUser;

    public static class OldUserBean {

        @SerializedName("accumulationConsumption")
        public int accumulationConsumption;

        @SerializedName("finishNumber")
        public int finishNumber;

        @SerializedName("lastTrainingId")
        public long lastTrainingId;

        @SerializedName("lastTrainingName")
        public String lastTrainingName;

        @SerializedName("trainingDay")
        public int trainingDay;

        @SerializedName("trainingTime")
        public long trainingTime;
    }
}
