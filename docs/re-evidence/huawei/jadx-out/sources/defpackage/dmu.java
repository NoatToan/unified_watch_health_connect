package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.IntentFilter;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public class dmu extends MeasurableDevice {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dmq f32025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected BluetoothDevice f32026c;
    private IDeviceEventHandler e;

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectAsync(IHealthDeviceCallback iHealthDeviceCallback) {
        return false;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectSync(int i) {
        return true;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public void disconnect() {
    }

    private dmu(BluetoothDevice bluetoothDevice) {
        LogUtil.a("ClassicDevice", "ClassicDevice is constructed");
        this.f32026c = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(bluetoothDevice.getAddress());
        this.f32025b = new dmq(this);
    }

    public BluetoothDevice a() {
        return this.f32026c;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice, com.huawei.health.device.model.HealthDevice
    public String getDeviceName() {
        BluetoothDevice bluetoothDevice = this.f32026c;
        if (bluetoothDevice == null) {
            return "";
        }
        try {
            String name = bluetoothDevice.getName();
            return name != null ? name : super.getDeviceName();
        } catch (SecurityException e) {
            LogUtil.e("ClassicDevice", "getDeviceName SecurityException:", ExceptionUtils.c(e));
            return "";
        }
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getAddress() {
        BluetoothDevice bluetoothDevice = this.f32026c;
        if (bluetoothDevice != null) {
            return bluetoothDevice.getAddress();
        }
        return "";
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getUniqueId() {
        return getAddress();
    }

    public static dmu a(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            return new dmu(bluetoothDevice);
        }
        return null;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doCreateBond(IDeviceEventHandler iDeviceEventHandler) {
        this.e = iDeviceEventHandler;
        this.f32025b.d(iDeviceEventHandler);
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
            dxw.d().registerReceiver(this.f32025b, intentFilter);
        } catch (SecurityException e) {
            LogUtil.e("ClassicDevice", "doCreateBond SecurityException:", ExceptionUtils.c(e));
        }
        return d(this.f32026c);
    }

    private boolean d(BluetoothDevice bluetoothDevice) {
        boolean z;
        Boolean bool;
        LogUtil.a("ClassicDevice", "ClassicDevice createBond");
        boolean z2 = false;
        if (bluetoothDevice == null) {
            return false;
        }
        try {
            Class<?> cls = bluetoothDevice.getClass();
            Method method = cls.getMethod("removeBond", new Class[0]);
            if ((method.invoke(bluetoothDevice, new Object[0]) instanceof Boolean) && ((bool = (Boolean) method.invoke(bluetoothDevice, new Object[0])) == null || !bool.booleanValue())) {
                LogUtil.j("ClassicDevice", "Unpairing failed.");
            }
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                LogUtil.e("ClassicDevice", "createBond method ", e.getMessage());
            }
            Object objInvoke = cls.getMethod("createBond", new Class[0]).invoke(bluetoothDevice, new Object[0]);
            Boolean bool2 = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            if (bool2 == null || !bool2.booleanValue()) {
                this.e.onStateChanged(8);
                z = false;
            } else {
                z = true;
            }
            try {
                LogUtil.d("ClassicDevice", "ClassicDevice returnValue is ", Boolean.valueOf(z));
                return z;
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
                z2 = z;
                e = e2;
                LogUtil.e("ClassicDevice", "createBond method ", ExceptionUtils.c(e));
                return z2;
            }
        } catch (IllegalAccessException e3) {
            e = e3;
        } catch (NoSuchMethodException e4) {
            e = e4;
        } catch (SecurityException e5) {
            e = e5;
        } catch (InvocationTargetException e6) {
            e = e6;
        }
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doRemoveBond() {
        BluetoothDevice bluetoothDevice = this.f32026c;
        if (bluetoothDevice == null) {
            LogUtil.j("ClassicDevice", "doRemoveBond mDevice is null");
            return false;
        }
        updateDeviceUsedTime(2, bluetoothDevice.getAddress());
        if (this.f32026c.getBondState() == 12) {
            try {
                Method method = BluetoothDevice.class.getMethod("removeBond", new Class[0]);
                Boolean bool = method.invoke(this.f32026c, new Object[0]) instanceof Boolean ? (Boolean) method.invoke(this.f32026c, new Object[0]) : null;
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                LogUtil.e("ClassicDevice", "doRemoveBond ", ExceptionUtils.c(e));
            }
        }
        return false;
    }

    public void c() {
        this.e = null;
    }
}
