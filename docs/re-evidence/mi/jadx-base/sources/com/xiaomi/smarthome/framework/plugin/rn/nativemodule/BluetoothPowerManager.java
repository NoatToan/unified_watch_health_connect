package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.facebook.react.bridge.ReadableArray;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothPowerManager {
    private static final String TAG = "BluetoothPowerManager";
    private static volatile BluetoothPowerManager sInstance;
    private BluetoothPowerThread mBluetoothPowerThread;
    private BroadcastReceiver mBroadcastReceiver;
    private BluetoothGattServer mBtGattServer;
    private BluetoothGattServerCallback mBtGattServerCallback;
    private BluetoothGattCharacteristic mNotifyCharacteristic;
    private Handler mWorkerHandler = new Handler(Looper.getMainLooper());
    private Runnable mRemoveReceiverRunnable = new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.BluetoothPowerManager.1
        @Override // java.lang.Runnable
        public void run() {
            BluetoothPowerManager.this.removeRegisterReceiver();
        }
    };
    private Context mContext = MiJiaEnvironment.getAppContext();

    public class BluetoothPowerThread extends Thread {
        private volatile boolean isSendPowering = true;
        private ReadableArray uuiDs;

        public BluetoothPowerThread(ReadableArray readableArray) {
            this.uuiDs = readableArray;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @RequiresApi(api = 21)
        public void run() {
            this.isSendPowering = true;
            for (int i = 0; this.isSendPowering && i < 500; i++) {
                boolean zSendPowerData = BluetoothPowerManager.this.sendPowerData(this.uuiDs);
                try {
                    Thread.sleep(30L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!zSendPowerData) {
                    return;
                }
            }
        }

        public void stopSendPowerData() {
            this.isSendPowering = false;
        }
    }

    private BluetoothPowerManager() {
    }

    private void checkBluetoothState(final BluetoothAdapter bluetoothAdapter, final ReadableArray readableArray) {
        try {
            removeRegisterReceiver();
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.BluetoothPowerManager.2
                @Override // android.content.BroadcastReceiver
                @RequiresApi(api = 21)
                public void onReceive(Context context, Intent intent) {
                    if (intent.getAction() != null && intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 12) {
                        BluetoothPowerManager.this.startBTAdvertising(bluetoothAdapter, readableArray);
                        BluetoothPowerManager.this.removeRegisterReceiver();
                    }
                }
            };
            this.mBroadcastReceiver = broadcastReceiver;
            this.mContext.registerReceiver(broadcastReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            this.mWorkerHandler.removeCallbacks(this.mRemoveReceiverRunnable);
            this.mWorkerHandler.postDelayed(this.mRemoveReceiverRunnable, 11000L);
        } catch (Exception unused) {
        }
    }

    @RequiresApi(api = 21)
    private static AdvertiseData createAdvertiseData(ReadableArray readableArray) {
        AdvertiseData.Builder builder = new AdvertiseData.Builder();
        if (readableArray.size() > 0) {
            builder.addServiceUuid(ParcelUuid.fromString(readableArray.getString(0)));
        }
        return builder.build();
    }

    @RequiresApi(api = 21)
    private static AdvertiseSettings createAdvertiseSettings(boolean z, int i) {
        AdvertiseSettings.Builder builder = new AdvertiseSettings.Builder();
        builder.setAdvertiseMode(1);
        builder.setConnectable(z);
        builder.setTimeout(i);
        builder.setTxPowerLevel(3);
        return builder.build();
    }

    public static BluetoothPowerManager getInstance() {
        if (sInstance == null) {
            synchronized (BluetoothPowerManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new BluetoothPowerManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void initBleService() {
    }

    private boolean isBluetoothHalfOpen() {
        return Settings.Global.getInt(MiJiaEnvironment.getAppContext().getContentResolver(), "bluetooth_restricte_state", 0) == 1;
    }

    public void removeRegisterReceiver() {
        try {
            if (this.mBroadcastReceiver != null) {
                if (this.mContext != null) {
                    this.mContext.unregisterReceiver(this.mBroadcastReceiver);
                }
                this.mBroadcastReceiver = null;
            }
        } catch (Exception unused) {
        }
    }

    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    public boolean sendPowerData(ReadableArray readableArray) {
        BluetoothManager bluetoothManager;
        BluetoothAdapter adapter;
        if (this.mContext == null || readableArray == null || readableArray.size() == 0 || !this.mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") || (bluetoothManager = (BluetoothManager) this.mContext.getSystemService("bluetooth")) == null || (adapter = bluetoothManager.getAdapter()) == null) {
            return false;
        }
        if (adapter.isEnabled() && !isBluetoothHalfOpen()) {
            startBTAdvertising(adapter, readableArray);
            return true;
        }
        checkBluetoothState(adapter, readableArray);
        if (!adapter.enable() && this.mContext != null) {
            try {
                Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
                intent.setFlags(268435456);
                this.mContext.startActivity(intent);
            } catch (Exception e) {
                MiJiaLog.writeLogOnAll(LogType.KUAILIAN, ProductList.ProductInfo.BLE_TYPE, "sendPowerData err : " + Log.getStackTraceString(e));
            }
        }
        return false;
    }

    public boolean startAdvertising(ReadableArray readableArray) {
        BluetoothPowerThread bluetoothPowerThread = this.mBluetoothPowerThread;
        if (bluetoothPowerThread != null && bluetoothPowerThread.isAlive()) {
            return false;
        }
        BluetoothPowerThread bluetoothPowerThread2 = new BluetoothPowerThread(readableArray);
        this.mBluetoothPowerThread = bluetoothPowerThread2;
        bluetoothPowerThread2.start();
        return true;
    }

    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    public boolean startBTAdvertising(final BluetoothAdapter bluetoothAdapter, ReadableArray readableArray) {
        if (bluetoothAdapter.isEnabled() && !isBluetoothHalfOpen()) {
            BluetoothLeAdvertiser bluetoothLeAdvertiser = bluetoothAdapter.getBluetoothLeAdvertiser();
            if (bluetoothLeAdvertiser == null) {
                return false;
            }
            AdvertiseCallback advertiseCallback = new AdvertiseCallback() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.BluetoothPowerManager.4
                @Override // android.bluetooth.le.AdvertiseCallback
                public void onStartFailure(int i) {
                    super.onStartFailure(i);
                }

                @Override // android.bluetooth.le.AdvertiseCallback
                public void onStartSuccess(AdvertiseSettings advertiseSettings) {
                    super.onStartSuccess(advertiseSettings);
                }
            };
            AdvertiseSettings advertiseSettingsCreateAdvertiseSettings = createAdvertiseSettings(true, 10000);
            AdvertiseData advertiseDataCreateAdvertiseData = createAdvertiseData(readableArray);
            if (advertiseSettingsCreateAdvertiseSettings != null && advertiseDataCreateAdvertiseData != null) {
                try {
                    bluetoothLeAdvertiser.startAdvertising(advertiseSettingsCreateAdvertiseSettings, advertiseDataCreateAdvertiseData, advertiseCallback);
                    return true;
                } catch (Exception e) {
                    MRnLog.i(TAG, "startAdvertising error  " + Log.getStackTraceString(e));
                }
            }
            return false;
        }
        if (!bluetoothAdapter.enable() && this.mContext != null) {
            try {
                Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
                intent.setFlags(268435456);
                this.mContext.startActivity(intent);
            } catch (Exception e2) {
                MiJiaLog.writeLogOnAll(LogType.KUAILIAN, ProductList.ProductInfo.BLE_TYPE, "startBTAdvertising err : " + Log.getStackTraceString(e2));
            }
        }
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(200L);
                if (bluetoothAdapter.getBluetoothLeAdvertiser() != null) {
                    break;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        Thread.sleep(100L);
        this.mWorkerHandler.postDelayed(new Runnable() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.BluetoothPowerManager.3
            @Override // java.lang.Runnable
            public void run() {
                BluetoothPowerManager.this.stopAdvertising();
                BluetoothLeAdvertiser bluetoothLeAdvertiser2 = bluetoothAdapter.getBluetoothLeAdvertiser();
                if (bluetoothLeAdvertiser2 == null) {
                    MiJiaLog.writeLogOnAll(LogType.KUAILIAN, ProductList.ProductInfo.BLE_TYPE, "stopAdvertising bleAdv is null");
                } else {
                    bluetoothLeAdvertiser2.stopAdvertising(new AdvertiseCallback() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.BluetoothPowerManager.3.1
                        @Override // android.bluetooth.le.AdvertiseCallback
                        public void onStartFailure(int i2) {
                            super.onStartFailure(i2);
                            MiJiaLog.writeLogOnAll(LogType.KUAILIAN, ProductList.ProductInfo.BLE_TYPE, "stopAdvertising fail=" + i2);
                        }

                        @Override // android.bluetooth.le.AdvertiseCallback
                        public void onStartSuccess(AdvertiseSettings advertiseSettings) {
                            super.onStartSuccess(advertiseSettings);
                            MiJiaLog.writeLogOnAll(LogType.KUAILIAN, ProductList.ProductInfo.BLE_TYPE, "stopAdvertising ok");
                        }
                    });
                }
            }
        }, 11000L);
        return false;
    }

    public void stopAdvertising() {
        BluetoothPowerThread bluetoothPowerThread = this.mBluetoothPowerThread;
        if (bluetoothPowerThread != null && bluetoothPowerThread.isAlive()) {
            this.mBluetoothPowerThread.stopSendPowerData();
        }
        removeRegisterReceiver();
    }
}
