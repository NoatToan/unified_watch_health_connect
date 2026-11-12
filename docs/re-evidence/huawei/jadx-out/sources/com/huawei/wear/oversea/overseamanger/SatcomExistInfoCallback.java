package com.huawei.wear.oversea.overseamanger;

/* JADX INFO: loaded from: classes20.dex */
public interface SatcomExistInfoCallback {

    /* JADX INFO: loaded from: classes46.dex */
    public interface ResultCode {
        public static final int PARAM_INVALID = -1;
        public static final int SUCCESS = 0;
    }

    void onResult(int i, int i2);
}
