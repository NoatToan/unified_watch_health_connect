package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.HexUtils;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.health.device.kit.hwch.ch18.bean.WeightCmd;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.ui.WeightOfflineDataSelectActivity;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.ecologydevice.open.GattMeasureController;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.plugindevice.R;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class dof extends GattMeasureController {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static dof f32112c;
    private TimerTask ah;
    private b ak;
    private String am;
    private Timer an;
    private BluetoothGattService ao;
    private int ap;
    private SharedPreferences ar;
    private c as;
    private TimerTask at;
    private Timer au;
    private int av;
    private String ax;
    private BluetoothGatt f;
    private enw h;
    private WeightCmd k;
    private HealthDevice l;
    private dom n;
    private boolean p;
    private boolean t;
    private static final Map<Integer, Integer> d = Collections.unmodifiableMap(new HashMap<Integer, Integer>() { // from class: dof.4
        {
            put(1, 0);
            put(0, 1);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f32111a = new Object();
    private int s = 173;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32113b = 29;
    private int aq = 1;
    private HandlerThread o = new HandlerThread("HWChMeasureController");
    private boolean ab = false;
    private boolean v = false;
    private boolean ac = false;
    private boolean y = false;
    private boolean u = false;
    private boolean q = false;
    private boolean ai = false;
    private boolean w = false;
    private dsb az = dsb.b(BaseApplication.getContext());
    private Context g = BaseApplication.getContext();
    private ArrayList<dso> bc = new ArrayList<>(16);
    private ArrayList<dso> aw = new ArrayList<>(16);
    private ArrayList<HealthData> al = new ArrayList<>(16);
    private ArrayList<IHealthDeviceCallback> i = new ArrayList<>(16);
    private boolean ag = false;
    private int j = 0;
    private int aj = 2000;
    private boolean aa = false;
    private boolean ae = false;
    private boolean r = false;
    private boolean af = false;
    private boolean x = false;
    private boolean ad = false;
    private boolean z = false;
    private BluetoothGattCallback e = new BluetoothGattCallback() { // from class: dof.5
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            LogUtil.a("HWChMeasureController", "HWChMeasureController on status ", Integer.valueOf(i), " newState ", Integer.valueOf(i2));
            dof.this.e(bluetoothGatt, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            LogUtil.a("HWChMeasureController", "HWChMeasureController onDescriptorWrite");
            dof.this.b();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            String string = bluetoothGattCharacteristic.getUuid().toString();
            LogUtil.a("HWChMeasureController", "Device-->SDK : ", HexUtils.c(bluetoothGattCharacteristic.getValue()), " , tag : ", string);
            if (dof.this.ap != 2) {
                return;
            }
            LogUtil.a("HWChMeasureController", "mState == BluetoothProfile.STATE_CONNECTED");
            dof.this.b(bluetoothGattCharacteristic, string);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            LogUtil.a("HWChMeasureController", "HWChMeasureController onServicesDiscovered");
            dof.this.ak.removeCallbacksAndMessages(null);
            if (i == 0) {
                LogUtil.d("HWChMeasureController", "HWChMeasureController GATT_SUCCESS");
                dof.this.a(bluetoothGatt);
                return;
            }
            LogUtil.e("HWChMeasureController", "HWChMeasureController onServicesDiscovered failed");
            Bundle bundle = new Bundle();
            bundle.putString(BleConstants.MEASUREKIT_ID, dof.this.mDevice.getMeasureKitUuid());
            LogUtil.a(907127003, "HWChMeasureController", bundle, false, "No GATT mService found.", bundle);
            dof dofVar = dof.this;
            dofVar.a(dofVar.l, 8);
        }
    };
    private EventBus.ICallback m = new EventBus.ICallback() { // from class: dof.3
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) throws Throwable {
            LogUtil.a("HWChMeasureController", " action is ", dVar.e());
            if ("weight_device_clear_user_data".equals(dVar.e())) {
                dof.this.r = true;
                if (dof.this.ac && dof.this.y && dof.this.u) {
                    LogUtil.a("HWChMeasureController", "send clear user data === 1");
                    dof.this.aa = true;
                    dof.this.ae = false;
                    dof.this.e(dog.d(), WeightCmd.ACK_CLEAR_USER_INFO);
                    return;
                }
                LogUtil.a("HWChMeasureController", " mIsReceiveUserCheck && mIsReceiveClockCheck && mIsReceiveCustomCheck false");
                return;
            }
            if ("weight_device_ota_update".equals(dVar.e())) {
                Intent intentC = dVar.c();
                doj.c().c(intentC.getStringExtra("scalePath"), intentC.getStringExtra("blePath"));
                return;
            }
            if ("get_scale_version_code".equals(dVar.e())) {
                LogUtil.a("HWChMeasureController", " action is EVEBUS_SINGLE_GET_SCALE_VERSION_CODE");
                if (dof.this.n == null) {
                    dof.this.b(dog.e());
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("bleVersion", dof.this.n.c());
                intent.putExtra("scaleVersion", dof.this.n.d());
                EventBus.a(new EventBus.d("set_scale_version_code", intent));
                return;
            }
            LogUtil.a("HWChMeasureController", "unknown event.getAction() ", dVar.e());
        }
    };

    static /* synthetic */ int l(dof dofVar) {
        int i = dofVar.j;
        dofVar.j = i + 1;
        return i;
    }

    private dof() {
        g();
        this.ar = this.g.getSharedPreferences("weightUser", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothGattCharacteristic bluetoothGattCharacteristic, String str) {
        if ("0000faa1-0000-1000-8000-00805f9b34fb".equalsIgnoreCase(str)) {
            LogUtil.d("HWChMeasureController", "HWChMeasureController write data" + Arrays.toString(bluetoothGattCharacteristic.getValue()));
            return;
        }
        if ("0000faa2-0000-1000-8000-00805f9b34fb".equalsIgnoreCase(str)) {
            boolean z = !this.ai && this.av == -6;
            if (this.av == -5 || z) {
                ending();
                return;
            }
            LogUtil.a("HWChMeasureController", "not ending");
            d(true);
            dok dokVarB = dog.b(bluetoothGattCharacteristic.getValue());
            LogUtil.a("HWChMeasureController", " HWChMeasureController parseResult ", Integer.valueOf(dokVarB.a()));
            Object objB = dokVarB.b();
            int iA = dokVarB.a();
            if (iA == 1) {
                this.q = true;
            } else {
                this.q = false;
            }
            byte[] value = bluetoothGattCharacteristic.getValue();
            d(iA);
            a(iA, dokVarB, objB);
            c(iA, dokVarB, objB, value);
            b(iA, dokVarB, objB, value);
            e(iA, dokVarB, objB, value);
            WeightCmd weightCmdD = dokVarB.d();
            byte[] bArrC = dokVarB.c();
            if (bArrC == null || bArrC.length <= 0) {
                LogUtil.a("HWChMeasureController", "feedBackDatas is null or empty");
                return;
            } else if (weightCmdD != null) {
                LogUtil.a("HWChMeasureController", "targetAck safeguardSendData ", weightCmdD.name());
                e(bArrC, weightCmdD);
                return;
            } else {
                LogUtil.a("HWChMeasureController", "writeCmdBytes");
                b(bArrC);
                return;
            }
        }
        LogUtil.a("HWChMeasureController", "unknown characterId");
    }

    private void e(int i, dok dokVar, Object obj, byte[] bArr) {
        switch (i) {
            case 19:
                dokVar.b(dog.b());
                dokVar.b(WeightCmd.ACK_SET_CLOCK);
                break;
            case 20:
                if (this.ad) {
                    LogUtil.a("HWChMeasureController", "mIsSendShPckFirst true");
                } else {
                    this.ad = true;
                    doj.c().b(dokVar.a(), bArr, obj);
                }
                break;
            case 21:
                if (this.z) {
                    LogUtil.a("HWChMeasureController", "mIsSendShPckSecond true");
                } else {
                    this.z = true;
                    doj.c().b(dokVar.a(), bArr, obj);
                }
                break;
        }
    }

    private void b(int i, dok dokVar, Object obj, byte[] bArr) {
        switch (i) {
            case 13:
                this.ab = false;
                break;
            case 14:
                LogUtil.a("HWChMeasureController", "Received the alarm response");
                break;
            case 15:
                if (this.x) {
                    LogUtil.a("HWChMeasureController", "mIsReadyOTA true");
                } else {
                    this.x = true;
                    this.k = WeightCmd.ACK_GET_OTA_UPGRADE_REQ;
                    doj.c().b(dokVar.a(), bArr, obj);
                }
                break;
            case 17:
                this.ai = false;
                c();
                LogUtil.a("HWChMeasureController", "receiver histroy data done");
                break;
            case 18:
                this.k = WeightCmd.ACK_USER_AUTH;
                if (!(obj instanceof Boolean)) {
                    LogUtil.j("HWChMeasureController", "checkResult is not instanceof Boolean");
                } else {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    this.ac = true;
                    if (zBooleanValue) {
                        LogUtil.a("HWChMeasureController", "Distributed clock synchronization");
                        dokVar.b(dog.b());
                        dokVar.b(WeightCmd.ACK_SET_CLOCK);
                    } else {
                        e(dokVar);
                    }
                }
                break;
        }
    }

    private void e(dok dokVar) {
        LogUtil.a("HWChMeasureController", "Bind instructions issued by the user");
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (!Utils.h()) {
            LogUtil.a("HWChMeasureController", "TYPE_USER_CHECK userId == ", a());
            dokVar.b(dog.e(a()));
        } else {
            dokVar.b(dog.e(accountInfo));
        }
        dokVar.b(WeightCmd.ACK_SET_CUSTOM);
    }

    private void c(int i, dok dokVar, Object obj, byte[] bArr) {
        switch (i) {
            case 6:
                this.k = WeightCmd.ACK_SET_CLOCK;
                LogUtil.a("HWChMeasureController", "Complete instructions received time synchronization");
                this.y = true;
                b(dokVar, (dol) null);
                dokVar.b(WeightCmd.ACK_SET_CUSTOM);
                break;
            case 7:
                this.ai = true;
                if (obj instanceof dol) {
                    dol dolVar = (dol) obj;
                    a(this.l, b(dolVar));
                    if (this.p) {
                        b(dokVar, dolVar);
                    }
                }
                break;
            case 8:
                a(obj);
                break;
            case 9:
                this.k = WeightCmd.ACK_SET_OTA;
                doj.c().b(dokVar.a(), bArr, obj);
                break;
            case 10:
                l();
                this.k = WeightCmd.ACK_SET_OTA;
                doj.c().b(dokVar.a(), bArr, obj);
                break;
        }
    }

    private void a(Object obj) {
        this.ai = true;
        if (obj instanceof dol) {
            dol dolVar = (dol) obj;
            if (!Utils.h()) {
                dolVar.b(a());
            } else {
                dolVar.b(MultiUsersManager.INSTANCE.getCurrentUser().i());
            }
            this.az.c(dolVar);
            LogUtil.a("HWChMeasureController", "receiver histroy data");
        }
    }

    private void a(int i, dok dokVar, Object obj) {
        if (i == 3) {
            this.k = WeightCmd.ACK_SET_CUSTOM;
            this.u = true;
            if (this.aa) {
                this.aa = false;
                this.r = false;
                b(dokVar, (dol) null);
                this.ae = true;
                dokVar.b(WeightCmd.ACK_SET_CUSTOM);
                return;
            }
            h();
            return;
        }
        if (i == 4 && (obj instanceof dom)) {
            this.n = (dom) obj;
            if ("33123f39-7fc1-420b-9882-a4b0d6c61100".equals(this.am)) {
                dom domVar = this.n;
                domVar.b(domVar.d() - 32768);
            } else {
                LogUtil.a("HWChMeasureController", "DEVICE_ABROAD_HUAWEI_WEIGHT ! = (mProductId)");
            }
            Intent intent = new Intent();
            intent.putExtra("bleVersion", this.n.c());
            intent.putExtra("scaleVersion", this.n.d());
            dxn.e("HWChMeasureController", b(this.n.d()), this.g, this.ax);
            dxm.g(this.ax, b(this.n.d()));
            EventBus.a(new EventBus.d("set_scale_version_code", intent));
        }
    }

    private void h() {
        int i = this.av;
        if (i == -1) {
            LogUtil.a("HWChMeasureController", "waiting instruction, maintain connection");
            if (this.ae) {
                this.ae = false;
                a(this.mDevice, -3);
                return;
            } else {
                b(dog.e());
                return;
            }
        }
        if (i == -2) {
            LogUtil.a("HWChMeasureController", "user authentication is completed, the binding of success");
            b(dog.e());
            a(this.mDevice, -2);
            return;
        }
        b(dog.e());
    }

    private void d(int i) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.ab = false;
            this.af = false;
            l();
            n();
            y();
            s();
            a(this.l, 13);
            return;
        }
        this.af = true;
        boolean z = !this.ai && this.av == -6;
        if (this.av == -5 || z) {
            ending();
            return;
        }
        LogUtil.a("HWChMeasureController", "parseResult not ending");
        LogUtil.a("HWChMeasureController", "TYPE_WAKEUP ", Boolean.valueOf((this.ab && this.ac) ? false : true));
        boolean z2 = this.ab;
        if ((!z2 || !this.ac) && this.av != -6) {
            this.ab = true;
            t();
            r();
        } else {
            LogUtil.a("HWChMeasureController", "parseResult (!mIsSendWakeup || !mIsReceiveUserCheck) ", Boolean.valueOf((z2 && this.ac) ? false : true));
        }
        a(this.l, 14);
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.ap == 2) {
            d(true);
            this.ak.postDelayed(new Runnable() { // from class: dof.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z = !dof.this.ai && dof.this.av == -6;
                    if (dof.this.av == -5 || z) {
                        dof.this.ending();
                        return;
                    }
                    LogUtil.a("HWChMeasureController", "HWChMeasureController not onDescriptorWrite 1");
                    if (!dof.this.ac && dof.this.av != -6) {
                        dof.this.t();
                        dof.this.r();
                    } else {
                        LogUtil.a("HWChMeasureController", "HWChMeasureController not onDescriptorWrite 2");
                    }
                }
            }, 1000L);
        } else {
            LogUtil.a("HWChMeasureController", "mState != BluetoothProfile.STATE_CONNECTED");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(BluetoothGatt bluetoothGatt, int i) {
        this.ab = false;
        k();
        this.f = bluetoothGatt;
        if (i != 2) {
            if (i != 0) {
                LogUtil.a("HWChMeasureController", "new state else", Integer.valueOf(i));
                return;
            } else {
                m();
                return;
            }
        }
        k();
        this.ap = 2;
        b bVar = this.ak;
        if (bVar == null) {
            LogUtil.a("HWChMeasureController", "mMsgHandler == null");
        } else {
            bVar.removeMessages(1);
            this.ak.sendEmptyMessageDelayed(1, 500L);
        }
        this.w = true;
        this.ax = this.f.getDevice().getAddress();
        a(this.mDevice, 2);
    }

    public static dof d() {
        dof dofVar;
        synchronized (f32111a) {
            if (f32112c == null) {
                f32112c = new dof();
            } else {
                LogUtil.a("HWChMeasureController", "sInstance != null");
            }
            dofVar = f32112c;
        }
        return dofVar;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public boolean start() {
        LogUtil.a("HWChMeasureController", "HWChMeasureController start mState ", Integer.valueOf(this.ap));
        return true;
    }

    private void g() {
        this.o.start();
        this.ak = new b(this.o.getLooper());
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void cleanup() {
        int i;
        LogUtil.a("HWChMeasureController", "HWChMeasureController cleanup ", "mIsSyncData:", Boolean.valueOf(this.ai), "; mType== ", Integer.valueOf(this.av));
        boolean z = (this.ai || (i = this.av) == -4 || i == -1) ? false : true;
        if (this.av == -5 || z) {
            p();
            this.ap = 0;
            this.ae = false;
            this.w = false;
            this.aa = false;
            y();
            s();
            return;
        }
        LogUtil.a("HWChMeasureController", "no cleanup");
    }

    private void p() {
        LogUtil.a("HWChMeasureController", "HWChMeasureController setCleanData ", "mIsSyncData:", Boolean.valueOf(this.ai), "; mType= ", Integer.valueOf(this.av));
        this.v = false;
        this.ao = null;
        this.r = false;
        this.af = false;
        this.ax = null;
        synchronized (f32111a) {
            this.i.clear();
        }
        l();
        y();
        c cVar = this.as;
        if (cVar != null) {
            cVar.b(false);
        } else {
            LogUtil.a("HWChMeasureController", "mRun == null");
        }
        this.ab = false;
        this.n = null;
        k();
        s();
        j();
        EventBus.a(this.m, "weight_device_clear_user_data", "weight_device_ota_update", "get_scale_version_code");
    }

    private void l() {
        this.x = false;
        this.ad = false;
        this.z = false;
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public void ending() {
        b bVar;
        int i;
        LogUtil.a("HWChMeasureController", "HWChMeasureController ending mIsSyncData:" + this.ai + "; mType= " + this.av);
        boolean z = (this.ai || (i = this.av) == -4 || i == -1) ? false : true;
        if (this.av == -5 || z) {
            LogUtil.a("HWChMeasureController", "HWChMeasureController ending");
            p();
            if (this.o != null && (bVar = this.ak) != null) {
                bVar.removeCallbacksAndMessages(null);
                this.ak.removeCallbacks(this.as);
            } else {
                LogUtil.a("HWChMeasureController", "mHandlerThread or mMsgHandler = null");
            }
            super.ending();
        }
    }

    private void c(IHealthDeviceCallback iHealthDeviceCallback) {
        LogUtil.a("HWChMeasureController", "registerCallBack----start----");
        synchronized (f32111a) {
            try {
                if (iHealthDeviceCallback == null) {
                    LogUtil.a("HWChMeasureController", "registerCallBack callback is null");
                } else if (!this.i.contains(iHealthDeviceCallback)) {
                    LogUtil.a("HWChMeasureController", "registerCallBack add success");
                    this.i.add(iHealthDeviceCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    public void d(IHealthDeviceCallback iHealthDeviceCallback) {
        boolean z;
        synchronized (f32111a) {
            if (iHealthDeviceCallback != null) {
                try {
                    if (this.i.contains(iHealthDeviceCallback)) {
                        this.i.remove(iHealthDeviceCallback);
                    } else {
                        if (iHealthDeviceCallback != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        LogUtil.a("HWChMeasureController", "callback != null ", Boolean.valueOf(z), " mCallBacks.contains(callback) ", Boolean.valueOf(this.i.contains(iHealthDeviceCallback)));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (iHealthDeviceCallback != null) {
                    z = true;
                } else {
                    z = false;
                }
                LogUtil.a("HWChMeasureController", "callback != null ", Boolean.valueOf(z), " mCallBacks.contains(callback) ", Boolean.valueOf(this.i.contains(iHealthDeviceCallback)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HealthDevice healthDevice, int i) {
        synchronized (f32111a) {
            for (IHealthDeviceCallback iHealthDeviceCallback : this.i) {
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onStatusChanged(healthDevice, i);
                } else {
                    LogUtil.a("HWChMeasureController", "callback == null");
                }
            }
        }
    }

    private void a(HealthDevice healthDevice, HealthData healthData) {
        synchronized (f32111a) {
            for (IHealthDeviceCallback iHealthDeviceCallback : this.i) {
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onDataChanged(healthDevice, healthData);
                } else {
                    LogUtil.a("HWChMeasureController", "callback == null");
                }
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        EventBus.b(this.m, 0, "weight_device_clear_user_data", "weight_device_ota_update", "get_scale_version_code");
        LogUtil.a("HWChMeasureController", "HWChMeasureController prepare");
        if (iHealthDeviceCallback != null) {
            c(iHealthDeviceCallback);
        } else {
            LogUtil.a("HWChMeasureController", "cb == null");
        }
        if (bundle != null) {
            this.av = bundle.getInt("type");
            this.am = bundle.getString("productId");
            this.t = bundle.getBoolean("clearData", false);
            boolean z = bundle.getBoolean("activeMeasure", false);
            this.p = z;
            LogUtil.a("HWChMeasureController", "HWChMeasureController prepare type", Integer.valueOf(this.av), "; mIsActiveMeasure=", Boolean.valueOf(z));
        } else {
            this.t = false;
            this.av = 0;
        }
        q();
        if (healthDevice == null) {
            return false;
        }
        a(healthDevice, this.af ? 14 : 13);
        a(healthDevice, this.w ? 2 : 3);
        f();
        this.l = healthDevice;
        dog.a(healthDevice.getAddress());
        if (!super.prepare(healthDevice, iHealthDeviceCallback, bundle)) {
            LogUtil.a("super.prepare false", new Object[0]);
            return false;
        }
        if (bundle != null) {
            this.s = bundle.getInt("height");
            this.aq = bundle.getInt("sex");
            this.f32113b = bundle.getInt("age");
            LogUtil.a("HWChMeasureController", "HWChMeasureController productId is:", this.am);
            return true;
        }
        LogUtil.j("HWChMeasureController", "HWChMeasureController args is null");
        return true;
    }

    private void q() {
        int i = this.av;
        if (i == -4 || i == -2) {
            this.aj = 2000;
            this.v = true;
        } else {
            this.aj = 8000;
            this.v = false;
        }
    }

    private void f() {
        HiHealthManager.d(dxw.d()).fetchUserData(new HiCommonListener() { // from class: dof.1
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                List list;
                if (obj != null) {
                    try {
                        list = obj instanceof List ? (List) obj : null;
                    } catch (ClassCastException e) {
                        LogUtil.d("HWChMeasureController", "HWChMeasureController _prepare--ClassCastException", e.getMessage());
                    }
                    dof.this.a((List<HiUserInfo>) list);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j("HWChMeasureController", "HWChMeasureController onFailure");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiUserInfo> list) {
        if (list == null) {
            LogUtil.a("HWChMeasureController", "prepareUserData userInfos == null");
            return;
        }
        for (HiUserInfo hiUserInfo : list) {
            if (hiUserInfo.getRelateType() == 0) {
                this.s = hiUserInfo.getHeight();
                this.aq = hiUserInfo.getGender();
                this.f32113b = hiUserInfo.getAge();
                return;
            }
            LogUtil.a("HWChMeasureController", "prepareUserData hiUserInfo.getRelateType() ", Integer.valueOf(hiUserInfo.getRelateType()));
        }
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController
    public BluetoothGattCallback getGattCallbackImpl() {
        LogUtil.a("HWChMeasureController", "HWChMeasureController getGattCallbackImpl");
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothGatt bluetoothGatt, b bVar) {
        if (bluetoothGatt != null) {
            LogUtil.a("HWChMeasureController", "start to close gatt...");
            try {
                bluetoothGatt.close();
            } catch (SecurityException e) {
                LogUtil.e("HWChMeasureController", "closeBluetoothGattAndRemoveMsg SecurityException:", ExceptionUtils.c(e));
            }
            this.f = null;
        } else {
            LogUtil.a("HWChMeasureController", "closeBluetoothGattAndRemoveMsg bleGatt == null");
        }
        if (this.ak == null) {
            LogUtil.a("HWChMeasureController", "mMsgHandler == null");
        } else {
            bVar.removeCallbacksAndMessages(null);
        }
    }

    private void m() {
        LogUtil.a("HWChMeasureController", "HeartRateMeasureController setBlueGattStatus type == ", Integer.valueOf(this.av));
        this.ap = 0;
        this.ae = false;
        this.ai = false;
        this.w = false;
        this.aa = false;
        this.ao = null;
        y();
        s();
        j();
        LogUtil.e("HWChMeasureController", "HWChMeasureController onConnectionStateChange STATUS_DISCONNECTED 1");
        if (this.v) {
            LogUtil.a("HWChMeasureController", "HeartRateMeasureController mIsFirstConnect enter");
            a(this.f, this.ak);
            b bVar = this.ak;
            if (bVar != null) {
                bVar.sendEmptyMessageDelayed(4, 500L);
            } else {
                LogUtil.a("HWChMeasureController", "mMsgHandler == null");
            }
        } else {
            LogUtil.a("HWChMeasureController", "mIsFirstConnect false");
        }
        a(this.l, 3);
    }

    private String b(int i) {
        return (i / 4096) + "." + ((i / 256) % 16) + "." + (i % 256);
    }

    private void b(dok dokVar, dol dolVar) {
        dop dopVar = new dop();
        if (!Utils.h()) {
            dopVar.b(a());
            LogUtil.d("HWChMeasureController", "HWChMeasureController getSendData = ", a());
        } else {
            String strI = MultiUsersManager.INSTANCE.getCurrentUser().i();
            if (!TextUtils.isEmpty(strI)) {
                dopVar.b(strI);
                LogUtil.d("HWChMeasureController", "HWChMeasureController setUserIdToDevice getSendData = ", MultiUsersManager.INSTANCE.getCurrentUser().i());
            } else {
                LogUtil.e("HWChMeasureController", "the current user's uuid is null send data stop");
                return;
            }
        }
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser != null) {
            dopVar.a(currentUser.c());
            dopVar.d(currentUser.e());
            this.aq = currentUser.d();
            LogUtil.a("HWChMeasureController", "user name: ", currentUser.h(), ", uuid: ", currentUser.i());
        } else {
            LogUtil.a("HWChMeasureController", "user info is null.");
            dopVar.a(this.f32113b);
            dopVar.d(this.s);
        }
        dopVar.c(e(this.aq));
        if (dolVar != null) {
            LogUtil.a("HWChMeasureController", "getSendData measureResult writeBack.");
            dopVar.b(dolVar.j());
        } else {
            List<dnb> singleUserWeightData = WeightDataManager.INSTANCE.getSingleUserWeightData(MultiUsersManager.INSTANCE.getCurrentUser().i(), true);
            if (singleUserWeightData.size() > 0 && singleUserWeightData.get(0) != null) {
                dopVar.b((float) singleUserWeightData.get(0).av());
            } else {
                dopVar.b(60.0f);
            }
        }
        dokVar.b(dog.a(dopVar));
    }

    private int e(int i) {
        Integer num = d.get(Integer.valueOf(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private HealthData b(dol dolVar) {
        dso dsoVar = new dso();
        dsoVar.setWeight(dolVar.j());
        dsoVar.setBodyFatRat(dolVar.a());
        dsoVar.g(dolVar.i());
        dsoVar.setStartTime(System.currentTimeMillis());
        dsoVar.setEndTime(System.currentTimeMillis());
        if (!Utils.h()) {
            dsoVar.a(a());
            return dsoVar;
        }
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser != null) {
            String strI = currentUser.i();
            LogUtil.d("HWChMeasureController", "measureDataToHealthData userId = ", strI);
            dsoVar.a(strI);
        }
        return dsoVar;
    }

    public void a(BluetoothGatt bluetoothGatt) {
        LogUtil.a("HWChMeasureController", "HWChMeasureController initService");
        this.f = bluetoothGatt;
        if (this.ao != null) {
            return;
        }
        LogUtil.a("HWChMeasureController", "mService == null");
        if (bluetoothGatt == null) {
            LogUtil.j("HWChMeasureController", "initService mBluetoothGatt is null.");
            return;
        }
        try {
            BluetoothGattService service = bluetoothGatt.getService(UUID.fromString("0000faa0-0000-1000-8000-00805f9b34fb"));
            this.ao = service;
            if (service != null) {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString("0000faa2-0000-1000-8000-00805f9b34fb"));
                if (characteristic == null) {
                    ReleaseLogUtil.e("R_HWChMeasureController", "initService characteristic == null");
                    return;
                }
                bluetoothGatt.setCharacteristicNotification(characteristic, true);
                BluetoothGattDescriptor descriptor = characteristic.getDescriptor(UUID.fromString(BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID));
                if (descriptor != null) {
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                    bluetoothGatt.writeDescriptor(descriptor);
                } else {
                    LogUtil.a("HWChMeasureController", "descriptor == null");
                }
                LogUtil.d("HWChMeasureController", "HWChMeasureController mHealthDevice.getAddress():", this.l.getAddress());
            }
        } catch (SecurityException e) {
            LogUtil.e("HWChMeasureController", "initService SecurityException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        SharedPreferences.Editor editorEdit;
        if (!Utils.h()) {
            if (this.av == -2) {
                SharedPreferences sharedPreferences = this.ar;
                if (sharedPreferences != null) {
                    editorEdit = sharedPreferences.edit();
                } else {
                    editorEdit = this.g.getSharedPreferences("weightUser", 0).edit();
                }
                if (TextUtils.isEmpty(a())) {
                    editorEdit.putString("weightUser_id", System.currentTimeMillis() + "");
                    editorEdit.commit();
                } else {
                    LogUtil.a("HWChMeasureController", "getNoCloudUserId() is no empty");
                }
                LogUtil.d("HWChMeasureController", "HWChMeasureController setUserIdToDevice getCurrentUser = " + a());
                e(dog.b(a()), WeightCmd.ACK_USER_AUTH);
                return;
            }
            LogUtil.d("HWChMeasureController", "HWChMeasureController setUserIdToDevice getCurrentUser2 = " + a());
            e(dog.b(a()), WeightCmd.ACK_USER_AUTH);
            return;
        }
        e(dog.b(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011)), WeightCmd.ACK_USER_AUTH);
    }

    private void d(boolean z) {
        synchronized (this) {
            Timer timer = this.au;
            if (timer != null) {
                timer.cancel();
                this.au = null;
            } else {
                LogUtil.a("HWChMeasureController", "timer == null");
            }
            TimerTask timerTask = this.at;
            if (timerTask != null) {
                timerTask.cancel();
                this.at = null;
            } else {
                LogUtil.a("HWChMeasureController", "mTask == null");
            }
            if (z || this.av == -1) {
                this.au = new Timer("HWChMeasureController");
                TimerTask timerTask2 = new TimerTask() { // from class: dof.10
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        dof.this.b(dog.c());
                    }
                };
                this.at = timerTask2;
                this.au.schedule(timerTask2, 2000L, 2000L);
            } else {
                LogUtil.a("HWChMeasureController", "not start timer");
            }
        }
    }

    public void b(byte[] bArr) {
        BluetoothGatt bluetoothGatt = this.f;
        if (bluetoothGatt == null) {
            LogUtil.a("HWChMeasureController", "mBluetoothGatt is null");
        } else if (this.ap != 2) {
            LogUtil.a("HWChMeasureController", "mState != BluetoothProfile.STATE_CONNECTED");
        } else {
            a(bluetoothGatt.getService(UUID.fromString("0000faa0-0000-1000-8000-00805f9b34fb")), bluetoothGatt, bArr);
        }
    }

    private void a(BluetoothGattService bluetoothGattService, BluetoothGatt bluetoothGatt, byte[] bArr) {
        String str;
        if (bluetoothGattService == null) {
            LogUtil.a("HWChMeasureController", "write BluetoothGattService is null");
            return;
        }
        try {
            BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(UUID.fromString("0000faa1-0000-1000-8000-00805f9b34fb"));
            if (characteristic == null) {
                LogUtil.a("HWChMeasureController", "gattCharacteristic == null");
                return;
            }
            characteristic.setValue(bArr);
            characteristic.setWriteType(1);
            boolean zWriteCharacteristic = bluetoothGatt.writeCharacteristic(characteristic);
            String strC = HexUtils.c(bArr);
            if (characteristic.getUuid() == null) {
                str = "tag : null";
            } else {
                str = "tag : " + characteristic.getUuid().toString();
            }
            LogUtil.a("HWChMeasureController", "SDK-->Device : ", strC, str, "Write key:", " isSuccess:", Boolean.valueOf(zWriteCharacteristic));
        } catch (SecurityException e) {
            LogUtil.e("HWChMeasureController", "sendCmdToDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void y() {
        synchronized (this) {
            d(false);
        }
    }

    private void j() {
        synchronized (this) {
            BluetoothGatt bluetoothGatt = this.f;
            if (bluetoothGatt != null) {
                try {
                    bluetoothGatt.disconnect();
                    bluetoothGatt.close();
                } catch (SecurityException e) {
                    LogUtil.e("HWChMeasureController", "disConnectBle SecurityException:", ExceptionUtils.c(e));
                }
            } else {
                LogUtil.a("HWChMeasureController", "disConnectBle mBluetoothGatt is null");
            }
            this.f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        synchronized (this) {
            s();
            this.an = new Timer("HWChMeasureController");
            TimerTask timerTask = new TimerTask() { // from class: dof.8
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    LogUtil.a("HWChMeasureController", "HWChMeasureController startMeasureTimeTask 1");
                    dof.this.o();
                }
            };
            this.ah = timerTask;
            long j = this.aj;
            this.an.schedule(timerTask, j, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.t) {
            LogUtil.a("HWChMeasureController", "HWChMeasureController startMeasureTimeTask 2");
            if (!this.ac) {
                LogUtil.a("HWChMeasureController", "HWChMeasureController startMeasureTimeTask 3");
                t();
                return;
            }
            if (this.y && this.u) {
                if (this.r) {
                    LogUtil.a("HWChMeasureController", "send clear user data");
                    this.aa = true;
                    this.ae = false;
                    e(dog.d(), WeightCmd.ACK_CLEAR_USER_INFO);
                    return;
                }
                LogUtil.a("HWChMeasureController", "no send clear user data ");
                return;
            }
            t();
            return;
        }
        if (this.q) {
            if (!this.ac || !this.y || !this.u) {
                t();
                return;
            } else {
                LogUtil.a("HWChMeasureController", "no send setUserIdToDevice");
                return;
            }
        }
        LogUtil.a("HWChMeasureController", "mIsAgainSendData false");
    }

    private void s() {
        Timer timer = this.an;
        if (timer != null) {
            timer.cancel();
            this.an = null;
        } else {
            LogUtil.a("HWChMeasureController", "stopMeasureTimeTask mMeasureTimer == null");
        }
        TimerTask timerTask = this.ah;
        if (timerTask != null) {
            timerTask.cancel();
            this.ah = null;
        } else {
            LogUtil.a("HWChMeasureController", "stopMeasureTimeTask mMeasureTask == null");
        }
    }

    private void k() {
        this.q = false;
        this.ac = false;
        this.y = false;
        this.u = false;
        this.w = false;
    }

    public String a() {
        SharedPreferences sharedPreferences = this.ar;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("weightUser_id", "");
        }
        LogUtil.a("HWChMeasureController", "mSharedPreferences == null");
        return "";
    }

    private void n() {
        if (!Utils.h()) {
            e(dog.c(a()), WeightCmd.ACK_GET_RECORD);
        } else {
            e(dog.c(MultiUsersManager.INSTANCE.getCurrentUser().i()), WeightCmd.ACK_GET_RECORD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(byte[] bArr, WeightCmd weightCmd) {
        LogUtil.a("HWChMeasureController", "safeguardSendData ", weightCmd.name());
        c cVar = this.as;
        if (cVar != null) {
            cVar.b(false);
            this.ak.removeCallbacks(this.as);
        } else {
            LogUtil.a("HWChMeasureController", "safeguardSendData mRun == null");
        }
        this.as = new c(bArr, weightCmd);
        this.k = weightCmd;
        LogUtil.a("HWChMeasureController", "executorService.execute(mRun)");
        this.ak.postDelayed(this.as, 500L);
    }

    public void c() {
        synchronized (this) {
            this.bc.clear();
            this.aw.clear();
            this.al.clear();
            if (!Utils.h()) {
                this.bc.addAll(this.az.c(a()));
            } else {
                this.bc.addAll(this.az.c(MultiUsersManager.INSTANCE.getCurrentUser().i()));
            }
            LogUtil.a("HWChMeasureController", "weight offline data size is :", Integer.valueOf(this.bc.size()));
            if (this.bc.size() > 0) {
                for (dso dsoVar : this.bc) {
                    dsoVar.d(false);
                    if (dsoVar.s()) {
                        this.aw.add(dsoVar);
                    } else {
                        this.al.add(dsoVar);
                    }
                }
                this.h = new enw(10006);
                i();
                int size = this.bc.size();
                if (size > 0) {
                    double dDoubleValue = new BigDecimal(((double) this.aw.size()) / ((double) size)).setScale(2, RoundingMode.DOWN).doubleValue();
                    LogUtil.a("HWChMeasureController", "normal data size ==", this.al.size() + "suspected data size ==" + this.aw.size());
                    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(3);
                    linkedHashMap.put("click", "1");
                    linkedHashMap.put("time", String.valueOf(System.currentTimeMillis()));
                    linkedHashMap.put("proportion", String.valueOf(dDoubleValue));
                    OpAnalyticsUtil.getInstance().setEvent2nd(AnalyticsValue.HEALTH_PLUGIN_DEVICE_WEIGHT_BODYFATSCALE_OFFLINE_DATA_2060029.value(), linkedHashMap);
                }
            } else {
                b bVar = this.ak;
                if (bVar != null) {
                    bVar.sendEmptyMessage(10);
                } else {
                    LogUtil.a("HWChMeasureController", "queryHasOfflineData mMsgHandler == null");
                }
            }
        }
    }

    private void i() {
        ArrayList<HealthData> arrayList = this.al;
        if (arrayList != null && arrayList.size() > 0) {
            LogUtil.a("HWChMeasureController", "insert to data platform");
            this.h.onDataChanged(this.l, this.al);
            if (!Utils.h()) {
                e(a(), this.al);
            } else {
                e(MultiUsersManager.INSTANCE.getCurrentUser().i(), this.al);
            }
            this.ag = true;
        } else {
            LogUtil.a("HWChMeasureController", "suspected weight not insert");
        }
        ArrayList<dso> arrayList2 = this.aw;
        if (arrayList2 != null && arrayList2.size() > 0) {
            b bVar = this.ak;
            if (bVar != null) {
                bVar.sendEmptyMessage(11);
                return;
            } else {
                LogUtil.a("HWChMeasureController", "insertToDataPlatform mMsgHandler == null");
                return;
            }
        }
        if (this.ag) {
            if (dxm.av(this.am)) {
                Context context = this.g;
                qpx.e(context, context.getResources().getString(R.string.IDS_device_offline_sync_data_done));
            } else {
                Context context2 = this.g;
                qpx.e(context2, context2.getResources().getString(R.string.IDS_device_sync_data_done_toast));
            }
            b bVar2 = this.ak;
            if (bVar2 != null) {
                bVar2.sendEmptyMessage(10);
                return;
            } else {
                LogUtil.a("HWChMeasureController", "insertToDataPlatform MSG_SYNC_DATA_DONE mMsgHandler == null");
                return;
            }
        }
        LogUtil.a("HWChMeasureController", "insertToDataPlatform mIsSyncDone false");
    }

    private void e(String str, ArrayList<HealthData> arrayList) {
        if (arrayList != null && str != null) {
            Iterator<HealthData> it = arrayList.iterator();
            while (it.hasNext()) {
                this.az.e(str, it.next().getStartTime());
            }
            return;
        }
        LogUtil.a("HWChMeasureController", "list is empty or currentUid is empty");
    }

    public boolean e() {
        return this.w;
    }

    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            LogUtil.a("HWChMeasureController", "HWChMeasureController receive msg : ", Integer.valueOf(message.what));
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    removeMessages(2);
                    if (dof.this.j < 2) {
                        dof.l(dof.this);
                        dof dofVar = dof.this;
                        dofVar.a(dofVar.f, dof.this.ak);
                        dof.this.ak.sendEmptyMessageDelayed(3, 500L);
                    } else {
                        LogUtil.e("HWChMeasureController", "HWChMeasureController Times IS OUT! The mConnectTryNum = ", Integer.valueOf(dof.this.j));
                    }
                } else if (i == 3) {
                    dof.this.mDevice.connectAsync(null);
                }
            } else if (dof.this.f != null) {
                sendEmptyMessageDelayed(2, 10000L);
                try {
                    LogUtil.a("HWChMeasureController", "Attemping to start service discovery:", Boolean.valueOf(dof.this.f.discoverServices()));
                } catch (SecurityException e) {
                    LogUtil.e("HWChMeasureController", "handleMessage SecurityException:", ExceptionUtils.c(e));
                }
            } else {
                LogUtil.a("HWChMeasureController", "MSG_DISCOVER_SERVICE mBluetoothGatt == null");
            }
            dof.this.c(message.what);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (i == 4) {
            this.mDevice.e();
            return;
        }
        if (i == 10) {
            LogUtil.a("HWChMeasureController", "HWChMeasureController MSG_SYNC_DATA_DONE mType==", Integer.valueOf(this.av));
            int i2 = this.av;
            if (i2 == -1 || i2 == -2) {
                LogUtil.a("HWChMeasureController", "MSG_SYNC_DATA_DONE not cleanup and ending");
                return;
            } else {
                cleanup();
                ending();
                return;
            }
        }
        if (i != 11) {
            return;
        }
        if (!BaseApplication.isRunningForeground() || this.g == null) {
            LogUtil.a("HWChMeasureController", "MSG_HAS_SUSPECTED_DATA BaseApplication.isRunningForeground() false");
        } else {
            if (dxm.av(this.am)) {
                Context context = this.g;
                qpx.e(context, context.getResources().getString(R.string.IDS_device_offline_sync_data_done));
            } else {
                Context context2 = this.g;
                qpx.e(context2, context2.getResources().getString(R.string.IDS_device_sync_data_done_toast));
            }
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getAppPackage(), WeightOfflineDataSelectActivity.class.getName());
            intent.putExtra("productId", this.am);
            intent.addFlags(335544320);
            try {
                this.g.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("HWChMeasureController", "startActivity exception");
            }
        }
        this.ak.sendEmptyMessage(10);
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f32118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f32119c = true;
        private final WeightCmd e;

        c(byte[] bArr, WeightCmd weightCmd) {
            this.f32118b = bArr;
            this.e = weightCmd;
            LogUtil.a("HWChMeasureController", "SendRunCmd ", "ack ", weightCmd.name());
        }

        public void b(boolean z) {
            this.f32119c = z;
            LogUtil.a("HWChMeasureController", "mIsRunning ", Boolean.valueOf(z));
        }

        @Override // java.lang.Runnable
        public void run() {
            dof.this.k = null;
            LogUtil.a("HWChMeasureController", "run isRunning ", Boolean.valueOf(this.f32119c));
            for (int i = 0; this.f32119c && i < 3; i++) {
                if (dof.this.k == this.e) {
                    LogUtil.a("HWChMeasureController", "mExpectAck == enumAck");
                    return;
                }
                LogUtil.a("HWChMeasureController", "mExpectAck != enumAck");
                LogUtil.a("HWChMeasureController", "SendRunCmd enumAck ", this.e.name(), " mExpectAck ");
                dof.this.b(this.f32118b);
            }
        }
    }
}
