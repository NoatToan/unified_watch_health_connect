package com.xiaomi.smarthome.framework.plugin.rn.core.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public interface IRnRuntimeProvider {
    void closeCurrentPage(ReadableMap readableMap);

    Bundle getActivityBundle();

    IRNRuntime getCurrentRuntime();

    DeviceStat getDeviceStat();

    String getLanguageStr();

    String getPluginBundlePath();

    File getPluginDir(Context context, PluginPackageInfo pluginPackageInfo);

    File getPluginDirWithDid(Context context, PluginPackageInfo pluginPackageInfo, String str);

    File getPluginFilesPath(Context context, PluginPackageInfo pluginPackageInfo, DeviceStat deviceStat);

    RnPluginDeviceInfo getPluginInfo();

    PluginPackageInfo getPluginRecord();

    String getSdkBundlePath();

    SharedPreferences getSharedPreferences();

    SharedPreferences getSharedPreferencesV2();

    String getStringfyPluginDeviceInfo(String str);

    File getTempFilesPath();

    WritableMap handleEntryExtraMessage(IRNRuntime iRNRuntime);

    boolean isInPlugin();

    boolean isRNPluginHasDarkMode();

    boolean isReleaseBuildType();

    void sendEvent(String str, Object obj);

    void setHideSystemSlider(boolean z);
}
