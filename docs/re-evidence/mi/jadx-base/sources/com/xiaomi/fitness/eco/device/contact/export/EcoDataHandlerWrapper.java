package com.xiaomi.fitness.eco.device.contact.export;

import com.xiaomi.fitness.common.log.Logger;
import defpackage.u7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u0010\u0010\u000fJ)\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u0011\u0010\u000fJ-\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandlerWrapper;", "Lcom/xiaomi/fitness/eco/device/contact/export/a$a;", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandler;", "", "did", "", "type", "Lu7r;", "packet", "", "handleEcoPacket", "(Ljava/lang/String;ILu7r;)Z", "", "data", "handleData", "(Ljava/lang/String;I[B)Z", "handleDataInternal", "handleEcoDataInternal", "nodeId", "path", "", "handleEcoData", "(Ljava/lang/String;Ljava/lang/String;[B)V", "updateDid", "(Ljava/lang/String;)V", "<init>", "()V", "eco-device-contact-export_release"}, k = 1, mv = {2, 0, 0})
public abstract class EcoDataHandlerWrapper extends a.AbstractBinderC0543a implements EcoDataHandler {
    public boolean handleData(@NotNull String did, int type, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        return false;
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.a
    public boolean handleDataInternal(@NotNull String did, int type, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i("handle data, did=" + did + ", type=" + type, new Object[0]);
        try {
            if (handleEcoPacket(did, type, u7r.y(data))) {
                return true;
            }
        } catch (Exception e) {
            Logger.i("handle data, exception:" + e, new Object[0]);
        }
        return handleData(did, type, data);
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.a
    public void handleEcoData(@Nullable String nodeId, @Nullable String path, @Nullable byte[] data) {
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.a
    public boolean handleEcoDataInternal(@NotNull String did, int type, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i("handle data, did=" + did + ", type=" + type, new Object[0]);
        try {
            if (handleEcoPacket(did, type, u7r.y(data))) {
                return true;
            }
        } catch (Exception e) {
            Logger.i("handle data, exception:" + e, new Object[0]);
        }
        return handleData(did, type, data);
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDataHandler
    public boolean handleEcoPacket(@NotNull String did, int type, @Nullable u7r packet) {
        Intrinsics.checkNotNullParameter(did, "did");
        return false;
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.a, com.xiaomi.fitness.eco.device.contact.export.EcoDataHandler
    public void updateDid(@Nullable String did) {
    }
}
