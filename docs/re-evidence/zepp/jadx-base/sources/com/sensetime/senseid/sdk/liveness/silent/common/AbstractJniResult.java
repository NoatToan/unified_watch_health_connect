package com.sensetime.senseid.sdk.liveness.silent.common;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
abstract class AbstractJniResult {

    @Keep
    private int mResultCode;

    public AbstractJniResult(int i) {
        this.mResultCode = i;
    }

    public int getResultCode() {
        return this.mResultCode;
    }
}
