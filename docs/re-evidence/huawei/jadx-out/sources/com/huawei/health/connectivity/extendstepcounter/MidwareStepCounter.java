package com.huawei.health.connectivity.extendstepcounter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import com.huawei.health.fw.IReportCallback;
import com.huawei.health.fwk.BaseStepCounter;
import com.huawei.health.icommon.HwHealthSensorEventListener;
import com.huawei.health.icommon.ISimpleResultCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import health.compact.a.CommonUtil;
import health.compact.a.HnStandStepCounter;
import health.compact.a.HwStandStepCounter;
import health.compact.a.LogSensor;
import health.compact.a.LogicalStepCounter;
import health.compact.a.OneMinuteStepData;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.StepCounterSupport;

/* JADX INFO: loaded from: classes2.dex */
public class MidwareStepCounter extends ExtendStepCounter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f6260b = false;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6261a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f6262c;
    private d e;
    private a f;
    private c g;
    private b j;
    private boolean h = false;
    private int n = 0;
    private BaseStepCounter l = null;
    private ISimpleResultCallback i = null;

    public interface MidwareCallback {
        void onFailed(SparseArray<OneMinuteStepData> sparseArray);

        void onSuccess(SparseArray<OneMinuteStepData> sparseArray);
    }

    public MidwareStepCounter(Context context) {
        this.f6261a = null;
        this.f6262c = new e();
        if (CommonUtil.bj()) {
            this.f = new a();
            this.e = new d();
        } else {
            this.j = new b();
            this.g = new c();
        }
        if (context == null) {
            LogUtil.j("Step_MidwareStepCnt", "MidwareStepCounter context is null.");
            this.f6261a = BaseApplication.getContext();
        } else {
            this.f6261a = context;
        }
    }

    @Override // com.huawei.health.connectivity.extendstepcounter.ExtendStepCounter
    public void init(ISimpleResultCallback iSimpleResultCallback) {
        if (iSimpleResultCallback == null) {
            LogUtil.j("Step_MidwareStepCnt", "callback is null.");
        } else {
            this.i = iSimpleResultCallback;
            b();
        }
    }

    @Override // com.huawei.health.connectivity.extendstepcounter.ExtendStepCounter
    public void startStepCounter() {
        ReleaseLogUtil.c("Step_MidwareStepCnt", "startStepCounter ", this.l);
        BaseStepCounter baseStepCounter = this.l;
        if (baseStepCounter != null) {
            baseStepCounter.openStepCounter();
            e(true);
            LogUtil.a("Step_MidwareStepCnt", "registerCallback ", this.l);
            if (CommonUtil.bj()) {
                this.l.registerDataCallback(this.f);
            } else {
                this.l.registerDataCallback(this.j);
            }
        }
        c();
    }

    private void c() {
        LogUtil.a("Step_MidwareStepCnt", "registerLogCallback ", this.l);
        BaseStepCounter baseStepCounter = this.l;
        if (baseStepCounter != null) {
            LogUtil.a("Step_MidwareStepCnt", "registerLogCallback:", baseStepCounter, " mLogCallback:", this.g);
            if (CommonUtil.bj()) {
                this.l.registerLogCallback(this.e);
            } else {
                this.l.registerLogCallback(this.g);
            }
        }
    }

    private void g() {
        LogUtil.a("Step_MidwareStepCnt", "unRegisterLogCallback ", this.l);
        BaseStepCounter baseStepCounter = this.l;
        if (baseStepCounter != null) {
            LogUtil.a("Step_MidwareStepCnt", "unRegisterLogCallback:", baseStepCounter, " mLogCallback:", this.g);
            if (CommonUtil.bj()) {
                this.l.unRegisterLogCallback(this.e);
            } else {
                this.l.unRegisterLogCallback(this.g);
            }
        }
    }

    @Override // com.huawei.health.connectivity.extendstepcounter.ExtendStepCounter
    public void stopStepCounter() {
        HwHealthSensorEventListener hwHealthSensorEventListenerC;
        ReleaseLogUtil.c("Step_MidwareStepCnt", "stopStepCounter ", this.l);
        if (Build.VERSION.SDK_INT >= 28 && (hwHealthSensorEventListenerC = LogicalStepCounter.d(this.f6261a).c()) != null) {
            hwHealthSensorEventListenerC.notifyStepCounterError(false);
        }
        BaseStepCounter baseStepCounter = this.l;
        if (baseStepCounter != null) {
            baseStepCounter.closeStepCounter();
            e(false);
            LogUtil.a("Step_MidwareStepCnt", "unRegisterCallback ", this.l);
            if (CommonUtil.bj()) {
                this.l.unRegisterDataCallback(this.f);
            } else {
                this.l.unRegisterDataCallback(this.j);
            }
        }
        g();
    }

    public String a() {
        BaseStepCounter baseStepCounter = this.l;
        if (baseStepCounter != null) {
            return baseStepCounter.getVersion();
        }
        return null;
    }

    private boolean b() {
        boolean zBindService;
        LogUtil.d("Step_MidwareStepCnt", "initMidwareSerivce ", this.f6261a);
        Context context = this.f6261a;
        if (context == null) {
            return false;
        }
        Intent intentB = b(context);
        if (intentB != null) {
            try {
                zBindService = this.f6261a.bindService(intentB, this.f6262c, 1);
            } catch (SecurityException unused) {
                LogUtil.j("Step_MidwareStepCnt", "mid ware bind failed");
                zBindService = false;
            }
        } else {
            zBindService = false;
        }
        if (!zBindService) {
            LogUtil.j("Step_MidwareStepCnt", "mid ware bind ret false,init onfailed");
            LogicalStepCounter.d(this.f6261a).d(false);
            this.i.onFailed(null);
        }
        ReleaseLogUtil.c("Step_MidwareStepCnt", "bind ret ", Boolean.valueOf(zBindService));
        return zBindService;
    }

    private Intent b(Context context) {
        return StepCounterSupport.e(context);
    }

    class e implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        private e() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (CommonUtil.bj()) {
                MidwareStepCounter.this.l = new HnStandStepCounter(iBinder);
            } else {
                MidwareStepCounter.this.l = new HwStandStepCounter(iBinder);
            }
            String strA = MidwareStepCounter.this.a();
            LogUtil.a("Step_MidwareStepCnt", "MyServiceConn connect ", strA);
            if (MidwareStepCounter.this.i != null) {
                if (strA != null) {
                    MidwareStepCounter.this.i.onSuccess(null);
                } else {
                    MidwareStepCounter.this.i.onFailed(null);
                }
            }
        }
    }

    class b extends IReportCallback.Stub {
        private b() {
        }

        @Override // com.huawei.health.fw.IReportCallback
        public void onResult(Bundle bundle) {
            MidwareStepCounter.this.c(bundle);
        }
    }

    class a extends com.hihonor.health.fw.IReportCallback.Stub {
        private a() {
        }

        @Override // com.hihonor.health.fw.IReportCallback
        public void onResult(Bundle bundle) {
            MidwareStepCounter.this.c(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Bundle bundle) {
        if (bundle != null) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    HwHealthSensorEventListener hwHealthSensorEventListenerC = LogicalStepCounter.d(this.f6261a).c();
                    if (bundle.getInt("ability") == 1) {
                        SharedPerferenceUtils.b(this.f6261a, true);
                    } else {
                        SharedPerferenceUtils.b(this.f6261a, false);
                    }
                    if (hwHealthSensorEventListenerC != null) {
                        hwHealthSensorEventListenerC.dataReport(bundle.getInt("total_steps"), false);
                    }
                }
                dataReport(this.f6261a, bundle.getLong("start_time"), bundle.getIntArray(MedalConstants.EVENT_STEPS), bundle.getIntArray("floors"), bundle.getIntArray(ContentTemplateRecord.MOTIONS));
            } catch (ArrayIndexOutOfBoundsException e2) {
                LogUtil.e("Step_MidwareStepCnt", "MyCallback onResult ", e2.getMessage());
            }
        }
    }

    class c extends IReportCallback.Stub {
        private c() {
        }

        @Override // com.huawei.health.fw.IReportCallback
        public void onResult(Bundle bundle) {
            MidwareStepCounter.this.a(bundle);
        }
    }

    class d extends com.hihonor.health.fw.IReportCallback.Stub {
        private d() {
        }

        @Override // com.hihonor.health.fw.IReportCallback
        public void onResult(Bundle bundle) {
            MidwareStepCounter.this.a(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        if (bundle != null) {
            try {
                LogSensor.b(bundle.getByteArray("sensorhub_log"));
            } catch (ArrayIndexOutOfBoundsException e2) {
                LogUtil.j("Step_MidwareStepCnt", e2.getMessage());
            }
        }
    }

    public boolean e() {
        synchronized (d) {
            if (!this.h) {
                int i = this.n + 1;
                this.n = i;
                if (i != 6) {
                    LogUtil.j("Step_MidwareStepCnt", "cannot sync with db while midware cache not ready,retry:", Integer.valueOf(i));
                    return false;
                }
                LogUtil.j("Step_MidwareStepCnt", "cannot sync with db while midware cache not ready,force sync");
                this.n = 0;
                this.h = true;
                return true;
            }
            this.n = 0;
            return true;
        }
    }

    public static boolean d() {
        return f6260b;
    }

    private static void e(boolean z) {
        f6260b = z;
    }
}
