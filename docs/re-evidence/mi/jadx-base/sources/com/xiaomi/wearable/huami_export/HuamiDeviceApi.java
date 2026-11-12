package com.xiaomi.wearable.huami_export;

import com.xiaomi.wearable.core.CapabilityCallback;
import com.xiaomi.wearable.hm.HuamiStepListener;
import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/wearable/huami_export/HuamiDeviceApi;", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "setStepCallback", "", "callback", "Lcom/xiaomi/wearable/hm/HuamiStepListener;", "huami-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HuamiDeviceApi extends IDeviceApiCall {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void setDeviceCapabilityCallback(@NotNull HuamiDeviceApi huamiDeviceApi, @NotNull CapabilityCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            IDeviceApiCall.DefaultImpls.setDeviceCapabilityCallback(huamiDeviceApi, callback);
        }
    }

    void setStepCallback(@NotNull HuamiStepListener callback);
}
