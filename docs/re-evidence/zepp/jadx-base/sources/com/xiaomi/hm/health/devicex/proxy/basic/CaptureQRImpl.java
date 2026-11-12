package com.xiaomi.hm.health.devicex.proxy.basic;

import com.huami.devicex.injection.basic.CaptureQRApi;
import com.xiaomi.hm.health.device.capturedevice.CaptureQRResultKt;
import com.xiaomi.hm.health.device.capturedevice.DeviceQRInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/basic/CaptureQRImpl;", "Lcom/huami/devicex/injection/basic/CaptureQRApi;", "", "rawResult", "Lcom/xiaomi/hm/health/device/capturedevice/DeviceQRInfo;", "getDeviceQRInfo", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CaptureQRImpl implements CaptureQRApi {
    @Override // com.huami.devicex.injection.basic.CaptureQRApi
    @Nullable
    public DeviceQRInfo getDeviceQRInfo(@Nullable String rawResult) {
        return CaptureQRResultKt.getDeviceQRInfo(rawResult);
    }
}
