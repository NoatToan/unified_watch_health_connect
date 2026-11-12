package com.xiaomi.hm.health.bt.gatt;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import androidx.annotation.NonNull;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public interface IGattCallback {
    public static final int ERROR_GATT_INVALID = 65281;
    public static final int ERROR_GATT_OPERATION_FAILED = 65282;
    public static final int ERROR_GATT_UNKNOWN = 65534;

    public interface IConnectionStateChangeCallback {
        void onDeviceConnected(BluetoothDevice device);

        void onDeviceConnecting(BluetoothDevice device);

        void onDeviceConnectionFailed(BluetoothDevice device, int status);

        void onDeviceDisconnected(BluetoothDevice device, int status);

        void onDeviceDiscovering(BluetoothDevice device);

        void onDeviceDiscoveryFailed(BluetoothDevice device, int status);

        void onDeviceDiscoverySuccess(BluetoothDevice device);

        void onInitializationResult(BluetoothDevice device, boolean result);

        void onInitializing(BluetoothDevice device);
    }

    public interface INotifyCallback {
        void notify(byte[] value);
    }

    public enum STATE {
        DISCONNECTING(3),
        DISCONNECTED(0),
        CONNECTING(1),
        CONNECTED(2);

        private int state;

        STATE(int state) {
            this.state = state;
        }

        public int getState() {
            return this.state;
        }
    }

    void cleanup();

    void connect();

    void destroy();

    void disconnect();

    BluetoothDevice getDevice();

    BluetoothGattService getService(UUID uuid);

    STATE getState();

    boolean init();

    @NonNull
    Boolean isAutoReconnect();

    byte[] read(BluetoothGattCharacteristic characteristic);

    int readCharacteristic(BluetoothGattCharacteristic characteristic);

    int readRemoteRssi();

    void refreshGatt(boolean wait);

    boolean registerNotification(BluetoothGattCharacteristic characteristic, INotifyCallback notifyCb);

    boolean requestConnectionPriority(int connectionPriority);

    int requestMtu(int mtu);

    void setAutoReconnect(boolean enable);

    Phy setPreferredPhy(int txPhy, int rxPhy, int phyOptions);

    boolean unregisterNotification(BluetoothGattCharacteristic characteristic);

    boolean write(BluetoothGattCharacteristic characteristic, byte[] value);

    int writeCharacteristic(BluetoothGattCharacteristic characteristic, byte[] value);
}
