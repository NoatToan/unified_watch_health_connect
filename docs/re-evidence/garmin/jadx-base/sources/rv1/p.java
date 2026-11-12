package rv1;

import b82.g1;
import b82.k1;
import c2.b0;
import c2.x2;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h5.e0;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class p {
    /* JADX WARN: Code duplicated, block: B:159:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[LOOP:2: B:60:0x0179->B:161:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x016e  */
    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z14, final List<? extends yw1.b> list, final List<? extends yw1.b> list2, final List<? extends yw1.b> list3, p3.m mVar, final int i14) {
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        o13.p pVar2;
        boolean z15;
        Iterator<T> it;
        o0 o0VarE = mVar.E(-1884480097);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(list2) ? 256 : 128) | (o0VarE.r(list3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(1490835426);
                List listK = x.k(new g1(y.Q(o0VarE, R.string.lbl_total), null, null, null, 14, null), new g1(y.Q(o0VarE, R.string.lbl_average), null, null, null, 14, null));
                t0 t0Var = s0.f105811a;
                pVar2 = new o13.p(listK, x.k(t0Var.b(yw1.d.class), t0Var.b(yw1.c.class)));
                o0VarE.g0(false);
            } else {
                o0VarE.C(1490843266);
                List listK2 = x.k(new g1(y.Q(o0VarE, R.string.lbl_average), null, null, null, 14, null), new g1(y.Q(o0VarE, R.string.lbl_total), null, null, null, 14, null));
                t0 t0Var2 = s0.f105811a;
                pVar2 = new o13.p(listK2, x.k(t0Var2.b(yw1.c.class), t0Var2.b(yw1.d.class)));
                o0VarE.g0(false);
            }
            List list4 = (List) pVar2.f128594a;
            List list5 = (List) pVar2.f128595b;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(0);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(h0.b0(list5));
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            if (list != null && !list.isEmpty()) {
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (((yw1.b) it3.next()).a()) {
                        }
                    } else if (list2 != null) {
                        if (list3 != null) {
                            it = list3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((yw1.b) it.next()).a()) {
                                    }
                                }
                            }
                        }
                        z15 = false;
                    } else {
                        if (list3 != null) {
                            it = list3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((yw1.b) it.next()).a()) {
                                    }
                                }
                            }
                        }
                        z15 = false;
                    }
                    z15 = true;
                }
            } else if (list2 != null || list2.isEmpty()) {
                if (list3 != null && !list3.isEmpty()) {
                    it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((yw1.b) it.next()).a()) {
                                z15 = true;
                            }
                        }
                    }
                }
                z15 = false;
            } else {
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        if (list3 != null) {
                            it = list3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((yw1.b) it.next()).a()) {
                                    }
                                }
                            }
                        }
                        z15 = false;
                    } else if (((yw1.b) it4.next()).a()) {
                    }
                    z15 = true;
                }
            }
            if (list4.isEmpty() || !z15) {
                x1 x1Var2 = p3.n.f135158a;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 1;
                pVar = new e23.p(z14, list, list2, list3, i14, i16) { // from class: rv1.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f154741a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ boolean f154742b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ List f154743c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ List f154744d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ List f154745e;

                    {
                        this.f154741a = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f154741a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(1);
                                p.a(this.f154742b, this.f154743c, this.f154744d, this.f154745e, (p3.m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(1);
                                p.a(this.f154742b, this.f154743c, this.f154744d, this.f154745e, (p3.m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarY = c2.l.y(aVar, eVar.f97920e);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var3 = p3.n.f135158a;
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                h4.r rVarX = x2.x(x2.f(aVar, 1.0f), null, 3);
                bVar.getClass();
                h4.r rVarC2 = c2.l.C(rVarX, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                i53.f fVarJ = i53.a.j(list4);
                int iIntValue = ((Number) p1Var.getF182175a()).intValue();
                boolean zR = o0VarE.r(list5);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == p3.m.a.f135155b) {
                    objQ3 = new a(list5, p1Var, p1Var2, 3);
                    o0VarE.K(objQ3);
                }
                k1.a(fVarJ, iIntValue, rVarC2, null, 0.0f, (e23.l) objQ3, o0VarE, 0, 24);
                k23.d dVar = (k23.d) p1Var2.getF182175a();
                t0 t0Var3 = s0.f105811a;
                if (p005kotlin.jvm.internal.s.g(dVar, t0Var3.b(yw1.c.class))) {
                    o0VarE.C(-1909100215);
                    yw1.b bVar3 = list != null ? list.get(((Number) p1Var.getF182175a()).intValue()) : null;
                    yw1.c cVar = bVar3 instanceof yw1.c ? (yw1.c) bVar3 : null;
                    yw1.b bVar4 = list2 != null ? list2.get(((Number) p1Var.getF182175a()).intValue()) : null;
                    yw1.c cVar2 = bVar4 instanceof yw1.c ? (yw1.c) bVar4 : null;
                    yw1.b bVar5 = list3 != null ? list3.get(((Number) p1Var.getF182175a()).intValue()) : null;
                    b(cVar, cVar2, bVar5 instanceof yw1.c ? (yw1.c) bVar5 : null, o0VarE, 0);
                    o0VarE.g0(false);
                } else if (p005kotlin.jvm.internal.s.g(dVar, t0Var3.b(yw1.d.class))) {
                    o0VarE.C(-1909087519);
                    yw1.b bVar6 = list != null ? list.get(((Number) p1Var.getF182175a()).intValue()) : null;
                    yw1.d dVar2 = bVar6 instanceof yw1.d ? (yw1.d) bVar6 : null;
                    yw1.b bVar7 = list2 != null ? list2.get(((Number) p1Var.getF182175a()).intValue()) : null;
                    yw1.d dVar3 = bVar7 instanceof yw1.d ? (yw1.d) bVar7 : null;
                    yw1.b bVar8 = list3 != null ? list3.get(((Number) p1Var.getF182175a()).intValue()) : null;
                    c(dVar2, dVar3, bVar8 instanceof yw1.d ? (yw1.d) bVar8 : null, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(948158029);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i17 = 0;
            pVar = new e23.p(z14, list, list2, list3, i14, i17) { // from class: rv1.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f154741a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f154742b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f154743c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ List f154744d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f154745e;

                {
                    this.f154741a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f154741a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            p.a(this.f154742b, this.f154743c, this.f154744d, this.f154745e, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            p.a(this.f154742b, this.f154743c, this.f154744d, this.f154745e, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v0, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r4v24, types: [int] */
    /* JADX WARN: Type inference failed for: r4v26, types: [l72.x0] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r7v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v3, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [p3.m, p3.o0] */
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
    public static final void b(yw1.c cVar, yw1.c cVar2, yw1.c cVar3, p3.m mVar, int i14) {
        ?? r14;
        String str;
        p3.c<?> cVar4;
        h5.g.a.f fVar;
        b0 b0Var;
        h4.g.a aVar;
        h5.g.a.b bVar;
        e0.a aVar2;
        h5.g.a.e eVar;
        String str2;
        String str3;
        boolean z14;
        boolean z15;
        o0 o0Var;
        String str4;
        String str5;
        h5.g.a.e eVar2;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        h5.g.a.f fVar2;
        b0 b0Var2;
        String str6;
        String str7;
        ?? r15;
        ?? r16;
        ?? r17;
        h5.g.a.b bVar3;
        Double d14;
        Double d15;
        Double d16;
        o0 o0VarE = mVar.E(-138055670);
        p3.c<?> cVar5 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(cVar2) ? 32 : 16) | (o0VarE.B(cVar3) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (cVar3 == null || (d16 = cVar3.f199899a) == null) {
                str = null;
            } else {
                int iB = MathKt.b(d16.doubleValue());
                l3.f23124b.getClass();
                str = l3.f23131i.format(Integer.valueOf(iB));
            }
            String str8 = (cVar == null || (d15 = cVar.f199899a) == null) ? null : l3.f23129g.format(d15.doubleValue());
            String str9 = (cVar2 == null || (d14 = cVar2.f199899a) == null) ? null : l3.f23129g.format(d14.doubleValue());
            fy1.i.f73924a.getClass();
            o13.p pVarH = fy1.i.a.h(true, o0VarE);
            String str10 = (String) pVarH.f128594a;
            String str11 = (String) pVarH.f128595b;
            o13.p pVarH2 = fy1.i.a.h(false, o0VarE);
            String str12 = (String) pVarH2.f128594a;
            String str13 = (String) pVarH2.f128595b;
            String strQ = y.Q(o0VarE, R.string.average_weekly_distance_abbreviated);
            String str14 = cVar3 != null ? cVar3.f199900b : null;
            String str15 = cVar != null ? cVar.f199900b : null;
            String str16 = cVar2 != null ? cVar2.f199900b : null;
            String strQ2 = y.Q(o0VarE, R.string.average_weekly_time_abbreviated);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97922g;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.r.a aVar3 = h4.r.S;
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            z zVarA = c2.y.a(iVarI, aVar4, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar5 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar4 = h5.g.a.f81810g;
            b4.c(eVar4, zVarA, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA0, o0VarE);
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            }
            h5.g.a.f fVar3 = h5.g.a.f81807d;
            b4.c(fVar3, rVarC, o0VarE);
            b0 b0Var3 = b0.f22601a;
            if (str == null || str14 == null) {
                cVar4 = cVar5;
                fVar = fVar3;
                b0Var = b0Var3;
                aVar = aVar4;
                bVar = bVar5;
                aVar2 = aVar5;
                eVar = eVar4;
                str2 = strQ;
                str3 = strQ2;
                z14 = true;
                z15 = false;
                o0VarE.C(363907106);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                o0VarE.C(362731803);
                h4.r rVarF = x2.f(aVar3, 1.0f);
                cVar4 = cVar5;
                z zVarA2 = c2.y.a(c2.j.f22694d, aVar4, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarF, o0VarE);
                if (cVar4 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar4, zVarA2, o0VarE);
                b4.c(c1623g2, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar5);
                }
                b4.c(fVar3, rVarC2, o0VarE);
                String strQ3 = y.Q(o0VarE, uv1.d.f172947k.f172956a);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                h4.r rVarB = b0Var3.b(aVar3, aVar4);
                bVar4.getClass();
                eVar = eVar4;
                b0Var = b0Var3;
                fVar = fVar3;
                bVar = bVar5;
                aVar2 = aVar5;
                z14 = true;
                aVar = aVar4;
                mh.c(strQ3, c2.l.C(rVarB, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0 o0Var2 = o0VarE;
                l72.x0 x0Var = l72.x0.f111346a;
                f21.b bVar6 = new f21.b(str, 5, strQ, str11, str10, str14, strQ2);
                str2 = strQ;
                str3 = strQ2;
                x0Var.e(null, z3.f.c(-1368159510, bVar6, o0Var2), o0Var2, (l72.x0.f111348c << 6) | 48, 1);
                o0Var2.g0(true);
                z15 = false;
                o0Var2.g0(false);
                o0Var = o0Var2;
            }
            if (str9 == null || str16 == null) {
                str4 = str3;
                str5 = str13;
                eVar2 = eVar;
                c1623g = c1623g2;
                bVar2 = bVar;
                fVar2 = fVar;
                b0Var2 = b0Var;
                str6 = str2;
                str7 = str12;
                o0Var.C(365183810);
                o0Var.g0(z15);
                r16 = z15;
                r15 = o0Var;
            } else {
                o0Var.C(364028688);
                h4.r rVarF2 = x2.f(aVar3, 1.0f);
                z zVarA3 = c2.y.a(c2.j.f22694d, aVar, o0Var, z15 ? 1 : 0);
                int iHashCode3 = Long.hashCode(o0Var.U);
                i2 i2VarA2 = o0Var.a0();
                h4.r rVarC3 = h4.k.c(rVarF2, o0Var);
                if (cVar4 == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                h5.g.a.e eVar5 = eVar;
                b4.c(eVar5, zVarA3, o0Var);
                b4.c(c1623g2, i2VarA2, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode3))) {
                    bVar3 = bVar;
                    v.h.A(iHashCode3, o0Var, iHashCode3, bVar3);
                } else {
                    bVar3 = bVar;
                }
                h5.g.a.f fVar4 = fVar;
                b4.c(fVar4, rVarC3, o0Var);
                String strQ4 = y.Q(o0Var, uv1.d.f172946j.f172956a);
                d92.b.f58624b.getClass();
                x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), o0Var);
                b0 b0Var4 = b0Var;
                h4.r rVarB2 = b0Var4.b(aVar3, aVar);
                bVar4.getClass();
                h4.r rVarC4 = c2.l.C(rVarB2, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7);
                boolean z16 = z15 ? 1 : 0;
                o0 o0Var3 = o0Var;
                eVar2 = eVar5;
                b0Var2 = b0Var4;
                fVar2 = fVar4;
                bVar2 = bVar3;
                c1623g = c1623g2;
                mh.c(strQ4, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var3, 0, 0, 131068);
                o0 o0Var4 = o0Var3;
                l72.x0 x0Var2 = l72.x0.f111346a;
                String str17 = str2;
                String str18 = str3;
                f21.b bVar7 = new f21.b(str9, 6, str17, str13, str12, str16, str18);
                str6 = str17;
                str5 = str13;
                str7 = str12;
                str4 = str18;
                x0Var2.e(null, z3.f.c(384049121, bVar7, o0Var4), o0Var4, (l72.x0.f111348c << 6) | 48, 1);
                o0Var4.g0(z14);
                r16 = 0;
                o0Var4.g0(false);
                r15 = o0Var4;
            }
            if (str8 == null || str15 == null) {
                r15.C(366460514);
                r15.g0(r16);
                r17 = r15;
            } else {
                r15.C(365305392);
                h4.r rVarF3 = x2.f(aVar3, 1.0f);
                z zVarA4 = c2.y.a(c2.j.f22694d, aVar, r15, r16);
                int iHashCode4 = Long.hashCode(r15.U);
                i2 i2VarA3 = r15.a0();
                h4.r rVarC5 = h4.k.c(rVarF3, r15);
                if (cVar4 == null) {
                    p0.l();
                    throw null;
                }
                r15.z();
                if (r15.T) {
                    r15.M(aVar2);
                } else {
                    r15.c();
                }
                b4.c(eVar2, zVarA4, r15);
                b4.c(c1623g, i2VarA3, r15);
                if (r15.T || !p005kotlin.jvm.internal.s.g(r15.q(), Integer.valueOf(iHashCode4))) {
                    v.h.A(iHashCode4, r15, iHashCode4, bVar2);
                }
                b4.c(fVar2, rVarC5, r15);
                String strQ5 = y.Q(r15, uv1.d.f172945i.f172956a);
                d92.b.f58624b.getClass();
                x0 x0VarB3 = d92.c.b(d92.c.e(j92.f.f97931h), r15);
                h4.r rVarB3 = b0Var2.b(aVar3, aVar);
                bVar4.getClass();
                ?? r24 = r15;
                mh.c(strQ5, c2.l.C(rVarB3, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB3, r24, 0, 0, 131068);
                ?? r18 = r24;
                l72.x0.f111346a.e(null, z3.f.c(1847687138, new f21.b(str8, 7, str6, str5, str7, str15, str4), r18), r18, (l72.x0.f111348c << 6) | 48, 1);
                r18.g0(z14);
                r18.g0(r16);
                r17 = r18;
            }
            r17.g0(z14);
            r14 = r17;
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pp.g(cVar, cVar2, cVar3, i14, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v0, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r4v24, types: [int] */
    /* JADX WARN: Type inference failed for: r4v26, types: [l72.x0] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r7v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v3, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [p3.m, p3.o0] */
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
    public static final void c(yw1.d dVar, yw1.d dVar2, yw1.d dVar3, p3.m mVar, int i14) {
        ?? r14;
        String str;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        b0 b0Var;
        h4.g.a aVar;
        h5.g.a.b bVar;
        e0.a aVar2;
        h5.g.a.e eVar;
        String str2;
        String str3;
        boolean z14;
        boolean z15;
        o0 o0Var;
        String str4;
        String str5;
        String str6;
        String str7;
        h5.g.a.e eVar2;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        h5.g.a.f fVar2;
        b0 b0Var2;
        ?? r15;
        ?? r16;
        ?? r17;
        h5.g.a.b bVar3;
        Double d14;
        Double d15;
        Double d16;
        o0 o0VarE = mVar.E(93288476);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.B(dVar2) ? 32 : 16) | (o0VarE.B(dVar3) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            fy1.i.f73924a.getClass();
            o13.p pVarH = fy1.i.a.h(true, o0VarE);
            String str8 = (String) pVarH.f128594a;
            String str9 = (String) pVarH.f128595b;
            o13.p pVarH2 = fy1.i.a.h(false, o0VarE);
            String str10 = (String) pVarH2.f128594a;
            String str11 = (String) pVarH2.f128595b;
            if (dVar3 == null || (d16 = dVar3.f199901a) == null) {
                str = null;
            } else {
                double dDoubleValue = d16.doubleValue();
                l3.f23124b.getClass();
                str = l3.f23131i.format(Integer.valueOf(MathKt.b(dDoubleValue)));
            }
            String str12 = (dVar2 == null || (d15 = dVar2.f199901a) == null) ? null : l3.f23129g.format(d15.doubleValue());
            String str13 = (dVar == null || (d14 = dVar.f199901a) == null) ? null : l3.f23129g.format(d14.doubleValue());
            String str14 = dVar3 != null ? dVar3.f199902b : null;
            String str15 = dVar2 != null ? dVar2.f199902b : null;
            String str16 = dVar != null ? dVar.f199902b : null;
            String strQ = y.Q(o0VarE, R.string.lbl_total_distance);
            String strQ2 = y.Q(o0VarE, R.string.activity_stats_details_total_time_label);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97922g;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.r.a aVar3 = h4.r.S;
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            z zVarA = c2.y.a(iVarI, aVar4, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar4 = h5.g.a.f81810g;
            b4.c(eVar4, zVarA, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA0, o0VarE);
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            }
            h5.g.a.f fVar3 = h5.g.a.f81807d;
            b4.c(fVar3, rVarC, o0VarE);
            b0 b0Var3 = b0.f22601a;
            if (str == null || str14 == null) {
                cVar = cVar2;
                fVar = fVar3;
                b0Var = b0Var3;
                aVar = aVar4;
                bVar = bVar5;
                aVar2 = aVar5;
                eVar = eVar4;
                str2 = strQ;
                str3 = strQ2;
                z14 = true;
                z15 = false;
                o0VarE.C(-1842904176);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                o0VarE.C(-1844064103);
                h4.r rVarF = x2.f(aVar3, 1.0f);
                cVar = cVar2;
                z zVarA2 = c2.y.a(c2.j.f22694d, aVar4, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarF, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar4, zVarA2, o0VarE);
                b4.c(c1623g2, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar5);
                }
                b4.c(fVar3, rVarC2, o0VarE);
                String strQ3 = y.Q(o0VarE, uv1.d.f172947k.f172956a);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                h4.r rVarB = b0Var3.b(aVar3, aVar4);
                bVar4.getClass();
                eVar = eVar4;
                b0Var = b0Var3;
                fVar = fVar3;
                bVar = bVar5;
                aVar2 = aVar5;
                z14 = true;
                aVar = aVar4;
                mh.c(strQ3, c2.l.C(rVarB, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0 o0Var2 = o0VarE;
                l72.x0 x0Var = l72.x0.f111346a;
                f21.b bVar6 = new f21.b(str, 8, strQ, str9, str8, str14, strQ2);
                str2 = strQ;
                str3 = strQ2;
                x0Var.e(null, z3.f.c(-235506948, bVar6, o0Var2), o0Var2, (l72.x0.f111348c << 6) | 48, 1);
                o0Var2.g0(true);
                z15 = false;
                o0Var2.g0(false);
                o0Var = o0Var2;
            }
            if (str12 == null || str15 == null) {
                str4 = str2;
                str5 = str10;
                str6 = str3;
                str7 = str11;
                eVar2 = eVar;
                c1623g = c1623g2;
                bVar2 = bVar;
                fVar2 = fVar;
                b0Var2 = b0Var;
                o0Var.C(-1841636400);
                o0Var.g0(z15);
                r16 = z15;
                r15 = o0Var;
            } else {
                o0Var.C(-1842784795);
                h4.r rVarF2 = x2.f(aVar3, 1.0f);
                z zVarA3 = c2.y.a(c2.j.f22694d, aVar, o0Var, z15 ? 1 : 0);
                int iHashCode3 = Long.hashCode(o0Var.U);
                i2 i2VarA2 = o0Var.a0();
                h4.r rVarC3 = h4.k.c(rVarF2, o0Var);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                h5.g.a.e eVar5 = eVar;
                b4.c(eVar5, zVarA3, o0Var);
                b4.c(c1623g2, i2VarA2, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode3))) {
                    bVar3 = bVar;
                    v.h.A(iHashCode3, o0Var, iHashCode3, bVar3);
                } else {
                    bVar3 = bVar;
                }
                h5.g.a.f fVar4 = fVar;
                b4.c(fVar4, rVarC3, o0Var);
                String strQ4 = y.Q(o0Var, uv1.d.f172946j.f172956a);
                d92.b.f58624b.getClass();
                x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), o0Var);
                b0 b0Var4 = b0Var;
                h4.r rVarB2 = b0Var4.b(aVar3, aVar);
                bVar4.getClass();
                h4.r rVarC4 = c2.l.C(rVarB2, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7);
                boolean z16 = z15 ? 1 : 0;
                o0 o0Var3 = o0Var;
                eVar2 = eVar5;
                b0Var2 = b0Var4;
                fVar2 = fVar4;
                bVar2 = bVar3;
                c1623g = c1623g2;
                mh.c(strQ4, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var3, 0, 0, 131068);
                o0 o0Var4 = o0Var3;
                l72.x0 x0Var2 = l72.x0.f111346a;
                String str17 = str2;
                String str18 = str3;
                f21.b bVar7 = new f21.b(str12, 9, str17, str11, str10, str15, str18);
                str4 = str17;
                str7 = str11;
                str5 = str10;
                str6 = str18;
                x0Var2.e(null, z3.f.c(-1089802509, bVar7, o0Var4), o0Var4, (l72.x0.f111348c << 6) | 48, 1);
                o0Var4.g0(z14);
                r16 = 0;
                o0Var4.g0(false);
                r15 = o0Var4;
            }
            if (str13 == null || str16 == null) {
                r15.C(-1840369616);
                r15.g0(r16);
                r17 = r15;
            } else {
                r15.C(-1841517050);
                h4.r rVarF3 = x2.f(aVar3, 1.0f);
                z zVarA4 = c2.y.a(c2.j.f22694d, aVar, r15, r16);
                int iHashCode4 = Long.hashCode(r15.U);
                i2 i2VarA3 = r15.a0();
                h4.r rVarC5 = h4.k.c(rVarF3, r15);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                r15.z();
                if (r15.T) {
                    r15.M(aVar2);
                } else {
                    r15.c();
                }
                b4.c(eVar2, zVarA4, r15);
                b4.c(c1623g, i2VarA3, r15);
                if (r15.T || !p005kotlin.jvm.internal.s.g(r15.q(), Integer.valueOf(iHashCode4))) {
                    v.h.A(iHashCode4, r15, iHashCode4, bVar2);
                }
                b4.c(fVar2, rVarC5, r15);
                String strQ5 = y.Q(r15, uv1.d.f172945i.f172956a);
                d92.b.f58624b.getClass();
                x0 x0VarB3 = d92.c.b(d92.c.e(j92.f.f97931h), r15);
                h4.r rVarB3 = b0Var2.b(aVar3, aVar);
                bVar4.getClass();
                ?? r24 = r15;
                mh.c(strQ5, c2.l.C(rVarB3, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB3, r24, 0, 0, 131068);
                ?? r18 = r24;
                l72.x0.f111346a.e(null, z3.f.c(-1174611980, new f21.b(str13, 10, str4, str7, str5, str16, str6), r18), r18, (l72.x0.f111348c << 6) | 48, 1);
                r18.g0(z14);
                r18.g0(r16);
                r17 = r18;
            }
            r17.g0(z14);
            r14 = r17;
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pp.g(dVar, dVar2, dVar3, i14, 26);
        }
    }
}
