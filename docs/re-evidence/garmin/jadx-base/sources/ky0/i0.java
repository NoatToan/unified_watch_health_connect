package ky0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c22.o2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f107358b;

        static {
            int[] iArr = new int[a2.values().length];
            try {
                iArr[a2.SLEEP_SCORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a2.SLEEP_DURATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a2.VO2_MAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a2.TRAINING_READINESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a2.ACUTE_TRAINING_LOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a2.ENDURANCE_SCORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a2.RACE_PREDICTOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a2.HEAT_ACCLIMATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a2.ALTITUDE_ACCLIMATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a2.CYCLING_ABILITY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f107357a = iArr;
            int[] iArr2 = new int[o82.g.values().length];
            try {
                iArr2[o82.g.f130851d.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[o82.g.f130853f.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            f107358b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:108:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:113:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:120:0x0312  */
    /* JADX WARN: Code duplicated, block: B:121:0x0315  */
    /* JADX WARN: Code duplicated, block: B:128:0x0328  */
    /* JADX WARN: Code duplicated, block: B:130:0x038d  */
    public static final void a(final sy0.o oVar, final ry0.m mVar, final sy0.k kVar, final u82.d dVar, final hy0.a aVar, final e23.l lVar, final e23.l lVar2, final i53.d dVar2, final e23.a aVar2, final boolean z14, final e23.l lVar3, p3.m mVar2, final int i14) {
        p3.o0 o0Var;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        b63.o oVar2;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        boolean z15;
        b63.o oVar3;
        boolean z16;
        boolean z17;
        Object objQ;
        n82.f fVar2;
        oVar.getClass();
        o82.g gVar = oVar.f161268b;
        mVar.getClass();
        kVar.getClass();
        dVar.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        dVar2.getClass();
        aVar2.getClass();
        lVar3.getClass();
        p3.o0 o0VarE = mVar2.E(-548289735);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(oVar) ? 4 : 2) | (o0VarE.B(mVar) ? 32 : 16) | (o0VarE.B(kVar) ? 256 : 128) | (o0VarE.B(dVar) ? 2048 : 1024) | (o0VarE.B(aVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(dVar2) ? 8388608 : 4194304) | (o0VarE.r(aVar2) ? 67108864 : 33554432) | (o0VarE.h(z14) ? 536870912 : 268435456);
        char c14 = o0VarE.r(lVar3) ? (char) 4 : (char) 2;
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && (c14 & 3) == 2) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            b63.o oVarD = ay0.b.d(kVar.f161238f);
            b63.o oVarD2 = ay0.b.d(kVar.f161239g);
            e53.a.C1329a c1329a = e53.a.C1329a.f63093a;
            b63.z.INSTANCE.getClass();
            b63.o oVarG = b63.b.g(c1329a, b63.z.Companion.a());
            ry0.m.a aVar3 = ry0.m.a.f155176a;
            b63.o oVar4 = mVar.equals(aVar3) ? oVarG : oVarD;
            if (oVar.f161267a || oVar4 == null || oVarD == null || oVarD2 == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new e23.p(oVar, mVar, kVar, dVar, aVar, lVar, lVar2, dVar2, aVar2, z14, lVar3, i14, i16) { // from class: ky0.h0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f107339a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ sy0.o f107340b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ ry0.m f107341c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ sy0.k f107342d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ u82.d f107343e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ hy0.a f107344f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ e23.l f107345g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ e23.l f107346h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final /* synthetic */ i53.d f107347i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ e23.a f107348j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ boolean f107349k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ e23.l f107350l;

                    {
                        this.f107339a = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f107339a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                i0.a(this.f107340b, this.f107341c, this.f107342d, this.f107343e, this.f107344f, this.f107345g, this.f107346h, this.f107347i, this.f107348j, this.f107349k, this.f107350l, (p3.m) obj, p3.p0.t(1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                i0.a(this.f107340b, this.f107341c, this.f107342d, this.f107343e, this.f107344f, this.f107345g, this.f107346h, this.f107347i, this.f107348j, this.f107349k, this.f107350l, (p3.m) obj, p3.p0.t(1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                Object objQ2 = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = i53.a.a(o82.g.f130851d, o82.g.f130853f);
                    o0VarE.K(objQ2);
                }
                i53.f fVar3 = (i53.f) objQ2;
                boolean zK = o0VarE.k(gVar.ordinal());
                Object objQ3 = o0VarE.q();
                if (zK || objQ3 == c2565a) {
                    objQ3 = new n82.f.a(gVar, mVar.equals(aVar3) ? new o82.a(gVar.f130862a.b(oVarD, oVarG), oVarG) : b(oVarD, oVarD2, gVar), oVar4);
                    o0VarE.K(objQ3);
                }
                n82.f.a aVar4 = (n82.f.a) objQ3;
                ArrayList arrayList = new ArrayList(p13.y.r(fVar3, 10));
                Iterator<E> it = fVar3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new o13.p((o82.g) it.next(), oVar4));
                }
                o13.p[] pVarArr = (o13.p[]) arrayList.toArray(new o13.p[0]);
                n82.f fVarA = n82.j.a(aVar4, n82.h.a((o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length), o0VarE), o0VarE, 0);
                boolean zK2 = o0VarE.k(gVar.ordinal());
                Object objQ4 = o0VarE.q();
                if (zK2 || objQ4 == p3.m.a.f135155b) {
                    objQ4 = new yd1.a(context);
                    o0VarE.K(objQ4);
                }
                yd1.a aVar5 = (yd1.a) objQ4;
                boolean zK3 = o0VarE.k(gVar.ordinal());
                Object objQ5 = o0VarE.q();
                if (zK3 || objQ5 == p3.m.a.f135155b) {
                    objQ5 = new n82.n(fVarA, aVar5);
                    o0VarE.K(objQ5);
                }
                n82.n nVar = (n82.n) objQ5;
                h4.r.a aVar6 = h4.r.S;
                h4.r rVarD = x2.d(aVar6, 1.0f);
                long jF = vb.h.f(d92.b.f58623a, o0VarE);
                o4.m1.a aVar7 = o4.m1.f128891a;
                h4.r rVarE = u1.n.e(rVarD, jF, aVar7);
                h4.d.f81522a.getClass();
                h4.g.a aVar8 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                c2.z zVarA2 = c2.y.a(kVar2, aVar8, o0VarE, 48);
                p3.x1 x1Var2 = p3.n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar9 = h5.g.a.f81805b;
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar9);
                } else {
                    o0VarE.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA2, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA1, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    oVar2 = oVarD;
                } else {
                    oVar2 = oVarD;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarE2 = u1.n.e(aVar6, d92.b.a(o0VarE).c().c(), aVar7);
                    d92.b.f58625c.getClass();
                    h4.r rVarC3 = c2.l.C(rVarE2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    zVarA = c2.y.a(kVar2, aVar8, o0VarE, 48);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarC3, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar9);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    i53.c cVarE = i53.a.e(o2.b(fVar3, o0VarE));
                    int iIndexOf = fVar3.indexOf(gVar);
                    boolean zB = o0VarE.B(fVarA);
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    oVar3 = oVar2;
                    boolean zR = zB | z15 | o0VarE.r(oVar3) | o0VarE.r(oVarG) | o0VarE.r(oVarD2);
                    if ((c14 & 14) == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zR | z16;
                    objQ = o0VarE.q();
                    if (!z17 || objQ == p3.m.a.f135155b) {
                        objQ = new b82.l0(fVarA, fVar3, mVar, oVar3, oVarG, oVarD2, lVar3);
                        fVar2 = fVarA;
                        o0VarE.K(objQ);
                    } else {
                        fVar2 = fVarA;
                    }
                    t82.c.a(cVarE, null, iIndexOf, 0.0f, (e23.l) objQ, o0VarE, 0, 26);
                    q82.a.a(x2.y(aVar6, null, 3), nVar, null, o0VarE, 6, 4);
                    n82.c.a(null, fVar2, 3, false, z3.f.c(1958401771, new b21.s0(dVar, dVar2, aVar2, z14, aVar, oVar, lVar, lVar2), o0VarE), o0VarE, 24960, 9);
                    o0Var = o0VarE;
                    o0Var.g0(true);
                    o0Var.g0(true);
                }
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                h4.r rVarE3 = u1.n.e(aVar6, d92.b.a(o0VarE).c().c(), aVar7);
                d92.b.f58625c.getClass();
                h4.r rVarC4 = c2.l.C(rVarE3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                zVarA = c2.y.a(kVar2, aVar8, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC4, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar9);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                i53.c cVarE2 = i53.a.e(o2.b(fVar3, o0VarE));
                int iIndexOf2 = fVar3.indexOf(gVar);
                boolean zB2 = o0VarE.B(fVarA);
                if ((i15 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                oVar3 = oVar2;
                boolean zR2 = zB2 | z15 | o0VarE.r(oVar3) | o0VarE.r(oVarG) | o0VarE.r(oVarD2);
                if ((c14 & 14) == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zR2 | z16;
                objQ = o0VarE.q();
                if (z17) {
                    objQ = new b82.l0(fVarA, fVar3, mVar, oVar3, oVarG, oVarD2, lVar3);
                    fVar2 = fVarA;
                    o0VarE.K(objQ);
                } else {
                    objQ = new b82.l0(fVarA, fVar3, mVar, oVar3, oVarG, oVarD2, lVar3);
                    fVar2 = fVarA;
                    o0VarE.K(objQ);
                }
                t82.c.a(cVarE2, null, iIndexOf2, 0.0f, (e23.l) objQ, o0VarE, 0, 26);
                q82.a.a(x2.y(aVar6, null, 3), nVar, null, o0VarE, 6, 4);
                n82.c.a(null, fVar2, 3, false, z3.f.c(1958401771, new b21.s0(dVar, dVar2, aVar2, z14, aVar, oVar, lVar, lVar2), o0VarE), o0VarE, 24960, 9);
                o0Var = o0VarE;
                o0Var.g0(true);
                o0Var.g0(true);
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new e23.p(oVar, mVar, kVar, dVar, aVar, lVar, lVar2, dVar2, aVar2, z14, lVar3, i14, i17) { // from class: ky0.h0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f107339a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ sy0.o f107340b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ry0.m f107341c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ sy0.k f107342d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ u82.d f107343e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ hy0.a f107344f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.l f107345g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.l f107346h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ i53.d f107347i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ e23.a f107348j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ boolean f107349k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ e23.l f107350l;

                {
                    this.f107339a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f107339a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            i0.a(this.f107340b, this.f107341c, this.f107342d, this.f107343e, this.f107344f, this.f107345g, this.f107346h, this.f107347i, this.f107348j, this.f107349k, this.f107350l, (p3.m) obj, p3.p0.t(1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            i0.a(this.f107340b, this.f107341c, this.f107342d, this.f107343e, this.f107344f, this.f107345g, this.f107346h, this.f107347i, this.f107348j, this.f107349k, this.f107350l, (p3.m) obj, p3.p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final o82.a b(b63.o oVar, b63.o oVar2, o82.g gVar) {
        int iA = b63.p.a(oVar, gVar.f130862a.a(oVar, 0).f130844b) + 1;
        int iCeil = (((int) Math.ceil(((double) (b63.p.a(oVar, oVar2) + 1)) / ((double) iA))) * iA) - 1;
        b63.i.INSTANCE.getClass();
        return new o82.a(oVar, b63.q.e(oVar, iCeil, b63.i.f16190d));
    }
}
