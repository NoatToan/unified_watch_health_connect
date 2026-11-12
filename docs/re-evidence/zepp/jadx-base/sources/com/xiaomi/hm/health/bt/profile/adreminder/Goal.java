package com.xiaomi.hm.health.bt.profile.adreminder;

import com.alipay.sdk.m.u.i;
import com.xiaomi.hm.health.bt.gatt.GattUtils;

/* JADX INFO: loaded from: classes4.dex */
public class Goal {
    public static byte c = 1;
    public static byte d = 2;
    public static byte e = 1;
    private int a;
    private int b;

    public byte[] a() {
        byte[] bArr = new byte[8];
        System.arraycopy(GattUtils.intToBytes(this.a), 0, bArr, 0, 4);
        System.arraycopy(GattUtils.intToBytes(this.b), 0, bArr, 4, 4);
        return bArr;
    }

    public int getFlag() {
        return this.a;
    }

    public int getValue() {
        return this.b;
    }

    public void setFlag(int flag) {
        this.a = flag;
    }

    public void setValue(int value) {
        this.b = value;
    }

    public String toString() {
        return "Goal{flag=" + this.a + ", value=" + this.b + i.d;
    }
}
