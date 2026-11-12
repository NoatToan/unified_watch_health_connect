package com.xiaomi.wearable.transport.layerl1;

import com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/ACKPacket;", "Lcom/xiaomi/wearable/transport/layerl1/L1Packet;", Packet.ACK, "", "seqNum", "Lkotlin/UByte;", "force", "<init>", "(ZBZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ACKPacket extends L1Packet {
    public /* synthetic */ ACKPacket(boolean z, byte b2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, b2, z2);
    }

    public /* synthetic */ ACKPacket(boolean z, byte b2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, b2, (i & 4) != 0 ? false : z2, null);
    }

    private ACKPacket(boolean z, byte b2, boolean z2) {
        super(new L1Packet.Header((short) 0, z ? (byte) 1 : (byte) 0, z2 ? (byte) 1 : (byte) 0, (byte) 0, b2, 0, (short) 0, 9, null), null);
    }
}
