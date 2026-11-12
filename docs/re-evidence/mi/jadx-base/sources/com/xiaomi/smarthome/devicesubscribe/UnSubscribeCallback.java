package com.xiaomi.smarthome.devicesubscribe;

import com.xiaomi.smarthome.frame.Error;

/* JADX INFO: loaded from: classes10.dex */
public interface UnSubscribeCallback {
    void onFailure(Error error);

    void onSuccess();
}
