package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.text.TextUtils;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnReportProvider;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class PluginUtils {
    private static final String TAG = "PluginUtils";
    public static final int TRANSLATE_ALL = 3;
    public static final int TRANSLATE_BASE = 1;
    public static final int TRANSLATE_LANGUAGE = 2;

    public static void deletePluginPackageAndroidDir(String str) {
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, str + " , plugin package file validate failed");
        com.xiaomi.smarthome.framework.plugin.FileUtils.deleteFile(getRnPackageRealPath(str));
    }

    public static final String getRnPackageRealPath(String str) {
        return (new File(str, PluginPackageConstant.RN_CONF_A).exists() || isJustNeedCreateAndroidADir(str)) ? new File(str, PluginPackageConstant.RN_DIR_A).getAbsolutePath() : new File(str, PluginPackageConstant.RN_DIR_B).getAbsolutePath();
    }

    private static boolean isJustNeedCreateAndroidADir(String str) {
        return (TextUtils.isEmpty(str) || str.contains("rnsdk") || (!str.contains("download") && !str.contains(PluginPackageConstant.RN_INSTALL_DIR_KEY))) ? false : true;
    }

    public static void reportRnPluginActivityReuse(int i) {
        HashMap map = new HashMap();
        map.put("activity_enter_type", Integer.valueOf(i));
        ((IRnReportProvider) RnModuleProvider.as(IRnReportProvider.class)).statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, "rn_plugin_activity_reuse", map);
    }
}
