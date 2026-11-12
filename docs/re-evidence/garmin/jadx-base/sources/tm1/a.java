package tm1;

import g22.k;
import java.util.ArrayList;
import java.util.List;
import km1.a0;
import km1.c;
import km1.o;
import km1.s;
import km1.v;
import km1.z;
import o72.t;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.y;
import rm1.d;
import rm1.f;
import rm1.h;
import rm1.i;
import rm1.l;
import rm1.m;
import rm1.n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltm1/a;", "", "<init>", "()V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3110a f165439a = new C3110a(null);

    /* JADX INFO: renamed from: tm1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltm1/a$a;", "", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3110a {
        public /* synthetic */ C3110a(j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r26v0 */
        /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r26v2 */
        /* JADX WARN: Type inference failed for: r27v0 */
        /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r27v2 */
        /* JADX WARN: Type inference failed for: r28v0 */
        /* JADX WARN: Type inference failed for: r28v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r28v2 */
        /* JADX WARN: Type inference failed for: r29v0 */
        /* JADX WARN: Type inference failed for: r29v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r29v2 */
        /* JADX WARN: Type inference failed for: r30v0 */
        /* JADX WARN: Type inference failed for: r30v1, types: [rm1.n] */
        /* JADX WARN: Type inference failed for: r30v2 */
        /* JADX WARN: Type inference failed for: r31v0 */
        /* JADX WARN: Type inference failed for: r31v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r31v2 */
        /* JADX WARN: Type inference failed for: r32v0 */
        /* JADX WARN: Type inference failed for: r32v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r32v2 */
        /* JADX WARN: Type inference failed for: r33v0 */
        /* JADX WARN: Type inference failed for: r33v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r33v2 */
        /* JADX WARN: Type inference failed for: r35v0 */
        /* JADX WARN: Type inference failed for: r35v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r35v2 */
        /* JADX WARN: Type inference failed for: r37v0 */
        /* JADX WARN: Type inference failed for: r37v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r37v2 */
        /* JADX WARN: Type inference failed for: r40v0 */
        /* JADX WARN: Type inference failed for: r40v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r40v2 */
        /* JADX WARN: Type inference failed for: r41v0 */
        /* JADX WARN: Type inference failed for: r41v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r41v2 */
        /* JADX WARN: Type inference failed for: r43v0 */
        /* JADX WARN: Type inference failed for: r43v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r43v2 */
        /* JADX WARN: Type inference failed for: r54v0 */
        /* JADX WARN: Type inference failed for: r54v1, types: [rm1.b] */
        /* JADX WARN: Type inference failed for: r54v2 */
        public static rm1.j a(c cVar) {
            ?? r14;
            h hVar;
            ?? r26;
            ?? r27;
            ?? r29;
            ?? r28;
            ?? r34;
            ?? r35;
            ?? r36;
            ?? r37;
            ?? r38;
            ?? r44;
            ?? r45;
            ?? r46;
            Double dValueOf = Double.valueOf(0.0d);
            cVar.getClass();
            v dailySleep = cVar.getDailySleep();
            if (dailySleep != null) {
                String calendarDate = dailySleep.getCalendarDate();
                LocalDate localDateW = k.w(dailySleep.getCalendarDate(), "yyyy-MM-dd");
                long sleepStartTimestampGMT = dailySleep.getSleepStartTimestampGMT();
                long sleepStartTimestampLocal = dailySleep.getSleepStartTimestampLocal();
                long sleepEndTimestampGMT = dailySleep.getSleepEndTimestampGMT();
                long sleepEndTimestampLocal = dailySleep.getSleepEndTimestampLocal();
                int unmeasurableSleepSeconds = dailySleep.getUnmeasurableSleepSeconds();
                Double lowestRespirationValue = dailySleep.getLowestRespirationValue();
                Double highestRespirationValue = dailySleep.getHighestRespirationValue();
                boolean zE = ql1.c.e(dailySleep);
                boolean z14 = dailySleep.getSleepTimeSeconds() > 0 && !ql1.c.e(dailySleep) && dailySleep.getDeepSleepSeconds() <= 0 && dailySleep.getLightSleepSeconds() <= 0 && dailySleep.getRemSleepSeconds() <= 0 && dailySleep.getAwakeSleepSeconds() <= 0;
                Double averageRespirationValue = dailySleep.getAverageRespirationValue();
                C3110a c3110a = a.f165439a;
                a0 sleepNeed = dailySleep.getSleepNeed();
                c3110a.getClass();
                l lVarB = b(sleepNeed);
                l lVarB2 = b(dailySleep.getNextSleepNeed());
                r14 = 0;
                hVar = new h(calendarDate, localDateW, sleepStartTimestampGMT, sleepStartTimestampLocal, sleepEndTimestampGMT, sleepEndTimestampLocal, unmeasurableSleepSeconds, lowestRespirationValue, highestRespirationValue, dValueOf, dValueOf, zE, z14, averageRespirationValue, lVarB, lVarB2);
            } else {
                r14 = 0;
                hVar = null;
            }
            List<s> listD = cVar.D();
            if (listD != null) {
                ArrayList arrayList = new ArrayList(y.r(listD, 10));
                for (s sVar : listD) {
                    arrayList.add(new i(sVar.getSleepActivityLevel(), sVar.getSleepStartTimestampGMT(), sVar.getSleepEndTimestampGMT()));
                }
                r26 = arrayList;
            } else {
                r26 = r14;
            }
            List<s> listA = cVar.A();
            if (listA != null) {
                ArrayList arrayList2 = new ArrayList(y.r(listA, 10));
                for (s sVar2 : listA) {
                    arrayList2.add(new i(sVar2.getSleepActivityLevel(), sVar2.getSleepStartTimestampGMT(), sVar2.getSleepEndTimestampGMT()));
                }
                r27 = arrayList2;
            } else {
                r27 = r14;
            }
            List<z> listF = cVar.F();
            if (listF != null) {
                ArrayList arrayList3 = new ArrayList(y.r(listF, 10));
                for (z zVar : listF) {
                    arrayList3.add(new rm1.k(zVar.getValue(), zVar.getStartGMT()));
                }
                r29 = arrayList3;
            } else {
                r29 = r14;
            }
            List<km1.a> listI = cVar.i();
            if (listI != null) {
                ArrayList arrayList4 = new ArrayList(y.r(listI, 10));
                for (km1.a aVar : listI) {
                    arrayList4.add(new rm1.a(aVar.getEndGMT(), aVar.getStartGMT(), aVar.getValue()));
                }
                r28 = arrayList4;
            } else {
                r28 = r14;
            }
            lm1.c wellnessSpO2SleepSummary = cVar.getWellnessSpO2SleepSummary();
            ?? nVar = wellnessSpO2SleepSummary != null ? new n(wellnessSpO2SleepSummary.getAverageSPO2(), wellnessSpO2SleepSummary.getSleepMeasurementStartGMT(), wellnessSpO2SleepSummary.getSleepMeasurementEndGMT()) : r14;
            List<lm1.a> listQ0 = cVar.q0();
            if (listQ0 != null) {
                ArrayList arrayList5 = new ArrayList(y.r(listQ0, 10));
                for (lm1.a aVar2 : listQ0) {
                    arrayList5.add(new m(aVar2.getEpochTimestamp(), aVar2.getSpO2Reading()));
                }
                r34 = arrayList5;
            } else {
                r34 = r14;
            }
            List<km1.n> listP0 = cVar.p0();
            if (listP0 != null) {
                ArrayList arrayList6 = new ArrayList(y.r(listP0, 10));
                for (km1.n nVar2 : listP0) {
                    arrayList6.add(new d(nVar2.getStartTimeGMT(), nVar2.getRespirationValue()));
                }
                r35 = arrayList6;
            } else {
                r35 = r14;
            }
            List<km1.m> listO0 = cVar.o0();
            if (listO0 != null) {
                ArrayList arrayList7 = new ArrayList(y.r(listO0, 10));
                for (km1.m mVar : listO0) {
                    arrayList7.add(new rm1.c(mVar.getEpochEndTimestampGmt(), mVar.getRespirationAverageValue(), mVar.getRespirationHighValue(), mVar.getRespirationLowValue()));
                }
                r36 = arrayList7;
            } else {
                r36 = r14;
            }
            List<z> listG0 = cVar.g0();
            if (listG0 != null) {
                ArrayList arrayList8 = new ArrayList(y.r(listG0, 10));
                for (z zVar2 : listG0) {
                    arrayList8.add(new rm1.k(zVar2.getValue(), zVar2.getStartGMT()));
                }
                r37 = arrayList8;
            } else {
                r37 = r14;
            }
            List<o> listU = cVar.u();
            if (listU != null) {
                ArrayList arrayList9 = new ArrayList(y.r(listU, 10));
                for (o oVar : listU) {
                    arrayList9.add(new f(oVar.getValue(), oVar.getStartGMT(), oVar.getDeviationCelsius(), oVar.getDeviationFahrenheit()));
                }
                r38 = arrayList9;
            } else {
                r38 = r14;
            }
            List<z> listZ = cVar.z();
            if (listZ != null) {
                ArrayList arrayList10 = new ArrayList(y.r(listZ, 10));
                for (z zVar3 : listZ) {
                    arrayList10.add(new rm1.k(zVar3.getValue(), zVar3.getStartGMT()));
                }
                r44 = arrayList10;
            } else {
                r44 = r14;
            }
            List<z> listY = cVar.y();
            if (listY != null) {
                ArrayList arrayList11 = new ArrayList(y.r(listY, 10));
                for (z zVar4 : listY) {
                    arrayList11.add(new rm1.k(zVar4.getValue(), zVar4.getStartGMT()));
                }
                r45 = arrayList11;
            } else {
                r45 = r14;
            }
            List<z> listM = cVar.m();
            if (listM != null) {
                ArrayList arrayList12 = new ArrayList(y.r(listM, 10));
                for (z zVar5 : listM) {
                    arrayList12.add(new rm1.k(zVar5.getValue(), zVar5.getStartGMT()));
                }
                r46 = arrayList12;
            } else {
                r46 = r14;
            }
            b bVarN = t.N(cVar);
            rl1.h hVar2 = new rl1.h(bVarN.f165440a, bVarN.f165441b, bVarN.f165442c, bVarN.f165443d, bVarN.f165444e, bVarN.a(), bVarN.f165444e > 0 && !bVarN.f165445f && bVarN.f165440a <= 0 && bVarN.f165441b <= 0 && bVarN.f165442c <= 0 && bVarN.f165443d <= 0);
            bv.d dVar = (bv.d) KoinJavaComponent.get$default(bv.d.class, r14, r14, 6, r14);
            v dailySleep2 = cVar.getDailySleep();
            return new rm1.j(hVar, r26, r27, r28, r29, nVar, r34, r35, r36, cVar.getRespirationVersion(), r37, null, r38, cVar.getAvgSkinTempDeviationC(), cVar.getAvgSkinTempDeviationF(), r44, r45, cVar.getBodyBatteryChange(), r46, cVar.getHrvStatus(), cVar.getAvgOvernightHrv(), cVar.i0(), cVar.j0(), cVar.k0(), cVar.h0(), cVar.n0(), cVar.z0(), cVar.f0(), cVar.x0(), dailySleep2 != null ? ql1.c.a(dailySleep2, dVar.h(), dVar.d()) : r14, hVar2, 2048, null);
        }

        public static l b(a0 a0Var) {
            if (a0Var != null) {
                return new l(a0Var.getVersion(), a0Var.getUserProfilePk(), a0Var.getCalendarDate(), a0Var.getDeviceId(), a0Var.getTimestampGmt(), a0Var.getBaseline(), a0Var.getActual(), a0Var.getFeedback(), a0Var.getTrainingFeedback(), a0Var.getSleepHistoryAdjustment(), a0Var.getHrvAdjustment(), a0Var.getNapAdjustment(), a0Var.getPreferredActivityTracker());
            }
            return null;
        }

        public static rl1.h c(b bVar) {
            return new rl1.h(bVar.f165440a, bVar.f165441b, bVar.f165442c, bVar.f165443d, bVar.f165444e, bVar.a(), bVar.f165444e > 0 && !bVar.f165445f && bVar.f165440a <= 0 && bVar.f165441b <= 0 && bVar.f165442c <= 0 && bVar.f165443d <= 0);
        }

        private C3110a() {
        }
    }
}
