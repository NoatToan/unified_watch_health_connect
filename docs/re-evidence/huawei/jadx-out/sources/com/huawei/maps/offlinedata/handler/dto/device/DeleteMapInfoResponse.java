package com.huawei.maps.offlinedata.handler.dto.device;

/* JADX INFO: loaded from: classes12.dex */
public class DeleteMapInfoResponse {
    private String cityId;
    private Integer mapDeleteState;
    private Integer mapType;

    public String getCityId() {
        return this.cityId;
    }

    public Integer getMapDeleteState() {
        return this.mapDeleteState;
    }

    public int getMapType() {
        return this.mapType.intValue();
    }

    public void setCityId(String str) {
        this.cityId = str;
    }

    public void setMapDeleteState(Integer num) {
        this.mapDeleteState = num;
    }

    public void setMapType(int i) {
        this.mapType = Integer.valueOf(i);
    }
}
