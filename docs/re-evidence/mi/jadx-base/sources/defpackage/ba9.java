package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ba9 extends ife {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3980a = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, ca9> f3981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, Long> f3982b;

        public void a(String str, ca9 ca9Var) {
            this.f3981a.put(str, ca9Var);
        }

        public void b(String str) {
            this.f3981a.remove(str);
            this.f3982b.remove(str);
        }

        public a() {
            this.f3981a = new WeakHashMap();
            this.f3982b = new HashMap();
        }
    }

    public static void b(String str, ca9 ca9Var) {
        f3980a.a(str, ca9Var);
    }

    public static void c(String str) {
        f3980a.b(str);
    }
}
