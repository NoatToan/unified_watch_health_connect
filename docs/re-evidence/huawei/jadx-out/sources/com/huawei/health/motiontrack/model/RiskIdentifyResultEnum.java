package com.huawei.health.motiontrack.model;

/* JADX INFO: loaded from: classes7.dex */
public enum RiskIdentifyResultEnum {
    SUCCEED(0),
    FAIL(30001001),
    REACH_MAX_QUOTA_LIMIT(30000001);

    private final int code;

    RiskIdentifyResultEnum(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
