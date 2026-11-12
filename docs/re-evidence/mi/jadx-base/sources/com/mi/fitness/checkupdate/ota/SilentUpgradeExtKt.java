package com.mi.fitness.checkupdate.ota;

import android.content.Intent;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.aje;
import defpackage.f6f;
import defpackage.h6f;
import defpackage.s7r;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0003*\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0003*\u00020\f¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a\"\u0014\u0010 \u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001a\"\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/SilentUpgradeManager;", "", "reason", "", SilentUpgradeExtKt.ACTION_INTERRUPTED, "(Lcom/mi/fitness/checkupdate/ota/SilentUpgradeManager;I)V", "finished", "(Lcom/mi/fitness/checkupdate/ota/SilentUpgradeManager;)V", "Ljava/io/Serializable;", "updateInfo", "forceUpgrade", "(Ljava/io/Serializable;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "supportSilentUpgrade", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "deviceModel", "isHuamiDeviceSupportSilentUpgrade", "pauseMass", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "cancelMass", "controlType", "massControl", "(I)V", "", "TAG", "Ljava/lang/String;", "SILENT_UPGRADE_ACTION", "UPGRADE_FORCE_ACTION", "IN_OTA_PAGE_ACTION", "ACTION_INTERRUPTED", "ACTION_INTERRUPT_SELF", "ACTION_FINISH", "Laje;", "instance", "Laje;", "getInstance", "()Laje;", "checkupdate_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class SilentUpgradeExtKt {

    @NotNull
    public static final String ACTION_FINISH = "finish";

    @NotNull
    public static final String ACTION_INTERRUPTED = "interrupted";

    @NotNull
    public static final String ACTION_INTERRUPT_SELF = "interruptSelf";

    @NotNull
    public static final String IN_OTA_PAGE_ACTION = "com.mi.health.silent.upgrade.visibility";

    @NotNull
    public static final String SILENT_UPGRADE_ACTION = "com.mi.fitness.checkupdate.ota.silent_upgrade";

    @NotNull
    private static final String TAG = "SilentUpgradeExt";

    @NotNull
    public static final String UPGRADE_FORCE_ACTION = "com.mi.fitness.checkupdate.ota.force_upgrade";

    @NotNull
    private static final aje instance;

    static {
        aje ajeVarB = aje.b(ApplicationExtKt.getApplication());
        Intrinsics.checkNotNullExpressionValue(ajeVarB, "getInstance(...)");
        instance = ajeVarB;
    }

    public static final void cancelMass(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Logger.i(TAG, "cancelMass: ");
        massControl(2);
    }

    public static final void finished(@NotNull SilentUpgradeManager silentUpgradeManager) {
        Intrinsics.checkNotNullParameter(silentUpgradeManager, "<this>");
        Intent intent = new Intent(SILENT_UPGRADE_ACTION);
        intent.putExtra("action", "finish");
        instance.d(intent);
    }

    public static final void forceUpgrade(@NotNull Serializable updateInfo) {
        Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        Intent intent = new Intent(UPGRADE_FORCE_ACTION);
        intent.putExtra("updateInfo", updateInfo);
        intent.setPackage("com.mi.health");
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }

    @NotNull
    public static final aje getInstance() {
        return instance;
    }

    public static final void interrupted(@NotNull SilentUpgradeManager silentUpgradeManager, int i) {
        Intrinsics.checkNotNullParameter(silentUpgradeManager, "<this>");
        Intent intent = new Intent(SILENT_UPGRADE_ACTION);
        intent.putExtra("action", ACTION_INTERRUPTED);
        intent.putExtra("reason", i);
        instance.d(intent);
    }

    private static final boolean isHuamiDeviceSupportSilentUpgrade(WearableDeviceModel wearableDeviceModel) {
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        Boolean boolValueOf = huaMiApiCaller != null ? Boolean.valueOf(huaMiApiCaller.supportSilentUpgrade()) : null;
        Logger.i(TAG, "supportSilentUpgrade: " + boolValueOf);
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private static final void massControl(int i) {
        Logger.i(TAG, "massControl() called with: controlType = " + i);
        s7r s7rVar = new s7r();
        s7rVar.e = 22;
        s7rVar.f = 1;
        f6f f6fVar = new f6f();
        h6f h6fVar = new h6f();
        h6fVar.c = i;
        h6fVar.d = 47;
        f6fVar.r(h6fVar);
        s7rVar.X(f6fVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.mi.fitness.checkupdate.ota.SilentUpgradeExtKt.massControl.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(SilentUpgradeExtKt.TAG, "onError() called with: did = " + did + ", type = " + type + ", code = " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(SilentUpgradeExtKt.TAG, "onSuccess() called with: did = " + did + ", type = " + type + ", result = " + result);
            }
        }, 0, 8, null);
    }

    public static final void pauseMass(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        massControl(1);
    }

    public static final boolean supportSilentUpgrade(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            return isHuamiDeviceSupportSilentUpgrade(wearableDeviceModel);
        }
        boolean z = (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(wearableDeviceModel.getDid()) & 1) != 0;
        Logger.i(TAG, "supportSilentUpgrade: result " + z);
        return z;
    }
}
