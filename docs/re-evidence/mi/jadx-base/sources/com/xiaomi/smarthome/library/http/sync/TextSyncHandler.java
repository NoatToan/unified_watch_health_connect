package com.xiaomi.smarthome.library.http.sync;

import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class TextSyncHandler extends SyncHandler<String> {
    @Override // com.xiaomi.smarthome.library.http.sync.SyncHandler
    public String processResponse(Response response) throws Exception {
        if (response.isSuccessful()) {
            return response.body().string();
        }
        throw new RuntimeException("failure code:" + response.code());
    }
}
