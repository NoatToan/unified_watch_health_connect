package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.xiaomi.smarthome.core.server.internal.util.LocaleUtil;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.rn.core.bean.RnSdkInfo;
import com.xiaomi.smarthome.server.PluginPackageManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class v7r extends x8j implements qxc {
    @Override // defpackage.x8j
    public String D() {
        return null;
    }

    @Override // defpackage.x8j
    public String E() {
        return null;
    }

    @Override // defpackage.x8j
    public boolean F(Exception exc) {
        return false;
    }

    @Override // defpackage.x8j
    public boolean G(Thread thread, Throwable th) {
        return false;
    }

    @Override // defpackage.x8j
    public boolean O() {
        return false;
    }

    @Override // defpackage.x8j
    public boolean P() {
        return rr5.a();
    }

    @Override // defpackage.x8j
    public boolean Q() {
        return true;
    }

    @Override // defpackage.qxc
    public void closeCurrentPage(ReadableMap readableMap) {
        xuk.a("WearRNRunTime try closeCurrentPage");
        Activity activity = this.h;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        xuk.a("WearRNRunTime do finish");
        this.h.finish();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime, defpackage.qxc
    public Bundle getActivityBundle() {
        return null;
    }

    @Override // defpackage.qxc
    public IRNRuntime getCurrentRuntime() {
        return this;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime
    public boolean getIsStdPlugin() {
        return true;
    }

    @Override // defpackage.qxc
    public String getLanguageStr() {
        return LocaleUtil.getString(Locale.getDefault());
    }

    @Override // defpackage.qxc
    public String getSdkBundlePath() {
        RnSdkInfo rnSdkInfo = this.j;
        if (rnSdkInfo != null) {
            return rnSdkInfo.install_dir;
        }
        RnSdkInfo newestRnSdkInfo = PluginPackageManager.getInstance().getNewestRnSdkInfo(MiJiaEnvironment.getAppContext());
        if (newestRnSdkInfo != null) {
            return newestRnSdkInfo.install_dir;
        }
        return null;
    }

    @Override // defpackage.qxc
    public boolean isReleaseBuildType() {
        return false;
    }

    @Override // defpackage.qxc
    public void sendEvent(String str, Object obj) {
        ReactContext reactContextC;
        if (getInstanceManager() == null || (reactContextC = getInstanceManager().C()) == null) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextC.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }
}
