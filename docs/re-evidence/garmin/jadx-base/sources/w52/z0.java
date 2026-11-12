package w52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.google.android.exoplayer2.C;
import i3.i7;
import i3.mc;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f182763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f182764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f182765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f182766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f182767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f182768g;

    public /* synthetic */ z0(WorkoutDTO workoutDTO, boolean z14, u4.d dVar, String str, String str2, String str3) {
        this.f182762a = 0;
        this.f182764c = workoutDTO;
        this.f182763b = z14;
        this.f182765d = dVar;
        this.f182766e = str;
        this.f182767f = str2;
        this.f182768g = str3;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0472  */
    /* JADX WARN: Code duplicated, block: B:106:0x0482  */
    /* JADX WARN: Code duplicated, block: B:20:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0142  */
    /* JADX WARN: Code duplicated, block: B:76:0x0304  */
    /* JADX WARN: Code duplicated, block: B:78:0x030d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0311  */
    /* JADX WARN: Code duplicated, block: B:84:0x032e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0373  */
    /* JADX WARN: Code duplicated, block: B:89:0x037a  */
    /* JADX WARN: Code duplicated, block: B:92:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:93:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:96:0x03cc  */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x03cc, please report this as an issue */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m.a aVar;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        boolean zB;
        Object objQ;
        String str;
        int iG;
        String str2;
        int i14 = this.f182762a;
        boolean z14 = this.f182763b;
        p3.m.a aVar2 = p3.m.f135153a;
        Object obj3 = this.f182768g;
        Object obj4 = this.f182767f;
        Object obj5 = this.f182766e;
        Object obj6 = this.f182765d;
        Object obj7 = this.f182764c;
        switch (i14) {
            case 0:
                WorkoutDTO workoutDTO = (WorkoutDTO) obj7;
                u4.d dVar = (u4.d) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(aVar3, eVar.f97920e);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar, 48);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarY, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, s2VarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT()) {
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC2, mVar);
                        u2 u2Var = u2.f22900a;
                        i7.b(dVar, gl1.y.Q(mVar, workoutDTO.f48044e.d(z14)), x2.q(aVar3, j92.b.f97901d.f97906e), lc.u0.f(mVar), mVar, 0, 0);
                        h4.r rVarC3 = c2.l.C(x2.f(aVar3, 1.0f), eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                        iHashCode = Long.hashCode(mVar.getU());
                        i2VarX = mVar.x();
                        rVarC = h4.k.c(rVarC3, mVar);
                        if (mVar.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar4);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar2, zVarA, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, mVar);
                        c2.b0 b0Var = c2.b0.f22601a;
                        d92.b.f58624b.getClass();
                        mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131070);
                        zB = mVar.B(str4);
                        objQ = mVar.q();
                        if (zB) {
                            objQ = new u91.c(str4, 15);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new u91.c(str4, 15);
                                mVar.K(objQ);
                            }
                        }
                        mh.c(str5, p5.v.c((e23.l) objQ, aVar3, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
                        o13.t tVar = k52.g.f102952a;
                        str = workoutDTO.O0;
                        if (str == null) {
                            str = null;
                        } else {
                            iG = d53.w.G('?', 0, 6, str);
                            if (iG != -1) {
                                int i15 = workoutDTO.f48044e.f116766b;
                                int i16 = iG + 1;
                                str = str.substring(0, i16) + "format=png&preview=1&borderRadius=0&sportTypeId=" + i15 + "&" + str.substring(i16);
                            }
                        }
                        if (g22.n.d(str) || !((str2 = workoutDTO.f48056p) == null || str2.length() == 0)) {
                            mVar.C(-1715155925);
                            mVar.f();
                        } else {
                            mVar.C(-1716207259);
                            wf.f.a aVar5 = new wf.f.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
                            aVar5.f184930c = str;
                            aVar5.f184938k = new yf.e.b(false, false, false, 7, null);
                            aVar5.f184933f = str;
                            aVar5.f184935h = str;
                            wf.f fVarA = aVar5.a();
                            h4.r rVarB = l4.k.b(x2.h(c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), eVar.f97918c), k2.i.a(j92.b.f97900c.f97911c));
                            f5.k.f68985a.getClass();
                            f5.k.a.b bVar3 = f5.k.a.f68993h;
                            j.f182550a.getClass();
                            jf.t.a(fVarA, null, rVarB, null, bVar3, j.f182551b, mVar, 1572912, 1976);
                            mVar.f();
                        }
                        mVar.y();
                        mVar.y();
                    }
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar);
                    u2 u2Var2 = u2.f22900a;
                    i7.b(dVar, gl1.y.Q(mVar, workoutDTO.f48044e.d(z14)), x2.q(aVar3, j92.b.f97901d.f97906e), lc.u0.f(mVar), mVar, 0, 0);
                    h4.r rVarC4 = c2.l.C(x2.f(aVar3, 1.0f), eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarC4, mVar);
                    if (mVar.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, zVarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    } else {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, mVar);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131070);
                    zB = mVar.B(str4);
                    objQ = mVar.q();
                    if (zB) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new u91.c(str4, 15);
                            mVar.K(objQ);
                        }
                    } else {
                        objQ = new u91.c(str4, 15);
                        mVar.K(objQ);
                    }
                    mh.c(str5, p5.v.c((e23.l) objQ, aVar3, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
                    o13.t tVar2 = k52.g.f102952a;
                    str = workoutDTO.O0;
                    if (str == null) {
                        str = null;
                    } else {
                        iG = d53.w.G('?', 0, 6, str);
                        if (iG != -1) {
                            int i17 = workoutDTO.f48044e.f116766b;
                            int i18 = iG + 1;
                            str = str.substring(0, i18) + "format=png&preview=1&borderRadius=0&sportTypeId=" + i17 + "&" + str.substring(i18);
                        }
                    }
                    if (g22.n.d(str)) {
                        mVar.C(-1715155925);
                        mVar.f();
                    } else {
                        mVar.C(-1715155925);
                        mVar.f();
                    }
                    mVar.y();
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                c2.l1 l1Var = (c2.l1) obj7;
                n82.f fVar2 = (n82.f) obj6;
                wl.c.C3456c c3456c = (wl.c.C3456c) obj5;
                u82.d dVar2 = (u82.d) obj4;
                tf0.i iVar = (tf0.i) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar6, 1.0f), vb.h.e(d92.b.f58623a, mVar2), o4.m1.f128891a);
                    boolean zB2 = mVar2.B(l1Var);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new vu1.b(l1Var, 17);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new vu1.b(l1Var, 17);
                            mVar2.K(objQ2);
                        }
                    }
                    h4.r rVarA = wz1.i.a((e23.l) objQ2, rVarE, z14);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar7 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA2 = c2.y.a(c2.j.f22694d, aVar7, mVar2, 48);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    h4.r rVarC5 = h4.k.c(rVarA, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar8);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar2);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar2);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    q82.a.a(x2.f(aVar6, 1.0f), new n82.n(fVar2, c3456c), null, mVar2, 6, 4);
                    n82.c.a(b0Var3.a(aVar6, 1.0f, true), fVar2, 3, false, z3.f.c(361982199, new bk0.h(dVar2, iVar, z14, 2), mVar2), mVar2, 24960, 8);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                za0.q.b((za0.i) obj7, (ca0.u1) obj6, (e23.l) obj5, (ca0.u1) obj4, (e23.a) obj3, this.f182763b, (p3.m) obj, p3.p0.t(385));
                return Unit.INSTANCE;
            case 3:
                e23.p pVar = (e23.p) obj7;
                e23.l lVar = (e23.l) obj6;
                e23.a aVar9 = (e23.a) obj5;
                p3.p1 p1Var = (p3.p1) obj4;
                p3.p1 p1Var2 = (p3.p1) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar10 = h4.r.S;
                    boolean z15 = this.f182763b;
                    h4.r rVarA2 = l4.k.a(aVar10, z15 ? 1.0f : 0.5f);
                    boolean zB3 = mVar3.B(pVar) | mVar3.B(lVar) | mVar3.B(aVar9);
                    Object objQ3 = mVar3.q();
                    if (zB3) {
                        p50.d dVar3 = new p50.d(pVar, lVar, aVar9, p1Var, p1Var2);
                        mVar3.K(dVar3);
                        objQ3 = dVar3;
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            p50.d dVar4 = new p50.d(pVar, lVar, aVar9, p1Var, p1Var2);
                            mVar3.K(dVar4);
                            objQ3 = dVar4;
                        }
                    }
                    zr.a.f206700a.getClass();
                    i3.h1.c((e23.a) objQ3, rVarA2, z15, null, null, null, null, null, zr.a.f206702c, mVar3, C.ENCODING_PCM_32BIT, 504);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                zs1.u.a((mc) obj7, (e23.a) obj6, (h4.r) obj5, this.f182763b, (e23.p) obj4, (z3.e) obj3, (p3.m) obj, p3.p0.t(221185));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ z0(mc mcVar, e23.a aVar, h4.r rVar, boolean z14, e23.p pVar, z3.e eVar, int i14) {
        this.f182762a = 4;
        this.f182764c = mcVar;
        this.f182765d = aVar;
        this.f182766e = rVar;
        this.f182763b = z14;
        this.f182767f = pVar;
        this.f182768g = eVar;
    }

    public /* synthetic */ z0(za0.i iVar, ca0.u1 u1Var, e23.l lVar, ca0.u1 u1Var2, e23.a aVar, boolean z14, int i14) {
        this.f182762a = 2;
        this.f182764c = iVar;
        this.f182765d = u1Var;
        this.f182766e = lVar;
        this.f182767f = u1Var2;
        this.f182768g = aVar;
        this.f182763b = z14;
    }

    public /* synthetic */ z0(boolean z14, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f182762a = i14;
        this.f182763b = z14;
        this.f182764c = obj;
        this.f182765d = obj2;
        this.f182766e = obj3;
        this.f182767f = obj4;
        this.f182768g = obj5;
    }
}
