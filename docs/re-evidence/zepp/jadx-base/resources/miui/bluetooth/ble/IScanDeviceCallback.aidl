/*
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 */
package miui.bluetooth.ble;

import android.os.ParcelUuid;
import android.bluetooth.BluetoothDevice;

/**
 * scan mi ble device callback
 * @hide
 */
interface IScanDeviceCallback
{
    void onScanDevice(in int property, in BluetoothDevice device, in int rssi, in byte[] data);
}
