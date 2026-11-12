package com.xiaomi.hm.health.bt.profile.base;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;

/* JADX INFO: loaded from: classes11.dex */
public class HMNotifyResponse {
    public static final byte DEFAULT_FLAG = 16;
    public static final byte RES_EXTEND = 4;
    public static final byte RES_SUCCESS = 1;
    private static final String g = "HMNotifyResponse";
    private byte a;
    private byte b;
    private byte c;
    private byte[] d;
    private boolean e;
    private byte[] f;

    public enum ResponseCode {
        RESERVED((byte) 0),
        SUCCESS((byte) 1),
        INVALID_STATE((byte) 2),
        UNKNOW_COMMAND((byte) 3),
        OPERATION_FAILED((byte) 4),
        SPACE_INSUFFICIENT((byte) 15),
        DIAL_ID_UNDEFINED((byte) 16),
        DIAL_BUILT_IN((byte) 17);

        private byte mValue;

        ResponseCode(byte code) {
            this.mValue = code;
        }

        public byte getValue() {
            return this.mValue;
        }
    }

    public HMNotifyResponse() {
        this.a = (byte) 16;
        this.b = (byte) -1;
        this.c = (byte) 0;
        this.d = null;
        this.e = false;
        this.f = null;
    }

    private synchronized void a(byte[] value, int cmdLen) {
        Debug.i(g, "from value:" + GattUtils.bytesToHexString(value));
        this.e = true;
        if (value != null && value.length > 0) {
            byte[] bArr = new byte[value.length];
            this.f = bArr;
            System.arraycopy(value, 0, bArr, 0, value.length);
        }
        int i = cmdLen + 2;
        if (value != null && value.length >= i) {
            this.a = value[0];
            this.b = value[1];
            this.c = value[i - 1];
            this.d = null;
            int length = value.length - i;
            if (length > 0) {
                byte[] bArr2 = new byte[length];
                this.d = bArr2;
                System.arraycopy(value, i, bArr2, 0, length);
            }
            Debug.i(g, toString());
        }
    }

    public static HMNotifyResponse parse(byte[] value) {
        return parse(value, 1);
    }

    public synchronized void from(byte[] value) {
        a(value, 1);
    }

    public synchronized byte getCmd() {
        return this.b;
    }

    public synchronized byte getCode() {
        return this.c;
    }

    public synchronized byte[] getData() {
        return this.d;
    }

    public synchronized byte[] getOriginResponseData() {
        return this.f;
    }

    public synchronized boolean hasParsed() {
        return this.e;
    }

    public synchronized boolean isSuccess(byte cmd) {
        return this.b == cmd && this.c == ResponseCode.SUCCESS.getValue();
    }

    public synchronized String toString() {
        return "HMNotifyResponse{origin=" + GattUtils.bytesToHexString(this.f) + ", flag=" + String.format("%02x ", Byte.valueOf(this.a)) + ", cmd=" + String.format("%02x ", Byte.valueOf(this.b)) + ", code=" + String.format("%02x ", Byte.valueOf(this.c)) + ", data=" + GattUtils.bytesToHexString(this.d) + '}';
    }

    public static HMNotifyResponse parse(byte[] value, int cmdLen) {
        HMNotifyResponse hMNotifyResponse = new HMNotifyResponse();
        hMNotifyResponse.a(value, cmdLen);
        return hMNotifyResponse;
    }

    public synchronized boolean isSuccess(byte cmd, short extendCmd) {
        byte[] bArr = this.f;
        boolean z = false;
        if (bArr != null && bArr.length >= 5) {
            if ((bArr[0] & 255) == 16 && (bArr[1] & 255) == cmd && (bArr[2] & 255) == (extendCmd & 255) && (bArr[3] & 255) == ((extendCmd >> 8) & 255) && (bArr[4] & 255) == ResponseCode.SUCCESS.getValue()) {
                z = true;
            }
            return z;
        }
        return false;
    }

    public synchronized boolean isSuccess() {
        return this.c == ResponseCode.SUCCESS.getValue();
    }

    public HMNotifyResponse(byte flag, byte cmd, byte code, byte[] data) {
        this.a = (byte) 16;
        this.b = (byte) -1;
        this.c = (byte) 0;
        this.d = null;
        this.e = false;
        this.f = null;
        this.a = flag;
        this.b = cmd;
        this.c = code;
        this.d = data;
        this.e = true;
    }

    public HMNotifyResponse(byte flag, byte cmd, byte code) {
        this.a = (byte) 16;
        this.b = (byte) -1;
        this.c = (byte) 0;
        this.d = null;
        this.e = false;
        this.f = null;
        this.a = flag;
        this.b = cmd;
        this.c = code;
        this.e = true;
    }
}
