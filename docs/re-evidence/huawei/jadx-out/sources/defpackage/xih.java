package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xih {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Integer, Integer> f53044b = new HashMap(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<Integer> f53043a = new ArrayList(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<Integer> f53045c = new ArrayList(16);
    private static Map<Integer, Integer> e = new HashMap(16);

    static {
        c();
        h();
        j();
        d();
    }

    public static Map<Integer, Integer> a() {
        return f53044b;
    }

    public static List<Integer> b() {
        return f53043a;
    }

    public static List<Integer> e() {
        return f53045c;
    }

    private static void c() {
        f53044b.put(1, 35);
        f53044b.put(2, 35);
    }

    private static void h() {
        f53043a.add(1005);
        f53043a.add(1006);
        f53043a.add(1007);
        f53043a.add(1008);
        f53043a.add(1009);
        f53043a.add(1010);
        f53043a.add(1011);
        f53043a.add(1012);
        f53043a.add(1013);
        f53043a.add(1016);
        f53043a.add(1020);
        f53043a.add(1023);
        f53043a.add(1024);
        f53043a.add(1025);
        f53043a.add(1021);
        f53043a.add(1020);
        f53043a.add(1029);
    }

    private static void j() {
        f53045c.add(1005);
        f53045c.add(1006);
        f53045c.add(1008);
        f53045c.add(1009);
        f53045c.add(1010);
        f53045c.add(1011);
        f53045c.add(1012);
        f53045c.add(1013);
        f53045c.add(1025);
        f53045c.add(1021);
        f53045c.add(1020);
        f53045c.add(1029);
    }

    private static void d() {
        e.put(1018, 1);
    }
}
