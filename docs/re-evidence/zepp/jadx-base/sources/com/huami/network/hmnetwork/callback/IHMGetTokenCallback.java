package com.huami.network.hmnetwork.callback;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface IHMGetTokenCallback {
    void onError(Throwable th);

    void onSuccess(Map<String, String> map);
}
