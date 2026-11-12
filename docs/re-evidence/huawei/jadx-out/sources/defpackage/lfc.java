package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.DataReportModel;
import com.huawei.hihealth.IRegisterRealTimeCallback;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.ICommonReport;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lfc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f40012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f40013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40014c;
    private final Object d;
    private final Object e;
    private HealthOpenSDK f;
    private volatile boolean g;
    private ICommonReport h;
    private final ldp j;

    private lfc() {
        this.f40013b = new Object();
        this.d = new Object();
        this.e = new Object();
        this.g = false;
        this.j = new ldp();
        this.f40014c = false;
    }

    static class d {
        private static final lfc d = new lfc();
    }

    public static lfc b(Context context) {
        f40012a = context.getApplicationContext();
        return d.d;
    }

    private void d(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) {
        synchronized (this.f40013b) {
            this.j.registerObserver(dataReportModel, iRegisterRealTimeCallback);
        }
    }

    private void b(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) {
        synchronized (this.f40013b) {
            this.j.unregisterObserver(dataReportModel, iRegisterRealTimeCallback);
        }
    }

    public void c() {
        LogUtil.a("RealTimeUtil", "start init sdk, init result before ", Boolean.valueOf(this.f40014c));
        if (this.f40014c) {
            return;
        }
        try {
            HealthOpenSDK healthOpenSDK = new HealthOpenSDK();
            this.f = healthOpenSDK;
            healthOpenSDK.initSDK(f40012a, new b(), "Health Kit");
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_RealTimeUtil", "init error", LogAnonymous.b(e2));
        }
    }

    class b implements IExecuteResult {
        private b() {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            lfc.this.f40014c = true;
            ReleaseLogUtil.d("HiH_RealTimeUtil", "healthOpenSDKCallback initSDK success");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            lfc.this.f40014c = false;
            if (lfc.this.f != null) {
                lfc.this.f.destorySDK();
                lfc.this.f = null;
            }
            ReleaseLogUtil.e("HiH_RealTimeUtil", "healthOpenSDKCallback : initSDK Failed");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            lfc.this.f40014c = false;
            if (lfc.this.f != null) {
                lfc.this.f.destorySDK();
                lfc.this.f = null;
            }
            ReleaseLogUtil.e("HiH_RealTimeUtil", "healthOpenSDKCallback : onServiceException");
        }
    }

    public void c(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback, len lenVar) {
        int dataType = dataReportModel.getDataType();
        if (b("registerDataAutoReport", dataType, this.f, iRegisterRealTimeCallback, lenVar)) {
            c();
            return;
        }
        synchronized (this.d) {
            if (!this.g) {
                this.h = new e(this.f);
                long jCurrentTimeMillis = System.currentTimeMillis();
                c(this.f, this.h);
                synchronized (this.e) {
                    try {
                        if (!this.g) {
                            this.e.wait(1000L);
                        }
                    } catch (InterruptedException e2) {
                        ReleaseLogUtil.a("HiH_RealTimeUtil", "registerRealTimeCallback: InterruptedException", LogAnonymous.b(e2));
                    }
                }
                LogUtil.d("RealTimeUtil", "registerStepReport needs ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), " ms");
            }
        }
        if (this.g) {
            d(dataReportModel, iRegisterRealTimeCallback);
            try {
                iRegisterRealTimeCallback.onResult(0, lcr.b(0));
            } catch (RemoteException e3) {
                ReleaseLogUtil.a("HiH_RealTimeUtil", "registerRealTimeCallback RemoteException: ", e3.getMessage());
            }
            a("registerDataAutoReport", 0, dataType, lenVar);
            return;
        }
        try {
            iRegisterRealTimeCallback.onResult(4, lcr.b(4));
        } catch (RemoteException e4) {
            ReleaseLogUtil.a("HiH_RealTimeUtil", "registerRealTimeCallback RemoteException2: ", e4.getMessage());
        }
        a("registerDataAutoReport", 4, dataType, lenVar);
    }

    public void d(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback, len lenVar) throws RemoteException {
        int dataType = dataReportModel.getDataType();
        if (b("unregisterDataAutoReport", dataType, this.f, iRegisterRealTimeCallback, lenVar)) {
            c();
            return;
        }
        if (this.j.isEmpty()) {
            ReleaseLogUtil.d("HiH_RealTimeUtil", "unregisterRealTimeCallback: dailyActivityObservable is empty, return success");
            iRegisterRealTimeCallback.onResult(0, lcr.b(0));
            a("unregisterDataAutoReport", 0, dataType, lenVar);
        } else {
            b(dataReportModel, iRegisterRealTimeCallback);
            iRegisterRealTimeCallback.onResult(0, lcr.b(0));
            if (this.j.isEmpty()) {
                d(this.f, this.h);
            }
            a("unregisterDataAutoReport", 0, dataType, lenVar);
        }
    }

    private void c(HealthOpenSDK healthOpenSDK, ICommonReport iCommonReport) {
        LogUtil.a("RealTimeUtil", "enter: RegisterStepReport");
        healthOpenSDK.a(iCommonReport, new a());
    }

    private void d(HealthOpenSDK healthOpenSDK, ICommonReport iCommonReport) {
        LogUtil.a("RealTimeUtil", "enter: unRegisterStepReport");
        healthOpenSDK.e(iCommonReport);
        this.g = false;
    }

    class e implements ICommonReport {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthOpenSDK f40016a;

        e(HealthOpenSDK healthOpenSDK) {
            this.f40016a = healthOpenSDK;
        }

        @Override // com.huawei.hihealth.motion.ICommonReport
        public void report(Bundle bundle) {
            if (bundle == null || !lfc.this.g) {
                return;
            }
            lfc.this.d(this.f40016a, bundle);
        }
    }

    class a implements IExecuteResult {
        a() {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            ReleaseLogUtil.d("HiH_RealTimeUtil", "registerStepReport: IExecuteResult onSuccess");
            lfc.this.g = true;
            lfc.this.e.notifyAll();
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            ReleaseLogUtil.a("HiH_RealTimeUtil", "registerStepReport: IExecuteResult onFailed");
            lfc.this.e.notifyAll();
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            ReleaseLogUtil.a("HiH_RealTimeUtil", "registerStepReport: IExecuteResult onServiceException");
            lfc.this.e.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HealthOpenSDK healthOpenSDK, Bundle bundle) {
        if (this.j.isEmpty()) {
            ReleaseLogUtil.d("HiH_RealTimeUtil", "dataChangeHandling: dailyActivityObservable is empty, unRegisterStepReport");
            d(healthOpenSDK, this.h);
        }
        this.j.notifyDataChanged(bundle);
    }

    private boolean b(String str, int i, HealthOpenSDK healthOpenSDK, IRegisterRealTimeCallback iRegisterRealTimeCallback, len lenVar) {
        if (healthOpenSDK != null) {
            return false;
        }
        LogUtil.j("RealTimeUtil", "step sdk is null");
        try {
            iRegisterRealTimeCallback.onResult(4, lcr.b(4));
        } catch (RemoteException e2) {
            ReleaseLogUtil.a("HiH_RealTimeUtil", "isOpenSdkEmpty RemoteException: ", e2.getMessage());
        }
        a(str, 4, i, lenVar);
        return true;
    }

    private void a(String str, int i, int i2, len lenVar) {
        Context contextB = BaseApplication.b();
        ler lerVar = new ler(str, i, lkf.d(contextB));
        lerVar.e(String.valueOf(i2));
        lenVar.d(contextB, lerVar);
    }
}
