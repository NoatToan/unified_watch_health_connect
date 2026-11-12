package com.xiaomi.wearable.transport.layerl1;

import com.xiaomi.wearable.utils.CRCUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/wearable/transport/layerl1/DataPacket;", "Lcom/xiaomi/wearable/transport/layerl1/L1Packet;", "data", "", "<init>", "([B)V", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataPacket extends L1Packet {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataPacket(@NotNull byte[] data) {
        super(new L1Packet.Header((short) 0, (byte) 3, (byte) 0, (byte) 0, (byte) 0, data.length, (short) CRCUtil.CRC16(data.length, data), 29, null), data);
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
