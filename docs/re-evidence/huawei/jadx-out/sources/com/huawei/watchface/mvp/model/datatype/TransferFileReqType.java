package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes20.dex */
public enum TransferFileReqType {
    APP_DELIVERY(0),
    DEVICE_REGISTRATION(1),
    DEVICE_UNREGISTRATION(2),
    APP_STOP(3);

    private int mValue;

    TransferFileReqType(int i) {
        this.mValue = i;
    }

    public int getValue() {
        return this.mValue;
    }
}
