package com.xiaomi.hm.health.bt.device;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/AbsSensorHubDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "getDeviceInfo", "", "force", "", "reConnect", "isConnected", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getDeviceType", "Lcom/xiaomi/hm/health/bt/profile/auth/AuthInfo;", "p0", "Lcom/xiaomi/hm/health/bt/profile/auth/IHMAuthCallback;", "p1", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "auth", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbsSensorHubDevice extends HMBaseDevice {
    public AbsSensorHubDevice(@NotNull Context context) {
        super(context, null);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public AuthResult auth(@Nullable AuthInfo p0, @Nullable IHMAuthCallback p1) {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public DeviceInfo getDeviceInfo() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    public HMDeviceType getDeviceType() {
        return HMDeviceType.SENSORHUB;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isConnected() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void reConnect(boolean force) {
    }
}
