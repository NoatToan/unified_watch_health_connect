package com.xiaomi.hm.health.device.bind;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/IUnbindListener;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "onUnbindStart", "Lcom/xiaomi/hm/health/device/bind/UnbindError;", "error", "onUnbindFailure", "onUnbindSuccess", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IUnbindListener {
    void onUnbindFailure(@Nullable UnbindError error, @Nullable HMDeviceType type);

    void onUnbindStart(@Nullable HMDeviceType type);

    void onUnbindSuccess(@Nullable HMDeviceType type);
}
