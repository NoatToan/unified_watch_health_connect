package defpackage;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import defpackage.b12;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gu3<T extends b12> implements zsc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f19328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<r7c> f19329b = new ArrayList();

    public gu3(T t) {
        this.f19328a = t;
    }

    @Override // defpackage.zsc
    public r7c a(float f, float f2) {
        vye vyeVarJ = j(f, f2);
        float f3 = (float) vyeVarJ.c;
        vye.c(vyeVarJ);
        return f(f3, f, f2);
    }

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
            vye vyeVarE = this.f19328a.getTransformer(ercVar.m0()).e(entry.getX(), entry.getY());
            arrayList.add(new r7c(entry.getX(), entry.getY(), (float) vyeVarE.c, (float) vyeVarE.d, i, ercVar.m0()));
        }
        return arrayList;
    }

    public r7c c(List<r7c> list, float f, float f2, YAxis.AxisDependency axisDependency, float f3) {
        r7c r7cVar = null;
        for (int i = 0; i < list.size(); i++) {
            r7c r7cVar2 = list.get(i);
            if (axisDependency == null || r7cVar2.b() == axisDependency) {
                float fE = e(f, f2, r7cVar2.i(), r7cVar2.k());
                if (fE < f3) {
                    r7cVar = r7cVar2;
                    f3 = fE;
                }
            }
        }
        return r7cVar;
    }

    public a12 d() {
        return this.f19328a.getData();
    }

    public float e(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f - f3, f2 - f4);
    }

    public r7c f(float f, float f2, float f3) {
        List<r7c> listH = h(f, f2, f3);
        if (listH.isEmpty()) {
            return null;
        }
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        float fI = i(listH, f3, axisDependency);
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        return c(listH, f2, f3, fI < i(listH, f3, axisDependency2) ? axisDependency : axisDependency2, this.f19328a.getMaxHighlightDistance());
    }

    public float g(r7c r7cVar) {
        return r7cVar.k();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [erc] */
    public List<r7c> h(float f, float f2, float f3) {
        this.f19329b.clear();
        a12 a12VarD = d();
        if (a12VarD == null) {
            return this.f19329b;
        }
        int iJ = a12VarD.j();
        for (int i = 0; i < iJ; i++) {
            ?? I = a12VarD.i(i);
            if (I.R()) {
                this.f19329b.addAll(b(I, i, f, DataSet.Rounding.CLOSEST));
            }
        }
        return this.f19329b;
    }

    public float i(List<r7c> list, float f, YAxis.AxisDependency axisDependency) {
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            r7c r7cVar = list.get(i);
            if (r7cVar.b() == axisDependency) {
                float fAbs = Math.abs(g(r7cVar) - f);
                if (fAbs < f2) {
                    f2 = fAbs;
                }
            }
        }
        return f2;
    }

    public vye j(float f, float f2) {
        return this.f19328a.getTransformer(YAxis.AxisDependency.LEFT).g(f, f2);
    }
}
