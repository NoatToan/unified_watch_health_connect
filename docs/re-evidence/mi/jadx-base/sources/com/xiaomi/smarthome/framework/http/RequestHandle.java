package com.xiaomi.smarthome.framework.http;

import java.lang.ref.WeakReference;
import okhttp3.Call;

/* JADX INFO: loaded from: classes2.dex */
public class RequestHandle {
    private final WeakReference<Call> mCall;

    public RequestHandle(Call call) {
        this.mCall = new WeakReference<>(call);
    }

    public void cancel() {
        Call call = this.mCall.get();
        if (call != null) {
            call.cancel();
        }
    }
}
