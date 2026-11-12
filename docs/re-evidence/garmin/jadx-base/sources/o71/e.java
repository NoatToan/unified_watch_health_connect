package o71;

import c53.c0;
import gl1.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lc.u0;
import o13.p;
import org.joda.time.LocalDate;
import org.joda.time.YearMonth;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.k0;
import p13.x;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lo71/e;", "", "", "Lorg/joda/time/LocalDate;", "dates", "", "Lo71/e$c;", "rawStats", "Lo71/b;", "rawActivities", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V", "c", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f130175g = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<LocalDate> f130176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<LocalDate, c> f130177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<o71.b> f130178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<? extends o71.b> f130179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f130180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<LocalDate, c> f130181f;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo71/e$a;", "", "Lo71/g;", "interval", "Lj23/g;", "Lorg/joda/time/LocalDate;", "dateRange", "<init>", "(Lo71/g;Lj23/g;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f130182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j23.g<LocalDate> f130183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e23.a<? extends Map<LocalDate, c>> f130184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e23.l<? super Map<LocalDate, c>, ? extends List<? extends o71.b>> f130185d;

        public a(g gVar, j23.g<LocalDate> gVar2) {
            gVar.getClass();
            gVar2.getClass();
            this.f130182a = gVar;
            this.f130183b = gVar2;
            this.f130184c = new nw1.e(22);
            this.f130185d = new o62.a(10);
        }

        public final e a() {
            Map<LocalDate, c> mapInvoke = this.f130184c.invoke();
            return new e(c0.s(this.f130182a.f130210c.invoke(this.f130183b)), mapInvoke, mapInvoke != null ? this.f130185d.invoke(mapInvoke) : null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo71/e$c;", "", "Lorg/joda/time/LocalDate;", "date", "", "Lcom/garmin/android/apps/connectmobile/performance/dto/d;", "stats", "pastDate", "pastStats", "<init>", "(Lorg/joda/time/LocalDate;Ljava/util/List;Lorg/joda/time/LocalDate;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f130186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.performance.dto.d> f130187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f130188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.performance.dto.d> f130189d;

        public c(LocalDate localDate, List<com.garmin.android.apps.connectmobile.performance.dto.d> list, LocalDate localDate2, List<com.garmin.android.apps.connectmobile.performance.dto.d> list2) {
            localDate.getClass();
            localDate2.getClass();
            this.f130186a = localDate;
            this.f130187b = list;
            this.f130188c = localDate2;
            this.f130189d = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f130186a.equals(cVar.f130186a) && s.g(this.f130187b, cVar.f130187b) && this.f130188c.equals(cVar.f130188c) && s.g(this.f130189d, cVar.f130189d);
        }

        public final int hashCode() {
            int iHashCode = this.f130186a.hashCode() * 31;
            List<com.garmin.android.apps.connectmobile.performance.dto.d> list = this.f130187b;
            int iHashCode2 = (this.f130188c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
            List<com.garmin.android.apps.connectmobile.performance.dto.d> list2 = this.f130189d;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            return "StatsHolder(date=" + this.f130186a + ", stats=" + this.f130187b + ", pastDate=" + this.f130188c + ", pastStats=" + this.f130189d + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(List<LocalDate> list, Map<LocalDate, c> map, List<? extends o71.b> list2) {
        list.getClass();
        this.f130176a = list;
        this.f130177b = map;
        this.f130178c = list2;
        this.f130179d = list2 == 0 ? j0.f134944a : list2;
        this.f130180e = (map == null || list2 == 0) ? false : true;
        if (map == null) {
            map = k0.f134949a;
            map.getClass();
        }
        this.f130181f = map;
    }

    public static e b(e eVar) {
        List<LocalDate> list = eVar.f130176a;
        Map<LocalDate, c> map = eVar.f130177b;
        List<o71.b> list2 = eVar.f130178c;
        eVar.getClass();
        return new e(list, map, list2);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0120 A[EDGE_INSN: B:59:0x0120->B:76:0x016f BREAK  A[LOOP:4: B:54:0x010d->B:113:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<? extends o71.b>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public final void a(p71.f fVar, h hVar) {
        ?? arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        e23.l<com.garmin.android.apps.connectmobile.performance.dto.d, Number> lVar = hVar.f130227a;
        q13.c cVar = new q13.c();
        Map<LocalDate, c> map = this.f130177b;
        if (map != null) {
            for (Map.Entry<LocalDate, c> entry : map.entrySet()) {
                LocalDate key = entry.getKey();
                c value = entry.getValue();
                List<com.garmin.android.apps.connectmobile.performance.dto.d> list = value.f130187b;
                if (list != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        com.garmin.android.apps.connectmobile.performance.dto.d dVar = (com.garmin.android.apps.connectmobile.performance.dto.d) obj;
                        if (fVar.W1(dVar) && lVar.invoke(dVar).doubleValue() > 0.0d) {
                            arrayList2.add(obj);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                List<com.garmin.android.apps.connectmobile.performance.dto.d> list2 = value.f130189d;
                if (list2 != null) {
                    arrayList3 = new ArrayList();
                    for (Object obj2 : list2) {
                        com.garmin.android.apps.connectmobile.performance.dto.d dVar2 = (com.garmin.android.apps.connectmobile.performance.dto.d) obj2;
                        if (fVar.W1(dVar2) && lVar.invoke(dVar2).doubleValue() > 0.0d) {
                            arrayList3.add(obj2);
                        }
                    }
                } else {
                    arrayList3 = null;
                }
                if ((arrayList2 != null && !arrayList2.isEmpty()) || (arrayList3 != null && !arrayList3.isEmpty())) {
                    cVar.put(key, new c(value.f130186a, arrayList2, value.f130188c, arrayList3));
                }
            }
        }
        this.f130181f = cVar.b();
        List<o71.b> list3 = this.f130178c;
        if (list3 != null) {
            arrayList = new ArrayList();
            for (o71.b bVar : list3) {
                if (bVar instanceof o71.b.a) {
                    o71.b.a aVar = (o71.b.a) bVar;
                    aVar.a(fVar);
                    if (hVar.f130228b.invoke(aVar).doubleValue() <= 0.0d || !(fVar instanceof p71.a)) {
                        Set<com.garmin.android.apps.connectmobile.performance.dto.c> set = aVar.f130165k;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator it = set.iterator();
                            do {
                                if (!it.hasNext()) {
                                    bVar = null;
                                    break;
                                }
                            } while (!fVar.B0((com.garmin.android.apps.connectmobile.performance.dto.c) it.next()));
                        } else {
                            bVar = null;
                            break;
                        }
                    }
                } else {
                    if (!(bVar instanceof o71.b.C2480b)) {
                        u0.r();
                        return;
                    }
                    o71.b.C2480b c2480b = (o71.b.C2480b) bVar;
                    List<com.garmin.android.apps.connectmobile.performance.dto.d> list4 = c2480b.f130171h;
                    boolean z14 = false;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            if (fVar.W1((com.garmin.android.apps.connectmobile.performance.dto.d) it3.next())) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                    boolean z15 = z14;
                    YearMonth yearMonth = c2480b.f130170g;
                    Map<com.garmin.android.apps.connectmobile.performance.dto.c, Double> map2 = c2480b.f130172i;
                    Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> map3 = c2480b.f130173j;
                    Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> map4 = c2480b.f130174k;
                    yearMonth.getClass();
                    list4.getClass();
                    map2.getClass();
                    map3.getClass();
                    map4.getClass();
                    o71.b.C2480b c2480b2 = new o71.b.C2480b(yearMonth, list4, map2, map3, map4);
                    c2480b2.a(fVar);
                    if (!z15) {
                        bVar = null;
                        break;
                    }
                    bVar = c2480b2;
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
        } else {
            arrayList = j0.f134944a;
        }
        this.f130179d = arrayList;
    }

    public final Double c() {
        Double dH = h();
        if (dH != null) {
            double dDoubleValue = dH.doubleValue();
            ArrayList arrayListE = e();
            int i14 = 0;
            if (!arrayListE.isEmpty()) {
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    if (y.x((List) it.next(), h.VOLUME) > 0.0d && (i14 = i14 + 1) < 0) {
                        x.p();
                        throw null;
                    }
                }
            }
            if (i14 != 0) {
                return Double.valueOf(dDoubleValue / ((double) i14));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    public final Map<LocalDate, f.a> d(h hVar, boolean z14) {
        Float fValueOf;
        Float fValueOf2;
        c cVar;
        List<com.garmin.android.apps.connectmobile.performance.dto.d> list;
        List<com.garmin.android.apps.connectmobile.performance.dto.d> list2;
        if (!this.f130180e) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        ArrayList arrayList = new ArrayList();
        for (LocalDate localDate : this.f130176a) {
            c cVar2 = this.f130181f.get(localDate);
            if (cVar2 == null || (list2 = cVar2.f130187b) == null) {
                fValueOf = null;
            } else {
                float fX = (float) y.x(list2, hVar);
                fValueOf = Float.valueOf(fX);
                if (fX <= 0.0f) {
                    fValueOf = null;
                }
            }
            if (!z14 || (cVar = this.f130181f.get(localDate)) == null || (list = cVar.f130189d) == null) {
                fValueOf2 = null;
            } else {
                float fX2 = (float) y.x(list, hVar);
                fValueOf2 = Float.valueOf(fX2);
                if (fX2 <= 0.0f) {
                    fValueOf2 = null;
                }
            }
            p pVar = (fValueOf == null && fValueOf2 == null) ? null : new p(localDate, new f.a(fValueOf, fValueOf2));
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        Map<LocalDate, f.a> mapL = p13.u0.l(arrayList);
        Collection<f.a> collectionValues = mapL.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((f.a) it.next()).f130197a != null) {
                    return mapL;
                }
            }
        }
        k0 k0Var2 = k0.f134949a;
        k0Var2.getClass();
        return k0Var2;
    }

    public final ArrayList e() {
        Map<LocalDate, c> map = this.f130181f;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<LocalDate, c>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            List<com.garmin.android.apps.connectmobile.performance.dto.d> list = it.next().getValue().f130187b;
            if (list != null) {
                arrayList.add(list);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f130176a.equals(eVar.f130176a) && s.g(this.f130177b, eVar.f130177b) && s.g(this.f130178c, eVar.f130178c);
    }

    public final Double f() {
        ArrayList arrayListE = e();
        if (arrayListE.isEmpty()) {
            return null;
        }
        Iterator it = arrayListE.iterator();
        double dX = 0.0d;
        while (it.hasNext()) {
            dX += y.x((List) it.next(), h.REPS);
        }
        return Double.valueOf(dX);
    }

    public final Double g() {
        ArrayList arrayListE = e();
        if (arrayListE.isEmpty()) {
            return null;
        }
        Iterator it = arrayListE.iterator();
        double dX = 0.0d;
        while (it.hasNext()) {
            dX += y.x((List) it.next(), h.SETS);
        }
        return Double.valueOf(dX);
    }

    public final Double h() {
        ArrayList arrayListE = e();
        if (arrayListE.isEmpty()) {
            return null;
        }
        Iterator it = arrayListE.iterator();
        double dX = 0.0d;
        while (it.hasNext()) {
            dX += y.x((List) it.next(), h.VOLUME);
        }
        return Double.valueOf(dX);
    }

    public final int hashCode() {
        int iHashCode = this.f130176a.hashCode() * 31;
        Map<LocalDate, c> map = this.f130177b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<o71.b> list = this.f130178c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StrengthStats(dates=");
        sb3.append(this.f130176a);
        sb3.append(", rawStats=");
        sb3.append(this.f130177b);
        sb3.append(", rawActivities=");
        return z.c(sb3, this.f130178c, ")");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo71/e$b;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
