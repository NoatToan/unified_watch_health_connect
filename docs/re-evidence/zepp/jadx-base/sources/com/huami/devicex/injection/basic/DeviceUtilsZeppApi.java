package com.huami.devicex.injection.basic;

import com.huami.watch.companion.device.Device;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/devicex/injection/basic/DeviceUtilsZeppApi;", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "Lcom/xiaomi/hm/health/databases/model/Device;", "mifitDevice", "Lcom/huami/watch/companion/device/Device;", "toWatchDevice", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceUtilsZeppApi extends DeviceUtilsApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static String getParamSource(@NotNull DeviceUtilsZeppApi deviceUtilsZeppApi) {
            return DeviceUtilsApi.DefaultImpls.getParamSource(deviceUtilsZeppApi);
        }
    }

    @Nullable
    Device toWatchDevice(@Nullable com.xiaomi.hm.health.databases.model.Device mifitDevice);
}
