package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.util.EventBus;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class drl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static drl f32251c;
    private static final HealthDevice.HealthDeviceKind d = HealthDevice.HealthDeviceKind.HDK_WEIGHT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f32252a;
    private IHealthDeviceCallback e;
    private String f;
    private boolean g;
    private HealthDevice j;
    private boolean k = false;
    private boolean l = true;
    private boolean o = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EventBus.ICallback f32253b = new EventBus.ICallback() { // from class: drl.4
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            if (dVar != null) {
                if (drl.this.k && "weight_measure_choose_user".equals(dVar.e()) && drl.this.l && !drl.this.g && drl.this.o) {
                    LogUtil.a("AutoMearsureController", "go to WeightAutoMeasureFragment");
                    drl.this.a(dVar.b());
                    return;
                }
                return;
            }
            LogUtil.j("AutoMearsureController", "onEvent event is null");
        }
    };
    private Handler i = new Handler(Looper.getMainLooper()) { // from class: drl.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            LogUtil.a("AutoMearsureController", "message what is ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1002) {
                drl.this.j();
            } else if (i == 1003) {
                drl.this.f();
            } else {
                LogUtil.j("AutoMearsureController", "message what is error");
            }
        }
    };
    private IDeviceEventHandler m = new IDeviceEventHandler() { // from class: drl.5
        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onScanFailed(int i) {
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onStateChanged(int i) {
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onDeviceFound(HealthDevice healthDevice) {
            String deviceName;
            if (healthDevice == null) {
                deviceName = "";
            } else {
                deviceName = healthDevice.getDeviceName();
            }
            LogUtil.a("AutoMearsureController", "Callback, onDeviceFound deviceName: ", deviceName);
            drl.this.i.sendEmptyMessage(1002);
        }
    };
    private drs n = new drs(this.m);
    private String h = g();

    private drl(Context context) {
        this.f32252a = new WeakReference<>(context);
    }

    public void d(IHealthDeviceCallback iHealthDeviceCallback) {
        this.e = (IHealthDeviceCallback) dym.d(iHealthDeviceCallback);
    }

    public void b() {
        this.e = null;
    }

    public static drl a(Context context) {
        if (f32251c == null) {
            f32251c = new drl(context);
        }
        return f32251c;
    }

    public void a(boolean z) {
        if (Utils.o()) {
            LogUtil.a("AutoMearsureController", "setUserVisibleHint isOversea");
            return;
        }
        LogUtil.a("AutoMearsureController", "setUserVisibleHint: ", Boolean.valueOf(z));
        this.l = z;
        if (z || !this.k) {
            return;
        }
        this.k = false;
        drw.e().e(g(), this.f);
        this.i.sendEmptyMessage(1003);
    }

    public void d() {
        if (Utils.o()) {
            LogUtil.a("AutoMearsureController", "onCreate isOversea");
            return;
        }
        LogUtil.a("AutoMearsureController", "onCreate");
        this.n.c();
        EventBus.b(this.f32253b, 2, "weight_measure_choose_user");
        LogUtil.a("AutoMearsureController", "onCreate End");
    }

    private String g() {
        String str = this.h;
        if (str != null) {
            LogUtil.a("AutoMearsureController", "getHonorWeight mHonorWeightId is not null, mHonorWeightId: ", str);
            if (this.j == null) {
                LogUtil.j("AutoMearsureController", "getHonorWeight device is null");
                this.j = drw.e().b(this.h);
            }
            ArrayList<ContentValues> arrayListC = dmp.d().c(this.h);
            if (!njy.e(arrayListC)) {
                this.f = arrayListC.get(0).getAsString("uniqueId");
            }
            return this.h;
        }
        for (String str2 : drw.e().d(d)) {
            if ("005A".equals(era.b(str2))) {
                LogUtil.a("AutoMearsureController", "getHonorWeight productId: ", str2);
                this.j = drw.e().b(str2);
                this.h = str2;
                ArrayList<ContentValues> arrayListC2 = dmp.d().c(str2);
                if (!njy.e(arrayListC2)) {
                    this.f = arrayListC2.get(0).getAsString("uniqueId");
                }
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        if (this.f32252a != null) {
            this.g = true;
            Intent intent = new Intent();
            intent.setPackage(BaseApplication.getAppPackage());
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.device.ui.DeviceMainActivity");
            intent.putExtra("kind", "HDK_WEIGHT");
            intent.putExtra("view", "AutoMeasureDevice");
            intent.putExtra("productId", g());
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", this.f);
            contentValues.put("productId", g());
            intent.putExtra("commonDeviceInfo", contentValues);
            if (bundle != null) {
                try {
                    intent.putExtra("HealthData", bundle.getSerializable("weight_data"));
                } catch (Exception unused) {
                    LogUtil.e("AutoMearsureController", " startActivity Exception");
                }
            }
            Context context = this.f32252a.get();
            if (context != null) {
                try {
                    context.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused2) {
                    LogUtil.e("AutoMearsureController", "startActivity ActivityNotFoundException occur.");
                    return;
                }
            }
            return;
        }
        h();
        LogUtil.j("AutoMearsureController", "context is null");
    }

    public void a() {
        if (Utils.o()) {
            LogUtil.a("AutoMearsureController", "onResume isOversea");
            return;
        }
        LogUtil.a("AutoMearsureController", BaseDialog.LIFE_CYCLE_ON_RESUME);
        this.o = true;
        if (this.g && this.k) {
            drw.e().e(g(), this.f);
        }
        this.i.sendEmptyMessage(1003);
        this.g = false;
        this.k = false;
    }

    public void c() {
        if (Utils.o()) {
            LogUtil.a("AutoMearsureController", "onPause isOversea");
            return;
        }
        LogUtil.a("AutoMearsureController", "onPause mIsGoToMeasureView: ", Boolean.valueOf(this.g));
        this.o = false;
        i();
        this.k = false;
        if (this.g) {
            return;
        }
        drw.e().e(g(), this.f);
    }

    public void e() {
        if (Utils.o()) {
            LogUtil.a("AutoMearsureController", "onDestroy isOversea");
            return;
        }
        LogUtil.a("AutoMearsureController", "onDestroy");
        i();
        this.n.b();
        this.n = null;
        EventBus.a(this.f32253b, "weight_measure_choose_user");
        this.i.removeCallbacksAndMessages(null);
        h();
    }

    private static void h() {
        f32251c = null;
    }

    private void i() {
        drs drsVar = this.n;
        if (drsVar != null) {
            drsVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.k || !this.o) {
            LogUtil.a("AutoMearsureController", "measureWeight mIsOnResume: ", Boolean.valueOf(this.o));
            return;
        }
        this.k = true;
        if (g() == null) {
            LogUtil.a("AutoMearsureController", "measureWeight no bonded honor device");
            this.k = false;
            i();
            return;
        }
        boolean z = this.l;
        if (!z) {
            LogUtil.a("AutoMearsureController", "isVisibleToUser: ", Boolean.valueOf(z));
            this.k = false;
            this.i.sendEmptyMessage(1003);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("isAutoMeasure", true);
        boolean zB = drw.e().b(g(), this.f, new IHealthDeviceCallback() { // from class: drl.3
            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
                drl.this.c(healthDevice, healthData);
            }

            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
                drl.this.b(healthDevice, list);
            }

            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
                drl.this.e(healthDevice, healthData);
            }

            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onStatusChanged(HealthDevice healthDevice, int i) {
                drl.this.c(healthDevice, i);
            }

            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onFailed(HealthDevice healthDevice, int i) {
                drl.this.e(healthDevice, i);
            }
        }, bundle);
        LogUtil.a("AutoMearsureController", "startMeasure isConnect: ", Boolean.valueOf(zB));
        if (zB) {
            return;
        }
        this.k = false;
        this.i.sendEmptyMessage(1003);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HealthDevice healthDevice, HealthData healthData) {
        LogUtil.a("AutoMearsureController", "startMeasure onDataChanged");
        IHealthDeviceCallback iHealthDeviceCallback = this.e;
        if (iHealthDeviceCallback != null) {
            iHealthDeviceCallback.onDataChanged(healthDevice, healthData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HealthDevice healthDevice, List<HealthData> list) {
        LogUtil.a("AutoMearsureController", "startMeasure callbackOnDataChanged");
        IHealthDeviceCallback iHealthDeviceCallback = this.e;
        if (iHealthDeviceCallback != null) {
            iHealthDeviceCallback.onDataChanged(healthDevice, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HealthDevice healthDevice, HealthData healthData) {
        LogUtil.a("AutoMearsureController", "startMeasure onProgressChanged");
        IHealthDeviceCallback iHealthDeviceCallback = this.e;
        if (iHealthDeviceCallback != null) {
            iHealthDeviceCallback.onProgressChanged(healthDevice, healthData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HealthDevice healthDevice, final int i) {
        LogUtil.a("AutoMearsureController", "startMeasure onStatusChanged status: ", Integer.valueOf(i));
        IHealthDeviceCallback iHealthDeviceCallback = this.e;
        if (iHealthDeviceCallback != null) {
            iHealthDeviceCallback.onStatusChanged(healthDevice, i);
        }
        this.i.post(new Runnable() { // from class: drl.1
            @Override // java.lang.Runnable
            public void run() {
                drl.this.a(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HealthDevice healthDevice, int i) {
        String deviceName;
        if (healthDevice == null) {
            deviceName = "";
        } else {
            deviceName = healthDevice.getDeviceName();
        }
        LogUtil.a("AutoMearsureController", "startMeasure onFailed deviceName: ", deviceName, " code: ", Integer.valueOf(i));
        IHealthDeviceCallback iHealthDeviceCallback = this.e;
        if (iHealthDeviceCallback != null) {
            iHealthDeviceCallback.onFailed(healthDevice, i);
        }
    }

    protected void a(int i) {
        LogUtil.a("AutoMearsureController", "handleStatusChanged status: ", Integer.valueOf(i));
        if (i == 2) {
            LogUtil.a("AutoMearsureController", "STATUS_CONNECTED");
        } else if (i == 3 || i == 5) {
            this.k = false;
            this.i.sendEmptyMessage(1003);
        } else {
            LogUtil.j("AutoMearsureController", "handleStatusChanged status is error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.n != null && this.o) {
            LogUtil.a("AutoMearsureController", "startScanner");
            this.n.b(g(), this.j);
        } else {
            LogUtil.j("AutoMearsureController", "mScanUtil is null");
        }
    }
}
