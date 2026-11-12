package ew1;

import android.content.Context;
import c22.a4;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66722a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f66723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f66724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f66725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f66726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f66727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f66728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f66729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f66730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f66731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f66732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o13.h f66733l;

    public /* synthetic */ s0(dy1.v vVar, i53.c cVar, int i14, int i15, e23.l lVar, boolean z14, boolean z15, Context context, e23.a aVar, p3.p1 p1Var, i53.c cVar2) {
        this.f66729h = vVar;
        this.f66723b = cVar;
        this.f66727f = i14;
        this.f66728g = i15;
        this.f66733l = lVar;
        this.f66724c = z14;
        this.f66725d = z15;
        this.f66730i = context;
        this.f66726e = aVar;
        this.f66731j = p1Var;
        this.f66732k = cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:105:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:107:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:111:0x0440  */
    /* JADX WARN: Code duplicated, block: B:113:0x0445  */
    /* JADX WARN: Code duplicated, block: B:116:0x0457  */
    /* JADX WARN: Code duplicated, block: B:118:0x045e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0482  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x017c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0185  */
    /* JADX WARN: Code duplicated, block: B:37:0x0189  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0202  */
    /* JADX WARN: Code duplicated, block: B:57:0x0274  */
    /* JADX WARN: Code duplicated, block: B:59:0x0280  */
    /* JADX WARN: Code duplicated, block: B:60:0x0283  */
    /* JADX WARN: Code duplicated, block: B:62:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:64:0x02db  */
    /* JADX WARN: Code duplicated, block: B:65:0x0321  */
    /* JADX WARN: Code duplicated, block: B:69:0x033a  */
    /* JADX WARN: Code duplicated, block: B:71:0x034c  */
    /* JADX WARN: Code duplicated, block: B:74:0x035f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0373  */
    /* JADX WARN: Code duplicated, block: B:82:0x0379  */
    /* JADX WARN: Code duplicated, block: B:83:0x037c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0386  */
    /* JADX WARN: Code duplicated, block: B:86:0x038d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0391  */
    /* JADX WARN: Code duplicated, block: B:89:0x039d  */
    /* JADX WARN: Code duplicated, block: B:93:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:97:0x03c1  */
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.p1 p1Var;
        h4.r.a aVar;
        h5.g.a.f fVar;
        j92.e eVar;
        float f14;
        float f15;
        h4.r.a aVar2;
        Context context;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarX;
        h4.r rVarC;
        boolean z14;
        boolean z15;
        mx1.b bVar;
        String strP;
        float f16;
        int i14;
        p3.m mVar;
        boolean z16;
        boolean zB;
        Object objQ;
        mx1.b bVar2;
        Context context2;
        Integer numValueOf;
        String strQ;
        String str;
        boolean z17;
        boolean z18;
        boolean zB2;
        Object objQ2;
        Iterator<E> it;
        Object next;
        dy1.v vVar;
        float f17;
        int i15 = this.f66722a;
        int i16 = this.f66727f;
        Object obj3 = this.f66732k;
        Object obj4 = this.f66731j;
        Object obj5 = this.f66730i;
        o13.h hVar = this.f66733l;
        Object obj6 = this.f66723b;
        Object obj7 = this.f66729h;
        switch (i15) {
            case 0:
                ((Integer) obj2).getClass();
                t0.a aVar3 = t0.f66754g;
                ((t0) obj7).w6((String) obj6, (String) obj5, (vt1.f) obj4, (List) obj3, (e23.l) hVar, this.f66724c, this.f66727f, this.f66728g, this.f66725d, this.f66726e, (p3.m) obj, p3.p0.t(24577));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                l72.p2 p2Var = l72.p2.f111205a;
                ((l72.p2) obj7).g((String) obj6, (h4.r) obj5, (b92.a) obj4, (e23.p) obj3, (e23.p) hVar, this.f66724c, this.f66725d, this.f66726e, (p3.m) obj, p3.p0.t(i16 | 1), this.f66728g);
                return Unit.INSTANCE;
            default:
                dy1.v vVar2 = (dy1.v) obj7;
                i53.c<dy1.q> cVar = (i53.c) obj6;
                e23.l lVar = (e23.l) hVar;
                Context context3 = (Context) obj5;
                p3.p1 p1Var2 = (p3.p1) obj4;
                i53.c cVar2 = (i53.c) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    if (vVar2 == null) {
                        mVar2.C(245663847);
                        mVar2.f();
                    } else {
                        mx1.b bVar3 = vVar2.f61640a;
                        mVar2.C(245663848);
                        Object[] objArr = new Object[0];
                        boolean zB3 = mVar2.B(cVar) | mVar2.r(vVar2);
                        Object objQ3 = mVar2.q();
                        p3.m.a aVar4 = p3.m.f135153a;
                        if (zB3) {
                            objQ3 = new vv0.n(29, cVar, vVar2);
                            mVar2.K(objQ3);
                        } else {
                            aVar4.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new vv0.n(29, cVar, vVar2);
                                mVar2.K(objQ3);
                            }
                        }
                        p3.n1 n1Var = (p3.n1) d4.a.e(objArr, (e23.a) objQ3, mVar2, 0);
                        h4.r.a aVar5 = h4.r.S;
                        h4.r rVarD = c2.x2.d(aVar5, 1.0f);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar6 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        c2.z zVarA2 = c2.y.a(kVar, aVar6, mVar2, 48);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        p3.i2 i2VarX2 = mVar2.x();
                        h4.r rVarC2 = h4.k.c(rVarD, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar7 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar7);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar2 = h5.g.a.f81810g;
                        b4.c(eVar2, zVarA2, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX2, mVar2);
                        h5.g.a.b bVar4 = h5.g.a.f81813j;
                        if (mVar2.getT()) {
                            p1Var = p1Var2;
                            aVar = aVar5;
                        } else {
                            aVar = aVar5;
                            p1Var = p1Var2;
                            if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            }
                            fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC2, mVar2);
                            c2.b0 b0Var = c2.b0.f22601a;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            eVar = j92.b.f97899b;
                            float f18 = eVar.f97920e;
                            f14 = eVar.f97918c;
                            f15 = eVar.f97921f;
                            aVar2 = aVar;
                            context = context3;
                            qx1.n.a(i16, this.f66728g, 0, c2.l.A(c2.l.C(aVar2, 0.0f, f18, 0.0f, f14, 5), eVar.f97920e, 0.0f, 2), mVar2);
                            h4.r rVarB = u1.a2.b(b0Var.a(aVar2, 1.0f, true), u1.a2.a(mVar2), true);
                            zVarA = c2.y.a(kVar, aVar6, mVar2, 48);
                            iHashCode = Long.hashCode(mVar2.getU());
                            i2VarX = mVar2.x();
                            rVarC = h4.k.c(rVarB, mVar2);
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar7);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar2, zVarA, mVar2);
                            b4.c(c1623g, i2VarX, mVar2);
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar4);
                            }
                            b4.c(fVar, rVarC, mVar2);
                            z14 = this.f66724c;
                            z15 = this.f66725d;
                            if (z14 || z15) {
                                bVar = bVar3;
                                mVar2.C(301325632);
                                strP = gl1.y.P(R.string.lbl_stp_schedule_generic, new Object[]{gl1.y.Q(mVar2, bVar.f121368c)}, mVar2);
                                mVar2.f();
                            } else {
                                mVar2.C(301317729);
                                bVar = bVar3;
                                strP = gl1.y.P(R.string.lbl_stp_schedule_your_day, new Object[]{gl1.y.Q(mVar2, bVar.f121368c)}, mVar2);
                                mVar2.f();
                            }
                            String str2 = strP;
                            h4.r rVarA = c2.l.A(aVar2, f15, 0.0f, 2);
                            float f19 = eVar.f97920e;
                            if (!z14 || z15) {
                                f16 = f14;
                            } else {
                                f16 = f15;
                            }
                            h4.r rVarC3 = c2.l.C(rVarA, 0.0f, f19, 0.0f, f16, 5);
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                            d6.h.f57752b.getClass();
                            i14 = d6.h.f57755e;
                            mh.c(str2, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                            mVar = mVar2;
                            if (z15) {
                                mVar.C(752045951);
                                h4.r rVarA2 = c2.l.A(aVar2, f15, 0.0f, 2);
                                if (z14) {
                                    f17 = f14;
                                } else {
                                    f17 = f15;
                                }
                                mh.c(vVar2.d(context), c2.l.C(rVarA2, 0.0f, 0.0f, 0.0f, f17, 7), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar), mVar, 0, 0, 130044);
                                mVar = mVar;
                                mVar.f();
                            } else {
                                mVar.C(752551158);
                                mVar.f();
                            }
                            if (z14) {
                                mVar.C(752651257);
                                h4.r rVarC4 = c2.l.C(c2.l.A(c2.x2.f(aVar2, 1.0f), f15, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97921f, 7);
                                c2.j.c cVar3 = c2.j.f22696f;
                                p3.m mVar3 = mVar;
                                c2.t0.a(rVarC4, cVar3, cVar3, null, 0, 0, z3.f.c(-2146966237, new vd0.s0(vVar2, 11, this.f66726e, p1Var), mVar), mVar3, 1573296, 56);
                                mVar = mVar3;
                                mVar.f();
                            } else {
                                mVar.C(754678006);
                                mVar.f();
                            }
                            mVar.C(301441460);
                            for (dy1.q qVar : cVar) {
                                a4 a4Var = qVar.f61605a;
                                bVar2 = qVar.f61607c;
                                String strQ2 = gl1.y.Q(mVar, a4Var.f23005a);
                                if (z15) {
                                    mVar.C(-39753621);
                                    mVar.f();
                                    it = cVar2.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        vVar = (dy1.v) next;
                                        context2 = context;
                                        if (vVar != null) {
                                            strQ = vVar.d(context2);
                                        } else {
                                            str = null;
                                        }
                                        if (qVar.f61608d || n1Var.getIntValue() == qVar.f61605a.f23006b) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        boolean z19 = qVar.f61608d;
                                        if (bVar2 != null || bVar2 == bVar) {
                                            z18 = false;
                                        } else {
                                            z18 = true;
                                        }
                                        zB2 = mVar.B(n1Var) | mVar.B(qVar);
                                        objQ2 = mVar.q();
                                        if (zB2) {
                                            objQ2 = new rx1.i(qVar, n1Var, 1);
                                            mVar.K(objQ2);
                                        } else {
                                            aVar4.getClass();
                                            if (objQ2 == p3.m.a.f135155b) {
                                                objQ2 = new rx1.i(qVar, n1Var, 1);
                                                mVar.K(objQ2);
                                            }
                                        }
                                        p3.m mVar4 = mVar;
                                        qx1.m.a(strQ2, z17, null, z19, str, false, z18, (e23.l) objQ2, mVar4, 0, 36);
                                        mVar = mVar4;
                                        context = context2;
                                    } while (((dy1.v) next).f61640a != bVar2);
                                    vVar = (dy1.v) next;
                                    context2 = context;
                                    if (vVar != null) {
                                        strQ = vVar.d(context2);
                                    } else {
                                        str = null;
                                    }
                                    if (qVar.f61608d) {
                                        z17 = true;
                                    } else {
                                        z17 = true;
                                    }
                                    boolean z110 = qVar.f61608d;
                                    if (bVar2 != null) {
                                        z18 = false;
                                    } else {
                                        z18 = false;
                                    }
                                    zB2 = mVar.B(n1Var) | mVar.B(qVar);
                                    objQ2 = mVar.q();
                                    if (zB2) {
                                        aVar4.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new rx1.i(qVar, n1Var, 1);
                                            mVar.K(objQ2);
                                        }
                                    } else {
                                        objQ2 = new rx1.i(qVar, n1Var, 1);
                                        mVar.K(objQ2);
                                    }
                                    p3.m mVar5 = mVar;
                                    qx1.m.a(strQ2, z17, null, z110, str, false, z18, (e23.l) objQ2, mVar5, 0, 36);
                                    mVar = mVar5;
                                    context = context2;
                                } else {
                                    context2 = context;
                                    mVar.C(-39623607);
                                    if (bVar2 != null) {
                                        numValueOf = Integer.valueOf(bVar2.f121367b);
                                    } else {
                                        numValueOf = null;
                                    }
                                    if (numValueOf == null) {
                                        mVar.C(-39623608);
                                        mVar.f();
                                        strQ = null;
                                    } else {
                                        mVar.C(-39623607);
                                        strQ = gl1.y.Q(mVar, numValueOf.intValue());
                                        mVar.f();
                                    }
                                    mVar.f();
                                }
                                str = strQ;
                                if (qVar.f61608d) {
                                    z17 = true;
                                } else {
                                    z17 = true;
                                }
                                boolean z111 = qVar.f61608d;
                                if (bVar2 != null) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                zB2 = mVar.B(n1Var) | mVar.B(qVar);
                                objQ2 = mVar.q();
                                if (zB2) {
                                    aVar4.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new rx1.i(qVar, n1Var, 1);
                                        mVar.K(objQ2);
                                    }
                                } else {
                                    objQ2 = new rx1.i(qVar, n1Var, 1);
                                    mVar.K(objQ2);
                                }
                                p3.m mVar6 = mVar;
                                qx1.m.a(strQ2, z17, null, z111, str, false, z18, (e23.l) objQ2, mVar6, 0, 36);
                                mVar = mVar6;
                                context = context2;
                            }
                            mVar.f();
                            mVar.y();
                            l72.f0 f0Var = l72.f0.f110999a;
                            h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar3 = j92.b.f97899b;
                            h4.r rVarC5 = c2.l.C(c2.l.A(rVarF, eVar3.f97920e, 0.0f, 2), 0.0f, eVar3.f97920e, 0.0f, eVar3.f97921f, 5);
                            String strQ3 = gl1.y.Q(mVar, R.string.lbl_next);
                            if (n1Var.getIntValue() != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            zB = mVar.B(lVar) | mVar.B(n1Var);
                            objQ = mVar.q();
                            if (zB) {
                                objQ = new a11.f0(lVar, n1Var, 9);
                                mVar.K(objQ);
                            } else {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new a11.f0(lVar, n1Var, 9);
                                    mVar.K(objQ);
                                }
                            }
                            p3.m mVar7 = mVar;
                            f0Var.d(0, 1, (e23.a) objQ, rVarC5, strQ3, mVar7, null, z16);
                            mVar7.y();
                            Unit unit = Unit.INSTANCE;
                            mVar7.f();
                        }
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar4);
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC2, mVar2);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        eVar = j92.b.f97899b;
                        float f110 = eVar.f97920e;
                        f14 = eVar.f97918c;
                        f15 = eVar.f97921f;
                        aVar2 = aVar;
                        context = context3;
                        qx1.n.a(i16, this.f66728g, 0, c2.l.A(c2.l.C(aVar2, 0.0f, f110, 0.0f, f14, 5), eVar.f97920e, 0.0f, 2), mVar2);
                        h4.r rVarB2 = u1.a2.b(b0Var2.a(aVar2, 1.0f, true), u1.a2.a(mVar2), true);
                        zVarA = c2.y.a(kVar, aVar6, mVar2, 48);
                        iHashCode = Long.hashCode(mVar2.getU());
                        i2VarX = mVar2.x();
                        rVarC = h4.k.c(rVarB2, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar7);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, zVarA, mVar2);
                        b4.c(c1623g, i2VarX, mVar2);
                        if (mVar2.getT()) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar4);
                        } else {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar4);
                        }
                        b4.c(fVar, rVarC, mVar2);
                        z14 = this.f66724c;
                        z15 = this.f66725d;
                        if (z14) {
                            bVar = bVar3;
                            mVar2.C(301325632);
                            strP = gl1.y.P(R.string.lbl_stp_schedule_generic, new Object[]{gl1.y.Q(mVar2, bVar.f121368c)}, mVar2);
                            mVar2.f();
                        } else {
                            bVar = bVar3;
                            mVar2.C(301325632);
                            strP = gl1.y.P(R.string.lbl_stp_schedule_generic, new Object[]{gl1.y.Q(mVar2, bVar.f121368c)}, mVar2);
                            mVar2.f();
                        }
                        String str3 = strP;
                        h4.r rVarA3 = c2.l.A(aVar2, f15, 0.0f, 2);
                        float f111 = eVar.f97920e;
                        if (z14) {
                            f16 = f14;
                        } else {
                            f16 = f14;
                        }
                        h4.r rVarC6 = c2.l.C(rVarA3, 0.0f, f111, 0.0f, f16, 5);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                        d6.h.f57752b.getClass();
                        i14 = d6.h.f57755e;
                        mh.c(str3, rVarC6, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0VarB2, mVar2, 0, 0, 130044);
                        mVar = mVar2;
                        if (z15) {
                            mVar.C(752045951);
                            h4.r rVarA4 = c2.l.A(aVar2, f15, 0.0f, 2);
                            if (z14) {
                                f17 = f14;
                            } else {
                                f17 = f15;
                            }
                            mh.c(vVar2.d(context), c2.l.C(rVarA4, 0.0f, 0.0f, 0.0f, f17, 7), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar), mVar, 0, 0, 130044);
                            mVar = mVar;
                            mVar.f();
                        } else {
                            mVar.C(752551158);
                            mVar.f();
                        }
                        if (z14) {
                            mVar.C(752651257);
                            h4.r rVarC7 = c2.l.C(c2.l.A(c2.x2.f(aVar2, 1.0f), f15, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97921f, 7);
                            c2.j.c cVar4 = c2.j.f22696f;
                            p3.m mVar8 = mVar;
                            c2.t0.a(rVarC7, cVar4, cVar4, null, 0, 0, z3.f.c(-2146966237, new vd0.s0(vVar2, 11, this.f66726e, p1Var), mVar), mVar8, 1573296, 56);
                            mVar = mVar8;
                            mVar.f();
                        } else {
                            mVar.C(754678006);
                            mVar.f();
                        }
                        mVar.C(301441460);
                        while (r5.hasNext()) {
                            a4 a4Var2 = qVar.f61605a;
                            bVar2 = qVar.f61607c;
                            String strQ4 = gl1.y.Q(mVar, a4Var2.f23005a);
                            if (z15) {
                                mVar.C(-39753621);
                                mVar.f();
                                it = cVar2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                    } else {
                                        next = null;
                                    }
                                    vVar = (dy1.v) next;
                                    context2 = context;
                                    if (vVar != null) {
                                        strQ = vVar.d(context2);
                                    } else {
                                        str = null;
                                    }
                                    if (qVar.f61608d) {
                                        z17 = true;
                                    } else {
                                        z17 = true;
                                    }
                                    boolean z112 = qVar.f61608d;
                                    if (bVar2 != null) {
                                        z18 = false;
                                    } else {
                                        z18 = false;
                                    }
                                    zB2 = mVar.B(n1Var) | mVar.B(qVar);
                                    objQ2 = mVar.q();
                                    if (zB2) {
                                        aVar4.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new rx1.i(qVar, n1Var, 1);
                                            mVar.K(objQ2);
                                        }
                                    } else {
                                        objQ2 = new rx1.i(qVar, n1Var, 1);
                                        mVar.K(objQ2);
                                    }
                                    p3.m mVar9 = mVar;
                                    qx1.m.a(strQ4, z17, null, z112, str, false, z18, (e23.l) objQ2, mVar9, 0, 36);
                                    mVar = mVar9;
                                    context = context2;
                                } while (((dy1.v) next).f61640a != bVar2);
                                vVar = (dy1.v) next;
                                context2 = context;
                                if (vVar != null) {
                                    strQ = vVar.d(context2);
                                } else {
                                    str = null;
                                }
                                if (qVar.f61608d) {
                                    z17 = true;
                                } else {
                                    z17 = true;
                                }
                                boolean z113 = qVar.f61608d;
                                if (bVar2 != null) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                zB2 = mVar.B(n1Var) | mVar.B(qVar);
                                objQ2 = mVar.q();
                                if (zB2) {
                                    aVar4.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new rx1.i(qVar, n1Var, 1);
                                        mVar.K(objQ2);
                                    }
                                } else {
                                    objQ2 = new rx1.i(qVar, n1Var, 1);
                                    mVar.K(objQ2);
                                }
                                p3.m mVar10 = mVar;
                                qx1.m.a(strQ4, z17, null, z113, str, false, z18, (e23.l) objQ2, mVar10, 0, 36);
                                mVar = mVar10;
                                context = context2;
                            } else {
                                context2 = context;
                                mVar.C(-39623607);
                                if (bVar2 != null) {
                                    numValueOf = Integer.valueOf(bVar2.f121367b);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf == null) {
                                    mVar.C(-39623608);
                                    mVar.f();
                                    strQ = null;
                                } else {
                                    mVar.C(-39623607);
                                    strQ = gl1.y.Q(mVar, numValueOf.intValue());
                                    mVar.f();
                                }
                                mVar.f();
                            }
                            str = strQ;
                            if (qVar.f61608d) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            boolean z114 = qVar.f61608d;
                            if (bVar2 != null) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            zB2 = mVar.B(n1Var) | mVar.B(qVar);
                            objQ2 = mVar.q();
                            if (zB2) {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new rx1.i(qVar, n1Var, 1);
                                    mVar.K(objQ2);
                                }
                            } else {
                                objQ2 = new rx1.i(qVar, n1Var, 1);
                                mVar.K(objQ2);
                            }
                            p3.m mVar11 = mVar;
                            qx1.m.a(strQ4, z17, null, z114, str, false, z18, (e23.l) objQ2, mVar11, 0, 36);
                            mVar = mVar11;
                            context = context2;
                        }
                        mVar.f();
                        mVar.y();
                        l72.f0 f0Var2 = l72.f0.f110999a;
                        h4.r rVarF2 = c2.x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar4 = j92.b.f97899b;
                        h4.r rVarC8 = c2.l.C(c2.l.A(rVarF2, eVar4.f97920e, 0.0f, 2), 0.0f, eVar4.f97920e, 0.0f, eVar4.f97921f, 5);
                        String strQ5 = gl1.y.Q(mVar, R.string.lbl_next);
                        if (n1Var.getIntValue() != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zB = mVar.B(lVar) | mVar.B(n1Var);
                        objQ = mVar.q();
                        if (zB) {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new a11.f0(lVar, n1Var, 9);
                                mVar.K(objQ);
                            }
                        } else {
                            objQ = new a11.f0(lVar, n1Var, 9);
                            mVar.K(objQ);
                        }
                        p3.m mVar12 = mVar;
                        f0Var2.d(0, 1, (e23.a) objQ, rVarC8, strQ5, mVar12, null, z16);
                        mVar12.y();
                        Unit unit2 = Unit.INSTANCE;
                        mVar12.f();
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ s0(t0 t0Var, String str, String str2, vt1.f fVar, List list, e23.l lVar, boolean z14, int i14, int i15, boolean z15, e23.a aVar, int i16) {
        this.f66729h = t0Var;
        this.f66723b = str;
        this.f66730i = str2;
        this.f66731j = fVar;
        this.f66732k = list;
        this.f66733l = lVar;
        this.f66724c = z14;
        this.f66727f = i14;
        this.f66728g = i15;
        this.f66725d = z15;
        this.f66726e = aVar;
    }

    public /* synthetic */ s0(l72.p2 p2Var, String str, h4.r rVar, b92.a aVar, e23.p pVar, e23.p pVar2, boolean z14, boolean z15, e23.a aVar2, int i14, int i15) {
        this.f66729h = p2Var;
        this.f66723b = str;
        this.f66730i = rVar;
        this.f66731j = aVar;
        this.f66732k = pVar;
        this.f66733l = pVar2;
        this.f66724c = z14;
        this.f66725d = z15;
        this.f66726e = aVar2;
        this.f66727f = i14;
        this.f66728g = i15;
    }
}
