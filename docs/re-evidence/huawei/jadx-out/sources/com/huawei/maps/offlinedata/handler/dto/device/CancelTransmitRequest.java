package com.huawei.maps.offlinedata.handler.dto.device;

/* JADX INFO: loaded from: classes40.dex */
public class CancelTransmitRequest {
    private Boolean isContinueTransmit;
    private Long requestId;

    public Boolean getContinueTransmit() {
        return this.isContinueTransmit;
    }

    public Long getRequestId() {
        return this.requestId;
    }

    public void setContinueTransmit(Boolean bool) {
        this.isContinueTransmit = bool;
    }

    public void setRequestId(Long l) {
        this.requestId = l;
    }
}
