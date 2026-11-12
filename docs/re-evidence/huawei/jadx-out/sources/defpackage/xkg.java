package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.treadmill.CallBackToReportStepsOrEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class xkg {
    private static Context d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IExecuteResult f53147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthOpenSDK f53148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qhs f53149c;
    private ScheduledExecutorService e;

    private xkg() {
        this.f53149c = null;
        this.f53147a = new IExecuteResult() { // from class: xkg.4
            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onFailed(Object obj) {
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onServiceException(Object obj) {
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onSuccess(Object obj) {
                if (obj instanceof Bundle) {
                    int i = ((Bundle) obj).getInt("standSteps", 0);
                    LogUtil.d("Track_VibraStepCounterHelper", "mExecuteResult onSuccess");
                    if (xkg.this.f53149c != null) {
                        xkg.this.f53149c.d(i);
                    }
                }
            }
        };
    }

    public static xkg d(Context context) {
        d = context;
        return c.e;
    }

    public boolean d(qht qhtVar, CallBackToReportStepsOrEvent callBackToReportStepsOrEvent, int i) {
        qhs qhsVarE = qhs.e(d, true);
        this.f53149c = qhsVarE;
        if (qhsVarE == null) {
            LogUtil.j("Track_VibraStepCounterHelper", "initAndStartVibraStepCount, getInstance of StepsCounter returns null");
            return false;
        }
        boolean zD = qhsVarE.d(qhtVar, callBackToReportStepsOrEvent, i);
        if (zD) {
            LogUtil.a("Track_VibraStepCounterHelper", "now will start scheduleAtFixedRate for set cur steps from stepCountModule to vibraStepsCounter");
            if (this.f53148b == null) {
                this.f53148b = e();
            }
            if (this.e == null) {
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.e = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new a(), 0L, 1000L, TimeUnit.MILLISECONDS);
            }
        }
        return zD;
    }

    public int c() {
        qhs qhsVar = this.f53149c;
        if (qhsVar == null) {
            LogUtil.j("Track_VibraStepCounterHelper", "getCurrentSteps, mStepsCounter is null");
            return -1;
        }
        return qhsVar.d();
    }

    public boolean d(int i, int i2, int i3) {
        qhs qhsVar = this.f53149c;
        if (qhsVar == null) {
            LogUtil.j("Track_VibraStepCounterHelper", "refreshWorkoutParameters, mStepsCounter is null");
            return false;
        }
        return qhsVar.c(i, i2, i3);
    }

    public void d() {
        qhs qhsVar = this.f53149c;
        if (qhsVar != null) {
            qhsVar.c();
            LogUtil.a("Track_VibraStepCounterHelper", "stopVibraStepsCount: stopCountSteps");
        }
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        this.e = null;
        this.f53148b = null;
        this.f53149c = null;
    }

    private HealthOpenSDK e() {
        if (this.f53148b == null) {
            HealthOpenSDK healthOpenSDKB = lky.b();
            this.f53148b = healthOpenSDKB;
            healthOpenSDKB.initSDK(d, new IExecuteResult() { // from class: xkg.5
                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onSuccess(Object obj) {
                    LogUtil.d("Track_VibraStepCounterHelper", "healthOpenSDKCallback initSDK success");
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onFailed(Object obj) {
                    LogUtil.e("Track_VibraStepCounterHelper", "healthOpenSDKCallback : initSDK Failed");
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onServiceException(Object obj) {
                    LogUtil.e("Track_VibraStepCounterHelper", "healthOpenSDKCallback : initSDK onServiceException");
                }
            }, "HuaweiHealth");
        }
        return this.f53148b;
    }

    static class c {
        private static final xkg e = new xkg();
    }

    class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (xkg.this.f53148b != null) {
                xkg.this.f53148b.a(xkg.this.f53147a);
            }
        }
    }
}
