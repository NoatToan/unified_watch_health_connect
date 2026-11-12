package i3;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2.l2 f90071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f90072b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$1$1", f = "DateRangePicker.kt", l = {775}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f90073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f90074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f90075c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e2.i0 i0Var, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f90074b = i0Var;
            this.f90075c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f90074b, this.f90075c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f90073a;
            if (i14 == 0) {
                o13.r.b(obj);
                e2.i0 i0Var = this.f90074b;
                int iH = i0Var.h();
                int i15 = this.f90075c;
                if (iH != i15) {
                    this.f90073a = 1;
                    if (i0Var.l(i15, 0, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Long f90076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Long f90077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<Long, Long, Unit> f90078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f90079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j23.l f90080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l3.e0 f90081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ l3.h0 f90082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ l3 f90083h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ b3 f90084i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ l3.d0 f90085j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ bc f90086k;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Long l14, Long l15, e23.p<? super Long, ? super Long, Unit> pVar, e2.i0 i0Var, j23.l lVar, l3.e0 e0Var, l3.h0 h0Var, l3 l3Var, b3 b3Var, l3.d0 d0Var, bc bcVar) {
            this.f90076a = l14;
            this.f90077b = l15;
            this.f90078c = pVar;
            this.f90079d = i0Var;
            this.f90080e = lVar;
            this.f90081f = e0Var;
            this.f90082g = h0Var;
            this.f90083h = l3Var;
            this.f90084i = b3Var;
            this.f90085j = d0Var;
            this.f90086k = bcVar;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.l0.j(t13.h.f161748a, mVar2);
                    mVar2.K(objQ);
                }
                o53.b0 b0Var = (o53.b0) objQ;
                int i14 = l3.n1.f109367b;
                String strH = l3.k.h(mVar2, R.string.m3c_date_range_picker_scroll_to_previous_month);
                String strH2 = l3.k.h(mVar2, R.string.m3c_date_range_picker_scroll_to_next_month);
                Long l14 = this.f90076a;
                boolean zB = mVar2.B(l14);
                Long l15 = this.f90077b;
                boolean zB2 = zB | mVar2.B(l15);
                e23.p<Long, Long, Unit> pVar = this.f90078c;
                boolean zB3 = zB2 | mVar2.B(pVar);
                Object objQ2 = mVar2.q();
                if (zB3 || objQ2 == c2565a) {
                    objQ2 = new gw1.d(l14, 12, l15, pVar);
                    mVar2.K(objQ2);
                }
                e23.l lVar = (e23.l) objQ2;
                c2.l2 l2Var = w4.f90071a;
                e2.i0 i0Var = this.f90079d;
                List listK = p13.x.k(new p5.g(strH, new et1.y(i0Var, b0Var, 3)), new p5.g(strH2, new et1.y(i0Var, b0Var, 4)));
                h4.r.a aVar = h4.r.S;
                Object objQ3 = mVar2.q();
                if (objQ3 == c2565a) {
                    objQ3 = new i11.f(16);
                    mVar2.K(objQ3);
                }
                h4.r rVarC = p5.v.c((e23.l) objQ3, aVar, false);
                boolean zR = mVar2.r(this.f90080e) | mVar2.r(this.f90081f) | mVar2.B(this.f90082g) | mVar2.r(this.f90083h) | mVar2.r(listK) | mVar2.B(this.f90084i) | mVar2.B(l14) | mVar2.B(l15) | mVar2.B(lVar) | mVar2.B(this.f90085j) | mVar2.B(this.f90086k);
                Object objQ4 = mVar2.q();
                if (zR || objQ4 == c2565a) {
                    ca0.s0 s0Var = new ca0.s0(this.f90080e, this.f90081f, this.f90082g, this.f90076a, this.f90077b, lVar, this.f90085j, this.f90083h, this.f90086k, this.f90084i, listK);
                    mVar2.K(s0Var);
                    objQ4 = s0Var;
                }
                e2.c.b(rVarC, this.f90079d, null, null, null, null, false, null, (e23.l) objQ4, mVar2, 0, 508);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", l = {901}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f90087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f90088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f90089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l3.e0 f90090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j23.l f90091e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e2.i0 i0Var, e23.l<? super Long, Unit> lVar, l3.e0 e0Var, j23.l lVar2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f90088b = i0Var;
            this.f90089c = lVar;
            this.f90090d = e0Var;
            this.f90091e = lVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f90088b, this.f90089c, this.f90090d, this.f90091e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f90087a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f90087a = 1;
                float f14 = x3.f90191a;
                e2.i0 i0Var = this.f90088b;
                Object objCollect = p3.p0.s(new ct1.c(i0Var, 3)).collect(new j4(i0Var, this.f90089c, this.f90090d, this.f90091e), this);
                if (objCollect != aVar) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f90071a = c2.l.e(24, 20, 0.0f, 8, 4);
        float f14 = 64;
        float f15 = 12;
        c2.l.e(f14, 0.0f, f15, 0.0f, 10);
        c2.l.e(f14, 0.0f, f15, f15, 2);
        f90072b = 60;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(c5 c5Var, h4.r rVar, l3 l3Var, b3 b3Var, e23.p pVar, e23.p pVar2, boolean z14, m4.b0 b0Var, p3.m mVar, int i14) {
        l3 l3Var2;
        m4.b0 b0Var2;
        l3 l3Var3;
        int i15;
        m4.b0 b0Var3;
        p3.o0 o0VarE = mVar.E(1969726368);
        int i16 = i14 | (o0VarE.B(c5Var) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16) | 128 | (o0VarE.B(b3Var) ? 2048 : 1024) | 12582912;
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            z3.e eVarC = null;
            p3.m.a aVar = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                Object objQ = o0VarE.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = d3.c(d3.f87817a, null, 7);
                    o0VarE.K(objQ);
                }
                l3Var3 = (l3) objQ;
                int i18 = i16 & (-897);
                Object objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = kg.f.j(o0VarE);
                }
                i15 = i18;
                b0Var3 = (m4.b0) objQ2;
            } else {
                o0VarE.e();
                l3Var3 = l3Var;
                i15 = i16 & (-897);
                b0Var3 = b0Var;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            boolean zB = o0VarE.B(c5Var.getLocale());
            Object objQ3 = o0VarE.q();
            if (zB) {
                if (c5Var instanceof a0) {
                    objQ3 = ((a0) c5Var).f87406c;
                } else {
                    objQ3 = new l3.f0(c5Var.getLocale());
                }
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    if (c5Var instanceof a0) {
                        objQ3 = ((a0) c5Var).f87406c;
                    } else {
                        objQ3 = new l3.f0(c5Var.getLocale());
                    }
                    o0VarE.K(objQ3);
                }
            }
            l3.e0 e0Var = (l3.e0) objQ3;
            if (z14) {
                o0VarE.C(-2018438858);
                eVarC = z3.f.c(1343236786, new u4(c5Var, b3Var), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2018051234);
                o0VarE.g0(false);
            }
            z3.e eVar = eVarC;
            n3.n.f123126a.getClass();
            s5.x0 x0VarA = sj.a(n3.n.f123150y, o0VarE);
            float f14 = n3.n.f123149x - f90072b;
            g6.f.a aVar2 = g6.f.f75994b;
            l3 l3Var4 = l3Var3;
            x3.a(rVar, pVar, pVar2, eVar, b3Var, x0VarA, f14, z3.f.c(684885105, new v4(c5Var, e0Var, l3Var4, b3Var, b0Var3), o0VarE), o0VarE, ((i15 >> 3) & 14) | 14156208 | (57344 & (i15 << 3)));
            l3Var2 = l3Var4;
            b0Var2 = b0Var3;
        } else {
            o0VarE.e();
            l3Var2 = l3Var;
            b0Var2 = b0Var;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.n(c5Var, rVar, l3Var2, b3Var, pVar, pVar2, z14, b0Var2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00e4  */
    public static final void b(final Long l14, final Long l15, final long j8, final e23.p<? super Long, ? super Long, Unit> pVar, final e23.l<? super Long, Unit> lVar, final l3.e0 e0Var, final j23.l lVar2, final l3 l3Var, final bc bcVar, final b3 b3Var, p3.m mVar, final int i14) {
        p3.o0 o0VarE = mVar.E(-787063721);
        int i15 = i14 | (o0VarE.B(l14) ? 4 : 2) | (o0VarE.B(l15) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(e0Var) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(l3Var) ? 8388608 : 4194304) | (o0VarE.B(bcVar) ? 67108864 : 33554432) | (o0VarE.B(b3Var) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            p3.x1 x1Var = p3.n.f135158a;
            l3.h0 h0VarF = e0Var.f(j8);
            int i16 = (((h0VarF.f109260a - lVar2.f96796a) * 12) + h0VarF.f109261b) - 1;
            if (i16 < 0) {
                i16 = 0;
            }
            e2.i0 i0VarA = e2.k0.a(i16, 0, 2, o0VarE);
            Integer numValueOf = Integer.valueOf(i16);
            boolean zB = o0VarE.B(i0VarA) | o0VarE.k(i16);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new a(i0VarA, i16, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(i0VarA, i16, null);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.e((e23.p) objQ, numValueOf, o0VarE);
            h4.r rVarA = c2.l.A(h4.r.S, x3.f90193c, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            x3.l(b3Var, e0Var, o0VarE, ((i15 >> 27) & 14) | ((i15 >> 12) & 112));
            d(i0VarA, l14, l15, pVar, lVar, e0Var, lVar2, l3Var, bcVar, b3Var, o0VarE, ((i15 << 3) & 1008) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(l14, l15, j8, pVar, lVar, e0Var, lVar2, l3Var, bcVar, b3Var, i14) { // from class: i3.r4

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Long f89490a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Long f89491b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f89492c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.p f89493d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.l f89494e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ l3.e0 f89495f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ j23.l f89496g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ l3 f89497h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ bc f89498i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ b3 f89499j;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(1);
                    w4.b(this.f89490a, this.f89491b, this.f89492c, this.f89493d, this.f89494e, this.f89495f, this.f89496g, this.f89497h, this.f89498i, this.f89499j, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void c(final Long l14, final Long l15, final long j8, final int i14, final e23.p pVar, final e23.l lVar, final l3.e0 e0Var, final j23.l lVar2, final l3 l3Var, final bc bcVar, final b3 b3Var, final m4.b0 b0Var, p3.m mVar, final int i15) {
        p3.o0 o0VarE = mVar.E(621028059);
        int i16 = i15 | (o0VarE.B(l14) ? 4 : 2) | (o0VarE.B(l15) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.r(pVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(e0Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar2) ? 8388608 : 4194304) | (o0VarE.B(l3Var) ? 67108864 : 33554432) | (o0VarE.B(bcVar) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (((o0VarE.B(b3Var) ? (char) 4 : (char) 2) | (o0VarE.B(b0Var) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            s1.f0 f0VarB = k9.b(n3.h0.FastEffects, o0VarE);
            h4.r.a aVar = h4.r.S;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new i11.f(15);
                o0VarE.K(objQ);
            }
            r1.m0.a(q5.a(i14), p5.v.c((e23.l) objQ, aVar, false), f0VarB, null, z3.f.c(-773828161, new x4(l14, l15, j8, pVar, lVar, e0Var, lVar2, l3Var, bcVar, b3Var, b0Var), o0VarE), o0VarE, ((i16 >> 9) & 14) | 24576, 8);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(l14, l15, j8, i14, pVar, lVar, e0Var, lVar2, l3Var, bcVar, b3Var, b0Var, i15) { // from class: i3.q4

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Long f89398a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Long f89399b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f89400c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f89401d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.p f89402e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.l f89403f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ l3.e0 f89404g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ j23.l f89405h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ l3 f89406i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ bc f89407j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ b3 f89408k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ m4.b0 f89409l;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(1);
                    w4.c(this.f89398a, this.f89399b, this.f89400c, this.f89401d, this.f89402e, this.f89403f, this.f89404g, this.f89405h, this.f89406i, this.f89407j, this.f89408k, this.f89409l, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0141  */
    public static final void d(e2.i0 i0Var, Long l14, Long l15, e23.p<? super Long, ? super Long, Unit> pVar, e23.l<? super Long, Unit> lVar, l3.e0 e0Var, j23.l lVar2, l3 l3Var, bc bcVar, b3 b3Var, p3.m mVar, int i14) {
        Long l16;
        Object cVar;
        e2.i0 i0Var2 = i0Var;
        p3.o0 o0VarE = mVar.E(1257365001);
        int i15 = (o0VarE.B(i0Var2) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            l16 = l14;
            i15 |= o0VarE.B(l16) ? 32 : 16;
        } else {
            l16 = l14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(l15) ? 256 : 128;
        }
        int i16 = i15 | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(e0Var) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(l3Var) ? 8388608 : 4194304) | (o0VarE.B(bcVar) ? 67108864 : 33554432) | (o0VarE.B(b3Var) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, (i16 & 306783379) != 306783378)) {
            p3.x1 x1Var = p3.n.f135158a;
            l3.d0 d0VarH = e0Var.h();
            boolean zB = o0VarE.B(lVar2);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = e0Var.e(lVar2.f96796a, 1);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = e0Var.e(lVar2.f96796a, 1);
                    o0VarE.K(objQ);
                }
            }
            n3.n.f123126a.getClass();
            mh.a(sj.a(n3.n.f123134i, o0VarE), z3.f.c(1090773432, new b(l16, l15, pVar, i0Var2, lVar2, e0Var, (l3.h0) objQ, l3Var, b3Var, d0VarH, bcVar), o0VarE), o0VarE, 48);
            boolean zR = ((i16 & 14) == 4) | ((i16 & 57344) == 16384) | o0VarE.r(e0Var) | o0VarE.r(lVar2);
            Object objQ2 = o0VarE.q();
            if (zR) {
                i0Var2 = i0Var;
                cVar = new c(i0Var2, lVar, e0Var, lVar2, null);
                o0VarE.K(cVar);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    i0Var2 = i0Var;
                    cVar = new c(i0Var2, lVar, e0Var, lVar2, null);
                    o0VarE.K(cVar);
                } else {
                    cVar = objQ2;
                    i0Var2 = i0Var;
                }
            }
            p3.l0.e((e23.p) cVar, i0Var2, o0VarE);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s4(i0Var2, l14, l15, pVar, lVar, e0Var, lVar2, l3Var, bcVar, b3Var, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    public static final d5 e(final Long l14, final Long l15, Long l16, final j23.l lVar, int i14, final bc bcVar, p3.m mVar, int i15, int i16) {
        final int i17;
        final Long l17 = (i16 & 4) != 0 ? l14 : l16;
        if ((i16 & 16) != 0) {
            q5.f89410b.getClass();
            i17 = 0;
        } else {
            i17 = i14;
        }
        p3.x1 x1Var = p3.n.f135158a;
        final Locale localeA = i1.a(mVar);
        Object[] objArr = new Object[0];
        d5.f87822i.getClass();
        boolean z14 = true;
        d4.l lVarB = d4.a.b(new ho2.o(13), new l4(bcVar, localeA, 1));
        boolean zB = mVar.B(l14);
        if ((((i15 & 112) ^ 48) <= 32 || !mVar.B(l15)) && (i15 & 48) != 32) {
            z14 = false;
        }
        boolean zB2 = zB | z14 | mVar.B(l17) | mVar.r(lVar) | mVar.k(i17) | mVar.B(bcVar) | mVar.r(localeA);
        Object objQ = mVar.q();
        if (zB2) {
            Object obj = new e23.a() { // from class: i3.p4
                @Override // e23.a
                public final Object invoke() {
                    return new d5(l14, l15, l17, lVar, i17, bcVar, localeA, null);
                }
            };
            mVar.K(obj);
            objQ = obj;
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                Object obj2 = new e23.a() { // from class: i3.p4
                    @Override // e23.a
                    public final Object invoke() {
                        return new d5(l14, l15, l17, lVar, i17, bcVar, localeA, null);
                    }
                };
                mVar.K(obj2);
                objQ = obj2;
            }
        }
        d5 d5Var = (d5) d4.a.c(objArr, lVarB, (e23.a) objQ, mVar, 0);
        d5Var.f87407d.setValue(bcVar);
        return d5Var;
    }
}
