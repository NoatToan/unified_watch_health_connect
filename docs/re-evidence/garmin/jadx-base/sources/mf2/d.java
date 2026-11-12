package mf2;

import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.t0;
import p13.u0;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmf2/d;", "Lmf2/c;", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f118297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<UUID, h> f118298b = new ConcurrentHashMap<>();

    static {
        new a(null);
    }

    public static String f(Throwable th3) {
        Throwable cause = th3.getCause();
        return th3 + (cause != null ? "\nCaused by: ".concat(f(cause)) : "");
    }

    public static zk.d g() {
        zk.c cVar = zk.c.f205034a;
        List listC = w.c("FIREBASE");
        cVar.getClass();
        return new zk.d(cVar, null, listC);
    }

    public static zk.d h() {
        zk.c cVar = zk.c.f205034a;
        List listC = w.c("OMT");
        cVar.getClass();
        return new zk.d(cVar, null, listC);
    }

    @Override // mf2.c
    public final void a(h hVar) {
        int i14;
        int i15;
        int i16;
        String str;
        String str2;
        g gVar;
        zg2.c.f204692a.getClass();
        zg2.c.d("DefaultAnalyticsManager", "logSessionAnalytics started");
        mf2.a aVar = new mf2.a(hVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h hVar2 = aVar.f118296a;
        long j8 = hVar2.f118307b;
        i53.c cVarE = i53.a.e(hVar2.f118311f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : cVarE) {
            if (obj instanceof h.e.b) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h.d dVar = ((h.e.b) it.next()).f118339b;
            Integer num = (Integer) linkedHashMap.get(dVar);
            linkedHashMap.put(dVar, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
        i53.d dVarG = i53.a.g(linkedHashMap);
        i53.d<h.d, Long> dVarD = b.d(hVar2);
        w13.c<h.d> cVar = h.d.f118336m;
        ArrayList arrayList2 = new ArrayList();
        for (h.d dVar2 : cVar) {
            Integer num2 = (Integer) dVarG.get(dVar2);
            int iIntValue = num2 != null ? num2.intValue() : 0;
            Long l14 = dVarD.get(dVar2);
            int i17 = iIntValue;
            int iB = l14 != null ? MathKt.b(l14.longValue() / ((double) 1000)) : 0;
            if (i17 == 0 && iB == 0) {
                gVar = null;
            } else {
                String str3 = dVar2.f118337a;
                Integer num3 = (Integer) dVarG.get(dVar2);
                int iIntValue2 = num3 != null ? num3.intValue() : 0;
                Long l15 = dVarD.get(dVar2);
                gVar = new g(str3, iIntValue2, l15 != null ? MathKt.b(l15.longValue() / ((double) 1000)) : 0);
            }
            if (gVar != null) {
                arrayList2.add(gVar);
            }
        }
        ArrayList<g> arrayList3 = new ArrayList(arrayList2);
        if (hVar2.b() > 0) {
            i14 = 0;
            arrayList3.add(new g(h.b.PAUSED.f118322a, hVar2.b(), 0));
        } else {
            i14 = 0;
        }
        if (hVar2.a() > 0) {
            arrayList3.add(new g(h.b.DISCONNECTED.f118322a, hVar2.a(), i14));
        }
        w13.c<h.f> cVar2 = h.f.f118351m;
        ArrayList arrayList4 = new ArrayList();
        for (h.f fVar : cVar2) {
            i53.c cVarE2 = i53.a.e(hVar2.f118315j);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : cVarE2) {
                if (((h.f) obj2) == fVar) {
                    arrayList5.add(obj2);
                }
            }
            i iVar = arrayList5.isEmpty() ? null : new i(fVar.f118352a, arrayList5.size());
            if (iVar != null) {
                arrayList4.add(iVar);
            }
        }
        i53.c<i> cVarE3 = i53.a.e(arrayList4);
        ArrayList arrayList6 = hVar2.f118312g;
        if (arrayList6 == null || !arrayList6.isEmpty()) {
            Iterator it3 = arrayList6.iterator();
            i15 = i14;
            while (it3.hasNext()) {
                if ((((h.a) it3.next()) instanceof h.a.b) && (i15 = i15 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        } else {
            i15 = i14;
        }
        LinkedHashMap linkedHashMapF = u0.f(new p("viewedDuration", Integer.valueOf(b.c(hVar2))), new p("viewCount", Integer.valueOf(i15)), new p("includedWorkout", Boolean.valueOf(hVar2.f118308c)), new p("liveActivityPageViewsList", arrayList3), new p("liveActivityActionsList", cVarE3), new p("sport", b.a(hVar2)), new p("subSport", b.b(hVar2)));
        zg2.c cVar3 = zg2.c.f204692a;
        String str4 = "viewedDuration " + b.c(hVar2);
        cVar3.getClass();
        zg2.c.a("Analytics", str4);
        zg2.c.a("Analytics", "viewCount " + i15);
        for (g gVar2 : arrayList3) {
            zg2.c cVar4 = zg2.c.f204692a;
            String str5 = gVar2.getPageName() + " viewedDuration " + gVar2.getViewedDuration();
            cVar4.getClass();
            zg2.c.a("Analytics", str5);
            zg2.c.a("Analytics", gVar2.getPageName() + " viewedCount " + gVar2.getPageViews());
        }
        for (i iVar2 : cVarE3) {
            zg2.c cVar5 = zg2.c.f204692a;
            String str6 = iVar2.getActionType() + " count " + iVar2.getActionCount();
            cVar5.getClass();
            zg2.c.a("Analytics", str6);
        }
        String str7 = hVar2.f118309d;
        if (str7 != null) {
            linkedHashMapF.put("sessionEndState", str7);
            zg2.c cVar6 = zg2.c.f204692a;
            String strConcat = "sessionEndState ".concat(str7);
            cVar6.getClass();
            zg2.c.a("Analytics", strConcat);
        }
        Long l16 = hVar2.f118310e;
        int iB2 = l16 != null ? MathKt.b((l16.longValue() - j8) / ((long) 1000)) : 0;
        linkedHashMapF.put("sessionDuration", Integer.valueOf(iB2));
        zg2.c.f204692a.getClass();
        zg2.c.a("Analytics", "sessionDuration " + iB2);
        zk.a aVar2 = new zk.a("LIVEACTIVITY_SESSION", t0.b(new p("liveActivitySession", linkedHashMapF)), 0L, 4, null);
        zk.c cVar7 = zk.c.f205034a;
        List listC = w.c("GCS");
        cVar7.getClass();
        new zk.d(cVar7, null, listC).a(aVar2);
        Long l17 = hVar2.f118310e;
        LinkedHashMap linkedHashMapF2 = u0.f(new p("sessionDuration", Integer.valueOf(l17 != null ? MathKt.b((l17.longValue() - j8) / ((long) 1000)) : 0)));
        ArrayList arrayListA = b.a(hVar2);
        int size = arrayListA.size();
        if (size != 0) {
            i16 = 1;
            str = size != 1 ? "Multi" : (String) h0.b0(arrayListA);
        } else {
            i16 = 1;
            str = "None";
        }
        linkedHashMapF2.put("sport", str);
        ArrayList arrayListB = b.b(hVar2);
        int size2 = arrayListB.size();
        linkedHashMapF2.put("subsport", size2 != 0 ? size2 != i16 ? "Multi" : (String) h0.b0(arrayListB) : "None");
        int iC = b.c(hVar2);
        if (iC == 0) {
            str2 = "0";
        } else if (iC < 60) {
            str2 = "<1";
        } else if (iC <= 300) {
            str2 = "1-5";
        } else if (iC <= 900) {
            str2 = "5-15";
        } else {
            str2 = iC <= 1800 ? "15-30" : "30+";
        }
        linkedHashMapF2.put("viewedDuration", str2);
        String str8 = hVar2.f118309d;
        if (str8 == null) {
            str8 = "Unknown";
        }
        linkedHashMapF2.put("sessionEndState", str8);
        zk.a aVar3 = new zk.a("gcpLsvSession", linkedHashMapF2, 0L, 4, null);
        g().a(aVar3);
        h().a(aVar3);
        this.f118298b.remove(hVar.f118306a);
        zg2.c.d("DefaultAnalyticsManager", "logSessionAnalytics finished");
    }

    @Override // mf2.c
    public final h b(UUID uuid, vf2.p pVar, int i14, int i15) {
        uuid.getClass();
        ConcurrentHashMap<UUID, h> concurrentHashMap = this.f118298b;
        h hVar = concurrentHashMap.get(uuid);
        if (hVar != null) {
            zg2.c.f204692a.getClass();
            zg2.c.a("DefaultAnalyticsManager", "Found existing analytics session.");
            return hVar;
        }
        h hVar2 = new h(uuid, pVar, i14, i15);
        concurrentHashMap.put(uuid, hVar2);
        return hVar2;
    }

    @Override // mf2.c
    public final void c(e eVar) {
        this.f118297a = eVar;
    }

    @Override // mf2.c
    public final void d(long j8, Exception exc) {
        exc.getClass();
        zg2.c.f204692a.getClass();
        zg2.c.d("DefaultAnalyticsManager", "logWorkoutTransferFailure started");
        g().a(new zk.a("gcpLsvSessionWorkoutFailure", null, 0L, 6, null));
        kc2.g gVarI = i(j8);
        if (gVarI != null) {
            zk.a aVarA = new j(gVarI, new kc2.b("", "gcpLsvSessionWorkoutFailure", exc.getClass().getSimpleName(), f(exc), null, 16, null)).a();
            if (aVarA == null) {
                zg2.c.b("DefaultAnalyticsManager", "Missing AnalyticEvent");
            } else {
                h().a(aVarA);
            }
        }
        zg2.c.d("DefaultAnalyticsManager", "logWorkoutTransferFailure ended");
    }

    @Override // mf2.c
    public final void e(sf2.f.b bVar) {
        String strF;
        bVar.getClass();
        zg2.c.f204692a.getClass();
        zg2.c.d("DefaultAnalyticsManager", "logSessionStartError started");
        sf2.f.b.a aVar = bVar.f158994a;
        g().a(new zk.a("gcpLsvSessionError", u0.e(new p(NotificationConstants.KEY_DATA_MIME_TYPE, aVar.toString()), new p("productNumber", Integer.valueOf(bVar.f158996c)), new p("softwareVersion", Integer.valueOf(bVar.f158997d))), 0L, 4, null));
        kc2.g gVarI = i(bVar.f158995b);
        if (gVarI != null) {
            String string = aVar.toString();
            if (aVar instanceof sf2.f.b.a.g) {
                strF = f(((sf2.f.b.a.g) aVar).f159004a);
            } else if (aVar instanceof sf2.f.b.a.C3006a) {
                strF = "Malformed session UUID:\n" + ((sf2.f.b.a.C3006a) aVar).f158998a;
            } else {
                strF = "";
            }
            zk.a aVarA = new j(gVarI, new kc2.b("", "gcpLsvSessionError", string, strF, null, 16, null)).a();
            if (aVarA == null) {
                zg2.c.b("DefaultAnalyticsManager", "Failed to create AnalyticEvent");
            } else {
                h().a(aVarA);
            }
        }
        zg2.c.d("DefaultAnalyticsManager", "logSessionStartError finished");
    }

    public final kc2.g i(long j8) {
        e eVar = this.f118297a;
        if (eVar == null) {
            zg2.c.f204692a.getClass();
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.h("LiveActivity").warn(zg2.c.e("DefaultAnalyticsManager", "Missing delegate. Returning."));
            return null;
        }
        f fVarA = eVar.a(j8);
        if (fVarA == null) {
            zg2.c.f204692a.getClass();
            zg2.c.b("DefaultAnalyticsManager", "Failed to get device descriptor for " + j8);
            return null;
        }
        long j14 = fVarA.f118299a;
        String str = fVarA.f118300b;
        String str2 = str == null ? "" : str;
        String str3 = fVarA.f118301c;
        String str4 = str3 == null ? "" : str3;
        String str5 = fVarA.f118302d;
        return new kc2.g(j14, str2, str4, str5 == null ? "" : str5);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lmf2/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ERROR_NAME_SESSION_ERROR", "ERROR_NAME_WORKOUT_FILE_TRANSFER", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
