package com.huami.watch.companion.util;

import com.huami.hid.takepic.TakePicSettingActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&¨\u0006\r"}, d2 = {"Lcom/huami/watch/companion/util/IBindBaseLogicCallback;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "getOfficialName", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Ljava/util/HashMap;", "getBoundDevices", "deviceSource", "", TakePicSettingActivity.KEY_IS_WATCH, "companion_release"}, k = 1, mv = {1, 5, 1})
public interface IBindBaseLogicCallback {
    @Nullable
    HashMap<String, HMDeviceType> getBoundDevices(@NotNull HMDeviceType deviceType);

    @NotNull
    String getOfficialName(@Nullable HMDeviceSource source);

    boolean isWatch(@Nullable HMDeviceSource deviceSource);
}
