package i3;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f88897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f88898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f88899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f88900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f88901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f88902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f88903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f88904h;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements f5.z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f88905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f88906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f88907c;

        public a(String str, String str2, String str3) {
            this.f88905a = str;
            this.f88906b = str2;
            this.f88907c = str3;
        }

        /* JADX WARN: Code duplicated, block: B:63:0x010c A[PHI: r0 r5
          0x010c: PHI (r0v11 int) = (r0v10 int), (r0v15 int), (r0v15 int) binds: [B:66:0x012b, B:59:0x0101, B:61:0x0107] A[DONT_GENERATE, DONT_INLINE]
          0x010c: PHI (r5v10 int) = (r5v9 int), (r5v17 int), (r5v17 int) binds: [B:66:0x012b, B:59:0x0101, B:61:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // f5.z0
        public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
            f5.y0 y0Var;
            f5.y0 y0Var2;
            int iF0;
            int iMax;
            int i14;
            int iE;
            a aVar = this;
            List<? extends f5.y0> list2 = list;
            long j14 = j8;
            int iMin = Math.min(g6.a.j(j14), b1Var.f0(le.f88897a));
            int size = list2.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    y0Var = null;
                    break;
                }
                y0Var = list2.get(i15);
                if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var), aVar.f88905a)) {
                    break;
                }
                i15++;
            }
            f5.y0 y0Var3 = y0Var;
            f5.v1 v1VarQ = y0Var3 != null ? y0Var3.Q(j14) : null;
            int size2 = list2.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size2) {
                    y0Var2 = null;
                    break;
                }
                y0Var2 = list2.get(i16);
                if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var2), aVar.f88906b)) {
                    break;
                }
                i16++;
            }
            f5.y0 y0Var4 = y0Var2;
            final f5.v1 v1VarQ2 = y0Var4 != null ? y0Var4.Q(j14) : null;
            int i17 = v1VarQ != null ? v1VarQ.f69144a : 0;
            int i18 = v1VarQ != null ? v1VarQ.f69145b : 0;
            int i19 = v1VarQ2 != null ? v1VarQ2.f69144a : 0;
            int i24 = v1VarQ2 != null ? v1VarQ2.f69145b : 0;
            int iF1 = ((iMin - i17) - i19) - (i19 == 0 ? b1Var.f0(le.f88903g) : 0);
            int iL = g6.a.l(j14);
            if (iF1 < iL) {
                iF1 = iL;
            }
            int size3 = list2.size();
            int i25 = 0;
            while (i25 < size3) {
                f5.y0 y0Var5 = list2.get(i25);
                int i26 = i24;
                if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var5), aVar.f88907c)) {
                    final f5.v1 v1VarQ3 = y0Var5.Q(g6.a.c(0, iF1, 0, 0, 9, j14));
                    f5.p pVar = f5.b.f68892a;
                    int iE2 = v1VarQ3.E(pVar);
                    int iE3 = v1VarQ3.E(f5.b.f68893b);
                    boolean z14 = true;
                    boolean z15 = (iE2 == Integer.MIN_VALUE || iE3 == Integer.MIN_VALUE) ? false : true;
                    if (iE2 != iE3 && z15) {
                        z14 = false;
                    }
                    final int i27 = iMin - i19;
                    final int i28 = i27 - i17;
                    if (z14) {
                        n3.z0.f123335a.getClass();
                        iMax = Math.max(b1Var.f0(n3.z0.f123344j), Math.max(i18, i26));
                        iF0 = (iMax - v1VarQ3.f69145b) / 2;
                        if (v1VarQ == null || (iE = v1VarQ.E(pVar)) == Integer.MIN_VALUE) {
                            i14 = 0;
                        } else {
                            i14 = (iE2 + iF0) - iE;
                        }
                    } else {
                        iF0 = b1Var.f0(le.f88898b) - iE2;
                        n3.z0.f123335a.getClass();
                        iMax = Math.max(b1Var.f0(n3.z0.f123345k), v1VarQ3.f69145b + iF0);
                        if (v1VarQ != null) {
                            i14 = (iMax - v1VarQ.f69145b) / 2;
                        } else {
                            i14 = 0;
                        }
                    }
                    final int i29 = i14;
                    final int i30 = iF0;
                    final int i34 = v1VarQ2 != null ? (iMax - v1VarQ2.f69145b) / 2 : 0;
                    final f5.v1 v1Var = v1VarQ;
                    return f5.b1.h0(b1Var, iMin, iMax, new e23.l() { // from class: i3.ke
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f5.v1.a aVar2 = (f5.v1.a) obj;
                            f5.v1.a.B(aVar2, v1VarQ3, 0, i30);
                            f5.v1 v1Var2 = v1VarQ2;
                            if (v1Var2 != null) {
                                f5.v1.a.B(aVar2, v1Var2, i27, i34);
                            }
                            f5.v1 v1Var3 = v1Var;
                            if (v1Var3 != null) {
                                f5.v1.a.B(aVar2, v1Var3, i28, i29);
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
                i25++;
                list2 = list;
                j14 = j8;
                i24 = i26;
                aVar = this;
            }
            throw hb.a.m("Collection contains no element matching the predicate.");
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f88897a = 600;
        f88898b = 30;
        f88899c = 16;
        float f14 = 8;
        f88900d = f14;
        f88901e = 2;
        f88902f = 6;
        f88903g = f14;
        f88904h = 12;
    }

    public static final void a(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, s5.x0 x0Var, long j8, long j14, p3.m mVar, int i14) {
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        e23.p<? super p3.m, ? super Integer, Unit> pVar5;
        float f14;
        h4.r rVarA;
        boolean z14;
        float f15;
        p3.o0 o0VarE = mVar.E(-264666338);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(pVar) ? 4 : 2) | (o0VarE.r(pVar2) ? 32 : 16) | (o0VarE.r(pVar3) ? 256 : 128) | (o0VarE.B(x0Var) ? 2048 : 1024) | (o0VarE.l(j8) ? 16384 : 8192) | (o0VarE.l(j14) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarC = c2.l.C(c2.x2.f(c2.x2.w(aVar, 0.0f, f88897a, 1), 1.0f), f88899c, 0.0f, 0.0f, f88901e, 6);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            p3.b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            float f16 = f88898b;
            if (Float.isNaN(f16)) {
                f14 = 0.0f;
                rVarA = aVar;
            } else {
                f14 = 0.0f;
                rVarA = c2.c.a(aVar, f5.b.f68892a, f16, 0.0f, 4);
            }
            aVar.getClass();
            float f17 = f88904h;
            h4.r rVarThen = rVarA.then(!Float.isNaN(f17) ? c2.c.a(aVar, f5.b.f68893b, f14, f17, 2) : aVar);
            float f18 = f88900d;
            h4.r rVarC3 = c2.l.C(rVarThen, 0.0f, 0.0f, f18, 0.0f, 11);
            h4.g gVar = h4.d.a.f81524b;
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iP2 = o0VarE.P();
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(rVarC3, o0VarE);
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
            p3.b4.c(eVar, z0VarD, o0VarE);
            p3.b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                v.h.A(iP2, o0VarE, iP2, bVar);
            }
            p3.b4.c(fVar, rVarC4, o0VarE);
            c2.u uVar = c2.u.f22885a;
            e5.q(i15 & 14, pVar, o0VarE, true);
            h4.r rVarB = b0Var.b(aVar, h4.d.a.f81538p);
            if (pVar3 == null) {
                f15 = f18;
                z14 = false;
            } else {
                z14 = false;
                g6.f.a aVar3 = g6.f.f75994b;
                f15 = 0;
            }
            h4.r rVarC5 = c2.l.C(rVarB, 0.0f, 0.0f, f15, 0.0f, 11);
            f5.z0 z0VarD2 = c2.q.d(gVar, z14);
            int iP3 = o0VarE.P();
            p3.i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC6 = h4.k.c(rVarC5, o0VarE);
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
            p3.b4.c(eVar, z0VarD2, o0VarE);
            p3.b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP3))) {
                v.h.A(iP3, o0VarE, iP3, bVar);
            }
            p3.b4.c(fVar, rVarC6, o0VarE);
            c2.s2 s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iP4 = o0VarE.P();
            p3.i2 i2VarA3 = o0VarE.a0();
            h4.r rVarC7 = h4.k.c(aVar, o0VarE);
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
            p3.b4.c(eVar, s2VarA, o0VarE);
            p3.b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP4))) {
                v.h.A(iP4, o0VarE, iP4, bVar);
            }
            p3.b4.c(fVar, rVarC7, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            p3.j0 j0Var = s2.f89590a;
            pVar4 = pVar2;
            p3.v.b(new p3.n2[]{j0Var.c(o4.d0.a(j8)), mh.f89022a.c(x0Var)}, pVar4, o0VarE, (i15 & 112) | 8);
            if (pVar3 != null) {
                o0VarE.C(916269829);
                pVar5 = pVar3;
                p3.v.a(j0Var.c(o4.d0.a(j14)), pVar5, o0VarE, ((i15 >> 3) & 112) | 8);
                o0VarE.g0(false);
            } else {
                pVar5 = pVar3;
                o0VarE.C(916475483);
                o0VarE.g0(false);
            }
            e5.u(o0VarE, true, true, true);
        } else {
            pVar4 = pVar2;
            pVar5 = pVar3;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new je(pVar, pVar4, pVar5, x0Var, j8, j14, i14, 1);
        }
    }

    public static final void b(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, s5.x0 x0Var, long j8, long j14, p3.m mVar, int i14) {
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        e23.p<? super p3.m, ? super Integer, Unit> pVar5;
        float f14;
        boolean z14;
        boolean z15;
        p3.o0 o0VarE = mVar.E(-931325388);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(pVar) ? 4 : 2) | (o0VarE.r(pVar2) ? 32 : 16) | (o0VarE.r(pVar3) ? 256 : 128) | (o0VarE.B(x0Var) ? 2048 : 1024) | (o0VarE.l(j8) ? 16384 : 8192) | (o0VarE.l(j14) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            if (pVar3 == null) {
                f14 = f88900d;
            } else {
                f14 = 0;
                g6.f.a aVar2 = g6.f.f75994b;
            }
            h4.r rVarC = c2.l.C(aVar, f88899c, 0.0f, f14, 0.0f, 10);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new a("action", "dismissAction", "text");
                o0VarE.K(objQ);
            }
            f5.z0 z0Var = (f5.z0) objQ;
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            p3.b4.c(eVar, z0Var, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC2, o0VarE);
            h4.r rVarA = c2.l.A(f5.g0.e(aVar, "text"), 0.0f, f88902f, 1);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iP2 = o0VarE.P();
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            p3.b4.c(eVar, z0VarD, o0VarE);
            p3.b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                v.h.A(iP2, o0VarE, iP2, bVar);
            }
            p3.b4.c(fVar, rVarC3, o0VarE);
            c2.u uVar = c2.u.f22885a;
            e5.q(i15 & 14, pVar, o0VarE, true);
            if (pVar2 != null) {
                o0VarE.C(-1014168049);
                h4.r rVarE = f5.g0.e(aVar, "action");
                f5.z0 z0VarD2 = c2.q.d(gVar, false);
                int iP3 = o0VarE.P();
                p3.i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC4 = h4.k.c(rVarE, o0VarE);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                p3.b4.c(eVar, z0VarD2, o0VarE);
                p3.b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP3))) {
                    v.h.A(iP3, o0VarE, iP3, bVar);
                }
                p3.b4.c(fVar, rVarC4, o0VarE);
                pVar4 = pVar2;
                p3.v.b(new p3.n2[]{s2.f89590a.c(o4.d0.a(j8)), mh.f89022a.c(x0Var)}, pVar4, o0VarE, (i15 & 112) | 8);
                o0VarE.g0(true);
                z14 = false;
                o0VarE.g0(false);
            } else {
                pVar4 = pVar2;
                z14 = false;
                o0VarE.C(-1013852841);
                o0VarE.g0(false);
            }
            if (pVar3 != null) {
                o0VarE.C(-1013804481);
                h4.r rVarE2 = f5.g0.e(aVar, "dismissAction");
                f5.z0 z0VarD3 = c2.q.d(gVar, z14);
                int iP4 = o0VarE.P();
                p3.i2 i2VarA3 = o0VarE.a0();
                h4.r rVarC5 = h4.k.c(rVarE2, o0VarE);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                p3.b4.c(eVar, z0VarD3, o0VarE);
                p3.b4.c(c1623g, i2VarA3, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP4))) {
                    v.h.A(iP4, o0VarE, iP4, bVar);
                }
                p3.b4.c(fVar, rVarC5, o0VarE);
                pVar5 = pVar3;
                p3.v.a(s2.f89590a.c(o4.d0.a(j14)), pVar5, o0VarE, 8 | ((i15 >> 3) & 112));
                z15 = true;
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                pVar5 = pVar3;
                z15 = true;
                o0VarE.C(-1013535401);
                o0VarE.g0(z14);
            }
            o0VarE.g0(z15);
        } else {
            pVar4 = pVar2;
            pVar5 = pVar3;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new je(pVar, pVar4, pVar5, x0Var, j8, j14, i14, 0);
        }
    }

    public static final void c(final h4.r rVar, final e23.p pVar, final e23.p pVar2, final o4.r1 r1Var, final long j8, final long j14, final long j15, final long j16, final z3.e eVar, p3.m mVar, final int i14) {
        int i15;
        e23.p pVar3;
        e23.p pVar4;
        o4.r1 r1Var2;
        z3.e eVar2;
        p3.o0 o0VarE = mVar.E(-1218779924);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            pVar3 = pVar;
            i15 |= o0VarE.r(pVar3) ? 32 : 16;
        } else {
            pVar3 = pVar;
        }
        if ((i14 & 384) == 0) {
            pVar4 = pVar2;
            i15 |= o0VarE.r(pVar4) ? 256 : 128;
        } else {
            pVar4 = pVar2;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(false) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            r1Var2 = r1Var;
            i15 |= o0VarE.B(r1Var2) ? 16384 : 8192;
        } else {
            r1Var2 = r1Var;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.l(j8) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.l(j14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.l(j15) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.l(j16) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            eVar2 = eVar;
            i15 |= o0VarE.r(eVar2) ? 536870912 : 268435456;
        } else {
            eVar2 = eVar;
        }
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            n3.z0.f123335a.getClass();
            float f14 = n3.z0.f123339e;
            z3.e eVarC = z3.f.c(-1343524879, new ne(false, pVar3, eVar2, pVar4, j15, j16), o0VarE);
            int i16 = (i15 & 14) | 12779520;
            int i17 = i15 >> 9;
            ve.a(rVar, r1Var2, j8, j14, 0.0f, f14, null, eVarC, o0VarE, i16 | (i17 & 112) | (i17 & 896) | (i17 & 7168), 80);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.ie
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    le.c(rVar, pVar, pVar2, r1Var, j8, j14, j15, j16, eVar, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void d(final wd wdVar, h4.r rVar, o4.r1 r1Var, long j8, long j14, long j15, long j16, long j17, p3.m mVar, final int i14) {
        int i15;
        p3.o0 o0Var;
        final h4.r rVar2;
        final o4.r1 r1Var2;
        final long j18;
        final long j19;
        final long j24;
        final long j25;
        final long j26;
        long jE;
        long j27;
        long j28;
        long j29;
        int i16;
        o4.r1 r1Var3;
        long j34;
        z3.e eVar;
        p3.o0 o0VarE = mVar.E(274621471);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(wdVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i17 = i15 | 432;
        if ((i14 & 3072) == 0) {
            i17 = i15 | 1456;
        }
        if ((i14 & 24576) == 0) {
            i17 |= 8192;
        }
        if ((196608 & i14) == 0) {
            i17 |= 65536;
        }
        if ((1572864 & i14) == 0) {
            i17 |= 524288;
        }
        if ((12582912 & i14) == 0) {
            i17 |= 4194304;
        }
        if ((100663296 & i14) == 0) {
            i17 |= 33554432;
        }
        if (o0VarE.n(i17 & 1, (38347923 & i17) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar2 = h4.r.S;
                xd xdVar = xd.f90329a;
                xdVar.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                n3.z0 z0Var = n3.z0.f123335a;
                z0Var.getClass();
                o4.r1 r1VarC = fc.c(n3.z0.f123340f, o0VarE);
                xdVar.getClass();
                z0Var.getClass();
                long jE2 = k2.e(n3.z0.f123338d, o0VarE);
                xdVar.getClass();
                z0Var.getClass();
                long jE3 = k2.e(n3.z0.f123342h, o0VarE);
                xdVar.getClass();
                z0Var.getClass();
                n3.m mVar2 = n3.z0.f123336b;
                long jE4 = k2.e(mVar2, o0VarE);
                xdVar.getClass();
                z0Var.getClass();
                long jE5 = k2.e(mVar2, o0VarE);
                xdVar.getClass();
                z0Var.getClass();
                jE = k2.e(n3.z0.f123341g, o0VarE);
                j27 = jE2;
                j28 = jE3;
                j29 = jE5;
                i16 = i17 & (-268434433);
                r1Var3 = r1VarC;
                j34 = jE4;
            } else {
                o0VarE.e();
                int i18 = i17 & (-268434433);
                r1Var3 = r1Var;
                j27 = j8;
                j28 = j14;
                j34 = j15;
                j29 = j16;
                jE = j17;
                i16 = i18;
                rVar2 = rVar;
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            String f88112b = wdVar.getF88109a().getF88112b();
            z3.e eVarC = null;
            if (f88112b != null) {
                o0VarE.C(-663815981);
                z3.e eVarC2 = z3.f.c(-1378313599, new qe(j34, wdVar, f88112b), o0VarE);
                o0VarE.g0(false);
                eVar = eVarC2;
            } else {
                o0VarE.C(-663517017);
                o0VarE.g0(false);
                eVar = null;
            }
            if (wdVar.getF88109a().getF88113c()) {
                o0VarE.C(-663364652);
                eVarC = z3.f.c(-1812633777, new re(wdVar), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-662974393);
                o0VarE.g0(false);
            }
            z3.e eVar2 = eVarC;
            g6.f.a aVar = g6.f.f75994b;
            o0Var = o0VarE;
            c(c2.l.y(rVar2, 12), eVar, eVar2, r1Var3, j27, j28, j29, jE, z3.f.c(-1266389126, new oe(wdVar), o0VarE), o0Var, ((i16 << 3) & 7168) | C.ENCODING_PCM_32BIT);
            j24 = j34;
            r1Var2 = r1Var3;
            j18 = j27;
            j19 = j28;
            j25 = j29;
            j26 = jE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            r1Var2 = r1Var;
            j18 = j8;
            j19 = j14;
            j24 = j15;
            j25 = j16;
            j26 = j17;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.he
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    le.d(wdVar, rVar2, r1Var2, j18, j19, j24, j25, j26, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
