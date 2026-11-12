package l21;

import c2.l2;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import e2.f0;
import f72.ea;
import gl1.y;
import h5.e0;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import v62.o7;
import yc.z0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d f109119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m21.e f109120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f109121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f109122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v21.e f109123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f109124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l f109125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.l f109126i;

    public /* synthetic */ j(int i14, e23.a aVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, m21.e eVar, v21.e eVar2, zc.d dVar) {
        this.f109118a = i14;
        this.f109119b = dVar;
        this.f109120c = eVar;
        this.f109121d = aVar;
        this.f109122e = lVar;
        this.f109123f = eVar2;
        this.f109124g = lVar2;
        this.f109125h = lVar3;
        this.f109126i = lVar4;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x0131  */
    /* JADX WARN: Code duplicated, block: B:41:0x01da  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f109118a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l2 l2VarE = c2.l.e(0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    final zc.d dVar = this.f109119b;
                    boolean zR = mVar.r(dVar);
                    final m21.e eVar = this.f109120c;
                    boolean zR2 = zR | mVar.r(eVar);
                    final e23.a aVar2 = this.f109121d;
                    boolean zB = zR2 | mVar.B(aVar2);
                    final e23.l lVar = this.f109122e;
                    boolean zB2 = zB | mVar.B(lVar);
                    final v21.e eVar2 = this.f109123f;
                    boolean zR3 = zB2 | mVar.r(eVar2);
                    final e23.l lVar2 = this.f109124g;
                    boolean zB3 = zR3 | mVar.B(lVar2);
                    final e23.l lVar3 = this.f109125h;
                    boolean zB4 = zB3 | mVar.B(lVar3);
                    final e23.l lVar4 = this.f109126i;
                    boolean zB5 = zB4 | mVar.B(lVar4);
                    Object objQ = mVar.q();
                    if (zB5) {
                        final int i15 = 0;
                        e23.l lVar5 = new e23.l() { // from class: l21.l
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                switch (i15) {
                                    case 0:
                                        f0 f0Var = (f0) obj4;
                                        f0Var.getClass();
                                        zc.d dVar2 = dVar;
                                        boolean z14 = dVar2.d().f196385a instanceof z0.c;
                                        final m21.e eVar3 = eVar;
                                        final e23.a aVar3 = aVar2;
                                        if (z14 && dVar2.c().isEmpty()) {
                                            final int i16 = 0;
                                            f0.b(f0Var, null, new z3.e(-1173699411, true, new e23.q() { // from class: l21.m
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    String strH;
                                                    String strH2;
                                                    String str;
                                                    int i17 = i16;
                                                    e23.a aVar4 = aVar3;
                                                    m21.e eVar4 = eVar3;
                                                    switch (i17) {
                                                        case 0:
                                                            p3.m mVar2 = (p3.m) obj6;
                                                            int iIntValue2 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                x1 x1Var2 = p3.n.f135158a;
                                                                String str2 = eVar4.f116084a;
                                                                m21.b bVar = eVar4.f116088e;
                                                                if (str2.length() > 0) {
                                                                    mVar2.C(-350320041);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar2, R.string.lbl_no_results_found), y.Q(mVar2, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar2, 3072, 16);
                                                                    mVar2.f();
                                                                } else {
                                                                    mVar2.C(-349883685);
                                                                    if (bVar.d()) {
                                                                        mVar2.C(-349718703);
                                                                        mVar2.f();
                                                                        strH = null;
                                                                    } else {
                                                                        strH = sn.a.h(mVar2, -349822863, R.string.create_food, mVar2);
                                                                    }
                                                                    e23.a aVar5 = !bVar.d() ? aVar4 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar2, R.string.lbl_cannot_find_custom_foods), y.Q(mVar2, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar5, null, null, mVar2, 3072, 192);
                                                                    mVar2.f();
                                                                }
                                                            } else {
                                                                mVar2.e();
                                                            }
                                                            break;
                                                        case 1:
                                                            p3.m mVar3 = (p3.m) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                x1 x1Var3 = p3.n.f135158a;
                                                                String str3 = eVar4.f116084a;
                                                                m21.b bVar2 = eVar4.f116088e;
                                                                if (str3.length() > 0) {
                                                                    mVar3.C(890054817);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar3, R.string.lbl_no_results_found), y.Q(mVar3, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar3, 3072, 16);
                                                                    mVar3.f();
                                                                } else {
                                                                    mVar3.C(890490460);
                                                                    if (bVar2.d()) {
                                                                        mVar3.C(890656155);
                                                                        mVar3.f();
                                                                        strH2 = null;
                                                                    } else {
                                                                        strH2 = sn.a.h(mVar3, 890551995, R.string.create_meal, mVar3);
                                                                    }
                                                                    e23.a aVar6 = !bVar2.d() ? aVar4 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar3, R.string.lbl_create_a_meal), y.Q(mVar3, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar6, null, null, mVar3, 3072, 192);
                                                                    mVar3.f();
                                                                }
                                                            } else {
                                                                mVar3.e();
                                                            }
                                                            break;
                                                        default:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                String str4 = eVar4.f116084a;
                                                                m21.b bVar3 = eVar4.f116088e;
                                                                if (str4.length() > 0) {
                                                                    mVar4.C(1742034231);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(1742470308);
                                                                    if (bVar3.d()) {
                                                                        mVar4.C(1742641521);
                                                                        mVar4.f();
                                                                        str = null;
                                                                    } else {
                                                                        mVar4.C(1742531595);
                                                                        x0.f23314a.getClass();
                                                                        String strW = gl1.d.W(x0.Jd);
                                                                        mVar4.f();
                                                                        str = strW;
                                                                    }
                                                                    e23.a aVar7 = !bVar3.d() ? aVar4 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    u4.d dVarA = ea.a(t62.c.f162799a);
                                                                    x0.f23314a.getClass();
                                                                    b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar7, null, null, mVar4, 3072, 192);
                                                                    mVar4.f();
                                                                }
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }), 3);
                                        } else if (!dVar2.c().isEmpty() && !eVar3.f116085b && !eVar3.f116088e.d()) {
                                            final int i17 = 0;
                                            final e23.l lVar6 = lVar;
                                            f0.b(f0Var, null, new z3.e(-500586652, true, new e23.q() { // from class: l21.n
                                                /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    int i18 = i17;
                                                    p3.m.a aVar4 = p3.m.f135153a;
                                                    m21.e eVar4 = eVar3;
                                                    e23.a aVar5 = aVar3;
                                                    switch (i18) {
                                                        case 0:
                                                            p3.m mVar2 = (p3.m) obj6;
                                                            int iIntValue2 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                x1 x1Var2 = p3.n.f135158a;
                                                                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar5 = j92.b.f97899b;
                                                                float f14 = eVar5.f97920e;
                                                                h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar = h4.d.a.f81534l;
                                                                c2.j jVar = c2.j.f22691a;
                                                                float f15 = eVar5.f97920e;
                                                                jVar.getClass();
                                                                s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar2, 48);
                                                                int iHashCode = Long.hashCode(mVar2.getU());
                                                                i2 i2VarX = mVar2.x();
                                                                h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                                                                h5.g.V.getClass();
                                                                e0.a aVar6 = h5.g.a.f81805b;
                                                                if (mVar2.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar2.z();
                                                                if (mVar2.getT()) {
                                                                    mVar2.M(aVar6);
                                                                } else {
                                                                    mVar2.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                                                                u2 u2Var = u2.f22900a;
                                                                l72.f0.a aVar7 = l72.f0.a.f111000a;
                                                                String strQ = y.Q(mVar2, R.string.create_food);
                                                                boolean zB6 = mVar2.B(aVar5);
                                                                Object objQ2 = mVar2.q();
                                                                if (zB6) {
                                                                    objQ2 = new ku1.a(aVar5, 19);
                                                                    mVar2.K(objQ2);
                                                                } else {
                                                                    aVar4.getClass();
                                                                    if (objQ2 == p3.m.a.f135155b) {
                                                                        objQ2 = new ku1.a(aVar5, 19);
                                                                        mVar2.K(objQ2);
                                                                    }
                                                                }
                                                                aVar7.f(strQ, null, false, (e23.a) objQ2, mVar2, 0, 6);
                                                                if (eVar4.b()) {
                                                                    mVar2.C(-1562464720);
                                                                    List<b11.l> list = eVar4.f116100q;
                                                                    b11.l lVar7 = eVar4.f116101r;
                                                                    y01.l.a(null, list, lVar7 != null ? Long.valueOf(lVar7.f14331a) : null, lVar6, mVar2, 0, 1);
                                                                    mVar2.f();
                                                                } else {
                                                                    mVar2.C(-1562139902);
                                                                    mVar2.f();
                                                                }
                                                                mVar2.y();
                                                            } else {
                                                                mVar2.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        case 1:
                                                            p3.m mVar3 = (p3.m) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                x1 x1Var3 = p3.n.f135158a;
                                                                h4.r.a aVar8 = h4.r.S;
                                                                h4.r rVarD2 = x2.d(aVar8, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar6 = j92.b.f97899b;
                                                                h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar6.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar3 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar3, 48);
                                                                int iHashCode2 = Long.hashCode(mVar3.getU());
                                                                i2 i2VarX2 = mVar3.x();
                                                                h4.r rVarC4 = h4.k.c(rVarC3, mVar3);
                                                                h5.g.V.getClass();
                                                                e0.a aVar9 = h5.g.a.f81805b;
                                                                if (mVar3.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar3.z();
                                                                if (mVar3.getT()) {
                                                                    mVar3.M(aVar9);
                                                                } else {
                                                                    mVar3.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA2, mVar3);
                                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                                                                h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                                                                    v.h.z(iHashCode2, mVar3, iHashCode2, bVar4);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC4, mVar3);
                                                                u2 u2Var2 = u2.f22900a;
                                                                l72.f0.a aVar10 = l72.f0.a.f111000a;
                                                                String strQ2 = y.Q(mVar3, R.string.create_meal);
                                                                h4.r rVarC5 = c2.l.C(aVar8, eVar6.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB7 = mVar3.B(aVar5);
                                                                Object objQ3 = mVar3.q();
                                                                if (zB7) {
                                                                    objQ3 = new ku1.a(aVar5, 20);
                                                                    mVar3.K(objQ3);
                                                                } else {
                                                                    aVar4.getClass();
                                                                    if (objQ3 == p3.m.a.f135155b) {
                                                                        objQ3 = new ku1.a(aVar5, 20);
                                                                        mVar3.K(objQ3);
                                                                    }
                                                                }
                                                                aVar10.f(strQ2, rVarC5, false, (e23.a) objQ3, mVar3, 0, 4);
                                                                if (eVar4.b()) {
                                                                    mVar3.C(-321960809);
                                                                    List<b11.l> list2 = eVar4.f116100q;
                                                                    b11.l lVar8 = eVar4.f116101r;
                                                                    y01.l.a(c2.l.C(aVar8, eVar6.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar8 != null ? Long.valueOf(lVar8.f14331a) : null, lVar6, mVar3, 0, 0);
                                                                    mVar3.f();
                                                                } else {
                                                                    mVar3.C(-321572596);
                                                                    mVar3.f();
                                                                }
                                                                mVar3.y();
                                                            } else {
                                                                mVar3.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        default:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                h4.r.a aVar11 = h4.r.S;
                                                                h4.r rVarD3 = x2.d(aVar11, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar7 = j92.b.f97899b;
                                                                h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar7.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar5 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar4, 48);
                                                                int iHashCode3 = Long.hashCode(mVar4.getU());
                                                                i2 i2VarX3 = mVar4.x();
                                                                h4.r rVarC7 = h4.k.c(rVarC6, mVar4);
                                                                h5.g.V.getClass();
                                                                e0.a aVar12 = h5.g.a.f81805b;
                                                                if (mVar4.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar4.z();
                                                                if (mVar4.getT()) {
                                                                    mVar4.M(aVar12);
                                                                } else {
                                                                    mVar4.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA3, mVar4);
                                                                b4.c(h5.g.a.f81809f, i2VarX3, mVar4);
                                                                h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                                                                    v.h.z(iHashCode3, mVar4, iHashCode3, bVar6);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC7, mVar4);
                                                                u2 u2Var3 = u2.f22900a;
                                                                l72.f0.a aVar13 = l72.f0.a.f111000a;
                                                                x0.f23314a.getClass();
                                                                String strW = gl1.d.W(x0.Jd);
                                                                h4.r rVarC8 = c2.l.C(aVar11, eVar7.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB8 = mVar4.B(aVar5);
                                                                Object objQ4 = mVar4.q();
                                                                if (zB8) {
                                                                    objQ4 = new ku1.a(aVar5, 21);
                                                                    mVar4.K(objQ4);
                                                                } else {
                                                                    aVar4.getClass();
                                                                    if (objQ4 == p3.m.a.f135155b) {
                                                                        objQ4 = new ku1.a(aVar5, 21);
                                                                        mVar4.K(objQ4);
                                                                    }
                                                                }
                                                                aVar13.f(strW, rVarC8, false, (e23.a) objQ4, mVar4, 0, 4);
                                                                if (eVar4.b()) {
                                                                    mVar4.C(231180845);
                                                                    List<b11.l> list3 = eVar4.f116100q;
                                                                    b11.l lVar9 = eVar4.f116101r;
                                                                    y01.l.a(c2.l.C(aVar11, eVar7.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar9 != null ? Long.valueOf(lVar9.f14331a) : null, lVar6, mVar4, 0, 0);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(231569058);
                                                                    mVar4.f();
                                                                }
                                                                mVar4.y();
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            }), 3);
                                        }
                                        j21.m.a(f0Var, !eVar3.f116088e.d(), c22.i.b(R.string.delete_custom_food), c22.i.b(R.string.delete_food_this_cannot_be_undone), dVar2, eVar2, lVar2, lVar3, lVar4);
                                        break;
                                    case 1:
                                        f0 f0Var2 = (f0) obj4;
                                        f0Var2.getClass();
                                        zc.d dVar3 = dVar;
                                        boolean z15 = dVar3.d().f196385a instanceof z0.c;
                                        final m21.e eVar4 = eVar;
                                        final e23.a aVar4 = aVar2;
                                        if (z15 && dVar3.c().isEmpty()) {
                                            final int i18 = 1;
                                            f0.b(f0Var2, null, new z3.e(-1225270621, true, new e23.q() { // from class: l21.m
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    String strH;
                                                    String strH2;
                                                    String str;
                                                    int i19 = i18;
                                                    e23.a aVar5 = aVar4;
                                                    m21.e eVar5 = eVar4;
                                                    switch (i19) {
                                                        case 0:
                                                            p3.m mVar2 = (p3.m) obj6;
                                                            int iIntValue2 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                x1 x1Var2 = p3.n.f135158a;
                                                                String str2 = eVar5.f116084a;
                                                                m21.b bVar = eVar5.f116088e;
                                                                if (str2.length() > 0) {
                                                                    mVar2.C(-350320041);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar2, R.string.lbl_no_results_found), y.Q(mVar2, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar2, 3072, 16);
                                                                    mVar2.f();
                                                                } else {
                                                                    mVar2.C(-349883685);
                                                                    if (bVar.d()) {
                                                                        mVar2.C(-349718703);
                                                                        mVar2.f();
                                                                        strH = null;
                                                                    } else {
                                                                        strH = sn.a.h(mVar2, -349822863, R.string.create_food, mVar2);
                                                                    }
                                                                    e23.a aVar6 = !bVar.d() ? aVar5 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar2, R.string.lbl_cannot_find_custom_foods), y.Q(mVar2, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar6, null, null, mVar2, 3072, 192);
                                                                    mVar2.f();
                                                                }
                                                            } else {
                                                                mVar2.e();
                                                            }
                                                            break;
                                                        case 1:
                                                            p3.m mVar3 = (p3.m) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                x1 x1Var3 = p3.n.f135158a;
                                                                String str3 = eVar5.f116084a;
                                                                m21.b bVar2 = eVar5.f116088e;
                                                                if (str3.length() > 0) {
                                                                    mVar3.C(890054817);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar3, R.string.lbl_no_results_found), y.Q(mVar3, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar3, 3072, 16);
                                                                    mVar3.f();
                                                                } else {
                                                                    mVar3.C(890490460);
                                                                    if (bVar2.d()) {
                                                                        mVar3.C(890656155);
                                                                        mVar3.f();
                                                                        strH2 = null;
                                                                    } else {
                                                                        strH2 = sn.a.h(mVar3, 890551995, R.string.create_meal, mVar3);
                                                                    }
                                                                    e23.a aVar7 = !bVar2.d() ? aVar5 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar3, R.string.lbl_create_a_meal), y.Q(mVar3, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar7, null, null, mVar3, 3072, 192);
                                                                    mVar3.f();
                                                                }
                                                            } else {
                                                                mVar3.e();
                                                            }
                                                            break;
                                                        default:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                String str4 = eVar5.f116084a;
                                                                m21.b bVar3 = eVar5.f116088e;
                                                                if (str4.length() > 0) {
                                                                    mVar4.C(1742034231);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(1742470308);
                                                                    if (bVar3.d()) {
                                                                        mVar4.C(1742641521);
                                                                        mVar4.f();
                                                                        str = null;
                                                                    } else {
                                                                        mVar4.C(1742531595);
                                                                        x0.f23314a.getClass();
                                                                        String strW = gl1.d.W(x0.Jd);
                                                                        mVar4.f();
                                                                        str = strW;
                                                                    }
                                                                    e23.a aVar8 = !bVar3.d() ? aVar5 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    u4.d dVarA = ea.a(t62.c.f162799a);
                                                                    x0.f23314a.getClass();
                                                                    b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar8, null, null, mVar4, 3072, 192);
                                                                    mVar4.f();
                                                                }
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }), 3);
                                        } else if (!dVar3.c().isEmpty() && !eVar4.f116085b && !eVar4.f116088e.d()) {
                                            final int i19 = 1;
                                            final e23.l lVar7 = lVar;
                                            f0.b(f0Var2, null, new z3.e(-552157862, true, new e23.q() { // from class: l21.n
                                                /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    int i110 = i19;
                                                    p3.m.a aVar5 = p3.m.f135153a;
                                                    m21.e eVar5 = eVar4;
                                                    e23.a aVar6 = aVar4;
                                                    switch (i110) {
                                                        case 0:
                                                            p3.m mVar2 = (p3.m) obj6;
                                                            int iIntValue2 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                x1 x1Var2 = p3.n.f135158a;
                                                                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar6 = j92.b.f97899b;
                                                                float f14 = eVar6.f97920e;
                                                                h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar = h4.d.a.f81534l;
                                                                c2.j jVar = c2.j.f22691a;
                                                                float f15 = eVar6.f97920e;
                                                                jVar.getClass();
                                                                s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar2, 48);
                                                                int iHashCode = Long.hashCode(mVar2.getU());
                                                                i2 i2VarX = mVar2.x();
                                                                h4.r rVarC2 = h4.k.c(rVarC, mVar2);
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
                                                                b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                                                                u2 u2Var = u2.f22900a;
                                                                l72.f0.a aVar8 = l72.f0.a.f111000a;
                                                                String strQ = y.Q(mVar2, R.string.create_food);
                                                                boolean zB6 = mVar2.B(aVar6);
                                                                Object objQ2 = mVar2.q();
                                                                if (zB6) {
                                                                    objQ2 = new ku1.a(aVar6, 19);
                                                                    mVar2.K(objQ2);
                                                                } else {
                                                                    aVar5.getClass();
                                                                    if (objQ2 == p3.m.a.f135155b) {
                                                                        objQ2 = new ku1.a(aVar6, 19);
                                                                        mVar2.K(objQ2);
                                                                    }
                                                                }
                                                                aVar8.f(strQ, null, false, (e23.a) objQ2, mVar2, 0, 6);
                                                                if (eVar5.b()) {
                                                                    mVar2.C(-1562464720);
                                                                    List<b11.l> list = eVar5.f116100q;
                                                                    b11.l lVar8 = eVar5.f116101r;
                                                                    y01.l.a(null, list, lVar8 != null ? Long.valueOf(lVar8.f14331a) : null, lVar7, mVar2, 0, 1);
                                                                    mVar2.f();
                                                                } else {
                                                                    mVar2.C(-1562139902);
                                                                    mVar2.f();
                                                                }
                                                                mVar2.y();
                                                            } else {
                                                                mVar2.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        case 1:
                                                            p3.m mVar3 = (p3.m) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                x1 x1Var3 = p3.n.f135158a;
                                                                h4.r.a aVar9 = h4.r.S;
                                                                h4.r rVarD2 = x2.d(aVar9, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar7 = j92.b.f97899b;
                                                                h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar7.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar3 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar3, 48);
                                                                int iHashCode2 = Long.hashCode(mVar3.getU());
                                                                i2 i2VarX2 = mVar3.x();
                                                                h4.r rVarC4 = h4.k.c(rVarC3, mVar3);
                                                                h5.g.V.getClass();
                                                                e0.a aVar10 = h5.g.a.f81805b;
                                                                if (mVar3.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar3.z();
                                                                if (mVar3.getT()) {
                                                                    mVar3.M(aVar10);
                                                                } else {
                                                                    mVar3.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA2, mVar3);
                                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                                                                h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                                                                    v.h.z(iHashCode2, mVar3, iHashCode2, bVar4);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC4, mVar3);
                                                                u2 u2Var2 = u2.f22900a;
                                                                l72.f0.a aVar11 = l72.f0.a.f111000a;
                                                                String strQ2 = y.Q(mVar3, R.string.create_meal);
                                                                h4.r rVarC5 = c2.l.C(aVar9, eVar7.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB7 = mVar3.B(aVar6);
                                                                Object objQ3 = mVar3.q();
                                                                if (zB7) {
                                                                    objQ3 = new ku1.a(aVar6, 20);
                                                                    mVar3.K(objQ3);
                                                                } else {
                                                                    aVar5.getClass();
                                                                    if (objQ3 == p3.m.a.f135155b) {
                                                                        objQ3 = new ku1.a(aVar6, 20);
                                                                        mVar3.K(objQ3);
                                                                    }
                                                                }
                                                                aVar11.f(strQ2, rVarC5, false, (e23.a) objQ3, mVar3, 0, 4);
                                                                if (eVar5.b()) {
                                                                    mVar3.C(-321960809);
                                                                    List<b11.l> list2 = eVar5.f116100q;
                                                                    b11.l lVar9 = eVar5.f116101r;
                                                                    y01.l.a(c2.l.C(aVar9, eVar7.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar9 != null ? Long.valueOf(lVar9.f14331a) : null, lVar7, mVar3, 0, 0);
                                                                    mVar3.f();
                                                                } else {
                                                                    mVar3.C(-321572596);
                                                                    mVar3.f();
                                                                }
                                                                mVar3.y();
                                                            } else {
                                                                mVar3.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        default:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                h4.r.a aVar12 = h4.r.S;
                                                                h4.r rVarD3 = x2.d(aVar12, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar8 = j92.b.f97899b;
                                                                h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar8.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar5 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar4, 48);
                                                                int iHashCode3 = Long.hashCode(mVar4.getU());
                                                                i2 i2VarX3 = mVar4.x();
                                                                h4.r rVarC7 = h4.k.c(rVarC6, mVar4);
                                                                h5.g.V.getClass();
                                                                e0.a aVar13 = h5.g.a.f81805b;
                                                                if (mVar4.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar4.z();
                                                                if (mVar4.getT()) {
                                                                    mVar4.M(aVar13);
                                                                } else {
                                                                    mVar4.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA3, mVar4);
                                                                b4.c(h5.g.a.f81809f, i2VarX3, mVar4);
                                                                h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                                                                    v.h.z(iHashCode3, mVar4, iHashCode3, bVar6);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC7, mVar4);
                                                                u2 u2Var3 = u2.f22900a;
                                                                l72.f0.a aVar14 = l72.f0.a.f111000a;
                                                                x0.f23314a.getClass();
                                                                String strW = gl1.d.W(x0.Jd);
                                                                h4.r rVarC8 = c2.l.C(aVar12, eVar8.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB8 = mVar4.B(aVar6);
                                                                Object objQ4 = mVar4.q();
                                                                if (zB8) {
                                                                    objQ4 = new ku1.a(aVar6, 21);
                                                                    mVar4.K(objQ4);
                                                                } else {
                                                                    aVar5.getClass();
                                                                    if (objQ4 == p3.m.a.f135155b) {
                                                                        objQ4 = new ku1.a(aVar6, 21);
                                                                        mVar4.K(objQ4);
                                                                    }
                                                                }
                                                                aVar14.f(strW, rVarC8, false, (e23.a) objQ4, mVar4, 0, 4);
                                                                if (eVar5.b()) {
                                                                    mVar4.C(231180845);
                                                                    List<b11.l> list3 = eVar5.f116100q;
                                                                    b11.l lVar10 = eVar5.f116101r;
                                                                    y01.l.a(c2.l.C(aVar12, eVar8.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar10 != null ? Long.valueOf(lVar10.f14331a) : null, lVar7, mVar4, 0, 0);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(231569058);
                                                                    mVar4.f();
                                                                }
                                                                mVar4.y();
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            }), 3);
                                        }
                                        j21.m.a(f0Var2, !eVar4.f116088e.d(), c22.i.b(R.string.delete_custom_meal), c22.i.b(R.string.delete_meal_this_cannot_be_undone), dVar3, eVar2, lVar2, lVar3, lVar4);
                                        break;
                                    default:
                                        f0 f0Var3 = (f0) obj4;
                                        f0Var3.getClass();
                                        zc.d dVar4 = dVar;
                                        boolean z16 = dVar4.d().f196385a instanceof z0.c;
                                        final m21.e eVar5 = eVar;
                                        final e23.a aVar5 = aVar2;
                                        if (z16 && dVar4.c().isEmpty()) {
                                            final int i24 = 2;
                                            f0.b(f0Var3, null, new z3.e(1835197901, true, new e23.q() { // from class: l21.m
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    String strH;
                                                    String strH2;
                                                    String str;
                                                    int i110 = i24;
                                                    e23.a aVar6 = aVar5;
                                                    m21.e eVar6 = eVar5;
                                                    switch (i110) {
                                                        case 0:
                                                            p3.m mVar2 = (p3.m) obj6;
                                                            int iIntValue2 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                x1 x1Var2 = p3.n.f135158a;
                                                                String str2 = eVar6.f116084a;
                                                                m21.b bVar = eVar6.f116088e;
                                                                if (str2.length() > 0) {
                                                                    mVar2.C(-350320041);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar2, R.string.lbl_no_results_found), y.Q(mVar2, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar2, 3072, 16);
                                                                    mVar2.f();
                                                                } else {
                                                                    mVar2.C(-349883685);
                                                                    if (bVar.d()) {
                                                                        mVar2.C(-349718703);
                                                                        mVar2.f();
                                                                        strH = null;
                                                                    } else {
                                                                        strH = sn.a.h(mVar2, -349822863, R.string.create_food, mVar2);
                                                                    }
                                                                    e23.a aVar7 = !bVar.d() ? aVar6 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar2, R.string.lbl_cannot_find_custom_foods), y.Q(mVar2, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar7, null, null, mVar2, 3072, 192);
                                                                    mVar2.f();
                                                                }
                                                            } else {
                                                                mVar2.e();
                                                            }
                                                            break;
                                                        case 1:
                                                            p3.m mVar3 = (p3.m) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                x1 x1Var3 = p3.n.f135158a;
                                                                String str3 = eVar6.f116084a;
                                                                m21.b bVar2 = eVar6.f116088e;
                                                                if (str3.length() > 0) {
                                                                    mVar3.C(890054817);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar3, R.string.lbl_no_results_found), y.Q(mVar3, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar3, 3072, 16);
                                                                    mVar3.f();
                                                                } else {
                                                                    mVar3.C(890490460);
                                                                    if (bVar2.d()) {
                                                                        mVar3.C(890656155);
                                                                        mVar3.f();
                                                                        strH2 = null;
                                                                    } else {
                                                                        strH2 = sn.a.h(mVar3, 890551995, R.string.create_meal, mVar3);
                                                                    }
                                                                    e23.a aVar8 = !bVar2.d() ? aVar6 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar3, R.string.lbl_create_a_meal), y.Q(mVar3, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar8, null, null, mVar3, 3072, 192);
                                                                    mVar3.f();
                                                                }
                                                            } else {
                                                                mVar3.e();
                                                            }
                                                            break;
                                                        default:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                String str4 = eVar6.f116084a;
                                                                m21.b bVar3 = eVar6.f116088e;
                                                                if (str4.length() > 0) {
                                                                    mVar4.C(1742034231);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(1742470308);
                                                                    if (bVar3.d()) {
                                                                        mVar4.C(1742641521);
                                                                        mVar4.f();
                                                                        str = null;
                                                                    } else {
                                                                        mVar4.C(1742531595);
                                                                        x0.f23314a.getClass();
                                                                        String strW = gl1.d.W(x0.Jd);
                                                                        mVar4.f();
                                                                        str = strW;
                                                                    }
                                                                    e23.a aVar9 = !bVar3.d() ? aVar6 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    u4.d dVarA = ea.a(t62.c.f162799a);
                                                                    x0.f23314a.getClass();
                                                                    b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar9, null, null, mVar4, 3072, 192);
                                                                    mVar4.f();
                                                                }
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }), 3);
                                        } else if (!dVar4.c().isEmpty() && !eVar5.f116085b && !eVar5.f116088e.d()) {
                                            final int i25 = 2;
                                            final e23.l lVar8 = lVar;
                                            f0.b(f0Var3, null, new z3.e(-783051516, true, new e23.q() { // from class: l21.n
                                                /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    int i110 = i25;
                                                    p3.m.a aVar6 = p3.m.f135153a;
                                                    m21.e eVar6 = eVar5;
                                                    e23.a aVar7 = aVar5;
                                                    switch (i110) {
                                                        case 0:
                                                            p3.m mVar2 = (p3.m) obj6;
                                                            int iIntValue2 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                x1 x1Var2 = p3.n.f135158a;
                                                                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar7 = j92.b.f97899b;
                                                                float f14 = eVar7.f97920e;
                                                                h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar = h4.d.a.f81534l;
                                                                c2.j jVar = c2.j.f22691a;
                                                                float f15 = eVar7.f97920e;
                                                                jVar.getClass();
                                                                s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar2, 48);
                                                                int iHashCode = Long.hashCode(mVar2.getU());
                                                                i2 i2VarX = mVar2.x();
                                                                h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                                                                h5.g.V.getClass();
                                                                e0.a aVar8 = h5.g.a.f81805b;
                                                                if (mVar2.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar2.z();
                                                                if (mVar2.getT()) {
                                                                    mVar2.M(aVar8);
                                                                } else {
                                                                    mVar2.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                                    v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                                                                u2 u2Var = u2.f22900a;
                                                                l72.f0.a aVar9 = l72.f0.a.f111000a;
                                                                String strQ = y.Q(mVar2, R.string.create_food);
                                                                boolean zB6 = mVar2.B(aVar7);
                                                                Object objQ2 = mVar2.q();
                                                                if (zB6) {
                                                                    objQ2 = new ku1.a(aVar7, 19);
                                                                    mVar2.K(objQ2);
                                                                } else {
                                                                    aVar6.getClass();
                                                                    if (objQ2 == p3.m.a.f135155b) {
                                                                        objQ2 = new ku1.a(aVar7, 19);
                                                                        mVar2.K(objQ2);
                                                                    }
                                                                }
                                                                aVar9.f(strQ, null, false, (e23.a) objQ2, mVar2, 0, 6);
                                                                if (eVar6.b()) {
                                                                    mVar2.C(-1562464720);
                                                                    List<b11.l> list = eVar6.f116100q;
                                                                    b11.l lVar9 = eVar6.f116101r;
                                                                    y01.l.a(null, list, lVar9 != null ? Long.valueOf(lVar9.f14331a) : null, lVar8, mVar2, 0, 1);
                                                                    mVar2.f();
                                                                } else {
                                                                    mVar2.C(-1562139902);
                                                                    mVar2.f();
                                                                }
                                                                mVar2.y();
                                                            } else {
                                                                mVar2.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        case 1:
                                                            p3.m mVar3 = (p3.m) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                x1 x1Var3 = p3.n.f135158a;
                                                                h4.r.a aVar10 = h4.r.S;
                                                                h4.r rVarD2 = x2.d(aVar10, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar8 = j92.b.f97899b;
                                                                h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar8.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar3 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar3, 48);
                                                                int iHashCode2 = Long.hashCode(mVar3.getU());
                                                                i2 i2VarX2 = mVar3.x();
                                                                h4.r rVarC4 = h4.k.c(rVarC3, mVar3);
                                                                h5.g.V.getClass();
                                                                e0.a aVar11 = h5.g.a.f81805b;
                                                                if (mVar3.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar3.z();
                                                                if (mVar3.getT()) {
                                                                    mVar3.M(aVar11);
                                                                } else {
                                                                    mVar3.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA2, mVar3);
                                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                                                                h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                                                                    v.h.z(iHashCode2, mVar3, iHashCode2, bVar4);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC4, mVar3);
                                                                u2 u2Var2 = u2.f22900a;
                                                                l72.f0.a aVar12 = l72.f0.a.f111000a;
                                                                String strQ2 = y.Q(mVar3, R.string.create_meal);
                                                                h4.r rVarC5 = c2.l.C(aVar10, eVar8.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB7 = mVar3.B(aVar7);
                                                                Object objQ3 = mVar3.q();
                                                                if (zB7) {
                                                                    objQ3 = new ku1.a(aVar7, 20);
                                                                    mVar3.K(objQ3);
                                                                } else {
                                                                    aVar6.getClass();
                                                                    if (objQ3 == p3.m.a.f135155b) {
                                                                        objQ3 = new ku1.a(aVar7, 20);
                                                                        mVar3.K(objQ3);
                                                                    }
                                                                }
                                                                aVar12.f(strQ2, rVarC5, false, (e23.a) objQ3, mVar3, 0, 4);
                                                                if (eVar6.b()) {
                                                                    mVar3.C(-321960809);
                                                                    List<b11.l> list2 = eVar6.f116100q;
                                                                    b11.l lVar10 = eVar6.f116101r;
                                                                    y01.l.a(c2.l.C(aVar10, eVar8.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar10 != null ? Long.valueOf(lVar10.f14331a) : null, lVar8, mVar3, 0, 0);
                                                                    mVar3.f();
                                                                } else {
                                                                    mVar3.C(-321572596);
                                                                    mVar3.f();
                                                                }
                                                                mVar3.y();
                                                            } else {
                                                                mVar3.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        default:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                h4.r.a aVar13 = h4.r.S;
                                                                h4.r rVarD3 = x2.d(aVar13, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar9 = j92.b.f97899b;
                                                                h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar9.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar5 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar4, 48);
                                                                int iHashCode3 = Long.hashCode(mVar4.getU());
                                                                i2 i2VarX3 = mVar4.x();
                                                                h4.r rVarC7 = h4.k.c(rVarC6, mVar4);
                                                                h5.g.V.getClass();
                                                                e0.a aVar14 = h5.g.a.f81805b;
                                                                if (mVar4.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar4.z();
                                                                if (mVar4.getT()) {
                                                                    mVar4.M(aVar14);
                                                                } else {
                                                                    mVar4.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA3, mVar4);
                                                                b4.c(h5.g.a.f81809f, i2VarX3, mVar4);
                                                                h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                                                                    v.h.z(iHashCode3, mVar4, iHashCode3, bVar6);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC7, mVar4);
                                                                u2 u2Var3 = u2.f22900a;
                                                                l72.f0.a aVar15 = l72.f0.a.f111000a;
                                                                x0.f23314a.getClass();
                                                                String strW = gl1.d.W(x0.Jd);
                                                                h4.r rVarC8 = c2.l.C(aVar13, eVar9.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB8 = mVar4.B(aVar7);
                                                                Object objQ4 = mVar4.q();
                                                                if (zB8) {
                                                                    objQ4 = new ku1.a(aVar7, 21);
                                                                    mVar4.K(objQ4);
                                                                } else {
                                                                    aVar6.getClass();
                                                                    if (objQ4 == p3.m.a.f135155b) {
                                                                        objQ4 = new ku1.a(aVar7, 21);
                                                                        mVar4.K(objQ4);
                                                                    }
                                                                }
                                                                aVar15.f(strW, rVarC8, false, (e23.a) objQ4, mVar4, 0, 4);
                                                                if (eVar6.b()) {
                                                                    mVar4.C(231180845);
                                                                    List<b11.l> list3 = eVar6.f116100q;
                                                                    b11.l lVar11 = eVar6.f116101r;
                                                                    y01.l.a(c2.l.C(aVar13, eVar9.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar11 != null ? Long.valueOf(lVar11.f14331a) : null, lVar8, mVar4, 0, 0);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(231569058);
                                                                    mVar4.f();
                                                                }
                                                                mVar4.y();
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            }), 3);
                                        }
                                        boolean z17 = !(eVar5.f116088e instanceof m21.b.C2206b);
                                        x0.f23314a.getClass();
                                        j21.m.a(f0Var3, z17, g2.b(x0.Qd), g2.b(x0.f23598qf), dVar4, eVar2, lVar2, lVar3, lVar4);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar5);
                        objQ = lVar5;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int i16 = 0;
                            e23.l lVar6 = new e23.l() { // from class: l21.l
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    switch (i16) {
                                        case 0:
                                            f0 f0Var = (f0) obj4;
                                            f0Var.getClass();
                                            zc.d dVar2 = dVar;
                                            boolean z14 = dVar2.d().f196385a instanceof z0.c;
                                            final m21.e eVar3 = eVar;
                                            final e23.a aVar3 = aVar2;
                                            if (z14 && dVar2.c().isEmpty()) {
                                                final int i17 = 0;
                                                f0.b(f0Var, null, new z3.e(-1173699411, true, new e23.q() { // from class: l21.m
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        String strH;
                                                        String strH2;
                                                        String str;
                                                        int i110 = i17;
                                                        e23.a aVar6 = aVar3;
                                                        m21.e eVar6 = eVar3;
                                                        switch (i110) {
                                                            case 0:
                                                                p3.m mVar2 = (p3.m) obj6;
                                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                    x1 x1Var2 = p3.n.f135158a;
                                                                    String str2 = eVar6.f116084a;
                                                                    m21.b bVar = eVar6.f116088e;
                                                                    if (str2.length() > 0) {
                                                                        mVar2.C(-350320041);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar2, R.string.lbl_no_results_found), y.Q(mVar2, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar2, 3072, 16);
                                                                        mVar2.f();
                                                                    } else {
                                                                        mVar2.C(-349883685);
                                                                        if (bVar.d()) {
                                                                            mVar2.C(-349718703);
                                                                            mVar2.f();
                                                                            strH = null;
                                                                        } else {
                                                                            strH = sn.a.h(mVar2, -349822863, R.string.create_food, mVar2);
                                                                        }
                                                                        e23.a aVar7 = !bVar.d() ? aVar6 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar2, R.string.lbl_cannot_find_custom_foods), y.Q(mVar2, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar7, null, null, mVar2, 3072, 192);
                                                                        mVar2.f();
                                                                    }
                                                                } else {
                                                                    mVar2.e();
                                                                }
                                                                break;
                                                            case 1:
                                                                p3.m mVar3 = (p3.m) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    x1 x1Var3 = p3.n.f135158a;
                                                                    String str3 = eVar6.f116084a;
                                                                    m21.b bVar2 = eVar6.f116088e;
                                                                    if (str3.length() > 0) {
                                                                        mVar3.C(890054817);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar3, R.string.lbl_no_results_found), y.Q(mVar3, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar3, 3072, 16);
                                                                        mVar3.f();
                                                                    } else {
                                                                        mVar3.C(890490460);
                                                                        if (bVar2.d()) {
                                                                            mVar3.C(890656155);
                                                                            mVar3.f();
                                                                            strH2 = null;
                                                                        } else {
                                                                            strH2 = sn.a.h(mVar3, 890551995, R.string.create_meal, mVar3);
                                                                        }
                                                                        e23.a aVar8 = !bVar2.d() ? aVar6 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar3, R.string.lbl_create_a_meal), y.Q(mVar3, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar8, null, null, mVar3, 3072, 192);
                                                                        mVar3.f();
                                                                    }
                                                                } else {
                                                                    mVar3.e();
                                                                }
                                                                break;
                                                            default:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    String str4 = eVar6.f116084a;
                                                                    m21.b bVar3 = eVar6.f116088e;
                                                                    if (str4.length() > 0) {
                                                                        mVar4.C(1742034231);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(1742470308);
                                                                        if (bVar3.d()) {
                                                                            mVar4.C(1742641521);
                                                                            mVar4.f();
                                                                            str = null;
                                                                        } else {
                                                                            mVar4.C(1742531595);
                                                                            x0.f23314a.getClass();
                                                                            String strW = gl1.d.W(x0.Jd);
                                                                            mVar4.f();
                                                                            str = strW;
                                                                        }
                                                                        e23.a aVar9 = !bVar3.d() ? aVar6 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        u4.d dVarA = ea.a(t62.c.f162799a);
                                                                        x0.f23314a.getClass();
                                                                        b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar9, null, null, mVar4, 3072, 192);
                                                                        mVar4.f();
                                                                    }
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }), 3);
                                            } else if (!dVar2.c().isEmpty() && !eVar3.f116085b && !eVar3.f116088e.d()) {
                                                final int i18 = 0;
                                                final e23.l lVar7 = lVar;
                                                f0.b(f0Var, null, new z3.e(-500586652, true, new e23.q() { // from class: l21.n
                                                    /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                    /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                    /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        int i110 = i18;
                                                        p3.m.a aVar6 = p3.m.f135153a;
                                                        m21.e eVar6 = eVar3;
                                                        e23.a aVar7 = aVar3;
                                                        switch (i110) {
                                                            case 0:
                                                                p3.m mVar2 = (p3.m) obj6;
                                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                    x1 x1Var2 = p3.n.f135158a;
                                                                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar7 = j92.b.f97899b;
                                                                    float f14 = eVar7.f97920e;
                                                                    h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                                    c2.j jVar = c2.j.f22691a;
                                                                    float f15 = eVar7.f97920e;
                                                                    jVar.getClass();
                                                                    s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar2, 48);
                                                                    int iHashCode = Long.hashCode(mVar2.getU());
                                                                    i2 i2VarX = mVar2.x();
                                                                    h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar8 = h5.g.a.f81805b;
                                                                    if (mVar2.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar2.z();
                                                                    if (mVar2.getT()) {
                                                                        mVar2.M(aVar8);
                                                                    } else {
                                                                        mVar2.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                                                                    u2 u2Var = u2.f22900a;
                                                                    l72.f0.a aVar9 = l72.f0.a.f111000a;
                                                                    String strQ = y.Q(mVar2, R.string.create_food);
                                                                    boolean zB6 = mVar2.B(aVar7);
                                                                    Object objQ2 = mVar2.q();
                                                                    if (zB6) {
                                                                        objQ2 = new ku1.a(aVar7, 19);
                                                                        mVar2.K(objQ2);
                                                                    } else {
                                                                        aVar6.getClass();
                                                                        if (objQ2 == p3.m.a.f135155b) {
                                                                            objQ2 = new ku1.a(aVar7, 19);
                                                                            mVar2.K(objQ2);
                                                                        }
                                                                    }
                                                                    aVar9.f(strQ, null, false, (e23.a) objQ2, mVar2, 0, 6);
                                                                    if (eVar6.b()) {
                                                                        mVar2.C(-1562464720);
                                                                        List<b11.l> list = eVar6.f116100q;
                                                                        b11.l lVar9 = eVar6.f116101r;
                                                                        y01.l.a(null, list, lVar9 != null ? Long.valueOf(lVar9.f14331a) : null, lVar7, mVar2, 0, 1);
                                                                        mVar2.f();
                                                                    } else {
                                                                        mVar2.C(-1562139902);
                                                                        mVar2.f();
                                                                    }
                                                                    mVar2.y();
                                                                } else {
                                                                    mVar2.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            case 1:
                                                                p3.m mVar3 = (p3.m) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    x1 x1Var3 = p3.n.f135158a;
                                                                    h4.r.a aVar10 = h4.r.S;
                                                                    h4.r rVarD2 = x2.d(aVar10, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar8 = j92.b.f97899b;
                                                                    h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar8.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar3 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar3, 48);
                                                                    int iHashCode2 = Long.hashCode(mVar3.getU());
                                                                    i2 i2VarX2 = mVar3.x();
                                                                    h4.r rVarC4 = h4.k.c(rVarC3, mVar3);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar11 = h5.g.a.f81805b;
                                                                    if (mVar3.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar3.z();
                                                                    if (mVar3.getT()) {
                                                                        mVar3.M(aVar11);
                                                                    } else {
                                                                        mVar3.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA2, mVar3);
                                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                                                                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                                                                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar4);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC4, mVar3);
                                                                    u2 u2Var2 = u2.f22900a;
                                                                    l72.f0.a aVar12 = l72.f0.a.f111000a;
                                                                    String strQ2 = y.Q(mVar3, R.string.create_meal);
                                                                    h4.r rVarC5 = c2.l.C(aVar10, eVar8.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB7 = mVar3.B(aVar7);
                                                                    Object objQ3 = mVar3.q();
                                                                    if (zB7) {
                                                                        objQ3 = new ku1.a(aVar7, 20);
                                                                        mVar3.K(objQ3);
                                                                    } else {
                                                                        aVar6.getClass();
                                                                        if (objQ3 == p3.m.a.f135155b) {
                                                                            objQ3 = new ku1.a(aVar7, 20);
                                                                            mVar3.K(objQ3);
                                                                        }
                                                                    }
                                                                    aVar12.f(strQ2, rVarC5, false, (e23.a) objQ3, mVar3, 0, 4);
                                                                    if (eVar6.b()) {
                                                                        mVar3.C(-321960809);
                                                                        List<b11.l> list2 = eVar6.f116100q;
                                                                        b11.l lVar10 = eVar6.f116101r;
                                                                        y01.l.a(c2.l.C(aVar10, eVar8.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar10 != null ? Long.valueOf(lVar10.f14331a) : null, lVar7, mVar3, 0, 0);
                                                                        mVar3.f();
                                                                    } else {
                                                                        mVar3.C(-321572596);
                                                                        mVar3.f();
                                                                    }
                                                                    mVar3.y();
                                                                } else {
                                                                    mVar3.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            default:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    h4.r.a aVar13 = h4.r.S;
                                                                    h4.r rVarD3 = x2.d(aVar13, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar9 = j92.b.f97899b;
                                                                    h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar9.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar5 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar4, 48);
                                                                    int iHashCode3 = Long.hashCode(mVar4.getU());
                                                                    i2 i2VarX3 = mVar4.x();
                                                                    h4.r rVarC7 = h4.k.c(rVarC6, mVar4);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar14 = h5.g.a.f81805b;
                                                                    if (mVar4.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar4.z();
                                                                    if (mVar4.getT()) {
                                                                        mVar4.M(aVar14);
                                                                    } else {
                                                                        mVar4.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA3, mVar4);
                                                                    b4.c(h5.g.a.f81809f, i2VarX3, mVar4);
                                                                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                                                                        v.h.z(iHashCode3, mVar4, iHashCode3, bVar6);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC7, mVar4);
                                                                    u2 u2Var3 = u2.f22900a;
                                                                    l72.f0.a aVar15 = l72.f0.a.f111000a;
                                                                    x0.f23314a.getClass();
                                                                    String strW = gl1.d.W(x0.Jd);
                                                                    h4.r rVarC8 = c2.l.C(aVar13, eVar9.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB8 = mVar4.B(aVar7);
                                                                    Object objQ4 = mVar4.q();
                                                                    if (zB8) {
                                                                        objQ4 = new ku1.a(aVar7, 21);
                                                                        mVar4.K(objQ4);
                                                                    } else {
                                                                        aVar6.getClass();
                                                                        if (objQ4 == p3.m.a.f135155b) {
                                                                            objQ4 = new ku1.a(aVar7, 21);
                                                                            mVar4.K(objQ4);
                                                                        }
                                                                    }
                                                                    aVar15.f(strW, rVarC8, false, (e23.a) objQ4, mVar4, 0, 4);
                                                                    if (eVar6.b()) {
                                                                        mVar4.C(231180845);
                                                                        List<b11.l> list3 = eVar6.f116100q;
                                                                        b11.l lVar11 = eVar6.f116101r;
                                                                        y01.l.a(c2.l.C(aVar13, eVar9.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar11 != null ? Long.valueOf(lVar11.f14331a) : null, lVar7, mVar4, 0, 0);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(231569058);
                                                                        mVar4.f();
                                                                    }
                                                                    mVar4.y();
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                        }
                                                    }
                                                }), 3);
                                            }
                                            j21.m.a(f0Var, !eVar3.f116088e.d(), c22.i.b(R.string.delete_custom_food), c22.i.b(R.string.delete_food_this_cannot_be_undone), dVar2, eVar2, lVar2, lVar3, lVar4);
                                            break;
                                        case 1:
                                            f0 f0Var2 = (f0) obj4;
                                            f0Var2.getClass();
                                            zc.d dVar3 = dVar;
                                            boolean z15 = dVar3.d().f196385a instanceof z0.c;
                                            final m21.e eVar4 = eVar;
                                            final e23.a aVar4 = aVar2;
                                            if (z15 && dVar3.c().isEmpty()) {
                                                final int i19 = 1;
                                                f0.b(f0Var2, null, new z3.e(-1225270621, true, new e23.q() { // from class: l21.m
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        String strH;
                                                        String strH2;
                                                        String str;
                                                        int i110 = i19;
                                                        e23.a aVar6 = aVar4;
                                                        m21.e eVar6 = eVar4;
                                                        switch (i110) {
                                                            case 0:
                                                                p3.m mVar2 = (p3.m) obj6;
                                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                    x1 x1Var2 = p3.n.f135158a;
                                                                    String str2 = eVar6.f116084a;
                                                                    m21.b bVar = eVar6.f116088e;
                                                                    if (str2.length() > 0) {
                                                                        mVar2.C(-350320041);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar2, R.string.lbl_no_results_found), y.Q(mVar2, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar2, 3072, 16);
                                                                        mVar2.f();
                                                                    } else {
                                                                        mVar2.C(-349883685);
                                                                        if (bVar.d()) {
                                                                            mVar2.C(-349718703);
                                                                            mVar2.f();
                                                                            strH = null;
                                                                        } else {
                                                                            strH = sn.a.h(mVar2, -349822863, R.string.create_food, mVar2);
                                                                        }
                                                                        e23.a aVar7 = !bVar.d() ? aVar6 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar2, R.string.lbl_cannot_find_custom_foods), y.Q(mVar2, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar7, null, null, mVar2, 3072, 192);
                                                                        mVar2.f();
                                                                    }
                                                                } else {
                                                                    mVar2.e();
                                                                }
                                                                break;
                                                            case 1:
                                                                p3.m mVar3 = (p3.m) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    x1 x1Var3 = p3.n.f135158a;
                                                                    String str3 = eVar6.f116084a;
                                                                    m21.b bVar2 = eVar6.f116088e;
                                                                    if (str3.length() > 0) {
                                                                        mVar3.C(890054817);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar3, R.string.lbl_no_results_found), y.Q(mVar3, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar3, 3072, 16);
                                                                        mVar3.f();
                                                                    } else {
                                                                        mVar3.C(890490460);
                                                                        if (bVar2.d()) {
                                                                            mVar3.C(890656155);
                                                                            mVar3.f();
                                                                            strH2 = null;
                                                                        } else {
                                                                            strH2 = sn.a.h(mVar3, 890551995, R.string.create_meal, mVar3);
                                                                        }
                                                                        e23.a aVar8 = !bVar2.d() ? aVar6 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar3, R.string.lbl_create_a_meal), y.Q(mVar3, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar8, null, null, mVar3, 3072, 192);
                                                                        mVar3.f();
                                                                    }
                                                                } else {
                                                                    mVar3.e();
                                                                }
                                                                break;
                                                            default:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    String str4 = eVar6.f116084a;
                                                                    m21.b bVar3 = eVar6.f116088e;
                                                                    if (str4.length() > 0) {
                                                                        mVar4.C(1742034231);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(1742470308);
                                                                        if (bVar3.d()) {
                                                                            mVar4.C(1742641521);
                                                                            mVar4.f();
                                                                            str = null;
                                                                        } else {
                                                                            mVar4.C(1742531595);
                                                                            x0.f23314a.getClass();
                                                                            String strW = gl1.d.W(x0.Jd);
                                                                            mVar4.f();
                                                                            str = strW;
                                                                        }
                                                                        e23.a aVar9 = !bVar3.d() ? aVar6 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        u4.d dVarA = ea.a(t62.c.f162799a);
                                                                        x0.f23314a.getClass();
                                                                        b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar9, null, null, mVar4, 3072, 192);
                                                                        mVar4.f();
                                                                    }
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }), 3);
                                            } else if (!dVar3.c().isEmpty() && !eVar4.f116085b && !eVar4.f116088e.d()) {
                                                final int i110 = 1;
                                                final e23.l lVar8 = lVar;
                                                f0.b(f0Var2, null, new z3.e(-552157862, true, new e23.q() { // from class: l21.n
                                                    /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                    /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                    /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        int i111 = i110;
                                                        p3.m.a aVar6 = p3.m.f135153a;
                                                        m21.e eVar6 = eVar4;
                                                        e23.a aVar7 = aVar4;
                                                        switch (i111) {
                                                            case 0:
                                                                p3.m mVar2 = (p3.m) obj6;
                                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                    x1 x1Var2 = p3.n.f135158a;
                                                                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar7 = j92.b.f97899b;
                                                                    float f14 = eVar7.f97920e;
                                                                    h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                                    c2.j jVar = c2.j.f22691a;
                                                                    float f15 = eVar7.f97920e;
                                                                    jVar.getClass();
                                                                    s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar2, 48);
                                                                    int iHashCode = Long.hashCode(mVar2.getU());
                                                                    i2 i2VarX = mVar2.x();
                                                                    h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar8 = h5.g.a.f81805b;
                                                                    if (mVar2.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar2.z();
                                                                    if (mVar2.getT()) {
                                                                        mVar2.M(aVar8);
                                                                    } else {
                                                                        mVar2.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                                                                    u2 u2Var = u2.f22900a;
                                                                    l72.f0.a aVar9 = l72.f0.a.f111000a;
                                                                    String strQ = y.Q(mVar2, R.string.create_food);
                                                                    boolean zB6 = mVar2.B(aVar7);
                                                                    Object objQ2 = mVar2.q();
                                                                    if (zB6) {
                                                                        objQ2 = new ku1.a(aVar7, 19);
                                                                        mVar2.K(objQ2);
                                                                    } else {
                                                                        aVar6.getClass();
                                                                        if (objQ2 == p3.m.a.f135155b) {
                                                                            objQ2 = new ku1.a(aVar7, 19);
                                                                            mVar2.K(objQ2);
                                                                        }
                                                                    }
                                                                    aVar9.f(strQ, null, false, (e23.a) objQ2, mVar2, 0, 6);
                                                                    if (eVar6.b()) {
                                                                        mVar2.C(-1562464720);
                                                                        List<b11.l> list = eVar6.f116100q;
                                                                        b11.l lVar9 = eVar6.f116101r;
                                                                        y01.l.a(null, list, lVar9 != null ? Long.valueOf(lVar9.f14331a) : null, lVar8, mVar2, 0, 1);
                                                                        mVar2.f();
                                                                    } else {
                                                                        mVar2.C(-1562139902);
                                                                        mVar2.f();
                                                                    }
                                                                    mVar2.y();
                                                                } else {
                                                                    mVar2.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            case 1:
                                                                p3.m mVar3 = (p3.m) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    x1 x1Var3 = p3.n.f135158a;
                                                                    h4.r.a aVar10 = h4.r.S;
                                                                    h4.r rVarD2 = x2.d(aVar10, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar8 = j92.b.f97899b;
                                                                    h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar8.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar3 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar3, 48);
                                                                    int iHashCode2 = Long.hashCode(mVar3.getU());
                                                                    i2 i2VarX2 = mVar3.x();
                                                                    h4.r rVarC4 = h4.k.c(rVarC3, mVar3);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar11 = h5.g.a.f81805b;
                                                                    if (mVar3.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar3.z();
                                                                    if (mVar3.getT()) {
                                                                        mVar3.M(aVar11);
                                                                    } else {
                                                                        mVar3.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA2, mVar3);
                                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                                                                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                                                                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar4);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC4, mVar3);
                                                                    u2 u2Var2 = u2.f22900a;
                                                                    l72.f0.a aVar12 = l72.f0.a.f111000a;
                                                                    String strQ2 = y.Q(mVar3, R.string.create_meal);
                                                                    h4.r rVarC5 = c2.l.C(aVar10, eVar8.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB7 = mVar3.B(aVar7);
                                                                    Object objQ3 = mVar3.q();
                                                                    if (zB7) {
                                                                        objQ3 = new ku1.a(aVar7, 20);
                                                                        mVar3.K(objQ3);
                                                                    } else {
                                                                        aVar6.getClass();
                                                                        if (objQ3 == p3.m.a.f135155b) {
                                                                            objQ3 = new ku1.a(aVar7, 20);
                                                                            mVar3.K(objQ3);
                                                                        }
                                                                    }
                                                                    aVar12.f(strQ2, rVarC5, false, (e23.a) objQ3, mVar3, 0, 4);
                                                                    if (eVar6.b()) {
                                                                        mVar3.C(-321960809);
                                                                        List<b11.l> list2 = eVar6.f116100q;
                                                                        b11.l lVar10 = eVar6.f116101r;
                                                                        y01.l.a(c2.l.C(aVar10, eVar8.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar10 != null ? Long.valueOf(lVar10.f14331a) : null, lVar8, mVar3, 0, 0);
                                                                        mVar3.f();
                                                                    } else {
                                                                        mVar3.C(-321572596);
                                                                        mVar3.f();
                                                                    }
                                                                    mVar3.y();
                                                                } else {
                                                                    mVar3.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            default:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    h4.r.a aVar13 = h4.r.S;
                                                                    h4.r rVarD3 = x2.d(aVar13, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar9 = j92.b.f97899b;
                                                                    h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar9.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar5 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar4, 48);
                                                                    int iHashCode3 = Long.hashCode(mVar4.getU());
                                                                    i2 i2VarX3 = mVar4.x();
                                                                    h4.r rVarC7 = h4.k.c(rVarC6, mVar4);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar14 = h5.g.a.f81805b;
                                                                    if (mVar4.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar4.z();
                                                                    if (mVar4.getT()) {
                                                                        mVar4.M(aVar14);
                                                                    } else {
                                                                        mVar4.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA3, mVar4);
                                                                    b4.c(h5.g.a.f81809f, i2VarX3, mVar4);
                                                                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                                                                        v.h.z(iHashCode3, mVar4, iHashCode3, bVar6);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC7, mVar4);
                                                                    u2 u2Var3 = u2.f22900a;
                                                                    l72.f0.a aVar15 = l72.f0.a.f111000a;
                                                                    x0.f23314a.getClass();
                                                                    String strW = gl1.d.W(x0.Jd);
                                                                    h4.r rVarC8 = c2.l.C(aVar13, eVar9.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB8 = mVar4.B(aVar7);
                                                                    Object objQ4 = mVar4.q();
                                                                    if (zB8) {
                                                                        objQ4 = new ku1.a(aVar7, 21);
                                                                        mVar4.K(objQ4);
                                                                    } else {
                                                                        aVar6.getClass();
                                                                        if (objQ4 == p3.m.a.f135155b) {
                                                                            objQ4 = new ku1.a(aVar7, 21);
                                                                            mVar4.K(objQ4);
                                                                        }
                                                                    }
                                                                    aVar15.f(strW, rVarC8, false, (e23.a) objQ4, mVar4, 0, 4);
                                                                    if (eVar6.b()) {
                                                                        mVar4.C(231180845);
                                                                        List<b11.l> list3 = eVar6.f116100q;
                                                                        b11.l lVar11 = eVar6.f116101r;
                                                                        y01.l.a(c2.l.C(aVar13, eVar9.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar11 != null ? Long.valueOf(lVar11.f14331a) : null, lVar8, mVar4, 0, 0);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(231569058);
                                                                        mVar4.f();
                                                                    }
                                                                    mVar4.y();
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                        }
                                                    }
                                                }), 3);
                                            }
                                            j21.m.a(f0Var2, !eVar4.f116088e.d(), c22.i.b(R.string.delete_custom_meal), c22.i.b(R.string.delete_meal_this_cannot_be_undone), dVar3, eVar2, lVar2, lVar3, lVar4);
                                            break;
                                        default:
                                            f0 f0Var3 = (f0) obj4;
                                            f0Var3.getClass();
                                            zc.d dVar4 = dVar;
                                            boolean z16 = dVar4.d().f196385a instanceof z0.c;
                                            final m21.e eVar5 = eVar;
                                            final e23.a aVar5 = aVar2;
                                            if (z16 && dVar4.c().isEmpty()) {
                                                final int i24 = 2;
                                                f0.b(f0Var3, null, new z3.e(1835197901, true, new e23.q() { // from class: l21.m
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        String strH;
                                                        String strH2;
                                                        String str;
                                                        int i111 = i24;
                                                        e23.a aVar6 = aVar5;
                                                        m21.e eVar6 = eVar5;
                                                        switch (i111) {
                                                            case 0:
                                                                p3.m mVar2 = (p3.m) obj6;
                                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                    x1 x1Var2 = p3.n.f135158a;
                                                                    String str2 = eVar6.f116084a;
                                                                    m21.b bVar = eVar6.f116088e;
                                                                    if (str2.length() > 0) {
                                                                        mVar2.C(-350320041);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar2, R.string.lbl_no_results_found), y.Q(mVar2, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar2, 3072, 16);
                                                                        mVar2.f();
                                                                    } else {
                                                                        mVar2.C(-349883685);
                                                                        if (bVar.d()) {
                                                                            mVar2.C(-349718703);
                                                                            mVar2.f();
                                                                            strH = null;
                                                                        } else {
                                                                            strH = sn.a.h(mVar2, -349822863, R.string.create_food, mVar2);
                                                                        }
                                                                        e23.a aVar7 = !bVar.d() ? aVar6 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar2, R.string.lbl_cannot_find_custom_foods), y.Q(mVar2, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar7, null, null, mVar2, 3072, 192);
                                                                        mVar2.f();
                                                                    }
                                                                } else {
                                                                    mVar2.e();
                                                                }
                                                                break;
                                                            case 1:
                                                                p3.m mVar3 = (p3.m) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    x1 x1Var3 = p3.n.f135158a;
                                                                    String str3 = eVar6.f116084a;
                                                                    m21.b bVar2 = eVar6.f116088e;
                                                                    if (str3.length() > 0) {
                                                                        mVar3.C(890054817);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar3, R.string.lbl_no_results_found), y.Q(mVar3, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar3, 3072, 16);
                                                                        mVar3.f();
                                                                    } else {
                                                                        mVar3.C(890490460);
                                                                        if (bVar2.d()) {
                                                                            mVar3.C(890656155);
                                                                            mVar3.f();
                                                                            strH2 = null;
                                                                        } else {
                                                                            strH2 = sn.a.h(mVar3, 890551995, R.string.create_meal, mVar3);
                                                                        }
                                                                        e23.a aVar8 = !bVar2.d() ? aVar6 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar3, R.string.lbl_create_a_meal), y.Q(mVar3, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar8, null, null, mVar3, 3072, 192);
                                                                        mVar3.f();
                                                                    }
                                                                } else {
                                                                    mVar3.e();
                                                                }
                                                                break;
                                                            default:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    String str4 = eVar6.f116084a;
                                                                    m21.b bVar3 = eVar6.f116088e;
                                                                    if (str4.length() > 0) {
                                                                        mVar4.C(1742034231);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(1742470308);
                                                                        if (bVar3.d()) {
                                                                            mVar4.C(1742641521);
                                                                            mVar4.f();
                                                                            str = null;
                                                                        } else {
                                                                            mVar4.C(1742531595);
                                                                            x0.f23314a.getClass();
                                                                            String strW = gl1.d.W(x0.Jd);
                                                                            mVar4.f();
                                                                            str = strW;
                                                                        }
                                                                        e23.a aVar9 = !bVar3.d() ? aVar6 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        u4.d dVarA = ea.a(t62.c.f162799a);
                                                                        x0.f23314a.getClass();
                                                                        b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar9, null, null, mVar4, 3072, 192);
                                                                        mVar4.f();
                                                                    }
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }), 3);
                                            } else if (!dVar4.c().isEmpty() && !eVar5.f116085b && !eVar5.f116088e.d()) {
                                                final int i25 = 2;
                                                final e23.l lVar9 = lVar;
                                                f0.b(f0Var3, null, new z3.e(-783051516, true, new e23.q() { // from class: l21.n
                                                    /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                    /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                    /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        int i111 = i25;
                                                        p3.m.a aVar6 = p3.m.f135153a;
                                                        m21.e eVar6 = eVar5;
                                                        e23.a aVar7 = aVar5;
                                                        switch (i111) {
                                                            case 0:
                                                                p3.m mVar2 = (p3.m) obj6;
                                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                    x1 x1Var2 = p3.n.f135158a;
                                                                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar7 = j92.b.f97899b;
                                                                    float f14 = eVar7.f97920e;
                                                                    h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                                    c2.j jVar = c2.j.f22691a;
                                                                    float f15 = eVar7.f97920e;
                                                                    jVar.getClass();
                                                                    s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar2, 48);
                                                                    int iHashCode = Long.hashCode(mVar2.getU());
                                                                    i2 i2VarX = mVar2.x();
                                                                    h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar8 = h5.g.a.f81805b;
                                                                    if (mVar2.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar2.z();
                                                                    if (mVar2.getT()) {
                                                                        mVar2.M(aVar8);
                                                                    } else {
                                                                        mVar2.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                                                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                                                                    u2 u2Var = u2.f22900a;
                                                                    l72.f0.a aVar9 = l72.f0.a.f111000a;
                                                                    String strQ = y.Q(mVar2, R.string.create_food);
                                                                    boolean zB6 = mVar2.B(aVar7);
                                                                    Object objQ2 = mVar2.q();
                                                                    if (zB6) {
                                                                        objQ2 = new ku1.a(aVar7, 19);
                                                                        mVar2.K(objQ2);
                                                                    } else {
                                                                        aVar6.getClass();
                                                                        if (objQ2 == p3.m.a.f135155b) {
                                                                            objQ2 = new ku1.a(aVar7, 19);
                                                                            mVar2.K(objQ2);
                                                                        }
                                                                    }
                                                                    aVar9.f(strQ, null, false, (e23.a) objQ2, mVar2, 0, 6);
                                                                    if (eVar6.b()) {
                                                                        mVar2.C(-1562464720);
                                                                        List<b11.l> list = eVar6.f116100q;
                                                                        b11.l lVar10 = eVar6.f116101r;
                                                                        y01.l.a(null, list, lVar10 != null ? Long.valueOf(lVar10.f14331a) : null, lVar9, mVar2, 0, 1);
                                                                        mVar2.f();
                                                                    } else {
                                                                        mVar2.C(-1562139902);
                                                                        mVar2.f();
                                                                    }
                                                                    mVar2.y();
                                                                } else {
                                                                    mVar2.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            case 1:
                                                                p3.m mVar3 = (p3.m) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    x1 x1Var3 = p3.n.f135158a;
                                                                    h4.r.a aVar10 = h4.r.S;
                                                                    h4.r rVarD2 = x2.d(aVar10, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar8 = j92.b.f97899b;
                                                                    h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar8.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar3 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar3, 48);
                                                                    int iHashCode2 = Long.hashCode(mVar3.getU());
                                                                    i2 i2VarX2 = mVar3.x();
                                                                    h4.r rVarC4 = h4.k.c(rVarC3, mVar3);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar11 = h5.g.a.f81805b;
                                                                    if (mVar3.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar3.z();
                                                                    if (mVar3.getT()) {
                                                                        mVar3.M(aVar11);
                                                                    } else {
                                                                        mVar3.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA2, mVar3);
                                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                                                                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                                                                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar4);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC4, mVar3);
                                                                    u2 u2Var2 = u2.f22900a;
                                                                    l72.f0.a aVar12 = l72.f0.a.f111000a;
                                                                    String strQ2 = y.Q(mVar3, R.string.create_meal);
                                                                    h4.r rVarC5 = c2.l.C(aVar10, eVar8.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB7 = mVar3.B(aVar7);
                                                                    Object objQ3 = mVar3.q();
                                                                    if (zB7) {
                                                                        objQ3 = new ku1.a(aVar7, 20);
                                                                        mVar3.K(objQ3);
                                                                    } else {
                                                                        aVar6.getClass();
                                                                        if (objQ3 == p3.m.a.f135155b) {
                                                                            objQ3 = new ku1.a(aVar7, 20);
                                                                            mVar3.K(objQ3);
                                                                        }
                                                                    }
                                                                    aVar12.f(strQ2, rVarC5, false, (e23.a) objQ3, mVar3, 0, 4);
                                                                    if (eVar6.b()) {
                                                                        mVar3.C(-321960809);
                                                                        List<b11.l> list2 = eVar6.f116100q;
                                                                        b11.l lVar11 = eVar6.f116101r;
                                                                        y01.l.a(c2.l.C(aVar10, eVar8.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar11 != null ? Long.valueOf(lVar11.f14331a) : null, lVar9, mVar3, 0, 0);
                                                                        mVar3.f();
                                                                    } else {
                                                                        mVar3.C(-321572596);
                                                                        mVar3.f();
                                                                    }
                                                                    mVar3.y();
                                                                } else {
                                                                    mVar3.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            default:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    h4.r.a aVar13 = h4.r.S;
                                                                    h4.r rVarD3 = x2.d(aVar13, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar9 = j92.b.f97899b;
                                                                    h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar9.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar5 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar4, 48);
                                                                    int iHashCode3 = Long.hashCode(mVar4.getU());
                                                                    i2 i2VarX3 = mVar4.x();
                                                                    h4.r rVarC7 = h4.k.c(rVarC6, mVar4);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar14 = h5.g.a.f81805b;
                                                                    if (mVar4.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar4.z();
                                                                    if (mVar4.getT()) {
                                                                        mVar4.M(aVar14);
                                                                    } else {
                                                                        mVar4.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA3, mVar4);
                                                                    b4.c(h5.g.a.f81809f, i2VarX3, mVar4);
                                                                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                                                                        v.h.z(iHashCode3, mVar4, iHashCode3, bVar6);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC7, mVar4);
                                                                    u2 u2Var3 = u2.f22900a;
                                                                    l72.f0.a aVar15 = l72.f0.a.f111000a;
                                                                    x0.f23314a.getClass();
                                                                    String strW = gl1.d.W(x0.Jd);
                                                                    h4.r rVarC8 = c2.l.C(aVar13, eVar9.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB8 = mVar4.B(aVar7);
                                                                    Object objQ4 = mVar4.q();
                                                                    if (zB8) {
                                                                        objQ4 = new ku1.a(aVar7, 21);
                                                                        mVar4.K(objQ4);
                                                                    } else {
                                                                        aVar6.getClass();
                                                                        if (objQ4 == p3.m.a.f135155b) {
                                                                            objQ4 = new ku1.a(aVar7, 21);
                                                                            mVar4.K(objQ4);
                                                                        }
                                                                    }
                                                                    aVar15.f(strW, rVarC8, false, (e23.a) objQ4, mVar4, 0, 4);
                                                                    if (eVar6.b()) {
                                                                        mVar4.C(231180845);
                                                                        List<b11.l> list3 = eVar6.f116100q;
                                                                        b11.l lVar12 = eVar6.f116101r;
                                                                        y01.l.a(c2.l.C(aVar13, eVar9.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar12 != null ? Long.valueOf(lVar12.f14331a) : null, lVar9, mVar4, 0, 0);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(231569058);
                                                                        mVar4.f();
                                                                    }
                                                                    mVar4.y();
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                        }
                                                    }
                                                }), 3);
                                            }
                                            boolean z17 = !(eVar5.f116088e instanceof m21.b.C2206b);
                                            x0.f23314a.getClass();
                                            j21.m.a(f0Var3, z17, g2.b(x0.Qd), g2.b(x0.f23598qf), dVar4, eVar2, lVar2, lVar3, lVar4);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(lVar6);
                            objQ = lVar6;
                        }
                    }
                    e2.c.b(null, null, l2VarE, null, null, null, false, null, (e23.l) objQ, mVar, 0, 507);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l2 l2VarE2 = c2.l.e(0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    final zc.d dVar2 = this.f109119b;
                    boolean zR4 = mVar2.r(dVar2);
                    final m21.e eVar3 = this.f109120c;
                    boolean zR5 = zR4 | mVar2.r(eVar3);
                    final e23.a aVar3 = this.f109121d;
                    boolean zB6 = zR5 | mVar2.B(aVar3);
                    final e23.l lVar7 = this.f109122e;
                    boolean zB7 = zB6 | mVar2.B(lVar7);
                    final v21.e eVar4 = this.f109123f;
                    boolean zR6 = zB7 | mVar2.r(eVar4);
                    final e23.l lVar8 = this.f109124g;
                    boolean zB8 = zR6 | mVar2.B(lVar8);
                    final e23.l lVar9 = this.f109125h;
                    boolean zB9 = zB8 | mVar2.B(lVar9);
                    final e23.l lVar10 = this.f109126i;
                    boolean zB10 = zB9 | mVar2.B(lVar10);
                    Object objQ2 = mVar2.q();
                    if (zB10) {
                        final int i17 = 1;
                        e23.l lVar11 = new e23.l() { // from class: l21.l
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                switch (i17) {
                                    case 0:
                                        f0 f0Var = (f0) obj4;
                                        f0Var.getClass();
                                        zc.d dVar3 = dVar2;
                                        boolean z14 = dVar3.d().f196385a instanceof z0.c;
                                        final m21.e eVar5 = eVar3;
                                        final e23.a aVar4 = aVar3;
                                        if (z14 && dVar3.c().isEmpty()) {
                                            final int i18 = 0;
                                            f0.b(f0Var, null, new z3.e(-1173699411, true, new e23.q() { // from class: l21.m
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    String strH;
                                                    String strH2;
                                                    String str;
                                                    int i111 = i18;
                                                    e23.a aVar6 = aVar4;
                                                    m21.e eVar6 = eVar5;
                                                    switch (i111) {
                                                        case 0:
                                                            p3.m mVar3 = (p3.m) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                x1 x1Var3 = p3.n.f135158a;
                                                                String str2 = eVar6.f116084a;
                                                                m21.b bVar = eVar6.f116088e;
                                                                if (str2.length() > 0) {
                                                                    mVar3.C(-350320041);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar3, R.string.lbl_no_results_found), y.Q(mVar3, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar3, 3072, 16);
                                                                    mVar3.f();
                                                                } else {
                                                                    mVar3.C(-349883685);
                                                                    if (bVar.d()) {
                                                                        mVar3.C(-349718703);
                                                                        mVar3.f();
                                                                        strH = null;
                                                                    } else {
                                                                        strH = sn.a.h(mVar3, -349822863, R.string.create_food, mVar3);
                                                                    }
                                                                    e23.a aVar7 = !bVar.d() ? aVar6 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar3, R.string.lbl_cannot_find_custom_foods), y.Q(mVar3, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar7, null, null, mVar3, 3072, 192);
                                                                    mVar3.f();
                                                                }
                                                            } else {
                                                                mVar3.e();
                                                            }
                                                            break;
                                                        case 1:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                String str3 = eVar6.f116084a;
                                                                m21.b bVar2 = eVar6.f116088e;
                                                                if (str3.length() > 0) {
                                                                    mVar4.C(890054817);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(890490460);
                                                                    if (bVar2.d()) {
                                                                        mVar4.C(890656155);
                                                                        mVar4.f();
                                                                        strH2 = null;
                                                                    } else {
                                                                        strH2 = sn.a.h(mVar4, 890551995, R.string.create_meal, mVar4);
                                                                    }
                                                                    e23.a aVar8 = !bVar2.d() ? aVar6 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar4, R.string.lbl_create_a_meal), y.Q(mVar4, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar8, null, null, mVar4, 3072, 192);
                                                                    mVar4.f();
                                                                }
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            break;
                                                        default:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                x1 x1Var5 = p3.n.f135158a;
                                                                String str4 = eVar6.f116084a;
                                                                m21.b bVar3 = eVar6.f116088e;
                                                                if (str4.length() > 0) {
                                                                    mVar5.C(1742034231);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar5, R.string.lbl_no_results_found), y.Q(mVar5, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar5, 3072, 16);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(1742470308);
                                                                    if (bVar3.d()) {
                                                                        mVar5.C(1742641521);
                                                                        mVar5.f();
                                                                        str = null;
                                                                    } else {
                                                                        mVar5.C(1742531595);
                                                                        x0.f23314a.getClass();
                                                                        String strW = gl1.d.W(x0.Jd);
                                                                        mVar5.f();
                                                                        str = strW;
                                                                    }
                                                                    e23.a aVar9 = !bVar3.d() ? aVar6 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    u4.d dVarA = ea.a(t62.c.f162799a);
                                                                    x0.f23314a.getClass();
                                                                    b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar9, null, null, mVar5, 3072, 192);
                                                                    mVar5.f();
                                                                }
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }), 3);
                                        } else if (!dVar3.c().isEmpty() && !eVar5.f116085b && !eVar5.f116088e.d()) {
                                            final int i19 = 0;
                                            final e23.l lVar12 = lVar7;
                                            f0.b(f0Var, null, new z3.e(-500586652, true, new e23.q() { // from class: l21.n
                                                /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    int i111 = i19;
                                                    p3.m.a aVar6 = p3.m.f135153a;
                                                    m21.e eVar6 = eVar5;
                                                    e23.a aVar7 = aVar4;
                                                    switch (i111) {
                                                        case 0:
                                                            p3.m mVar3 = (p3.m) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                x1 x1Var3 = p3.n.f135158a;
                                                                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar7 = j92.b.f97899b;
                                                                float f14 = eVar7.f97920e;
                                                                h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar = h4.d.a.f81534l;
                                                                c2.j jVar = c2.j.f22691a;
                                                                float f15 = eVar7.f97920e;
                                                                jVar.getClass();
                                                                s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar3, 48);
                                                                int iHashCode = Long.hashCode(mVar3.getU());
                                                                i2 i2VarX = mVar3.x();
                                                                h4.r rVarC2 = h4.k.c(rVarC, mVar3);
                                                                h5.g.V.getClass();
                                                                e0.a aVar8 = h5.g.a.f81805b;
                                                                if (mVar3.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar3.z();
                                                                if (mVar3.getT()) {
                                                                    mVar3.M(aVar8);
                                                                } else {
                                                                    mVar3.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                                                                b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                                    v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                                                                u2 u2Var = u2.f22900a;
                                                                l72.f0.a aVar9 = l72.f0.a.f111000a;
                                                                String strQ = y.Q(mVar3, R.string.create_food);
                                                                boolean zB11 = mVar3.B(aVar7);
                                                                Object objQ3 = mVar3.q();
                                                                if (zB11) {
                                                                    objQ3 = new ku1.a(aVar7, 19);
                                                                    mVar3.K(objQ3);
                                                                } else {
                                                                    aVar6.getClass();
                                                                    if (objQ3 == p3.m.a.f135155b) {
                                                                        objQ3 = new ku1.a(aVar7, 19);
                                                                        mVar3.K(objQ3);
                                                                    }
                                                                }
                                                                aVar9.f(strQ, null, false, (e23.a) objQ3, mVar3, 0, 6);
                                                                if (eVar6.b()) {
                                                                    mVar3.C(-1562464720);
                                                                    List<b11.l> list = eVar6.f116100q;
                                                                    b11.l lVar13 = eVar6.f116101r;
                                                                    y01.l.a(null, list, lVar13 != null ? Long.valueOf(lVar13.f14331a) : null, lVar12, mVar3, 0, 1);
                                                                    mVar3.f();
                                                                } else {
                                                                    mVar3.C(-1562139902);
                                                                    mVar3.f();
                                                                }
                                                                mVar3.y();
                                                            } else {
                                                                mVar3.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        case 1:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                h4.r.a aVar10 = h4.r.S;
                                                                h4.r rVarD2 = x2.d(aVar10, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar8 = j92.b.f97899b;
                                                                h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar8.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar3 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar4, 48);
                                                                int iHashCode2 = Long.hashCode(mVar4.getU());
                                                                i2 i2VarX2 = mVar4.x();
                                                                h4.r rVarC4 = h4.k.c(rVarC3, mVar4);
                                                                h5.g.V.getClass();
                                                                e0.a aVar11 = h5.g.a.f81805b;
                                                                if (mVar4.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar4.z();
                                                                if (mVar4.getT()) {
                                                                    mVar4.M(aVar11);
                                                                } else {
                                                                    mVar4.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA2, mVar4);
                                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                                h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar4);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC4, mVar4);
                                                                u2 u2Var2 = u2.f22900a;
                                                                l72.f0.a aVar12 = l72.f0.a.f111000a;
                                                                String strQ2 = y.Q(mVar4, R.string.create_meal);
                                                                h4.r rVarC5 = c2.l.C(aVar10, eVar8.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB12 = mVar4.B(aVar7);
                                                                Object objQ4 = mVar4.q();
                                                                if (zB12) {
                                                                    objQ4 = new ku1.a(aVar7, 20);
                                                                    mVar4.K(objQ4);
                                                                } else {
                                                                    aVar6.getClass();
                                                                    if (objQ4 == p3.m.a.f135155b) {
                                                                        objQ4 = new ku1.a(aVar7, 20);
                                                                        mVar4.K(objQ4);
                                                                    }
                                                                }
                                                                aVar12.f(strQ2, rVarC5, false, (e23.a) objQ4, mVar4, 0, 4);
                                                                if (eVar6.b()) {
                                                                    mVar4.C(-321960809);
                                                                    List<b11.l> list2 = eVar6.f116100q;
                                                                    b11.l lVar14 = eVar6.f116101r;
                                                                    y01.l.a(c2.l.C(aVar10, eVar8.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar14 != null ? Long.valueOf(lVar14.f14331a) : null, lVar12, mVar4, 0, 0);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(-321572596);
                                                                    mVar4.f();
                                                                }
                                                                mVar4.y();
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        default:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                x1 x1Var5 = p3.n.f135158a;
                                                                h4.r.a aVar13 = h4.r.S;
                                                                h4.r rVarD3 = x2.d(aVar13, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar9 = j92.b.f97899b;
                                                                h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar9.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar5 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar5, 48);
                                                                int iHashCode3 = Long.hashCode(mVar5.getU());
                                                                i2 i2VarX3 = mVar5.x();
                                                                h4.r rVarC7 = h4.k.c(rVarC6, mVar5);
                                                                h5.g.V.getClass();
                                                                e0.a aVar14 = h5.g.a.f81805b;
                                                                if (mVar5.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar5.z();
                                                                if (mVar5.getT()) {
                                                                    mVar5.M(aVar14);
                                                                } else {
                                                                    mVar5.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA3, mVar5);
                                                                b4.c(h5.g.a.f81809f, i2VarX3, mVar5);
                                                                h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                                                                    v.h.z(iHashCode3, mVar5, iHashCode3, bVar6);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC7, mVar5);
                                                                u2 u2Var3 = u2.f22900a;
                                                                l72.f0.a aVar15 = l72.f0.a.f111000a;
                                                                x0.f23314a.getClass();
                                                                String strW = gl1.d.W(x0.Jd);
                                                                h4.r rVarC8 = c2.l.C(aVar13, eVar9.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB13 = mVar5.B(aVar7);
                                                                Object objQ5 = mVar5.q();
                                                                if (zB13) {
                                                                    objQ5 = new ku1.a(aVar7, 21);
                                                                    mVar5.K(objQ5);
                                                                } else {
                                                                    aVar6.getClass();
                                                                    if (objQ5 == p3.m.a.f135155b) {
                                                                        objQ5 = new ku1.a(aVar7, 21);
                                                                        mVar5.K(objQ5);
                                                                    }
                                                                }
                                                                aVar15.f(strW, rVarC8, false, (e23.a) objQ5, mVar5, 0, 4);
                                                                if (eVar6.b()) {
                                                                    mVar5.C(231180845);
                                                                    List<b11.l> list3 = eVar6.f116100q;
                                                                    b11.l lVar15 = eVar6.f116101r;
                                                                    y01.l.a(c2.l.C(aVar13, eVar9.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar15 != null ? Long.valueOf(lVar15.f14331a) : null, lVar12, mVar5, 0, 0);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(231569058);
                                                                    mVar5.f();
                                                                }
                                                                mVar5.y();
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            }), 3);
                                        }
                                        j21.m.a(f0Var, !eVar5.f116088e.d(), c22.i.b(R.string.delete_custom_food), c22.i.b(R.string.delete_food_this_cannot_be_undone), dVar3, eVar4, lVar8, lVar9, lVar10);
                                        break;
                                    case 1:
                                        f0 f0Var2 = (f0) obj4;
                                        f0Var2.getClass();
                                        zc.d dVar4 = dVar2;
                                        boolean z15 = dVar4.d().f196385a instanceof z0.c;
                                        final m21.e eVar6 = eVar3;
                                        final e23.a aVar5 = aVar3;
                                        if (z15 && dVar4.c().isEmpty()) {
                                            final int i110 = 1;
                                            f0.b(f0Var2, null, new z3.e(-1225270621, true, new e23.q() { // from class: l21.m
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    String strH;
                                                    String strH2;
                                                    String str;
                                                    int i111 = i110;
                                                    e23.a aVar6 = aVar5;
                                                    m21.e eVar7 = eVar6;
                                                    switch (i111) {
                                                        case 0:
                                                            p3.m mVar3 = (p3.m) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                x1 x1Var3 = p3.n.f135158a;
                                                                String str2 = eVar7.f116084a;
                                                                m21.b bVar = eVar7.f116088e;
                                                                if (str2.length() > 0) {
                                                                    mVar3.C(-350320041);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar3, R.string.lbl_no_results_found), y.Q(mVar3, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar3, 3072, 16);
                                                                    mVar3.f();
                                                                } else {
                                                                    mVar3.C(-349883685);
                                                                    if (bVar.d()) {
                                                                        mVar3.C(-349718703);
                                                                        mVar3.f();
                                                                        strH = null;
                                                                    } else {
                                                                        strH = sn.a.h(mVar3, -349822863, R.string.create_food, mVar3);
                                                                    }
                                                                    e23.a aVar7 = !bVar.d() ? aVar6 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar3, R.string.lbl_cannot_find_custom_foods), y.Q(mVar3, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar7, null, null, mVar3, 3072, 192);
                                                                    mVar3.f();
                                                                }
                                                            } else {
                                                                mVar3.e();
                                                            }
                                                            break;
                                                        case 1:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                String str3 = eVar7.f116084a;
                                                                m21.b bVar2 = eVar7.f116088e;
                                                                if (str3.length() > 0) {
                                                                    mVar4.C(890054817);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(890490460);
                                                                    if (bVar2.d()) {
                                                                        mVar4.C(890656155);
                                                                        mVar4.f();
                                                                        strH2 = null;
                                                                    } else {
                                                                        strH2 = sn.a.h(mVar4, 890551995, R.string.create_meal, mVar4);
                                                                    }
                                                                    e23.a aVar8 = !bVar2.d() ? aVar6 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar4, R.string.lbl_create_a_meal), y.Q(mVar4, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar8, null, null, mVar4, 3072, 192);
                                                                    mVar4.f();
                                                                }
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            break;
                                                        default:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                x1 x1Var5 = p3.n.f135158a;
                                                                String str4 = eVar7.f116084a;
                                                                m21.b bVar3 = eVar7.f116088e;
                                                                if (str4.length() > 0) {
                                                                    mVar5.C(1742034231);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar5, R.string.lbl_no_results_found), y.Q(mVar5, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar5, 3072, 16);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(1742470308);
                                                                    if (bVar3.d()) {
                                                                        mVar5.C(1742641521);
                                                                        mVar5.f();
                                                                        str = null;
                                                                    } else {
                                                                        mVar5.C(1742531595);
                                                                        x0.f23314a.getClass();
                                                                        String strW = gl1.d.W(x0.Jd);
                                                                        mVar5.f();
                                                                        str = strW;
                                                                    }
                                                                    e23.a aVar9 = !bVar3.d() ? aVar6 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    u4.d dVarA = ea.a(t62.c.f162799a);
                                                                    x0.f23314a.getClass();
                                                                    b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar9, null, null, mVar5, 3072, 192);
                                                                    mVar5.f();
                                                                }
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }), 3);
                                        } else if (!dVar4.c().isEmpty() && !eVar6.f116085b && !eVar6.f116088e.d()) {
                                            final int i111 = 1;
                                            final e23.l lVar13 = lVar7;
                                            f0.b(f0Var2, null, new z3.e(-552157862, true, new e23.q() { // from class: l21.n
                                                /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    int i112 = i111;
                                                    p3.m.a aVar6 = p3.m.f135153a;
                                                    m21.e eVar7 = eVar6;
                                                    e23.a aVar7 = aVar5;
                                                    switch (i112) {
                                                        case 0:
                                                            p3.m mVar3 = (p3.m) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                x1 x1Var3 = p3.n.f135158a;
                                                                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar8 = j92.b.f97899b;
                                                                float f14 = eVar8.f97920e;
                                                                h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar = h4.d.a.f81534l;
                                                                c2.j jVar = c2.j.f22691a;
                                                                float f15 = eVar8.f97920e;
                                                                jVar.getClass();
                                                                s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar3, 48);
                                                                int iHashCode = Long.hashCode(mVar3.getU());
                                                                i2 i2VarX = mVar3.x();
                                                                h4.r rVarC2 = h4.k.c(rVarC, mVar3);
                                                                h5.g.V.getClass();
                                                                e0.a aVar8 = h5.g.a.f81805b;
                                                                if (mVar3.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar3.z();
                                                                if (mVar3.getT()) {
                                                                    mVar3.M(aVar8);
                                                                } else {
                                                                    mVar3.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                                                                b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                                    v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                                                                u2 u2Var = u2.f22900a;
                                                                l72.f0.a aVar9 = l72.f0.a.f111000a;
                                                                String strQ = y.Q(mVar3, R.string.create_food);
                                                                boolean zB11 = mVar3.B(aVar7);
                                                                Object objQ3 = mVar3.q();
                                                                if (zB11) {
                                                                    objQ3 = new ku1.a(aVar7, 19);
                                                                    mVar3.K(objQ3);
                                                                } else {
                                                                    aVar6.getClass();
                                                                    if (objQ3 == p3.m.a.f135155b) {
                                                                        objQ3 = new ku1.a(aVar7, 19);
                                                                        mVar3.K(objQ3);
                                                                    }
                                                                }
                                                                aVar9.f(strQ, null, false, (e23.a) objQ3, mVar3, 0, 6);
                                                                if (eVar7.b()) {
                                                                    mVar3.C(-1562464720);
                                                                    List<b11.l> list = eVar7.f116100q;
                                                                    b11.l lVar14 = eVar7.f116101r;
                                                                    y01.l.a(null, list, lVar14 != null ? Long.valueOf(lVar14.f14331a) : null, lVar13, mVar3, 0, 1);
                                                                    mVar3.f();
                                                                } else {
                                                                    mVar3.C(-1562139902);
                                                                    mVar3.f();
                                                                }
                                                                mVar3.y();
                                                            } else {
                                                                mVar3.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        case 1:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                h4.r.a aVar10 = h4.r.S;
                                                                h4.r rVarD2 = x2.d(aVar10, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar9 = j92.b.f97899b;
                                                                h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar9.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar3 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar4, 48);
                                                                int iHashCode2 = Long.hashCode(mVar4.getU());
                                                                i2 i2VarX2 = mVar4.x();
                                                                h4.r rVarC4 = h4.k.c(rVarC3, mVar4);
                                                                h5.g.V.getClass();
                                                                e0.a aVar11 = h5.g.a.f81805b;
                                                                if (mVar4.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar4.z();
                                                                if (mVar4.getT()) {
                                                                    mVar4.M(aVar11);
                                                                } else {
                                                                    mVar4.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA2, mVar4);
                                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                                h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar4);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC4, mVar4);
                                                                u2 u2Var2 = u2.f22900a;
                                                                l72.f0.a aVar12 = l72.f0.a.f111000a;
                                                                String strQ2 = y.Q(mVar4, R.string.create_meal);
                                                                h4.r rVarC5 = c2.l.C(aVar10, eVar9.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB12 = mVar4.B(aVar7);
                                                                Object objQ4 = mVar4.q();
                                                                if (zB12) {
                                                                    objQ4 = new ku1.a(aVar7, 20);
                                                                    mVar4.K(objQ4);
                                                                } else {
                                                                    aVar6.getClass();
                                                                    if (objQ4 == p3.m.a.f135155b) {
                                                                        objQ4 = new ku1.a(aVar7, 20);
                                                                        mVar4.K(objQ4);
                                                                    }
                                                                }
                                                                aVar12.f(strQ2, rVarC5, false, (e23.a) objQ4, mVar4, 0, 4);
                                                                if (eVar7.b()) {
                                                                    mVar4.C(-321960809);
                                                                    List<b11.l> list2 = eVar7.f116100q;
                                                                    b11.l lVar15 = eVar7.f116101r;
                                                                    y01.l.a(c2.l.C(aVar10, eVar9.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar15 != null ? Long.valueOf(lVar15.f14331a) : null, lVar13, mVar4, 0, 0);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(-321572596);
                                                                    mVar4.f();
                                                                }
                                                                mVar4.y();
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        default:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                x1 x1Var5 = p3.n.f135158a;
                                                                h4.r.a aVar13 = h4.r.S;
                                                                h4.r rVarD3 = x2.d(aVar13, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar10 = j92.b.f97899b;
                                                                h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar10.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar5 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar5, 48);
                                                                int iHashCode3 = Long.hashCode(mVar5.getU());
                                                                i2 i2VarX3 = mVar5.x();
                                                                h4.r rVarC7 = h4.k.c(rVarC6, mVar5);
                                                                h5.g.V.getClass();
                                                                e0.a aVar14 = h5.g.a.f81805b;
                                                                if (mVar5.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar5.z();
                                                                if (mVar5.getT()) {
                                                                    mVar5.M(aVar14);
                                                                } else {
                                                                    mVar5.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA3, mVar5);
                                                                b4.c(h5.g.a.f81809f, i2VarX3, mVar5);
                                                                h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                                                                    v.h.z(iHashCode3, mVar5, iHashCode3, bVar6);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC7, mVar5);
                                                                u2 u2Var3 = u2.f22900a;
                                                                l72.f0.a aVar15 = l72.f0.a.f111000a;
                                                                x0.f23314a.getClass();
                                                                String strW = gl1.d.W(x0.Jd);
                                                                h4.r rVarC8 = c2.l.C(aVar13, eVar10.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB13 = mVar5.B(aVar7);
                                                                Object objQ5 = mVar5.q();
                                                                if (zB13) {
                                                                    objQ5 = new ku1.a(aVar7, 21);
                                                                    mVar5.K(objQ5);
                                                                } else {
                                                                    aVar6.getClass();
                                                                    if (objQ5 == p3.m.a.f135155b) {
                                                                        objQ5 = new ku1.a(aVar7, 21);
                                                                        mVar5.K(objQ5);
                                                                    }
                                                                }
                                                                aVar15.f(strW, rVarC8, false, (e23.a) objQ5, mVar5, 0, 4);
                                                                if (eVar7.b()) {
                                                                    mVar5.C(231180845);
                                                                    List<b11.l> list3 = eVar7.f116100q;
                                                                    b11.l lVar16 = eVar7.f116101r;
                                                                    y01.l.a(c2.l.C(aVar13, eVar10.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar16 != null ? Long.valueOf(lVar16.f14331a) : null, lVar13, mVar5, 0, 0);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(231569058);
                                                                    mVar5.f();
                                                                }
                                                                mVar5.y();
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            }), 3);
                                        }
                                        j21.m.a(f0Var2, !eVar6.f116088e.d(), c22.i.b(R.string.delete_custom_meal), c22.i.b(R.string.delete_meal_this_cannot_be_undone), dVar4, eVar4, lVar8, lVar9, lVar10);
                                        break;
                                    default:
                                        f0 f0Var3 = (f0) obj4;
                                        f0Var3.getClass();
                                        zc.d dVar5 = dVar2;
                                        boolean z16 = dVar5.d().f196385a instanceof z0.c;
                                        final m21.e eVar7 = eVar3;
                                        final e23.a aVar6 = aVar3;
                                        if (z16 && dVar5.c().isEmpty()) {
                                            final int i24 = 2;
                                            f0.b(f0Var3, null, new z3.e(1835197901, true, new e23.q() { // from class: l21.m
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    String strH;
                                                    String strH2;
                                                    String str;
                                                    int i112 = i24;
                                                    e23.a aVar7 = aVar6;
                                                    m21.e eVar8 = eVar7;
                                                    switch (i112) {
                                                        case 0:
                                                            p3.m mVar3 = (p3.m) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                x1 x1Var3 = p3.n.f135158a;
                                                                String str2 = eVar8.f116084a;
                                                                m21.b bVar = eVar8.f116088e;
                                                                if (str2.length() > 0) {
                                                                    mVar3.C(-350320041);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar3, R.string.lbl_no_results_found), y.Q(mVar3, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar3, 3072, 16);
                                                                    mVar3.f();
                                                                } else {
                                                                    mVar3.C(-349883685);
                                                                    if (bVar.d()) {
                                                                        mVar3.C(-349718703);
                                                                        mVar3.f();
                                                                        strH = null;
                                                                    } else {
                                                                        strH = sn.a.h(mVar3, -349822863, R.string.create_food, mVar3);
                                                                    }
                                                                    e23.a aVar8 = !bVar.d() ? aVar7 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar3, R.string.lbl_cannot_find_custom_foods), y.Q(mVar3, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar8, null, null, mVar3, 3072, 192);
                                                                    mVar3.f();
                                                                }
                                                            } else {
                                                                mVar3.e();
                                                            }
                                                            break;
                                                        case 1:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                String str3 = eVar8.f116084a;
                                                                m21.b bVar2 = eVar8.f116088e;
                                                                if (str3.length() > 0) {
                                                                    mVar4.C(890054817);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(890490460);
                                                                    if (bVar2.d()) {
                                                                        mVar4.C(890656155);
                                                                        mVar4.f();
                                                                        strH2 = null;
                                                                    } else {
                                                                        strH2 = sn.a.h(mVar4, 890551995, R.string.create_meal, mVar4);
                                                                    }
                                                                    e23.a aVar9 = !bVar2.d() ? aVar7 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar4, R.string.lbl_create_a_meal), y.Q(mVar4, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar9, null, null, mVar4, 3072, 192);
                                                                    mVar4.f();
                                                                }
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            break;
                                                        default:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                x1 x1Var5 = p3.n.f135158a;
                                                                String str4 = eVar8.f116084a;
                                                                m21.b bVar3 = eVar8.f116088e;
                                                                if (str4.length() > 0) {
                                                                    mVar5.C(1742034231);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar5, R.string.lbl_no_results_found), y.Q(mVar5, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar5, 3072, 16);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(1742470308);
                                                                    if (bVar3.d()) {
                                                                        mVar5.C(1742641521);
                                                                        mVar5.f();
                                                                        str = null;
                                                                    } else {
                                                                        mVar5.C(1742531595);
                                                                        x0.f23314a.getClass();
                                                                        String strW = gl1.d.W(x0.Jd);
                                                                        mVar5.f();
                                                                        str = strW;
                                                                    }
                                                                    e23.a aVar10 = !bVar3.d() ? aVar7 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    u4.d dVarA = ea.a(t62.c.f162799a);
                                                                    x0.f23314a.getClass();
                                                                    b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar10, null, null, mVar5, 3072, 192);
                                                                    mVar5.f();
                                                                }
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }), 3);
                                        } else if (!dVar5.c().isEmpty() && !eVar7.f116085b && !eVar7.f116088e.d()) {
                                            final int i25 = 2;
                                            final e23.l lVar14 = lVar7;
                                            f0.b(f0Var3, null, new z3.e(-783051516, true, new e23.q() { // from class: l21.n
                                                /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    int i112 = i25;
                                                    p3.m.a aVar7 = p3.m.f135153a;
                                                    m21.e eVar8 = eVar7;
                                                    e23.a aVar8 = aVar6;
                                                    switch (i112) {
                                                        case 0:
                                                            p3.m mVar3 = (p3.m) obj6;
                                                            int iIntValue3 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                x1 x1Var3 = p3.n.f135158a;
                                                                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar9 = j92.b.f97899b;
                                                                float f14 = eVar9.f97920e;
                                                                h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar = h4.d.a.f81534l;
                                                                c2.j jVar = c2.j.f22691a;
                                                                float f15 = eVar9.f97920e;
                                                                jVar.getClass();
                                                                s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar3, 48);
                                                                int iHashCode = Long.hashCode(mVar3.getU());
                                                                i2 i2VarX = mVar3.x();
                                                                h4.r rVarC2 = h4.k.c(rVarC, mVar3);
                                                                h5.g.V.getClass();
                                                                e0.a aVar9 = h5.g.a.f81805b;
                                                                if (mVar3.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar3.z();
                                                                if (mVar3.getT()) {
                                                                    mVar3.M(aVar9);
                                                                } else {
                                                                    mVar3.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                                                                b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                                    v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                                                                u2 u2Var = u2.f22900a;
                                                                l72.f0.a aVar10 = l72.f0.a.f111000a;
                                                                String strQ = y.Q(mVar3, R.string.create_food);
                                                                boolean zB11 = mVar3.B(aVar8);
                                                                Object objQ3 = mVar3.q();
                                                                if (zB11) {
                                                                    objQ3 = new ku1.a(aVar8, 19);
                                                                    mVar3.K(objQ3);
                                                                } else {
                                                                    aVar7.getClass();
                                                                    if (objQ3 == p3.m.a.f135155b) {
                                                                        objQ3 = new ku1.a(aVar8, 19);
                                                                        mVar3.K(objQ3);
                                                                    }
                                                                }
                                                                aVar10.f(strQ, null, false, (e23.a) objQ3, mVar3, 0, 6);
                                                                if (eVar8.b()) {
                                                                    mVar3.C(-1562464720);
                                                                    List<b11.l> list = eVar8.f116100q;
                                                                    b11.l lVar15 = eVar8.f116101r;
                                                                    y01.l.a(null, list, lVar15 != null ? Long.valueOf(lVar15.f14331a) : null, lVar14, mVar3, 0, 1);
                                                                    mVar3.f();
                                                                } else {
                                                                    mVar3.C(-1562139902);
                                                                    mVar3.f();
                                                                }
                                                                mVar3.y();
                                                            } else {
                                                                mVar3.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        case 1:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                h4.r.a aVar11 = h4.r.S;
                                                                h4.r rVarD2 = x2.d(aVar11, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar10 = j92.b.f97899b;
                                                                h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar10.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar3 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar4, 48);
                                                                int iHashCode2 = Long.hashCode(mVar4.getU());
                                                                i2 i2VarX2 = mVar4.x();
                                                                h4.r rVarC4 = h4.k.c(rVarC3, mVar4);
                                                                h5.g.V.getClass();
                                                                e0.a aVar12 = h5.g.a.f81805b;
                                                                if (mVar4.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar4.z();
                                                                if (mVar4.getT()) {
                                                                    mVar4.M(aVar12);
                                                                } else {
                                                                    mVar4.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA2, mVar4);
                                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                                h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar4);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC4, mVar4);
                                                                u2 u2Var2 = u2.f22900a;
                                                                l72.f0.a aVar13 = l72.f0.a.f111000a;
                                                                String strQ2 = y.Q(mVar4, R.string.create_meal);
                                                                h4.r rVarC5 = c2.l.C(aVar11, eVar10.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB12 = mVar4.B(aVar8);
                                                                Object objQ4 = mVar4.q();
                                                                if (zB12) {
                                                                    objQ4 = new ku1.a(aVar8, 20);
                                                                    mVar4.K(objQ4);
                                                                } else {
                                                                    aVar7.getClass();
                                                                    if (objQ4 == p3.m.a.f135155b) {
                                                                        objQ4 = new ku1.a(aVar8, 20);
                                                                        mVar4.K(objQ4);
                                                                    }
                                                                }
                                                                aVar13.f(strQ2, rVarC5, false, (e23.a) objQ4, mVar4, 0, 4);
                                                                if (eVar8.b()) {
                                                                    mVar4.C(-321960809);
                                                                    List<b11.l> list2 = eVar8.f116100q;
                                                                    b11.l lVar16 = eVar8.f116101r;
                                                                    y01.l.a(c2.l.C(aVar11, eVar10.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar16 != null ? Long.valueOf(lVar16.f14331a) : null, lVar14, mVar4, 0, 0);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(-321572596);
                                                                    mVar4.f();
                                                                }
                                                                mVar4.y();
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        default:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                x1 x1Var5 = p3.n.f135158a;
                                                                h4.r.a aVar14 = h4.r.S;
                                                                h4.r rVarD3 = x2.d(aVar14, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar11 = j92.b.f97899b;
                                                                h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar11.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar5 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar5, 48);
                                                                int iHashCode3 = Long.hashCode(mVar5.getU());
                                                                i2 i2VarX3 = mVar5.x();
                                                                h4.r rVarC7 = h4.k.c(rVarC6, mVar5);
                                                                h5.g.V.getClass();
                                                                e0.a aVar15 = h5.g.a.f81805b;
                                                                if (mVar5.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar5.z();
                                                                if (mVar5.getT()) {
                                                                    mVar5.M(aVar15);
                                                                } else {
                                                                    mVar5.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA3, mVar5);
                                                                b4.c(h5.g.a.f81809f, i2VarX3, mVar5);
                                                                h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                                                                    v.h.z(iHashCode3, mVar5, iHashCode3, bVar6);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC7, mVar5);
                                                                u2 u2Var3 = u2.f22900a;
                                                                l72.f0.a aVar16 = l72.f0.a.f111000a;
                                                                x0.f23314a.getClass();
                                                                String strW = gl1.d.W(x0.Jd);
                                                                h4.r rVarC8 = c2.l.C(aVar14, eVar11.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB13 = mVar5.B(aVar8);
                                                                Object objQ5 = mVar5.q();
                                                                if (zB13) {
                                                                    objQ5 = new ku1.a(aVar8, 21);
                                                                    mVar5.K(objQ5);
                                                                } else {
                                                                    aVar7.getClass();
                                                                    if (objQ5 == p3.m.a.f135155b) {
                                                                        objQ5 = new ku1.a(aVar8, 21);
                                                                        mVar5.K(objQ5);
                                                                    }
                                                                }
                                                                aVar16.f(strW, rVarC8, false, (e23.a) objQ5, mVar5, 0, 4);
                                                                if (eVar8.b()) {
                                                                    mVar5.C(231180845);
                                                                    List<b11.l> list3 = eVar8.f116100q;
                                                                    b11.l lVar17 = eVar8.f116101r;
                                                                    y01.l.a(c2.l.C(aVar14, eVar11.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar17 != null ? Long.valueOf(lVar17.f14331a) : null, lVar14, mVar5, 0, 0);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(231569058);
                                                                    mVar5.f();
                                                                }
                                                                mVar5.y();
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            }), 3);
                                        }
                                        boolean z17 = !(eVar7.f116088e instanceof m21.b.C2206b);
                                        x0.f23314a.getClass();
                                        j21.m.a(f0Var3, z17, g2.b(x0.Qd), g2.b(x0.f23598qf), dVar5, eVar4, lVar8, lVar9, lVar10);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(lVar11);
                        objQ2 = lVar11;
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            final int i18 = 1;
                            e23.l lVar12 = new e23.l() { // from class: l21.l
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    switch (i18) {
                                        case 0:
                                            f0 f0Var = (f0) obj4;
                                            f0Var.getClass();
                                            zc.d dVar3 = dVar2;
                                            boolean z14 = dVar3.d().f196385a instanceof z0.c;
                                            final m21.e eVar5 = eVar3;
                                            final e23.a aVar4 = aVar3;
                                            if (z14 && dVar3.c().isEmpty()) {
                                                final int i19 = 0;
                                                f0.b(f0Var, null, new z3.e(-1173699411, true, new e23.q() { // from class: l21.m
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        String strH;
                                                        String strH2;
                                                        String str;
                                                        int i112 = i19;
                                                        e23.a aVar7 = aVar4;
                                                        m21.e eVar8 = eVar5;
                                                        switch (i112) {
                                                            case 0:
                                                                p3.m mVar3 = (p3.m) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    x1 x1Var3 = p3.n.f135158a;
                                                                    String str2 = eVar8.f116084a;
                                                                    m21.b bVar = eVar8.f116088e;
                                                                    if (str2.length() > 0) {
                                                                        mVar3.C(-350320041);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar3, R.string.lbl_no_results_found), y.Q(mVar3, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar3, 3072, 16);
                                                                        mVar3.f();
                                                                    } else {
                                                                        mVar3.C(-349883685);
                                                                        if (bVar.d()) {
                                                                            mVar3.C(-349718703);
                                                                            mVar3.f();
                                                                            strH = null;
                                                                        } else {
                                                                            strH = sn.a.h(mVar3, -349822863, R.string.create_food, mVar3);
                                                                        }
                                                                        e23.a aVar8 = !bVar.d() ? aVar7 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar3, R.string.lbl_cannot_find_custom_foods), y.Q(mVar3, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar8, null, null, mVar3, 3072, 192);
                                                                        mVar3.f();
                                                                    }
                                                                } else {
                                                                    mVar3.e();
                                                                }
                                                                break;
                                                            case 1:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    String str3 = eVar8.f116084a;
                                                                    m21.b bVar2 = eVar8.f116088e;
                                                                    if (str3.length() > 0) {
                                                                        mVar4.C(890054817);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(890490460);
                                                                        if (bVar2.d()) {
                                                                            mVar4.C(890656155);
                                                                            mVar4.f();
                                                                            strH2 = null;
                                                                        } else {
                                                                            strH2 = sn.a.h(mVar4, 890551995, R.string.create_meal, mVar4);
                                                                        }
                                                                        e23.a aVar9 = !bVar2.d() ? aVar7 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar4, R.string.lbl_create_a_meal), y.Q(mVar4, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar9, null, null, mVar4, 3072, 192);
                                                                        mVar4.f();
                                                                    }
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                break;
                                                            default:
                                                                p3.m mVar5 = (p3.m) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                    x1 x1Var5 = p3.n.f135158a;
                                                                    String str4 = eVar8.f116084a;
                                                                    m21.b bVar3 = eVar8.f116088e;
                                                                    if (str4.length() > 0) {
                                                                        mVar5.C(1742034231);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar5, R.string.lbl_no_results_found), y.Q(mVar5, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar5, 3072, 16);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(1742470308);
                                                                        if (bVar3.d()) {
                                                                            mVar5.C(1742641521);
                                                                            mVar5.f();
                                                                            str = null;
                                                                        } else {
                                                                            mVar5.C(1742531595);
                                                                            x0.f23314a.getClass();
                                                                            String strW = gl1.d.W(x0.Jd);
                                                                            mVar5.f();
                                                                            str = strW;
                                                                        }
                                                                        e23.a aVar10 = !bVar3.d() ? aVar7 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        u4.d dVarA = ea.a(t62.c.f162799a);
                                                                        x0.f23314a.getClass();
                                                                        b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar10, null, null, mVar5, 3072, 192);
                                                                        mVar5.f();
                                                                    }
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }), 3);
                                            } else if (!dVar3.c().isEmpty() && !eVar5.f116085b && !eVar5.f116088e.d()) {
                                                final int i110 = 0;
                                                final e23.l lVar13 = lVar7;
                                                f0.b(f0Var, null, new z3.e(-500586652, true, new e23.q() { // from class: l21.n
                                                    /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                    /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                    /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        int i112 = i110;
                                                        p3.m.a aVar7 = p3.m.f135153a;
                                                        m21.e eVar8 = eVar5;
                                                        e23.a aVar8 = aVar4;
                                                        switch (i112) {
                                                            case 0:
                                                                p3.m mVar3 = (p3.m) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    x1 x1Var3 = p3.n.f135158a;
                                                                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar9 = j92.b.f97899b;
                                                                    float f14 = eVar9.f97920e;
                                                                    h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                                    c2.j jVar = c2.j.f22691a;
                                                                    float f15 = eVar9.f97920e;
                                                                    jVar.getClass();
                                                                    s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar3, 48);
                                                                    int iHashCode = Long.hashCode(mVar3.getU());
                                                                    i2 i2VarX = mVar3.x();
                                                                    h4.r rVarC2 = h4.k.c(rVarC, mVar3);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar9 = h5.g.a.f81805b;
                                                                    if (mVar3.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar3.z();
                                                                    if (mVar3.getT()) {
                                                                        mVar3.M(aVar9);
                                                                    } else {
                                                                        mVar3.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                                        v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                                                                    u2 u2Var = u2.f22900a;
                                                                    l72.f0.a aVar10 = l72.f0.a.f111000a;
                                                                    String strQ = y.Q(mVar3, R.string.create_food);
                                                                    boolean zB11 = mVar3.B(aVar8);
                                                                    Object objQ3 = mVar3.q();
                                                                    if (zB11) {
                                                                        objQ3 = new ku1.a(aVar8, 19);
                                                                        mVar3.K(objQ3);
                                                                    } else {
                                                                        aVar7.getClass();
                                                                        if (objQ3 == p3.m.a.f135155b) {
                                                                            objQ3 = new ku1.a(aVar8, 19);
                                                                            mVar3.K(objQ3);
                                                                        }
                                                                    }
                                                                    aVar10.f(strQ, null, false, (e23.a) objQ3, mVar3, 0, 6);
                                                                    if (eVar8.b()) {
                                                                        mVar3.C(-1562464720);
                                                                        List<b11.l> list = eVar8.f116100q;
                                                                        b11.l lVar15 = eVar8.f116101r;
                                                                        y01.l.a(null, list, lVar15 != null ? Long.valueOf(lVar15.f14331a) : null, lVar13, mVar3, 0, 1);
                                                                        mVar3.f();
                                                                    } else {
                                                                        mVar3.C(-1562139902);
                                                                        mVar3.f();
                                                                    }
                                                                    mVar3.y();
                                                                } else {
                                                                    mVar3.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            case 1:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    h4.r.a aVar11 = h4.r.S;
                                                                    h4.r rVarD2 = x2.d(aVar11, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar10 = j92.b.f97899b;
                                                                    h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar10.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar3 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar4, 48);
                                                                    int iHashCode2 = Long.hashCode(mVar4.getU());
                                                                    i2 i2VarX2 = mVar4.x();
                                                                    h4.r rVarC4 = h4.k.c(rVarC3, mVar4);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar12 = h5.g.a.f81805b;
                                                                    if (mVar4.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar4.z();
                                                                    if (mVar4.getT()) {
                                                                        mVar4.M(aVar12);
                                                                    } else {
                                                                        mVar4.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA2, mVar4);
                                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar4);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC4, mVar4);
                                                                    u2 u2Var2 = u2.f22900a;
                                                                    l72.f0.a aVar13 = l72.f0.a.f111000a;
                                                                    String strQ2 = y.Q(mVar4, R.string.create_meal);
                                                                    h4.r rVarC5 = c2.l.C(aVar11, eVar10.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB12 = mVar4.B(aVar8);
                                                                    Object objQ4 = mVar4.q();
                                                                    if (zB12) {
                                                                        objQ4 = new ku1.a(aVar8, 20);
                                                                        mVar4.K(objQ4);
                                                                    } else {
                                                                        aVar7.getClass();
                                                                        if (objQ4 == p3.m.a.f135155b) {
                                                                            objQ4 = new ku1.a(aVar8, 20);
                                                                            mVar4.K(objQ4);
                                                                        }
                                                                    }
                                                                    aVar13.f(strQ2, rVarC5, false, (e23.a) objQ4, mVar4, 0, 4);
                                                                    if (eVar8.b()) {
                                                                        mVar4.C(-321960809);
                                                                        List<b11.l> list2 = eVar8.f116100q;
                                                                        b11.l lVar16 = eVar8.f116101r;
                                                                        y01.l.a(c2.l.C(aVar11, eVar10.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar16 != null ? Long.valueOf(lVar16.f14331a) : null, lVar13, mVar4, 0, 0);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(-321572596);
                                                                        mVar4.f();
                                                                    }
                                                                    mVar4.y();
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            default:
                                                                p3.m mVar5 = (p3.m) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                    x1 x1Var5 = p3.n.f135158a;
                                                                    h4.r.a aVar14 = h4.r.S;
                                                                    h4.r rVarD3 = x2.d(aVar14, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar11 = j92.b.f97899b;
                                                                    h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar11.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar5 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar5, 48);
                                                                    int iHashCode3 = Long.hashCode(mVar5.getU());
                                                                    i2 i2VarX3 = mVar5.x();
                                                                    h4.r rVarC7 = h4.k.c(rVarC6, mVar5);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar15 = h5.g.a.f81805b;
                                                                    if (mVar5.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar5.z();
                                                                    if (mVar5.getT()) {
                                                                        mVar5.M(aVar15);
                                                                    } else {
                                                                        mVar5.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA3, mVar5);
                                                                    b4.c(h5.g.a.f81809f, i2VarX3, mVar5);
                                                                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                                                                        v.h.z(iHashCode3, mVar5, iHashCode3, bVar6);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC7, mVar5);
                                                                    u2 u2Var3 = u2.f22900a;
                                                                    l72.f0.a aVar16 = l72.f0.a.f111000a;
                                                                    x0.f23314a.getClass();
                                                                    String strW = gl1.d.W(x0.Jd);
                                                                    h4.r rVarC8 = c2.l.C(aVar14, eVar11.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB13 = mVar5.B(aVar8);
                                                                    Object objQ5 = mVar5.q();
                                                                    if (zB13) {
                                                                        objQ5 = new ku1.a(aVar8, 21);
                                                                        mVar5.K(objQ5);
                                                                    } else {
                                                                        aVar7.getClass();
                                                                        if (objQ5 == p3.m.a.f135155b) {
                                                                            objQ5 = new ku1.a(aVar8, 21);
                                                                            mVar5.K(objQ5);
                                                                        }
                                                                    }
                                                                    aVar16.f(strW, rVarC8, false, (e23.a) objQ5, mVar5, 0, 4);
                                                                    if (eVar8.b()) {
                                                                        mVar5.C(231180845);
                                                                        List<b11.l> list3 = eVar8.f116100q;
                                                                        b11.l lVar17 = eVar8.f116101r;
                                                                        y01.l.a(c2.l.C(aVar14, eVar11.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar17 != null ? Long.valueOf(lVar17.f14331a) : null, lVar13, mVar5, 0, 0);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(231569058);
                                                                        mVar5.f();
                                                                    }
                                                                    mVar5.y();
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                        }
                                                    }
                                                }), 3);
                                            }
                                            j21.m.a(f0Var, !eVar5.f116088e.d(), c22.i.b(R.string.delete_custom_food), c22.i.b(R.string.delete_food_this_cannot_be_undone), dVar3, eVar4, lVar8, lVar9, lVar10);
                                            break;
                                        case 1:
                                            f0 f0Var2 = (f0) obj4;
                                            f0Var2.getClass();
                                            zc.d dVar4 = dVar2;
                                            boolean z15 = dVar4.d().f196385a instanceof z0.c;
                                            final m21.e eVar6 = eVar3;
                                            final e23.a aVar5 = aVar3;
                                            if (z15 && dVar4.c().isEmpty()) {
                                                final int i111 = 1;
                                                f0.b(f0Var2, null, new z3.e(-1225270621, true, new e23.q() { // from class: l21.m
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        String strH;
                                                        String strH2;
                                                        String str;
                                                        int i112 = i111;
                                                        e23.a aVar7 = aVar5;
                                                        m21.e eVar8 = eVar6;
                                                        switch (i112) {
                                                            case 0:
                                                                p3.m mVar3 = (p3.m) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    x1 x1Var3 = p3.n.f135158a;
                                                                    String str2 = eVar8.f116084a;
                                                                    m21.b bVar = eVar8.f116088e;
                                                                    if (str2.length() > 0) {
                                                                        mVar3.C(-350320041);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar3, R.string.lbl_no_results_found), y.Q(mVar3, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar3, 3072, 16);
                                                                        mVar3.f();
                                                                    } else {
                                                                        mVar3.C(-349883685);
                                                                        if (bVar.d()) {
                                                                            mVar3.C(-349718703);
                                                                            mVar3.f();
                                                                            strH = null;
                                                                        } else {
                                                                            strH = sn.a.h(mVar3, -349822863, R.string.create_food, mVar3);
                                                                        }
                                                                        e23.a aVar8 = !bVar.d() ? aVar7 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar3, R.string.lbl_cannot_find_custom_foods), y.Q(mVar3, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar8, null, null, mVar3, 3072, 192);
                                                                        mVar3.f();
                                                                    }
                                                                } else {
                                                                    mVar3.e();
                                                                }
                                                                break;
                                                            case 1:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    String str3 = eVar8.f116084a;
                                                                    m21.b bVar2 = eVar8.f116088e;
                                                                    if (str3.length() > 0) {
                                                                        mVar4.C(890054817);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(890490460);
                                                                        if (bVar2.d()) {
                                                                            mVar4.C(890656155);
                                                                            mVar4.f();
                                                                            strH2 = null;
                                                                        } else {
                                                                            strH2 = sn.a.h(mVar4, 890551995, R.string.create_meal, mVar4);
                                                                        }
                                                                        e23.a aVar9 = !bVar2.d() ? aVar7 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar4, R.string.lbl_create_a_meal), y.Q(mVar4, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar9, null, null, mVar4, 3072, 192);
                                                                        mVar4.f();
                                                                    }
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                break;
                                                            default:
                                                                p3.m mVar5 = (p3.m) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                    x1 x1Var5 = p3.n.f135158a;
                                                                    String str4 = eVar8.f116084a;
                                                                    m21.b bVar3 = eVar8.f116088e;
                                                                    if (str4.length() > 0) {
                                                                        mVar5.C(1742034231);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar5, R.string.lbl_no_results_found), y.Q(mVar5, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar5, 3072, 16);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(1742470308);
                                                                        if (bVar3.d()) {
                                                                            mVar5.C(1742641521);
                                                                            mVar5.f();
                                                                            str = null;
                                                                        } else {
                                                                            mVar5.C(1742531595);
                                                                            x0.f23314a.getClass();
                                                                            String strW = gl1.d.W(x0.Jd);
                                                                            mVar5.f();
                                                                            str = strW;
                                                                        }
                                                                        e23.a aVar10 = !bVar3.d() ? aVar7 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        u4.d dVarA = ea.a(t62.c.f162799a);
                                                                        x0.f23314a.getClass();
                                                                        b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar10, null, null, mVar5, 3072, 192);
                                                                        mVar5.f();
                                                                    }
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }), 3);
                                            } else if (!dVar4.c().isEmpty() && !eVar6.f116085b && !eVar6.f116088e.d()) {
                                                final int i112 = 1;
                                                final e23.l lVar14 = lVar7;
                                                f0.b(f0Var2, null, new z3.e(-552157862, true, new e23.q() { // from class: l21.n
                                                    /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                    /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                    /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        int i113 = i112;
                                                        p3.m.a aVar7 = p3.m.f135153a;
                                                        m21.e eVar8 = eVar6;
                                                        e23.a aVar8 = aVar5;
                                                        switch (i113) {
                                                            case 0:
                                                                p3.m mVar3 = (p3.m) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    x1 x1Var3 = p3.n.f135158a;
                                                                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar9 = j92.b.f97899b;
                                                                    float f14 = eVar9.f97920e;
                                                                    h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                                    c2.j jVar = c2.j.f22691a;
                                                                    float f15 = eVar9.f97920e;
                                                                    jVar.getClass();
                                                                    s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar3, 48);
                                                                    int iHashCode = Long.hashCode(mVar3.getU());
                                                                    i2 i2VarX = mVar3.x();
                                                                    h4.r rVarC2 = h4.k.c(rVarC, mVar3);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar9 = h5.g.a.f81805b;
                                                                    if (mVar3.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar3.z();
                                                                    if (mVar3.getT()) {
                                                                        mVar3.M(aVar9);
                                                                    } else {
                                                                        mVar3.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                                        v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                                                                    u2 u2Var = u2.f22900a;
                                                                    l72.f0.a aVar10 = l72.f0.a.f111000a;
                                                                    String strQ = y.Q(mVar3, R.string.create_food);
                                                                    boolean zB11 = mVar3.B(aVar8);
                                                                    Object objQ3 = mVar3.q();
                                                                    if (zB11) {
                                                                        objQ3 = new ku1.a(aVar8, 19);
                                                                        mVar3.K(objQ3);
                                                                    } else {
                                                                        aVar7.getClass();
                                                                        if (objQ3 == p3.m.a.f135155b) {
                                                                            objQ3 = new ku1.a(aVar8, 19);
                                                                            mVar3.K(objQ3);
                                                                        }
                                                                    }
                                                                    aVar10.f(strQ, null, false, (e23.a) objQ3, mVar3, 0, 6);
                                                                    if (eVar8.b()) {
                                                                        mVar3.C(-1562464720);
                                                                        List<b11.l> list = eVar8.f116100q;
                                                                        b11.l lVar15 = eVar8.f116101r;
                                                                        y01.l.a(null, list, lVar15 != null ? Long.valueOf(lVar15.f14331a) : null, lVar14, mVar3, 0, 1);
                                                                        mVar3.f();
                                                                    } else {
                                                                        mVar3.C(-1562139902);
                                                                        mVar3.f();
                                                                    }
                                                                    mVar3.y();
                                                                } else {
                                                                    mVar3.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            case 1:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    h4.r.a aVar11 = h4.r.S;
                                                                    h4.r rVarD2 = x2.d(aVar11, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar10 = j92.b.f97899b;
                                                                    h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar10.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar3 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar4, 48);
                                                                    int iHashCode2 = Long.hashCode(mVar4.getU());
                                                                    i2 i2VarX2 = mVar4.x();
                                                                    h4.r rVarC4 = h4.k.c(rVarC3, mVar4);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar12 = h5.g.a.f81805b;
                                                                    if (mVar4.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar4.z();
                                                                    if (mVar4.getT()) {
                                                                        mVar4.M(aVar12);
                                                                    } else {
                                                                        mVar4.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA2, mVar4);
                                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar4);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC4, mVar4);
                                                                    u2 u2Var2 = u2.f22900a;
                                                                    l72.f0.a aVar13 = l72.f0.a.f111000a;
                                                                    String strQ2 = y.Q(mVar4, R.string.create_meal);
                                                                    h4.r rVarC5 = c2.l.C(aVar11, eVar10.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB12 = mVar4.B(aVar8);
                                                                    Object objQ4 = mVar4.q();
                                                                    if (zB12) {
                                                                        objQ4 = new ku1.a(aVar8, 20);
                                                                        mVar4.K(objQ4);
                                                                    } else {
                                                                        aVar7.getClass();
                                                                        if (objQ4 == p3.m.a.f135155b) {
                                                                            objQ4 = new ku1.a(aVar8, 20);
                                                                            mVar4.K(objQ4);
                                                                        }
                                                                    }
                                                                    aVar13.f(strQ2, rVarC5, false, (e23.a) objQ4, mVar4, 0, 4);
                                                                    if (eVar8.b()) {
                                                                        mVar4.C(-321960809);
                                                                        List<b11.l> list2 = eVar8.f116100q;
                                                                        b11.l lVar16 = eVar8.f116101r;
                                                                        y01.l.a(c2.l.C(aVar11, eVar10.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar16 != null ? Long.valueOf(lVar16.f14331a) : null, lVar14, mVar4, 0, 0);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(-321572596);
                                                                        mVar4.f();
                                                                    }
                                                                    mVar4.y();
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            default:
                                                                p3.m mVar5 = (p3.m) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                    x1 x1Var5 = p3.n.f135158a;
                                                                    h4.r.a aVar14 = h4.r.S;
                                                                    h4.r rVarD3 = x2.d(aVar14, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar11 = j92.b.f97899b;
                                                                    h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar11.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar5 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar5, 48);
                                                                    int iHashCode3 = Long.hashCode(mVar5.getU());
                                                                    i2 i2VarX3 = mVar5.x();
                                                                    h4.r rVarC7 = h4.k.c(rVarC6, mVar5);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar15 = h5.g.a.f81805b;
                                                                    if (mVar5.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar5.z();
                                                                    if (mVar5.getT()) {
                                                                        mVar5.M(aVar15);
                                                                    } else {
                                                                        mVar5.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA3, mVar5);
                                                                    b4.c(h5.g.a.f81809f, i2VarX3, mVar5);
                                                                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                                                                        v.h.z(iHashCode3, mVar5, iHashCode3, bVar6);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC7, mVar5);
                                                                    u2 u2Var3 = u2.f22900a;
                                                                    l72.f0.a aVar16 = l72.f0.a.f111000a;
                                                                    x0.f23314a.getClass();
                                                                    String strW = gl1.d.W(x0.Jd);
                                                                    h4.r rVarC8 = c2.l.C(aVar14, eVar11.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB13 = mVar5.B(aVar8);
                                                                    Object objQ5 = mVar5.q();
                                                                    if (zB13) {
                                                                        objQ5 = new ku1.a(aVar8, 21);
                                                                        mVar5.K(objQ5);
                                                                    } else {
                                                                        aVar7.getClass();
                                                                        if (objQ5 == p3.m.a.f135155b) {
                                                                            objQ5 = new ku1.a(aVar8, 21);
                                                                            mVar5.K(objQ5);
                                                                        }
                                                                    }
                                                                    aVar16.f(strW, rVarC8, false, (e23.a) objQ5, mVar5, 0, 4);
                                                                    if (eVar8.b()) {
                                                                        mVar5.C(231180845);
                                                                        List<b11.l> list3 = eVar8.f116100q;
                                                                        b11.l lVar17 = eVar8.f116101r;
                                                                        y01.l.a(c2.l.C(aVar14, eVar11.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar17 != null ? Long.valueOf(lVar17.f14331a) : null, lVar14, mVar5, 0, 0);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(231569058);
                                                                        mVar5.f();
                                                                    }
                                                                    mVar5.y();
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                        }
                                                    }
                                                }), 3);
                                            }
                                            j21.m.a(f0Var2, !eVar6.f116088e.d(), c22.i.b(R.string.delete_custom_meal), c22.i.b(R.string.delete_meal_this_cannot_be_undone), dVar4, eVar4, lVar8, lVar9, lVar10);
                                            break;
                                        default:
                                            f0 f0Var3 = (f0) obj4;
                                            f0Var3.getClass();
                                            zc.d dVar5 = dVar2;
                                            boolean z16 = dVar5.d().f196385a instanceof z0.c;
                                            final m21.e eVar7 = eVar3;
                                            final e23.a aVar6 = aVar3;
                                            if (z16 && dVar5.c().isEmpty()) {
                                                final int i24 = 2;
                                                f0.b(f0Var3, null, new z3.e(1835197901, true, new e23.q() { // from class: l21.m
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        String strH;
                                                        String strH2;
                                                        String str;
                                                        int i113 = i24;
                                                        e23.a aVar7 = aVar6;
                                                        m21.e eVar8 = eVar7;
                                                        switch (i113) {
                                                            case 0:
                                                                p3.m mVar3 = (p3.m) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    x1 x1Var3 = p3.n.f135158a;
                                                                    String str2 = eVar8.f116084a;
                                                                    m21.b bVar = eVar8.f116088e;
                                                                    if (str2.length() > 0) {
                                                                        mVar3.C(-350320041);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar3, R.string.lbl_no_results_found), y.Q(mVar3, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar3, 3072, 16);
                                                                        mVar3.f();
                                                                    } else {
                                                                        mVar3.C(-349883685);
                                                                        if (bVar.d()) {
                                                                            mVar3.C(-349718703);
                                                                            mVar3.f();
                                                                            strH = null;
                                                                        } else {
                                                                            strH = sn.a.h(mVar3, -349822863, R.string.create_food, mVar3);
                                                                        }
                                                                        e23.a aVar8 = !bVar.d() ? aVar7 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar3, R.string.lbl_cannot_find_custom_foods), y.Q(mVar3, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar8, null, null, mVar3, 3072, 192);
                                                                        mVar3.f();
                                                                    }
                                                                } else {
                                                                    mVar3.e();
                                                                }
                                                                break;
                                                            case 1:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    String str3 = eVar8.f116084a;
                                                                    m21.b bVar2 = eVar8.f116088e;
                                                                    if (str3.length() > 0) {
                                                                        mVar4.C(890054817);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(890490460);
                                                                        if (bVar2.d()) {
                                                                            mVar4.C(890656155);
                                                                            mVar4.f();
                                                                            strH2 = null;
                                                                        } else {
                                                                            strH2 = sn.a.h(mVar4, 890551995, R.string.create_meal, mVar4);
                                                                        }
                                                                        e23.a aVar9 = !bVar2.d() ? aVar7 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar4, R.string.lbl_create_a_meal), y.Q(mVar4, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar9, null, null, mVar4, 3072, 192);
                                                                        mVar4.f();
                                                                    }
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                break;
                                                            default:
                                                                p3.m mVar5 = (p3.m) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                    x1 x1Var5 = p3.n.f135158a;
                                                                    String str4 = eVar8.f116084a;
                                                                    m21.b bVar3 = eVar8.f116088e;
                                                                    if (str4.length() > 0) {
                                                                        mVar5.C(1742034231);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar5, R.string.lbl_no_results_found), y.Q(mVar5, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar5, 3072, 16);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(1742470308);
                                                                        if (bVar3.d()) {
                                                                            mVar5.C(1742641521);
                                                                            mVar5.f();
                                                                            str = null;
                                                                        } else {
                                                                            mVar5.C(1742531595);
                                                                            x0.f23314a.getClass();
                                                                            String strW = gl1.d.W(x0.Jd);
                                                                            mVar5.f();
                                                                            str = strW;
                                                                        }
                                                                        e23.a aVar10 = !bVar3.d() ? aVar7 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        u4.d dVarA = ea.a(t62.c.f162799a);
                                                                        x0.f23314a.getClass();
                                                                        b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar10, null, null, mVar5, 3072, 192);
                                                                        mVar5.f();
                                                                    }
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }), 3);
                                            } else if (!dVar5.c().isEmpty() && !eVar7.f116085b && !eVar7.f116088e.d()) {
                                                final int i25 = 2;
                                                final e23.l lVar15 = lVar7;
                                                f0.b(f0Var3, null, new z3.e(-783051516, true, new e23.q() { // from class: l21.n
                                                    /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                    /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                    /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        int i113 = i25;
                                                        p3.m.a aVar7 = p3.m.f135153a;
                                                        m21.e eVar8 = eVar7;
                                                        e23.a aVar8 = aVar6;
                                                        switch (i113) {
                                                            case 0:
                                                                p3.m mVar3 = (p3.m) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                    x1 x1Var3 = p3.n.f135158a;
                                                                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar9 = j92.b.f97899b;
                                                                    float f14 = eVar9.f97920e;
                                                                    h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                                    c2.j jVar = c2.j.f22691a;
                                                                    float f15 = eVar9.f97920e;
                                                                    jVar.getClass();
                                                                    s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar3, 48);
                                                                    int iHashCode = Long.hashCode(mVar3.getU());
                                                                    i2 i2VarX = mVar3.x();
                                                                    h4.r rVarC2 = h4.k.c(rVarC, mVar3);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar9 = h5.g.a.f81805b;
                                                                    if (mVar3.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar3.z();
                                                                    if (mVar3.getT()) {
                                                                        mVar3.M(aVar9);
                                                                    } else {
                                                                        mVar3.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                                        v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                                                                    u2 u2Var = u2.f22900a;
                                                                    l72.f0.a aVar10 = l72.f0.a.f111000a;
                                                                    String strQ = y.Q(mVar3, R.string.create_food);
                                                                    boolean zB11 = mVar3.B(aVar8);
                                                                    Object objQ3 = mVar3.q();
                                                                    if (zB11) {
                                                                        objQ3 = new ku1.a(aVar8, 19);
                                                                        mVar3.K(objQ3);
                                                                    } else {
                                                                        aVar7.getClass();
                                                                        if (objQ3 == p3.m.a.f135155b) {
                                                                            objQ3 = new ku1.a(aVar8, 19);
                                                                            mVar3.K(objQ3);
                                                                        }
                                                                    }
                                                                    aVar10.f(strQ, null, false, (e23.a) objQ3, mVar3, 0, 6);
                                                                    if (eVar8.b()) {
                                                                        mVar3.C(-1562464720);
                                                                        List<b11.l> list = eVar8.f116100q;
                                                                        b11.l lVar16 = eVar8.f116101r;
                                                                        y01.l.a(null, list, lVar16 != null ? Long.valueOf(lVar16.f14331a) : null, lVar15, mVar3, 0, 1);
                                                                        mVar3.f();
                                                                    } else {
                                                                        mVar3.C(-1562139902);
                                                                        mVar3.f();
                                                                    }
                                                                    mVar3.y();
                                                                } else {
                                                                    mVar3.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            case 1:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    h4.r.a aVar11 = h4.r.S;
                                                                    h4.r rVarD2 = x2.d(aVar11, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar10 = j92.b.f97899b;
                                                                    h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar10.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar3 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar4, 48);
                                                                    int iHashCode2 = Long.hashCode(mVar4.getU());
                                                                    i2 i2VarX2 = mVar4.x();
                                                                    h4.r rVarC4 = h4.k.c(rVarC3, mVar4);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar12 = h5.g.a.f81805b;
                                                                    if (mVar4.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar4.z();
                                                                    if (mVar4.getT()) {
                                                                        mVar4.M(aVar12);
                                                                    } else {
                                                                        mVar4.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA2, mVar4);
                                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar4);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC4, mVar4);
                                                                    u2 u2Var2 = u2.f22900a;
                                                                    l72.f0.a aVar13 = l72.f0.a.f111000a;
                                                                    String strQ2 = y.Q(mVar4, R.string.create_meal);
                                                                    h4.r rVarC5 = c2.l.C(aVar11, eVar10.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB12 = mVar4.B(aVar8);
                                                                    Object objQ4 = mVar4.q();
                                                                    if (zB12) {
                                                                        objQ4 = new ku1.a(aVar8, 20);
                                                                        mVar4.K(objQ4);
                                                                    } else {
                                                                        aVar7.getClass();
                                                                        if (objQ4 == p3.m.a.f135155b) {
                                                                            objQ4 = new ku1.a(aVar8, 20);
                                                                            mVar4.K(objQ4);
                                                                        }
                                                                    }
                                                                    aVar13.f(strQ2, rVarC5, false, (e23.a) objQ4, mVar4, 0, 4);
                                                                    if (eVar8.b()) {
                                                                        mVar4.C(-321960809);
                                                                        List<b11.l> list2 = eVar8.f116100q;
                                                                        b11.l lVar17 = eVar8.f116101r;
                                                                        y01.l.a(c2.l.C(aVar11, eVar10.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar17 != null ? Long.valueOf(lVar17.f14331a) : null, lVar15, mVar4, 0, 0);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(-321572596);
                                                                        mVar4.f();
                                                                    }
                                                                    mVar4.y();
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            default:
                                                                p3.m mVar5 = (p3.m) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                    x1 x1Var5 = p3.n.f135158a;
                                                                    h4.r.a aVar14 = h4.r.S;
                                                                    h4.r rVarD3 = x2.d(aVar14, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar11 = j92.b.f97899b;
                                                                    h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar11.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar5 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar5, 48);
                                                                    int iHashCode3 = Long.hashCode(mVar5.getU());
                                                                    i2 i2VarX3 = mVar5.x();
                                                                    h4.r rVarC7 = h4.k.c(rVarC6, mVar5);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar15 = h5.g.a.f81805b;
                                                                    if (mVar5.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar5.z();
                                                                    if (mVar5.getT()) {
                                                                        mVar5.M(aVar15);
                                                                    } else {
                                                                        mVar5.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA3, mVar5);
                                                                    b4.c(h5.g.a.f81809f, i2VarX3, mVar5);
                                                                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                                                                        v.h.z(iHashCode3, mVar5, iHashCode3, bVar6);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC7, mVar5);
                                                                    u2 u2Var3 = u2.f22900a;
                                                                    l72.f0.a aVar16 = l72.f0.a.f111000a;
                                                                    x0.f23314a.getClass();
                                                                    String strW = gl1.d.W(x0.Jd);
                                                                    h4.r rVarC8 = c2.l.C(aVar14, eVar11.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB13 = mVar5.B(aVar8);
                                                                    Object objQ5 = mVar5.q();
                                                                    if (zB13) {
                                                                        objQ5 = new ku1.a(aVar8, 21);
                                                                        mVar5.K(objQ5);
                                                                    } else {
                                                                        aVar7.getClass();
                                                                        if (objQ5 == p3.m.a.f135155b) {
                                                                            objQ5 = new ku1.a(aVar8, 21);
                                                                            mVar5.K(objQ5);
                                                                        }
                                                                    }
                                                                    aVar16.f(strW, rVarC8, false, (e23.a) objQ5, mVar5, 0, 4);
                                                                    if (eVar8.b()) {
                                                                        mVar5.C(231180845);
                                                                        List<b11.l> list3 = eVar8.f116100q;
                                                                        b11.l lVar18 = eVar8.f116101r;
                                                                        y01.l.a(c2.l.C(aVar14, eVar11.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar18 != null ? Long.valueOf(lVar18.f14331a) : null, lVar15, mVar5, 0, 0);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(231569058);
                                                                        mVar5.f();
                                                                    }
                                                                    mVar5.y();
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                        }
                                                    }
                                                }), 3);
                                            }
                                            boolean z17 = !(eVar7.f116088e instanceof m21.b.C2206b);
                                            x0.f23314a.getClass();
                                            j21.m.a(f0Var3, z17, g2.b(x0.Qd), g2.b(x0.f23598qf), dVar5, eVar4, lVar8, lVar9, lVar10);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(lVar12);
                            objQ2 = lVar12;
                        }
                    }
                    e2.c.b(null, null, l2VarE2, null, null, null, false, null, (e23.l) objQ2, mVar2, 0, 507);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l2 l2VarE3 = c2.l.e(0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    final zc.d dVar3 = this.f109119b;
                    boolean zR7 = mVar3.r(dVar3);
                    final m21.e eVar5 = this.f109120c;
                    boolean zR8 = zR7 | mVar3.r(eVar5);
                    final e23.a aVar4 = this.f109121d;
                    boolean zB11 = zR8 | mVar3.B(aVar4);
                    final e23.l lVar13 = this.f109122e;
                    boolean zB12 = zB11 | mVar3.B(lVar13);
                    final v21.e eVar6 = this.f109123f;
                    boolean zR9 = zB12 | mVar3.r(eVar6);
                    final e23.l lVar14 = this.f109124g;
                    boolean zB13 = zR9 | mVar3.B(lVar14);
                    final e23.l lVar15 = this.f109125h;
                    boolean zB14 = zB13 | mVar3.B(lVar15);
                    final e23.l lVar16 = this.f109126i;
                    boolean zB15 = zB14 | mVar3.B(lVar16);
                    Object objQ3 = mVar3.q();
                    if (zB15) {
                        final int i19 = 2;
                        e23.l lVar17 = new e23.l() { // from class: l21.l
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                switch (i19) {
                                    case 0:
                                        f0 f0Var = (f0) obj4;
                                        f0Var.getClass();
                                        zc.d dVar4 = dVar3;
                                        boolean z14 = dVar4.d().f196385a instanceof z0.c;
                                        final m21.e eVar7 = eVar5;
                                        final e23.a aVar5 = aVar4;
                                        if (z14 && dVar4.c().isEmpty()) {
                                            final int i110 = 0;
                                            f0.b(f0Var, null, new z3.e(-1173699411, true, new e23.q() { // from class: l21.m
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    String strH;
                                                    String strH2;
                                                    String str;
                                                    int i113 = i110;
                                                    e23.a aVar7 = aVar5;
                                                    m21.e eVar8 = eVar7;
                                                    switch (i113) {
                                                        case 0:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                String str2 = eVar8.f116084a;
                                                                m21.b bVar = eVar8.f116088e;
                                                                if (str2.length() > 0) {
                                                                    mVar4.C(-350320041);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(-349883685);
                                                                    if (bVar.d()) {
                                                                        mVar4.C(-349718703);
                                                                        mVar4.f();
                                                                        strH = null;
                                                                    } else {
                                                                        strH = sn.a.h(mVar4, -349822863, R.string.create_food, mVar4);
                                                                    }
                                                                    e23.a aVar8 = !bVar.d() ? aVar7 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar4, R.string.lbl_cannot_find_custom_foods), y.Q(mVar4, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar8, null, null, mVar4, 3072, 192);
                                                                    mVar4.f();
                                                                }
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            break;
                                                        case 1:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                x1 x1Var5 = p3.n.f135158a;
                                                                String str3 = eVar8.f116084a;
                                                                m21.b bVar2 = eVar8.f116088e;
                                                                if (str3.length() > 0) {
                                                                    mVar5.C(890054817);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar5, R.string.lbl_no_results_found), y.Q(mVar5, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar5, 3072, 16);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(890490460);
                                                                    if (bVar2.d()) {
                                                                        mVar5.C(890656155);
                                                                        mVar5.f();
                                                                        strH2 = null;
                                                                    } else {
                                                                        strH2 = sn.a.h(mVar5, 890551995, R.string.create_meal, mVar5);
                                                                    }
                                                                    e23.a aVar9 = !bVar2.d() ? aVar7 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar5, R.string.lbl_create_a_meal), y.Q(mVar5, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar9, null, null, mVar5, 3072, 192);
                                                                    mVar5.f();
                                                                }
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            break;
                                                        default:
                                                            p3.m mVar6 = (p3.m) obj6;
                                                            int iIntValue6 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                x1 x1Var6 = p3.n.f135158a;
                                                                String str4 = eVar8.f116084a;
                                                                m21.b bVar3 = eVar8.f116088e;
                                                                if (str4.length() > 0) {
                                                                    mVar6.C(1742034231);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar6, R.string.lbl_no_results_found), y.Q(mVar6, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar6, 3072, 16);
                                                                    mVar6.f();
                                                                } else {
                                                                    mVar6.C(1742470308);
                                                                    if (bVar3.d()) {
                                                                        mVar6.C(1742641521);
                                                                        mVar6.f();
                                                                        str = null;
                                                                    } else {
                                                                        mVar6.C(1742531595);
                                                                        x0.f23314a.getClass();
                                                                        String strW = gl1.d.W(x0.Jd);
                                                                        mVar6.f();
                                                                        str = strW;
                                                                    }
                                                                    e23.a aVar10 = !bVar3.d() ? aVar7 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    u4.d dVarA = ea.a(t62.c.f162799a);
                                                                    x0.f23314a.getClass();
                                                                    b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar10, null, null, mVar6, 3072, 192);
                                                                    mVar6.f();
                                                                }
                                                            } else {
                                                                mVar6.e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }), 3);
                                        } else if (!dVar4.c().isEmpty() && !eVar7.f116085b && !eVar7.f116088e.d()) {
                                            final int i111 = 0;
                                            final e23.l lVar18 = lVar13;
                                            f0.b(f0Var, null, new z3.e(-500586652, true, new e23.q() { // from class: l21.n
                                                /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    int i113 = i111;
                                                    p3.m.a aVar7 = p3.m.f135153a;
                                                    m21.e eVar8 = eVar7;
                                                    e23.a aVar8 = aVar5;
                                                    switch (i113) {
                                                        case 0:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar9 = j92.b.f97899b;
                                                                float f14 = eVar9.f97920e;
                                                                h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar = h4.d.a.f81534l;
                                                                c2.j jVar = c2.j.f22691a;
                                                                float f15 = eVar9.f97920e;
                                                                jVar.getClass();
                                                                s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar4, 48);
                                                                int iHashCode = Long.hashCode(mVar4.getU());
                                                                i2 i2VarX = mVar4.x();
                                                                h4.r rVarC2 = h4.k.c(rVarC, mVar4);
                                                                h5.g.V.getClass();
                                                                e0.a aVar9 = h5.g.a.f81805b;
                                                                if (mVar4.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar4.z();
                                                                if (mVar4.getT()) {
                                                                    mVar4.M(aVar9);
                                                                } else {
                                                                    mVar4.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA, mVar4);
                                                                b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                                                                    v.h.z(iHashCode, mVar4, iHashCode, bVar2);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                                u2 u2Var = u2.f22900a;
                                                                l72.f0.a aVar10 = l72.f0.a.f111000a;
                                                                String strQ = y.Q(mVar4, R.string.create_food);
                                                                boolean zB16 = mVar4.B(aVar8);
                                                                Object objQ4 = mVar4.q();
                                                                if (zB16) {
                                                                    objQ4 = new ku1.a(aVar8, 19);
                                                                    mVar4.K(objQ4);
                                                                } else {
                                                                    aVar7.getClass();
                                                                    if (objQ4 == p3.m.a.f135155b) {
                                                                        objQ4 = new ku1.a(aVar8, 19);
                                                                        mVar4.K(objQ4);
                                                                    }
                                                                }
                                                                aVar10.f(strQ, null, false, (e23.a) objQ4, mVar4, 0, 6);
                                                                if (eVar8.b()) {
                                                                    mVar4.C(-1562464720);
                                                                    List<b11.l> list = eVar8.f116100q;
                                                                    b11.l lVar19 = eVar8.f116101r;
                                                                    y01.l.a(null, list, lVar19 != null ? Long.valueOf(lVar19.f14331a) : null, lVar18, mVar4, 0, 1);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(-1562139902);
                                                                    mVar4.f();
                                                                }
                                                                mVar4.y();
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        case 1:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                x1 x1Var5 = p3.n.f135158a;
                                                                h4.r.a aVar11 = h4.r.S;
                                                                h4.r rVarD2 = x2.d(aVar11, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar10 = j92.b.f97899b;
                                                                h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar10.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar3 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar5, 48);
                                                                int iHashCode2 = Long.hashCode(mVar5.getU());
                                                                i2 i2VarX2 = mVar5.x();
                                                                h4.r rVarC4 = h4.k.c(rVarC3, mVar5);
                                                                h5.g.V.getClass();
                                                                e0.a aVar12 = h5.g.a.f81805b;
                                                                if (mVar5.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar5.z();
                                                                if (mVar5.getT()) {
                                                                    mVar5.M(aVar12);
                                                                } else {
                                                                    mVar5.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA2, mVar5);
                                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar5);
                                                                h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                                                                    v.h.z(iHashCode2, mVar5, iHashCode2, bVar4);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC4, mVar5);
                                                                u2 u2Var2 = u2.f22900a;
                                                                l72.f0.a aVar13 = l72.f0.a.f111000a;
                                                                String strQ2 = y.Q(mVar5, R.string.create_meal);
                                                                h4.r rVarC5 = c2.l.C(aVar11, eVar10.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB17 = mVar5.B(aVar8);
                                                                Object objQ5 = mVar5.q();
                                                                if (zB17) {
                                                                    objQ5 = new ku1.a(aVar8, 20);
                                                                    mVar5.K(objQ5);
                                                                } else {
                                                                    aVar7.getClass();
                                                                    if (objQ5 == p3.m.a.f135155b) {
                                                                        objQ5 = new ku1.a(aVar8, 20);
                                                                        mVar5.K(objQ5);
                                                                    }
                                                                }
                                                                aVar13.f(strQ2, rVarC5, false, (e23.a) objQ5, mVar5, 0, 4);
                                                                if (eVar8.b()) {
                                                                    mVar5.C(-321960809);
                                                                    List<b11.l> list2 = eVar8.f116100q;
                                                                    b11.l lVar110 = eVar8.f116101r;
                                                                    y01.l.a(c2.l.C(aVar11, eVar10.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar110 != null ? Long.valueOf(lVar110.f14331a) : null, lVar18, mVar5, 0, 0);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(-321572596);
                                                                    mVar5.f();
                                                                }
                                                                mVar5.y();
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        default:
                                                            p3.m mVar6 = (p3.m) obj6;
                                                            int iIntValue6 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                x1 x1Var6 = p3.n.f135158a;
                                                                h4.r.a aVar14 = h4.r.S;
                                                                h4.r rVarD3 = x2.d(aVar14, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar11 = j92.b.f97899b;
                                                                h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar11.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar5 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar6, 48);
                                                                int iHashCode3 = Long.hashCode(mVar6.getU());
                                                                i2 i2VarX3 = mVar6.x();
                                                                h4.r rVarC7 = h4.k.c(rVarC6, mVar6);
                                                                h5.g.V.getClass();
                                                                e0.a aVar15 = h5.g.a.f81805b;
                                                                if (mVar6.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar6.z();
                                                                if (mVar6.getT()) {
                                                                    mVar6.M(aVar15);
                                                                } else {
                                                                    mVar6.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA3, mVar6);
                                                                b4.c(h5.g.a.f81809f, i2VarX3, mVar6);
                                                                h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode3))) {
                                                                    v.h.z(iHashCode3, mVar6, iHashCode3, bVar6);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC7, mVar6);
                                                                u2 u2Var3 = u2.f22900a;
                                                                l72.f0.a aVar16 = l72.f0.a.f111000a;
                                                                x0.f23314a.getClass();
                                                                String strW = gl1.d.W(x0.Jd);
                                                                h4.r rVarC8 = c2.l.C(aVar14, eVar11.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB18 = mVar6.B(aVar8);
                                                                Object objQ6 = mVar6.q();
                                                                if (zB18) {
                                                                    objQ6 = new ku1.a(aVar8, 21);
                                                                    mVar6.K(objQ6);
                                                                } else {
                                                                    aVar7.getClass();
                                                                    if (objQ6 == p3.m.a.f135155b) {
                                                                        objQ6 = new ku1.a(aVar8, 21);
                                                                        mVar6.K(objQ6);
                                                                    }
                                                                }
                                                                aVar16.f(strW, rVarC8, false, (e23.a) objQ6, mVar6, 0, 4);
                                                                if (eVar8.b()) {
                                                                    mVar6.C(231180845);
                                                                    List<b11.l> list3 = eVar8.f116100q;
                                                                    b11.l lVar111 = eVar8.f116101r;
                                                                    y01.l.a(c2.l.C(aVar14, eVar11.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar111 != null ? Long.valueOf(lVar111.f14331a) : null, lVar18, mVar6, 0, 0);
                                                                    mVar6.f();
                                                                } else {
                                                                    mVar6.C(231569058);
                                                                    mVar6.f();
                                                                }
                                                                mVar6.y();
                                                            } else {
                                                                mVar6.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            }), 3);
                                        }
                                        j21.m.a(f0Var, !eVar7.f116088e.d(), c22.i.b(R.string.delete_custom_food), c22.i.b(R.string.delete_food_this_cannot_be_undone), dVar4, eVar6, lVar14, lVar15, lVar16);
                                        break;
                                    case 1:
                                        f0 f0Var2 = (f0) obj4;
                                        f0Var2.getClass();
                                        zc.d dVar5 = dVar3;
                                        boolean z15 = dVar5.d().f196385a instanceof z0.c;
                                        final m21.e eVar8 = eVar5;
                                        final e23.a aVar6 = aVar4;
                                        if (z15 && dVar5.c().isEmpty()) {
                                            final int i112 = 1;
                                            f0.b(f0Var2, null, new z3.e(-1225270621, true, new e23.q() { // from class: l21.m
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    String strH;
                                                    String strH2;
                                                    String str;
                                                    int i113 = i112;
                                                    e23.a aVar7 = aVar6;
                                                    m21.e eVar9 = eVar8;
                                                    switch (i113) {
                                                        case 0:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                String str2 = eVar9.f116084a;
                                                                m21.b bVar = eVar9.f116088e;
                                                                if (str2.length() > 0) {
                                                                    mVar4.C(-350320041);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(-349883685);
                                                                    if (bVar.d()) {
                                                                        mVar4.C(-349718703);
                                                                        mVar4.f();
                                                                        strH = null;
                                                                    } else {
                                                                        strH = sn.a.h(mVar4, -349822863, R.string.create_food, mVar4);
                                                                    }
                                                                    e23.a aVar8 = !bVar.d() ? aVar7 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar4, R.string.lbl_cannot_find_custom_foods), y.Q(mVar4, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar8, null, null, mVar4, 3072, 192);
                                                                    mVar4.f();
                                                                }
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            break;
                                                        case 1:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                x1 x1Var5 = p3.n.f135158a;
                                                                String str3 = eVar9.f116084a;
                                                                m21.b bVar2 = eVar9.f116088e;
                                                                if (str3.length() > 0) {
                                                                    mVar5.C(890054817);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar5, R.string.lbl_no_results_found), y.Q(mVar5, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar5, 3072, 16);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(890490460);
                                                                    if (bVar2.d()) {
                                                                        mVar5.C(890656155);
                                                                        mVar5.f();
                                                                        strH2 = null;
                                                                    } else {
                                                                        strH2 = sn.a.h(mVar5, 890551995, R.string.create_meal, mVar5);
                                                                    }
                                                                    e23.a aVar9 = !bVar2.d() ? aVar7 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar5, R.string.lbl_create_a_meal), y.Q(mVar5, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar9, null, null, mVar5, 3072, 192);
                                                                    mVar5.f();
                                                                }
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            break;
                                                        default:
                                                            p3.m mVar6 = (p3.m) obj6;
                                                            int iIntValue6 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                x1 x1Var6 = p3.n.f135158a;
                                                                String str4 = eVar9.f116084a;
                                                                m21.b bVar3 = eVar9.f116088e;
                                                                if (str4.length() > 0) {
                                                                    mVar6.C(1742034231);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar6, R.string.lbl_no_results_found), y.Q(mVar6, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar6, 3072, 16);
                                                                    mVar6.f();
                                                                } else {
                                                                    mVar6.C(1742470308);
                                                                    if (bVar3.d()) {
                                                                        mVar6.C(1742641521);
                                                                        mVar6.f();
                                                                        str = null;
                                                                    } else {
                                                                        mVar6.C(1742531595);
                                                                        x0.f23314a.getClass();
                                                                        String strW = gl1.d.W(x0.Jd);
                                                                        mVar6.f();
                                                                        str = strW;
                                                                    }
                                                                    e23.a aVar10 = !bVar3.d() ? aVar7 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    u4.d dVarA = ea.a(t62.c.f162799a);
                                                                    x0.f23314a.getClass();
                                                                    b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar10, null, null, mVar6, 3072, 192);
                                                                    mVar6.f();
                                                                }
                                                            } else {
                                                                mVar6.e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }), 3);
                                        } else if (!dVar5.c().isEmpty() && !eVar8.f116085b && !eVar8.f116088e.d()) {
                                            final int i113 = 1;
                                            final e23.l lVar19 = lVar13;
                                            f0.b(f0Var2, null, new z3.e(-552157862, true, new e23.q() { // from class: l21.n
                                                /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    int i114 = i113;
                                                    p3.m.a aVar7 = p3.m.f135153a;
                                                    m21.e eVar9 = eVar8;
                                                    e23.a aVar8 = aVar6;
                                                    switch (i114) {
                                                        case 0:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar10 = j92.b.f97899b;
                                                                float f14 = eVar10.f97920e;
                                                                h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar = h4.d.a.f81534l;
                                                                c2.j jVar = c2.j.f22691a;
                                                                float f15 = eVar10.f97920e;
                                                                jVar.getClass();
                                                                s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar4, 48);
                                                                int iHashCode = Long.hashCode(mVar4.getU());
                                                                i2 i2VarX = mVar4.x();
                                                                h4.r rVarC2 = h4.k.c(rVarC, mVar4);
                                                                h5.g.V.getClass();
                                                                e0.a aVar9 = h5.g.a.f81805b;
                                                                if (mVar4.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar4.z();
                                                                if (mVar4.getT()) {
                                                                    mVar4.M(aVar9);
                                                                } else {
                                                                    mVar4.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA, mVar4);
                                                                b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                                                                    v.h.z(iHashCode, mVar4, iHashCode, bVar2);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                                u2 u2Var = u2.f22900a;
                                                                l72.f0.a aVar10 = l72.f0.a.f111000a;
                                                                String strQ = y.Q(mVar4, R.string.create_food);
                                                                boolean zB16 = mVar4.B(aVar8);
                                                                Object objQ4 = mVar4.q();
                                                                if (zB16) {
                                                                    objQ4 = new ku1.a(aVar8, 19);
                                                                    mVar4.K(objQ4);
                                                                } else {
                                                                    aVar7.getClass();
                                                                    if (objQ4 == p3.m.a.f135155b) {
                                                                        objQ4 = new ku1.a(aVar8, 19);
                                                                        mVar4.K(objQ4);
                                                                    }
                                                                }
                                                                aVar10.f(strQ, null, false, (e23.a) objQ4, mVar4, 0, 6);
                                                                if (eVar9.b()) {
                                                                    mVar4.C(-1562464720);
                                                                    List<b11.l> list = eVar9.f116100q;
                                                                    b11.l lVar110 = eVar9.f116101r;
                                                                    y01.l.a(null, list, lVar110 != null ? Long.valueOf(lVar110.f14331a) : null, lVar19, mVar4, 0, 1);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(-1562139902);
                                                                    mVar4.f();
                                                                }
                                                                mVar4.y();
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        case 1:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                x1 x1Var5 = p3.n.f135158a;
                                                                h4.r.a aVar11 = h4.r.S;
                                                                h4.r rVarD2 = x2.d(aVar11, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar11 = j92.b.f97899b;
                                                                h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar11.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar3 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar5, 48);
                                                                int iHashCode2 = Long.hashCode(mVar5.getU());
                                                                i2 i2VarX2 = mVar5.x();
                                                                h4.r rVarC4 = h4.k.c(rVarC3, mVar5);
                                                                h5.g.V.getClass();
                                                                e0.a aVar12 = h5.g.a.f81805b;
                                                                if (mVar5.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar5.z();
                                                                if (mVar5.getT()) {
                                                                    mVar5.M(aVar12);
                                                                } else {
                                                                    mVar5.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA2, mVar5);
                                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar5);
                                                                h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                                                                    v.h.z(iHashCode2, mVar5, iHashCode2, bVar4);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC4, mVar5);
                                                                u2 u2Var2 = u2.f22900a;
                                                                l72.f0.a aVar13 = l72.f0.a.f111000a;
                                                                String strQ2 = y.Q(mVar5, R.string.create_meal);
                                                                h4.r rVarC5 = c2.l.C(aVar11, eVar11.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB17 = mVar5.B(aVar8);
                                                                Object objQ5 = mVar5.q();
                                                                if (zB17) {
                                                                    objQ5 = new ku1.a(aVar8, 20);
                                                                    mVar5.K(objQ5);
                                                                } else {
                                                                    aVar7.getClass();
                                                                    if (objQ5 == p3.m.a.f135155b) {
                                                                        objQ5 = new ku1.a(aVar8, 20);
                                                                        mVar5.K(objQ5);
                                                                    }
                                                                }
                                                                aVar13.f(strQ2, rVarC5, false, (e23.a) objQ5, mVar5, 0, 4);
                                                                if (eVar9.b()) {
                                                                    mVar5.C(-321960809);
                                                                    List<b11.l> list2 = eVar9.f116100q;
                                                                    b11.l lVar111 = eVar9.f116101r;
                                                                    y01.l.a(c2.l.C(aVar11, eVar11.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar111 != null ? Long.valueOf(lVar111.f14331a) : null, lVar19, mVar5, 0, 0);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(-321572596);
                                                                    mVar5.f();
                                                                }
                                                                mVar5.y();
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        default:
                                                            p3.m mVar6 = (p3.m) obj6;
                                                            int iIntValue6 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                x1 x1Var6 = p3.n.f135158a;
                                                                h4.r.a aVar14 = h4.r.S;
                                                                h4.r rVarD3 = x2.d(aVar14, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar12 = j92.b.f97899b;
                                                                h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar12.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar5 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar6, 48);
                                                                int iHashCode3 = Long.hashCode(mVar6.getU());
                                                                i2 i2VarX3 = mVar6.x();
                                                                h4.r rVarC7 = h4.k.c(rVarC6, mVar6);
                                                                h5.g.V.getClass();
                                                                e0.a aVar15 = h5.g.a.f81805b;
                                                                if (mVar6.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar6.z();
                                                                if (mVar6.getT()) {
                                                                    mVar6.M(aVar15);
                                                                } else {
                                                                    mVar6.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA3, mVar6);
                                                                b4.c(h5.g.a.f81809f, i2VarX3, mVar6);
                                                                h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode3))) {
                                                                    v.h.z(iHashCode3, mVar6, iHashCode3, bVar6);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC7, mVar6);
                                                                u2 u2Var3 = u2.f22900a;
                                                                l72.f0.a aVar16 = l72.f0.a.f111000a;
                                                                x0.f23314a.getClass();
                                                                String strW = gl1.d.W(x0.Jd);
                                                                h4.r rVarC8 = c2.l.C(aVar14, eVar12.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB18 = mVar6.B(aVar8);
                                                                Object objQ6 = mVar6.q();
                                                                if (zB18) {
                                                                    objQ6 = new ku1.a(aVar8, 21);
                                                                    mVar6.K(objQ6);
                                                                } else {
                                                                    aVar7.getClass();
                                                                    if (objQ6 == p3.m.a.f135155b) {
                                                                        objQ6 = new ku1.a(aVar8, 21);
                                                                        mVar6.K(objQ6);
                                                                    }
                                                                }
                                                                aVar16.f(strW, rVarC8, false, (e23.a) objQ6, mVar6, 0, 4);
                                                                if (eVar9.b()) {
                                                                    mVar6.C(231180845);
                                                                    List<b11.l> list3 = eVar9.f116100q;
                                                                    b11.l lVar112 = eVar9.f116101r;
                                                                    y01.l.a(c2.l.C(aVar14, eVar12.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar112 != null ? Long.valueOf(lVar112.f14331a) : null, lVar19, mVar6, 0, 0);
                                                                    mVar6.f();
                                                                } else {
                                                                    mVar6.C(231569058);
                                                                    mVar6.f();
                                                                }
                                                                mVar6.y();
                                                            } else {
                                                                mVar6.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            }), 3);
                                        }
                                        j21.m.a(f0Var2, !eVar8.f116088e.d(), c22.i.b(R.string.delete_custom_meal), c22.i.b(R.string.delete_meal_this_cannot_be_undone), dVar5, eVar6, lVar14, lVar15, lVar16);
                                        break;
                                    default:
                                        f0 f0Var3 = (f0) obj4;
                                        f0Var3.getClass();
                                        zc.d dVar6 = dVar3;
                                        boolean z16 = dVar6.d().f196385a instanceof z0.c;
                                        final m21.e eVar9 = eVar5;
                                        final e23.a aVar7 = aVar4;
                                        if (z16 && dVar6.c().isEmpty()) {
                                            final int i24 = 2;
                                            f0.b(f0Var3, null, new z3.e(1835197901, true, new e23.q() { // from class: l21.m
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    String strH;
                                                    String strH2;
                                                    String str;
                                                    int i114 = i24;
                                                    e23.a aVar8 = aVar7;
                                                    m21.e eVar10 = eVar9;
                                                    switch (i114) {
                                                        case 0:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                String str2 = eVar10.f116084a;
                                                                m21.b bVar = eVar10.f116088e;
                                                                if (str2.length() > 0) {
                                                                    mVar4.C(-350320041);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(-349883685);
                                                                    if (bVar.d()) {
                                                                        mVar4.C(-349718703);
                                                                        mVar4.f();
                                                                        strH = null;
                                                                    } else {
                                                                        strH = sn.a.h(mVar4, -349822863, R.string.create_food, mVar4);
                                                                    }
                                                                    e23.a aVar9 = !bVar.d() ? aVar8 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar4, R.string.lbl_cannot_find_custom_foods), y.Q(mVar4, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar9, null, null, mVar4, 3072, 192);
                                                                    mVar4.f();
                                                                }
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            break;
                                                        case 1:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                x1 x1Var5 = p3.n.f135158a;
                                                                String str3 = eVar10.f116084a;
                                                                m21.b bVar2 = eVar10.f116088e;
                                                                if (str3.length() > 0) {
                                                                    mVar5.C(890054817);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar5, R.string.lbl_no_results_found), y.Q(mVar5, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar5, 3072, 16);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(890490460);
                                                                    if (bVar2.d()) {
                                                                        mVar5.C(890656155);
                                                                        mVar5.f();
                                                                        strH2 = null;
                                                                    } else {
                                                                        strH2 = sn.a.h(mVar5, 890551995, R.string.create_meal, mVar5);
                                                                    }
                                                                    e23.a aVar10 = !bVar2.d() ? aVar8 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar5, R.string.lbl_create_a_meal), y.Q(mVar5, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar10, null, null, mVar5, 3072, 192);
                                                                    mVar5.f();
                                                                }
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            break;
                                                        default:
                                                            p3.m mVar6 = (p3.m) obj6;
                                                            int iIntValue6 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                x1 x1Var6 = p3.n.f135158a;
                                                                String str4 = eVar10.f116084a;
                                                                m21.b bVar3 = eVar10.f116088e;
                                                                if (str4.length() > 0) {
                                                                    mVar6.C(1742034231);
                                                                    s62.a.f157643a.getClass();
                                                                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar6, R.string.lbl_no_results_found), y.Q(mVar6, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar6, 3072, 16);
                                                                    mVar6.f();
                                                                } else {
                                                                    mVar6.C(1742470308);
                                                                    if (bVar3.d()) {
                                                                        mVar6.C(1742641521);
                                                                        mVar6.f();
                                                                        str = null;
                                                                    } else {
                                                                        mVar6.C(1742531595);
                                                                        x0.f23314a.getClass();
                                                                        String strW = gl1.d.W(x0.Jd);
                                                                        mVar6.f();
                                                                        str = strW;
                                                                    }
                                                                    e23.a aVar11 = !bVar3.d() ? aVar8 : null;
                                                                    s62.a.f157643a.getClass();
                                                                    u4.d dVarA = ea.a(t62.c.f162799a);
                                                                    x0.f23314a.getClass();
                                                                    b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar11, null, null, mVar6, 3072, 192);
                                                                    mVar6.f();
                                                                }
                                                            } else {
                                                                mVar6.e();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }), 3);
                                        } else if (!dVar6.c().isEmpty() && !eVar9.f116085b && !eVar9.f116088e.d()) {
                                            final int i25 = 2;
                                            final e23.l lVar110 = lVar13;
                                            f0.b(f0Var3, null, new z3.e(-783051516, true, new e23.q() { // from class: l21.n
                                                /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                @Override // e23.q
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    int i114 = i25;
                                                    p3.m.a aVar8 = p3.m.f135153a;
                                                    m21.e eVar10 = eVar9;
                                                    e23.a aVar9 = aVar7;
                                                    switch (i114) {
                                                        case 0:
                                                            p3.m mVar4 = (p3.m) obj6;
                                                            int iIntValue4 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                x1 x1Var4 = p3.n.f135158a;
                                                                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar11 = j92.b.f97899b;
                                                                float f14 = eVar11.f97920e;
                                                                h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar = h4.d.a.f81534l;
                                                                c2.j jVar = c2.j.f22691a;
                                                                float f15 = eVar11.f97920e;
                                                                jVar.getClass();
                                                                s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar4, 48);
                                                                int iHashCode = Long.hashCode(mVar4.getU());
                                                                i2 i2VarX = mVar4.x();
                                                                h4.r rVarC2 = h4.k.c(rVarC, mVar4);
                                                                h5.g.V.getClass();
                                                                e0.a aVar10 = h5.g.a.f81805b;
                                                                if (mVar4.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar4.z();
                                                                if (mVar4.getT()) {
                                                                    mVar4.M(aVar10);
                                                                } else {
                                                                    mVar4.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA, mVar4);
                                                                b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                                                                h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                                                                    v.h.z(iHashCode, mVar4, iHashCode, bVar2);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                                u2 u2Var = u2.f22900a;
                                                                l72.f0.a aVar11 = l72.f0.a.f111000a;
                                                                String strQ = y.Q(mVar4, R.string.create_food);
                                                                boolean zB16 = mVar4.B(aVar9);
                                                                Object objQ4 = mVar4.q();
                                                                if (zB16) {
                                                                    objQ4 = new ku1.a(aVar9, 19);
                                                                    mVar4.K(objQ4);
                                                                } else {
                                                                    aVar8.getClass();
                                                                    if (objQ4 == p3.m.a.f135155b) {
                                                                        objQ4 = new ku1.a(aVar9, 19);
                                                                        mVar4.K(objQ4);
                                                                    }
                                                                }
                                                                aVar11.f(strQ, null, false, (e23.a) objQ4, mVar4, 0, 6);
                                                                if (eVar10.b()) {
                                                                    mVar4.C(-1562464720);
                                                                    List<b11.l> list = eVar10.f116100q;
                                                                    b11.l lVar111 = eVar10.f116101r;
                                                                    y01.l.a(null, list, lVar111 != null ? Long.valueOf(lVar111.f14331a) : null, lVar110, mVar4, 0, 1);
                                                                    mVar4.f();
                                                                } else {
                                                                    mVar4.C(-1562139902);
                                                                    mVar4.f();
                                                                }
                                                                mVar4.y();
                                                            } else {
                                                                mVar4.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        case 1:
                                                            p3.m mVar5 = (p3.m) obj6;
                                                            int iIntValue5 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                x1 x1Var5 = p3.n.f135158a;
                                                                h4.r.a aVar12 = h4.r.S;
                                                                h4.r rVarD2 = x2.d(aVar12, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar12 = j92.b.f97899b;
                                                                h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar12.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar3 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar5, 48);
                                                                int iHashCode2 = Long.hashCode(mVar5.getU());
                                                                i2 i2VarX2 = mVar5.x();
                                                                h4.r rVarC4 = h4.k.c(rVarC3, mVar5);
                                                                h5.g.V.getClass();
                                                                e0.a aVar13 = h5.g.a.f81805b;
                                                                if (mVar5.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar5.z();
                                                                if (mVar5.getT()) {
                                                                    mVar5.M(aVar13);
                                                                } else {
                                                                    mVar5.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA2, mVar5);
                                                                b4.c(h5.g.a.f81809f, i2VarX2, mVar5);
                                                                h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                                                                    v.h.z(iHashCode2, mVar5, iHashCode2, bVar4);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC4, mVar5);
                                                                u2 u2Var2 = u2.f22900a;
                                                                l72.f0.a aVar14 = l72.f0.a.f111000a;
                                                                String strQ2 = y.Q(mVar5, R.string.create_meal);
                                                                h4.r rVarC5 = c2.l.C(aVar12, eVar12.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB17 = mVar5.B(aVar9);
                                                                Object objQ5 = mVar5.q();
                                                                if (zB17) {
                                                                    objQ5 = new ku1.a(aVar9, 20);
                                                                    mVar5.K(objQ5);
                                                                } else {
                                                                    aVar8.getClass();
                                                                    if (objQ5 == p3.m.a.f135155b) {
                                                                        objQ5 = new ku1.a(aVar9, 20);
                                                                        mVar5.K(objQ5);
                                                                    }
                                                                }
                                                                aVar14.f(strQ2, rVarC5, false, (e23.a) objQ5, mVar5, 0, 4);
                                                                if (eVar10.b()) {
                                                                    mVar5.C(-321960809);
                                                                    List<b11.l> list2 = eVar10.f116100q;
                                                                    b11.l lVar112 = eVar10.f116101r;
                                                                    y01.l.a(c2.l.C(aVar12, eVar12.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar112 != null ? Long.valueOf(lVar112.f14331a) : null, lVar110, mVar5, 0, 0);
                                                                    mVar5.f();
                                                                } else {
                                                                    mVar5.C(-321572596);
                                                                    mVar5.f();
                                                                }
                                                                mVar5.y();
                                                            } else {
                                                                mVar5.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                        default:
                                                            p3.m mVar6 = (p3.m) obj6;
                                                            int iIntValue6 = ((Integer) obj7).intValue();
                                                            ((e2.d) obj5).getClass();
                                                            if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                x1 x1Var6 = p3.n.f135158a;
                                                                h4.r.a aVar15 = h4.r.S;
                                                                h4.r rVarD3 = x2.d(aVar15, 1.0f);
                                                                d92.b.f58623a.getClass();
                                                                d92.b.f58625c.getClass();
                                                                j92.e eVar13 = j92.b.f97899b;
                                                                h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar13.f97920e, 7);
                                                                h4.d.f81522a.getClass();
                                                                h4.g.b bVar5 = h4.d.a.f81534l;
                                                                c2.j.f22691a.getClass();
                                                                s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar6, 48);
                                                                int iHashCode3 = Long.hashCode(mVar6.getU());
                                                                i2 i2VarX3 = mVar6.x();
                                                                h4.r rVarC7 = h4.k.c(rVarC6, mVar6);
                                                                h5.g.V.getClass();
                                                                e0.a aVar16 = h5.g.a.f81805b;
                                                                if (mVar6.F() == null) {
                                                                    p0.l();
                                                                    throw null;
                                                                }
                                                                mVar6.z();
                                                                if (mVar6.getT()) {
                                                                    mVar6.M(aVar16);
                                                                } else {
                                                                    mVar6.c();
                                                                }
                                                                b4.c(h5.g.a.f81810g, s2VarA3, mVar6);
                                                                b4.c(h5.g.a.f81809f, i2VarX3, mVar6);
                                                                h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode3))) {
                                                                    v.h.z(iHashCode3, mVar6, iHashCode3, bVar6);
                                                                }
                                                                b4.c(h5.g.a.f81807d, rVarC7, mVar6);
                                                                u2 u2Var3 = u2.f22900a;
                                                                l72.f0.a aVar17 = l72.f0.a.f111000a;
                                                                x0.f23314a.getClass();
                                                                String strW = gl1.d.W(x0.Jd);
                                                                h4.r rVarC8 = c2.l.C(aVar15, eVar13.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                boolean zB18 = mVar6.B(aVar9);
                                                                Object objQ6 = mVar6.q();
                                                                if (zB18) {
                                                                    objQ6 = new ku1.a(aVar9, 21);
                                                                    mVar6.K(objQ6);
                                                                } else {
                                                                    aVar8.getClass();
                                                                    if (objQ6 == p3.m.a.f135155b) {
                                                                        objQ6 = new ku1.a(aVar9, 21);
                                                                        mVar6.K(objQ6);
                                                                    }
                                                                }
                                                                aVar17.f(strW, rVarC8, false, (e23.a) objQ6, mVar6, 0, 4);
                                                                if (eVar10.b()) {
                                                                    mVar6.C(231180845);
                                                                    List<b11.l> list3 = eVar10.f116100q;
                                                                    b11.l lVar113 = eVar10.f116101r;
                                                                    y01.l.a(c2.l.C(aVar15, eVar13.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar113 != null ? Long.valueOf(lVar113.f14331a) : null, lVar110, mVar6, 0, 0);
                                                                    mVar6.f();
                                                                } else {
                                                                    mVar6.C(231569058);
                                                                    mVar6.f();
                                                                }
                                                                mVar6.y();
                                                            } else {
                                                                mVar6.e();
                                                            }
                                                            return Unit.INSTANCE;
                                                    }
                                                }
                                            }), 3);
                                        }
                                        boolean z17 = !(eVar9.f116088e instanceof m21.b.C2206b);
                                        x0.f23314a.getClass();
                                        j21.m.a(f0Var3, z17, g2.b(x0.Qd), g2.b(x0.f23598qf), dVar6, eVar6, lVar14, lVar15, lVar16);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(lVar17);
                        objQ3 = lVar17;
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            final int i110 = 2;
                            e23.l lVar18 = new e23.l() { // from class: l21.l
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    switch (i110) {
                                        case 0:
                                            f0 f0Var = (f0) obj4;
                                            f0Var.getClass();
                                            zc.d dVar4 = dVar3;
                                            boolean z14 = dVar4.d().f196385a instanceof z0.c;
                                            final m21.e eVar7 = eVar5;
                                            final e23.a aVar5 = aVar4;
                                            if (z14 && dVar4.c().isEmpty()) {
                                                final int i111 = 0;
                                                f0.b(f0Var, null, new z3.e(-1173699411, true, new e23.q() { // from class: l21.m
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        String strH;
                                                        String strH2;
                                                        String str;
                                                        int i114 = i111;
                                                        e23.a aVar8 = aVar5;
                                                        m21.e eVar10 = eVar7;
                                                        switch (i114) {
                                                            case 0:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    String str2 = eVar10.f116084a;
                                                                    m21.b bVar = eVar10.f116088e;
                                                                    if (str2.length() > 0) {
                                                                        mVar4.C(-350320041);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(-349883685);
                                                                        if (bVar.d()) {
                                                                            mVar4.C(-349718703);
                                                                            mVar4.f();
                                                                            strH = null;
                                                                        } else {
                                                                            strH = sn.a.h(mVar4, -349822863, R.string.create_food, mVar4);
                                                                        }
                                                                        e23.a aVar9 = !bVar.d() ? aVar8 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar4, R.string.lbl_cannot_find_custom_foods), y.Q(mVar4, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar9, null, null, mVar4, 3072, 192);
                                                                        mVar4.f();
                                                                    }
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                break;
                                                            case 1:
                                                                p3.m mVar5 = (p3.m) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                    x1 x1Var5 = p3.n.f135158a;
                                                                    String str3 = eVar10.f116084a;
                                                                    m21.b bVar2 = eVar10.f116088e;
                                                                    if (str3.length() > 0) {
                                                                        mVar5.C(890054817);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar5, R.string.lbl_no_results_found), y.Q(mVar5, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar5, 3072, 16);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(890490460);
                                                                        if (bVar2.d()) {
                                                                            mVar5.C(890656155);
                                                                            mVar5.f();
                                                                            strH2 = null;
                                                                        } else {
                                                                            strH2 = sn.a.h(mVar5, 890551995, R.string.create_meal, mVar5);
                                                                        }
                                                                        e23.a aVar10 = !bVar2.d() ? aVar8 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar5, R.string.lbl_create_a_meal), y.Q(mVar5, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar10, null, null, mVar5, 3072, 192);
                                                                        mVar5.f();
                                                                    }
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                break;
                                                            default:
                                                                p3.m mVar6 = (p3.m) obj6;
                                                                int iIntValue6 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                    x1 x1Var6 = p3.n.f135158a;
                                                                    String str4 = eVar10.f116084a;
                                                                    m21.b bVar3 = eVar10.f116088e;
                                                                    if (str4.length() > 0) {
                                                                        mVar6.C(1742034231);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar6, R.string.lbl_no_results_found), y.Q(mVar6, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar6, 3072, 16);
                                                                        mVar6.f();
                                                                    } else {
                                                                        mVar6.C(1742470308);
                                                                        if (bVar3.d()) {
                                                                            mVar6.C(1742641521);
                                                                            mVar6.f();
                                                                            str = null;
                                                                        } else {
                                                                            mVar6.C(1742531595);
                                                                            x0.f23314a.getClass();
                                                                            String strW = gl1.d.W(x0.Jd);
                                                                            mVar6.f();
                                                                            str = strW;
                                                                        }
                                                                        e23.a aVar11 = !bVar3.d() ? aVar8 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        u4.d dVarA = ea.a(t62.c.f162799a);
                                                                        x0.f23314a.getClass();
                                                                        b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar11, null, null, mVar6, 3072, 192);
                                                                        mVar6.f();
                                                                    }
                                                                } else {
                                                                    mVar6.e();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }), 3);
                                            } else if (!dVar4.c().isEmpty() && !eVar7.f116085b && !eVar7.f116088e.d()) {
                                                final int i112 = 0;
                                                final e23.l lVar19 = lVar13;
                                                f0.b(f0Var, null, new z3.e(-500586652, true, new e23.q() { // from class: l21.n
                                                    /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                    /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                    /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        int i114 = i112;
                                                        p3.m.a aVar8 = p3.m.f135153a;
                                                        m21.e eVar10 = eVar7;
                                                        e23.a aVar9 = aVar5;
                                                        switch (i114) {
                                                            case 0:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar11 = j92.b.f97899b;
                                                                    float f14 = eVar11.f97920e;
                                                                    h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                                    c2.j jVar = c2.j.f22691a;
                                                                    float f15 = eVar11.f97920e;
                                                                    jVar.getClass();
                                                                    s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar4, 48);
                                                                    int iHashCode = Long.hashCode(mVar4.getU());
                                                                    i2 i2VarX = mVar4.x();
                                                                    h4.r rVarC2 = h4.k.c(rVarC, mVar4);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar10 = h5.g.a.f81805b;
                                                                    if (mVar4.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar4.z();
                                                                    if (mVar4.getT()) {
                                                                        mVar4.M(aVar10);
                                                                    } else {
                                                                        mVar4.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar4);
                                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                                                                        v.h.z(iHashCode, mVar4, iHashCode, bVar2);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                                    u2 u2Var = u2.f22900a;
                                                                    l72.f0.a aVar11 = l72.f0.a.f111000a;
                                                                    String strQ = y.Q(mVar4, R.string.create_food);
                                                                    boolean zB16 = mVar4.B(aVar9);
                                                                    Object objQ4 = mVar4.q();
                                                                    if (zB16) {
                                                                        objQ4 = new ku1.a(aVar9, 19);
                                                                        mVar4.K(objQ4);
                                                                    } else {
                                                                        aVar8.getClass();
                                                                        if (objQ4 == p3.m.a.f135155b) {
                                                                            objQ4 = new ku1.a(aVar9, 19);
                                                                            mVar4.K(objQ4);
                                                                        }
                                                                    }
                                                                    aVar11.f(strQ, null, false, (e23.a) objQ4, mVar4, 0, 6);
                                                                    if (eVar10.b()) {
                                                                        mVar4.C(-1562464720);
                                                                        List<b11.l> list = eVar10.f116100q;
                                                                        b11.l lVar111 = eVar10.f116101r;
                                                                        y01.l.a(null, list, lVar111 != null ? Long.valueOf(lVar111.f14331a) : null, lVar19, mVar4, 0, 1);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(-1562139902);
                                                                        mVar4.f();
                                                                    }
                                                                    mVar4.y();
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            case 1:
                                                                p3.m mVar5 = (p3.m) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                    x1 x1Var5 = p3.n.f135158a;
                                                                    h4.r.a aVar12 = h4.r.S;
                                                                    h4.r rVarD2 = x2.d(aVar12, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar12 = j92.b.f97899b;
                                                                    h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar12.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar3 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar5, 48);
                                                                    int iHashCode2 = Long.hashCode(mVar5.getU());
                                                                    i2 i2VarX2 = mVar5.x();
                                                                    h4.r rVarC4 = h4.k.c(rVarC3, mVar5);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar13 = h5.g.a.f81805b;
                                                                    if (mVar5.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar5.z();
                                                                    if (mVar5.getT()) {
                                                                        mVar5.M(aVar13);
                                                                    } else {
                                                                        mVar5.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA2, mVar5);
                                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar5);
                                                                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                                                                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar4);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC4, mVar5);
                                                                    u2 u2Var2 = u2.f22900a;
                                                                    l72.f0.a aVar14 = l72.f0.a.f111000a;
                                                                    String strQ2 = y.Q(mVar5, R.string.create_meal);
                                                                    h4.r rVarC5 = c2.l.C(aVar12, eVar12.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB17 = mVar5.B(aVar9);
                                                                    Object objQ5 = mVar5.q();
                                                                    if (zB17) {
                                                                        objQ5 = new ku1.a(aVar9, 20);
                                                                        mVar5.K(objQ5);
                                                                    } else {
                                                                        aVar8.getClass();
                                                                        if (objQ5 == p3.m.a.f135155b) {
                                                                            objQ5 = new ku1.a(aVar9, 20);
                                                                            mVar5.K(objQ5);
                                                                        }
                                                                    }
                                                                    aVar14.f(strQ2, rVarC5, false, (e23.a) objQ5, mVar5, 0, 4);
                                                                    if (eVar10.b()) {
                                                                        mVar5.C(-321960809);
                                                                        List<b11.l> list2 = eVar10.f116100q;
                                                                        b11.l lVar112 = eVar10.f116101r;
                                                                        y01.l.a(c2.l.C(aVar12, eVar12.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar112 != null ? Long.valueOf(lVar112.f14331a) : null, lVar19, mVar5, 0, 0);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(-321572596);
                                                                        mVar5.f();
                                                                    }
                                                                    mVar5.y();
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            default:
                                                                p3.m mVar6 = (p3.m) obj6;
                                                                int iIntValue6 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                    x1 x1Var6 = p3.n.f135158a;
                                                                    h4.r.a aVar15 = h4.r.S;
                                                                    h4.r rVarD3 = x2.d(aVar15, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar13 = j92.b.f97899b;
                                                                    h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar13.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar5 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar6, 48);
                                                                    int iHashCode3 = Long.hashCode(mVar6.getU());
                                                                    i2 i2VarX3 = mVar6.x();
                                                                    h4.r rVarC7 = h4.k.c(rVarC6, mVar6);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar16 = h5.g.a.f81805b;
                                                                    if (mVar6.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar6.z();
                                                                    if (mVar6.getT()) {
                                                                        mVar6.M(aVar16);
                                                                    } else {
                                                                        mVar6.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA3, mVar6);
                                                                    b4.c(h5.g.a.f81809f, i2VarX3, mVar6);
                                                                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode3))) {
                                                                        v.h.z(iHashCode3, mVar6, iHashCode3, bVar6);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC7, mVar6);
                                                                    u2 u2Var3 = u2.f22900a;
                                                                    l72.f0.a aVar17 = l72.f0.a.f111000a;
                                                                    x0.f23314a.getClass();
                                                                    String strW = gl1.d.W(x0.Jd);
                                                                    h4.r rVarC8 = c2.l.C(aVar15, eVar13.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB18 = mVar6.B(aVar9);
                                                                    Object objQ6 = mVar6.q();
                                                                    if (zB18) {
                                                                        objQ6 = new ku1.a(aVar9, 21);
                                                                        mVar6.K(objQ6);
                                                                    } else {
                                                                        aVar8.getClass();
                                                                        if (objQ6 == p3.m.a.f135155b) {
                                                                            objQ6 = new ku1.a(aVar9, 21);
                                                                            mVar6.K(objQ6);
                                                                        }
                                                                    }
                                                                    aVar17.f(strW, rVarC8, false, (e23.a) objQ6, mVar6, 0, 4);
                                                                    if (eVar10.b()) {
                                                                        mVar6.C(231180845);
                                                                        List<b11.l> list3 = eVar10.f116100q;
                                                                        b11.l lVar113 = eVar10.f116101r;
                                                                        y01.l.a(c2.l.C(aVar15, eVar13.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar113 != null ? Long.valueOf(lVar113.f14331a) : null, lVar19, mVar6, 0, 0);
                                                                        mVar6.f();
                                                                    } else {
                                                                        mVar6.C(231569058);
                                                                        mVar6.f();
                                                                    }
                                                                    mVar6.y();
                                                                } else {
                                                                    mVar6.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                        }
                                                    }
                                                }), 3);
                                            }
                                            j21.m.a(f0Var, !eVar7.f116088e.d(), c22.i.b(R.string.delete_custom_food), c22.i.b(R.string.delete_food_this_cannot_be_undone), dVar4, eVar6, lVar14, lVar15, lVar16);
                                            break;
                                        case 1:
                                            f0 f0Var2 = (f0) obj4;
                                            f0Var2.getClass();
                                            zc.d dVar5 = dVar3;
                                            boolean z15 = dVar5.d().f196385a instanceof z0.c;
                                            final m21.e eVar8 = eVar5;
                                            final e23.a aVar6 = aVar4;
                                            if (z15 && dVar5.c().isEmpty()) {
                                                final int i113 = 1;
                                                f0.b(f0Var2, null, new z3.e(-1225270621, true, new e23.q() { // from class: l21.m
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        String strH;
                                                        String strH2;
                                                        String str;
                                                        int i114 = i113;
                                                        e23.a aVar8 = aVar6;
                                                        m21.e eVar10 = eVar8;
                                                        switch (i114) {
                                                            case 0:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    String str2 = eVar10.f116084a;
                                                                    m21.b bVar = eVar10.f116088e;
                                                                    if (str2.length() > 0) {
                                                                        mVar4.C(-350320041);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(-349883685);
                                                                        if (bVar.d()) {
                                                                            mVar4.C(-349718703);
                                                                            mVar4.f();
                                                                            strH = null;
                                                                        } else {
                                                                            strH = sn.a.h(mVar4, -349822863, R.string.create_food, mVar4);
                                                                        }
                                                                        e23.a aVar9 = !bVar.d() ? aVar8 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar4, R.string.lbl_cannot_find_custom_foods), y.Q(mVar4, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar9, null, null, mVar4, 3072, 192);
                                                                        mVar4.f();
                                                                    }
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                break;
                                                            case 1:
                                                                p3.m mVar5 = (p3.m) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                    x1 x1Var5 = p3.n.f135158a;
                                                                    String str3 = eVar10.f116084a;
                                                                    m21.b bVar2 = eVar10.f116088e;
                                                                    if (str3.length() > 0) {
                                                                        mVar5.C(890054817);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar5, R.string.lbl_no_results_found), y.Q(mVar5, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar5, 3072, 16);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(890490460);
                                                                        if (bVar2.d()) {
                                                                            mVar5.C(890656155);
                                                                            mVar5.f();
                                                                            strH2 = null;
                                                                        } else {
                                                                            strH2 = sn.a.h(mVar5, 890551995, R.string.create_meal, mVar5);
                                                                        }
                                                                        e23.a aVar10 = !bVar2.d() ? aVar8 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar5, R.string.lbl_create_a_meal), y.Q(mVar5, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar10, null, null, mVar5, 3072, 192);
                                                                        mVar5.f();
                                                                    }
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                break;
                                                            default:
                                                                p3.m mVar6 = (p3.m) obj6;
                                                                int iIntValue6 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                    x1 x1Var6 = p3.n.f135158a;
                                                                    String str4 = eVar10.f116084a;
                                                                    m21.b bVar3 = eVar10.f116088e;
                                                                    if (str4.length() > 0) {
                                                                        mVar6.C(1742034231);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar6, R.string.lbl_no_results_found), y.Q(mVar6, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar6, 3072, 16);
                                                                        mVar6.f();
                                                                    } else {
                                                                        mVar6.C(1742470308);
                                                                        if (bVar3.d()) {
                                                                            mVar6.C(1742641521);
                                                                            mVar6.f();
                                                                            str = null;
                                                                        } else {
                                                                            mVar6.C(1742531595);
                                                                            x0.f23314a.getClass();
                                                                            String strW = gl1.d.W(x0.Jd);
                                                                            mVar6.f();
                                                                            str = strW;
                                                                        }
                                                                        e23.a aVar11 = !bVar3.d() ? aVar8 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        u4.d dVarA = ea.a(t62.c.f162799a);
                                                                        x0.f23314a.getClass();
                                                                        b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar11, null, null, mVar6, 3072, 192);
                                                                        mVar6.f();
                                                                    }
                                                                } else {
                                                                    mVar6.e();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }), 3);
                                            } else if (!dVar5.c().isEmpty() && !eVar8.f116085b && !eVar8.f116088e.d()) {
                                                final int i114 = 1;
                                                final e23.l lVar110 = lVar13;
                                                f0.b(f0Var2, null, new z3.e(-552157862, true, new e23.q() { // from class: l21.n
                                                    /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                    /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                    /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        int i115 = i114;
                                                        p3.m.a aVar8 = p3.m.f135153a;
                                                        m21.e eVar10 = eVar8;
                                                        e23.a aVar9 = aVar6;
                                                        switch (i115) {
                                                            case 0:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar11 = j92.b.f97899b;
                                                                    float f14 = eVar11.f97920e;
                                                                    h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                                    c2.j jVar = c2.j.f22691a;
                                                                    float f15 = eVar11.f97920e;
                                                                    jVar.getClass();
                                                                    s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar4, 48);
                                                                    int iHashCode = Long.hashCode(mVar4.getU());
                                                                    i2 i2VarX = mVar4.x();
                                                                    h4.r rVarC2 = h4.k.c(rVarC, mVar4);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar10 = h5.g.a.f81805b;
                                                                    if (mVar4.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar4.z();
                                                                    if (mVar4.getT()) {
                                                                        mVar4.M(aVar10);
                                                                    } else {
                                                                        mVar4.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar4);
                                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                                                                        v.h.z(iHashCode, mVar4, iHashCode, bVar2);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                                    u2 u2Var = u2.f22900a;
                                                                    l72.f0.a aVar11 = l72.f0.a.f111000a;
                                                                    String strQ = y.Q(mVar4, R.string.create_food);
                                                                    boolean zB16 = mVar4.B(aVar9);
                                                                    Object objQ4 = mVar4.q();
                                                                    if (zB16) {
                                                                        objQ4 = new ku1.a(aVar9, 19);
                                                                        mVar4.K(objQ4);
                                                                    } else {
                                                                        aVar8.getClass();
                                                                        if (objQ4 == p3.m.a.f135155b) {
                                                                            objQ4 = new ku1.a(aVar9, 19);
                                                                            mVar4.K(objQ4);
                                                                        }
                                                                    }
                                                                    aVar11.f(strQ, null, false, (e23.a) objQ4, mVar4, 0, 6);
                                                                    if (eVar10.b()) {
                                                                        mVar4.C(-1562464720);
                                                                        List<b11.l> list = eVar10.f116100q;
                                                                        b11.l lVar111 = eVar10.f116101r;
                                                                        y01.l.a(null, list, lVar111 != null ? Long.valueOf(lVar111.f14331a) : null, lVar110, mVar4, 0, 1);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(-1562139902);
                                                                        mVar4.f();
                                                                    }
                                                                    mVar4.y();
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            case 1:
                                                                p3.m mVar5 = (p3.m) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                    x1 x1Var5 = p3.n.f135158a;
                                                                    h4.r.a aVar12 = h4.r.S;
                                                                    h4.r rVarD2 = x2.d(aVar12, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar12 = j92.b.f97899b;
                                                                    h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar12.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar3 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar5, 48);
                                                                    int iHashCode2 = Long.hashCode(mVar5.getU());
                                                                    i2 i2VarX2 = mVar5.x();
                                                                    h4.r rVarC4 = h4.k.c(rVarC3, mVar5);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar13 = h5.g.a.f81805b;
                                                                    if (mVar5.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar5.z();
                                                                    if (mVar5.getT()) {
                                                                        mVar5.M(aVar13);
                                                                    } else {
                                                                        mVar5.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA2, mVar5);
                                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar5);
                                                                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                                                                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar4);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC4, mVar5);
                                                                    u2 u2Var2 = u2.f22900a;
                                                                    l72.f0.a aVar14 = l72.f0.a.f111000a;
                                                                    String strQ2 = y.Q(mVar5, R.string.create_meal);
                                                                    h4.r rVarC5 = c2.l.C(aVar12, eVar12.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB17 = mVar5.B(aVar9);
                                                                    Object objQ5 = mVar5.q();
                                                                    if (zB17) {
                                                                        objQ5 = new ku1.a(aVar9, 20);
                                                                        mVar5.K(objQ5);
                                                                    } else {
                                                                        aVar8.getClass();
                                                                        if (objQ5 == p3.m.a.f135155b) {
                                                                            objQ5 = new ku1.a(aVar9, 20);
                                                                            mVar5.K(objQ5);
                                                                        }
                                                                    }
                                                                    aVar14.f(strQ2, rVarC5, false, (e23.a) objQ5, mVar5, 0, 4);
                                                                    if (eVar10.b()) {
                                                                        mVar5.C(-321960809);
                                                                        List<b11.l> list2 = eVar10.f116100q;
                                                                        b11.l lVar112 = eVar10.f116101r;
                                                                        y01.l.a(c2.l.C(aVar12, eVar12.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar112 != null ? Long.valueOf(lVar112.f14331a) : null, lVar110, mVar5, 0, 0);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(-321572596);
                                                                        mVar5.f();
                                                                    }
                                                                    mVar5.y();
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            default:
                                                                p3.m mVar6 = (p3.m) obj6;
                                                                int iIntValue6 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                    x1 x1Var6 = p3.n.f135158a;
                                                                    h4.r.a aVar15 = h4.r.S;
                                                                    h4.r rVarD3 = x2.d(aVar15, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar13 = j92.b.f97899b;
                                                                    h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar13.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar5 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar6, 48);
                                                                    int iHashCode3 = Long.hashCode(mVar6.getU());
                                                                    i2 i2VarX3 = mVar6.x();
                                                                    h4.r rVarC7 = h4.k.c(rVarC6, mVar6);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar16 = h5.g.a.f81805b;
                                                                    if (mVar6.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar6.z();
                                                                    if (mVar6.getT()) {
                                                                        mVar6.M(aVar16);
                                                                    } else {
                                                                        mVar6.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA3, mVar6);
                                                                    b4.c(h5.g.a.f81809f, i2VarX3, mVar6);
                                                                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode3))) {
                                                                        v.h.z(iHashCode3, mVar6, iHashCode3, bVar6);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC7, mVar6);
                                                                    u2 u2Var3 = u2.f22900a;
                                                                    l72.f0.a aVar17 = l72.f0.a.f111000a;
                                                                    x0.f23314a.getClass();
                                                                    String strW = gl1.d.W(x0.Jd);
                                                                    h4.r rVarC8 = c2.l.C(aVar15, eVar13.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB18 = mVar6.B(aVar9);
                                                                    Object objQ6 = mVar6.q();
                                                                    if (zB18) {
                                                                        objQ6 = new ku1.a(aVar9, 21);
                                                                        mVar6.K(objQ6);
                                                                    } else {
                                                                        aVar8.getClass();
                                                                        if (objQ6 == p3.m.a.f135155b) {
                                                                            objQ6 = new ku1.a(aVar9, 21);
                                                                            mVar6.K(objQ6);
                                                                        }
                                                                    }
                                                                    aVar17.f(strW, rVarC8, false, (e23.a) objQ6, mVar6, 0, 4);
                                                                    if (eVar10.b()) {
                                                                        mVar6.C(231180845);
                                                                        List<b11.l> list3 = eVar10.f116100q;
                                                                        b11.l lVar113 = eVar10.f116101r;
                                                                        y01.l.a(c2.l.C(aVar15, eVar13.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar113 != null ? Long.valueOf(lVar113.f14331a) : null, lVar110, mVar6, 0, 0);
                                                                        mVar6.f();
                                                                    } else {
                                                                        mVar6.C(231569058);
                                                                        mVar6.f();
                                                                    }
                                                                    mVar6.y();
                                                                } else {
                                                                    mVar6.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                        }
                                                    }
                                                }), 3);
                                            }
                                            j21.m.a(f0Var2, !eVar8.f116088e.d(), c22.i.b(R.string.delete_custom_meal), c22.i.b(R.string.delete_meal_this_cannot_be_undone), dVar5, eVar6, lVar14, lVar15, lVar16);
                                            break;
                                        default:
                                            f0 f0Var3 = (f0) obj4;
                                            f0Var3.getClass();
                                            zc.d dVar6 = dVar3;
                                            boolean z16 = dVar6.d().f196385a instanceof z0.c;
                                            final m21.e eVar9 = eVar5;
                                            final e23.a aVar7 = aVar4;
                                            if (z16 && dVar6.c().isEmpty()) {
                                                final int i24 = 2;
                                                f0.b(f0Var3, null, new z3.e(1835197901, true, new e23.q() { // from class: l21.m
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        String strH;
                                                        String strH2;
                                                        String str;
                                                        int i115 = i24;
                                                        e23.a aVar8 = aVar7;
                                                        m21.e eVar10 = eVar9;
                                                        switch (i115) {
                                                            case 0:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    String str2 = eVar10.f116084a;
                                                                    m21.b bVar = eVar10.f116088e;
                                                                    if (str2.length() > 0) {
                                                                        mVar4.C(-350320041);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar4, R.string.lbl_no_results_found), y.Q(mVar4, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar4, 3072, 16);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(-349883685);
                                                                        if (bVar.d()) {
                                                                            mVar4.C(-349718703);
                                                                            mVar4.f();
                                                                            strH = null;
                                                                        } else {
                                                                            strH = sn.a.h(mVar4, -349822863, R.string.create_food, mVar4);
                                                                        }
                                                                        e23.a aVar9 = !bVar.d() ? aVar8 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar4, R.string.lbl_cannot_find_custom_foods), y.Q(mVar4, R.string.msg_create_save_custom_food), x2.d(h4.r.S, 1.0f), strH, aVar9, null, null, mVar4, 3072, 192);
                                                                        mVar4.f();
                                                                    }
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                break;
                                                            case 1:
                                                                p3.m mVar5 = (p3.m) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                    x1 x1Var5 = p3.n.f135158a;
                                                                    String str3 = eVar10.f116084a;
                                                                    m21.b bVar2 = eVar10.f116088e;
                                                                    if (str3.length() > 0) {
                                                                        mVar5.C(890054817);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar5, R.string.lbl_no_results_found), y.Q(mVar5, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar5, 3072, 16);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(890490460);
                                                                        if (bVar2.d()) {
                                                                            mVar5.C(890656155);
                                                                            mVar5.f();
                                                                            strH2 = null;
                                                                        } else {
                                                                            strH2 = sn.a.h(mVar5, 890551995, R.string.create_meal, mVar5);
                                                                        }
                                                                        e23.a aVar10 = !bVar2.d() ? aVar8 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.d(ea.a(t62.c.f162799a), y.Q(mVar5, R.string.lbl_create_a_meal), y.Q(mVar5, R.string.msg_custom_meal), x2.d(h4.r.S, 1.0f), strH2, aVar10, null, null, mVar5, 3072, 192);
                                                                        mVar5.f();
                                                                    }
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                break;
                                                            default:
                                                                p3.m mVar6 = (p3.m) obj6;
                                                                int iIntValue6 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                    x1 x1Var6 = p3.n.f135158a;
                                                                    String str4 = eVar10.f116084a;
                                                                    m21.b bVar3 = eVar10.f116088e;
                                                                    if (str4.length() > 0) {
                                                                        mVar6.C(1742034231);
                                                                        s62.a.f157643a.getClass();
                                                                        b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar6, R.string.lbl_no_results_found), y.Q(mVar6, R.string.msg_try_revising_your_search), x2.d(h4.r.S, 1.0f), null, mVar6, 3072, 16);
                                                                        mVar6.f();
                                                                    } else {
                                                                        mVar6.C(1742470308);
                                                                        if (bVar3.d()) {
                                                                            mVar6.C(1742641521);
                                                                            mVar6.f();
                                                                            str = null;
                                                                        } else {
                                                                            mVar6.C(1742531595);
                                                                            x0.f23314a.getClass();
                                                                            String strW = gl1.d.W(x0.Jd);
                                                                            mVar6.f();
                                                                            str = strW;
                                                                        }
                                                                        e23.a aVar11 = !bVar3.d() ? aVar8 : null;
                                                                        s62.a.f157643a.getClass();
                                                                        u4.d dVarA = ea.a(t62.c.f162799a);
                                                                        x0.f23314a.getClass();
                                                                        b82.n.d(dVarA, gl1.d.W(x0.Id), gl1.d.W(x0.f23564of), x2.d(h4.r.S, 1.0f), str, aVar11, null, null, mVar6, 3072, 192);
                                                                        mVar6.f();
                                                                    }
                                                                } else {
                                                                    mVar6.e();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }), 3);
                                            } else if (!dVar6.c().isEmpty() && !eVar9.f116085b && !eVar9.f116088e.d()) {
                                                final int i25 = 2;
                                                final e23.l lVar111 = lVar13;
                                                f0.b(f0Var3, null, new z3.e(-783051516, true, new e23.q() { // from class: l21.n
                                                    /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
                                                    /* JADX WARN: Code duplicated, block: B:58:0x0234  */
                                                    /* JADX WARN: Code duplicated, block: B:92:0x0367  */
                                                    @Override // e23.q
                                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                        int i115 = i25;
                                                        p3.m.a aVar8 = p3.m.f135153a;
                                                        m21.e eVar10 = eVar9;
                                                        e23.a aVar9 = aVar7;
                                                        switch (i115) {
                                                            case 0:
                                                                p3.m mVar4 = (p3.m) obj6;
                                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    x1 x1Var4 = p3.n.f135158a;
                                                                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar11 = j92.b.f97899b;
                                                                    float f14 = eVar11.f97920e;
                                                                    h4.r rVarC = c2.l.C(rVarD, f14, 0.0f, 0.0f, f14, 6);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar = h4.d.a.f81534l;
                                                                    c2.j jVar = c2.j.f22691a;
                                                                    float f15 = eVar11.f97920e;
                                                                    jVar.getClass();
                                                                    s2 s2VarA = q2.a(c2.j.i(f15), bVar, mVar4, 48);
                                                                    int iHashCode = Long.hashCode(mVar4.getU());
                                                                    i2 i2VarX = mVar4.x();
                                                                    h4.r rVarC2 = h4.k.c(rVarC, mVar4);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar10 = h5.g.a.f81805b;
                                                                    if (mVar4.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar4.z();
                                                                    if (mVar4.getT()) {
                                                                        mVar4.M(aVar10);
                                                                    } else {
                                                                        mVar4.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA, mVar4);
                                                                    b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                                                                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                                                                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                                                                        v.h.z(iHashCode, mVar4, iHashCode, bVar2);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                                    u2 u2Var = u2.f22900a;
                                                                    l72.f0.a aVar11 = l72.f0.a.f111000a;
                                                                    String strQ = y.Q(mVar4, R.string.create_food);
                                                                    boolean zB16 = mVar4.B(aVar9);
                                                                    Object objQ4 = mVar4.q();
                                                                    if (zB16) {
                                                                        objQ4 = new ku1.a(aVar9, 19);
                                                                        mVar4.K(objQ4);
                                                                    } else {
                                                                        aVar8.getClass();
                                                                        if (objQ4 == p3.m.a.f135155b) {
                                                                            objQ4 = new ku1.a(aVar9, 19);
                                                                            mVar4.K(objQ4);
                                                                        }
                                                                    }
                                                                    aVar11.f(strQ, null, false, (e23.a) objQ4, mVar4, 0, 6);
                                                                    if (eVar10.b()) {
                                                                        mVar4.C(-1562464720);
                                                                        List<b11.l> list = eVar10.f116100q;
                                                                        b11.l lVar112 = eVar10.f116101r;
                                                                        y01.l.a(null, list, lVar112 != null ? Long.valueOf(lVar112.f14331a) : null, lVar111, mVar4, 0, 1);
                                                                        mVar4.f();
                                                                    } else {
                                                                        mVar4.C(-1562139902);
                                                                        mVar4.f();
                                                                    }
                                                                    mVar4.y();
                                                                } else {
                                                                    mVar4.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            case 1:
                                                                p3.m mVar5 = (p3.m) obj6;
                                                                int iIntValue5 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                    x1 x1Var5 = p3.n.f135158a;
                                                                    h4.r.a aVar12 = h4.r.S;
                                                                    h4.r rVarD2 = x2.d(aVar12, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar12 = j92.b.f97899b;
                                                                    h4.r rVarC3 = c2.l.C(rVarD2, 0.0f, 0.0f, 0.0f, eVar12.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar3 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar5, 48);
                                                                    int iHashCode2 = Long.hashCode(mVar5.getU());
                                                                    i2 i2VarX2 = mVar5.x();
                                                                    h4.r rVarC4 = h4.k.c(rVarC3, mVar5);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar13 = h5.g.a.f81805b;
                                                                    if (mVar5.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar5.z();
                                                                    if (mVar5.getT()) {
                                                                        mVar5.M(aVar13);
                                                                    } else {
                                                                        mVar5.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA2, mVar5);
                                                                    b4.c(h5.g.a.f81809f, i2VarX2, mVar5);
                                                                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                                                                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                                                                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar4);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC4, mVar5);
                                                                    u2 u2Var2 = u2.f22900a;
                                                                    l72.f0.a aVar14 = l72.f0.a.f111000a;
                                                                    String strQ2 = y.Q(mVar5, R.string.create_meal);
                                                                    h4.r rVarC5 = c2.l.C(aVar12, eVar12.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB17 = mVar5.B(aVar9);
                                                                    Object objQ5 = mVar5.q();
                                                                    if (zB17) {
                                                                        objQ5 = new ku1.a(aVar9, 20);
                                                                        mVar5.K(objQ5);
                                                                    } else {
                                                                        aVar8.getClass();
                                                                        if (objQ5 == p3.m.a.f135155b) {
                                                                            objQ5 = new ku1.a(aVar9, 20);
                                                                            mVar5.K(objQ5);
                                                                        }
                                                                    }
                                                                    aVar14.f(strQ2, rVarC5, false, (e23.a) objQ5, mVar5, 0, 4);
                                                                    if (eVar10.b()) {
                                                                        mVar5.C(-321960809);
                                                                        List<b11.l> list2 = eVar10.f116100q;
                                                                        b11.l lVar113 = eVar10.f116101r;
                                                                        y01.l.a(c2.l.C(aVar12, eVar12.f97920e, 0.0f, 0.0f, 0.0f, 14), list2, lVar113 != null ? Long.valueOf(lVar113.f14331a) : null, lVar111, mVar5, 0, 0);
                                                                        mVar5.f();
                                                                    } else {
                                                                        mVar5.C(-321572596);
                                                                        mVar5.f();
                                                                    }
                                                                    mVar5.y();
                                                                } else {
                                                                    mVar5.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                            default:
                                                                p3.m mVar6 = (p3.m) obj6;
                                                                int iIntValue6 = ((Integer) obj7).intValue();
                                                                ((e2.d) obj5).getClass();
                                                                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                                    x1 x1Var6 = p3.n.f135158a;
                                                                    h4.r.a aVar15 = h4.r.S;
                                                                    h4.r rVarD3 = x2.d(aVar15, 1.0f);
                                                                    d92.b.f58623a.getClass();
                                                                    d92.b.f58625c.getClass();
                                                                    j92.e eVar13 = j92.b.f97899b;
                                                                    h4.r rVarC6 = c2.l.C(rVarD3, 0.0f, 0.0f, 0.0f, eVar13.f97920e, 7);
                                                                    h4.d.f81522a.getClass();
                                                                    h4.g.b bVar5 = h4.d.a.f81534l;
                                                                    c2.j.f22691a.getClass();
                                                                    s2 s2VarA3 = q2.a(c2.j.f22692b, bVar5, mVar6, 48);
                                                                    int iHashCode3 = Long.hashCode(mVar6.getU());
                                                                    i2 i2VarX3 = mVar6.x();
                                                                    h4.r rVarC7 = h4.k.c(rVarC6, mVar6);
                                                                    h5.g.V.getClass();
                                                                    e0.a aVar16 = h5.g.a.f81805b;
                                                                    if (mVar6.F() == null) {
                                                                        p0.l();
                                                                        throw null;
                                                                    }
                                                                    mVar6.z();
                                                                    if (mVar6.getT()) {
                                                                        mVar6.M(aVar16);
                                                                    } else {
                                                                        mVar6.c();
                                                                    }
                                                                    b4.c(h5.g.a.f81810g, s2VarA3, mVar6);
                                                                    b4.c(h5.g.a.f81809f, i2VarX3, mVar6);
                                                                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                                                                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode3))) {
                                                                        v.h.z(iHashCode3, mVar6, iHashCode3, bVar6);
                                                                    }
                                                                    b4.c(h5.g.a.f81807d, rVarC7, mVar6);
                                                                    u2 u2Var3 = u2.f22900a;
                                                                    l72.f0.a aVar17 = l72.f0.a.f111000a;
                                                                    x0.f23314a.getClass();
                                                                    String strW = gl1.d.W(x0.Jd);
                                                                    h4.r rVarC8 = c2.l.C(aVar15, eVar13.f97920e, 0.0f, 0.0f, 0.0f, 14);
                                                                    boolean zB18 = mVar6.B(aVar9);
                                                                    Object objQ6 = mVar6.q();
                                                                    if (zB18) {
                                                                        objQ6 = new ku1.a(aVar9, 21);
                                                                        mVar6.K(objQ6);
                                                                    } else {
                                                                        aVar8.getClass();
                                                                        if (objQ6 == p3.m.a.f135155b) {
                                                                            objQ6 = new ku1.a(aVar9, 21);
                                                                            mVar6.K(objQ6);
                                                                        }
                                                                    }
                                                                    aVar17.f(strW, rVarC8, false, (e23.a) objQ6, mVar6, 0, 4);
                                                                    if (eVar10.b()) {
                                                                        mVar6.C(231180845);
                                                                        List<b11.l> list3 = eVar10.f116100q;
                                                                        b11.l lVar114 = eVar10.f116101r;
                                                                        y01.l.a(c2.l.C(aVar15, eVar13.f97920e, 0.0f, 0.0f, 0.0f, 14), list3, lVar114 != null ? Long.valueOf(lVar114.f14331a) : null, lVar111, mVar6, 0, 0);
                                                                        mVar6.f();
                                                                    } else {
                                                                        mVar6.C(231569058);
                                                                        mVar6.f();
                                                                    }
                                                                    mVar6.y();
                                                                } else {
                                                                    mVar6.e();
                                                                }
                                                                return Unit.INSTANCE;
                                                        }
                                                    }
                                                }), 3);
                                            }
                                            boolean z17 = !(eVar9.f116088e instanceof m21.b.C2206b);
                                            x0.f23314a.getClass();
                                            j21.m.a(f0Var3, z17, g2.b(x0.Qd), g2.b(x0.f23598qf), dVar6, eVar6, lVar14, lVar15, lVar16);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(lVar18);
                            objQ3 = lVar18;
                        }
                    }
                    e2.c.b(null, null, l2VarE3, null, null, null, false, null, (e23.l) objQ3, mVar3, 0, 507);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
