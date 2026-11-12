package defpackage;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;

/* JADX INFO: loaded from: classes5.dex */
public interface qxc {
    void closeCurrentPage(ReadableMap readableMap);

    Bundle getActivityBundle();

    IRNRuntime getCurrentRuntime();

    DeviceStat getDeviceStat();

    String getLanguageStr();

    RnPluginDeviceInfo getPluginInfo();

    PluginPackageInfo getPluginRecord();

    String getSdkBundlePath();

    boolean isReleaseBuildType();

    void sendEvent(String str, Object obj);
}
