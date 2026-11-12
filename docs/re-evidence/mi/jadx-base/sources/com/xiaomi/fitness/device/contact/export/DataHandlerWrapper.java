package com.xiaomi.fitness.device.contact.export;

import defpackage.s7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "Lcom/xiaomi/fitness/device/contact/export/DataHandler;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "", "data", "handleData", "(Ljava/lang/String;I[B)Z", "<init>", "()V", "device-contact-export_release"}, k = 1, mv = {2, 0, 0})
public abstract class DataHandlerWrapper implements DataHandler {
    @Override // com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handleData(@NotNull String did, int type, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        return false;
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        Intrinsics.checkNotNullParameter(did, "did");
        return false;
    }
}
