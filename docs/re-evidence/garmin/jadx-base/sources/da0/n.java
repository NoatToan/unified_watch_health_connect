package da0;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.airbnb.lottie.RenderMode;
import com.garmin.android.apps.connectmobile.R;
import com.google.common.base.Ascii;
import g02.b2;
import i3.fe;
import i3.mc;
import i3.mh;
import java.util.List;
import l72.h1;
import l72.i3;
import o4.m1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f58817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f58818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f58819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f58820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f58821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f58822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f58823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f58824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f58825j;

    public /* synthetic */ n(h4.r rVar, i53.c cVar, i53.c cVar2, boolean z14, e23.l lVar, e23.l lVar2, e23.l lVar3, int i14, int i15) {
        this.f58816a = 9;
        this.f58817b = rVar;
        this.f58818c = cVar;
        this.f58823h = cVar2;
        this.f58819d = z14;
        this.f58820e = lVar;
        this.f58824i = lVar2;
        this.f58825j = lVar3;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:102:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:103:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:108:0x041a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0449  */
    /* JADX WARN: Code duplicated, block: B:112:0x044c  */
    /* JADX WARN: Code duplicated, block: B:115:0x045d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0464  */
    /* JADX WARN: Code duplicated, block: B:119:0x0484  */
    /* JADX WARN: Code duplicated, block: B:121:0x0488  */
    /* JADX WARN: Code duplicated, block: B:32:0x0183  */
    /* JADX WARN: Code duplicated, block: B:34:0x018c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0190  */
    /* JADX WARN: Code duplicated, block: B:40:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0204  */
    /* JADX WARN: Code duplicated, block: B:47:0x0277  */
    /* JADX WARN: Code duplicated, block: B:48:0x0279  */
    /* JADX WARN: Code duplicated, block: B:51:0x0286  */
    /* JADX WARN: Code duplicated, block: B:53:0x028d  */
    /* JADX WARN: Code duplicated, block: B:56:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:57:0x02be  */
    /* JADX WARN: Code duplicated, block: B:60:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:71:0x0304  */
    /* JADX WARN: Code duplicated, block: B:74:0x031e  */
    /* JADX WARN: Code duplicated, block: B:76:0x032e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0330  */
    /* JADX WARN: Code duplicated, block: B:80:0x033b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0342  */
    /* JADX WARN: Code duplicated, block: B:84:0x035e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0371  */
    /* JADX WARN: Code duplicated, block: B:88:0x0373  */
    /* JADX WARN: Code duplicated, block: B:91:0x037e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0385  */
    /* JADX WARN: Code duplicated, block: B:96:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:97:0x03c8  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar;
        h5.g.a.f fVar;
        c2.b0 b0Var;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        boolean z14;
        h4.r.a aVar;
        char c14;
        boolean z15;
        boolean zB;
        Object objQ;
        p3.m.a aVar2;
        h4.r.a aVar3;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar2;
        boolean z16;
        boolean zB2;
        Object objQ2;
        boolean z17;
        boolean zB3;
        Object objQ3;
        boolean z18;
        boolean zB4;
        Object objQ4;
        m1.a aVar4;
        h4.r rVarE;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        boolean z19;
        boolean zR;
        Object objQ5;
        boolean z24;
        boolean zB5;
        Object objQ6;
        int i14 = this.f58816a;
        int i15 = this.f58821f;
        Object obj3 = this.f58818c;
        Object obj4 = this.f58825j;
        Object obj5 = this.f58824i;
        Object obj6 = this.f58820e;
        Object obj7 = this.f58823h;
        Object obj8 = this.f58817b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                p.d((String) obj8, this.f58819d, (e23.a) obj7, (i53.c) obj3, (e23.l) obj6, (fe) obj5, (e23.p) obj4, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                f10.m.f((String) obj8, (i53.c) obj3, (i53.c) obj7, (i53.c) obj5, (Long) obj4, this.f58819d, (e23.l) obj6, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                g02.b0 b0Var2 = g02.b0.f74326a;
                ((g02.b0) obj3).b((String) obj8, (s5.c) obj6, (h4.r) obj5, this.f58819d, (e23.p) obj4, (e23.a) obj7, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                gw0.g0.c((pv0.a) obj8, (List) obj3, (Long) obj5, (Long) obj4, this.f58819d, (e23.a) obj7, (e23.l) obj6, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                j02.d0.a((e2.d) obj8, (j02.h0) obj7, this.f58818c, (h4.r) obj6, this.f58819d, (h4.r) obj5, (z3.e) obj4, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                l72.l.d((String) obj8, (String) obj3, (e23.q) obj6, (h4.r) obj5, (b92.a) obj4, this.f58819d, (e23.a) obj7, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                h1.a((String) obj8, (String) obj3, (mc) obj6, this.f58819d, (e23.a) obj7, (e23.a) obj5, (z3.e) obj4, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                gl1.d.b((String) obj8, (e23.a) obj7, this.f58819d, (i53.c) obj3, (i53.c) obj5, (e23.l) obj6, (e23.q) obj4, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                m3.l.b(this.f58819d, (e23.a) obj7, (h4.r) obj8, (m3.r) obj3, (h4.d) obj6, (e23.q) obj5, (z3.e) obj4, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                r82.o.a((h4.r) obj8, (i53.c) obj3, (i53.c) obj7, this.f58819d, (e23.l) obj6, (e23.l) obj5, (e23.l) obj4, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                rr0.u.d((List) obj7, (DateTime) obj3, (DateTime) obj6, this.f58819d, (String) obj8, (o13.p) obj5, (e23.p) obj4, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                si1.q.d((String) obj8, (String) obj3, (String) obj6, (h4.r) obj5, (e23.p) obj4, this.f58819d, (e23.a) obj7, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 12:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar3 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.v) obj7;
                String str = (String) obj8;
                p1 p1Var = (p1) obj3;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.r rVarD = x2.d(aVar6, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar7 = h4.d.a.f81536n;
                    c2.z zVarA2 = c2.y.a(kVar, aVar7, mVar, 0);
                    int iHashCode3 = Long.hashCode(mVar.getU());
                    i2 i2VarX3 = mVar.x();
                    h4.r rVarC3 = h4.k.c(rVarD, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar8);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA2, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT()) {
                        vVar = vVar3;
                    } else {
                        vVar = vVar3;
                        if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar);
                        b0Var = c2.b0.f22601a;
                        h4.r rVarB = a2.b(b0Var.a(x2.f(aVar6, 1.0f), 1.0f, true), a2.a(mVar), true);
                        zVarA = c2.y.a(kVar, aVar7, mVar, 0);
                        iHashCode = Long.hashCode(mVar.getU());
                        i2VarX = mVar.x();
                        rVarC = h4.k.c(rVarB, mVar);
                        if (mVar.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar8);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar, zVarA, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar);
                        }
                        b4.c(fVar, rVarC, mVar);
                        z14 = this.f58819d;
                        if (z14) {
                            mVar.C(-502490874);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            aVar = aVar6;
                            b2.a(c2.l.C(aVar6, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), true, this.f58821f, this.f58822g, gl1.y.Q(mVar, R.string.distance_to_train_for), null, null, null, null, mVar, 48, 480);
                            mVar.f();
                            c14 = Ascii.MIN;
                        } else {
                            aVar = aVar6;
                            mVar.C(-502024975);
                            String strQ = gl1.y.Q(mVar, R.string.what_distance_is_triathlon);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
                            d92.b.f58625c.getClass();
                            j92.e eVar2 = j92.b.f97899b;
                            float f14 = eVar2.f97921f;
                            float f15 = eVar2.f97920e;
                            h4.r rVarB2 = c2.l.B(aVar, f15, f14, f15, f14);
                            c14 = Ascii.MIN;
                            h4.r rVarB3 = b0Var.b(x2.f(rVarB2, 1.0f), h4.d.a.f81537o);
                            d6.h.f57752b.getClass();
                            mh.c(strQ, rVarB3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
                            mVar.f();
                        }
                        if (((m52.i) p1Var.getF182175a()) == m52.i.SPRINT) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zB = mVar.B(p1Var);
                        objQ = mVar.q();
                        aVar2 = p3.m.f135153a;
                        if (zB) {
                            objQ = new tn.h(p1Var, 2);
                            mVar.K(objQ);
                        } else {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new tn.h(p1Var, 2);
                                mVar.K(objQ);
                            }
                        }
                        aVar3 = aVar;
                        vVar2 = vVar;
                        vVar2.C6(R.string.triathlon_event_type_sprint, str, z15, z14, (e23.a) objQ, mVar, 0, 0);
                        if (((m52.i) p1Var.getF182175a()) == m52.i.STANDARD) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zB2 = mVar.B(p1Var);
                        objQ2 = mVar.q();
                        if (zB2) {
                            objQ2 = new tn.h(p1Var, 3);
                            mVar.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new tn.h(p1Var, 3);
                                mVar.K(objQ2);
                            }
                        }
                        vVar2.C6(R.string.triathlon_event_type_standard, str2, z16, z14, (e23.a) objQ2, mVar, 0, 0);
                        if (((m52.i) p1Var.getF182175a()) == m52.i.HALF_IRON) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zB3 = mVar.B(p1Var);
                        objQ3 = mVar.q();
                        if (zB3) {
                            objQ3 = new tn.h(p1Var, 4);
                            mVar.K(objQ3);
                        } else {
                            aVar2.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new tn.h(p1Var, 4);
                                mVar.K(objQ3);
                            }
                        }
                        vVar2.C6(R.string.triathlon_event_type_half, str3, z17, z14, (e23.a) objQ3, mVar, 0, 0);
                        if (z14) {
                            mVar.C(-499587817);
                            mVar.f();
                        } else {
                            mVar.C(-500019306);
                            if (((m52.i) p1Var.getF182175a()) == m52.i.FULL_IRON) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            zB5 = mVar.B(p1Var);
                            objQ6 = mVar.q();
                            if (zB5) {
                                objQ6 = new tn.h(p1Var, 5);
                                mVar.K(objQ6);
                            } else {
                                aVar2.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    objQ6 = new tn.h(p1Var, 5);
                                    mVar.K(objQ6);
                                }
                            }
                            vVar2.C6(R.string.triathlon_event_type_full, str4, z24, false, (e23.a) objQ6, mVar, 0, 8);
                            mVar.f();
                        }
                        if (((m52.i) p1Var.getF182175a()) == m52.i.CUSTOM) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zB4 = mVar.B(p1Var);
                        objQ4 = mVar.q();
                        if (zB4) {
                            objQ4 = new tn.h(p1Var, 6);
                            mVar.K(objQ4);
                        } else {
                            aVar2.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new tn.h(p1Var, 6);
                                mVar.K(objQ4);
                            }
                        }
                        vVar2.C6(R.string.lbl_custom, null, z18, z14, (e23.a) objQ4, mVar, 48, 0);
                        mVar.y();
                        long jA = tn.k.a(d92.b.f58623a, mVar);
                        aVar4 = m1.f128891a;
                        rVarE = u1.n.e(aVar3, jA, aVar4);
                        if (z14) {
                            mVar.C(428325748);
                            rVarE = u1.n.e(rVarE, d92.b.a(mVar).c().f(), aVar4);
                            mVar.f();
                        } else {
                            mVar.C(428534285);
                            mVar.f();
                        }
                        s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar, 0);
                        iHashCode2 = Long.hashCode(mVar.getU());
                        i2VarX2 = mVar.x();
                        rVarC2 = h4.k.c(rVarE, mVar);
                        if (mVar.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar8);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar, s2VarA, mVar);
                        b4.c(c1623g, i2VarX2, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, mVar);
                        u2 u2Var = u2.f22900a;
                        l72.f0 f0Var = l72.f0.f110999a;
                        String string = vVar2.getString(R.string.lbl_next);
                        string.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarF = x2.f(c2.l.y(aVar3, j92.b.f97899b.f97920e), 1.0f);
                        if (((m52.i) p1Var.getF182175a()) != null) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zR = mVar.r(vVar2) | mVar.B(p1Var);
                        objQ5 = mVar.q();
                        if (zR) {
                            objQ5 = new tb0.d(17, vVar2, p1Var);
                            mVar.K(objQ5);
                        } else {
                            aVar2.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new tb0.d(17, vVar2, p1Var);
                                mVar.K(objQ5);
                            }
                        }
                        f0Var.d(0, 1, (e23.a) objQ5, rVarF, string, mVar, null, z19);
                        mVar.y();
                        mVar.y();
                    }
                    v.h.z(iHashCode3, mVar, iHashCode3, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar);
                    b0Var = c2.b0.f22601a;
                    h4.r rVarB4 = a2.b(b0Var.a(x2.f(aVar6, 1.0f), 1.0f, true), a2.a(mVar), true);
                    zVarA = c2.y.a(kVar, aVar7, mVar, 0);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarB4, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar8);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, zVarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    } else {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar);
                    z14 = this.f58819d;
                    if (z14) {
                        mVar.C(-502490874);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        aVar = aVar6;
                        b2.a(c2.l.C(aVar6, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), true, this.f58821f, this.f58822g, gl1.y.Q(mVar, R.string.distance_to_train_for), null, null, null, null, mVar, 48, 480);
                        mVar.f();
                        c14 = Ascii.MIN;
                    } else {
                        aVar = aVar6;
                        mVar.C(-502024975);
                        String strQ2 = gl1.y.Q(mVar, R.string.what_distance_is_triathlon);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar);
                        d92.b.f58625c.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        float f16 = eVar3.f97921f;
                        float f17 = eVar3.f97920e;
                        h4.r rVarB5 = c2.l.B(aVar, f17, f16, f17, f16);
                        c14 = Ascii.MIN;
                        h4.r rVarB6 = b0Var.b(x2.f(rVarB5, 1.0f), h4.d.a.f81537o);
                        d6.h.f57752b.getClass();
                        mh.c(strQ2, rVarB6, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar, 0, 0, 130044);
                        mVar.f();
                    }
                    if (((m52.i) p1Var.getF182175a()) == m52.i.SPRINT) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zB = mVar.B(p1Var);
                    objQ = mVar.q();
                    aVar2 = p3.m.f135153a;
                    if (zB) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new tn.h(p1Var, 2);
                            mVar.K(objQ);
                        }
                    } else {
                        objQ = new tn.h(p1Var, 2);
                        mVar.K(objQ);
                    }
                    aVar3 = aVar;
                    vVar2 = vVar;
                    vVar2.C6(R.string.triathlon_event_type_sprint, str, z15, z14, (e23.a) objQ, mVar, 0, 0);
                    if (((m52.i) p1Var.getF182175a()) == m52.i.STANDARD) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zB2 = mVar.B(p1Var);
                    objQ2 = mVar.q();
                    if (zB2) {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new tn.h(p1Var, 3);
                            mVar.K(objQ2);
                        }
                    } else {
                        objQ2 = new tn.h(p1Var, 3);
                        mVar.K(objQ2);
                    }
                    vVar2.C6(R.string.triathlon_event_type_standard, str2, z16, z14, (e23.a) objQ2, mVar, 0, 0);
                    if (((m52.i) p1Var.getF182175a()) == m52.i.HALF_IRON) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zB3 = mVar.B(p1Var);
                    objQ3 = mVar.q();
                    if (zB3) {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new tn.h(p1Var, 4);
                            mVar.K(objQ3);
                        }
                    } else {
                        objQ3 = new tn.h(p1Var, 4);
                        mVar.K(objQ3);
                    }
                    vVar2.C6(R.string.triathlon_event_type_half, str3, z17, z14, (e23.a) objQ3, mVar, 0, 0);
                    if (z14) {
                        mVar.C(-500019306);
                        if (((m52.i) p1Var.getF182175a()) == m52.i.FULL_IRON) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        zB5 = mVar.B(p1Var);
                        objQ6 = mVar.q();
                        if (zB5) {
                            aVar2.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new tn.h(p1Var, 5);
                                mVar.K(objQ6);
                            }
                        } else {
                            objQ6 = new tn.h(p1Var, 5);
                            mVar.K(objQ6);
                        }
                        vVar2.C6(R.string.triathlon_event_type_full, str4, z24, false, (e23.a) objQ6, mVar, 0, 8);
                        mVar.f();
                    } else {
                        mVar.C(-499587817);
                        mVar.f();
                    }
                    if (((m52.i) p1Var.getF182175a()) == m52.i.CUSTOM) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zB4 = mVar.B(p1Var);
                    objQ4 = mVar.q();
                    if (zB4) {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new tn.h(p1Var, 6);
                            mVar.K(objQ4);
                        }
                    } else {
                        objQ4 = new tn.h(p1Var, 6);
                        mVar.K(objQ4);
                    }
                    vVar2.C6(R.string.lbl_custom, null, z18, z14, (e23.a) objQ4, mVar, 48, 0);
                    mVar.y();
                    long jA2 = tn.k.a(d92.b.f58623a, mVar);
                    aVar4 = m1.f128891a;
                    rVarE = u1.n.e(aVar3, jA2, aVar4);
                    if (z14) {
                        mVar.C(428325748);
                        rVarE = u1.n.e(rVarE, d92.b.a(mVar).c().f(), aVar4);
                        mVar.f();
                    } else {
                        mVar.C(428534285);
                        mVar.f();
                    }
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar, 0);
                    iHashCode2 = Long.hashCode(mVar.getU());
                    i2VarX2 = mVar.x();
                    rVarC2 = h4.k.c(rVarE, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar8);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, s2VarA, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    } else {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar);
                    u2 u2Var2 = u2.f22900a;
                    l72.f0 f0Var2 = l72.f0.f110999a;
                    String string2 = vVar2.getString(R.string.lbl_next);
                    string2.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarF2 = x2.f(c2.l.y(aVar3, j92.b.f97899b.f97920e), 1.0f);
                    if (((m52.i) p1Var.getF182175a()) != null) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zR = mVar.r(vVar2) | mVar.B(p1Var);
                    objQ5 = mVar.q();
                    if (zR) {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new tb0.d(17, vVar2, p1Var);
                            mVar.K(objQ5);
                        }
                    } else {
                        objQ5 = new tb0.d(17, vVar2, p1Var);
                        mVar.K(objQ5);
                    }
                    f0Var2.d(0, 1, (e23.a) objQ5, rVarF2, string2, mVar, null, z19);
                    mVar.y();
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ub0.f.a((String) obj8, (i53.d) obj7, this.f58819d, (RenderMode) obj3, (e23.l) obj6, (e23.l) obj5, (e23.l) obj4, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                og.a.k((String) obj8, (i3) obj3, this.f58819d, (u4.d) obj5, (e23.a) obj7, (e23.l) obj6, (z3.e) obj4, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                x1.d.b((x1.k) obj8, (e23.a) obj7, (e23.l) obj6, (h4.r) obj3, this.f58819d, (e23.a) obj5, (z3.e) obj4, (p3.m) obj, p0.t(i15 | 1), this.f58822g);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(g02.b0 b0Var, String str, s5.c cVar, h4.r rVar, boolean z14, e23.p pVar, e23.a aVar, int i14, int i15) {
        this.f58816a = 2;
        this.f58818c = b0Var;
        this.f58817b = str;
        this.f58820e = cVar;
        this.f58824i = rVar;
        this.f58819d = z14;
        this.f58825j = pVar;
        this.f58823h = aVar;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    public /* synthetic */ n(e2.d dVar, j02.h0 h0Var, Object obj, h4.r rVar, boolean z14, h4.r rVar2, z3.e eVar, int i14, int i15) {
        this.f58816a = 4;
        this.f58817b = dVar;
        this.f58823h = h0Var;
        this.f58818c = obj;
        this.f58820e = rVar;
        this.f58819d = z14;
        this.f58824i = rVar2;
        this.f58825j = eVar;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    public /* synthetic */ n(String str, e23.a aVar, boolean z14, i53.c cVar, i53.c cVar2, e23.l lVar, e23.q qVar, int i14, int i15) {
        this.f58816a = 7;
        this.f58817b = str;
        this.f58823h = aVar;
        this.f58819d = z14;
        this.f58818c = cVar;
        this.f58824i = cVar2;
        this.f58820e = lVar;
        this.f58825j = qVar;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    public /* synthetic */ n(String str, i53.c cVar, i53.c cVar2, i53.c cVar3, Long l14, boolean z14, e23.l lVar, int i14, int i15) {
        this.f58816a = 1;
        this.f58817b = str;
        this.f58818c = cVar;
        this.f58823h = cVar2;
        this.f58824i = cVar3;
        this.f58825j = l14;
        this.f58819d = z14;
        this.f58820e = lVar;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    public /* synthetic */ n(String str, i53.d dVar, boolean z14, RenderMode renderMode, e23.l lVar, e23.l lVar2, e23.l lVar3, int i14, int i15) {
        this.f58816a = 13;
        this.f58817b = str;
        this.f58823h = dVar;
        this.f58819d = z14;
        this.f58818c = renderMode;
        this.f58820e = lVar;
        this.f58824i = lVar2;
        this.f58825j = lVar3;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    public /* synthetic */ n(String str, String str2, mc mcVar, boolean z14, e23.a aVar, e23.a aVar2, z3.e eVar, int i14, int i15) {
        this.f58816a = 6;
        this.f58817b = str;
        this.f58818c = str2;
        this.f58820e = mcVar;
        this.f58819d = z14;
        this.f58823h = aVar;
        this.f58824i = aVar2;
        this.f58825j = eVar;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    public /* synthetic */ n(String str, String str2, Object obj, h4.r rVar, Object obj2, boolean z14, e23.a aVar, int i14, int i15, int i16) {
        this.f58816a = i16;
        this.f58817b = str;
        this.f58818c = str2;
        this.f58820e = obj;
        this.f58824i = rVar;
        this.f58825j = obj2;
        this.f58819d = z14;
        this.f58823h = aVar;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    public /* synthetic */ n(String str, i3 i3Var, boolean z14, u4.d dVar, e23.a aVar, e23.l lVar, z3.e eVar, int i14, int i15) {
        this.f58816a = 14;
        this.f58817b = str;
        this.f58818c = i3Var;
        this.f58819d = z14;
        this.f58824i = dVar;
        this.f58823h = aVar;
        this.f58820e = lVar;
        this.f58825j = eVar;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    public /* synthetic */ n(String str, boolean z14, e23.a aVar, i53.c cVar, e23.l lVar, fe feVar, e23.p pVar, int i14, int i15) {
        this.f58816a = 0;
        this.f58817b = str;
        this.f58819d = z14;
        this.f58823h = aVar;
        this.f58818c = cVar;
        this.f58820e = lVar;
        this.f58824i = feVar;
        this.f58825j = pVar;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    public /* synthetic */ n(List list, DateTime dateTime, DateTime dateTime2, boolean z14, String str, o13.p pVar, e23.p pVar2, int i14, int i15) {
        this.f58816a = 10;
        this.f58823h = list;
        this.f58818c = dateTime;
        this.f58820e = dateTime2;
        this.f58819d = z14;
        this.f58817b = str;
        this.f58824i = pVar;
        this.f58825j = pVar2;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    public /* synthetic */ n(pv0.a aVar, List list, Long l14, Long l15, boolean z14, e23.a aVar2, e23.l lVar, int i14, int i15) {
        this.f58816a = 3;
        this.f58817b = aVar;
        this.f58818c = list;
        this.f58824i = l14;
        this.f58825j = l15;
        this.f58819d = z14;
        this.f58823h = aVar2;
        this.f58820e = lVar;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    public /* synthetic */ n(x1.k kVar, e23.a aVar, e23.l lVar, h4.r rVar, boolean z14, e23.a aVar2, z3.e eVar, int i14, int i15) {
        this.f58816a = 15;
        this.f58817b = kVar;
        this.f58823h = aVar;
        this.f58820e = lVar;
        this.f58818c = rVar;
        this.f58819d = z14;
        this.f58824i = aVar2;
        this.f58825j = eVar;
        this.f58821f = i14;
        this.f58822g = i15;
    }

    public /* synthetic */ n(boolean z14, int i14, int i15, com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar, String str, p1 p1Var, String str2, String str3, String str4) {
        this.f58816a = 12;
        this.f58819d = z14;
        this.f58821f = i14;
        this.f58822g = i15;
        this.f58823h = vVar;
        this.f58817b = str;
        this.f58818c = p1Var;
        this.f58820e = str2;
        this.f58824i = str3;
        this.f58825j = str4;
    }

    public /* synthetic */ n(boolean z14, e23.a aVar, h4.r rVar, m3.r rVar2, h4.d dVar, e23.q qVar, z3.e eVar, int i14, int i15) {
        this.f58816a = 8;
        this.f58819d = z14;
        this.f58823h = aVar;
        this.f58817b = rVar;
        this.f58818c = rVar2;
        this.f58820e = dVar;
        this.f58824i = qVar;
        this.f58825j = eVar;
        this.f58821f = i14;
        this.f58822g = i15;
    }
}
