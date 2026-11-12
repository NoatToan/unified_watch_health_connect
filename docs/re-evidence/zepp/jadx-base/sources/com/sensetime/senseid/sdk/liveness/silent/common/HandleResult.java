package com.sensetime.senseid.sdk.liveness.silent.common;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class HandleResult extends AbstractJniResult {

    @Nullable
    private Object mHandle;

    public HandleResult(int i, @Nullable Object obj) {
        super(i);
        this.mHandle = obj;
    }

    @Nullable
    public Object getHandle() {
        return this.mHandle;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.AbstractJniResult
    public /* bridge */ /* synthetic */ int getResultCode() {
        return super.getResultCode();
    }
}
