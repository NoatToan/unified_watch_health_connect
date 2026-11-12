package com.xiaomi.fitness.eco.device.contact.export;

import defpackage.u7r;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated(message = "直接使用EcoDataHandlerWrapper")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandler;", "", "", "did", "", "type", "Lu7r;", "packet", "", "handleEcoPacket", "(Ljava/lang/String;ILu7r;)Z", "", "data", "handleData", "(Ljava/lang/String;I[B)Z", "", "updateDid", "(Ljava/lang/String;)V", "eco-device-contact-export_release"}, k = 1, mv = {2, 0, 0})
public interface EcoDataHandler {
    boolean handleData(@NotNull String did, int type, @Nullable byte[] data);

    boolean handleEcoPacket(@NotNull String did, int type, @Nullable u7r packet);

    void updateDid(@Nullable String did);
}
