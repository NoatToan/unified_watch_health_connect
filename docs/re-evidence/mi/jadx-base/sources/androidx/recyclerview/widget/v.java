package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class v {
    public static int a(RecyclerView.z zVar, s sVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.getChildCount() == 0 || zVar.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1;
        }
        return Math.min(sVar.n(), sVar.d(view2) - sVar.g(view));
    }

    public static int b(RecyclerView.z zVar, s sVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.getChildCount() == 0 || zVar.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (zVar.c() - Math.max(oVar.getPosition(view), oVar.getPosition(view2))) - 1) : Math.max(0, Math.min(oVar.getPosition(view), oVar.getPosition(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(sVar.d(view2) - sVar.g(view)) / (Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1))) + (sVar.m() - sVar.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.z zVar, s sVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.getChildCount() == 0 || zVar.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zVar.c();
        }
        return (int) (((sVar.d(view2) - sVar.g(view)) / (Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1)) * zVar.c());
    }
}
