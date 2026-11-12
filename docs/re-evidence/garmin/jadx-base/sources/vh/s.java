package vh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.w0;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f178391a = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b((String) ((o13.p) t7).f128594a, (String) ((o13.p) t14).f128594a);
        }
    }

    static {
        new t0("String");
        new t0("Int");
        new t0("Float");
        new t0("Boolean");
        new t0("ID");
        new m0.a("__Schema").a();
        new m0.a("__Type").a();
        new m0.a("__Field").a();
        new m0.a("__InputValue").a();
        new m0.a("__EnumValue").a();
        new m0.a("__Directive").a();
    }

    public static final t a(x xVar) {
        xVar.getClass();
        return new t(xVar);
    }

    public static final v b(x xVar) {
        xVar.getClass();
        return new v(xVar);
    }

    public static final Object c(Object obj, e0.b bVar) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof y) {
            return bVar.f178306a.get(((y) obj).f178395a);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(p13.t0.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), c(entry.getValue(), bVar));
            }
            return p13.u0.l(p13.h0.N0(w0.o(linkedHashMap), new a()));
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c(it.next(), bVar));
        }
        return arrayList;
    }
}
