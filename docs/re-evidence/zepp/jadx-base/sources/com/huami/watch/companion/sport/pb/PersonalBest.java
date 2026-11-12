package com.huami.watch.companion.sport.pb;

/* JADX INFO: loaded from: classes16.dex */
public class PersonalBest {
    private String appName;
    private String name;
    private String source;
    private String status;
    private long timestamp;
    private long trackId;
    private int type;
    private double value;

    public String getAppName() {
        return this.appName;
    }

    public String getName() {
        return this.name;
    }

    public String getSource() {
        return this.source;
    }

    public String getStatus() {
        return this.status;
    }

    public long getTimestamp() {
        return this.timestamp * 1000;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public int getType() {
        return this.type;
    }

    public double getValue() {
        return this.value;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setTrackId(long j) {
        this.trackId = j;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setValue(float f) {
        this.value = f;
    }

    public String toString() {
        return "PersonalBest{value=" + this.value + ", name='" + this.name + "', status='" + this.status + "', source='" + this.source + "', timestamp=" + this.timestamp + ", trackId=" + this.trackId + ", type=" + this.type + ", appName='" + this.appName + "'}";
    }
}
