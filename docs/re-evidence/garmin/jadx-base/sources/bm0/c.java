package bm0;

import g22.k;
import gm0.e;
import java.util.Iterator;
import java.util.Set;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.u;
import pb2.g;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbm0/c;", "Lbm0/a;", "Lgm0/a;", "Lpb2/g$c;", "Lam0/a;", "healthExportDataSource", "<init>", "(Lgm0/a;)V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gm0.a<g.c, am0.a> f18885a;

    static {
        int i14 = gm0.a.f77987d;
    }

    public c(gm0.a<g.c, am0.a> aVar) {
        aVar.getClass();
        this.f18885a = aVar;
    }

    public static boolean a(Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (set.contains((dm0.a) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // bm0.a
    public final Object Z(Set set, v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f18884c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f18884c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objL = bVar.f18882a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f18884c;
        if (i15 == 0) {
            r.b(objL);
            dm0.a aVar2 = dm0.a.WRITE_DISTANCE;
            boolean zA = a(set, u.m0(new dm0.a[]{aVar2, dm0.a.WRITE_FLOORS_CLIMBED, dm0.a.WRITE_STEPS}));
            boolean zA2 = a(set, u.m0(new dm0.a[]{dm0.a.WRITE_BODY_FAT, dm0.a.WRITE_WEIGHT}));
            dm0.a aVar3 = dm0.a.WRITE_EXERCISE;
            dm0.a aVar4 = dm0.a.WRITE_ELEVATION_GAINED;
            dm0.a aVar5 = dm0.a.WRITE_SPEED;
            dm0.a aVar6 = dm0.a.WRITE_ACTIVE_CALORIES_BURNED;
            dm0.a aVar7 = dm0.a.WRITE_HEART_RATE;
            boolean zA3 = a(set, u.m0(new dm0.a[]{aVar3, aVar4, aVar5, aVar2, aVar6, aVar7}));
            boolean zContains = set.contains(dm0.a.WRITE_SLEEP);
            boolean zA4 = a(set, u.m0(new dm0.a[]{aVar7, dm0.a.WRITE_RESTING_HEART_RATE}));
            boolean zA5 = a(set, u.m0(new dm0.a[]{aVar6, dm0.a.WRITE_TOTAL_CALORIES_BURNED}));
            DateTime dateTimeMinusDays = new DateTime().withTimeAtStartOfDay().minusDays(7);
            em0.a.f64581a.getClass();
            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).c().getSharedPreferences("google_health_connect", 0).getLong("ghc_sync_time", 0L)).withTimeAtStartOfDay();
            DateTime dateTime = k.h(dateTimeWithTimeAtStartOfDay, dateTimeMinusDays) ? dateTimeMinusDays : dateTimeWithTimeAtStartOfDay;
            dateTime.getClass();
            DateTime dateTime2 = new DateTime();
            LocalDateTime localDateTime = dateTime.toLocalDateTime();
            localDateTime.getClass();
            am0.a aVar8 = new am0.a(dateTime, dateTime2, localDateTime, new LocalDateTime(), zA, zA2, zA3, zContains, zA4, zA5);
            bVar.f18884c = 1;
            objL = this.f18885a.l(aVar8, bi.g.CacheAndNetwork, bVar);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objL);
        }
        return ((e) objL).f78009b;
    }
}
