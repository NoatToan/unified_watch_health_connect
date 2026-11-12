package com.xiaomi.hm.health.traininglib.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.companion.dataflow.Constant;
import com.huami.watch.notification.data.NotificationData;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.databases.model.trainning.HaveDoneAction;
import com.xiaomi.hm.health.traininglib.gson.JsonStringFieldMapAdapterFactory;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingHistoryDetail {

    @SerializedName("actionNumber")
    public int actionNumber;

    @SerializedName(NotificationData.WearableExtrasData.KEY_ACTIONS)
    public List<HaveDoneAction> actions;

    @SerializedName("detailImgUrl")
    public String detailImgUrl;

    @SerializedName("detailsPageIllustrated")
    public String detailsPageIllustrated;

    @SerializedName(ParamKey.heartRateData)
    @JsonAdapter(JsonStringFieldMapAdapterFactory.class)
    public HeartRateDataBean heartRateData;

    @SerializedName("isBindingHeartRateBracelet")
    public boolean isBindingHeartRateBracelet;

    @SerializedName("name")
    public String name;

    @SerializedName("pause")
    public String pause;

    @SerializedName("trainingId")
    public long trainingId;

    public static class HeartRateDataBean {

        @SerializedName("averageHeartRate")
        public int averageHeartRate;

        @SerializedName(Constant.KEY_HR_VALUE)
        public String heartRate;

        @SerializedName("maxHeartRate")
        public int maxHeartRate;

        @SerializedName("startTime")
        public long startTime;
    }
}
