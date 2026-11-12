package com.xiaomi.continuity.channel;

import com.xiaomi.continuity.ServiceName;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public interface Channel {
    int getChannelId();

    ChannelInfo getChannelInfo();

    int getChannelRole();

    String getDeviceId();

    ServiceName getServiceName();

    boolean hasFragmentSupport();

    boolean isActive();

    void send(Packet packet);

    void send(Packet packet, PacketTransferProgressCallback packetTransferProgressCallback, Executor executor);
}
