package com.huawei.health.connectivity.extendstepcounter;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.huawei.health.icommon.ISimpleResultCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.motiondetection.MotionDetectionListener;
import com.huawei.motiondetection.MotionDetectionManager;
import com.huawei.motiondetection.MotionRecoResult;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class MotionStepCounter extends ExtendStepCounter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f6269c;
    private MotionDetectionManager e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6268b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f6267a = new Handler();
    private MotionDetectionListener d = new MotionDetectionListener() { // from class: com.huawei.health.connectivity.extendstepcounter.MotionStepCounter.1
        @Override // com.huawei.motiondetection.MotionDetectionListener
        public void notifyMotionRecoResult(MotionRecoResult motionRecoResult) {
            if (motionRecoResult != null) {
                MotionStepCounter.this.e(motionRecoResult.mMotionExtras);
            }
        }
    };

    public MotionStepCounter(Context context) {
        this.f6269c = null;
        this.e = null;
        if (context == null) {
            LogUtil.j("Step_MotionStepCounter", "MotionStepCounter context null");
        } else {
            this.f6269c = context;
            this.e = new MotionDetectionManager(context);
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<ISimpleResultCallback> f6270c;

        a(ISimpleResultCallback iSimpleResultCallback) {
            this.f6270c = new WeakReference<>(iSimpleResultCallback);
        }

        @Override // java.lang.Runnable
        public void run() {
            ISimpleResultCallback iSimpleResultCallback;
            WeakReference<ISimpleResultCallback> weakReference = this.f6270c;
            if (weakReference == null || (iSimpleResultCallback = weakReference.get()) == null) {
                return;
            }
            iSimpleResultCallback.onSuccess(null);
        }
    }

    @Override // com.huawei.health.connectivity.extendstepcounter.ExtendStepCounter
    public void init(ISimpleResultCallback iSimpleResultCallback) {
        Handler handler = this.f6267a;
        if (handler == null) {
            LogUtil.a("Step_MotionStepCounter", "mHandler = null ");
        } else if (iSimpleResultCallback != null) {
            handler.post(new a(iSimpleResultCallback));
        } else {
            LogUtil.a("Step_MotionStepCounter", "callback = null ");
        }
    }

    @Override // com.huawei.health.connectivity.extendstepcounter.ExtendStepCounter
    public void startStepCounter() {
        LogUtil.a("Step_MotionStepCounter", "startStepCounter enter... mIsDeviceOpened = ", Boolean.valueOf(this.f6268b));
        if (this.f6268b) {
            return;
        }
        b();
        this.f6268b = true;
    }

    @Override // com.huawei.health.connectivity.extendstepcounter.ExtendStepCounter
    public void stopStepCounter() {
        if (this.f6268b) {
            e();
            this.f6268b = false;
        }
    }

    private void b() {
        try {
            LogUtil.a("Step_MotionStepCounter", "initSensorHubManager enter... mMotionDetectionManager = ", this.e);
            MotionDetectionManager motionDetectionManager = this.e;
            if (motionDetectionManager != null) {
                motionDetectionManager.addMotionListener(this.d);
                this.e.startMotionService();
                try {
                    LogUtil.d("Step_MotionStepCounter", "initSensorHubManager isStartMotion = ", Boolean.valueOf(this.e.startMotionAppsReco(1101)));
                } catch (Error unused) {
                    LogUtil.e("Step_MotionStepCounter", "initSensorHubManager catch error");
                }
            }
        } catch (Exception unused2) {
            LogUtil.e("Step_MotionStepCounter", "initSensorHubManager catch exception");
        }
    }

    private void e() {
        try {
            MotionDetectionManager motionDetectionManager = this.e;
            if (motionDetectionManager != null) {
                motionDetectionManager.removeMotionListener(this.d);
                try {
                    LogUtil.d("Step_MotionStepCounter", "unInitSensorHubManager isStopMotion = ", Boolean.valueOf(this.e.stopMotionAppsReco(1101)));
                } catch (Error unused) {
                    LogUtil.e("Step_MotionStepCounter", "unInitSensorHubManager catch error, stop failed");
                }
                this.e.stopMotionService();
                this.e.destroy();
            }
        } catch (Exception unused2) {
            LogUtil.e("Step_MotionStepCounter", "unInitSensorHubManager catch exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Bundle bundle) {
        if (bundle != null) {
            try {
                long j = bundle.getLong("StartTime");
                int[] intArray = bundle.getIntArray("MotionNum");
                int[] intArray2 = bundle.getIntArray("motionType");
                int[] intArray3 = bundle.getIntArray("motionLevel");
                LogUtil.d("Step_MotionStepCounter", String.format(Locale.ENGLISH, "[%d] : %s : %s : %s", Long.valueOf(j), Arrays.toString(intArray), Arrays.toString(intArray3), Arrays.toString(intArray2)));
                dataReport(this.f6269c, j, intArray, intArray3, intArray2);
            } catch (ArrayIndexOutOfBoundsException e) {
                LogUtil.e("Step_MotionStepCounter", e.getMessage());
            }
        }
    }
}
