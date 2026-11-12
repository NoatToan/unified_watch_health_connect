package com.xiaomi.smarthome.library.http.sync;

import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SyncHandler<T> {
    public abstract T processResponse(Response response) throws Exception;
}
