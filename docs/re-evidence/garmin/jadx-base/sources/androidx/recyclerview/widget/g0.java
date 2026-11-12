package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class g0 {
    private g0() {
    }

    public static int a(RecyclerView.b0 b0Var, d0 d0Var, View view2, View view3, RecyclerView.p pVar, boolean z14) {
        if (pVar.getChildCount() == 0 || b0Var.b() == 0 || view2 == null || view3 == null) {
            return 0;
        }
        if (!z14) {
            return Math.abs(pVar.getPosition(view2) - pVar.getPosition(view3)) + 1;
        }
        return Math.min(d0Var.l(), d0Var.b(view3) - d0Var.e(view2));
    }

    public static int b(RecyclerView.b0 b0Var, d0 d0Var, View view2, View view3, RecyclerView.p pVar, boolean z14, boolean z15) {
        if (pVar.getChildCount() == 0 || b0Var.b() == 0 || view2 == null || view3 == null) {
            return 0;
        }
        int iMax = z15 ? Math.max(0, (b0Var.b() - Math.max(pVar.getPosition(view2), pVar.getPosition(view3))) - 1) : Math.max(0, Math.min(pVar.getPosition(view2), pVar.getPosition(view3)));
        if (z14) {
            return Math.round((iMax * (Math.abs(d0Var.b(view3) - d0Var.e(view2)) / (Math.abs(pVar.getPosition(view2) - pVar.getPosition(view3)) + 1))) + (d0Var.k() - d0Var.e(view2)));
        }
        return iMax;
    }

    public static int c(RecyclerView.b0 b0Var, d0 d0Var, View view2, View view3, RecyclerView.p pVar, boolean z14) {
        if (pVar.getChildCount() == 0 || b0Var.b() == 0 || view2 == null || view3 == null) {
            return 0;
        }
        if (!z14) {
            return b0Var.b();
        }
        return (int) (((d0Var.b(view3) - d0Var.e(view2)) / (Math.abs(pVar.getPosition(view2) - pVar.getPosition(view3)) + 1)) * b0Var.b());
    }
}
