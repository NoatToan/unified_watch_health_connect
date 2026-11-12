package co;

import c22.j0;
import o13.q;
import o13.r;
import o53.m0;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lco/d;", "", "Lao/d;", "repository", "Lam/d;", "activitiesDelegate", "Lcom/garmin/android/apps/connectmobile/googlehealthconnect/a;", "googleHealthConnectDelegate", "Lf12/l;", "userSettings", "Lqd2/a;", "cacheManager", "<init>", "(Lao/d;Lam/d;Lcom/garmin/android/apps/connectmobile/googlehealthconnect/a;Lf12/l;Lqd2/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao.d f28101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final am.d f28102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.googlehealthconnect.a f28103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.l f28104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qd2.a f28105e;

    public d(ao.d dVar, am.d dVar2, com.garmin.android.apps.connectmobile.googlehealthconnect.a aVar, f12.l lVar, qd2.a aVar2) {
        dVar.getClass();
        dVar2.getClass();
        aVar.getClass();
        lVar.getClass();
        this.f28101a = dVar;
        this.f28102b = dVar2;
        this.f28103c = aVar;
        this.f28104d = lVar;
        this.f28105e = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object a(wo0.a aVar, v13.c cVar) {
        c cVar2;
        long j8;
        Object objE;
        wo0.a aVar2;
        Object obj;
        qd2.a aVar3;
        String str;
        Long l14;
        Long l15;
        long jLongValue;
        long jLongValue2;
        wo0.a aVar4 = aVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f28100f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f28100f = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        c cVar3 = cVar2;
        Object obj2 = cVar3.f28098d;
        u13.a aVar5 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f28100f;
        if (i15 == 0) {
            r.b(obj2);
            j8 = aVar4.f186415a;
            cVar3.f28095a = aVar4;
            cVar3.f28097c = j8;
            cVar3.f28100f = 1;
            objE = this.f28101a.e(j8, cVar3);
            if (objE != aVar5) {
            }
            return aVar5;
        }
        if (i15 == 1) {
            j8 = cVar3.f28097c;
            aVar4 = cVar3.f28095a;
            r.b(obj2);
            objE = ((q) obj2).f128597a;
        } else {
            if (i15 != 2) {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj3 = cVar3.f28096b;
                r.b(obj2);
                return obj3;
            }
            j8 = cVar3.f28097c;
            obj = cVar3.f28096b;
            aVar2 = cVar3.f28095a;
            r.b(obj2);
        }
        aVar3 = this.f28105e;
        if (aVar3 != null && j8 > 0) {
            aVar3.h(qd2.a.EnumC2721a.ACTIVITY_DETAILS, j8);
            aVar3.h(qd2.a.EnumC2721a.ACTIVITY_CHARTS, j8);
            aVar3.h(qd2.a.EnumC2721a.ACTIVITY_SEGMENTS, j8);
        }
        this.f28104d.J(true);
        str = aVar2.f186419e;
        if (str != null) {
            l14 = new Long(j0.J(str, DateTimeZone.UTC));
        } else {
            l14 = null;
        }
        if (l14 != null) {
            l15 = new Long(l14.longValue() + ((long) (aVar2.f186417c * ((double) 1000))));
        } else {
            l15 = null;
        }
        if (l14 != null && l15 != null) {
            jLongValue = l14.longValue();
            jLongValue2 = l15.longValue();
            cVar3.f28095a = null;
            cVar3.f28096b = obj;
            cVar3.f28097c = j8;
            cVar3.f28100f = 3;
            if (this.f28103c.g(j8, jLongValue, jLongValue2, cVar3) == aVar5) {
                return aVar5;
            }
        }
        return obj;
        int i16 = q.f128596b;
        if (objE instanceof q.b) {
            return objE;
        }
        this.f28102b.e0(j8);
        e53.c.a aVar6 = e53.c.f63094b;
        long jE = e53.e.e(2000, e53.f.MILLISECONDS);
        cVar3.f28095a = aVar4;
        cVar3.f28096b = objE;
        cVar3.f28097c = j8;
        cVar3.f28100f = 2;
        if (m0.c(jE, cVar3) != aVar5) {
            aVar2 = aVar4;
            obj = objE;
            aVar3 = this.f28105e;
            if (aVar3 != null) {
                aVar3.h(qd2.a.EnumC2721a.ACTIVITY_DETAILS, j8);
                aVar3.h(qd2.a.EnumC2721a.ACTIVITY_CHARTS, j8);
                aVar3.h(qd2.a.EnumC2721a.ACTIVITY_SEGMENTS, j8);
            }
            this.f28104d.J(true);
            str = aVar2.f186419e;
            if (str != null) {
                l14 = new Long(j0.J(str, DateTimeZone.UTC));
            } else {
                l14 = null;
            }
            if (l14 != null) {
                l15 = new Long(l14.longValue() + ((long) (aVar2.f186417c * ((double) 1000))));
            } else {
                l15 = null;
            }
            if (l14 != null) {
                jLongValue = l14.longValue();
                jLongValue2 = l15.longValue();
                cVar3.f28095a = null;
                cVar3.f28096b = obj;
                cVar3.f28097c = j8;
                cVar3.f28100f = 3;
                if (this.f28103c.g(j8, jLongValue, jLongValue2, cVar3) == aVar5) {
                }
            }
            return obj;
        }
        return aVar5;
    }
}
