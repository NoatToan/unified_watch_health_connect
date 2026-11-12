package qy1;

import c22.l3;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import fg0.y;
import java.util.List;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import ps.b2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqy1/i;", "", "<init>", "()V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(double d14, double d15, long j8, int i14, v13.c cVar) {
        e eVar;
        h42.c cVar2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i15 = eVar.f148567c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                eVar.f148567c = i15 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objJ = eVar.f148565a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = eVar.f148567c;
        if (i16 == 0) {
            r.b(objJ);
            f42.b bVarA = f42.b.a.a(f42.b.f68862b);
            int iA = lb2.b.a(d14);
            int iA2 = lb2.b.a(d15);
            eVar.f148567c = 1;
            objJ = f0.J(bVarA, new f42.c(bVarA, iA, iA2, j8, i14, null), eVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            h42.b bVar = (h42.b) ((v2.b) v2Var).f47386a;
            h42.d historical = bVar.getHistorical();
            if (historical != null) {
                h42.f average = historical.getAverage();
                return new my1.c(null, average != null ? average.getValue() : null, historical.getRelativeHumidity());
            }
            List<h42.c> listB = bVar.b();
            if (listB != null && (cVar2 = listB.get(0)) != null) {
                h42.f temp = cVar2.getTemp();
                return new my1.c(null, temp != null ? temp.getValue() : null, cVar2.getRelativeHumidity());
            }
        } else if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(long j8, v13.c cVar) {
        f fVar;
        double dE;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f148570c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f148570c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objJ = fVar.f148568a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f148570c;
        if (i15 == 0) {
            r.b(objJ);
            hg0.b bVarA = hg0.b.a.a(hg0.b.f83652b);
            fVar.f148570c = 1;
            objJ = f0.J(bVarA, new hg0.f(bVarA, j8, null), fVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return null;
            }
            u0.r();
            return null;
        }
        b2 b2Var = (b2) ((v2.b) v2Var).f47386a;
        Double temp = b2Var.getTemp();
        if (temp != null) {
            double dDoubleValue = temp.doubleValue();
            l3.f23124b.getClass();
            dE = l3.a.e(dDoubleValue);
        } else {
            dE = 0.0d;
        }
        Double relativeHumidity = b2Var.getRelativeHumidity();
        return new my1.c(null, new Double(dE), relativeHumidity != null ? new Integer((int) relativeHumidity.doubleValue()) : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(int i14, int i15, long j8, v13.c cVar) {
        g gVar;
        T t7;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i16 = gVar.f148573c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                gVar.f148573c = i16 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objC = gVar.f148571a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = gVar.f148573c;
        if (i17 == 0) {
            r.b(objC);
            f42.b bVarA = f42.b.a.a(f42.b.f68862b);
            gVar.f148573c = 1;
            objC = bVarA.C(new f42.d(bVarA, i14, i15, j8, null, null, null), gVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (!(v2Var instanceof v2.b) || (t7 = ((v2.b) v2Var).f47386a) == 0) {
            return null;
        }
        h42.e eVar = (h42.e) t7;
        h42.f temperature = eVar.getTemperature();
        Double value = temperature != null ? temperature.getValue() : null;
        h42.f feelsLikeTemperature = eVar.getFeelsLikeTemperature();
        return new my1.c(feelsLikeTemperature != null ? feelsLikeTemperature.getValue() : null, value, null);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (r1 == r9) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(fg0.k kVar, v13.c cVar) {
        h hVar;
        long millis;
        Double lat;
        Double lon;
        h hVar2;
        long j8;
        my1.c cVar2;
        long j14;
        long j15;
        Double d14;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f148580g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f148580g = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        h hVar3 = hVar;
        Object objB = hVar3.f148578e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar3.f148580g;
        if (i15 != 0) {
            if (i15 == 1) {
                j14 = hVar3.f148577d;
                j15 = hVar3.f148576c;
                d14 = hVar3.f148575b;
                Double d15 = hVar3.f148574a;
                r.b(objB);
                lat = d15;
                hVar2 = hVar3;
                cVar2 = (my1.c) objB;
            } else if (i15 == 2) {
                j14 = hVar3.f148577d;
                j15 = hVar3.f148576c;
                d14 = hVar3.f148575b;
                Double d16 = hVar3.f148574a;
                r.b(objB);
                lat = d16;
                hVar2 = hVar3;
                cVar2 = (my1.c) objB;
            } else {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objB);
            }
            return (my1.c) objB;
        }
        r.b(objB);
        long j16 = 1000;
        millis = new DateTime().toLocalDate().toDateTimeAtCurrentTime().getMillis() / j16;
        y locationStartPoint = kVar.getLocationStartPoint();
        lat = locationStartPoint != null ? locationStartPoint.getLat() : null;
        y locationStartPoint2 = kVar.getLocationStartPoint();
        lon = locationStartPoint2 != null ? locationStartPoint2.getLon() : null;
        LocalDate date = kVar.getDate();
        fg0.r eventTimeLocal = kVar.getEventTimeLocal();
        LocalTime localTimeF = eventTimeLocal != null ? eventTimeLocal.f() : null;
        if (lat == null || lon == null || date == null || localTimeF == null) {
            return null;
        }
        og0.a aVar = og0.a.f131967a;
        fg0.r eventTimeLocal2 = kVar.getEventTimeLocal();
        String timeZoneId = eventTimeLocal2 != null ? eventTimeLocal2.getTimeZoneId() : null;
        aVar.getClass();
        long millis2 = og0.a.p(date, localTimeF, timeZoneId).getMillis() / j16;
        if (millis - millis2 <= 0) {
            double dDoubleValue = lat.doubleValue();
            double dDoubleValue2 = lon.doubleValue();
            hVar3.f148574a = lat;
            hVar3.f148575b = lon;
            hVar3.f148576c = millis;
            hVar3.f148577d = millis2;
            hVar3.f148580g = 1;
            hVar2 = hVar3;
            objB = a(dDoubleValue, dDoubleValue2, millis2, 1, hVar2);
            if (objB != obj) {
                j14 = millis2;
                j15 = millis;
                d14 = lon;
                cVar2 = (my1.c) objB;
            }
        } else {
            hVar2 = hVar3;
            fg0.j eventCustomization = kVar.getEventCustomization();
            Long associatedWithActivityId = eventCustomization != null ? eventCustomization.getAssociatedWithActivityId() : null;
            if (associatedWithActivityId != null) {
                long jLongValue = associatedWithActivityId.longValue();
                hVar2.f148574a = lat;
                hVar2.f148575b = lon;
                hVar2.f148576c = millis;
                hVar2.f148577d = millis2;
                hVar2.f148580g = 2;
                objB = b(jLongValue, hVar2);
                if (objB != obj) {
                    j14 = millis2;
                    j15 = millis;
                    d14 = lon;
                    cVar2 = (my1.c) objB;
                }
            } else {
                j8 = millis2;
                cVar2 = null;
                if (cVar2 == null) {
                    return cVar2;
                }
                int iA = lb2.b.a(lat.doubleValue());
                int iA2 = lb2.b.a(lon.doubleValue());
                hVar2.f148574a = null;
                hVar2.f148575b = null;
                hVar2.f148576c = millis;
                hVar2.f148577d = j8;
                hVar2.f148580g = 3;
                objB = c(iA, iA2, j8, hVar2);
            }
        }
        return obj;
        lon = d14;
        millis = j15;
        j8 = j14;
        if (cVar2 == null) {
            return cVar2;
        }
        int iA3 = lb2.b.a(lat.doubleValue());
        int iA4 = lb2.b.a(lon.doubleValue());
        hVar2.f148574a = null;
        hVar2.f148575b = null;
        hVar2.f148576c = millis;
        hVar2.f148577d = j8;
        hVar2.f148580g = 3;
        objB = c(iA3, iA4, j8, hVar2);
    }
}
