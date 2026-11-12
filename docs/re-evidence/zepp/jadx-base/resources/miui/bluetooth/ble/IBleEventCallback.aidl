/*
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 */
package miui.bluetooth.ble;

/**
 * The bluetooth device event listener handler, such as MIKEY event
 */
interface IBleEventCallback
{
    /**
     * The event handler
     * @param event the event key
     * @param data the event extra data
     * @return true for consume the event, and don't call subsequently listeners; false for otherwise.
     *     return false is recommend. Only return true if you are very sure you need this.
     */
    boolean onEvent(in String device, int event, in byte[] data);
}
