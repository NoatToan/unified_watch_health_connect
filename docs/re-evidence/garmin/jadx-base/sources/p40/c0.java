package p40;

import am.j1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import o72.h3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.y0;
import v62.c6;
import v62.i1;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135647a;

        static {
            int[] iArr = new int[t50.a.values().length];
            try {
                iArr[t50.a.RESTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t50.a.CUTOFFS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t50.a.NOTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f135647a = iArr;
        }
    }

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
    public static final void a(final boolean z14, final e23.l<? super t50.a, Unit> lVar, final e23.a<Unit> aVar, final boolean z15, final boolean z16, final boolean z17, p3.m mVar, final int i14) {
        p1 p1Var;
        boolean z18;
        p1 p1Var2;
        p1 p1Var3;
        int i15;
        String strJ;
        String strJ2;
        p3.o0 o0VarP = androidx.room.a0.p(lVar, aVar, mVar, 844180343);
        p3.c<?> cVar = o0VarP.f135177b;
        int i16 = i14 | (o0VarP.h(z14) ? 4 : 2) | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128) | (o0VarP.h(z15) ? 2048 : 1024) | (o0VarP.h(z16) ? 16384 : 8192) | (o0VarP.h(z17) ? 131072 : 65536);
        if (o0VarP.n(i16 & 1, (i16 & 74899) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarP.K(objQ);
            }
            p1 p1Var4 = (p1) objQ;
            Object objQ2 = o0VarP.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarP.K(objQ2);
            }
            final p1 p1Var5 = (p1) objQ2;
            Object objQ3 = o0VarP.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(t50.a.NOTES);
                o0VarP.K(objQ3);
            }
            final p1 p1Var6 = (p1) objQ3;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarF = x2.f(c2.l.z(aVar2, eVar.f97920e, f14), 1.0f);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarP, 48);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarP);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar3);
            } else {
                o0VarP.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarP);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarP);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarP.T || !p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarP);
            u2 u2Var = u2.f22900a;
            h4.g.a aVar4 = h4.d.a.f81536n;
            c2.j.k kVar = c2.j.f22694d;
            c2.z zVarA = c2.y.a(kVar, aVar4, o0VarP, 48);
            int iHashCode2 = Long.hashCode(o0VarP.U);
            i2 i2VarA1 = o0VarP.a0();
            h4.r rVarC2 = h4.k.c(aVar2, o0VarP);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar3);
            } else {
                o0VarP.c();
            }
            b4.c(eVar2, zVarA, o0VarP);
            b4.c(c1623g, i2VarA1, o0VarP);
            if (o0VarP.T || !p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarP, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarP);
            c2.b0 b0Var = c2.b0.f22601a;
            s62.a.f157643a.getClass();
            t62.b bVar4 = t62.b.f162798a;
            u4.d dVarA = i1.a(bVar4);
            float f15 = 36;
            g6.f.a aVar5 = g6.f.f75994b;
            h4.r rVarD = u1.w.d(b0Var.b(x2.q(aVar2, f15), aVar4), false, null, null, aVar, 15);
            o4.e0.a aVar6 = o4.e0.f128843b;
            y0.b(dVarA, "", rVarD, o4.e0.a.a(aVar6, d92.b.a(o0VarP).f().a()), o0VarP, 48, 56);
            o0VarP.g0(true);
            h4.g.a aVar7 = h4.d.a.f81537o;
            h4.r rVarF2 = x2.f(aVar2, 0.9f);
            c2.z zVarA2 = c2.y.a(kVar, aVar7, o0VarP, 48);
            int iHashCode3 = Long.hashCode(o0VarP.U);
            i2 i2VarA2 = o0VarP.a0();
            h4.r rVarC3 = h4.k.c(rVarF2, o0VarP);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar3);
            } else {
                o0VarP.c();
            }
            b4.c(eVar2, zVarA2, o0VarP);
            b4.c(c1623g, i2VarA2, o0VarP);
            if (o0VarP.T || !p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarP, iHashCode3, bVar3);
            }
            b4.c(fVar, rVarC3, o0VarP);
            String strQ = gl1.y.Q(o0VarP, R.string.lbl_course_points);
            d92.b.f58624b.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarP), o0VarP, 0, 0, 131070);
            o0VarP = o0VarP;
            o0VarP.g0(true);
            h4.g.a aVar8 = h4.d.a.f81538p;
            c2.z zVarA3 = c2.y.a(kVar, aVar8, o0VarP, 48);
            int iHashCode4 = Long.hashCode(o0VarP.U);
            i2 i2VarA3 = o0VarP.a0();
            h4.r rVarC4 = h4.k.c(aVar2, o0VarP);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar3);
            } else {
                o0VarP.c();
            }
            b4.c(eVar2, zVarA3, o0VarP);
            b4.c(c1623g, i2VarA3, o0VarP);
            if (o0VarP.T || !p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode4))) {
                v.h.A(iHashCode4, o0VarP, iHashCode4, bVar3);
            }
            b4.c(fVar, rVarC4, o0VarP);
            o0VarP.C(-201939484);
            if ((z15 || z16 || z17) && z14) {
                u4.d dVarA2 = c6.a(bVar4);
                h4.r rVarB = b0Var.b(x2.q(aVar2, f15), aVar8);
                Object objQ4 = o0VarP.q();
                if (objQ4 == c2565a) {
                    p1Var = p1Var4;
                    objQ4 = new om0.h(p1Var, 25);
                    o0VarP.K(objQ4);
                } else {
                    p1Var = p1Var4;
                }
                y0.b(dVarA2, "", u1.w.d(rVarB, false, null, null, (e23.a) objQ4, 15), o4.e0.a.a(aVar6, d92.b.a(o0VarP).f().a()), o0VarP, 48, 56);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarP.C(-201425133);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    long jG = d92.b.a(o0VarP).c().g();
                    Object objQ5 = o0VarP.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new om0.h(p1Var, 26);
                        o0VarP.K(objQ5);
                    }
                    e23.a aVar9 = (e23.a) objQ5;
                    p1Var3 = p1Var6;
                    p1Var2 = p1Var5;
                    z18 = true;
                    i3.u.a(zBooleanValue, aVar9, null, 0L, null, null, null, jG, 0.0f, 0.0f, z3.f.c(-888291506, new e23.q() { // from class: p40.a0
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((c2.a0) obj).getClass();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x1 x1Var2 = p3.n.f135158a;
                                boolean z19 = z15;
                                p1 p1Var7 = p1Var6;
                                p1 p1Var8 = p1Var5;
                                p3.m.a aVar10 = p3.m.f135153a;
                                if (z19) {
                                    mVar2.C(-1798684355);
                                    d.f135648a.getClass();
                                    z3.e eVar3 = d.f135649b;
                                    Object objQ6 = mVar2.q();
                                    aVar10.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new j1(p1Var7, p1Var8, 27);
                                        mVar2.K(objQ6);
                                    }
                                    i3.u.b(eVar3, (e23.a) objQ6, null, null, null, false, null, null, mVar2, 54, 508);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1798077964);
                                    mVar2.f();
                                }
                                if (z16) {
                                    mVar2.C(-1798016615);
                                    d.f135648a.getClass();
                                    z3.e eVar4 = d.f135650c;
                                    Object objQ7 = mVar2.q();
                                    aVar10.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new j1(p1Var7, p1Var8, 28);
                                        mVar2.K(objQ7);
                                    }
                                    i3.u.b(eVar4, (e23.a) objQ7, null, null, null, false, null, null, mVar2, 54, 508);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1797406380);
                                    mVar2.f();
                                }
                                if (z17) {
                                    mVar2.C(-1797347139);
                                    d.f135648a.getClass();
                                    z3.e eVar5 = d.f135651d;
                                    Object objQ8 = mVar2.q();
                                    aVar10.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new j1(p1Var7, p1Var8, 26);
                                        mVar2.K(objQ8);
                                    }
                                    i3.u.b(eVar5, (e23.a) objQ8, null, null, null, false, null, null, mVar2, 54, 508);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1796740748);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarP), o0VarP, 48, 48, 1916);
                    o0VarP = o0VarP;
                    o0VarP.g0(false);
                } else {
                    z18 = true;
                    p1Var2 = p1Var5;
                    p1Var3 = p1Var6;
                    o0VarP.C(-199187491);
                    o0VarP.g0(false);
                }
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0VarP.C(-199087237);
                    t50.a aVar10 = (t50.a) p1Var3.getF182175a();
                    int[] iArr = a.f135647a;
                    int i17 = iArr[aVar10.ordinal()];
                    if (i17 != z18) {
                        i15 = 2;
                        if (i17 == 2) {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarP, -6416476, R.string.course_planner_delete_all_cutoffs, o0VarP, false);
                        } else {
                            if (i17 != 3) {
                                throw kg.f.h(o0VarP, -6422634, false);
                            }
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarP, -6412670, R.string.course_planner_delete_all_notes, o0VarP, false);
                        }
                    } else {
                        i15 = 2;
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarP, -6420286, R.string.course_planner_delete_all_rests, o0VarP, false);
                    }
                    int i18 = iArr[((t50.a) p1Var3.getF182175a()).ordinal()];
                    if (i18 == z18) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarP, -6406455, R.string.course_planner_delete_all_rests_prompt, o0VarP, false);
                    } else if (i18 == i15) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarP, -6402421, R.string.course_planner_delete_all_cutoffs_prompt, o0VarP, false);
                    } else {
                        if (i18 != 3) {
                            throw kg.f.h(o0VarP, -6408789, false);
                        }
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarP, -6398391, R.string.course_planner_delete_all_notes_prompt, o0VarP, false);
                    }
                    String str = strJ;
                    g82.c cVar2 = g82.c.f76436a;
                    String strQ2 = gl1.y.Q(o0VarP, R.string.lbl_delete);
                    String strQ3 = gl1.y.Q(o0VarP, R.string.lbl_cancel);
                    z3.e eVarC = z3.f.c(1531625816, new h3(strJ2, 5), o0VarP);
                    Object[] objArr = (i16 & 112) == 32 ? z18 ? 1 : 0 : null;
                    Object objQ6 = o0VarP.q();
                    if (objArr != null || objQ6 == c2565a) {
                        objQ6 = new lm0.o(lVar, p1Var3, p1Var2, z18 ? 1 : 0);
                        o0VarP.K(objQ6);
                    }
                    e23.a<Unit> aVar11 = (e23.a) objQ6;
                    Object objQ7 = o0VarP.q();
                    if (objQ7 == c2565a) {
                        objQ7 = new om0.h(p1Var2, 27);
                        o0VarP.K(objQ7);
                    }
                    e23.a<Unit> aVar12 = (e23.a) objQ7;
                    Object objQ8 = o0VarP.q();
                    if (objQ8 == c2565a) {
                        objQ8 = new om0.h(p1Var2, 28);
                        o0VarP.K(objQ8);
                    }
                    cVar2.b(null, str, eVarC, strQ2, aVar11, strQ3, aVar12, false, (e23.a) objQ8, o0VarP, 102236544, 129);
                    o0VarP.g0(false);
                } else {
                    o0VarP.C(-197240195);
                    o0VarP.g0(false);
                }
                o0VarP.g0(false);
            } else {
                o0VarP.g0(false);
                z18 = true;
            }
            o0VarP.g0(z18);
            o0VarP.g0(z18);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(z14, lVar, aVar, z15, z16, z17, i14) { // from class: p40.b0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f135636a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e23.l f135637b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ e23.a f135638c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f135639d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f135640e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f135641f;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(1);
                    c0.a(this.f135636a, this.f135637b, this.f135638c, this.f135639d, this.f135640e, this.f135641f, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }
}
