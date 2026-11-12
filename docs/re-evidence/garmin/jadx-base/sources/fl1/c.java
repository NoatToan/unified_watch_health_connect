package fl1;

import androidx.room.a0;
import b63.o;
import b63.q;
import b63.z;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lfl1/c;", "", "Lzp/a;", "activitiesRepository", "Lfl1/f;", "getDeviceWheelchairAvailability", "<init>", "(Lzp/a;Lfl1/f;)V", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zp.a f71992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f71993b;

    static {
        new a(null);
    }

    public c(zp.a aVar, f fVar) {
        aVar.getClass();
        fVar.getClass();
        this.f71992a = aVar;
        this.f71993b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:51:0x0120 A[LOOP:0: B:49:0x011a->B:51:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable a(Long l14, Integer num, v13.c cVar) {
        d dVar;
        Long l15;
        v2 v2Var;
        boolean zBooleanValue;
        Object objA;
        Long l16;
        v2 v2Var2;
        int iA;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Iterator it;
        zf2.d dVar2;
        Throwable thB;
        Boolean bool;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f71998e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f71998e = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        d dVar3 = dVar;
        Object objH3 = dVar3.f71996c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar3.f71998e;
        String strK = null;
        if (i15 == 0) {
            r.b(objH3);
            i2.f36769a.getClass();
            i2.a.b(a2.RECORD_ACTIVITY, "GetRecentRecordedActivitiesUseCase", "Getting recent recorded activities for deviceId: " + l14);
            e53.a.C1329a c1329a = e53.a.C1329a.f63093a;
            z.INSTANCE.getClass();
            o oVarG = b63.b.g(c1329a, z.Companion.a());
            b63.i.INSTANCE.getClass();
            o oVarC = q.c(oVarG, 90, b63.i.f16190d);
            int iIntValue = num != null ? num.intValue() : 5;
            dVar3.f71994a = l14;
            dVar3.f71998e = 1;
            objH3 = this.f71992a.H3(l14, oVarC, oVarG, iIntValue, dVar3);
            if (objH3 != aVar) {
                l15 = l14;
            }
            return aVar;
        }
        if (i15 == 1) {
            l15 = dVar3.f71994a;
            r.b(objH3);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var2 = dVar3.f71995b;
            l16 = dVar3.f71994a;
            r.b(objH3);
            objA = ((o13.q) objH3).f128597a;
        }
        thB = o13.q.b(objA);
        if (thB != null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.g(a2Var, "GetRecentRecordedActivitiesUseCase", thB);
        }
        bool = Boolean.FALSE;
        if (objA instanceof o13.q.b) {
            objA = bool;
        }
        zBooleanValue = ((Boolean) objA).booleanValue();
        Long l17 = l16;
        v2Var = v2Var2;
        l15 = l17;
        if (l15 != null) {
            rd2.j jVar = rd2.f.a().f152045a;
            long jLongValue = l15.longValue();
            jVar.getClass();
            strK = rd2.j.k(jLongValue);
        }
        if (strK == null) {
            strK = "";
        }
        kl1.c.f105264a.getClass();
        ArrayList arrayListS = y.s(kl1.c.a(strK, zBooleanValue).values());
        iA = t0.a(y.r(arrayListS, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : arrayListS) {
            linkedHashMap.put(((zf2.d) obj).f204629a, obj);
        }
        Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
        arrayList = new ArrayList();
        it = iterable.iterator();
        while (it.hasNext()) {
            dVar2 = (zf2.d) linkedHashMap.get((String) it.next());
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        a2 a2Var2 = a2.RECORD_ACTIVITY;
        String strK2 = a0.k("Successfully retrieved recent recorded activities: ", arrayList);
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "GetRecentRecordedActivitiesUseCase", strK2);
        int i16 = o13.q.f128596b;
        return arrayList;
        v2Var = (v2) objH3;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var3 = a2.RECORD_ACTIVITY;
            Exception exc = ((v2.a) v2Var).f47383a;
            i2.f36769a.getClass();
            i2.a.f(a2Var3, "GetRecentRecordedActivitiesUseCase", "Failed to retrieve recent recorded activities for deviceId: " + l15 + ", error: " + exc);
            int i17 = o13.q.f128596b;
            return r.a(exc);
        }
        if (l15 != null) {
            long jLongValue2 = l15.longValue();
            dVar3.f71994a = l15;
            dVar3.f71995b = (v2.b) v2Var;
            dVar3.f71998e = 2;
            objA = this.f71993b.a(jLongValue2, dVar3);
            if (objA != aVar) {
                l16 = l15;
                v2Var2 = v2Var;
                thB = o13.q.b(objA);
                if (thB != null) {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.g(a2Var4, "GetRecentRecordedActivitiesUseCase", thB);
                }
                bool = Boolean.FALSE;
                if (objA instanceof o13.q.b) {
                    objA = bool;
                }
                zBooleanValue = ((Boolean) objA).booleanValue();
                Long l18 = l16;
                v2Var = v2Var2;
                l15 = l18;
            }
            return aVar;
        }
        zBooleanValue = false;
        if (l15 != null) {
            rd2.j jVar2 = rd2.f.a().f152045a;
            long jLongValue3 = l15.longValue();
            jVar2.getClass();
            strK = rd2.j.k(jLongValue3);
        }
        if (strK == null) {
            strK = "";
        }
        kl1.c.f105264a.getClass();
        ArrayList arrayListS2 = y.s(kl1.c.a(strK, zBooleanValue).values());
        iA = t0.a(y.r(arrayListS2, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        while (r12.hasNext()) {
            linkedHashMap.put(((zf2.d) obj).f204629a, obj);
        }
        Iterable iterable2 = (Iterable) ((v2.b) v2Var).f47386a;
        arrayList = new ArrayList();
        it = iterable2.iterator();
        while (it.hasNext()) {
            dVar2 = (zf2.d) linkedHashMap.get((String) it.next());
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        a2 a2Var5 = a2.RECORD_ACTIVITY;
        String strK3 = a0.k("Successfully retrieved recent recorded activities: ", arrayList);
        i2.f36769a.getClass();
        i2.a.b(a2Var5, "GetRecentRecordedActivitiesUseCase", strK3);
        int i18 = o13.q.f128596b;
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lfl1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "RECENT_ACTIVITIES_COUNT", "I", "RECENT_ACTIVITIES_DAYS_RANGE", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
