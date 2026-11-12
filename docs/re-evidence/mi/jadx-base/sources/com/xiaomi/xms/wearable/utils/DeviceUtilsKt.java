package com.xiaomi.xms.wearable.utils;

import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.xg1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"isCurrentDeviceModel", "", "did", "", "action", "Lkotlin/Function0;", "xmswearable_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceUtilsKt {
    public static final void isCurrentDeviceModel(@NotNull String did, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(action, "action");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        xg1.d("sendWeicharLicense2Device " + wearableDeviceModel + " " + (wearableDeviceModel != null ? wearableDeviceModel.getDid() : null) + " " + did);
        if (wearableDeviceModel == null || !Intrinsics.areEqual(wearableDeviceModel.getDid(), did)) {
            return;
        }
        action.invoke();
    }
}
