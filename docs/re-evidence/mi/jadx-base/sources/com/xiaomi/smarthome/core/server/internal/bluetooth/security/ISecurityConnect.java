package com.xiaomi.smarthome.core.server.internal.bluetooth.security;

import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleConnectResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface ISecurityConnect {
    void connect(BleConnectOptions bleConnectOptions, BleConnectResponse bleConnectResponse);

    void disconnect();
}
