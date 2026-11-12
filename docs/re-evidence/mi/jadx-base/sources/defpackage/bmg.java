package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class bmg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f4366a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f4367b = -1;
    public static int c = -1;
    public static HashMap<String, Boolean> d = new HashMap<>();

    public static void a() {
        c = f4367b;
    }

    public static void b(int i) {
        c = i;
    }

    public static boolean c() {
        return c != f4367b;
    }

    public static boolean d() {
        return (c & 1) != 0;
    }
}
