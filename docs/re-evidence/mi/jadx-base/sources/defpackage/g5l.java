package defpackage;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;

/* JADX INFO: loaded from: classes5.dex */
public class g5l implements qxc {
    @Override // defpackage.qxc
    public void closeCurrentPage(ReadableMap readableMap) {
        y8j.a().closeCurrentPage(readableMap);
    }

    @Override // defpackage.qxc
    public Bundle getActivityBundle() {
        return y8j.a().getActivityBundle();
    }

    @Override // defpackage.qxc
    public IRNRuntime getCurrentRuntime() {
        return y8j.a().getCurrentRuntime();
    }

    @Override // defpackage.qxc
    public DeviceStat getDeviceStat() {
        return y8j.a().getDeviceStat();
    }

    @Override // defpackage.qxc
    public String getLanguageStr() {
        return y8j.a().getLanguageStr();
    }

    @Override // defpackage.qxc
    public RnPluginDeviceInfo getPluginInfo() {
        return y8j.a().getPluginInfo();
    }

    @Override // defpackage.qxc
    public PluginPackageInfo getPluginRecord() {
        return y8j.a().getPluginRecord();
    }

    @Override // defpackage.qxc
    public String getSdkBundlePath() {
        return y8j.a().getSdkBundlePath();
    }

    @Override // defpackage.qxc
    public boolean isReleaseBuildType() {
        return y8j.a().isReleaseBuildType();
    }

    @Override // defpackage.qxc
    public void sendEvent(String str, Object obj) {
        if (y8j.a().getCurrentRuntime() == null || y8j.a().getCurrentRuntime().getInstanceManager() == null || y8j.a().getCurrentRuntime().getInstanceManager().C() == null) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) y8j.a().getCurrentRuntime().getInstanceManager().C().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }
}
