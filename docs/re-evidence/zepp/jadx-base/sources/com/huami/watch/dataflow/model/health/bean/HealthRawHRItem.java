package com.huami.watch.dataflow.model.health.bean;

import com.huami.watch.util.TimeUtil;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class HealthRawHRItem {
    private String data;
    private String deviceId;
    private int deviceSource;
    private long generatedTime;
    private String heartRateData;
    private int timeZone;

    public String getData() {
        return this.data;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public int getDeviceSource() {
        return this.deviceSource;
    }

    public long getGeneratedTime() {
        return this.generatedTime;
    }

    public String getHeartRateData() {
        return this.heartRateData;
    }

    public int getTimeZone() {
        return this.timeZone;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public void setGeneratedTime(long j) {
        this.generatedTime = j;
    }

    public void setHeartRateData(String str) {
        this.heartRateData = str;
    }

    public void setTimeZone(int i) {
        this.timeZone = i;
    }

    public String toString() {
        return "<HR: " + this.heartRateData + ", Timestamp: " + this.generatedTime + ", " + TimeUtil.formatDateTime(this.generatedTime * 1000) + SearchCriteria.GT;
    }
}
