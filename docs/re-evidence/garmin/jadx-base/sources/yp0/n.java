package yp0;

import c2.b0;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o4.m1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.k0;
import p13.u0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f198678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f198679c;

    public /* synthetic */ n(o oVar, List list, int i14) {
        this.f198677a = i14;
        this.f198678b = oVar;
        this.f198679c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Map mapL;
        String strD;
        Object next;
        boolean z14;
        int i14 = this.f198677a;
        o oVar = this.f198678b;
        List<jp0.f> list = this.f198679c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = 1;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-687482684, new n(oVar, list, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                o oVar2 = this.f198678b;
                wp0.a aVar = oVar2.f198684e;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar2 = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81536n;
                    z zVarA = y.a(kVar, aVar3, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(aVar2, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    Object next2 = null;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    r rVarE = u1.n.e(aVar2, vb.h.e(d92.b.f58623a, mVar2), m1.f128891a);
                    z zVarA2 = y.a(kVar, aVar3, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    r rVarC2 = h4.k.c(rVarE, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, zVarA2, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar2);
                    if (list != null) {
                        ArrayList<sp0.b> arrayListB = qp0.a.b(list);
                        ArrayList arrayList = new ArrayList();
                        for (sp0.b bVar2 : arrayListB) {
                            LocalDate localDate = bVar2.f160505a;
                            b63.o oVarT = localDate != null ? g22.k.t(localDate) : null;
                            Double d14 = bVar2.f160506b;
                            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                            aVar.getClass();
                            o13.p pVar = oVarT != null ? new o13.p(oVarT, Double.valueOf(wp0.a.h(dDoubleValue))) : null;
                            if (pVar != null) {
                                arrayList.add(pVar);
                            }
                        }
                        mapL = u0.l(arrayList);
                    } else {
                        mapL = k0.f134949a;
                        mapL.getClass();
                    }
                    oVar2.f(i53.a.g(mapL), oVar2.f198681b, oVar2.f198682c, mVar2, 0);
                    String strD2 = oVar2.f198686g;
                    if (list == null || list.isEmpty()) {
                        strD = strD2;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Double value = ((jp0.f) it.next()).getValue();
                            if (value != null) {
                                arrayList2.add(value);
                            }
                        }
                        Iterator it3 = arrayList2.iterator();
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (it3.hasNext()) {
                                double dDoubleValue2 = ((Number) next).doubleValue();
                                do {
                                    Object next3 = it3.next();
                                    double dDoubleValue3 = ((Number) next3).doubleValue();
                                    if (Double.compare(dDoubleValue2, dDoubleValue3) < 0) {
                                        next = next3;
                                        dDoubleValue2 = dDoubleValue3;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Double d15 = (Double) next;
                        Iterator it4 = arrayList2.iterator();
                        if (it4.hasNext()) {
                            next2 = it4.next();
                            if (it4.hasNext()) {
                                double dDoubleValue4 = ((Number) next2).doubleValue();
                                do {
                                    Object next4 = it4.next();
                                    double dDoubleValue5 = ((Number) next4).doubleValue();
                                    if (Double.compare(dDoubleValue4, dDoubleValue5) > 0) {
                                        next2 = next4;
                                        dDoubleValue4 = dDoubleValue5;
                                    }
                                } while (it4.hasNext());
                            }
                        }
                        Double d16 = (Double) next2;
                        if (d15 == null || Double.isNaN(d15.doubleValue())) {
                            z14 = true;
                            strD = strD2;
                        } else {
                            z14 = true;
                            strD = aVar.d(d15.doubleValue(), true);
                        }
                        if (d16 != null && !Double.isNaN(d16.doubleValue())) {
                            strD2 = aVar.d(d16.doubleValue(), z14);
                        }
                    }
                    o13.p pVar2 = new o13.p(strD2, strD);
                    oVar2.d((String) pVar2.f128594a, (String) pVar2.f128595b, mVar2, 0);
                    mVar2.y();
                    oVar2.e(list, mVar2, 0);
                    mVar2.y();
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                oVar.e(list, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                oVar.e(list, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(o oVar, List list, int i14, int i15) {
        this.f198677a = i15;
        this.f198678b = oVar;
        this.f198679c = list;
    }
}
