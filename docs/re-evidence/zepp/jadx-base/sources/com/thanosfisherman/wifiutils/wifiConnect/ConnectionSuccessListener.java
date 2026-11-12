package com.thanosfisherman.wifiutils.wifiConnect;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public interface ConnectionSuccessListener {
    void failed(@NonNull ConnectionErrorCode connectionErrorCode);

    void success();
}
