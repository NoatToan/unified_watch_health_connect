package com.xiaomi.continuity.channel;

import com.xiaomi.continuity.ServiceName;

/* JADX INFO: loaded from: classes7.dex */
public interface ChannelInnerListener {
    String getFeatures();

    void onChannelConfirm(String str, ServiceName serviceName, int i, ConfirmInfoV2 confirmInfoV2);

    void onChannelCreateFailed(String str, ServiceName serviceName, int i, int i2);

    void onChannelCreated(String str, ServiceName serviceName, ChannelInfo channelInfo);

    void onChannelRelease(int i, int i2);

    default void onException(int i) {
    }

    void onReceived(int i, byte[] bArr, int i2);

    void onRequestSocketPort(String str, ServiceName serviceName, int i);

    void onServerRegisterStatus(ServiceName serviceName, int i);
}
