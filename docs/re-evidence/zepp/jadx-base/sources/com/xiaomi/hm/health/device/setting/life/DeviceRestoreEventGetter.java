package com.xiaomi.hm.health.device.setting.life;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/DeviceRestoreEventGetter;", "", "Landroid/content/SharedPreferences;", "a", "", "deviceId", "", "saveChooseNotRestore", "saveChooseRestore", "clearDeviceRestore", "Lcom/xiaomi/hm/health/device/setting/life/DeviceRestoreInfo;", "getDeviceRestoreInfo", "Lkotlin/Lazy;", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "Lkotlin/Lazy;", "keeperProxyApiLazy", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceRestoreEventGetter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy<KeeperProxyApi> keeperProxyApiLazy = KoinJavaComponent.inject$default(KeeperProxyApi.class, null, null, 6, null);

    private final SharedPreferences a() {
        return this.keeperProxyApiLazy.getValue().getSp();
    }

    public final void clearDeviceRestore(@Nullable String deviceId) {
        if (deviceId == null) {
            return;
        }
        DeviceRestoreInfo deviceRestoreInfo = getDeviceRestoreInfo(deviceId);
        if (Intrinsics.areEqual(deviceId, deviceRestoreInfo == null ? null : deviceRestoreInfo.getDeviceId())) {
            a().edit().remove(DeviceRestoreInfo.KEY_HAS_RESTORED).apply();
        }
    }

    @Nullable
    public final DeviceRestoreInfo getDeviceRestoreInfo(@NotNull String deviceId) {
        String string = a().getString(DeviceRestoreInfo.KEY_HAS_RESTORED, null);
        if (string == null) {
            return null;
        }
        DeviceRestoreInfo deviceRestoreInfo = (DeviceRestoreInfo) new Gson().fromJson(string, DeviceRestoreInfo.class);
        if (deviceId == deviceRestoreInfo.getDeviceId()) {
            return deviceRestoreInfo;
        }
        return null;
    }

    public final void saveChooseNotRestore(@NotNull String deviceId) {
        a().edit().putString(DeviceRestoreInfo.KEY_HAS_RESTORED, new Gson().toJson(new DeviceRestoreInfo(deviceId, true, false))).apply();
    }

    public final void saveChooseRestore(@NotNull String deviceId) {
        a().edit().putString(DeviceRestoreInfo.KEY_HAS_RESTORED, new Gson().toJson(new DeviceRestoreInfo(deviceId, true, true))).apply();
    }
}
