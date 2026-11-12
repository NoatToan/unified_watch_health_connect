package com.huawei.multisimsdk.multidevicemanager.common;

import defpackage.obn;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbsPairedDevice {
    public String getDeviceID() {
        return null;
    }

    public abstract boolean getEuiccPairing();

    public abstract boolean getLiveIdSupported();

    public abstract String getPairedDeviceName();

    public abstract String getPairedID();

    public abstract int getPairedIDType();

    public abstract obn getSecondaryDeviceId();

    public abstract String getTerminalEid();

    public abstract String getTerminalIccid();

    public abstract String getTerminalId();

    public abstract String getTerminalModel();

    public abstract String getTerminalMsisdn();

    public abstract String getTerminalSwVersion();

    public abstract String getTerminalVendor();
}
