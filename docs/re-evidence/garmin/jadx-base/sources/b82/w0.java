package b82;

import c2.h2;
import c2.k3;
import c2.t2;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.maps.android.compose.clustering.ClusteringKt;
import i3.e5;
import i3.fe;
import i3.mh;
import java.util.Collection;
import java.util.Iterator;
import l72.h3;
import l72.p2;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f16875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f16876j;

    public /* synthetic */ w0(int i14, int i15, dy1.c cVar, e23.a aVar, e23.a aVar2, p3.p1 p1Var, p3.p1 p1Var2, p3.p1 p1Var3, p3.p1 p1Var4) {
        this.f16867a = 9;
        this.f16868b = i14;
        this.f16869c = i15;
        this.f16870d = cVar;
        this.f16875i = aVar;
        this.f16871e = aVar2;
        this.f16872f = p1Var;
        this.f16873g = p1Var2;
        this.f16874h = p1Var3;
        this.f16876j = p1Var4;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x03de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x015d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0166  */
    /* JADX WARN: Code duplicated, block: B:30:0x016a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0187  */
    /* JADX WARN: Code duplicated, block: B:38:0x0196  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:44:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:48:0x02da  */
    /* JADX WARN: Code duplicated, block: B:49:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:52:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:54:0x031c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0324  */
    /* JADX WARN: Code duplicated, block: B:58:0x0333  */
    /* JADX WARN: Code duplicated, block: B:60:0x033b  */
    /* JADX WARN: Code duplicated, block: B:61:0x033e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0342  */
    /* JADX WARN: Code duplicated, block: B:64:0x034e  */
    /* JADX WARN: Code duplicated, block: B:66:0x037d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0385  */
    /* JADX WARN: Code duplicated, block: B:71:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:77:0x0418  */
    /* JADX WARN: Code duplicated, block: B:78:0x041c  */
    /* JADX WARN: Code duplicated, block: B:81:0x042e  */
    /* JADX WARN: Code duplicated, block: B:84:0x046b  */
    /* JADX WARN: Code duplicated, block: B:85:0x046f  */
    /* JADX WARN: Code duplicated, block: B:87:0x048c  */
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
        h4.r.a aVar;
        h5.g.a.f fVar;
        j92.e eVar;
        float f14;
        h4.r.a aVar2;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        i53.c<dy1.d> cVar;
        String strP;
        Iterator<dy1.d> it;
        boolean zHasNext;
        p3.m.a aVar3;
        int i14;
        Object objQ;
        int i15;
        dy1.d next;
        boolean z14;
        dy1.b bVar;
        dy1.b bVar2;
        Double d14;
        String strP2;
        boolean zB;
        Object objQ2;
        Double d15;
        int i16 = this.f16867a;
        int i17 = this.f16869c;
        int i18 = this.f16868b;
        Object obj3 = this.f16870d;
        Object obj4 = this.f16876j;
        Object obj5 = this.f16874h;
        Object obj6 = this.f16875i;
        Object obj7 = this.f16871e;
        Object obj8 = this.f16873g;
        Object obj9 = this.f16872f;
        switch (i16) {
            case 0:
                ((Integer) obj2).getClass();
                y0.c(this.f16870d, (u4.d) obj7, (String) obj9, (String) obj8, (String) obj5, (e23.a) obj6, (e23.p) obj4, (p3.m) obj, p3.p0.t(i18 | 1), this.f16869c);
                return Unit.INSTANCE;
            case 1:
                return ClusteringKt.Clustering$lambda$24((Collection) obj3, (e23.l) obj7, (e23.l) obj9, (e23.l) obj8, (e23.l) obj5, (e23.q) obj6, (e23.q) obj4, this.f16868b, this.f16869c, (p3.m) obj, ((Integer) obj2).intValue());
            case 2:
                ((Integer) obj2).getClass();
                e82.a.c((i53.c) obj3, (e23.q) obj7, (e2.i0) obj9, (h4.r) obj8, (e23.l) obj5, (h2) obj6, (e23.l) obj4, (p3.m) obj, p3.p0.t(i18 | 1), this.f16869c);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                l72.x0 x0Var = l72.x0.f111346a;
                ((l72.x0) obj3).c((t2) obj7, (e23.q) obj8, (String) obj9, (l72.x0.b) obj5, (h4.r) obj6, (b92.a) obj4, (p3.m) obj, p3.p0.t(i18 | 1), this.f16869c);
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                h3.e((u4.d) obj7, (String) obj9, (String) obj8, (b92.a) obj3, (e23.a) obj6, (e23.p) obj4, (k3) obj5, (p3.m) obj, p3.p0.t(i18 | 1), this.f16869c);
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                m92.o.a((h4.r) obj3, (String) obj9, (String) obj8, (String) obj5, (z3.e) obj7, (e23.p) obj4, (e23.p) obj6, (p3.m) obj, p3.p0.t(i18 | 1), this.f16869c);
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                or0.j.a aVar4 = or0.j.f133348g;
                ((or0.j) obj3).h((String) obj9, (String) obj8, (String) obj5, (Integer) obj7, (h4.r) obj6, (h4.d.b) obj4, (p3.m) obj, p3.p0.t(i18 | 1), this.f16869c);
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                t21.j0.a((u21.o) obj3, this.f16868b, (v21.e) obj7, (fe) obj9, (e23.a) obj6, (e23.a) obj8, (e23.p) obj4, (e23.a) obj5, (p3.m) obj, p3.p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                tb0.e.a((tb0.q) obj3, (String) obj9, (o90.a) obj7, (e23.a) obj6, (e23.a) obj8, (e23.l) obj5, (e23.a) obj4, (p3.m) obj, p3.p0.t(i18 | 1), this.f16869c);
                return Unit.INSTANCE;
            case 9:
                dy1.c cVar2 = (dy1.c) obj3;
                e23.a aVar5 = (e23.a) obj6;
                e23.a aVar6 = (e23.a) obj7;
                p3.p1 p1Var = (p3.p1) obj9;
                p3.p1 p1Var2 = (p3.p1) obj8;
                p3.p1 p1Var3 = (p3.p1) obj5;
                p3.p1 p1Var4 = (p3.p1) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    h4.r rVarD = x2.d(aVar7, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarD, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar8);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA2, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar.getT()) {
                        aVar = aVar7;
                    } else {
                        aVar = aVar7;
                        if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC2, mVar);
                        c2.b0 b0Var = c2.b0.f22601a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        eVar = j92.b.f97899b;
                        float f15 = eVar.f97920e;
                        f14 = eVar.f97921f;
                        aVar2 = aVar;
                        qx1.n.a(i18, i17, 0, c2.l.A(c2.l.C(aVar, 0.0f, f15, 0.0f, eVar.f97918c, 5), eVar.f97920e, 0.0f, 2), mVar);
                        h4.r rVarB = u1.a2.b(b0Var.a(aVar2, 1.0f, true), u1.a2.a(mVar), true);
                        zVarA = c2.y.a(kVar, h4.d.a.f81537o, mVar, 48);
                        iHashCode = Long.hashCode(mVar.getU());
                        i2VarX = mVar.x();
                        rVarC = h4.k.c(rVarB, mVar);
                        if (mVar.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar8);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar2, zVarA, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar3);
                        }
                        b4.c(fVar, rVarC, mVar);
                        cVar = cVar2.f61536b;
                        if (cVar.size() == 1) {
                            strP = sn.a.h(mVar, -980625672, R.string.lbl_stp_set_benchmark_header, mVar);
                        } else {
                            mVar.C(-980513359);
                            strP = gl1.y.P(R.string.lbl_stp_set_benchmarks_header, new Object[]{Integer.valueOf(cVar.size())}, mVar);
                            mVar.f();
                        }
                        String str = strP;
                        h4.r rVarC3 = c2.l.C(c2.l.A(x2.f(aVar2, 1.0f), f14, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, eVar.f97918c, 5);
                        d6.h.f57752b.getClass();
                        int i19 = d6.h.f57755e;
                        d6.h hVarA = d6.h.a(i19);
                        d92.b.f58624b.getClass();
                        mh.c(str, rVarC3, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 130044);
                        mh.c(gl1.y.Q(mVar, R.string.lbl_stp_set_benchmarks_header_caption), c2.l.C(c2.l.A(x2.f(aVar2, 1.0f), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar), mVar, 0, 0, 130044);
                        mh.c(gl1.y.Q(mVar, R.string.lbl_learn_more_about_training_with_benchmarks), u1.w.d(c2.l.C(c2.l.A(x2.f(aVar2, 1.0f), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97921f, 7), false, null, null, aVar6, 15), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97933j, ds.e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar, 0, 0, 130044);
                        mVar.C(245516889);
                        it = cVar.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            aVar3 = p3.m.f135153a;
                            if (zHasNext) {
                                next = it.next();
                                z14 = next.f61541b;
                                bVar = next.f61543d;
                                bVar2 = next.f61542c;
                                if (z14) {
                                    mVar.C(-978810250);
                                    if (bVar2 != null) {
                                        d15 = bVar2.f61533f;
                                    } else {
                                        d15 = null;
                                    }
                                    if (d15 == null) {
                                        mVar.C(-978749584);
                                        mVar.f();
                                        strP2 = null;
                                    } else {
                                        mVar.C(-978749583);
                                        double dDoubleValue = d15.doubleValue();
                                        l3.f23124b.getClass();
                                        strP2 = gl1.y.P(R.string.string_space_bullet_string_pattern, new Object[]{e5.g(l3.f23130h.format(dDoubleValue), StringUtils.SPACE, bVar2.f61530c), gl1.y.Q(mVar, R.string.lbl_equipment_barbell)}, mVar);
                                        mVar.f();
                                    }
                                    if (strP2 == null) {
                                        strP2 = sn.a.h(mVar, 245535702, R.string.activities_value_not_set, mVar);
                                    } else {
                                        mVar.C(245520140);
                                        mVar.f();
                                    }
                                    mVar.f();
                                } else {
                                    mVar.C(-978205037);
                                    if (bVar != null) {
                                        d14 = bVar.f61533f;
                                    } else {
                                        d14 = null;
                                    }
                                    if (d14 == null) {
                                        mVar.C(-978143410);
                                        mVar.f();
                                        strP2 = null;
                                    } else {
                                        mVar.C(-978143409);
                                        double dDoubleValue2 = d14.doubleValue();
                                        l3.f23124b.getClass();
                                        strP2 = gl1.y.P(R.string.string_space_bullet_string_pattern, new Object[]{e5.g(l3.f23130h.format(dDoubleValue2), StringUtils.SPACE, bVar.f61530c), gl1.y.Q(mVar, R.string.lbl_equipment_dumbbell)}, mVar);
                                        mVar.f();
                                    }
                                    if (strP2 == null) {
                                        strP2 = sn.a.h(mVar, 245555318, R.string.activities_value_not_set, mVar);
                                    } else {
                                        mVar.C(245539663);
                                        mVar.f();
                                    }
                                    mVar.f();
                                }
                                String str2 = strP2;
                                p2 p2Var = p2.f111205a;
                                String strQ = gl1.y.Q(mVar, next.f61540a.f121351a);
                                zB = mVar.B(next);
                                objQ2 = mVar.q();
                                if (zB) {
                                    objQ2 = new ug2.k(next, p1Var, p1Var2, p1Var3, 16);
                                    mVar.K(objQ2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new ug2.k(next, p1Var, p1Var2, p1Var3, 16);
                                        mVar.K(objQ2);
                                    }
                                }
                                p2Var.h(strQ, str2, null, null, null, false, false, null, null, null, (e23.a) objQ2, mVar, 0, 0, 1020);
                            } else {
                                mVar.f();
                                mVar.y();
                                l72.f0 f0Var = l72.f0.f110999a;
                                h4.r.a aVar9 = h4.r.S;
                                h4.r rVarF = x2.f(aVar9, 1.0f);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                j92.e eVar3 = j92.b.f97899b;
                                h4.r rVarC4 = c2.l.C(c2.l.A(rVarF, eVar3.f97920e, 0.0f, 2), 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                                if (cVar.size() == 1) {
                                    i14 = R.string.lbl_stp_benchmark_not_known;
                                } else {
                                    i14 = R.string.lbl_stp_benchmarks_not_known;
                                }
                                String strQ2 = gl1.y.Q(mVar, i14);
                                objQ = mVar.q();
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new w51.j0(p1Var4, 23);
                                    mVar.K(objQ);
                                }
                                f0Var.k(strQ2, rVarC4, false, (e23.a) objQ, mVar, 3072, 4);
                                h4.r rVarC5 = c2.l.C(c2.l.A(x2.f(aVar9, 1.0f), eVar3.f97920e, 0.0f, 2), 0.0f, eVar3.f97920e, 0.0f, eVar3.f97921f, 5);
                                boolean z15 = cVar2.f61539e;
                                if (cVar.size() == 1) {
                                    i15 = R.string.lbl_confirm_benchmark;
                                } else {
                                    i15 = R.string.lbl_stp_confirm_benchmarks;
                                }
                                f0Var.d(0, 1, aVar5, rVarC5, gl1.y.Q(mVar, i15), mVar, null, z15);
                                mVar.y();
                                p3.x1 x1Var2 = p3.n.f135158a;
                            }
                        }
                    }
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar3);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    eVar = j92.b.f97899b;
                    float f16 = eVar.f97920e;
                    f14 = eVar.f97921f;
                    aVar2 = aVar;
                    qx1.n.a(i18, i17, 0, c2.l.A(c2.l.C(aVar, 0.0f, f16, 0.0f, eVar.f97918c, 5), eVar.f97920e, 0.0f, 2), mVar);
                    h4.r rVarB2 = u1.a2.b(b0Var2.a(aVar2, 1.0f, true), u1.a2.a(mVar), true);
                    zVarA = c2.y.a(kVar, h4.d.a.f81537o, mVar, 48);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarB2, mVar);
                    if (mVar.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar8);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, zVarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar3);
                    } else {
                        v.h.z(iHashCode, mVar, iHashCode, bVar3);
                    }
                    b4.c(fVar, rVarC, mVar);
                    cVar = cVar2.f61536b;
                    if (cVar.size() == 1) {
                        strP = sn.a.h(mVar, -980625672, R.string.lbl_stp_set_benchmark_header, mVar);
                    } else {
                        mVar.C(-980513359);
                        strP = gl1.y.P(R.string.lbl_stp_set_benchmarks_header, new Object[]{Integer.valueOf(cVar.size())}, mVar);
                        mVar.f();
                    }
                    String str3 = strP;
                    h4.r rVarC6 = c2.l.C(c2.l.A(x2.f(aVar2, 1.0f), f14, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, eVar.f97918c, 5);
                    d6.h.f57752b.getClass();
                    int i110 = d6.h.f57755e;
                    d6.h hVarA2 = d6.h.a(i110);
                    d92.b.f58624b.getClass();
                    mh.c(str3, rVarC6, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 130044);
                    mh.c(gl1.y.Q(mVar, R.string.lbl_stp_set_benchmarks_header_caption), c2.l.C(c2.l.A(x2.f(aVar2, 1.0f), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, d6.h.a(i110), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar), mVar, 0, 0, 130044);
                    mh.c(gl1.y.Q(mVar, R.string.lbl_learn_more_about_training_with_benchmarks), u1.w.d(c2.l.C(c2.l.A(x2.f(aVar2, 1.0f), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97921f, 7), false, null, null, aVar6, 15), 0L, null, 0L, null, 0L, d6.h.a(i110), 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97933j, ds.e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar, 0, 0, 130044);
                    mVar.C(245516889);
                    it = cVar.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        aVar3 = p3.m.f135153a;
                        if (zHasNext) {
                            next = it.next();
                            z14 = next.f61541b;
                            bVar = next.f61543d;
                            bVar2 = next.f61542c;
                            if (z14) {
                                mVar.C(-978810250);
                                if (bVar2 != null) {
                                    d15 = bVar2.f61533f;
                                } else {
                                    d15 = null;
                                }
                                if (d15 == null) {
                                    mVar.C(-978749584);
                                    mVar.f();
                                    strP2 = null;
                                } else {
                                    mVar.C(-978749583);
                                    double dDoubleValue3 = d15.doubleValue();
                                    l3.f23124b.getClass();
                                    strP2 = gl1.y.P(R.string.string_space_bullet_string_pattern, new Object[]{e5.g(l3.f23130h.format(dDoubleValue3), StringUtils.SPACE, bVar2.f61530c), gl1.y.Q(mVar, R.string.lbl_equipment_barbell)}, mVar);
                                    mVar.f();
                                }
                                if (strP2 == null) {
                                    strP2 = sn.a.h(mVar, 245535702, R.string.activities_value_not_set, mVar);
                                } else {
                                    mVar.C(245520140);
                                    mVar.f();
                                }
                                mVar.f();
                            } else {
                                mVar.C(-978205037);
                                if (bVar != null) {
                                    d14 = bVar.f61533f;
                                } else {
                                    d14 = null;
                                }
                                if (d14 == null) {
                                    mVar.C(-978143410);
                                    mVar.f();
                                    strP2 = null;
                                } else {
                                    mVar.C(-978143409);
                                    double dDoubleValue4 = d14.doubleValue();
                                    l3.f23124b.getClass();
                                    strP2 = gl1.y.P(R.string.string_space_bullet_string_pattern, new Object[]{e5.g(l3.f23130h.format(dDoubleValue4), StringUtils.SPACE, bVar.f61530c), gl1.y.Q(mVar, R.string.lbl_equipment_dumbbell)}, mVar);
                                    mVar.f();
                                }
                                if (strP2 == null) {
                                    strP2 = sn.a.h(mVar, 245555318, R.string.activities_value_not_set, mVar);
                                } else {
                                    mVar.C(245539663);
                                    mVar.f();
                                }
                                mVar.f();
                            }
                            String str4 = strP2;
                            p2 p2Var2 = p2.f111205a;
                            String strQ3 = gl1.y.Q(mVar, next.f61540a.f121351a);
                            zB = mVar.B(next);
                            objQ2 = mVar.q();
                            if (zB) {
                                aVar3.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new ug2.k(next, p1Var, p1Var2, p1Var3, 16);
                                    mVar.K(objQ2);
                                }
                            } else {
                                objQ2 = new ug2.k(next, p1Var, p1Var2, p1Var3, 16);
                                mVar.K(objQ2);
                            }
                            p2Var2.h(strQ3, str4, null, null, null, false, false, null, null, null, (e23.a) objQ2, mVar, 0, 0, 1020);
                        } else {
                            mVar.f();
                            mVar.y();
                            l72.f0 f0Var2 = l72.f0.f110999a;
                            h4.r.a aVar10 = h4.r.S;
                            h4.r rVarF2 = x2.f(aVar10, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar4 = j92.b.f97899b;
                            h4.r rVarC7 = c2.l.C(c2.l.A(rVarF2, eVar4.f97920e, 0.0f, 2), 0.0f, eVar4.f97920e, 0.0f, 0.0f, 13);
                            if (cVar.size() == 1) {
                                i14 = R.string.lbl_stp_benchmark_not_known;
                            } else {
                                i14 = R.string.lbl_stp_benchmarks_not_known;
                            }
                            String strQ4 = gl1.y.Q(mVar, i14);
                            objQ = mVar.q();
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new w51.j0(p1Var4, 23);
                                mVar.K(objQ);
                            }
                            f0Var2.k(strQ4, rVarC7, false, (e23.a) objQ, mVar, 3072, 4);
                            h4.r rVarC8 = c2.l.C(c2.l.A(x2.f(aVar10, 1.0f), eVar4.f97920e, 0.0f, 2), 0.0f, eVar4.f97920e, 0.0f, eVar4.f97921f, 5);
                            boolean z16 = cVar2.f61539e;
                            if (cVar.size() == 1) {
                                i15 = R.string.lbl_confirm_benchmark;
                            } else {
                                i15 = R.string.lbl_stp_confirm_benchmarks;
                            }
                            f0Var2.d(0, 1, aVar5, rVarC8, gl1.y.Q(mVar, i15), mVar, null, z16);
                            mVar.y();
                            p3.x1 x1Var3 = p3.n.f135158a;
                        }
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                z02.f.d((String) obj9, (String) obj8, (u4.d) obj7, (e23.a) obj6, (i53.c) obj3, (i53.c) obj5, (e23.l) obj4, (p3.m) obj, p3.p0.t(i18 | 1), this.f16869c);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ w0(h4.r rVar, String str, String str2, String str3, z3.e eVar, e23.p pVar, e23.p pVar2, int i14, int i15) {
        this.f16867a = 5;
        this.f16870d = rVar;
        this.f16872f = str;
        this.f16873g = str2;
        this.f16874h = str3;
        this.f16871e = eVar;
        this.f16876j = pVar;
        this.f16875i = pVar2;
        this.f16868b = i14;
        this.f16869c = i15;
    }

    public /* synthetic */ w0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, o13.h hVar, int i14, int i15, int i16) {
        this.f16867a = i16;
        this.f16870d = obj;
        this.f16871e = obj2;
        this.f16872f = obj3;
        this.f16873g = obj4;
        this.f16874h = obj5;
        this.f16875i = obj6;
        this.f16876j = hVar;
        this.f16868b = i14;
        this.f16869c = i15;
    }

    public /* synthetic */ w0(String str, String str2, u4.d dVar, e23.a aVar, i53.c cVar, i53.c cVar2, e23.l lVar, int i14, int i15) {
        this.f16867a = 10;
        this.f16872f = str;
        this.f16873g = str2;
        this.f16871e = dVar;
        this.f16875i = aVar;
        this.f16870d = cVar;
        this.f16874h = cVar2;
        this.f16876j = lVar;
        this.f16868b = i14;
        this.f16869c = i15;
    }

    public /* synthetic */ w0(l72.x0 x0Var, t2 t2Var, e23.q qVar, String str, l72.x0.b bVar, h4.r rVar, b92.a aVar, int i14, int i15) {
        this.f16867a = 3;
        this.f16870d = x0Var;
        this.f16871e = t2Var;
        this.f16873g = qVar;
        this.f16872f = str;
        this.f16874h = bVar;
        this.f16875i = rVar;
        this.f16876j = aVar;
        this.f16868b = i14;
        this.f16869c = i15;
    }

    public /* synthetic */ w0(or0.j jVar, String str, String str2, String str3, Integer num, h4.r rVar, h4.d.b bVar, int i14, int i15) {
        this.f16867a = 6;
        this.f16870d = jVar;
        this.f16872f = str;
        this.f16873g = str2;
        this.f16874h = str3;
        this.f16871e = num;
        this.f16875i = rVar;
        this.f16876j = bVar;
        this.f16868b = i14;
        this.f16869c = i15;
    }

    public /* synthetic */ w0(tb0.q qVar, String str, o90.a aVar, e23.a aVar2, e23.a aVar3, e23.l lVar, e23.a aVar4, int i14, int i15) {
        this.f16867a = 8;
        this.f16870d = qVar;
        this.f16872f = str;
        this.f16871e = aVar;
        this.f16875i = aVar2;
        this.f16873g = aVar3;
        this.f16874h = lVar;
        this.f16876j = aVar4;
        this.f16868b = i14;
        this.f16869c = i15;
    }

    public /* synthetic */ w0(u21.o oVar, int i14, v21.e eVar, fe feVar, e23.a aVar, e23.a aVar2, e23.p pVar, e23.a aVar3, int i15) {
        this.f16867a = 7;
        this.f16870d = oVar;
        this.f16868b = i14;
        this.f16871e = eVar;
        this.f16872f = feVar;
        this.f16875i = aVar;
        this.f16873g = aVar2;
        this.f16876j = pVar;
        this.f16874h = aVar3;
        this.f16869c = i15;
    }

    public /* synthetic */ w0(u4.d dVar, String str, String str2, b92.a aVar, e23.a aVar2, e23.p pVar, k3 k3Var, int i14, int i15) {
        this.f16867a = 4;
        this.f16871e = dVar;
        this.f16872f = str;
        this.f16873g = str2;
        this.f16870d = aVar;
        this.f16875i = aVar2;
        this.f16876j = pVar;
        this.f16874h = k3Var;
        this.f16868b = i14;
        this.f16869c = i15;
    }
}
