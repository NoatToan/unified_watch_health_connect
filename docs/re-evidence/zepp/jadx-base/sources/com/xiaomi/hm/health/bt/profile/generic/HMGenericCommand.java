package com.xiaomi.hm.health.bt.profile.generic;

import androidx.annotation.NonNull;
import com.xiaomi.hm.health.bt.gatt.GattUtils;

/* JADX INFO: loaded from: classes18.dex */
public class HMGenericCommand {
    public static final int SYNC_ALARM = 1;
    public static final int SYNC_COACH_STATE = 4;
    public static final int SYNC_COMM = 7;
    public static final int SYNC_DEVICE_FEATURE = 15;
    public static final int SYNC_DIAL = 3;
    public static final int SYNC_EARBUD_MUSIC_PLAY_TIME = 21;
    public static final int SYNC_GRSP_DESC = 16;
    public static final int SYNC_LANGUAGE = 14;
    public static final int SYNC_MEDICAL_REG_VERSION = 22;
    public static final int SYNC_MULTI_TARGET = 19;
    public static final int SYNC_MUSIC = 13;
    public static final int SYNC_REMINDER = 2;
    public static final int SYNC_SPORT_DATA_ITEM = 18;
    public static final int SYNC_SPORT_TYPE = 17;
    private static final byte d = -1;
    private static final byte e = -2;
    private static final byte f = -3;
    private static final byte g = -4;
    private byte a;
    private int b;
    private byte[] c = null;

    public HMGenericCommand(int op) {
        if (op == 15) {
            this.a = (byte) -3;
        } else if (op == 7) {
            this.a = (byte) -2;
        } else if (op == 16) {
            this.a = (byte) -4;
        } else {
            this.a = (byte) -1;
        }
        this.b = op;
    }

    public byte[] getBytes() {
        byte[] bArr = this.c;
        int length = bArr == null ? 0 : bArr.length;
        byte[] bArr2 = new byte[length + 5];
        bArr2[0] = this.a;
        int i = this.b;
        bArr2[1] = (byte) (i & 255);
        bArr2[2] = (byte) ((i >> 8) & 255);
        bArr2[3] = (byte) ((i >> 16) & 255);
        bArr2[4] = (byte) ((i >> 24) & 255);
        if (bArr != null && bArr.length > 0) {
            System.arraycopy(bArr, 0, bArr2, 5, length);
        }
        return bArr2;
    }

    public int getOp() {
        return this.b;
    }

    public byte getType() {
        return this.a;
    }

    public void setCommandExtend(byte[] commandExtend) {
        this.c = commandExtend;
    }

    public void setOp(int op) {
        this.b = op;
    }

    public void setType(byte type) {
        this.a = type;
    }

    @NonNull
    public String toString() {
        return "HMGenericCommand{type=" + ((int) this.a) + ", op=" + this.b + ", commandExtend: " + GattUtils.bytesToHexString(this.c) + '}';
    }
}
