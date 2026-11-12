package dk0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import c80.q;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h4.r;
import h5.e0;
import i3.mh;
import l72.f0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import u1.a2;
import u1.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60177a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.NUTRITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f60177a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z14, final boolean z15, final boolean z16, e23.a<Unit> aVar, final ak0.a aVar2, final q qVar, final e23.a<Unit> aVar3, p3.m mVar, int i14) {
        o0 o0Var;
        boolean z17;
        String strQ;
        String strQ2;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-858984996);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.h(z16) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.B(aVar2) ? 16384 : 8192) | (o0VarE.k(qVar == null ? -1 : qVar.ordinal()) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r.a aVar4 = r.S;
            r rVarD = c2.l.D(a2.b(u1.n.e(x2.d(aVar4, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a), a2.a(o0VarE), true));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81536n;
            z zVarA = y.a(kVar, aVar5, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) objQ;
            c0.c(b0Var, ((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(1360190634, new b(aVar, aVar3, p1Var, 0), o0VarE), o0VarE, 1572870, 30);
            b(x2.f(aVar4, 1.0f), o0VarE, 6);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            float f15 = eVar2.f97920e;
            r rVarY = c2.l.y(aVar4, f14);
            z zVarA2 = y.a(kVar, aVar5, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarY, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            if (z16) {
                o0VarE.C(1931466282);
                strQ = gl1.y.Q(o0VarE, R.string.lbl_welcome_back_sentence_case);
                strQ2 = gl1.y.Q(o0VarE, R.string.already_have_an_active_subscription);
                z17 = false;
                o0VarE.g0(false);
            } else {
                z17 = false;
                if (z14) {
                    o0VarE.C(1931701541);
                    strQ = gl1.y.Q(o0VarE, R.string.youre_all_set);
                    strQ2 = gl1.y.Q(o0VarE, R.string.enjoy_garmin_connect_plus);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1931888223);
                    strQ = gl1.y.Q(o0VarE, R.string.garmin_connect_plus_activation_in_progress);
                    strQ2 = gl1.y.Q(o0VarE, R.string.will_receive_email_upon_activation);
                    o0VarE.g0(false);
                }
            }
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57757g;
            d6.h hVarA = d6.h.a(i16);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 130046);
            bVar2.getClass();
            c2.l.f(x2.h(aVar4, f15), o0VarE);
            d6.h hVarA2 = d6.h.a(i16);
            fVar2.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130046);
            o0VarE.g0(true);
            c2.l.f(b0Var.a(aVar4, 1.0f, true), o0VarE);
            f0 f0Var = f0.f110999a;
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_close);
            r rVarF = x2.f(aVar4, 1.0f);
            bVar2.getClass();
            r rVarY2 = c2.l.y(rVarF, f15);
            boolean zR = ((i15 & 112) == 32 ? true : z17) | ((i15 & 14) == 4 ? true : z17) | ((i15 & 896) == 256 ? true : z17) | o0VarE.r(context) | ((458752 & i15) == 131072 ? true : z17) | ((57344 & i15) != 16384 ? z17 : true) | ((i15 & 3670016) == 1048576 ? true : z17);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                e23.a aVar7 = new e23.a() { // from class: dk0.c
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.a
                    public final Object invoke() {
                        boolean z18 = z14;
                        e23.a aVar8 = aVar3;
                        if (z18) {
                            Boolean boolValueOf = Boolean.valueOf((z15 || z16) ? false : true);
                            p1 p1Var2 = p1Var;
                            p1Var2.setValue(boolValueOf);
                            if (!((Boolean) p1Var2.getF182175a()).booleanValue()) {
                                q qVar2 = qVar;
                                if ((qVar2 == null ? -1 : e.a.f60177a[qVar2.ordinal()]) == 1) {
                                    aVar2.n(context, true);
                                } else {
                                    aVar8.invoke();
                                }
                            }
                        } else {
                            aVar8.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(aVar7);
                objQ2 = aVar7;
            }
            f0Var.d(0, 9, (e23.a) objQ2, rVarY2, strQ3, o0VarE, null, false);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(z14, z15, z16, aVar, aVar2, qVar, aVar3, i14);
        }
    }

    public static final void b(r rVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(13580908);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            t4.d dVarA = n5.c.a(R.drawable.gcplus_announcement, o0VarE, 0);
            r.a aVar2 = r.S;
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarC2 = c2.l.C(uVar.c(x2.f(aVar2, 1.0f), h4.d.a.f81525c), 0.0f, 0.0f, 0.0f, 32, 7);
            f5.k.f68985a.getClass();
            y0.a(dVarA, null, rVarC2, null, f5.k.a.f68990e, 0.0f, null, o0VarE, 24624, 104);
            r rVarC3 = uVar.c(aVar2, h4.d.a.f81530h);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            zd0.e.a(c2.l.C(rVarC3, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, o0VarE, 0);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 5);
        }
    }
}
