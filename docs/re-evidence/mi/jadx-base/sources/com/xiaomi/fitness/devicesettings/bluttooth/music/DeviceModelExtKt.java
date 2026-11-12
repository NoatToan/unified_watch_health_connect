package com.xiaomi.fitness.devicesettings.bluttooth.music;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.f6f;
import defpackage.h6f;
import defpackage.s7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0004\u001a\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"TAG", "", "pauseMass", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "cancelMass", "massControl", "controlType", "", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceModelExtKt {

    @NotNull
    private static final String TAG = "DeviceModelExt.Music";

    public static final void cancelMass(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Logger.i(TAG, "cancelMass: ");
        massControl(2);
    }

    private static final void massControl(int i) {
        Logger.i(TAG, "massControl() called with: controlType = " + i);
        s7r s7rVar = new s7r();
        s7rVar.e = 22;
        s7rVar.f = 1;
        f6f f6fVar = new f6f();
        h6f h6fVar = new h6f();
        h6fVar.c = i;
        h6fVar.d = 52;
        f6fVar.r(h6fVar);
        s7rVar.X(f6fVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.DeviceModelExtKt.massControl.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(DeviceModelExtKt.TAG, "onError() called with: did = " + did + ", type = " + type + ", code = " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(DeviceModelExtKt.TAG, "onSuccess() called with: did = " + did + ", type = " + type + ", result = " + result);
            }
        }, 0, 8, null);
    }

    public static final void pauseMass(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        massControl(1);
    }
}
