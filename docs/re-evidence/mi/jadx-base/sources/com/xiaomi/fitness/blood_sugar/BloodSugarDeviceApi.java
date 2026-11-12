package com.xiaomi.fitness.blood_sugar;

import com.xiaomi.wearable.core.CapabilityCallback;
import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/BloodSugarDeviceApi;", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BloodSugarDeviceApi extends IDeviceApiCall {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void setDeviceCapabilityCallback(@NotNull BloodSugarDeviceApi bloodSugarDeviceApi, @NotNull CapabilityCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            IDeviceApiCall.DefaultImpls.setDeviceCapabilityCallback(bloodSugarDeviceApi, callback);
        }
    }
}
