package com.xiaomi.eco.api;

/* JADX INFO: loaded from: classes7.dex */
public interface p {

    public interface a {
        void onCallback(EcoApiResult ecoApiResult);
    }

    public interface b {
        void onConnected();

        void onDisconnected();
    }

    public interface c {
    }

    void cancel(com.xiaomi.eco.api.b bVar);

    void onReceiveResponse(com.xiaomi.eco.api.b bVar);

    void onResponseTimeout(com.xiaomi.eco.api.b bVar);

    void onSendFailed(com.xiaomi.eco.api.b bVar, boolean z);

    void onSendSuccess(com.xiaomi.eco.api.b bVar);
}
