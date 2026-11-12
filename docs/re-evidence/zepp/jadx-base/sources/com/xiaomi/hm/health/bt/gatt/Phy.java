package com.xiaomi.hm.health.bt.gatt;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes19.dex */
public class Phy {
    private int a;
    private int b;

    public Phy() {
        this.a = 0;
        this.b = 0;
    }

    public int getRxPhy() {
        return this.b;
    }

    public int getTxPhy() {
        return this.a;
    }

    public void setRxPhy(int rxPhy) {
        this.b = rxPhy;
    }

    public void setTxPhy(int txPhy) {
        this.a = txPhy;
    }

    @NonNull
    public String toString() {
        return "{txPhy=" + this.a + ", rxPhy=" + this.b + com.alipay.sdk.m.u.i.d;
    }

    public Phy(int txPhy, int rxPhy) {
        this.a = txPhy;
        this.b = rxPhy;
    }
}
