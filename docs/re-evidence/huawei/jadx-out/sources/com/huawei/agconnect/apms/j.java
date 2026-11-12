package com.huawei.agconnect.apms;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements Runnable {
    public final /* synthetic */ k abc;

    public j(k kVar) {
        this.abc = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        k kVar = this.abc;
        long j = kVar.bcd.totalMemory();
        this.abc.efg.offer(new opq(jCurrentTimeMillis, j - kVar.bcd.freeMemory(), kVar.bcd.maxMemory(), j));
    }
}
