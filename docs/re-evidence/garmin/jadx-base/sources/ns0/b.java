package ns0;

import d53.u;
import d53.w;
import g22.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p13.y;
import yr0.d;
import yr0.e;
import yr0.f;
import yr0.g;
import yr0.i;
import yr0.j;
import yr0.o;
import yr0.q;
import yr0.r;
import yr0.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lns0/b;", "", "<init>", "()V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f127812a = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((j) t7).k("yyyy-MM-dd'T'HH:mm:ss"), ((j) t14).k("yyyy-MM-dd'T'HH:mm:ss"));
        }
    }

    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(p pVar) {
        j jVar = (j) pVar.f128594a;
        String strF = jVar.getDestinationLocation();
        j jVar2 = (j) pVar.f128595b;
        return s.g(strF, jVar2.getOriginLocation()) && s.g(jVar.getDestinationTimezone(), jVar2.getOriginTimezone());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(p pVar) {
        j jVar = (j) pVar.f128594a;
        String strM = jVar.getOriginLocation();
        j jVar2 = (j) pVar.f128595b;
        return s.g(strM, jVar2.getDestinationLocation()) && s.g(jVar.getOriginTimezone(), jVar2.getDestinationTimezone());
    }

    public static ArrayList c(List list, yr0.b bVar) {
        list.getClass();
        DateTime dateTimeNow = DateTime.now();
        LocalDate localDate = dateTimeNow.toLocalDate();
        LocalDate localDatePlusDays = localDate.plusDays(1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            j jVar = (j) obj;
            LocalDate localDateJ = jVar.j("yyyy-MM-dd'T'HH:mm:ss");
            LocalDate localDateB = jVar.b("yyyy-MM-dd'T'HH:mm:ss");
            DateTime dateTimeK = jVar.k("yyyy-MM-dd'T'HH:mm:ss");
            DateTime dateTimeD = jVar.d("yyyy-MM-dd'T'HH:mm:ss");
            if (bVar instanceof yr0.p) {
                if ((localDateJ != null && localDateJ.isBefore(localDate)) || (localDateB != null && localDateB.isBefore(localDate))) {
                    arrayList.add(obj);
                }
            } else if (bVar instanceof q) {
                if (localDateB != null) {
                    LocalDate localDate2 = ((q) bVar).f199044a;
                    if (localDateB.equals(localDate2) || localDateB.isBefore(localDate2)) {
                        arrayList.add(obj);
                    }
                }
            } else if (bVar instanceof yr0.c) {
                LocalDate localDate3 = ((yr0.c) bVar).f198936a;
                if (s.g(localDateJ, localDate3) || s.g(localDateB, localDate3)) {
                    arrayList.add(obj);
                }
            } else if (bVar instanceof r) {
                if (s.g(localDateJ, localDate) || s.g(localDateB, localDate)) {
                    arrayList.add(obj);
                }
            } else if (bVar instanceof yr0.s) {
                if (s.g(localDateJ, localDatePlusDays) || s.g(localDateB, localDatePlusDays)) {
                    arrayList.add(obj);
                }
            } else if (bVar instanceof e) {
                if (dateTimeD != null && dateTimeNow.isBefore(dateTimeD)) {
                    arrayList.add(obj);
                }
            } else if (!(bVar instanceof d) || ((dateTimeK != null && dateTimeK.isAfter(dateTimeNow)) || (dateTimeD != null && dateTimeD.isAfter(dateTimeNow)))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static double d(List list, yr0.b bVar) {
        j jVar;
        String strH;
        String strQ;
        if (list == null || list.isEmpty()) {
            return 0.0d;
        }
        ArrayList arrayListC = c(list, bVar);
        if (bVar instanceof d) {
            jVar = (j) h0.d0(arrayListC);
        } else {
            jVar = bVar instanceof yr0.c ? (j) h0.n0(arrayListC) : (j) h0.b0(h0.N0(list, new a()));
        }
        double d14 = ((jVar == null || (strH = jVar.getDestinationTimezone()) == null) ? 0.0d : Double.parseDouble(u.v(strH, ":", ".", false))) - ((jVar == null || (strQ = jVar.getOriginTimezone()) == null) ? 0.0d : Double.parseDouble(u.v(strQ, ":", ".", false)));
        double d15 = d14 % 1.0d;
        if (d15 != 0.0d && Math.signum(d15) != Math.signum(1.0d)) {
            d15 += 1.0d;
        }
        double d16 = 10;
        double dRint = Math.rint(d15 * d16) / d16;
        return (dRint / 0.6d) + (d14 - dRint);
    }

    public static String e(String str) {
        return str != null ? w.g0(str, ",") : "";
    }

    public static String f(o oVar) {
        String strG0;
        oVar.getClass();
        List<j> list = oVar.f199040e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() == 1 || list.size() == 2) {
            j jVar = (j) h0.d0(list);
            return e(jVar != null ? jVar.getDestinationLocation() : null);
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String strF = ((j) it.next()).getDestinationLocation();
            if (strF != null) {
                f127812a.getClass();
                strG0 = w.g0(strF, ",");
            } else {
                strG0 = null;
            }
            arrayList.add(strG0);
        }
        arrayList.remove(arrayList.size() - 1);
        return h0.k0(arrayList, " - ", null, null, null, 62);
    }

    public static p g(String str) {
        double d14 = Double.parseDouble(u.v(str, ":", ".", false));
        double d15 = d14 % ((double) 1);
        return new p(Integer.valueOf((int) (d14 - d15)), Integer.valueOf((int) d15));
    }

    public static int h(f fVar) {
        if (fVar == null) {
            return -1;
        }
        return i(new p(fVar.s(), fVar.i()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int i(p pVar) {
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDate = (LocalDate) pVar.f128594a;
        LocalDate localDate2 = (LocalDate) pVar.f128595b;
        if (localDate == null || localDate2 == null) {
            return -1;
        }
        if (localDate.isAfter(localDateNow)) {
            return Days.daysBetween(localDateNow, localDate).getDays();
        }
        if (localDate.isBefore(localDateNow) || localDate.isEqual(localDateNow)) {
            return (localDate2.isAfter(localDateNow) || localDate2.isEqual(localDateNow)) ? 0 : -1;
        }
        return -1;
    }

    public static Integer j(g gVar) {
        if (gVar == null) {
            return null;
        }
        f fVar = gVar.f198958a;
        List<j> listJ = fVar.j();
        t tVar = gVar.f198960c;
        if (tVar == t.PAST_PRE_TRIP) {
            return Integer.valueOf((int) (d(listJ, null) * ((double) 60)));
        }
        if (tVar == t.PAST_TRAVEL_DAY) {
            return Integer.valueOf((int) (d(listJ, new yr0.c(fVar.i())) * ((double) 60)));
        }
        if (tVar != t.PAST_PRE_FLIGHT) {
            return (tVar == t.PRE_TRIP || tVar == t.TRAVELING) ? Integer.valueOf((int) (d(listJ, d.f198937a) * ((double) 60))) : fVar.getBodyClockDifference();
        }
        LocalDate localDateI = fVar.i();
        return Integer.valueOf((int) (d(listJ, new yr0.c(localDateI != null ? localDateI.plusDays(1) : null)) * ((double) 60)));
    }

    public static p l(o oVar) {
        DateTime dateTimeK;
        oVar.getClass();
        List<j> list = oVar.f199040e;
        DateTime dateTimeD = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        j jVar = (j) h0.d0(list);
        if (jVar != null) {
            j.Companion bVar = j.INSTANCE;
            dateTimeK = jVar.k("yyyy-MM-dd'T'HH:mm:ss.S");
        } else {
            dateTimeK = null;
        }
        j jVar2 = (j) h0.n0(list);
        if (jVar2 != null) {
            j.Companion bVar2 = j.INSTANCE;
            dateTimeD = jVar2.d("yyyy-MM-dd'T'HH:mm:ss.S");
        }
        return new p(dateTimeK, dateTimeD);
    }

    public static boolean m(o oVar) {
        DateTime dateTimeD;
        j jVar;
        if (oVar != null) {
            DateTime dateTimeNow = DateTime.now();
            List<j> list = oVar.f199040e;
            if (list == null || (jVar = (j) h0.m0(list)) == null) {
                dateTimeD = null;
            } else {
                j.Companion bVar = j.INSTANCE;
                dateTimeD = jVar.d("yyyy-MM-dd'T'HH:mm:ss.S");
            }
            if (s.g(k.w(oVar.f199039d, "yyyy-MM-dd"), dateTimeNow.toLocalDate())) {
                if (dateTimeD != null ? dateTimeD.isBefore(dateTimeNow) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean n(g gVar) {
        t tVar;
        if (gVar == null || (tVar = gVar.f198960c) == null) {
            return false;
        }
        return tVar == t.PAST || tVar == t.PAST_NO_GUIDANCE || tVar == t.PAST_PRE_TRIP || tVar == t.PAST_TRAVEL_DAY || tVar == t.PAST_PRE_FLIGHT;
    }

    public static boolean o(List list, LocalDate localDate, Boolean bool) {
        yr0.b cVar;
        if (list == null || list.isEmpty()) {
            return false;
        }
        ArrayList arrayListC = c(list, yr0.p.f199043a);
        ArrayList arrayListC2 = c(list, r.f199045a);
        if (bool.equals(Boolean.TRUE)) {
            cVar = new yr0.c(localDate != null ? localDate.plusDays(1) : null);
        } else {
            cVar = yr0.s.f199046a;
        }
        return !(arrayListC.isEmpty() && arrayListC2.isEmpty()) && c(arrayListC2, e.f198938a).isEmpty() && c(list, cVar).isEmpty();
    }

    public static boolean p(Integer num, t tVar) {
        return num != null && num.intValue() <= 0 && h0.R(x.k(t.PAST, t.AT_DESTINATION, t.ACCLIMATED), tVar);
    }

    public static boolean q(o oVar) {
        oVar.getClass();
        return i(new p(oVar.d(), k.w(oVar.f199039d, "yyyy-MM-dd"))) == 0 && !m(oVar);
    }

    public static i r(j jVar) {
        return new i(jVar.getFlightId(), jVar.getTripId(), jVar.getOriginLocation(), jVar.getOriginTimezone(), jVar.j("yyyy-MM-dd'T'HH:mm:ss.S"), jVar.o("yyyy-MM-dd'T'HH:mm:ss.S"), jVar.getDestinationLocation(), jVar.getDestinationTimezone(), jVar.b("yyyy-MM-dd'T'HH:mm:ss.S"), jVar.g("yyyy-MM-dd'T'HH:mm:ss.S"));
    }

    public final t k(f fVar, int i14) {
        Integer numB;
        LocalDate localDateI;
        fVar.getClass();
        LocalDate localDateI2 = fVar.i();
        if (localDateI2 == null) {
            return null;
        }
        LocalDate localDate = new LocalDate();
        boolean zIsBefore = localDateI2.isBefore(localDate);
        boolean zEquals = localDateI2.equals(localDate);
        if (zIsBefore && Days.daysBetween(localDateI2, fVar.s()).getDays() >= 3) {
            return t.PAST_NO_GUIDANCE;
        }
        if (zIsBefore && (localDateI = fVar.i()) != null && localDateI.isBefore(fVar.s())) {
            return t.PAST_PRE_TRIP;
        }
        if (zIsBefore) {
            LocalDate localDateI3 = fVar.i();
            List<j> listJ = fVar.j();
            ArrayList arrayListC = listJ != null ? c(listJ, new yr0.c(localDateI3)) : null;
            if (arrayListC != null && !arrayListC.isEmpty() && !arrayListC.isEmpty()) {
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    if (s.g(((j) it.next()).b("yyyy-MM-dd'T'HH:mm:ss"), localDateI3 != null ? localDateI3.plusDays(1) : null)) {
                        return t.PAST_TRAVEL_DAY;
                    }
                }
            }
        }
        if (zIsBefore && !o(fVar.j(), localDateI2, Boolean.TRUE)) {
            return t.PAST_PRE_FLIGHT;
        }
        if (zIsBefore && fVar.getSeverity() == 1) {
            return t.PAST_ACCLIMATED;
        }
        if (zIsBefore && ((numB = fVar.getBodyClockDifference()) == null || numB.intValue() != 0)) {
            return t.PAST;
        }
        if (zEquals && (i14 == 1 || i14 == 2)) {
            return t.PRE_TRIP;
        }
        if (!zEquals || o(fVar.j(), null, Boolean.FALSE)) {
            return (zEquals && o(fVar.j(), null, Boolean.FALSE) && fVar.getSeverity() == 1) ? t.ACCLIMATED : t.AT_DESTINATION;
        }
        return t.TRAVELING;
    }
}
