package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.health.device.callback.HeartRateDeviceSelectedCallback;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.model.MeasureResult;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.ui.AutoTestHeartRateService;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes7.dex */
public class drv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<IHealthDeviceCallback> f32276b = new ArrayList<>(16);
    private HashMap<String, b> d = new HashMap<>(16);

    protected drv() {
    }

    public String a(HealthDevice.HealthDeviceKind healthDeviceKind, IHealthDeviceCallback iHealthDeviceCallback, HeartRateDeviceSelectedCallback heartRateDeviceSelectedCallback, com.huawei.hihealth.device.open.IHealthDeviceCallback iHealthDeviceCallback2, MeasureResult.MeasureResultListener measureResultListener) {
        LogUtil.a("PluginDevice_HealthDataImporter", "startMeasureWithDeviceType");
        ArrayList<ContentValues> arrayListC = dmp.d().c(healthDeviceKind);
        b bVar = new b();
        bVar.a(arrayListC);
        bVar.b(iHealthDeviceCallback);
        bVar.c(heartRateDeviceSelectedCallback);
        bVar.a(iHealthDeviceCallback2);
        bVar.a(measureResultListener);
        dxw.c(bVar);
        return null;
    }

    public boolean e(String str, String str2, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        LogUtil.a("PluginDevice_HealthDataImporter", "startMeasure with productId two: ", str);
        return d(str, str2, iHealthDeviceCallback, bundle, false);
    }

    public boolean c(String str, String str2, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle, MeasurableDevice measurableDevice) {
        LogUtil.a("PluginDevice_HealthDataImporter", "startMeasure with productId four: ", str);
        if (measurableDevice != null) {
            try {
                if (!(measurableDevice instanceof eby)) {
                    b bVar = new b();
                    measurableDevice.setProductId(str);
                    bVar.a(measurableDevice);
                    bVar.b(iHealthDeviceCallback);
                    bVar.c(bundle);
                    bVar.d(str);
                    bVar.e(str2);
                    if (this.d.containsKey(str2)) {
                        this.d.remove(str2);
                    }
                    this.d.put(str2, bVar);
                    dxw.c(bVar);
                    return true;
                }
            } catch (RejectedExecutionException e) {
                LogUtil.e("PluginDevice_HealthDataImporter", "startMeasure e = ", e.getMessage());
                return false;
            }
        }
        LogUtil.j("PluginDevice_HealthDataImporter", "startMeasure: device is null or wifi device.");
        return false;
    }

    public boolean c(String str, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle, boolean z) {
        LogUtil.a("PluginDevice_HealthDataImporter", "startMeasureReconnect with productId: ", str, " isReconnect is ", Boolean.valueOf(z));
        try {
            MeasurableDevice measurableDeviceC = dmp.d().c(str, true);
            if (measurableDeviceC != null && !(measurableDeviceC instanceof eby)) {
                String uniqueId = measurableDeviceC.getUniqueId();
                b bVar = new b();
                bVar.a(measurableDeviceC);
                bVar.b(iHealthDeviceCallback);
                bVar.c(bundle);
                bVar.e(uniqueId);
                bVar.d(str);
                if (dxm.ab(str) && !z && bundle != null && bundle.getInt("type") == -1 && this.d.containsKey(uniqueId)) {
                    b(str, measurableDeviceC, iHealthDeviceCallback, bundle);
                    return true;
                }
                if (this.d.containsKey(uniqueId)) {
                    this.d.remove(uniqueId);
                }
                this.d.put(uniqueId, bVar);
                dxw.c(bVar);
                return true;
            }
            LogUtil.j("PluginDevice_HealthDataImporter", "startMeasureReconnect: device is null or wifi device.");
            return false;
        } catch (RejectedExecutionException e) {
            LogUtil.e("PluginDevice_HealthDataImporter", "startMeasureReconnect e = ", e.getMessage());
            return false;
        }
    }

    public boolean d(String str, String str2, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle, boolean z) {
        LogUtil.a("PluginDevice_HealthDataImporter", "startMeasureReconnect with productId: ", str, " isReconnect:", Boolean.valueOf(z), " isContain:", Boolean.valueOf(this.d.containsKey(str2)));
        return d(str, str2, z, iHealthDeviceCallback, bundle);
    }

    private boolean d(String str, String str2, boolean z, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        try {
            MeasurableDevice measurableDeviceB = dmp.d().b(str2, true);
            if (measurableDeviceB != null && !(measurableDeviceB instanceof eby)) {
                b bVar = new b();
                bVar.a(measurableDeviceB);
                bVar.b(iHealthDeviceCallback);
                bVar.c(bundle);
                bVar.d(str);
                bVar.e(str2);
                if (dxm.ab(str) && !z && bundle != null && bundle.getInt("type") == -1 && this.d.containsKey(str2)) {
                    b(str, measurableDeviceB, iHealthDeviceCallback, bundle);
                    return true;
                }
                if (this.d.containsKey(str2)) {
                    this.d.remove(str2);
                }
                this.d.put(str2, bVar);
                dxw.c(bVar);
                return true;
            }
            LogUtil.j("PluginDevice_HealthDataImporter", "startMeasureReconnect: device is null or wifi device.");
            return false;
        } catch (RejectedExecutionException e) {
            LogUtil.e("PluginDevice_HealthDataImporter", "startMeasureReconnect e = ", e.getMessage());
            return false;
        }
    }

    private void b(String str, MeasurableDevice measurableDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            return;
        }
        MeasureKit measureKitI = drw.e().i(elhVarD.q());
        MeasureController measureController = measureKitI != null ? measureKitI.getMeasureController() : null;
        if (measureController != null) {
            measureController.prepare(measurableDevice, iHealthDeviceCallback, bundle);
        }
    }

    public void a(String str, String str2) {
        d(str, str2, 0);
    }

    public void b(String str, int i) {
        e(str);
        if (i != -1) {
            MeasurableDevice measurableDeviceB = dmp.d().b(str);
            if (measurableDeviceB == null) {
                LogUtil.a("PluginDevice_HealthDataImporter", "stopMeasureBleScale device is null", str);
            } else {
                e(this.d.remove(measurableDeviceB.getUniqueId()));
            }
        }
    }

    public void d(String str, String str2, int i) {
        e(str);
        if (i != -1) {
            e(this.d.remove(str2));
        }
    }

    private void e(String str) {
        elh elhVarD;
        LogUtil.a("PluginDevice_HealthDataImporter", "stopMeasureBleScale:", str);
        if (!enq.d().c() || TextUtils.isEmpty(str) || (elhVarD = ResourceManager.c().d(str)) == null || elhVarD.m() != HealthDevice.HealthDeviceKind.HDK_HEART_RATE) {
            return;
        }
        dxw.d().stopService(new Intent(dxw.d(), (Class<?>) AutoTestHeartRateService.class));
    }

    private void e(b bVar) {
        if (bVar != null) {
            LogUtil.a("PluginDevice_HealthDataImporter", "stopMeasureBleScale director is not null");
            if (bVar.f32278b != null) {
                LogUtil.a("PluginDevice_HealthDataImporter", "stopMeasureBleScale, ending...");
                bVar.f32278b.ending();
            }
            dxw.a(bVar);
        }
    }

    public boolean b(String str, String str2, com.huawei.hihealth.device.open.IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        LogUtil.a("PluginDevice_HealthDataImporter", "startMeasureUniversal with productId: ", str);
        try {
            com.huawei.hihealth.device.open.HealthDevice healthDeviceE = dmp.d().e(str, str2);
            if (healthDeviceE == null) {
                LogUtil.j("PluginDevice_HealthDataImporter", "startMeasureUniversal deviceUniversal is null");
                return false;
            }
            b bVar = new b();
            bVar.c(bundle);
            bVar.d(str);
            bVar.e(str2);
            bVar.e(healthDeviceE);
            bVar.a(iHealthDeviceCallback);
            if (this.d.containsKey(str2)) {
                this.d.remove(str2);
            }
            this.d.put(str2, bVar);
            dxw.c(bVar);
            LogUtil.j("PluginDevice_HealthDataImporter", "startMeasureUniversal: execute");
            return true;
        } catch (RejectedExecutionException e) {
            LogUtil.e("PluginDevice_HealthDataImporter", "startMeasureUniversal e = ", e.getMessage());
            return false;
        }
    }

    public void c(String str, String str2) {
        LogUtil.a("PluginDevice_HealthDataImporter", "stopMeasureUniversal productId: ", str);
        if (dxm.aa(str)) {
            b bVar = this.d.get(str2);
            if (bVar != null) {
                LogUtil.a("PluginDevice_HealthDataImporter", "stopMeasureUniversal two director is not null");
                if (bVar.f32279c != null) {
                    LogUtil.a("PluginDevice_HealthDataImporter", "two stopMeasureUniversal, ending...");
                    bVar.f32279c.ending();
                    return;
                }
                return;
            }
            return;
        }
        c(this.d.remove(str2));
    }

    private void c(b bVar) {
        if (bVar != null) {
            LogUtil.a("PluginDevice_HealthDataImporter", "stopMeasureUniversal three director is not null");
            if (bVar.f32279c != null) {
                LogUtil.a("PluginDevice_HealthDataImporter", "three stopMeasureUniversal, ending...");
                bVar.f32279c.ending();
                bVar.f32279c.cleanup();
            }
            bVar.g = null;
        }
        dxw.a(bVar);
    }

    public void d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && dxm.aa(str)) {
            d(this.d.remove(str2));
        }
    }

    private void d(b bVar) {
        if (bVar != null) {
            LogUtil.a("PluginDevice_HealthDataImporter", "cleanupMeasureUniversal director is not null");
            if (bVar.f32279c != null) {
                LogUtil.a("PluginDevice_HealthDataImporter", "stopMeasureUniversal, cleanup...");
                bVar.f32279c.cleanup();
            }
            bVar.g = null;
        } else {
            com.huawei.hihealth.device.open.MeasureKit measureKitB = dnf.e().b("54C9739F-CA5C-4347-9F00-75B9DDF2C649");
            if (measureKitB == null) {
                return;
            }
            com.huawei.hihealth.device.open.MeasureController measureController = measureKitB.getMeasureController();
            if (measureController != null) {
                measureController.cleanup();
            }
        }
        dxw.a(bVar);
    }

    public boolean b(String str) {
        b bVar = this.d.get(str);
        return bVar != null && bVar.i;
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MeasurableDevice f32277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MeasureController f32278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.huawei.hihealth.device.open.MeasureController f32279c;
        private Bundle d;
        private ArrayList<ContentValues> f;
        private com.huawei.hihealth.device.open.IHealthDeviceCallback g;
        private IHealthDeviceCallback h;
        private boolean i = true;
        private com.huawei.hihealth.device.open.HealthDevice j;
        private String l;
        private HeartRateDeviceSelectedCallback m;
        private String n;
        private MeasureResult.MeasureResultListener o;

        b() {
        }

        void b(IHealthDeviceCallback iHealthDeviceCallback) {
            this.h = iHealthDeviceCallback;
        }

        void a(com.huawei.hihealth.device.open.IHealthDeviceCallback iHealthDeviceCallback) {
            this.g = iHealthDeviceCallback;
        }

        void a(MeasurableDevice measurableDevice) {
            this.f32277a = measurableDevice;
        }

        void e(com.huawei.hihealth.device.open.HealthDevice healthDevice) {
            this.j = healthDevice;
        }

        void c(Bundle bundle) {
            this.d = bundle;
        }

        void d(String str) {
            this.l = str;
        }

        void a(ArrayList<ContentValues> arrayList) {
            this.f = arrayList;
        }

        void c(HeartRateDeviceSelectedCallback heartRateDeviceSelectedCallback) {
            this.m = heartRateDeviceSelectedCallback;
        }

        void a(MeasureResult.MeasureResultListener measureResultListener) {
            this.o = measureResultListener;
        }

        void e(String str) {
            this.n = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<ContentValues> arrayList = this.f;
            if (arrayList == null) {
                e(30, this.d);
                this.i = false;
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.l = this.f.get(size).getAsString("productId");
                this.n = this.f.get(size).getAsString("uniqueId");
                if (drw.e().h(this.l)) {
                    this.j = dmp.d().e(this.l, this.n);
                    this.h = null;
                    this.d = dxm.a();
                } else {
                    MeasurableDevice measurableDeviceB = dmp.d().b(this.n, true);
                    this.f32277a = measurableDeviceB;
                    if (measurableDeviceB != null) {
                        LogUtil.a("PluginDevice_HealthDataImporter", "run current device is ", measurableDeviceB.getDeviceName());
                    }
                }
                if (this.f32277a == null && this.j == null) {
                    LogUtil.j("PluginDevice_HealthDataImporter", "run mDevice is null");
                    return;
                }
                LogUtil.a("PluginDevice_HealthDataImporter", "run current productId is ", this.l);
                if (!(this.f32277a instanceof dmt) && e(30, this.d)) {
                    c();
                    return;
                }
            }
        }

        private void c() {
            if (drv.this.d.containsKey(this.n)) {
                drv.this.d.remove(this.n);
            }
            LogUtil.a("PluginDevice_HealthDataImporter", "doStartMeasureSelectDevice true");
            HashMap map = new HashMap(16);
            map.put("click", "1");
            if (drw.e().h(this.l)) {
                com.huawei.hihealth.device.open.HealthDevice healthDevice = this.j;
                if (healthDevice != null) {
                    map.put("macAddress", erh.d(healthDevice.getAddress()));
                }
            } else {
                MeasurableDevice measurableDevice = this.f32277a;
                if (measurableDevice != null) {
                    map.put("macAddress", erh.d(measurableDevice.getAddress()));
                }
            }
            elh elhVarD = ResourceManager.c().d(this.l);
            map.put("device_name", etn.c(this.l, elhVarD.l().d()));
            map.put(DeviceCategoryFragment.DEVICE_TYPE, elhVarD.m().name());
            map.put("prodId", era.b(this.l));
            lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_HEART_RATE_MEASURE_SUCCEED_2060016.value(), map, 0);
            drv.this.d.put(this.n, this);
            MeasureResult.MeasureResultListener measureResultListener = this.o;
            if (measureResultListener != null) {
                measureResultListener.onMeasureDevice(this.l, this.n, false);
            }
            LogUtil.a("PluginDevice_HealthDataImporter", "doStartMeasureSelectDevice target productId is ", this.l);
        }

        private boolean e(int i, Bundle bundle) {
            ReleaseLogUtil.d("R_Weight_PluginDevice_HealthDataImporter", "startMeasureSelectedDevice mHealthCallback:", this.h, ",mHealthCallbackUniversal:", this.g);
            if (this.h != null) {
                return c(i, bundle);
            }
            if (this.g != null) {
                return a(i, bundle);
            }
            return false;
        }

        private void e(MeasureController measureController) {
            if (measureController != null) {
                LogUtil.a("PluginDevice_HealthDataImporter", "showLogMessage current device use background measure");
            } else {
                LogUtil.a("PluginDevice_HealthDataImporter", "showLogMessage current device use direct measure");
            }
        }

        private void e(com.huawei.hihealth.device.open.MeasureController measureController) {
            if (measureController != null) {
                LogUtil.a("PluginDevice_HealthDataImporter", "showLogMessageUniversal current device use background measure");
            } else {
                LogUtil.a("PluginDevice_HealthDataImporter", "showLogMessageUniversal current device use direct measure");
            }
        }

        private boolean c(int i, Bundle bundle) {
            ReleaseLogUtil.d("R_Weight_PluginDevice_HealthDataImporter", "enter prepareDevice");
            dnf dnfVarE = dnf.e();
            LogUtil.a("PluginDevice_HealthDataImporter", "prepareDevice measure with ", this.f32277a.getDeviceName(), " kitUuid = ", this.f32277a.getMeasureKitUuid());
            MeasureKit measureKitA = dnfVarE.a(this.f32277a.getMeasureKitUuid());
            elh elhVarD = ResourceManager.c().d(this.l);
            int iC = (elhVarD == null || elhVarD.v() == null) ? 1 : elhVarD.v().c();
            if (iC == 2 || iC == 1) {
                if (elhVarD != null && elhVarD.m() == HealthDevice.HealthDeviceKind.HDK_HEART_RATE) {
                    LogUtil.a("PluginDevice_HealthDataImporter", "prepareDevice current device is heart rate device");
                } else {
                    if (BluetoothAdapter.getDefaultAdapter().getState() == 10) {
                        LogUtil.j("PluginDevice_HealthDataImporter", "bluetooth state is off");
                        this.h.onFailed(this.f32277a, 3);
                        return false;
                    }
                    LogUtil.a("PluginDevice_HealthDataImporter", "prepareDevice other device");
                }
            }
            if (measureKitA == null) {
                this.h.onFailed(this.f32277a, 0);
                LogUtil.j("PluginDevice_HealthDataImporter", "prepareDevice no measure kit for ", this.f32277a.getDeviceName());
                return false;
            }
            if (enq.d().c()) {
                e();
            } else {
                LogUtil.a("PluginDevice_HealthDataImporter", "prepareDevice uuid:", measureKitA.getUuid(), " name:", measureKitA.getClass().getSimpleName());
                MeasureController measureController = measureKitA.getMeasureController();
                this.f32278b = measureController;
                if (measureController != null) {
                    return b(measureKitA, i, bundle);
                }
            }
            return false;
        }

        private boolean b(MeasureKit measureKit, int i, Bundle bundle) {
            ReleaseLogUtil.d("R_Weight_PluginDevice_HealthDataImporter", "doMeasureController current controller is ", this.f32278b.getClass().getSimpleName());
            this.f32278b.prepare(this.f32277a, this.h, this.d);
            ReleaseLogUtil.d("R_Weight_PluginDevice_HealthDataImporter", "doMeasureController current controller is 1");
            MeasureController backgroundController = measureKit.getBackgroundController();
            if (dxm.aa(this.l)) {
                backgroundController = null;
            }
            boolean z = bundle != null ? bundle.getBoolean("isBackgroundMeasure", false) : false;
            ReleaseLogUtil.d("R_Weight_PluginDevice_HealthDataImporter", "doMeasureController current controller is flag = ", Boolean.valueOf(z));
            if (backgroundController != null && !z) {
                ReleaseLogUtil.d("R_Weight_PluginDevice_HealthDataImporter", "doMeasureController current device support background measure but use direct measure");
                drw.e().d(this.l, this.n, "com.huawei.health.action.DEVICE_OCCUPIED");
                return e(i);
            }
            e(backgroundController);
            return e(i);
        }

        private void e() {
            elh elhVarD = ResourceManager.c().d(this.l);
            if (elhVarD == null) {
                LogUtil.j("PluginDevice_HealthDataImporter", "doThreeDeviceVersion productInfo is null");
                return;
            }
            HealthDevice.HealthDeviceKind healthDeviceKindM = elhVarD.m();
            if (healthDeviceKindM == HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE) {
                this.h.onDataChanged(enq.d().b(this.l), enq.d().e(this.l));
            } else if (healthDeviceKindM == HealthDevice.HealthDeviceKind.HDK_WEIGHT) {
                this.h.onDataChanged(enq.d().b(this.l), enq.d().a(this.l));
            } else {
                if (healthDeviceKindM != HealthDevice.HealthDeviceKind.HDK_HEART_RATE) {
                    LogUtil.a("PluginDevice_HealthDataImporter", "doThreeDeviceVersion other kind = ", healthDeviceKindM);
                    return;
                }
                Intent intent = new Intent(dxw.d(), (Class<?>) AutoTestHeartRateService.class);
                intent.putExtra("productId", this.l);
                dxw.d().startService(intent);
            }
        }

        private boolean a(int i, Bundle bundle) {
            dnf dnfVarE = dnf.e();
            elh elhVarD = ResourceManager.c().d(this.l);
            if (elhVarD == null) {
                return false;
            }
            LogUtil.a("PluginDevice_HealthDataImporter", "prepareDeviceUniversal start to measure mDeviceUniversal with productInfo:", elhVarD.q(), ",kitManager:", dnfVarE);
            dnfVarE.b(elhVarD.q(), ResourceManager.c().a(this.l) + File.separator + elhVarD.o());
            com.huawei.hihealth.device.open.MeasureKit measureKitB = dnfVarE.b(elhVarD.q());
            if (measureKitB == null) {
                com.huawei.hihealth.device.open.IHealthDeviceCallback iHealthDeviceCallback = this.g;
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onFailed(this.j, 0);
                }
                com.huawei.hihealth.device.open.HealthDevice healthDevice = this.j;
                if (healthDevice != null) {
                    LogUtil.a("PluginDevice_HealthDataImporter", "prepareDeviceUniversal no measure kit for ", healthDevice.getDeviceName());
                } else {
                    LogUtil.j("PluginDevice_HealthDataImporter", "prepareDeviceUniversal no measure kit, mDeviceUniversal is null");
                }
                return false;
            }
            LogUtil.a("PluginDevice_HealthDataImporter", "prepareDeviceUniversal uuid:", measureKitB.getUuid(), " name:", measureKitB.getClass().getSimpleName());
            com.huawei.hihealth.device.open.MeasureController measureController = measureKitB.getMeasureController();
            this.f32279c = measureController;
            if (measureController != null) {
                return e(measureKitB, i, bundle);
            }
            return false;
        }

        private boolean e(com.huawei.hihealth.device.open.MeasureKit measureKit, int i, Bundle bundle) {
            LogUtil.a("PluginDevice_HealthDataImporter", "doPrepareWithDeviceKit current controllerUniversal is ", this.f32279c.getClass().getSimpleName());
            com.huawei.hihealth.device.open.IHealthDeviceCallback iHealthDeviceCallback = this.g;
            if (iHealthDeviceCallback != null) {
                this.f32279c.prepare(this.j, iHealthDeviceCallback, this.d);
            }
            LogUtil.a("PluginDevice_HealthDataImporter", "doPrepareWithDeviceKit current controller is 1");
            com.huawei.hihealth.device.open.MeasureController backgroundController = measureKit.getBackgroundController();
            if (dxm.aa(this.l)) {
                backgroundController = null;
            }
            boolean z = bundle != null ? bundle.getBoolean("isBackgroundMeasure", false) : false;
            LogUtil.a("PluginDevice_HealthDataImporter", "doPrepareWithDeviceKit current controller is flag = ", Boolean.valueOf(z));
            if (backgroundController != null && !z) {
                LogUtil.a("PluginDevice_HealthDataImporter", "doPrepareWithDeviceKit current device support background measure but use direct measure");
                drw.e().a(this.l, this.n, "com.huawei.health.action.DEVICE_OCCUPIED");
                return e(i);
            }
            e(backgroundController);
            return e(i);
        }

        private boolean e(int i) {
            if (this.h != null) {
                ReleaseLogUtil.d("R_Weight_PluginDevice_HealthDataImporter", "connectTargetDevice Try to connect ", this.f32277a.getDeviceName());
                dyg.a(true, "PluginDevice_HealthDataImporter", "connectTargetDevice device:", this.f32277a.getAddress());
                this.h.onStatusChanged(this.f32277a, 1);
                MeasureController measureController = this.f32278b;
                if (!(measureController instanceof doq) || ((doq) measureController).l() != 2) {
                    this.f32278b.updateState(1);
                }
                if (dxm.aq(this.l)) {
                    return b();
                }
                if (!d(i)) {
                    return false;
                }
                if (!dxm.ag(this.l)) {
                    this.h.onStatusChanged(this.f32277a, 2);
                }
                this.f32278b.start();
                return true;
            }
            if (this.g == null) {
                return false;
            }
            LogUtil.a("PluginDevice_HealthDataImporter", "connectTargetDevice Try to connect ", this.j.getDeviceName());
            LogUtil.d("PluginDevice_HealthDataImporter", "connectTargetDevice Try to connect address:", BTDeviceMgrUtil.c().e(this.j.getAddress()));
            this.f32279c.start();
            return true;
        }

        private boolean b() {
            if (TextUtils.isEmpty(this.n)) {
                LogUtil.j("PluginDevice_HealthDataImporter", "connectDeviceByUds : UniqueId is null");
                return false;
            }
            drc.b().a(dxx.d().b(this.n), ConnectMode.SIMPLE);
            return true;
        }

        private boolean d(int i) {
            ReleaseLogUtil.d("R_Weight_PluginDevice_HealthDataImporter", "enter isConnectSyncSuccess");
            if (this.f32277a.connectSync(i)) {
                return true;
            }
            this.h.onStatusChanged(this.f32277a, 5);
            this.f32278b.updateState(5);
            drw.e().d(this.l, this.n, "com.huawei.health.action.DEVICE_AVAILABLE");
            LogUtil.j("PluginDevice_HealthDataImporter", "connectTargetDevice Fail to connect, ending, mDevice:", Integer.valueOf(System.identityHashCode(this.f32277a)));
            this.f32278b.ending();
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                LogUtil.e("PluginDevice_HealthDataImporter", "connectTargetDevice e = ", e.getMessage());
            }
            LogUtil.j("PluginDevice_HealthDataImporter", "connectTargetDevice Fail to connect, cleanup");
            this.f32278b.cleanup();
            return false;
        }
    }
}
