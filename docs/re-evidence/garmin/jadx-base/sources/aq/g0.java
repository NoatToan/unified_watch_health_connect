package aq;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class g0 extends p005kotlin.jvm.internal.q implements e23.l<Double, Unit> {
    public g0(Object obj) {
        super(1, obj, i0.class, "newWeightSelected", "newWeightSelected(Ljava/lang/Double;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Double d14) {
        Double d15 = d14;
        i0 i0Var = (i0) this.receiver;
        ArrayList<x> arrayList = i0Var.f11990a;
        double dC = d15 == null ? 0.0d : ss.f.c(d15.doubleValue());
        for (x xVar : arrayList) {
            com.garmin.android.apps.connectmobile.repcounting.model.d dVar = xVar.f12287c;
            boolean z14 = dVar != null ? dVar.f41105d : false;
            com.garmin.android.apps.connectmobile.repcounting.model.d dVar2 = xVar.f12288d;
            if (dC == 0.0d && !z14 && dVar2 != null) {
                com.garmin.android.apps.connectmobile.repcounting.model.e eVar = xVar.f12286b;
                com.garmin.android.apps.connectmobile.repcounting.model.e eVarP = gl.b.P(dVar2);
                eVarP.g0(eVar.D());
                eVarP.i0(eVar.H());
                eVarP.n0(-1L);
                xVar.f12286b = eVarP;
                xVar.f12288d = xVar.f12287c;
                xVar.f12287c = dVar2;
            } else if (dC == 0.0d && !z14) {
                xVar.f12286b.n0(-2L);
            } else if (dC == 0.0d && z14) {
                xVar.f12286b.n0(-1L);
            } else if (dC > 0.0d && z14 && dVar2 != null) {
                com.garmin.android.apps.connectmobile.repcounting.model.e eVar2 = xVar.f12286b;
                com.garmin.android.apps.connectmobile.repcounting.model.e eVarP2 = gl.b.P(dVar2);
                eVarP2.g0(eVar2.D());
                eVarP2.i0(eVar2.H());
                eVarP2.n0(Long.valueOf((long) dC));
                xVar.f12286b = eVarP2;
                xVar.f12288d = xVar.f12287c;
                xVar.f12287c = dVar2;
            } else if (dC > 0.0d && z14) {
                xVar.f12286b.n0(-1L);
            } else if (dC <= 0.0d || z14) {
                xVar.f12286b.n0(-2L);
            } else {
                xVar.f12286b.n0(Long.valueOf((long) dC));
            }
        }
        i0Var.x4(arrayList);
        i0Var.f11999j.j(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
