package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class s1 implements Runnable {
    private /* synthetic */ r1 a;

    public s1(r1 r1Var) {
        this.a = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r0.a(4, "locate", "scan timeout");
        synchronized (this.a.o) {
            if (this.a.p != null) {
                if (this.a.h >= this.a.g) {
                    r1.B(this.a);
                } else {
                    this.a.p.b(null);
                }
            }
        }
    }
}
