package k11;

import c2.b0;
import c2.n0;
import c2.n3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.e9;
import i3.fe;
import i3.mc;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import l72.c1;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.q2;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class y {
    /* JADX WARN: Code duplicated, block: B:44:0x01e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [b92.a, kotlin.jvm.internal.j] */
    public static final void a(i53.c<? extends b11.v> cVar, v21.e eVar, e23.l<? super b11.v, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        p3.m.a aVar;
        o0 o0Var2;
        boolean z14;
        char c14;
        o0 o0VarE = mVar.E(695751616);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.meal_foods);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar2, eVar2.f97920e, 0.0f, 2);
            bVar2.getClass();
            float f14 = eVar2.f97921f;
            bVar2.getClass();
            ?? r14 = 0;
            mh.c(strQ, c2.l.C(rVarA, 0.0f, f14, 0.0f, eVar2.f97918c, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0 o0Var3 = o0VarE;
            List listS0 = h0.S0(cVar, 4);
            List listU = h0.U(cVar, 4);
            o0Var3.C(-2049249416);
            Iterator it = listS0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                aVar = p3.m.f135153a;
                if (!zHasNext) {
                    break;
                }
                b11.v vVar = (b11.v) it.next();
                b92.a.C0235a c0235a = new b92.a.C0235a(r14, 1, r14);
                int i16 = i15;
                c0235a.f16962a.put("label_secondary", eVar.a(Double.valueOf(vVar.G0()), vVar.D0(o0Var3), vVar.getTotalCalories(), vVar.z3(), vVar.g4(), vVar.b4(), true));
                b92.a aVarB = c0235a.b();
                String strO = eVar.o(vVar.getF14238e().f14254b, vVar.getF14238e().f14256d);
                String strA = eVar.a(Double.valueOf(vVar.G0()), vVar.D0(o0Var3), vVar.getTotalCalories(), vVar.z3(), vVar.g4(), vVar.b4(), false);
                String imageUrl = vVar.getImageUrl();
                boolean zR = o0Var3.r(vVar) | ((i16 & 896) == 256);
                Object objQ = o0Var3.q();
                if (zR) {
                    c14 = 2;
                    objQ = new e11.a0(lVar, vVar, 2);
                    o0Var3.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        c14 = 2;
                        objQ = new e11.a0(lVar, vVar, 2);
                        o0Var3.K(objQ);
                    } else {
                        c14 = 2;
                    }
                }
                int i17 = b92.a.f16960b;
                j21.q.a(strO, strA, aVarB, imageUrl, false, false, (e23.a) objQ, null, 0.0f, o0Var3, 196608, 400);
                i15 = i16;
                r14 = 0;
                listU = listU;
            }
            List<b11.v> list = listU;
            int i18 = i15;
            int i19 = 256;
            o0Var3.g0(false);
            if (list.isEmpty()) {
                o0Var3.C(901812568);
                o0Var3.g0(false);
                o0Var2 = o0Var3;
            } else {
                Object objH = q2.h(o0Var3, 899387965, aVar);
                Object obj = p3.m.a.f135155b;
                if (objH == obj) {
                    objH = p0.n(Boolean.FALSE);
                    o0Var3.K(objH);
                }
                p1 p1Var = (p1) objH;
                String strQ2 = gl1.y.Q(o0Var3, ((Boolean) p1Var.getF182175a()).booleanValue() ? R.string.lbl_show_less : R.string.lbl_show_more_sentence_case);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarA = x0.a(j92.f.f97932i, hb.a.e(o0Var3), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                h4.r.a aVar4 = h4.r.S;
                Object objQ2 = o0Var3.q();
                if (objQ2 == obj) {
                    objQ2 = new jt1.h(p1Var, 23);
                    o0Var3.K(objQ2);
                }
                h4.r rVarD = u1.w.d(aVar4, false, null, null, (e23.a) objQ2, 15);
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f15 = eVar3.f97918c;
                bVar3.getClass();
                mh.c(strQ2, c2.l.z(rVarD, eVar3.f97920e, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, x0VarA, o0Var3, 0, 24576, 114684);
                o0 o0Var4 = o0Var3;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0Var4.C(899922932);
                    for (b11.v vVar2 : list) {
                        b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                        int i24 = i19;
                        c0235a2.f16962a.put("label_secondary", eVar.a(Double.valueOf(vVar2.G0()), vVar2.D0(o0Var4), vVar2.getTotalCalories(), vVar2.z3(), vVar2.g4(), vVar2.b4(), true));
                        b92.a aVarB2 = c0235a2.b();
                        String strO2 = eVar.o(vVar2.getF14238e().f14254b, vVar2.getF14238e().f14256d);
                        String strA2 = eVar.a(Double.valueOf(vVar2.G0()), vVar2.D0(o0Var4), vVar2.getTotalCalories(), vVar2.z3(), vVar2.g4(), vVar2.b4(), false);
                        String str = vVar2.getF14240g().f14379b;
                        if (str == null && (str = vVar2.getF14240g().f14380c) == null) {
                            str = vVar2.getF14240g().f14378a;
                        }
                        String str2 = str;
                        boolean zR2 = o0Var4.r(vVar2) | ((i18 & 896) == i24);
                        Object objQ3 = o0Var4.q();
                        if (zR2 || objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e11.a0(lVar, vVar2, 3);
                            o0Var4.K(objQ3);
                        }
                        int i25 = b92.a.f16960b;
                        j21.q.a(strO2, strA2, aVarB2, str2, false, false, (e23.a) objQ3, null, 0.0f, o0Var4, 196608, 400);
                        i19 = i24;
                    }
                    z14 = false;
                    o0Var4.g0(false);
                } else {
                    z14 = false;
                    o0Var4.C(901802648);
                    o0Var4.g0(false);
                }
                o0Var4.g0(z14);
                o0Var2 = o0Var4;
            }
            o0Var2.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(cVar, eVar, false, lVar, i14, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v2, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r25v2, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r5v9, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r7v11, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v12, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r7v16, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v6, types: [p3.o0] */
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
    public static final void b(final l11.n nVar, v21.e eVar, fe feVar, e23.p pVar, e23.p pVar2, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        int i15;
        fe feVar2;
        v21.e eVar2;
        ?? r14;
        int i16;
        v21.e eVar3;
        final ?? r15;
        int i17;
        l11.n.b bVar;
        int i18;
        ?? r16;
        Object obj;
        boolean z14;
        Object obj2;
        Object obj3;
        nVar.getClass();
        feVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1016280362);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(nVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(pVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= o0VarE.r(aVar3) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (i15 & 38347923) != 38347922)) {
            o0VarE.G0();
            int i19 = i14 & 1;
            p3.m.a aVar4 = p3.m.f135153a;
            if (i19 == 0 || o0VarE.o0()) {
                Object objQ = o0VarE.q();
                aVar4.getClass();
                Object obj4 = objQ;
                if (objQ == p3.m.a.f135155b) {
                    v21.e eVar4 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                    o0VarE.K(eVar4);
                    obj4 = eVar4;
                }
                i16 = i15 & (-113);
                eVar3 = (v21.e) obj4;
            } else {
                o0VarE.e();
                i16 = i15 & (-113);
                eVar3 = eVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ2 = o0VarE.q();
            aVar4.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            Object obj5 = objQ2;
            if (objQ2 == c2565a) {
                o53.b0 b0VarJ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(b0VarJ);
                obj5 = b0VarJ;
            }
            o53.b0 b0Var = (o53.b0) obj5;
            l11.m mVar2 = (l11.m) p0.c(nVar.f108200k, o0VarE, 0).getF182175a();
            Object objQ3 = o0VarE.q();
            Object obj6 = objQ3;
            if (objQ3 == c2565a) {
                c2 c2VarN = p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN);
                obj6 = c2VarN;
            }
            p1 p1Var = (p1) obj6;
            l11.n.b bVar2 = (l11.n.b) p0.c(nVar.f108202m, o0VarE, 0).getF182175a();
            String strQ = gl1.y.Q(o0VarE, R.string.meal_added_to_favorites);
            String strQ2 = gl1.y.Q(o0VarE, R.string.meal_removed_from_favorites);
            String strQ3 = gl1.y.Q(o0VarE, R.string.generic_error_message);
            int i24 = i16;
            boolean zB = ((i16 & 896) == 256) | o0VarE.B(bVar2) | ((i16 & 7168) == 2048) | ((57344 & i16) == 16384) | o0VarE.B(strQ) | o0VarE.B(strQ2) | ((i24 & 29360128) == 8388608) | o0VarE.B(strQ3) | o0VarE.r(nVar);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                r15 = 0;
                i17 = 2;
                bVar = bVar2;
                w wVar = new w(bVar, pVar, pVar2, strQ, strQ2, feVar, aVar2, strQ3, nVar, null);
                o0VarE.K(wVar);
                objQ4 = wVar;
            } else {
                bVar = bVar2;
                r15 = 0;
                i17 = 2;
            }
            l0.e((e23.p) objQ4, bVar, o0VarE);
            z3.e eVarC = z3.f.c(373872347, new i20.b(27, aVar3, nVar), o0VarE);
            z3.e eVarC2 = z3.f.c(-1082540708, new ak0.o(feVar, 18), o0VarE);
            n0 n0Var = n3.f22788a;
            v21.e eVar5 = eVar3;
            l11.n.b bVar3 = bVar;
            z02.d.a(bVar instanceof l11.n.b.f, eVarC, eVarC2, null, new n0(r15, r15, r15, r15), z3.f.c(-1156812577, new dd1.d((Object) mVar2, (Object) mcVarF, (Object) nVar, (Object) eVar5, (Object) b0Var, lVar, (Object) aVar, p1Var, 10), o0VarE), o0VarE, 197040, 8);
            if (bVar3 instanceof l11.n.b.C2079b) {
                o0VarE.C(-773905681);
                c1 c1Var = c1.f110940a;
                String strQ4 = gl1.y.Q(o0VarE, R.string.pregnancy_something_went_wrong);
                String strQ5 = gl1.y.Q(o0VarE, R.string.connect_iq_try_again);
                String strQ6 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                boolean zR = o0VarE.r(nVar);
                Object objQ5 = o0VarE.q();
                if (zR || objQ5 == c2565a) {
                    obj3 = objQ5;
                    e23.a aVar5 = new e23.a() { // from class: k11.v
                        @Override // e23.a
                        public final Object invoke() {
                            switch (r15) {
                                case 0:
                                    nVar.f108201l.setValue(l11.n.b.e.f108207a);
                                    break;
                                default:
                                    nVar.x4();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(aVar5);
                    obj3 = aVar5;
                }
                i18 = i17;
                c1Var.a(true, strQ4, strQ5, null, null, strQ6, false, false, (e23.a) obj3, null, null, o0VarE, 6, 0, 1752);
                ?? r17 = o0VarE;
                r17.g0(r15);
                r16 = r17;
            } else {
                ?? r18 = o0VarE;
                i18 = i17;
                r18.C(-773539540);
                r18.g0(r15);
                r16 = r18;
            }
            if (bVar3 instanceof l11.n.b.d) {
                r16.C(-773449454);
                ?? r19 = c1.f110940a;
                String strQ7 = gl1.y.Q(r16, R.string.pregnancy_something_went_wrong);
                String strQ8 = gl1.y.Q(r16, R.string.connect_iq_try_again);
                String strQ9 = gl1.y.Q(r16, R.string.lbl_ok);
                String strQ10 = gl1.y.Q(r16, R.string.lbl_cancel);
                boolean zR2 = r16.r(nVar);
                Object objQ6 = r16.q();
                if (zR2 || objQ6 == c2565a) {
                    z14 = true;
                    final boolean z15 = true ? 1 : 0;
                    e23.a aVar6 = new e23.a() { // from class: k11.v
                        @Override // e23.a
                        public final Object invoke() {
                            switch (z15) {
                                case 0:
                                    nVar.f108201l.setValue(l11.n.b.e.f108207a);
                                    break;
                                default:
                                    nVar.x4();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    r16.K(aVar6);
                    obj2 = aVar6;
                } else {
                    z14 = true;
                    obj2 = objQ6;
                }
                e23.a aVar7 = (e23.a) obj2;
                ?? r24 = z14;
                if ((i24 & 234881024) != 67108864) {
                    r24 = r15;
                }
                Object objQ7 = r16.q();
                Object obj7 = objQ7;
                if (r24 != 0 || objQ7 == c2565a) {
                    j22.d dVar = new j22.d(aVar3, 20);
                    r16.K(dVar);
                    obj7 = dVar;
                }
                r19.a(true, strQ7, strQ8, null, null, strQ9, false, false, aVar7, strQ10, (e23.a) obj7, r16, 6, 0, 216);
                r16.g0(r15);
            } else {
                r16.C(-772957236);
                r16.g0(r15);
            }
            if (((Boolean) r13.getF182175a()).booleanValue()) {
                r16.C(-772911356);
                c22.i iVarB = c22.i.b(R.string.delete_custom_meal);
                c22.i iVarB2 = c22.i.b(R.string.delete_meal_this_cannot_be_undone);
                boolean zR3 = r16.r(nVar);
                Object objQ8 = r16.q();
                if (zR3 || objQ8 == c2565a) {
                    obj = objQ8;
                    h hVar = new h(i18, nVar, (Object) r13);
                    r16.K(hVar);
                    obj = hVar;
                }
                e23.a aVar8 = (e23.a) obj;
                Object objQ9 = r16.q();
                Object obj8 = objQ9;
                if (objQ9 == c2565a) {
                    jt1.h hVar2 = new jt1.h(p1Var, 24);
                    r16.K(hVar2);
                    obj8 = hVar2;
                }
                f0.c(iVarB, iVarB2, aVar8, (e23.a) obj8, r16, 3072);
                r16.g0(r15);
            } else {
                r16.C(-772534644);
                r16.g0(r15);
            }
            eVar2 = eVar5;
            r14 = r16;
        } else {
            feVar2 = feVar;
            o0 o0Var = o0VarE;
            o0Var.e();
            eVar2 = eVar;
            r14 = o0Var;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(nVar, eVar2, feVar2, pVar, pVar2, lVar, aVar, aVar2, aVar3, i14);
        }
    }
}
