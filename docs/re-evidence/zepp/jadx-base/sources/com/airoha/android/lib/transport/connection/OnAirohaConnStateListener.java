package com.airoha.android.lib.transport.connection;

/* JADX INFO: loaded from: classes2.dex */
public interface OnAirohaConnStateListener {
    void OnConnected(String str);

    void OnConnecting();

    void OnConnectionTimeout();

    void OnDisConnecting();

    void OnDisconnected();

    void OnUnexpectedDisconnected();
}
