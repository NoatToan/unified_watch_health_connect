package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer;

import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothRecognizeResult {
    public String model;
    public MiotBleAdvPacket packet;
    public MiotBleAdvPacket packet4Pid;
    public int rssi;

    public BluetoothRecognizeResult() {
    }

    public void clone(BluetoothRecognizeResult bluetoothRecognizeResult) {
        this.model = bluetoothRecognizeResult.model;
        this.packet = bluetoothRecognizeResult.packet;
    }

    public BluetoothRecognizeResult(String str) {
        this.model = str;
    }

    public BluetoothRecognizeResult(String str, MiotBleAdvPacket miotBleAdvPacket) {
        this.model = str;
        this.packet = miotBleAdvPacket;
    }
}
