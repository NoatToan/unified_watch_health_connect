package com.xiaomi.fitness.eco.device.contact.extensions;

import com.xiaomi.fitness.eco.device.contact.syncer.BaseSyncer;
import com.xiaomi.fitness.eco.device.contact.syncer.BluetoothSyncer;
import com.xiaomi.fitness.eco.device.contact.syncer.HuaMiSyncer;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\" \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"mSyncers", "Ljava/util/HashMap;", "", "Lcom/xiaomi/fitness/eco/device/contact/syncer/BaseSyncer;", "getMSyncers", "()Ljava/util/HashMap;", "syncer", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getSyncer", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)Lcom/xiaomi/fitness/eco/device/contact/syncer/BaseSyncer;", "needSyncTypes", "Ljava/util/ArrayList;", "", "getNeedSyncTypes", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)Ljava/util/ArrayList;", "forceSyncTypes", "getForceSyncTypes", "isSportAlive", "", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)Z", "eco-device-contact_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceModelExtKt {

    @NotNull
    private static final HashMap<String, BaseSyncer> mSyncers = new HashMap<>();

    @NotNull
    public static final ArrayList<Integer> getForceSyncTypes(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return getSyncer(ecoDeviceModel).getForceSyncTypes();
    }

    @NotNull
    public static final HashMap<String, BaseSyncer> getMSyncers() {
        return mSyncers;
    }

    @NotNull
    public static final ArrayList<Integer> getNeedSyncTypes(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return getSyncer(ecoDeviceModel).getNeedSyncTypes();
    }

    @NotNull
    public static final BaseSyncer getSyncer(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        HashMap<String, BaseSyncer> map = mSyncers;
        BaseSyncer huaMiSyncer = map.get(ecoDeviceModel.getDid());
        if (huaMiSyncer == null) {
            huaMiSyncer = com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isHuaMi(ecoDeviceModel) ? new HuaMiSyncer(ecoDeviceModel) : new BluetoothSyncer(ecoDeviceModel);
            map.put(ecoDeviceModel.getDid(), huaMiSyncer);
        }
        return huaMiSyncer;
    }

    public static final boolean isSportAlive(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        return false;
    }
}
