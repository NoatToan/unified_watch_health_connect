package com.xiaomi.smarthome.framework.plugin.rn.report;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnReportProvider;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTUtils;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReport;
import defpackage.bg4;
import defpackage.bua;
import defpackage.o4h;
import defpackage.ofl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class RnReport {
    private static IRnReportProvider getProvider() {
        return (IRnReportProvider) RnModuleProvider.as(IRnReportProvider.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$reportApi$1(ReadableMap readableMap, long j, long j2, String str, String str2, Integer num) throws Exception {
        HashMap map = new HashMap();
        if (readableMap != null) {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                map.put(next.getKey(), next.getValue());
            }
        }
        map.put("package_id", String.valueOf(j));
        map.put("plugin_id", String.valueOf(j2));
        map.put("device_model", str);
        map.put("package_name", str2);
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        map.put(RnReportConst.PARAM_SDK_VERSION, ((IRnCommonProvider) RnModuleProvider.as(IRnCommonProvider.class)).getCurSdkVersion());
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.ApiReport.EVENT_NAME, map);
        return num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reportOfflineEnter$3(DeviceStat deviceStat, Integer num) throws Exception {
        HashMap map = new HashMap();
        map.put("device_model", deviceStat.model);
        map.put("source", 0);
        map.put(RnReportConst.OfflineEnterStat.PARAM_ONLINE_STATUS, Integer.valueOf(deviceStat.isOnline ? 1 : 0));
        map.put("pid", Integer.valueOf(deviceStat.pid));
        map.put("did", deviceStat.did);
        map.put("sdk_level", String.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.OfflineEnterStat.EVENT_NAME, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reportOpenPluginError$0(String str, int i, Integer num) throws Exception {
        HashMap map = new HashMap();
        map.put("device_model", str);
        map.put("code", Integer.valueOf(i));
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.PluginOpenError.EVENT_NAME, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$tracePluginOpen$2(String str, PluginPackageInfo pluginPackageInfo, String str2, Integer num) throws Exception {
        HashMap map = new HashMap();
        map.put("device_model", str);
        map.put("plugin_id", String.valueOf(pluginPackageInfo.getPluginId()));
        map.put("package_id", String.valueOf(pluginPackageInfo.getPackageId()));
        map.put(RnReportConst.PluginOpenTrace.PARAM_ACTION, str2);
        map.put("sdk_level", String.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.PluginOpenTrace.EVENT_NAME, map);
    }

    public static void reportApi(final long j, final long j2, final String str, final String str2, final ReadableMap readableMap) {
        o4h.E(0).S(ofl.c()).F(new bua() { // from class: hvk
            @Override // defpackage.bua
            public final Object apply(Object obj) {
                return RnReport.lambda$reportApi$1(readableMap, j, j2, str, str2, (Integer) obj);
            }
        }).M();
    }

    public static void reportDownloadRes(String str, String str2, String str3, int i, long j) {
        HashMap map = new HashMap();
        map.put("task_type", str);
        map.put("device_model", str2);
        map.put("url", str3);
        map.put("code", Integer.valueOf(i));
        map.put("cost", Long.valueOf(j));
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        map.put("tip", RnReportConst.PluginDownload.DOWNLOAD_TIP);
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.PluginDownload.EVENT_NAME, map);
    }

    public static void reportFps(long j, long j2, String str, Map<String, Object> map) {
        map.put("package_id", String.valueOf(j));
        map.put("plugin_id", String.valueOf(j2));
        map.put("device_model", str);
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.ApiReport.EVENT_PLUGIN_FPS, map);
    }

    public static void reportInstallDetailRes(String str, String str2, int i) {
        HashMap map = new HashMap();
        map.put("task_type", str);
        map.put("device_model", str2);
        map.put("code", Integer.valueOf(i));
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.PluginInstall.EVENT_NAME_DETAIL, map);
    }

    public static void reportInstallRes(String str, String str2, int i) {
        HashMap map = new HashMap();
        map.put("task_type", str);
        map.put("device_model", str2);
        map.put("code", Integer.valueOf(i));
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.PluginInstall.EVENT_NAME, map);
    }

    public static void reportLoadRes(String str, String str2, int i, long j) {
        HashMap map = new HashMap();
        map.put("task_type", str);
        map.put("device_model", str2);
        map.put("code", Integer.valueOf(i));
        map.put("cost", Long.valueOf(j));
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        map.put("tip", RnReportConst.PluginLoad.LOAD_TIP);
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.PluginLoad.EVENT_NAME, map);
    }

    public static void reportMemory(long j, long j2, String str, Map<String, Object> map) {
        map.put("package_id", String.valueOf(j));
        map.put("plugin_id", String.valueOf(j2));
        map.put("device_model", str);
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.ApiReport.EVENT_PLUGIN_MEMORY, map);
    }

    public static void reportOfflineEnter(final DeviceStat deviceStat) {
        if (deviceStat == null || TextUtils.isEmpty(deviceStat.model) || TextUtils.isEmpty(deviceStat.did)) {
            return;
        }
        o4h.E(0).S(ofl.c()).m(new bg4() { // from class: fvk
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                RnReport.lambda$reportOfflineEnter$3(deviceStat, (Integer) obj);
            }
        }).M();
    }

    public static void reportOpenPluginError(final String str, final int i) {
        o4h.E(0).S(ofl.c()).m(new bg4() { // from class: gvk
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                RnReport.lambda$reportOpenPluginError$0(str, i, (Integer) obj);
            }
        }).M();
    }

    public static void reportOpenPluginStatus(long j, long j2, String str, Map<String, Object> map) {
        map.put("package_id", String.valueOf(j));
        map.put("plugin_id", String.valueOf(j2));
        map.put("device_model", str);
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.EVENT_PLUGIN_OPEN_STATUS, map);
    }

    public static void reportPlugin(String str, String str2, long j, long j2, String str3, String str4, String str5, int i, String str6, int i2, ReadableMap readableMap) {
        HashMap map = new HashMap();
        if (readableMap != null) {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                String key = next.getKey();
                if (!TextUtils.equals(key, "enableOldTrack") && !TextUtils.equals(key, "keyName")) {
                    Object value = next.getValue();
                    try {
                        if (value instanceof ReadableArray) {
                            map.put(key, MIOTUtils.convertReadableArrayToList((ReadableArray) value));
                        } else if (value instanceof ReadableMap) {
                            map.put(key, new JSONObject(MIOTUtils.readableMapToJsonStr((ReadableMap) value)));
                        } else {
                            map.put(key, value);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        map.put("did", str2);
        map.put("package_id", Long.valueOf(j));
        map.put("plugin_id", Long.valueOf(j2));
        map.put("device_model", str3);
        map.put("device_name", str4);
        map.put(RnReportConst.PluginBusinessReport.PARAM_PLUGIN_VERSION, str5);
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        map.put("package_name", str6);
        map.put("entry", Integer.valueOf(i2));
        getProvider().statReport(String.valueOf(i), str, map);
    }

    public static void reportPluginTipsClick(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put("asset_id", str);
        }
        if (str2 != null) {
            map.put(OneTrack.Param.ASSET_NAME, str2);
        }
        map.put("banner_model", str3);
        map.put("banner_type", str4);
        map.put("tip", "6.25.0.1.17449");
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, "click", map);
    }

    public static void reportPluginTipsExpose(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put("asset_id", str);
        }
        if (str2 != null) {
            map.put(OneTrack.Param.ASSET_NAME, str2);
        }
        map.put("banner_model", str3);
        map.put("banner_type", str4);
        map.put("tip", "6.24.0.1.17448");
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, OneTrack.Event.EXPOSE, map);
    }

    public static void reportRNCrashInfo(long j, long j2, String str, String str2, Map<String, Object> map) {
        map.put("package_id", String.valueOf(j));
        map.put("plugin_id", String.valueOf(j2));
        map.put("device_id", String.valueOf(str2));
        map.put("device_model", str);
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.EVENT_RN_RUNTIME_REUSE_CRASH, map);
    }

    public static void reportRNMemoryInfo(long j, long j2, String str, String str2, Map<String, Object> map) {
        map.put("package_id", String.valueOf(j));
        map.put("plugin_id", String.valueOf(j2));
        map.put("device_id", String.valueOf(str2));
        map.put("device_model", str);
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.EVENT_MEMORY_STATUS, map);
    }

    public static void reportRNProcessReuseEnterType(long j, long j2, String str, String str2, Map<String, Object> map) {
        map.put("package_id", String.valueOf(j));
        map.put("plugin_id", String.valueOf(j2));
        map.put("device_id", String.valueOf(str2));
        map.put("device_model", str);
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.EVENT_RN_PROCESS_REUSE_ENTER_TYPE, map);
    }

    public static void reportRNRuntimeNull(Map<String, Object> map) {
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.EVENT_RN_RUNTIME_REUSE_NULL, map);
    }

    public static void reportRNRuntimeProcessExit(long j, long j2, String str, String str2, Map<String, Object> map) {
        map.put("package_id", String.valueOf(j));
        map.put("plugin_id", String.valueOf(j2));
        map.put("device_id", String.valueOf(str2));
        map.put("device_model", str);
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.EVENT_RN_RUNTIME_PROCESS_EXIT, map);
    }

    public static void reportRNRuntimeReuseStatus(long j, long j2, String str, String str2, Map<String, Object> map, boolean z) {
        map.put("package_id", String.valueOf(j));
        map.put("plugin_id", String.valueOf(j2));
        map.put("device_id", String.valueOf(str2));
        map.put("device_model", str);
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        if (z) {
            getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.EVENT_RUNTIME_REUSE_STATUS, map);
        } else {
            getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.EVENT_RUNTIME_REUSE_STATUS_NOT_REPORT_SO_FAR, map);
        }
    }

    public static void reportRNRuntimeReuseStatusOpenTimeInfoNull(Map<String, Object> map) {
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.EVENT_RUNTIME_REUSE_STATUS_OPEN_TIME_INFO_NULL, map);
    }

    public static void reportRealDownloadRes(String str, String str2, String str3, String str4, String str5, int i) {
        HashMap map = new HashMap();
        map.put("task_type", str);
        map.put("device_model", str4);
        map.put("code", Integer.valueOf(i));
        map.put("url", str5);
        map.put("package_id", str2);
        map.put("plugin_id", str3);
        map.put("sdk_level", Integer.valueOf(getProvider().getRnNativeApiLevel()));
        getProvider().statReport(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, RnReportConst.PluginRealDownload.EVENT_NAME, map);
    }

    public static void tracePluginOpen(final String str, final PluginPackageInfo pluginPackageInfo, final String str2) {
        if (TextUtils.isEmpty(str) || pluginPackageInfo == null) {
            return;
        }
        o4h.E(0).S(ofl.c()).m(new bg4() { // from class: ivk
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                RnReport.lambda$tracePluginOpen$2(str, pluginPackageInfo, str2, (Integer) obj);
            }
        }).M();
    }
}
