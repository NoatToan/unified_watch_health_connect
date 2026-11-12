package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPackage;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReport;
import com.xiaomi.smarthome.framework.plugin.rn.utils.JSONUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.framework.plugin.standard.StdConstant;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;
import defpackage.ndj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@ndj(name = MIOTPackageModuleCore.NAME)
public class MIOTPackageModuleCore extends MIOTBaseJavaModule implements IMIOTPackage, ReactModuleWithSpec {
    public static final String EVENTRANDOM = "_36621";
    public static final String NAME = "MIOTPackage";
    private static final String TAG = "MIOTPackageModuleCore";

    public MIOTPackageModuleCore(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private void addStdPluginArgs(WritableMap writableMap, Bundle bundle) {
        if (bundle.getBoolean(StdConstant.PARAM_USE_STD_PLUGIN, false)) {
            String string = bundle.getString(StdConstant.PARAM_STD_SPEC_URN);
            String specInstance = getStandPluginProvider().getSpecInstance(string);
            String i18n = getStandPluginProvider().getI18N(string);
            String string2 = bundle.getString(StdConstant.PARAM_STD_CUSTOM_CONFIG);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putMap("instance", JSONUtil.toWritableMap(specInstance));
            writableMapCreateMap.putMap("i18n", JSONUtil.toWritableMap(i18n));
            writableMapCreateMap.putMap("custom_config", JSONUtil.toWritableMap(string2));
            writableMap.putMap(TSMAuthContants.PARAM_RESOURCE, writableMapCreateMap);
        }
    }

    private Map<String, Object> doGetConstants(IRNRuntime iRNRuntime) {
        PluginPackageInfo pluginRecord = iRNRuntime.getPluginRecord();
        RnPluginDeviceInfo pluginInfo = iRNRuntime.getPluginInfo();
        HashMap map = new HashMap();
        if (pluginRecord != null) {
            map.put("pluginID", Long.valueOf(pluginRecord.getPluginId()));
            map.put("packageID", Long.valueOf(pluginRecord.getPackageId()));
            map.put("packageName", pluginRecord.getPackageName());
            map.put("version", Integer.valueOf(pluginRecord.getVersion()));
            MIOTUtils.join(pluginRecord.getModelList(), "|");
            if (pluginInfo != null) {
                map.put("models", pluginInfo.getModel());
            }
        }
        WritableMap writableMapHandleEntryExtraMessage = getRnRuntimeProvider().handleEntryExtraMessage(iRNRuntime);
        map.put("entryInfo", writableMapHandleEntryExtraMessage);
        map.put("buildType", !getRnRuntimeProvider().isReleaseBuildType() ? "debug" : "release");
        map.put("basePath", getRnRuntimeProvider().getSdkBundlePath());
        map.put("plugPath", getRnRuntimeProvider().getPluginBundlePath());
        map.put("localFilePath", getFilesPath().getAbsolutePath());
        map.put("eventRandom", EVENTRANDOM);
        map.put(TSMAuthContants.PARAM_PAYLOAD, iRNRuntime.getSceneExtra());
        RnPluginLog.d("PluginStartTime", "ReactNativeGetConstants  " + System.currentTimeMillis());
        RnPluginLog.addFrameworkLog("MIOTPackageModule,doGetConstants entryInfo:" + writableMapHandleEntryExtraMessage.toString());
        return map;
    }

    private IRnRuntimeProvider getProvider() {
        return getRnRuntimeProvider();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPackage
    @ReactMethod
    public void apiReport(ReadableMap readableMap) {
        String str;
        String packageName;
        long j;
        long j2;
        MRnLog.d(TAG, "miot-sdk-report:" + readableMap);
        PluginPackageInfo pluginRecord = getProvider().getPluginRecord();
        if (pluginRecord != null) {
            long packageId = pluginRecord.getPackageId();
            long pluginId = pluginRecord.getPluginId();
            RnPluginDeviceInfo pluginInfo = getProvider().getPluginInfo();
            String model = pluginInfo != null ? pluginInfo.getModel() : "";
            packageName = pluginRecord.getPackageName();
            str = model;
            j2 = pluginId;
            j = packageId;
        } else {
            str = "";
            packageName = str;
            j = 0;
            j2 = 0;
        }
        RnReport.reportApi(j, j2, str, packageName, readableMap);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPackage
    @ReactMethod
    public void entry(Callback callback) {
        callback.invoke(new Object[0]);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPackage
    @ReactMethod
    public void exit(boolean z, Callback callback) {
        callback.invoke(Boolean.TRUE);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return getConstantsFromInputRNRuntime(getRnRuntimeProvider().getCurrentRuntime());
    }

    public Map<String, Object> getConstantsFromInputRNRuntime(IRNRuntime iRNRuntime) {
        return doGetConstants(iRNRuntime);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPackage
    @ReactMethod
    public WritableMap getPluginAppConfigValueForKey(String str) {
        onMethodNotImplamente(" getPluginAppConfigValueForKey(String key) haven't been impl");
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPackage
    @ReactMethod
    public void installModule(String str, Callback callback) {
        onMethodNotImplamente(" installModule(String moduleId, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPackage
    @ReactMethod
    public void notifyCation(String str, String str2, String str3) {
        onMethodNotImplamente(" notifyCation(String contentTitle, String contentText, String extra) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPackage
    @ReactMethod
    public void onDeventJs(int i, ReadableMap readableMap) {
        onMethodNotImplamente(" onDeventJs(int type, ReadableMap data) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPackage
    @ReactMethod
    public void onPackageLifecycle(String str, String str2) {
        onMethodNotImplamente(" onPackageLifecycle(String type, String data) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTPackage
    @ReactMethod
    public void setExitInfo(String str, Dynamic dynamic) {
        onMethodNotImplamente(" setExitInfo(String entrance, Dynamic extra) haven't been impl");
    }
}
