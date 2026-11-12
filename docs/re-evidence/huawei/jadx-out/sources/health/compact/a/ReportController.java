package health.compact.a;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.icommon.LocalStepDataReport;
import com.huawei.health.manager.common.StandReportReceiver;

/* JADX INFO: loaded from: classes2.dex */
public class ReportController {
    private static final Object d = new Object();
    private StandReportReceiver e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StepsRecord f36630b = new StepsRecord();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StepsRecord f36629a = new StepsRecord();

    public ReportController() {
        this.e = null;
        this.e = new StandReportReceiver(new StandReportReceiver.OnScreenOnListener() { // from class: health.compact.a.ReportController.5
            @Override // com.huawei.health.manager.common.StandReportReceiver.OnScreenOnListener
            public void onScreenOn() {
                ThreadPoolManager.c().execute(new Runnable() { // from class: health.compact.a.ReportController.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ReportController.this.c();
                    }
                });
            }
        });
    }

    public void b(LocalStepDataReport localStepDataReport) {
        if (localStepDataReport == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_ReportController", "add-force-data report is null.");
            return;
        }
        this.e.b(localStepDataReport);
        synchronized (d) {
            if (this.f36629a == null) {
                this.f36629a = this.f36630b;
            }
        }
        c();
    }

    public void c(StepsRecord stepsRecord, boolean z) {
        if (stepsRecord == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_ReportController", "record is null.");
            return;
        }
        synchronized (d) {
            if (!z) {
                if (stepsRecord.equals(this.f36630b) || stepsRecord.equals(this.f36629a)) {
                    return;
                }
            }
            this.f36629a = stepsRecord;
            e(z);
        }
    }

    public int c() {
        return e(false);
    }

    private int e(boolean z) {
        synchronized (d) {
            StepsRecord stepsRecord = this.f36629a;
            if (stepsRecord == null) {
                return 0;
            }
            StandReportReceiver standReportReceiver = this.e;
            if (standReportReceiver == null) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_ReportController", "FAILED_NULL_POINTER mReportUtil == null");
                return -3;
            }
            int iC = standReportReceiver.c(stepsRecord, z);
            if (iC == -3) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_ReportController", "FAILED_NULL_POINTER");
                this.f36629a = null;
            } else if (iC == -2) {
                com.huawei.hwlogsmodel.LogUtil.a("Step_ReportController", "FAILED_SCREEN_OFF block report");
            } else if (iC == -1) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_ReportController", "FAILED_ERROR_DATA");
                this.f36629a = null;
            } else if (iC == 0) {
                this.f36630b = this.f36629a;
                this.f36629a = null;
            }
            return iC;
        }
    }
}
