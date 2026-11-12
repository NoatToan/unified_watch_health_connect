package com.huami.discovery.bridge;

import android.net.http.SslError;

/* JADX INFO: loaded from: classes8.dex */
public interface WebLoadCallback {
    void onError(int i);

    void onPageFinish();

    void onPageStart();

    void onProgressChanged(int i);

    void onReceivedTitle(String str);

    void onSslError(SslError sslError);
}
