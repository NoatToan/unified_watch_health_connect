package com.mi.fitness.checkupdate.eco.ota;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import defpackage.g6f;
import defpackage.i6f;
import defpackage.u7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0004\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"TAG", "", "supportSilentUpgrade", "", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "pauseMass", "", "massControl", "controlType", "", "checkupdate_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoSilentUpgradeExtKt {

    @NotNull
    private static final String TAG = "EcoSilentUpgradeExt";

    private static final void massControl(int i) {
        Logger.i(TAG, "massControl() called with: controlType = " + i);
        u7r u7rVar = new u7r();
        u7rVar.e = 22;
        u7rVar.f = 1;
        g6f g6fVar = new g6f();
        i6f i6fVar = new i6f();
        i6fVar.c = i;
        i6fVar.d = 47;
        g6fVar.q(i6fVar);
        u7rVar.C(g6fVar);
        EcoDeviceContact.DefaultImpls.call$default(EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE), u7rVar, false, new OnEcoSyncCallback() { // from class: com.mi.fitness.checkupdate.eco.ota.EcoSilentUpgradeExtKt.massControl.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(EcoSilentUpgradeExtKt.TAG, "onError() called with: did = " + did + ", type = " + type + ", code = " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.i(EcoSilentUpgradeExtKt.TAG, "onSuccess() called with: did = " + did + ", type = " + type + ", result = " + result);
            }
        }, 0, 8, null);
    }

    public static final void pauseMass(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        massControl(1);
    }

    public static final boolean supportSilentUpgrade(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        boolean z = (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(ecoDeviceModel.getDid()) & 1) != 0;
        Logger.i(TAG, "supportSilentUpgrade: result " + z);
        return z;
    }
}
