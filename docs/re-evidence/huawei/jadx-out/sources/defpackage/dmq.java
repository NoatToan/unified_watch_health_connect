package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
class dmq extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BluetoothDevice f32018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dmu f32019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BluetoothDevice f32020c;
    private BluetoothHeadset d;
    private IDeviceEventHandler e;
    private BluetoothProfile.ServiceListener f = new BluetoothProfile.ServiceListener() { // from class: dmq.4
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            LogUtil.d("ClassicDeviceHelper", "ClassicDevice onServiceConnected");
            if (i == 1) {
                LogUtil.d("ClassicDeviceHelper", "ClassicDevice onServiceConnected HEADSET");
                if (bluetoothProfile instanceof BluetoothHeadset) {
                    dmq.this.d = (BluetoothHeadset) bluetoothProfile;
                }
                dmq dmqVar = dmq.this;
                LogUtil.d("ClassicDeviceHelper", "ClassicDevice connectHsp returnValue is ", Boolean.valueOf(dmqVar.b(dmqVar.d, dmq.this.f32018a)));
            }
            BluetoothAdapter.getDefaultAdapter().closeProfileProxy(1, dmq.this.d);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
            if (i == 1) {
                dmq.this.d = null;
            }
        }
    };

    dmq(dmu dmuVar) {
        if (dmuVar == null) {
            throw new IllegalArgumentException("ClassicDevice cannot null");
        }
        this.f32020c = dmuVar.f32026c;
        this.f32019b = dmuVar;
    }

    public String d() {
        BluetoothDevice bluetoothDevice = this.f32020c;
        if (bluetoothDevice == null) {
            return null;
        }
        try {
            String name = bluetoothDevice.getName();
            if (name != null) {
                return name;
            }
            return null;
        } catch (SecurityException e) {
            LogUtil.e("ClassicDeviceHelper", "getDeviceName SecurityException:", ExceptionUtils.c(e));
        }
    }

    public void d(IDeviceEventHandler iDeviceEventHandler) {
        this.e = iDeviceEventHandler;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtil.a("ClassicDeviceHelper", "ClassicDevice receive broadcast ", intent.getAction());
        try {
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
                BluetoothDevice bluetoothDevice = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE") instanceof BluetoothDevice ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE") : null;
                if (bluetoothDevice != null && bluetoothDevice.getName() != null) {
                    if (bluetoothDevice.getName().equals(d()) && this.e != null) {
                        int bondState = bluetoothDevice.getBondState();
                        if (bondState == 12) {
                            LogUtil.a("ClassicDeviceHelper", "ClassicDevice is bonded");
                            this.f32019b.updateDeviceUsedTime(1, bluetoothDevice.getAddress());
                            this.f32018a = this.f32020c;
                            LogUtil.d("ClassicDeviceHelper", "ClassicDevice getProfileProxy result ", Boolean.valueOf(BluetoothAdapter.getDefaultAdapter().getProfileProxy(dxw.d(), this.f, 1)));
                            dxw.e(new d(), 500L);
                            return;
                        }
                        if (bondState == 10) {
                            LogUtil.a("ClassicDeviceHelper", "ClassicDevice is bond_none");
                            this.e.onStateChanged(8);
                            return;
                        } else {
                            LogUtil.j("ClassicDeviceHelper", "ClassicDevice is other bondState:", Integer.valueOf(bondState));
                            return;
                        }
                    }
                    return;
                }
                LogUtil.j("ClassicDeviceHelper", "ClassicDevice BroadcastReceiver device = null");
            }
        } catch (RuntimeException e) {
            LogUtil.e("ClassicDeviceHelper", "ClassicDevice RuntimeException:", ExceptionUtils.c(e));
        }
    }

    class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dmq.this.e.onStateChanged(7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(BluetoothHeadset bluetoothHeadset, BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        if (bluetoothHeadset == null) {
            LogUtil.j("ClassicDeviceHelper", "ClassicDevice connectBluetoothHeadset bluetoothHeadset is null");
            return false;
        }
        try {
            Method method = bluetoothHeadset.getClass().getMethod("connect", BluetoothDevice.class);
            Boolean bool = method.invoke(bluetoothHeadset, bluetoothDevice) instanceof Boolean ? (Boolean) method.invoke(bluetoothHeadset, bluetoothDevice) : null;
            return bool != null && bool.booleanValue();
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            LogUtil.e("ClassicDeviceHelper", "connectBluetoothHeadset ", e.getMessage());
            return false;
        }
    }
}
