package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lwo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40971a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lwo f40972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private pcg f40973c;
    private DeviceInfo d;
    private String f;
    private int i = -1;
    private AppBundleLauncher.InstallCallback e = new AppBundleLauncher.InstallCallback() { // from class: lwo.2
        @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
        public boolean call(Context context, Intent intent) {
            ReleaseLogUtil.d("Dfx_DetectionDiagnosisManager", "diagnosisplugin install success");
            lwo.this.a(context);
            return false;
        }
    };

    private lwo() {
        e();
        LogUtil.d("DetectionDiagnosisManager", "default constructor");
    }

    public static lwo c() {
        lwo lwoVar;
        synchronized (f40971a) {
            if (f40972b == null) {
                f40972b = new lwo();
            }
            lwoVar = f40972b;
        }
        return lwoVar;
    }

    private void e() {
        this.f40973c = pcg.c();
    }

    public void e(DeviceInfo deviceInfo, int i) {
        ReleaseLogUtil.d("Dfx_DetectionDiagnosisManager", "to startDetection enter, processType = ", Integer.valueOf(i));
        if (i == 0) {
            this.f = "wearableEntrance";
        } else if (i == 1) {
            this.f = "wearUnconnectionEntrance";
        } else if (i == 2) {
            this.f = "wearUnconnectionRemoteEntrance";
        } else {
            this.f = "";
        }
        if (deviceInfo == null || i == -1 || TextUtils.isEmpty(this.f) || this.f40973c == null) {
            ReleaseLogUtil.e("Dfx_DetectionDiagnosisManager", "startDetection invalid parameters");
            return;
        }
        this.d = deviceInfo;
        this.i = i;
        Intent intent = new Intent();
        intent.putExtra("moduleName", "PluginDeviceDetectDiagnosis");
        AppBundle.d().launchActivity(BaseApplication.getContext(), intent, new AppBundleLauncher.InstallCallback() { // from class: lwn
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent2) {
                return this.d.d(context, intent2);
            }
        });
    }

    /* synthetic */ boolean d(Context context, Intent intent) {
        this.f40973c.e(this.e);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context) {
        int i;
        final String deviceUdid;
        ReleaseLogUtil.d("Dfx_DetectionDiagnosisManager", "openDetectionPage enter");
        if (this.f40973c == null || this.d == null || TextUtils.isEmpty(this.f) || (i = this.i) == -1) {
            ReleaseLogUtil.e("Dfx_DetectionDiagnosisManager", "openDetectionPage invalid parameters");
            return;
        }
        if (i == 0) {
            deviceUdid = TextUtils.isEmpty(this.d.getDeviceUdid()) ? this.d.getUuid() : this.d.getDeviceUdid();
        } else {
            deviceUdid = TextUtils.isEmpty(this.d.getUdidFromDevice()) ? this.d.getDeviceUdid() : this.d.getUdidFromDevice();
        }
        if (this.i == 0 && TextUtils.isEmpty(deviceUdid)) {
            ReleaseLogUtil.e("Dfx_DetectionDiagnosisManager", "openDetectionPage deviceId is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: lwk
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(deviceUdid, context);
                }
            });
        }
    }

    /* synthetic */ void b(String str, Context context) {
        this.f40973c.openDiagnosisPage(this.i, str, this.d, this.f, context);
    }
}
