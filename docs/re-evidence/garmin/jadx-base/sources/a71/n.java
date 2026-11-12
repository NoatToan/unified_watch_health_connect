package a71;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.a3;
import aq.o2;
import aq.z2;
import b82.d2;
import b82.n1;
import b82.q1;
import c2.a0;
import c2.b0;
import c2.c1;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import e11.i0;
import e23.q;
import g81.j0;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.Iterator;
import l72.g3;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p5.v;
import qr.t;
import s5.x0;
import t21.s0;
import u1.w;
import zd0.g1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1789b;

    public /* synthetic */ n(ej0.b bVar, Double d14) {
        this.f1788a = 24;
        this.f1789b = d14;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        g81.m mVar;
        g81.p pVar = (g81.p) this.f1789b;
        p3.m mVar2 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c1) obj).getClass();
        int i14 = 0;
        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            i53.c<g81.m.b> cVar = (pVar == null || (mVar = pVar.f76396h) == null) ? null : mVar.f76368c;
            if (cVar == null) {
                mVar2.C(2095124309);
                mVar2.f();
            } else {
                mVar2.C(2095124310);
                for (g81.m.b bVar : cVar) {
                    c3 c3Var = bVar.f76369a;
                    int i15 = bVar.f76371c;
                    String strT = gl1.d.T(c3Var, mVar2, i14);
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97918c;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    r.a aVar = r.S;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, mVar2, i14);
                    x1 x1Var2 = p3.n.f135158a;
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(aVar, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    u2 u2Var = u2.f22900a;
                    c2.q.a(u1.n.e(l4.k.b(x2.q(aVar, j92.b.f97901d.f97903b), k2.i.a(eVar.f97918c)), n5.a.a(mVar2, i15), m1.f128891a), mVar2, i14);
                    d92.b.f58624b.getClass();
                    p3.m mVar3 = mVar2;
                    mh.c(strT, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar3, 0, 0, 131070);
                    mVar3.y();
                    mVar2 = mVar3;
                    i14 = i14;
                }
                mVar2.f();
            }
            x1 x1Var3 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        i53.f<pv.a> fVar = (i53.f) this.f1789b;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC = c2.l.C(c2.l.C(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar2, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            b0 b0Var = b0.f22601a;
            mVar.C(-387972291);
            for (pv.a aVar4 : fVar) {
                if (aVar4 instanceof pv.a.c) {
                    mVar.C(-264965183);
                    da0.z.c(((pv.a.c) aVar4).f141328a, mVar, 0);
                    mVar.f();
                } else if (aVar4 instanceof pv.a.b) {
                    mVar.C(-264827233);
                    da0.z.b(((pv.a.b) aVar4).f141327a, mVar, 0);
                    mVar.f();
                } else {
                    if (!(aVar4 instanceof pv.a.C2653a)) {
                        throw n23.j.m(mVar, 1099829586);
                    }
                    mVar.C(-264689252);
                    da0.z.a(((pv.a.C2653a) aVar4).f141326a, mVar, 0);
                    mVar.f();
                }
            }
            mVar.f();
            mVar.y();
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        int i14;
        int i15;
        Double d14 = (Double) this.f1789b;
        h82.r rVar = (h82.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i16 = dj0.h.f59916g;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            int i17 = (iIntValue << 3) & 112;
            rVar.D(R.string.lbl_your_personal_power_level, mVar, i17);
            rVar.c(mVar, iIntValue & 14);
            rVar.j(z3.f.c(958724380, new a42.l(rVar, 16), mVar), mVar, i17 | 6);
            if (ej0.b.c(d14)) {
                mVar.C(-347952549);
                if (bo1.a.a().c().o0()) {
                    i14 = -1258144206;
                    i15 = R.string.lbl_ftp_for_different_sports_content;
                } else {
                    i14 = -1258141320;
                    i15 = R.string.winter_sports_ski_power_help_description_2;
                }
                String strH = sn.a.h(mVar, i14, i15, mVar);
                rVar.s((iIntValue << 6) & 896, 2, gl1.y.Q(mVar, R.string.lbl_ftp_for_different_sports), null, mVar);
                rVar.q(strH, mVar, i17);
                mVar.f();
            } else {
                mVar.C(-347443219);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0063  */
    /* JADX WARN: Code duplicated, block: B:16:0x0080  */
    /* JADX WARN: Code duplicated, block: B:6:0x0047  */
    private final Object d(Object obj, Object obj2, Object obj3) {
        t tVar = (t) this.f1789b;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        r.a aVar = r.S;
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        j92.e eVar = j92.b.f97899b;
        int i14 = 2;
        r rVarC = c2.l.C(c2.l.A(aVar, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
        boolean zR = mVar.r(tVar);
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zR) {
            objQ = new ds.f(tVar, i14);
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ds.f(tVar, i14);
                mVar.K(objQ);
            }
        }
        e23.a aVar3 = (e23.a) objQ;
        boolean zR2 = mVar.r(tVar);
        Object objQ2 = mVar.q();
        if (zR2) {
            objQ2 = new ds.f(tVar, 3);
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new ds.f(tVar, 3);
                mVar.K(objQ2);
            }
        }
        e23.a aVar4 = (e23.a) objQ2;
        boolean zR3 = mVar.r(tVar);
        Object objQ3 = mVar.q();
        if (zR3) {
            objQ3 = new ds.f(tVar, 4);
            mVar.K(objQ3);
        } else {
            aVar2.getClass();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = new ds.f(tVar, 4);
                mVar.K(objQ3);
            }
        }
        ds.j.c(rVarC, aVar3, aVar4, (e23.a) objQ3, mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0044  */
    private final Object e(Object obj, Object obj2, Object obj3) {
        f11.j jVar = (f11.j) this.f1789b;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        l72.c1 c1Var = l72.c1.f110940a;
        String strQ = gl1.y.Q(mVar, R.string.pregnancy_something_went_wrong);
        String strQ2 = gl1.y.Q(mVar, R.string.connect_iq_try_again);
        String strQ3 = gl1.y.Q(mVar, R.string.lbl_ok);
        boolean zR = mVar.r(jVar);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new i0(jVar, 1);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new i0(jVar, 1);
                mVar.K(objQ);
            }
        }
        c1Var.a(true, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ, null, null, mVar, 6, 0, 1752);
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        dk0.g gVar = (dk0.g) this.f1789b;
        c1 c1Var = (c1) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        c1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(c1Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String str = gVar.f60182b;
            d6.h.f57752b.getClass();
            int i14 = d6.h.f57755e;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97929f), mVar);
            r.a aVar = r.S;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            mh.c(str, c1Var.c(aVar, bVar), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
            String str2 = gVar.f60184d;
            if (str2 == null) {
                mVar.C(1370942973);
                mVar.f();
            } else {
                mVar.C(1370942974);
                g3.a(0, 0, c1Var.c(aVar, bVar), str2, mVar);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:205:0x062b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0680  */
    /* JADX WARN: Code duplicated, block: B:248:0x0720  */
    /* JADX WARN: Code duplicated, block: B:286:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:331:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x0182  */
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
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14;
        int i15;
        Object obj4;
        Object obj5;
        int i16 = this.f1788a;
        p3.m.a aVar = p3.m.f135153a;
        Object obj6 = this.f1789b;
        boolean z14 = false;
        switch (i16) {
            case 0:
                e eVar = (e) obj6;
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    l72.x0 x0Var = l72.x0.f111346a;
                    String str = eVar.f1757g;
                    String strQ = gl1.y.Q(mVar, R.string.tr_factor_acute_load);
                    int i17 = (iIntValue & 14) | (l72.x0.f111348c << 24);
                    x0Var.a(i17, 124, null, t2Var, null, null, str, strQ, null, null, mVar);
                    x0Var.a(i17, 124, null, t2Var, null, null, eVar.f1758h, gl1.y.Q(mVar, R.string.chronic_load_title), null, null, mVar);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                tm1.b bVar = (tm1.b) obj6;
                c2.t tVar = (c2.t) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(tVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (bVar.f165444e >= 480) {
                        mVar2.C(1252202434);
                        r.a aVar2 = r.S;
                        h4.d.f81522a.getClass();
                        r rVarC = tVar.c(aVar2, h4.d.a.f81528f);
                        c2.j.f22691a.getClass();
                        z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        r rVarC2 = h4.k.c(rVarC, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar3 = h5.g.a.f81805b;
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
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                        b0 b0Var = b0.f22601a;
                        t4.d dVarA = n5.c.a(R.drawable.check, mVar2, 0);
                        d92.b.f58623a.getClass();
                        long jE = d92.b.a(mVar2).f().e();
                        g6.f.a aVar4 = g6.f.f75994b;
                        i7.a(dVarA, null, x2.q(aVar2, 12), jE, mVar2, 432, 0);
                        mVar2.y();
                        mVar2.f();
                    } else {
                        mVar2.C(1252610859);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                o2 o2Var = (o2) obj6;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i18 = o2.f12136f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    o2Var.g(mVar3, h82.c.f82429e);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                o2.a aVar5 = (o2.a) obj6;
                t2 t2Var2 = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i19 = o2.f12136f;
                t2Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(t2Var2) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    d2 d2Var = d2.f16532a;
                    String strQ2 = gl1.y.Q(mVar4, aVar5.f12137a);
                    d2Var.getClass();
                    int i24 = iIntValue4 & 14;
                    d2Var.f(t2Var2, strQ2, t2Var2.a(d2.i(), 0.635f, true), null, 0, 0, mVar4, i24, 28);
                    d2Var.f(t2Var2, aVar5.f12138b, t2Var2.a(d2.i(), 0.365f, true), null, 0, 0, mVar4, i24, 28);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                z2 z2Var = (z2) obj6;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i25 = z2.f12318f;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    z2Var.g(mVar5, h82.c.f82429e);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                a3 a3Var = (a3) obj6;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i26 = a3.f11821f;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    a3Var.g(mVar6, h82.c.f82429e);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                vs.e eVar2 = (vs.e) obj6;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    at.e.a(eVar2, mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                s21.a0 a0Var = (s21.a0) obj6;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    s0.a(a0Var.f156038c, mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                q1.a aVar6 = (q1.a) obj6;
                r rVar = (r) obj;
                p3.m mVar9 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                q1 q1Var = q1.f16749a;
                rVar.getClass();
                mVar9.C(-1059723936);
                x1 x1Var9 = p3.n.f135158a;
                boolean zR = mVar9.r(aVar6);
                Object objQ = mVar9.q();
                if (zR) {
                    objQ = new n1(aVar6, 0);
                    mVar9.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new n1(aVar6, 0);
                        mVar9.K(objQ);
                    }
                }
                r rVarD = w.d(rVar, false, null, null, (e23.a) objQ, 15);
                mVar9.f();
                return rVarD;
            case 9:
                bd0.n nVar = (bd0.n) obj6;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i27 = bd0.n.f17593f;
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var10 = p3.n.f135158a;
                    nVar.g(mVar10, h82.c.f82429e);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                bk0.a aVar7 = (bk0.a) obj6;
                c1 c1Var = (c1) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                c1Var.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar11.B(c1Var) ? 4 : 2;
                }
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    String str2 = aVar7.f18466a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97932i), mVar11);
                    r.a aVar8 = r.S;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    mh.c(str2, c1Var.c(aVar8, bVar3), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar11, 0, 0, 131068);
                    String str3 = aVar7.f18468c;
                    if (str3 == null) {
                        mVar11.C(1525051212);
                        mVar11.f();
                    } else {
                        mVar11.C(1525051213);
                        g3.a(0, 0, c1Var.c(aVar8, bVar3), str3, mVar11);
                        mVar11.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                g81.b bVar4 = (g81.b) obj6;
                Float f14 = (Float) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar12.B(f14) ? 4 : 2;
                }
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var12 = p3.n.f135158a;
                    if (bVar4 == null) {
                        mVar12.C(2032755277);
                        mVar12.f();
                    } else {
                        i53.c<g81.a> cVar = bVar4.f76280n;
                        mVar12.C(2032755278);
                        if (f14 == null) {
                            mVar12.C(2045983277);
                            mVar12.f();
                        } else {
                            mVar12.C(2045983278);
                            boolean z15 = (iIntValue11 & 14) == 4;
                            Object objQ2 = mVar12.q();
                            if (z15) {
                                objQ2 = new c81.h(0, f14);
                                mVar12.K(objQ2);
                            } else {
                                aVar.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new c81.h(0, f14);
                                    mVar12.K(objQ2);
                                }
                            }
                            int iE = x.e((e23.l) objQ2, cVar, cVar.size());
                            if (iE < 0) {
                                iE = (-iE) + 1;
                            }
                            g81.a aVar9 = (g81.a) h0.e0(iE, cVar);
                            if (aVar9 == null) {
                                mVar12.C(1017807091);
                                mVar12.f();
                            } else {
                                mVar12.C(1017807092);
                                c81.g.b(aVar9, mVar12, 0);
                                mVar12.f();
                            }
                            mVar12.f();
                        }
                        mVar12.f();
                    }
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                g81.e eVar3 = (g81.e) obj6;
                Float f15 = (Float) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar13.B(f15) ? 4 : 2;
                }
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var13 = p3.n.f135158a;
                    if (f15 == null) {
                        mVar13.C(497036345);
                        mVar13.f();
                    } else {
                        mVar13.C(497036346);
                        i53.c<g81.d> cVar2 = eVar3.f76315m;
                        boolean z16 = (iIntValue12 & 14) == 4;
                        Object objQ3 = mVar13.q();
                        if (z16) {
                            objQ3 = new c81.h(1, f15);
                            mVar13.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new c81.h(1, f15);
                                mVar13.K(objQ3);
                            }
                        }
                        int iE2 = x.e((e23.l) objQ3, cVar2, cVar2.size());
                        if (iE2 < 0) {
                            iE2 = (-iE2) + 1;
                        }
                        g81.d dVar = (g81.d) h0.e0(iE2, eVar3.f76315m);
                        if (dVar == null) {
                            mVar13.C(434358369);
                            mVar13.f();
                        } else {
                            mVar13.C(434358370);
                            c81.l.c(dVar, mVar13, 0);
                            mVar13.f();
                        }
                        mVar13.f();
                    }
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                ck0.r rVar2 = (ck0.r) obj6;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                int i28 = ck0.r.f27882f;
                if (mVar14.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var14 = p3.n.f135158a;
                    rVar2.g(mVar14, h82.c.f82429e);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                qm1.k kVar = (qm1.k) obj6;
                r rVar3 = (r) obj;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                rVar3.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar15.B(rVar3) ? 4 : 2;
                }
                if (mVar15.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var15 = p3.n.f135158a;
                    if (kVar == null) {
                        return Unit.INSTANCE;
                    }
                    Integer num = kVar.f145621b;
                    boolean z17 = kVar.f145627h;
                    b10.c cVar3 = new b10.c(w2.a0.s(mVar15));
                    b10.b bVar5 = new b10.b((Context) mVar15.A(AndroidCompositionLocals_androidKt.f6042b));
                    Integer num2 = kVar.f145622c;
                    String strC = cVar3.f14213c.c(num2 != null ? num2.intValue() : 0);
                    String strValueOf = z17 ? String.valueOf(num) : strC;
                    String strF = (!z17 || qm1.l.d(kVar)) ? strC : bVar5.f(num);
                    if (!z17 || qm1.l.d(kVar)) {
                        i14 = 338762482;
                        i15 = R.string.sleep_title;
                    } else {
                        i14 = 338836014;
                        i15 = R.string.lbl_sleep_score;
                    }
                    String strH = sn.a.h(mVar15, i14, i15, mVar15);
                    if (qm1.l.d(kVar)) {
                        mVar15.C(338974150);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar15);
                        d6.h.f57752b.getClass();
                        int i29 = d6.h.f57755e;
                        d92.b.f58625c.getClass();
                        r rVarC3 = c2.l.C(rVar3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                        boolean zB = mVar15.B(strH) | mVar15.B(strF);
                        Object objQ4 = mVar15.q();
                        if (zB) {
                            obj5 = objQ4;
                            cn1.j jVar = new cn1.j(strH, strF, 0);
                            mVar15.K(jVar);
                            obj5 = jVar;
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                obj5 = objQ4;
                                cn1.j jVar2 = new cn1.j(strH, strF, 0);
                                mVar15.K(jVar2);
                                obj5 = jVar2;
                            }
                        }
                        obj5 = objQ4;
                        mh.c(strC, v.c((e23.l) obj5, rVarC3, false), 0L, null, 0L, null, 0L, d6.h.a(i29), 0L, 0, false, 0, 0, null, x0VarB2, mVar15, 0, 0, 130044);
                        mVar15.f();
                    } else {
                        mVar15.C(339418504);
                        boolean zB2 = mVar15.B(strH) | mVar15.B(strF);
                        Object objQ5 = mVar15.q();
                        if (zB2) {
                            obj4 = objQ5;
                            cn1.j jVar3 = new cn1.j(strH, strF, 1);
                            mVar15.K(jVar3);
                            obj4 = jVar3;
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                obj4 = objQ5;
                                cn1.j jVar4 = new cn1.j(strH, strF, 1);
                                mVar15.K(jVar4);
                                obj4 = jVar4;
                            }
                        }
                        obj4 = objQ5;
                        cn1.k.a(v.c((e23.l) obj4, rVar3, false), kVar, strValueOf, mVar15, 0);
                        mVar15.f();
                    }
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                cq.w wVar = (cq.w) obj6;
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                int i30 = cq.w.f55111f;
                if (mVar16.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var16 = p3.n.f135158a;
                    wVar.g(mVar16, h82.c.f82429e);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                cr.b0 b0Var2 = (cr.b0) obj6;
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                int i34 = cr.b0.f55254f;
                if (mVar17.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var17 = p3.n.f135158a;
                    b0Var2.g(mVar17, h82.c.f82429e);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                cr0.e eVar4 = (cr0.e) obj6;
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                int i35 = cr0.e.f55329f;
                if (mVar18.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    x1 x1Var18 = p3.n.f135158a;
                    eVar4.g(mVar18, h82.c.f82429e);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                d52.i iVar = (d52.i) obj6;
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                int i36 = d52.i.f57576f;
                if (mVar19.n(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    x1 x1Var19 = p3.n.f135158a;
                    iVar.g(mVar19, h82.c.f82429e);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 19:
                g81.s sVar = (g81.s) obj6;
                c2.t tVar2 = (c2.t) obj;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                tVar2.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= mVar20.B(tVar2) ? 4 : 2;
                }
                if (mVar20.n(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    x1 x1Var20 = p3.n.f135158a;
                    r.a aVar10 = r.S;
                    r rVarY = x2.y(aVar10, null, 3);
                    h4.d.f81522a.getClass();
                    r rVarC4 = tVar2.c(rVarY, h4.d.a.f81528f);
                    c2.j jVar5 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f16 = j92.b.f97899b.f97916a;
                    jVar5.getClass();
                    z zVarA2 = y.a(c2.j.i(f16), h4.d.a.f81536n, mVar20, 0);
                    int iHashCode2 = Long.hashCode(mVar20.getU());
                    i2 i2VarX2 = mVar20.x();
                    r rVarC5 = h4.k.c(rVarC4, mVar20);
                    h5.g.V.getClass();
                    e0.a aVar11 = h5.g.a.f81805b;
                    if (mVar20.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar20.z();
                    if (mVar20.getT()) {
                        mVar20.M(aVar11);
                    } else {
                        mVar20.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar20);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar20);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar20.getT() || !s.g(mVar20.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar20, iHashCode2, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar20);
                    b0 b0Var3 = b0.f22601a;
                    h4.g.a aVar12 = h4.d.a.f81537o;
                    r rVarB = b0Var3.b(aVar10, aVar12);
                    String str4 = sVar.f76398b;
                    d92.b.f58624b.getClass();
                    mh.c(str4, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, mVar20), mVar20, 0, 0, 131068);
                    mh.c(gl1.y.Q(mVar20, sVar.f76399c), b0Var3.b(aVar10, aVar12), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar20), mVar20, 0, 0, 131068);
                    mVar20.y();
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 20:
                g81.m mVar21 = (g81.m) obj6;
                c2.t tVar3 = (c2.t) obj;
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                tVar3.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= mVar22.B(tVar3) ? 4 : 2;
                }
                if (mVar22.n(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    x1 x1Var21 = p3.n.f135158a;
                    r.a aVar13 = r.S;
                    r rVarY2 = x2.y(aVar13, null, 3);
                    h4.d.f81522a.getClass();
                    r rVarC6 = tVar3.c(rVarY2, h4.d.a.f81528f);
                    c2.j jVar6 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f17 = j92.b.f97899b.f97916a;
                    jVar6.getClass();
                    z zVarA3 = y.a(c2.j.i(f17), h4.d.a.f81536n, mVar22, 0);
                    int iHashCode3 = Long.hashCode(mVar22.getU());
                    i2 i2VarX3 = mVar22.x();
                    r rVarC7 = h4.k.c(rVarC6, mVar22);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar22.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar22.z();
                    if (mVar22.getT()) {
                        mVar22.M(aVar14);
                    } else {
                        mVar22.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar22);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar22);
                    h5.g.a.b bVar7 = h5.g.a.f81813j;
                    if (mVar22.getT() || !s.g(mVar22.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar22, iHashCode3, bVar7);
                    }
                    b4.c(h5.g.a.f81807d, rVarC7, mVar22);
                    b0 b0Var4 = b0.f22601a;
                    h4.g.a aVar15 = h4.d.a.f81537o;
                    r rVarB2 = b0Var4.b(aVar13, aVar15);
                    String str5 = mVar21.f76366a;
                    d92.b.f58624b.getClass();
                    mh.c(str5, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, mVar22), mVar22, 0, 0, 131068);
                    mh.c(gl1.y.Q(mVar22, mVar21.f76367b), b0Var4.b(aVar13, aVar15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar22), mVar22, 0, 0, 131068);
                    mVar22.y();
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 21:
                return a(obj, obj2, obj3);
            case 22:
                g81.i0 i0Var = (g81.i0) obj6;
                p3.m mVar23 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var22 = p3.n.f135158a;
                r.a aVar16 = r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA4 = y.a(kVar2, h4.d.a.f81536n, mVar23, 0);
                int iHashCode4 = Long.hashCode(mVar23.getU());
                i2 i2VarX4 = mVar23.x();
                r rVarC8 = h4.k.c(aVar16, mVar23);
                h5.g.V.getClass();
                e0.a aVar17 = h5.g.a.f81805b;
                if (mVar23.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar23.z();
                if (mVar23.getT()) {
                    mVar23.M(aVar17);
                } else {
                    mVar23.c();
                }
                b4.c(h5.g.a.f81810g, zVarA4, mVar23);
                b4.c(h5.g.a.f81809f, i2VarX4, mVar23);
                h5.g.a.b bVar8 = h5.g.a.f81813j;
                if (mVar23.getT() || !s.g(mVar23.q(), Integer.valueOf(iHashCode4))) {
                    v.h.z(iHashCode4, mVar23, iHashCode4, bVar8);
                }
                b4.c(h5.g.a.f81807d, rVarC8, mVar23);
                b0 b0Var5 = b0.f22601a;
                mVar23.C(1156355306);
                Iterator<j0> it = i0Var.f76341e.iterator();
                while (it.hasNext()) {
                    d81.a0.e(x2.f(r.S, 1.0f), it.next(), mVar23, 6);
                }
                mVar23.f();
                mVar23.y();
                x1 x1Var23 = p3.n.f135158a;
                return Unit.INSTANCE;
            case 23:
                return b(obj, obj2, obj3);
            case 24:
                return c(obj, obj2, obj3);
            case 25:
                return d(obj, obj2, obj3);
            case 26:
                f11.a aVar18 = (f11.a) obj6;
                p3.m mVar24 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var24 = p3.n.f135158a;
                l72.c1 c1Var2 = l72.c1.f110940a;
                String strQ3 = gl1.y.Q(mVar24, R.string.pregnancy_something_went_wrong);
                String strQ4 = gl1.y.Q(mVar24, R.string.connect_iq_try_again);
                String strQ5 = gl1.y.Q(mVar24, R.string.lbl_ok);
                boolean zR2 = mVar24.r(aVar18);
                Object objQ6 = mVar24.q();
                if (zR2) {
                    objQ6 = new e11.h(aVar18, z14 ? 1 : 0);
                    mVar24.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new e11.h(aVar18, z14 ? 1 : 0);
                        mVar24.K(objQ6);
                    }
                }
                c1Var2.a(true, strQ3, strQ4, null, null, strQ5, false, false, (e23.a) objQ6, null, null, mVar24, 6, 0, 1752);
                return Unit.INSTANCE;
            case 27:
                return e(obj, obj2, obj3);
            case 28:
                return f(obj, obj2, obj3);
            default:
                pt1.o oVar = (pt1.o) obj6;
                p3.m mVar25 = (p3.m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar25.n(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    x1 x1Var25 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar5 = j92.b.f97899b;
                    float f18 = eVar5.f97918c;
                    float f19 = eVar5.f97920e;
                    r.a aVar19 = r.S;
                    r rVarC9 = c2.l.C(u1.n.e(aVar19, d92.b.a(mVar25).c().b(), m1.f128891a), 0.0f, f18, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA5 = y.a(kVar3, h4.d.a.f81536n, mVar25, 0);
                    int iHashCode5 = Long.hashCode(mVar25.getU());
                    i2 i2VarX5 = mVar25.x();
                    r rVarC10 = h4.k.c(rVarC9, mVar25);
                    h5.g.V.getClass();
                    e0.a aVar20 = h5.g.a.f81805b;
                    if (mVar25.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar25.z();
                    if (mVar25.getT()) {
                        mVar25.M(aVar20);
                    } else {
                        mVar25.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA5, mVar25);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar25);
                    h5.g.a.b bVar9 = h5.g.a.f81813j;
                    if (mVar25.getT() || !s.g(mVar25.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar25, iHashCode5, bVar9);
                    }
                    b4.c(h5.g.a.f81807d, rVarC10, mVar25);
                    b0 b0Var6 = b0.f22601a;
                    ub1.l lVarU = g1.u((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null), c80.s0.TRAIL_DETAILS, null, 6);
                    if (lVarU == null) {
                        mVar25.C(1767596726);
                        mVar25.f();
                    } else {
                        mVar25.C(1996681899);
                        g6.f.a aVar21 = g6.f.f75994b;
                        lVarU.a(c2.l.B(aVar19, f19, f19 - f18, f19, f19), mVar25, 0);
                        mVar25.f();
                    }
                    gt1.r.a(aVar19, d92.b.a(mVar25).c().c(), oVar.f140912j.f140931c, false, false, false, true, null, null, mVar25, 1600518, 416);
                    mVar25.y();
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(Object obj, int i14) {
        this.f1788a = i14;
        this.f1789b = obj;
    }
}
