package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class lb {
    public static final Map<String, d> e = new ConcurrentHashMap();

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f39767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f39768b;
        public String d;
    }

    public static boolean b(long j, long j2) {
        return System.currentTimeMillis() - j < j2;
    }

    public static void c(String str, String str2, long j) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (j == 0) {
            j = 86400000;
        }
        Map<String, d> map = e;
        d dVar = map.get(str);
        if (dVar == null) {
            dVar = new d();
        }
        dVar.d = str2;
        dVar.f39768b = j;
        dVar.f39767a = System.currentTimeMillis();
        map.put(str, dVar);
    }

    public static void b(String str, String str2) {
        c(str, str2, 86400000L);
    }

    public static String b(String str) {
        Map<String, d> map;
        d dVar;
        String str2;
        if (str == null || (map = e) == null || (dVar = map.get(str)) == null) {
            return null;
        }
        if (b(dVar.f39767a, dVar.f39768b) && (str2 = dVar.d) != null) {
            return str2;
        }
        map.remove(str);
        return null;
    }
}
