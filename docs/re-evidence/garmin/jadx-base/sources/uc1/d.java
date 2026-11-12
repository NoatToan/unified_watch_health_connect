package uc1;

import android.os.Parcelable;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import ds.g0;
import e23.p;
import fg0.j;
import fg0.k;
import g02.o1;
import g22.l;
import gl1.y;
import h2.c0;
import h2.j0;
import h2.u;
import h5.e0;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o4.m1;
import o53.b0;
import org.joda.time.LocalDate;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import rx1.o;
import s5.x0;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.race_time_prediction.presentation.RaceTimePredictionScreenContentKt$RaceTimePredictionScreenContent$2$1", f = "RaceTimePredictionScreenContent.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<sc1.a> f169974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<Integer> f169975b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<sc1.a> p1Var, x3<Integer> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f169974a = p1Var;
            this.f169975b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f169974a, this.f169975b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f169974a.setValue(this.f169975b.getF182175a().intValue() == 0 ? sc1.a.Time : sc1.a.Pace);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.race_time_prediction.presentation.RaceTimePredictionScreenContentKt$RaceTimePredictionScreenContent$3$1", f = "RaceTimePredictionScreenContent.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f169976a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a<Unit> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f169976a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f169976a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f169976a.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.race_time_prediction.presentation.RaceTimePredictionScreenContentKt$RaceTimePredictionScreenContent$4$1$1$1", f = "RaceTimePredictionScreenContent.kt", l = {119}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f169977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f169978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f169979c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j0 j0Var, int i14, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f169978b = j0Var;
            this.f169979c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f169978b, this.f169979c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f169977a;
            if (i14 == 0) {
                r.b(obj);
                this.f169977a = 1;
                if (j0.g(this.f169978b, this.f169979c, null, this, 6) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fc  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f fVar, final k kVar, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        final f fVar2;
        int i16;
        e23.a<Unit> aVar2;
        e23.a<Unit> aVar3;
        o13.p pVar;
        boolean z14;
        boolean z15;
        String strQ;
        String str;
        Long projectedRaceTimeDuration;
        Long predictedRaceTimeDuration;
        fg0.d customGoal;
        int i17;
        kVar.getClass();
        o0 o0VarE = mVar.E(342214519);
        if ((i14 & 6) == 0) {
            if ((i15 & 1) == 0) {
                fVar2 = fVar;
                if (o0VarE.r(fVar2)) {
                    i17 = 4;
                }
                i16 = i17 | i14;
            } else {
                fVar2 = fVar;
            }
            i17 = 2;
            i16 = i17 | i14;
        } else {
            fVar2 = fVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            if ((i15 & 4) == 0) {
                aVar2 = aVar;
                int i18 = o0VarE.r(aVar2) ? 256 : 128;
                i16 |= i18;
            } else {
                aVar2 = aVar;
            }
            i16 |= i18;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            int i19 = i14 & 1;
            m.a aVar4 = m.f135153a;
            if (i19 == 0 || o0VarE.o0()) {
                if ((i15 & 1) != 0) {
                    o0VarE.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                    if (viewModelStoreOwnerA == null) {
                        h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(f.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                    o0VarE.g0(false);
                    fVar2 = (f) u1VarResolveViewModel;
                    i16 &= -15;
                }
                if ((i15 & 4) != 0) {
                    boolean zR = o0VarE.r(fVar2) | ((i16 & 112) == 32 || ((i16 & 64) != 0 && o0VarE.r(kVar)));
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new tb0.d(28, fVar2, kVar);
                        o0VarE.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new tb0.d(28, fVar2, kVar);
                            o0VarE.K(objQ);
                        }
                    }
                    aVar2 = (e23.a) objQ;
                    i16 &= -897;
                }
            } else {
                o0VarE.e();
                if ((i15 & 1) != 0) {
                    i16 &= -15;
                }
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                }
            }
            e23.a<Unit> aVar5 = aVar2;
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            j eventCustomization = kVar.getEventCustomization();
            Double value = (eventCustomization == null || (customGoal = eventCustomization.getCustomGoal()) == null) ? null : customGoal.getValue();
            j eventCustomization2 = kVar.getEventCustomization();
            Long l14 = (eventCustomization2 == null || (predictedRaceTimeDuration = eventCustomization2.getPredictedRaceTimeDuration()) == null) ? null : predictedRaceTimeDuration;
            j eventCustomization3 = kVar.getEventCustomization();
            final Long l15 = (eventCustomization3 == null || (projectedRaceTimeDuration = eventCustomization3.getProjectedRaceTimeDuration()) == null) ? null : projectedRaceTimeDuration;
            j eventCustomization4 = kVar.getEventCustomization();
            final Double predictedRaceSpeed = eventCustomization4 != null ? eventCustomization4.getPredictedRaceSpeed() : null;
            j eventCustomization5 = kVar.getEventCustomization();
            final Double projectedRaceSpeed = eventCustomization5 != null ? eventCustomization5.getProjectedRaceSpeed() : null;
            gl.c.f77766a.getClass();
            final long jF = gl.c.a(o0VarE).f();
            final long jE = gl.c.a(o0VarE).e();
            final long jB = gl.c.a(o0VarE).b();
            c2 c2Var = fVar2.f169989g;
            c2 c2Var2 = fVar2.f169988f;
            int i24 = c2Var.getF182175a() == sc1.a.Time ? 0 : 1;
            Object objQ2 = o0VarE.q();
            aVar4.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new d4.h(5);
                o0VarE.K(objQ2);
            }
            h2.b bVarB = h2.o0.b(i24, (e23.a) objQ2, o0VarE, 384, 2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.f(new g0(bVarB, 11));
                o0VarE.K(objQ3);
            }
            x3 x3Var = (x3) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ4);
            }
            b0 b0Var = (b0) objQ4;
            Integer numValueOf = Integer.valueOf(((Number) x3Var.getF182175a()).intValue());
            boolean zB = o0VarE.B(c2Var);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == c2565a) {
                objQ5 = new a(c2Var, x3Var, null);
                o0VarE.K(objQ5);
            }
            l0.e((p) objQ5, numValueOf, o0VarE);
            boolean z16 = (((i16 & 896) ^ 384) > 256 && o0VarE.B(aVar5)) || (i16 & 384) == 256;
            Object objQ6 = o0VarE.q();
            if (z16 || objQ6 == c2565a) {
                objQ6 = new b(aVar5, null);
                o0VarE.K(objQ6);
            }
            Parcelable.Creator<k> creator = k.CREATOR;
            l0.e((p) objQ6, kVar, o0VarE);
            LocalDate date = kVar.getDate();
            if (date != null) {
                List listQ = jg.b.q(l.h(fVar2.f169985c), date);
                int size = listQ.isEmpty() ? 0 : listQ.size();
                if (size >= 180) {
                    int i25 = size - 180;
                    double d14 = ((double) i25) / 7.0d;
                    if (d14 >= 2.0d) {
                        pVar = new o13.p(Integer.valueOf(R.string.in_num_weeks), Integer.valueOf((int) d14));
                    } else if (d14 > 1.0d) {
                        pVar = new o13.p(Integer.valueOf(R.string.in_singular_week), Integer.valueOf((int) d14));
                    } else if (i25 > 1) {
                        pVar = new o13.p(Integer.valueOf(R.string.in_num_days), Integer.valueOf(i25));
                    } else if (i25 == 1) {
                        pVar = new o13.p(Integer.valueOf(R.string.in_singular_day), Integer.valueOf(i25));
                    } else {
                        pVar = null;
                    }
                } else {
                    pVar = null;
                }
            } else {
                pVar = null;
            }
            List list = (List) c2Var2.getF182175a();
            tc1.a aVar6 = list != null ? (tc1.a) h0.b0(list) : null;
            final Double d15 = aVar6 != null ? aVar6.f163819i : null;
            final Double d16 = aVar6 != null ? aVar6.f163820j : null;
            List list2 = (List) c2Var2.getF182175a();
            if (list2 != null && !list2.isEmpty()) {
                Iterator it = list2.iterator();
                int i26 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    }
                    if (((tc1.a) it.next()).f163812b != null) {
                        i26++;
                    }
                    if (i26 > 1) {
                        z14 = true;
                        break;
                    }
                }
            } else {
                z14 = false;
                break;
            }
            if ((aVar6 != null ? aVar6.f163813c : null) != null || pVar == null) {
                o0VarE.C(-1337518816);
                Integer numValueOf2 = (aVar6 == null || (str = aVar6.f163816f) == null) ? null : Integer.valueOf(uc1.b.valueOf(str).f169958a);
                if (numValueOf2 != null) {
                    o0VarE.C(-1337322090);
                    strQ = y.Q(o0VarE, numValueOf2.intValue());
                    z15 = false;
                    o0VarE.g0(false);
                } else {
                    z15 = false;
                    o0VarE.C(-1337264337);
                    o0VarE.g0(false);
                    strQ = null;
                }
                o0VarE.g0(z15);
            } else {
                o0VarE.C(-1337687797);
                strQ = y.P(R.string.proj_rtp_countdown_string, new Object[]{hb.a.i(y.P(((Number) pVar.f128594a).intValue(), new Object[]{pVar.f128595b}, o0VarE))}, o0VarE);
                o0VarE.g0(false);
            }
            h4.r.a aVar7 = h4.r.S;
            final String str2 = strQ;
            f fVar3 = fVar2;
            h4.r rVarE = u1.n.e(x2.d(aVar7, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97920e;
            h4.r rVarA = c2.l.A(rVarE, f14, 0.0f, 2);
            h4.d.f81522a.getClass();
            h4.g.a aVar8 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar8, o0VarE, 48);
            x1 x1Var2 = n.f135158a;
            final tc1.a aVar9 = aVar6;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar10 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar10);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar7, 1.0f);
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            h4.r rVarB = c2.l.B(rVarF, f15, f15, f15, f15);
            i53.f fVarA = i53.a.a(y.Q(o0VarE, R.string.lbl_time), y.Q(o0VarE, R.string.lbl_pace));
            int iIntValue = ((Number) x3Var.getF182175a()).intValue();
            boolean zR2 = o0VarE.r(b0Var) | o0VarE.B(bVarB);
            Object objQ7 = o0VarE.q();
            if (zR2 || objQ7 == m.a.f135155b) {
                objQ7 = new o(1, bVarB, b0Var);
                o0VarE.K(objQ7);
            }
            o1.a(rVarB, true, fVarA, iIntValue, (e23.l) objQ7, o0VarE, 48);
            bVar.getClass();
            fVar2 = fVar3;
            final Long l16 = l14;
            final Double d17 = value;
            final boolean z17 = z14;
            u.a(bVarB, c2.l.A(aVar7, eVar.f97918c, 0.0f, 2), null, null, 0, 0.0f, null, null, false, null, null, null, null, z3.f.c(777943342, new e23.r() { // from class: uc1.c
                @Override // e23.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    long j8;
                    String str3;
                    long j14;
                    f fVar4 = fVar2;
                    b63.o oVar = fVar4.f169985c;
                    c2 c2Var3 = fVar4.f169988f;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    m mVar2 = (m) obj3;
                    ((Integer) obj4).getClass();
                    ((c0) obj).getClass();
                    x1 x1Var3 = n.f135158a;
                    k kVar2 = kVar;
                    tc1.a aVar11 = aVar9;
                    long j15 = jF;
                    long j16 = jB;
                    Double d18 = d17;
                    long j17 = jE;
                    boolean z18 = z17;
                    Long l17 = l16;
                    Long l18 = l15;
                    Double d19 = predictedRaceSpeed;
                    Double d24 = projectedRaceSpeed;
                    Double d25 = d15;
                    Double d26 = d16;
                    String str4 = str2;
                    if (iIntValue2 == 0) {
                        mVar2.C(66714257);
                        h4.r.a aVar12 = h4.r.S;
                        c2.j.f22691a.getClass();
                        c2.j.k kVar3 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA2 = c2.y.a(kVar3, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC2 = h4.k.c(aVar12, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar13 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar13);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        List list3 = (List) c2Var3.getF182175a();
                        LocalDate date2 = kVar2.getDate();
                        j eventCustomization6 = kVar2.getEventCustomization();
                        LocalDate localDateH = l.h(oVar);
                        sc1.a aVar14 = sc1.a.Time;
                        fg0.d completionTarget = kVar2.getCompletionTarget();
                        wc1.a.a(list3, date2, eventCustomization6, localDateH, aVar14, completionTarget != null ? completionTarget.b() : null, mVar2, (j.f71246n << 6) | 24576);
                        if ((aVar11 != null ? aVar11.f163813c : null) != null) {
                            mVar2.C(-1416997286);
                            j8 = j15;
                            vc1.h.a(j8, j16, d18 != null, j17, z18, mVar2, 0);
                            mVar2 = mVar2;
                            mVar2.f();
                        } else {
                            j8 = j15;
                            mVar2.C(-1416647482);
                            mVar2.f();
                        }
                        fg0.d completionTarget2 = kVar2.getCompletionTarget();
                        m mVar3 = mVar2;
                        vc1.f.a(l17, j8, l18, j16, d18, j17, aVar14, d19, d24, completionTarget2 != null ? completionTarget2.b() : null, d25, d26, mVar3, 1572864);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(c2.l.C(aVar12, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), mVar3);
                        h4.r rVarB2 = b0Var3.b(aVar12, h4.d.a.f81537o);
                        String str5 = str4 == null ? "" : str4;
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), mVar3);
                        d6.h.f57752b.getClass();
                        mh.c(str5, rVarB2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar3, 0, 0, 130044);
                        mVar3.y();
                        mVar3.f();
                    } else if (iIntValue2 != 1) {
                        mVar2.C(71276372);
                        mVar2.f();
                    } else {
                        mVar2.C(69058911);
                        h4.r.a aVar15 = h4.r.S;
                        c2.j.f22691a.getClass();
                        c2.j.k kVar4 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA3 = c2.y.a(kVar4, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode3 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC3 = h4.k.c(aVar15, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar16 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar16);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA3, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                        h5.g.a.b bVar4 = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar4);
                        }
                        b4.c(h5.g.a.f81807d, rVarC3, mVar2);
                        c2.b0 b0Var4 = c2.b0.f22601a;
                        List list4 = (List) c2Var3.getF182175a();
                        LocalDate date3 = kVar2.getDate();
                        j eventCustomization7 = kVar2.getEventCustomization();
                        LocalDate localDateH2 = l.h(oVar);
                        sc1.a aVar17 = sc1.a.Pace;
                        fg0.d completionTarget3 = kVar2.getCompletionTarget();
                        wc1.a.a(list4, date3, eventCustomization7, localDateH2, aVar17, completionTarget3 != null ? completionTarget3.b() : null, mVar2, (j.f71246n << 6) | 24576);
                        if ((aVar11 != null ? aVar11.f163813c : null) != null) {
                            mVar2.C(-550579311);
                            str3 = str4;
                            j14 = j15;
                            vc1.h.a(j14, j16, d18 != null, j17, z18, mVar2, 0);
                            mVar2 = mVar2;
                            mVar2.f();
                        } else {
                            str3 = str4;
                            j14 = j15;
                            mVar2.C(-550229507);
                            mVar2.f();
                        }
                        fg0.d completionTarget4 = kVar2.getCompletionTarget();
                        m mVar4 = mVar2;
                        vc1.f.a(l17, j14, l18, j16, d18, j17, aVar17, d19, d24, completionTarget4 != null ? completionTarget4.b() : null, d25, d26, mVar4, 1572864);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(c2.l.C(aVar15, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), mVar4);
                        h4.r rVarB3 = b0Var4.b(aVar15, h4.d.a.f81537o);
                        String str6 = str3 == null ? "" : str3;
                        d92.b.f58624b.getClass();
                        x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), mVar4);
                        d6.h.f57752b.getClass();
                        mh.c(str6, rVarB3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar4, 0, 0, 130044);
                        mVar4.y();
                        mVar4.f();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 100663296, 24576, 16124);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            aVar3 = aVar5;
        } else {
            o0VarE.e();
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(fVar2, kVar, aVar3, i14, i15, 23);
        }
    }
}
