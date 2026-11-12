package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class HistoryRecodListData {

    @SerializedName("accumulationConsumption")
    public long cumulativeConsumption;

    @SerializedName("accumulationTime")
    public long cumulativeDuration;

    @SerializedName("accumulationNumber")
    public long cumulativeNumber;

    @SerializedName("userTrainingRecords")
    public List<TrainingRecordSimple> records;
}
