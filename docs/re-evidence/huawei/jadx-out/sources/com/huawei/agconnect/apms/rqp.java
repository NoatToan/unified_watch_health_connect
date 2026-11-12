package com.huawei.agconnect.apms;

/* JADX INFO: loaded from: classes3.dex */
public final class rqp {
    public static rqp fgh;
    public int abc;
    public int bcd;
    public int cde;
    public long def;
    public long efg;

    public static rqp abc() {
        if (fgh == null) {
            synchronized (rqp.class) {
                if (fgh == null) {
                    rqp rqpVar = new rqp();
                    fgh = rqpVar;
                    rqpVar.bcd();
                }
            }
        }
        return fgh;
    }

    public final void bcd() {
        this.abc = 60;
        this.cde = 100;
        this.bcd = 1000;
        this.def = 240L;
        this.efg = 30000L;
    }
}
