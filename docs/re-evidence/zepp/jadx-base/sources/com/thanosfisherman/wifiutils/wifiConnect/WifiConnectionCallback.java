package com.thanosfisherman.wifiutils.wifiConnect;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public interface WifiConnectionCallback {
    void errorConnect(@NonNull ConnectionErrorCode connectionErrorCode);

    void successfulConnect();
}
