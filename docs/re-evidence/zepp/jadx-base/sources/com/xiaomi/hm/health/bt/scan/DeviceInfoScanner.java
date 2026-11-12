package com.xiaomi.hm.health.bt.scan;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.ConditionVariable;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.scan.DeviceInfoScanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes20.dex */
public class DeviceInfoScanner {
    private static final String a = "BleScanCenter";
    private static final int b = 20000;
    private static ExecutorService c = Executors.newSingleThreadExecutor();
    private static BaseProfile d = null;
    private static ReentrantLock e = new ReentrantLock();

    public interface IDeviceInfoScanCallback {
        void onDeviceInfoObtained(ArrayList<String> uuids, DeviceInfo info);
    }

    public class a implements IGattCallback.IConnectionStateChangeCallback {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ ConditionVariable b;

        public a(final AtomicBoolean val$atomicBoolean, final ConditionVariable val$condition) {
            this.a = val$atomicBoolean;
            this.b = val$condition;
        }

        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
        public void onDeviceConnected(BluetoothDevice device1) {
            Debug.i("BleScanCenter", "onDeviceConnected");
        }

        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
        public void onDeviceConnecting(BluetoothDevice device) {
        }

        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
        public void onDeviceConnectionFailed(BluetoothDevice device, int status) {
            this.b.open();
        }

        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
        public void onDeviceDisconnected(BluetoothDevice device, int status) {
            this.b.open();
        }

        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
        public void onDeviceDiscovering(BluetoothDevice device) {
        }

        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
        public void onDeviceDiscoveryFailed(BluetoothDevice device, int status) {
            this.b.open();
        }

        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
        public void onDeviceDiscoverySuccess(BluetoothDevice device) {
        }

        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
        public void onInitializationResult(BluetoothDevice device, boolean result) {
            if (result) {
                Debug.i("BleScanCenter", "onInitializationSuccess");
                this.a.set(true);
            } else {
                Debug.i("BleScanCenter", "onInitializationFailed");
            }
            this.b.open();
        }

        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
        public void onInitializing(BluetoothDevice device) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Context context, BluetoothDevice bluetoothDevice, IDeviceInfoScanCallback iDeviceInfoScanCallback) {
        Debug.fi("BleScanCenter", "DeviceInfoScanner run~");
        ConditionVariable conditionVariable = new ConditionVariable();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        e.lock();
        try {
            BaseProfile baseProfile = new BaseProfile(context, bluetoothDevice, new a(atomicBoolean, conditionVariable));
            d = baseProfile;
            baseProfile.setAutoReconnect(false);
            d.connect();
            conditionVariable.block(20000L);
            ArrayList<String> arrayList = new ArrayList<>();
            DeviceInfo deviceInfo = null;
            if (atomicBoolean.get()) {
                List<BluetoothGattService> services = d.getServices();
                if (services != null && services.size() > 0) {
                    for (BluetoothGattService bluetoothGattService : services) {
                        GattUtils.printService(bluetoothGattService);
                        Debug.i("BleScanCenter", "UUID:" + bluetoothGattService.getUuid());
                        arrayList.add(bluetoothGattService.getUuid().toString());
                    }
                }
                deviceInfo = d.getDeviceInfo();
                Debug.i("BleScanCenter", "Device info:" + deviceInfo);
            }
            iDeviceInfoScanCallback.onDeviceInfoObtained(arrayList, deviceInfo);
        } finally {
            e.unlock();
        }
    }

    public static void destoryProfile() {
        if (d != null) {
            e.lock();
            try {
                BaseProfile baseProfile = d;
                if (baseProfile != null) {
                    baseProfile.destroy();
                    d = null;
                }
            } finally {
                e.unlock();
            }
        }
    }

    public static void scan(final Context context, final BluetoothDevice device, final IDeviceInfoScanCallback callback) {
        c.execute(new Runnable() { // from class: u71
            @Override // java.lang.Runnable
            public final void run() {
                DeviceInfoScanner.b(context, device, callback);
            }
        });
    }
}
