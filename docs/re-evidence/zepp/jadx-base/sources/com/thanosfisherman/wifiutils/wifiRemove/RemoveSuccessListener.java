package com.thanosfisherman.wifiutils.wifiRemove;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public interface RemoveSuccessListener {
    void failed(@NonNull RemoveErrorCode removeErrorCode);

    void success();
}
