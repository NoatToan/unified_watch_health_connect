package com.xiaomi.smarthome.framework.plugin.rn.report;

import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnReportProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider;
import defpackage.qjg;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class RnNetReport implements qjg {
    private static String getHostOfUrl(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean isInWhiteListHost(String str) {
        return ((IRnCommonProvider) RnModuleProvider.as(IRnCommonProvider.class)).isInWhiteListHost(str);
    }

    private static boolean isInvalidHost(String str) {
        return ((IRnCommonProvider) RnModuleProvider.as(IRnCommonProvider.class)).isInvalidHost(str);
    }

    public static void reportDownloadFileURL(String str) {
        reportRequest("download_file", str);
    }

    public static void reportRequest(String str, String str2) {
        long packageId;
        long pluginId;
        String hostOfUrl = getHostOfUrl(str2);
        boolean zIsInvalidHost = isInvalidHost(hostOfUrl);
        StringBuilder sb = new StringBuilder();
        sb.append("catch host: ");
        sb.append(hostOfUrl);
        sb.append(" isReport=");
        sb.append(!zIsInvalidHost);
        sb.append(" action=");
        sb.append(str);
        if (zIsInvalidHost) {
            return;
        }
        PluginPackageInfo pluginRecord = ((IRnRuntimeProvider) RnModuleProvider.as(IRnRuntimeProvider.class)).getPluginRecord();
        DeviceStat deviceStat = ((IRnRuntimeProvider) RnModuleProvider.as(IRnRuntimeProvider.class)).getDeviceStat();
        String str3 = deviceStat != null ? deviceStat.model : "";
        if (pluginRecord != null) {
            packageId = pluginRecord.getPackageId();
            pluginId = pluginRecord.getPluginId();
        } else {
            packageId = 0;
            pluginId = 0;
        }
        HashMap map = new HashMap();
        map.put("plugin_id", Long.valueOf(pluginId));
        map.put("package_id", Long.valueOf(packageId));
        map.put("device_model", str3);
        map.put("request", hostOfUrl);
        map.put("tip", RnReportConst.NetworkReport.TIP);
        map.put("action", str);
        ((IRnReportProvider) RnModuleProvider.as(IRnReportProvider.class)).statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.NetworkReport.EVENT_NAME, map);
    }

    public static void reportUploadFileURL(String str) {
        reportRequest("upload_file", str);
    }

    public static void reportWebPageURL(String str) {
        reportRequest("open_webpage", str);
    }

    public static void reportWebViewURL(String str) {
        reportRequest("rn_webview", str);
    }

    @Override // defpackage.qjg
    public void reportNetRequest(String str) {
        reportRequest("js_fetch", str);
    }
}
