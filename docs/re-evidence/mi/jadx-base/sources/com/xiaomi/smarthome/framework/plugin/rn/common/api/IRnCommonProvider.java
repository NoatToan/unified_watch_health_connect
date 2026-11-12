package com.xiaomi.smarthome.framework.plugin.rn.common.api;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;

/* JADX INFO: loaded from: classes2.dex */
public interface IRnCommonProvider {
    void addLog(DeviceStat deviceStat, String str, String str2);

    void addStat(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, String str, String str2, ReadableMap readableMap);

    void callMiCloudAPI(Activity activity, String str, String str2, ReadableMap readableMap, ReadableMap readableMap2, Callback callback);

    void callSpecificAPI(String str, String str2, String str3, ReadableMap readableMap, Callback callback);

    String getCurSdkVersion();

    void getCustomPluginInfo(String str, Callback callback);

    String getDeveloperName(long j, long j2);

    int getDeviceLevel(boolean z);

    void getHomepageSettings(String str, Callback callback);

    String getPluginPackageInfoForCrash(PluginPackageInfo pluginPackageInfo, String str, String str2);

    boolean getSTDGuideSettings(String str);

    void getTvList(Callback callback);

    boolean isInWhiteListHost(String str);

    boolean isInvalidHost(String str);

    void openRecommendSceneDetail(Activity activity, ReadableMap readableMap);

    void recycleMiWifiResource();

    void reportEvent(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, String str, ReadableMap readableMap);

    void reportEventRefChannel(DeviceStat deviceStat, PluginPackageInfo pluginPackageInfo, String str, ReadableMap readableMap);

    void reportMJFStatLog(String str, ReadableMap readableMap);

    void requestAuthForAlexaVoiceService(ReadableMap readableMap, Callback callback);

    void revokePrivacyLicense(Activity activity, DeviceStat deviceStat, Callback callback);

    Bitmap screenShotLong(View view);

    void setHomepageSettings(String str, ReadableMap readableMap);

    void setSTDGuideSettings(String str, boolean z);

    void updateConfig();

    void updatePluginPageRef(ReadableMap readableMap);
}
