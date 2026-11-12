package com.xiaomi.smarthome.library.http.async;

import java.lang.ref.WeakReference;
import okhttp3.Call;

/* JADX INFO: loaded from: classes2.dex */
public class HttpAsyncHandle {
    private final WeakReference<Call> mCall;

    public HttpAsyncHandle(Call call) {
        this.mCall = new WeakReference<>(call);
    }

    public void cancel() {
        Call call = this.mCall.get();
        if (call != null) {
            call.cancel();
        }
    }
}
