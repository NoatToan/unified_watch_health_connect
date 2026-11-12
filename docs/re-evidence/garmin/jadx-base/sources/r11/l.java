package r11;

import androidx.room.a0;
import b82.t0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import i3.ce;
import i3.fe;
import i3.i7;
import i3.mh;
import i3.r1;
import i3.s1;
import lc.u0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p5.v;
import ro0.q;
import s5.x0;
import s70.c0;
import u1.d2;
import v62.a1;
import v62.u6;
import v62.w;
import v62.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f149395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f149396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f149397d;

    public /* synthetic */ l(String str, d2 d2Var, boolean z14, int i14) {
        this.f149394a = 10;
        this.f149396c = str;
        this.f149397d = d2Var;
        this.f149395b = z14;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0386  */
    /* JADX WARN: Code duplicated, block: B:114:0x038f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0393  */
    /* JADX WARN: Code duplicated, block: B:120:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:122:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:169:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x016b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0192  */
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        r.a aVar;
        Object obj3;
        u4.d dVarA;
        int i14;
        h5.g.a.f fVar;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        float f14;
        int i15 = this.f149394a;
        p3.m.a aVar2 = p3.m.f135153a;
        u4.d dVarA2 = null;
        boolean z14 = false;
        boolean z15 = this.f149395b;
        Object obj4 = this.f149397d;
        Object obj5 = this.f149396c;
        switch (i15) {
            case 0:
                v21.e eVar = (v21.e) obj5;
                b11.i iVar = (b11.i) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    r.a aVar3 = r.S;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar, 48);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    r rVarC2 = h4.k.c(aVar3, mVar);
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
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    u2 u2Var = u2.f22900a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarC3 = c2.l.C(aVar3, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    r1 r1Var = r1.f89474a;
                    long jC = a0.c(mVar);
                    long j8 = d92.b.a(mVar).f().f63508c;
                    r1Var.getClass();
                    s1.a(this.f149395b, null, rVarC3, false, r1.a(jC, j8, mVar, 58), mVar, 48, 40);
                    y01.f.a(eVar, iVar, null, null, null, null, mVar, 0, 60);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ro0.d.b(z15, (q) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                oe2.f.a((rx0.b) obj5, z15, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                jc0.c cVar = (jc0.c) obj5;
                String str = (String) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar5 = r.S;
                    r rVarF = x2.f(aVar5, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, mVar2, 48);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    r rVarC4 = h4.k.c(rVarF, mVar2);
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
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, s2VarA2, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar2);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar4);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC4, mVar2);
                    r rVarA = u2.f22900a.a(aVar5, 1.0f, true);
                    z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode4 = Long.hashCode(mVar2.getU());
                    i2 i2VarX4 = mVar2.x();
                    r rVarC5 = h4.k.c(rVarA, mVar2);
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
                    b4.c(eVar2, zVarA, mVar2);
                    b4.c(c1623g, i2VarX4, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar2, iHashCode4, bVar4);
                    }
                    b4.c(fVar2, rVarC5, mVar2);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                    d6.p.f57793b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 1, 0, null, x0VarB, mVar2, 0, 24960, 110590);
                    if (z15) {
                        mVar2.C(1593870869);
                        String strQ = gl1.y.Q(mVar2, R.string.txt_garmin_device_connected);
                        x0 x0VarF = d92.c.f(j92.f.f97933j, mVar2);
                        d92.b.f58625c.getClass();
                        aVar = aVar5;
                        mh.c(strQ, c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                        mVar2.f();
                    } else {
                        aVar = aVar5;
                        mVar2.C(1594193486);
                        mVar2.f();
                    }
                    mVar2.y();
                    if (cVar != null) {
                        int i16 = cVar.f98131a;
                        mVar2.C(1841330427);
                        String str2 = gl1.y.Q(mVar2, R.string.lbl_battery_level) + ": " + i16 + "%";
                        String strF = androidx.core.view.j.f(i16, "%");
                        x0 x0VarF2 = d92.c.f(j92.f.f97935l, mVar2);
                        boolean zB = mVar2.B(str2);
                        Object objQ = mVar2.q();
                        if (zB) {
                            obj3 = objQ;
                            o60.b bVar5 = new o60.b(str2, 29);
                            mVar2.K(bVar5);
                            obj3 = bVar5;
                        } else {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                obj3 = objQ;
                                o60.b bVar6 = new o60.b(str2, 29);
                                mVar2.K(bVar6);
                                obj3 = bVar6;
                            }
                        }
                        obj3 = objQ;
                        r rVarC6 = v.c((e23.l) obj3, aVar, false);
                        d92.b.f58625c.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        mh.c(strF, c2.l.C(rVarC6, eVar3.f97920e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar2, 0, 0, 131068);
                        jc0.b bVar7 = cVar.f98132b;
                        int i17 = bVar7 == null ? -1 : c0.c.f157672b[bVar7.ordinal()];
                        if (i17 != -1) {
                            if (i17 == 1) {
                                s62.a.f157643a.getClass();
                                dVarA = v62.z0.a(t62.b.f162798a);
                            } else {
                                if (i17 != 2) {
                                    u0.r();
                                    return null;
                                }
                                s62.a.f157643a.getClass();
                                dVarA = a1.a(t62.b.f162798a);
                            }
                        } else if (i16 >= 0 && i16 < 11) {
                            s62.a.f157643a.getClass();
                            dVarA = w.a(t62.b.f162798a);
                        } else if (11 <= i16 && i16 < 40) {
                            s62.a.f157643a.getClass();
                            dVarA = v62.y.a(t62.b.f162798a);
                        } else if (40 <= i16 && i16 < 75) {
                            s62.a.f157643a.getClass();
                            dVarA = v62.z.a(t62.b.f162798a);
                        } else if (75 <= i16 && i16 < 100) {
                            s62.a.f157643a.getClass();
                            dVarA = v62.a0.a(t62.b.f162798a);
                        } else if (i16 == 100) {
                            s62.a.f157643a.getClass();
                            dVarA = x.a(t62.b.f162798a);
                        } else {
                            s62.a.f157643a.getClass();
                            t62.b.f162798a.getClass();
                            dVarA = b72.d.a(u6.f176049a);
                        }
                        i7.b(dVarA, null, x2.q(c2.l.C(aVar, eVar3.f97917b, 0.0f, 0.0f, 0.0f, 14), j92.b.f97901d.f97905d), u0.f(mVar2), mVar2, 48, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(1842307764);
                        d92.b.f58625c.getClass();
                        j92.e eVar4 = j92.b.f97899b;
                        float f15 = eVar4.f97921f * 2;
                        g6.f.a aVar7 = g6.f.f75994b;
                        c2.l.f(x2.u(aVar, f15 + eVar4.f97920e), mVar2);
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                e23.a aVar8 = (e23.a) obj5;
                e23.q qVar = (e23.q) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    if (z15) {
                        mVar3.C(-1209517980);
                        mVar3.f();
                    } else {
                        mVar3.C(-1210005207);
                        r.a aVar9 = r.S;
                        r rVarD = x2.d(aVar9, 1.0f);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA2 = y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                        int iHashCode5 = Long.hashCode(mVar3.getU());
                        i2 i2VarX5 = mVar3.x();
                        r rVarC7 = h4.k.c(rVarD, mVar3);
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
                        h5.g.a.e eVar5 = h5.g.a.f81810g;
                        b4.c(eVar5, zVarA2, mVar3);
                        h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                        b4.c(c1623g2, i2VarX5, mVar3);
                        h5.g.a.b bVar8 = h5.g.a.f81813j;
                        if (mVar3.getT()) {
                            i14 = 6;
                        } else {
                            i14 = 6;
                            if (!s.g(mVar3.q(), Integer.valueOf(iHashCode5))) {
                            }
                            fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC7, mVar3);
                            b0 b0Var2 = b0.f22601a;
                            si1.d.a(0, aVar8, b0Var2.a(aVar9, 0.4f, true), mVar3);
                            r rVarE = u1.n.e(b0Var2.a(aVar9, 0.6f, true), vb.h.e(d92.b.f58623a, mVar3), m1.f128891a);
                            z0VarD = c2.q.d(h4.d.a.f81524b, false);
                            iHashCode = Long.hashCode(mVar3.getU());
                            i2VarX = mVar3.x();
                            rVarC = h4.k.c(rVarE, mVar3);
                            if (mVar3.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                mVar3.M(aVar10);
                            } else {
                                mVar3.c();
                            }
                            b4.c(eVar5, z0VarD, mVar3);
                            b4.c(c1623g2, i2VarX, mVar3);
                            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar3, iHashCode, bVar8);
                            }
                            b4.c(fVar, rVarC, mVar3);
                            qVar.invoke(u.f22885a, mVar3, Integer.valueOf(i14));
                            mVar3.y();
                            mVar3.y();
                            mVar3.f();
                        }
                        v.h.z(iHashCode5, mVar3, iHashCode5, bVar8);
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC7, mVar3);
                        b0 b0Var3 = b0.f22601a;
                        si1.d.a(0, aVar8, b0Var3.a(aVar9, 0.4f, true), mVar3);
                        r rVarE2 = u1.n.e(b0Var3.a(aVar9, 0.6f, true), vb.h.e(d92.b.f58623a, mVar3), m1.f128891a);
                        z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        iHashCode = Long.hashCode(mVar3.getU());
                        i2VarX = mVar3.x();
                        rVarC = h4.k.c(rVarE2, mVar3);
                        if (mVar3.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar10);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar5, z0VarD, mVar3);
                        b4.c(c1623g2, i2VarX, mVar3);
                        if (mVar3.getT()) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar8);
                        } else {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar8);
                        }
                        b4.c(fVar, rVarC, mVar3);
                        qVar.invoke(u.f22885a, mVar3, Integer.valueOf(i14));
                        mVar3.y();
                        mVar3.y();
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                mg2.g gVar = (mg2.g) obj5;
                fe feVar = (fe) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r.a aVar11 = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = y.a(kVar2, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode6 = Long.hashCode(mVar4.getU());
                    i2 i2VarX6 = mVar4.x();
                    r rVarC8 = h4.k.c(aVar11, mVar4);
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
                    b4.c(h5.g.a.f81810g, zVarA3, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX6, mVar4);
                    h5.g.a.b bVar9 = h5.g.a.f81813j;
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar4, iHashCode6, bVar9);
                    }
                    b4.c(h5.g.a.f81807d, rVarC8, mVar4);
                    b0 b0Var4 = b0.f22601a;
                    mg2.n.a(gVar, null, null, mVar4, 6);
                    if (z15) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f14 = j92.b.f97899b.f97923h;
                    } else {
                        f14 = 0;
                        g6.f.a aVar13 = g6.f.f75994b;
                    }
                    r rVarC9 = c2.l.C(aVar11, 0.0f, 0.0f, 0.0f, f14, 7);
                    ug2.e.f170756a.getClass();
                    ce.b(feVar, rVarC9, ug2.e.f170757b, mVar4, 390, 0);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                uk0.u.b((uk0.a) obj5, z15, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                p1 p1Var = (p1) obj5;
                oe0.d dVar = (oe0.d) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    t0 t0Var = t0.f16792a;
                    String strQ2 = gl1.y.Q(mVar5, R.string.lbl_body_weight);
                    String str3 = (String) p1Var.getF182175a();
                    boolean zB2 = mVar5.B(p1Var);
                    Object objQ2 = mVar5.q();
                    if (zB2) {
                        objQ2 = new vd0.d(p1Var, z14 ? 1 : 0);
                        mVar5.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new vd0.d(p1Var, z14 ? 1 : 0);
                            mVar5.K(objQ2);
                        }
                    }
                    e23.l lVar = (e23.l) objQ2;
                    boolean zB3 = mVar5.B(p1Var) | mVar5.h(z15) | mVar5.r(dVar);
                    Object objQ3 = mVar5.q();
                    if (zB3) {
                        objQ3 = new ad0.f(z15, dVar, p1Var, 25);
                        mVar5.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ad0.f(z15, dVar, p1Var, 25);
                            mVar5.K(objQ3);
                        }
                    }
                    x5.v.f188954b.getClass();
                    t0Var.i(null, strQ2, str3, null, false, lVar, (e23.l) objQ3, x5.v.f188957e, 0, null, mVar5, 12610560, 769);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 8:
                p1 p1Var2 = (p1) obj5;
                oe0.s sVar = (oe0.s) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    t0 t0Var2 = t0.f16792a;
                    String strQ3 = gl1.y.Q(mVar6, R.string.lbl_body_weight);
                    String str4 = (String) p1Var2.getF182175a();
                    boolean zB4 = mVar6.B(p1Var2);
                    Object objQ4 = mVar6.q();
                    if (zB4) {
                        objQ4 = new vd0.d(p1Var2, 5);
                        mVar6.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new vd0.d(p1Var2, 5);
                            mVar6.K(objQ4);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ4;
                    boolean zB5 = mVar6.B(p1Var2) | mVar6.h(z15) | mVar6.r(sVar);
                    Object objQ5 = mVar6.q();
                    if (zB5) {
                        objQ5 = new ad0.f(z15, sVar, p1Var2, 27);
                        mVar6.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new ad0.f(z15, sVar, p1Var2, 27);
                            mVar6.K(objQ5);
                        }
                    }
                    x5.v.f188954b.getClass();
                    t0Var2.i(null, strQ3, str4, null, false, lVar2, (e23.l) objQ5, x5.v.f188957e, 0, null, mVar6, 12610560, 769);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 9:
                ty0.b bVar10 = (ty0.b) obj5;
                e23.a aVar14 = (e23.a) obj4;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    String strB = bVar10.b(w2.a0.s(mVar7));
                    if (z15) {
                        int i18 = b3.a.f15501a;
                        dVarA2 = c3.a.a();
                    }
                    z02.f.a(0, 42, null, aVar14, null, strB, mVar7, dVarA2);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                w21.m.d((String) obj5, (d2) obj4, z15, (p3.m) obj, p0.t(385));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                z61.a.a((i53.c) obj5, z15, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(Object obj, boolean z14, Object obj2, int i14) {
        this.f149394a = i14;
        this.f149396c = obj;
        this.f149395b = z14;
        this.f149397d = obj2;
    }

    public /* synthetic */ l(Object obj, boolean z14, o13.h hVar, int i14, int i15) {
        this.f149394a = i15;
        this.f149396c = obj;
        this.f149395b = z14;
        this.f149397d = hVar;
    }

    public /* synthetic */ l(Object obj, Object obj2, boolean z14, int i14) {
        this.f149394a = i14;
        this.f149396c = obj;
        this.f149397d = obj2;
        this.f149395b = z14;
    }

    public /* synthetic */ l(boolean z14, Object obj, Object obj2, int i14) {
        this.f149394a = i14;
        this.f149395b = z14;
        this.f149396c = obj;
        this.f149397d = obj2;
    }

    public /* synthetic */ l(boolean z14, q qVar, e23.a aVar, int i14) {
        this.f149394a = 1;
        this.f149395b = z14;
        this.f149396c = qVar;
        this.f149397d = aVar;
    }
}
