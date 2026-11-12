package aa0;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Laa0/a;", "", "Laa0/j;", "parsedData", "", "", "unusedGroups", "<init>", "(Laa0/j;Ljava/util/List;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Integer> f2189c;

    /* JADX INFO: renamed from: aa0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0024a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((hv.j) t7).d()), Integer.valueOf(((hv.j) t14).d()));
        }
    }

    public a(j jVar, List<Integer> list) {
        jVar.getClass();
        list.getClass();
        this.f2187a = jVar.f2215b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(jVar.f2214a);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.remove(Integer.valueOf(((Number) it.next()).intValue()));
        }
        this.f2188b = linkedHashMap;
        this.f2189c = h0.M0(linkedHashMap.keySet());
    }

    public final List<hv.j> a(int i14) {
        Integer num = (Integer) h0.e0(i14, this.f2189c);
        if (num == null) {
            return null;
        }
        List list = (List) this.f2188b.get(Integer.valueOf(num.intValue()));
        if (list != null) {
            return h0.N0(list, new C0024a());
        }
        return null;
    }

    public a(j jVar, List list, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(jVar, (i14 & 2) != 0 ? j0.f134944a : list);
    }
}
