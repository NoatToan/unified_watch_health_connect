package lp1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import b82.f1;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import gl1.y;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.x0;
import o4.m1;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.solarcharge.view.EdgeSolarChargeChartScreenKt$EdgeSolarChargeChartScreen$1$1", f = "EdgeSolarChargeChartScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ep1.e f114169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f114170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DateTime f114171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ DateTime f114172d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ep1.e eVar, long j8, DateTime dateTime, DateTime dateTime2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f114169a = eVar;
            this.f114170b = j8;
            this.f114171c = dateTime;
            this.f114172d = dateTime2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f114169a, this.f114170b, this.f114171c, this.f114172d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ep1.e eVar = this.f114169a;
            eVar.getClass();
            DateTime dateTime = this.f114171c;
            dateTime.getClass();
            DateTime dateTime2 = this.f114172d;
            dateTime2.getClass();
            ge1.b.T(v1.a(eVar), null, null, new ep1.d(eVar, this.f114170b, dateTime, dateTime2, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.solarcharge.view.EdgeSolarChargeChartScreenKt$EdgeSolarChargeChartScreen$2$1", f = "EdgeSolarChargeChartScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f114173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<ep1.j> f114174b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a<Unit> aVar, x3<ep1.j> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f114173a = aVar;
            this.f114174b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f114173a, this.f114174b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f114174b.getF182175a().f64945c) {
                this.f114173a.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0181 A[PHI: r24
      0x0181: PHI (r24v2 long) = (r24v1 long), (r24v4 long) binds: [B:57:0x0106, B:65:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ep1.e eVar, final long j8, final DateTime dateTime, final DateTime dateTime2, final long j14, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        Throwable th3;
        int i15;
        List arrayList;
        CustomLineChart customLineChart;
        Object obj;
        Context context;
        Long l14;
        Iterator it;
        DateTime readingTimestampLocal;
        int minutes;
        int i16;
        List<ip1.g> listB;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 153740252);
        int i17 = i14 | (o0VarP.r(eVar) ? 4 : 2) | (o0VarP.l(j8) ? 32 : 16) | (o0VarP.r(dateTime) ? 256 : 128) | (o0VarP.r(dateTime2) ? 2048 : 1024) | (o0VarP.l(j14) ? 16384 : 8192) | (o0VarP.r(aVar) ? 131072 : 65536) | (o0VarP.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarP.n(i17 & 1, (599187 & i17) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            final s sVar = new s(context2);
            final p1 p1VarC = s9.c.c(eVar.f64935c, o0VarP);
            ip1.b bVar = ((ep1.j) p1VarC.getF182175a()).f64943a;
            if (bVar == null || (listB = bVar.b()) == null) {
                th3 = null;
                i15 = 1;
                arrayList = null;
            } else {
                th3 = null;
                arrayList = new ArrayList();
                Iterator<T> it3 = listB.iterator();
                while (it3.hasNext()) {
                    List<ip1.j> listD = ((ip1.g) it3.next()).d();
                    if (listD == null) {
                        listD = j0.f134944a;
                    }
                    d0.v(arrayList, listD);
                }
                i15 = 1;
            }
            if (arrayList == null) {
                arrayList = j0.f134944a;
            }
            arrayList.getClass();
            int i18 = i17;
            final ArrayList arrayList2 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            long jLongValue = 0;
            long jLongValue2 = 0;
            int i19 = 0;
            while (it4.hasNext()) {
                Object next = it4.next();
                int i24 = i19 + 1;
                if (i19 < 0) {
                    x.q();
                    throw th3;
                }
                ip1.j jVar = (ip1.j) next;
                int i25 = i18;
                DateTime readingTimestampLocal2 = jVar.getReadingTimestampLocal();
                if (readingTimestampLocal2 != null) {
                    Boolean charging = jVar.getCharging();
                    Boolean bool = Boolean.TRUE;
                    if (p005kotlin.jvm.internal.s.g(charging, bool)) {
                        Long activityTimeGainMs = jVar.getActivityTimeGainMs();
                        jLongValue2 += activityTimeGainMs != null ? activityTimeGainMs.longValue() : 0L;
                        if (jLongValue2 > 0) {
                            it = it4;
                            arrayList2.add(new ip1.d(readingTimestampLocal2, ip1.e.f94675e, Long.valueOf(jLongValue2)));
                            if (i19 < arrayList.size() - 1) {
                                ip1.j jVar2 = (ip1.j) arrayList.get(i24);
                                if (p005kotlin.jvm.internal.s.g(jVar2.getCharging(), bool) && (readingTimestampLocal = jVar2.getReadingTimestampLocal()) != null && (minutes = Minutes.minutesBetween(readingTimestampLocal2, readingTimestampLocal).getMinutes()) > (i16 = i15)) {
                                    int i26 = i16;
                                    for (minutes = Minutes.minutesBetween(readingTimestampLocal2, readingTimestampLocal).getMinutes(); i26 < minutes; minutes = minutes) {
                                        DateTime dateTimePlusMinutes = readingTimestampLocal2.plusMinutes(i26);
                                        dateTimePlusMinutes.getClass();
                                        arrayList2.add(new ip1.d(dateTimePlusMinutes, ip1.e.f94675e, Long.valueOf(jLongValue2)));
                                        i26++;
                                    }
                                }
                            }
                        } else {
                            it = it4;
                        }
                    } else {
                        it = it4;
                        if (p005kotlin.jvm.internal.s.g(jVar.getNotChargingBatteryFull(), bool)) {
                            arrayList2.add(new ip1.d(readingTimestampLocal2, ip1.e.f94676f, null, 4, null));
                        } else if (p005kotlin.jvm.internal.s.g(jVar.getNotChargingTooCold(), bool)) {
                            arrayList2.add(new ip1.d(readingTimestampLocal2, ip1.e.f94677g, null, 4, null));
                        } else if (p005kotlin.jvm.internal.s.g(jVar.getNotChargingTooHot(), bool)) {
                            arrayList2.add(new ip1.d(readingTimestampLocal2, ip1.e.f94678h, null, 4, null));
                        }
                    }
                } else {
                    it = it4;
                }
                i19 = i24;
                i18 = i25;
                it4 = it;
                i15 = 1;
            }
            int i27 = i18;
            ip1.d dVar = (ip1.d) h0.n0(arrayList2);
            if (dVar != null && (l14 = dVar.f94674c) != null) {
                jLongValue = l14.longValue();
            }
            final m3.s sVarE = m3.l.e(o0VarP);
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomLineChart(context2);
                o0VarP.K(objQ);
            }
            CustomLineChart customLineChart2 = (CustomLineChart) objQ;
            Object objQ2 = o0VarP.q();
            if (objQ2 == c2565a) {
                customLineChart = customLineChart2;
                tz.a aVar3 = new tz.a(customLineChart, new gp1.a(context2, dateTime, dateTime2), new gp1.d(customLineChart2), new gp1.b(customLineChart2), new gp1.c(customLineChart2), null, 32, null);
                aVar3.c();
                o0VarP.K(aVar3);
                obj = aVar3;
            } else {
                customLineChart = customLineChart2;
                obj = objQ2;
            }
            final tz.a aVar4 = (tz.a) obj;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarP.r(eVar) | ((i27 & 112) == 32) | o0VarP.r(dateTime) | o0VarP.r(dateTime2);
            Object objQ3 = o0VarP.q();
            if (zR || objQ3 == c2565a) {
                context = context2;
                a aVar5 = new a(eVar, j8, dateTime, dateTime2, null);
                o0VarP.K(aVar5);
                objQ3 = aVar5;
            } else {
                context = context2;
            }
            l0.e((e23.p) objQ3, unit, o0VarP);
            Boolean boolValueOf = Boolean.valueOf(((ep1.j) p1VarC.getF182175a()).f64945c);
            boolean zB = o0VarP.B(p1VarC) | ((i27 & 458752) == 131072);
            Object objQ4 = o0VarP.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new b(aVar, p1VarC, th3);
                o0VarP.K(objQ4);
            }
            l0.e((e23.p) objQ4, boolValueOf, o0VarP);
            final Context context3 = context;
            final long j15 = jLongValue;
            final CustomLineChart customLineChart3 = customLineChart;
            o0 o0Var2 = o0VarP;
            z02.d.a(((ep1.j) p1VarC.getF182175a()).f64944b, z3.f.c(905991415, new j(aVar2, context, 0), o0VarP), null, null, null, z3.f.c(-1606826637, new e23.p() { // from class: lp1.k
                /* JADX WARN: Code duplicated, block: B:14:0x0061  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    DateTime dateTime3;
                    p1 p1Var;
                    p3.m mVar2;
                    p3.m mVar3 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar6 = h4.r.S;
                        h4.r rVarD = x2.d(aVar6, 1.0f);
                        p1 p1Var2 = p1VarC;
                        boolean z14 = ((ep1.j) p1Var2.getF182175a()).f64944b;
                        ep1.e eVar2 = eVar;
                        boolean zR2 = mVar3.r(eVar2);
                        long j16 = j8;
                        boolean zL = zR2 | mVar3.l(j16);
                        DateTime dateTime4 = dateTime;
                        boolean zR3 = zL | mVar3.r(dateTime4);
                        DateTime dateTime5 = dateTime2;
                        boolean zR4 = zR3 | mVar3.r(dateTime5);
                        Object objQ5 = mVar3.q();
                        if (zR4) {
                            dateTime3 = dateTime4;
                            objQ5 = new d62.r(eVar2, j16, dateTime3, dateTime5, 4);
                            mVar3.K(objQ5);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                dateTime3 = dateTime4;
                                objQ5 = new d62.r(eVar2, j16, dateTime3, dateTime5, 4);
                                mVar3.K(objQ5);
                            } else {
                                dateTime3 = dateTime4;
                            }
                        }
                        e23.a aVar7 = (e23.a) objQ5;
                        m3.r rVar = sVarE;
                        h4.r rVarB = a2.b(m3.l.d(rVarD, z14, rVar, false, aVar7, 12), a2.a(mVar3), true);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar3.getU());
                        i2 i2VarX = mVar3.x();
                        h4.r rVarC = h4.k.c(rVarB, mVar3);
                        h5.g.V.getClass();
                        e0.a aVar8 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar8);
                        } else {
                            mVar3.c();
                        }
                        h5.g.a.e eVar3 = h5.g.a.f81810g;
                        b4.c(eVar3, z0VarD, mVar3);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar3);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, mVar3);
                        c2.u uVar = c2.u.f22885a;
                        if (j15 < 60000) {
                            mVar3.C(-1292261224);
                            b82.n.c(null, y.Q(mVar3, R.string.msg_not_enough_data), y.Q(mVar3, R.string.no_solar_charge_data_message), uVar.c(aVar6, h4.d.a.f81528f), null, mVar3, 0, 17);
                            mVar2 = mVar3;
                            mVar2.f();
                            p1Var = p1Var2;
                        } else {
                            mVar3.C(-1291937863);
                            c2.j.f22691a.getClass();
                            z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar3, 0);
                            int iHashCode2 = Long.hashCode(mVar3.getU());
                            i2 i2VarX2 = mVar3.x();
                            h4.r rVarC2 = h4.k.c(aVar6, mVar3);
                            if (mVar3.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                mVar3.M(aVar8);
                            } else {
                                mVar3.c();
                            }
                            b4.c(eVar3, zVarA, mVar3);
                            b4.c(c1623g, i2VarX2, mVar3);
                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                                v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                            }
                            b4.c(fVar, rVarC2, mVar3);
                            c2.b0 b0Var = c2.b0.f22601a;
                            p1Var = p1Var2;
                            m92.o.a(u1.n.e(aVar6, tn.k.a(d92.b.f58623a, mVar3), m1.f128891a), y.Q(mVar3, R.string.lbl_ride_time_gained), null, null, z3.f.c(1221836883, new lb0.a(customLineChart3, 7, aVar4, arrayList2), mVar3), null, null, mVar3, 24576, 108);
                            mVar2 = mVar3;
                            x0 x0Var = x0.f111346a;
                            d92.b.f58625c.getClass();
                            x0Var.e(c2.l.A(aVar6, j92.b.f97899b.f97920e, 0.0f, 2), z3.f.c(1256315162, new ho.x(j14, sVar, context3, dateTime3, 1), mVar2), mVar2, (x0.f111348c << 6) | 48, 0);
                            mVar2.y();
                            mVar2.f();
                        }
                        f1.a(uVar, ((ep1.j) p1Var.getF182175a()).f64944b, rVar, mVar2, 6);
                        mVar2.y();
                    } else {
                        mVar3.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var2), o0Var2, 196656, 28);
            x1 x1Var2 = p3.n.f135158a;
            o0Var = o0Var2;
        } else {
            o0 o0Var3 = o0VarP;
            o0Var3.e();
            o0Var = o0Var3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.b(eVar, j8, dateTime, dateTime2, j14, aVar, aVar2, i14);
        }
    }
}
