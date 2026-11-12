package defpackage;

import com.github.mikephil.charting.data.BarEntry;

/* JADX INFO: loaded from: classes4.dex */
public class z02 extends gu3<x02> {
    public z02(x02 x02Var) {
        super(x02Var);
    }

    @Override // defpackage.gu3, defpackage.zsc
    public r7c a(float f, float f2) {
        r7c r7cVarA = super.a(f, f2);
        if (r7cVarA == null) {
            return null;
        }
        vye vyeVarJ = j(f, f2);
        gpc gpcVar = (gpc) ((x02) this.f19328a).getBarData().i(r7cVarA.d());
        if (gpcVar.N()) {
            return l(r7cVarA, gpcVar, (float) vyeVarJ.c, (float) vyeVarJ.d);
        }
        vye.c(vyeVarJ);
        return r7cVarA;
    }

    @Override // defpackage.gu3
    public a12 d() {
        return ((x02) this.f19328a).getBarData();
    }

    @Override // defpackage.gu3
    public float e(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3);
    }

    public int k(pbj[] pbjVarArr, float f) {
        if (pbjVarArr == null || pbjVarArr.length == 0) {
            return 0;
        }
        int i = 0;
        for (pbj pbjVar : pbjVarArr) {
            if (pbjVar.a(f)) {
                return i;
            }
            i++;
        }
        int iMax = Math.max(pbjVarArr.length - 1, 0);
        if (f > pbjVarArr[iMax].f30210b) {
            return iMax;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r7c l(r7c r7cVar, gpc gpcVar, float f, float f2) {
        BarEntry barEntry = (BarEntry) gpcVar.v0(f, f2);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.getYVals() == null) {
            return r7cVar;
        }
        pbj[] ranges = barEntry.getRanges();
        if (ranges.length <= 0) {
            return null;
        }
        int iK = k(ranges, f2);
        vye vyeVarE = ((x02) this.f19328a).getTransformer(gpcVar.m0()).e(r7cVar.h(), ranges[iK].f30210b);
        r7c r7cVar2 = new r7c(barEntry.getX(), barEntry.getY(), (float) vyeVarE.c, (float) vyeVarE.d, r7cVar.d(), iK, r7cVar.b());
        vye.c(vyeVarE);
        return r7cVar2;
    }
}
