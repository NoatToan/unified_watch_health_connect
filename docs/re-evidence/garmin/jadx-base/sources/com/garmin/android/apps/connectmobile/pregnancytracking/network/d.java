package com.garmin.android.apps.connectmobile.pregnancytracking.network;

import c83.a0;
import c83.h;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import db1.e;
import db1.l;
import db1.m;
import db1.n;
import db1.r;
import fb1.q;
import gb1.u;
import gb1.v;
import gb1.w;
import i83.f;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import qb1.g;
import v13.i;
import ww0.j;
import ww0.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/network/d;", "", "<init>", "()V", "a", "b", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f40430a = new b(null);

    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0016\u0010\u000eJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0006J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u0007H§@¢\u0006\u0004\b\u001e\u0010\u000eJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u001dH§@¢\u0006\u0004\b \u0010!J\"\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00022\b\b\u0001\u0010\"\u001a\u00020\u0007H§@¢\u0006\u0004\b$\u0010\u000eJ,\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00022\b\b\u0001\u0010%\u001a\u00020\u00072\b\b\u0001\u0010&\u001a\u00020\u0007H§@¢\u0006\u0004\b'\u0010(J \u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010*\u001a\u00020)H§@¢\u0006\u0004\b+\u0010,J \u0010/\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010.\u001a\u00020-H§@¢\u0006\u0004\b/\u00100J \u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u00101\u001a\u00020\u0007H§@¢\u0006\u0004\b2\u0010\u000eJ4\u00104\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u00010\u00030\u00022\b\b\u0001\u0010%\u001a\u00020\u00072\b\b\u0001\u0010&\u001a\u00020\u0007H§@¢\u0006\u0004\b4\u0010(J6\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00022\b\b\u0001\u00105\u001a\u00020\u00072\b\b\u0001\u00106\u001a\u00020\u00072\b\b\u0001\u00107\u001a\u00020\u0007H§@¢\u0006\u0004\b9\u0010:J,\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u00022\b\b\u0001\u0010%\u001a\u00020\u00072\b\b\u0001\u0010&\u001a\u00020\u0007H§@¢\u0006\u0004\b<\u0010(¨\u0006=À\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/network/d$a;", "", "Lc83/a0;", "", "Ldb1/m;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Lt13/d;)Ljava/lang/Object;", "", "dueDate", "pregnancySnapshotDTO", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Ldb1/m;Lt13/d;)Ljava/lang/Object;", "", "f", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "todayDate", "Ldb1/e;", "initPregnancyCycleDTO", "Ldb1/f;", "h", "(Ljava/lang/String;Ldb1/e;Lt13/d;)Ljava/lang/Object;", "Lww0/j;", JWKParameterNames.RSA_MODULUS, "m", "Lww0/b;", "dailyMenstrualCycleLogDTO", "c", "(Ljava/lang/String;Lww0/b;Lt13/d;)Ljava/lang/Object;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lpd1/c;", "b", "userReminderListDTO", "a", "(Lpd1/c;Lt13/d;)Ljava/lang/Object;", "calendarDate", "Ldb1/s;", "g", "startDate", "endDate", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Ldb1/t;", "userGlucoseInputDTO", "p", "(Ldb1/t;Lt13/d;)Ljava/lang/Object;", "Ldb1/r;", "userGlucoseDTO", "l", "(Ldb1/r;Lt13/d;)Ljava/lang/Object;", "userMeasurementTimestamp", JWKParameterNames.OCT_KEY_VALUE, "Ldb1/n;", "o", "fromDate", "toDate", "todayCalendarDate", "Lww0/k;", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Ldb1/l;", "d", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface a {
        @p("/userprofile-service/userprofile/user-reminders")
        Object a(@i83.a pd1.c cVar, t13.d<? super a0<Unit>> dVar);

        @f("/userprofile-service/userprofile/user-reminders")
        Object b(@t(NotificationConstants.KEY_DATA_MIME_TYPE) String str, t13.d<? super a0<pd1.c>> dVar);

        @o("periodichealth-service/menstrualcycle/dailylog/{calendarDate}")
        Object c(@s("calendarDate") String str, @i83.a ww0.b bVar, t13.d<? super a0<ww0.b>> dVar);

        @f("/periodichealth-service/reports/menstrualcycle/notes/{startDate}/{endDate}")
        Object d(@s("startDate") String str, @s("endDate") String str2, t13.d<? super a0<l>> dVar);

        @p("/periodichealth-service/menstrualcycle/pregnancysnapshot/{originalDueDate}")
        Object e(@s("originalDueDate") String str, @i83.a m mVar, t13.d<? super a0<m>> dVar);

        @i83.b("/periodichealth-service/menstrualcycle/pregnancysnapshot/{originalDueDate}")
        Object f(@s("originalDueDate") String str, t13.d<? super a0<Unit>> dVar);

        @f("/biometric-service/biometric/glucose/{calendarDate}")
        Object g(@s("calendarDate") String str, t13.d<? super a0<db1.s>> dVar);

        @o("/periodichealth-service/menstrualcycle/initpregnancysetup/{today}")
        Object h(@s("today") String str, @i83.a e eVar, t13.d<? super a0<db1.f>> dVar);

        @f("/biometric-service/biometric/glucose/{startDate}/{endDate}")
        Object i(@s("startDate") String str, @s("endDate") String str2, t13.d<? super a0<db1.s>> dVar);

        @f("/periodichealth-service/reports/menstrualcycle/weekdaterange/{fromdate}/{todate}")
        Object j(@s("fromdate") String str, @s("todate") String str2, @t("todayCalendarDate") String str3, t13.d<? super a0<k>> dVar);

        @i83.b("/biometric-service/biometric/glucose/{userMeasurementTimestamp}")
        Object k(@s("userMeasurementTimestamp") String str, t13.d<? super a0<Unit>> dVar);

        @p("/biometric-service/biometric/glucose")
        Object l(@i83.a r rVar, t13.d<? super a0<Unit>> dVar);

        @f("/device-service/deviceregistration/devices")
        Object m(t13.d<? super a0<String>> dVar);

        @f("/periodichealth-service/menstrualcycle/lastconfirmed/{todayDate}")
        Object n(@s("todayDate") String str, t13.d<? super a0<j>> dVar);

        @f("weight-service/weight/daily/last?")
        Object o(@t("startDate") String str, @t("endDate") String str2, t13.d<? super a0<List<n>>> dVar);

        @o("/biometric-service/biometric/glucose")
        Object p(@i83.a db1.t tVar, t13.d<? super a0<Unit>> dVar);

        @f("/periodichealth-service/menstrualcycle/pregnancysnapshot/all")
        Object q(t13.d<? super a0<List<m>>> dVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/network/d$b;", "", "<init>", "()V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Object a(DateTime dateTime, fb1.p pVar) {
            a aVarK = k();
            String string = dateTime.toString();
            string.getClass();
            return aVarK.k(string, pVar);
        }

        public static Object b(String str, i iVar) {
            return k().f(str, iVar);
        }

        public static Object c(g gVar) {
            return k().m(gVar);
        }

        public static Object d(LocalDate localDate, LocalDate localDate2, u uVar) {
            a aVarK = k();
            String string = localDate.toString();
            string.getClass();
            String string2 = localDate2.toString();
            string2.getClass();
            return aVarK.i(string, string2, uVar);
        }

        public static Object e(LocalDate localDate, i iVar) {
            a aVarK = k();
            String string = localDate.toString();
            string.getClass();
            return aVarK.g(string, iVar);
        }

        public static Object f(String str, v13.c cVar) {
            return k().n(str, cVar);
        }

        public static Object g(LocalDate localDate, LocalDate localDate2, v vVar) {
            a aVarK = k();
            String string = localDate.toString();
            string.getClass();
            String string2 = localDate2.toString();
            string2.getClass();
            String string3 = new LocalDate().toString();
            string3.getClass();
            return aVarK.j(string, string2, string3, vVar);
        }

        public static Object h(LocalDate localDate, LocalDate localDate2, w wVar) {
            a aVarK = k();
            String string = localDate.toString();
            string.getClass();
            String string2 = localDate2.toString();
            string2.getClass();
            return aVarK.d(string, string2, wVar);
        }

        public static Object i(v13.c cVar) {
            return k().q(cVar);
        }

        public static Object j(LocalDate localDate, LocalDate localDate2, qb1.o oVar) {
            a aVarK = k();
            String string = localDate.toString();
            string.getClass();
            String string2 = localDate2.toString();
            string2.getClass();
            return aVarK.o(string, string2, oVar);
        }

        public static a k() {
            return (a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, a.class, new h.a[]{new sd1.a()}, null, null, null, 120);
        }

        public static Object l(pd1.a aVar, rb1.h hVar) {
            return k().b(aVar.f137376a, hVar);
        }

        public static Object m(LocalDate localDate, ww0.b bVar, i iVar) {
            ww0.b bVarB = ww0.b.b(bVar, null, DateTime.now(DateTimeZone.UTC), 7679);
            a aVarK = k();
            String string = localDate.toString();
            string.getClass();
            return aVarK.c(string, bVarB, iVar);
        }

        public static Object n(db1.t tVar, fb1.o oVar) {
            return k().p(tVar, oVar);
        }

        public static Object o(String str, e eVar, qb1.v vVar) {
            return k().h(str, eVar, vVar);
        }

        public static Object p(r rVar, q qVar) {
            return k().l(rVar, qVar);
        }

        public static Object q(String str, m mVar, v13.c cVar) {
            String string;
            LocalDate originalDueDate = mVar.getOriginalDueDate();
            if (originalDueDate != null && (string = originalDueDate.toString()) != null) {
                str = string;
            }
            return k().e(str, mVar, cVar);
        }

        public static Object r(pd1.c cVar, rb1.h hVar) {
            return k().a(cVar, hVar);
        }

        private b() {
        }
    }
}
