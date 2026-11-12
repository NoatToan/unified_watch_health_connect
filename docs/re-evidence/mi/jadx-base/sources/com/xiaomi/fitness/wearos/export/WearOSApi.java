package com.xiaomi.fitness.wearos.export;

import com.xiaomi.wearable.core.CapabilityCallback;
import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import defpackage.kj2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/wearos/export/WearOSApi;", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "Lkj2;", "callback", "", "bindDevice", "(Lkj2;)V", "", "isPhoneSwitching", "()Z", "wearos-export_release"}, k = 1, mv = {2, 0, 0})
public interface WearOSApi extends IDeviceApiCall {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void setDeviceCapabilityCallback(@NotNull WearOSApi wearOSApi, @NotNull CapabilityCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            IDeviceApiCall.DefaultImpls.setDeviceCapabilityCallback(wearOSApi, callback);
        }
    }

    void bindDevice(@NotNull kj2 callback);

    boolean isPhoneSwitching();
}
