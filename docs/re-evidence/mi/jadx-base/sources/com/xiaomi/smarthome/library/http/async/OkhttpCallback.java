package com.xiaomi.smarthome.library.http.async;

import com.xiaomi.smarthome.library.http.Error;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public interface OkhttpCallback<R> {
    void onFailure(Error error, Exception exc, Response response);

    void onSuccess(R r2, Response response);
}
