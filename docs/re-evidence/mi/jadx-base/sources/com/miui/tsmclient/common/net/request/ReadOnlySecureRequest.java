package com.miui.tsmclient.common.net.request;

import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.host.Host;
import com.miui.tsmclient.common.net.host.ReadOnlyAuthHost;

/* JADX INFO: loaded from: classes4.dex */
public class ReadOnlySecureRequest<T extends CommonResponseInfo> extends SecureRequest<T> {
    public ReadOnlySecureRequest(String str, String str2, TypeToken<T> typeToken) {
        super(str, str2, typeToken);
    }

    @Override // com.miui.tsmclient.common.net.request.BaseSecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public Host onCreateHost() {
        return new ReadOnlyAuthHost();
    }

    public ReadOnlySecureRequest(String str, String str2, Class<T> cls) {
        super(str, str2, cls);
    }

    public ReadOnlySecureRequest(String str, String str2, Class<T> cls, ResponseListener<T> responseListener) {
        super(str, str2, cls, responseListener);
    }

    public ReadOnlySecureRequest(String str, String str2, TypeToken<T> typeToken, ResponseListener<T> responseListener) {
        super(str, str2, typeToken, responseListener);
    }
}
