package a03;

import android.content.Context;
import aq.o3;
import c2.k3;
import c2.x2;
import c22.c3;
import i3.a1;
import i3.fe;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f92b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f93c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f94d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f95e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f96f;

    public /* synthetic */ g(Context context, int i14, a42.s sVar, o53.b0 b0Var, a1 a1Var) {
        this.f91a = 3;
        this.f93c = context;
        this.f92b = i14;
        this.f94d = sVar;
        this.f95e = b0Var;
        this.f96f = a1Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f91a;
        int i15 = this.f92b;
        Object obj3 = this.f96f;
        Object obj4 = this.f95e;
        Object obj5 = this.f94d;
        Object obj6 = this.f93c;
        switch (i14) {
            case 0:
                k3 k3Var = (k3) obj5;
                ((Integer) obj2).getClass();
                k3Var.getClass();
                jg.b.f((zz2.e) obj6, k3Var, (p) obj4, (z3.e) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 1:
                ((Integer) obj2).getClass();
                o53.f0.c((c3) obj6, (c3) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 2:
                ((Integer) obj2).getClass();
                a11.z.a((h4.r) obj6, (r82.p) obj5, (r82.p) obj4, (r82.p) obj3, (p3.m) obj, p3.p0.t(1), this.f92b);
                break;
            case 3:
                Context context = (Context) obj6;
                a42.s sVar = (a42.s) obj5;
                o53.b0 b0Var = (o53.b0) obj4;
                a1 a1Var = (a1) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                a42.s.a aVar = a42.s.f1073g;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h82.e.a(z3.f.c(1190471175, new a42.m(this.f92b, context, sVar, b0Var, a1Var, 0), mVar), mVar, 6);
                } else {
                    mVar.e();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                aa2.s.d((String) obj6, (u4.d) obj5, (e23.r) obj4, (z3.e) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ad0.k.a((c2.a0) obj6, (String) obj5, (zc0.e) obj4, (ub0.l) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int i16 = o3.f12139h;
                ((o3) obj6).i((String) obj5, (h4.r) obj4, this.f92b, (h4.d.b) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((ay1.b) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((ay1.c) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 9:
                List list = (List) obj6;
                Context context2 = (Context) obj5;
                DateTime dateTime = (DateTime) obj4;
                DateTime dateTime2 = (DateTime) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    g6.f.a aVar2 = g6.f.f75994b;
                    h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 350);
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new b71.o(2);
                        mVar2.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    boolean zR = mVar2.r(list) | mVar2.r(context2) | mVar2.r(dateTime) | mVar2.r(dateTime2);
                    int i17 = this.f92b;
                    boolean zK = zR | mVar2.k(i17);
                    Object objQ2 = mVar2.q();
                    if (zK || objQ2 == c2565a) {
                        b81.b bVar = new b81.b(list, context2, dateTime, dateTime2, i17, 0);
                        mVar2.K(bVar);
                        objQ2 = bVar;
                    }
                    p002j6.c.b(lVar, rVarH, (e23.l) objQ2, mVar2, 54, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                b81.c.a((DateTime) obj6, (DateTime) obj5, (o82.g) obj4, (n61.f) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 11:
                ((Integer) obj2).getClass();
                bb0.b.b((bb0.c) obj6, (List) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 12:
                ((Integer) obj2).getClass();
                bb0.e.b((bb0.f) obj6, (List) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 13:
                ((Integer) obj2).intValue();
                bb1.f.b((bb1.g) obj6, (e23.l) obj5, (e23.l) obj4, (e23.p) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 14:
                ((Integer) obj2).getClass();
                by1.c cVar = by1.c.f22175a;
                ((by1.c) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 15:
                ((Integer) obj2).getClass();
                by1.e eVar = by1.e.f22178a;
                ((by1.e) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 16:
                ((Integer) obj2).getClass();
                by1.g gVar = by1.g.f22184a;
                ((by1.g) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 17:
                ((Integer) obj2).getClass();
                by1.j jVar = by1.j.f22190a;
                ((by1.j) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 18:
                ((Integer) obj2).getClass();
                by1.m mVar3 = by1.m.f22196a;
                ((by1.m) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 19:
                ((Integer) obj2).getClass();
                by1.o oVar = by1.o.f22201a;
                ((by1.o) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 20:
                ((Integer) obj2).getClass();
                by1.r rVar = by1.r.f22207a;
                ((by1.r) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 21:
                ((Integer) obj2).getClass();
                by1.v vVar = by1.v.f22216a;
                ((by1.v) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 22:
                ((Integer) obj2).getClass();
                by1.w wVar = by1.w.f22220a;
                ((by1.w) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 23:
                ((Integer) obj2).getClass();
                by1.x xVar = by1.x.f22221a;
                ((by1.x) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 24:
                ((Integer) obj2).getClass();
                by1.z zVar = by1.z.f22228a;
                ((by1.z) obj6).a((lc.v) obj5, (lc.m0) obj4, (fe) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 25:
                ((Integer) obj2).getClass();
                c02.h.d((h4.r) obj6, (Double) obj5, (Double) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 26:
                ((Integer) obj2).getClass();
                c12.d.i((c12.e) obj6, (vc0.v) obj5, (e23.a) obj4, (gk1.b) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 27:
                ((Integer) obj2).getClass();
                int i18 = c70.c.f25219f;
                ((c70.c) obj6).g((h4.r) obj5, (j23.l) obj4, (String) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            case 28:
                ((Integer) obj2).getClass();
                c82.g.b((h4.r) obj6, (List) obj5, (String) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                break;
            default:
                ((Integer) obj2).intValue();
                o53.f0.d((h4.r) obj6, (sh0.d) obj5, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(o3 o3Var, String str, h4.r rVar, int i14, h4.d.b bVar, int i15) {
        this.f91a = 6;
        this.f93c = o3Var;
        this.f94d = str;
        this.f95e = rVar;
        this.f92b = i14;
        this.f96f = bVar;
    }

    public /* synthetic */ g(h4.r rVar, r82.p pVar, r82.p pVar2, r82.p pVar3, int i14, int i15) {
        this.f91a = 2;
        this.f93c = rVar;
        this.f94d = pVar;
        this.f95e = pVar2;
        this.f96f = pVar3;
        this.f92b = i15;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f91a = i15;
        this.f93c = obj;
        this.f94d = obj2;
        this.f95e = obj3;
        this.f96f = obj4;
        this.f92b = i14;
    }
}
