package com.xiaomi.smarthome.library.bluetooth.connect.request;

import com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public interface IBleRequest {
    void cancel();

    void process(IBleConnectDispatcher iBleConnectDispatcher);
}
