package com.xiaomi.fitness.nfc.utils;

import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"isOldMasterCardDevice", "", "nfc_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NfcUtilsKt {
    public static final boolean isOldMasterCardDevice() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return CollectionsKt___CollectionsKt.contains(CollectionsKt__CollectionsKt.arrayListOf("k62a", "l61tw", "XMSH16HM", "l61w", "M2130B1", "k63a", "n62w"), wearableDeviceModel != null ? wearableDeviceModel.getAlias() : null);
    }
}
