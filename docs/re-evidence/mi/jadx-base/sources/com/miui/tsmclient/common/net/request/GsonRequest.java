package com.miui.tsmclient.common.net.request;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.common.net.RequestCallback;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GsonRequest<T> extends BaseRequest<T> {
    private Gson mGson;
    private TypeToken<T> mTypeToken;

    public GsonRequest(String str, String str2, TypeToken<T> typeToken) {
        this(str, str2, typeToken, (RequestCallback) null);
    }

    public Gson getGson() {
        return new Gson();
    }

    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public T parseBody(boolean z, InputStream inputStream, long j) throws IOException {
        throw new UnsupportedOperationException();
    }

    public GsonRequest(String str, String str2, Class<T> cls) {
        this(str, str2, TypeToken.get((Class) cls), (RequestCallback) null);
    }

    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public T parseBody(boolean z, String str) throws IOException {
        try {
            return (T) this.mGson.fromJson(str, this.mTypeToken.getType());
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public GsonRequest(String str, String str2, Class<T> cls, RequestCallback<T> requestCallback) {
        this(str, str2, TypeToken.get((Class) cls), requestCallback);
    }

    public GsonRequest(String str, String str2, TypeToken<T> typeToken, RequestCallback<T> requestCallback) {
        super(str, str2, requestCallback);
        this.mGson = getGson();
        this.mTypeToken = typeToken;
    }
}
