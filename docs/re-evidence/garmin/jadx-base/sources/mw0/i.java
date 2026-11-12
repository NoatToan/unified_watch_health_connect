package mw0;

import androidx.lifecycle.v1;
import aq.j2;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.nutrition.NutritionHydrationActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.mapbox.maps.extension.compose.style.StyleKt;
import com.mapbox.maps.extension.compose.style.StyleState;
import com.mapbox.maps.extension.compose.style.terrain.generated.TerrainState;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.Collection;
import java.util.List;
import l72.x0;
import lc.m0;
import nw0.a0;
import nw0.f0;
import nw0.g0;
import nw0.i0;
import o4.m1;
import o53.s0;
import o72.a3;
import o72.c2;
import o72.d2;
import o72.o1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.l1;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import r82.u;
import v62.e1;
import wv0.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f121272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f121273c;

    public /* synthetic */ i(int i14, Object obj, Object obj2) {
        this.f121271a = i14;
        this.f121272b = obj;
        this.f121273c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0442  */
    /* JADX WARN: Code duplicated, block: B:165:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:173:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:192:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:197:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:202:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:207:0x0702  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f121271a;
        p3.m.a aVar = p3.m.f135153a;
        final int i15 = 2;
        final int i16 = 3;
        boolean z14 = false;
        final int i17 = 1;
        Object obj3 = this.f121273c;
        Object obj4 = this.f121272b;
        switch (i14) {
            case 0:
                x0.a aVar2 = (x0.a) obj4;
                String str = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    h4.r.a aVar3 = h4.r.S;
                    s2 s2VarA = q2.a(c0343j, bVar, mVar, 54);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(aVar3, mVar);
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
                    b4.c(h5.g.a.f81810g, s2VarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    u2 u2Var = u2.f22900a;
                    aVar2.a(mVar, 0);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97932i, mVar);
                    d92.b.f58625c.getClass();
                    h4.r rVarC2 = c2.l.C(aVar3, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14);
                    d6.p.f57793b.getClass();
                    mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57794c, false, Integer.MAX_VALUE, 0, null, x0VarB, mVar, 0, 24960, 110588);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                mw1.c.c(p0.t(1), (h4.r) obj4, (Integer) obj3, (p3.m) obj);
                return Unit.INSTANCE;
            case 2:
                String str2 = (String) obj3;
                gx.b bVar3 = (gx.b) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC3 = c2.l.C(rVarD, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(cVar, h4.d.a.f81536n, mVar2, 6);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC4 = h4.k.c(rVarC3, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar2);
                    mx.g.d(b0.f22601a, str2, bVar3, mVar2, 6);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                n02.f fVar = (n02.f) obj4;
                e23.l lVar = (e23.l) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar6 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA2 = y.a(c2.j.f22694d, aVar6, mVar3, 48);
                    int iHashCode3 = Long.hashCode(mVar3.getU());
                    i2 i2VarX3 = mVar3.x();
                    h4.r rVarC5 = h4.k.c(rVarF, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, zVarA2, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar3);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar3);
                    b0 b0Var = b0.f22601a;
                    n02.e.a(fVar, null, lVar, mVar3, 0);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                nc.j.b((List) obj4, (Collection) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                gl1.d.g((d4.c) obj4, (e23.p) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                GearActivity.a aVar8 = GearActivity.f35500b;
                ((GearActivity) obj4).ea((String) obj3, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar9 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                ((com.garmin.android.apps.connectmobile.activities.manual.eventType.b) obj4).u6((i53.c) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                qs.g gVar = (qs.g) obj4;
                p1 p1Var = (p1) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar10 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    if (((qs.g) p1Var.getF182175a()) == gVar) {
                        mVar4.C(-1595111863);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = e1.a(t62.b.f162798a);
                        long jG = fb1.c.g(d92.b.f58623a, mVar4);
                        h4.r.a aVar11 = h4.r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA, "", x2.q(aVar11, j92.b.f97901d.f97905d), jG, mVar4, 48, 0);
                        mVar4.f();
                    } else {
                        mVar4.C(-1594678235);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                nw0.e.a((nw0.g) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                nw0.q.e((nw0.r) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                final a0 a0Var = (a0) obj4;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    if (((g0) p1Var2.getF182175a()).f128037a instanceof f0.a) {
                        mVar5.C(-2099945828);
                        boolean zR = mVar5.r(a0Var);
                        Object objQ = mVar5.q();
                        if (zR) {
                            final int i18 = z14 ? 1 : 0;
                            objQ = new e23.a() { // from class: nw0.y
                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i18;
                                    a0 a0Var2 = a0Var;
                                    switch (i19) {
                                        case 0:
                                            a0Var2.getClass();
                                            w9.a aVarA = v1.a(a0Var2);
                                            x53.c cVar2 = s0.f129406a;
                                            ge1.b.T(aVarA, x53.b.f189152a, null, new b0(a0Var2, null), 2);
                                            break;
                                        default:
                                            a0Var2.getClass();
                                            ge1.b.T(v1.a(a0Var2), null, null, new c0(a0Var2, null), 3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar5.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final int i19 = z14 ? 1 : 0;
                                objQ = new e23.a() { // from class: nw0.y
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i110 = i19;
                                        a0 a0Var2 = a0Var;
                                        switch (i110) {
                                            case 0:
                                                a0Var2.getClass();
                                                w9.a aVarA = v1.a(a0Var2);
                                                x53.c cVar2 = s0.f129406a;
                                                ge1.b.T(aVarA, x53.b.f189152a, null, new b0(a0Var2, null), 2);
                                                break;
                                            default:
                                                a0Var2.getClass();
                                                ge1.b.T(v1.a(a0Var2), null, null, new c0(a0Var2, null), 3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar5.K(objQ);
                            }
                        }
                        x.a(null, (e23.a) objQ, mVar5, 0, 1);
                        mVar5.f();
                    } else if (((g0) p1Var2.getF182175a()).f128038b instanceof i0.a) {
                        mVar5.C(-2099801027);
                        String strQ = gl1.y.Q(mVar5, R.string.common_save_error_title);
                        boolean zR2 = mVar5.r(a0Var);
                        Object objQ2 = mVar5.q();
                        if (zR2) {
                            objQ2 = new e23.a() { // from class: nw0.y
                                @Override // e23.a
                                public final Object invoke() {
                                    int i110 = i17;
                                    a0 a0Var2 = a0Var;
                                    switch (i110) {
                                        case 0:
                                            a0Var2.getClass();
                                            w9.a aVarA = v1.a(a0Var2);
                                            x53.c cVar2 = s0.f129406a;
                                            ge1.b.T(aVarA, x53.b.f189152a, null, new b0(a0Var2, null), 2);
                                            break;
                                        default:
                                            a0Var2.getClass();
                                            ge1.b.T(v1.a(a0Var2), null, null, new c0(a0Var2, null), 3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar5.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e23.a() { // from class: nw0.y
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i110 = i17;
                                        a0 a0Var2 = a0Var;
                                        switch (i110) {
                                            case 0:
                                                a0Var2.getClass();
                                                w9.a aVarA = v1.a(a0Var2);
                                                x53.c cVar2 = s0.f129406a;
                                                ge1.b.T(aVarA, x53.b.f189152a, null, new b0(a0Var2, null), 2);
                                                break;
                                            default:
                                                a0Var2.getClass();
                                                ge1.b.T(v1.a(a0Var2), null, null, new c0(a0Var2, null), 3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar5.K(objQ2);
                            }
                        }
                        x.a(strQ, (e23.a) objQ2, mVar5, 0, 0);
                        mVar5.f();
                    } else if (((g0) p1Var2.getF182175a()).f128037a instanceof f0.b) {
                        mVar5.C(-2099545928);
                        p1 p1VarC = s9.c.c(a0Var.f127992h, mVar5);
                        h4.r.a aVar12 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC6 = c2.l.C(aVar12, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA3 = y.a(kVar, h4.d.a.f81536n, mVar5, 0);
                        int iHashCode4 = Long.hashCode(mVar5.getU());
                        i2 i2VarX4 = mVar5.x();
                        h4.r rVarC7 = h4.k.c(rVarC6, mVar5);
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
                        b4.c(h5.g.a.f81810g, zVarA3, mVar5);
                        b4.c(h5.g.a.f81809f, i2VarX4, mVar5);
                        h5.g.a.b bVar6 = h5.g.a.f81813j;
                        if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode4))) {
                            v.h.z(iHashCode4, mVar5, iHashCode4, bVar6);
                        }
                        b4.c(h5.g.a.f81807d, rVarC7, mVar5);
                        b0 b0Var2 = b0.f22601a;
                        rd1.a aVar14 = (rd1.a) p1VarC.getF182175a();
                        boolean zR3 = mVar5.r(a0Var);
                        Object objQ3 = mVar5.q();
                        if (zR3) {
                            objQ3 = new e23.l() { // from class: nw0.w
                                @Override // e23.l
                                public final Object invoke(Object obj5) {
                                    Object value;
                                    rd1.a aVar15;
                                    Object value2;
                                    rd1.a aVar16;
                                    Object value3;
                                    rd1.a aVar17;
                                    Object value4;
                                    rd1.a aVar18;
                                    switch (i17) {
                                        case 0:
                                            b63.v vVar = (b63.v) obj5;
                                            vVar.getClass();
                                            a0 a0Var2 = a0Var;
                                            a0Var2.getClass();
                                            p2 p2Var = a0Var2.f127991g;
                                            do {
                                                value = p2Var.getValue();
                                                aVar15 = (rd1.a) value;
                                            } while (!p2Var.b(value, rd1.a.a(aVar15, null, qd1.a.a(aVar15.f152033b, false, null, vVar, 11), 13)));
                                            break;
                                        case 1:
                                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                            p2 p2Var2 = a0Var.f127991g;
                                            do {
                                                value2 = p2Var2.getValue();
                                                aVar16 = (rd1.a) value2;
                                            } while (!p2Var2.b(value2, rd1.a.a(aVar16, qd1.a.a(aVar16.f152032a, zBooleanValue, null, null, 14), null, 14)));
                                            break;
                                        case 2:
                                            b63.v vVar2 = (b63.v) obj5;
                                            vVar2.getClass();
                                            a0 a0Var3 = a0Var;
                                            a0Var3.getClass();
                                            p2 p2Var3 = a0Var3.f127991g;
                                            do {
                                                value3 = p2Var3.getValue();
                                                aVar17 = (rd1.a) value3;
                                            } while (!p2Var3.b(value3, rd1.a.a(aVar17, qd1.a.a(aVar17.f152032a, false, null, vVar2, 11), null, 14)));
                                            break;
                                        default:
                                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                            p2 p2Var4 = a0Var.f127991g;
                                            do {
                                                value4 = p2Var4.getValue();
                                                aVar18 = (rd1.a) value4;
                                            } while (!p2Var4.b(value4, rd1.a.a(aVar18, null, qd1.a.a(aVar18.f152033b, zBooleanValue2, null, null, 14), 13)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar5.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new e23.l() { // from class: nw0.w
                                    @Override // e23.l
                                    public final Object invoke(Object obj5) {
                                        Object value;
                                        rd1.a aVar15;
                                        Object value2;
                                        rd1.a aVar16;
                                        Object value3;
                                        rd1.a aVar17;
                                        Object value4;
                                        rd1.a aVar18;
                                        switch (i17) {
                                            case 0:
                                                b63.v vVar = (b63.v) obj5;
                                                vVar.getClass();
                                                a0 a0Var2 = a0Var;
                                                a0Var2.getClass();
                                                p2 p2Var = a0Var2.f127991g;
                                                do {
                                                    value = p2Var.getValue();
                                                    aVar15 = (rd1.a) value;
                                                } while (!p2Var.b(value, rd1.a.a(aVar15, null, qd1.a.a(aVar15.f152033b, false, null, vVar, 11), 13)));
                                                break;
                                            case 1:
                                                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                                p2 p2Var2 = a0Var.f127991g;
                                                do {
                                                    value2 = p2Var2.getValue();
                                                    aVar16 = (rd1.a) value2;
                                                } while (!p2Var2.b(value2, rd1.a.a(aVar16, qd1.a.a(aVar16.f152032a, zBooleanValue, null, null, 14), null, 14)));
                                                break;
                                            case 2:
                                                b63.v vVar2 = (b63.v) obj5;
                                                vVar2.getClass();
                                                a0 a0Var3 = a0Var;
                                                a0Var3.getClass();
                                                p2 p2Var3 = a0Var3.f127991g;
                                                do {
                                                    value3 = p2Var3.getValue();
                                                    aVar17 = (rd1.a) value3;
                                                } while (!p2Var3.b(value3, rd1.a.a(aVar17, qd1.a.a(aVar17.f152032a, false, null, vVar2, 11), null, 14)));
                                                break;
                                            default:
                                                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                                p2 p2Var4 = a0Var.f127991g;
                                                do {
                                                    value4 = p2Var4.getValue();
                                                    aVar18 = (rd1.a) value4;
                                                } while (!p2Var4.b(value4, rd1.a.a(aVar18, null, qd1.a.a(aVar18.f152033b, zBooleanValue2, null, null, 14), 13)));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar5.K(objQ3);
                            }
                        }
                        e23.l lVar2 = (e23.l) objQ3;
                        boolean zR4 = mVar5.r(a0Var);
                        Object objQ4 = mVar5.q();
                        if (zR4) {
                            objQ4 = new e23.l() { // from class: nw0.w
                                @Override // e23.l
                                public final Object invoke(Object obj5) {
                                    Object value;
                                    rd1.a aVar15;
                                    Object value2;
                                    rd1.a aVar16;
                                    Object value3;
                                    rd1.a aVar17;
                                    Object value4;
                                    rd1.a aVar18;
                                    switch (i15) {
                                        case 0:
                                            b63.v vVar = (b63.v) obj5;
                                            vVar.getClass();
                                            a0 a0Var2 = a0Var;
                                            a0Var2.getClass();
                                            p2 p2Var = a0Var2.f127991g;
                                            do {
                                                value = p2Var.getValue();
                                                aVar15 = (rd1.a) value;
                                            } while (!p2Var.b(value, rd1.a.a(aVar15, null, qd1.a.a(aVar15.f152033b, false, null, vVar, 11), 13)));
                                            break;
                                        case 1:
                                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                            p2 p2Var2 = a0Var.f127991g;
                                            do {
                                                value2 = p2Var2.getValue();
                                                aVar16 = (rd1.a) value2;
                                            } while (!p2Var2.b(value2, rd1.a.a(aVar16, qd1.a.a(aVar16.f152032a, zBooleanValue, null, null, 14), null, 14)));
                                            break;
                                        case 2:
                                            b63.v vVar2 = (b63.v) obj5;
                                            vVar2.getClass();
                                            a0 a0Var3 = a0Var;
                                            a0Var3.getClass();
                                            p2 p2Var3 = a0Var3.f127991g;
                                            do {
                                                value3 = p2Var3.getValue();
                                                aVar17 = (rd1.a) value3;
                                            } while (!p2Var3.b(value3, rd1.a.a(aVar17, qd1.a.a(aVar17.f152032a, false, null, vVar2, 11), null, 14)));
                                            break;
                                        default:
                                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                            p2 p2Var4 = a0Var.f127991g;
                                            do {
                                                value4 = p2Var4.getValue();
                                                aVar18 = (rd1.a) value4;
                                            } while (!p2Var4.b(value4, rd1.a.a(aVar18, null, qd1.a.a(aVar18.f152033b, zBooleanValue2, null, null, 14), 13)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar5.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new e23.l() { // from class: nw0.w
                                    @Override // e23.l
                                    public final Object invoke(Object obj5) {
                                        Object value;
                                        rd1.a aVar15;
                                        Object value2;
                                        rd1.a aVar16;
                                        Object value3;
                                        rd1.a aVar17;
                                        Object value4;
                                        rd1.a aVar18;
                                        switch (i15) {
                                            case 0:
                                                b63.v vVar = (b63.v) obj5;
                                                vVar.getClass();
                                                a0 a0Var2 = a0Var;
                                                a0Var2.getClass();
                                                p2 p2Var = a0Var2.f127991g;
                                                do {
                                                    value = p2Var.getValue();
                                                    aVar15 = (rd1.a) value;
                                                } while (!p2Var.b(value, rd1.a.a(aVar15, null, qd1.a.a(aVar15.f152033b, false, null, vVar, 11), 13)));
                                                break;
                                            case 1:
                                                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                                p2 p2Var2 = a0Var.f127991g;
                                                do {
                                                    value2 = p2Var2.getValue();
                                                    aVar16 = (rd1.a) value2;
                                                } while (!p2Var2.b(value2, rd1.a.a(aVar16, qd1.a.a(aVar16.f152032a, zBooleanValue, null, null, 14), null, 14)));
                                                break;
                                            case 2:
                                                b63.v vVar2 = (b63.v) obj5;
                                                vVar2.getClass();
                                                a0 a0Var3 = a0Var;
                                                a0Var3.getClass();
                                                p2 p2Var3 = a0Var3.f127991g;
                                                do {
                                                    value3 = p2Var3.getValue();
                                                    aVar17 = (rd1.a) value3;
                                                } while (!p2Var3.b(value3, rd1.a.a(aVar17, qd1.a.a(aVar17.f152032a, false, null, vVar2, 11), null, 14)));
                                                break;
                                            default:
                                                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                                p2 p2Var4 = a0Var.f127991g;
                                                do {
                                                    value4 = p2Var4.getValue();
                                                    aVar18 = (rd1.a) value4;
                                                } while (!p2Var4.b(value4, rd1.a.a(aVar18, null, qd1.a.a(aVar18.f152033b, zBooleanValue2, null, null, 14), 13)));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar5.K(objQ4);
                            }
                        }
                        e23.l lVar3 = (e23.l) objQ4;
                        boolean zR5 = mVar5.r(a0Var);
                        Object objQ5 = mVar5.q();
                        if (zR5) {
                            objQ5 = new e23.l() { // from class: nw0.w
                                @Override // e23.l
                                public final Object invoke(Object obj5) {
                                    Object value;
                                    rd1.a aVar15;
                                    Object value2;
                                    rd1.a aVar16;
                                    Object value3;
                                    rd1.a aVar17;
                                    Object value4;
                                    rd1.a aVar18;
                                    switch (i16) {
                                        case 0:
                                            b63.v vVar = (b63.v) obj5;
                                            vVar.getClass();
                                            a0 a0Var2 = a0Var;
                                            a0Var2.getClass();
                                            p2 p2Var = a0Var2.f127991g;
                                            do {
                                                value = p2Var.getValue();
                                                aVar15 = (rd1.a) value;
                                            } while (!p2Var.b(value, rd1.a.a(aVar15, null, qd1.a.a(aVar15.f152033b, false, null, vVar, 11), 13)));
                                            break;
                                        case 1:
                                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                            p2 p2Var2 = a0Var.f127991g;
                                            do {
                                                value2 = p2Var2.getValue();
                                                aVar16 = (rd1.a) value2;
                                            } while (!p2Var2.b(value2, rd1.a.a(aVar16, qd1.a.a(aVar16.f152032a, zBooleanValue, null, null, 14), null, 14)));
                                            break;
                                        case 2:
                                            b63.v vVar2 = (b63.v) obj5;
                                            vVar2.getClass();
                                            a0 a0Var3 = a0Var;
                                            a0Var3.getClass();
                                            p2 p2Var3 = a0Var3.f127991g;
                                            do {
                                                value3 = p2Var3.getValue();
                                                aVar17 = (rd1.a) value3;
                                            } while (!p2Var3.b(value3, rd1.a.a(aVar17, qd1.a.a(aVar17.f152032a, false, null, vVar2, 11), null, 14)));
                                            break;
                                        default:
                                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                            p2 p2Var4 = a0Var.f127991g;
                                            do {
                                                value4 = p2Var4.getValue();
                                                aVar18 = (rd1.a) value4;
                                            } while (!p2Var4.b(value4, rd1.a.a(aVar18, null, qd1.a.a(aVar18.f152033b, zBooleanValue2, null, null, 14), 13)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar5.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new e23.l() { // from class: nw0.w
                                    @Override // e23.l
                                    public final Object invoke(Object obj5) {
                                        Object value;
                                        rd1.a aVar15;
                                        Object value2;
                                        rd1.a aVar16;
                                        Object value3;
                                        rd1.a aVar17;
                                        Object value4;
                                        rd1.a aVar18;
                                        switch (i16) {
                                            case 0:
                                                b63.v vVar = (b63.v) obj5;
                                                vVar.getClass();
                                                a0 a0Var2 = a0Var;
                                                a0Var2.getClass();
                                                p2 p2Var = a0Var2.f127991g;
                                                do {
                                                    value = p2Var.getValue();
                                                    aVar15 = (rd1.a) value;
                                                } while (!p2Var.b(value, rd1.a.a(aVar15, null, qd1.a.a(aVar15.f152033b, false, null, vVar, 11), 13)));
                                                break;
                                            case 1:
                                                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                                p2 p2Var2 = a0Var.f127991g;
                                                do {
                                                    value2 = p2Var2.getValue();
                                                    aVar16 = (rd1.a) value2;
                                                } while (!p2Var2.b(value2, rd1.a.a(aVar16, qd1.a.a(aVar16.f152032a, zBooleanValue, null, null, 14), null, 14)));
                                                break;
                                            case 2:
                                                b63.v vVar2 = (b63.v) obj5;
                                                vVar2.getClass();
                                                a0 a0Var3 = a0Var;
                                                a0Var3.getClass();
                                                p2 p2Var3 = a0Var3.f127991g;
                                                do {
                                                    value3 = p2Var3.getValue();
                                                    aVar17 = (rd1.a) value3;
                                                } while (!p2Var3.b(value3, rd1.a.a(aVar17, qd1.a.a(aVar17.f152032a, false, null, vVar2, 11), null, 14)));
                                                break;
                                            default:
                                                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                                p2 p2Var4 = a0Var.f127991g;
                                                do {
                                                    value4 = p2Var4.getValue();
                                                    aVar18 = (rd1.a) value4;
                                                } while (!p2Var4.b(value4, rd1.a.a(aVar18, null, qd1.a.a(aVar18.f152033b, zBooleanValue2, null, null, 14), 13)));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar5.K(objQ5);
                            }
                        }
                        e23.l lVar4 = (e23.l) objQ5;
                        boolean zR6 = mVar5.r(a0Var);
                        Object objQ6 = mVar5.q();
                        if (zR6) {
                            final int i24 = z14 ? 1 : 0;
                            objQ6 = new e23.l() { // from class: nw0.w
                                @Override // e23.l
                                public final Object invoke(Object obj5) {
                                    Object value;
                                    rd1.a aVar15;
                                    Object value2;
                                    rd1.a aVar16;
                                    Object value3;
                                    rd1.a aVar17;
                                    Object value4;
                                    rd1.a aVar18;
                                    switch (i24) {
                                        case 0:
                                            b63.v vVar = (b63.v) obj5;
                                            vVar.getClass();
                                            a0 a0Var2 = a0Var;
                                            a0Var2.getClass();
                                            p2 p2Var = a0Var2.f127991g;
                                            do {
                                                value = p2Var.getValue();
                                                aVar15 = (rd1.a) value;
                                            } while (!p2Var.b(value, rd1.a.a(aVar15, null, qd1.a.a(aVar15.f152033b, false, null, vVar, 11), 13)));
                                            break;
                                        case 1:
                                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                            p2 p2Var2 = a0Var.f127991g;
                                            do {
                                                value2 = p2Var2.getValue();
                                                aVar16 = (rd1.a) value2;
                                            } while (!p2Var2.b(value2, rd1.a.a(aVar16, qd1.a.a(aVar16.f152032a, zBooleanValue, null, null, 14), null, 14)));
                                            break;
                                        case 2:
                                            b63.v vVar2 = (b63.v) obj5;
                                            vVar2.getClass();
                                            a0 a0Var3 = a0Var;
                                            a0Var3.getClass();
                                            p2 p2Var3 = a0Var3.f127991g;
                                            do {
                                                value3 = p2Var3.getValue();
                                                aVar17 = (rd1.a) value3;
                                            } while (!p2Var3.b(value3, rd1.a.a(aVar17, qd1.a.a(aVar17.f152032a, false, null, vVar2, 11), null, 14)));
                                            break;
                                        default:
                                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                            p2 p2Var4 = a0Var.f127991g;
                                            do {
                                                value4 = p2Var4.getValue();
                                                aVar18 = (rd1.a) value4;
                                            } while (!p2Var4.b(value4, rd1.a.a(aVar18, null, qd1.a.a(aVar18.f152033b, zBooleanValue2, null, null, 14), 13)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar5.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                final int i25 = z14 ? 1 : 0;
                                objQ6 = new e23.l() { // from class: nw0.w
                                    @Override // e23.l
                                    public final Object invoke(Object obj5) {
                                        Object value;
                                        rd1.a aVar15;
                                        Object value2;
                                        rd1.a aVar16;
                                        Object value3;
                                        rd1.a aVar17;
                                        Object value4;
                                        rd1.a aVar18;
                                        switch (i25) {
                                            case 0:
                                                b63.v vVar = (b63.v) obj5;
                                                vVar.getClass();
                                                a0 a0Var2 = a0Var;
                                                a0Var2.getClass();
                                                p2 p2Var = a0Var2.f127991g;
                                                do {
                                                    value = p2Var.getValue();
                                                    aVar15 = (rd1.a) value;
                                                } while (!p2Var.b(value, rd1.a.a(aVar15, null, qd1.a.a(aVar15.f152033b, false, null, vVar, 11), 13)));
                                                break;
                                            case 1:
                                                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                                p2 p2Var2 = a0Var.f127991g;
                                                do {
                                                    value2 = p2Var2.getValue();
                                                    aVar16 = (rd1.a) value2;
                                                } while (!p2Var2.b(value2, rd1.a.a(aVar16, qd1.a.a(aVar16.f152032a, zBooleanValue, null, null, 14), null, 14)));
                                                break;
                                            case 2:
                                                b63.v vVar2 = (b63.v) obj5;
                                                vVar2.getClass();
                                                a0 a0Var3 = a0Var;
                                                a0Var3.getClass();
                                                p2 p2Var3 = a0Var3.f127991g;
                                                do {
                                                    value3 = p2Var3.getValue();
                                                    aVar17 = (rd1.a) value3;
                                                } while (!p2Var3.b(value3, rd1.a.a(aVar17, qd1.a.a(aVar17.f152032a, false, null, vVar2, 11), null, 14)));
                                                break;
                                            default:
                                                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                                p2 p2Var4 = a0Var.f127991g;
                                                do {
                                                    value4 = p2Var4.getValue();
                                                    aVar18 = (rd1.a) value4;
                                                } while (!p2Var4.b(value4, rd1.a.a(aVar18, null, qd1.a.a(aVar18.f152033b, zBooleanValue2, null, null, 14), 13)));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar5.K(objQ6);
                            }
                        }
                        w2.a0.b(aVar14, lVar2, lVar3, lVar4, (e23.l) objQ6, mVar5, 8);
                        mVar5.y();
                        mVar5.f();
                    } else {
                        mVar5.C(-2098800843);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                nw0.z.a((a0) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                gk1.b bVar7 = (gk1.b) obj4;
                gk1.b bVar8 = (gk1.b) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar15 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar15, 1.0f), tn.k.a(d92.b.f58623a, mVar6), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA4 = y.a(kVar2, h4.d.a.f81536n, mVar6, 0);
                    int iHashCode5 = Long.hashCode(mVar6.getU());
                    i2 i2VarX5 = mVar6.x();
                    h4.r rVarC8 = h4.k.c(rVarE, mVar6);
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
                    b4.c(h5.g.a.f81810g, zVarA4, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar6);
                    h5.g.a.b bVar9 = h5.g.a.f81813j;
                    if (mVar6.getT() || !s.g(mVar6.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar6, iHashCode5, bVar9);
                    }
                    b4.c(h5.g.a.f81807d, rVarC8, mVar6);
                    b0 b0Var3 = b0.f22601a;
                    l72.p2 p2Var = l72.p2.f111205a;
                    d92.b.f58625c.getClass();
                    p2Var.g(gl1.y.Q(mVar6, R.string.lbl_edit_behaviors), c2.l.C(aVar15, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), null, null, null, false, false, bVar7, mVar6, 0, 252);
                    p2Var.g(gl1.y.Q(mVar6, R.string.lbl_auto_log_behaviors), null, null, null, null, false, false, bVar8, mVar6, 0, 254);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 14:
                x3 x3Var = (x3) obj4;
                m0 m0Var = (m0) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    nw1.d dVar = ((lw1.a) x3Var.getF182175a()).f115078d;
                    boolean zB = mVar7.B(x3Var) | mVar7.r(m0Var);
                    Object objQ7 = mVar7.q();
                    if (zB) {
                        objQ7 = new nw1.c.a(m0Var, x3Var, null);
                        mVar7.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new nw1.c.a(m0Var, x3Var, null);
                            mVar7.K(objQ7);
                        }
                    }
                    l0.e((e23.p) objQ7, dVar, mVar7);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                o11.e.a((e23.a) obj4, (p11.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                NutritionHydrationActivity nutritionHydrationActivity = (NutritionHydrationActivity) obj4;
                w01.c cVar2 = (w01.c) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                NutritionHydrationActivity.a aVar17 = NutritionHydrationActivity.f33067b;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    nutritionHydrationActivity.ca(cVar2, mVar8, w01.c.f181027k);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.f0((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j) obj4, (w52.e) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.R((m52.e) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.S((m52.f) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.Q((qs.f) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                o72.s.a((List) obj4, (f82.c) obj3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                o1.b((o82.g) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                c2.d((d2) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                l1 l1Var = (l1) obj4;
                p1 p1Var3 = (p1) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h4.r.a aVar18 = h4.r.S;
                    h4.r rVarF2 = x2.f(aVar18, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar19 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA5 = y.a(c2.j.f22694d, aVar19, mVar9, 48);
                    int iHashCode6 = Long.hashCode(mVar9.getU());
                    i2 i2VarX6 = mVar9.x();
                    h4.r rVarC9 = h4.k.c(rVarF2, mVar9);
                    h5.g.V.getClass();
                    e0.a aVar20 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar20);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA5, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX6, mVar9);
                    h5.g.a.b bVar10 = h5.g.a.f81813j;
                    if (mVar9.getT() || !s.g(mVar9.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar9, iHashCode6, bVar10);
                    }
                    b4.c(h5.g.a.f81807d, rVarC9, mVar9);
                    b0 b0Var4 = b0.f22601a;
                    h4.r rVarX = x2.x(x2.z(aVar18, null, 3), null, 3);
                    double doubleValue = l1Var.getDoubleValue();
                    boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                    Object objQ8 = mVar9.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ8 == c2565a) {
                        objQ8 = new j2(l1Var, 3);
                        mVar9.K(objQ8);
                    }
                    e23.l lVar5 = (e23.l) objQ8;
                    Object objQ9 = mVar9.q();
                    if (objQ9 == c2565a) {
                        objQ9 = new o72.v1(p1Var3, 25);
                        mVar9.K(objQ9);
                    }
                    u.a(rVarX, zBooleanValue, false, null, null, null, null, doubleValue, 0.0d, 0.0d, 0, 0.0d, lVar5, null, (e23.l) objQ9, false, false, mVar9, 6, 24960, 110460);
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 25:
                l1 l1Var2 = (l1) obj4;
                n1 n1Var = (n1) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar21 = h4.r.S;
                    h4.r rVarF3 = x2.f(aVar21, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar22 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA6 = y.a(c2.j.f22694d, aVar22, mVar10, 48);
                    int iHashCode7 = Long.hashCode(mVar10.getU());
                    i2 i2VarX7 = mVar10.x();
                    h4.r rVarC10 = h4.k.c(rVarF3, mVar10);
                    h5.g.V.getClass();
                    e0.a aVar23 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar23);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA6, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX7, mVar10);
                    h5.g.a.b bVar11 = h5.g.a.f81813j;
                    if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode7))) {
                        v.h.z(iHashCode7, mVar10, iHashCode7, bVar11);
                    }
                    b4.c(h5.g.a.f81807d, rVarC10, mVar10);
                    b0 b0Var5 = b0.f22601a;
                    h4.r rVarX2 = x2.x(x2.z(aVar21, null, 3), null, 3);
                    double doubleValue2 = l1Var2.getDoubleValue();
                    Object objQ10 = mVar10.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ10 == c2565a2) {
                        objQ10 = new j2(l1Var2, 7);
                        mVar10.K(objQ10);
                    }
                    e23.l lVar6 = (e23.l) objQ10;
                    Object objQ11 = mVar10.q();
                    if (objQ11 == c2565a2) {
                        objQ11 = new a3(n1Var, 0);
                        mVar10.K(objQ11);
                    }
                    u.a(rVarX2, false, true, null, null, null, null, doubleValue2, 0.0d, 0.0d, 0, 0.0d, lVar6, (e23.l) objQ11, null, false, false, mVar10, 438, 3456, 118648);
                    mVar10.y();
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                o92.d.a((o92.b) obj4, (h4.r) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                String str3 = (String) obj3;
                TerrainState terrainState = (TerrainState) obj4;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    mVar11.L(-1189601081);
                    mVar11.L(-492369756);
                    Object objQ12 = mVar11.q();
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new StyleState();
                        mVar11.K(objQ12);
                    }
                    mVar11.R();
                    StyleState styleState = (StyleState) objQ12;
                    styleState.getClass();
                    styleState.setTerrainState(terrainState);
                    Unit unit = Unit.INSTANCE;
                    mVar11.R();
                    StyleKt.GenericStyle(str3, null, null, null, styleState, mVar11, 0, 14);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 28:
                p1 p1Var4 = (p1) obj4;
                TerrainState terrainState2 = (TerrainState) obj3;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    String str4 = (String) p1Var4.getF182175a();
                    mVar12.L(-1189601081);
                    mVar12.L(-492369756);
                    Object objQ13 = mVar12.q();
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new StyleState();
                        mVar12.K(objQ13);
                    }
                    mVar12.R();
                    StyleState styleState2 = (StyleState) objQ13;
                    styleState2.getClass();
                    styleState2.setTerrainState(terrainState2);
                    Unit unit2 = Unit.INSTANCE;
                    mVar12.R();
                    StyleKt.GenericStyle(str4, null, null, null, styleState2, mVar12, 0, 14);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                og2.a.a((h4.r) obj4, (og2.f) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(int i14, String str, Object obj) {
        this.f121271a = i14;
        this.f121273c = str;
        this.f121272b = obj;
    }

    public /* synthetic */ i(Object obj, Object obj2, int i14, int i15) {
        this.f121271a = i15;
        this.f121272b = obj;
        this.f121273c = obj2;
    }
}
