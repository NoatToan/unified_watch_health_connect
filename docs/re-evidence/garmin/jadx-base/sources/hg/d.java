package hg;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f83647a = new ConcurrentHashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f83648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f83649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f83650c;
    }

    public static String a(String str) {
        a aVar;
        String str2;
        ConcurrentHashMap concurrentHashMap = f83647a;
        if (concurrentHashMap == null || (aVar = (a) concurrentHashMap.get(str)) == null) {
            return null;
        }
        if (System.currentTimeMillis() - aVar.f83649b < aVar.f83650c && (str2 = aVar.f83648a) != null) {
            return str2;
        }
        concurrentHashMap.remove(str);
        return null;
    }

    public static void b(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        ConcurrentHashMap concurrentHashMap = f83647a;
        a aVar = (a) concurrentHashMap.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.f83648a = str2;
        aVar.f83650c = 86400000L;
        aVar.f83649b = System.currentTimeMillis();
        concurrentHashMap.put(str, aVar);
    }
}
