package com.xiaomi.hm.health.traininglib.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingHistoryListData {

    @SerializedName("accumulationConsumption")
    public long accumulationConsumption;

    @SerializedName("accumulationNumber")
    public long accumulationNumber;

    @SerializedName("accumulationTime")
    public long accumulationTime;

    @SerializedName("userTrainingRecords")
    public List<TrainingRecord> userTrainingRecords;
}
