package jd0;

import am.i1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import h5.e0;
import i3.e5;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import w5.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljd0/v;", "Lfy0/e;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements fy0.e {
    @Override // fy0.e
    public final void a(final ActivityListItemDTO activityListItemDTO, final boolean z14, final e23.l<? super Boolean, Unit> lVar, p3.m mVar, final int i14) {
        int i15;
        boolean z15;
        e23.l<? super Boolean, Unit> lVar2;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1266723871);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(activityListItemDTO) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            u4.d dVar = activityListItemDTO.f29265g.f4362e;
            String strJ = activityListItemDTO.f29253c;
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1845887195, R.string.txt_untitle, o0VarE, false);
            } else {
                o0VarE.C(-1845887970);
                o0VarE.g0(false);
            }
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            ps.q qVarA = ss.c.a(activityListItemDTO);
            jr.q qVarB = x.b(context, qVarA.o());
            if (qVarB == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new e23.p(this) { // from class: jd0.s

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ v f98362b;

                    {
                        this.f98362b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i16) {
                            case 0:
                                ((Integer) obj2).getClass();
                                this.f98362b.a(activityListItemDTO, z14, lVar, (p3.m) obj, p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                this.f98362b.a(activityListItemDTO, z14, lVar, (p3.m) obj, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                z15 = z14;
                lVar2 = lVar;
                ArrayList arrayListA = is.o.a(qVarB.g(), qVarA);
                jr.p pVar2 = (jr.p) h0.e0(0, arrayListA);
                ls.e eVarA = pVar2 != null ? is.m.a(pVar2) : null;
                jr.p pVar3 = (jr.p) h0.e0(1, arrayListA);
                ls.e eVarA2 = pVar3 != null ? is.m.a(pVar3) : null;
                jr.p pVar4 = (jr.p) h0.e0(2, arrayListA);
                ls.e eVarA3 = pVar4 != null ? is.m.a(pVar4) : null;
                g02.b0.f74326a.b(strJ, new s5.c(h0.k0(p13.u.C(new String[]{eVarA != null ? x.c(context, qVarA, eVarA) : null, eVarA2 != null ? x.c(context, qVarA, eVarA2) : null, eVarA3 != null ? x.c(context, qVarA, eVarA3) : null}), " • ", null, null, null, 62), null, 2, null), null, false, z3.f.c(-527746558, new i1(z15, lVar2, dVar, 20), o0VarE), null, o0VarE, 196608, 476);
            }
            p2VarI0.f135219d = pVar;
        }
        z15 = z14;
        lVar2 = lVar;
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            final boolean z16 = z15;
            final e23.l<? super Boolean, Unit> lVar3 = lVar2;
            pVar = new e23.p(this) { // from class: jd0.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v f98362b;

                {
                    this.f98362b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i17) {
                        case 0:
                            ((Integer) obj2).getClass();
                            this.f98362b.a(activityListItemDTO, z16, lVar3, (p3.m) obj, p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            this.f98362b.a(activityListItemDTO, z16, lVar3, (p3.m) obj, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    @Override // fy0.e
    public final void b(h4.r rVar, ActivityListItemDTO activityListItemDTO, ps.m mVar, wg0.l lVar, e23.a<Unit> aVar, p3.m mVar2, int i14) throws Throwable {
        rVar.getClass();
        aVar.getClass();
        mVar2.C(-1400829781);
        x1 x1Var = p3.n.f135158a;
        int i15 = i14 << 3;
        x.a(x2.f(h4.r.S, 1.0f), ss.c.a(activityListItemDTO), mVar, lVar, activityListItemDTO.f29256d, aVar, mVar2, (ps.q.K1 << 6) | 6 | (ps.m.f139904n << 9) | (i15 & 7168) | (wg0.l.f185101f << 12) | (i15 & 57344) | (3670016 & (i14 << 6)));
        mVar2.f();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
    @Override // fy0.e
    public final void c(final ActivityListItemDTO activityListItemDTO, final e23.l<? super Long, Unit> lVar, p3.m mVar, final int i14) {
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        lVar.getClass();
        o0 o0VarE = mVar.E(1566717290);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(activityListItemDTO) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            ps.q qVarA = ss.c.a(activityListItemDTO);
            jr.q qVarB = x.b(context, qVarA.o());
            if (qVarB == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new e23.p(this, activityListItemDTO, lVar, i14, i16) { // from class: jd0.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f98367a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ v f98368b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ ActivityListItemDTO f98369c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ e23.l f98370d;

                    {
                        this.f98367a = i16;
                        this.f98368b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i17 = this.f98367a;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        switch (i17) {
                            case 0:
                                this.f98368b.c(this.f98369c, this.f98370d, mVar2, p0.t(1));
                                break;
                            default:
                                this.f98368b.c(this.f98369c, this.f98370d, mVar2, p0.t(1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                ArrayList arrayListA = is.o.a(qVarB.g(), qVarA);
                jr.p pVar2 = (jr.p) h0.e0(0, arrayListA);
                ls.e eVarA = pVar2 != null ? is.m.a(pVar2) : null;
                jr.p pVar3 = (jr.p) h0.e0(1, arrayListA);
                ls.e eVarA2 = pVar3 != null ? is.m.a(pVar3) : null;
                jr.p pVar4 = (jr.p) h0.e0(2, arrayListA);
                ls.e eVarA3 = pVar4 != null ? is.m.a(pVar4) : null;
                String strK0 = h0.k0(p13.u.C(new String[]{eVarA != null ? x.c(context, qVarA, eVarA) : null, eVarA2 != null ? x.c(context, qVarA, eVarA2) : null, eVarA3 != null ? x.c(context, qVarA, eVarA3) : null}), " • ", null, null, null, 62);
                h4.r.a aVar = h4.r.S;
                h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                boolean zR = ((i15 & 112) == 32) | o0VarE.r(activityListItemDTO);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new u(lVar, activityListItemDTO, 0);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new u(lVar, activityListItemDTO, 0);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) objQ, 15);
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarY = c2.l.y(rVarD, eVar.f97920e);
                h4.d.f81522a.getClass();
                h4.g.b bVar2 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                h5.g.a.e eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, s2VarA, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                h4.r rVarA = u2.f22900a.a(aVar, 1.0f, true);
                bVar.getClass();
                c2.z zVarA = c2.y.a(c2.j.i(eVar.f97918c), h4.d.a.f81536n, o0VarE, 48);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                String strJ = activityListItemDTO.f29253c;
                if (strJ == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1350144884, R.string.txt_untitle, o0VarE, false);
                } else {
                    o0VarE.C(1350144109);
                    o0VarE.g0(false);
                }
                String str = strJ;
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0Var = j92.f.f97930g;
                f0.f182097b.getClass();
                mh.c(str, null, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, f0.f182104i, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 1572864, 0, 131002);
                bVar.getClass();
                s2 s2VarA2 = q2.a(c2.j.i(eVar.f97917b), bVar2, o0VarE, 48);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(aVar, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
                }
                b4.c(fVar, rVarC3, o0VarE);
                u4.d dVar = activityListItemDTO.f29265g.f4362e;
                bVar.getClass();
                i7.b(dVar, null, x2.q(aVar, j92.b.f97901d.f97904c), sn.a.y(o0VarE), o0VarE, 48, 0);
                fVar2.getClass();
                mh.c(strK0, null, vb.h.g(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, o0VarE, 0, 0, 131066);
                o0VarE = o0VarE;
                e5.u(o0VarE, true, true, true);
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new e23.p(this, activityListItemDTO, lVar, i14, i17) { // from class: jd0.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f98367a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v f98368b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ActivityListItemDTO f98369c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.l f98370d;

                {
                    this.f98367a = i17;
                    this.f98368b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = this.f98367a;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            this.f98368b.c(this.f98369c, this.f98370d, mVar2, p0.t(1));
                            break;
                        default:
                            this.f98368b.c(this.f98369c, this.f98370d, mVar2, p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
