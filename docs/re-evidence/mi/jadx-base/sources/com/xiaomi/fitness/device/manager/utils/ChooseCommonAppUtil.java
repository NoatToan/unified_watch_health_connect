package com.xiaomi.fitness.device.manager.utils;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.config.preference.ChooseAppPreference;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.extensions.DeviceExtKt;
import com.xiaomi.fitness.main.export.ConfigPreference;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\b\u0010\u000f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/device/manager/utils/ChooseCommonAppUtil;", "", "<init>", "()V", "mShowCommonAppDialog", "", "PACKAGE_NAME_WEARABLE", "", "CHOISE_COMMON_APP_WEARABLE", "", "setShowCommonAppDialog", "", "flag", "getShowCommonAppDialog", "isRecoveryAppCommonStatus", "hasSupportDevice", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChooseCommonAppUtil {
    private static boolean mShowCommonAppDialog;

    @NotNull
    public static final ChooseCommonAppUtil INSTANCE = new ChooseCommonAppUtil();

    @NotNull
    private static final String PACKAGE_NAME_WEARABLE = "com.xiaomi.wearable";
    private static final int CHOISE_COMMON_APP_WEARABLE = 2;

    private ChooseCommonAppUtil() {
    }

    private final boolean hasSupportDevice() {
        Iterator it = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels().iterator();
        while (it.hasNext()) {
            if (DeviceExtKt.isSupportDevice(((WearableDeviceModel) it.next()).getProduct())) {
                return true;
            }
        }
        return false;
    }

    public final boolean getShowCommonAppDialog() {
        return mShowCommonAppDialog;
    }

    public final boolean isRecoveryAppCommonStatus() {
        return AppUtil.hasPackage(ApplicationExtKt.getApplication(), PACKAGE_NAME_WEARABLE) && ConfigPreference.INSTANCE.getIS_APP_CHOSEN_OPEN() && hasSupportDevice() && ChooseAppPreference.INSTANCE.getChooseApp() == CHOISE_COMMON_APP_WEARABLE;
    }

    public final void setShowCommonAppDialog(boolean flag) {
        mShowCommonAppDialog = flag;
    }
}
