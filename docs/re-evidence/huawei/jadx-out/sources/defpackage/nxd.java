package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelUuid;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.btsportdevice.callback.CallbackBetweenClientAndController;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.health.ecologydevice.callback.BroadcastObserver;
import com.huawei.health.ecologydevice.fitness.BroadcastSubscribeCenter;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.MachineStatus;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class nxd extends AbstractFitnessClient implements BroadcastObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f43877b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    BluetoothDevice f43879c;
    BluetoothAdapter d;
    private BluetoothGatt e;
    private String g;
    private int i;
    private BluetoothManager j;
    private nxj k;
    private nxi o;
    private int r;
    private boolean t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f43878a = "";
    private boolean s = false;
    private String m = "";
    private ExtendHandler l = null;
    private boolean p = false;
    private int ac = 0;
    private boolean ad = false;
    private boolean w = false;
    private String h = "";
    private volatile boolean u = false;
    private volatile boolean y = false;
    private boolean q = false;
    private boolean x = false;
    private boolean v = false;
    private boolean aa = false;
    private final BluetoothGattCallback n = new BluetoothGattCallback() { // from class: nxd.1
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            nxd.this.e(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            nxd.this.a(bluetoothGatt, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            LogUtil.a("Track_IDEQ_FitnessClient", "onCharacteristicRead");
            if (i == 0) {
                nxd.this.s();
                nxd.this.o.c(bluetoothGatt, bluetoothGattCharacteristic, i);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            nxd.this.s();
            nxd.this.o.b(bluetoothGatt, bluetoothGattCharacteristic);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            nxd.this.o.e(bluetoothGatt, bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            LogUtil.d("Track_IDEQ_FitnessClient", "onDescriptorRead");
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            LogUtil.d("Track_IDEQ_FitnessClient", "onDescriptorWrite");
            nxd.this.o.e(bluetoothGatt, bluetoothGattDescriptor, i);
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            LogUtil.d("Track_IDEQ_FitnessClient", "onReadRemoteRssi");
            super.onReadRemoteRssi(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
            LogUtil.d("Track_IDEQ_FitnessClient", "onReliableWriteCompleted");
            super.onReliableWriteCompleted(bluetoothGatt, i);
        }
    };
    private ScanCallback z = new ScanCallback() { // from class: nxd.4
        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            LogUtil.d("Track_IDEQ_FitnessClient", "onLeScan");
            if (scanResult != null) {
                try {
                    if (scanResult.getDevice() == null) {
                        return;
                    }
                    boolean z = false;
                    LogUtil.a("Track_IDEQ_FitnessClient", "get device in scanning: ", scanResult.getDevice().getName());
                    boolean z2 = !TextUtils.isEmpty(nxd.this.h) && nxd.this.h.equals(scanResult.getDevice().getName());
                    if (!TextUtils.isEmpty(nxd.this.f43878a) && nxd.this.f43878a.equals(scanResult.getDevice().getAddress())) {
                        z = true;
                    }
                    if (z2 || z) {
                        nxd nxdVar = nxd.this;
                        nxdVar.aa = nxdVar.d(scanResult);
                        nxd.this.a(scanResult.getDevice());
                    }
                } catch (SecurityException e) {
                    LogUtil.e("Track_IDEQ_FitnessClient", "onScanResult SecurityException:", ExceptionUtils.c(e));
                }
            }
        }
    };
    private CallbackBetweenClientAndController f = new CallbackBetweenClientAndController() { // from class: nxd.5
        @Override // com.huawei.btsportdevice.callback.CallbackBetweenClientAndController
        public void setBreakBySelf(boolean z) {
        }

        @Override // com.huawei.btsportdevice.callback.CallbackBetweenClientAndController
        public void onDisconnect() {
            nxd.this.disconnect(false);
        }

        @Override // com.huawei.btsportdevice.callback.CallbackBetweenClientAndController
        public void onStopByUser() {
            if (nxd.this.l != null) {
                nxd.this.l.removeMessages(6);
            }
        }

        @Override // com.huawei.btsportdevice.callback.CallbackBetweenClientAndController
        public void notifyStateChanged(String str) {
            if (nxd.this.k != null) {
                nxd.this.k.a(str);
            }
        }

        @Override // com.huawei.btsportdevice.callback.CallbackBetweenClientAndController
        public void notifyDataChange(int i, Bundle bundle) {
            if (nxd.this.k != null) {
                nxd.this.k.c(i, bundle);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(int i) {
        return i == 1;
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void setFitnessMachineControl(int i, int i2, int[] iArr) {
    }

    public void h() {
        this.k = new nxj();
        q();
        BroadcastSubscribeCenter.c().e(Arrays.asList(BroadcastObserver.BLUE_STATE_TYPE), "Track_IDEQ_FitnessClient", this);
        BroadcastSubscribeCenter.c().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        ExtendHandler extendHandler = this.l;
        if (extendHandler != null) {
            extendHandler.removeMessages(6);
            this.l.sendEmptyMessage(6, 6000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothGatt bluetoothGatt, int i) {
        LogUtil.a("Track_IDEQ_FitnessClient", "onServicesDiscovered status: ", Integer.valueOf(i));
        ExtendHandler extendHandler = this.l;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
        }
        try {
            if (i == 0) {
                LogUtil.j("Track_IDEQ_FitnessClient", "onServicesDiscovered GATT_SUCCESS received: ", Integer.valueOf(i));
                if (this.u && this.s) {
                    this.u = false;
                    nxi nxiVar = this.o;
                    if (nxiVar != null) {
                        nxiVar.c(bluetoothGatt, i);
                    }
                } else {
                    nxi nxiVar2 = this.o;
                    if (nxiVar2 != null) {
                        nxiVar2.b(bluetoothGatt, i);
                    }
                }
                this.s = true;
                return;
            }
            BluetoothGatt bluetoothGatt2 = this.e;
            if (bluetoothGatt2 == null || bluetoothGatt2.getDevice().getUuids() != null) {
                return;
            }
            LogUtil.j("Track_IDEQ_FitnessClient", "onServicesDiscovered received: ", Integer.valueOf(i));
        } catch (SecurityException e) {
            LogUtil.e("Track_IDEQ_FitnessClient", "doServicesDiscovered SecurityException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    public void e(BluetoothGatt bluetoothGatt, int i, int i2) {
        String name;
        LogUtil.a("Track_IDEQ_FitnessClient", "oldStatus:", Integer.valueOf(i), " NewStates:", Integer.valueOf(i2));
        if (bluetoothGatt != null) {
            try {
                if (bluetoothGatt.getDevice() != null) {
                    name = bluetoothGatt.getDevice().getName();
                } else {
                    name = Constants.LINK;
                }
            } catch (SecurityException e) {
                LogUtil.e("Track_IDEQ_FitnessClient", "updateConnectionState SecurityException:", ExceptionUtils.c(e));
                return;
            }
        } else {
            name = Constants.LINK;
        }
        this.w = false;
        this.i = i2;
        if (i2 == 2) {
            d(bluetoothGatt);
            return;
        }
        if (i2 == 0) {
            g(name);
            return;
        }
        if (i2 == 1) {
            LogUtil.a("Track_IDEQ_FitnessClient", "connecting from GATT server.");
            e(AbstractFitnessClient.ACTION_GATT_STATE_CONNECTING);
        } else if (i2 == 3) {
            LogUtil.a("Track_IDEQ_FitnessClient", "disconnecting from GATT server.");
            e(AbstractFitnessClient.ACTION_GATT_STATE_DISCONNECTING);
        } else {
            g(name);
        }
    }

    public final void e(String str, MessageOrStateCallback messageOrStateCallback) {
        LogUtil.a("Track_IDEQ_FitnessClient", "callbackKey = " + str);
        nxj nxjVar = this.k;
        if (nxjVar != null) {
            nxjVar.b(str, messageOrStateCallback);
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void setDeviceType(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.m = str;
        } else {
            LogUtil.e("Track_IDEQ_FitnessClient", "setDeviceType deviceType is null");
        }
    }

    private void g(String str) {
        LogUtil.a("Track_IDEQ_FitnessClient", "Disconnected from GATT server.");
        nxi nxiVar = this.o;
        if (nxiVar != null) {
            nxiVar.c(false);
        }
        if (this.y) {
            LogUtil.a("Track_IDEQ_FitnessClient", "reConnection timed out. Releasing resources.");
            return;
        }
        ExtendHandler extendHandler = this.l;
        if (extendHandler != null) {
            extendHandler.removeMessages(6);
        }
        ab();
        this.u = true;
        this.q = false;
        if (this.t) {
            return;
        }
        if (this.ac <= 2) {
            c(str);
        } else {
            b(str);
        }
    }

    private void c(String str) {
        LogUtil.a("Track_IDEQ_FitnessClient", "The connection fails. The reconnection is initiated. The number of reConnections is ", Integer.valueOf(this.ac));
        e(AbstractFitnessClient.ACTION_GATT_STATE_RECONNECTING);
        nxo nxoVar = new nxo();
        nxoVar.g("Yes");
        nxoVar.a(this.ac);
        if (c(this.r)) {
            str = Constants.LINK;
        }
        nxoVar.f(str);
        nxoVar.c(this.g);
        nzc.e(HuaweiHealth.a(), nxoVar);
        a();
        v();
        ExtendHandler extendHandler = this.l;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(3, 1000L);
        }
    }

    private void b(String str) {
        LogUtil.a("Track_IDEQ_FitnessClient", "The number of reConnections exceeds the maximum.");
        e(AbstractFitnessClient.ACTION_GATT_STATE_DISCONNECTED);
        nxo nxoVar = new nxo();
        nxoVar.g("No");
        nxoVar.a(this.ac);
        if (c(this.r)) {
            str = Constants.LINK;
        }
        nxoVar.f(str);
        nxoVar.c(this.g);
        nzc.e(HuaweiHealth.a(), nxoVar);
        c();
        this.ac = 0;
        ExtendHandler extendHandler = this.l;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
        }
        if (this.o != null) {
            LogUtil.a("Track_IDEQ_FitnessClient", "Reconnection failed.");
            b(false, true, false, false);
        }
    }

    private void d(BluetoothGatt bluetoothGatt) {
        if (this.q) {
            LogUtil.a("Track_IDEQ_FitnessClient", "stateIsConnect bt has connected");
            return;
        }
        ExtendHandler extendHandler = this.l;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
        }
        this.e = bluetoothGatt;
        nxi nxiVar = this.o;
        if (nxiVar != null) {
            nxiVar.d(bluetoothGatt);
        }
        this.ac = 0;
        this.q = true;
        LogUtil.a("Track_IDEQ_FitnessClient", "Connected to GATT server.");
        if (this.u) {
            e(AbstractFitnessClient.ACTION_GATT_STATE_RECONNECTED);
        } else {
            e(AbstractFitnessClient.ACTION_GATT_STATE_CONNECTED);
        }
        if (this.v) {
            return;
        }
        o();
    }

    public void o() {
        ExtendHandler extendHandler = this.l;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(5, 10000L);
            this.l.sendEmptyMessage(0);
        }
    }

    public DeviceInformation j() {
        nxi nxiVar = this.o;
        if (nxiVar != null) {
            return nxiVar.h();
        }
        return null;
    }

    public void l() {
        nxi nxiVar = this.o;
        if (nxiVar != null) {
            nxiVar.f();
        }
    }

    public void k() {
        if (!BleConstants.SPORT_TYPE_BIKE.equals(this.m)) {
            LogUtil.j("Track_IDEQ_FitnessClient", "deviceType is ", this.m);
            return;
        }
        LogUtil.a("Track_IDEQ_FitnessClient", "sendResitanceRange");
        if (this.k != null) {
            nxi nxiVar = this.o;
            if (nxiVar instanceof nxl) {
                ((nxl) nxiVar).e();
            }
        }
    }

    public void r() {
        nxj nxjVar = this.k;
        if (nxjVar != null) {
            nxjVar.e();
        }
    }

    public void g() {
        nxj nxjVar = this.k;
        if (nxjVar != null) {
            nxjVar.c(TypedValues.Custom.TYPE_REFERENCE, null);
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void setHeartRateFromWearable(int i) {
        nxi nxiVar = this.o;
        if (nxiVar != null) {
            nxiVar.a(i);
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void setRealStartWorkout() {
        nxi nxiVar = this.o;
        if (nxiVar != null) {
            nxiVar.i();
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public String getCurrentMacAddress() {
        return this.g;
    }

    private boolean q() {
        if (this.j == null && (HuaweiHealth.a().getSystemService("bluetooth") instanceof BluetoothManager)) {
            this.j = (BluetoothManager) HuaweiHealth.a().getSystemService("bluetooth");
        }
        BluetoothManager bluetoothManager = this.j;
        if (bluetoothManager == null) {
            LogUtil.e("Track_IDEQ_FitnessClient", "Unable to initialize BluetoothManager.");
            return false;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.d = adapter;
        if (adapter == null) {
            LogUtil.e("Track_IDEQ_FitnessClient", "Unable to obtain BluetoothAdapter.");
            return false;
        }
        this.l = HandlerCenter.b(new a(), "Track_IDEQ_FitnessClient");
        this.r = 1;
        return true;
    }

    public void n() {
        ExtendHandler extendHandler = this.l;
        if (extendHandler != null) {
            extendHandler.quit(false);
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void connectByMac(boolean z, String str) {
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FitnessClient", "in connectByMac：", CommonUtil.n(str));
        if (this.d == null || TextUtils.isEmpty(str)) {
            LogUtil.j("Track_IDEQ_FitnessClient", "BluetoothAdapter not initialized or unspecified address.");
            this.f43879c = null;
        } else {
            if (str.equals(this.g) && this.e != null) {
                LogUtil.d("Track_IDEQ_FitnessClient", "Trying to use an existing mBluetoothGatt for connection.");
                return;
            }
            c(z);
            this.f43878a = str;
            LogUtil.d("Track_IDEQ_FitnessClient", "in connectByMac,mac:", str);
            ad();
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public boolean reConnect() {
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FitnessClient", "reconnect!");
        ExtendHandler extendHandler = this.l;
        if (extendHandler == null) {
            LogUtil.j("Track_IDEQ_FitnessClient", "Handler is null");
            return false;
        }
        extendHandler.removeMessages(6);
        if (this.d == null) {
            LogUtil.j("Track_IDEQ_FitnessClient", "BluetoothAdapter not initialized or unspecified address.");
            return false;
        }
        try {
            if (!TextUtils.isEmpty(this.g)) {
                this.f43879c = this.d.getRemoteDevice(this.g);
            } else {
                LogUtil.a("Track_IDEQ_FitnessClient", "in reConnect, mac addr is empty");
                this.f43879c = null;
            }
            if (this.f43879c == null) {
                LogUtil.j("Track_IDEQ_FitnessClient", "Device not found. Unable to connect.");
                return false;
            }
            BluetoothGatt bluetoothGatt = this.e;
            if (bluetoothGatt != null) {
                bluetoothGatt.close();
                this.e = null;
            }
            ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FitnessClient", "Record the number of reConnections : ", Integer.valueOf(this.ac));
            this.e = this.f43879c.connectGatt(HuaweiHealth.a(), false, this.n);
            this.y = false;
            if (this.ac == 0) {
                ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FitnessClient", "Start counting down 30 seconds.");
                this.l.sendEmptyMessage(5, 30000L);
            }
            this.ac++;
            return true;
        } catch (SecurityException e) {
            LogUtil.e("Track_IDEQ_FitnessClient", "reConnect SecurityException:", ExceptionUtils.c(e));
            return false;
        }
    }

    public void e(String str, String str2) {
        this.v = true;
        if (!TextUtils.isEmpty(str2)) {
            connectByMac(true, str2);
        } else {
            connectByName(true, str);
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void connectByName(boolean z, String str) {
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FitnessClient", "in connectByName ", str);
        if (this.d == null || TextUtils.isEmpty(str)) {
            LogUtil.j("Track_IDEQ_FitnessClient", "BluetoothAdapter not initialized or unspecified name.");
            return;
        }
        c(z);
        this.h = str;
        LogUtil.a("Track_IDEQ_FitnessClient", "in connectByName and now will start to scan devices");
        ad();
    }

    private void c(boolean z) {
        if (this.l == null) {
            LogUtil.e("Track_IDEQ_FitnessClient", "initConnectPrepare,mExtendHandler is null,create");
            this.l = HandlerCenter.b(new a(), "Track_IDEQ_FitnessClient");
        }
        if ("31".equals(this.m)) {
            this.l.sendEmptyMessage(5, 10000L);
        } else {
            this.l.sendEmptyMessage(5, 30000L);
        }
        this.r = z ? 1 : 0;
        if (this.ad) {
            this.ad = false;
            this.l.removeMessages(7);
            try {
                BluetoothLeScanner bluetoothLeScanner = this.d.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan(this.z);
                }
            } catch (SecurityException e) {
                LogUtil.e("Track_IDEQ_FitnessClient", "initConnectPrepare SecurityException:", ExceptionUtils.c(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothDevice bluetoothDevice) {
        LogUtil.a("Track_IDEQ_FitnessClient", "in connectDevice");
        if (bluetoothDevice == null) {
            return;
        }
        if (this.l == null) {
            this.l = HandlerCenter.b(new a(), "Track_IDEQ_FitnessClient");
        }
        if (this.d == null) {
            LogUtil.j("Track_IDEQ_FitnessClient", "BluetoothAdapter not initialized (in connectDevice)");
            return;
        }
        try {
            String address = bluetoothDevice.getAddress();
            if (address.equals(this.g) && this.e != null) {
                LogUtil.d("Track_IDEQ_FitnessClient", "Trying to use an existing mBluetoothGatt for connection (in connectDevice)");
                return;
            }
            this.g = address;
            if (c(this.r)) {
                this.o = new nxl(this.e, this.f, f43877b);
            } else {
                this.o = new nxf(this.e, this.f, f43877b);
            }
            this.o.d(this.m);
            BluetoothGatt bluetoothGatt = this.e;
            if (bluetoothGatt != null) {
                bluetoothGatt.close();
                this.e = null;
            }
            this.ac = 0;
            this.y = false;
            this.q = false;
            this.t = false;
            this.e = bluetoothDevice.connectGatt(HuaweiHealth.a(), false, this.n);
            LogUtil.d("Track_IDEQ_FitnessClient", "Trying to create new connection (in connectDevice)");
            this.l.sendEmptyMessage(5, 10000L);
        } catch (SecurityException e) {
            LogUtil.e("Track_IDEQ_FitnessClient", "connectDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    public boolean a(Bundle bundle) {
        if (!(this.o instanceof nxl) || bundle == null || !(bundle.getSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA") instanceof HashMap)) {
            return false;
        }
        MachineStatus machineStatus = new MachineStatus();
        machineStatus.setFitnessHashMap((HashMap) bundle.getSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA"));
        return ((nxl) this.o).e(machineStatus);
    }

    public boolean e(Bundle bundle) {
        if (!(this.o instanceof nxl) || bundle == null || !(bundle.getSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA") instanceof HashMap)) {
            return false;
        }
        MachineStatus machineStatus = new MachineStatus();
        machineStatus.setFitnessHashMap((HashMap) bundle.getSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA"));
        return ((nxl) this.o).b(machineStatus);
    }

    class a implements Handler.Callback {
        private a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            nxd.this.e(message);
            int i = message.what;
            if (i == 6) {
                LogUtil.a("Track_IDEQ_FitnessClient", "DISCONNECT_WHEN_6S_NO_DATA_REV");
                nxd nxdVar = nxd.this;
                if (!nxdVar.c(nxdVar.r) && (nxd.this.o instanceof nxf) && ((nxf) nxd.this.o).b()) {
                    return true;
                }
                nxd.this.i();
                return true;
            }
            if (i == 7) {
                LogUtil.a("Track_IDEQ_FitnessClient", "STOP_SCAN");
                nxd.this.ac();
                return true;
            }
            if (i == 8) {
                LogUtil.a("Track_IDEQ_FitnessClient", "STOP_SCAN_AND_CONNECT_DEVICE_BY_NAME");
                nxd.this.ac();
                ThreadPoolManager.c().execute(new Runnable() { // from class: nxm
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43899c.a();
                    }
                });
                return true;
            }
            if (i != 10) {
                return false;
            }
            LogUtil.a("Track_IDEQ_FitnessClient", "CONNECT_DEVICE_BY_NAME");
            ThreadPoolManager.c().execute(new Runnable() { // from class: nxk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43894a.b();
                }
            });
            return true;
        }

        /* synthetic */ void a() {
            nxd nxdVar = nxd.this;
            nxdVar.b(nxdVar.f43879c);
        }

        /* synthetic */ void b() {
            nxd nxdVar = nxd.this;
            nxdVar.b(nxdVar.f43879c);
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void disconnect(boolean z) {
        if (z) {
            i();
            return;
        }
        synchronized (f43877b) {
            if (this.d != null && this.e != null) {
                this.ac = 3;
                LogUtil.d("Track_IDEQ_FitnessClient", "disconnect has been called");
                p();
                this.g = null;
                this.h = "";
                this.f43878a = "";
                return;
            }
            LogUtil.j("Track_IDEQ_FitnessClient", "BluetoothAdapter not initialized or this mBluetoothGatt has been disconnected already");
        }
    }

    public void i() {
        synchronized (f43877b) {
            if (this.d != null && this.e != null) {
                LogUtil.d("Track_IDEQ_FitnessClient", "disconnectAsUnexpectedInterrupt has been called");
                p();
                return;
            }
            LogUtil.j("Track_IDEQ_FitnessClient", "BluetoothAdapter not initialized or this mBluetoothGatt has been disconnected already");
        }
    }

    public void e() {
        synchronized (f43877b) {
            this.ac = 0;
            e(AbstractFitnessClient.ACTION_GATT_STATE_DISCONNECTED);
            c();
            LogUtil.a("Track_IDEQ_FitnessClient", "closeAsUnexpectedInterrupt");
            b(false, true, false, false);
        }
    }

    public void b() {
        if (c(this.r) || !(this.o instanceof nxf)) {
            return;
        }
        LogUtil.a("Track_IDEQ_FitnessClient", "Clean Something For Unexpected Unbind");
        ((nxf) this.o).a();
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void stopThreadsInCsafeController() {
        if (c(this.r) || !(this.o instanceof nxf)) {
            return;
        }
        LogUtil.a("Track_IDEQ_FitnessClient", "stop Threads In Csafe Controller");
        ((nxf) this.o).j();
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void removeMessageOrStateCallback(String str, boolean z) {
        nxj nxjVar = this.k;
        if (nxjVar != null) {
            LogUtil.a("Track_IDEQ_FitnessClient", "releaseResource, isNoneCallbackLeft = ", Boolean.valueOf(nxjVar.c(str)));
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void releaseResource() {
        ReleaseLogUtil.d("R_EcologyDevice_Track_IDEQ_FitnessClient", "releaseResource");
        BroadcastSubscribeCenter.c().e(Arrays.asList(BroadcastObserver.BLUE_PAIR_STATE_TYPE, BroadcastObserver.BLUE_STATE_TYPE), "Track_IDEQ_FitnessClient");
        b();
        g();
        r();
        c();
        n();
    }

    private void v() {
        if (c(this.r) || this.o == null) {
            return;
        }
        LogUtil.a("Track_IDEQ_FitnessClient", "pause Work Threads In Csafe Controller");
        ((nxf) this.o).d();
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void setHasExperiencedStateOfStartForFtmp(boolean z) {
        if (c(this.r) && (this.o instanceof nxl)) {
            LogUtil.a("Track_IDEQ_FitnessClient", "set HasExperiencedStateOfStart For FTMP");
            ((nxl) this.o).a(z);
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void sendByteToEquip(byte[] bArr) {
        if (c(this.r) && (this.o instanceof nxl)) {
            LogUtil.a("Track_IDEQ_FitnessClient", "sendByteToEquip For FTMP");
            ((nxl) this.o).a(bArr);
        }
    }

    public void d(int[] iArr) {
        if (c(this.r) && (this.o instanceof nxl)) {
            LogUtil.a("Track_IDEQ_FitnessClient", "setUnlockCode For FTMP");
            ((nxl) this.o).a(iArr);
        }
    }

    public void d(Map<String, String> map) {
        if (c(this.r) && (this.o instanceof nxl)) {
            LogUtil.a("Track_IDEQ_FitnessClient", "setExtensionCollectionControl For FTMP");
            ((nxl) this.o).c(map);
        }
    }

    public void e(int i, int[] iArr) {
        if (c(this.r) && (this.o instanceof nxl)) {
            LogUtil.a("Track_IDEQ_FitnessClient", "sendTargetToDevice For FTMP");
            ((nxl) this.o).d(i, iArr);
        }
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void setFitnessMachineControl(int i, int[] iArr) {
        if (c(this.r) && (this.o instanceof nxl)) {
            LogUtil.a("Track_IDEQ_FitnessClient", "setFitnessMachineControl For FTMP");
            ((nxl) this.o).c(i, iArr);
        }
    }

    public boolean a(int i, int i2) {
        if (!c(this.r) || !(this.o instanceof nxl)) {
            return false;
        }
        LogUtil.a("Track_IDEQ_FitnessClient", "adjustingIndoorBikeResistance");
        return ((nxl) this.o).c(i, i2);
    }

    public void d(boolean z) {
        if (c(this.r) && (this.o instanceof nxl)) {
            LogUtil.a("Track_IDEQ_FitnessClient", "setSuppressPause");
            ((nxl) this.o).d(z);
        }
    }

    public void t() {
        LogUtil.a("Track_IDEQ_FitnessClient", "stopSportByUser For FTMP");
        setFitnessMachineControl(8, new int[]{1});
    }

    private void ab() {
        if (c(this.r) && (this.o instanceof nxl)) {
            LogUtil.a("Track_IDEQ_FitnessClient", "setControlAllowed For FTMP");
            ((nxl) this.o).a();
        }
    }

    public void c() {
        synchronized (f43877b) {
            this.w = false;
            this.s = false;
            if (this.ad) {
                ExtendHandler extendHandler = this.l;
                if (extendHandler != null) {
                    extendHandler.sendEmptyMessage(7);
                } else {
                    LogUtil.a("Track_IDEQ_FitnessClient", "mExtendHandler is null");
                }
            }
            try {
                if (this.e != null) {
                    LogUtil.a("Track_IDEQ_FitnessClient", "start to close gatt...");
                    p();
                    this.e.close();
                    this.e = null;
                }
                BluetoothDevice bluetoothDevice = this.f43879c;
                if (bluetoothDevice != null && bluetoothDevice.getBondState() == 12) {
                    LogUtil.a("Track_IDEQ_FitnessClient", "start remove pair");
                    d(this.f43879c);
                }
                if (this.o != null && !c(this.r)) {
                    this.o.c();
                }
                x();
                this.g = null;
                this.h = "";
                this.f43878a = "";
                this.v = false;
                this.i = 0;
                if (this.l != null) {
                    LogUtil.a("Track_IDEQ_FitnessClient", "msgHandler will removeCallbacksAndMessages");
                    this.l.removeTasksAndMessages();
                    this.l.quit(false);
                }
                this.f43879c = null;
            } catch (SecurityException e) {
                LogUtil.e("Track_IDEQ_FitnessClient", "closeBluetoothGattAndRemoveMsg SecurityException:", ExceptionUtils.c(e));
            }
        }
    }

    private void p() {
        try {
            this.e.disconnect();
        } catch (SecurityException e) {
            ReleaseLogUtil.a("R_EcologyDevice_Track_IDEQ_FitnessClient", "disconnectGatt, ", ExceptionUtils.c(e));
        }
    }

    private void x() {
        nxi nxiVar = this.o;
        if (nxiVar == null || !(nxiVar instanceof nxl)) {
            return;
        }
        ((nxl) nxiVar).d();
    }

    public void a() {
        synchronized (f43877b) {
            try {
                if (this.e != null) {
                    LogUtil.a("Track_IDEQ_FitnessClient", "start to close gatt...");
                    this.e.close();
                    this.e = null;
                }
                if (this.o != null && !c(this.r)) {
                    this.o.c();
                }
                x();
            } catch (SecurityException e) {
                LogUtil.e("Track_IDEQ_FitnessClient", "closeBluetoothGattBeforeReconnect SecurityException:", ExceptionUtils.c(e));
            }
        }
    }

    protected void e(String str) {
        nxj nxjVar = this.k;
        if (nxjVar != null) {
            nxjVar.a(str);
        }
    }

    protected void b(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.k != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.huawei.health.fitness.KEY_MESSAGE_BOOLEAN_ALLOWED_TO_SHOW_UI", z2);
            bundle.putBoolean("com.huawei.health.fitness.KEY_MESSAGE_BOOLEAN_GOTO_START_FROM_FINISH", z3);
            bundle.putBoolean("com.huawei.health.fitness.KEY_MESSAGE_BOOLEAN_HAS_NOT_DISCONNECTED", z);
            bundle.putBoolean("com.huawei.health.fitness.KEY_MESSAGE_BOOLEAN_PRESS_ON_STOP_BTN", z4);
            this.k.c(905, bundle);
        }
    }

    private boolean y() {
        return PermissionUtil.e(BaseApplication.j(), PermissionDialogHelper.c()) == PermissionUtil.PermissionResult.GRANTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        if (this.d == null) {
            LogUtil.j("Track_IDEQ_FitnessClient", "BluetoothAdapter is null");
            return;
        }
        this.ad = false;
        ExtendHandler extendHandler = this.l;
        if (extendHandler != null) {
            extendHandler.removeMessages(7);
        } else {
            LogUtil.j("Track_IDEQ_FitnessClient", "mExtendHandler = null");
        }
        LogUtil.a("Track_IDEQ_FitnessClient", "now scanner stop scan");
        try {
            BluetoothLeScanner bluetoothLeScanner = this.d.getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.z);
            } else {
                LogUtil.j("Track_IDEQ_FitnessClient", "null = scanner");
            }
        } catch (SecurityException e) {
            LogUtil.e("Track_IDEQ_FitnessClient", "stopScanBle SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void ad() {
        if (this.d == null) {
            LogUtil.j("Track_IDEQ_FitnessClient", "BluetoothAdapter is null");
            return;
        }
        if (!y()) {
            LogUtil.j("Track_IDEQ_FitnessClient", "No location permission.");
            return;
        }
        if (TextUtils.isEmpty(this.h) && TextUtils.isEmpty(this.f43878a)) {
            LogUtil.j("Track_IDEQ_FitnessClient", "deviceName or macAddress is invalid");
            return;
        }
        this.ad = true;
        if (this.l != null) {
            if ("31".equals(this.m)) {
                this.l.sendEmptyMessage(7, 9000L);
            } else {
                this.l.sendEmptyMessage(7, 29000L);
            }
        } else {
            LogUtil.j("Track_IDEQ_FitnessClient", "mExtendHandler = null");
        }
        LogUtil.a("Track_IDEQ_FitnessClient", "now scanner start scan");
        try {
            BluetoothLeScanner bluetoothLeScanner = this.d.getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.startScan((List<ScanFilter>) null, new ScanSettings.Builder().setScanMode(2).build(), this.z);
            } else {
                LogUtil.j("Track_IDEQ_FitnessClient", "scanner = null");
            }
        } catch (SecurityException e) {
            LogUtil.e("Track_IDEQ_FitnessClient", "startScanBle SecurityException:", ExceptionUtils.c(e));
        }
    }

    void a(BluetoothDevice bluetoothDevice) {
        LogUtil.a("Track_IDEQ_FitnessClient", "now will distinguish device.");
        if (bluetoothDevice == null || this.w) {
            return;
        }
        try {
            if ((TextUtils.isEmpty(this.h) || !this.h.equals(bluetoothDevice.getName())) && (TextUtils.isEmpty(this.f43878a) || !this.f43878a.equals(bluetoothDevice.getAddress()))) {
                return;
            }
            LogUtil.a("Track_IDEQ_FitnessClient", "found the device we need successfully");
            this.h = bluetoothDevice.getName();
            this.w = true;
            this.f43879c = bluetoothDevice;
            if (this.l == null) {
                return;
            }
            LogUtil.d("Track_IDEQ_FitnessClient", "mDeviceType:", this.m, ",ble mac:", bluetoothDevice.getAddress());
            this.l.removeMessages(5);
            if (nzc.c() && "31".equals(this.m) && !this.aa) {
                LogUtil.j("Track_IDEQ_FitnessClient", "ACTION_PAIR_UNSUPPORTED");
                e(AbstractFitnessClient.ACTION_PAIR_UNSUPPORTED);
            } else if (!nzc.c() && "31".equals(this.m)) {
                this.l.sendEmptyMessage(8);
            } else {
                this.l.sendEmptyMessage(9);
            }
        } catch (SecurityException e) {
            LogUtil.e("Track_IDEQ_FitnessClient", "distinguishDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void e(BluetoothDevice bluetoothDevice) {
        LogUtil.a("Track_IDEQ_FitnessClient", "Entry beginPair");
        if (bluetoothDevice == null) {
            LogUtil.j("Track_IDEQ_FitnessClient", "btDevice is null, inner error");
            return;
        }
        try {
            if (bluetoothDevice.getBondState() != 12) {
                LogUtil.a("Track_IDEQ_FitnessClient", "begin pair");
                this.x = false;
                BroadcastSubscribeCenter.c().e(Arrays.asList(BroadcastObserver.BLUE_PAIR_STATE_TYPE), "Track_IDEQ_FitnessClient", this);
                BroadcastSubscribeCenter.c().d();
                if (bluetoothDevice.createBond()) {
                    LogUtil.a("Track_IDEQ_FitnessClient", "createBond success");
                    this.l.sendEmptyMessage(11, 10000L);
                    return;
                }
                return;
            }
            LogUtil.a("Track_IDEQ_FitnessClient", "already paired");
            d();
        } catch (SecurityException e) {
            LogUtil.e("Track_IDEQ_FitnessClient", "beginPair SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void d(BluetoothDevice bluetoothDevice) {
        LogUtil.a("Track_IDEQ_FitnessClient", "handleMobiPairStatus");
        try {
            if (bluetoothDevice.getBondState() != 12) {
                return;
            }
            if (j() != null && "MRH3208A".equals(j().getModelString())) {
                c(bluetoothDevice);
                return;
            }
            MeasurableDevice bondedDeviceByUniqueId = dmg.a().getBondedDeviceByUniqueId(bluetoothDevice.getAddress(), false);
            if (bondedDeviceByUniqueId == null || !"054d0093-9ea5-40fe-adc0-1ebc41095660".equals(bondedDeviceByUniqueId.getProductId())) {
                return;
            }
            c(bluetoothDevice);
        } catch (SecurityException e) {
            LogUtil.e("Track_IDEQ_FitnessClient", "handleMobiPairStatus SecurityException:", ExceptionUtils.c(e));
        }
    }

    public void d() {
        if (!TextUtils.isEmpty(this.h) || !TextUtils.isEmpty(this.f43878a)) {
            LogUtil.a("Track_IDEQ_FitnessClient", "send CONNECT_DEVICE_BY_NAME");
            BroadcastSubscribeCenter.c().e(Arrays.asList(BroadcastObserver.BLUE_PAIR_STATE_TYPE), "Track_IDEQ_FitnessClient");
            ExtendHandler extendHandler = this.l;
            if (extendHandler != null) {
                extendHandler.removeMessages(5);
                this.l.removeMessages(11);
                this.l.sendEmptyMessage(10);
                return;
            }
            return;
        }
        LogUtil.j("Track_IDEQ_FitnessClient", "connectAfterBonded param error");
        b(this.h);
    }

    @Override // com.huawei.health.device.base.AbstractFitnessClient
    public void cancelPairing() {
        try {
            BluetoothDevice bluetoothDevice = this.f43879c;
            if (bluetoothDevice == null || bluetoothDevice.getBondState() != 11) {
                return;
            }
            LogUtil.a("Track_IDEQ_FitnessClient", "invoke cancelBondProcess:");
            this.f43879c.getClass().getMethod("cancelBondProcess", null).invoke(this.f43879c, null);
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            LogUtil.j("Track_IDEQ_FitnessClient", "cancelPairing Exception:", ExceptionUtils.c(e));
        }
    }

    public void a(String str) {
        LogUtil.a("Track_IDEQ_FitnessClient", "enter unPair");
        if (!TextUtils.isEmpty(str)) {
            d(str);
        } else {
            z();
        }
    }

    private void d(String str) {
        LogUtil.a("Track_IDEQ_FitnessClient", "removeBondByMacAddress");
        BluetoothAdapter bluetoothAdapter = this.d;
        if (bluetoothAdapter == null) {
            LogUtil.j("Track_IDEQ_FitnessClient", "mBluetoothAdapter is null");
            return;
        }
        try {
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (remoteDevice != null && remoteDevice.getBondState() == 12) {
                c(remoteDevice);
                return;
            }
            LogUtil.j("Track_IDEQ_FitnessClient", "The device does not have pairing relationship.");
        } catch (SecurityException e) {
            LogUtil.e("Track_IDEQ_FitnessClient", "removeBondByMacAddress SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void z() {
        LogUtil.a("Track_IDEQ_FitnessClient", "removeBondByTraverse");
        BluetoothAdapter bluetoothAdapter = this.d;
        if (bluetoothAdapter == null) {
            LogUtil.j("Track_IDEQ_FitnessClient", "mBluetoothAdapter is null");
            return;
        }
        try {
            Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
            if (bondedDevices == null) {
                return;
            }
            for (BluetoothDevice bluetoothDevice : bondedDevices) {
                if ((!TextUtils.isEmpty(this.h) && this.h.equals(bluetoothDevice.getName())) || (!TextUtils.isEmpty(this.f43878a) && this.f43878a.equals(bluetoothDevice.getAddress()))) {
                    c(bluetoothDevice);
                }
            }
        } catch (SecurityException e) {
            LogUtil.e("Track_IDEQ_FitnessClient", "removeBondByTraverse SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void c(BluetoothDevice bluetoothDevice) {
        LogUtil.a("Track_IDEQ_FitnessClient", "enter removeBond");
        if (bluetoothDevice == null) {
            return;
        }
        try {
            bluetoothDevice.getClass().getMethod("removeBond", null).invoke(bluetoothDevice, null);
        } catch (IllegalAccessException e) {
            LogUtil.j("Track_IDEQ_FitnessClient", "IllegalAccessException:", e.getMessage());
        } catch (NoSuchMethodException e2) {
            LogUtil.j("Track_IDEQ_FitnessClient", "NoSuchMethodException:", e2.getMessage());
        } catch (InvocationTargetException e3) {
            LogUtil.j("Track_IDEQ_FitnessClient", "InvocationTargetException:", e3.getMessage());
        }
    }

    private void w() {
        LogUtil.a("Track_IDEQ_FitnessClient", "notifyMessagesPairFailed");
        this.l.removeMessages(11);
        this.l.sendEmptyMessage(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(ScanResult scanResult) {
        LogUtil.a("Track_IDEQ_FitnessClient", "check is need pair");
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord == null) {
            return false;
        }
        Map<ParcelUuid, byte[]> serviceData = scanRecord.getServiceData();
        List<ParcelUuid> serviceUuids = scanRecord.getServiceUuids();
        if (serviceUuids == null || serviceData == null) {
            LogUtil.j("Track_IDEQ_FitnessClient", "serviceUuids == null || serviceDataMap == null");
            return false;
        }
        for (ParcelUuid parcelUuid : serviceUuids) {
            if ("00001826-0000-1000-8000-00805f9b34fb".equalsIgnoreCase(parcelUuid.getUuid().toString()) && serviceData.containsKey(parcelUuid)) {
                return c(serviceData.get(parcelUuid));
            }
        }
        return false;
    }

    private boolean c(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            return (bArr[0] & 128) != 0;
        }
        LogUtil.j("Track_IDEQ_FitnessClient", "serviceData.length <= FLAG_INDEX");
        return false;
    }

    public boolean m() {
        return c(this.r);
    }

    public boolean f() {
        LogUtil.a("Track_IDEQ_FitnessClient", "mCurrentDeviceStatus is ", Integer.valueOf(this.i));
        return this.i == 2;
    }

    @Override // com.huawei.health.ecologydevice.callback.BroadcastObserver
    public void onNotify(int i, BluetoothDevice bluetoothDevice) {
        if (i == 1) {
            LogUtil.a("Track_IDEQ_FitnessClient", "BluetoothAdapter.STATE_ON");
            return;
        }
        if (i == 2) {
            LogUtil.a("Track_IDEQ_FitnessClient", "BluetoothAdapter.STATE_OFF");
            ExtendHandler extendHandler = this.l;
            if (extendHandler != null) {
                extendHandler.sendEmptyMessage(13);
                return;
            }
            return;
        }
        e(i, bluetoothDevice);
    }

    private void e(int i, BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            LogUtil.a("Track_IDEQ_FitnessClient", "ReceiverCallback other receiverStatus: ", Integer.valueOf(i));
            return;
        }
        try {
            String name = bluetoothDevice.getName();
            String address = bluetoothDevice.getAddress();
            if (name == null) {
                if (address == null || !address.equals(this.f43878a)) {
                    LogUtil.j("Track_IDEQ_FitnessClient", "BroadcastReceiverForBlePair name is null,and address not equal");
                    return;
                }
            } else if (!name.equals(this.h) && !address.equals(this.f43878a)) {
                LogUtil.a("Track_IDEQ_FitnessClient", "BroadcastReceiverForBlePair name and address is not equal");
                return;
            }
            if (i == 3) {
                LogUtil.a("Track_IDEQ_FitnessClient", name, " pair success");
                if (this.x) {
                    this.x = false;
                }
                d();
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    LogUtil.j("Track_IDEQ_FitnessClient", name, " other status：", Integer.valueOf(bluetoothDevice.getBondState()));
                    return;
                } else {
                    this.x = true;
                    LogUtil.a("Track_IDEQ_FitnessClient", name, " is pairing......");
                    return;
                }
            }
            LogUtil.a("Track_IDEQ_FitnessClient", name, " pair Failed");
            if (this.x) {
                this.x = false;
                w();
            }
        } catch (SecurityException e) {
            LogUtil.e("Track_IDEQ_FitnessClient", "switchPair SecurityException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        int i = message.what;
        if (i == 0) {
            BluetoothGatt bluetoothGatt = this.e;
            if (bluetoothGatt != null) {
                this.p = false;
                try {
                    bluetoothGatt.discoverServices();
                } catch (SecurityException e) {
                    ReleaseLogUtil.a("R_EcologyDevice_Track_IDEQ_FitnessClient", "discoverServices, ", ExceptionUtils.c(e));
                }
                LogUtil.a("Track_IDEQ_FitnessClient", "Attempting to start service discovery:", Boolean.valueOf(this.p));
                return;
            }
            return;
        }
        if (i == 3) {
            LogUtil.a("Track_IDEQ_FitnessClient", "MSG_RECONNECT: now will reconnect");
            this.u = true;
            reConnect();
            return;
        }
        if (i == 5) {
            LogUtil.a("Track_IDEQ_FitnessClient", "DISCONNECT_WHEN_TIMEOUT");
            this.y = true;
            e();
            return;
        }
        if (i == 9) {
            LogUtil.a("Track_IDEQ_FitnessClient", "STOP_SCAN_AND_PAIR");
            BroadcastSubscribeCenter.c().e(Arrays.asList(BroadcastObserver.BLUE_PAIR_STATE_TYPE), "Track_IDEQ_FitnessClient");
            ac();
            e(this.f43879c);
            return;
        }
        switch (i) {
            case 11:
                LogUtil.j("Track_IDEQ_FitnessClient", "PAIR_TIMEOUT continue connect");
                BroadcastSubscribeCenter.c().e(Arrays.asList(BroadcastObserver.BLUE_PAIR_STATE_TYPE), "Track_IDEQ_FitnessClient");
                cancelPairing();
                u();
                break;
            case 12:
                LogUtil.j("Track_IDEQ_FitnessClient", "PAIR_FAILED continue connect");
                BroadcastSubscribeCenter.c().e(Arrays.asList(BroadcastObserver.BLUE_PAIR_STATE_TYPE), "Track_IDEQ_FitnessClient");
                u();
                break;
            case 13:
                LogUtil.j("Track_IDEQ_FitnessClient", "BLUETOOTH_TURN_OFF");
                this.t = true;
                ab();
                e();
                break;
        }
    }

    private void u() {
        this.w = false;
        nzc.c();
        LogUtil.j("Track_IDEQ_FitnessClient", "Oversea Equipment doesn't allow to connect");
        e(AbstractFitnessClient.ACTION_GATT_STATE_DISCONNECTED);
    }
}
