package com.xiaomi.continuity.channel;

import com.xiaomi.continuity.ServiceName;
import com.xiaomi.continuity.jni.NObject;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
class NChannel extends NObject implements Channel {
    private boolean mActive = true;
    private static final ConcurrentHashMap<Long, SendParams> sSendParamsMap = new ConcurrentHashMap<>();
    private static final ConcurrentLinkedQueue<NObject> sListeningNObjs = new ConcurrentLinkedQueue<>();

    public static class SendParams {
        public final PacketTransferProgressCallback callback;
        public final Executor executor;
        public final Packet packet;

        public SendParams(Packet packet, PacketTransferProgressCallback packetTransferProgressCallback, Executor executor) {
            this.packet = packet;
            this.callback = packetTransferProgressCallback;
            this.executor = executor;
        }
    }

    private static void addSendParams(long j, SendParams sendParams) {
        sSendParamsMap.put(Long.valueOf(j), sendParams);
    }

    private static void delSendParams(long j) {
        sSendParamsMap.remove(Long.valueOf(j));
    }

    private static SendParams getSendParams(long j) {
        return sSendParamsMap.get(Long.valueOf(j));
    }

    private static void keepListening(NObject nObject) {
        sListeningNObjs.add(nObject);
    }

    private native void send2(Packet packet);

    private static void stopListening(NObject nObject) {
        sListeningNObjs.remove(nObject);
    }

    @Override // com.xiaomi.continuity.channel.Channel
    public native int getChannelId();

    @Override // com.xiaomi.continuity.channel.Channel
    public native ChannelInfo getChannelInfo();

    @Override // com.xiaomi.continuity.channel.Channel
    public native int getChannelRole();

    @Override // com.xiaomi.continuity.channel.Channel
    public native String getDeviceId();

    @Override // com.xiaomi.continuity.channel.Channel
    public native ServiceName getServiceName();

    @Override // com.xiaomi.continuity.channel.Channel
    public native boolean hasFragmentSupport();

    @Override // com.xiaomi.continuity.channel.Channel
    public boolean isActive() {
        return this.mActive;
    }

    @Override // com.xiaomi.continuity.channel.Channel
    public void send(Packet packet) {
        send2(packet);
    }

    @Override // com.xiaomi.continuity.channel.Channel
    public native void send(Packet packet, PacketTransferProgressCallback packetTransferProgressCallback, Executor executor);

    public String toString() {
        return getChannelId() + "/" + getDeviceId();
    }
}
