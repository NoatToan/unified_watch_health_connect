/*
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 */
package miui.bluetooth.ble;

import android.os.ParcelUuid;

/**
 * MiBle property notify callback
 * @hide
 */
interface IBluetoothMiBlePropertyCallback
{
    void notifyProperty(in ParcelUuid clientId, int property, in byte[] data);
}
