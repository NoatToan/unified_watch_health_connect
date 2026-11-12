package defpackage;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class kac extends z02 {
    public kac(x02 x02Var) {
        super(x02Var);
    }

    @Override // defpackage.z02, defpackage.gu3, defpackage.zsc
    public r7c a(float f, float f2) {
        w02 barData = ((x02) this.f19328a).getBarData();
        vye vyeVarJ = j(f2, f);
        r7c r7cVarF = f((float) vyeVarJ.d, f2, f);
        if (r7cVarF == null) {
            return null;
        }
        gpc gpcVar = (gpc) barData.i(r7cVarF.d());
        if (gpcVar.N()) {
            return l(r7cVarF, gpcVar, (float) vyeVarJ.d, (float) vyeVarJ.c);
        }
        vye.c(vyeVarJ);
        return r7cVarF;
    }

    @Override // defpackage.gu3
    public List<r7c> b(erc ercVar, int i, float f, DataSet.Rounding rounding) {
        Entry entryH0;
        ArrayList arrayList = new ArrayList();
        List<Entry> listR = ercVar.r(f);
        if (listR.size() == 0 && (entryH0 = ercVar.H0(f, Float.NaN, rounding)) != null) {
            listR = ercVar.r(entryH0.getX());
        }
        if (listR.size() == 0) {
            return arrayList;
        }
        for (Entry entry : listR) {
            vye vyeVarE = ((x02) this.f19328a).getTransformer(ercVar.m0()).e(entry.getY(), entry.getX());
            arrayList.add(new r7c(entry.getX(), entry.getY(), (float) vyeVarE.c, (float) vyeVarE.d, i, ercVar.m0()));
        }
        return arrayList;
    }

    @Override // defpackage.z02, defpackage.gu3
    public float e(float f, float f2, float f3, float f4) {
        return Math.abs(f2 - f4);
    }
}
