package com.xiaomi.hm.health.bt.profile.generic;

import androidx.annotation.NonNull;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes18.dex */
public class HMGenericResponse {
    public static final byte NOTIFY_TAG = -128;
    public static final int RES_NO_DATA = 2;
    public static final int RES_RESERVED = 0;
    public static final int RES_SUCCESS = 1;
    public static final int RES_UNKNOWN_CMD = 3;
    public static final byte VERSION_1 = 1;
    private static final String k = "HMGenericResponse";
    private static final byte l = 0;
    private static final byte m = 1;
    private static final byte n = 2;
    private static final byte o = 3;
    private HMGenericCommand c;
    private final ByteArrayOutputStream a = new ByteArrayOutputStream();
    private final ByteArrayOutputStream b = new ByteArrayOutputStream();
    private int d = -1;
    private HMGenericCommand e = null;
    private byte[] f = null;
    private int g = 0;
    private int h = -1;
    private boolean i = false;
    private boolean j = false;

    public HMGenericResponse(HMGenericCommand command) {
        this.c = command;
    }

    private void a() {
        int size = this.b.size();
        if (size < 5) {
            return;
        }
        byte[] byteArray = this.b.toByteArray();
        this.e = new HMGenericCommand((byteArray[0] & 255) | ((byteArray[1] & 255) << 8) | ((byteArray[2] & 255) << 16) | ((byteArray[3] & 255) << 24));
        this.d = byteArray[4] & 255;
        int i = size - 5;
        if (i > 0) {
            byte[] bArr = new byte[i];
            this.f = bArr;
            System.arraycopy(byteArray, 5, bArr, 0, i);
        }
    }

    public void add(byte[] value) {
        int length;
        if (value == null || (length = value.length) <= 4) {
            this.i = true;
            return;
        }
        this.a.write(value, 0, length);
        if (value[0] != -128) {
            this.i = true;
            return;
        }
        this.g = value[1] & 255;
        int i = (value[2] & 255) >> 6;
        int i2 = value[3] & 255;
        int i3 = length - 4;
        byte[] bArr = new byte[i3];
        System.arraycopy(value, 4, bArr, 0, i3);
        this.b.write(bArr, 0, i3);
        if (i == 2 || i == 3) {
            this.i = true;
        }
        if (this.h + 1 != i2) {
            this.j = true;
        }
        this.h = i2;
        if (!this.i || this.j) {
            return;
        }
        a();
    }

    public byte[] commandResponseData() {
        return this.f;
    }

    public int commandResponseStatus() {
        return this.d;
    }

    public boolean isCommandSuccess() {
        int i = this.d;
        return (i == 1 || i == 2) && this.e.getType() == this.c.getType();
    }

    public boolean isEnd() {
        return this.i;
    }

    @NonNull
    public String toString() {
        return "HMGenericResponse{rawTransferDatas=" + GattUtils.bytesToHexString(this.a.toByteArray()) + ", transferDatas=" + GattUtils.bytesToHexString(this.b.toByteArray()) + ", commandResponseData=" + GattUtils.bytesToHexString(this.f) + ", inCommand=" + this.c + ", commandResponseStatus=" + this.d + ", responseCommand=" + this.e + ", version=" + this.g + ", lastIndex=" + this.h + ", isEnd=" + this.i + ", isLossPacket=" + this.j + '}';
    }
}
