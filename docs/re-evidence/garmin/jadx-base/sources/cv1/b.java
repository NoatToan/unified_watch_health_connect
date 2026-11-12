package cv1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.r;
import h5.e0;
import i3.mh;
import kotlin.t1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x012e  */
    /* JADX WARN: Code duplicated, block: B:74:0x015d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0188  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0193  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:87:0x029f  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void a(final r rVar, final u4.d dVar, float f14, final float f15, int i14, int i15, p3.m mVar, final int i16, final int i17) {
        final float f16;
        int i18;
        final int i19;
        final int i24;
        int i25;
        boolean z14;
        p2 p2VarI0;
        int i26;
        int i27;
        c2.j.k kVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        h5.g.a.f fVar;
        float f75992b;
        r.a aVar2;
        Object objQ;
        float f17;
        z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        rVar.getClass();
        o0 o0VarE = mVar.E(-69749810);
        p3.c<?> cVar = o0VarE.f135177b;
        int i28 = i16 | (o0VarE.B(dVar) ? 32 : 16);
        if ((i17 & 4) == 0) {
            f16 = f14;
            int i29 = o0VarE.i(f16) ? 256 : 128;
            int i30 = i28 | i29;
            if (o0VarE.i(f15)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            int i34 = i30 | i18;
            if ((i17 & 16) == 0) {
                i19 = i14;
                int i35 = o0VarE.k(i19) ? 16384 : 8192;
                int i36 = i34 | i35;
                if ((i17 & 32) == 0) {
                    i24 = i15;
                    int i37 = o0VarE.k(i24) ? 131072 : 65536;
                    i25 = i36 | i37;
                    if ((74899 & i25) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i25 & 1, z14)) {
                        o0VarE.G0();
                        if ((i16 & 1) != 0 || o0VarE.o0()) {
                            if ((i17 & 4) != 0) {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                f16 = j92.b.f97901d.f97907f;
                                i25 &= -897;
                            }
                            if ((i17 & 16) != 0) {
                                i25 &= -57345;
                                i19 = R.string.lbl_lets_start_training;
                            }
                            if ((i17 & 32) != 0) {
                                i25 &= -458753;
                                i24 = R.string.completed_activities_training_plan_message;
                            }
                        } else {
                            o0VarE.e();
                            if ((i17 & 4) != 0) {
                                i25 &= -897;
                            }
                            if ((i17 & 16) != 0) {
                                i25 &= -57345;
                            }
                            if ((i17 & 32) != 0) {
                                i25 &= -458753;
                            }
                        }
                        i26 = i19;
                        i27 = i25;
                        o0VarE.h0();
                        x1 x1Var = p3.n.f135158a;
                        c2.j.f22691a.getClass();
                        kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVar, o0VarE);
                        h5.g.V.getClass();
                        aVar = h5.g.a.f81805b;
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar);
                        } else {
                            o0VarE.c();
                        }
                        eVar = h5.g.a.f81810g;
                        b4.c(eVar, zVarA, o0VarE);
                        c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarA0, o0VarE);
                        bVar = h5.g.a.f81813j;
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, o0VarE);
                        b0 b0Var = b0.f22601a;
                        f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                        aVar2 = r.S;
                        r rVarF = x2.f(aVar2, 1.0f);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        f17 = f16;
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new com.google.maps.android.compose.clustering.d(13);
                            o0VarE.K(objQ);
                        }
                        r rVarC3 = v.c((e23.l) objQ, rVarF, true);
                        zVarA2 = y.a(kVar, h4.d.a.f81537o, o0VarE, 48);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = h4.k.c(rVarC3, o0VarE);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, zVarA2, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        d92.b.f58623a.getClass();
                        long j8 = d92.b.a(o0VarE).f().f63508c;
                        gl.c.f77766a.getClass();
                        g6.f.a aVar3 = g6.f.f75994b;
                        int i38 = i24;
                        g02.i.a(null, dVar, j8, gl.c.a(o0VarE).b(), f17 * f75992b, f15 * f75992b, null, o0VarE, i27 & 112, 193);
                        j92.b bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f18 = eVar2.f97918c;
                        bVar2.getClass();
                        r rVarZ = c2.l.z(aVar2, eVar2.f97920e, f18);
                        String strQ = gl1.y.Q(o0VarE, i26);
                        j92.f fVar2 = d92.b.f58624b;
                        fVar2.getClass();
                        x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                        d6.h.f57752b.getClass();
                        int i39 = d6.h.f57755e;
                        mh.c(strQ, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(i39), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
                        bVar2.getClass();
                        float f19 = eVar2.f97920e;
                        bVar2.getClass();
                        float f22 = eVar2.f97920e;
                        bVar2.getClass();
                        r rVarC4 = c2.l.C(aVar2, f22, 0.0f, eVar2.f97920e, f19, 2);
                        String strQ2 = gl1.y.Q(o0VarE, i38);
                        fVar2.getClass();
                        mh.c(strQ2, rVarC4, 0L, null, 0L, null, 0L, d6.h.a(i39), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 130044);
                        o0VarE = o0VarE;
                        o0VarE.g0(true);
                        o0VarE.g0(true);
                        f16 = f17;
                        i24 = i38;
                        i19 = i26;
                    } else {
                        o0VarE.e();
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new p(dVar, f16, f15, i19, i24, i16, i17) { // from class: cv1.a

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ u4.d f55868b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ float f55869c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ float f55870d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ int f55871e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ int f55872f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            public final /* synthetic */ int f55873g;

                            {
                                this.f55873g = i17;
                            }

                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p0.t(7);
                                b.a(this.f55867a, this.f55868b, this.f55869c, this.f55870d, this.f55871e, this.f55872f, (p3.m) obj, iT, this.f55873g);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i24 = i15;
                i25 = i36 | i37;
                if ((74899 & i25) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i25 & 1, z14)) {
                    o0VarE.G0();
                    if ((i16 & 1) != 0) {
                        if ((i17 & 4) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f16 = j92.b.f97901d.f97907f;
                            i25 &= -897;
                        }
                        if ((i17 & 16) != 0) {
                            i25 &= -57345;
                            i19 = R.string.lbl_lets_start_training;
                        }
                        if ((i17 & 32) != 0) {
                            i25 &= -458753;
                            i24 = R.string.completed_activities_training_plan_message;
                        }
                    } else {
                        if ((i17 & 4) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f16 = j92.b.f97901d.f97907f;
                            i25 &= -897;
                        }
                        if ((i17 & 16) != 0) {
                            i25 &= -57345;
                            i19 = R.string.lbl_lets_start_training;
                        }
                        if ((i17 & 32) != 0) {
                            i25 &= -458753;
                            i24 = R.string.completed_activities_training_plan_message;
                        }
                    }
                    i26 = i19;
                    i27 = i25;
                    o0VarE.h0();
                    x1 x1Var2 = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var2 = b0.f22601a;
                    f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                    aVar2 = r.S;
                    r rVarF2 = x2.f(aVar2, 1.0f);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    f17 = f16;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new com.google.maps.android.compose.clustering.d(13);
                        o0VarE.K(objQ);
                    }
                    r rVarC5 = v.c((e23.l) objQ, rVarF2, true);
                    zVarA2 = y.a(kVar, h4.d.a.f81537o, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC5, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    d92.b.f58623a.getClass();
                    long j14 = d92.b.a(o0VarE).f().f63508c;
                    gl.c.f77766a.getClass();
                    g6.f.a aVar4 = g6.f.f75994b;
                    int i310 = i24;
                    g02.i.a(null, dVar, j14, gl.c.a(o0VarE).b(), f17 * f75992b, f15 * f75992b, null, o0VarE, i27 & 112, 193);
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f110 = eVar3.f97918c;
                    bVar3.getClass();
                    r rVarZ2 = c2.l.z(aVar2, eVar3.f97920e, f110);
                    String strQ3 = gl1.y.Q(o0VarE, i26);
                    j92.f fVar3 = d92.b.f58624b;
                    fVar3.getClass();
                    x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                    d6.h.f57752b.getClass();
                    int i311 = d6.h.f57755e;
                    mh.c(strQ3, rVarZ2, 0L, null, 0L, null, 0L, d6.h.a(i311), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130044);
                    bVar3.getClass();
                    float f111 = eVar3.f97920e;
                    bVar3.getClass();
                    float f24 = eVar3.f97920e;
                    bVar3.getClass();
                    r rVarC6 = c2.l.C(aVar2, f24, 0.0f, eVar3.f97920e, f111, 2);
                    String strQ4 = gl1.y.Q(o0VarE, i310);
                    fVar3.getClass();
                    mh.c(strQ4, rVarC6, 0L, null, 0L, null, 0L, d6.h.a(i311), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 130044);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    f16 = f17;
                    i24 = i310;
                    i19 = i26;
                } else {
                    o0VarE.e();
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(dVar, f16, f15, i19, i24, i16, i17) { // from class: cv1.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ u4.d f55868b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ float f55869c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ float f55870d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ int f55871e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ int f55872f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ int f55873g;

                        {
                            this.f55873g = i17;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(7);
                            b.a(this.f55867a, this.f55868b, this.f55869c, this.f55870d, this.f55871e, this.f55872f, (p3.m) obj, iT, this.f55873g);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i19 = i14;
            int i312 = i34 | i35;
            if ((i17 & 32) == 0) {
                i24 = i15;
                if (o0VarE.k(i24)) {
                }
                i25 = i312 | i37;
                if ((74899 & i25) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i25 & 1, z14)) {
                    o0VarE.G0();
                    if ((i16 & 1) != 0) {
                        if ((i17 & 4) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f16 = j92.b.f97901d.f97907f;
                            i25 &= -897;
                        }
                        if ((i17 & 16) != 0) {
                            i25 &= -57345;
                            i19 = R.string.lbl_lets_start_training;
                        }
                        if ((i17 & 32) != 0) {
                            i25 &= -458753;
                            i24 = R.string.completed_activities_training_plan_message;
                        }
                    } else {
                        if ((i17 & 4) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f16 = j92.b.f97901d.f97907f;
                            i25 &= -897;
                        }
                        if ((i17 & 16) != 0) {
                            i25 &= -57345;
                            i19 = R.string.lbl_lets_start_training;
                        }
                        if ((i17 & 32) != 0) {
                            i25 &= -458753;
                            i24 = R.string.completed_activities_training_plan_message;
                        }
                    }
                    i26 = i19;
                    i27 = i25;
                    o0VarE.h0();
                    x1 x1Var3 = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var3 = b0.f22601a;
                    f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                    aVar2 = r.S;
                    r rVarF3 = x2.f(aVar2, 1.0f);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    f17 = f16;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new com.google.maps.android.compose.clustering.d(13);
                        o0VarE.K(objQ);
                    }
                    r rVarC7 = v.c((e23.l) objQ, rVarF3, true);
                    zVarA2 = y.a(kVar, h4.d.a.f81537o, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC7, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    d92.b.f58623a.getClass();
                    long j15 = d92.b.a(o0VarE).f().f63508c;
                    gl.c.f77766a.getClass();
                    g6.f.a aVar5 = g6.f.f75994b;
                    int i313 = i24;
                    g02.i.a(null, dVar, j15, gl.c.a(o0VarE).b(), f17 * f75992b, f15 * f75992b, null, o0VarE, i27 & 112, 193);
                    j92.b bVar4 = d92.b.f58625c;
                    bVar4.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f112 = eVar4.f97918c;
                    bVar4.getClass();
                    r rVarZ3 = c2.l.z(aVar2, eVar4.f97920e, f112);
                    String strQ5 = gl1.y.Q(o0VarE, i26);
                    j92.f fVar4 = d92.b.f58624b;
                    fVar4.getClass();
                    x0 x0VarB3 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                    d6.h.f57752b.getClass();
                    int i314 = d6.h.f57755e;
                    mh.c(strQ5, rVarZ3, 0L, null, 0L, null, 0L, d6.h.a(i314), 0L, 0, false, 0, 0, null, x0VarB3, o0VarE, 0, 0, 130044);
                    bVar4.getClass();
                    float f113 = eVar4.f97920e;
                    bVar4.getClass();
                    float f25 = eVar4.f97920e;
                    bVar4.getClass();
                    r rVarC8 = c2.l.C(aVar2, f25, 0.0f, eVar4.f97920e, f113, 2);
                    String strQ6 = gl1.y.Q(o0VarE, i313);
                    fVar4.getClass();
                    mh.c(strQ6, rVarC8, 0L, null, 0L, null, 0L, d6.h.a(i314), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 130044);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    f16 = f17;
                    i24 = i313;
                    i19 = i26;
                } else {
                    o0VarE.e();
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(dVar, f16, f15, i19, i24, i16, i17) { // from class: cv1.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ u4.d f55868b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ float f55869c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ float f55870d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ int f55871e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ int f55872f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ int f55873g;

                        {
                            this.f55873g = i17;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(7);
                            b.a(this.f55867a, this.f55868b, this.f55869c, this.f55870d, this.f55871e, this.f55872f, (p3.m) obj, iT, this.f55873g);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i24 = i15;
            i25 = i312 | i37;
            if ((74899 & i25) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i25 & 1, z14)) {
                o0VarE.G0();
                if ((i16 & 1) != 0) {
                    if ((i17 & 4) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f16 = j92.b.f97901d.f97907f;
                        i25 &= -897;
                    }
                    if ((i17 & 16) != 0) {
                        i25 &= -57345;
                        i19 = R.string.lbl_lets_start_training;
                    }
                    if ((i17 & 32) != 0) {
                        i25 &= -458753;
                        i24 = R.string.completed_activities_training_plan_message;
                    }
                } else {
                    if ((i17 & 4) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f16 = j92.b.f97901d.f97907f;
                        i25 &= -897;
                    }
                    if ((i17 & 16) != 0) {
                        i25 &= -57345;
                        i19 = R.string.lbl_lets_start_training;
                    }
                    if ((i17 & 32) != 0) {
                        i25 &= -458753;
                        i24 = R.string.completed_activities_training_plan_message;
                    }
                }
                i26 = i19;
                i27 = i25;
                o0VarE.h0();
                x1 x1Var4 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var4 = b0.f22601a;
                f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                aVar2 = r.S;
                r rVarF4 = x2.f(aVar2, 1.0f);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                f17 = f16;
                if (objQ == p3.m.a.f135155b) {
                    objQ = new com.google.maps.android.compose.clustering.d(13);
                    o0VarE.K(objQ);
                }
                r rVarC9 = v.c((e23.l) objQ, rVarF4, true);
                zVarA2 = y.a(kVar, h4.d.a.f81537o, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC9, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                d92.b.f58623a.getClass();
                long j16 = d92.b.a(o0VarE).f().f63508c;
                gl.c.f77766a.getClass();
                g6.f.a aVar6 = g6.f.f75994b;
                int i315 = i24;
                g02.i.a(null, dVar, j16, gl.c.a(o0VarE).b(), f17 * f75992b, f15 * f75992b, null, o0VarE, i27 & 112, 193);
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                j92.e eVar5 = j92.b.f97899b;
                float f114 = eVar5.f97918c;
                bVar5.getClass();
                r rVarZ4 = c2.l.z(aVar2, eVar5.f97920e, f114);
                String strQ7 = gl1.y.Q(o0VarE, i26);
                j92.f fVar5 = d92.b.f58624b;
                fVar5.getClass();
                x0 x0VarB4 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                d6.h.f57752b.getClass();
                int i316 = d6.h.f57755e;
                mh.c(strQ7, rVarZ4, 0L, null, 0L, null, 0L, d6.h.a(i316), 0L, 0, false, 0, 0, null, x0VarB4, o0VarE, 0, 0, 130044);
                bVar5.getClass();
                float f115 = eVar5.f97920e;
                bVar5.getClass();
                float f26 = eVar5.f97920e;
                bVar5.getClass();
                r rVarC10 = c2.l.C(aVar2, f26, 0.0f, eVar5.f97920e, f115, 2);
                String strQ8 = gl1.y.Q(o0VarE, i315);
                fVar5.getClass();
                mh.c(strQ8, rVarC10, 0L, null, 0L, null, 0L, d6.h.a(i316), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(true);
                f16 = f17;
                i24 = i315;
                i19 = i26;
            } else {
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p(dVar, f16, f15, i19, i24, i16, i17) { // from class: cv1.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ u4.d f55868b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ float f55869c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ float f55870d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ int f55871e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f55872f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ int f55873g;

                    {
                        this.f55873g = i17;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(7);
                        b.a(this.f55867a, this.f55868b, this.f55869c, this.f55870d, this.f55871e, this.f55872f, (p3.m) obj, iT, this.f55873g);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        f16 = f14;
        int i317 = i28 | i29;
        if (o0VarE.i(f15)) {
            i18 = 2048;
        } else {
            i18 = 1024;
        }
        int i318 = i317 | i18;
        if ((i17 & 16) == 0) {
            i19 = i14;
            if (o0VarE.k(i19)) {
            }
            int i319 = i318 | i35;
            if ((i17 & 32) == 0) {
                i24 = i15;
                if (o0VarE.k(i24)) {
                }
                i25 = i319 | i37;
                if ((74899 & i25) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i25 & 1, z14)) {
                    o0VarE.G0();
                    if ((i16 & 1) != 0) {
                        if ((i17 & 4) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f16 = j92.b.f97901d.f97907f;
                            i25 &= -897;
                        }
                        if ((i17 & 16) != 0) {
                            i25 &= -57345;
                            i19 = R.string.lbl_lets_start_training;
                        }
                        if ((i17 & 32) != 0) {
                            i25 &= -458753;
                            i24 = R.string.completed_activities_training_plan_message;
                        }
                    } else {
                        if ((i17 & 4) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f16 = j92.b.f97901d.f97907f;
                            i25 &= -897;
                        }
                        if ((i17 & 16) != 0) {
                            i25 &= -57345;
                            i19 = R.string.lbl_lets_start_training;
                        }
                        if ((i17 & 32) != 0) {
                            i25 &= -458753;
                            i24 = R.string.completed_activities_training_plan_message;
                        }
                    }
                    i26 = i19;
                    i27 = i25;
                    o0VarE.h0();
                    x1 x1Var5 = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var5 = b0.f22601a;
                    f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                    aVar2 = r.S;
                    r rVarF5 = x2.f(aVar2, 1.0f);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    f17 = f16;
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new com.google.maps.android.compose.clustering.d(13);
                        o0VarE.K(objQ);
                    }
                    r rVarC11 = v.c((e23.l) objQ, rVarF5, true);
                    zVarA2 = y.a(kVar, h4.d.a.f81537o, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC11, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    d92.b.f58623a.getClass();
                    long j17 = d92.b.a(o0VarE).f().f63508c;
                    gl.c.f77766a.getClass();
                    g6.f.a aVar7 = g6.f.f75994b;
                    int i3110 = i24;
                    g02.i.a(null, dVar, j17, gl.c.a(o0VarE).b(), f17 * f75992b, f15 * f75992b, null, o0VarE, i27 & 112, 193);
                    j92.b bVar6 = d92.b.f58625c;
                    bVar6.getClass();
                    j92.e eVar6 = j92.b.f97899b;
                    float f116 = eVar6.f97918c;
                    bVar6.getClass();
                    r rVarZ5 = c2.l.z(aVar2, eVar6.f97920e, f116);
                    String strQ9 = gl1.y.Q(o0VarE, i26);
                    j92.f fVar6 = d92.b.f58624b;
                    fVar6.getClass();
                    x0 x0VarB5 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                    d6.h.f57752b.getClass();
                    int i3111 = d6.h.f57755e;
                    mh.c(strQ9, rVarZ5, 0L, null, 0L, null, 0L, d6.h.a(i3111), 0L, 0, false, 0, 0, null, x0VarB5, o0VarE, 0, 0, 130044);
                    bVar6.getClass();
                    float f117 = eVar6.f97920e;
                    bVar6.getClass();
                    float f27 = eVar6.f97920e;
                    bVar6.getClass();
                    r rVarC12 = c2.l.C(aVar2, f27, 0.0f, eVar6.f97920e, f117, 2);
                    String strQ10 = gl1.y.Q(o0VarE, i3110);
                    fVar6.getClass();
                    mh.c(strQ10, rVarC12, 0L, null, 0L, null, 0L, d6.h.a(i3111), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 130044);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    f16 = f17;
                    i24 = i3110;
                    i19 = i26;
                } else {
                    o0VarE.e();
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p(dVar, f16, f15, i19, i24, i16, i17) { // from class: cv1.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ u4.d f55868b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ float f55869c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ float f55870d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ int f55871e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ int f55872f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ int f55873g;

                        {
                            this.f55873g = i17;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(7);
                            b.a(this.f55867a, this.f55868b, this.f55869c, this.f55870d, this.f55871e, this.f55872f, (p3.m) obj, iT, this.f55873g);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i24 = i15;
            i25 = i319 | i37;
            if ((74899 & i25) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i25 & 1, z14)) {
                o0VarE.G0();
                if ((i16 & 1) != 0) {
                    if ((i17 & 4) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f16 = j92.b.f97901d.f97907f;
                        i25 &= -897;
                    }
                    if ((i17 & 16) != 0) {
                        i25 &= -57345;
                        i19 = R.string.lbl_lets_start_training;
                    }
                    if ((i17 & 32) != 0) {
                        i25 &= -458753;
                        i24 = R.string.completed_activities_training_plan_message;
                    }
                } else {
                    if ((i17 & 4) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f16 = j92.b.f97901d.f97907f;
                        i25 &= -897;
                    }
                    if ((i17 & 16) != 0) {
                        i25 &= -57345;
                        i19 = R.string.lbl_lets_start_training;
                    }
                    if ((i17 & 32) != 0) {
                        i25 &= -458753;
                        i24 = R.string.completed_activities_training_plan_message;
                    }
                }
                i26 = i19;
                i27 = i25;
                o0VarE.h0();
                x1 x1Var6 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var6 = b0.f22601a;
                f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                aVar2 = r.S;
                r rVarF6 = x2.f(aVar2, 1.0f);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                f17 = f16;
                if (objQ == p3.m.a.f135155b) {
                    objQ = new com.google.maps.android.compose.clustering.d(13);
                    o0VarE.K(objQ);
                }
                r rVarC13 = v.c((e23.l) objQ, rVarF6, true);
                zVarA2 = y.a(kVar, h4.d.a.f81537o, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC13, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                d92.b.f58623a.getClass();
                long j18 = d92.b.a(o0VarE).f().f63508c;
                gl.c.f77766a.getClass();
                g6.f.a aVar8 = g6.f.f75994b;
                int i3112 = i24;
                g02.i.a(null, dVar, j18, gl.c.a(o0VarE).b(), f17 * f75992b, f15 * f75992b, null, o0VarE, i27 & 112, 193);
                j92.b bVar7 = d92.b.f58625c;
                bVar7.getClass();
                j92.e eVar7 = j92.b.f97899b;
                float f118 = eVar7.f97918c;
                bVar7.getClass();
                r rVarZ6 = c2.l.z(aVar2, eVar7.f97920e, f118);
                String strQ11 = gl1.y.Q(o0VarE, i26);
                j92.f fVar7 = d92.b.f58624b;
                fVar7.getClass();
                x0 x0VarB6 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                d6.h.f57752b.getClass();
                int i3113 = d6.h.f57755e;
                mh.c(strQ11, rVarZ6, 0L, null, 0L, null, 0L, d6.h.a(i3113), 0L, 0, false, 0, 0, null, x0VarB6, o0VarE, 0, 0, 130044);
                bVar7.getClass();
                float f119 = eVar7.f97920e;
                bVar7.getClass();
                float f28 = eVar7.f97920e;
                bVar7.getClass();
                r rVarC14 = c2.l.C(aVar2, f28, 0.0f, eVar7.f97920e, f119, 2);
                String strQ12 = gl1.y.Q(o0VarE, i3112);
                fVar7.getClass();
                mh.c(strQ12, rVarC14, 0L, null, 0L, null, 0L, d6.h.a(i3113), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(true);
                f16 = f17;
                i24 = i3112;
                i19 = i26;
            } else {
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p(dVar, f16, f15, i19, i24, i16, i17) { // from class: cv1.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ u4.d f55868b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ float f55869c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ float f55870d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ int f55871e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f55872f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ int f55873g;

                    {
                        this.f55873g = i17;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(7);
                        b.a(this.f55867a, this.f55868b, this.f55869c, this.f55870d, this.f55871e, this.f55872f, (p3.m) obj, iT, this.f55873g);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i19 = i14;
        int i3114 = i318 | i35;
        if ((i17 & 32) == 0) {
            i24 = i15;
            if (o0VarE.k(i24)) {
            }
            i25 = i3114 | i37;
            if ((74899 & i25) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i25 & 1, z14)) {
                o0VarE.G0();
                if ((i16 & 1) != 0) {
                    if ((i17 & 4) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f16 = j92.b.f97901d.f97907f;
                        i25 &= -897;
                    }
                    if ((i17 & 16) != 0) {
                        i25 &= -57345;
                        i19 = R.string.lbl_lets_start_training;
                    }
                    if ((i17 & 32) != 0) {
                        i25 &= -458753;
                        i24 = R.string.completed_activities_training_plan_message;
                    }
                } else {
                    if ((i17 & 4) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f16 = j92.b.f97901d.f97907f;
                        i25 &= -897;
                    }
                    if ((i17 & 16) != 0) {
                        i25 &= -57345;
                        i19 = R.string.lbl_lets_start_training;
                    }
                    if ((i17 & 32) != 0) {
                        i25 &= -458753;
                        i24 = R.string.completed_activities_training_plan_message;
                    }
                }
                i26 = i19;
                i27 = i25;
                o0VarE.h0();
                x1 x1Var7 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var7 = b0.f22601a;
                f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                aVar2 = r.S;
                r rVarF7 = x2.f(aVar2, 1.0f);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                f17 = f16;
                if (objQ == p3.m.a.f135155b) {
                    objQ = new com.google.maps.android.compose.clustering.d(13);
                    o0VarE.K(objQ);
                }
                r rVarC15 = v.c((e23.l) objQ, rVarF7, true);
                zVarA2 = y.a(kVar, h4.d.a.f81537o, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC15, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                d92.b.f58623a.getClass();
                long j19 = d92.b.a(o0VarE).f().f63508c;
                gl.c.f77766a.getClass();
                g6.f.a aVar9 = g6.f.f75994b;
                int i3115 = i24;
                g02.i.a(null, dVar, j19, gl.c.a(o0VarE).b(), f17 * f75992b, f15 * f75992b, null, o0VarE, i27 & 112, 193);
                j92.b bVar8 = d92.b.f58625c;
                bVar8.getClass();
                j92.e eVar8 = j92.b.f97899b;
                float f1110 = eVar8.f97918c;
                bVar8.getClass();
                r rVarZ7 = c2.l.z(aVar2, eVar8.f97920e, f1110);
                String strQ13 = gl1.y.Q(o0VarE, i26);
                j92.f fVar8 = d92.b.f58624b;
                fVar8.getClass();
                x0 x0VarB7 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                d6.h.f57752b.getClass();
                int i3116 = d6.h.f57755e;
                mh.c(strQ13, rVarZ7, 0L, null, 0L, null, 0L, d6.h.a(i3116), 0L, 0, false, 0, 0, null, x0VarB7, o0VarE, 0, 0, 130044);
                bVar8.getClass();
                float f1111 = eVar8.f97920e;
                bVar8.getClass();
                float f29 = eVar8.f97920e;
                bVar8.getClass();
                r rVarC16 = c2.l.C(aVar2, f29, 0.0f, eVar8.f97920e, f1111, 2);
                String strQ14 = gl1.y.Q(o0VarE, i3115);
                fVar8.getClass();
                mh.c(strQ14, rVarC16, 0L, null, 0L, null, 0L, d6.h.a(i3116), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(true);
                f16 = f17;
                i24 = i3115;
                i19 = i26;
            } else {
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p(dVar, f16, f15, i19, i24, i16, i17) { // from class: cv1.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ u4.d f55868b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ float f55869c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ float f55870d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ int f55871e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f55872f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ int f55873g;

                    {
                        this.f55873g = i17;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(7);
                        b.a(this.f55867a, this.f55868b, this.f55869c, this.f55870d, this.f55871e, this.f55872f, (p3.m) obj, iT, this.f55873g);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i24 = i15;
        i25 = i3114 | i37;
        if ((74899 & i25) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i25 & 1, z14)) {
            o0VarE.G0();
            if ((i16 & 1) != 0) {
                if ((i17 & 4) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f16 = j92.b.f97901d.f97907f;
                    i25 &= -897;
                }
                if ((i17 & 16) != 0) {
                    i25 &= -57345;
                    i19 = R.string.lbl_lets_start_training;
                }
                if ((i17 & 32) != 0) {
                    i25 &= -458753;
                    i24 = R.string.completed_activities_training_plan_message;
                }
            } else {
                if ((i17 & 4) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f16 = j92.b.f97901d.f97907f;
                    i25 &= -897;
                }
                if ((i17 & 16) != 0) {
                    i25 &= -57345;
                    i19 = R.string.lbl_lets_start_training;
                }
                if ((i17 & 32) != 0) {
                    i25 &= -458753;
                    i24 = R.string.completed_activities_training_plan_message;
                }
            }
            i26 = i19;
            i27 = i25;
            o0VarE.h0();
            x1 x1Var8 = p3.n.f135158a;
            c2.j.f22691a.getClass();
            kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var8 = b0.f22601a;
            f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            aVar2 = r.S;
            r rVarF8 = x2.f(aVar2, 1.0f);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            f17 = f16;
            if (objQ == p3.m.a.f135155b) {
                objQ = new com.google.maps.android.compose.clustering.d(13);
                o0VarE.K(objQ);
            }
            r rVarC17 = v.c((e23.l) objQ, rVarF8, true);
            zVarA2 = y.a(kVar, h4.d.a.f81537o, o0VarE, 48);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarC17, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            d92.b.f58623a.getClass();
            long j110 = d92.b.a(o0VarE).f().f63508c;
            gl.c.f77766a.getClass();
            g6.f.a aVar10 = g6.f.f75994b;
            int i3117 = i24;
            g02.i.a(null, dVar, j110, gl.c.a(o0VarE).b(), f17 * f75992b, f15 * f75992b, null, o0VarE, i27 & 112, 193);
            j92.b bVar9 = d92.b.f58625c;
            bVar9.getClass();
            j92.e eVar9 = j92.b.f97899b;
            float f1112 = eVar9.f97918c;
            bVar9.getClass();
            r rVarZ8 = c2.l.z(aVar2, eVar9.f97920e, f1112);
            String strQ15 = gl1.y.Q(o0VarE, i26);
            j92.f fVar9 = d92.b.f58624b;
            fVar9.getClass();
            x0 x0VarB8 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            d6.h.f57752b.getClass();
            int i3118 = d6.h.f57755e;
            mh.c(strQ15, rVarZ8, 0L, null, 0L, null, 0L, d6.h.a(i3118), 0L, 0, false, 0, 0, null, x0VarB8, o0VarE, 0, 0, 130044);
            bVar9.getClass();
            float f1113 = eVar9.f97920e;
            bVar9.getClass();
            float f210 = eVar9.f97920e;
            bVar9.getClass();
            r rVarC18 = c2.l.C(aVar2, f210, 0.0f, eVar9.f97920e, f1113, 2);
            String strQ16 = gl1.y.Q(o0VarE, i3117);
            fVar9.getClass();
            mh.c(strQ16, rVarC18, 0L, null, 0L, null, 0L, d6.h.a(i3118), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
            f16 = f17;
            i24 = i3117;
            i19 = i26;
        } else {
            o0VarE.e();
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(dVar, f16, f15, i19, i24, i16, i17) { // from class: cv1.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u4.d f55868b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f55869c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f55870d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f55871e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f55872f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ int f55873g;

                {
                    this.f55873g = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(7);
                    b.a(this.f55867a, this.f55868b, this.f55869c, this.f55870d, this.f55871e, this.f55872f, (p3.m) obj, iT, this.f55873g);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
