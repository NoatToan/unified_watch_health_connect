package com.amap.api.col.p0003sl;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile d0 f5981b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, e0> f5982a = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5983a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f5984b = 86400;
        public int c = 10;
        public double d = 0.0d;

        public final void a(double d) {
            this.d = d;
        }

        public final void b(int i) {
            this.c = i;
        }

        public final void c(long j) {
            this.f5984b = j;
        }

        public final void d(boolean z) {
            this.f5983a = z;
        }

        public final boolean e() {
            return this.f5983a;
        }

        public final long f() {
            return this.f5984b;
        }

        public final int g() {
            return this.c;
        }

        public final double h() {
            return this.d;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5986b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                String str = this.f5985a;
                if (str == null) {
                    return bVar.f5985a == null && this.f5986b == bVar.f5986b;
                }
                if (str.equals(bVar.f5985a) && this.f5986b == bVar.f5986b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f5985a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            Object obj = this.f5986b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5988b;

        public c(Object obj, boolean z) {
            this.f5987a = obj;
            this.f5988b = z;
        }
    }

    public static d0 b() {
        if (f5981b == null) {
            synchronized (d0.class) {
                try {
                    if (f5981b == null) {
                        f5981b = new d0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5981b;
    }

    public final c a(b bVar) {
        c cVarA;
        if (bVar == null) {
            return null;
        }
        for (e0 e0Var : this.f5982a.values()) {
            if (e0Var != null && (cVarA = e0Var.a(bVar)) != null) {
                return cVarA;
            }
        }
        return null;
    }

    public final synchronized e0 c(String str) {
        return this.f5982a.get(str);
    }

    public final void d(a aVar) {
        if (aVar == null) {
            return;
        }
        for (e0 e0Var : this.f5982a.values()) {
            if (e0Var != null) {
                e0Var.c(aVar);
            }
        }
    }

    public final void e(b bVar, Object obj) {
        for (e0 e0Var : this.f5982a.values()) {
            if (e0Var != null) {
                e0Var.d(bVar, obj);
            }
        }
    }

    public final void f(String str, a aVar) {
        e0 e0Var;
        if (str == null || aVar == null || (e0Var = this.f5982a.get(str)) == null) {
            return;
        }
        e0Var.c(aVar);
    }

    public final synchronized void g(String str, e0 e0Var) {
        this.f5982a.put(str, e0Var);
    }

    public final boolean h(b bVar) {
        if (bVar == null) {
            return false;
        }
        for (e0 e0Var : this.f5982a.values()) {
            if (e0Var != null && e0Var.j(bVar)) {
                return true;
            }
        }
        return false;
    }
}
