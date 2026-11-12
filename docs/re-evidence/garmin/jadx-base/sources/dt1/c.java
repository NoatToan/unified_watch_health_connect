package dt1;

import e23.l;
import e23.p;
import e23.q;
import f4.s;
import f5.b1;
import f5.k2;
import f5.v1;
import f5.y0;
import h4.r;
import i3.nb;
import i3.rg;
import i3.uf;
import i3.yf;
import java.util.ArrayList;
import java.util.List;
import m92.j0;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61118a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f61119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f61121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f61122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f61123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f61124g;

    public /* synthetic */ c(float f14, p pVar, p pVar2, nb nbVar, int i14, q qVar) {
        this.f61119b = f14;
        this.f61120c = pVar;
        this.f61122e = pVar2;
        this.f61123f = nbVar;
        this.f61121d = i14;
        this.f61124g = qVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f61118a;
        int i15 = this.f61121d;
        Object obj3 = this.f61124g;
        Object obj4 = this.f61123f;
        Object obj5 = this.f61122e;
        Object obj6 = this.f61120c;
        switch (i14) {
            case 0:
                ((Integer) obj2).intValue();
                f.b((r) obj6, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, this.f61119b, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                float f14 = com.garmin.android.apps.connectmobile.newsfeed.d.f39492d;
                ((com.garmin.android.apps.connectmobile.newsfeed.d) obj5).e((s) obj4, this.f61119b, (li0.f) obj3, (r) obj6, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 2:
                final p pVar = (p) obj5;
                final nb nbVar = (nb) obj4;
                final q qVar = (q) obj3;
                final k2 k2Var = (k2) obj;
                final g6.a aVar = (g6.a) obj2;
                yf.f90469a.getClass();
                int iF0 = k2Var.f0(yf.f90470b);
                final int iF1 = k2Var.f0(this.f61119b);
                List listF0 = k2Var.F0((p) obj6, rg.Tabs);
                Integer numValueOf = 0;
                int size = listF0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((y0) listF0.get(i16)).a0(Integer.MAX_VALUE)));
                }
                final int iIntValue = numValueOf.intValue();
                long jC = g6.a.c(iF0, 0, iIntValue, iIntValue, 2, aVar.f75988a);
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                int size2 = listF0.size();
                int i17 = 0;
                while (i17 < size2) {
                    y0 y0Var = (y0) listF0.get(i17);
                    v1 v1VarQ = y0Var.Q(jC);
                    float fC1 = k2Var.c1(Math.min(y0Var.l0(v1VarQ.f69145b), v1VarQ.f69144a));
                    List list = listF0;
                    float f15 = uf.f89933c * 2;
                    g6.f.a aVar2 = g6.f.f75994b;
                    arrayList.add(v1VarQ);
                    arrayList2.add(g6.f.a(fC1 - f15));
                    i17++;
                    listF0 = list;
                }
                Integer numValueOf2 = Integer.valueOf(iF1 * 2);
                int size3 = arrayList.size();
                for (int i18 = 0; i18 < size3; i18++) {
                    numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((v1) arrayList.get(i18)).f69144a);
                }
                final int iIntValue2 = numValueOf2.intValue();
                final int i19 = this.f61121d;
                return b1.h0(k2Var, iIntValue2, iIntValue, new l() { // from class: i3.kg
                    @Override // e23.l
                    public final Object invoke(Object obj7) {
                        f5.k2 k2Var2;
                        int i24;
                        int i25;
                        f5.v1.a aVar3 = (f5.v1.a) obj7;
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = arrayList;
                        int size4 = arrayList4.size();
                        int i26 = iF1;
                        int i27 = i26;
                        int i28 = 0;
                        while (true) {
                            k2Var2 = k2Var;
                            if (i28 >= size4) {
                                break;
                            }
                            f5.v1 v1Var = (f5.v1) arrayList4.get(i28);
                            f5.v1.a.B(aVar3, v1Var, i27, 0);
                            arrayList3.add(new wf(k2Var2.c1(i27), k2Var2.c1(v1Var.f69144a), ((g6.f) arrayList2.get(i28)).f75997a, null));
                            i27 += v1Var.f69144a;
                            i28++;
                        }
                        List listF1 = k2Var2.F0(pVar, rg.Divider);
                        int size5 = listF1.size();
                        int i29 = 0;
                        while (true) {
                            i24 = iIntValue2;
                            i25 = iIntValue;
                            if (i29 >= size5) {
                                break;
                            }
                            f5.v1 v1VarQ2 = ((f5.y0) listF1.get(i29)).Q(g6.a.c(i24, i24, 0, 0, 8, aVar.f75988a));
                            f5.v1.a.B(aVar3, v1VarQ2, 0, i25 - v1VarQ2.f69145b);
                            i29++;
                        }
                        List listF2 = k2Var2.F0(new z3.e(2125766411, true, new lg(qVar, arrayList3)), rg.Indicator);
                        int size6 = listF2.size();
                        for (int i30 = 0; i30 < size6; i30++) {
                            f5.y0 y0Var2 = (f5.y0) listF2.get(i30);
                            g6.a.f75987b.getClass();
                            f5.v1.a.B(aVar3, y0Var2.Q(g6.a.C1525a.c(i24, i25)), 0, 0);
                        }
                        nbVar.a(k2Var2, i26, arrayList3, i19);
                        return Unit.INSTANCE;
                    }
                });
            default:
                ((Integer) obj2).getClass();
                j0.a((r) obj6, (i53.c) obj5, (Float) obj4, this.f61119b, (String) obj3, (m) obj, p0.t(i15 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.newsfeed.d dVar, s sVar, float f14, li0.f fVar, r rVar, int i14) {
        this.f61122e = dVar;
        this.f61123f = sVar;
        this.f61119b = f14;
        this.f61124g = fVar;
        this.f61120c = rVar;
        this.f61121d = i14;
    }

    public /* synthetic */ c(r rVar, e23.a aVar, e23.a aVar2, e23.a aVar3, float f14, int i14) {
        this.f61120c = rVar;
        this.f61122e = aVar;
        this.f61123f = aVar2;
        this.f61124g = aVar3;
        this.f61119b = f14;
        this.f61121d = i14;
    }

    public /* synthetic */ c(r rVar, i53.c cVar, Float f14, float f15, String str, int i14) {
        this.f61120c = rVar;
        this.f61122e = cVar;
        this.f61123f = f14;
        this.f61119b = f15;
        this.f61124g = str;
        this.f61121d = i14;
    }
}
