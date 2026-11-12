package com.huami.devicex.injection.basic;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H&J*\u0010\u0014\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0016\u001a\u00020\u0002H&J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0002H&J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH&J\u0012\u0010\u001a\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u001c\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u001d"}, d2 = {"Lcom/huami/devicex/injection/basic/MiuiFnApi;", "", "", "device", "reason", "", "unbindDevice", "strDeviceAddress", "hasSetUnlockByDevice", "isSupportMiuiNotify", "isSupportMiuiNotifyInternal", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "isMiui", "deviceAddress", "isUnlockEnabled", "enable", "noContactEnable", "", "delay", "setMiuiSupportAlertIncall", "setAlertIncallDelay", "getXiaomiServiceFrameworkPackageName", "isSetAlertIncall", "", "checkMiuiNotify", "isSetPassword", "c", "isUseUnlockByBracelet", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface MiuiFnApi {
    void checkMiuiNotify(@NotNull Context context);

    @NotNull
    String getXiaomiServiceFrameworkPackageName();

    boolean hasSetUnlockByDevice(@Nullable String strDeviceAddress);

    boolean isMiui(@NotNull Context context);

    boolean isSetAlertIncall(@NotNull String deviceAddress);

    boolean isSetPassword(@Nullable Context context);

    boolean isSupportMiuiNotify();

    boolean isSupportMiuiNotifyInternal();

    boolean isUnlockEnabled(@NotNull Context context, @NotNull String deviceAddress);

    boolean isUseUnlockByBracelet(@Nullable Context c, @Nullable String strDeviceAddress);

    boolean setAlertIncallDelay(@NotNull String device, int delay);

    boolean setMiuiSupportAlertIncall(@Nullable String device, boolean enable, boolean noContactEnable, int delay);

    boolean unbindDevice(@Nullable String device, @NotNull String reason);
}
