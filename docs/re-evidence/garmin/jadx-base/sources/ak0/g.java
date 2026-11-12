package ak0;

import android.content.Context;
import b21.a5;
import c2.c3;
import c2.k3;
import c2.l1;
import c2.n3;
import c2.p3;
import c2.q3;
import c2.t2;
import c2.x2;
import c22.j0;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e2.i0;
import g02.s0;
import gv0.w0;
import i3.bi;
import i3.fe;
import i3.mc;
import i3.mh;
import i3.o1;
import i3.si;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.m3;
import kotlin.t3;
import l72.r1;
import o4.m1;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.o2;
import r53.p2;
import rk0.d1;
import s70.j1;
import t21.n0;
import w51.m0;
import w51.o0;
import w51.q0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3626i;

    public /* synthetic */ g(q0 q0Var, Context context, z51.h hVar, e23.q qVar, e23.a aVar, e23.a aVar2, p1 p1Var, fe feVar) {
        this.f3618a = 10;
        this.f3620c = q0Var;
        this.f3626i = context;
        this.f3621d = hVar;
        this.f3622e = qVar;
        this.f3623f = aVar;
        this.f3624g = aVar2;
        this.f3619b = p1Var;
        this.f3625h = feVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d1  */
    private final Object a(Object obj, Object obj2, Object obj3) {
        String str;
        s21.n nVar;
        Double d14;
        String strE;
        String str2;
        String strE2;
        m4.q qVar = (m4.q) this.f3620c;
        m3 m3Var = (m3) this.f3621d;
        e23.a aVar = (e23.a) this.f3622e;
        u21.a0 a0Var = (u21.a0) this.f3623f;
        l22.a aVar2 = (l22.a) this.f3624g;
        e23.p pVar = (e23.p) this.f3619b;
        e23.l lVar = (e23.l) this.f3625h;
        v21.e eVar = (v21.e) this.f3626i;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarA = r1.g0.a(c2.l.D(c2.l.p(x2.f(h4.r.S, 1.0f))), null, 3);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarA, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
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
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.f23712xe);
            String strQ = gl1.y.Q(mVar, R.string.lbl_reset);
            boolean zR = mVar.r(qVar) | mVar.B(m3Var) | mVar.B(aVar);
            Object objQ = mVar.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zR) {
                objQ = new n0(qVar, m3Var, aVar, 1);
                mVar.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new n0(qVar, m3Var, aVar, 1);
                    mVar.K(objQ);
                }
            }
            String str3 = null;
            int i14 = 16;
            r1.c(strW, strQ, (e23.a) objQ, false, null, null, mVar, 0, 56);
            p3.m mVar2 = mVar;
            mVar2.C(-904430220);
            for (s21.n nVar2 : a0Var.f167894d) {
                b11.n.a aVar5 = b11.n.f14341e;
                String str4 = nVar2.f156152b;
                Double d15 = nVar2.f156154d;
                String str5 = nVar2.f156153c;
                if (str5 == null) {
                    str5 = "";
                }
                aVar5.getClass();
                String strB = b11.n.a.b(str4, str5, aVar2);
                b11.p.a aVar6 = b11.p.f14358d;
                String str6 = nVar2.f156155e;
                aVar6.getClass();
                String strA = b11.p.a.a(str6, aVar2, false);
                if (d15 != null) {
                    d14 = d15;
                    str = str3;
                    nVar = nVar2;
                    strE = v21.e.e(eVar, Double.valueOf(d15.doubleValue()), null, false, false, 26);
                } else {
                    str = str3;
                    nVar = nVar2;
                    d14 = d15;
                    strE = str;
                }
                String str7 = strE == null ? "" : strE;
                if (d14 != null) {
                    str2 = strA;
                    strE2 = v21.e.e(eVar, Double.valueOf(d14.doubleValue()), strA, true, false, 24);
                } else {
                    str2 = strA;
                    strE2 = str;
                }
                if (strE2 == null) {
                    strE2 = "";
                }
                boolean zB = mVar2.B(pVar) | mVar2.r(nVar);
                Object objQ2 = mVar2.q();
                if (zB) {
                    objQ2 = new sy.i(3, pVar, nVar);
                    mVar2.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new sy.i(3, pVar, nVar);
                        mVar2.K(objQ2);
                    }
                }
                e23.l lVar2 = (e23.l) objQ2;
                boolean zB2 = mVar2.B(lVar) | mVar2.r(nVar);
                Object objQ3 = mVar2.q();
                if (zB2) {
                    objQ3 = new j1(i14, lVar, nVar);
                    mVar2.K(objQ3);
                } else {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new j1(i14, lVar, nVar);
                        mVar2.K(objQ3);
                    }
                }
                p3.m mVar3 = mVar2;
                t21.p0.b(strB, strE2, str7, str2, lVar2, (e23.a) objQ3, null, mVar3, 0);
                str3 = str;
                mVar2 = mVar3;
            }
            mVar2.f();
            mVar2.y();
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:19:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x022e  */
    /* JADX WARN: Code duplicated, block: B:55:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x0325  */
    /* JADX WARN: Code duplicated, block: B:76:0x0376  */
    /* JADX WARN: Code duplicated, block: B:81:0x03ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object b(Object obj, Object obj2, Object obj3) {
        boolean z14;
        Object dVar;
        Context context;
        p1 p1Var;
        fe feVar;
        q0 q0Var = (q0) this.f3620c;
        Context context2 = (Context) this.f3626i;
        z51.h hVar = (z51.h) this.f3621d;
        e23.q qVar = (e23.q) this.f3622e;
        Object obj4 = (e23.a) this.f3623f;
        Object obj5 = (e23.a) this.f3624g;
        p1 p1Var2 = (p1) this.f3619b;
        fe feVar2 = (fe) this.f3625h;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            boolean z15 = ((w51.p0) p1Var2.getF182175a()).f182367x;
            p3.m.a aVar = p3.m.f135153a;
            if (z15) {
                mVar.C(-1988779779);
                l72.s sVar = l72.s.f111232a;
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(aVar2, j92.b.f97899b.f97920e);
                l72.s.b bVar = l72.s.b.INFO;
                s62.a.f157643a.getClass();
                u4.d dVarA = v62.a.a(t62.b.f162798a);
                String strQ = gl1.y.Q(mVar, R.string.lbl_no_location_data_available);
                String strQ2 = gl1.y.Q(mVar, R.string.msg_set_location_access);
                String strQ3 = gl1.y.Q(mVar, R.string.lbl_go_to_settings);
                boolean zR = mVar.r(q0Var) | mVar.r(context2);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new m0(q0Var, context2, i14);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new m0(q0Var, context2, i14);
                        mVar.K(objQ);
                    }
                }
                e23.a aVar3 = (e23.a) objQ;
                boolean zR2 = mVar.r(q0Var);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new vc0.v(q0Var, 23);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new vc0.v(q0Var, 23);
                        mVar.K(objQ2);
                    }
                }
                sVar.d(rVarY, bVar, dVarA, strQ, strQ2, strQ3, aVar3, (e23.a) objQ2, mVar, 48, 128);
                mVar.f();
            } else {
                mVar.C(-1988000408);
                mVar.f();
            }
            if (((w51.p0) p1Var2.getF182175a()).f182347d != null || ((w51.p0) p1Var2.getF182175a()).f182354k) {
                mVar.C(-1987918692);
                z51.d dVar2 = ((w51.p0) p1Var2.getF182175a()).f182347d;
                boolean z16 = ((w51.p0) p1Var2.getF182175a()).f182354k;
                boolean z17 = ((w51.p0) p1Var2.getF182175a()).f182360q;
                z51.d.Companion companion = z51.d.INSTANCE;
                o0.g(dVar2, z16, z17, mVar, 0);
                mVar.f();
            } else {
                mVar.C(-1987661144);
                mVar.f();
            }
            if (q0Var.f182382m) {
                mVar.C(-1987588945);
                o0.h(((w51.p0) p1Var2.getF182175a()).f182363t, ((w51.p0) p1Var2.getF182175a()).f182361r, hVar.f202512h, hVar.f202513i, ((w51.p0) p1Var2.getF182175a()).f182350g, ((w51.p0) p1Var2.getF182175a()).f182351h, ((w51.p0) p1Var2.getF182175a()).f182362s, ((w51.p0) p1Var2.getF182175a()).f182364u, mVar, gs1.t.f78871l | (z51.c.f202482c << 3));
                mVar.f();
            } else {
                mVar.C(-1986980632);
                mVar.f();
            }
            if (((w51.p0) p1Var2.getF182175a()).f182362s || !((w51.p0) p1Var2.getF182175a()).f182364u) {
                mVar.C(-1986900435);
                h4.r.a aVar4 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.q(aVar4, j92.b.f97899b.f97918c), mVar);
                z14 = false;
                o0.a(((w51.p0) p1Var2.getF182175a()).f182350g, mVar, 0);
                mVar.f();
            } else {
                mVar.C(-1986751480);
                mVar.f();
                z14 = false;
            }
            l72.s sVar2 = l72.s.f111232a;
            boolean z18 = (q0Var.f182382m && ((w51.p0) p1Var2.getF182175a()).f182365v) ? true : z14;
            w51.b.f182219a.getClass();
            sVar2.a(z18, w51.b.f182220b, mVar, 48);
            i53.c<am.x0> cVar = ((w51.p0) p1Var2.getF182175a()).f182346c;
            String str = ((w51.p0) p1Var2.getF182175a()).f182345b;
            boolean zR3 = mVar.r(q0Var);
            Object objQ3 = mVar.q();
            if (zR3) {
                objQ3 = new o0.c(q0Var);
                mVar.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new o0.c(q0Var);
                    mVar.K(objQ3);
                }
            }
            boolean z19 = z14;
            o0.d(cVar, str, qVar, (e23.l) ((k23.g) objQ3), hVar.f202507c, mVar, 0);
            o0.b(((w51.p0) p1Var2.getF182175a()).f182352i, mVar, z19 ? 1 : 0);
            o0.e(((w51.p0) p1Var2.getF182175a()).f182348e, ((w51.p0) p1Var2.getF182175a()).f182349f, mVar, z19 ? 1 : 0);
            h4.r.a aVar5 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.f(x2.h(aVar5, j92.b.f97899b.f97920e), 1.0f), mVar);
            o0.c((w51.p0) p1Var2.getF182175a(), q0Var, mVar, z19 ? 1 : 0);
            o0.f(q0Var, mVar, z19 ? 1 : 0);
            boolean zH = mVar.h(((w51.p0) p1Var2.getF182175a()).f182358o);
            Object objQ4 = mVar.q();
            if (zH) {
                objQ4 = p0.n(Boolean.valueOf(((w51.p0) p1Var2.getF182175a()).f182358o));
                mVar.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = p0.n(Boolean.valueOf(((w51.p0) p1Var2.getF182175a()).f182358o));
                    mVar.K(objQ4);
                }
            }
            p1 p1Var3 = (p1) objQ4;
            boolean zH2 = mVar.h(((w51.p0) p1Var2.getF182175a()).f182356m);
            Object objQ5 = mVar.q();
            if (zH2) {
                objQ5 = p0.n(Boolean.valueOf(((w51.p0) p1Var2.getF182175a()).f182356m));
                mVar.K(objQ5);
            } else {
                aVar.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = p0.n(Boolean.valueOf(((w51.p0) p1Var2.getF182175a()).f182356m));
                    mVar.K(objQ5);
                }
            }
            p1 p1Var4 = (p1) objQ5;
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                mVar.C(-1985171627);
                boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                boolean zB = mVar.B(p1Var4) | mVar.r(q0Var) | mVar.B(obj4) | mVar.B(obj5);
                Object objQ6 = mVar.q();
                if (zB) {
                    Object kVar = new ug2.k(q0Var, obj4, obj5, p1Var4, 9);
                    q0Var = q0Var;
                    mVar.K(kVar);
                    objQ6 = kVar;
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        Object kVar2 = new ug2.k(q0Var, obj4, obj5, p1Var4, 9);
                        q0Var = q0Var;
                        mVar.K(kVar2);
                        objQ6 = kVar2;
                    }
                }
                o0.m(zBooleanValue, (e23.a) objQ6, mVar, z19 ? 1 : 0);
                mVar.f();
            } else {
                mVar.C(-1984784344);
                mVar.f();
            }
            Boolean boolValueOf = Boolean.valueOf(((w51.p0) p1Var2.getF182175a()).f182357n);
            boolean zB2 = mVar.B(p1Var2) | mVar.r(context2) | mVar.r(q0Var);
            Object objQ7 = mVar.q();
            if (zB2) {
                context = context2;
                p1Var = p1Var2;
                feVar = feVar2;
                dVar = new o0.d(feVar, context, q0Var, p1Var, null);
                mVar.K(dVar);
            } else {
                aVar.getClass();
                if (objQ7 == p3.m.a.f135155b) {
                    context = context2;
                    p1Var = p1Var2;
                    feVar = feVar2;
                    dVar = new o0.d(feVar, context, q0Var, p1Var, null);
                    mVar.K(dVar);
                } else {
                    context = context2;
                    dVar = objQ7;
                    p1Var = p1Var2;
                    feVar = feVar2;
                }
            }
            l0.e((e23.p) dVar, boolValueOf, mVar);
            Boolean boolValueOf2 = Boolean.valueOf(((w51.p0) p1Var.getF182175a()).f182359p);
            boolean zB3 = mVar.B(p1Var) | mVar.r(context) | mVar.r(q0Var);
            Object objQ8 = mVar.q();
            if (zB3) {
                objQ8 = new o0.e(feVar, context, q0Var, p1Var, null);
                mVar.K(objQ8);
            } else {
                aVar.getClass();
                if (objQ8 == p3.m.a.f135155b) {
                    objQ8 = new o0.e(feVar, context, q0Var, p1Var, null);
                    mVar.K(objQ8);
                }
            }
            l0.e((e23.p) objQ8, boolValueOf2, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x018e  */
    /* JADX WARN: Code duplicated, block: B:44:0x01af  */
    /* JADX WARN: Code duplicated, block: B:71:0x0232  */
    /* JADX WARN: Code duplicated, block: B:73:0x023e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0241  */
    /* JADX WARN: Code duplicated, block: B:83:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:89:0x030a  */
    /* JADX WARN: Code duplicated, block: B:94:0x032c  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj, Object obj2, Object obj3) {
        Object bVar;
        Unit unit;
        final int i14;
        ArrayList arrayList;
        j70.r rVar;
        List listN0;
        final r70.z zVar = (r70.z) this.f3620c;
        p1 p1Var = (p1) this.f3621d;
        e23.a aVar = (e23.a) this.f3622e;
        e23.a aVar2 = (e23.a) this.f3623f;
        p1 p1Var2 = (p1) this.f3624g;
        final e23.a aVar3 = (e23.a) this.f3619b;
        x3 x3Var = (x3) this.f3625h;
        p1 p1Var3 = (p1) this.f3626i;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        int i15 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarB = s9.c.b((o2) zVar.f151134r.getValue(), g3.a.c(g3.f35298f), mVar, g3.f35299g << 3);
            p2 p2Var = zVar.f151131o;
            Boolean bool = Boolean.FALSE;
            p1 p1VarB2 = s9.c.b(p2Var, bool, mVar, 48);
            p1 p1VarB3 = s9.c.b(zVar.f151133q, bool, mVar, 48);
            Unit unit2 = Unit.INSTANCE;
            boolean zR = mVar.r(zVar) | mVar.B(p1Var) | mVar.B(aVar) | mVar.B(aVar2);
            Object objQ = mVar.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zR) {
                unit = unit2;
                bVar = new x70.d.b(zVar, aVar, aVar2, p1Var2, p1Var, null);
                mVar.K(bVar);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    unit = unit2;
                    bVar = new x70.d.b(zVar, aVar, aVar2, p1Var2, p1Var, null);
                    mVar.K(bVar);
                } else {
                    unit = unit2;
                    bVar = objQ;
                }
            }
            l0.e((e23.p) bVar, unit, mVar);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97920e, 1);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarA, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            Object obj4 = null;
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
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            int i16 = x70.d.C3522d.f189403a[((g3) p1VarB.getF182175a()).f35300a.ordinal()];
            if (i16 == 1) {
                i14 = 1;
                mVar.C(-1804091475);
                o70.d0 d0Var = (o70.d0) ((g3) p1VarB.getF182175a()).f35301b;
                ArrayList arrayListD = d0Var != null ? j70.z.d(d0Var.f129950b) : null;
                if (arrayListD == null || (listN0 = h0.N0(arrayListD, new x70.d.c())) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj5 : listN0) {
                        if (((j70.r) obj5).f97640e) {
                            arrayList.add(obj5);
                        }
                    }
                }
                if (arrayListD != null) {
                    for (Object obj6 : arrayListD) {
                        if (((j70.r) obj6) == j70.r.f97628k) {
                            obj4 = obj6;
                            break;
                        }
                    }
                    rVar = (j70.r) obj4;
                    if (rVar == null) {
                        if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                            rVar = j70.r.f97633p;
                        } else {
                            rVar = j70.r.f97627j;
                        }
                    }
                } else if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                    rVar = j70.r.f97633p;
                } else {
                    rVar = j70.r.f97627j;
                }
                j70.r rVar2 = rVar;
                int i17 = ((u70.a) p1Var3.getF182175a()) == null ? R.string.choose_a_focus_description : R.string.msg_preset_options_reset;
                h4.r.a aVar6 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97899b.f97920e;
                h4.r rVarC2 = c2.l.C(aVar6, f14, 0.0f, f14, f14, 2);
                String strQ = gl1.y.Q(mVar, i17);
                d92.b.f58624b.getClass();
                mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131068);
                j70.r rVar3 = (j70.r) p1Var.getF182175a();
                u70.a aVar7 = (u70.a) p1Var3.getF182175a();
                boolean zB = mVar.B(p1Var);
                Object objQ2 = mVar.q();
                if (zB) {
                    objQ2 = new vd0.d(p1Var, 25);
                    mVar.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new vd0.d(p1Var, 25);
                        mVar.K(objQ2);
                    }
                }
                x70.d.b(b0Var, aVar7, arrayList, rVar3, rVar2, (e23.l) objQ2, mVar, 6);
                mVar = mVar;
                mVar.f();
                Unit unit3 = Unit.INSTANCE;
            } else if (i16 == 2) {
                mVar.C(-1802183642);
                boolean zBooleanValue = ((Boolean) p1VarB3.getF182175a()).booleanValue();
                String strQ2 = gl1.y.Q(mVar, R.string.request_error_message);
                boolean zR2 = mVar.r(zVar);
                Object objQ3 = mVar.q();
                if (zR2) {
                    objQ3 = new r70.y(zVar, i15);
                    mVar.K(objQ3);
                } else {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new r70.y(zVar, i15);
                        mVar.K(objQ3);
                    }
                }
                e23.a aVar8 = (e23.a) objQ3;
                boolean zR3 = mVar.r(zVar) | mVar.B(aVar3);
                Object objQ4 = mVar.q();
                if (zR3) {
                    final int i18 = 0;
                    objQ4 = new e23.a() { // from class: x70.b
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    zVar.y4(false);
                                    aVar3.invoke();
                                    break;
                                default:
                                    zVar.f151130n.k(null, Boolean.FALSE);
                                    aVar3.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ4);
                } else {
                    aVar4.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        final int i19 = 0;
                        objQ4 = new e23.a() { // from class: x70.b
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        zVar.y4(false);
                                        aVar3.invoke();
                                        break;
                                    default:
                                        zVar.f151130n.k(null, Boolean.FALSE);
                                        aVar3.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ4);
                    }
                }
                e23.a aVar9 = (e23.a) objQ4;
                i14 = 1;
                w3.x.a(0, aVar8, aVar9, strQ2, mVar, zBooleanValue);
                mVar.f();
            } else {
                if (i16 != 3) {
                    throw n23.j.m(mVar, 218896838);
                }
                mVar.C(-1801487537);
                mVar.f();
                i14 = 1;
            }
            boolean zBooleanValue2 = ((Boolean) p1VarB2.getF182175a()).booleanValue();
            String strQ3 = gl1.y.Q(mVar, R.string.request_save_focus_error_message);
            boolean zR4 = mVar.r(zVar) | mVar.B(p1Var);
            Object objQ5 = mVar.q();
            if (zR4) {
                objQ5 = new wz1.c(7, zVar, p1Var);
                mVar.K(objQ5);
            } else {
                aVar4.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new wz1.c(7, zVar, p1Var);
                    mVar.K(objQ5);
                }
            }
            e23.a aVar10 = (e23.a) objQ5;
            boolean zR5 = mVar.r(zVar) | mVar.B(aVar3);
            Object objQ6 = mVar.q();
            if (zR5) {
                objQ6 = new e23.a() { // from class: x70.b
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                zVar.y4(false);
                                aVar3.invoke();
                                break;
                            default:
                                zVar.f151130n.k(null, Boolean.FALSE);
                                aVar3.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ6);
            } else {
                aVar4.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new e23.a() { // from class: x70.b
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    zVar.y4(false);
                                    aVar3.invoke();
                                    break;
                                default:
                                    zVar.f151130n.k(null, Boolean.FALSE);
                                    aVar3.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ6);
                }
            }
            w3.x.a(0, aVar10, (e23.a) objQ6, strQ3, mVar, zBooleanValue2);
            mVar.y();
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f3620c;
        String str2 = (String) this.f3621d;
        String str3 = (String) this.f3622e;
        String str4 = (String) this.f3623f;
        String str5 = (String) this.f3624g;
        String str6 = (String) this.f3619b;
        String str7 = (String) this.f3625h;
        String str8 = (String) this.f3626i;
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
            b92.a aVarA = wz1.a.a(str);
            int i14 = iIntValue & 14;
            int i15 = b92.a.f16960b;
            int i16 = i14 | (l72.x0.f111348c << 24);
            x0Var.a(i16, 52, aVarA, t2Var, null, null, str2, str3, str4, null, mVar);
            x0Var.a(i16, 52, wz1.a.a(str5), t2Var, null, null, str6, str7, str8, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0369  */
    /* JADX WARN: Code duplicated, block: B:106:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:113:0x043c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0578  */
    /* JADX WARN: Code duplicated, block: B:165:0x0764  */
    /* JADX WARN: Code duplicated, block: B:295:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:311:0x0c76  */
    /* JADX WARN: Code duplicated, block: B:316:0x0c94  */
    /* JADX WARN: Code duplicated, block: B:321:0x0cc1  */
    /* JADX WARN: Code duplicated, block: B:350:0x0d6e  */
    /* JADX WARN: Code duplicated, block: B:355:0x0d8c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0202  */
    /* JADX WARN: Code duplicated, block: B:96:0x032e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [dj0.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v2, types: [h82.r] */
    /* JADX WARN: Type inference failed for: r1v9, types: [h82.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [h82.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [h82.r] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r3v21, types: [p3.m] */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        gv0.d dVar;
        String strA;
        ?? r14;
        Object obj4;
        ?? r15;
        int i14;
        int i15;
        int i16;
        int i17;
        Object obj5;
        Object obj6;
        t2 t2Var;
        p3.m mVar;
        int i18 = this.f3618a;
        p3.m.a aVar = p3.m.f135153a;
        Object obj7 = this.f3626i;
        Object obj8 = this.f3625h;
        Object obj9 = this.f3619b;
        Object obj10 = this.f3624g;
        Object obj11 = this.f3623f;
        Object obj12 = this.f3622e;
        Object obj13 = this.f3621d;
        Object obj14 = this.f3620c;
        switch (i18) {
            case 0:
                g3 g3Var = (g3) obj14;
                b.u uVar = (b.u) obj13;
                t3 t3Var = (t3) obj12;
                o53.b0 b0Var = (o53.b0) obj11;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj10;
                sc.f fVar = (sc.f) obj9;
                a aVar2 = (a) obj8;
                Context context = (Context) obj7;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i iVar = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.i) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                iVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(iVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    Object obj15 = g3Var.f35301b;
                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c cVar = obj15 instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c ? (com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c) obj15 : null;
                    if (cVar != null) {
                        mVar2.C(33457182);
                        com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.e eVar2 = new com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.e(b0Var, eVar, t3Var, fVar, aVar2, context);
                        String strQ = gl1.y.Q(mVar2, R.string.lbl_garmin_connect_plus);
                        boolean zR = mVar2.r(uVar);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new i(uVar, 4);
                            mVar2.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new i(uVar, 4);
                                mVar2.K(objQ);
                            }
                        }
                        e23.a aVar3 = (e23.a) objQ;
                        boolean zR2 = mVar2.r(t3Var);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new k(t3Var, 0);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new k(t3Var, 0);
                                mVar2.K(objQ2);
                            }
                        }
                        com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.b(strQ, null, false, false, aVar3, (e23.l) objQ2, z3.f.c(-2080879245, new a42.y(eVar, cVar, iVar, eVar2, 3), mVar2), mVar2, 1572912, 12);
                        mVar2.f();
                    } else {
                        mVar2.C(36662117);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                gv0.d dVar2 = (gv0.d) obj14;
                yu0.f fVar2 = (yu0.f) obj13;
                sc.f fVar3 = (sc.f) obj9;
                e23.l lVar = (e23.l) obj12;
                e23.a aVar4 = (e23.a) obj11;
                e23.a aVar5 = (e23.a) obj10;
                e23.a aVar6 = (e23.a) obj8;
                e23.a aVar7 = (e23.a) obj7;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bv0.a.y) obj).getClass();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zR3 = mVar3.r(fVar3);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        objQ3 = new bv0.o(fVar3, 14);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new bv0.o(fVar3, 14);
                            mVar3.K(objQ3);
                        }
                    }
                    e23.a aVar8 = (e23.a) objQ3;
                    boolean zR4 = mVar3.r(fVar3);
                    Object objQ4 = mVar3.q();
                    if (zR4) {
                        objQ4 = new bv0.o(fVar3, 15);
                        mVar3.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new bv0.o(fVar3, 15);
                            mVar3.K(objQ4);
                        }
                    }
                    e23.a aVar9 = (e23.a) objQ4;
                    boolean zR5 = mVar3.r(fVar3) | mVar3.B(aVar6) | mVar3.r(dVar2) | mVar3.B(aVar7);
                    Object objQ5 = mVar3.q();
                    if (zR5) {
                        dVar = dVar2;
                        bv0.c cVar2 = new bv0.c(fVar3, aVar6, dVar, aVar7, 18);
                        mVar3.K(cVar2);
                        objQ5 = cVar2;
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            dVar = dVar2;
                            bv0.c cVar3 = new bv0.c(fVar3, aVar6, dVar, aVar7, 18);
                            mVar3.K(cVar3);
                            objQ5 = cVar3;
                        } else {
                            dVar = dVar2;
                        }
                    }
                    w0.a(dVar, fVar2, aVar8, lVar, aVar9, aVar4, aVar5, (e23.a) objQ5, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                ej0.b bVar = (ej0.b) obj14;
                Double d14 = (Double) obj13;
                Double d15 = (Double) obj12;
                Double d16 = (Double) obj11;
                ?? r16 = (dj0.h) obj10;
                Double d17 = (Double) obj9;
                Context context2 = (Context) obj7;
                Double d18 = (Double) obj8;
                ?? r17 = (h82.r) obj;
                ?? r18 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i19 = dj0.h.f59916g;
                r17.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= r18.B(r17) ? 4 : 2;
                }
                if (r18.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    int i24 = (iIntValue3 << 3) & 112;
                    r17.D(R.string.lbl_your_ftp_estimate, r18, i24);
                    boolean zC = ej0.b.c(d15);
                    l22.b bVar2 = bVar.f64399a;
                    boolean z14 = zC || ej0.b.c(d16);
                    boolean zContains = p13.x.k(0, 2).contains(Integer.valueOf(bVar.b()));
                    yi0.d.a aVar10 = yi0.d.f197344c;
                    int i25 = iIntValue3;
                    yi0.c cVar4 = yi0.c.CYCLING;
                    aVar10.getClass();
                    yi0.d.a.a(cVar4, zContains, null);
                    if (z14) {
                        String strA2 = bVar.a(d14, yi0.b.W_PER_KG);
                        strA2.getClass();
                        String lowerCase = bVar2.getString(yi0.a.UNTRAINED.f197324a).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        strA = bVar2.a(R.string.message_cycling_ftp_description, strA2, lowerCase);
                    } else {
                        String strA3 = bVar.a(d14, yi0.b.W_PER_KG);
                        strA3.getClass();
                        String lowerCase2 = bVar2.getString(yi0.a.UNTRAINED.f197324a).toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        strA = bVar2.a(R.string.lbl_ftp_estimate_dynamic_text, strA3, lowerCase2);
                    }
                    String str = strA;
                    int i26 = (i25 << 6) & 896;
                    r17.m(i26, 2, str, null, r18);
                    ?? r19 = r17;
                    r19.t(R.string.lbl_cycling_ftp_ratings, r18, i24);
                    r16.g(yi0.e.f197348a, r18, 0);
                    if (ej0.b.c(d15)) {
                        r18.C(7412307);
                        r19.j(z3.f.c(-235431224, new c50.f(r19, 25, bVar, d18), r18), r18, i24 | 6);
                        r18.f();
                    } else {
                        r18.C(7653518);
                        r18.f();
                    }
                    if (ej0.b.c(d16)) {
                        r18.C(7737807);
                        boolean zContains2 = p13.x.k(0, 2).contains(Integer.valueOf(bVar.b()));
                        yi0.d dVarA = yi0.d.a.a(yi0.c.ROWING, zContains2, d17);
                        yi0.a aVarA = dVarA != null ? dVarA.a(d16, zContains2) : null;
                        String strA4 = bVar.a(d16, yi0.b.WATTS);
                        strA4.getClass();
                        String lowerCase3 = bVar2.getString(aVarA != null ? aVarA.f197324a : yi0.a.UNTRAINED.f197324a).toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        r19.s(i26, 2, bVar2.a(R.string.message_rowing_ftp_description_2, strA4, lowerCase3), null, r18);
                        if (dVarA == null) {
                            r18.C(8557105);
                            r18.f();
                            r15 = r19;
                        } else {
                            r18.C(8557106);
                            r19.s(i26, 2, gl1.y.Q(r18, R.string.lbl_rowing_ftp_ratings), null, r18);
                            ?? r24 = r19;
                            r16.g(dVarA, r18, 0);
                            r24.q(gl1.y.Q(r18, R.string.message_rowing_value_info_2), r18, i24);
                            r18.f();
                            r15 = r24;
                        }
                        r18.f();
                        r14 = r15;
                    } else {
                        r18.C(8813166);
                        r18.f();
                        r14 = r19;
                    }
                    String strP = gl1.y.P(R.string.lbl_classifications_based_on_data, new Object[]{am.j.m("<link>", gl1.y.Q(r18, R.string.lbl_concept2_inc), "</link>")}, r18);
                    boolean zR6 = r18.r(r16) | r18.r(context2);
                    Object objQ6 = r18.q();
                    if (zR6) {
                        obj4 = objQ6;
                        ca0.j1 j1Var = new ca0.j1(28, (Object) r16, context2);
                        r18.K(j1Var);
                        obj4 = j1Var;
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            obj4 = objQ6;
                            ca0.j1 j1Var2 = new ca0.j1(28, (Object) r16, context2);
                            r18.K(j1Var2);
                            obj4 = j1Var2;
                        }
                    }
                    obj4 = objQ6;
                    r14.w(strP, null, (e23.a) obj4, r18, (i25 << 9) & 7168, 2);
                } else {
                    r18.e();
                }
                return Unit.INSTANCE;
            case 3:
                z80.h hVar = (z80.h) obj14;
                String str2 = (String) obj13;
                b63.v vVar = (b63.v) obj12;
                b63.v vVar2 = (b63.v) obj11;
                e23.l lVar2 = (e23.l) obj10;
                e23.l lVar3 = (e23.l) obj9;
                Context context3 = (Context) obj7;
                p1 p1Var = (p1) obj8;
                c2.a0 a0Var = (c2.a0) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                a0Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(a0Var) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar11 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    c2.l.f(x2.h(aVar11, eVar3.f97920e), mVar4);
                    o1.a(null, k2.i.a(eVar3.f97918c), null, null, z3.f.c(-756878904, new kb0.a(context3, vVar, vVar2, p1Var, 1), mVar4), mVar4, 196608, 29);
                    if (hVar instanceof z80.h.a) {
                        mVar4.C(799571115);
                        c2.l.f(a0Var.a(aVar11, 1.0f, true), mVar4);
                        lb0.g.a(0, c2.l.C(x2.f(aVar11, 1.0f), 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), str2, mVar4);
                        mVar4.f();
                    } else {
                        mVar4.C(799875752);
                        mVar4.f();
                    }
                    mb0.g gVar = (mb0.g) p1Var.getF182175a();
                    mb0.g gVar2 = mb0.g.NONE;
                    if (gVar != gVar2) {
                        mVar4.C(799965125);
                        boolean z15 = ((mb0.g) p1Var.getF182175a()) == mb0.g.BED_TIME;
                        LocalTime localTime = (z15 ? vVar : vVar2).f16219a;
                        if (z15) {
                            i14 = -1636758265;
                            i15 = R.string.sleep_lbl_start_time;
                        } else {
                            i14 = -1636756634;
                            i15 = R.string.sleep_lbl_wake_time;
                        }
                        String strH = sn.a.h(mVar4, i14, i15, mVar4);
                        int hour = localTime.getHour();
                        int minute = localTime.getMinute();
                        j0.f23099a.getClass();
                        si siVarZ = bi.z(hour, minute, j0.D(), mVar4, 0, 0);
                        String strQ2 = gl1.y.Q(mVar4, R.string.lbl_ok);
                        boolean z16 = ((mb0.g) p1Var.getF182175a()) != gVar2;
                        String strQ3 = gl1.y.Q(mVar4, R.string.lbl_cancel);
                        Object objQ7 = mVar4.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ7 == c2565a) {
                            objQ7 = new kb0.k(p1Var, 5);
                            mVar4.K(objQ7);
                        }
                        e23.a aVar12 = (e23.a) objQ7;
                        boolean zH = mVar4.h(z15) | mVar4.B(lVar2) | mVar4.B(lVar3);
                        Object objQ8 = mVar4.q();
                        if (zH || objQ8 == c2565a) {
                            objQ8 = new kb0.b(z15, lVar2, lVar3, p1Var, 2);
                            mVar4.K(objQ8);
                        }
                        g82.e.a(strH, siVarZ, z16, strQ3, aVar12, strQ2, (e23.p) objQ8, mVar4, 24576);
                        mVar4.f();
                    } else {
                        mVar4.C(801198088);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                z80.h hVar2 = (z80.h) obj14;
                e23.l lVar4 = (e23.l) obj13;
                b63.v vVar3 = (b63.v) obj12;
                b63.v vVar4 = (b63.v) obj11;
                e23.l lVar5 = (e23.l) obj10;
                e23.l lVar6 = (e23.l) obj9;
                Context context4 = (Context) obj7;
                p1 p1Var2 = (p1) obj8;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar13 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    c2.l.f(x2.h(aVar13, eVar4.f97920e), mVar5);
                    o1.a(null, k2.i.a(eVar4.f97918c), null, null, z3.f.c(126297878, new kb0.a(context4, vVar3, vVar4, p1Var2, 2), mVar5), mVar5, 196608, 29);
                    if (hVar2 instanceof z80.h.a) {
                        mVar5.C(-730512342);
                        String strQ4 = gl1.y.Q(mVar5, R.string.sleep_notifications_info);
                        d92.b.f58624b.getClass();
                        mh.c(strQ4, c2.l.C(x2.f(aVar13, 1.0f), 0.0f, eVar4.f97922g, 0.0f, eVar4.f97920e, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar5), mVar5, 0, 0, 131068);
                        List listK = p13.x.k(new lb0.f(gl1.y.Q(mVar5, R.string.lbl_yes), "sleep_wake_notifications_btn_yes"), new lb0.f(gl1.y.Q(mVar5, R.string.lbl_no), "sleep_wake_notifications_btn_no"));
                        boolean z17 = ((z80.h.a) hVar2).f203057b;
                        boolean zB = mVar5.B(lVar4);
                        Object objQ9 = mVar5.q();
                        if (zB) {
                            objQ9 = new k11.n(lVar4, 5);
                            mVar5.K(objQ9);
                        } else {
                            aVar.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                objQ9 = new k11.n(lVar4, 5);
                                mVar5.K(objQ9);
                            }
                        }
                        lb0.e.a(listK, z17 ? 1 : 0, (e23.l) objQ9, aVar13, mVar5, 3072);
                        mVar5.f();
                    } else {
                        mVar5.C(-729355298);
                        mVar5.f();
                    }
                    mb0.g gVar3 = (mb0.g) p1Var2.getF182175a();
                    mb0.g gVar4 = mb0.g.NONE;
                    if (gVar3 != gVar4) {
                        mVar5.C(-729265925);
                        boolean z18 = ((mb0.g) p1Var2.getF182175a()) == mb0.g.BED_TIME;
                        LocalTime localTime2 = (z18 ? vVar3 : vVar4).f16219a;
                        if (z18) {
                            i16 = -1824635631;
                            i17 = R.string.sleep_lbl_start_time;
                        } else {
                            i16 = -1824634000;
                            i17 = R.string.sleep_lbl_wake_time;
                        }
                        String strH2 = sn.a.h(mVar5, i16, i17, mVar5);
                        int hour2 = localTime2.getHour();
                        int minute2 = localTime2.getMinute();
                        j0.f23099a.getClass();
                        si siVarZ2 = bi.z(hour2, minute2, j0.D(), mVar5, 0, 0);
                        String strQ5 = gl1.y.Q(mVar5, R.string.lbl_ok);
                        boolean z19 = ((mb0.g) p1Var2.getF182175a()) != gVar4;
                        String strQ6 = gl1.y.Q(mVar5, R.string.lbl_cancel);
                        Object objQ10 = mVar5.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                        if (objQ10 == c2565a2) {
                            objQ10 = new kb0.k(p1Var2, 8);
                            mVar5.K(objQ10);
                        }
                        e23.a aVar14 = (e23.a) objQ10;
                        boolean zH2 = mVar5.h(z18) | mVar5.B(lVar5) | mVar5.B(lVar6);
                        Object objQ11 = mVar5.q();
                        if (zH2 || objQ11 == c2565a2) {
                            objQ11 = new kb0.b(z18, lVar5, lVar6, p1Var2, 3);
                            mVar5.K(objQ11);
                        }
                        g82.e.a(strH2, siVarZ2, z19, strQ6, aVar14, strQ5, (e23.p) objQ11, mVar5, 24576);
                        mVar5.f();
                    } else {
                        mVar5.C(-728032962);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                String str3 = (String) obj14;
                String str4 = (String) obj13;
                String str5 = (String) obj12;
                mo0.a aVar15 = (mo0.a) obj11;
                Integer num = (Integer) obj10;
                String str6 = (String) obj9;
                String str7 = (String) obj8;
                Integer num2 = (Integer) obj7;
                t2 t2Var2 = (t2) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(t2Var2) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    l72.x0 x0Var = l72.x0.f111346a;
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("merge", aVar15.c(num, str4));
                    b92.a aVarB = c0235a.b();
                    int i27 = b92.a.f16960b;
                    int i28 = (iIntValue6 & 14) | (l72.x0.f111348c << 24);
                    x0Var.a(i28, 52, aVarB, t2Var2, null, null, str3, str4, str5, null, mVar6);
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    c0235a2.f16962a.put("merge", aVar15.c(num2, str7));
                    x0Var.a(i28, 52, c0235a2.b(), t2Var2, null, null, str6, str7, str5, null, mVar6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                i0 i0Var = (i0) obj14;
                p1 p1Var3 = (p1) obj13;
                i53.c cVar5 = (i53.c) obj12;
                d1 d1Var = (d1) obj11;
                rk0.w0 w0Var = (rk0.w0) obj10;
                zc.d dVar3 = (zc.d) obj9;
                c.q qVar = (c.q) obj8;
                e23.l lVar7 = (e23.l) obj7;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    int i29 = k3.f22728a;
                    c3 c3VarB = q3.b(mVar7);
                    p3.f22815b.getClass();
                    c2.x1 x1VarD = n3.d(c3VarB, p3.f22826m | p3.f22823j);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l1 l1VarC = n3.c(new c2.a(x1VarD, n3.b(0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7)), mVar7);
                    boolean zB2 = mVar7.B(p1Var3) | mVar7.B(cVar5) | mVar7.r(d1Var) | mVar7.B(i0Var) | mVar7.r(w0Var) | mVar7.r(dVar3) | mVar7.r(qVar) | mVar7.B(lVar7);
                    Object objQ12 = mVar7.q();
                    if (zB2) {
                        a5 a5Var = new a5(dVar3, p1Var3, cVar5, d1Var, i0Var, w0Var, qVar, lVar7, 9);
                        i0Var = i0Var;
                        mVar7.K(a5Var);
                        objQ12 = a5Var;
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            a5 a5Var2 = new a5(dVar3, p1Var3, cVar5, d1Var, i0Var, w0Var, qVar, lVar7, 9);
                            i0Var = i0Var;
                            mVar7.K(a5Var2);
                            objQ12 = a5Var2;
                        }
                    }
                    e2.c.b(rVarD, i0Var, l1VarC, null, null, null, false, null, (e23.l) objQ12, mVar7, 6, 504);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                e23.l lVar8 = (e23.l) obj14;
                p1 p1Var4 = (p1) obj13;
                dy1.v vVar5 = (dy1.v) obj12;
                p1 p1Var5 = (p1) obj11;
                e23.p pVar = (e23.p) obj10;
                p1 p1Var6 = (p1) obj9;
                e23.p pVar2 = (e23.p) obj8;
                e23.l lVar9 = (e23.l) obj7;
                c2.a0 a0Var2 = (c2.a0) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                a0Var2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(a0Var2) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var8 = p3.n.f135158a;
                    String strQ7 = gl1.y.Q(mVar8, ((Boolean) p1Var4.getF182175a()).booleanValue() ? R.string.strength_training_select_exercise : R.string.lbl_stp_workout_steps);
                    boolean zB3 = mVar8.B(lVar8);
                    Object objQ13 = mVar8.q();
                    if (zB3) {
                        obj5 = objQ13;
                        me2.d dVar4 = new me2.d(lVar8, 21);
                        mVar8.K(dVar4);
                        obj5 = dVar4;
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            obj5 = objQ13;
                            me2.d dVar5 = new me2.d(lVar8, 21);
                            mVar8.K(dVar5);
                            obj5 = dVar5;
                        }
                    }
                    obj5 = objQ13;
                    e23.a aVar16 = (e23.a) obj5;
                    boolean zB4 = mVar8.B(p1Var4) | mVar8.r(vVar5) | mVar8.B(p1Var5) | mVar8.B(pVar) | mVar8.B(p1Var6) | mVar8.B(lVar8);
                    Object objQ14 = mVar8.q();
                    if (zB4) {
                        objQ14 = new ck0.j(vVar5, lVar8, p1Var4, p1Var5, pVar, p1Var6, 13);
                        mVar8.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new ck0.j(vVar5, lVar8, p1Var4, p1Var5, pVar, p1Var6, 13);
                            mVar8.K(objQ14);
                        }
                    }
                    rx1.l.a(0, aVar16, (e23.a) objQ14, null, strQ7, null, mVar8, false);
                    h4.r.a aVar17 = h4.r.S;
                    h4.r rVarA = a0Var2.a(x2.f(aVar17, 1.0f), 1.0f, false);
                    boolean zB5 = mVar8.B(p1Var4) | mVar8.r(vVar5) | mVar8.B(p1Var5) | mVar8.B(pVar2) | mVar8.B(p1Var6) | mVar8.B(lVar9);
                    Object objQ15 = mVar8.q();
                    if (zB5) {
                        objQ15 = new aa2.p(vVar5, p1Var4, p1Var5, pVar2, p1Var6, lVar9, 25);
                        mVar8.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new aa2.p(vVar5, p1Var4, p1Var5, pVar2, p1Var6, lVar9, 25);
                            mVar8.K(objQ15);
                        }
                    }
                    e2.c.b(rVarA, null, null, null, null, null, false, null, (e23.l) objQ15, mVar8, 0, 510);
                    if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                        mVar8.C(1176136290);
                        mVar8.f();
                    } else {
                        mVar8.C(1175297337);
                        String strP2 = gl1.y.P(R.string.lbl_estimated_workout_time, new Object[]{vVar5.b(mVar8)}, mVar8);
                        h4.r rVarF = x2.f(aVar17, 1.0f);
                        boolean zB6 = mVar8.B(strP2);
                        Object objQ16 = mVar8.q();
                        if (zB6) {
                            obj6 = objQ16;
                            o60.b bVar3 = new o60.b(strP2, 27);
                            mVar8.K(bVar3);
                            obj6 = bVar3;
                        } else {
                            aVar.getClass();
                            if (objQ16 == p3.m.a.f135155b) {
                                obj6 = objQ16;
                                o60.b bVar4 = new o60.b(strP2, 27);
                                mVar8.K(bVar4);
                                obj6 = bVar4;
                            }
                        }
                        obj6 = objQ16;
                        h4.r rVarE = u1.n.e(p5.v.c((e23.l) obj6, rVarF, false), tn.k.a(d92.b.f58623a, mVar8), m1.f128891a);
                        d92.b.f58625c.getClass();
                        j92.e eVar5 = j92.b.f97899b;
                        h4.r rVarA2 = c2.l.A(c2.l.A(rVarE, eVar5.f97921f, 0.0f, 2), 0.0f, eVar5.f97920e, 1);
                        String strP3 = gl1.y.P(R.string.lbl_est_workout_time, new Object[]{vVar5.b(mVar8)}, mVar8);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar8);
                        d6.h.f57752b.getClass();
                        mh.c(strP3, rVarA2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar8, 0, 0, 130044);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p1 p1Var7 = (p1) obj14;
                ve2.e eVar6 = (ve2.e) obj13;
                String str8 = (String) obj12;
                o53.b0 b0Var2 = (o53.b0) obj11;
                mc mcVar = (mc) obj10;
                e23.q qVar2 = (e23.q) obj9;
                e23.l lVar10 = (e23.l) obj8;
                n1 n1Var = (n1) obj7;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    s0.a(x2.c(x2.f(u1.n.e(h4.r.S, vb.h.e(d92.b.f58623a, mVar9), m1.f128891a), 1.0f), 0.9f), ((Boolean) p1Var7.getF182175a()).booleanValue(), z3.f.c(918668006, new dd1.d((Object) eVar6, (Object) str8, (Object) b0Var2, (Object) mcVar, (Object) qVar2, lVar10, (Object) n1Var, p1Var7, 22), mVar9), mVar9, 384, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                return a(obj, obj2, obj3);
            case 10:
                return b(obj, obj2, obj3);
            case 11:
                String str9 = (String) obj14;
                e23.a<Unit> aVar18 = (e23.a) obj13;
                String str10 = (String) obj12;
                String str11 = (String) obj11;
                e23.q qVar3 = (e23.q) obj10;
                p1 p1Var8 = (p1) obj9;
                n1 n1Var2 = (n1) obj8;
                n1 n1Var3 = (n1) obj7;
                t2 t2Var3 = (t2) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar10.B(t2Var3) ? 4 : 2;
                }
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var10 = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    f0Var.k(str9, null, false, aVar18, mVar10, 0, 6);
                    h4.r rVarA3 = t2Var3.a(h4.r.S, 1.0f, true);
                    d6.h.f57752b.getClass();
                    int i30 = d6.h.f57755e;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    g02.c.a(str10, rVarA3, 0L, d6.h.a(i30), 0, false, 0, d92.c.b(d92.c.e(j92.f.f97931h), mVar10), 0.0d, mVar10, 0, 372);
                    boolean z24 = ((String) p1Var8.getF182175a()).length() > 0;
                    boolean zB7 = mVar10.B(qVar3);
                    Object objQ17 = mVar10.q();
                    if (zB7) {
                        objQ17 = new ug2.k(qVar3, p1Var8, n1Var2, n1Var3, 15);
                        mVar10.K(objQ17);
                    } else {
                        aVar.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            objQ17 = new ug2.k(qVar3, p1Var8, n1Var2, n1Var3, 15);
                            mVar10.K(objQ17);
                        }
                    }
                    f0Var.k(str11, null, z24, (e23.a) objQ17, mVar10, 0, 2);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                return c(obj, obj2, obj3);
            case 13:
                return d(obj, obj2, obj3);
            default:
                String str12 = (String) obj14;
                zs0.d dVar6 = (zs0.d) obj13;
                String str13 = (String) obj12;
                String str14 = (String) obj11;
                String str15 = (String) obj10;
                String str16 = (String) obj9;
                String str17 = (String) obj8;
                String str18 = (String) obj7;
                t2 t2Var4 = (t2) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar11.B(t2Var4) ? 4 : 2;
                }
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    if (str12 == null || str12.equals(dVar6.f206839j)) {
                        t2Var = t2Var4;
                        mVar = mVar11;
                        mVar.C(-339410506);
                        mVar.f();
                    } else {
                        mVar11.C(-339915837);
                        l72.x0 x0Var2 = l72.x0.f111346a;
                        String strQ8 = gl1.y.Q(mVar11, R.string.activity_details_heart_rate);
                        String strQ9 = gl1.y.Q(mVar11, R.string.lbl_bpm);
                        gl.c.f77766a.getClass();
                        l72.x0.a aVar19 = new l72.x0.a(gl.c.a(mVar11).l(), null);
                        b92.a aVarA2 = wz1.a.a(gl1.y.P(R.string.lbl_current_lactate_threshold_bpm, new Object[]{str12}, mVar11));
                        int i34 = b92.a.f16960b;
                        x0Var2.a((iIntValue11 & 14) | (l72.x0.f111348c << 24), 48, aVarA2, t2Var4, null, null, str13, strQ8, strQ9, aVar19, mVar11);
                        t2Var = t2Var4;
                        mVar = mVar11;
                        mVar.f();
                    }
                    if (str14 == null || str14.equals(dVar6.f206841l)) {
                        mVar.C(-338590122);
                        mVar.f();
                    } else {
                        mVar.C(-339294380);
                        l72.x0 x0Var3 = l72.x0.f111346a;
                        String strQ10 = gl1.y.Q(mVar, R.string.lbl_pace);
                        f02.e.f67730a.getClass();
                        l72.x0.c cVar6 = new l72.x0.c(o4.f0.d(4279858898L), null);
                        b92.a aVarA3 = wz1.a.a(gl1.y.P(R.string.lbl_pace_per_unit, new Object[]{str15, str16}, mVar));
                        int i35 = b92.a.f16960b;
                        x0Var3.a((iIntValue11 & 14) | (l72.x0.f111348c << 24), 48, aVarA3, t2Var, null, null, str17, strQ10, str18, cVar6, mVar);
                        mVar.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Context context, Object obj7, int i14) {
        this.f3618a = i14;
        this.f3620c = obj;
        this.f3621d = obj2;
        this.f3622e = obj3;
        this.f3623f = obj4;
        this.f3624g = obj5;
        this.f3619b = obj6;
        this.f3626i = context;
        this.f3625h = obj7;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i14) {
        this.f3618a = i14;
        this.f3620c = obj;
        this.f3621d = obj2;
        this.f3622e = obj3;
        this.f3623f = obj4;
        this.f3624g = obj5;
        this.f3619b = obj6;
        this.f3625h = obj7;
        this.f3626i = obj8;
    }

    public /* synthetic */ g(gv0.d dVar, yu0.f fVar, sc.f fVar2, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4) {
        this.f3618a = 1;
        this.f3620c = dVar;
        this.f3621d = fVar;
        this.f3619b = fVar2;
        this.f3622e = lVar;
        this.f3623f = aVar;
        this.f3624g = aVar2;
        this.f3625h = aVar3;
        this.f3626i = aVar4;
    }
}
