package com.xiaomi.fitness.devicesettings.bluttooth.todo.miui;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoSettingHelper;", "", "<init>", "()V", "TAG", "", "MIN_SUPPORT_TODO_VERSION_CODE", "", "checkMiuiTodoSupportEnable", "", "context", "Landroid/content/Context;", "updateMiuiTodoSwitchStatus", "", "did", "enable", "queryCurrentDeviceMiuiTodoSwitchStatus", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiuiTodoSettingHelper {

    @NotNull
    public static final MiuiTodoSettingHelper INSTANCE = new MiuiTodoSettingHelper();
    private static final int MIN_SUPPORT_TODO_VERSION_CODE = 583;

    @NotNull
    public static final String TAG = "MiuiTodoSetting";

    private MiuiTodoSettingHelper() {
    }

    public final boolean checkMiuiTodoSupportEnable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.i(TAG, "checkMiuiTodoSupportEnable");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(MiuiCursorConstants.PACKAGE_NAME, 0);
            int i = packageInfo.versionCode;
            Logger.i(TAG, "getMiuiTodoPackageInfo code " + i + ";name " + packageInfo.versionName);
            return i >= MIN_SUPPORT_TODO_VERSION_CODE;
        } catch (Exception e) {
            Logger.e(TAG, "getMiuiTodoPackageInfo exception " + e);
            return false;
        }
    }

    public final boolean queryCurrentDeviceMiuiTodoSwitchStatus() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        return DeviceSettingsPreference.INSTANCE.getSyncMiuiTodoSwitchStatus(wearableDeviceModel.getDid());
    }

    public final void updateMiuiTodoSwitchStatus(@NotNull String did, boolean enable) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "updateMiuiTodoSwitchStatus " + did + "; status: " + enable);
        DeviceSettingsPreference.INSTANCE.setSyncMiuiTodoSwitchStatus(did, enable);
        MiuiTodoSyncDeviceManager.INSTANCE.syncMiuiTodoListToDeviceIfNeed(enable);
    }
}
