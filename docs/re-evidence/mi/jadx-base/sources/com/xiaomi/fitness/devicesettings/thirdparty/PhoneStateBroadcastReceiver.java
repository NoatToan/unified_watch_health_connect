package com.xiaomi.fitness.devicesettings.thirdparty;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.fitness.devicesettings.export.sleepai.SleepAiExtKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/thirdparty/PhoneStateBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhoneStateBroadcastReceiver extends BroadcastReceiver {

    @NotNull
    public static final String PARAMS_HOLD = "hold";

    @NotNull
    public static final String PARAMS_KEY_DATA = "data";

    @NotNull
    public static final String PARAMS_KEY_INTERVAL = "is_Interval";

    @NotNull
    public static final String PARAMS_LIGHT = "light";

    @NotNull
    public static final String PARAMS_ORI_COUNT = "ori_count";

    @NotNull
    public static final String PARAMS_ORI_MEAN = "ori_mean";

    @NotNull
    public static final String PARAMS_ORI_STD = "ori_std";

    @NotNull
    public static final String PARAMS_SCREEN = "screen";

    @NotNull
    public static final String PARAMS_TOP_APP = "top_app";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        Bundle bundleExtra;
        Bundle bundleExtra2;
        Boolean boolValueOf = null;
        String string = (intent == null || (bundleExtra2 = intent.getBundleExtra("SceneParams")) == null) ? null : bundleExtra2.getString("data");
        if (intent != null && (bundleExtra = intent.getBundleExtra("SceneParams")) != null) {
            boolValueOf = Boolean.valueOf(bundleExtra.getBoolean(PARAMS_KEY_INTERVAL));
        }
        if (string != null) {
            SleepAiExtKt.getMiAicrManagerImp().sendPhoneState(string, boolValueOf);
        }
    }
}
