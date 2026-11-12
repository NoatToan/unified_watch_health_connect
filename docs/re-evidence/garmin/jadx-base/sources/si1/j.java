package si1;

import android.app.Activity;
import android.content.Intent;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import i3.i7;
import i3.mh;
import l72.f0;
import mt0.e0;
import o4.d0;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import rk0.a1;
import s5.x0;
import s70.a0;
import sg0.q0;
import u1.a2;
import v62.e1;
import v62.fa;
import v62.l1;
import zd0.u1;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.r<Boolean, d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ti1.a f159388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f159389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f159390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0<String> f159391d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c.q<Intent, f.a> f159392e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ u1 f159393f;

        public a(ti1.a aVar, boolean z14, Activity activity, r0<String> r0Var, c.q<Intent, f.a> qVar, u1 u1Var) {
            this.f159388a = aVar;
            this.f159389b = z14;
            this.f159390c = activity;
            this.f159391d = r0Var;
            this.f159392e = qVar;
            this.f159393f = u1Var;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                x1 x1Var = p3.n.f135158a;
                b82.c.a(null, null, z3.f.c(-1401756531, new ck0.h(this.f159388a, this.f159389b, this.f159390c, this.f159391d, this.f159392e, this.f159393f), mVar2), 0L, mVar2, 384, 11);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.String] */
    public static final void a(ti1.a aVar, boolean z14, e23.l<? super String, Unit> lVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1613769678);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192) | (o0VarE.r(aVar4) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            r0 r0Var = new r0();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                o0VarE.K(null);
                objQ = null;
            }
            r0Var.f105810a = (String) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = (u1) KoinJavaComponent.get$default(u1.class, null, null, 6, null);
                o0VarE.K(objQ2);
            }
            u1 u1Var = (u1) objQ2;
            c.q qVarC = c.w.c(new g.h(), new e0(r0Var, aVar3, aVar2, lVar, 26), o0VarE, 0);
            h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            b82.c.c(z3.f.c(485520066, new a(aVar, z14, activity, r0Var, qVarC, u1Var), o0VarE), z3.f.c(-767172804, new ry0.g(10, aVar, aVar4), o0VarE), o0VarE, 54);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(aVar, z14, lVar, aVar2, aVar3, aVar4, i14);
        }
    }

    public static final void b(int i14, h4.r rVar, String str, p3.m mVar) {
        String str2 = str;
        o0 o0VarE = mVar.E(490539601);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81533k;
            s2 s2VarA = q2.a(c0343j, bVar, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarC2 = u2Var.c(u2Var.a(c2.l.A(aVar2, 0.0f, eVar2.f97918c, 1), 0.05f, true), h4.d.a.f81534l);
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.u uVar = c2.u.f22885a;
            bVar3.getClass();
            h4.r rVarC4 = uVar.c(x2.q(aVar2, j92.b.f97901d.f97905d), h4.d.a.f81528f);
            s62.a.f157643a.getClass();
            i7.a(u4.p.b(e1.a(t62.b.f162798a), o0VarE), null, rVarC4, hb.a.s(o0VarE), o0VarE, 56, 0);
            o0VarE.g0(true);
            bVar3.getClass();
            h4.r rVarA = c2.l.A(aVar2, eVar2.f97920e, 0.0f, 2);
            bVar3.getClass();
            h4.r rVarC5 = u2Var.c(u2Var.a(c2.l.C(rVarA, 0.0f, eVar2.f97919d, 0.0f, 0.0f, 13), 0.95f, true), bVar);
            d92.b.f58624b.getClass();
            str2 = str;
            mh.c(str2, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.g(rVar, str2, i14, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0191  */
    public static final void c(e23.a<Unit> aVar, p3.m mVar, int i14) {
        e23.a<Unit> aVar2;
        o0 o0VarE = mVar.E(1221326758);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarD = x2.d(aVar3, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarD, f14, eVar.f97922g);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f15 = eVar.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f15);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
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
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_error_occurred);
            h4.r rVarF = x2.f(aVar3, 1.0f);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            mh.c(strQ, rVarF, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 48, 0, 130044);
            String strQ2 = gl1.y.Q(o0VarE, R.string.technical_challenge_message);
            h4.r rVarF2 = x2.f(aVar3, 1.0f);
            fVar.getClass();
            mh.c(strQ2, rVarF2, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, vb.h.g(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 48, 0, 130044);
            o0VarE = o0VarE;
            f0 f0Var = f0.f110999a;
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_try_again);
            bVar.getClass();
            h4.r rVarB = b0Var.b(c2.l.C(aVar3, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), h4.d.a.f81537o);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                aVar2 = aVar;
                objQ = new q0(aVar2, 3);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    aVar2 = aVar;
                    objQ = new q0(aVar2, 3);
                    o0VarE.K(objQ);
                } else {
                    aVar2 = aVar;
                }
            }
            f0Var.d(0, 9, (e23.a) objQ, rVarB, strQ3, o0VarE, null, false);
            o0VarE.g0(true);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(aVar2, i14, 2);
        }
    }

    public static final void d(ti1.a aVar, ui1.j jVar, boolean z14, e23.l<? super String, Unit> lVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.a<Unit> aVar5, p3.m mVar, int i14) {
        o0 o0Var;
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        o0 o0VarE = mVar.E(-1754329728);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.k(jVar == null ? -1 : jVar.ordinal()) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar5) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            z02.d.a(aVar.f164575a, z3.f.c(-751172923, new a1(20, aVar, aVar4), o0VarE), null, null, null, z3.f.c(1557609929, new i(aVar, jVar, aVar5, z14, lVar, aVar2, aVar3, aVar4), o0VarE), o0Var, 196656, 28);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(aVar, jVar, z14, lVar, aVar2, aVar3, aVar4, aVar5, i14);
        }
    }

    public static final void e(h4.r rVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1235974416);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            v vVar = new v();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new se0.a(7);
                o0VarE.K(objQ);
            }
            c.q qVarC = c.w.c(vVar, (e23.l) objQ, o0VarE, 48);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97917b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            String strQ = gl1.y.Q(o0VarE, R.string.lte_activation_redirect_screen_availability_footer);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97934k;
            x0 x0VarF = d92.c.f(x0Var, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            h4.g.a aVar3 = h4.d.a.f81537o;
            mh.c(strQ, b0Var.b(aVar2, aVar3), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lte_activation_redirect_screen_availability_link);
            fVar.getClass();
            x0 x0VarA = x0.a(x0Var, d92.b.a(o0VarE).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            h4.r rVarB = b0Var.b(aVar2, aVar3);
            boolean zR = o0VarE.r(qVarC);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new ib0.n(qVarC, 3);
                o0VarE.K(objQ2);
            }
            mh.c(strQ2, u1.w.d(rVarB, false, null, null, (e23.a) objQ2, 15), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 20);
        }
    }

    public static final void f(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-593188041);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = l1.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.title_activation_in_progress);
            String strQ2 = gl1.y.Q(o0VarE, R.string.inreach_activation_in_progress_message);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            b82.n.c(dVarA, strQ, strQ2, c2.l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), null, o0VarE, 0, 16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new si1.a(i14, 7);
        }
    }

    public static final void g(p3.m mVar, int i14) {
        h5.e0.a aVar;
        h5.g.a.b bVar;
        o0 o0VarE = mVar.E(-1304748337);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarB = a2.b(aVar2, a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            s62.a.f157643a.getClass();
            u4.d dVarA = fa.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_activation_failed);
            String strQ2 = gl1.y.Q(o0VarE, R.string.inreach_activation_failed_message);
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            float f15 = eVar2.f97920e;
            b82.n.c(dVarA, strQ, strQ2, c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13), null, o0VarE, 0, 16);
            bVar3.getClass();
            c2.l.f(x2.q(aVar2, f15), o0VarE);
            h4.r rVarF = x2.f(aVar2, 1.0f);
            bVar3.getClass();
            h4.r rVarY = c2.l.y(rVarF, f15);
            d6.h.f57752b.getClass();
            int i15 = d6.h.f57755e;
            String strQ3 = gl1.y.Q(o0VarE, R.string.inreach_activation_failed_support_availability);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97931h;
            mh.c(strQ3, rVarY, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 130044);
            c2.j.c cVar2 = c2.j.f22696f;
            h4.g.a aVar4 = h4.d.a.f81537o;
            h4.r rVarF2 = x2.f(aVar2, 1.0f);
            bVar3.getClass();
            h4.r rVarY2 = c2.l.y(rVarF2, f15);
            z zVarA2 = y.a(cVar2, aVar4, o0VarE, 54);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                aVar = aVar3;
                o0VarE.M(aVar);
            } else {
                aVar = aVar3;
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                bVar = bVar2;
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                bVar = bVar2;
            }
            b4.c(fVar, rVarC2, o0VarE);
            String strQ4 = gl1.y.Q(o0VarE, R.string.inreach_activation_failed_support_us);
            long jB = d92.b.a(o0VarE).k().b();
            fVar2.getClass();
            h5.g.a.b bVar4 = bVar;
            h5.e0.a aVar5 = aVar;
            mh.c(strQ4, null, jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, 0, 0, 131066);
            String strQ5 = gl1.y.Q(o0VarE, R.string.device_settings_inreach_activation_united_states_phone);
            fVar2.getClass();
            mh.c(strQ5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE.g0(true);
            h4.r rVarF3 = x2.f(aVar2, 1.0f);
            bVar3.getClass();
            h4.r rVarY3 = c2.l.y(rVarF3, f15);
            z zVarA3 = y.a(cVar2, aVar4, o0VarE, 54);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarY3, o0VarE);
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
            b4.c(eVar, zVarA3, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
            }
            b4.c(fVar, rVarC3, o0VarE);
            String strQ6 = gl1.y.Q(o0VarE, R.string.inreach_activation_failed_support_international);
            long jB2 = d92.b.a(o0VarE).k().b();
            fVar2.getClass();
            mh.c(strQ6, null, jB2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarE), o0VarE, 0, 0, 131066);
            String strQ7 = gl1.y.Q(o0VarE, R.string.device_settings_inreach_activation_international_phone);
            fVar2.getClass();
            mh.c(strQ7, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new si1.a(i14, 6);
        }
    }
}
