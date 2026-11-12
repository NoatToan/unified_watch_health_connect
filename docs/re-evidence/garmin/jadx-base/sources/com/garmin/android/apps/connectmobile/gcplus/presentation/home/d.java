package com.garmin.android.apps.connectmobile.gcplus.presentation.home;

import a03.t0;
import ak0.u;
import ak0.v;
import ak0.w;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import g02.p1;
import g02.t;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import l72.c1;
import l72.r1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements l<bk0.f, Unit> {
        public a(Object obj) {
            super(1, obj, v.class, "navigateToFeatureEducationScreen", "navigateToFeatureEducationScreen(Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/features/GCPlusFeatureEducationData;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(bk0.f fVar) {
            bk0.f fVar2 = fVar;
            fVar2.getClass();
            ((v) this.receiver).d(fVar2);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35406a;

        static {
            int[] iArr = new int[zx2.a.values().length];
            try {
                iArr[zx2.a.YEARLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zx2.a.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zx2.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35406a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    public static final void a(e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1149993200);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.title_activation_in_progress);
            String strQ2 = y.Q(o0VarE, R.string.msg_manage_subscription_when_activation_is_complete);
            String strQ3 = y.Q(o0VarE, R.string.lbl_ok);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new defpackage.c(aVar, 8);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new defpackage.c(aVar, 8);
                    o0VarE.K(objQ);
                }
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ, null, null, o0VarE, 0, 0, 1753);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.g(aVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    public static final void b(c.i.EnumC0614c enumC0614c, v vVar, u uVar, bk0.d dVar, m mVar, int i14) {
        enumC0614c.getClass();
        uVar.getClass();
        dVar.getClass();
        o0 o0VarE = mVar.E(1398301354);
        int i15 = i14 | (o0VarE.k(enumC0614c.ordinal()) ? 4 : 2) | (o0VarE.B(vVar) ? 32 : 16) | (o0VarE.r(uVar) ? 256 : 128) | (o0VarE.r(dVar) ? 2048 : 1024);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            i53.f fVarA = i53.a.a(new p1(y.Q(o0VarE, R.string.whats_included), null, null, 6, null), new p1(y.Q(o0VarE, R.string.lbl_settings), null, null, 6, null));
            int iOrdinal = enumC0614c.ordinal();
            boolean zR = o0VarE.r(fVarA);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new w(fVarA, 0);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new w(fVarA, 0);
                    o0VarE.K(objQ);
                }
            }
            h2.b bVarB = h2.o0.b(iOrdinal, (e23.a) objQ, o0VarE, 0, 2);
            r.a aVar2 = r.S;
            r rVarD = x2.d(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarD, o0VarE);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            t.a(bVarB, (o53.b0) objQ2, fVarA, null, o0VarE, 0, 8);
            h2.u.a(bVarB, x2.d(aVar2, 1.0f), null, null, 0, 0.0f, h4.d.a.f81533k, null, false, null, null, null, null, z3.f.c(-1490468461, new aa2.r(dVar, i16, vVar, uVar), o0VarE), o0VarE, 1572912, 24576, 16316);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.l(enumC0614c, vVar, uVar, dVar, i14, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v19 */
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
    public static final void c(final v vVar, u uVar, m mVar, int i14) {
        o0 o0Var;
        int i15;
        int i16;
        l72.p2 p2Var;
        ?? r14;
        uVar.getClass();
        o0 o0VarE = mVar.E(-1868063098);
        int i17 = i14 | (o0VarE.B(vVar) ? 4 : 2) | (o0VarE.r(uVar) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            Object obj = m.a.f135155b;
            if (objQ == obj) {
                objQ = new ak0.t(2);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r.a aVar = r.S;
            r rVarD = c2.l.D(x2.f(a2.b(aVar, a2.a(o0VarE), true), 1.0f));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarD, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d(uVar, o0VarE, (i17 >> 3) & 14);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97917b;
            float f16 = eVar.f97920e;
            c2.l.f(x2.h(aVar, f14), o0VarE);
            l72.p2 p2Var2 = l72.p2.f111205a;
            String strQ = y.Q(o0VarE, R.string.manage_subscription);
            Object objQ2 = o0VarE.q();
            if (objQ2 == obj) {
                objQ2 = new a81.m(23);
                o0VarE.K(objQ2);
            }
            r rVarC2 = p5.v.c((l) objQ2, aVar, false);
            p pVarC = z3.f.c(-854731193, new ak0.y(uVar, 1), o0VarE);
            int i18 = i17 & 14;
            boolean zR = o0VarE.r(uVar) | o0VarE.B(p1Var) | (i18 == 4);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == obj) {
                i15 = 1;
                objQ3 = new ak0.m(uVar, i15, vVar, p1Var);
                o0VarE.K(objQ3);
            } else {
                i15 = 1;
            }
            p2Var2.g(strQ, rVarC2, null, null, pVarC, false, false, (e23.a) objQ3, o0VarE, 24576, 236);
            tn.k.n(bVar2, aVar, f15, o0VarE);
            String strQ2 = y.Q(o0VarE, R.string.msg_learn_about_garmin_connect_plus_and_manage);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            bVar2.getClass();
            bVar2.getClass();
            r rVarZ = c2.l.z(aVar, f16, f15);
            Object objQ4 = o0VarE.q();
            if (objQ4 == obj) {
                objQ4 = new a81.m(17);
                o0VarE.K(objQ4);
            }
            final int i19 = 0;
            mh.c(strQ2, p5.v.c((l) objQ4, rVarZ, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0 o0Var2 = o0VarE;
            bVar2.getClass();
            c2.l.f(x2.h(aVar, eVar.f97921f), o0Var2);
            if (uVar.f3684f != null) {
                o0Var2.C(-408436845);
                String strQ3 = y.Q(o0Var2, R.string.exclusive_offers);
                boolean z14 = i18 == 4;
                Object objQ5 = o0Var2.q();
                if (z14 || objQ5 == obj) {
                    objQ5 = new e23.a() { // from class: ak0.x
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    vVar.e();
                                    break;
                                case 1:
                                    vVar.a();
                                    break;
                                default:
                                    vVar.b();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(objQ5);
                }
                i16 = i18;
                l72.p2 p2Var3 = p2Var2;
                p2Var3.g(strQ3, null, null, null, null, false, false, (e23.a) objQ5, o0Var2, 0, 254);
                bVar2.getClass();
                c2.l.f(x2.h(aVar, f16), o0Var2);
                o0Var2.g0(false);
                p2Var = p2Var3;
            } else {
                i16 = i18;
                p2Var = p2Var2;
                o0Var2.C(-408172570);
                o0Var2.g0(false);
            }
            String strQ4 = y.Q(o0Var2, R.string.feature_settings);
            Object objQ6 = o0Var2.q();
            if (objQ6 == obj) {
                objQ6 = new a81.m(18);
                o0Var2.K(objQ6);
            }
            r rVarC3 = p5.v.c((l) objQ6, aVar, false);
            int i24 = i16;
            boolean z15 = i24 == 4;
            Object objQ7 = o0Var2.q();
            if (z15 || objQ7 == obj) {
                final int i25 = 1;
                objQ7 = new e23.a() { // from class: ak0.x
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i25) {
                            case 0:
                                vVar.e();
                                break;
                            case 1:
                                vVar.a();
                                break;
                            default:
                                vVar.b();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0Var2.K(objQ7);
            }
            p2Var.g(strQ4, rVarC3, null, null, null, false, false, (e23.a) objQ7, o0Var2, 0, 252);
            l72.p2 p2Var4 = p2Var;
            tn.k.n(bVar2, aVar, f16, o0Var2);
            String strQ5 = y.Q(o0Var2, R.string.concept_notifications);
            Object objQ8 = o0Var2.q();
            if (objQ8 == obj) {
                objQ8 = new a81.m(19);
                o0Var2.K(objQ8);
            }
            r rVarC4 = p5.v.c((l) objQ8, aVar, false);
            boolean z16 = i24 == 4;
            Object objQ9 = o0Var2.q();
            if (z16 || objQ9 == obj) {
                final int i26 = 2;
                objQ9 = new e23.a() { // from class: ak0.x
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i26) {
                            case 0:
                                vVar.e();
                                break;
                            case 1:
                                vVar.a();
                                break;
                            default:
                                vVar.b();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0Var2.K(objQ9);
            }
            p2Var4.g(strQ5, rVarC4, null, null, null, false, false, (e23.a) objQ9, o0Var2, 0, 252);
            tn.k.n(bVar2, aVar, f16, o0Var2);
            String strQ6 = y.Q(o0Var2, R.string.help_provide_feedback);
            Object objQ10 = o0Var2.q();
            if (objQ10 == obj) {
                objQ10 = new a81.m(22);
                o0Var2.K(objQ10);
            }
            r rVarC5 = p5.v.c((l) objQ10, aVar, false);
            boolean zR2 = o0Var2.r(context);
            Object objQ11 = o0Var2.q();
            if (zR2 || objQ11 == obj) {
                objQ11 = new a42.d(context, 5);
                o0Var2.K(objQ11);
            }
            p2Var4.g(strQ6, rVarC5, null, null, null, false, false, (e23.a) objQ11, o0Var2, 0, 252);
            o0Var2.g0(true);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var2.C(-1572509133);
                boolean zB = o0Var2.B(p1Var);
                Object objQ12 = o0Var2.q();
                if (zB || objQ12 == obj) {
                    r14 = 0;
                    objQ12 = new ak0.z(p1Var, 0);
                    o0Var2.K(objQ12);
                } else {
                    r14 = 0;
                }
                a((e23.a) objQ12, o0Var2, r14);
                o0Var2.g0(r14);
                o0Var = o0Var2;
            } else {
                o0Var2.C(-1572408228);
                o0Var2.g0(false);
                o0Var = o0Var2;
            }
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(vVar, uVar, i14, 7);
        }
    }

    public static final void d(u uVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-44225097);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(uVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("testTag", "your_plan_header");
            b92.a aVarB = c0235a.b();
            String strQ = y.Q(o0VarE, R.string.your_plan);
            z3.e eVarC = z3.f.c(-2034941741, new ak0.y(uVar, i16), o0VarE);
            int i17 = b92.a.f16960b;
            r1.a(strQ, aVarB, eVarC, o0VarE, 384);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.k(uVar, i14, 1);
        }
    }
}
