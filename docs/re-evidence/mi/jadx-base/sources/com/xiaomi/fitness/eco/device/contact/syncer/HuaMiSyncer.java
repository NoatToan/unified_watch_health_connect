package com.xiaomi.fitness.eco.device.contact.syncer;

import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/syncer/HuaMiSyncer;", "Lcom/xiaomi/fitness/eco/device/contact/syncer/BaseSyncer;", "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)V", "eco-device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuaMiSyncer extends BaseSyncer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuaMiSyncer(@NotNull EcoDeviceModel deviceModel) {
        super(deviceModel);
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        addSyncer(false, HuamiTimeSyncer.INSTANCE.getInstance(), 4);
    }
}
