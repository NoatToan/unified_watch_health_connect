package com.xiaomi.xms.wearable.utils;

import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import defpackage.s7r;
import defpackage.xg1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/xms/wearable/utils/MarketHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "()V", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
public final class MarketHandler extends DataHandlerWrapper {
    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        Intrinsics.checkNotNullParameter(did, "did");
        xg1.d("MarketHandler handleData");
        Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
        if (numValueOf != null && numValueOf.intValue() == 6) {
            packet.y().p();
        }
        return super.handlePacket(did, type, packet);
    }
}
