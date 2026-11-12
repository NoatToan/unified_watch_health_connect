package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon;

import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;

/* JADX INFO: loaded from: classes10.dex */
public class BleAdvertiseItem {
    public byte[] bytes;
    public int len;
    public int type;

    public byte[] getBytes() {
        return this.bytes;
    }

    public int getLen() {
        return this.len;
    }

    public int getType() {
        return this.type;
    }

    public void setBytes(byte[] bArr) {
        this.bytes = bArr;
    }

    public void setLen(int i) {
        this.len = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Type: 0x%02x, ", Integer.valueOf(this.type)));
        sb.append(String.format("Len: %d, ", Integer.valueOf(this.len)));
        int i = this.type;
        String str = (i == 8 || i == 9) ? "%c" : "%02x ";
        try {
            for (byte b2 : this.bytes) {
                sb.append(String.format(str, Byte.valueOf(b2)));
            }
        } catch (Throwable th) {
            BluetoothLog.e(th);
        }
        return sb.toString();
    }
}
