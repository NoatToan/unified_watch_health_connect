package c42;

import c2.x2;
import ca0.o0;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import i3.c5;
import i3.d3;
import i3.d5;
import i3.mh;
import i3.w4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import m92.w;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.p0;
import p3.x1;
import p3.x3;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24382f;

    public /* synthetic */ e(long j8, List list, e23.l lVar, e23.l lVar2, e23.a aVar, int i14) {
        this.f24377a = 5;
        this.f24378b = j8;
        this.f24379c = list;
        this.f24380d = lVar;
        this.f24382f = lVar2;
        this.f24381e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:148:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:154:0x0662  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m.a aVar;
        p3.m mVar;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        Float fValueOf4;
        float f14;
        float f15;
        Float f16;
        Float f17;
        c5 c5Var;
        long jD;
        int i14 = this.f24377a;
        p3.m.a aVar2 = p3.m.f135153a;
        Object obj3 = this.f24382f;
        Object obj4 = this.f24381e;
        Object obj5 = this.f24380d;
        Object obj6 = this.f24379c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                h.e(this.f24378b, (String) obj6, (gl1.b) obj5, (e23.a) obj4, (ug2.x) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                e51.h.b((i53.c) obj6, (i53.c) obj5, this.f24378b, (h4.r) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                fv0.f.d((gv0.d) obj6, this.f24378b, (e23.a) obj4, (e23.a) obj5, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                h41.g gVar = (h41.g) obj5;
                String str = (String) obj6;
                String str2 = (String) obj4;
                h4.r rVar = (h4.r) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.b bVar = c2.j.f22695e;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(bVar, h4.d.a.f81536n, mVar2, 6);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    ArrayList arrayList = new ArrayList();
                    final ArrayList arrayList2 = new ArrayList();
                    i53.c<h41.f> cVar = gVar != null ? gVar.f81623f : null;
                    if (cVar == null) {
                        mVar2.C(25336734);
                        mVar2.f();
                        aVar = aVar2;
                    } else {
                        mVar2.C(25336735);
                        int i15 = 0;
                        for (h41.f fVar : cVar) {
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            h41.f fVar2 = fVar;
                            if (fVar2 == null) {
                                mVar2.C(-6373220);
                                mVar2.f();
                                aVar2 = aVar2;
                            } else {
                                i41.h hVar = fVar2.f81617e;
                                Integer num = fVar2.f81616d;
                                Float f18 = fVar2.f81615c;
                                mVar2.C(-6373219);
                                Float f19 = fVar2.f81614b;
                                if (f19 != null && f18 != null) {
                                    arrayList.add(new m92.h0.d.b(i15, f19.floatValue(), f18.floatValue()));
                                }
                                if (num == null || hVar == null) {
                                    mVar2.C(1354722221);
                                    mVar2.f();
                                } else {
                                    mVar2.C(1354289771);
                                    arrayList2.add(new m92.h0.e.d(new m92.h0.e.a(i15, num.intValue()), i41.i.a(hVar, mVar2), null, 4, null));
                                    mVar2.f();
                                }
                                Unit unit = Unit.INSTANCE;
                                mVar2.f();
                            }
                            i15 = i16;
                            aVar2 = aVar2;
                        }
                        aVar = aVar2;
                        mVar2.f();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                        mVar2.C(29019566);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(str, rVarF, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 48, 0, 131068);
                        mVar = mVar2;
                        mVar.f();
                    } else {
                        mVar = mVar2;
                        mVar.C(26628412);
                        final float f22 = e32.o.f62808k.f62819a;
                        float f24 = f22 - 1;
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            float fD = m92.i0.d((m92.h0.d) it.next());
                            while (it.hasNext()) {
                                fD = Math.min(fD, m92.i0.d((m92.h0.d) it.next()));
                            }
                            fValueOf = Float.valueOf(fD);
                        } else {
                            fValueOf = null;
                        }
                        Iterator it3 = arrayList2.iterator();
                        if (it3.hasNext()) {
                            float fE = m92.i0.e((m92.h0.e.d) it3.next());
                            while (it3.hasNext()) {
                                fE = Math.min(fE, m92.i0.e((m92.h0.e.d) it3.next()));
                            }
                            fValueOf2 = Float.valueOf(fE);
                        } else {
                            fValueOf2 = null;
                        }
                        Float fV0 = p13.h0.v0(p13.u.C(new Float[]{fValueOf, fValueOf2}));
                        Iterator it4 = arrayList.iterator();
                        if (it4.hasNext()) {
                            float fG = m92.i0.g((m92.h0.d) it4.next());
                            while (it4.hasNext()) {
                                fG = Math.max(fG, m92.i0.g((m92.h0.d) it4.next()));
                            }
                            fValueOf3 = Float.valueOf(fG);
                        } else {
                            fValueOf3 = null;
                        }
                        Iterator it5 = arrayList2.iterator();
                        if (it5.hasNext()) {
                            float fE2 = m92.i0.e((m92.h0.e.d) it5.next());
                            while (it5.hasNext()) {
                                fE2 = Math.max(fE2, m92.i0.e((m92.h0.e.d) it5.next()));
                            }
                            fValueOf4 = Float.valueOf(fE2);
                        } else {
                            fValueOf4 = null;
                        }
                        Float fQ0 = p13.h0.q0(p13.u.C(new Float[]{fValueOf3, fValueOf4}));
                        x1 x1Var2 = p3.n.f135158a;
                        if (((g6.c) mVar.A(t1.f91490h)).getF75992b() > 1.5f) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f14 = j92.b.f97901d.f97902a;
                        } else {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f14 = j92.b.f97901d.f97902a / 2;
                            g6.f.a aVar4 = g6.f.f75994b;
                        }
                        h4.r rVarA = b0Var.a(x2.f(h4.r.S, 1.0f), 1.0f, true);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC2 = c2.l.C(rVarA, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode2 = Long.hashCode(mVar.getU());
                        i2 i2VarX2 = mVar.x();
                        h4.r rVarC3 = h4.k.c(rVarC2, mVar);
                        h5.g.V.getClass();
                        h5.e0.a aVar5 = h5.g.a.f81805b;
                        if (mVar.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar5);
                        } else {
                            mVar.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar, iHashCode2, bVar3);
                        }
                        b4.c(h5.g.a.f81807d, rVarC3, mVar);
                        c2.u uVar = c2.u.f22885a;
                        boolean zR = mVar.r(arrayList);
                        long j8 = this.f24378b;
                        boolean zL = zR | mVar.l(j8) | mVar.i(f24) | mVar.B(fV0) | mVar.B(fQ0);
                        Object objQ = mVar.q();
                        if (zL) {
                            objQ = new f21.i0(arrayList, j8, f24, fV0, fQ0);
                            f15 = f24;
                            f16 = fV0;
                            f17 = fQ0;
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f21.i0(arrayList, j8, f24, fV0, fQ0);
                                f15 = f24;
                                f16 = fV0;
                                f17 = fQ0;
                                mVar.K(objQ);
                            } else {
                                f15 = f24;
                                f16 = fV0;
                                f17 = fQ0;
                            }
                        }
                        e23.l lVar = (e23.l) objQ;
                        boolean zR2 = mVar.r(arrayList2) | mVar.i(f22) | mVar.i(f14) | mVar.i(f15) | mVar.B(f16) | mVar.B(f17);
                        Object objQ2 = mVar.q();
                        if (zR2) {
                            final float f25 = f15;
                            final Float f26 = f16;
                            final Float f27 = f17;
                            final float f28 = f14;
                            objQ2 = new e23.l() { // from class: k41.f
                                @Override // e23.l
                                public final Object invoke(Object obj7) {
                                    q4.f fVar3 = (q4.f) obj7;
                                    fVar3.getClass();
                                    return w.c(fVar3, arrayList2, Float.valueOf(f22), f28, Float.valueOf(0.0f), Float.valueOf(f25), f26, f27, 24);
                                }
                            };
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                final float f29 = f15;
                                final Float f210 = f16;
                                final Float f211 = f17;
                                final float f212 = f14;
                                objQ2 = new e23.l() { // from class: k41.f
                                    @Override // e23.l
                                    public final Object invoke(Object obj7) {
                                        q4.f fVar3 = (q4.f) obj7;
                                        fVar3.getClass();
                                        return w.c(fVar3, arrayList2, Float.valueOf(f22), f212, Float.valueOf(0.0f), Float.valueOf(f29), f210, f211, 24);
                                    }
                                };
                                mVar.K(objQ2);
                            }
                        }
                        m92.r.b(rVar, i53.a.a(lVar, (e23.l) objQ2), null, null, false, gl1.y.Q(mVar, R.string.common_no_data), 0.0f, 0.0f, null, null, null, mVar, 0, 0, 2012);
                        mVar.y();
                        mVar.f();
                    }
                    String strQ = gl1.y.Q(mVar, R.string.label_last_4w);
                    h4.r.a aVar6 = h4.r.S;
                    boolean zB = mVar.B(str2);
                    Object objQ3 = mVar.q();
                    if (zB) {
                        objQ3 = new jl0.e(str2, 6);
                        mVar.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new jl0.e(str2, 6);
                            mVar.K(objQ3);
                        }
                    }
                    h4.r rVarF2 = x2.f(p5.v.c((e23.l) objQ3, aVar6, false), 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarC4 = c2.l.C(rVarF2, 0.0f, eVar.f97917b, 0.0f, eVar.f97920e, 5);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
                    mVar.y();
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ka0.a.b((h4.r) obj6, this.f24378b, (List) obj5, (z3.e) obj4, (e23.l) obj3, (p3.m) obj, p0.t(3079));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ka0.a.a(this.f24378b, (List) obj6, (e23.l) obj5, (e23.l) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                c5 c5Var2 = (c5) obj6;
                e23.l lVar2 = (e23.l) obj5;
                e23.l lVar3 = (e23.l) obj4;
                h4.r rVar2 = (h4.r) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    d5 d5VarE = w4.e(c5Var2.k(), c5Var2.i(), Long.valueOf(c5Var2.d()), c5Var2.b(), c5Var2.f(), c5Var2.e(), mVar3, 0, 0);
                    Object objQ4 = mVar3.q();
                    aVar2.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ4 == c2565a) {
                        objQ4 = p0.f(new r11.e(d5VarE, 1));
                        mVar3.K(objQ4);
                    }
                    x3 x3Var = (x3) objQ4;
                    Object objQ5 = mVar3.q();
                    if (objQ5 == c2565a) {
                        objQ5 = p0.f(new r11.e(d5VarE, 2));
                        mVar3.K(objQ5);
                    }
                    x3 x3Var2 = (x3) objQ5;
                    Long l14 = (Long) x3Var.getF182175a();
                    Long l15 = (Long) x3Var2.getF182175a();
                    boolean zB2 = mVar3.B(c5Var2) | mVar3.B(lVar2) | mVar3.B(lVar3);
                    Object objQ6 = mVar3.q();
                    if (zB2 || objQ6 == c2565a) {
                        c5Var = c5Var2;
                        vx.e eVar2 = new vx.e(c5Var, x3Var, lVar2, x3Var2, lVar3, null);
                        mVar3.K(eVar2);
                        objQ6 = eVar2;
                    } else {
                        c5Var = c5Var2;
                    }
                    l0.f(l14, l15, (e23.p) objQ6, mVar3);
                    d3 d3Var = d3.f87817a;
                    long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar3);
                    long jX = com.nimbusds.jose.shaded.gson.internal.a.x(mVar3);
                    long jX2 = com.nimbusds.jose.shaded.gson.internal.a.x(mVar3);
                    long jA2 = zl.a.a(mVar3);
                    long jA3 = zl.a.a(mVar3);
                    long jA4 = zl.a.a(mVar3);
                    long jA5 = zl.a.a(mVar3);
                    long j14 = d92.b.a(mVar3).k().f63527d;
                    long jB = d92.b.a(mVar3).i().a().b();
                    long jA6 = zl.a.a(mVar3);
                    long jX3 = com.nimbusds.jose.shaded.gson.internal.a.x(mVar3);
                    long jC = d92.b.a(mVar3).k().c();
                    long jE = d92.b.a(mVar3).e().e();
                    long jA7 = d92.b.a(mVar3).j().a();
                    if (c5Var.e().a(DateTime.now(DateTimeZone.UTC).withTimeAtStartOfDay().getMillis())) {
                        mVar3.C(1783219391);
                        jD = d92.b.a(mVar3).k().b();
                        mVar3.f();
                    } else {
                        mVar3.C(1783287901);
                        jD = d92.b.a(mVar3).k().d();
                        mVar3.f();
                    }
                    long j15 = jD;
                    d3Var.getClass();
                    w4.a(d5VarE, rVar2, null, d3.b(this.f24378b, jA, jX, jA2, jX2, jA3, jA4, jA5, j14, jB, jA6, jX3, jC, jE, j15, jA7, mVar3), null, null, false, null, mVar3, 1794048);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                y01.m.b((h4.r) obj5, (String) obj6, this.f24378b, (x0) obj4, (String) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ya0.p.d(this.f24378b, (l90.b) obj6, (ya0.a) obj5, (o0) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(long j8, Object obj, Object obj2, e23.a aVar, o13.h hVar, int i14, int i15) {
        this.f24377a = i15;
        this.f24378b = j8;
        this.f24379c = obj;
        this.f24380d = obj2;
        this.f24381e = aVar;
        this.f24382f = hVar;
    }

    public /* synthetic */ e(gv0.d dVar, long j8, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f24377a = 2;
        this.f24379c = dVar;
        this.f24378b = j8;
        this.f24381e = aVar;
        this.f24380d = aVar2;
        this.f24382f = aVar3;
    }

    public /* synthetic */ e(h4.r rVar, long j8, List list, z3.e eVar, e23.l lVar, int i14) {
        this.f24377a = 4;
        this.f24379c = rVar;
        this.f24378b = j8;
        this.f24380d = list;
        this.f24381e = eVar;
        this.f24382f = lVar;
    }

    public /* synthetic */ e(h4.r rVar, String str, long j8, x0 x0Var, String str2, int i14) {
        this.f24377a = 7;
        this.f24380d = rVar;
        this.f24379c = str;
        this.f24378b = j8;
        this.f24381e = x0Var;
        this.f24382f = str2;
    }

    public /* synthetic */ e(h41.g gVar, String str, String str2, long j8, h4.r rVar) {
        this.f24377a = 3;
        this.f24380d = gVar;
        this.f24379c = str;
        this.f24381e = str2;
        this.f24378b = j8;
        this.f24382f = rVar;
    }

    public /* synthetic */ e(c5 c5Var, e23.l lVar, e23.l lVar2, long j8, h4.r rVar) {
        this.f24377a = 6;
        this.f24379c = c5Var;
        this.f24380d = lVar;
        this.f24381e = lVar2;
        this.f24378b = j8;
        this.f24382f = rVar;
    }

    public /* synthetic */ e(i53.c cVar, i53.c cVar2, long j8, h4.r rVar, e23.l lVar, int i14) {
        this.f24377a = 1;
        this.f24379c = cVar;
        this.f24380d = cVar2;
        this.f24378b = j8;
        this.f24381e = rVar;
        this.f24382f = lVar;
    }
}
