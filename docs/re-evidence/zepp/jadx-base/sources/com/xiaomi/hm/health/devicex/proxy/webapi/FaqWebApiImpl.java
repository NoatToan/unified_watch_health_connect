package com.xiaomi.hm.health.devicex.proxy.webapi;

import com.huami.devicex.injection.webapi.FaqWebApi;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.ui.playmiband2.webapi.DeviceManualFaqWebApi;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/webapi/FaqWebApiImpl;", "Lcom/huami/devicex/injection/webapi/FaqWebApi;", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "info", "", "isDeviceManualFaqShow", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FaqWebApiImpl implements FaqWebApi {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.devicex.injection.webapi.FaqWebApi
    @Nullable
    public String isDeviceManualFaqShow(@NotNull DeviceInfo info) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        DeviceManualFaqWebApi.isDeviceManualFaqShow(info, new DeviceManualFaqWebApi.Callback() { // from class: com.xiaomi.hm.health.devicex.proxy.webapi.FaqWebApiImpl.isDeviceManualFaqShow.1
            @Override // com.xiaomi.hm.health.ui.playmiband2.webapi.DeviceManualFaqWebApi.Callback, com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback
            public void hide() {
                countDownLatch.countDown();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.xiaomi.hm.health.ui.playmiband2.webapi.DeviceManualFaqWebApi.Callback, com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback
            public void show(@NotNull String url) {
                objectRef.element = url;
                countDownLatch.countDown();
            }
        });
        countDownLatch.await();
        return (String) objectRef.element;
    }
}
