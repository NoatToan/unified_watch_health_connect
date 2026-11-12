package com.huami.watch.companion.util;

import com.huami.hid.takepic.TakePicSettingActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u000f\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/watch/companion/util/BindBaseLogicProxy;", "Lcom/huami/watch/companion/util/IBindBaseLogicCallback;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "getOfficialName", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Ljava/util/HashMap;", "getBoundDevices", "deviceSource", "", TakePicSettingActivity.KEY_IS_WATCH, "a", "Lcom/huami/watch/companion/util/IBindBaseLogicCallback;", "proxy", "<init>", "(Lcom/huami/watch/companion/util/IBindBaseLogicCallback;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class BindBaseLogicProxy implements IBindBaseLogicCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBindBaseLogicCallback proxy;

    public BindBaseLogicProxy(@NotNull IBindBaseLogicCallback iBindBaseLogicCallback) {
        this.proxy = iBindBaseLogicCallback;
    }

    @Override // com.huami.watch.companion.util.IBindBaseLogicCallback
    @Nullable
    public HashMap<String, HMDeviceType> getBoundDevices(@NotNull HMDeviceType deviceType) {
        return this.proxy.getBoundDevices(deviceType);
    }

    @Override // com.huami.watch.companion.util.IBindBaseLogicCallback
    @NotNull
    public String getOfficialName(@Nullable HMDeviceSource source) {
        return this.proxy.getOfficialName(source);
    }

    @Override // com.huami.watch.companion.util.IBindBaseLogicCallback
    public boolean isWatch(@Nullable HMDeviceSource deviceSource) {
        return this.proxy.isWatch(deviceSource);
    }
}
