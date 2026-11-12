package com.huawei.hwdevice.phoneprocess.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.mkf;
import defpackage.mrt;
import defpackage.msc;
import defpackage.mth;
import defpackage.mtn;
import defpackage.mud;
import health.compact.a.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ContactSyncJobService extends JobService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f17550c = new Object();
    private static boolean e = false;

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        LogUtil.a("ContactSyncJobService", "onStartJob: start");
        try {
            msc.c().d();
            if (jobParameters != null && !e()) {
                List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "ContactSyncJobService");
                DeviceInfo deviceInfo = deviceList.size() != 0 ? deviceList.get(0) : null;
                if (deviceInfo == null) {
                    LogUtil.j("ContactSyncJobService", "onStartJob deviceInfo is null");
                    jobFinished(jobParameters, false);
                    return false;
                }
                boolean zE = mud.e();
                LogUtil.a("ContactSyncJobService", "onStartJob isSupportSportCapability is : ", Boolean.valueOf(zE));
                if (zE) {
                    c(jobParameters);
                } else {
                    DeviceCapability deviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(2, "", "ContactSyncJobService").get(deviceInfo.getDeviceIdentify());
                    if (deviceCapability != null && deviceCapability.isSupportSyncContacts()) {
                        d(jobParameters, deviceInfo);
                    }
                    LogUtil.j("ContactSyncJobService", "onStartJob is not support");
                    jobFinished(jobParameters, false);
                    return false;
                }
                LogUtil.a("ContactSyncJobService", "onStartJob: end");
                return true;
            }
            a();
            LogUtil.a("ContactSyncJobService", "onStartJob: return");
            return false;
        } catch (Exception unused) {
            ReleaseLogUtil.b("R_ContactSyncJobService", "onStartJob exception");
            jobFinished(jobParameters, true);
        }
    }

    private void d(final JobParameters jobParameters, final DeviceInfo deviceInfo) {
        LogUtil.a("ContactSyncJobService", "handleSync: start");
        c(true);
        ThreadPoolManager.c().execute(new Runnable() { // from class: nep
            @Override // java.lang.Runnable
            public final void run() {
                this.f43012b.d(deviceInfo, jobParameters);
            }
        });
        LogUtil.a("ContactSyncJobService", "handleSync: end");
    }

    public /* synthetic */ void d(DeviceInfo deviceInfo, JobParameters jobParameters) {
        msc.c().e(mtn.e(), 0);
        msc.c().c(deviceInfo);
        c(false);
        jobFinished(jobParameters, false);
        LogUtil.a("ContactSyncJobService", "executed sync in ThreadPool end.");
    }

    private void c(final JobParameters jobParameters) {
        ReleaseLogUtil.c("R_ContactSyncJobService", "handleSportSync: start");
        c(true);
        ThreadPoolManager.c().execute(new Runnable() { // from class: nel
            @Override // java.lang.Runnable
            public final void run() {
                this.f43000b.d(jobParameters);
            }
        });
        LogUtil.a("ContactSyncJobService", "handleSportSync: end");
    }

    public /* synthetic */ void d(JobParameters jobParameters) {
        mrt.a().e();
        c(false);
        jobFinished(jobParameters, false);
        LogUtil.a("ContactSyncJobService", "executed handleSportSync in ThreadPool end.");
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (Build.VERSION.SDK_INT >= 31) {
            ReleaseLogUtil.b("R_ContactSyncJobService", "Job stopped due to Reason code:", Integer.valueOf(jobParameters == null ? 0 : jobParameters.getStopReason()));
        }
        return false;
    }

    public void a() {
        LogUtil.a("ContactSyncJobService", "startListen: start");
        msc.c().a(this, mtn.e());
    }

    private boolean e() {
        return mth.d(getApplicationContext()) || c();
    }

    public static void c(boolean z) {
        synchronized (f17550c) {
            e = z;
        }
    }

    public static boolean c() {
        boolean z;
        synchronized (f17550c) {
            z = e;
        }
        return z;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        a();
    }
}
