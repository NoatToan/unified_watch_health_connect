package com.xiaomi.hm.health.databases.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class AtrialFibrillationDataItem implements Serializable {
    private static final long serialVersionUID = 1;
    private Long a;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    public Integer active;

    @SerializedName("deviceId")
    public String deviceId;

    @SerializedName(ParamKey.deviceSn)
    public String deviceSn;

    @SerializedName("deviceSource")
    public int deviceSource;

    @SerializedName("deviceVersion")
    public String deviceVersion;

    @SerializedName("eventType")
    public String eventType;

    @SerializedName("sync")
    public Integer sync;

    @SerializedName("timestamp")
    public Long timestamp;

    @SerializedName("userId")
    public String userId;

    public AtrialFibrillationDataItem(Long l, Long l2, String str, String str2, Integer num, Integer num2, String str3, String str4, int i, String str5) {
        this.a = l;
        this.timestamp = l2;
        this.eventType = str;
        this.userId = str2;
        this.active = num;
        this.sync = num2;
        this.deviceId = str3;
        this.deviceSn = str4;
        this.deviceSource = i;
        this.deviceVersion = str5;
    }

    public Integer getActive() {
        return this.active;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceSn() {
        return this.deviceSn;
    }

    public int getDeviceSource() {
        return this.deviceSource;
    }

    public String getDeviceVersion() {
        return this.deviceVersion;
    }

    public String getEventType() {
        return this.eventType;
    }

    public Long getId() {
        return this.a;
    }

    public Integer getSync() {
        return this.sync;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setActive(Integer num) {
        this.active = num;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceSn(String str) {
        this.deviceSn = str;
    }

    public void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public void setDeviceVersion(String str) {
        this.deviceVersion = str;
    }

    public void setEventType(String str) {
        this.eventType = str;
    }

    public void setId(Long l) {
        this.a = l;
    }

    public void setSync(Integer num) {
        this.sync = num;
    }

    public void setTimestamp(Long l) {
        this.timestamp = l;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public AtrialFibrillationDataItem() {
    }

    public AtrialFibrillationDataItem(Long l, Long l2, String str, String str2, Integer num, Integer num2) {
        this.a = l;
        this.timestamp = l2;
        this.eventType = str;
        this.userId = str2;
        this.active = num;
        this.sync = num2;
    }
}
