package ky0;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.ba;
import i3.eh;
import i3.i7;
import i3.mc;
import i3.mh;
import i3.sg;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import v62.b3;
import z2.t2;

/* JADX INFO: loaded from: classes9.dex */
public final class r {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.EditNameAndNotesBottomSheetKt$InputField$1$1", f = "EditNameAndNotesBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f107470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f107471b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, m4.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f107470a = z14;
            this.f107471b = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f107470a, this.f107471b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f107470a) {
                m4.b0.a(this.f107471b);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mc mcVar, o53.b0 b0Var, f fVar, String str, String str2, e23.p pVar, p3.m mVar, int i14) {
        o53.b0 b0Var2;
        p3.p1 p1Var;
        p3.p1 p1Var2;
        mc mcVar2 = mcVar;
        b0Var.getClass();
        pVar.getClass();
        p3.o0 o0VarE = mVar.E(585364071);
        int i15 = i14 | (o0VarE.B(mcVar2) ? 4 : 2) | (o0VarE.r(b0Var) ? 32 : 16) | (o0VarE.k(fVar == null ? -1 : fVar.ordinal()) ? 256 : 128) | (o0VarE.B(str) ? 2048 : 1024) | (o0VarE.B(str2) ? 16384 : 8192) | (o0VarE.r(pVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var3 = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(str2);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var4 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(str);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var5 = (p3.p1) objQ3;
            boolean z14 = (str2.equals((String) p1Var4.getF182175a()) && str.equals((String) p1Var5.getF182175a())) ? false : true;
            l72.w wVar = l72.w.f111301a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_edit_name_notes);
            z3.e eVarC = z3.f.c(92385566, new g(z14, b0Var, pVar, mcVar2, p1Var4, p1Var5, 0), o0VarE);
            int i16 = i15 & 14;
            boolean zH = o0VarE.h(z14) | o0VarE.r(b0Var) | (i16 == 4);
            Object objQ4 = o0VarE.q();
            if (zH || objQ4 == c2565a) {
                p1Var = p1Var3;
                l lVar = new l(z14, b0Var, p1Var, mcVar, 0);
                o0VarE.K(lVar);
                objQ4 = lVar;
            } else {
                p1Var = p1Var3;
            }
            b0Var2 = b0Var;
            p3.p1 p1Var6 = p1Var;
            mcVar2 = mcVar;
            wVar.d(strQ, eVarC, (e23.a) objQ4, mcVar2, null, null, z3.f.c(995580457, new i(fVar, p1Var4, p1Var5, 1), o0VarE), o0VarE, ((i15 << 9) & 7168) | 1572912, 48);
            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                o0VarE.C(1017698200);
                boolean zR = o0VarE.r(b0Var2) | (i16 == 4);
                Object objQ5 = o0VarE.q();
                if (zR || objQ5 == c2565a) {
                    p1Var2 = p1Var6;
                    objQ5 = new fo.j(b0Var2, p1Var2, mcVar2, 1);
                    o0VarE.K(objQ5);
                } else {
                    p1Var2 = p1Var6;
                }
                e23.a aVar = (e23.a) objQ5;
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new kb0.k(p1Var2, 19);
                    o0VarE.K(objQ6);
                }
                b(aVar, (e23.a) objQ6, o0VarE, 48);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1017947099);
                o0VarE.g0(false);
            }
        } else {
            b0Var2 = b0Var;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.j(mcVar2, b0Var2, fVar, str, str2, pVar, i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    public static final void b(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-2044956613);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.title_exit_without_saving);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_exit);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z14) {
                objQ = new ku1.a(aVar, 7);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ku1.a(aVar, 7);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar4 = (e23.a) objQ;
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new ku1.a(aVar2, 8);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            c1Var.a(false, strQ, null, null, null, strQ2, false, false, aVar4, strQ3, (e23.a) objQ2, o0Var, 0, 0, 221);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(String str, boolean z14, s5.x0 x0Var, int i14, String str2, s5.x0 x0Var2, long j8, int i15, e23.l<? super String, Unit> lVar, p3.m mVar, int i16, int i17) {
        int i18;
        s5.x0 x0Var3;
        int i19;
        e23.l<? super String, Unit> lVar2;
        p3.o0 o0Var;
        String str3;
        long j14;
        s5.x0 x0Var4;
        String str4;
        long j15;
        int i24;
        e23.l<? super String, Unit> lVar3;
        u4.d dVarA;
        p3.o0 o0VarE = mVar.E(-1148699261);
        p3.c<?> cVar = o0VarE.f135177b;
        int i25 = i16 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(x0Var) ? 256 : 128);
        int i26 = i17 & 16;
        if (i26 != 0) {
            i18 = i25 | 24576;
        } else {
            i18 = i25 | (o0VarE.B(str2) ? 16384 : 8192);
        }
        int i27 = i17 & 32;
        if (i27 != 0) {
            i19 = i18 | 196608;
            x0Var3 = x0Var2;
        } else {
            x0Var3 = x0Var2;
            i19 = i18 | (o0VarE.B(x0Var3) ? 131072 : 65536);
        }
        long jC = j8;
        int i28 = i19 | (((i17 & 64) == 0 && o0VarE.l(jC)) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i28 & 1, (i28 & 38347923) != 38347922)) {
            o0VarE.G0();
            if ((i16 & 1) == 0 || o0VarE.o0()) {
                str4 = i26 != 0 ? "" : str2;
                if (i27 != 0) {
                    x0Var3 = null;
                }
                if ((i17 & 64) != 0) {
                    jC = am.j.c(d92.b.f58623a, o0VarE);
                    i28 &= -3670017;
                }
            } else {
                o0VarE.e();
                if ((i17 & 64) != 0) {
                    i28 &= -3670017;
                }
                str4 = str2;
            }
            int i29 = i28;
            s5.x0 x0Var5 = x0Var3;
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n(z14, o0VarE);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ2;
            m4.q qVar = (m4.q) o0VarE.A(kotlin.t1.f91491i);
            Boolean boolValueOf = Boolean.valueOf(z14);
            boolean z15 = (i29 & 112) == 32;
            Object objQ3 = o0VarE.q();
            if (z15 || objQ3 == c2565a) {
                objQ3 = new a(z14, b0Var, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, boolValueOf, o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-93371157);
                d92.b.f58623a.getClass();
                long jE = d92.b.a(o0VarE).c().e();
                o0VarE.g0(false);
                j15 = jE;
            } else {
                o0VarE.C(-93370698);
                o0VarE.g0(false);
                j15 = jC;
            }
            h4.r rVarE = u1.n.e(rVarF, j15, o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            long j16 = jC;
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            c2.b0 b0Var2 = c2.b0.f22601a;
            h4.r rVarF2 = x2.f(aVar, 1.0f);
            String str5 = str4;
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarF2, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            h4.r rVarA = u2.f22900a.a(aVar, 1.0f, true);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new k(p1Var, 2);
                o0VarE.K(objQ4);
            }
            h4.r rVarA2 = m4.e.a(m4.e.c(rVarA, (e23.l) objQ4), b0Var);
            s5.x0 x0Var6 = (((Boolean) p1Var.getF182175a()).booleanValue() || x0Var5 == null) ? x0Var : x0Var5;
            x5.v.f188954b.getClass();
            p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, x5.v.f188955c, i15, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
            boolean zR = o0VarE.r(qVar);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new b82.k0(qVar, 4);
                o0VarE.K(objQ5);
            }
            p006l2.z1 z1Var = new p006l2.z1((e23.l) objQ5, null, null, null, null, null, 62, null);
            ba baVar = ba.f87580a;
            o4.d0.f128823b.getClass();
            long j17 = o4.d0.f128831j;
            d92.b.f58623a.getClass();
            long jA = d92.b.a(o0VarE).k().a();
            t2 t2Var = new t2(hb.a.e(o0VarE), hb.a.e(o0VarE), null);
            baVar.getClass();
            sg sgVarC = ba.c(0L, 0L, 0L, 0L, 0L, jA, t2Var, j17, j17, 0L, 0L, j17, j17, 0L, 0L, 0L, 0L, o0VarE, 2147377919);
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                i24 = i14;
                lVar3 = lVar;
                objQ6 = new e51.g(i24, lVar3, 1);
                o0VarE.K(objQ6);
            } else {
                i24 = i14;
                lVar3 = lVar;
            }
            lVar2 = lVar3;
            int i30 = i24;
            eh.a(str, (e23.l) objQ6, rVarA2, false, x0Var6, z3.f.c(159984792, new fv1.b(str5, 13), o0VarE), null, null, null, a2Var, z1Var, false, 0, 0, null, null, sgVarC, o0VarE, (i29 & 14) | 12582912, 0, 4095832);
            o0Var = o0VarE;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                s62.a.f157643a.getClass();
                dVarA = v62.n1.a(t62.b.f162798a);
            } else {
                s62.a.f157643a.getClass();
                dVarA = b3.a(t62.b.f162798a);
            }
            u4.d dVar = dVarA;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            bVar2.getClass();
            float f15 = eVar2.f97920e;
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(aVar, 0.0f, f14, f15, eVar2.f97920e, 1);
            bVar2.getClass();
            h4.r rVarQ = x2.q(rVarC3, j92.b.f97901d.f97904c);
            Object objQ7 = o0Var.q();
            if (objQ7 == c2565a) {
                objQ7 = new m(lVar2, b0Var, p1Var, 0);
                o0Var.K(objQ7);
            }
            i7.b(dVar, gl1.y.Q(o0Var, R.string.lbl_edit), u1.w.d(rVarQ, false, null, null, (e23.a) objQ7, 15), sn.a.y(o0Var), o0Var, 0, 0);
            o0Var.g0(true);
            o0Var.g0(true);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(1402882190);
                String strD = androidx.core.view.j.d(str.length(), i30, " / ");
                d6.h.f57752b.getClass();
                int i34 = d6.h.f57758h;
                d92.b.f58624b.getClass();
                s5.x0 x0VarF = d92.c.f(j92.f.f97932i, o0Var);
                h4.r rVarF3 = x2.f(aVar, 1.0f);
                bVar2.getClass();
                float f16 = eVar2.f97920e;
                bVar2.getClass();
                float f17 = eVar2.f97917b;
                bVar2.getClass();
                mh.c(strD, c2.l.C(rVarF3, 0.0f, f17, f16, eVar2.f97920e, 1), 0L, null, 0L, null, 0L, d6.h.a(i34), 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 130044);
                o0Var.g0(false);
            } else {
                o0Var.C(1403267551);
                o0Var.g0(false);
            }
            x0Var4 = x0Var5;
            j14 = j16;
            str3 = str5;
        } else {
            lVar2 = lVar;
            o0Var = o0VarE;
            o0Var.e();
            str3 = str2;
            j14 = jC;
            x0Var4 = x0Var3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(str, z14, x0Var, i14, str3, x0Var4, j14, i15, lVar2, i16, i17, 0);
        }
    }
}
