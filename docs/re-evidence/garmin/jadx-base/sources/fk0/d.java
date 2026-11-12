package fk0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.k1;
import com.google.maps.android.compose.u;
import e11.f0;
import e23.p;
import h4.k;
import h5.e0;
import h5.g;
import i3.fe;
import l72.c1;
import l72.d3;
import l72.r1;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.a2;
import v13.e;
import v13.i;
import vb.h;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.settings.GCPlusFeatureSettingsScreenKt$GCPlusFeatureSettingsScreen$1$1$1", f = "GCPlusFeatureSettingsScreen.kt", l = {70}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f71932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f71933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f71934c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f71933b = feVar;
            this.f71934c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f71933b, this.f71934c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f71932a;
            if (i14 == 0) {
                r.b(obj);
                this.f71932a = 1;
                if (d3.c(this.f71933b, this.f71934c, null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:78:0x0218  */
    /* JADX WARN: Code duplicated, block: B:79:0x023b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0252  */
    /* JADX WARN: Code duplicated, block: B:83:0x0285  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0328  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar, fe feVar, ak0.a aVar, ub1.i iVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        g3 g3Var;
        boolean z14;
        String strJ;
        k1 k1Var;
        boolean z15;
        Object objQ;
        Object objQ2;
        eVar.getClass();
        feVar.getClass();
        aVar.getClass();
        iVar.getClass();
        o0 o0VarE = mVar.E(-745738167);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(feVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(iVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            g3 g3Var2 = (g3) p0.c(eVar.f35425t, o0VarE, 0).getF182175a();
            g3 g3Var3 = (g3) p0.c(eVar.f35427w, o0VarE, 0).getF182175a();
            g3 g3Var4 = (g3) p0.c(eVar.f35429y, o0VarE, 0).getF182175a();
            Object objQ3 = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var = (p1) objQ3;
            h4.r rVarD = l.D(x2.f(a2.b(h4.r.S, a2.a(o0VarE), true), 1.0f));
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarD, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            int i16 = i15;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zG = s.g(g3Var2.f35301b, Boolean.TRUE);
            fw.p pVar = g3Var2.f35300a;
            fw.p pVar2 = fw.p.ERROR;
            if (pVar != pVar2) {
                g3Var = g3Var3;
                if (g3Var.f35300a != pVar2 && g3Var4.f35300a != pVar2) {
                    o0VarE.C(-1506699409);
                    o0VarE.g0(false);
                    z14 = false;
                }
                if (((a80.a) KoinJavaComponent.get$default(a80.a.class, null, null, 6, null)).a()) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1506611183, R.string.lbl_beta, o0VarE, z14);
                } else {
                    o0VarE.C(-1506544781);
                    o0VarE.g0(z14);
                    strJ = null;
                }
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                c0235a.f16962a.put("testTag", "active_intelligence_header");
                b92.a aVarB = c0235a.b();
                String strQ = gl1.y.Q(o0VarE, R.string.active_intelligence);
                z3.e eVarC = f.c(-33573350, new bt1.m(zG, g3Var2, eVar, context, iVar, 10), o0VarE);
                int i17 = b92.a.f16960b;
                o0Var = o0VarE;
                ub1.f.b(strQ, strJ, aVarB, eVarC, o0Var, 3072);
                bv.b.f21239a.getClass();
                bv.b.a();
                k1Var = k1.f37122a;
                int i18 = 14;
                if (k1Var.w0()) {
                    o0Var.C(-1504484521);
                    r1.b(gl1.y.Q(o0Var, R.string.lbl_nutrition), f.c(274468550, new f0(g3Var4, 14, aVar, context), o0Var), o0Var, 48, 0);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1504000177);
                    o0Var.g0(false);
                }
                bv.b.a();
                if (k1Var.r0()) {
                    o0Var.C(-1503869016);
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    c0235a2.f16962a.put("testTag", "live_track_header");
                    r1.a(gl1.y.Q(o0Var, R.string.title_live_track), c0235a2.b(), f.c(-917981948, new f0(aVar, 15, context, p1Var), o0Var), o0Var, 384);
                    z15 = false;
                    o0Var.g0(false);
                } else {
                    z15 = false;
                    o0Var.C(-1503001233);
                    o0Var.g0(false);
                }
                b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                c0235a3.f16962a.put("testTag", "badges_header");
                r1.a(gl1.y.Q(o0Var, R.string.concept_badges), c0235a3.b(), f.c(-2038174857, new ew1.r1(i18, g3Var, eVar), o0Var), o0Var, 384);
                o0Var.g0(true);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0Var.C(1586636065);
                    c1 c1Var = c1.f110940a;
                    String strQ2 = gl1.y.Q(o0Var, R.string.lbl_settings_disabled);
                    String strQ3 = gl1.y.Q(o0Var, R.string.msg_livetrack_disabled_during_active_session);
                    String strQ4 = gl1.y.Q(o0Var, R.string.lbl_ok);
                    objQ = o0Var.q();
                    if (objQ == c2565a) {
                        objQ = new et1.a2(p1Var, 15);
                        o0Var.K(objQ);
                    }
                    e23.a<Unit> aVar3 = (e23.a) objQ;
                    objQ2 = o0Var.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new et1.a2(p1Var, 16);
                        o0Var.K(objQ2);
                    }
                    c1Var.a(true, strQ2, strQ3, null, null, strQ4, false, false, aVar3, null, (e23.a) objQ2, o0Var, 100663302, 6, 728);
                    o0Var.g0(z15);
                } else {
                    o0Var.C(1587120409);
                    o0Var.g0(z15);
                }
            } else {
                g3Var = g3Var3;
            }
            o0VarE.C(-1506943503);
            String strQ5 = gl1.y.Q(o0VarE, R.string.txt_error_occurred);
            boolean zB = ((i16 & 112) == 32) | o0VarE.B(strQ5);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new a(feVar, strQ5, null);
                o0VarE.K(objQ4);
            }
            g3.a aVar4 = g3.f35298f;
            l0.g(g3Var2, g3Var, g3Var4, (p) objQ4, o0VarE);
            z14 = false;
            o0VarE.g0(false);
            if (((a80.a) KoinJavaComponent.get$default(a80.a.class, null, null, 6, null)).a()) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1506611183, R.string.lbl_beta, o0VarE, z14);
            } else {
                o0VarE.C(-1506544781);
                o0VarE.g0(z14);
                strJ = null;
            }
            b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
            c0235a4.f16962a.put("testTag", "active_intelligence_header");
            b92.a aVarB2 = c0235a4.b();
            String strQ6 = gl1.y.Q(o0VarE, R.string.active_intelligence);
            z3.e eVarC2 = f.c(-33573350, new bt1.m(zG, g3Var2, eVar, context, iVar, 10), o0VarE);
            int i19 = b92.a.f16960b;
            o0Var = o0VarE;
            ub1.f.b(strQ6, strJ, aVarB2, eVarC2, o0Var, 3072);
            bv.b.f21239a.getClass();
            bv.b.a();
            k1Var = k1.f37122a;
            int i110 = 14;
            if (k1Var.w0()) {
                o0Var.C(-1504484521);
                r1.b(gl1.y.Q(o0Var, R.string.lbl_nutrition), f.c(274468550, new f0(g3Var4, 14, aVar, context), o0Var), o0Var, 48, 0);
                o0Var.g0(false);
            } else {
                o0Var.C(-1504000177);
                o0Var.g0(false);
            }
            bv.b.a();
            if (k1Var.r0()) {
                o0Var.C(-1503869016);
                b92.a.C0235a c0235a5 = new b92.a.C0235a(null, 1, null);
                c0235a5.f16962a.put("testTag", "live_track_header");
                r1.a(gl1.y.Q(o0Var, R.string.title_live_track), c0235a5.b(), f.c(-917981948, new f0(aVar, 15, context, p1Var), o0Var), o0Var, 384);
                z15 = false;
                o0Var.g0(false);
            } else {
                z15 = false;
                o0Var.C(-1503001233);
                o0Var.g0(false);
            }
            b92.a.C0235a c0235a6 = new b92.a.C0235a(null, 1, null);
            c0235a6.f16962a.put("testTag", "badges_header");
            r1.a(gl1.y.Q(o0Var, R.string.concept_badges), c0235a6.b(), f.c(-2038174857, new ew1.r1(i110, g3Var, eVar), o0Var), o0Var, 384);
            o0Var.g0(true);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(1586636065);
                c1 c1Var2 = c1.f110940a;
                String strQ7 = gl1.y.Q(o0Var, R.string.lbl_settings_disabled);
                String strQ8 = gl1.y.Q(o0Var, R.string.msg_livetrack_disabled_during_active_session);
                String strQ9 = gl1.y.Q(o0Var, R.string.lbl_ok);
                objQ = o0Var.q();
                if (objQ == c2565a) {
                    objQ = new et1.a2(p1Var, 15);
                    o0Var.K(objQ);
                }
                e23.a<Unit> aVar5 = (e23.a) objQ;
                objQ2 = o0Var.q();
                if (objQ2 == c2565a) {
                    objQ2 = new et1.a2(p1Var, 16);
                    o0Var.K(objQ2);
                }
                c1Var2.a(true, strQ7, strQ8, null, null, strQ9, false, false, aVar5, null, (e23.a) objQ2, o0Var, 100663302, 6, 728);
                o0Var.g0(z15);
            } else {
                o0Var.C(1587120409);
                o0Var.g0(z15);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(eVar, feVar, aVar, iVar, i14, 22);
        }
    }
}
