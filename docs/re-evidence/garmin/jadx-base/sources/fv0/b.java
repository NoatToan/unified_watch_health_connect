package fv0;

import android.content.Context;
import c2.b0;
import c2.j;
import c2.l;
import c2.l2;
import c2.q2;
import c2.s2;
import c2.t;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import e23.q;
import f72.s9;
import h4.k;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import i3.wg;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import u1.w;
import u1.y0;
import x5.r0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f73624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f73625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f73626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f73627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f73628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f73629g;

    public /* synthetic */ b(boolean z14, Context context, pu0.b bVar, boolean z15, yu0.d dVar, Boolean bool) {
        this.f73623a = 0;
        this.f73624b = z14;
        this.f73626d = context;
        this.f73627e = bVar;
        this.f73625c = z15;
        this.f73628f = dVar;
        this.f73629g = bool;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0190  */
    /* JADX WARN: Code duplicated, block: B:70:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0302  */
    /* JADX WARN: Code duplicated, block: B:81:0x030c  */
    /* JADX WARN: Code duplicated, block: B:82:0x033d  */
    /* JADX WARN: Code duplicated, block: B:85:0x037e  */
    /* JADX WARN: Code duplicated, block: B:87:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x03af  */
    /* JADX WARN: Code duplicated, block: B:91:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:92:0x03de  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m.a aVar;
        h5.g.a.f fVar;
        j92.e eVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        boolean zR;
        Object objQ;
        int i14 = this.f73623a;
        m.a aVar2 = m.f135153a;
        boolean z14 = this.f73625c;
        boolean z15 = this.f73624b;
        Object obj4 = this.f73629g;
        Object obj5 = this.f73628f;
        Object obj6 = this.f73627e;
        Object obj7 = this.f73626d;
        switch (i14) {
            case 0:
                Context context = (Context) obj7;
                pu0.b bVar = (pu0.b) obj6;
                yu0.d dVar = (yu0.d) obj5;
                Boolean bool = (Boolean) obj4;
                t2 t2Var = (t2) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar3 = r.S;
                    r rVarA = t2Var.a(aVar3, 1.0f, true);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    r rVarC2 = k.c(rVarA, mVar);
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
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT()) {
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        if (!s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC2, mVar);
                        b0 b0Var = b0.f22601a;
                        String strA = og.a.A(bVar);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strA, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131070);
                        h4.g.b bVar3 = h4.d.a.f81534l;
                        d92.b.f58625c.getClass();
                        eVar = j92.b.f97899b;
                        s2VarA = q2.a(j.i(eVar.f97917b), bVar3, mVar, 48);
                        iHashCode = Long.hashCode(mVar.getU());
                        i2VarX = mVar.x();
                        rVarC = k.c(aVar3, mVar);
                        if (mVar.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar4);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar2, s2VarA, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, mVar);
                        u2 u2Var = u2.f22900a;
                        if (z14) {
                            mVar.C(-2046283761);
                            s62.a.f157643a.getClass();
                            u4.d dVarA = s9.a(t62.c.f162799a);
                            gl.c.f77766a.getClass();
                            i7.b(dVarA, null, x2.q(aVar3, eVar.f97920e), gl.c.f77767b.P, mVar, 48, 0);
                            mVar.f();
                        } else {
                            mVar.C(-2045927261);
                            mVar.f();
                        }
                        mh.c(dVar.c(bVar, bool, z14), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131070);
                        mVar.y();
                        mVar.y();
                        if (z15) {
                            mVar.C(979801169);
                            s62.a.f157643a.getClass();
                            u4.d dVarA2 = v62.s9.a(t62.b.f162798a);
                            String strQ = gl1.y.Q(mVar, R.string.lbl_declined);
                            r rVarQ = x2.q(aVar3, eVar.f97921f);
                            zR = mVar.r(context);
                            objQ = mVar.q();
                            if (zR) {
                                objQ = new cy1.a(context, 11);
                                mVar.K(objQ);
                            } else {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    objQ = new cy1.a(context, 11);
                                    mVar.K(objQ);
                                }
                            }
                            y0.b(dVarA2, strQ, w.d(rVarQ, false, null, null, (e23.a) objQ, 15), null, mVar, 0, 120);
                            mVar.f();
                        } else {
                            mVar.C(980519997);
                            mVar.f();
                        }
                    }
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar);
                    b0 b0Var2 = b0.f22601a;
                    String strA2 = og.a.A(bVar);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strA2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131070);
                    h4.g.b bVar4 = h4.d.a.f81534l;
                    d92.b.f58625c.getClass();
                    eVar = j92.b.f97899b;
                    s2VarA = q2.a(j.i(eVar.f97917b), bVar4, mVar, 48);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = k.c(aVar3, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, s2VarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    } else {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, mVar);
                    u2 u2Var2 = u2.f22900a;
                    if (z14) {
                        mVar.C(-2046283761);
                        s62.a.f157643a.getClass();
                        u4.d dVarA3 = s9.a(t62.c.f162799a);
                        gl.c.f77766a.getClass();
                        i7.b(dVarA3, null, x2.q(aVar3, eVar.f97920e), gl.c.f77767b.P, mVar, 48, 0);
                        mVar.f();
                    } else {
                        mVar.C(-2045927261);
                        mVar.f();
                    }
                    mh.c(dVar.c(bVar, bool, z14), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131070);
                    mVar.y();
                    mVar.y();
                    if (z15) {
                        mVar.C(979801169);
                        s62.a.f157643a.getClass();
                        u4.d dVarA4 = v62.s9.a(t62.b.f162798a);
                        String strQ2 = gl1.y.Q(mVar, R.string.lbl_declined);
                        r rVarQ2 = x2.q(aVar3, eVar.f97921f);
                        zR = mVar.r(context);
                        objQ = mVar.q();
                        if (zR) {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new cy1.a(context, 11);
                                mVar.K(objQ);
                            }
                        } else {
                            objQ = new cy1.a(context, 11);
                            mVar.K(objQ);
                        }
                        y0.b(dVarA4, strQ2, w.d(rVarQ2, false, null, null, (e23.a) objQ, 15), null, mVar, 0, 120);
                        mVar.f();
                    } else {
                        mVar.C(980519997);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                iw1.a aVar5 = (iw1.a) obj7;
                String str = (String) obj6;
                androidx.fragment.app.m mVar2 = (androidx.fragment.app.m) obj5;
                c.q qVar = (c.q) obj4;
                m mVar3 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    m52.k kVar2 = aVar5.I;
                    u4.d dVar2 = kVar2.f116772h;
                    m52.k.f116753m.getClass();
                    long jA = m52.k.a.a(kVar2, mVar3);
                    String str2 = aVar5.f95326m;
                    String str3 = str2 == null ? "" : str2;
                    String str4 = aVar5.f95328o;
                    String str5 = str4 == null ? "" : str4;
                    String str6 = aVar5.f95329p;
                    boolean zR2 = mVar3.r(aVar5) | mVar3.r(mVar2);
                    boolean z16 = this.f73624b;
                    boolean zH = zR2 | mVar3.h(z16);
                    boolean z17 = this.f73625c;
                    boolean zH2 = zH | mVar3.h(z17) | mVar3.r(qVar);
                    Object objQ2 = mVar3.q();
                    if (zH2) {
                        gw1.g gVar = new gw1.g(aVar5, mVar2, z16, z17, qVar, 1);
                        mVar3.K(gVar);
                        objQ2 = gVar;
                    } else {
                        aVar2.getClass();
                        if (objQ2 == m.a.f135155b) {
                            gw1.g gVar2 = new gw1.g(aVar5, mVar2, z16, z17, qVar, 1);
                            mVar3.K(gVar2);
                            objQ2 = gVar2;
                        }
                    }
                    hw1.i.b(rVarF, new hw1.f(dVar2, jA, str3, str5, null, str, str6, null, null, (e23.a) objQ2, 400, null), mVar3, 6, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                String str7 = (String) obj7;
                a2.j jVar = (a2.j) obj6;
                String str8 = (String) obj5;
                p pVar = (p) obj4;
                p<? super m, ? super Integer, Unit> pVar2 = (p) obj;
                m mVar4 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                pVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.r(pVar2) ? 4 : 2;
                }
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    wg wgVar = wg.f90137a;
                    r0.f188941a.getClass();
                    nb0.b bVar5 = r0.a.f188943b;
                    k2.a aVar6 = j92.h.f97941a.f87991b;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l2 l2VarE = l.e(j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    long jA2 = zl.a.a(mVar4);
                    long jA3 = zl.a.a(mVar4);
                    long jX = com.nimbusds.jose.shaded.gson.internal.a.x(mVar4);
                    long jX2 = com.nimbusds.jose.shaded.gson.internal.a.x(mVar4);
                    long jB = sn.a.b(mVar4);
                    long jE = ds.e0.e(mVar4);
                    long jB2 = sn.a.b(mVar4);
                    long jB3 = sn.a.b(mVar4);
                    long jB4 = sn.a.b(mVar4);
                    long jA4 = n5.a.a(mVar4, R.color.default_text_inverted);
                    long jA5 = n5.a.a(mVar4, R.color.default_text_inverted);
                    d0.f128823b.getClass();
                    long j8 = d0.f128831j;
                    wgVar.getClass();
                    wgVar.b(str7, pVar2, true, true, bVar5, jVar, false, null, z3.f.c(-1170488501, new vd0.b(str8, 24), mVar4), null, z3.f.c(-903655140, new o62.g(str7, z15, z14, pVar), mVar4), null, null, null, aVar6, wg.c(jA2, jA3, jA4, jA5, jE, j8, j8, jB, jB2, jB3, jB4, jX, jX2, mVar4, 1743152844), l2VarE, null, mVar4, ((iIntValue3 << 3) & 112) | 100691328, 100663302, 146112);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, boolean z14, boolean z15, Object obj4, int i14) {
        this.f73623a = i14;
        this.f73626d = obj;
        this.f73627e = obj2;
        this.f73628f = obj3;
        this.f73624b = z14;
        this.f73625c = z15;
        this.f73629g = obj4;
    }
}
