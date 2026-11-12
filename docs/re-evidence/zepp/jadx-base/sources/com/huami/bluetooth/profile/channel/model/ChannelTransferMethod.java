package com.huami.bluetooth.profile.channel.model;

import com.xiaomi.hm.health.bt.classic.Protocol;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.UUID;
import kotlin.Metadata;
import org.cybergarage.upnp.device.ST;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/ChannelTransferMethod;", "", "Lcom/xiaomi/hm/health/bt/classic/Protocol;", "protocol", "Lcom/xiaomi/hm/health/bt/classic/Protocol;", "getProtocol", "()Lcom/xiaomi/hm/health/bt/classic/Protocol;", "Ljava/util/UUID;", ST.UUID_DEVICE, "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "<init>", "(Ljava/lang/String;ILcom/xiaomi/hm/health/bt/classic/Protocol;Ljava/util/UUID;)V", "ChannelDown", "ChannelUp", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum ChannelTransferMethod {
    ChannelDown(Protocol.CHANNEL_DOWN, GattUtils.uuid128(22)),
    ChannelUp(Protocol.CHANNEL_UP, GattUtils.uuid128(23));


    @NotNull
    private final Protocol protocol;

    @NotNull
    private final UUID uuid;

    ChannelTransferMethod(Protocol protocol, UUID uuid) {
        this.protocol = protocol;
        this.uuid = uuid;
    }

    @NotNull
    public final Protocol getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final UUID getUuid() {
        return this.uuid;
    }
}
