package defpackage;

import android.app.Service;
import android.os.Bundle;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.ICommonReport;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.StepNotificationByHardWareUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class nej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f42994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IExecuteResult f42995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Service f42996c;
    private HealthOpenSDK d;
    private neo e;

    public void c(Service service) {
        if (this.e == null) {
            this.e = neo.b(service);
        }
        this.f42996c = service;
        this.f42994a = new e();
        this.f42995b = new d();
        HealthOpenSDK healthOpenSDK = new HealthOpenSDK();
        this.d = healthOpenSDK;
        healthOpenSDK.initSDK(BaseApplication.getContext(), new IExecuteResult() { // from class: nej.4
            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onSuccess(Object obj) {
                ReleaseLogUtil.d("DEVMGR_KeepAliveOptimize", "initSDK Success");
                nej.this.d();
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onFailed(Object obj) {
                ReleaseLogUtil.e("DEVMGR_KeepAliveOptimize", "initSDK failed");
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onServiceException(Object obj) {
                ReleaseLogUtil.a("DEVMGR_KeepAliveOptimize", "initSDK exception");
            }
        }, "PhoneService");
    }

    public void b(final DeviceInfo deviceInfo) {
        if (!nzz.c()) {
            LogUtil.j("KeepAliveOptimize", "this is huawei system");
        } else {
            mhs.a().getSwitchSetting("device_notification_key", new IBaseResponseCallback() { // from class: nej.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("DEVMGR_KeepAliveOptimize", "updateDeviceNotify errorCode:", Integer.valueOf(i));
                    boolean zEquals = true;
                    if (i == 0 && (obj instanceof String)) {
                        zEquals = true ^ "0".equals((String) obj);
                        LogUtil.a("KeepAliveOptimize", "onlaod updateDeviceNotify: ", Boolean.valueOf(zEquals));
                    }
                    ReleaseLogUtil.d("DEVMGR_KeepAliveOptimize", "onlaod updateDeviceNotify, result: ", Boolean.valueOf(zEquals));
                    if (zEquals) {
                        nej.this.e.b(deviceInfo);
                    } else {
                        nej.this.e.a();
                    }
                }
            });
        }
    }

    public void d() {
        HealthOpenSDK healthOpenSDK = this.d;
        if (healthOpenSDK != null) {
            healthOpenSDK.a(this.f42994a, this.f42995b);
            ReleaseLogUtil.d("DEVMGR_KeepAliveOptimize", "register mStepCallback:", this.f42994a);
            this.d.d(new IExecuteResult() { // from class: nej.3
                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onFailed(Object obj) {
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onServiceException(Object obj) {
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onSuccess(Object obj) {
                    if (obj != null && (obj instanceof Bundle)) {
                        boolean z = ((Bundle) obj).getBoolean("stepsNotifiState");
                        ReleaseLogUtil.d("DEVMGR_KeepAliveOptimize", "isOpenRealTimeStep :", Boolean.valueOf(z));
                        if (z && StepNotificationByHardWareUtils.d()) {
                            nej.this.e();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ReleaseLogUtil.d("DEVMGR_KeepAliveOptimize", "getTodaySportData()");
        this.d.c(new IExecuteResult() { // from class: nej.1
            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onFailed(Object obj) {
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onServiceException(Object obj) {
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onSuccess(Object obj) {
                if (!(obj instanceof Bundle)) {
                    LogUtil.j("KeepAliveOptimize", "getTodaySportData is not bundle");
                    return;
                }
                Bundle bundle = (Bundle) obj;
                StringBuilder sb = new StringBuilder(16);
                sb.append("Fitness data:steps:");
                sb.append(bundle.getInt("step"));
                sb.append("floor:");
                sb.append(bundle.getInt("floor"));
                sb.append("calories:");
                sb.append(bundle.getInt("carior"));
                sb.append("target:");
                sb.append(bundle.getInt("stepTarget"));
                LogUtil.a("KeepAliveOptimize", sb.toString());
                new neh().b(nej.this.f42996c, bundle.getInt("step"), bundle.getInt("carior"), bundle.getInt("stepTarget"));
            }
        });
    }

    public void b() {
        if (this.d == null) {
            LogUtil.j("KeepAliveOptimize", "onDestroy mHealthOpenSdk null");
            return;
        }
        e eVar = this.f42994a;
        if (eVar == null) {
            LogUtil.j("KeepAliveOptimize", "onDestroy mStepCallback null");
            return;
        }
        ReleaseLogUtil.d("DEVMGR_KeepAliveOptimize", "unRegister mStepCallback:", eVar);
        this.d.e(this.f42994a);
        this.f42996c.stopForeground(false);
        neo neoVar = this.e;
        if (neoVar != null) {
            neoVar.c();
            this.e = null;
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    static class e implements ICommonReport {
        @Override // com.huawei.hihealth.motion.ICommonReport
        public void report(Bundle bundle) {
        }

        private e() {
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    static class d implements IExecuteResult {
        private d() {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            LogUtil.a("KeepAliveOptimize", "onSuccess");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            LogUtil.j("KeepAliveOptimize", "onFailed");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            LogUtil.e("KeepAliveOptimize", "onServiceException");
        }
    }
}
