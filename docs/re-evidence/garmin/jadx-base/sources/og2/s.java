package og2;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.t1;
import o4.g1;
import o4.u1;
import o4.v1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m1;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes11.dex */
public final class s {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132089a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.CUBIC_BEZIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f132089a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v9 */
    public static final void a(h4.r rVar, final i53.c cVar, final q0 q0Var, final k0 k0Var, final boolean z14, p3.m mVar, int i14) {
        int i15;
        float fB;
        s5.s0 s0Var;
        Throwable th3;
        s5.s0 s0Var2;
        x0 x0Var;
        List listA;
        ?? r14;
        float fC1;
        boolean z15;
        float fC2;
        float f14;
        ?? r15;
        float fC3;
        cVar.getClass();
        p3.o0 o0VarE = mVar.E(1612534910);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i16 = i15 | 48 | (o0VarE.r(cVar) ? 256 : 128) | 3072 | (o0VarE.r(q0Var) ? 16384 : 8192) | (o0VarE.r(k0Var) ? 131072 : 65536) | 1572864 | (o0VarE.h(z14) ? 8388608 : 4194304);
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            final String strQ = gl1.y.Q(o0VarE, R.string.lbl_time_h_m_s);
            if (cVar.isEmpty()) {
                o0VarE.C(-180673275);
                g6.f.a aVar = g6.f.f75994b;
                fB = b((float) 1.5d, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-180636013);
                e.f132017a.getClass();
                fB = b(e.f132019c, o0VarE);
                o0VarE.g0(false);
            }
            if (k0Var != null) {
                s0Var = k0Var.f132051a.f132061a;
            } else {
                s0Var = q0Var != null ? q0Var.f132075b.f132100a : null;
            }
            if (s0Var == null) {
                o0VarE.C(-837105038);
                th3 = null;
                s0Var2 = new s5.s0((w5.q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
                o0VarE.g0(false);
            } else {
                th3 = null;
                o0VarE.C(-837107952);
                o0VarE.g0(false);
                s0Var2 = s0Var;
            }
            if (k0Var != null) {
                x0Var = k0Var.f132051a.f132062b;
            } else if (q0Var != null) {
                x0Var = q0Var.f132075b.f132101b;
            } else {
                x0.f157320d.getClass();
                x0Var = x0.f157321e;
            }
            int i17 = (int) (s5.s0.a(s0Var2, "a", x0Var, 0L, 1020).f157282c & 4294967295L);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj = p3.m.a.f135155b;
            if (objQ == obj) {
                objQ = p3.p0.n(th3);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == obj) {
                objQ2 = n23.j.o(fB, o0VarE);
            }
            final m1 m1Var = (m1) objQ2;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            final float fB2 = b(j92.b.f97899b.f97917b, o0VarE);
            e.f132017a.getClass();
            final float fB3 = b(e.f132020d, o0VarE);
            float f15 = k0Var != null ? (3 * i17) + 16.0f : fB2;
            if (q0Var == null || (listA = q0Var.f132074a.a()) == null) {
                listA = p13.j0.f134944a;
            }
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == 0) {
                p3.p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar4 = h4.r.S;
            final float f16 = f15;
            final float f17 = fB;
            h4.r rVarA = b0Var.a(aVar4, 1.0f, true);
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            if (cVar2 == 0) {
                p3.p0.l();
                throw th3;
            }
            o0VarE.z();
            final List list = listA;
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.r rVarD = x2.d(aVar4, 1.0f);
            c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarD, o0VarE);
            if (cVar2 == null) {
                p3.p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            o0VarE.C(-946341166);
            o0VarE.g0(false);
            h4.r rVarA2 = b0Var.a(x2.f(aVar4, 1.0f), 1.0f, true);
            if (q0Var != null) {
                o0VarE.C(-1693086440);
                fC1 = ((g6.c) o0VarE.A(t1.f91490h)).c1(i17 / 2);
                r14 = 0;
                o0VarE.g0(false);
            } else {
                r14 = 0;
                o0VarE.C(-1693085934);
                o0VarE.g0(false);
                fC1 = 0;
                g6.f.a aVar5 = g6.f.f75994b;
            }
            float f18 = fC1;
            if (q0Var != null) {
                o0VarE.C(-945981938);
                o0VarE.g0(r14);
                g6.f.a aVar6 = g6.f.f75994b;
                f14 = (float) r14;
                r15 = 0;
            } else {
                if (k0Var != null) {
                    o0VarE.C(-945874771);
                    fC2 = ((g6.c) o0VarE.A(t1.f91490h)).c1(i17 / 2);
                    z15 = false;
                    o0VarE.g0(false);
                } else {
                    z15 = false;
                    o0VarE.C(-945769650);
                    o0VarE.g0(false);
                    fC2 = 0;
                    g6.f.a aVar7 = g6.f.f75994b;
                }
                f14 = fC2;
                r15 = z15;
            }
            if (k0Var != null) {
                o0VarE.C(-1693071432);
                fC3 = ((g6.c) o0VarE.A(t1.f91490h)).c1(i17 / 2);
                o0VarE.g0(r15);
            } else {
                o0VarE.C(-1693070926);
                o0VarE.g0(r15);
                fC3 = (float) r15;
                g6.f.a aVar8 = g6.f.f75994b;
            }
            h4.r rVarC4 = c2.l.C(rVarA2, f14, f18, fC3, 0.0f, 8);
            boolean zR = o0VarE.r(q0Var) | o0VarE.r(list) | o0VarE.i(fB2) | o0VarE.i(f16) | ((i16 & 29360128) == 8388608) | o0VarE.i(f17) | o0VarE.r(cVar) | o0VarE.r(k0Var) | o0VarE.i(fB3) | o0VarE.B(strQ);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == obj) {
                e23.l lVar = new e23.l() { // from class: og2.r
                    /* JADX WARN: Code duplicated, block: B:116:0x0254 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:94:0x0247  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj2) throws Throwable {
                        q4.f fVar2;
                        q4.a.b bVar2;
                        q4.a.b bVar3;
                        float f19;
                        q4.f fVar3;
                        float f22;
                        float f24;
                        m1 m1Var2;
                        Object next;
                        Float fValueOf;
                        Float f25;
                        Float fValueOf2;
                        Float f26;
                        Float f27;
                        Float fValueOf3;
                        k0 k0Var2;
                        float floatValue;
                        float f28;
                        i53.c cVar3 = cVar;
                        p1 p1Var2 = p1Var;
                        float f29 = fB3;
                        String str = strQ;
                        q4.f fVar4 = (q4.f) obj2;
                        fVar4.getClass();
                        q0 q0Var2 = q0Var;
                        List<o13.p<Float, String>> list2 = list;
                        float f34 = fB2;
                        float f35 = f16;
                        boolean z16 = z14;
                        float f36 = f17;
                        m1 m1Var3 = m1Var;
                        if (q0Var2 != null) {
                            t0 t0Var = q0Var2.f132075b;
                            fVar2 = fVar4;
                            m1Var3.i(t0Var.a(fVar2, list2, f34, f35, z16) + f36);
                        } else {
                            fVar2 = fVar4;
                        }
                        float floatValue2 = m1Var3.getFloatValue();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar2.b() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar2.b() & 4294967295L));
                        o4.c0.f128819b.getClass();
                        int i18 = o4.c0.f128820c;
                        q4.a.b f142543b = fVar2.getF142543b();
                        long jB = f142543b.b();
                        f142543b.a().l();
                        try {
                            f142543b.f142550a.a(floatValue2, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, i18);
                            long j8 = 4294967295L;
                            if (Float.intBitsToFloat((int) (fVar2.b() >> 32)) - (m1Var3.getFloatValue() + f36) < 0.0f) {
                                j8 = jB;
                                fVar3 = fVar2;
                                bVar3 = f142543b;
                                f22 = f36;
                                m1Var2 = m1Var3;
                                k0Var2 = k0Var;
                                if (k0Var2 != null) {
                                    floatValue = m1Var2.getFloatValue() + f29;
                                    f28 = f22 + f29;
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f28, 0.0f);
                                    k0Var2.f132051a.a(fVar3, i53.a.e(k0Var2.f132052b), str);
                                    fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f28, -0.0f);
                                }
                                tn.k.p(bVar3, j8);
                                return Unit.INSTANCE;
                            }
                            try {
                                if (Float.intBitsToFloat((int) (fVar2.b() & 4294967295L)) - (f34 + f35) >= 0.0f) {
                                    try {
                                        float floatValue3 = m1Var3.getFloatValue();
                                        fVar2.getF142543b().f142550a.e(floatValue3, f34, f36, f35);
                                        try {
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it = cVar3.iterator();
                                            while (it.hasNext()) {
                                                try {
                                                    t tVar = (t) it.next();
                                                    float f37 = floatValue3;
                                                    fVar3 = fVar2;
                                                    try {
                                                        float f38 = tVar.f132090a;
                                                        try {
                                                            b bVar4 = tVar.f132099j;
                                                            b bVar5 = tVar.f132098i;
                                                            f24 = f35;
                                                            try {
                                                                boolean z17 = tVar.f132093d;
                                                                q4.a.b bVar6 = f142543b;
                                                                try {
                                                                    float f39 = tVar.f132094e;
                                                                    Iterator it3 = it;
                                                                    d dVar = tVar.f132095f;
                                                                    float f44 = f36;
                                                                    try {
                                                                        i53.c<j> cVar4 = tVar.f132092c;
                                                                        if (bVar5 != null) {
                                                                            try {
                                                                                fValueOf = Float.valueOf(bVar5.f132007a);
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                f35 = f24;
                                                                                f22 = f44;
                                                                                f19 = f37;
                                                                                fVar3.getF142543b().f142550a.e(-f19, -f34, -f22, -f35);
                                                                                throw th;
                                                                            }
                                                                        } else {
                                                                            fValueOf = null;
                                                                        }
                                                                        Float fValueOf4 = bVar5 != null ? Float.valueOf(bVar5.f132008b) : null;
                                                                        if (bVar4 != null) {
                                                                            f25 = fValueOf;
                                                                            fValueOf2 = Float.valueOf(bVar4.f132007a);
                                                                        } else {
                                                                            f25 = fValueOf;
                                                                            o13.p pVar = (o13.p) p13.h0.d0(list2);
                                                                            fValueOf2 = pVar != null ? (Float) pVar.f128594a : null;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (bVar4 != null) {
                                                                                    fValueOf3 = Float.valueOf(bVar4.f132008b);
                                                                                } else {
                                                                                    o13.p pVar2 = (o13.p) p13.h0.n0(list2);
                                                                                    if (pVar2 != null) {
                                                                                        fValueOf3 = (Float) pVar2.f128594a;
                                                                                    } else {
                                                                                        f26 = fValueOf4;
                                                                                        f27 = null;
                                                                                    }
                                                                                    Float f45 = fValueOf2;
                                                                                    f22 = f44;
                                                                                    f24 = f24;
                                                                                    long j14 = jB;
                                                                                    f19 = f37;
                                                                                    f34 = f34;
                                                                                    ArrayList arrayList2 = arrayList;
                                                                                    m1 m1Var4 = m1Var3;
                                                                                    arrayList2.add(s.c(fVar3, f38, tVar.f132091b, z17, f39, dVar, cVar4, f25, f26, f45, f27, tVar.f132096g, tVar.f132097h, z16));
                                                                                    arrayList = arrayList2;
                                                                                    f36 = f22;
                                                                                    f34 = f34;
                                                                                    fVar2 = fVar3;
                                                                                    it = it3;
                                                                                    f35 = f24;
                                                                                    m1Var3 = m1Var4;
                                                                                    f142543b = bVar6;
                                                                                    floatValue3 = f19;
                                                                                    jB = j14;
                                                                                }
                                                                                arrayList2.add(s.c(fVar3, f38, tVar.f132091b, z17, f39, dVar, cVar4, f25, f26, f45, f27, tVar.f132096g, tVar.f132097h, z16));
                                                                                arrayList = arrayList2;
                                                                                f36 = f22;
                                                                                f34 = f34;
                                                                                fVar2 = fVar3;
                                                                                it = it3;
                                                                                f35 = f24;
                                                                                m1Var3 = m1Var4;
                                                                                f142543b = bVar6;
                                                                                floatValue3 = f19;
                                                                                jB = j14;
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                f35 = f24;
                                                                                fVar3.getF142543b().f142550a.e(-f19, -f34, -f22, -f35);
                                                                                throw th;
                                                                            }
                                                                            Float f46 = fValueOf2;
                                                                            f22 = f44;
                                                                            f24 = f24;
                                                                            long j15 = jB;
                                                                            f19 = f37;
                                                                            f34 = f34;
                                                                            ArrayList arrayList3 = arrayList;
                                                                            m1 m1Var5 = m1Var3;
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            f22 = f44;
                                                                            f24 = f24;
                                                                            f19 = f37;
                                                                            f34 = f34;
                                                                            f35 = f24;
                                                                            fVar3.getF142543b().f142550a.e(-f19, -f34, -f22, -f35);
                                                                            throw th;
                                                                        }
                                                                        Float f47 = fValueOf4;
                                                                        f27 = fValueOf3;
                                                                        f26 = f47;
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        f22 = f44;
                                                                        f19 = f37;
                                                                        f35 = f24;
                                                                        fVar3.getF142543b().f142550a.e(-f19, -f34, -f22, -f35);
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    f22 = f36;
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                f22 = f36;
                                                                f24 = f24;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            f24 = f35;
                                                            f22 = f36;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        f22 = f36;
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    f19 = floatValue3;
                                                    fVar3 = fVar2;
                                                    f34 = f34;
                                                    f22 = f36;
                                                    fVar3.getF142543b().f142550a.e(-f19, -f34, -f22, -f35);
                                                    throw th;
                                                }
                                            }
                                            j8 = jB;
                                            f19 = floatValue3;
                                            fVar3 = fVar2;
                                            f34 = f34;
                                            f24 = f35;
                                            bVar3 = f142543b;
                                            f22 = f36;
                                            m1Var2 = m1Var3;
                                            Iterator it4 = arrayList.iterator();
                                            if (it4.hasNext()) {
                                                next = it4.next();
                                                while (it4.hasNext()) {
                                                    next = p13.u0.h((Map) next, (Map) it4.next());
                                                }
                                            } else {
                                                next = null;
                                            }
                                            p1Var2.setValue((Map) next);
                                            fVar3.getF142543b().f142550a.e(-f19, -f34, -f22, -f24);
                                        } catch (Throwable th13) {
                                            th = th13;
                                            f19 = floatValue3;
                                            fVar3 = fVar2;
                                            f34 = f34;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        jB = j8;
                                        bVar2 = bVar3;
                                        tn.k.p(bVar2, jB);
                                        throw th;
                                    }
                                } else {
                                    j8 = jB;
                                    fVar3 = fVar2;
                                    bVar3 = f142543b;
                                    f22 = f36;
                                    m1Var2 = m1Var3;
                                }
                                k0Var2 = k0Var;
                                if (k0Var2 != null) {
                                    try {
                                        floatValue = m1Var2.getFloatValue() + f29;
                                        f28 = f22 + f29;
                                        fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f28, 0.0f);
                                        try {
                                            k0Var2.f132051a.a(fVar3, i53.a.e(k0Var2.f132052b), str);
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f28, -0.0f);
                                        } catch (Throwable th15) {
                                            fVar3.getF142543b().f142550a.e(-floatValue, -0.0f, -f28, -0.0f);
                                            throw th15;
                                        }
                                    } catch (Throwable th16) {
                                        th = th16;
                                        jB = j8;
                                        bVar2 = bVar3;
                                        tn.k.p(bVar2, jB);
                                        throw th;
                                    }
                                }
                                tn.k.p(bVar3, j8);
                                return Unit.INSTANCE;
                            } catch (Throwable th17) {
                                th = th17;
                                bVar3 = f142543b;
                                bVar2 = bVar3;
                                tn.k.p(bVar2, jB);
                                throw th;
                            }
                        } catch (Throwable th18) {
                            th = th18;
                            bVar2 = f142543b;
                        }
                        tn.k.p(bVar2, jB);
                        throw th;
                    }
                };
                o0VarE.K(lVar);
                objQ3 = lVar;
            }
            u1.n.b(rVarC4, (e23.l) objQ3, o0VarE, 0);
            o0VarE.g0(r5);
            o0VarE.g0(r5);
            o0VarE.C(-307882683);
            o0VarE.g0(false);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(rVar, cVar, q0Var, k0Var, z14, i14, 15);
        }
    }

    public static final float b(float f14, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        return ((g6.c) mVar.A(t1.f91490h)).s0(f14);
    }

    public static final Map c(q4.f fVar, float f14, d dVar, boolean z14, float f15, d dVar2, i53.c cVar, Float f16, Float f17, Float f18, Float f19, u uVar, g1 g1Var, boolean z15) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        char c14;
        o4.j jVar;
        char c15;
        q4.f fVar2 = fVar;
        fVar2.getClass();
        dVar.getClass();
        cVar.getClass();
        uVar.getClass();
        if (cVar.isEmpty()) {
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        if (f16 != null) {
            fFloatValue = f16.floatValue();
        } else {
            Iterator<E> it = cVar.iterator();
            if (!it.hasNext()) {
                c22.t.g();
                return null;
            }
            float fMin = ((j) it.next()).f132046a;
            while (it.hasNext()) {
                fMin = Math.min(fMin, ((j) it.next()).f132046a);
            }
            fFloatValue = fMin;
        }
        if (f17 != null) {
            fFloatValue2 = f17.floatValue();
        } else {
            Iterator<E> it3 = cVar.iterator();
            if (!it3.hasNext()) {
                c22.t.g();
                return null;
            }
            float fMax = ((j) it3.next()).f132046a;
            while (it3.hasNext()) {
                fMax = Math.max(fMax, ((j) it3.next()).f132046a);
            }
            fFloatValue2 = fMax;
        }
        if (f18 != null) {
            fFloatValue3 = f18.floatValue();
        } else {
            Iterator<E> it4 = cVar.iterator();
            if (!it4.hasNext()) {
                c22.t.g();
                return null;
            }
            float fMin2 = ((j) it4.next()).f132047b;
            while (it4.hasNext()) {
                fMin2 = Math.min(fMin2, ((j) it4.next()).f132047b);
            }
            fFloatValue3 = fMin2;
        }
        if (f19 != null) {
            fFloatValue4 = f19.floatValue();
        } else {
            Iterator<E> it5 = cVar.iterator();
            if (!it5.hasNext()) {
                c22.t.g();
                return null;
            }
            float fMax2 = ((j) it5.next()).f132047b;
            while (it5.hasNext()) {
                fMax2 = Math.max(fMax2, ((j) it5.next()).f132047b);
            }
            fFloatValue4 = fMax2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<j> arrayList = new ArrayList(p13.y.r(cVar, 10));
        Iterator<E> it6 = cVar.iterator();
        while (true) {
            float fIntBitsToFloat = 0.0f;
            c14 = ' ';
            if (!it6.hasNext()) {
                break;
            }
            j jVar2 = (j) it6.next();
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            float fA = k.A(jVar2.f132046a, fFloatValue, fFloatValue2, 0.0f, Float.intBitsToFloat((int) (fVar2.b() >> 32)));
            linkedHashMap2.put(Float.valueOf(fA), Float.valueOf(jVar2.f132046a));
            float f22 = jVar2.f132047b;
            float fIntBitsToFloat2 = z15 ? 0.0f : Float.intBitsToFloat((int) (fVar2.b() & 4294967295L));
            if (z15) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (fVar2.b() & 4294967295L));
            }
            arrayList.add(new j(fA, k.A(f22, fFloatValue3, fFloatValue4, fIntBitsToFloat2, fIntBitsToFloat)));
            linkedHashMap = linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        o4.j jVarA = o4.m.a();
        int i14 = a.f132089a[uVar.ordinal()];
        if (i14 != 1) {
            int i15 = 2;
            if (i14 != 2) {
                lc.u0.r();
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i16 = 1;
            while (i16 < size) {
                int i17 = i16 - 1;
                float f24 = i15;
                arrayList2.add(new j((((j) arrayList.get(i16)).f132046a + ((j) arrayList.get(i17)).f132046a) / f24, ((j) arrayList.get(i17)).f132047b));
                arrayList3.add(new j((((j) arrayList.get(i16)).f132046a + ((j) arrayList.get(i17)).f132046a) / f24, ((j) arrayList.get(i16)).f132047b));
                i16++;
                c14 = c14;
                i15 = 2;
            }
            c15 = c14;
            jVarA.a(((j) p13.h0.b0(arrayList)).f132046a, ((j) p13.h0.b0(arrayList)).f132047b);
            int size2 = arrayList.size() - 1;
            int i18 = 0;
            while (i18 < size2) {
                float f25 = ((j) arrayList2.get(i18)).f132046a;
                float f26 = ((j) arrayList2.get(i18)).f132047b;
                float f27 = ((j) arrayList3.get(i18)).f132046a;
                float f28 = ((j) arrayList3.get(i18)).f132047b;
                i18++;
                jVarA.b(f25, f26, f27, f28, ((j) arrayList.get(i18)).f132046a, ((j) arrayList.get(i18)).f132047b);
            }
            jVar = jVarA;
        } else {
            jVar = jVarA;
            c15 = ' ';
            int i19 = 0;
            for (Object obj : arrayList) {
                int i24 = i19 + 1;
                if (i19 < 0) {
                    p13.x.q();
                    throw null;
                }
                j jVar3 = (j) obj;
                if (i19 == 0) {
                    float f29 = jVar3.f132046a;
                    float f34 = jVar3.f132047b;
                    jVar.a(f29, f34);
                    if (arrayList.size() == 1) {
                        jVar.c(jVar3.f132046a + 7.0f, f34);
                    }
                } else {
                    jVar.c(jVar3.f132046a, jVar3.f132047b);
                }
                i19 = i24;
            }
        }
        if (z14 && dVar2 != null) {
            if (dVar2 instanceof d.b) {
                for (j jVar4 : arrayList) {
                    long j8 = ((d.b) dVar2).f132015a;
                    float fS0 = fVar2.s0(f15);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(jVar4.f132047b)) & 4294967295L) | (((long) Float.floatToRawIntBits(jVar4.f132046a)) << c15);
                    n4.c.a aVar = n4.c.f123541b;
                    q4.f.o0(fVar2, j8, fS0, jFloatToRawIntBits, null, 0, 120);
                }
            } else {
                if (!(dVar2 instanceof d.a)) {
                    lc.u0.r();
                    return null;
                }
                o4.w.a aVar2 = o4.w.f129023a;
                o13.p[] pVarArr = (o13.p[]) ((d.a) dVar2).f132013a.toArray(new o13.p[0]);
                o13.p[] pVarArr2 = (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fVar2.b() & 4294967295L));
                o4.x1.f129034b.getClass();
                aVar2.getClass();
                o4.z0 z0VarH = o4.w.a.h(pVarArr2, fIntBitsToFloat3, 0.0f);
                for (j jVar5 : arrayList) {
                    float fS1 = fVar2.s0(f15);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(jVar5.f132046a)) << c15) | (((long) Float.floatToRawIntBits(jVar5.f132047b)) & 4294967295L);
                    n4.c.a aVar3 = n4.c.f123541b;
                    q4.f.p1(fVar2, z0VarH, fS1, jFloatToRawIntBits2, 120);
                    fVar2 = fVar;
                }
            }
        }
        if (dVar instanceof d.b) {
            long j14 = ((d.b) dVar).f132015a;
            float fS2 = fVar.s0(f14);
            u1.f129010b.getClass();
            int i25 = u1.f129011c;
            v1.f129019b.getClass();
            q4.f.L(fVar, jVar, j14, 0.0f, new q4.k(fS2, 0.0f, i25, v1.f129020c, g1Var, 2, null), 52);
            return linkedHashMap3;
        }
        o4.j jVar6 = jVar;
        if (!(dVar instanceof d.a)) {
            lc.u0.r();
            return null;
        }
        o4.w.a aVar4 = o4.w.f129023a;
        d.a aVar5 = (d.a) dVar;
        o13.p[] pVarArr3 = (o13.p[]) aVar5.f132013a.toArray(new o13.p[0]);
        o13.p[] pVarArr4 = (o13.p[]) Arrays.copyOf(pVarArr3, pVarArr3.length);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
        o4.x1.f129034b.getClass();
        aVar4.getClass();
        q4.f.C1(fVar, jVar6, o4.w.a.h(pVarArr4, fIntBitsToFloat4, 0.0f), 0.0f, new q4.k(fVar.s0(f14), 0.0f, aVar5.f132014b, 0, g1Var, 10, null), 52);
        return linkedHashMap3;
    }
}
