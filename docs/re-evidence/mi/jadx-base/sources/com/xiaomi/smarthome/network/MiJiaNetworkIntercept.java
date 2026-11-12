package com.xiaomi.smarthome.network;

import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.NetHandle;

/* JADX INFO: loaded from: classes2.dex */
public interface MiJiaNetworkIntercept {
    NetHandle sendRequest(NetRequest netRequest, NetCallback<NetResult, NetError> netCallback);
}
