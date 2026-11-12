package com.xiaomi.wearable.core.server;

import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import com.xiaomi.wearable.wear.api.ThirdPartyApiCall;
import com.xiaomi.wearable.wear.api.WearApiCall;
import defpackage.lq2;
import defpackage.x6o;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001c\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/wearable/core/server/ApiCallFactory;", "", "<init>", "()V", "createApiCall", "Lcom/xiaomi/wearable/wear/api/WearApiCall;", "device", "Lcom/xiaomi/wearable/core/DeviceInfo;", "createThirdPartyApiCall", "api", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "TAG", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApiCallFactory {

    @NotNull
    public static final ApiCallFactory INSTANCE = new ApiCallFactory();

    @NotNull
    private static final String TAG = "ApiCallFactory";

    private ApiCallFactory() {
    }

    @JvmStatic
    @NotNull
    public static final WearApiCall<?> createApiCall(@NotNull DeviceInfo device) {
        WearApiCall<?> lq2Var;
        Intrinsics.checkNotNullParameter(device, "device");
        if (device.isBle() || device.isLocalBindMode()) {
            if (device.isEarphone()) {
                CoreExtKt.getLogger().i(TAG, "createApiCall() called with:  device.isEarphone()");
                lq2Var = new x6o(device);
            } else {
                lq2Var = new lq2(device);
            }
        } else {
            if (!device.isDual()) {
                throw new IllegalArgumentException("product type is not support, type = " + device.getType());
            }
            lq2Var = new x6o(device);
        }
        CoreExtKt.getLogger().i(TAG, "createApiCall() called with: device " + device);
        return lq2Var;
    }

    @NotNull
    public final WearApiCall<?> createThirdPartyApiCall(@NotNull DeviceInfo device, @Nullable IDeviceApiCall api) {
        Intrinsics.checkNotNullParameter(device, "device");
        if (device.isLocalBindMode() || device.isJumpScale()) {
            WearApiCall<?> x6oVar = device.isEarphone() ? new x6o(device) : new lq2(device);
            CoreExtKt.getLogger().i(TAG, "createApiCall() called with: device " + device);
            return x6oVar;
        }
        if (!device.isWearOs() && !device.isHuaMi() && !device.isBloodSugar()) {
            throw new IllegalArgumentException("product type is not support, type = " + device.getType());
        }
        if (api != null) {
            return new ThirdPartyApiCall(device, api);
        }
        throw new IllegalArgumentException("product api is null, type: " + device.getType());
    }
}
