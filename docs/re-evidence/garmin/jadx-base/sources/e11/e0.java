package e11;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n0;
import c2.n3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.fe;
import java.util.Iterator;
import java.util.Set;
import kotlin.t1;
import l72.c1;
import l72.r1;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 {
    /* JADX WARN: Code duplicated, block: B:96:0x027e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final f11.g gVar, v21.e eVar, fe feVar, e23.l lVar, e23.l lVar2, e23.l lVar3, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        v21.e eVar2;
        int i16;
        v21.e eVar3;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        Object objQ;
        gVar.getClass();
        feVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(273550664);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(gVar) ? 4 : 2) | i14;
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
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            p3.m.a aVar = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                Object objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                    o0VarE.K(objQ2);
                }
                i16 = i15 & (-113);
                eVar3 = (v21.e) objQ2;
            } else {
                o0VarE.e();
                i16 = i15 & (-113);
                eVar3 = eVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(gVar.f67933e, o0VarE);
            p1 p1VarC2 = s9.c.c(gVar.f67935g, o0VarE);
            p1 p1VarC3 = s9.c.c(gVar.f67937i, o0VarE);
            p1 p1VarC4 = s9.c.c(gVar.f67939k, o0VarE);
            p1 p1VarC5 = s9.c.c(gVar.f67940l, o0VarE);
            Object objQ3 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ3 == c2565a2) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            f11.g.c cVar = (f11.g.c) p1VarC3.getF182175a();
            int i18 = i16 & 7168;
            boolean zB = o0VarE.B(p1VarC3) | (i18 == 2048) | o0VarE.r(gVar);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a2) {
                objQ4 = new d0(lVar, gVar, p1VarC3, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, cVar, o0VarE);
            boolean z14 = ((f11.g.c) p1VarC3.getF182175a()) == f11.g.c.LOADING;
            z3.e eVarC = z3.f.c(585476749, new d50.i(gVar, qVar, context, p1Var2, 8), o0VarE);
            z3.e eVarC2 = z3.f.c(27492686, new ak0.o(feVar, 5), o0VarE);
            n0 n0Var = n3.f22788a;
            v21.e eVar4 = eVar3;
            final int i19 = 1;
            o0Var = o0VarE;
            z02.d.a(z14, eVarC, eVarC2, null, new n0(0, 0, 0, 0), z3.f.c(-1646459503, new dd1.d((Object) p1VarC, (Object) gVar, (Object) eVar4, lVar3, (Object) lVar2, (Object) p1VarC2, (Object) p1VarC4, (Object) p1VarC5, 2), o0VarE), o0Var, 197040, 8);
            final int i24 = 0;
            r1.c0.e(((f11.g.c) p1VarC3.getF182175a()) == f11.g.c.ERROR, null, null, null, null, z3.f.c(-1153190544, new e23.q() { // from class: e11.b0
                /* JADX WARN: Code duplicated, block: B:15:0x00ad  */
                /* JADX WARN: Code duplicated, block: B:8:0x0051  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i25 = i24;
                    p3.m.a aVar2 = p3.m.f135153a;
                    f11.g gVar2 = gVar;
                    switch (i25) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj2;
                            ((Integer) obj3).getClass();
                            ((r1.e0) obj).getClass();
                            x1 x1Var2 = p3.n.f135158a;
                            c1 c1Var = c1.f110940a;
                            String strQ = gl1.y.Q(mVar2, R.string.pregnancy_something_went_wrong);
                            String strQ2 = gl1.y.Q(mVar2, R.string.connect_iq_try_again);
                            String strQ3 = gl1.y.Q(mVar2, R.string.lbl_ok);
                            boolean zR = mVar2.r(gVar2);
                            Object objQ5 = mVar2.q();
                            if (zR) {
                                objQ5 = new y(gVar2, 0);
                                mVar2.K(objQ5);
                            } else {
                                aVar2.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new y(gVar2, 0);
                                    mVar2.K(objQ5);
                                }
                            }
                            c1Var.a(true, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ5, null, null, mVar2, 6, 0, 1752);
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj2;
                            ((Integer) obj3).getClass();
                            ((r1.e0) obj).getClass();
                            x1 x1Var3 = p3.n.f135158a;
                            c1 c1Var2 = c1.f110940a;
                            String strQ4 = gl1.y.Q(mVar3, R.string.food_limit_reached);
                            String strP = gl1.y.P(R.string.food_limit_reached_desc, new Object[]{20}, mVar3);
                            String strQ5 = gl1.y.Q(mVar3, R.string.lbl_ok);
                            boolean zR2 = mVar3.r(gVar2);
                            Object objQ6 = mVar3.q();
                            if (zR2) {
                                objQ6 = new y(gVar2, 2);
                                mVar3.K(objQ6);
                            } else {
                                aVar2.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    objQ6 = new y(gVar2, 2);
                                    mVar3.K(objQ6);
                                }
                            }
                            c1Var2.a(true, strQ4, strP, null, null, strQ5, false, false, (e23.a) objQ6, null, null, mVar3, 6, 0, 1752);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var), o0Var, 196608, 30);
            r1.c0.e(((f11.g.c) p1VarC3.getF182175a()) == f11.g.c.LOAD_FAILED, null, null, null, null, z3.f.c(-1822050343, new c0(0, gVar, lVar), o0Var), o0Var, 196608, 30);
            r1.c0.e(((i53.c) p1VarC2.getF182175a()).contains(v01.f.FOOD_LIMIT_EXCEEDED), null, null, null, null, z3.f.c(-1228561672, new e23.q() { // from class: e11.b0
                /* JADX WARN: Code duplicated, block: B:15:0x00ad  */
                /* JADX WARN: Code duplicated, block: B:8:0x0051  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i25 = i19;
                    p3.m.a aVar2 = p3.m.f135153a;
                    f11.g gVar2 = gVar;
                    switch (i25) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj2;
                            ((Integer) obj3).getClass();
                            ((r1.e0) obj).getClass();
                            x1 x1Var2 = p3.n.f135158a;
                            c1 c1Var = c1.f110940a;
                            String strQ = gl1.y.Q(mVar2, R.string.pregnancy_something_went_wrong);
                            String strQ2 = gl1.y.Q(mVar2, R.string.connect_iq_try_again);
                            String strQ3 = gl1.y.Q(mVar2, R.string.lbl_ok);
                            boolean zR = mVar2.r(gVar2);
                            Object objQ5 = mVar2.q();
                            if (zR) {
                                objQ5 = new y(gVar2, 0);
                                mVar2.K(objQ5);
                            } else {
                                aVar2.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new y(gVar2, 0);
                                    mVar2.K(objQ5);
                                }
                            }
                            c1Var.a(true, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ5, null, null, mVar2, 6, 0, 1752);
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj2;
                            ((Integer) obj3).getClass();
                            ((r1.e0) obj).getClass();
                            x1 x1Var3 = p3.n.f135158a;
                            c1 c1Var2 = c1.f110940a;
                            String strQ4 = gl1.y.Q(mVar3, R.string.food_limit_reached);
                            String strP = gl1.y.P(R.string.food_limit_reached_desc, new Object[]{20}, mVar3);
                            String strQ5 = gl1.y.Q(mVar3, R.string.lbl_ok);
                            boolean zR2 = mVar3.r(gVar2);
                            Object objQ6 = mVar3.q();
                            if (zR2) {
                                objQ6 = new y(gVar2, 2);
                                mVar3.K(objQ6);
                            } else {
                                aVar2.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    objQ6 = new y(gVar2, 2);
                                    mVar3.K(objQ6);
                                }
                            }
                            c1Var2.a(true, strQ4, strP, null, null, strQ5, false, false, (e23.a) objQ6, null, null, mVar3, 6, 0, 1752);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var), o0Var, 196608, 30);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0Var.C(1803420452);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(o0Var, R.string.message_common_confirm_leaving_screen);
                String strQ2 = gl1.y.Q(o0Var, R.string.lbl_yes);
                String strQ3 = gl1.y.Q(o0Var, R.string.common_cancel);
                boolean zR = o0Var.r(gVar) | (i18 == 2048);
                Object objQ5 = o0Var.q();
                if (zR) {
                    c2565a = c2565a2;
                } else {
                    c2565a = c2565a2;
                    if (objQ5 != c2565a) {
                        p1Var = p1Var2;
                    }
                    e23.a<Unit> aVar2 = (e23.a) objQ5;
                    objQ = o0Var.q();
                    if (objQ == c2565a) {
                        objQ = new dv0.f(p1Var, 17);
                        o0Var.K(objQ);
                    }
                    c1Var.a(false, strQ, null, null, null, strQ2, false, false, aVar2, strQ3, (e23.a) objQ, o0Var, 0, 6, 221);
                    o0Var.g0(false);
                }
                p1Var = p1Var2;
                objQ5 = new cw1.g0(lVar, gVar, p1Var, 7);
                o0Var.K(objQ5);
                e23.a<Unit> aVar3 = (e23.a) objQ5;
                objQ = o0Var.q();
                if (objQ == c2565a) {
                    objQ = new dv0.f(p1Var, 17);
                    o0Var.K(objQ);
                }
                c1Var.a(false, strQ, null, null, null, strQ2, false, false, aVar3, strQ3, (e23.a) objQ, o0Var, 0, 6, 221);
                o0Var.g0(false);
            } else {
                o0Var.C(1803847322);
                o0Var.g0(false);
            }
            eVar2 = eVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            eVar2 = eVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.g0((Object) gVar, (Object) eVar2, (Object) feVar, lVar, lVar2, lVar3, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0258  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r13v1, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v2, types: [l72.p2] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r1v2, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r22v2, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v36, types: [b11.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [b92.a, kotlin.jvm.internal.j] */
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
    public static final void b(i53.c<? extends b11.v> cVar, Set<String> set, boolean z14, v21.e eVar, e23.l<? super b11.v, Unit> lVar, e23.l<? super b63.u, Unit> lVar2, e23.l<? super b11.v, Unit> lVar3, p3.m mVar, int i14) {
        e23.l<? super b63.u, Unit> lVar4;
        boolean z15;
        ?? r14;
        p3.m.a aVar;
        Object obj;
        Object obj2;
        v21.e eVar2 = eVar;
        o0 o0VarE = mVar.E(-1216000287);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.r(set) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(eVar2) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 599187) != 599186)) {
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
            h5.e0.a aVar3 = h5.g.a.f81805b;
            ?? r15 = 0;
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
            c2.b0 b0Var = c2.b0.f22601a;
            r1.b(gl1.y.P(R.string.meal_foods_value, new Object[]{Integer.valueOf(cVar.size())}, o0VarE), null, o0VarE, 0, 2);
            o0VarE.C(566888723);
            Iterator<? extends b11.v> it = cVar.iterator();
            ?? r16 = o0VarE;
            while (true) {
                boolean zHasNext = it.hasNext();
                aVar = p3.m.f135153a;
                if (!zHasNext) {
                    break;
                }
                b11.v next = it.next();
                b92.a.C0235a c0235a = new b92.a.C0235a(r15, 1, r15);
                ?? r17 = r15;
                int i17 = i16;
                c0235a.f16962a.put("label_secondary", eVar2.a(Double.valueOf(next.G0()), next.D0(r16), next.getTotalCalories(), next.z3(), next.g4(), next.b4(), true));
                b92.a aVarB = c0235a.b();
                String strO = eVar2.o(next.getF14238e().f14254b, next.getF14238e().f14256d);
                String strA = eVar2.a(Double.valueOf(next.G0()), next.D0(r16), next.getTotalCalories(), next.z3(), next.g4(), next.b4(), false);
                String imageUrl = next.getImageUrl();
                boolean zContains = set.contains(next.getF14234a());
                int i18 = (r16.r(next) ? 1 : 0) | ((i15 & 57344) == 16384 ? 1 : i17);
                Object objQ = r16.q();
                if (i18 == 0) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        obj2 = objQ;
                        a0 a0Var = new a0(lVar, next, i17);
                        r16.K(a0Var);
                        obj2 = a0Var;
                    }
                } else {
                    obj2 = objQ;
                    a0 a0Var2 = new a0(lVar, next, i17);
                    r16.K(a0Var2);
                    obj2 = a0Var2;
                }
                obj2 = objQ;
                e23.a aVar4 = (e23.a) obj2;
                int i19 = ((i15 & 3670016) == 1048576 ? 1 : i17) | (r16.r(next) ? 1 : 0);
                Object objQ2 = r16.q();
                if (i19 == 0) {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a0(lVar3, next, 1);
                        r16.K(objQ2);
                    }
                } else {
                    objQ2 = new a0(lVar3, next, 1);
                    r16.K(objQ2);
                }
                int i24 = b92.a.f16960b;
                ?? r24 = r16;
                j21.q.a(strO, strA, aVarB, imageUrl, zContains, true, aVar4, (e23.a) objQ2, 0.0f, r24, 196608, 256);
                eVar2 = eVar;
                i16 = i17;
                r16 = r24;
                r15 = r17;
            }
            ?? r18 = i16;
            ?? r19 = r16;
            r19.g0(r18);
            ?? r110 = l72.p2.f111205a;
            String strG = tn.k.g(gl1.y.Q(r19, R.string.calories_edit_button), Marker.ANY_MARKER);
            z15 = z14;
            z3.e eVarC = z3.f.c(-2117235776, new an1.i(z15, 17), r19);
            boolean z16 = (i15 & 458752) == 131072 ? true : r18 == true ? 1 : 0;
            Object objQ3 = r19.q();
            if (z16) {
                lVar4 = lVar2;
                a40.a aVar5 = new a40.a(lVar4, 26);
                r19.K(aVar5);
                obj = aVar5;
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    lVar4 = lVar2;
                    a40.a aVar6 = new a40.a(lVar4, 26);
                    r19.K(aVar6);
                    obj = aVar6;
                } else {
                    lVar4 = lVar2;
                    obj = objQ3;
                }
            }
            r110.g(strG, null, null, null, eVarC, false, false, (e23.a) obj, r19, 24576, 238);
            r19.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            r14 = r19;
        } else {
            lVar4 = lVar2;
            z15 = z14;
            o0 o0Var = o0VarE;
            o0Var.e();
            r14 = o0Var;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(cVar, set, z15, eVar, lVar, lVar4, lVar3, i14);
        }
    }
}
