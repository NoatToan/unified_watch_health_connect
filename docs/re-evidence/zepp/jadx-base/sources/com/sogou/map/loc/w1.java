package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class w1 implements Runnable {
    private /* synthetic */ v1 a;
    private final /* synthetic */ y0 b;

    public w1(v1 v1Var, y0 y0Var) {
        this.a = v1Var;
        this.b = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b0.j(this.a.a, this.b);
        } catch (Exception e) {
            r0.b("to Save error: " + e.getMessage());
        }
    }
}
