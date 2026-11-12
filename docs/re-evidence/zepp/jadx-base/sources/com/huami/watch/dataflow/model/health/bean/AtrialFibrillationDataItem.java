package com.huami.watch.dataflow.model.health.bean;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;

/* JADX INFO: loaded from: classes16.dex */
public class AtrialFibrillationDataItem {

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    public int active;

    @SerializedName("deviceId")
    public String deviceId = "";

    @SerializedName(ParamKey.deviceSn)
    public String deviceSn = "";

    @SerializedName("deviceSource")
    public int deviceSource = -1;

    @SerializedName("eventType")
    public String eventType;

    @SerializedName("timestamp")
    public long timestamp;

    @SerializedName("userId")
    public String userId;
}
