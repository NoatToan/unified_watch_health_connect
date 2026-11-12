package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public enum NearLinkNaviStatus {
    INIT_SUCCEED(0),
    REQUEST_AR_POSE(1),
    ON_RANGE_RESULT(2),
    ENABLE_FINDER_SUCCEED(3);

    private int status;

    public int getType() {
        return this.status;
    }

    NearLinkNaviStatus(int i) {
        this.status = i;
    }
}
