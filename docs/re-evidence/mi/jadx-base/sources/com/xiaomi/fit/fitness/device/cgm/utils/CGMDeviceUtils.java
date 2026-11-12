package com.xiaomi.fit.fitness.device.cgm.utils;

import com.xiaomi.fit.fitness.device.cgm.utils.CGMDeviceUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/device/cgm/utils/CGMDeviceUtils;", "", "<init>", "()V", "MODEL_CGM", "", "getCGMDevice", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModelIfCGMDevice", "did", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CGMDeviceUtils {

    @NotNull
    public static final CGMDeviceUtils INSTANCE = new CGMDeviceUtils();

    @NotNull
    private static final String MODEL_CGM = "synaps.watch.m8";

    private CGMDeviceUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getCGMDevice$lambda$0(WearableDeviceModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(DeviceModelExtKt.getModel(it), "synaps.watch.m8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getDeviceModelIfCGMDevice$lambda$1(String str, WearableDeviceModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getDid(), str) && Intrinsics.areEqual(DeviceModelExtKt.getModel(it), "synaps.watch.m8");
    }

    @Nullable
    public final WearableDeviceModel getCGMDevice() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).findDeviceModel(new Function1() { // from class: o83
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(CGMDeviceUtils.getCGMDevice$lambda$0((WearableDeviceModel) obj));
            }
        });
    }

    @Nullable
    public final WearableDeviceModel getDeviceModelIfCGMDevice(@Nullable final String did) {
        if (did == null) {
            return null;
        }
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).findDeviceModel(new Function1() { // from class: p83
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(CGMDeviceUtils.getDeviceModelIfCGMDevice$lambda$1(did, (WearableDeviceModel) obj));
            }
        });
    }
}
