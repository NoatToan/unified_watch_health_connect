package com.thanosfisherman.wifiutils.wifiDisconnect;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public interface DisconnectionSuccessListener {
    void failed(@NonNull DisconnectionErrorCode disconnectionErrorCode);

    void success();
}
