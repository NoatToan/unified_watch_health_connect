package ci;

import ch.qos.logback.core.joran.action.Action;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p13.c1;
import p13.d0;
import p13.h0;
import p13.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lci/h;", "Lci/j;", "", "maxSizeBytes", "", "expireAfterMillis", "<init>", "(IJ)V", "a", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final di.b f27602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final di.d<String, a> f27603d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lci/h$a;", "", "Lci/n;", "record", "", "expireAfterMillis", "<init>", "(Lci/n;J)V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f27604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f27605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f27606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27607d;

        public a(n nVar, long j8) {
            nVar.getClass();
            this.f27604a = nVar;
            this.f27605b = j8;
            int i14 = mi.a.f118679a;
            this.f27606c = System.currentTimeMillis();
            Map<String, Long> map = nVar.f27619d;
            int size = map != null ? map.size() * 8 : 0;
            di.g gVar = di.g.f59707a;
            int length = x63.b.b(nVar.f27616a).length + 16;
            for (Map.Entry<String, Object> entry : nVar.f27617b.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                int length2 = x63.b.b(key).length;
                di.g.f59707a.getClass();
                length += di.g.a(value) + length2;
            }
            this.f27607d = length + size + 8;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lci/n;", "invoke", "()Lci/n;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends w implements e23.a<n> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ci.a f27610c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ci.a aVar) {
            super(0);
            this.f27609b = str;
            this.f27610c = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0037  */
        /* JADX WARN: Code duplicated, block: B:19:0x0044  */
        /* JADX WARN: Code duplicated, block: B:21:0x004e  */
        @Override // e23.a
        public final n invoke() {
            n nVarA;
            di.d.b<String, a> bVarRemove;
            h hVar = h.this;
            di.d<String, a> dVar = hVar.f27603d;
            LinkedHashMap<String, di.d.b<String, a>> linkedHashMap = dVar.f59691c;
            String str = this.f27609b;
            di.d.b<String, a> bVar = linkedHashMap.get(str);
            if (bVar != null) {
                dVar.a(bVar);
            }
            a aVar = bVar != null ? bVar.f59697b : null;
            ci.a aVar2 = this.f27610c;
            if (aVar != null) {
                long j8 = aVar.f27605b;
                if (j8 < 0) {
                    aVar2.getClass();
                    if (aVar2.f27592a.containsKey("evict-after-read")) {
                        bVarRemove = dVar.f59691c.remove(str);
                        if (bVarRemove != null) {
                            dVar.c(bVarRemove);
                        }
                    }
                } else {
                    int i14 = mi.a.f118679a;
                    if (System.currentTimeMillis() - aVar.f27606c >= j8) {
                        bVarRemove = dVar.f59691c.remove(str);
                        if (bVarRemove != null) {
                            dVar.c(bVarRemove);
                        }
                    } else {
                        aVar2.getClass();
                        if (aVar2.f27592a.containsKey("evict-after-read")) {
                            bVarRemove = dVar.f59691c.remove(str);
                            if (bVarRemove != null) {
                                dVar.c(bVarRemove);
                            }
                        }
                    }
                }
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j14 = aVar.f27605b;
                if (j14 >= 0) {
                    int i15 = mi.a.f118679a;
                    if (System.currentTimeMillis() - aVar.f27606c >= j14) {
                        aVar = null;
                    }
                }
                if (aVar != null) {
                    return aVar.f27604a;
                }
            }
            j jVar = hVar.f27614a;
            if (jVar == null || (nVarA = jVar.a(str, aVar2)) == null) {
                return null;
            }
            dVar.b(str, new a(nVarA, hVar.f27601b));
            return nVarA;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", Action.KEY_ATTRIBUTE, "Lci/h$a;", "cacheEntry", "", "invoke", "(Ljava/lang/String;Lci/h$a;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends w implements p<String, a, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27611a = new c();

        public c() {
            super(2);
        }

        @Override // e23.p
        public final Integer invoke(String str, a aVar) {
            String str2 = str;
            a aVar2 = aVar;
            str2.getClass();
            return Integer.valueOf(x63.b.b(str2).length + (aVar2 != null ? aVar2.f27607d : 0));
        }
    }

    public h(int i14, long j8) {
        this.f27601b = j8;
        this.f27602c = new di.b();
        this.f27603d = new di.d<>(i14, c.f27611a);
    }

    @Override // ci.m
    public final n a(String str, ci.a aVar) {
        n nVarInvoke;
        str.getClass();
        aVar.getClass();
        di.b bVar = this.f27602c;
        b bVar2 = new b(str, aVar);
        bVar.getClass();
        synchronized (bVar) {
            nVarInvoke = bVar2.invoke();
        }
        return nVarInvoke;
    }

    @Override // ci.m
    public final Collection b(ArrayList arrayList, ci.a aVar) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n nVarA = a((String) it.next(), aVar);
            if (nVarA != null) {
                arrayList2.add(nVarA);
            }
        }
        return arrayList2;
    }

    @Override // ci.j
    public final void c() {
        di.d<String, a> dVar = this.f27603d;
        dVar.f59691c.clear();
        dVar.f59692d = null;
        dVar.f59693e = null;
        dVar.f59694f = 0;
        j jVar = this.f27614a;
        if (jVar != null) {
            jVar.c();
        }
    }

    @Override // ci.j
    public final Set<String> d(n nVar, ci.a aVar) {
        Set<String> setA;
        nVar.getClass();
        String str = nVar.f27616a;
        aVar.getClass();
        if (aVar.f27592a.containsKey("do-not-store")) {
            return l0.f134950a;
        }
        n nVarA = a(str, aVar);
        long j8 = this.f27601b;
        di.d<String, a> dVar = this.f27603d;
        if (nVarA == null) {
            dVar.b(str, new a(nVar, j8));
            setA = nVar.a();
        } else {
            o13.p<n, Set<String>> pVarB = nVarA.b(nVar, null);
            n nVar2 = pVarB.f128594a;
            Set<String> set = pVarB.f128595b;
            dVar.b(str, new a(nVar2, j8));
            setA = set;
        }
        j jVar = this.f27614a;
        Set<String> setD = jVar != null ? jVar.d(nVar, aVar) : null;
        if (setD == null) {
            setD = l0.f134950a;
        }
        return c1.h(setA, setD);
    }

    @Override // ci.j
    public final Set<String> e(Collection<n> collection, ci.a aVar) {
        collection.getClass();
        aVar.getClass();
        if (aVar.f27592a.containsKey("do-not-store")) {
            return l0.f134950a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, d((n) it.next(), aVar));
        }
        return h0.g1(arrayList);
    }

    public /* synthetic */ h(int i14, long j8, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? Integer.MAX_VALUE : i14, (i15 & 2) != 0 ? -1L : j8);
    }

    public h() {
        this(0, 0L, 3, null);
    }
}
