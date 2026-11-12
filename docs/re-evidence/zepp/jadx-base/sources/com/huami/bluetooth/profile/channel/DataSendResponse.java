package com.huami.bluetooth.profile.channel;

import com.huami.bluetooth.profile.channel.model.ChannelReplyPacket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/DataSendResponse;", "", "", "toString", "", "a", "Z", "getResult", "()Z", "result", "Lcom/huami/bluetooth/profile/channel/model/ChannelReplyPacket;", "b", "Lcom/huami/bluetooth/profile/channel/model/ChannelReplyPacket;", "getData", "()Lcom/huami/bluetooth/profile/channel/model/ChannelReplyPacket;", "data", "<init>", "(ZLcom/huami/bluetooth/profile/channel/model/ChannelReplyPacket;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DataSendResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final ChannelReplyPacket data;

    public DataSendResponse(boolean z, @Nullable ChannelReplyPacket channelReplyPacket) {
        this.result = z;
        this.data = channelReplyPacket;
    }

    @Nullable
    public final ChannelReplyPacket getData() {
        return this.data;
    }

    public final boolean getResult() {
        return this.result;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataSendResponse(result=");
        sb.append(this.result);
        sb.append(", data=");
        ChannelReplyPacket channelReplyPacket = this.data;
        sb.append((Object) (channelReplyPacket == null ? null : channelReplyPacket.toString()));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ DataSendResponse(boolean z, ChannelReplyPacket channelReplyPacket, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : channelReplyPacket);
    }
}
