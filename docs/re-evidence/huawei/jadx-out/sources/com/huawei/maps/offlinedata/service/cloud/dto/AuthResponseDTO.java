package com.huawei.maps.offlinedata.service.cloud.dto;

import com.huawei.maps.offlinedata.network.d;

/* JADX INFO: loaded from: classes12.dex */
public class AuthResponseDTO extends d {
    private Boolean enableAutoUpdates;
    private String p;
    private String politicalView;
    private String reviewNumberOfWatchMap;
    private String watchMapContourVersion;
    private String watchMapSkiVersion;
    private String watchMapVersion;

    public Boolean getEnableAutoUpdates() {
        return this.enableAutoUpdates;
    }

    public String getP() {
        return this.p;
    }

    public String getPoliticalView() {
        return this.politicalView;
    }

    public String getReviewNumberOfWatchMap() {
        return this.reviewNumberOfWatchMap;
    }

    public String getWatchMapContourVersion() {
        return this.watchMapContourVersion;
    }

    public String getWatchMapSkiVersion() {
        return this.watchMapSkiVersion;
    }

    public String getWatchMapVersion() {
        return this.watchMapVersion;
    }

    public void setEnableAutoUpdates(Boolean bool) {
        this.enableAutoUpdates = bool;
    }

    public void setP(String str) {
        this.p = str;
    }

    public void setPoliticalView(String str) {
        this.politicalView = str;
    }

    public void setReviewNumberOfWatchMap(String str) {
        this.reviewNumberOfWatchMap = str;
    }

    public void setWatchMapContourVersion(String str) {
        this.watchMapContourVersion = str;
    }

    public void setWatchMapSkiVersion(String str) {
        this.watchMapSkiVersion = str;
    }

    public void setWatchMapVersion(String str) {
        this.watchMapVersion = str;
    }
}
