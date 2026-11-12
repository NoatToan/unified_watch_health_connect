package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0r extends a0q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f35264a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int d(d0q d0qVar, int i) {
        int[] iArr;
        if (d0qVar == null || (iArr = (int[]) d0qVar.f14937a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // defpackage.a0q
    public void a(d0q d0qVar) {
        View view = d0qVar.f14938b;
        Integer numValueOf = (Integer) d0qVar.f14937a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        d0qVar.f14937a.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        d0qVar.f14937a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // defpackage.a0q
    public String[] b() {
        return f35264a;
    }

    public int e(d0q d0qVar) {
        Integer num;
        if (d0qVar == null || (num = (Integer) d0qVar.f14937a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(d0q d0qVar) {
        return d(d0qVar, 0);
    }

    public int g(d0q d0qVar) {
        return d(d0qVar, 1);
    }
}
