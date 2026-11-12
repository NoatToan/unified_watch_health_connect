package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
class g0 extends Thread {
    public final /* synthetic */ bp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(bp bpVar, String str) {
        super(str);
        this.a = bpVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.a.r.c();
        } catch (Exception e) {
            this.a.c(9, e);
        }
    }
}
