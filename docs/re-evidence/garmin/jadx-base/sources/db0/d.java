package db0;

import android.content.Context;
import b82.b0;
import c2.a0;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.t;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import cw1.k;
import e23.q;
import ew1.j2;
import f5.p;
import g02.b2;
import gl1.y;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import k2.i;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p5.v;
import s5.x0;
import u1.w;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58972a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f58974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f58975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f58976e;

    public /* synthetic */ d(int i14, int i15, String str, p1 p1Var) {
        this.f58976e = str;
        this.f58973b = i14;
        this.f58974c = i15;
        this.f58975d = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0103  */
    /* JADX WARN: Code duplicated, block: B:52:0x0239  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        String strH;
        int i14 = this.f58972a;
        int i15 = this.f58974c;
        int i16 = this.f58973b;
        m.a aVar = m.f135153a;
        p1 p1Var = this.f58975d;
        Object obj4 = this.f58976e;
        switch (i14) {
            case 0:
                Context context = (Context) obj4;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar2 = r.S;
                    Object objQ = mVar.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new k(p1Var, 26);
                        mVar.K(objQ);
                    }
                    r rVarD = w.d(aVar2, false, null, null, (e23.a) objQ, 15);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarY = l.y(u1.n.e(x2.f(l.C(rVarD, 0.0f, eVar.f97923h, 0.0f, 0.0f, 13), 0.8f), com.nimbusds.jose.shaded.gson.internal.a.c(mVar), i.a(j92.b.f97900c.f97912d)), eVar.f97920e);
                    j.f22691a.getClass();
                    j.c cVar = j.f22696f;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(cVar, h4.d.a.f81533k, mVar, 6);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarY, mVar);
                    g.V.getClass();
                    e0.a aVar3 = g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(g.a.f81810g, s2VarA, mVar);
                    b4.c(g.a.f81809f, i2VarX, mVar);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar);
                    u2 u2Var = u2.f22900a;
                    u2Var.getClass();
                    p pVar = f5.b.f68892a;
                    r rVarC2 = l.C(u2Var.d(aVar2, pVar), 0.0f, 0.0f, eVar.f97917b, 0.0f, 11);
                    String strValueOf = String.valueOf(i16);
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97928e;
                    mh.c(strValueOf, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), mVar), mVar, 0, 0, 131068);
                    r rVarC3 = l.C(u2Var.d(aVar2, pVar), 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
                    boolean zR = mVar.r(context);
                    Object objQ2 = mVar.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new a51.m(context, 7);
                        mVar.K(objQ2);
                    }
                    r rVarC4 = v.c((e23.l) objQ2, rVarC3, false);
                    String strQ = y.Q(mVar, R.string.lbl_hours);
                    x0 x0Var2 = j92.f.f97931h;
                    mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, mVar), mVar, 0, 0, 131068);
                    mh.c(String.valueOf(i15), l.C(u2Var.d(aVar2, pVar), 0.0f, 0.0f, eVar.f97917b, 0.0f, 11), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), mVar), mVar, 0, 0, 131068);
                    r rVarD2 = u2Var.d(aVar2, pVar);
                    boolean zR2 = mVar.r(context);
                    Object objQ3 = mVar.q();
                    if (zR2 || objQ3 == c2565a) {
                        objQ3 = new a51.m(context, 8);
                        mVar.K(objQ3);
                    }
                    mh.c(y.Q(mVar, R.string.common_min_abbreviated_without_period), v.c((e23.l) objQ3, rVarD2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, mVar), mVar, 0, 0, 131068);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p1 p1Var2 = (p1) obj4;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                j2.a aVar4 = j2.f66533d;
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar5 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    b2.a(l.C(aVar5, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), true, this.f58973b, this.f58974c, y.Q(mVar2, R.string.choose_a_focus_for_your_training), null, null, null, null, mVar2, 48, 480);
                    for (vt1.e eVar2 : vt1.e.f180102g) {
                        String strQ2 = y.Q(mVar2, eVar2.f180103a);
                        String strQ3 = y.Q(mVar2, eVar2.f180104b);
                        boolean z14 = ((vt1.e) p1Var.getF182175a()) == eVar2;
                        if (z14) {
                            strH = sn.a.h(mVar2, -744579297, R.string.selected, mVar2);
                        } else {
                            mVar2.C(-1607079195);
                            mVar2.f();
                            strH = "";
                        }
                        b92.a aVarA = wz1.a.a(strQ2 + ". " + strQ3 + ". " + strH);
                        boolean zK = mVar2.k(eVar2.ordinal());
                        Object objQ4 = mVar2.q();
                        if (zK) {
                            objQ4 = new ci0.b(eVar2, 22, p1Var2, p1Var);
                            mVar2.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == m.a.f135155b) {
                                objQ4 = new ci0.b(eVar2, 22, p1Var2, p1Var);
                                mVar2.K(objQ4);
                            }
                        }
                        int i17 = b92.a.f16960b;
                        cw1.r.b(null, strQ2, strQ3, aVarA, z14, false, (e23.l) objQ4, mVar2, 0, 33);
                    }
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                String str = (String) obj4;
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    j.f22691a.getClass();
                    j.d dVar = j.f22693c;
                    r.a aVar6 = r.S;
                    r rVarF = x2.f(aVar6, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    r rVarC5 = l.C(rVarF, 0.0f, 0.0f, eVar3.f97918c, 0.0f, 11);
                    s2 s2VarA2 = q2.a(dVar, bVar2, mVar3, 54);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    r rVarC6 = h4.k.c(rVarC5, mVar3);
                    g.V.getClass();
                    e0.a aVar7 = g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar7);
                    } else {
                        mVar3.c();
                    }
                    b4.c(g.a.f81810g, s2VarA2, mVar3);
                    b4.c(g.a.f81809f, i2VarX2, mVar3);
                    g.a.b bVar3 = g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        h.z(iHashCode2, mVar3, iHashCode2, bVar3);
                    }
                    b4.c(g.a.f81807d, rVarC6, mVar3);
                    l.f(u2.f22900a.a(aVar6, 1.0f, true), mVar3);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar3);
                    r rVarC7 = l.C(aVar6, 0.0f, 0.0f, eVar3.f97918c, 0.0f, 11);
                    boolean zB = mVar3.B(str);
                    Object objQ5 = mVar3.q();
                    if (zB) {
                        objQ5 = new b0(5, str, p1Var);
                        mVar3.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = new b0(5, str, p1Var);
                            mVar3.K(objQ5);
                        }
                    }
                    mh.c(str, v.c((e23.l) objQ5, rVarC7, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar3, 0, 0, 131068);
                    float f14 = 36;
                    g6.f.a aVar8 = g6.f.f75994b;
                    c02.h.e(x2.r(aVar6, f14, f14), Double.valueOf(i16), Double.valueOf(i15), mVar3, 3078);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(int i14, int i15, p1 p1Var, p1 p1Var2) {
        this.f58973b = i14;
        this.f58974c = i15;
        this.f58975d = p1Var;
        this.f58976e = p1Var2;
    }

    public /* synthetic */ d(p1 p1Var, int i14, Context context, int i15) {
        this.f58975d = p1Var;
        this.f58973b = i14;
        this.f58976e = context;
        this.f58974c = i15;
    }
}
