package com.huami.watch.dataflow.model.health.bean;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
@Table(name = "heart_rate_did")
public class HealthHRDataItem extends Model {
    private static final String COLUMN_HEART_RATE = "heart_rate";
    private static final String COLUMN_TIMESTAMP = "timestamp";
    private static final String COLUMN_TIMEZONE = "timezone";

    @Column(name = "did", onUniqueConflicts = {Column.ConflictAction.ABORT}, uniqueGroups = {"group"})
    private String deviceId;
    private int deviceSource;

    @Column(name = "heart_rate")
    private int heartRate;

    @Column(index = true, name = "timestamp", notNull = true, onUniqueConflicts = {Column.ConflictAction.ABORT}, uniqueGroups = {"group"})
    private long timestamp;
    private int timezone;

    @Override // com.activeandroid.Model
    public boolean equals(Object obj) {
        return (obj instanceof HealthHRDataItem) && this.timestamp == ((HealthHRDataItem) obj).timestamp;
    }

    public String getDId() {
        return this.deviceId;
    }

    public int getDeviceSource() {
        return this.deviceSource;
    }

    public int getHeartRate() {
        return this.heartRate;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getTimezone() {
        return this.timezone;
    }

    public void setDId(String str) {
        this.deviceId = str;
    }

    public void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public void setHeartRate(int i) {
        this.heartRate = i;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setTimezone(int i) {
        this.timezone = i;
    }

    @Override // com.activeandroid.Model
    public String toString() {
        return "<Timestamp : " + this.timestamp + ", DID : " + this.deviceId + ", DeviceSource : " + this.deviceSource + ", Timezone : " + this.timezone + " HeartRate : " + this.heartRate + SearchCriteria.GT;
    }

    public String toStringShort() {
        return "<Timestamp : " + this.timestamp + ", DID : " + this.deviceId + ", HR : " + this.heartRate + SearchCriteria.GT;
    }
}
