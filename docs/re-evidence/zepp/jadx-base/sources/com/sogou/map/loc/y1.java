package com.sogou.map.loc;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
final class y1 implements Runnable {
    private /* synthetic */ b0 a;
    private final /* synthetic */ d1 b;
    private final /* synthetic */ y0 c;
    private final /* synthetic */ x0 d;
    private final /* synthetic */ int e;

    public y1(b0 b0Var, d1 d1Var, y0 y0Var, x0 x0Var, int i) {
        this.a = b0Var;
        this.b = d1Var;
        this.c = y0Var;
        this.d = x0Var;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ArrayList arrayList = new ArrayList();
            d1 d1Var = this.b;
            a1 a1VarA = d1Var == null ? null : d1Var.a();
            y0 y0Var = this.c;
            if (y0Var != null) {
                if (a1VarA != null) {
                    y0Var.b(a1VarA.k);
                } else {
                    y0Var.b(4);
                }
            }
            if (a1VarA != null && j0.f(a1VarA.a) == null) {
                this.b.c(null);
            }
            ArrayList<String> arrayList2 = new ArrayList();
            d1 d1Var2 = this.b;
            if (d1Var2 != null) {
                arrayList2.add(d1Var2.e());
            }
            y0 y0Var2 = this.c;
            if (y0Var2 != null) {
                arrayList2.add(y0Var2.e());
            }
            x0 x0Var = this.d;
            if (x0Var != null) {
                arrayList2.add(x0Var.a());
            }
            for (String strC : arrayList2) {
                try {
                    strC = v1.c(strC);
                } catch (Exception unused) {
                }
                arrayList.add(strC);
            }
            b0.i(this.a, this.e, arrayList);
        } catch (Throwable th) {
            r0.b("saveRun error: " + th.getMessage());
        }
    }
}
