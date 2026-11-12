package com.xiaomi.continuity.channel;

import com.xiaomi.continuity.ServiceName;
import com.xiaomi.continuity.jni.NObject;

/* JADX INFO: loaded from: classes7.dex */
class NConnMgrChannelListener extends NObject implements ChannelInnerListener {
    private final boolean mDiscarded = false;

    @Override // com.xiaomi.continuity.channel.ChannelInnerListener
    public String getFeatures() {
        return null;
    }

    @Override // com.xiaomi.continuity.channel.ChannelInnerListener
    public native void onChannelConfirm(String str, ServiceName serviceName, int i, ConfirmInfoV2 confirmInfoV2);

    @Override // com.xiaomi.continuity.channel.ChannelInnerListener
    public native void onChannelCreateFailed(String str, ServiceName serviceName, int i, int i2);

    @Override // com.xiaomi.continuity.channel.ChannelInnerListener
    public native void onChannelCreated(String str, ServiceName serviceName, ChannelInfo channelInfo);

    @Override // com.xiaomi.continuity.channel.ChannelInnerListener
    public native void onChannelRelease(int i, int i2);

    @Override // com.xiaomi.continuity.channel.ChannelInnerListener
    public native void onException(int i);

    @Override // com.xiaomi.continuity.channel.ChannelInnerListener
    public native void onReceived(int i, byte[] bArr, int i2);

    @Override // com.xiaomi.continuity.channel.ChannelInnerListener
    public native void onRequestSocketPort(String str, ServiceName serviceName, int i);

    @Override // com.xiaomi.continuity.channel.ChannelInnerListener
    public native void onServerRegisterStatus(ServiceName serviceName, int i);
}
