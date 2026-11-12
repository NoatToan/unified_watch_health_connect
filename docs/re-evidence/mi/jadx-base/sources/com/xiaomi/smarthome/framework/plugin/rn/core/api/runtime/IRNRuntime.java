package com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime;

import android.os.Bundle;
import com.facebook.react.a;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface IRNRuntime {
    Bundle getActivityBundle();

    DeviceStat getDeviceStat();

    a getInstanceManager();

    boolean getIsStdPlugin();

    RnPluginDeviceInfo getPluginInfo();

    PluginPackageInfo getPluginRecord();

    WritableMap getSceneExtra();
}
