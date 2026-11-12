package com.huami.bluetooth.profile.channel;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.huami.bluetooth.profile.channel.model.ChannelDataPacket;
import com.huami.bluetooth.profile.channel.model.FirstPacket;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelApiImpl;", "Lcom/huami/bluetooth/profile/channel/BaseChannelApiImpl;", "", "flag", "sessionId", "packetIndex", "totalSize", "module", "", "data", "Lcom/huami/bluetooth/profile/channel/model/ChannelDataPacket;", "createPacket", "byteArray", "parseDataPacket", SDKConstants.PARAM_SESSION_ID, "code", "index", "packetReply", "firstPacketSize", "subsequentHeadSize", "Lcom/huami/bluetooth/profile/channel/ChannelCallbackHolder;", "l", "Lcom/huami/bluetooth/profile/channel/ChannelCallbackHolder;", "channelCallbackHolder", "Lcom/huami/bluetooth/profile/channel/Channel;", "channel", "<init>", "(Lcom/huami/bluetooth/profile/channel/Channel;Lcom/huami/bluetooth/profile/channel/ChannelCallbackHolder;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelApiImpl extends BaseChannelApiImpl {
    public static final int FIRST_PACKET_HEADER_SIZE = 10;
    public static final int SUBSEQUENT_PACKET_HEADER_SIZE = 4;

    @NotNull
    private static final String m = "ChannelApi";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final ChannelCallbackHolder channelCallbackHolder;

    public ChannelApiImpl(@NotNull Channel channel, @NotNull ChannelCallbackHolder channelCallbackHolder) {
        super(channel, channelCallbackHolder, 0);
        this.channelCallbackHolder = channelCallbackHolder;
    }

    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl
    @NotNull
    public ChannelDataPacket createPacket(int flag, int sessionId, int packetIndex, int totalSize, int module, @NotNull byte[] data) {
        return (flag & 1) > 0 ? new FirstPacket(flag, sessionId, packetIndex, totalSize, module, data, 0, 64, null) : new ChannelDataPacket(flag, sessionId, packetIndex, data, 0, 16, null);
    }

    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl
    public int firstPacketSize() {
        return 10;
    }

    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl
    @NotNull
    public byte[] packetReply(int module, int sessionID, int code, int index) {
        return new byte[]{(byte) module, (byte) sessionID, (byte) code, (byte) index};
    }

    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl
    @NotNull
    public ChannelDataPacket parseDataPacket(@NotNull byte[] byteArray) {
        return ChannelDataPacket.INSTANCE.parseFromRawData(byteArray);
    }

    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl
    public int subsequentHeadSize() {
        return 4;
    }
}
