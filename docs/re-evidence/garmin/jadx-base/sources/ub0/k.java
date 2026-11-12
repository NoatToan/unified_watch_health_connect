package ub0;

import c2.q2;
import c2.s2;
import c2.u2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import cw1.s1;
import f72.t9;
import gl1.y;
import h5.e0;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s70.a0;
import u1.w;
import v62.e1;
import v62.i1;
import v62.j1;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0137  */
    /* JADX WARN: Code duplicated, block: B:75:0x0158  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z14, final String str, final u4.d dVar, long j8, final e23.a<Unit> aVar, p3.m mVar, final int i14, final int i15) {
        boolean z15;
        int i16;
        long jB;
        int i17;
        int i18;
        boolean z16;
        o0 o0Var;
        final boolean z17;
        final long j14;
        p2 p2VarI0;
        boolean z18;
        int i19;
        boolean z19;
        Object objQ;
        p3.m.a aVar2;
        boolean z24;
        Object objQ2;
        float f14;
        o0 o0VarE = mVar.E(55414616);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
            z15 = z14;
        } else {
            z15 = z14;
            i16 = i14 | (o0VarE.h(z15) ? 4 : 2);
        }
        int i25 = i16 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(dVar) ? 256 : 128);
        if ((i15 & 8) == 0) {
            jB = j8;
            int i26 = o0VarE.l(jB) ? 2048 : 1024;
            int i27 = i25 | i26;
            if (o0VarE.r(aVar)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i18 = i27 | i17;
            if ((i18 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i18 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i24 != 0) {
                        z15 = true;
                    }
                    if ((i15 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarE).d().a().b();
                        i18 &= -7169;
                    }
                } else {
                    o0VarE.e();
                    if ((i15 & 8) != 0) {
                        i18 &= -7169;
                    }
                }
                z18 = z15;
                i19 = i18;
                j14 = jB;
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                h4.r.a aVar3 = h4.r.S;
                p5.l.f136032b.getClass();
                p5.l lVarA = p5.l.a(0);
                if ((57344 & i19) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objQ = o0VarE.q();
                aVar2 = p3.m.f135153a;
                if (z19) {
                    objQ = new u11.b(aVar, 11);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new u11.b(aVar, 11);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarD = w.d(aVar3, z18, null, lVarA, (e23.a) objQ, 10);
                if ((i19 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objQ2 = o0VarE.q();
                if (z24) {
                    objQ2 = new u91.c(str, 1);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new u91.c(str, 1);
                        o0VarE.K(objQ2);
                    }
                }
                h4.r rVarC = v.c((e23.l) objQ2, rVarD, false);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                h4.r rVarA = c2.l.A(rVarC, j92.b.f97899b.f97918c, 0.0f, 2);
                long jD = am.j.d(o0VarE);
                if (z18) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.5f;
                }
                long jC = d0.c(f14, jD, 14);
                long jC2 = d0.c(z18 ? 1.0f : 0.5f, j14, 14);
                bVar.getClass();
                o0Var = o0VarE;
                g02.i.a(rVarA, dVar, jC, jC2, j92.b.f97901d.f97906e, 0.0f, null, o0Var, (i19 >> 3) & 112, 224);
                z17 = z18;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
                j14 = jB;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p(z17, str, dVar, j14, aVar, i14, i15) { // from class: ub0.j

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ boolean f169736a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ String f169737b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ u4.d f169738c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ long f169739d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ e23.a f169740e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f169741f;

                    {
                        this.f169741f = i15;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(1);
                        k.a(this.f169736a, this.f169737b, this.f169738c, this.f169739d, this.f169740e, (p3.m) obj, iT, this.f169741f);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        jB = j8;
        int i28 = i25 | i26;
        if (o0VarE.r(aVar)) {
            i17 = 16384;
        } else {
            i17 = 8192;
        }
        i18 = i28 | i17;
        if ((i18 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i18 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i24 != 0) {
                    z15 = true;
                }
                if ((i15 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).d().a().b();
                    i18 &= -7169;
                }
            } else {
                if (i24 != 0) {
                    z15 = true;
                }
                if ((i15 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).d().a().b();
                    i18 &= -7169;
                }
            }
            z18 = z15;
            i19 = i18;
            j14 = jB;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            p5.l.f136032b.getClass();
            p5.l lVarA2 = p5.l.a(0);
            if ((57344 & i19) == 16384) {
                z19 = true;
            } else {
                z19 = false;
            }
            objQ = o0VarE.q();
            aVar2 = p3.m.f135153a;
            if (z19) {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u11.b(aVar, 11);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new u11.b(aVar, 11);
                o0VarE.K(objQ);
            }
            h4.r rVarD2 = w.d(aVar4, z18, null, lVarA2, (e23.a) objQ, 10);
            if ((i19 & 112) == 32) {
                z24 = true;
            } else {
                z24 = false;
            }
            objQ2 = o0VarE.q();
            if (z24) {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new u91.c(str, 1);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new u91.c(str, 1);
                o0VarE.K(objQ2);
            }
            h4.r rVarC2 = v.c((e23.l) objQ2, rVarD2, false);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            h4.r rVarA2 = c2.l.A(rVarC2, j92.b.f97899b.f97918c, 0.0f, 2);
            long jD2 = am.j.d(o0VarE);
            if (z18) {
                f14 = 1.0f;
            } else {
                f14 = 0.5f;
            }
            long jC3 = d0.c(f14, jD2, 14);
            long jC4 = d0.c(z18 ? 1.0f : 0.5f, j14, 14);
            bVar2.getClass();
            o0Var = o0VarE;
            g02.i.a(rVarA2, dVar, jC3, jC4, j92.b.f97901d.f97906e, 0.0f, null, o0Var, (i19 >> 3) & 112, 224);
            z17 = z18;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z17 = z15;
            j14 = jB;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(z17, str, dVar, j14, aVar, i14, i15) { // from class: ub0.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f169736a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f169737b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ u4.d f169738c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f169739d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.a f169740e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f169741f;

                {
                    this.f169741f = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    k.a(this.f169736a, this.f169737b, this.f169738c, this.f169739d, this.f169740e, (p3.m) obj, iT, this.f169741f);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d8  */
    public static final void b(h4.r rVar, int i14, int i15, e23.l<? super a, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i16) {
        boolean z14;
        boolean z15;
        int i17;
        u4.d dVarA;
        long jB;
        boolean z16;
        boolean z17;
        rVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(870008869);
        int i18 = i16 | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i18 & 1, (i18 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_previous_tutorial);
            String strQ2 = y.Q(o0VarE, R.string.lbl_next_tutorial);
            String strQ3 = y.Q(o0VarE, R.string.lbl_finished);
            boolean z18 = i14 == 1;
            boolean z19 = i14 == i15 + (-1);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(cVar, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            boolean z24 = z18;
            h4.r rVarC = h4.k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            p3.m.a aVar3 = p3.m.f135153a;
            if (i15 > 1) {
                o0VarE.C(-966315673);
                s62.a.f157643a.getClass();
                u4.d dVarA2 = i1.a(t62.b.f162798a);
                boolean z25 = !z24;
                boolean z26 = (i18 & 7168) == 2048;
                Object objQ = o0VarE.q();
                if (z26) {
                    z17 = false;
                    objQ = new h(lVar, 0);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        z17 = false;
                        objQ = new h(lVar, 0);
                        o0VarE.K(objQ);
                    } else {
                        z17 = false;
                    }
                }
                z14 = z19;
                z15 = z17;
                i17 = 16384;
                a(z25, strQ, dVarA2, 0L, (e23.a) objQ, o0VarE, 0, 8);
                o0VarE.g0(z15);
            } else {
                z14 = z19;
                z15 = false;
                i17 = 16384;
                o0VarE.C(-966065503);
                o0VarE.g0(false);
            }
            if (z14) {
                s62.a.f157643a.getClass();
                dVarA = e1.a(t62.b.f162798a);
            } else {
                s62.a.f157643a.getClass();
                dVarA = j1.a(t62.b.f162798a);
            }
            u4.d dVar = dVarA;
            if (z14) {
                o0VarE.C(-965874357);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).d().a().a();
                o0VarE.g0(z15);
            } else {
                o0VarE.C(-965814775);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).d().a().b();
                o0VarE.g0(z15);
            }
            long j8 = jB;
            String str = z14 ? strQ3 : strQ2;
            boolean zH = ((57344 & i18) == i17 ? true : z15) | o0VarE.h(z14);
            if ((i18 & 7168) == 2048) {
                z15 = true;
            }
            boolean z27 = zH | z15;
            Object objQ2 = o0VarE.q();
            if (z27) {
                z16 = true;
                objQ2 = new g(z14, aVar, lVar, 1);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    z16 = true;
                    objQ2 = new g(z14, aVar, lVar, 1);
                    o0VarE.K(objQ2);
                } else {
                    z16 = true;
                }
            }
            a(false, str, dVar, j8, (e23.a) objQ2, o0VarE, 0, 1);
            o0VarE.g0(z16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(rVar, i14, i15, lVar, aVar, i16, 0);
        }
    }

    public static final void c(h4.r rVar, int i14, int i15, e23.l<? super a, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i16) {
        rVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(262158758);
        int i17 = i16 | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            b82.c.b(rVar, null, z3.f.c(500907569, new a71.l(i15, i14, 10), o0VarE), z3.f.c(1766978354, new s1(i14, i15, lVar, aVar), o0VarE), am.j.A(d92.b.f58623a, o0VarE), o0VarE, 3462, 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(rVar, i14, i15, lVar, aVar, i16, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0254  */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final void d(h4.r rVar, boolean z14, boolean z15, boolean z16, int i14, e23.l<? super a, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i15) {
        ?? r14;
        u4.d dVarA;
        u4.d dVarA2;
        long jB;
        boolean z17;
        rVar.getClass();
        lVar.getClass();
        aVar.getClass();
        ?? E = mVar.E(-1406745235);
        int i16 = i15 | (E.h(z14) ? 32 : 16) | (E.h(z15) ? 256 : 128) | (E.h(z16) ? 2048 : 1024) | (E.k(i14) ? 16384 : 8192) | (E.r(lVar) ? 131072 : 65536) | (E.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (E.n(i16 & 1, (599187 & i16) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(E, R.string.lbl_previous_tutorial);
            String strQ2 = y.Q(E, R.string.lbl_next_tutorial);
            String strQ3 = y.Q(E, R.string.audio_note_play);
            String strQ4 = y.Q(E, R.string.lbl_pause);
            String strQ5 = y.Q(E, R.string.lbl_finished);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(cVar, h4.d.a.f81534l, E, 54);
            int iHashCode = Long.hashCode(E.U);
            i2 i2VarA0 = E.a0();
            h4.r rVarC = h4.k.c(rVar, E);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (E.f135177b == null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar2);
            } else {
                E.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, E);
            b4.c(h5.g.a.f81809f, i2VarA0, E);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (E.T || !s.g(E.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, E, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, E);
            u2 u2Var = u2.f22900a;
            p3.m.a aVar3 = p3.m.f135153a;
            if (i14 > 1) {
                E.C(722375555);
                boolean z18 = !z15;
                s62.a.f157643a.getClass();
                u4.d dVarA3 = i1.a(t62.b.f162798a);
                boolean z19 = (i16 & 458752) == 131072;
                Object objQ = E.q();
                if (z19) {
                    z17 = true;
                    objQ = new h(lVar, 1);
                    E.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        z17 = true;
                        objQ = new h(lVar, 1);
                        E.K(objQ);
                    } else {
                        z17 = true;
                    }
                }
                r14 = 0;
                a(z18, strQ, dVarA3, 0L, (e23.a) objQ, E, 0, 8);
                E.g0(false);
            } else {
                r14 = 0;
                E.C(722652633);
                E.g0(false);
            }
            s62.a aVar4 = s62.a.f157643a;
            if (z14) {
                aVar4.getClass();
                t62.c.f162799a.getClass();
                dVarA = j72.a.a(t9.f69810a);
            } else {
                aVar4.getClass();
                t62.c.f162799a.getClass();
                dVarA = j72.b.a(t9.f69810a);
            }
            u4.d dVar = dVarA;
            String str = z14 ? strQ4 : strQ3;
            int i17 = i16 & 458752;
            int i18 = (i17 == 131072 ? 1 : r14) | ((i16 & 112) == 32 ? 1 : r14);
            Object objQ2 = E.q();
            if (i18 == 0) {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ad0.e(z14, lVar, 18);
                    E.K(objQ2);
                }
            } else {
                objQ2 = new ad0.e(z14, lVar, 18);
                E.K(objQ2);
            }
            a(false, str, dVar, 0L, (e23.a) objQ2, E, 0, 9);
            if (z16) {
                s62.a.f157643a.getClass();
                dVarA2 = e1.a(t62.b.f162798a);
            } else {
                s62.a.f157643a.getClass();
                dVarA2 = j1.a(t62.b.f162798a);
            }
            u4.d dVar2 = dVarA2;
            if (z16) {
                E.C(723330851);
                d92.b.f58623a.getClass();
                jB = d92.b.a(E).d().a().a();
                E.g0(r14);
            } else {
                E.C(723390433);
                d92.b.f58623a.getClass();
                jB = d92.b.a(E).d().a().b();
                E.g0(r14);
            }
            long j8 = jB;
            String str2 = z16 ? strQ5 : strQ2;
            ?? r15 = ((i16 & 3670016) == 1048576 ? 1 : r14) | ((i16 & 7168) == 2048 ? 1 : r14) | (i17 == 131072 ? 1 : r14);
            Object objQ3 = E.q();
            if (r15 == 0) {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new g(z16, aVar, lVar, r14);
                    E.K(objQ3);
                }
            } else {
                objQ3 = new g(z16, aVar, lVar, r14);
                E.K(objQ3);
            }
            a(false, str2, dVar2, j8, (e23.a) objQ3, E, 0, 1);
            E.g0(true);
        } else {
            E.e();
        }
        p2 p2VarI0 = E.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ew0.e(rVar, z14, z15, z16, i14, lVar, aVar, i15);
        }
    }

    public static final void e(h4.r rVar, boolean z14, boolean z15, boolean z16, int i14, int i15, e23.l<? super a, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i16) {
        o0 o0Var;
        rVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1796338223);
        int i17 = (o0VarE.h(z14) ? 32 : 16) | i16;
        if ((i16 & 384) == 0) {
            i17 |= o0VarE.h(z15) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= o0VarE.h(z16) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i17 |= o0VarE.k(i14) ? 16384 : 8192;
        }
        if ((196608 & i16) == 0) {
            i17 |= o0VarE.k(i15) ? 131072 : 65536;
        }
        int i18 = i17 | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar) ? 8388608 : 4194304);
        if (o0VarE.n(i18 & 1, (4793491 & i18) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            b82.c.b(rVar, null, z3.f.c(-9230948, new a71.l(i15, i14, 11), o0VarE), z3.f.c(-567215011, new k11.l(z14, z15, z16, i15, lVar, aVar), o0VarE), am.j.A(d92.b.f58623a, o0VarE), o0Var, 3462, 2);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gt1.f(rVar, z14, z15, z16, i14, i15, lVar, aVar, i16);
        }
    }

    public static final void f(h4.r rVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        rVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1238101940);
        int i15 = i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            b82.c.b(rVar, null, z3.f.c(-652046081, new a0(aVar, 17), o0VarE), z3.f.c(1637430336, new a0(aVar2, 18), o0VarE), am.j.A(d92.b.f58623a, o0VarE), o0VarE, 3462, 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t91.b(rVar, aVar, aVar2, i14, 1);
        }
    }
}
