package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingRecordBody {

    @SerializedName("consumption")
    public long consumption;

    @SerializedName("duration")
    public long duration;

    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    public long endTime;

    @SerializedName("finishedVideos")
    public List<FinishedVideo> finishedVideos;

    @SerializedName("isFinished")
    public boolean isFinished = true;

    @SerializedName("startTime")
    public long startTime;

    @SerializedName(ParamKey.createTime)
    public Long syncTime;

    public static class FinishedVideo {

        @SerializedName("id")
        public String id;

        @SerializedName("finishNumber")
        public int watchedCount;
    }
}
