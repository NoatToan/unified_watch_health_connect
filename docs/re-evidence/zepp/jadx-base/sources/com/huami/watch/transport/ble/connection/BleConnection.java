package com.huami.watch.transport.ble.connection;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.watch.util.BTUtil;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.scan.BleScanCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class BleConnection {
    private static final String d = "Connection-BLE";
    private boolean a;
    private BleConnectable b;
    private final List<DataListener> c = new ArrayList();
    public HMSmartWatchDevice mBleDevice;

    public interface BleConnectable {
        void onConnectedBleDevice(BluetoothDevice bluetoothDevice);

        void onDisconnectedBleDevice(BluetoothDevice bluetoothDevice);
    }

    public interface DataListener {
        void onReceiveData(HMLFEvent hMLFEvent);
    }

    public class a implements IHMAuthCallback {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
        public void onAuthentication(HMAuthState hMAuthState) {
            Log.d(BleConnection.d, "OnAuth: " + hMAuthState, new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
        public byte[] onGetSignData(byte[] bArr, byte[] bArr2, int i) {
            Log.d(BleConnection.d, "OnGetSignData", new Object[0]);
            return null;
        }
    }

    public class b extends HMCallback<HMLFEvent> {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onData(HMLFEvent hMLFEvent) {
            Log.d(BleConnection.d, "OnData: " + hMLFEvent, new Object[0]);
            synchronized (BleConnection.this.c) {
                Iterator it2 = BleConnection.this.c.iterator();
                while (it2.hasNext()) {
                    ((DataListener) it2.next()).onReceiveData(hMLFEvent);
                }
            }
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.AUTH_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.GATT_CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Status.GATT_CONNECT_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Status.GATT_DISCONNECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Status.DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public BleConnection(BleConnectable bleConnectable) {
        this.b = bleConnectable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
        Log.d(d, "OnConnectionStateChanged: " + bluetoothDevice + ", Type: " + hMDeviceType + ", Status: " + status, new Object[0]);
        int i = c.a[status.ordinal()];
        if (i == 1) {
            this.b.onConnectedBleDevice(bluetoothDevice);
        } else if (i == 2 || i == 3 || i == 4 || i == 5) {
            this.b.onDisconnectedBleDevice(bluetoothDevice);
        }
    }

    public void addDataListener(@NonNull DataListener dataListener) {
        synchronized (this.c) {
            if (!this.c.contains(dataListener)) {
                this.c.add(dataListener);
            }
        }
    }

    public boolean connect(Context context, String str, String str2, boolean z, byte b2) {
        return connect(context, BTUtil.getDefaultAdapter().getRemoteDevice(str), str2, z, b2);
    }

    public boolean disconnect() {
        Log.d(d, "Disconnect BleDevice: " + this.mBleDevice, new Object[0]);
        HMSmartWatchDevice hMSmartWatchDevice = this.mBleDevice;
        if (hMSmartWatchDevice != null) {
            BluetoothDevice bluetoothDevice = hMSmartWatchDevice.getBluetoothDevice();
            this.mBleDevice.destroy();
            BleConnectable bleConnectable = this.b;
            if (bleConnectable != null) {
                bleConnectable.onDisconnectedBleDevice(bluetoothDevice);
            }
            this.mBleDevice = null;
        }
        this.a = false;
        return true;
    }

    public void removeDataListener(@NonNull DataListener dataListener) {
        synchronized (this.c) {
            this.c.remove(dataListener);
        }
    }

    public boolean connect(Context context, BluetoothDevice bluetoothDevice, String str, boolean z, byte b2) {
        if (this.a) {
            Log.w(d, "Already bond BleDevice, Abort!!", new Object[0]);
            return true;
        }
        this.a = true;
        BleScanCenter.init(context);
        HMSmartWatchDevice hMSmartWatchDevice = new HMSmartWatchDevice(context, bluetoothDevice);
        hMSmartWatchDevice.setAuthInfo(new AuthInfo(str, z, b2));
        hMSmartWatchDevice.setSmartWatchAuthCallback(new a());
        hMSmartWatchDevice.setSmartWatchLfEventCallback(new b());
        hMSmartWatchDevice.setSmartWatchConnectionCallback(new IHMConnectionCallback() { // from class: ly
            @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
            public final void onConnectionStatusChanged(BluetoothDevice bluetoothDevice2, HMDeviceType hMDeviceType, Status status) {
                this.a.c(bluetoothDevice2, hMDeviceType, status);
            }
        });
        hMSmartWatchDevice.setAutoReconnect(true);
        hMSmartWatchDevice.create(false);
        Log.d(d, "Connect BleDevice [" + bluetoothDevice + ", AuthKey: " + str + ", AuthNeedPair: " + z + ", AppId: " + ((int) b2) + "]: " + hMSmartWatchDevice, new Object[0]);
        this.mBleDevice = hMSmartWatchDevice;
        return true;
    }

    public boolean disconnect(String str) {
        HMSmartWatchDevice hMSmartWatchDevice = this.mBleDevice;
        String address = hMSmartWatchDevice != null ? hMSmartWatchDevice.getBluetoothDevice().getAddress() : null;
        Log.d(d, "Disconnect BleDevice [" + str + "], " + this.mBleDevice + "[" + address + "]", new Object[0]);
        if (str == null || !str.equals(address)) {
            return true;
        }
        disconnect();
        return true;
    }
}
