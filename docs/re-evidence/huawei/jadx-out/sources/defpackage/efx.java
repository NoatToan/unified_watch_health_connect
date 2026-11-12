package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.ecologydevice.R;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class efx extends MeasurableDevice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BluetoothGatt f32895a;
    private ExtendHandler d;
    protected BluetoothDevice e;
    private BluetoothGattCallback j;
    private final Object i = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothGattCallback f32896b = new b(this);
    private volatile boolean f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32897c = 0;

    static /* synthetic */ int a(efx efxVar) {
        int i2 = efxVar.f32897c;
        efxVar.f32897c = i2 + 1;
        return i2;
    }

    protected efx() {
    }

    efx(BluetoothDevice bluetoothDevice) {
        LogUtil.a("BleDevice", CommonUtil.n(bluetoothDevice.getAddress()), " BleDevice is constructed");
        this.e = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(bluetoothDevice.getAddress());
        super.setDeviceName(h());
    }

    private efx(UniteDevice uniteDevice) {
        LogUtil.a("BleDevice", "BleDevice is constructed for uds");
        this.e = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(uniteDevice.getIdentify());
        super.setDeviceName(h());
    }

    private String h() {
        try {
            return this.e.getName();
        } catch (SecurityException e2) {
            LogUtil.e("BleDevice", "get device name:", ExceptionUtils.c(e2));
            return "";
        }
    }

    public void b(String str) {
        this.e = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
    }

    public BluetoothDevice c() {
        return this.e;
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getUniqueId() {
        return getAddress();
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice, com.huawei.health.device.model.HealthDevice
    public String getDeviceName() {
        if (this.e == null) {
            return "";
        }
        String strH = h();
        if (!TextUtils.isEmpty(strH)) {
            LogUtil.d("BleDevice", "BleDevice name : ", strH);
            return strH;
        }
        return super.getDeviceName();
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getAddress() {
        BluetoothDevice bluetoothDevice = this.e;
        return bluetoothDevice == null ? "" : bluetoothDevice.getAddress();
    }

    public static efx b(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        return efy.c().a(bluetoothDevice);
    }

    public static efx d(UniteDevice uniteDevice) {
        if (uniteDevice != null) {
            return new efx(uniteDevice);
        }
        return null;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doCreateBond(IDeviceEventHandler iDeviceEventHandler) {
        iDeviceEventHandler.onStateChanged(7);
        BluetoothDevice bluetoothDevice = this.e;
        if (bluetoothDevice != null) {
            updateDeviceUsedTime(1, bluetoothDevice.getAddress());
        }
        return true;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doRemoveBond() {
        Boolean bool;
        BluetoothDevice bluetoothDevice = this.e;
        if (bluetoothDevice != null) {
            updateDeviceUsedTime(2, bluetoothDevice.getAddress());
        }
        try {
            BluetoothDevice bluetoothDevice2 = this.e;
            if (bluetoothDevice2 != null && bluetoothDevice2.getBondState() == 12) {
                Method method = BluetoothDevice.class.getMethod("removeBond", new Class[0]);
                if ((method.invoke(this.e, new Object[0]) instanceof Boolean) && (bool = (Boolean) method.invoke(this.e, new Object[0])) != null) {
                    return bool.booleanValue();
                }
                return false;
            }
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
            LogUtil.e("BleDevice", "doRemoveBond ", e2.getMessage());
        }
        return false;
    }

    public boolean e() {
        return b(false);
    }

    private void b() {
        try {
            disconnect();
            this.d = HandlerCenter.e("BleDevice");
        } catch (NullPointerException unused) {
            LogUtil.e("BleDevice", "null pointer exception");
        }
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectAsync(IHealthDeviceCallback iHealthDeviceCallback) {
        return b(true);
    }

    private boolean b(boolean z) {
        if (Build.VERSION.SDK_INT > 30 && PermissionUtil.e(BaseApplication.b(), PermissionUtil.PermissionType.SCAN) != PermissionUtil.PermissionResult.GRANTED) {
            ReleaseLogUtil.a("R_BleDevice", "no scan permission");
            qpx.e(BaseApplication.b(), R.string.IDS_nearby_permission_exception);
            return false;
        }
        if (this.e == null) {
            return false;
        }
        b();
        String measureKitUuid = getMeasureKitUuid();
        String productId = getProductId();
        String uniqueId = getUniqueId();
        ReleaseLogUtil.d("R_BleDevice", "BleDevice connect. measureKitUuid=", CommonUtil.n(measureKitUuid), ", productId=", CommonUtil.n(productId), ", uniqueId=", CommonUtil.n(uniqueId));
        if (ete.d().b() || ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).isSupportUdsByProductId()) {
            UniteDevice uniteDeviceD = ete.d().d(this.e.getAddress(), 2);
            ReleaseLogUtil.d("R_BleDevice", "BleDevice connect by uds");
            emk.c().c(uniteDeviceD, ConnectMode.TRANSPARENT, 2, false);
            return true;
        }
        if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isTlvScaleProduct(productId, uniqueId)) {
            ReleaseLogUtil.d("R_BleDevice", "BleDevice connect. isTlvScaleProduct and SDK_INT >= 23");
            try {
                this.f32895a = this.e.connectGatt(dxw.d(), false, this.f32896b, 2);
            } catch (SecurityException unused) {
                ReleaseLogUtil.e("BleDevice", "initGattService SecurityException");
            }
        } else {
            ReleaseLogUtil.d("R_BleDevice", "BleDevice connect by primal");
            try {
                this.f32895a = this.e.connectGatt(dxw.d(), false, this.f32896b);
            } catch (NullPointerException | SecurityException e2) {
                ReleaseLogUtil.e("BleDevice", "initGattService occur exception.", ExceptionUtils.c(e2));
            }
        }
        if (z) {
            this.f32897c = 0;
        }
        ReleaseLogUtil.d("R_BleDevice", "connect device:", Integer.valueOf(System.identityHashCode(this)), ",bluetoothGatt:", Integer.valueOf(System.identityHashCode(this.f32895a)), ",try to connect:", Integer.valueOf(this.f32897c));
        return this.f32895a != null;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectSync(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("invalid parameter of second " + i2);
        }
        if (connectAsync(null)) {
            c(TimeUnit.SECONDS.toMillis(i2));
        }
        return f();
    }

    private void c(long j) {
        while (j > 0) {
            try {
                Thread.sleep(200L);
                j -= 200;
                if (f()) {
                    return;
                }
                if (!ete.d().b() && !((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).isSupportUdsByProductId() && this.j == null) {
                    return;
                }
            } catch (InterruptedException e2) {
                LogUtil.e("BleDevice", "checkConnectStatus ", e2.getMessage());
            }
        }
    }

    private boolean f() {
        return this.f || emk.c().b() == 2;
    }

    public boolean a() {
        return this.f;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public void disconnect() {
        if (this.f32895a != null) {
            j();
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e2) {
                LogUtil.e("BleDevice", "disconnect Exception ", e2.getMessage());
            }
            d();
        }
        this.f = false;
        ReleaseLogUtil.d("R_BleDevice", "disconnect(), device:", Integer.valueOf(System.identityHashCode(this)));
        ExtendHandler extendHandler = this.d;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.d.quit(true);
        }
    }

    private void j() {
        synchronized (this.i) {
            BluetoothGatt bluetoothGatt = this.f32895a;
            if (bluetoothGatt != null) {
                try {
                    bluetoothGatt.disconnect();
                } catch (SecurityException e2) {
                    LogUtil.e("BleDevice", "disconnectGatt: ", ExceptionUtils.c(e2));
                }
                LogUtil.a("BleDevice", "disconnectGatt success, ", this.f32895a);
            } else {
                LogUtil.j("BleDevice", "disconnectGatt fail because mBluetoothGatt = null");
            }
        }
    }

    private void d() {
        synchronized (this.i) {
            BluetoothGatt bluetoothGatt = this.f32895a;
            if (bluetoothGatt != null) {
                try {
                    bluetoothGatt.close();
                    this.f32895a = null;
                    LogUtil.a("BleDevice", "closeGatt success");
                } catch (SecurityException e2) {
                    LogUtil.e("BleDevice", "closeGatt SecurityException:", ExceptionUtils.c(e2));
                }
            } else {
                LogUtil.j("BleDevice", "closeGatt fail because mBluetoothGatt = null");
            }
        }
    }

    public void e(BluetoothGattCallback bluetoothGattCallback) {
        this.j = bluetoothGattCallback;
        if (bluetoothGattCallback == null) {
            LogUtil.j("BleDevice", " BleDevice callback is null");
            ExtendHandler extendHandler = this.d;
            if (extendHandler != null) {
                extendHandler.quit(false);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32903b;
        private int d;
        private BluetoothGatt e;

        c(BluetoothGatt bluetoothGatt, int i, int i2) {
            this.e = bluetoothGatt;
            this.f32903b = i;
            this.d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            efx.this.f = this.d == 2;
            ReleaseLogUtil.d("R_BleDevice", "BleDevice onConnectionStateChange mNewState = ", Integer.valueOf(this.d));
            if (efx.this.j != null) {
                if ((this.d != 133 && this.f32903b != 133) || efx.this.f32897c >= 2) {
                    efx.this.j.onConnectionStateChange(this.e, this.f32903b, this.d);
                    return;
                }
                ReleaseLogUtil.d("R_BleDevice", "BleDevice onConnectionStateChange Run autoReconnect");
                efx.this.e();
                efx.a(efx.this);
            }
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32910b;
        private BluetoothGatt e;

        g(BluetoothGatt bluetoothGatt, int i) {
            this.e = bluetoothGatt;
            this.f32910b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (efx.this.j != null) {
                efx.this.j.onServicesDiscovered(this.e, this.f32910b);
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f32907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private BluetoothGatt f32908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f32909c;
        private BluetoothGattCharacteristic e;

        e(int i, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
            this.f32909c = i;
            this.f32908b = bluetoothGatt;
            this.e = bluetoothGattCharacteristic;
            this.f32907a = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (efx.this.j != null) {
                int i = this.f32909c;
                if (i == 1) {
                    efx.this.j.onCharacteristicChanged(this.f32908b, this.e);
                    return;
                }
                if (i == 2) {
                    efx.this.j.onCharacteristicRead(this.f32908b, this.e, this.f32907a);
                } else if (i == 3) {
                    efx.this.j.onCharacteristicWrite(this.f32908b, this.e, this.f32907a);
                } else {
                    LogUtil.d("BleDevice", "CharacteristicHandleTask other mode : ", Integer.valueOf(i));
                }
            }
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BluetoothGatt f32898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32899b;
        private BluetoothGattDescriptor d;
        private int e;

        a(int i, BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
            this.e = i;
            this.f32898a = bluetoothGatt;
            this.d = bluetoothGattDescriptor;
            this.f32899b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (efx.this.j != null) {
                int i = this.e;
                if (i == 1) {
                    efx.this.j.onDescriptorRead(this.f32898a, this.d, this.f32899b);
                } else if (i == 2) {
                    efx.this.j.onDescriptorWrite(this.f32898a, this.d, this.f32899b);
                } else {
                    LogUtil.d("BleDevice", "DescriptorHandleTask other mode : ", Integer.valueOf(i));
                }
            }
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BluetoothGatt f32911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32912b;

        i(BluetoothGatt bluetoothGatt, int i) {
            this.f32911a = bluetoothGatt;
            this.f32912b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (efx.this.j != null) {
                efx.this.j.onReliableWriteCompleted(this.f32911a, this.f32912b);
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f32904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private BluetoothGatt f32906c;

        d(BluetoothGatt bluetoothGatt, int i, int i2) {
            this.f32906c = bluetoothGatt;
            this.f32905b = i;
            this.f32904a = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (efx.this.j != null) {
                efx.this.j.onReadRemoteRssi(this.f32906c, this.f32905b, this.f32904a);
            }
        }
    }

    class b extends BluetoothGattCallback {
        private WeakReference<efx> d;

        b(efx efxVar) {
            this.d = new WeakReference<>(efxVar);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            efx efxVar = this.d.get();
            if (efxVar == null || bluetoothGatt == null) {
                return;
            }
            ReleaseLogUtil.d("R_BleDevice", "onConnectionStateChange status : ", Integer.valueOf(i), ",newState : ", Integer.valueOf(i2), ",device : ", Integer.valueOf(System.identityHashCode(efxVar)), ",gatt : ", Integer.valueOf(System.identityHashCode(bluetoothGatt)));
            if (i2 == 2) {
                efx.this.updateDeviceUsedTime(3, efxVar.getUniqueId());
            }
            efxVar.d.postTask(efx.this.new c(bluetoothGatt, i, i2));
            if (i2 == 2) {
                enm.b(efxVar.getAddress(), 1);
            } else if (i2 == 0) {
                enm.b(efxVar.getAddress(), 0);
            } else {
                LogUtil.a("BleDevice", "onConnectionStateChange other status.");
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            efx efxVar = this.d.get();
            if (efxVar == null || bluetoothGatt == null) {
                return;
            }
            ReleaseLogUtil.d("R_BleDevice", "onServiceDiscovered, device: ", Integer.valueOf(System.identityHashCode(efxVar)), ", status: ", Integer.valueOf(i));
            efxVar.d.postTask(efx.this.new g(bluetoothGatt, i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            efx efxVar = this.d.get();
            if (efxVar == null || bluetoothGatt == null) {
                return;
            }
            LogUtil.a("BleDevice", "onCharacteristicChanged this device is : ", Integer.valueOf(System.identityHashCode(efxVar)), ", gatt:", bluetoothGatt);
            efxVar.d.postTask(efx.this.new e(1, bluetoothGatt, bluetoothGattCharacteristic, 0));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            efx efxVar = this.d.get();
            if (efxVar == null || bluetoothGatt == null) {
                return;
            }
            efxVar.d.postTask(efx.this.new e(2, bluetoothGatt, bluetoothGattCharacteristic, i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            efx efxVar = this.d.get();
            if (efxVar == null || bluetoothGatt == null) {
                return;
            }
            efxVar.d.postTask(efx.this.new e(3, bluetoothGatt, bluetoothGattCharacteristic, i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            efx efxVar = this.d.get();
            if (efxVar == null || bluetoothGatt == null) {
                return;
            }
            efxVar.d.postTask(efx.this.new a(2, bluetoothGatt, bluetoothGattDescriptor, i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            efx efxVar = this.d.get();
            if (efxVar == null || bluetoothGatt == null) {
                return;
            }
            efxVar.d.postTask(efx.this.new a(1, bluetoothGatt, bluetoothGattDescriptor, i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
            efx efxVar = this.d.get();
            if (efxVar == null || bluetoothGatt == null) {
                return;
            }
            efxVar.d.postTask(efx.this.new i(bluetoothGatt, i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            efx efxVar = this.d.get();
            if (efxVar == null || bluetoothGatt == null) {
                return;
            }
            efxVar.d.postTask(efx.this.new d(bluetoothGatt, i, i2));
        }
    }
}
