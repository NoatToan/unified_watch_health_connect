package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui;

import android.content.Context;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider;

/* JADX INFO: loaded from: classes2.dex */
public class ColorSchemeHelper {
    public static final String SCHEME_DARK = "dark";
    public static final String SCHEME_LIGHT = "light";

    public static String colorSchemeForCurrentConfiguration(Context context) {
        return ((context.getApplicationContext().getResources().getConfiguration().uiMode & 48) == 32 && ((IRnRuntimeProvider) RnModuleProvider.as(IRnRuntimeProvider.class)).isRNPluginHasDarkMode()) ? SCHEME_DARK : "light";
    }
}
