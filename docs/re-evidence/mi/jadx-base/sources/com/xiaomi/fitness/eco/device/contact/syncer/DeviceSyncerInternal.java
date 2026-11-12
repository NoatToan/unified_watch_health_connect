package com.xiaomi.fitness.eco.device.contact.syncer;

import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/syncer/DeviceSyncerInternal;", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncer;", "type", "", "getType", "()I", "syncData", "", "did", "", "callBack", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;", "eco-device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceSyncerInternal extends EcoDeviceSyncer {
    int getType();

    void syncData(@NotNull String did, int type, @Nullable EcoDeviceSyncCallback callBack);
}
