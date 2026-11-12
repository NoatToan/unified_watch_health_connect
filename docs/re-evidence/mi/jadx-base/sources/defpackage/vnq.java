package defpackage;

import defpackage.a52;

/* JADX INFO: loaded from: classes7.dex */
public class vnq<V extends a52> extends rtr {
    public vnq(V v) {
        super(v);
    }

    public static vnq o(a52 a52Var, float f) {
        vnq vnqVar = new vnq(a52Var);
        vnqVar.mAxisMaximum = f;
        vnqVar.setLabelCount(4);
        return vnqVar;
    }

    public static vnq p(a52 a52Var, float f, int i) {
        vnq vnqVar = new vnq(a52Var);
        vnqVar.mAxisMaximum = f;
        vnqVar.setLabelCount(i);
        vnqVar.f = i;
        return vnqVar;
    }

    public static vnq q(a52 a52Var, float f, float f2, int i) {
        vnq vnqVar = new vnq(a52Var);
        vnqVar.mAxisMaximum = f;
        vnqVar.mAxisMinimum = f2;
        vnqVar.setLabelCount(i);
        vnqVar.f = i;
        return vnqVar;
    }

    public vnq r(vnq vnqVar, float f, float f2, int i) {
        vnqVar.setAxisMaximum(f);
        vnqVar.setAxisMinimum(f2);
        vnqVar.c(4, i);
        return vnqVar;
    }

    public vnq s(vnq vnqVar, float f, int i) {
        vnqVar.setAxisMaximum(f);
        vnqVar.setLabelCount(i);
        vnqVar.f = i;
        return vnqVar;
    }
}
