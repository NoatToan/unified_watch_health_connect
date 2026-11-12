package hz0;

import android.content.Context;
import android.net.Uri;
import c2.x2;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import f5.b1;
import f5.k2;
import f5.v1;
import f5.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Unit;
import p3.n1;
import p3.p0;
import p3.x1;
import r22.l2;
import s1.a1;
import vd0.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f86489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f86490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f86491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f86492e;

    public /* synthetic */ w(h4.r rVar, List list, e23.l lVar, float f14, int i14) {
        this.f86488a = 4;
        this.f86490c = rVar;
        this.f86491d = list;
        this.f86492e = lVar;
        this.f86489b = f14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Object obj3;
        int i14 = this.f86488a;
        float f14 = this.f86489b;
        Throwable th3 = null;
        Object obj4 = this.f86492e;
        Object obj5 = this.f86491d;
        Object obj6 = this.f86490c;
        switch (i14) {
            case 0:
                boolean z14 = true;
                o53.b0 b0Var = (o53.b0) obj6;
                f4.s sVar = (f4.s) obj5;
                n1 n1Var = (n1) obj4;
                k2 k2Var = (k2) obj;
                g6.a aVar = (g6.a) obj2;
                float f15 = com.garmin.android.apps.connectmobile.newsfeed.d.f39492d;
                k2Var.getClass();
                li0.f.f112657g.getClass();
                b0Var.getClass();
                li0.e eVar = new li0.e(b0Var);
                ArrayList arrayList = new ArrayList(p13.y.r(sVar, 10));
                ListIterator listIterator = sVar.listIterator();
                li0.d0 d0Var = null;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    f4.z zVar = (f4.z) listIterator;
                    if (!zVar.hasNext()) {
                        if (d0Var != null) {
                            List listF0 = k2Var.F0(new z3.e(39950670, true, new v(d0Var, eVar, f14)), d0Var.f112650c);
                            ArrayList arrayList2 = new ArrayList(p13.y.r(listF0, 10));
                            Iterator it = listF0.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((y0) it.next()).Q(aVar.f75988a));
                            }
                            Iterator it3 = arrayList2.iterator();
                            int i17 = 0;
                            while (it3.hasNext()) {
                                int i18 = ((v1) it3.next()).f69145b;
                                if (i18 > i17) {
                                    i17 = i18;
                                }
                            }
                            n1Var.t(i17);
                        }
                        return b1.h0(k2Var, 0, n1Var.getIntValue(), new hq.f0(25));
                    }
                    Object next = zVar.next();
                    int i19 = i15 + 1;
                    if (i15 < 0) {
                        Throwable th4 = th3;
                        p13.x.q();
                        throw th4;
                    }
                    li0.d0 d0Var2 = (li0.d0) next;
                    Throwable th5 = th3;
                    List listF1 = k2Var.F0(new z3.e(1698623316, z14, new v(d0Var2, f14, eVar)), Integer.valueOf(i15));
                    ArrayList arrayList3 = new ArrayList(p13.y.r(listF1, 10));
                    for (Iterator it4 = listF1.iterator(); it4.hasNext(); it4 = it4) {
                        arrayList3.add(((y0) it4.next()).Q(aVar.f75988a));
                    }
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        int i24 = ((v1) it5.next()).f69145b;
                        if (i24 > i16) {
                            i16 = i24;
                            d0Var = d0Var2;
                        }
                    }
                    arrayList.add(Unit.INSTANCE);
                    i15 = i19;
                    th3 = th5;
                    z14 = true;
                }
                break;
            case 1:
                i53.c cVar = (i53.c) obj6;
                sy0.l lVar = (sy0.l) obj5;
                Context context = (Context) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        obj3 = objQ;
                        CustomLineChart customLineChart = new CustomLineChart(context);
                        customLineChart.setOnClickListener(new bv2.j(context, 13, lVar, cVar));
                        mVar.K(customLineChart);
                        obj3 = customLineChart;
                    }
                    obj3 = objQ;
                    CustomLineChart customLineChart2 = (CustomLineChart) obj3;
                    boolean zB = mVar.B(cVar);
                    Object objQ2 = mVar.q();
                    if (zB || objQ2 == c2565a) {
                        tz.a aVar2 = new tz.a(customLineChart2, new iy0.m(context, cVar), new iy0.o(customLineChart2), null, new iy0.n(customLineChart2), null, 40, null);
                        mVar.K(aVar2);
                        objQ2 = aVar2;
                    }
                    tz.a aVar3 = (tz.a) objQ2;
                    h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), f14);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarC = c2.l.C(c2.l.v(rVarH, 0.0f, eVar2.f97923h, 1), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    boolean zR = mVar.r(customLineChart2);
                    Object objQ3 = mVar.q();
                    if (zR || objQ3 == c2565a) {
                        objQ3 = new b40.a(customLineChart2, 3);
                        mVar.K(objQ3);
                    }
                    e23.l lVar2 = (e23.l) objQ3;
                    boolean zR2 = mVar.r(aVar3) | mVar.r(lVar) | mVar.r(context);
                    Object objQ4 = mVar.q();
                    if (zR2 || objQ4 == c2565a) {
                        objQ4 = new gw1.d(aVar3, 22, lVar, context);
                        mVar.K(objQ4);
                    }
                    p002j6.c.b(lVar2, rVarC, (e23.l) objQ4, mVar, 0, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                m92.u.c((h4.r) obj6, (i53.c) obj5, this.f86489b, (String) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                l2.a((h4.r) obj6, (e23.l) obj5, this.f86489b, (z3.e) obj4, (p3.m) obj, p0.t(3079));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                sg2.b.c((h4.r) obj6, (List) obj5, (e23.l) obj4, this.f86489b, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ge1.b.T((o53.b0) obj6, null, null, new vc.e.a(fFloatValue, this.f86489b, (a1) obj5, (uc.c) obj4, null), 3);
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                vd0.a1.a((Uri) obj6, this.f86489b, (h4.r) obj5, (x0) obj4, (p3.m) obj, p0.t(433));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                xn0.i.a((i53.c) obj6, this.f86489b, (String) obj5, (String) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ w(h4.r rVar, Object obj, float f14, Object obj2, int i14, int i15) {
        this.f86488a = i15;
        this.f86490c = rVar;
        this.f86491d = obj;
        this.f86489b = f14;
        this.f86492e = obj2;
    }

    public /* synthetic */ w(float f14, int i14, Object obj, Object obj2, Object obj3) {
        this.f86488a = i14;
        this.f86490c = obj;
        this.f86489b = f14;
        this.f86491d = obj2;
        this.f86492e = obj3;
    }

    public /* synthetic */ w(Object obj, float f14, Object obj2, Object obj3, int i14, int i15) {
        this.f86488a = i15;
        this.f86490c = obj;
        this.f86489b = f14;
        this.f86491d = obj2;
        this.f86492e = obj3;
    }

    public /* synthetic */ w(o53.b0 b0Var, f4.s sVar, float f14, n1 n1Var) {
        this.f86488a = 0;
        this.f86490c = b0Var;
        this.f86491d = sVar;
        this.f86489b = f14;
        this.f86492e = n1Var;
    }
}
