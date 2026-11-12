package i3;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f88704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f88705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f88706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f88707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f88708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f5.n2 f88709f;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f88710a = new a();

        public a() {
            super(2, MathKt.class, "min", "min(II)I", 1);
        }

        @Override // e23.p
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements e23.q<ud, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a2.j f88711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ uc f88712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f88713c;

        public b(a2.j jVar, uc ucVar, boolean z14) {
            this.f88711a = jVar;
            this.f88712b = ucVar;
            this.f88713c = z14;
        }

        @Override // e23.q
        public final Unit invoke(ud udVar, p3.m mVar, Integer num) {
            num.intValue();
            p3.x1 x1Var = p3.n.f135158a;
            dd.f87874a.a(this.f88711a, null, this.f88712b, this.f88713c, 0L, mVar, 196608, 18);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements e23.q<ud, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f88714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ uc f88715b;

        public c(boolean z14, uc ucVar) {
            this.f88714a = z14;
            this.f88715b = ucVar;
        }

        @Override // e23.q
        public final Unit invoke(ud udVar, p3.m mVar, Integer num) {
            ud udVar2 = udVar;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            p3.x1 x1Var = p3.n.f135158a;
            dd.f87874a.c(udVar2, null, this.f88714a, this.f88715b, null, null, 0.0f, 0.0f, mVar2, (iIntValue & 14) | 100663296, 242);
            return Unit.INSTANCE;
        }
    }

    static {
        n3.x0.f123303a.getClass();
        f88704a = n3.x0.f123317o;
        float f14 = n3.x0.f123315m;
        f88705b = f14;
        float f15 = n3.x0.f123313k;
        f88706c = dh.b.e(f14, f15);
        dh.b.e(f15, f14);
        f88707d = n3.x0.f123304b;
        g6.f.a aVar = g6.f.f75994b;
        f88708e = 2;
        f88709f = new f5.n2(a.f88710a);
    }

    public static final void a(cb cbVar, h4.r rVar, boolean z14, uc ucVar, a2.j jVar, a2.j jVar2, z3.e eVar, z3.e eVar2, e23.q qVar, p3.m mVar, int i14) {
        int i15;
        h4.r rVar2;
        boolean z15;
        z3.e eVar3;
        e23.q qVar2;
        uc ucVar2;
        uc ucVarF;
        int i16;
        p3.o0 o0VarE = mVar.E(-781154979);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(cbVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            rVar2 = rVar;
            i15 |= o0VarE.B(rVar2) ? 32 : 16;
        } else {
            rVar2 = rVar;
        }
        if ((i14 & 384) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 256 : 128;
        } else {
            z15 = z14;
        }
        if ((i14 & 3072) == 0) {
            i15 |= 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(jVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(jVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            eVar3 = eVar2;
            i15 |= o0VarE.r(eVar3) ? 8388608 : 4194304;
        } else {
            eVar3 = eVar2;
        }
        if ((100663296 & i14) == 0) {
            qVar2 = qVar;
            i15 |= o0VarE.r(qVar2) ? 67108864 : 33554432;
        } else {
            qVar2 = qVar;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                dd.f87874a.getClass();
                ucVarF = dd.f(o0VarE);
                i16 = i15 & (-7169);
            } else {
                o0VarE.e();
                i16 = i15 & (-7169);
                ucVarF = ucVar;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            if (cbVar.f87740a < 0) {
                vb.h.s("steps should be >= 0");
                return;
            }
            int i17 = i16 >> 3;
            c(rVar2, cbVar, z15, jVar, jVar2, eVar, eVar3, qVar2, o0VarE, (i16 & 896) | (i17 & 14) | ((i16 << 3) & 112) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128));
            ucVar2 = ucVarF;
        } else {
            o0VarE.e();
            ucVar2 = ucVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.v(cbVar, rVar, z14, ucVar2, jVar, jVar2, eVar, eVar2, qVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x018a  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(j23.f fVar, e23.l lVar, h4.r rVar, boolean z14, j23.f fVar2, e23.a aVar, uc ucVar, a2.j jVar, a2.j jVar2, z3.e eVar, z3.e eVar2, e23.q qVar, int i14, p3.m mVar, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        e23.q qVar2;
        e23.q qVarC;
        Object cbVar;
        e23.a aVar2;
        p3.o0 o0VarE = mVar.E(1924256162);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(fVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.B(fVar2) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i17 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i17 |= o0VarE.B(ucVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i15) == 0) {
            i17 |= o0VarE.B(jVar) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= o0VarE.B(jVar2) ? 67108864 : 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            i17 |= o0VarE.r(eVar) ? 536870912 : 268435456;
        }
        if ((i16 & 6) == 0) {
            i18 = i16 | (o0VarE.r(eVar2) ? 4 : 2);
        } else {
            i18 = i16;
        }
        int i24 = i18 | 48;
        if ((i16 & 384) == 0) {
            i19 = i14;
            i24 |= o0VarE.k(i19) ? 256 : 128;
        } else {
            i19 = i14;
        }
        int i25 = i24;
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (i25 & 147) == 146) ? false : true)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                qVarC = z3.f.c(-1234185578, new ld(z14, ucVar), o0VarE);
            } else {
                o0VarE.e();
                qVarC = qVar;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            boolean z15 = ((i25 & 896) == 256) | ((((i17 & 57344) ^ 24576) > 16384 && o0VarE.B(fVar2)) || (i17 & 24576) == 16384);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z15) {
                cbVar = new cb(((Number) fVar.getStart()).floatValue(), ((Number) fVar.b()).floatValue(), i19, aVar, fVar2);
                aVar2 = aVar;
                o0VarE.K(cbVar);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    cbVar = new cb(((Number) fVar.getStart()).floatValue(), ((Number) fVar.b()).floatValue(), i19, aVar, fVar2);
                    aVar2 = aVar;
                    o0VarE.K(cbVar);
                } else {
                    cbVar = objQ;
                    aVar2 = aVar;
                }
            }
            cb cbVar2 = (cb) cbVar;
            cbVar2.f87741b = aVar2;
            boolean z16 = (i17 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z16) {
                objQ2 = new fb0.d(lVar, 19);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new fb0.d(lVar, 19);
                    o0VarE.K(objQ2);
                }
            }
            cbVar2.f87745f = (e23.l) objQ2;
            cbVar2.h(((Number) fVar.getStart()).floatValue());
            cbVar2.g(((Number) fVar.b()).floatValue());
            int i26 = i17 >> 9;
            int i27 = i25 << 21;
            qVar2 = qVarC;
            a(cbVar2, rVar, z14, null, jVar, jVar2, eVar, eVar2, qVar2, o0VarE, (i26 & 3670016) | ((i17 >> 3) & 1008) | (i26 & 57344) | (458752 & i26) | (29360128 & i27) | (i27 & 234881024));
        } else {
            o0VarE.e();
            qVar2 = qVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cw1.l0(fVar, lVar, rVar, z14, fVar2, aVar, ucVar, jVar, jVar2, eVar, eVar2, qVar2, i14, i15, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x029a  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:77:0x013a  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:98:0x020a  */
    public static final void c(h4.r rVar, final cb cbVar, final boolean z14, a2.j jVar, a2.j jVar2, z3.e eVar, z3.e eVar2, e23.q qVar, p3.m mVar, int i14) {
        int i15;
        a2.j jVar3;
        e23.q qVar2;
        h4.r rVar2;
        e23.q qVar3 = qVar;
        p3.z1 z1Var = cbVar.f87743d;
        p3.z1 z1Var2 = cbVar.f87744e;
        p3.o0 o0VarE = mVar.E(-287468326);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(cbVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(jVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(jVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(eVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(qVar3) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean z15 = o0VarE.A(kotlin.t1.f91496n) == g6.o.Rtl;
            p3.c2 c2Var = cbVar.f87755p;
            j23.f<Float> fVar = cbVar.f87742c;
            c2Var.setValue(Boolean.valueOf(z15));
            h4.r.a aVar = h4.r.S;
            if (z14) {
                qd qdVar = new qd(cbVar, jVar, jVar2);
                b5.q qVar4 = b5.s0.f15885a;
                b5.r0 r0Var = new b5.r0(null, null, new Object[]{jVar, jVar2, cbVar}, qdVar, 3, null);
                aVar.getClass();
                rVar2 = r0Var;
            } else {
                rVar2 = aVar;
            }
            int i16 = l3.n1.f109367b;
            String strH = l3.k.h(o0VarE, R.string.range_start);
            String strH2 = l3.k.h(o0VarE, R.string.range_end);
            f5.p pVar = p7.f89279a;
            h4.r rVarThen = c2.x2.o(rVar.then(d8.f87832a), f88705b, f88704a, 0.0f, 0.0f, 12).then(rVar2);
            boolean zR = o0VarE.r(cbVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new md(cbVar);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new md(cbVar);
                    o0VarE.K(objQ);
                }
            }
            f5.z0 z0Var = (f5.z0) objQ;
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            int i17 = i15;
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
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            p3.b4.c(eVar3, z0Var, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            p3.b4.c(fVar2, rVarC, o0VarE);
            h4.r rVarZ = c2.x2.z(f5.g0.e(aVar, ya.STARTTHUMB), null, 3);
            boolean zR2 = o0VarE.r(cbVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new bb(cbVar, 1);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new bb(cbVar, 1);
                    o0VarE.K(objQ2);
                }
            }
            h4.r rVarG = f5.g0.g(rVarZ, (e23.l) objQ2);
            final j23.e eVar4 = new j23.e(fVar.getStart().floatValue(), z1Var2.getFloatValue());
            final int i18 = 1;
            h4.r rVarC2 = p5.v.c(new e23.l() { // from class: i3.jd
                @Override // e23.l
                public final Object invoke(Object obj) {
                    p5.k0 k0Var = (p5.k0) obj;
                    switch (i18) {
                        case 0:
                            if (!z14) {
                                p5.h0.b(k0Var);
                            }
                            final cb cbVar2 = cbVar;
                            p5.h0.z(k0Var, kd.l(cbVar2.f87744e.getFloatValue()));
                            final int i19 = 0;
                            final j23.e eVar5 = eVar4;
                            p5.h0.u(k0Var, new e23.l() { // from class: i3.fd
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    boolean z16;
                                    int iC;
                                    boolean z17;
                                    boolean z18;
                                    int iD;
                                    int i24 = i19;
                                    boolean z19 = true;
                                    cb cbVar3 = cbVar2;
                                    j23.e eVar6 = eVar5;
                                    switch (i24) {
                                        case 0:
                                            p3.z1 z1Var3 = cbVar3.f87743d;
                                            p3.z1 z1Var4 = cbVar3.f87744e;
                                            float fFloatValue = ((Float) obj2).floatValue();
                                            float f14 = eVar6.f96789a;
                                            float fFloatValue2 = Float.valueOf(f14).floatValue();
                                            float f15 = eVar6.f96790b;
                                            float fD = j23.t.d(fFloatValue, fFloatValue2, Float.valueOf(f15).floatValue());
                                            if (cbVar3.c() > 0 && (iC = cbVar3.c() + 1) >= 0) {
                                                int i25 = 0;
                                                float fAbs = fD;
                                                float f16 = fAbs;
                                                while (true) {
                                                    float fJ = gl.b.J(Float.valueOf(f14).floatValue(), Float.valueOf(f15).floatValue(), i25 / (cbVar3.c() + 1));
                                                    float f17 = fJ - fD;
                                                    if (Math.abs(f17) <= fAbs) {
                                                        fAbs = Math.abs(f17);
                                                        f16 = fJ;
                                                    }
                                                    if (i25 != iC) {
                                                        i25++;
                                                    } else {
                                                        fD = f16;
                                                    }
                                                }
                                            }
                                            if (fD == z1Var4.getFloatValue()) {
                                                z16 = false;
                                            } else {
                                                long jH = kd.h(z1Var3.getFloatValue(), fD);
                                                long jH2 = kd.h(z1Var3.getFloatValue(), z1Var4.getFloatValue());
                                                td.a aVar4 = td.f89800b;
                                                if (jH != jH2) {
                                                    e23.l<? super td, Unit> lVar = cbVar3.f87745f;
                                                    if (lVar != null) {
                                                        lVar.invoke(td.a(jH));
                                                    } else {
                                                        cbVar3.h(td.c(jH));
                                                        cbVar3.g(td.b(jH));
                                                    }
                                                }
                                                e23.a<Unit> aVar5 = cbVar3.f87741b;
                                                if (aVar5 != null) {
                                                    aVar5.invoke();
                                                }
                                                z16 = true;
                                            }
                                            return Boolean.valueOf(z16);
                                        default:
                                            p3.z1 z1Var5 = cbVar3.f87744e;
                                            p3.z1 z1Var6 = cbVar3.f87743d;
                                            float fFloatValue3 = ((Float) obj2).floatValue();
                                            float f18 = eVar6.f96789a;
                                            float fFloatValue4 = Float.valueOf(f18).floatValue();
                                            float f19 = eVar6.f96790b;
                                            float fD2 = j23.t.d(fFloatValue3, fFloatValue4, Float.valueOf(f19).floatValue());
                                            if (cbVar3.d() <= 0 || (iD = cbVar3.d() + 1) < 0) {
                                                z17 = true;
                                            } else {
                                                int i26 = 0;
                                                float fAbs2 = fD2;
                                                float f22 = fAbs2;
                                                while (true) {
                                                    z17 = z19;
                                                    float fJ2 = gl.b.J(Float.valueOf(f18).floatValue(), Float.valueOf(f19).floatValue(), i26 / (cbVar3.d() + 1));
                                                    float f24 = fJ2 - fD2;
                                                    if (Math.abs(f24) <= fAbs2) {
                                                        fAbs2 = Math.abs(f24);
                                                        f22 = fJ2;
                                                    }
                                                    if (i26 != iD) {
                                                        i26++;
                                                        z19 = z17;
                                                    } else {
                                                        fD2 = f22;
                                                    }
                                                }
                                            }
                                            if (fD2 == z1Var6.getFloatValue()) {
                                                z18 = false;
                                            } else {
                                                long jH3 = kd.h(fD2, z1Var5.getFloatValue());
                                                long jH4 = kd.h(z1Var6.getFloatValue(), z1Var5.getFloatValue());
                                                td.a aVar6 = td.f89800b;
                                                if (jH3 != jH4) {
                                                    e23.l<? super td, Unit> lVar2 = cbVar3.f87745f;
                                                    if (lVar2 != null) {
                                                        lVar2.invoke(td.a(jH3));
                                                    } else {
                                                        cbVar3.h(td.c(jH3));
                                                        cbVar3.g(td.b(jH3));
                                                    }
                                                }
                                                e23.a<Unit> aVar7 = cbVar3.f87741b;
                                                if (aVar7 != null) {
                                                    aVar7.invoke();
                                                }
                                                z18 = z17;
                                            }
                                            return Boolean.valueOf(z18);
                                    }
                                }
                            });
                            break;
                        default:
                            if (!z14) {
                                p5.h0.b(k0Var);
                            }
                            final cb cbVar3 = cbVar;
                            p5.h0.z(k0Var, kd.l(cbVar3.f87743d.getFloatValue()));
                            final int i24 = 1;
                            final j23.e eVar6 = eVar4;
                            p5.h0.u(k0Var, new e23.l() { // from class: i3.fd
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    boolean z16;
                                    int iC;
                                    boolean z17;
                                    boolean z18;
                                    int iD;
                                    int i25 = i24;
                                    boolean z19 = true;
                                    cb cbVar4 = cbVar3;
                                    j23.e eVar7 = eVar6;
                                    switch (i25) {
                                        case 0:
                                            p3.z1 z1Var3 = cbVar4.f87743d;
                                            p3.z1 z1Var4 = cbVar4.f87744e;
                                            float fFloatValue = ((Float) obj2).floatValue();
                                            float f14 = eVar7.f96789a;
                                            float fFloatValue2 = Float.valueOf(f14).floatValue();
                                            float f15 = eVar7.f96790b;
                                            float fD = j23.t.d(fFloatValue, fFloatValue2, Float.valueOf(f15).floatValue());
                                            if (cbVar4.c() > 0 && (iC = cbVar4.c() + 1) >= 0) {
                                                int i26 = 0;
                                                float fAbs = fD;
                                                float f16 = fAbs;
                                                while (true) {
                                                    float fJ = gl.b.J(Float.valueOf(f14).floatValue(), Float.valueOf(f15).floatValue(), i26 / (cbVar4.c() + 1));
                                                    float f17 = fJ - fD;
                                                    if (Math.abs(f17) <= fAbs) {
                                                        fAbs = Math.abs(f17);
                                                        f16 = fJ;
                                                    }
                                                    if (i26 != iC) {
                                                        i26++;
                                                    } else {
                                                        fD = f16;
                                                    }
                                                }
                                            }
                                            if (fD == z1Var4.getFloatValue()) {
                                                z16 = false;
                                            } else {
                                                long jH = kd.h(z1Var3.getFloatValue(), fD);
                                                long jH2 = kd.h(z1Var3.getFloatValue(), z1Var4.getFloatValue());
                                                td.a aVar4 = td.f89800b;
                                                if (jH != jH2) {
                                                    e23.l<? super td, Unit> lVar = cbVar4.f87745f;
                                                    if (lVar != null) {
                                                        lVar.invoke(td.a(jH));
                                                    } else {
                                                        cbVar4.h(td.c(jH));
                                                        cbVar4.g(td.b(jH));
                                                    }
                                                }
                                                e23.a<Unit> aVar5 = cbVar4.f87741b;
                                                if (aVar5 != null) {
                                                    aVar5.invoke();
                                                }
                                                z16 = true;
                                            }
                                            return Boolean.valueOf(z16);
                                        default:
                                            p3.z1 z1Var5 = cbVar4.f87744e;
                                            p3.z1 z1Var6 = cbVar4.f87743d;
                                            float fFloatValue3 = ((Float) obj2).floatValue();
                                            float f18 = eVar7.f96789a;
                                            float fFloatValue4 = Float.valueOf(f18).floatValue();
                                            float f19 = eVar7.f96790b;
                                            float fD2 = j23.t.d(fFloatValue3, fFloatValue4, Float.valueOf(f19).floatValue());
                                            if (cbVar4.d() <= 0 || (iD = cbVar4.d() + 1) < 0) {
                                                z17 = true;
                                            } else {
                                                int i27 = 0;
                                                float fAbs2 = fD2;
                                                float f22 = fAbs2;
                                                while (true) {
                                                    z17 = z19;
                                                    float fJ2 = gl.b.J(Float.valueOf(f18).floatValue(), Float.valueOf(f19).floatValue(), i27 / (cbVar4.d() + 1));
                                                    float f24 = fJ2 - fD2;
                                                    if (Math.abs(f24) <= fAbs2) {
                                                        fAbs2 = Math.abs(f24);
                                                        f22 = fJ2;
                                                    }
                                                    if (i27 != iD) {
                                                        i27++;
                                                        z19 = z17;
                                                    } else {
                                                        fD2 = f22;
                                                    }
                                                }
                                            }
                                            if (fD2 == z1Var6.getFloatValue()) {
                                                z18 = false;
                                            } else {
                                                long jH3 = kd.h(fD2, z1Var5.getFloatValue());
                                                long jH4 = kd.h(z1Var6.getFloatValue(), z1Var5.getFloatValue());
                                                td.a aVar6 = td.f89800b;
                                                if (jH3 != jH4) {
                                                    e23.l<? super td, Unit> lVar2 = cbVar4.f87745f;
                                                    if (lVar2 != null) {
                                                        lVar2.invoke(td.a(jH3));
                                                    } else {
                                                        cbVar4.h(td.c(jH3));
                                                        cbVar4.g(td.b(jH3));
                                                    }
                                                }
                                                e23.a<Unit> aVar7 = cbVar4.f87741b;
                                                if (aVar7 != null) {
                                                    aVar7.invoke();
                                                }
                                                z18 = z17;
                                            }
                                            return Boolean.valueOf(z18);
                                    }
                                }
                            });
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, rVarG, false);
            h4.r rVar3 = l3.c.f109191c;
            h4.r rVarC3 = p5.v.c(new qe2.d(z1Var.getFloatValue(), eVar4, cbVar.d()), rVarC2.then(rVar3), true);
            boolean zB = o0VarE.B(strH);
            Object objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new i11.g(strH, 10);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new i11.g(strH, 10);
                    o0VarE.K(objQ3);
                }
            }
            h4.r rVarA = u1.m0.a(p5.v.c((e23.l) objQ3, rVarC3, true), z14, jVar);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iP2 = o0VarE.P();
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(rVarA, o0VarE);
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
            p3.b4.c(eVar3, z0VarD, o0VarE);
            p3.b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                v.h.A(iP2, o0VarE, iP2, bVar);
            }
            p3.b4.c(fVar2, rVarC4, o0VarE);
            c2.u uVar = c2.u.f22885a;
            int i19 = (i17 >> 3) & 14;
            eVar.invoke(cbVar, o0VarE, Integer.valueOf(((i17 >> 12) & 112) | i19));
            o0VarE.g0(true);
            h4.r rVarZ2 = c2.x2.z(f5.g0.e(aVar, ya.ENDTHUMB), null, 3);
            boolean zR3 = o0VarE.r(cbVar);
            Object objQ4 = o0VarE.q();
            if (zR3) {
                objQ4 = new bb(cbVar, 2);
                o0VarE.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new bb(cbVar, 2);
                    o0VarE.K(objQ4);
                }
            }
            h4.r rVarG2 = f5.g0.g(rVarZ2, (e23.l) objQ4);
            final j23.e eVar5 = new j23.e(z1Var.getFloatValue(), fVar.b().floatValue());
            final int i24 = 0;
            h4.r rVarC5 = p5.v.c(new qe2.d(z1Var2.getFloatValue(), eVar5, cbVar.c()), p5.v.c(new e23.l() { // from class: i3.jd
                @Override // e23.l
                public final Object invoke(Object obj) {
                    p5.k0 k0Var = (p5.k0) obj;
                    switch (i24) {
                        case 0:
                            if (!z14) {
                                p5.h0.b(k0Var);
                            }
                            final cb cbVar2 = cbVar;
                            p5.h0.z(k0Var, kd.l(cbVar2.f87744e.getFloatValue()));
                            final int i110 = 0;
                            final j23.e eVar6 = eVar5;
                            p5.h0.u(k0Var, new e23.l() { // from class: i3.fd
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    boolean z16;
                                    int iC;
                                    boolean z17;
                                    boolean z18;
                                    int iD;
                                    int i25 = i110;
                                    boolean z19 = true;
                                    cb cbVar4 = cbVar2;
                                    j23.e eVar7 = eVar6;
                                    switch (i25) {
                                        case 0:
                                            p3.z1 z1Var3 = cbVar4.f87743d;
                                            p3.z1 z1Var4 = cbVar4.f87744e;
                                            float fFloatValue = ((Float) obj2).floatValue();
                                            float f14 = eVar7.f96789a;
                                            float fFloatValue2 = Float.valueOf(f14).floatValue();
                                            float f15 = eVar7.f96790b;
                                            float fD = j23.t.d(fFloatValue, fFloatValue2, Float.valueOf(f15).floatValue());
                                            if (cbVar4.c() > 0 && (iC = cbVar4.c() + 1) >= 0) {
                                                int i26 = 0;
                                                float fAbs = fD;
                                                float f16 = fAbs;
                                                while (true) {
                                                    float fJ = gl.b.J(Float.valueOf(f14).floatValue(), Float.valueOf(f15).floatValue(), i26 / (cbVar4.c() + 1));
                                                    float f17 = fJ - fD;
                                                    if (Math.abs(f17) <= fAbs) {
                                                        fAbs = Math.abs(f17);
                                                        f16 = fJ;
                                                    }
                                                    if (i26 != iC) {
                                                        i26++;
                                                    } else {
                                                        fD = f16;
                                                    }
                                                }
                                            }
                                            if (fD == z1Var4.getFloatValue()) {
                                                z16 = false;
                                            } else {
                                                long jH = kd.h(z1Var3.getFloatValue(), fD);
                                                long jH2 = kd.h(z1Var3.getFloatValue(), z1Var4.getFloatValue());
                                                td.a aVar4 = td.f89800b;
                                                if (jH != jH2) {
                                                    e23.l<? super td, Unit> lVar = cbVar4.f87745f;
                                                    if (lVar != null) {
                                                        lVar.invoke(td.a(jH));
                                                    } else {
                                                        cbVar4.h(td.c(jH));
                                                        cbVar4.g(td.b(jH));
                                                    }
                                                }
                                                e23.a<Unit> aVar5 = cbVar4.f87741b;
                                                if (aVar5 != null) {
                                                    aVar5.invoke();
                                                }
                                                z16 = true;
                                            }
                                            return Boolean.valueOf(z16);
                                        default:
                                            p3.z1 z1Var5 = cbVar4.f87744e;
                                            p3.z1 z1Var6 = cbVar4.f87743d;
                                            float fFloatValue3 = ((Float) obj2).floatValue();
                                            float f18 = eVar7.f96789a;
                                            float fFloatValue4 = Float.valueOf(f18).floatValue();
                                            float f19 = eVar7.f96790b;
                                            float fD2 = j23.t.d(fFloatValue3, fFloatValue4, Float.valueOf(f19).floatValue());
                                            if (cbVar4.d() <= 0 || (iD = cbVar4.d() + 1) < 0) {
                                                z17 = true;
                                            } else {
                                                int i27 = 0;
                                                float fAbs2 = fD2;
                                                float f22 = fAbs2;
                                                while (true) {
                                                    z17 = z19;
                                                    float fJ2 = gl.b.J(Float.valueOf(f18).floatValue(), Float.valueOf(f19).floatValue(), i27 / (cbVar4.d() + 1));
                                                    float f24 = fJ2 - fD2;
                                                    if (Math.abs(f24) <= fAbs2) {
                                                        fAbs2 = Math.abs(f24);
                                                        f22 = fJ2;
                                                    }
                                                    if (i27 != iD) {
                                                        i27++;
                                                        z19 = z17;
                                                    } else {
                                                        fD2 = f22;
                                                    }
                                                }
                                            }
                                            if (fD2 == z1Var6.getFloatValue()) {
                                                z18 = false;
                                            } else {
                                                long jH3 = kd.h(fD2, z1Var5.getFloatValue());
                                                long jH4 = kd.h(z1Var6.getFloatValue(), z1Var5.getFloatValue());
                                                td.a aVar6 = td.f89800b;
                                                if (jH3 != jH4) {
                                                    e23.l<? super td, Unit> lVar2 = cbVar4.f87745f;
                                                    if (lVar2 != null) {
                                                        lVar2.invoke(td.a(jH3));
                                                    } else {
                                                        cbVar4.h(td.c(jH3));
                                                        cbVar4.g(td.b(jH3));
                                                    }
                                                }
                                                e23.a<Unit> aVar7 = cbVar4.f87741b;
                                                if (aVar7 != null) {
                                                    aVar7.invoke();
                                                }
                                                z18 = z17;
                                            }
                                            return Boolean.valueOf(z18);
                                    }
                                }
                            });
                            break;
                        default:
                            if (!z14) {
                                p5.h0.b(k0Var);
                            }
                            final cb cbVar3 = cbVar;
                            p5.h0.z(k0Var, kd.l(cbVar3.f87743d.getFloatValue()));
                            final int i25 = 1;
                            final j23.e eVar7 = eVar5;
                            p5.h0.u(k0Var, new e23.l() { // from class: i3.fd
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    boolean z16;
                                    int iC;
                                    boolean z17;
                                    boolean z18;
                                    int iD;
                                    int i26 = i25;
                                    boolean z19 = true;
                                    cb cbVar4 = cbVar3;
                                    j23.e eVar8 = eVar7;
                                    switch (i26) {
                                        case 0:
                                            p3.z1 z1Var3 = cbVar4.f87743d;
                                            p3.z1 z1Var4 = cbVar4.f87744e;
                                            float fFloatValue = ((Float) obj2).floatValue();
                                            float f14 = eVar8.f96789a;
                                            float fFloatValue2 = Float.valueOf(f14).floatValue();
                                            float f15 = eVar8.f96790b;
                                            float fD = j23.t.d(fFloatValue, fFloatValue2, Float.valueOf(f15).floatValue());
                                            if (cbVar4.c() > 0 && (iC = cbVar4.c() + 1) >= 0) {
                                                int i27 = 0;
                                                float fAbs = fD;
                                                float f16 = fAbs;
                                                while (true) {
                                                    float fJ = gl.b.J(Float.valueOf(f14).floatValue(), Float.valueOf(f15).floatValue(), i27 / (cbVar4.c() + 1));
                                                    float f17 = fJ - fD;
                                                    if (Math.abs(f17) <= fAbs) {
                                                        fAbs = Math.abs(f17);
                                                        f16 = fJ;
                                                    }
                                                    if (i27 != iC) {
                                                        i27++;
                                                    } else {
                                                        fD = f16;
                                                    }
                                                }
                                            }
                                            if (fD == z1Var4.getFloatValue()) {
                                                z16 = false;
                                            } else {
                                                long jH = kd.h(z1Var3.getFloatValue(), fD);
                                                long jH2 = kd.h(z1Var3.getFloatValue(), z1Var4.getFloatValue());
                                                td.a aVar4 = td.f89800b;
                                                if (jH != jH2) {
                                                    e23.l<? super td, Unit> lVar = cbVar4.f87745f;
                                                    if (lVar != null) {
                                                        lVar.invoke(td.a(jH));
                                                    } else {
                                                        cbVar4.h(td.c(jH));
                                                        cbVar4.g(td.b(jH));
                                                    }
                                                }
                                                e23.a<Unit> aVar5 = cbVar4.f87741b;
                                                if (aVar5 != null) {
                                                    aVar5.invoke();
                                                }
                                                z16 = true;
                                            }
                                            return Boolean.valueOf(z16);
                                        default:
                                            p3.z1 z1Var5 = cbVar4.f87744e;
                                            p3.z1 z1Var6 = cbVar4.f87743d;
                                            float fFloatValue3 = ((Float) obj2).floatValue();
                                            float f18 = eVar8.f96789a;
                                            float fFloatValue4 = Float.valueOf(f18).floatValue();
                                            float f19 = eVar8.f96790b;
                                            float fD2 = j23.t.d(fFloatValue3, fFloatValue4, Float.valueOf(f19).floatValue());
                                            if (cbVar4.d() <= 0 || (iD = cbVar4.d() + 1) < 0) {
                                                z17 = true;
                                            } else {
                                                int i28 = 0;
                                                float fAbs2 = fD2;
                                                float f22 = fAbs2;
                                                while (true) {
                                                    z17 = z19;
                                                    float fJ2 = gl.b.J(Float.valueOf(f18).floatValue(), Float.valueOf(f19).floatValue(), i28 / (cbVar4.d() + 1));
                                                    float f24 = fJ2 - fD2;
                                                    if (Math.abs(f24) <= fAbs2) {
                                                        fAbs2 = Math.abs(f24);
                                                        f22 = fJ2;
                                                    }
                                                    if (i28 != iD) {
                                                        i28++;
                                                        z19 = z17;
                                                    } else {
                                                        fD2 = f22;
                                                    }
                                                }
                                            }
                                            if (fD2 == z1Var6.getFloatValue()) {
                                                z18 = false;
                                            } else {
                                                long jH3 = kd.h(fD2, z1Var5.getFloatValue());
                                                long jH4 = kd.h(z1Var6.getFloatValue(), z1Var5.getFloatValue());
                                                td.a aVar6 = td.f89800b;
                                                if (jH3 != jH4) {
                                                    e23.l<? super td, Unit> lVar2 = cbVar4.f87745f;
                                                    if (lVar2 != null) {
                                                        lVar2.invoke(td.a(jH3));
                                                    } else {
                                                        cbVar4.h(td.c(jH3));
                                                        cbVar4.g(td.b(jH3));
                                                    }
                                                }
                                                e23.a<Unit> aVar7 = cbVar4.f87741b;
                                                if (aVar7 != null) {
                                                    aVar7.invoke();
                                                }
                                                z18 = z17;
                                            }
                                            return Boolean.valueOf(z18);
                                    }
                                }
                            });
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, rVarG2, false).then(rVar3), true);
            boolean zB2 = o0VarE.B(strH2);
            Object objQ5 = o0VarE.q();
            if (zB2) {
                objQ5 = new i11.g(strH2, 11);
                o0VarE.K(objQ5);
            } else {
                aVar2.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new i11.g(strH2, 11);
                    o0VarE.K(objQ5);
                }
            }
            jVar3 = jVar2;
            h4.r rVarA2 = u1.m0.a(p5.v.c((e23.l) objQ5, rVarC5, true), z14, jVar3);
            f5.z0 z0VarD2 = c2.q.d(gVar, false);
            int iP3 = o0VarE.P();
            p3.i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC6 = h4.k.c(rVarA2, o0VarE);
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
            p3.b4.c(eVar3, z0VarD2, o0VarE);
            p3.b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP3))) {
                v.h.A(iP3, o0VarE, iP3, bVar);
            }
            p3.b4.c(fVar2, rVarC6, o0VarE);
            qVar2 = eVar2;
            qVar2.invoke(cbVar, o0VarE, Integer.valueOf(i19 | ((i17 >> 15) & 112)));
            o0VarE.g0(true);
            h4.r rVarE = f5.g0.e(aVar, ya.TRACK);
            f5.z0 z0VarD3 = c2.q.d(gVar, false);
            int iP4 = o0VarE.P();
            p3.i2 i2VarA3 = o0VarE.a0();
            h4.r rVarC7 = h4.k.c(rVarE, o0VarE);
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
            p3.b4.c(eVar3, z0VarD3, o0VarE);
            p3.b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP4))) {
                v.h.A(iP4, o0VarE, iP4, bVar);
            }
            p3.b4.c(fVar2, rVarC7, o0VarE);
            qVar3 = qVar;
            qVar3.invoke(cbVar, o0VarE, Integer.valueOf(i19 | ((i17 >> 18) & 112)));
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            jVar3 = jVar2;
            qVar2 = eVar2;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e52.d(rVar, cbVar, z14, jVar, jVar3, eVar, qVar2, qVar3, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x0131  */
    /* JADX WARN: Code duplicated, block: B:110:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:113:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x014b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x016a  */
    /* JADX WARN: Code duplicated, block: B:123:0x016d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0176  */
    /* JADX WARN: Code duplicated, block: B:128:0x017c  */
    /* JADX WARN: Code duplicated, block: B:133:0x018a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0191  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    public static final void d(final float f14, final e23.l lVar, final h4.r rVar, boolean z14, e23.a aVar, final uc ucVar, a2.j jVar, final int i14, final z3.e eVar, final z3.e eVar2, final j23.f fVar, p3.m mVar, final int i15, final int i16, final int i17) {
        int i18;
        boolean z15;
        int i19;
        e23.a aVar2;
        int i24;
        int i25;
        a2.j jVar2;
        int i26;
        int i27;
        int i28;
        boolean z16;
        p3.o0 o0Var;
        final boolean z17;
        final a2.j jVar3;
        final e23.a aVar3;
        p3.p2 p2VarI0;
        int i29;
        p3.m.a aVar4;
        e23.a aVar5;
        Object objQ;
        boolean z18;
        boolean z19;
        Object objQ2;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        p3.o0 o0VarE = mVar.E(985901935);
        if ((i15 & 6) == 0) {
            i18 = (o0VarE.i(f14) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i18 |= o0VarE.B(rVar) ? 256 : 128;
        }
        int i38 = i17 & 8;
        if (i38 == 0) {
            if ((i15 & 3072) == 0) {
                z15 = z14;
                i18 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            i19 = i17 & 16;
            if (i19 != 0) {
                if ((i15 & 24576) == 0) {
                    aVar2 = aVar;
                    if (o0VarE.r(aVar2)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i18 |= i24;
                }
                if ((196608 & i15) != 0) {
                    if (o0VarE.B(ucVar)) {
                        i37 = 131072;
                    } else {
                        i37 = 65536;
                    }
                    i18 |= i37;
                }
                i25 = i17 & 64;
                if (i25 != 0) {
                    i18 |= 1572864;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i15 & 1572864) == 0) {
                        if (o0VarE.B(jVar2)) {
                            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i26 = 524288;
                        }
                        i18 |= i26;
                    }
                }
                if ((i15 & 12582912) == 0) {
                    if (o0VarE.k(i14)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i18 |= i36;
                }
                if ((i15 & 100663296) == 0) {
                    if (o0VarE.r(eVar)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i18 |= i35;
                }
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    int i39 = i18;
                    if (o0VarE.r(eVar2)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i27 = i39 | i34;
                } else {
                    i27 = i18;
                }
                if ((i16 & 6) == 0) {
                    if (o0VarE.B(fVar)) {
                        i30 = 4;
                    } else {
                        i30 = 2;
                    }
                    i28 = i16 | i30;
                } else {
                    i28 = i16;
                }
                if ((i27 & 306783379) == 306783378 || (i28 & 3) != 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i27 & 1, z16)) {
                    o0VarE.G0();
                    i29 = i15 & 1;
                    aVar4 = p3.m.f135153a;
                    if (i29 != 0 || o0VarE.o0()) {
                        if (i38 != 0) {
                            z15 = true;
                        }
                        if (i19 != 0) {
                            aVar5 = null;
                        } else {
                            aVar5 = aVar2;
                        }
                        if (i25 != 0) {
                            objQ = o0VarE.q();
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar2 = (a2.j) objQ;
                        }
                    } else {
                        o0VarE.e();
                        aVar5 = aVar2;
                    }
                    a2.j jVar4 = jVar2;
                    boolean z24 = z15;
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    if ((i27 & 29360128) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | ((((i28 & 14) ^ 6) <= 4 && o0VarE.B(fVar)) || (i28 & 6) == 4);
                    objQ2 = o0VarE.q();
                    if (z19) {
                        objQ2 = new ud(f14, i14, aVar5, fVar);
                        o0VarE.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ud(f14, i14, aVar5, fVar);
                            o0VarE.K(objQ2);
                        }
                    }
                    ud udVar = (ud) objQ2;
                    udVar.f89911b = aVar5;
                    udVar.f89914e = lVar;
                    udVar.d(f14);
                    int i44 = i27 >> 9;
                    o0Var = o0VarE;
                    f(udVar, rVar, z24, null, jVar4, eVar, eVar2, o0Var, ((i27 >> 3) & 1008) | ((i27 >> 6) & 57344) | (458752 & i44) | (i44 & 3670016));
                    aVar3 = aVar5;
                    z17 = z24;
                    jVar3 = jVar4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z17 = z15;
                    jVar3 = jVar2;
                    aVar3 = aVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: i3.hd
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(i15 | 1);
                            int iT2 = p3.p0.t(i16);
                            kd.d(f14, lVar, rVar, z17, aVar3, ucVar, jVar3, i14, eVar, eVar2, fVar, (p3.m) obj, iT, iT2, i17);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i18 |= 24576;
            aVar2 = aVar;
            if ((196608 & i15) != 0) {
                if (o0VarE.B(ucVar)) {
                    i37 = 131072;
                } else {
                    i37 = 65536;
                }
                i18 |= i37;
            }
            i25 = i17 & 64;
            if (i25 != 0) {
                i18 |= 1572864;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i15 & 1572864) == 0) {
                    if (o0VarE.B(jVar2)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i18 |= i26;
                }
            }
            if ((i15 & 12582912) == 0) {
                if (o0VarE.k(i14)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i18 |= i36;
            }
            if ((i15 & 100663296) == 0) {
                if (o0VarE.r(eVar)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i18 |= i35;
            }
            if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                int i310 = i18;
                if (o0VarE.r(eVar2)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i27 = i310 | i34;
            } else {
                i27 = i18;
            }
            if ((i16 & 6) == 0) {
                if (o0VarE.B(fVar)) {
                    i30 = 4;
                } else {
                    i30 = 2;
                }
                i28 = i16 | i30;
            } else {
                i28 = i16;
            }
            if ((i27 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i27 & 1, z16)) {
                o0VarE.G0();
                i29 = i15 & 1;
                aVar4 = p3.m.f135153a;
                if (i29 != 0) {
                    if (i38 != 0) {
                        z15 = true;
                    }
                    if (i19 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar2;
                    }
                    if (i25 != 0) {
                        objQ = o0VarE.q();
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar2 = (a2.j) objQ;
                    }
                } else {
                    if (i38 != 0) {
                        z15 = true;
                    }
                    if (i19 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar2;
                    }
                    if (i25 != 0) {
                        objQ = o0VarE.q();
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar2 = (a2.j) objQ;
                    }
                }
                a2.j jVar5 = jVar2;
                boolean z25 = z15;
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                if ((i27 & 29360128) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | ((((i28 & 14) ^ 6) <= 4 && o0VarE.B(fVar)) || (i28 & 6) == 4);
                objQ2 = o0VarE.q();
                if (z19) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ud(f14, i14, aVar5, fVar);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new ud(f14, i14, aVar5, fVar);
                    o0VarE.K(objQ2);
                }
                ud udVar2 = (ud) objQ2;
                udVar2.f89911b = aVar5;
                udVar2.f89914e = lVar;
                udVar2.d(f14);
                int i45 = i27 >> 9;
                o0Var = o0VarE;
                f(udVar2, rVar, z25, null, jVar5, eVar, eVar2, o0Var, ((i27 >> 3) & 1008) | ((i27 >> 6) & 57344) | (458752 & i45) | (i45 & 3670016));
                aVar3 = aVar5;
                z17 = z25;
                jVar3 = jVar5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
                jVar3 = jVar2;
                aVar3 = aVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: i3.hd
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i15 | 1);
                        int iT2 = p3.p0.t(i16);
                        kd.d(f14, lVar, rVar, z17, aVar3, ucVar, jVar3, i14, eVar, eVar2, fVar, (p3.m) obj, iT, iT2, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i18 |= 3072;
        z15 = z14;
        i19 = i17 & 16;
        if (i19 != 0) {
            if ((i15 & 24576) == 0) {
                aVar2 = aVar;
                if (o0VarE.r(aVar2)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i18 |= i24;
            }
            if ((196608 & i15) != 0) {
                if (o0VarE.B(ucVar)) {
                    i37 = 131072;
                } else {
                    i37 = 65536;
                }
                i18 |= i37;
            }
            i25 = i17 & 64;
            if (i25 != 0) {
                i18 |= 1572864;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i15 & 1572864) == 0) {
                    if (o0VarE.B(jVar2)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i18 |= i26;
                }
            }
            if ((i15 & 12582912) == 0) {
                if (o0VarE.k(i14)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i18 |= i36;
            }
            if ((i15 & 100663296) == 0) {
                if (o0VarE.r(eVar)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i18 |= i35;
            }
            if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                int i311 = i18;
                if (o0VarE.r(eVar2)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i27 = i311 | i34;
            } else {
                i27 = i18;
            }
            if ((i16 & 6) == 0) {
                if (o0VarE.B(fVar)) {
                    i30 = 4;
                } else {
                    i30 = 2;
                }
                i28 = i16 | i30;
            } else {
                i28 = i16;
            }
            if ((i27 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i27 & 1, z16)) {
                o0VarE.G0();
                i29 = i15 & 1;
                aVar4 = p3.m.f135153a;
                if (i29 != 0) {
                    if (i38 != 0) {
                        z15 = true;
                    }
                    if (i19 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar2;
                    }
                    if (i25 != 0) {
                        objQ = o0VarE.q();
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar2 = (a2.j) objQ;
                    }
                } else {
                    if (i38 != 0) {
                        z15 = true;
                    }
                    if (i19 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar2;
                    }
                    if (i25 != 0) {
                        objQ = o0VarE.q();
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar2 = (a2.j) objQ;
                    }
                }
                a2.j jVar6 = jVar2;
                boolean z26 = z15;
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                if ((i27 & 29360128) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | ((((i28 & 14) ^ 6) <= 4 && o0VarE.B(fVar)) || (i28 & 6) == 4);
                objQ2 = o0VarE.q();
                if (z19) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ud(f14, i14, aVar5, fVar);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new ud(f14, i14, aVar5, fVar);
                    o0VarE.K(objQ2);
                }
                ud udVar3 = (ud) objQ2;
                udVar3.f89911b = aVar5;
                udVar3.f89914e = lVar;
                udVar3.d(f14);
                int i46 = i27 >> 9;
                o0Var = o0VarE;
                f(udVar3, rVar, z26, null, jVar6, eVar, eVar2, o0Var, ((i27 >> 3) & 1008) | ((i27 >> 6) & 57344) | (458752 & i46) | (i46 & 3670016));
                aVar3 = aVar5;
                z17 = z26;
                jVar3 = jVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
                jVar3 = jVar2;
                aVar3 = aVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: i3.hd
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i15 | 1);
                        int iT2 = p3.p0.t(i16);
                        kd.d(f14, lVar, rVar, z17, aVar3, ucVar, jVar3, i14, eVar, eVar2, fVar, (p3.m) obj, iT, iT2, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i18 |= 24576;
        aVar2 = aVar;
        if ((196608 & i15) != 0) {
            if (o0VarE.B(ucVar)) {
                i37 = 131072;
            } else {
                i37 = 65536;
            }
            i18 |= i37;
        }
        i25 = i17 & 64;
        if (i25 != 0) {
            i18 |= 1572864;
            jVar2 = jVar;
        } else {
            jVar2 = jVar;
            if ((i15 & 1572864) == 0) {
                if (o0VarE.B(jVar2)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i18 |= i26;
            }
        }
        if ((i15 & 12582912) == 0) {
            if (o0VarE.k(i14)) {
                i36 = 8388608;
            } else {
                i36 = 4194304;
            }
            i18 |= i36;
        }
        if ((i15 & 100663296) == 0) {
            if (o0VarE.r(eVar)) {
                i35 = 67108864;
            } else {
                i35 = 33554432;
            }
            i18 |= i35;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            int i312 = i18;
            if (o0VarE.r(eVar2)) {
                i34 = 536870912;
            } else {
                i34 = 268435456;
            }
            i27 = i312 | i34;
        } else {
            i27 = i18;
        }
        if ((i16 & 6) == 0) {
            if (o0VarE.B(fVar)) {
                i30 = 4;
            } else {
                i30 = 2;
            }
            i28 = i16 | i30;
        } else {
            i28 = i16;
        }
        if ((i27 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (o0VarE.n(i27 & 1, z16)) {
            o0VarE.G0();
            i29 = i15 & 1;
            aVar4 = p3.m.f135153a;
            if (i29 != 0) {
                if (i38 != 0) {
                    z15 = true;
                }
                if (i19 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar2;
                }
                if (i25 != 0) {
                    objQ = o0VarE.q();
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    jVar2 = (a2.j) objQ;
                }
            } else {
                if (i38 != 0) {
                    z15 = true;
                }
                if (i19 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar2;
                }
                if (i25 != 0) {
                    objQ = o0VarE.q();
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    jVar2 = (a2.j) objQ;
                }
            }
            a2.j jVar7 = jVar2;
            boolean z27 = z15;
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            if ((i27 & 29360128) == 8388608) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z18 | ((((i28 & 14) ^ 6) <= 4 && o0VarE.B(fVar)) || (i28 & 6) == 4);
            objQ2 = o0VarE.q();
            if (z19) {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ud(f14, i14, aVar5, fVar);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new ud(f14, i14, aVar5, fVar);
                o0VarE.K(objQ2);
            }
            ud udVar4 = (ud) objQ2;
            udVar4.f89911b = aVar5;
            udVar4.f89914e = lVar;
            udVar4.d(f14);
            int i47 = i27 >> 9;
            o0Var = o0VarE;
            f(udVar4, rVar, z27, null, jVar7, eVar, eVar2, o0Var, ((i27 >> 3) & 1008) | ((i27 >> 6) & 57344) | (458752 & i47) | (i47 & 3670016));
            aVar3 = aVar5;
            z17 = z27;
            jVar3 = jVar7;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z17 = z15;
            jVar3 = jVar2;
            aVar3 = aVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.hd
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i15 | 1);
                    int iT2 = p3.p0.t(i16);
                    kd.d(f14, lVar, rVar, z17, aVar3, ucVar, jVar3, i14, eVar, eVar2, fVar, (p3.m) obj, iT, iT2, i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:106:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:111:0x0139  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:115:0x0154  */
    /* JADX WARN: Code duplicated, block: B:118:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    public static final void e(float f14, e23.l<? super Float, Unit> lVar, h4.r rVar, boolean z14, j23.f<Float> fVar, int i14, e23.a<Unit> aVar, uc ucVar, a2.j jVar, p3.m mVar, int i15, int i16) {
        int i17;
        boolean z15;
        int i18;
        int i19;
        int i24;
        int i25;
        e23.a<Unit> aVar2;
        int i26;
        uc ucVarF;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z16;
        p3.o0 o0Var;
        boolean z17;
        e23.a<Unit> aVar3;
        uc ucVar2;
        a2.j jVar2;
        p3.p2 p2VarI0;
        a2.j jVar3;
        int i34;
        int i35;
        boolean z18;
        Object objQ;
        int i36;
        p3.o0 o0VarE = mVar.E(-202044027);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.i(f14) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(rVar) ? 256 : 128;
        }
        int i37 = i16 & 8;
        if (i37 == 0) {
            if ((i15 & 3072) == 0) {
                z15 = z14;
                i17 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            if ((i15 & 24576) == 0) {
                if (o0VarE.B(fVar)) {
                    i36 = 16384;
                } else {
                    i36 = 8192;
                }
                i17 |= i36;
            }
            i18 = i16 & 32;
            if (i18 != 0) {
                if ((196608 & i15) == 0) {
                    i19 = i14;
                    if (o0VarE.k(i19)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i17 |= i24;
                }
                i25 = i16 & 64;
                if (i25 != 0) {
                    if ((1572864 & i15) == 0) {
                        aVar2 = aVar;
                        if (o0VarE.r(aVar2)) {
                            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i26 = 524288;
                        }
                        i17 |= i26;
                    }
                    if ((12582912 & i15) == 0) {
                        if ((i16 & 128) == 0) {
                            ucVarF = ucVar;
                            int i38 = o0VarE.B(ucVarF) ? 8388608 : 4194304;
                            i17 |= i38;
                        } else {
                            ucVarF = ucVar;
                        }
                        i17 |= i38;
                    } else {
                        ucVarF = ucVar;
                    }
                    i27 = i16 & 256;
                    if (i27 != 0) {
                        i29 = i17 | 100663296;
                    } else {
                        i28 = i17;
                        if ((i15 & 100663296) == 0) {
                            if (o0VarE.B(jVar)) {
                                i30 = 67108864;
                            } else {
                                i30 = 33554432;
                            }
                            i29 = i28 | i30;
                        } else {
                            i29 = i28;
                        }
                    }
                    if ((i29 & 38347923) != 38347922) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i29 & 1, z16)) {
                        o0VarE.G0();
                        if ((i15 & 1) != 0 || o0VarE.o0()) {
                            boolean z19 = i37 == 0 ? z15 : true;
                            if (i18 != 0) {
                                i19 = 0;
                            }
                            if (i25 != 0) {
                                aVar2 = null;
                            }
                            if ((i16 & 128) != 0) {
                                dd.f87874a.getClass();
                                i29 &= -29360129;
                                ucVarF = dd.f(o0VarE);
                            }
                            if (i27 != 0) {
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = kg.f.b(o0VarE);
                                }
                                jVar3 = (a2.j) objQ;
                            } else {
                                jVar3 = jVar;
                            }
                            i34 = i19;
                            i35 = i29;
                            z18 = z19;
                        } else {
                            o0VarE.e();
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                            }
                            jVar3 = jVar;
                            z18 = z15;
                            i34 = i19;
                            i35 = i29;
                        }
                        e23.a<Unit> aVar4 = aVar2;
                        o0VarE.h0();
                        p3.x1 x1Var = p3.n.f135158a;
                        int i39 = i35 >> 6;
                        o0Var = o0VarE;
                        a2.j jVar4 = jVar3;
                        uc ucVar3 = ucVarF;
                        d(f14, lVar, rVar, z18, aVar4, ucVar3, jVar4, i34, z3.f.c(308249025, new b(jVar3, ucVarF, z18), o0VarE), z3.f.c(-1843234110, new c(z18, ucVarF), o0VarE), fVar, o0Var, (i35 & 14) | 905969664 | (i35 & 112) | (i35 & 896) | (i35 & 7168) | (57344 & i39) | (458752 & i39) | (i39 & 3670016) | (29360128 & (i35 << 6)), (i35 >> 12) & 14, 0);
                        z17 = z18;
                        aVar3 = aVar4;
                        ucVar2 = ucVar3;
                        jVar2 = jVar4;
                        i19 = i34;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        z17 = z15;
                        aVar3 = aVar2;
                        ucVar2 = ucVarF;
                        jVar2 = jVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new gd(f14, lVar, rVar, z17, fVar, i19, aVar3, ucVar2, jVar2, i15, i16);
                    }
                }
                i17 |= 1572864;
                aVar2 = aVar;
                if ((12582912 & i15) == 0) {
                    if ((i16 & 128) == 0) {
                        ucVarF = ucVar;
                        if (o0VarE.B(ucVarF)) {
                        }
                        i17 |= i38;
                    } else {
                        ucVarF = ucVar;
                    }
                    i17 |= i38;
                } else {
                    ucVarF = ucVar;
                }
                i27 = i16 & 256;
                if (i27 != 0) {
                    i29 = i17 | 100663296;
                } else {
                    i28 = i17;
                    if ((i15 & 100663296) == 0) {
                        if (o0VarE.B(jVar)) {
                            i30 = 67108864;
                        } else {
                            i30 = 33554432;
                        }
                        i29 = i28 | i30;
                    } else {
                        i29 = i28;
                    }
                }
                if ((i29 & 38347923) != 38347922) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i29 & 1, z16)) {
                    o0VarE.G0();
                    if ((i15 & 1) != 0) {
                        if (i37 == 0) {
                        }
                        if (i18 != 0) {
                            i19 = 0;
                        }
                        if (i25 != 0) {
                            aVar2 = null;
                        }
                        if ((i16 & 128) != 0) {
                            dd.f87874a.getClass();
                            i29 &= -29360129;
                            ucVarF = dd.f(o0VarE);
                        }
                        if (i27 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        i34 = i19;
                        i35 = i29;
                        z18 = z19;
                    } else {
                        if (i37 == 0) {
                        }
                        if (i18 != 0) {
                            i19 = 0;
                        }
                        if (i25 != 0) {
                            aVar2 = null;
                        }
                        if ((i16 & 128) != 0) {
                            dd.f87874a.getClass();
                            i29 &= -29360129;
                            ucVarF = dd.f(o0VarE);
                        }
                        if (i27 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        i34 = i19;
                        i35 = i29;
                        z18 = z19;
                    }
                    e23.a<Unit> aVar5 = aVar2;
                    o0VarE.h0();
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int i310 = i35 >> 6;
                    o0Var = o0VarE;
                    a2.j jVar5 = jVar3;
                    uc ucVar4 = ucVarF;
                    d(f14, lVar, rVar, z18, aVar5, ucVar4, jVar5, i34, z3.f.c(308249025, new b(jVar3, ucVarF, z18), o0VarE), z3.f.c(-1843234110, new c(z18, ucVarF), o0VarE), fVar, o0Var, (i35 & 14) | 905969664 | (i35 & 112) | (i35 & 896) | (i35 & 7168) | (57344 & i310) | (458752 & i310) | (i310 & 3670016) | (29360128 & (i35 << 6)), (i35 >> 12) & 14, 0);
                    z17 = z18;
                    aVar3 = aVar5;
                    ucVar2 = ucVar4;
                    jVar2 = jVar5;
                    i19 = i34;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z17 = z15;
                    aVar3 = aVar2;
                    ucVar2 = ucVarF;
                    jVar2 = jVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new gd(f14, lVar, rVar, z17, fVar, i19, aVar3, ucVar2, jVar2, i15, i16);
                }
            }
            i17 |= 196608;
            i19 = i14;
            i25 = i16 & 64;
            if (i25 != 0) {
                if ((1572864 & i15) == 0) {
                    aVar2 = aVar;
                    if (o0VarE.r(aVar2)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i17 |= i26;
                }
                if ((12582912 & i15) == 0) {
                    if ((i16 & 128) == 0) {
                        ucVarF = ucVar;
                        if (o0VarE.B(ucVarF)) {
                        }
                        i17 |= i38;
                    } else {
                        ucVarF = ucVar;
                    }
                    i17 |= i38;
                } else {
                    ucVarF = ucVar;
                }
                i27 = i16 & 256;
                if (i27 != 0) {
                    i29 = i17 | 100663296;
                } else {
                    i28 = i17;
                    if ((i15 & 100663296) == 0) {
                        if (o0VarE.B(jVar)) {
                            i30 = 67108864;
                        } else {
                            i30 = 33554432;
                        }
                        i29 = i28 | i30;
                    } else {
                        i29 = i28;
                    }
                }
                if ((i29 & 38347923) != 38347922) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i29 & 1, z16)) {
                    o0VarE.G0();
                    if ((i15 & 1) != 0) {
                        if (i37 == 0) {
                        }
                        if (i18 != 0) {
                            i19 = 0;
                        }
                        if (i25 != 0) {
                            aVar2 = null;
                        }
                        if ((i16 & 128) != 0) {
                            dd.f87874a.getClass();
                            i29 &= -29360129;
                            ucVarF = dd.f(o0VarE);
                        }
                        if (i27 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        i34 = i19;
                        i35 = i29;
                        z18 = z19;
                    } else {
                        if (i37 == 0) {
                        }
                        if (i18 != 0) {
                            i19 = 0;
                        }
                        if (i25 != 0) {
                            aVar2 = null;
                        }
                        if ((i16 & 128) != 0) {
                            dd.f87874a.getClass();
                            i29 &= -29360129;
                            ucVarF = dd.f(o0VarE);
                        }
                        if (i27 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        i34 = i19;
                        i35 = i29;
                        z18 = z19;
                    }
                    e23.a<Unit> aVar6 = aVar2;
                    o0VarE.h0();
                    p3.x1 x1Var3 = p3.n.f135158a;
                    int i311 = i35 >> 6;
                    o0Var = o0VarE;
                    a2.j jVar6 = jVar3;
                    uc ucVar5 = ucVarF;
                    d(f14, lVar, rVar, z18, aVar6, ucVar5, jVar6, i34, z3.f.c(308249025, new b(jVar3, ucVarF, z18), o0VarE), z3.f.c(-1843234110, new c(z18, ucVarF), o0VarE), fVar, o0Var, (i35 & 14) | 905969664 | (i35 & 112) | (i35 & 896) | (i35 & 7168) | (57344 & i311) | (458752 & i311) | (i311 & 3670016) | (29360128 & (i35 << 6)), (i35 >> 12) & 14, 0);
                    z17 = z18;
                    aVar3 = aVar6;
                    ucVar2 = ucVar5;
                    jVar2 = jVar6;
                    i19 = i34;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z17 = z15;
                    aVar3 = aVar2;
                    ucVar2 = ucVarF;
                    jVar2 = jVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new gd(f14, lVar, rVar, z17, fVar, i19, aVar3, ucVar2, jVar2, i15, i16);
                }
            }
            i17 |= 1572864;
            aVar2 = aVar;
            if ((12582912 & i15) == 0) {
                if ((i16 & 128) == 0) {
                    ucVarF = ucVar;
                    if (o0VarE.B(ucVarF)) {
                    }
                    i17 |= i38;
                } else {
                    ucVarF = ucVar;
                }
                i17 |= i38;
            } else {
                ucVarF = ucVar;
            }
            i27 = i16 & 256;
            if (i27 != 0) {
                i29 = i17 | 100663296;
            } else {
                i28 = i17;
                if ((i15 & 100663296) == 0) {
                    if (o0VarE.B(jVar)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i29 = i28 | i30;
                } else {
                    i29 = i28;
                }
            }
            if ((i29 & 38347923) != 38347922) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i29 & 1, z16)) {
                o0VarE.G0();
                if ((i15 & 1) != 0) {
                    if (i37 == 0) {
                    }
                    if (i18 != 0) {
                        i19 = 0;
                    }
                    if (i25 != 0) {
                        aVar2 = null;
                    }
                    if ((i16 & 128) != 0) {
                        dd.f87874a.getClass();
                        i29 &= -29360129;
                        ucVarF = dd.f(o0VarE);
                    }
                    if (i27 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    i34 = i19;
                    i35 = i29;
                    z18 = z19;
                } else {
                    if (i37 == 0) {
                    }
                    if (i18 != 0) {
                        i19 = 0;
                    }
                    if (i25 != 0) {
                        aVar2 = null;
                    }
                    if ((i16 & 128) != 0) {
                        dd.f87874a.getClass();
                        i29 &= -29360129;
                        ucVarF = dd.f(o0VarE);
                    }
                    if (i27 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    i34 = i19;
                    i35 = i29;
                    z18 = z19;
                }
                e23.a<Unit> aVar7 = aVar2;
                o0VarE.h0();
                p3.x1 x1Var4 = p3.n.f135158a;
                int i312 = i35 >> 6;
                o0Var = o0VarE;
                a2.j jVar7 = jVar3;
                uc ucVar6 = ucVarF;
                d(f14, lVar, rVar, z18, aVar7, ucVar6, jVar7, i34, z3.f.c(308249025, new b(jVar3, ucVarF, z18), o0VarE), z3.f.c(-1843234110, new c(z18, ucVarF), o0VarE), fVar, o0Var, (i35 & 14) | 905969664 | (i35 & 112) | (i35 & 896) | (i35 & 7168) | (57344 & i312) | (458752 & i312) | (i312 & 3670016) | (29360128 & (i35 << 6)), (i35 >> 12) & 14, 0);
                z17 = z18;
                aVar3 = aVar7;
                ucVar2 = ucVar6;
                jVar2 = jVar7;
                i19 = i34;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
                aVar3 = aVar2;
                ucVar2 = ucVarF;
                jVar2 = jVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new gd(f14, lVar, rVar, z17, fVar, i19, aVar3, ucVar2, jVar2, i15, i16);
            }
        }
        i17 |= 3072;
        z15 = z14;
        if ((i15 & 24576) == 0) {
            if (o0VarE.B(fVar)) {
                i36 = 16384;
            } else {
                i36 = 8192;
            }
            i17 |= i36;
        }
        i18 = i16 & 32;
        if (i18 != 0) {
            if ((196608 & i15) == 0) {
                i19 = i14;
                if (o0VarE.k(i19)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i17 |= i24;
            }
            i25 = i16 & 64;
            if (i25 != 0) {
                if ((1572864 & i15) == 0) {
                    aVar2 = aVar;
                    if (o0VarE.r(aVar2)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i17 |= i26;
                }
                if ((12582912 & i15) == 0) {
                    if ((i16 & 128) == 0) {
                        ucVarF = ucVar;
                        if (o0VarE.B(ucVarF)) {
                        }
                        i17 |= i38;
                    } else {
                        ucVarF = ucVar;
                    }
                    i17 |= i38;
                } else {
                    ucVarF = ucVar;
                }
                i27 = i16 & 256;
                if (i27 != 0) {
                    i29 = i17 | 100663296;
                } else {
                    i28 = i17;
                    if ((i15 & 100663296) == 0) {
                        if (o0VarE.B(jVar)) {
                            i30 = 67108864;
                        } else {
                            i30 = 33554432;
                        }
                        i29 = i28 | i30;
                    } else {
                        i29 = i28;
                    }
                }
                if ((i29 & 38347923) != 38347922) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i29 & 1, z16)) {
                    o0VarE.G0();
                    if ((i15 & 1) != 0) {
                        if (i37 == 0) {
                        }
                        if (i18 != 0) {
                            i19 = 0;
                        }
                        if (i25 != 0) {
                            aVar2 = null;
                        }
                        if ((i16 & 128) != 0) {
                            dd.f87874a.getClass();
                            i29 &= -29360129;
                            ucVarF = dd.f(o0VarE);
                        }
                        if (i27 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        i34 = i19;
                        i35 = i29;
                        z18 = z19;
                    } else {
                        if (i37 == 0) {
                        }
                        if (i18 != 0) {
                            i19 = 0;
                        }
                        if (i25 != 0) {
                            aVar2 = null;
                        }
                        if ((i16 & 128) != 0) {
                            dd.f87874a.getClass();
                            i29 &= -29360129;
                            ucVarF = dd.f(o0VarE);
                        }
                        if (i27 != 0) {
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = kg.f.b(o0VarE);
                            }
                            jVar3 = (a2.j) objQ;
                        } else {
                            jVar3 = jVar;
                        }
                        i34 = i19;
                        i35 = i29;
                        z18 = z19;
                    }
                    e23.a<Unit> aVar8 = aVar2;
                    o0VarE.h0();
                    p3.x1 x1Var5 = p3.n.f135158a;
                    int i313 = i35 >> 6;
                    o0Var = o0VarE;
                    a2.j jVar8 = jVar3;
                    uc ucVar7 = ucVarF;
                    d(f14, lVar, rVar, z18, aVar8, ucVar7, jVar8, i34, z3.f.c(308249025, new b(jVar3, ucVarF, z18), o0VarE), z3.f.c(-1843234110, new c(z18, ucVarF), o0VarE), fVar, o0Var, (i35 & 14) | 905969664 | (i35 & 112) | (i35 & 896) | (i35 & 7168) | (57344 & i313) | (458752 & i313) | (i313 & 3670016) | (29360128 & (i35 << 6)), (i35 >> 12) & 14, 0);
                    z17 = z18;
                    aVar3 = aVar8;
                    ucVar2 = ucVar7;
                    jVar2 = jVar8;
                    i19 = i34;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z17 = z15;
                    aVar3 = aVar2;
                    ucVar2 = ucVarF;
                    jVar2 = jVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new gd(f14, lVar, rVar, z17, fVar, i19, aVar3, ucVar2, jVar2, i15, i16);
                }
            }
            i17 |= 1572864;
            aVar2 = aVar;
            if ((12582912 & i15) == 0) {
                if ((i16 & 128) == 0) {
                    ucVarF = ucVar;
                    if (o0VarE.B(ucVarF)) {
                    }
                    i17 |= i38;
                } else {
                    ucVarF = ucVar;
                }
                i17 |= i38;
            } else {
                ucVarF = ucVar;
            }
            i27 = i16 & 256;
            if (i27 != 0) {
                i29 = i17 | 100663296;
            } else {
                i28 = i17;
                if ((i15 & 100663296) == 0) {
                    if (o0VarE.B(jVar)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i29 = i28 | i30;
                } else {
                    i29 = i28;
                }
            }
            if ((i29 & 38347923) != 38347922) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i29 & 1, z16)) {
                o0VarE.G0();
                if ((i15 & 1) != 0) {
                    if (i37 == 0) {
                    }
                    if (i18 != 0) {
                        i19 = 0;
                    }
                    if (i25 != 0) {
                        aVar2 = null;
                    }
                    if ((i16 & 128) != 0) {
                        dd.f87874a.getClass();
                        i29 &= -29360129;
                        ucVarF = dd.f(o0VarE);
                    }
                    if (i27 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    i34 = i19;
                    i35 = i29;
                    z18 = z19;
                } else {
                    if (i37 == 0) {
                    }
                    if (i18 != 0) {
                        i19 = 0;
                    }
                    if (i25 != 0) {
                        aVar2 = null;
                    }
                    if ((i16 & 128) != 0) {
                        dd.f87874a.getClass();
                        i29 &= -29360129;
                        ucVarF = dd.f(o0VarE);
                    }
                    if (i27 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    i34 = i19;
                    i35 = i29;
                    z18 = z19;
                }
                e23.a<Unit> aVar9 = aVar2;
                o0VarE.h0();
                p3.x1 x1Var6 = p3.n.f135158a;
                int i314 = i35 >> 6;
                o0Var = o0VarE;
                a2.j jVar9 = jVar3;
                uc ucVar8 = ucVarF;
                d(f14, lVar, rVar, z18, aVar9, ucVar8, jVar9, i34, z3.f.c(308249025, new b(jVar3, ucVarF, z18), o0VarE), z3.f.c(-1843234110, new c(z18, ucVarF), o0VarE), fVar, o0Var, (i35 & 14) | 905969664 | (i35 & 112) | (i35 & 896) | (i35 & 7168) | (57344 & i314) | (458752 & i314) | (i314 & 3670016) | (29360128 & (i35 << 6)), (i35 >> 12) & 14, 0);
                z17 = z18;
                aVar3 = aVar9;
                ucVar2 = ucVar8;
                jVar2 = jVar9;
                i19 = i34;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
                aVar3 = aVar2;
                ucVar2 = ucVarF;
                jVar2 = jVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new gd(f14, lVar, rVar, z17, fVar, i19, aVar3, ucVar2, jVar2, i15, i16);
            }
        }
        i17 |= 196608;
        i19 = i14;
        i25 = i16 & 64;
        if (i25 != 0) {
            if ((1572864 & i15) == 0) {
                aVar2 = aVar;
                if (o0VarE.r(aVar2)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i17 |= i26;
            }
            if ((12582912 & i15) == 0) {
                if ((i16 & 128) == 0) {
                    ucVarF = ucVar;
                    if (o0VarE.B(ucVarF)) {
                    }
                    i17 |= i38;
                } else {
                    ucVarF = ucVar;
                }
                i17 |= i38;
            } else {
                ucVarF = ucVar;
            }
            i27 = i16 & 256;
            if (i27 != 0) {
                i29 = i17 | 100663296;
            } else {
                i28 = i17;
                if ((i15 & 100663296) == 0) {
                    if (o0VarE.B(jVar)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i29 = i28 | i30;
                } else {
                    i29 = i28;
                }
            }
            if ((i29 & 38347923) != 38347922) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i29 & 1, z16)) {
                o0VarE.G0();
                if ((i15 & 1) != 0) {
                    if (i37 == 0) {
                    }
                    if (i18 != 0) {
                        i19 = 0;
                    }
                    if (i25 != 0) {
                        aVar2 = null;
                    }
                    if ((i16 & 128) != 0) {
                        dd.f87874a.getClass();
                        i29 &= -29360129;
                        ucVarF = dd.f(o0VarE);
                    }
                    if (i27 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    i34 = i19;
                    i35 = i29;
                    z18 = z19;
                } else {
                    if (i37 == 0) {
                    }
                    if (i18 != 0) {
                        i19 = 0;
                    }
                    if (i25 != 0) {
                        aVar2 = null;
                    }
                    if ((i16 & 128) != 0) {
                        dd.f87874a.getClass();
                        i29 &= -29360129;
                        ucVarF = dd.f(o0VarE);
                    }
                    if (i27 != 0) {
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.b(o0VarE);
                        }
                        jVar3 = (a2.j) objQ;
                    } else {
                        jVar3 = jVar;
                    }
                    i34 = i19;
                    i35 = i29;
                    z18 = z19;
                }
                e23.a<Unit> aVar10 = aVar2;
                o0VarE.h0();
                p3.x1 x1Var7 = p3.n.f135158a;
                int i315 = i35 >> 6;
                o0Var = o0VarE;
                a2.j jVar10 = jVar3;
                uc ucVar9 = ucVarF;
                d(f14, lVar, rVar, z18, aVar10, ucVar9, jVar10, i34, z3.f.c(308249025, new b(jVar3, ucVarF, z18), o0VarE), z3.f.c(-1843234110, new c(z18, ucVarF), o0VarE), fVar, o0Var, (i35 & 14) | 905969664 | (i35 & 112) | (i35 & 896) | (i35 & 7168) | (57344 & i315) | (458752 & i315) | (i315 & 3670016) | (29360128 & (i35 << 6)), (i35 >> 12) & 14, 0);
                z17 = z18;
                aVar3 = aVar10;
                ucVar2 = ucVar9;
                jVar2 = jVar10;
                i19 = i34;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
                aVar3 = aVar2;
                ucVar2 = ucVarF;
                jVar2 = jVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new gd(f14, lVar, rVar, z17, fVar, i19, aVar3, ucVar2, jVar2, i15, i16);
            }
        }
        i17 |= 1572864;
        aVar2 = aVar;
        if ((12582912 & i15) == 0) {
            if ((i16 & 128) == 0) {
                ucVarF = ucVar;
                if (o0VarE.B(ucVarF)) {
                }
                i17 |= i38;
            } else {
                ucVarF = ucVar;
            }
            i17 |= i38;
        } else {
            ucVarF = ucVar;
        }
        i27 = i16 & 256;
        if (i27 != 0) {
            i29 = i17 | 100663296;
        } else {
            i28 = i17;
            if ((i15 & 100663296) == 0) {
                if (o0VarE.B(jVar)) {
                    i30 = 67108864;
                } else {
                    i30 = 33554432;
                }
                i29 = i28 | i30;
            } else {
                i29 = i28;
            }
        }
        if ((i29 & 38347923) != 38347922) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i29 & 1, z16)) {
            o0VarE.G0();
            if ((i15 & 1) != 0) {
                if (i37 == 0) {
                }
                if (i18 != 0) {
                    i19 = 0;
                }
                if (i25 != 0) {
                    aVar2 = null;
                }
                if ((i16 & 128) != 0) {
                    dd.f87874a.getClass();
                    i29 &= -29360129;
                    ucVarF = dd.f(o0VarE);
                }
                if (i27 != 0) {
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    jVar3 = (a2.j) objQ;
                } else {
                    jVar3 = jVar;
                }
                i34 = i19;
                i35 = i29;
                z18 = z19;
            } else {
                if (i37 == 0) {
                }
                if (i18 != 0) {
                    i19 = 0;
                }
                if (i25 != 0) {
                    aVar2 = null;
                }
                if ((i16 & 128) != 0) {
                    dd.f87874a.getClass();
                    i29 &= -29360129;
                    ucVarF = dd.f(o0VarE);
                }
                if (i27 != 0) {
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    jVar3 = (a2.j) objQ;
                } else {
                    jVar3 = jVar;
                }
                i34 = i19;
                i35 = i29;
                z18 = z19;
            }
            e23.a<Unit> aVar11 = aVar2;
            o0VarE.h0();
            p3.x1 x1Var8 = p3.n.f135158a;
            int i316 = i35 >> 6;
            o0Var = o0VarE;
            a2.j jVar11 = jVar3;
            uc ucVar10 = ucVarF;
            d(f14, lVar, rVar, z18, aVar11, ucVar10, jVar11, i34, z3.f.c(308249025, new b(jVar3, ucVarF, z18), o0VarE), z3.f.c(-1843234110, new c(z18, ucVarF), o0VarE), fVar, o0Var, (i35 & 14) | 905969664 | (i35 & 112) | (i35 & 896) | (i35 & 7168) | (57344 & i316) | (458752 & i316) | (i316 & 3670016) | (29360128 & (i35 << 6)), (i35 >> 12) & 14, 0);
            z17 = z18;
            aVar3 = aVar11;
            ucVar2 = ucVar10;
            jVar2 = jVar11;
            i19 = i34;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z17 = z15;
            aVar3 = aVar2;
            ucVar2 = ucVarF;
            jVar2 = jVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gd(f14, lVar, rVar, z17, fVar, i19, aVar3, ucVar2, jVar2, i15, i16);
        }
    }

    public static final void f(ud udVar, h4.r rVar, boolean z14, uc ucVar, a2.j jVar, z3.e eVar, z3.e eVar2, p3.m mVar, int i14) {
        int i15;
        z3.e eVar3;
        z3.e eVar4;
        uc ucVar2;
        uc ucVarF;
        int i16;
        p3.o0 o0VarE = mVar.E(409861960);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(udVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(jVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            eVar3 = eVar;
            i15 |= o0VarE.r(eVar3) ? 131072 : 65536;
        } else {
            eVar3 = eVar;
        }
        if ((1572864 & i14) == 0) {
            eVar4 = eVar2;
            i15 |= o0VarE.r(eVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            eVar4 = eVar2;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                dd.f87874a.getClass();
                ucVarF = dd.f(o0VarE);
                i16 = i15 & (-7169);
            } else {
                o0VarE.e();
                i16 = i15 & (-7169);
                ucVarF = ucVar;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            if (udVar.f89910a < 0) {
                vb.h.s("steps should be >= 0");
                return;
            }
            int i17 = i16 >> 3;
            g(rVar, udVar, z14, jVar, eVar3, eVar4, o0VarE, (i16 & 896) | (i17 & 14) | ((i16 << 3) & 112) | (i17 & 7168) | (57344 & i17) | (i17 & 458752));
            ucVar2 = ucVarF;
        } else {
            o0VarE.e();
            ucVar2 = ucVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b21.n9(udVar, rVar, z14, ucVar2, jVar, eVar, eVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0248  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(h4.r rVar, ud udVar, boolean z14, a2.j jVar, z3.e eVar, z3.e eVar2, p3.m mVar, int i14) {
        int i15;
        ud udVar2;
        z3.e eVar3;
        p3.o0 o0Var;
        p008y1.b2 b2Var;
        h4.r r0Var;
        Object obj;
        Object obj2;
        boolean z15;
        Object obj3;
        z3.e eVar4 = eVar2;
        p3.z1 z1Var = udVar.f89913d;
        p3.o0 o0VarE = mVar.E(898172835);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(udVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(jVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(eVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(eVar4) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 74899) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean z16 = o0VarE.A(kotlin.t1.f91496n) == g6.o.Rtl;
            udVar.f89919j = z16;
            p008y1.b2 b2Var2 = udVar.f89922m;
            boolean z17 = b2Var2 == p008y1.b2.Horizontal && z16;
            h4.r.a aVar = h4.r.S;
            if (z14) {
                sd sdVar = new sd(udVar);
                b5.q qVar = b5.s0.f15885a;
                b2Var = b2Var2;
                r0Var = new b5.r0(udVar, jVar, null, sdVar, 4, null);
                aVar.getClass();
            } else {
                b2Var = b2Var2;
                r0Var = aVar;
            }
            p008y1.b2 b2Var3 = udVar.f89922m;
            boolean zBooleanValue = ((Boolean) udVar.f89923n.getF182175a()).booleanValue();
            boolean zR = o0VarE.r(udVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                obj = objQ;
                od odVar = new od(udVar, null);
                o0VarE.K(odVar);
                obj = odVar;
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    obj = objQ;
                    od odVar2 = new od(udVar, null);
                    o0VarE.K(odVar2);
                    obj = odVar2;
                }
            }
            obj = objQ;
            h4.r rVar2 = r0Var;
            p3.o0 o0Var2 = o0VarE;
            h4.r rVarA = p008y1.a1.a(aVar, udVar, b2Var3, z14, jVar, zBooleanValue, null, (e23.q) obj, z17, 32);
            boolean z18 = z17;
            udVar2 = udVar;
            p008y1.b2 b2Var4 = p008y1.b2.Vertical;
            p008y1.b2 b2Var5 = b2Var;
            h4.r rVarX = b2Var5 == b2Var4 ? c2.x2.x(f5.g0.e(aVar, vc.THUMB), null, 3) : c2.x2.z(f5.g0.e(aVar, vc.THUMB), null, 3);
            f5.p pVar = p7.f89279a;
            h4.r rVarThen = rVar.then(d8.f87832a);
            float f14 = f88705b;
            float f15 = f88704a;
            h4.r rVarC = p5.v.c(new as2.d(z14, udVar2, 10), c2.x2.o(rVarThen, b2Var5 == b2Var4 ? f15 : f14, b2Var5 == b2Var4 ? f14 : f15, 0.0f, 0.0f, 12), false);
            j23.f<Float> fVar = udVar2.f89912c;
            h4.r rVarA2 = u1.m0.a(p5.v.c(new qe2.d(z1Var.getFloatValue(), new j23.e(fVar.getStart().floatValue(), fVar.b().floatValue()), udVar2.f89910a), rVarC.then(b2Var5 == b2Var4 ? l3.c.f109192d : l3.c.f109191c), true), z14, jVar);
            h4.r rVar3 = rVarX;
            int i17 = udVar2.f89910a;
            j23.f<Float> fVar2 = udVar2.f89912c;
            float floatValue = z1Var.getFloatValue();
            e23.l<? super Float, Unit> lVar = udVar2.f89914e;
            e23.a<Unit> aVar3 = udVar2.f89911b;
            if (i17 < 0) {
                vb.h.s("steps should be >= 0");
                return;
            }
            h4.r rVarThen2 = z4.f.b(rVarA2, new rd(z14, lVar, fVar2, i17, z18, floatValue, aVar3)).then(rVar2).then(rVarA);
            boolean zR2 = o0Var2.r(udVar2);
            Object objQ2 = o0Var2.q();
            if (zR2) {
                obj2 = objQ2;
                nd ndVar = new nd(udVar2);
                o0Var2.K(ndVar);
                obj2 = ndVar;
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    obj2 = objQ2;
                    nd ndVar2 = new nd(udVar2);
                    o0Var2.K(ndVar2);
                    obj2 = ndVar2;
                }
            }
            obj2 = objQ2;
            f5.z0 z0Var = (f5.z0) obj2;
            int iP = o0Var2.P();
            p3.i2 i2VarA0 = o0Var2.a0();
            h4.r rVarC2 = h4.k.c(rVarThen2, o0Var2);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == 0) {
                p3.p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar4);
            } else {
                o0Var2.c();
            }
            h5.g.a.e eVar5 = h5.g.a.f81810g;
            p3.b4.c(eVar5, z0Var, o0Var2);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA0, o0Var2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0Var2, iP, bVar);
            }
            h5.g.a.f fVar3 = h5.g.a.f81807d;
            p3.b4.c(fVar3, rVarC2, o0Var2);
            boolean zR3 = o0Var2.r(udVar2);
            Object objQ3 = o0Var2.q();
            if (zR3) {
                z15 = false;
                id idVar = new id(udVar2, false ? 1 : 0);
                o0Var2.K(idVar);
                obj3 = idVar;
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    z15 = false;
                    id idVar2 = new id(udVar2, false ? 1 : 0);
                    o0Var2.K(idVar2);
                    obj3 = idVar2;
                } else {
                    z15 = false;
                    obj3 = objQ3;
                }
            }
            h4.r rVarG = f5.g0.g(rVar3, (e23.l) obj3);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            f5.z0 z0VarD = c2.q.d(gVar, z15);
            int iP2 = o0Var2.P();
            p3.i2 i2VarA1 = o0Var2.a0();
            h4.r rVarC3 = h4.k.c(rVarG, o0Var2);
            if (cVar == 0) {
                p3.p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar4);
            } else {
                o0Var2.c();
            }
            p3.b4.c(eVar5, z0VarD, o0Var2);
            p3.b4.c(c1623g, i2VarA1, o0Var2);
            if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iP2))) {
                v.h.A(iP2, o0Var2, iP2, bVar);
            }
            p3.b4.c(fVar3, rVarC3, o0Var2);
            c2.u uVar = c2.u.f22885a;
            int i18 = (i16 >> 3) & 14;
            eVar.invoke(udVar2, o0Var2, Integer.valueOf(((i16 >> 9) & 112) | i18));
            o0Var2.g0(true);
            h4.r rVarE = f5.g0.e(aVar, vc.TRACK);
            f5.z0 z0VarD2 = c2.q.d(gVar, false);
            int iP3 = o0Var2.P();
            p3.i2 i2VarA2 = o0Var2.a0();
            h4.r rVarC4 = h4.k.c(rVarE, o0Var2);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar4);
            } else {
                o0Var2.c();
            }
            p3.b4.c(eVar5, z0VarD2, o0Var2);
            p3.b4.c(c1623g, i2VarA2, o0Var2);
            if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iP3))) {
                v.h.A(iP3, o0Var2, iP3, bVar);
            }
            p3.b4.c(fVar3, rVarC4, o0Var2);
            z3.e eVar6 = eVar2;
            eVar6.invoke(udVar2, o0Var2, Integer.valueOf(i18 | ((i16 >> 12) & 112)));
            o0Var2.g0(true);
            o0Var2.g0(true);
            o0Var = o0Var2;
            eVar3 = eVar6;
        } else {
            udVar2 = udVar;
            p3.o0 o0Var3 = o0VarE;
            o0Var3.e();
            o0Var = o0Var3;
            eVar3 = eVar4;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(rVar, udVar2, z14, jVar, eVar, eVar3, i14);
        }
    }

    public static final long h(float f14, float f15) {
        if ((Float.isNaN(f14) && Float.isNaN(f15)) || f14 <= f15) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
            td.a aVar = td.f89800b;
            return jFloatToRawIntBits;
        }
        throw new IllegalArgumentException(("start(" + f14 + ") must be <= endInclusive(" + f15 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Serializable i(b5.c cVar, long j8, int i14, v13.a aVar) {
        pd pdVar;
        p005kotlin.jvm.internal.o0 o0Var;
        if (aVar instanceof pd) {
            pdVar = (pd) aVar;
            int i15 = pdVar.f89317c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                pdVar.f89317c = i15 - Integer.MIN_VALUE;
            } else {
                pdVar = new pd(aVar);
            }
        } else {
            pdVar = new pd(aVar);
        }
        pd pdVar2 = pdVar;
        Object obj = pdVar2.f89316b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = pdVar2.f89317c;
        if (i16 == 0) {
            o13.r.b(obj);
            p005kotlin.jvm.internal.o0 o0Var2 = new p005kotlin.jvm.internal.o0();
            fp0.l lVar = new fp0.l(o0Var2, 25);
            pdVar2.f89315a = o0Var2;
            pdVar2.f89317c = 1;
            Object objA = l3.n0.a(cVar, j8, i14, lVar, pdVar2);
            if (objA == aVar2) {
                return aVar2;
            }
            obj = objA;
            o0Var = o0Var2;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o0Var = pdVar2.f89315a;
            o13.r.b(obj);
        }
        b5.a0 a0Var = (b5.a0) obj;
        if (a0Var != null) {
            return new o13.p(a0Var, new Float(o0Var.f105806a));
        }
        return null;
    }

    public static final float j(float f14, float[] fArr, float f15, float f16) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f17 = fArr[0];
            int i14 = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f17);
            } else {
                float fAbs = Math.abs(gl.b.J(f15, f16, f17) - f14);
                if (1 <= length) {
                    while (true) {
                        float f18 = fArr[i14];
                        float fAbs2 = Math.abs(gl.b.J(f15, f16, f18) - f14);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f17 = f18;
                            fAbs = fAbs2;
                        }
                        if (i14 == length) {
                            break;
                        }
                        i14++;
                    }
                }
                fValueOf = Float.valueOf(f17);
            }
        }
        return fValueOf != null ? gl.b.J(f15, f16, fValueOf.floatValue()) : f14;
    }

    public static final float k(float f14, float f15, float f16) {
        float f17 = f15 - f14;
        return j23.t.d(f17 == 0.0f ? 0.0f : (f16 - f14) / f17, 0.0f, 1.0f);
    }

    public static final String l(float f14) {
        return String.valueOf(MathKt.c(f14 * 100) / 100.0f);
    }

    public static final float m(float f14, float f15, float f16, float f17, float f18) {
        return gl.b.J(f17, f18, k(f14, f15, f16));
    }
}
