package com.huami.bluetooth.profile.channel.impl;

import com.huami.bluetooth.profile.channel.ReplyParseApi;
import com.huami.bluetooth.profile.channel.model.ChannelReplyPacket;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/impl/ReplyParseV1Impl;", "Lcom/huami/bluetooth/profile/channel/ReplyParseApi;", "", "data", "Lcom/huami/bluetooth/profile/channel/model/ChannelReplyPacket;", "parse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ReplyParseV1Impl implements ReplyParseApi {
    @Override // com.huami.bluetooth.profile.channel.ReplyParseApi
    @Nullable
    public ChannelReplyPacket parse(@NotNull byte[] data) {
        if (data.length != 4) {
            return null;
        }
        return new ChannelReplyPacket(data[0] & 255, data[1] & 255, data[2] & 255, data[3] & 255, 0, 16, null);
    }
}
