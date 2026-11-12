/*
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 */
package miui.bluetooth.ble;

import miui.bluetooth.ble.IScanDeviceCallback;
import miui.bluetooth.ble.IBleEventCallback;
import miui.bluetooth.ble.ScanResult;

import android.os.IBinder;
import android.os.ParcelUuid;
import java.util.Map;
import java.util.List;

/**
 * API for interacting with IMiBleDeviceManager service
 * @hide
 */
interface IMiBleDeviceManager
{
    boolean setSettingString(in String device, in String setting, in String value);
    String getSettingString(in String device, in String setting);

    boolean setSettingInteger(in String device, in String setting, in int value);
    int getSettingInteger(in String device, in String setting);

    Map getDeviceSettings(in String device);
    boolean deleteSettings(in String device);
    int getDeviceType(in String device);

    boolean startScanDevice(IBinder token, in ParcelUuid clientId, in int property, IScanDeviceCallback callback);
    void stopScanDevice(in ParcelUuid clientId);

    boolean registerBleEventListener(in String device, int event, in IBleEventCallback callback);
    boolean unregisterBleEventListener(in String device, int event, in IBleEventCallback callback);

    // 获取服务的版本号
    int getServiceVersion();

    // 获取Ble service中管理绑定的设备
    List<String> getBoundDevices();

    // 注册本App接收BLE设备事件的Broadcast通知
    boolean registerAppForBleEvent(in String device, int event);
    // 取消注册本App接收BLE设备事件的Broadcast通知
    boolean unregisterAppForBleEvent(in String device, int event);
    // 获取已经注册的BLE设备事件的App的包名
    String getRegisterAppForBleEvent(in String device, int event);

    // Get device ScanResult staticly
    miui.bluetooth.ble.ScanResult getScanResult(in String device);

    boolean setToken(in String device, in byte[] token);
}
