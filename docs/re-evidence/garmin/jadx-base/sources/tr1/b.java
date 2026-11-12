package tr1;

import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import dy1.l;
import e23.p;
import h4.d;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j92.e;
import l72.f0;
import m92.u;
import o72.h3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p5.v;
import s5.x0;
import s70.r0;
import u1.a2;
import v.h;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166122a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f166123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f166124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f166125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f166126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f166127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f166128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f166129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f166130i;

    public /* synthetic */ b(int i14, int i15, l lVar, e23.a aVar, mx1.b bVar, int i16, int i17, e23.l lVar2) {
        this.f166123b = i14;
        this.f166124c = i15;
        this.f166127f = lVar;
        this.f166128g = aVar;
        this.f166129h = bVar;
        this.f166125d = i16;
        this.f166126e = i17;
        this.f166130i = lVar2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x025f  */
    /* JADX WARN: Code duplicated, block: B:64:0x03a2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f166122a;
        m.a aVar = m.f135153a;
        Object obj3 = this.f166130i;
        Object obj4 = this.f166129h;
        Object obj5 = this.f166128g;
        Object obj6 = this.f166127f;
        switch (i14) {
            case 0:
                String str = (String) obj6;
                String str2 = (String) obj5;
                i53.c cVar = (i53.c) obj3;
                String str3 = (String) obj4;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarD = x2.d(aVar2, 1.0f);
                    boolean zB = mVar.B(str);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new r0(str, 22);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new r0(str, 22);
                            mVar.K(objQ);
                        }
                    }
                    r rVarC = v.c((e23.l) objQ, rVarD, false);
                    d.f81522a.getClass();
                    g.a aVar3 = d.a.f81537o;
                    j.f22691a.getClass();
                    j.g gVar = j.f22698h;
                    z zVarA = y.a(gVar, aVar3, mVar, 54);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC2 = k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar);
                    b0 b0Var = b0.f22601a;
                    vr1.g.a(x2.h(aVar2, yz1.y.k(mVar)), this.f166123b, this.f166124c, this.f166125d, this.f166126e, f.c(53831296, new h3(str2, 25), mVar), yz1.y.g(mVar), mVar, 196608, 0);
                    r rVarX = x2.x(x2.f(aVar2, 1.0f), null, 3);
                    z zVarA2 = y.a(j.f22694d, d.a.f81536n, mVar, 0);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    r rVarC3 = k.c(rVarX, mVar);
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, zVarA2, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC3, mVar);
                    u.a(b0Var.a(x2.d(aVar2, 1.0f), 1.0f, true), cVar, Float.valueOf(481), false, Float.valueOf(0.0f), Float.valueOf(100.0f), 0.0f, gl1.y.Q(mVar, R.string.common_no_data), mVar, 1769472, 7826);
                    if (cVar.isEmpty()) {
                        mVar.C(-1556596572);
                        mVar.f();
                    } else {
                        mVar.C(-1557422071);
                        r rVarX2 = x2.x(x2.f(aVar2, 1.0f), null, 3);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarC4 = c2.l.C(rVarX2, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13);
                        s2 s2VarA = q2.a(gVar, d.a.f81533k, mVar, 6);
                        int iHashCode3 = Long.hashCode(mVar.getU());
                        i2 i2VarX3 = mVar.x();
                        r rVarC5 = k.c(rVarC4, mVar);
                        if (mVar.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar4);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar, s2VarA, mVar);
                        b4.c(c1623g, i2VarX3, mVar);
                        if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                            h.z(iHashCode3, mVar, iHashCode3, bVar);
                        }
                        b4.c(fVar, rVarC5, mVar);
                        u2 u2Var = u2.f22900a;
                        d92.b.f58624b.getClass();
                        x0 x0Var = j92.f.f97935l;
                        g02.c.a(str3, null, 0L, null, 0, false, 0, d92.c.f(x0Var, mVar), 0.0d, mVar, 0, 382);
                        g02.c.a(str3, null, 0L, null, 0, false, 0, d92.c.f(x0Var, mVar), 0.0d, mVar, 0, 382);
                        mVar.y();
                        mVar.f();
                    }
                    mVar.y();
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                l lVar = (l) obj6;
                e23.a aVar5 = (e23.a) obj5;
                mx1.b bVar2 = (mx1.b) obj4;
                e23.l lVar2 = (e23.l) obj3;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar6 = r.S;
                    r rVarD2 = x2.d(aVar6, 1.0f);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    d.f81522a.getClass();
                    z zVarA3 = y.a(kVar, d.a.f81536n, mVar2, 0);
                    int iHashCode4 = Long.hashCode(mVar2.getU());
                    i2 i2VarX4 = mVar2.x();
                    r rVarC6 = k.c(rVarD2, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA3, mVar2);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX4, mVar2);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                        h.z(iHashCode4, mVar2, iHashCode4, bVar3);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC6, mVar2);
                    b0 b0Var2 = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97920e;
                    float f15 = eVar3.f97921f;
                    e23.l lVar3 = lVar2;
                    qx1.n.a(this.f166123b, this.f166124c, 0, c2.l.A(c2.l.C(aVar6, 0.0f, f14, 0.0f, eVar3.f97918c, 5), eVar3.f97920e, 0.0f, 2), mVar2);
                    r rVarB = a2.b(b0Var2.a(aVar6, 1.0f, true), a2.a(mVar2), true);
                    z zVarA4 = y.a(kVar, d.a.f81537o, mVar2, 48);
                    int iHashCode5 = Long.hashCode(mVar2.getU());
                    i2 i2VarX5 = mVar2.x();
                    r rVarC7 = k.c(rVarB, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar2, zVarA4, mVar2);
                    b4.c(c1623g2, i2VarX5, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode5))) {
                        h.z(iHashCode5, mVar2, iHashCode5, bVar3);
                    }
                    b4.c(fVar2, rVarC7, mVar2);
                    r rVarA = c2.l.A(c2.l.C(aVar6, 0.0f, eVar3.f97921f, 0.0f, 0.0f, 13), f15, 0.0f, 2);
                    String strP = gl1.y.P(R.string.lbl_set_primary_lifts_message, new Object[]{gl1.y.Q(mVar2, bVar2.f121367b)}, mVar2);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                    d6.h.f57752b.getClass();
                    int i15 = d6.h.f57755e;
                    mh.c(strP, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                    r rVarA2 = c2.l.A(c2.l.C(aVar6, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), f15, 0.0f, 2);
                    String strP2 = gl1.y.P(R.string.lbl_number_of_number_pattern, new Object[]{Integer.valueOf(this.f166125d), Integer.valueOf(this.f166126e)}, mVar2);
                    x0 x0Var2 = j92.f.f97933j;
                    mh.c(strP2, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar2), mVar2, 0, 0, 131068);
                    mh.c(gl1.y.Q(mVar2, R.string.lbl_set_primary_lifts_additional_message), c2.l.A(c2.l.C(aVar6, 0.0f, eVar3.f97920e, 0.0f, eVar3.f97921f, 5), f15, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar2), mVar2, 0, 0, 130044);
                    mVar2.C(2119427131);
                    for (dy1.j jVar : lVar.f61574a) {
                        String strQ = gl1.y.Q(mVar2, jVar.f61569a.f121351a);
                        boolean z14 = jVar.f61571c;
                        boolean z15 = jVar.f61570b;
                        e23.l lVar4 = lVar3;
                        boolean zB2 = mVar2.B(lVar4) | mVar2.B(jVar);
                        Object objQ2 = mVar2.q();
                        if (zB2) {
                            objQ2 = new x9.b(8, lVar4, jVar);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new x9.b(8, lVar4, jVar);
                                mVar2.K(objQ2);
                            }
                        }
                        qx1.m.a(strQ, z15, null, z14, null, false, false, (e23.l) objQ2, mVar2, 0, 116);
                        lVar3 = lVar4;
                    }
                    mVar2.f();
                    if (lVar.f61575b) {
                        mVar2.C(1278261785);
                        r rVarF = x2.f(r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        e eVar4 = j92.b.f97899b;
                        r rVarA3 = c2.l.A(c2.l.A(rVarF, 0.0f, eVar4.f97921f, 1), eVar4.f97920e, 0.0f, 2);
                        String strQ2 = gl1.y.Q(mVar2, R.string.lbl_training_day_limit_reached);
                        d92.b.f58624b.getClass();
                        mh.c(strQ2, rVarA3, d92.b.a(mVar2).k().e(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar2, 0, 0, 131064);
                        mVar2.f();
                    } else {
                        mVar2.C(1278726506);
                        mVar2.f();
                    }
                    mVar2.y();
                    f0 f0Var = f0.f110999a;
                    r rVarF2 = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    e eVar5 = j92.b.f97899b;
                    f0Var.d(0, 1, aVar5, c2.l.C(c2.l.A(rVarF2, eVar5.f97920e, 0.0f, 2), 0.0f, eVar5.f97920e, 0.0f, eVar5.f97921f, 5), gl1.y.Q(mVar2, R.string.lbl_next), mVar2, null, lVar.f61576c);
                    mVar2.y();
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(String str, int i14, int i15, int i16, int i17, String str2, i53.c cVar, String str3) {
        this.f166127f = str;
        this.f166123b = i14;
        this.f166124c = i15;
        this.f166125d = i16;
        this.f166126e = i17;
        this.f166128g = str2;
        this.f166130i = cVar;
        this.f166129h = str3;
    }
}
