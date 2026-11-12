package com.xiaomi.hm.health.device.bind.enable;

import androidx.appcompat.app.AppCompatActivity;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/enable/ISwitchDeviceCallback;", "", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "", "onEnableStart", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface ISwitchDeviceCallback {
    void onEnableStart(@NotNull AppCompatActivity activity, @NotNull HMBaseDevice baseDevice);
}
