package yg2;

import c2.h2;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIDataTypes;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import i3.kb;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p3.a2;
import p3.b4;
import p3.i2;
import p3.m1;
import p3.n1;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.y0;
import v62.h1;
import v62.k5;
import v62.s6;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196983a;

        static {
            int[] iArr = new int[GDIDataTypes.MeasurementUnit.values().length];
            try {
                iArr[GDIDataTypes.MeasurementUnit.METRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIDataTypes.MeasurementUnit.STATUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f196983a = iArr;
        }
    }

    public static final void a(h hVar, g gVar, vf2.e eVar, boolean z14, boolean z15, lc.y yVar, p3.m mVar, int i14) {
        boolean z16;
        lc.y yVar2;
        yVar.getClass();
        p3.o0 o0VarE = mVar.E(-893782575);
        int i15 = (o0VarE.r(hVar) ? 4 : 2) | i14 | (o0VarE.r(gVar) ? 32 : 16) | (o0VarE.B(eVar) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024);
        if ((i14 & 24576) == 0) {
            z16 = z15;
            i15 |= o0VarE.h(z16) ? 16384 : 8192;
        } else {
            z16 = z15;
        }
        if ((196608 & i14) == 0) {
            yVar2 = yVar;
            i15 |= o0VarE.r(yVar2) ? 131072 : 65536;
        } else {
            yVar2 = yVar;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            b(hVar, gVar, eVar, z14, yVar2, z16, z3.f.c(-684806817, new x(hVar, 0), o0VarE), o0VarE, ((i15 << 3) & 458752) | (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | ((i15 >> 3) & 57344));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(hVar, gVar, eVar, z14, z15, yVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v48 */
    public static final void b(h hVar, final g gVar, final vf2.e eVar, final boolean z14, final lc.y yVar, final boolean z15, z3.e eVar2, p3.m mVar, int i14) {
        p3.o0 o0Var;
        ?? r14;
        final h hVar2 = hVar;
        lc.y yVar2 = yVar;
        p3.o0 o0VarE = mVar.E(-257201984);
        int i15 = (o0VarE.r(hVar2) ? 4 : 2) | i14 | (o0VarE.r(gVar) ? 32 : 16) | (o0VarE.B(eVar) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024);
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(yVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z15) ? 131072 : 65536;
        }
        final int i16 = 0;
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            final p1 p1VarC = p3.p0.c(hVar2.f196997e, o0VarE, 0);
            final p1 p1VarC2 = p3.p0.c(hVar2.f196999g, o0VarE, 0);
            final p1 p1VarC3 = p3.p0.c(hVar2.f197001i, o0VarE, 0);
            int i17 = gVar.f196988e;
            int i18 = gVar.f196984a;
            Object[] objArr = {Integer.valueOf(i18)};
            boolean zR = o0VarE.r(gVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new e23.a() { // from class: yg2.z
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return new a2(gVar.f196988e);
                            default:
                                return p3.p0.n(gVar.f196987d);
                        }
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e23.a() { // from class: yg2.z
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    return new a2(gVar.f196988e);
                                default:
                                    return p3.p0.n(gVar.f196987d);
                            }
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            n1 n1Var = (n1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
            p1 p1VarC4 = p3.p0.c(hVar2.f197006n, o0VarE, 0);
            final p1 p1VarC5 = p3.p0.c(hVar2.f197005m, o0VarE, 0);
            p1 p1VarC6 = p3.p0.c(hVar2.f197007o, o0VarE, 0);
            p1 p1VarC7 = p3.p0.c(hVar2.f197008p, o0VarE, 0);
            Object[] objArr2 = {Integer.valueOf(i18)};
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new ya0.j(6);
                o0VarE.K(objQ2);
            }
            m1 m1Var = (m1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            Object[] objArr3 = {Integer.valueOf(i18)};
            boolean zR2 = o0VarE.r(gVar);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == c2565a) {
                final int i19 = 1;
                objQ3 = new e23.a() { // from class: yg2.z
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                return new a2(gVar.f196988e);
                            default:
                                return p3.p0.n(gVar.f196987d);
                        }
                    }
                };
                o0VarE.K(objQ3);
            }
            final p1 p1Var = (p1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 0);
            Object[] objArr4 = new Object[0];
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new ya0.j(7);
                o0VarE.K(objQ4);
            }
            final p1 p1Var2 = (p1) d4.a.e(objArr4, (e23.a) objQ4, o0VarE, 48);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = kg.f.j(o0VarE);
            }
            final m4.b0 b0Var = (m4.b0) objQ5;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            final u1.u uVarA = u1.n.a(j92.b.f97899b.f97916a, d92.b.a(o0VarE).j().e());
            bVar.getClass();
            final k2.h hVarA = k2.i.a(j92.b.f97900c.f97910b);
            hVar2 = hVar;
            z3.e eVarC = z3.f.c(-1766631909, new wv0.e(10, hVar2, p1Var, p1VarC7, m1Var, p1VarC4), o0VarE);
            o0Var = o0VarE;
            e23.q qVar = new e23.q() { // from class: yg2.a0
                /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
                /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
                /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
                /* JADX WARN: Code duplicated, block: B:38:0x010e  */
                /* JADX WARN: Code duplicated, block: B:41:0x012b  */
                /* JADX WARN: Code duplicated, block: B:42:0x0163  */
                /* JADX WARN: Code duplicated, block: B:45:0x01a1  */
                /* JADX WARN: Code duplicated, block: B:47:0x01a8  */
                /* JADX WARN: Code duplicated, block: B:50:0x01c4  */
                /* JADX WARN: Code duplicated, block: B:52:0x01cb  */
                /* JADX WARN: Code duplicated, block: B:54:0x01f2  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    Throwable th3;
                    h5.g.a.f fVar;
                    c2.b0 b0Var2;
                    c2.z zVarA;
                    int iHashCode;
                    i2 i2VarX;
                    h4.r rVarC;
                    j92.e eVar3;
                    boolean z16;
                    h hVar3;
                    p3.m mVar2;
                    p1 p1Var3;
                    p1 p1Var4;
                    boolean zB;
                    Object objQ6;
                    p3.m.a aVar2;
                    boolean zB2;
                    Object objQ7;
                    h2 h2Var = (h2) obj;
                    p3.m mVar3 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    h2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar3.B(h2Var) ? 4 : 2;
                    }
                    if (mVar3.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar3 = h4.r.S;
                        h4.r rVarD = x2.d(c2.l.x(u1.n.e(aVar3, tn.k.a(d92.b.f58623a, mVar3), o4.m1.f128891a), h2Var), 1.0f);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar4 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        c2.z zVarA2 = c2.y.a(kVar, aVar4, mVar3, 48);
                        int iHashCode2 = Long.hashCode(mVar3.getU());
                        i2 i2VarX2 = mVar3.x();
                        h4.r rVarC2 = h4.k.c(rVarD, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar5 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar5);
                        } else {
                            mVar3.c();
                        }
                        h5.g.a.e eVar4 = h5.g.a.f81810g;
                        b4.c(eVar4, zVarA2, mVar3);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX2, mVar3);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar3.getT()) {
                            th3 = null;
                        } else {
                            th3 = null;
                            if (!p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                            }
                            fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC2, mVar3);
                            b0Var2 = c2.b0.f22601a;
                            h4.r rVarB = u1.a2.b(b0Var2.a(aVar3, 1.0f, true), u1.a2.a(mVar3), true);
                            zVarA = c2.y.a(kVar, aVar4, mVar3, 48);
                            iHashCode = Long.hashCode(mVar3.getU());
                            i2VarX = mVar3.x();
                            rVarC = h4.k.c(rVarB, mVar3);
                            if (mVar3.F() != null) {
                                p3.p0.l();
                                throw th3;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                mVar3.M(aVar5);
                            } else {
                                mVar3.c();
                            }
                            b4.c(eVar4, zVarA, mVar3);
                            b4.c(c1623g, i2VarX, mVar3);
                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                            }
                            b4.c(fVar, rVarC, mVar3);
                            d92.b.f58625c.getClass();
                            eVar3 = j92.b.f97899b;
                            c2.l.f(x2.k(aVar3, eVar3.f97920e), mVar3);
                            z16 = z15;
                            hVar3 = hVar2;
                            if (z16) {
                                mVar3.C(1760991707);
                                mVar2 = mVar3;
                                f0.c(hVar3, (vf2.e) p1VarC.getF182175a(), eVar, z14, (List) p1VarC2.getF182175a(), (List) p1VarC3.getF182175a(), yVar, mVar2, 0);
                                c2.l.f(x2.k(aVar3, eVar3.f97920e), mVar2);
                                mVar2.f();
                            } else {
                                mVar2 = mVar3;
                                mVar2.C(1761585605);
                                mVar2.f();
                            }
                            m4.b0 b0Var3 = b0Var;
                            u1.u uVar = uVarA;
                            k2.h hVar4 = hVarA;
                            f0.e(hVar3, b0Var3, uVar, hVar4, mVar2, 48);
                            String str = (String) p1VarC5.getF182175a();
                            p1Var3 = p1Var;
                            GDIDataTypes.MeasurementUnit measurementUnit = (GDIDataTypes.MeasurementUnit) p1Var3.getF182175a();
                            p1Var4 = p1Var2;
                            boolean zBooleanValue = ((Boolean) p1Var4.getF182175a()).booleanValue();
                            zB = mVar2.B(p1Var4);
                            objQ6 = mVar2.q();
                            aVar2 = p3.m.f135153a;
                            if (zB) {
                                objQ6 = new x91.d(p1Var4, 29);
                                mVar2.K(objQ6);
                            } else {
                                aVar2.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    objQ6 = new x91.d(p1Var4, 29);
                                    mVar2.K(objQ6);
                                }
                            }
                            e23.a aVar6 = (e23.a) objQ6;
                            zB2 = mVar2.B(p1Var3) | mVar2.B(p1Var4);
                            objQ7 = mVar2.q();
                            if (zB2) {
                                objQ7 = new sk0.l(p1Var3, p1Var4, 6);
                                mVar2.K(objQ7);
                            } else {
                                aVar2.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    objQ7 = new sk0.l(p1Var3, p1Var4, 6);
                                    mVar2.K(objQ7);
                                }
                            }
                            p3.m mVar4 = mVar2;
                            f0.f(hVar3, str, measurementUnit, zBooleanValue, aVar6, (e23.l) objQ7, uVar, hVar4, mVar4, 0);
                            c2.l.f(b0Var2.a(aVar3, 1.0f, true), mVar4);
                            mVar4.y();
                            mVar4.y();
                        }
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC2, mVar3);
                        b0Var2 = c2.b0.f22601a;
                        h4.r rVarB2 = u1.a2.b(b0Var2.a(aVar3, 1.0f, true), u1.a2.a(mVar3), true);
                        zVarA = c2.y.a(kVar, aVar4, mVar3, 48);
                        iHashCode = Long.hashCode(mVar3.getU());
                        i2VarX = mVar3.x();
                        rVarC = h4.k.c(rVarB2, mVar3);
                        if (mVar3.F() != null) {
                            p3.p0.l();
                            throw th3;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar5);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar4, zVarA, mVar3);
                        b4.c(c1623g, i2VarX, mVar3);
                        if (mVar3.getT()) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                        } else {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, mVar3);
                        d92.b.f58625c.getClass();
                        eVar3 = j92.b.f97899b;
                        c2.l.f(x2.k(aVar3, eVar3.f97920e), mVar3);
                        z16 = z15;
                        hVar3 = hVar2;
                        if (z16) {
                            mVar3.C(1760991707);
                            mVar2 = mVar3;
                            f0.c(hVar3, (vf2.e) p1VarC.getF182175a(), eVar, z14, (List) p1VarC2.getF182175a(), (List) p1VarC3.getF182175a(), yVar, mVar2, 0);
                            c2.l.f(x2.k(aVar3, eVar3.f97920e), mVar2);
                            mVar2.f();
                        } else {
                            mVar2 = mVar3;
                            mVar2.C(1761585605);
                            mVar2.f();
                        }
                        m4.b0 b0Var4 = b0Var;
                        u1.u uVar2 = uVarA;
                        k2.h hVar5 = hVarA;
                        f0.e(hVar3, b0Var4, uVar2, hVar5, mVar2, 48);
                        String str2 = (String) p1VarC5.getF182175a();
                        p1Var3 = p1Var;
                        GDIDataTypes.MeasurementUnit measurementUnit2 = (GDIDataTypes.MeasurementUnit) p1Var3.getF182175a();
                        p1Var4 = p1Var2;
                        boolean zBooleanValue2 = ((Boolean) p1Var4.getF182175a()).booleanValue();
                        zB = mVar2.B(p1Var4);
                        objQ6 = mVar2.q();
                        aVar2 = p3.m.f135153a;
                        if (zB) {
                            aVar2.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new x91.d(p1Var4, 29);
                                mVar2.K(objQ6);
                            }
                        } else {
                            objQ6 = new x91.d(p1Var4, 29);
                            mVar2.K(objQ6);
                        }
                        e23.a aVar7 = (e23.a) objQ6;
                        zB2 = mVar2.B(p1Var3) | mVar2.B(p1Var4);
                        objQ7 = mVar2.q();
                        if (zB2) {
                            aVar2.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new sk0.l(p1Var3, p1Var4, 6);
                                mVar2.K(objQ7);
                            }
                        } else {
                            objQ7 = new sk0.l(p1Var3, p1Var4, 6);
                            mVar2.K(objQ7);
                        }
                        p3.m mVar5 = mVar2;
                        f0.f(hVar3, str2, measurementUnit2, zBooleanValue2, aVar7, (e23.l) objQ7, uVar2, hVar5, mVar5, 0);
                        c2.l.f(b0Var2.a(aVar3, 1.0f, true), mVar5);
                        mVar5.y();
                        mVar5.y();
                    } else {
                        mVar3.e();
                    }
                    return Unit.INSTANCE;
                }
            };
            yVar2 = yVar;
            kb.a(null, eVar2, eVarC, null, null, 0, 0L, 0L, null, z3.f.c(-1105875567, qVar, o0Var), o0Var, 805306800, 505);
            Integer numValueOf = Integer.valueOf(i18);
            Object objQ6 = o0Var.q();
            if (objQ6 == c2565a) {
                objQ6 = new c0(b0Var, null);
                o0Var.K(objQ6);
            }
            p3.l0.e((e23.p) objQ6, numValueOf, o0Var);
            Boolean bool = (Boolean) p1VarC4.getF182175a();
            bool.getClass();
            Integer numValueOf2 = Integer.valueOf(i18);
            boolean zB = o0Var.B(n1Var) | o0Var.B(p1VarC4) | o0Var.B(m1Var) | o0Var.k(i17) | o0Var.r(hVar2);
            Object objQ7 = o0Var.q();
            if (zB || objQ7 == c2565a) {
                d0 d0Var = new d0(i17, hVar2, n1Var, p1VarC4, m1Var, null);
                o0Var.K(d0Var);
                objQ7 = d0Var;
            }
            p3.l0.f(bool, numValueOf2, (e23.p) objQ7, o0Var);
            Boolean bool2 = (Boolean) p1VarC6.getF182175a();
            bool2.getClass();
            boolean zB2 = o0Var.B(p1VarC6) | o0Var.r(yVar2);
            Object objQ8 = o0Var.q();
            if (zB2 || objQ8 == c2565a) {
                objQ8 = new e0(yVar2, p1VarC6, null);
                o0Var.K(objQ8);
            }
            p3.l0.e((e23.p) objQ8, bool2, o0Var);
            boolean zR3 = o0Var.r(hVar2);
            Object objQ9 = o0Var.q();
            if (zR3 || objQ9 == c2565a) {
                r14 = 0;
                objQ9 = new b0(hVar2, 0);
                o0Var.K(objQ9);
            } else {
                r14 = 0;
            }
            c.w.a(r14, 1, (e23.a) objQ9, o0Var, r14);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c82.c(hVar2, gVar, eVar, z14, yVar2, z15, eVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0288  */
    /* JADX WARN: Code duplicated, block: B:106:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:111:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:118:0x0323  */
    /* JADX WARN: Code duplicated, block: B:133:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
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
    public static final void c(h hVar, vf2.e eVar, vf2.e eVar2, boolean z14, List<vf2.e> list, List<vf2.e> list2, lc.y yVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        int i15;
        p3.o0 o0Var2;
        int i16;
        List<vf2.e> listSubList;
        int i17;
        Object objB1;
        ArrayList arrayList;
        Iterator it;
        String str;
        p3.o0 o0Var3;
        p3.o0 o0VarE = mVar.E(813731370);
        p3.c<?> cVar = o0VarE.f135177b;
        int i18 = i14 | (o0VarE.r(hVar) ? 4 : 2) | (o0VarE.B(eVar) ? 32 : 16) | (o0VarE.B(eVar2) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.r(list) ? 16384 : 8192) | (o0VarE.r(list2) ? 131072 : 65536) | (o0VarE.r(yVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i18 & 1, (599187 & i18) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            boolean zR = o0VarE.r(yVar) | o0VarE.r(hVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new xr.a(18, yVar, hVar);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xr.a(18, yVar, hVar);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar2 = (e23.a) objQ;
            String strJ = eVar != null ? eVar.f177933e : null;
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 311816231, R.string.strength_training_choose_an_exercise, o0VarE, false);
            } else {
                o0VarE.C(311814960);
                o0VarE.g0(false);
            }
            if (!p005kotlin.jvm.internal.s.g(eVar, eVar2) || eVar == null || z14) {
                i15 = 0;
                o0VarE.C(1077058042);
                l72.p2 p2Var = l72.p2.f111205a;
                e.f196969a.getClass();
                p2Var.g(strJ, null, null, null, e.f196971c, false, false, aVar2, o0VarE, 24576, 238);
                p3.o0 o0Var4 = o0VarE;
                o0Var4.g0(false);
                o0Var2 = o0Var4;
            } else {
                o0VarE.C(1076542388);
                l72.p2 p2Var2 = l72.p2.f111205a;
                String strQ = gl1.y.Q(o0VarE, R.string.common_suggested);
                e.f196969a.getClass();
                i15 = 0;
                p2Var2.h(strJ, strQ, null, null, null, false, false, null, e.f196970b, null, aVar2, o0VarE, 100663296, 0, 764);
                o0Var3.g0(false);
            }
            if (z14 || (list.size() <= 1 && list2.isEmpty())) {
                o0Var3 = o0VarE;
                o0Var2 = o0Var3;
                o0Var3 = o0VarE;
                o0Var2 = o0Var3;
                boolean z15 = i15;
                o0Var2.C(1079298040);
                o0Var2.g0(z15);
            } else {
                o0Var3 = o0VarE;
                o0Var2 = o0Var3;
                o0Var3 = o0VarE;
                o0Var2 = o0Var3;
                o0Var2.C(1077696053);
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar3 = j92.b.f97899b;
                h4.r rVarF = x2.f(c2.l.A(aVar3, 0.0f, eVar3.f97918c, 1), 1.0f);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0Var2, i15);
                int iHashCode = Long.hashCode(o0Var2.U);
                i2 i2VarA0 = o0Var2.a0();
                h4.r rVarC = h4.k.c(rVarF, o0Var2);
                h5.g.V.getClass();
                h5.e0.a aVar4 = h5.g.a.f81805b;
                if (cVar == 0) {
                    p3.p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar4);
                } else {
                    o0Var2.c();
                }
                h5.g.a.e eVar4 = h5.g.a.f81810g;
                b4.c(eVar4, s2VarA, o0Var2);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0Var2);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0Var2, iHashCode, bVar2);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0Var2);
                u2 u2Var = u2.f22900a;
                bVar.getClass();
                h4.r rVarC2 = c2.l.C(aVar3, eVar3.f97920e, 0.0f, 0.0f, 0.0f, 14);
                c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0Var2, 48);
                int iHashCode2 = Long.hashCode(o0Var2.U);
                i2 i2VarA1 = o0Var2.a0();
                h4.r rVarC3 = h4.k.c(rVarC2, o0Var2);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar4);
                } else {
                    o0Var2.c();
                }
                b4.c(eVar4, zVarA, o0Var2);
                b4.c(c1623g, i2VarA1, o0Var2);
                if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC3, o0Var2);
                c2.b0 b0Var = c2.b0.f22601a;
                List<vf2.e> listSubList2 = list.size() > 1 ? list.subList(1, Math.min(list.size(), 3)) : p13.j0.f134944a;
                if (list2.isEmpty()) {
                    i16 = 2;
                    listSubList = p13.j0.f134944a;
                } else {
                    i16 = 2;
                    listSubList = list2.subList(0, Math.min(list2.size(), 2));
                }
                boolean zB = o0Var2.B(list) | o0Var2.B(list2) | ((i18 & 7168) == 2048);
                Object objQ2 = o0Var2.q();
                if (zB) {
                    List[] listArr = new List[i16];
                    i17 = 0;
                    listArr[0] = listSubList2;
                    listArr[1] = listSubList;
                    objB1 = p13.h0.b1(p13.h0.f1(p13.y.s(p13.x.k(listArr))));
                    o0Var2.K(objB1);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        List[] listArr2 = new List[i16];
                        i17 = 0;
                        listArr2[0] = listSubList2;
                        listArr2[1] = listSubList;
                        objB1 = p13.h0.b1(p13.h0.f1(p13.y.s(p13.x.k(listArr2))));
                        o0Var2.K(objB1);
                    } else {
                        objB1 = objQ2;
                        i17 = 0;
                    }
                }
                List list3 = (List) objB1;
                e2.i0 i0VarA = e2.k0.a(i17, i17, 3, o0Var2);
                boolean zB2 = o0Var2.B(list3);
                Object objQ3 = o0Var2.q();
                if (zB2) {
                    arrayList = new ArrayList(p13.y.r(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        str = ((vf2.e) it.next()).f177933e;
                        if (str == null) {
                            str = "--";
                        }
                        arrayList.add(new l72.j0(str, null, null, false, false, 30, null));
                    }
                    objQ3 = p3.p0.n(arrayList);
                    o0Var2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        arrayList = new ArrayList(p13.y.r(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                            str = ((vf2.e) it.next()).f177933e;
                            if (str == null) {
                                str = "--";
                            }
                            arrayList.add(new l72.j0(str, null, null, false, false, 30, null));
                        }
                        objQ3 = p3.p0.n(arrayList);
                        o0Var2.K(objQ3);
                    }
                }
                p1 p1Var = (p1) objQ3;
                i53.c cVarE = i53.a.e((Iterable) p1Var.getF182175a());
                boolean zB3 = o0Var2.B(p1Var) | o0Var2.r(list3) | o0Var2.r(hVar);
                Object objQ4 = o0Var2.q();
                if (zB3) {
                    objQ4 = new xk1.e(p1Var, 12, list3, hVar);
                    o0Var2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new xk1.e(p1Var, 12, list3, hVar);
                        o0Var2.K(objQ4);
                    }
                }
                e82.a.b(cVarE, null, i0VarA, null, null, (e23.p) objQ4, o0Var2, 0, 26);
                e5.u(o0Var2, true, true, false);
            }
            x1 x1Var2 = p3.n.f135158a;
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(hVar, eVar, eVar2, z14, list, list2, yVar, i14, 26);
        }
    }

    public static final void d(h hVar, g gVar, vf2.e eVar, boolean z14, boolean z15, lc.y yVar, p3.m mVar, int i14) {
        boolean z16;
        lc.y yVar2;
        yVar.getClass();
        p3.o0 o0VarE = mVar.E(262703544);
        int i15 = (o0VarE.r(hVar) ? 4 : 2) | i14 | (o0VarE.r(gVar) ? 32 : 16) | (o0VarE.B(eVar) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024);
        if ((i14 & 24576) == 0) {
            z16 = z15;
            i15 |= o0VarE.h(z16) ? 16384 : 8192;
        } else {
            z16 = z15;
        }
        if ((196608 & i14) == 0) {
            yVar2 = yVar;
            i15 |= o0VarE.r(yVar2) ? 131072 : 65536;
        } else {
            yVar2 = yVar;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            b(hVar, gVar, eVar, z14, yVar2, z16, z3.f.c(-1843069078, new x(hVar, 1), o0VarE), o0VarE, ((i15 << 3) & 458752) | (i15 & 14) | 1572864 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | ((i15 >> 3) & 57344));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(hVar, gVar, eVar, z14, z15, yVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x0154  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(h hVar, m4.b0 b0Var, u1.u uVar, k2.h hVar2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(581443826);
        int i15 = i14 | (o0VarE.r(hVar) ? 4 : 2) | (o0VarE.B(uVar) ? 256 : 128) | (o0VarE.B(hVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = p3.p0.c(hVar.f197004l, o0VarE, 0);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            t62.b bVar3 = t62.b.f162798a;
            u4.d dVarA = k5.a(bVar3);
            o4.e0.a aVar3 = o4.e0.f128843b;
            d92.b.f58623a.getClass();
            o4.r rVarA = o4.e0.a.a(aVar3, d92.b.a(o0VarE).j().e());
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(hVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zB) {
                objQ = new xr.a(19, hVar, p1VarC);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xr.a(19, hVar, p1VarC);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(aVar, false, null, null, (e23.a) objQ, 15);
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarD, eVar.f97920e);
            bVar4.getClass();
            j92.c cVar = j92.b.f97901d;
            y0.b(dVarA, "", x2.m(rVarY, cVar.f97906e), rVarA, o0VarE, 48, 56);
            mg2.w.f118432a.getClass();
            h4.r rVarA2 = u1.q.a(l4.k.b(x2.u(aVar, mg2.w.f118444m), hVar2), uVar);
            boolean zR = o0VarE.r(hVar);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new ug2.z(hVar, 1);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ug2.z(hVar, 1);
                    o0VarE.K(objQ2);
                }
            }
            h4.r rVarA3 = m4.e.a(m4.e.b(rVarA2, (e23.l) objQ2), b0Var);
            x5.v.f188954b.getClass();
            p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, x5.v.f188957e, 0, (x5.f0) null, (Boolean) null, (z5.c) null, 123, (p005kotlin.jvm.internal.j) null);
            String str = (String) p1VarC.getF182175a();
            boolean zR2 = o0VarE.r(hVar);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new ug2.z(hVar, 2);
                o0VarE.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new ug2.z(hVar, 2);
                    o0VarE.K(objQ3);
                }
            }
            r82.s.a(rVarA3, a2Var, str, 5, null, (e23.l) objQ3, o0VarE, 3120, 16);
            u4.d dVarA2 = s6.a(bVar3);
            o4.r rVarA4 = o4.e0.a.a(aVar3, d92.b.a(o0VarE).j().e());
            boolean zB2 = o0VarE.B(p1VarC) | o0VarE.r(hVar);
            Object objQ4 = o0VarE.q();
            if (zB2) {
                objQ4 = new w(hVar, p1VarC, 0);
                o0VarE.K(objQ4);
            } else {
                aVar4.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new w(hVar, p1VarC, 0);
                    o0VarE.K(objQ4);
                }
            }
            h4.r rVarD2 = u1.w.d(aVar, false, null, null, (e23.a) objQ4, 15);
            bVar4.getClass();
            h4.r rVarY2 = c2.l.y(rVarD2, eVar.f97920e);
            bVar4.getClass();
            y0.b(dVarA2, "", x2.m(rVarY2, cVar.f97906e), rVarA4, o0VarE, 48, 56);
            o0VarE.g0(true);
            bVar4.getClass();
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.reps_title_case);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(hVar, b0Var, uVar, hVar2, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:102:0x0343  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x0165  */
    /* JADX WARN: Code duplicated, block: B:74:0x020f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0216  */
    /* JADX WARN: Code duplicated, block: B:77:0x021a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0235  */
    /* JADX WARN: Code duplicated, block: B:85:0x0248  */
    /* JADX WARN: Code duplicated, block: B:87:0x024b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0258  */
    /* JADX WARN: Code duplicated, block: B:91:0x0261  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:95:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:98:0x02f3  */
    public static final void f(h hVar, String str, GDIDataTypes.MeasurementUnit measurementUnit, boolean z14, e23.a<Unit> aVar, e23.l<? super GDIDataTypes.MeasurementUnit, Unit> lVar, u1.u uVar, k2.h hVar2, p3.m mVar, int i14) {
        int i15;
        h5.g.a.f fVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        int i16;
        boolean z15;
        String strJ;
        boolean z16;
        Object objQ;
        p3.o0 o0VarE = mVar.E(799125564);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.r(hVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.k(measurementUnit.ordinal()) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.B(uVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(hVar2) ? 8388608 : 4194304);
        if (o0VarE.n(i17 & 1, (4793491 & i17) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            mg2.w.f118432a.getClass();
            h4.r rVarU = x2.u(aVar2, mg2.w.f118444m);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = u1.q.a(l4.k.b(c2.l.C(rVarU, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), hVar2), uVar);
            boolean zR = o0VarE.r(hVar);
            Object objQ2 = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ2 = new ug2.z(hVar, 4);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ug2.z(hVar, 4);
                    o0VarE.K(objQ2);
                }
            }
            h4.r rVarB = m4.e.b(rVarA, (e23.l) objQ2);
            x5.v.f188954b.getClass();
            p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, x5.v.f188957e, 0, (x5.f0) null, (Boolean) null, (z5.c) null, 123, (p005kotlin.jvm.internal.j) null);
            boolean zR2 = o0VarE.r(hVar);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new ug2.z(hVar, 5);
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new ug2.z(hVar, 5);
                    o0VarE.K(objQ3);
                }
            }
            r82.s.a(rVarB, a2Var, str, 5, null, (e23.l) objQ3, o0VarE, ((i17 << 3) & 896) | 3120, 16);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            int i18 = 57344 & i17;
            boolean zR3 = o0VarE.r(hVar) | (i18 == 16384);
            Object objQ4 = o0VarE.q();
            if (zR3) {
                objQ4 = new xr.a(20, aVar, hVar);
                o0VarE.K(objQ4);
            } else {
                aVar3.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new xr.a(20, aVar, hVar);
                    o0VarE.K(objQ4);
                }
            }
            h4.r rVarD = u1.w.d(aVar2, false, null, null, (e23.a) objQ4, 15);
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(rVarD, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar4, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i15 = i17;
            } else {
                i15 = i17;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar2, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                i16 = a.f196983a[measurementUnit.ordinal()];
                if (i16 != 1) {
                    z15 = false;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -604619890, R.string.kilograms_with_unit, o0VarE, false);
                } else {
                    if (i16 == 2) {
                        throw kg.f.h(o0VarE, -604622219, false);
                    }
                    z15 = false;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -604616533, R.string.pounds_with_unit, o0VarE, false);
                }
                String str2 = strJ;
                d92.b.f58624b.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                u4.d dVarA = h1.a(t62.b.f162798a);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_unit_of_measure);
                o4.r rVarA2 = o4.e0.a.a(o4.e0.f128843b, d92.b.a(o0VarE).f().b());
                bVar.getClass();
                h4.r rVarC4 = c2.l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                bVar.getClass();
                y0.b(dVarA, strQ, x2.q(rVarC4, eVar.f97920e), rVarA2, o0VarE, 0, 56);
                o0VarE.g0(true);
                if (i18 == 16384) {
                    z16 = true;
                } else {
                    z16 = z15;
                }
                objQ = o0VarE.q();
                if (z16) {
                    objQ = new ya0.l(aVar, 4);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ya0.l(aVar, 4);
                        o0VarE.K(objQ);
                    }
                }
                bVar.getClass();
                i3.u.a(z14, (e23.a) objQ, null, 0L, null, null, k2.i.a(j92.b.f97900c.f97911c), v.h.t(o0VarE), 0.0f, 0.0f, z3.f.c(550232833, new gt1.l(lVar, 7), o0VarE), o0VarE, (i15 >> 9) & 14, 48, 1852);
                o0VarE = o0VarE;
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar2, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            i16 = a.f196983a[measurementUnit.ordinal()];
            if (i16 != 1) {
                z15 = false;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -604619890, R.string.kilograms_with_unit, o0VarE, false);
            } else {
                if (i16 == 2) {
                    throw kg.f.h(o0VarE, -604622219, false);
                }
                z15 = false;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -604616533, R.string.pounds_with_unit, o0VarE, false);
            }
            String str3 = strJ;
            d92.b.f58624b.getClass();
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
            u4.d dVarA2 = h1.a(t62.b.f162798a);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_unit_of_measure);
            o4.r rVarA3 = o4.e0.a.a(o4.e0.f128843b, d92.b.a(o0VarE).f().b());
            bVar.getClass();
            h4.r rVarC5 = c2.l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
            bVar.getClass();
            y0.b(dVarA2, strQ2, x2.q(rVarC5, eVar.f97920e), rVarA3, o0VarE, 0, 56);
            o0VarE.g0(true);
            if (i18 == 16384) {
                z16 = true;
            } else {
                z16 = z15;
            }
            objQ = o0VarE.q();
            if (z16) {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ya0.l(aVar, 4);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new ya0.l(aVar, 4);
                o0VarE.K(objQ);
            }
            bVar.getClass();
            i3.u.a(z14, (e23.a) objQ, null, 0L, null, null, k2.i.a(j92.b.f97900c.f97911c), v.h.t(o0VarE), 0.0f, 0.0f, z3.f.c(550232833, new gt1.l(lVar, 7), o0VarE), o0VarE, (i15 >> 9) & 14, 48, 1852);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.n(hVar, str, measurementUnit, z14, aVar, lVar, uVar, hVar2, i14);
        }
    }

    public static final void g(h hVar, g gVar, vf2.e eVar, boolean z14, boolean z15, boolean z16, lc.y yVar, p3.m mVar, int i14) {
        yVar.getClass();
        p3.o0 o0VarE = mVar.E(1853329366);
        int i15 = i14 | (o0VarE.r(hVar) ? 4 : 2) | (o0VarE.r(gVar) ? 32 : 16) | (o0VarE.B(eVar) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.h(z15) ? 16384 : 8192) | (o0VarE.h(z16) ? 131072 : 65536) | (o0VarE.r(yVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            if (z15) {
                o0VarE.C(730879075);
                int i16 = i15 & 8190;
                int i17 = i15 >> 3;
                a(hVar, gVar, eVar, z14, z16, yVar, o0VarE, (57344 & i17) | i16 | (i17 & 458752));
                o0VarE.g0(false);
            } else {
                o0VarE.C(731243232);
                int i18 = i15 & 8190;
                int i19 = i15 >> 3;
                d(hVar, gVar, eVar, z14, z16, yVar, o0VarE, (57344 & i19) | i18 | (i19 & 458752));
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dk0.d(hVar, gVar, eVar, z14, z15, z16, yVar, i14);
        }
    }
}
