package defpackage;

import android.content.Context;
import com.huawei.ads.adsrec.db.table.AdIECImpRecord;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.openplatform.abl.log.HiAdLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class ayb implements Comparable<ayb> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f773b;
    private final String d;
    private final aym e;
    private volatile Map<String, c> h;
    private final AtomicBoolean i = new AtomicBoolean(true);
    private final AtomicInteger j = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f774c = System.currentTimeMillis();

    boolean a() {
        if (this.h == null) {
            return true;
        }
        synchronized (this) {
            e();
            if (this.j.get() <= 0 && this.f773b + this.f774c <= System.currentTimeMillis()) {
                this.h.clear();
                this.h = null;
                return true;
            }
            return false;
        }
    }

    void d() {
        this.j.incrementAndGet();
    }

    void c() {
        this.j.decrementAndGet();
    }

    public void a(Set<String> set) {
        if (this.h == null || ListUtil.isEmpty(set)) {
            return;
        }
        synchronized (this) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                c cVar = this.h.get(it.next());
                if (cVar == null) {
                    HiAdLog.w("RTFilter", "content not in map");
                } else {
                    cVar.e();
                }
            }
        }
    }

    public void b(List<axm> list) {
        if (ListUtil.isEmpty(list)) {
            return;
        }
        b bVar = new b();
        for (axm axmVar : list) {
            long j = this.e.j(axmVar.j());
            List<axh> listB = axmVar.b();
            if (listB != null) {
                Iterator<axh> it = listB.iterator();
                while (it.hasNext()) {
                    bVar.d(it.next(), 60000 * j);
                }
            }
        }
        if (bVar.c()) {
            HiAdLog.w("RTFilter", "not to filter");
        } else {
            c(list, a(bVar));
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(ayb aybVar) {
        return this.f774c > aybVar.f774c ? -1 : 0;
    }

    private void e() {
        if (this.i.compareAndSet(false, true)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<Map.Entry<String, c>> it = this.h.entrySet().iterator();
            while (it.hasNext()) {
                c value = it.next().getValue();
                String[] strArrD = value.d();
                if (strArrD != null) {
                    if (value.a()) {
                        arrayList2.add(strArrD);
                    } else {
                        arrayList.add(strArrD);
                    }
                    value.b();
                }
            }
            com.huawei.ads.adsrec.e eVar = new com.huawei.ads.adsrec.e(this.f772a);
            if (!ListUtil.isEmpty(arrayList)) {
                arrayList.size();
                eVar.b(arrayList);
            }
            if (ListUtil.isEmpty(arrayList2)) {
                return;
            }
            arrayList2.size();
            eVar.a(arrayList2);
        }
    }

    private void d(Map<String, List<axh>> map, axh axhVar) {
        String strY = axhVar.y();
        List<axh> arrayList = map.get(strY);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(strY, arrayList);
        }
        arrayList.add(axhVar);
    }

    private void c(List<axm> list, Map<String, List<axh>> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (axm axmVar : list) {
            String strJ = axmVar.j();
            List<axh> listB = axmVar.b();
            List<axh> list2 = map.get(strJ);
            if (!ListUtil.isEmpty(listB) && !ListUtil.isEmpty(list2)) {
                ArrayList arrayList = new ArrayList();
                for (axh axhVar : listB) {
                    if (!list2.contains(axhVar)) {
                        arrayList.add(axhVar);
                    }
                }
                axmVar.b(arrayList);
            }
        }
    }

    private void e(long j, Map<String, List<axh>> map, axh axhVar, long j2) {
        String strI = axhVar.i();
        c cVar = this.h.get(strI);
        if (cVar == null || cVar.b(j, j2)) {
            a(j, strI);
        } else {
            d(map, axhVar);
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f779c;
        private final String d;
        private long e;

        void e() {
            this.e = this.f779c;
        }

        void b() {
            this.f779c = this.e;
            this.f778b = true;
        }

        boolean a() {
            return this.f778b;
        }

        String[] d() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.f778b) {
                return new String[]{this.f777a, this.d, String.valueOf(this.e), String.valueOf(jCurrentTimeMillis)};
            }
            long j = this.e;
            if (j == this.f779c) {
                return null;
            }
            return new String[]{String.valueOf(j), String.valueOf(jCurrentTimeMillis), this.f777a, this.d};
        }

        boolean b(long j, long j2) {
            return this.e + j2 < j;
        }

        c(String str, String str2, long j, boolean z) {
            this.f777a = str;
            this.d = str2;
            this.f779c = z ? j : 0L;
            this.e = j;
            this.f778b = z;
        }
    }

    private void d(long j, Map<String, List<axh>> map, axh axhVar) {
        a(j, axhVar.i());
        d(map, axhVar);
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<e> f775a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<e> f776c;

        boolean c() {
            return this.f776c.isEmpty() && this.f775a.isEmpty();
        }

        List<e> a() {
            return this.f775a;
        }

        void d(axh axhVar, long j) {
            (axhVar.r() == 0 ? this.f776c : this.f775a).add(new e(axhVar, j));
        }

        List<e> b() {
            return this.f776c;
        }

        private b() {
            this.f776c = new ArrayList();
            this.f775a = new ArrayList();
        }
    }

    private void a(long j, String str) {
        c cVar = this.h.get(str);
        if (cVar == null) {
            this.h.put(str, new c(this.d, str, j, false));
        } else {
            cVar.e = j;
        }
        e(j);
    }

    private void e(long j) {
        this.f774c = j;
        this.i.set(false);
    }

    private void b() {
        this.h = new ConcurrentHashMap();
        List<AdIECImpRecord> listA = new com.huawei.ads.adsrec.e(this.f772a).a(this.d);
        if (ListUtil.isEmpty(listA)) {
            return;
        }
        for (AdIECImpRecord adIECImpRecord : listA) {
            this.h.put(adIECImpRecord.c(), new c(this.d, adIECImpRecord.c(), adIECImpRecord.b(), true));
        }
    }

    static class e {
        private final axh d;
        private final long e;

        public long c() {
            return this.e;
        }

        public axh d() {
            return this.d;
        }

        e(axh axhVar, long j) {
            this.d = axhVar;
            this.e = j;
        }
    }

    private Set<String> b(b bVar, long j) {
        HashSet hashSet = new HashSet();
        Iterator<e> it = bVar.b().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().d().i());
        }
        return hashSet;
    }

    private Map<String, List<axh>> c(b bVar, long j, Set<String> set) {
        List<e> listA = bVar.a();
        if (ListUtil.isEmpty(listA)) {
            return null;
        }
        if (this.h == null) {
            b();
        }
        HashMap map = new HashMap();
        for (e eVar : listA) {
            axh axhVarD = eVar.d();
            if (set.contains(axhVarD.i())) {
                d(j, map, axhVarD);
            } else {
                e(j, map, axhVarD, eVar.c());
            }
        }
        return map;
    }

    private Map<String, List<axh>> a(b bVar) {
        Map<String, List<axh>> mapC;
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            mapC = c(bVar, jCurrentTimeMillis, b(bVar, jCurrentTimeMillis));
        }
        return mapC;
    }

    ayb(Context context, String str, long j) {
        this.f772a = context;
        this.d = str;
        this.f773b = j;
        this.e = aym.b(context);
    }
}
