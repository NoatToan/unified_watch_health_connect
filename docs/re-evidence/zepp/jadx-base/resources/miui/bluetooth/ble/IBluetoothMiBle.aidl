/*
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 */
package miui.bluetooth.ble;

import miui.bluetooth.ble.IBluetoothMiBleCallback;
import miui.bluetooth.ble.IBluetoothMiBlePropertyCallback;
import android.os.IBinder;
import android.os.ParcelUuid;
import android.bluetooth.BluetoothDevice;

/**
 * API for interacting with MiBle service
 * @hide
 */
interface IBluetoothMiBle
{
    /* connection */
    // 注册客户端，因为service中的链接是共享的，需要用clientId来区分上层每个client对象
    void registerClient(IBinder token, in String device, in ParcelUuid clientId, in IBluetoothMiBleCallback callback);
    void unregisterClient(IBinder token, in String device, in ParcelUuid clientId);
    boolean isConnected(in String device);
    // 发起连接和断开链接
    void connect(in String device, in ParcelUuid clientId);
    void disconnect(in String device, in ParcelUuid clientId);
    List<BluetoothDevice> getConnectedDevices();
    int getRssi(in String device, in ParcelUuid clientId);

    /* basic interface */
    // 检测设备是否支持特定的property（属性或者叫功能）
    boolean supportProperty(in String device, in int property);
    // 有些属性在变化的时候是有回调的，例如手环的实时步数，可以通过这类接口注册客户端回调
    boolean registerPropertyCallback(in String device, in ParcelUuid clientId, in int property, IBluetoothMiBlePropertyCallback callback);
    boolean unregisterPropertyCallback(in String device, in ParcelUuid clientId, in int property, IBluetoothMiBlePropertyCallback callback);
    // property通用的Getter和Setter，例如设置日期、Light样式
    boolean setProperty(in String device, in ParcelUuid clientId, in int property, in byte[] data);
    byte[] getProperty(in String device, in ParcelUuid clientId, in int property);
    /* basic interface end */

    /* business interface */
    boolean authorize(in String device, in ParcelUuid clientId, in String key);
    boolean setRssiThreshold(in String device, in ParcelUuid clientId, in int rssi);
    boolean authenticate(in String device, in ParcelUuid clientId);

    boolean setEncryptionKey(in String device, in ParcelUuid clientId, in byte[] key);
    byte[] encrypt(in String device, in ParcelUuid clientId, in byte[] text);
    /* business interface end */

    // 获取服务的版本号
    int getServiceVersion();
}
