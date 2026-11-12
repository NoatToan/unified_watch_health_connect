package com.huawei.maps.offlinedata.service.cloud.dto;

import com.huawei.maps.offlinedata.health.init.OfflineMapPoint;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class OfflineMapRequestDto extends BaseRequestDTO {
    private String countryIds;
    private String dataType;
    private String deviceType;
    private String fileId;
    private String language;
    private String p;
    private List<OfflineMapPoint> points;

    public String getCountryIds() {
        return this.countryIds;
    }

    public String getDataType() {
        return this.dataType;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getP() {
        return this.p;
    }

    public List<OfflineMapPoint> getPoints() {
        return this.points;
    }

    public void setCountryIds(String str) {
        this.countryIds = str;
    }

    public void setDataType(String str) {
        this.dataType = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setFileId(String str) {
        this.fileId = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setP(String str) {
        this.p = str;
    }

    public void setPoints(List<OfflineMapPoint> list) {
        this.points = list;
    }
}
