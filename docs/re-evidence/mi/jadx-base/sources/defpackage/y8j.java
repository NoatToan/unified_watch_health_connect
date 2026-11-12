package defpackage;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.runtime.IRNRuntime;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;

/* JADX INFO: loaded from: classes5.dex */
public class y8j implements qxc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile y8j f39932b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qxc f39933a = new tw5();

    public static y8j a() {
        if (f39932b == null) {
            synchronized (y8j.class) {
                try {
                    if (f39932b == null) {
                        f39932b = new y8j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f39932b;
    }

    public void b(qxc qxcVar) {
        this.f39933a = qxcVar;
    }

    @Override // defpackage.qxc
    public void closeCurrentPage(ReadableMap readableMap) {
        this.f39933a.closeCurrentPage(readableMap);
    }

    @Override // defpackage.qxc
    public Bundle getActivityBundle() {
        return this.f39933a.getActivityBundle();
    }

    @Override // defpackage.qxc
    public IRNRuntime getCurrentRuntime() {
        return this.f39933a.getCurrentRuntime();
    }

    @Override // defpackage.qxc
    public DeviceStat getDeviceStat() {
        return this.f39933a.getDeviceStat();
    }

    @Override // defpackage.qxc
    public String getLanguageStr() {
        return this.f39933a.getLanguageStr();
    }

    @Override // defpackage.qxc
    public RnPluginDeviceInfo getPluginInfo() {
        return this.f39933a.getPluginInfo();
    }

    @Override // defpackage.qxc
    public PluginPackageInfo getPluginRecord() {
        return this.f39933a.getPluginRecord();
    }

    @Override // defpackage.qxc
    public String getSdkBundlePath() {
        return this.f39933a.getSdkBundlePath();
    }

    @Override // defpackage.qxc
    public boolean isReleaseBuildType() {
        return this.f39933a.isReleaseBuildType();
    }

    @Override // defpackage.qxc
    public void sendEvent(String str, Object obj) {
    }
}
