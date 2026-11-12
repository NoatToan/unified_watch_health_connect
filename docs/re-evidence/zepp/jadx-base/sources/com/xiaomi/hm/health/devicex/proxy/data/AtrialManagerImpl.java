package com.xiaomi.hm.health.devicex.proxy.data;

import com.huami.devicex.injection.data.AtrialManagerApi;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.health.device.AtrialManagerKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/data/AtrialManagerImpl;", "Lcom/huami/devicex/injection/data/AtrialManagerApi;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "isSupportAtrialFib", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AtrialManagerImpl implements AtrialManagerApi {
    @Override // com.huami.devicex.injection.data.AtrialManagerApi
    public boolean isSupportAtrialFib(@NotNull HMDeviceType type) {
        return AtrialManagerKt.isSupportAtrialFib(type);
    }
}
