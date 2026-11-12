package com.huawei.maps.offlinedata.handler.dto.device;

/* JADX INFO: loaded from: classes12.dex */
public class DownloadMapInfo {
    private String cityId;
    private int downloadType;
    private int mspType;
    private int version;

    public String getCityId() {
        return this.cityId;
    }

    public int getDownloadType() {
        return this.downloadType;
    }

    public int getMspType() {
        return this.mspType;
    }

    public int getVersion() {
        return this.version;
    }

    public void setCityId(String str) {
        this.cityId = str;
    }

    public void setDownloadType(int i) {
        this.downloadType = i;
    }

    public void setMspType(int i) {
        this.mspType = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
