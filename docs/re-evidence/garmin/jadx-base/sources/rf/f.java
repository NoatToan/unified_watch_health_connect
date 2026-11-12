package rf;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lrf/f;", "Lrf/h;", "<init>", "()V", "b", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<rf.b.C2864b, ArrayList<b>> f152383a = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f152384b;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrf/f$b;", "", "Ljava/lang/ref/WeakReference;", "Lhf/h;", "Lcoil3/util/WeakReference;", "image", "", "", "extras", "", "size", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/util/Map;J)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<hf.h> f152385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f152386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f152387c;

        public b(WeakReference<hf.h> weakReference, Map<String, ? extends Object> map, long j8) {
            this.f152385a = weakReference;
            this.f152386b = map;
            this.f152387c = j8;
        }
    }

    static {
        new a(null);
    }

    @Override // rf.h
    public final rf.b.c a(rf.b.C2864b c2864b) {
        ArrayList<b> arrayList = this.f152383a.get(c2864b);
        rf.b.c cVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            b bVar = arrayList.get(i14);
            hf.h hVar = bVar.f152385a.get();
            rf.b.c cVar2 = hVar != null ? new rf.b.c(hVar, bVar.f152386b) : null;
            if (cVar2 != null) {
                cVar = cVar2;
                break;
            }
        }
        b();
        return cVar;
    }

    public final void b() {
        WeakReference<hf.h> weakReference;
        int i14 = this.f152384b;
        this.f152384b = i14 + 1;
        if (i14 >= 10) {
            this.f152384b = 0;
            Iterator<ArrayList<b>> it = this.f152383a.values().iterator();
            while (it.hasNext()) {
                ArrayList<b> next = it.next();
                if (next.size() <= 1) {
                    b bVar = (b) h0.d0(next);
                    if (((bVar == null || (weakReference = bVar.f152385a) == null) ? null : weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = next.size();
                    int i15 = 0;
                    for (int i16 = 0; i16 < size; i16++) {
                        int i17 = i16 - i15;
                        if (next.get(i17).f152385a.get() == null) {
                            next.remove(i17);
                            i15++;
                        }
                    }
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // rf.h
    public final void clear() {
        this.f152384b = 0;
        this.f152383a.clear();
    }

    @Override // rf.h
    public final boolean d(rf.b.C2864b c2864b) {
        return this.f152383a.remove(c2864b) != null;
    }

    @Override // rf.h
    public final void f(rf.b.C2864b c2864b, hf.h hVar, Map<String, ? extends Object> map, long j8) {
        LinkedHashMap<rf.b.C2864b, ArrayList<b>> linkedHashMap = this.f152383a;
        ArrayList<b> arrayList = linkedHashMap.get(c2864b);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(c2864b, arrayList);
        }
        ArrayList<b> arrayList2 = arrayList;
        b bVar = new b(new WeakReference(hVar), map, j8);
        if (arrayList2.isEmpty()) {
            arrayList2.add(bVar);
        } else {
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                b bVar2 = arrayList2.get(i14);
                if (j8 >= bVar2.f152387c) {
                    if (bVar2.f152385a.get() == hVar) {
                        arrayList2.set(i14, bVar);
                        break;
                    } else {
                        arrayList2.add(i14, bVar);
                        break;
                    }
                }
            }
        }
        b();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrf/f$a;", "", "<init>", "()V", "", "CLEAN_UP_INTERVAL", "I", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
