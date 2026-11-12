/*
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 */
package miui.bluetooth.ble;

import android.os.ParcelUuid;

/**
 * BiBle service callback
 * @hide
 */
interface IBluetoothMiBleCallback
{
    void onConnectionState(in ParcelUuid clientId, in int status);
}
