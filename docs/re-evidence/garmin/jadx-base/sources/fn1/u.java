package fn1;

import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import ew1.u1;
import f72.ib;
import h5.e0;
import i3.e9;
import i3.mc;
import java.util.List;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.coach.SleepCoachNoDataKt$SleepCoachNoData$1$1$1$1", f = "SleepCoachNoData.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f72247b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f72247b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f72247b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f72246a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f72246a = 1;
                if (this.f72247b.b(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.coach.SleepCoachNoDataKt$SleepCoachNoData$1$3$1$1$1", f = "SleepCoachNoData.kt", l = {82}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f72249b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f72249b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f72249b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f72248a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f72248a = 1;
                if (this.f72249b.d(this) == aVar) {
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

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72250a;

        static {
            int[] iArr = new int[km1.r.values().length];
            try {
                iArr[km1.r.ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[km1.r.NO_SLEEP_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72250a = iArr;
        }
    }

    public static final void a(km1.r rVar, boolean z14, e23.a aVar, boolean z15, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        int i16;
        String strJ;
        String strJ2;
        o0 o0VarE = mVar.E(-1805369371);
        int i17 = i14 | (o0VarE.k(rVar == null ? -1 : rVar.ordinal()) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int i18 = rVar != null ? c.f72250a[rVar.ordinal()] : -1;
            if (i18 == 1) {
                i15 = 206831191;
                i16 = R.string.lbl_no_guidance_available;
            } else if (i18 != 2) {
                i15 = 206836341;
                i16 = R.string.lbl_no_sleep_coach_data;
            } else {
                i15 = 206834292;
                i16 = R.string.lbl_missing_sleep_data;
            }
            String strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar3, j92.b.f97899b.f97920e), o0VarE);
            s62.a.f157643a.getClass();
            u4.d dVarA = ib.a(t62.c.f162799a);
            h4.r rVarX = x2.x(aVar3, h4.d.a.f81533k, 2);
            String strQ = gl1.y.Q(o0VarE, R.string.msg_sleep_coach_no_data_available);
            if (z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 5606157, R.string.lbl_add_manual_sleep, o0VarE, false);
            } else {
                o0VarE.C(173844994);
                o0VarE.g0(false);
                strJ = null;
            }
            e23.a aVar5 = z14 ? aVar : null;
            if (z15) {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 5611684, R.string.lbl_add_nap, o0VarE, false);
            } else {
                o0VarE.C(174007682);
                o0VarE.g0(false);
                strJ2 = null;
            }
            b82.n.d(dVarA, strJ3, strQ, rVarX, strJ, aVar5, strJ2, z15 ? aVar2 : null, o0VarE, 3072, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u1(rVar, z14, aVar, z15, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    public static final void b(km1.c cVar, DateTime dateTime, sm1.s sVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        int i16;
        km1.v dailySleep;
        sVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1795332534);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(sVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            km1.v vVar = (cVar == null || (dailySleep = cVar.getDailySleep()) == null) ? new km1.v(0L, 0L, null, 0, 0, false, null, 0L, 0L, 0L, 0L, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null) : dailySleep;
            boolean z15 = cVar == null || !in1.a.b(cVar);
            if (bo1.a.a().c().x0() && g22.k.f(dateTime, DateTime.now())) {
                List<km1.b> listT = vVar.t();
                if (listT == null || listT.isEmpty()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            c2.b0 b0Var2 = c2.b0.f22601a;
            km1.p sleepAlignment = vVar.getSleepAlignment();
            km1.r rVarC2 = sleepAlignment != null ? km1.q.c(sleepAlignment) : null;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                i16 = 6;
                objQ2 = new cn1.t(b0Var, mcVarF, 6);
                o0VarE.K(objQ2);
            } else {
                i16 = 6;
            }
            e23.a aVar4 = (e23.a) objQ2;
            boolean z16 = (i15 & 7168) == 2048;
            Object objQ3 = o0VarE.q();
            if (z16 || objQ3 == c2565a) {
                objQ3 = new eu.a(aVar, 16);
                o0VarE.K(objQ3);
            }
            int i17 = i16;
            a(rVarC2, z15, aVar4, z14, (e23.a) objQ3, o0VarE, 0);
            if (mcVarF.e()) {
                o0VarE.C(-972121024);
                bv.d dVar = (bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, i17, null);
                boolean z17 = !g22.k.g(dateTime.toLocalDate(), LocalDate.now());
                km1.v vVarB = km1.v.b(vVar, dVar.getUserProfilePk(), dateTime.toString("yyyy-MM-dd"), 0, 0L, 0L, null, -7, 8191);
                boolean zR2 = o0VarE.r(sVar) | o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.r(dateTime);
                Object objQ4 = o0VarE.q();
                if (zR2 || objQ4 == c2565a) {
                    objQ4 = new s(sVar, b0Var, dateTime, mcVarF);
                    o0VarE.K(objQ4);
                }
                in1.b.a(false, z17, vVarB, b0Var, mcVarF, null, (e23.l) objQ4, o0VarE, (km1.v.P0 << i17) | 6, 32);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-971054314);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(cVar, dateTime, sVar, aVar, i14, 0);
        }
    }
}
