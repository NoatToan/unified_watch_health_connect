package com.huami.module.darkmode;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatDelegate;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class AppNightModeHelper {

    @NotNull
    private static final String a = "nightMode";

    @NotNull
    public static final AppNightModeHelper INSTANCE = new AppNightModeHelper();

    @NotNull
    private static final KvPersistence b = KvKit.getKvPersistence$default("ZeppNightMode", false, 2, null);

    private AppNightModeHelper() {
    }

    @JvmStatic
    public static final int getNightMode() {
        return ((Number) b.getValue(a, -1)).intValue();
    }

    @JvmStatic
    public static final boolean isDarkMode(@NotNull Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    @JvmStatic
    public static final void loadLaunchNightMode() {
        AppCompatDelegate.setDefaultNightMode(getNightMode());
    }

    @JvmStatic
    public static final void setNightMode(int i) {
        b.setValue(a, Integer.valueOf(i));
        AppCompatDelegate.setDefaultNightMode(i);
    }

    @JvmStatic
    public static final boolean isDarkMode() {
        int nightMode = getNightMode();
        return nightMode == 2 || (nightMode == -1 && (Resources.getSystem().getConfiguration().uiMode & 48) == 32);
    }
}
