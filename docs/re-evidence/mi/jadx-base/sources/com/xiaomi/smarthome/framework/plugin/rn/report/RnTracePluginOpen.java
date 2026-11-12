package com.xiaomi.smarthome.framework.plugin.rn.report;

import android.os.Bundle;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnReportProvider;

/* JADX INFO: loaded from: classes2.dex */
public class RnTracePluginOpen {
    public static int getLaunchType(Bundle bundle, int i) {
        return bundle != null ? bundle.getInt("package_msgType", i) : i;
    }

    public static boolean needTrace(int i, String str) {
        return ((IRnReportProvider) RnModuleProvider.as(IRnReportProvider.class)).needTrace(i, str);
    }
}
