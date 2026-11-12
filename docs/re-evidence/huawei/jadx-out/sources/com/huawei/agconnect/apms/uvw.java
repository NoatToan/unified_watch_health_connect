package com.huawei.agconnect.apms;

/* JADX INFO: loaded from: classes3.dex */
public final class uvw implements Runnable {
    public final /* synthetic */ vwx abc;

    public uvw(vwx vwxVar) {
        this.abc = vwxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.abc.def.decrementAndGet() == 0) {
            vwx vwxVar = this.abc;
            vwxVar.getClass();
            vwxVar.abc.execute(new stu(vwxVar));
        }
    }
}
