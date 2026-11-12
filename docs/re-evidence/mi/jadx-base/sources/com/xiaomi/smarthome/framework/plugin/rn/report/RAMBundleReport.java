package com.xiaomi.smarthome.framework.plugin.rn.report;

import android.text.TextUtils;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnReportProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider;
import com.xiaomi.smarthome.framework.plugin.rn.utils.JSONUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.PluginUtils;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class RAMBundleReport {
    public static final String TAG = "RAMBundleReport";
    private static volatile RAMBundleReport report;
    private boolean bundleIsMinify;
    private String bundleType;
    private DeviceStat deviceStat;
    private long loadTime;
    private long openTime;
    private PluginPackageInfo packageInfo;
    private long renderTime;

    private RAMBundleReport() {
    }

    public static RAMBundleReport getInstance() {
        if (report == null) {
            synchronized (RAMBundleReport.class) {
                try {
                    if (report == null) {
                        report = new RAMBundleReport();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return report;
    }

    private String readBundleType() {
        PluginPackageInfo pluginPackageInfo = this.packageInfo;
        if (pluginPackageInfo == null || this.deviceStat == null) {
            MiJiaLog.onlyLogcat(6, TAG, "packageInfo is null or deviceStat is null!");
            return null;
        }
        File file = new File(new File(PluginUtils.getRnPackageRealPath(pluginPackageInfo.getPackagePath())), PluginPackageConstant.RN_PROJECT_JSON);
        if (!file.exists()) {
            MiJiaLog.onlyLogcat(6, TAG, "projectFile is not exists!");
            return null;
        }
        JSONObject jSONObjectFromFile = JSONUtil.fromFile(file);
        if (jSONObjectFromFile == null) {
            MiJiaLog.onlyLogcat(6, TAG, "jsonProject is null!");
            return null;
        }
        String strOptString = jSONObjectFromFile.optString("bundle_type");
        this.bundleIsMinify = jSONObjectFromFile.optBoolean("bundle_minify", false);
        return TextUtils.isEmpty(strOptString) ? "plain-bundle" : strOptString;
    }

    public void clear() {
        this.packageInfo = null;
        this.deviceStat = null;
        this.openTime = 0L;
        this.loadTime = 0L;
        this.renderTime = 0L;
        this.bundleType = null;
    }

    public String getBundleType() {
        if (TextUtils.isEmpty(this.bundleType)) {
            this.bundleType = readBundleType();
        }
        return this.bundleType;
    }

    public void init() {
        if (this.packageInfo == null || this.deviceStat == null) {
            this.packageInfo = ((IRnRuntimeProvider) RnModuleProvider.as(IRnRuntimeProvider.class)).getPluginRecord();
            this.deviceStat = ((IRnRuntimeProvider) RnModuleProvider.as(IRnRuntimeProvider.class)).getDeviceStat();
        }
    }

    public void reportRAMBundleLaunchTime() {
        if (this.packageInfo == null || this.deviceStat == null || TextUtils.isEmpty(this.bundleType)) {
            return;
        }
        HashMap map = new HashMap();
        map.put("package_id", Long.valueOf(this.packageInfo.getPackageId()));
        map.put("plugin_id", Long.valueOf(this.packageInfo.getPluginId()));
        map.put("device_model", this.deviceStat.model);
        map.put(RnReportConst.PluginBusinessReport.PARAM_PLUGIN_VERSION, Integer.valueOf(this.packageInfo.getVersion()));
        map.put("sdklevel", Integer.valueOf(((IRnReportProvider) RnModuleProvider.as(IRnReportProvider.class)).getRnNativeApiLevel()));
        map.put("opentime", Long.valueOf(this.openTime));
        map.put("rn_plugin_rendering_time", Long.valueOf(this.renderTime));
        map.put("rn_plugin_loadtime", Long.valueOf(this.loadTime));
        map.put("bundle_type", this.bundleType);
        map.put("bundle_minify", Boolean.valueOf(this.bundleIsMinify));
        MiJiaLog.onlyLogcat(5, TAG, " openTime = " + this.openTime + " rendering_time = " + this.renderTime + " loadtime = " + this.loadTime + " bundle_type = " + this.bundleType + " bundle_minify = " + this.bundleIsMinify);
        ((IRnReportProvider) RnModuleProvider.as(IRnReportProvider.class)).statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.RAMBundleReport.EVENT_NAME, map);
    }

    public void setDeviceStat(DeviceStat deviceStat) {
        this.deviceStat = deviceStat;
    }

    public void setLoadTime(long j) {
        this.loadTime = j;
    }

    public void setOpenTime(long j) {
        this.openTime = j;
    }

    public void setPackageInfo(PluginPackageInfo pluginPackageInfo) {
        this.packageInfo = pluginPackageInfo;
    }

    public void setRenderTime(long j) {
        this.renderTime = j;
    }
}
