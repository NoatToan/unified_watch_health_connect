package defpackage;

import android.content.Context;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.plugindevicedetectdiagnosis.DeviceDetectDiagnosisApi;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes14.dex */
public class pcg extends AppBundlePluginProxy<DeviceDetectDiagnosisApi> implements DeviceDetectDiagnosisApi {
    private static volatile pcg e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceDetectDiagnosisApi f45156a;

    private pcg() {
        super("DeviceDetectDiagnosisProxy", "PluginDeviceDetectDiagnosis", "com.huawei.plugindevicedetectdiagnosis.DeviceDetectDiagnosisApiImpl");
        this.f45156a = createPluginApi();
    }

    public static pcg c() {
        pcg pcgVar;
        if (e == null) {
            synchronized (pcg.class) {
                if (e == null) {
                    e = new pcg();
                }
                pcgVar = e;
            }
            return pcgVar;
        }
        return e;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.f45156a != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void initialize(DeviceDetectDiagnosisApi deviceDetectDiagnosisApi) {
        this.f45156a = deviceDetectDiagnosisApi;
    }

    public void e(AppBundleLauncher.InstallCallback installCallback) {
        loadPlugin(installCallback);
    }

    @Override // com.huawei.plugindevicedetectdiagnosis.DeviceDetectDiagnosisApi
    public void openDiagnosisPage(int i, String str, DeviceInfo deviceInfo, String str2, Context context) {
        DeviceDetectDiagnosisApi deviceDetectDiagnosisApi = this.f45156a;
        if (deviceDetectDiagnosisApi != null) {
            deviceDetectDiagnosisApi.openDiagnosisPage(i, str, deviceInfo, str2, context);
        } else {
            loadPlugin();
            ReleaseLogUtil.d("Dfx_DeviceDetectDiagnosisProxy", "PluginDeviceDetectDiagnosis loadPlugin and init");
        }
    }
}
