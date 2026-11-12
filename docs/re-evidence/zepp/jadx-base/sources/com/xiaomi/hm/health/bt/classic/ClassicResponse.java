package com.xiaomi.hm.health.bt.classic;

import androidx.annotation.NonNull;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.xiaomi.hm.health.bt.gatt.GattUtils;

/* JADX INFO: loaded from: classes19.dex */
public class ClassicResponse {
    public static final int i = 10;
    public static final int j = 4;
    public static final int k = 8;
    public static final int l = 2;
    public static final int m = 8;
    public static final int n = 9;
    private RequestType c;
    private ResponseStatus e;
    private byte a = RaceType.CMD_NEED_RESP;
    private Protocol b = Protocol.CTS;
    private int d = 0;
    private int f = 0;
    private byte[] g = null;
    private long h = 0;

    private void b(long crc32) {
        this.h = crc32;
    }

    private void c(byte[] payload) {
        this.g = payload;
    }

    private void d(byte preamble) {
        this.a = preamble;
    }

    public static ClassicResponse from(byte[] value) {
        if (value == null || value.length < 10) {
            return null;
        }
        int i2 = (value[8] & 255) | ((value[9] & 255) << 8);
        if (i2 + 10 + 4 != value.length) {
            return null;
        }
        ClassicResponse classicResponse = new ClassicResponse();
        classicResponse.d(value[0]);
        classicResponse.setProtocol(Protocol.from(value[1]));
        classicResponse.setType(RequestType.from(value[2]));
        classicResponse.setFlag(((value[4] & 255) << 8) | (value[3] & 255) | ((value[5] & 255) << 16) | ((value[6] & 255) << 24));
        classicResponse.setStatus(ResponseStatus.from(value[7]));
        classicResponse.setDataLen(i2);
        byte[] bArr = new byte[i2];
        System.arraycopy(value, 10, bArr, 0, i2);
        classicResponse.c(bArr);
        int i3 = i2 + 8;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        classicResponse.b(((value[i5 + 1] & 255) << 24) | ((value[i4] & 255) << 8) | (value[i3] & 255) | ((value[i5] & 255) << 16));
        return classicResponse;
    }

    public byte[] a() {
        return this.g;
    }

    public int getDataLen() {
        return this.f;
    }

    public int getFlag() {
        return this.d;
    }

    public Protocol getProtocol() {
        return this.b;
    }

    public ResponseStatus getStatus() {
        return this.e;
    }

    public RequestType getType() {
        return this.c;
    }

    public void setDataLen(int dataLen) {
        this.f = dataLen;
    }

    public void setFlag(int flag) {
        this.d = flag;
    }

    public void setProtocol(Protocol protocol) {
        this.b = protocol;
    }

    public void setStatus(ResponseStatus status) {
        this.e = status;
    }

    public void setType(RequestType type) {
        this.c = type;
    }

    @NonNull
    public String toString() {
        return "ClassicResponse{preamble=" + ((int) this.a) + ", protocol=" + this.b + ", type=" + this.c + ", flag=" + this.d + ", status=" + this.e + ", dataLen=" + this.f + ", payload=" + GattUtils.bytesToHexString(this.g) + ", crc32=" + this.h + '}';
    }
}
