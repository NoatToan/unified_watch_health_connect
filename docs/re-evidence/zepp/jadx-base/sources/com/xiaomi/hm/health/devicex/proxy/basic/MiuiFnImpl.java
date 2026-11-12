package com.xiaomi.hm.health.devicex.proxy.basic;

import android.content.Context;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.ui.smartplay.MiuiAPI;
import com.xiaomi.hm.health.utils.ScreenUnlockEventRecorder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J*\u0010\u0014\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u001a\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/basic/MiuiFnImpl;", "Lcom/huami/devicex/injection/basic/MiuiFnApi;", "", "device", "reason", "", "unbindDevice", "strDeviceAddress", "hasSetUnlockByDevice", "isSupportMiuiNotify", "isSupportMiuiNotifyInternal", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "isMiui", "deviceAddress", "isUnlockEnabled", "enable", "noContactEnable", "", "delay", "setMiuiSupportAlertIncall", "setAlertIncallDelay", "getXiaomiServiceFrameworkPackageName", "isSetAlertIncall", "", "checkMiuiNotify", "isSetPassword", "c", "isUseUnlockByBracelet", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MiuiFnImpl implements MiuiFnApi {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device is null";
        }
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    public void checkMiuiNotify(@NotNull Context context) {
        MiuiAPI.checkMiuiNotify(context);
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    @NotNull
    public String getXiaomiServiceFrameworkPackageName() {
        return MiuiAPI.getXiaomiServiceFrameworkPackageName();
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    public boolean hasSetUnlockByDevice(@Nullable String strDeviceAddress) {
        return MiuiUnlockAPI.hasSetUnlockByDevice(DeviceXFunctionsKt.getContext(), strDeviceAddress);
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    public boolean isMiui(@NotNull Context context) {
        return MiuiAPI.isMiui(context);
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    public boolean isSetAlertIncall(@NotNull String device) {
        return MiuiAPI.getInstance().isSetAlertIncall(device);
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    public boolean isSetPassword(@Nullable Context context) {
        return false;
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    public boolean isSupportMiuiNotify() {
        return MiuiAPI.getInstance().isSupportMiuiNotify();
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    public boolean isSupportMiuiNotifyInternal() {
        return MiuiAPI.getInstance().isSupportMiuiNotifyInternal();
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    public boolean isUnlockEnabled(@NotNull Context context, @NotNull String deviceAddress) {
        return MiuiUnlockAPI.isUnlockEnabled(context, deviceAddress);
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    public boolean isUseUnlockByBracelet(@Nullable Context c, @Nullable String strDeviceAddress) {
        return false;
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    public boolean setAlertIncallDelay(@NotNull String device, int delay) {
        return MiuiAPI.getInstance().setAlertIncallDelay(device, delay);
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    public boolean setMiuiSupportAlertIncall(@Nullable String device, boolean enable, boolean noContactEnable, int delay) {
        return MiuiAPI.getInstance().setMiuiSupportAlertIncall(device, enable, noContactEnable, delay);
    }

    @Override // com.huami.devicex.injection.basic.MiuiFnApi
    public boolean unbindDevice(@Nullable String device, @NotNull String reason) {
        if (device == null) {
            HMLog.warn$default("MiuiAPI", null, a.a, 2, null);
            return false;
        }
        ScreenUnlockEventRecorder.recordUnbindDeviceReason(reason);
        return MiuiAPI.getInstance().unbindDevice(device);
    }
}
