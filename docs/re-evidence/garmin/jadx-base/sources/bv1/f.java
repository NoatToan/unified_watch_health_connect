package bv1;

import android.app.Activity;
import b21.s4;
import c2.x2;
import c53.f0;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jv1.n f21403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f21404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f21405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f21406e;

    public /* synthetic */ f(jv1.n nVar, g gVar, DateTime dateTime, DateTime dateTime2, int i14) {
        this.f21402a = i14;
        this.f21403b = nVar;
        this.f21404c = gVar;
        this.f21405d = dateTime;
        this.f21406e = dateTime2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0161  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar;
        String strI;
        Double d14;
        ArrayList<iw1.a> arrayList;
        int i14;
        DateTime dateTimeWithTimeAtStartOfDay;
        switch (this.f21402a) {
            case 0:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1027808784, new f(this.f21403b, this.f21404c, this.f21405d, this.f21406e, 1), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(rVarF, eVar.f97920e);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar2 = h4.d.a.f81536n;
                    c2.z zVarA = c2.y.a(kVar, aVar2, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC = h4.k.c(rVarY, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar3);
                    } else {
                        mVar3.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar3);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar3);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                    jv1.n nVar = this.f21403b;
                    boolean z14 = nVar.f101094p;
                    fg0.k kVar2 = nVar.f101088j;
                    Double d15 = nVar.f101099u;
                    boolean z15 = nVar.f101096r;
                    String strQ = gl1.y.Q(mVar3, z14 ? R.string.lbl_plan_recap : R.string.lbl_coming_up);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar3), mVar3, 0, 0, 131068);
                    long jC = com.nimbusds.jose.shaded.gson.internal.a.c(mVar3);
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarE = u1.n.e(aVar, jC, k2.i.a(8));
                    g gVar = this.f21404c;
                    boolean zR = mVar3.r(gVar) | mVar3.r(nVar);
                    Object objQ = mVar3.q();
                    p3.m.a aVar5 = p3.m.f135153a;
                    if (zR) {
                        objQ = new bb0.d(8, gVar, nVar);
                        mVar3.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new bb0.d(8, gVar, nVar);
                            mVar3.K(objQ);
                        }
                    }
                    h4.r rVarD = u1.w.d(rVarE, true, null, null, (e23.a) objQ, 14);
                    c2.z zVarA2 = c2.y.a(kVar, aVar2, mVar3, 0);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    h4.r rVarC3 = h4.k.c(rVarD, mVar3);
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar3);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar2, zVarA2, mVar3);
                    b4.c(c1623g, i2VarX2, mVar3);
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC3, mVar3);
                    h4.r rVarY2 = c2.l.y(aVar, eVar.f97920e);
                    pi0.e eVar3 = gVar.f21410e;
                    pi0.f fVar2 = pi0.f.SHORT_MONTH_NO_WEEKDAY;
                    DateTime dateTime = this.f21405d;
                    DateTime dateTime2 = this.f21406e;
                    mh.c(eVar3.l(dateTime, dateTime2, fVar2), rVarY2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar3), mVar3, 0, 0, 131068);
                    float f14 = eVar.f97920e;
                    h4.r rVarC4 = c2.l.C(aVar, f14, 0.0f, f14, f14, 2);
                    Interval interval = new Interval(dateTime, dateTime2);
                    ArrayList arrayListD1 = h0.d1(j0.f134944a);
                    f0.a aVar6 = new f0.a(gg.b.Q(interval));
                    while (aVar6.hasNext()) {
                        DateTime dateTime3 = (DateTime) aVar6.next();
                        List<iw1.a> list = nVar.f101093o;
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                if (g22.k.f(((iw1.a) obj3).f95330q, dateTime3)) {
                                    arrayList.add(obj3);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList == null || arrayList.isEmpty()) {
                            arrayListD1.add(new lu1.e(null, dateTime3, false, g22.k.f(dateTime3, nVar.f101086h) && !z15, g22.k.k(dateTime3), false, null, false, false, 192, null));
                        } else {
                            if (arrayList.isEmpty()) {
                                i14 = 0;
                            } else {
                                Iterator it = arrayList.iterator();
                                i14 = 0;
                                while (it.hasNext()) {
                                    if (((iw1.a) it.next()).f95319g && (i14 = i14 + 1) < 0) {
                                        p13.x.p();
                                        throw null;
                                    }
                                }
                            }
                            for (iw1.a aVar7 : arrayList) {
                                boolean z16 = aVar7.B;
                                DateTime dateTime4 = aVar7.f95330q;
                                if (z16) {
                                    arrayListD1.add(new lu1.e((!aVar7.f95318f || (dateTime4 != null && (dateTimeWithTimeAtStartOfDay = dateTime4.withTimeAtStartOfDay()) != null && dateTimeWithTimeAtStartOfDay.isBefore(DateTime.now().withTimeAtStartOfDay()))) ? null : aVar7.I, dateTime4 == null ? new DateTime() : dateTime4, aVar7.f95323k, g22.k.g(dateTime3.toLocalDate(), kVar2 != null ? kVar2.getDate() : null), g22.k.f(dateTime4, DateTime.now()), aVar7.f95335x, null, false, i14 > 0, 192, null));
                                }
                            }
                        }
                    }
                    hw1.e.a(rVarC4, arrayListD1, mVar3, 0);
                    mVar3.y();
                    if (kVar2 == null || z15) {
                        mVar = mVar3;
                        mVar.C(-118856984);
                        mVar.f();
                    } else {
                        mVar3.C(-120892382);
                        h4.r.a aVar8 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.h(aVar8, j92.b.f97899b.f97918c), mVar3);
                        if (!nVar.f101094p || d15 == null || (d14 = nVar.f101098t) == null) {
                            strI = null;
                        } else {
                            fy1.i.a aVar9 = fy1.i.f73924a;
                            Activity activity = gVar.f21407b;
                            double dDoubleValue = d14.doubleValue();
                            double dDoubleValue2 = d15.doubleValue();
                            boolean z17 = kVar2.getEventType() == gg0.f.f77132h;
                            fg0.d completionTarget = kVar2.getCompletionTarget();
                            boolean z18 = completionTarget != null && completionTarget.o();
                            aVar9.getClass();
                            strI = fy1.i.a.i(activity, dDoubleValue, dDoubleValue2, z17, z18, false);
                        }
                        h4.r rVarF2 = x2.f(aVar8, 1.0f);
                        Long l14 = kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        fg0.t tVar = l14 != null ? nVar.f101090l.get(Long.valueOf(l14.longValue())) : null;
                        boolean z19 = nVar.f101094p;
                        Object objQ2 = mVar3.q();
                        aVar5.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ2 == c2565a) {
                            objQ2 = new bv0.b(9);
                            mVar3.K(objQ2);
                        }
                        e23.a aVar10 = (e23.a) objQ2;
                        boolean zR2 = mVar3.r(gVar);
                        Object objQ3 = mVar3.q();
                        if (zR2 || objQ3 == c2565a) {
                            objQ3 = new s4(gVar, 23);
                            mVar3.K(objQ3);
                        }
                        jg0.d.a(rVarF2, kVar2, tVar, z19, strI, false, null, aVar10, false, (e23.a) objQ3, null, null, mVar3, (fg0.k.X << 3) | 12582918 | (fg0.t.f71346c << 6), 0, 3424);
                        mVar = mVar3;
                        mVar.f();
                    }
                    mVar.y();
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
