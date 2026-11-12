package com.huawei.hms.hmsscankit;

import android.util.Log;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;

/* JADX INFO: loaded from: classes10.dex */
class c extends IOnErrorCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OnErrorCallback f13534a;

    c(OnErrorCallback onErrorCallback) {
        this.f13534a = onErrorCallback;
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnErrorCallback
    public void onError(int i) {
        if (this.f13534a != null) {
            Log.i("OnErrorCallbackDelegate", "onError: ErrorCode：" + i);
            this.f13534a.onError(i);
        }
    }
}
