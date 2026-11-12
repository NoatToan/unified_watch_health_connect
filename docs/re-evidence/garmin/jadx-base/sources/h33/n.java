package h33;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f81479a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f81480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<x33.c, x33.c> f81481c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f81480b = linkedHashMap;
        x33.i.f188617a.getClass();
        b(x33.i.B, a("java.util.ArrayList", "java.util.LinkedList"));
        b(x33.i.C, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(x33.i.D, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        x33.b.a aVar = x33.b.f188590d;
        x33.c cVar = new x33.c("java.util.function.Function");
        aVar.getClass();
        b(x33.b.a.b(cVar), a("java.util.function.UnaryOperator"));
        b(x33.b.a.b(new x33.c("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new o13.p(((x33.b) entry.getKey()).a(), ((x33.b) entry.getValue()).a()));
        }
        f81481c = u0.l(arrayList);
    }

    private n() {
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            x33.b.a aVar = x33.b.f188590d;
            x33.c cVar = new x33.c(str);
            aVar.getClass();
            arrayList.add(x33.b.a.b(cVar));
        }
        return arrayList;
    }

    public static void b(x33.b bVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f81480b.put(obj, bVar);
        }
    }
}
