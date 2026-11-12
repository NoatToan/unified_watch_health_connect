package com.xiaomi.continuity.channel;

import com.xiaomi.continuity.ServiceName;

/* JADX INFO: loaded from: classes7.dex */
public interface ChannelListener {
    void onChannelConfirm(String str, ServiceName serviceName, int i, ConfirmInfo confirmInfo);

    default void onChannelConfirmV2(String str, ServiceName serviceName, int i, ConfirmInfoV2 confirmInfoV2) {
        onChannelConfirm(str, serviceName, i, confirmInfoV2.toConfirmInfo());
    }

    void onChannelCreateFailed(String str, ServiceName serviceName, int i, int i2);

    void onChannelCreateSuccess(Channel channel);

    void onChannelReceive(Channel channel, Packet packet);

    void onChannelRelease(Channel channel, int i);

    default void onChannelTransferProgressUpdate(Channel channel, Packet packet, PacketTransferProgress packetTransferProgress) {
    }
}
