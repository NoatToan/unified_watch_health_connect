package com.xiaomi.smarthome.core.server.internal.bluetooth.mcu;

import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes10.dex */
public class McuEvent {
    public static final int ERROR_EVENT = 255;
    public static final int GET_DEV_SN = 2;
    public static final int GET_HARDWARE_VERSION = 3;
    public static final int GET_LATITUDE = 4;
    public static final int GET_LONGITUDE = 5;
    public static final int GET_MCU_VERSION = 1;
    public static final int GET_NEW_DEVICE_SN = 8;
    public static final int GET_SUPPORT_OPCODE = 0;
    public static final int GET_VENDOR_INFO1 = 6;
    public static final int GET_VERDOR_INFO2 = 7;
    private static final String TAG = "MCU-EVENT";
    private int opCode;
    private byte[] paramsValue;
    private int resultCode;
    private String value;

    private McuEvent(int i, int i2, byte[] bArr) {
        this.paramsValue = new byte[0];
        this.opCode = i2;
        this.resultCode = i;
        if (bArr != null) {
            this.paramsValue = bArr;
            this.value = new String(bArr);
        }
    }

    public static McuEvent parseValue(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBufferOrder.get() & 255;
        int i2 = byteBufferOrder.get();
        if (i != 255) {
            byte[] bArr2 = new byte[i2];
            byteBufferOrder.get(bArr2);
            return new McuEvent(0, i, bArr2);
        }
        byte b2 = byteBufferOrder.get();
        byte b3 = byteBufferOrder.get();
        MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, TAG, " Parse value fail, opcode= " + ((int) b2) + ",errorCode=" + ((int) b3));
        return new McuEvent(b3, b2, null);
    }

    public int getOpCode() {
        return this.opCode;
    }

    public byte[] getParamsValue() {
        return this.paramsValue;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String getValue() {
        return this.value;
    }
}
