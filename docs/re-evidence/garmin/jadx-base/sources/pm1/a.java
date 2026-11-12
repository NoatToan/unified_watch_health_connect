package pm1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import g22.k;
import java.util.List;
import lc.u0;
import o13.r;
import o53.s0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p92.y;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lpm1/a;", "", "Lnm1/a;", "sleepRepository", "Lpm1/g;", "sleepPreferences", "<init>", "(Lnm1/a;Lpm1/g;)V", "a", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f138626c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm1.a f138627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f138628b;

    static {
        new C2620a(null);
    }

    public a(nm1.a aVar, g gVar) {
        aVar.getClass();
        gVar.getClass();
        this.f138627a = aVar;
        this.f138628b = gVar;
    }

    public static boolean c(LocalDate localDate, LocalDate localDate2) {
        if (localDate2 == null) {
            return false;
        }
        boolean z14 = localDate2.isAfter(localDate) || localDate2.isEqual(localDate);
        String strG = com.airbnb.lottie.animation.keyframe.a.g("Last date with sleep data is during last week [", "]", z14);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.k(a2Var, "GetCachedSleepDataUseCase", strG);
        return z14;
    }

    public static boolean d(LocalDate localDate) {
        if (localDate == null) {
            return false;
        }
        boolean zIsEqual = localDate.isEqual(LocalDate.now());
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.k(a2Var, "GetCachedSleepDataUseCase", "Last sleep request was made in [" + localDate + "], was it today [" + zIsEqual + "]");
        return zIsEqual;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(LocalDate localDate, LocalDate localDate2, v13.c cVar) throws Exception {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f138631c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f138631c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objE0 = cVar2.f138629a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f138631c;
        if (i15 == 0) {
            r.b(objE0);
            x53.c cVar3 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            d dVar = new d(this, localDate, localDate2, null);
            cVar2.f138631c = 1;
            objE0 = ge1.b.e0(bVar, dVar, cVar2);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
        List<mm1.c> listB = ((mm1.b) ((v2.b) v2Var).f47386a).b();
        if (listB == null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.k(a2Var, "GetCachedSleepDataUseCase", "No sleep data found in the last 7 days");
            return null;
        }
        String calendarDate = ((mm1.c) h0.m0(h0.N0(listB, new b()))).getCalendarDate();
        LocalDate localDateV = calendarDate != null ? k.v(calendarDate, "yyyy-MM-dd") : null;
        if (localDateV == null) {
            return null;
        }
        i2.a aVar3 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar3.getClass();
        i2.a.k(a2Var2, "GetCachedSleepDataUseCase", "Setting last date with sleep data as " + localDateV);
        this.f138628b.j(localDateV);
        return localDateV;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(v13.c cVar) {
        e eVar;
        LocalDate localDate;
        LocalDate localDate2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f138640e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f138640e = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f138638c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f138640e;
        g gVar = this.f138628b;
        boolean zC = true;
        try {
            if (i15 == 0) {
                r.b(obj);
                LocalDate localDateNow = LocalDate.now();
                LocalDate localDateMinusDays = localDateNow.minusDays(6);
                LocalDate localDateO = gVar.o();
                localDateMinusDays.getClass();
                boolean zC2 = c(localDateMinusDays, localDateO);
                if (d(gVar.p()) || zC2) {
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar.getClass();
                    i2.a.k(a2Var, "GetCachedSleepDataUseCase", "Sleep data already requested today and last date with sleep data is in [" + localDateO + "]");
                    zC = zC2;
                } else {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.k(a2Var2, "GetCachedSleepDataUseCase", "Make 7 day sleep data request, cache sleep data and save the request date");
                    eVar.f138636a = localDateNow;
                    eVar.f138637b = localDateMinusDays;
                    eVar.f138640e = 1;
                    Object objA = a(localDateMinusDays, localDateNow, eVar);
                    if (objA == obj2) {
                        return obj2;
                    }
                    localDate = localDateNow;
                    obj = objA;
                    localDate2 = localDateMinusDays;
                }
                return Boolean.valueOf(zC);
            }
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            localDate2 = eVar.f138637b;
            localDate = eVar.f138636a;
            r.b(obj);
            localDate.getClass();
            gVar.g(localDate);
            localDate2.getClass();
            zC = c(localDate2, (LocalDate) obj);
        } catch (Exception unused) {
            y.f136664a.getClass();
            y.a.c("GetCachedSleepDataUseCase", "Error while getting sleep data");
        }
        return Boolean.valueOf(zC);
    }

    /* JADX INFO: renamed from: pm1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpm1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2620a {
        public /* synthetic */ C2620a(j jVar) {
            this();
        }

        private C2620a() {
        }
    }
}
