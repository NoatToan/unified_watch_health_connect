package com.xiaomi.smarthome.library.http.async;

import com.xiaomi.smarthome.library.http.Error;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TextAsyncHandler extends AsyncHandler<String, Error> {
    @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
    public abstract void onFailure(Error error, Exception exc, Response response);

    @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
    public abstract void onSuccess(String str, Response response);

    @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
    public final void processFailure(Call call, IOException iOException) {
        sendFailureMessage(new Error(-1, ""), iOException, null);
    }

    @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
    public final void processResponse(Response response) {
        if (!response.isSuccessful()) {
            sendFailureMessage(new Error(response.code(), ""), null, response);
            return;
        }
        try {
            sendSuccessMessage(response.body().string(), response);
        } catch (Exception e) {
            sendFailureMessage(new Error(response.code(), ""), e, response);
        }
    }
}
