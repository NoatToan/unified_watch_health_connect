package com.xiaomi.fitness.eco.device.contact.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncer;", "", "syncData", "", "did", "", "callBack", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;", "eco-device-contact-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EcoDeviceSyncer {
    void syncData(@NotNull String did, @Nullable EcoDeviceSyncCallback callBack);
}
