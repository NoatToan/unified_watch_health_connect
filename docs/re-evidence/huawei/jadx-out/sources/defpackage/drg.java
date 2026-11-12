package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.versionedparcelable.VersionedParcel;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.HexUtils;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;
import com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback;
import com.huawei.health.device.kit.wsp.task.ITaskService;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.ecologydevice.callback.ConnectStatusCallback;
import com.huawei.health.ecologydevice.callback.DataChangedCallback;
import com.huawei.health.ecologydevice.open.GattMeasureController;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public class drg extends GattMeasureController implements ITaskService, ConnectStatusCallback, DataChangedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static drg f32237a;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IHealthDeviceCallback f32239c;
    private BluetoothGatt e;
    private Bundle h;
    private final c p;
    private String r;
    private dso t;
    private int u;
    private String v;
    private IAsynBleTaskCallback y;
    private float k = 173.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32238b = 29;
    private int w = 1;
    private boolean o = false;
    private boolean q = false;
    private boolean n = false;
    private HandlerThread i = new HandlerThread("PluginDevice_WspMeasureController");
    private boolean m = false;
    private boolean s = false;
    private boolean l = false;
    private EventBus.ICallback f = new EventBus.ICallback() { // from class: drg.5
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            if ("weight_measure_set_user".equals(dVar.e())) {
                drg.this.c(dVar.b());
            }
        }
    };
    private BluetoothGattCallback j = new BluetoothGattCallback() { // from class: drg.3
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            drg.this.d(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            LogUtil.a("PluginDevice_WspMeasureController", "onServicesDiscovered status:", Integer.valueOf(i));
            if (i == 0) {
                drg.this.e = bluetoothGatt;
                if (drg.this.f32239c != null) {
                    drg.this.f32239c.onStatusChanged(drg.this.mDevice, 2);
                }
                drg.this.aa.w();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            drg.this.c(bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            if (bluetoothGattCharacteristic == null || bluetoothGattCharacteristic.getUuid() == null) {
                return;
            }
            cmm cmmVar = new cmm();
            cmmVar.a(bluetoothGattCharacteristic.getValue());
            cmmVar.c(bluetoothGattCharacteristic.getUuid().toString());
            drg.this.e(cmmVar);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            LogUtil.a("PluginDevice_WspMeasureController", " onDescriptorWrite status:", Integer.valueOf(i), " descriptor:", bluetoothGattDescriptor.getCharacteristic().getUuid().toString());
            if (drg.this.y == null) {
                return;
            }
            if (i == 0) {
                drg.this.y.success(null);
            } else {
                drg.this.y.failed();
            }
        }
    };
    private drn g = new drn();
    private BleTaskQueueUtil x = new BleTaskQueueUtil(this);
    private final dpc aa = new dpc(this.x);

    @Override // com.huawei.health.device.kit.wsp.task.ITaskService
    public void disable(dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback) {
    }

    @Override // com.huawei.health.device.open.MeasureController
    public boolean start() {
        return true;
    }

    private drg() {
        this.i.start();
        this.p = new c(this.i.getLooper());
    }

    public static drg d() {
        drg drgVar;
        synchronized (d) {
            if (f32237a == null) {
                f32237a = new drg();
            }
            drgVar = f32237a;
        }
        return drgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        String string = bluetoothGattCharacteristic.getUuid().toString();
        ReleaseLogUtil.d("R_PluginDevice_WspMeasureController", " doCharacteristicWrite status:", Integer.valueOf(i));
        IAsynBleTaskCallback iAsynBleTaskCallback = this.y;
        if (iAsynBleTaskCallback == null) {
            return;
        }
        if (i == 0) {
            iAsynBleTaskCallback.success(null);
            if (dmz.i.toString().equalsIgnoreCase(string)) {
                if (this.u == -2) {
                    e();
                    return;
                } else {
                    this.aa.j();
                    this.aa.d();
                    return;
                }
            }
            return;
        }
        iAsynBleTaskCallback.failed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(cmm cmmVar) {
        LogUtil.a("PluginDevice_WspMeasureController", "Device-->SDK:", HexUtils.c(cmmVar.d()), " tag :", cmmVar.b());
        UUID uuidFromString = UUID.fromString(cmmVar.b());
        if (dmz.f32037b.equals(uuidFromString)) {
            b(cmmVar);
            return;
        }
        if (dmz.l.equals(uuidFromString)) {
            a(cmmVar);
            return;
        }
        if (dmz.m.equals(uuidFromString)) {
            dok dokVarB = dog.b(cmmVar.d());
            LogUtil.a("PluginDevice_WspMeasureController", " doCharacteristicChanged parseResult for private protocol read ", Integer.valueOf(dokVarB.a()));
            if (dokVarB.a() == 3) {
                ReleaseLogUtil.d("R_PluginDevice_WspMeasureController", " doCharacteristicChanged clean user data success ");
                this.q = true;
                this.p.removeMessages(1);
                dxm.m();
                cleanup();
                ending();
                return;
            }
            return;
        }
        ReleaseLogUtil.e("R_PluginDevice_WspMeasureController", "doCharacteristicChanged uuid == unknown");
    }

    private void a(cmm cmmVar) {
        dso dsoVar = new dso();
        this.t = dsoVar;
        dsoVar.setEndTime(System.currentTimeMillis());
        if (this.g == null) {
            this.g = new drn();
        }
        HealthData healthDataB = this.g.b(cmmVar.d());
        if (healthDataB instanceof dso) {
            dso dsoVar2 = (dso) healthDataB;
            if (this.t.getEndTime() == dsoVar2.getEndTime()) {
                if (dsoVar2.getWeight() == 0.0f || dsoVar2.getBodyFatRat() != 0.0f) {
                    return;
                }
                d(dsoVar2);
                return;
            }
            this.t.setWeight(dsoVar2.getWeight());
            this.t.setEndTime(dsoVar2.getEndTime());
            this.t.setStartTime(dsoVar2.getStartTime());
            this.n = true;
            ReleaseLogUtil.d("R_PluginDevice_WspMeasureController", "doWeightMeasure weight is not null");
            d(dsoVar2);
            this.l = false;
        }
    }

    private void d(dso dsoVar) {
        if (this.m) {
            ReleaseLogUtil.d("R_PluginDevice_WspMeasureController", "sendUserInfoMsg send weight auto measure to AutoMeasureController");
            Bundle bundle = new Bundle();
            bundle.putSerializable("weight_data", dsoVar);
            EventBus.a(new EventBus.d("weight_measure_choose_user", bundle));
            return;
        }
        if (this.h != null) {
            ReleaseLogUtil.d("R_PluginDevice_WspMeasureController", "sendUserInfoMsg mBundle != null");
            c(this.h);
        }
    }

    private void b(cmm cmmVar) {
        if (this.g == null) {
            this.g = new drn();
        }
        if (this.t == null) {
            dso dsoVar = new dso();
            this.t = dsoVar;
            dsoVar.setEndTime(System.currentTimeMillis());
        }
        HealthData data = this.g.parseData(cmmVar.d());
        if (data instanceof dso) {
            dso dsoVar2 = (dso) data;
            float bodyFatRat = dsoVar2.getBodyFatRat();
            if (this.n) {
                ReleaseLogUtil.d("R_PluginDevice_WspMeasureController", "doBodyCompositionMeasure parseData is null");
                this.n = false;
                this.t.setBodyFatRat(bodyFatRat);
                if (this.f32239c != null) {
                    h();
                    this.f32239c.onDataChanged(this.mDevice, this.t);
                    c();
                }
            }
            if (this.n && this.t.getEndTime() == dsoVar2.getEndTime()) {
                this.n = false;
                this.t.setBodyFatRat(dsoVar2.getBodyFatRat());
                LogUtil.a("PluginDevice_WspMeasureController", "doBodyCompositionMeasure weight = ", Float.valueOf(this.t.getWeight()), " bodyFatRat = ", Float.valueOf(this.t.getBodyFatRat()));
                if (this.f32239c != null) {
                    h();
                    this.f32239c.onDataChanged(this.mDevice, this.t);
                    c();
                }
            }
        }
    }

    private void h() {
        if (this.t == null) {
            return;
        }
        if (!Utils.h()) {
            SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("weightUser", 0);
            if (sharedPreferences != null) {
                this.t.a(sharedPreferences.getString("weightUser_id", ""));
                return;
            }
            return;
        }
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser != null) {
            String strI = currentUser.i();
            LogUtil.d("PluginDevice_WspMeasureController", "setUserIdForData userId = ", strI);
            this.t.a(strI);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothGatt bluetoothGatt, int i, int i2) {
        BluetoothGatt bluetoothGatt2;
        ReleaseLogUtil.d("R_PluginDevice_WspMeasureController", "doConnectionStateChange status:", Integer.valueOf(i), " newState:", Integer.valueOf(i2));
        try {
            if (i2 == 2) {
                this.q = false;
                bluetoothGatt.discoverServices();
                IHealthDeviceCallback iHealthDeviceCallback = this.f32239c;
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onStatusChanged(this.mDevice, 2);
                }
                this.l = true;
                return;
            }
            if (i2 != 0) {
                LogUtil.j("PluginDevice_WspMeasureController", "doConnectionStateChange newState == unknown");
                return;
            }
            IHealthDeviceCallback iHealthDeviceCallback2 = this.f32239c;
            if (iHealthDeviceCallback2 != null) {
                iHealthDeviceCallback2.onStatusChanged(this.mDevice, 3);
            }
            if (this.l && (bluetoothGatt2 = this.e) != null) {
                bluetoothGatt2.connect();
                LogUtil.d("PluginDevice_WspMeasureController", "Trying to reconnect to ble device ...");
            } else {
                this.l = false;
                cleanup();
            }
        } catch (SecurityException e) {
            LogUtil.e("PluginDevice_WspMeasureController", "doConnectionStateChange SecurityException:", ExceptionUtils.c(e));
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnected(int i, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("R_PluginDevice_WspMeasureController", "doDeviceConnected by uds and status = ", Integer.valueOf(i));
        if (deviceInfo == null) {
            LogUtil.j("PluginDevice_WspMeasureController", "deviceInfo == null");
            return;
        }
        this.q = false;
        this.o = true;
        this.v = deviceInfo.getDeviceMac();
        IHealthDeviceCallback iHealthDeviceCallback = this.f32239c;
        if (iHealthDeviceCallback != null) {
            iHealthDeviceCallback.onStatusChanged(this.mDevice, 2);
        }
        this.aa.w();
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceDisconnect(int i) {
        ReleaseLogUtil.d("R_PluginDevice_WspMeasureController", "doDeviceDisconnect by uds and status = ", Integer.valueOf(i));
        this.o = false;
        IHealthDeviceCallback iHealthDeviceCallback = this.f32239c;
        if (iHealthDeviceCallback != null) {
            iHealthDeviceCallback.onStatusChanged(this.mDevice, 3);
        }
        cleanup();
    }

    @Override // com.huawei.health.ecologydevice.callback.ConnectStatusCallback
    public void doDeviceConnecting(int i) {
        LogUtil.a("PluginDevice_WspMeasureController", "doDeviceConnecting by uds and status = ", Integer.valueOf(i));
    }

    @Override // com.huawei.health.ecologydevice.callback.DataChangedCallback
    public void onDataChanged(cmm cmmVar) {
        LogUtil.a("PluginDevice_WspMeasureController", "onDataChanged by uds");
        if (cmmVar == null) {
            LogUtil.j("PluginDevice_WspMeasureController", "dataFrame == null");
            return;
        }
        String strB = cmmVar.b();
        if (dmz.f32037b.toString().equalsIgnoreCase(strB) || dmz.l.toString().equalsIgnoreCase(strB) || dmz.m.toString().equalsIgnoreCase(strB)) {
            c(cmmVar);
            e(cmmVar);
        } else if (b(strB)) {
            d(cmmVar);
        } else {
            LogUtil.j("PluginDevice_WspMeasureController", "not have this uuid");
        }
    }

    private boolean b(String str) {
        return (dmz.i.toString().equalsIgnoreCase(str) || dmz.n.toString().equalsIgnoreCase(str)) || (dmz.d.toString().equalsIgnoreCase(str) || dmz.f.toString().equalsIgnoreCase(str)) || dmz.g.toString().equalsIgnoreCase(str);
    }

    private void c(cmm cmmVar) {
        LogUtil.a("PluginDevice_WspMeasureController", "onDescriptorWriteByUds characterUuid->", cmmVar.b());
        IAsynBleTaskCallback iAsynBleTaskCallback = this.y;
        if (iAsynBleTaskCallback == null) {
            LogUtil.j("PluginDevice_WspMeasureController", "mTaskCallback == null");
        } else if (this.o) {
            iAsynBleTaskCallback.success(null);
        } else {
            iAsynBleTaskCallback.failed();
        }
    }

    private void d(cmm cmmVar) {
        IAsynBleTaskCallback iAsynBleTaskCallback = this.y;
        if (iAsynBleTaskCallback == null) {
            LogUtil.j("PluginDevice_WspMeasureController", "mTaskCallback == null");
            return;
        }
        if (this.o) {
            iAsynBleTaskCallback.success(null);
            if (dmz.i.toString().equalsIgnoreCase(cmmVar.b())) {
                if (this.u == -2) {
                    e();
                    return;
                } else {
                    this.aa.j();
                    this.aa.d();
                    return;
                }
            }
            return;
        }
        LogUtil.j("PluginDevice_WspMeasureController", "not connected");
        this.y.failed();
    }

    class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            LogUtil.a("PluginDevice_WspMeasureController", " handleMessage clean user data fail");
            drg.this.b();
            EventBus.a(drg.this.f, "weight_measure_set_user");
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        this.t = null;
        EventBus.b(this.f, 0, "weight_measure_set_user");
        boolean zF = dxx.d().f();
        this.s = zF;
        if (zF) {
            this.r = UUID.randomUUID().toString();
            drg drgVarD = d();
            String name = drg.class.getName();
            dxx.d().c(name, drgVarD);
            emk.c().d(this.r, new eff(name));
            emk.c().c(this.r, new efd(name, this.x));
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a(countDownLatch);
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            LogUtil.e("PluginDevice_WspMeasureController", "WspMeasureController prepare:", e.getMessage());
        }
        if (!super.prepare(healthDevice, iHealthDeviceCallback, bundle)) {
            return false;
        }
        this.f32239c = iHealthDeviceCallback;
        if (bundle != null) {
            this.m = bundle.getBoolean("isAutoMeasure", false);
            this.h = bundle;
            this.u = bundle.getInt("type");
        } else {
            this.k = etn.e((int) this.k);
            this.w = etn.a(this.w);
            this.f32238b = etn.d(this.f32238b);
            this.h = new Bundle();
            g();
        }
        dog.a(this.mDevice.getAddress());
        LogUtil.a("PluginDevice_WspMeasureController", "WspMeasureController prepare info:", Boolean.valueOf(this.k <= 0.0f), Boolean.valueOf(this.w == 1), Boolean.valueOf(this.f32238b == 29));
        return true;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void cleanup() {
        ReleaseLogUtil.d("R_PluginDevice_WspMeasureController", "Enter cleanup...");
        dso dsoVar = this.t;
        if (dsoVar != null) {
            boolean z = dsoVar.getBodyFatRat() == 0.0f || dxm.c();
            if (this.u == -2 || z) {
                if (this.q) {
                    b();
                    return;
                }
                return;
            }
            b();
            return;
        }
        b();
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public void ending() {
        ReleaseLogUtil.d("R_PluginDevice_WspMeasureController", "Enter ending...");
        this.l = false;
        dso dsoVar = this.t;
        if (dsoVar != null) {
            boolean z = dsoVar.getBodyFatRat() == 0.0f || dxm.c();
            if (this.u == -2 || z) {
                if (this.q) {
                    a();
                    return;
                }
                return;
            }
            a();
            return;
        }
        a();
    }

    private void g() {
        this.h.putInt("height", (int) this.k);
        this.h.putInt("sex", this.w);
        this.h.putInt("age", this.f32238b);
    }

    private void a() {
        synchronized (d) {
            if (this.e != null) {
                LogUtil.a("PluginDevice_WspMeasureController", "end mBluetoothGatt is not null");
                try {
                    this.e.disconnect();
                } catch (SecurityException e) {
                    LogUtil.e("PluginDevice_WspMeasureController", "end SecurityException:", ExceptionUtils.c(e));
                }
            }
        }
        if (this.s) {
            emk.c().a();
        }
        EventBus.a(this.f, "weight_measure_set_user");
        super.ending();
    }

    private void a(final CountDownLatch countDownLatch) {
        HiHealthManager.d(dxw.d()).fetchUserData(new HiCommonListener() { // from class: drg.1
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (obj == null) {
                    countDownLatch.countDown();
                    return;
                }
                dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
                if (currentUser != null) {
                    drg.this.k = currentUser.e();
                    drg.this.w = currentUser.d();
                    drg.this.f32238b = currentUser.c();
                } else if (!(obj instanceof List)) {
                    LogUtil.j("PluginDevice_WspMeasureController", "fetchUserData other data");
                } else {
                    for (Object obj2 : (List) obj) {
                        if (obj2 instanceof HiUserInfo) {
                            HiUserInfo hiUserInfo = (HiUserInfo) obj2;
                            if (hiUserInfo.getRelateType() == 0) {
                                drg.this.k = hiUserInfo.getHeight();
                                drg.this.w = hiUserInfo.getGender();
                                drg.this.f32238b = hiUserInfo.getAge();
                                break;
                            }
                        }
                    }
                }
                LogUtil.a("PluginDevice_WspMeasureController", "WspMeasureController fetchUserData info:", Boolean.valueOf(drg.this.k > 0.0f), Boolean.valueOf(drg.this.w == 1), Boolean.valueOf(drg.this.f32238b == 29));
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j("PluginDevice_WspMeasureController", "ChipSeaMeasureController onFailure");
            }
        });
    }

    private void c() {
        dso dsoVar = this.t;
        if (dsoVar != null) {
            float bodyFatRat = dsoVar.getBodyFatRat();
            LogUtil.d("PluginDevice_WspMeasureController", "sendClearData fatValue = ", Float.valueOf(bodyFatRat));
            if (bodyFatRat == 0.0f || dxm.c()) {
                e();
            }
        }
    }

    private void e() {
        this.p.removeMessages(1);
        this.p.sendEmptyMessageDelayed(1, 2000L);
        this.x.a();
        if (this.e == null) {
            LogUtil.j("PluginDevice_WspMeasureController", "cleanUserData mBluetoothGatt is null");
            return;
        }
        LogUtil.a("PluginDevice_WspMeasureController", "cleanUserData clear user info. begin");
        this.aa.c();
        this.aa.k();
        LogUtil.a("PluginDevice_WspMeasureController", "cleanUserData clear user info. end");
    }

    private void d(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
            LogUtil.e("PluginDevice_WspMeasureController", "sleep delay interrupted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        synchronized (d) {
            BluetoothGatt bluetoothGatt = this.e;
            if (bluetoothGatt != null) {
                try {
                    bluetoothGatt.disconnect();
                    d(100L);
                    this.e.close();
                } catch (SecurityException e) {
                    LogUtil.e("PluginDevice_WspMeasureController", "closeEnding SecurityException:", ExceptionUtils.c(e));
                }
                this.e = null;
            }
        }
        this.x.a();
        this.g = null;
        this.h = null;
        EventBus.a(this.f, "weight_measure_set_user");
        if (this.s) {
            emk.c().a();
            emk.c().b(this.r);
            emk.c().a(this.r);
            dxx.d().a();
        }
        ending();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j("PluginDevice_WspMeasureController", "bundle == null");
            return;
        }
        if (this.e == null && !this.s) {
            LogUtil.j("PluginDevice_WspMeasureController", "mBluetoothGatt == null && !mIsUniformDeviceManagementFlag");
            return;
        }
        try {
            int i = bundle.getInt("height");
            int i2 = bundle.getInt("sex");
            this.aa.e((byte) bundle.getInt("age"), (byte) ((i2 == 1 || i2 == 2) ? 0 : 1), (byte) i);
        } catch (VersionedParcel.ParcelException unused) {
            LogUtil.e("PluginDevice_WspMeasureController", "sendUserInfo Exception");
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController
    public BluetoothGattCallback getGattCallbackImpl() {
        return this.j;
    }

    private boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        BluetoothGatt bluetoothGatt = this.e;
        boolean zWriteDescriptor = false;
        if (bluetoothGatt == null) {
            LogUtil.j("PluginDevice_WspMeasureController", "enableCharacteristicNotification mBluetoothGatt is null");
            return false;
        }
        try {
            bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(dmz.k);
            if (descriptor != null) {
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                zWriteDescriptor = bluetoothGatt.writeDescriptor(descriptor);
            }
        } catch (SecurityException unused) {
            LogUtil.j("PluginDevice_WspMeasureController", "enableCharacteristicNotification SecurityException");
        }
        LogUtil.a("PluginDevice_WspMeasureController", "enableCharacteristicNotification isWriteSuccess = ", Boolean.valueOf(zWriteDescriptor));
        return zWriteDescriptor;
    }

    private boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (this.e == null) {
            LogUtil.j("PluginDevice_WspMeasureController", "writeCharacteristic mBluetoothGatt is null ");
            return false;
        }
        if (bluetoothGattCharacteristic == null) {
            LogUtil.j("PluginDevice_WspMeasureController", "writeCharacteristic characteristic is null ");
            return false;
        }
        try {
            bluetoothGattCharacteristic.setValue(bArr);
            bluetoothGattCharacteristic.setWriteType(1);
            boolean zWriteCharacteristic = this.e.writeCharacteristic(bluetoothGattCharacteristic);
            LogUtil.a("PluginDevice_WspMeasureController", "SDK-->Device:", HexUtils.c(bArr), " tag : ", bluetoothGattCharacteristic.getUuid().toString(), "isSuccess : ", Boolean.valueOf(zWriteCharacteristic));
            return zWriteCharacteristic;
        } catch (SecurityException e) {
            LogUtil.e("PluginDevice_WspMeasureController", "writeCharacteristic SecurityException:", ExceptionUtils.c(e));
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.health.device.kit.wsp.task.ITaskService
    public void write(dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback) {
        boolean zD;
        IAsynBleTaskCallback iAsynBleTaskCallback2;
        UUID uuid = dmz.aa;
        UUID uuid2 = dmz.i;
        BleTaskQueueUtil.TaskType taskTypeF = droVar.f();
        if (taskTypeF == BleTaskQueueUtil.TaskType.SET_AGE) {
            uuid = dmz.af;
            uuid2 = dmz.d;
        } else if (taskTypeF == BleTaskQueueUtil.TaskType.SET_GENDER) {
            uuid = dmz.af;
            uuid2 = dmz.f;
        } else if (taskTypeF == BleTaskQueueUtil.TaskType.SET_HEIGHT) {
            uuid = dmz.af;
            uuid2 = dmz.g;
        } else if (taskTypeF == BleTaskQueueUtil.TaskType.CLEAR_USER_INFO) {
            uuid = dmz.ai;
            uuid2 = dmz.n;
        } else {
            LogUtil.a("PluginDevice_WspMeasureController", "write default");
        }
        if (this.s) {
            this.y = iAsynBleTaskCallback;
            zD = d(droVar, uuid.toString(), uuid2.toString());
            LogUtil.a("PluginDevice_WspMeasureController", "isWriteSuccess:", Boolean.valueOf(zD));
        } else {
            BluetoothGatt bluetoothGatt = this.e;
            if (bluetoothGatt == null) {
                LogUtil.j("PluginDevice_WspMeasureController", "write mBluetoothGatt is null");
                return;
            }
            try {
                BluetoothGattService service = bluetoothGatt.getService(uuid);
                if (service != null) {
                    BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
                    if (characteristic != null) {
                        this.y = iAsynBleTaskCallback;
                        boolean zA = a(characteristic, droVar.d());
                        try {
                            LogUtil.a("PluginDevice_WspMeasureController", "Write key:", droVar.f().toString(), " isSuccess:", Boolean.valueOf(zA));
                            zD = zA;
                        } catch (SecurityException unused) {
                            zD = zA;
                            LogUtil.j("PluginDevice_WspMeasureController", "write gattService SecurityException");
                        }
                    } else {
                        LogUtil.j("PluginDevice_WspMeasureController", "write gattCharacteristic is null");
                    }
                } else {
                    LogUtil.j("PluginDevice_WspMeasureController", "write gattService is null");
                }
            } catch (SecurityException unused2) {
                zD = false;
            }
            iAsynBleTaskCallback2 = this.y;
            if (iAsynBleTaskCallback2 != null) {
                iAsynBleTaskCallback2.failed();
            }
        }
        if (zD) {
            return;
        }
        iAsynBleTaskCallback2 = this.y;
        if (iAsynBleTaskCallback2 != null) {
            iAsynBleTaskCallback2.failed();
        }
    }

    private boolean d(dro droVar, String str, String str2) {
        if (droVar == null) {
            LogUtil.j("PluginDevice_WspMeasureController", "TaskData == null");
            return false;
        }
        if (TextUtils.isEmpty(this.v)) {
            LogUtil.j("PluginDevice_WspMeasureController", "writeCommandByUds-> macAddress is null");
            return false;
        }
        cmm cmmVar = new cmm();
        cmmVar.a(droVar.d());
        dxx.d().a(cmmVar, str, str2, this.v, CharacterOperationType.WRITE);
        LogUtil.d("PluginDevice_WspMeasureController", "writeCommandByUds->", eeq.e(cmmVar.d()));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.health.device.kit.wsp.task.ITaskService
    public void enable(dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback) {
        boolean zA;
        IAsynBleTaskCallback iAsynBleTaskCallback2;
        UUID uuid = dmz.ab;
        UUID uuid2 = dmz.f32037b;
        if (droVar.f() == BleTaskQueueUtil.TaskType.ENABLE_WEIGHT_SCALE) {
            uuid = dmz.ae;
            uuid2 = dmz.l;
        } else if (droVar.f() == BleTaskQueueUtil.TaskType.ENABLE_CLEAR_USER_INFO) {
            uuid = dmz.ai;
            uuid2 = dmz.m;
        } else {
            LogUtil.a("PluginDevice_WspMeasureController", "enable default");
        }
        if (this.s) {
            this.y = iAsynBleTaskCallback;
            zA = d(uuid.toString(), uuid2.toString());
            LogUtil.a("PluginDevice_WspMeasureController", "isEnable:", Boolean.valueOf(zA));
        } else {
            BluetoothGatt bluetoothGatt = this.e;
            if (bluetoothGatt != null) {
                BluetoothGattService service = bluetoothGatt.getService(uuid);
                if (service != null) {
                    BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
                    if (characteristic != null) {
                        this.y = iAsynBleTaskCallback;
                        zA = a(characteristic, true);
                    }
                } else {
                    LogUtil.j("PluginDevice_WspMeasureController", "enable BluetoothGattService is null");
                }
            }
            iAsynBleTaskCallback2 = this.y;
            if (iAsynBleTaskCallback2 != null) {
                iAsynBleTaskCallback2.failed();
            }
        }
        if (zA) {
            return;
        }
        iAsynBleTaskCallback2 = this.y;
        if (iAsynBleTaskCallback2 != null) {
            iAsynBleTaskCallback2.failed();
        }
    }

    private boolean d(String str, String str2) {
        if (!TextUtils.isEmpty(this.v)) {
            dxx.d().d(this.v, str, str2, true);
            LogUtil.a("PluginDevice_WspMeasureController", "enableNotifyByUds-> success");
            return true;
        }
        LogUtil.j("PluginDevice_WspMeasureController", "enableNotifyByUds-> fail");
        return false;
    }
}
