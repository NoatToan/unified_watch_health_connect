package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;

/* JADX INFO: loaded from: classes5.dex */
public class duk implements IRnCommonProvider {
    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void addLog(DeviceStat deviceStat, String str, String str2) {
        RnPluginLog.i("plugin_add_log model:" + str + ",log:" + str2);
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, str, "", str2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void addStat(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, String str, String str2, ReadableMap readableMap) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void callMiCloudAPI(Activity activity, String str, String str2, ReadableMap readableMap, ReadableMap readableMap2, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void callSpecificAPI(String str, String str2, String str3, ReadableMap readableMap, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public String getCurSdkVersion() {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void getCustomPluginInfo(String str, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public String getDeveloperName(long j, long j2) {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public int getDeviceLevel(boolean z) {
        return 0;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void getHomepageSettings(String str, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public String getPluginPackageInfoForCrash(PluginPackageInfo pluginPackageInfo, String str, String str2) {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public boolean getSTDGuideSettings(String str) {
        return false;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void getTvList(Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public boolean isInWhiteListHost(String str) {
        return mvk.e().d().isInWhiteListHost(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public boolean isInvalidHost(String str) {
        return false;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void openRecommendSceneDetail(Activity activity, ReadableMap readableMap) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void recycleMiWifiResource() {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void reportEvent(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, String str, ReadableMap readableMap) {
        RnPluginLog.addFrameworkLog("reportEvent eventName " + str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void reportEventRefChannel(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, String str, ReadableMap readableMap) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void reportMJFStatLog(String str, ReadableMap readableMap) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void requestAuthForAlexaVoiceService(ReadableMap readableMap, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void revokePrivacyLicense(Activity activity, DeviceStat deviceStat, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public Bitmap screenShotLong(View view) {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void setHomepageSettings(String str, ReadableMap readableMap) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void setSTDGuideSettings(String str, boolean z) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void updateConfig() {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider
    public void updatePluginPageRef(ReadableMap readableMap) {
    }
}
