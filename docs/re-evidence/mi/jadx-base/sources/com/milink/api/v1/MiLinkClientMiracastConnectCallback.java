package com.milink.api.v1;

/* JADX INFO: loaded from: classes5.dex */
public interface MiLinkClientMiracastConnectCallback {
    void onConnectFail(String str);

    void onConnectSuccess(String str);

    void onConnecting(String str);

    void onResult(int i, String str, String str2);
}
