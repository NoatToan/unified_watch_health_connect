package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.btsportdevice.callback.CallbackBetweenClientAndController;
import com.huawei.btsportdevice.callback.DataLifecycle;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.ecologydevice.R;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.device.PluginDeviceAdapter;
import com.huawei.health.device.api.PluginDeviceApi;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.device.datatype.IntermitentJumpData;
import com.huawei.health.device.datatype.SkippingTargetMode;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.callback.BroadcastObserver;
import com.huawei.health.ecologydevice.fitness.BroadcastSubscribeCenter;
import com.huawei.health.ecologydevice.fitness.ConnectionController;
import com.huawei.health.ecologydevice.fitness.ScannerController;
import com.huawei.health.ecologydevice.fitness.datastruct.DeviceInformation;
import com.huawei.health.ecologydevice.fitness.util.RopeStateMonitor;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginbase.PluginBaseAdapter;
import health.compact.a.CommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class egn extends AbstractFitnessClient implements BroadcastObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RopeStateMonitor f32946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BluetoothAdapter f32947c;
    private ConnectionController d;
    private BluetoothManager e;
    private String f;
    private int g;
    private String j;
    private c m;
    private String p;
    private ego q;
    private ScannerController r;
    private final Object o = new Object();
    private final Object n = new Object();
    private String i = "";
    private ExtendHandler h = null;
    private volatile boolean k = false;
    private SkippingTargetMode t = new SkippingTargetMode();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CallbackBetweenClientAndController f32945a = new CallbackBetweenClientAndController() { // from class: egn.2
        @Override // com.huawei.btsportdevice.callback.CallbackBetweenClientAndController
        public void onDisconnect() {
        }

        @Override // com.huawei.btsportdevice.callback.CallbackBetweenClientAndController
        public void onStopByUser() {
        }

        @Override // com.huawei.btsportdevice.callback.CallbackBetweenClientAndController
        public void setBreakBySelf(boolean z) {
        }

        @Override // com.huawei.btsportdevice.callback.CallbackBetweenClientAndController
        public void notifyStateChanged(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 5;
            messageObtain.obj = str;
            egn.this.h.sendMessage(messageObtain);
        }

        @Override // com.huawei.btsportdevice.callback.CallbackBetweenClientAndController
        public void notifyDataChange(int i, Bundle bundle) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 6;
            messageObtain.arg1 = i;
            messageObtain.setData(bundle);
            egn.this.h.sendMessage(messageObtain);
        }
    };
    private eht l = new eht();

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void cancelPairing() {
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void disconnect(boolean z) {
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public boolean reConnect() {
        return false;
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void sendByteToEquip(byte[] bArr) {
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void setHasExperiencedStateOfStartForFtmp(boolean z) {
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void setHeartRateFromWearable(int i) {
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void setRealStartWorkout() {
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void stopThreadsInCsafeController() {
    }

    public egn() {
        h();
        l();
        i();
    }

    private void h() {
        if (this.f32947c != null) {
            LogUtil.a("PDROPE_RopeFitnessClient", "Init already.");
            return;
        }
        if (this.e == null && (BaseApplication.getContext().getSystemService("bluetooth") instanceof BluetoothManager)) {
            this.e = (BluetoothManager) BaseApplication.getContext().getSystemService("bluetooth");
        }
        BluetoothManager bluetoothManager = this.e;
        if (bluetoothManager == null) {
            LogUtil.e("PDROPE_RopeFitnessClient", "Unable to initAdapter BluetoothManager.");
            return;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f32947c = adapter;
        if (adapter == null) {
            LogUtil.e("PDROPE_RopeFitnessClient", "Unable to obtain BluetoothAdapter.");
        }
    }

    private void l() {
        if (this.h == null) {
            this.h = HandlerCenter.b(new d(), "PDROPE_RopeFitnessClient");
        }
    }

    private void i() {
        BroadcastSubscribeCenter.c().e(Arrays.asList(BroadcastObserver.BLUE_STATE_TYPE), "PDROPE_RopeFitnessClient", this);
        BroadcastSubscribeCenter.c().b();
    }

    public egn b(String str, MessageOrStateCallback messageOrStateCallback, boolean z, List<Integer> list) {
        synchronized (this.o) {
            LogUtil.a("PDROPE_RopeFitnessClient", "new context: ", str);
            eht ehtVar = this.l;
            if (ehtVar != null) {
                ehtVar.b(str, messageOrStateCallback, list);
            }
            if (z) {
                k();
            }
        }
        return this;
    }

    private void k() {
        PluginDeviceAdapter pluginDeviceAdapterA;
        if (this.m == null) {
            this.m = new c();
        }
        PluginDeviceApi pluginDeviceApi = (PluginDeviceApi) Services.b("PluginDevice", PluginDeviceApi.class);
        PluginBaseAdapter adapter = pluginDeviceApi.getAdapter();
        if (adapter instanceof PluginDeviceAdapter) {
            pluginDeviceAdapterA = (PluginDeviceAdapter) adapter;
        } else {
            pluginDeviceApi.init(BaseApplication.getContext());
            pluginDeviceApi.setAdapter(eif.a());
            pluginDeviceAdapterA = eif.a();
        }
        if (pluginDeviceAdapterA == null) {
            LogUtil.j("PDROPE_RopeFitnessClient", "PluginDeviceAdapter is null, DataLifecycle will not work");
        } else {
            pluginDeviceAdapterA.registerStatusFromService(this.m);
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void connectByMac(boolean z, final String str) {
        synchronized (this) {
            ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeFitnessClient", "in connectByMac:", CommonUtil.n(str));
            if (c(str)) {
                ScannerController scannerController = this.r;
                if (scannerController != null) {
                    scannerController.e();
                }
                ego egoVar = new ego(this.f32945a, this.n);
                this.q = egoVar;
                ConnectionController connectionController = new ConnectionController(egoVar, this.n);
                this.d = connectionController;
                connectionController.a(new ConnectionController.ConnectResultCallback() { // from class: egp
                    @Override // com.huawei.health.ecologydevice.fitness.ConnectionController.ConnectResultCallback
                    public final void onResult(int i) {
                        this.f32952b.e(str, i);
                    }
                });
                this.k = false;
                this.g = 5;
                this.q.e(str);
                this.d.e(str);
                this.j = str;
            }
        }
    }

    /* synthetic */ void e(String str, int i) {
        ego egoVar;
        LogUtil.a("PDROPE_RopeFitnessClient", "Result code = ", Integer.valueOf(i));
        if (i != 1) {
            if (i == 2) {
                this.h.sendEmptyMessage(2);
                return;
            }
            if (i != 4) {
                switch (i) {
                    case 10:
                        this.g = 6;
                        this.k = false;
                        ConnectionController connectionController = this.d;
                        if (connectionController != null && (egoVar = this.q) != null) {
                            egoVar.a(connectionController.b());
                        }
                        this.l.a(AbstractFitnessClient.ACTION_GATT_STATE_CONNECTED);
                        r();
                        this.f = str;
                        break;
                    case 12:
                        this.g = 5;
                        this.l.a(AbstractFitnessClient.ACTION_GATT_STATE_CONNECTING);
                        this.k = false;
                        break;
                }
                return;
            }
        }
        j();
    }

    private boolean c(String str) {
        if (this.f32947c == null || TextUtils.isEmpty(str)) {
            LogUtil.j("PDROPE_RopeFitnessClient", "BluetoothAdapter not initialized or unspecified address.");
            return false;
        }
        int i = this.g;
        boolean z = i == 5 || i == 6;
        if (!str.equals(this.j) || !z) {
            return true;
        }
        LogUtil.d("PDROPE_RopeFitnessClient", "Trying to use an existing mBluetoothGatt for connection.");
        return false;
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void removeMessageOrStateCallback(String str, boolean z) {
        LogUtil.a("PDROPE_RopeFitnessClient", "releaseResource, isNoneCallbackLeft = ", Boolean.valueOf(d(str)));
        if (z) {
            s();
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void releaseResource() {
        ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeFitnessClient", "releaseResource closeBluetoothGatt");
        eht ehtVar = this.l;
        if (ehtVar != null) {
            ehtVar.a(AbstractFitnessClient.ACTION_GATT_STATE_DISCONNECTED);
            this.l.a();
        }
        BroadcastSubscribeCenter.c().e(Arrays.asList(BroadcastObserver.BLUE_STATE_TYPE), "PDROPE_RopeFitnessClient");
        s();
        f();
        t();
    }

    private void s() {
        if (this.m != null) {
            this.m = null;
        }
    }

    private boolean d(String str) {
        eht ehtVar = this.l;
        if (ehtVar == null) {
            return true;
        }
        ehtVar.b(str);
        return this.l.b();
    }

    private void f() {
        eht ehtVar = this.l;
        if (ehtVar != null) {
            ehtVar.b(TypedValues.Custom.TYPE_REFERENCE, null);
        }
    }

    private void t() {
        n();
        g();
    }

    private void n() {
        RopeStateMonitor ropeStateMonitor = this.f32946b;
        if (ropeStateMonitor != null) {
            ropeStateMonitor.a();
            this.f32946b = null;
        }
    }

    private void g() {
        synchronized (this.o) {
            ScannerController scannerController = this.r;
            if (scannerController != null) {
                scannerController.e();
                this.r.d(null);
            }
            if (!this.k) {
                this.k = true;
                this.l.a(AbstractFitnessClient.ACTION_GATT_STATE_DISCONNECTED);
            }
            ConnectionController connectionController = this.d;
            if (connectionController != null) {
                connectionController.a();
            }
            this.q = null;
            this.j = "";
            this.f = "";
            this.g = 8;
            m();
        }
    }

    private void m() {
        if (this.h != null) {
            LogUtil.a("PDROPE_RopeFitnessClient", "msgHandler will removeCallbacksAndMessages");
            this.h.removeTasksAndMessages();
            this.h.quit(false);
        }
    }

    public void a(SkippingTargetMode skippingTargetMode) {
        this.t = skippingTargetMode;
    }

    public void b(String str) {
        if (this.g != 6) {
            return;
        }
        ego egoVar = this.q;
        if (egoVar == null) {
            LogUtil.a("PDROPE_RopeFitnessClient", "mFitnessController is null, device information has not been obtained yet.");
            return;
        }
        DeviceInformation deviceInformationC = egoVar.c();
        if (deviceInformationC != null && this.l != null) {
            LogUtil.a("PDROPE_RopeFitnessClient", "Send device information to newly registered callback.");
            Bundle bundle = new Bundle();
            bundle.putInt("com.huawei.health.fitness.KEY_MESSAGE_FITNESS_DATA_TYPE", deviceInformationC.getFitnessDataType());
            bundle.putSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA", deviceInformationC.getFitnessHashMap());
            this.l.b(str, 902, bundle);
            return;
        }
        c();
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void setFitnessMachineControl(int i, int[] iArr) {
        if (o()) {
            LogUtil.a("PDROPE_RopeFitnessClient", "setFitnessMachineControl For FTMP");
            this.q.a(i, iArr);
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void setFitnessMachineControl(int i, int i2, int[] iArr) {
        if (o()) {
            LogUtil.a("PDROPE_RopeFitnessClient", "setFitnessMachineControl For FTMP");
            this.q.a(i, i2, iArr);
        }
    }

    public void a(int i, int i2, int[] iArr) {
        if (o()) {
            LogUtil.a("PDROPE_RopeFitnessClient", "setFitnessRopeConfig For Rope");
            this.q.d(i, i2, iArr);
        }
    }

    private boolean o() {
        return this.q != null && this.g == 6;
    }

    public boolean c() {
        if (!o()) {
            return false;
        }
        LogUtil.a("PDROPE_RopeFitnessClient", "getDeviceInfo");
        return this.q.a(4, 0, new int[]{0});
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public String getCurrentMacAddress() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.o) {
            qpx.e(HuaweiHealth.a(), HuaweiHealth.a().getResources().getString(R.string.IDS_device_switch_device_connect_fail));
            g();
            LogUtil.a("PDROPE_RopeFitnessClient", "connectionFailed");
        }
    }

    public int b() {
        return this.g;
    }

    public String e() {
        return this.f;
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void setDeviceType(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.i = str;
        } else {
            LogUtil.e("PDROPE_RopeFitnessClient", "setDeviceType deviceType is null");
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void connectByName(boolean z, String str) {
        LogUtil.a("PDROPE_RopeFitnessClient", "in connectByName");
    }

    public String d() {
        return this.p;
    }

    public void a(String str) {
        this.p = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.q == null || TextUtils.isEmpty(this.p)) {
            LogUtil.a("PDROPE_RopeFitnessClient", "mFitnessController is null, device information has not been obtained yet.");
            return;
        }
        DeviceInformation deviceInformationC = this.q.c();
        if (deviceInformationC == null || TextUtils.isEmpty(deviceInformationC.getSerialNumber())) {
            return;
        }
        new etp.b().e(deviceInformationC.getModelString()).b(deviceInformationC.getHardwareVersion()).c(deviceInformationC.getManufacturerString()).h(deviceInformationC.getSoftwareVersion()).d(deviceInformationC.getSerialNumber()).a(this.p).b().e();
    }

    private void r() {
        String strName;
        elh elhVarD = ResourceManager.c().d(this.p);
        if (elhVarD == null) {
            return;
        }
        HashMap map = new HashMap(4);
        if (elhVarD.m() == null) {
            strName = "";
        } else {
            strName = elhVarD.m().name();
        }
        map.put("kind_name", strName);
        String strB = era.b(this.p);
        map.put("smartProductId", strB);
        map.put("device_name", etn.c(this.p));
        map.put("data_type", 283);
        map.put("prodId", strB);
        map.put("macAfterSha256", erh.d(erh.a(this.j)));
        map.put("macAfterSha256_2", erh.d(this.j));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_GYM_EQUIP_CONNECT_RESULT_2170003.value(), map, 0);
    }

    @Override // com.huawei.health.ecologydevice.callback.BroadcastObserver
    public void onNotify(int i, BluetoothDevice bluetoothDevice) {
        if (i == 1) {
            LogUtil.a("PDROPE_RopeFitnessClient", "BluetoothAdapter.BLUETOOTH_SWITCH_ON");
        } else {
            if (i != 2) {
                return;
            }
            LogUtil.a("PDROPE_RopeFitnessClient", "BluetoothAdapter.BLUETOOTH_SWITCH_OFF");
            this.h.sendEmptyMessage(4);
        }
    }

    class c implements DataLifecycle {
        private c() {
        }

        @Override // com.huawei.btsportdevice.callback.DataLifecycle
        public void init() {
            LogUtil.a("PDROPE_RopeFitnessClient", "RopeLifecycle.init()");
            egn.this.w();
        }

        @Override // com.huawei.btsportdevice.callback.DataLifecycle
        public void onPause() {
            LogUtil.a("PDROPE_RopeFitnessClient", "RopeLifecycle.onPause()");
            egn.this.setFitnessMachineControl(4, null);
        }

        @Override // com.huawei.btsportdevice.callback.DataLifecycle
        public void onResume() {
            LogUtil.a("PDROPE_RopeFitnessClient", "RopeLifecycle.onResume()");
            egn.this.setFitnessMachineControl(5, null);
        }

        @Override // com.huawei.btsportdevice.callback.DataLifecycle
        public void onStart() {
            LogUtil.a("PDROPE_RopeFitnessClient", "RopeLifecycle.onStart()");
            if (egn.this.t == null || egn.this.q == null || egn.this.g != 6) {
                return;
            }
            int startMode = egn.this.t.getStartMode();
            int goal = egn.this.t.getGoal();
            if ((startMode != 5 && startMode != 0 && startMode != 11) || goal > 0) {
                if (!egn.this.a(startMode, goal) || egn.this.l == null) {
                    return;
                }
                egn.this.l.b(901, null);
                egn.this.l.b(1000, null);
                return;
            }
            LogUtil.a("PDROPE_RopeFitnessClient", "Currently in ", "startMode = ", Integer.valueOf(startMode), ", you need to set the target first.");
        }

        @Override // com.huawei.btsportdevice.callback.DataLifecycle
        public void onDestroy() {
            LogUtil.a("PDROPE_RopeFitnessClient", "RopeLifecycle.onDestroy()");
            egn.this.setFitnessMachineControl(6, null);
            if (egn.this.l != null) {
                egn.this.l.b(1001, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, int i2) {
        if (i == 0) {
            return this.q.a(3, 2, new int[]{i2});
        }
        if (i == 5) {
            return this.q.a(3, 3, new int[]{i2});
        }
        switch (i) {
            case 7:
                return this.q.a(3, 9, null);
            case 8:
                return q();
            case 9:
                return this.q.a(3, 11, new int[]{65535});
            case 10:
                return this.q.a(3, 11, new int[]{i2});
            case 11:
                return this.q.a(3, 12, new int[]{i2});
            default:
                return this.q.a(3, 1, null);
        }
    }

    private boolean q() {
        int[] iArr = new int[4];
        IntermitentJumpData intermitentJumpData = this.t.getIntermitentJumpData();
        if (intermitentJumpData == null) {
            return false;
        }
        iArr[0] = intermitentJumpData.getIntermittentJumpExerciseTime();
        iArr[1] = intermitentJumpData.getIntermittentJumpExerciseNum();
        iArr[2] = intermitentJumpData.getIntermittentJumpBreakTime();
        iArr[3] = intermitentJumpData.getIntermittentJumpGroups();
        return this.q.a(3, 10, iArr);
    }

    class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeFitnessClient", "DISCONNECT_WHEN_TIMEOUT");
                    egn.this.j();
                    return true;
                case 2:
                    egn.this.p();
                    return true;
                case 3:
                    egn.this.h.removeTasksAndMessages();
                    if (egn.this.d != null) {
                        egn.this.d.c(1);
                        egn.this.d.e(egn.this.j);
                    }
                    return true;
                case 4:
                    LogUtil.j("PDROPE_RopeFitnessClient", "BLUETOOTH_SWITCH_OFF");
                    egn.this.j();
                    return true;
                case 5:
                    if (egn.this.l != null) {
                        egn.this.l.a(String.valueOf(message.obj));
                    }
                    return true;
                case 6:
                    if (egn.this.l != null) {
                        egn.this.l.b(message.arg1, message.getData());
                    }
                    return true;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("PDROPE_RopeFitnessClient", "startScannerDevice");
        ScannerController scannerController = new ScannerController(this.j);
        this.r = scannerController;
        scannerController.d(new ScannerController.ScanResultCallback() { // from class: egl
            @Override // com.huawei.health.ecologydevice.fitness.ScannerController.ScanResultCallback
            public final void onResult(int i, HealthDevice healthDevice) {
                this.f32943b.a(i, healthDevice);
            }
        });
        this.r.a();
    }

    /* synthetic */ void a(int i, HealthDevice healthDevice) {
        ScannerController scannerController = this.r;
        if (scannerController != null) {
            scannerController.e();
        }
        ReleaseLogUtil.d("R_EcologyDevice_PDROPE_RopeFitnessClient", "ScannerController code = ", Integer.valueOf(i));
        if (i == 1 && this.d != null && healthDevice != null) {
            this.h.sendEmptyMessage(3);
        } else if (i == 2 || i == 3) {
            j();
        } else {
            LogUtil.d("PDROPE_RopeFitnessClient", "other branch");
            j();
        }
        this.r = null;
    }

    public DeviceInformation a() {
        ego egoVar = this.q;
        return (egoVar == null || egoVar.c() == null) ? new DeviceInformation() : this.q.c();
    }
}
