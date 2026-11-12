package com.xiaomi.fitness.eco.device.manager.extensions;

import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.config.preference.ChooseAppPreference;
import com.xiaomi.fitness.main.export.ConfigPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\r\u001a\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"density", "", "getDensity", "()F", "dp2Px", "", "dp", "ACTION_CHOISE_APP", "", "ACTION_CHOISE_APP_TIME", "PACKAGE_NAME_WEARABLE", "isAppAbandon", "", "Landroid/app/Application;", "startWearableApp", "", "chosenApp", "time", "", "eco-device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoOhterExtKt {

    @NotNull
    private static final String ACTION_CHOISE_APP = "choose_app";

    @NotNull
    private static final String ACTION_CHOISE_APP_TIME = "choose_app_time";

    @NotNull
    private static final String PACKAGE_NAME_WEARABLE = "com.xiaomi.wearable";

    public static final int dp2Px(int i) {
        return (int) ((i * getDensity()) + 0.5f);
    }

    private static final float getDensity() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static final boolean isAppAbandon(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        return ConfigPreference.INSTANCE.getIS_APP_CHOSEN_OPEN() && AppUtil.hasPackage(application, "com.xiaomi.wearable") && ChooseAppPreference.INSTANCE.getChooseApp() == 2;
    }

    public static final void startWearableApp(@NotNull Application application, int i, long j) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        EcoDeviceModelExtKt.logi("startOtherApp() called with: chosenApp = " + i + ", time = " + j);
        if (AppUtil.hasPackage(application, "com.xiaomi.wearable")) {
            Intent launchIntentForPackage = application.getPackageManager().getLaunchIntentForPackage("com.xiaomi.wearable");
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(335544320);
            }
            if (launchIntentForPackage != null) {
                launchIntentForPackage.putExtra(ACTION_CHOISE_APP, i);
            }
            if (launchIntentForPackage != null) {
                launchIntentForPackage.putExtra(ACTION_CHOISE_APP_TIME, j);
            }
            application.startActivity(launchIntentForPackage);
        }
    }
}
