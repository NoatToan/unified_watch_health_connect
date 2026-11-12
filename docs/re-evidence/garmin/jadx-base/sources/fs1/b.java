package fs1;

import am.x0;
import am.z0;
import gs1.a0;
import gs1.c;
import gs1.f;
import gs1.g;
import gs1.i;
import gs1.k;
import gs1.l;
import gs1.o;
import gs1.t;
import gs1.u;
import gs1.v;
import gs1.w;
import gs1.x;
import gs1.z;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Seconds;
import p13.h0;
import sn.h;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final x0 a(gs1.b bVar) {
        bVar.getClass();
        c activityType = bVar.getActivityType();
        String typeKey = activityType != null ? activityType.getTypeKey() : null;
        if (typeKey == null || typeKey.length() == 0) {
            return x0.f4346x;
        }
        c activityType2 = bVar.getActivityType();
        return z0.l(x0.f4346x, activityType2 != null ? activityType2.getTypeKey() : null);
    }

    public static final x0 b(f fVar) {
        fVar.getClass();
        String activitySubType = fVar.getActivitySubType();
        if (activitySubType != null && activitySubType.length() != 0) {
            return z0.l(x0.f4346x, fVar.getActivitySubType());
        }
        String activityType = fVar.getActivityType();
        if (activityType == null || activityType.length() == 0) {
            return x0.f4346x;
        }
        return z0.l(x0.f4346x, fVar.getActivityType());
    }

    public static final ArrayList c(t tVar) {
        i.b payload;
        List<k> listG;
        DateTime dateTimeD;
        l payload2;
        DateTime dateTimeO;
        z userDailySummary;
        l payload3;
        DateTime dateTimeWithZone;
        v vVarA;
        DateTime dateTimeWithZone2;
        v vVarA2;
        DateTime dateTimeWithZone3;
        v vVarA3;
        DateTime dateTimeWithZone4;
        v vVarA4;
        i.b payload4;
        List<h> listB;
        DateTime dateTimeWithZone5;
        DateTime dateTimeWithZone6;
        List<f> listB2;
        List<gs1.b> listB3;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        gs1.a activitiesForDayDTO = tVar.getActivitiesForDayDTO();
        if (activitiesForDayDTO != null && (listB3 = activitiesForDayDTO.b()) != null) {
            for (gs1.b bVar : listB3) {
                c activityType = bVar.getActivityType();
                v vVarB = x.b(bVar.Z(), bVar.u(), new v.a.C1589a(z0.l(x0.f4346x, activityType != null ? activityType.getTypeKey() : null)), bVar.getDuration());
                if (vVarB != null) {
                    arrayList.add(vVarB);
                }
            }
        }
        g autoDetectedEventDTO = tVar.getAutoDetectedEventDTO();
        if (autoDetectedEventDTO != null && (listB2 = autoDetectedEventDTO.b()) != null) {
            for (f fVar : listB2) {
                v vVarB2 = x.b(fVar.k(), fVar.h(), new v.a.c(b(fVar)), fVar.getDuration());
                if (vVarB2 != null) {
                    arrayList.add(vVarB2);
                }
            }
        }
        a0 wellnessActivitySummaries = tVar.getWellnessActivitySummaries();
        if (wellnessActivitySummaries != null && (listB = wellnessActivitySummaries.b()) != null) {
            for (h hVar : listB) {
                v.a bVar2 = hVar.D() ? new v.a.b() : new v.a.f();
                DateTime dateTimeU = hVar.u();
                LocalDateTime localDateTime = (dateTimeU == null || (dateTimeWithZone6 = dateTimeU.withZone(DateTimeZone.getDefault())) == null) ? null : dateTimeWithZone6.toLocalDateTime();
                DateTime dateTimeK = hVar.k();
                LocalDateTime localDateTime2 = (dateTimeK == null || (dateTimeWithZone5 = dateTimeK.withZone(DateTimeZone.getDefault())) == null) ? null : dateTimeWithZone5.toLocalDateTime();
                v vVarB3 = x.b(localDateTime, localDateTime2, bVar2, Double.valueOf(Seconds.secondsBetween(localDateTime, localDateTime2).getSeconds() + 1));
                if (vVarB3 != null) {
                    arrayList.add(vVarB3);
                }
            }
        }
        o sleepTimesDTO = tVar.getSleepTimesDTO();
        if (sleepTimesDTO != null && (userDailySummary = tVar.getUserDailySummary()) != null && (payload3 = userDailySummary.getPayload()) != null) {
            DateTime dateTimeD2 = payload3.D();
            DateTime dateTimeR = payload3.r();
            DateTimeZone dateTimeZoneB = dateTimeR != null ? nz.a.b(dateTimeR, payload3.s()) : null;
            i currentDayDailySleepDTO = tVar.getCurrentDayDailySleepDTO();
            DateTimeZone dateTimeZoneA = (currentDayDailySleepDTO == null || (payload4 = currentDayDailySleepDTO.getPayload()) == null) ? null : u.a(payload4);
            DateTime dateTimeWithTimeAtStartOfDay = dateTimeD2 != null ? dateTimeD2.withTimeAtStartOfDay() : null;
            if (dateTimeZoneA == null) {
                dateTimeZoneA = DateTimeZone.getDefault();
            }
            dateTimeZoneA.getClass();
            if (dateTimeZoneB == null) {
                dateTimeZoneB = DateTimeZone.getDefault();
            }
            dateTimeZoneB.getClass();
            if (dateTimeWithTimeAtStartOfDay == null) {
                dateTimeWithTimeAtStartOfDay = payload3.o();
            }
            ArrayList arrayList2 = new ArrayList();
            DateTime dateTimeH = sleepTimesDTO.h();
            if (dateTimeH != null && (dateTimeWithZone4 = dateTimeH.withZone(dateTimeZoneA)) != null && (vVarA4 = x.a(dateTimeWithZone4, dateTimeWithTimeAtStartOfDay, v.a.e.d.f78891b)) != null) {
                arrayList2.add(vVarA4);
            }
            DateTime dateTimeG = sleepTimesDTO.g();
            if (dateTimeG != null && (dateTimeWithZone3 = dateTimeG.withZone(dateTimeZoneA)) != null && (vVarA3 = x.a(dateTimeWithZone3, dateTimeWithTimeAtStartOfDay, v.a.e.C1590a.f78888b)) != null) {
                arrayList2.add(vVarA3);
            }
            DateTime dateTimeF = sleepTimesDTO.f();
            if (dateTimeF != null && (dateTimeWithZone2 = dateTimeF.withZone(dateTimeZoneB)) != null && (vVarA2 = x.a(dateTimeWithZone2, dateTimeWithTimeAtStartOfDay, v.a.e.c.f78890b)) != null) {
                arrayList2.add(vVarA2);
            }
            DateTime dateTimeD3 = sleepTimesDTO.d();
            if (dateTimeD3 != null && (dateTimeWithZone = dateTimeD3.withZone(dateTimeZoneB)) != null && (vVarA = x.a(dateTimeWithZone, dateTimeWithTimeAtStartOfDay, v.a.e.b.f78889b)) != null) {
                arrayList2.add(vVarA);
            }
            arrayList.addAll(h0.N0(arrayList2, new w()));
        }
        i currentDayDailySleepDTO2 = tVar.getCurrentDayDailySleepDTO();
        if (currentDayDailySleepDTO2 != null && (payload = currentDayDailySleepDTO2.getPayload()) != null && (listG = payload.g()) != null) {
            for (k kVar : listG) {
                z userDailySummary2 = tVar.getUserDailySummary();
                LocalDate localDate = (userDailySummary2 == null || (payload2 = userDailySummary2.getPayload()) == null || (dateTimeO = payload2.o()) == null) ? null : dateTimeO.toLocalDate();
                LocalDateTime localDateTime3 = (localDate == null || (dateTimeD = kVar.d(localDate)) == null) ? null : dateTimeD.toLocalDateTime();
                Long napTimeSec = kVar.getNapTimeSec();
                v vVarB4 = x.b(localDateTime3, localDateTime3, new v.a.d(), napTimeSec != null ? Double.valueOf(napTimeSec.longValue()) : null);
                if (vVarB4 != null) {
                    arrayList.add(vVarB4);
                }
            }
        }
        return arrayList;
    }
}
