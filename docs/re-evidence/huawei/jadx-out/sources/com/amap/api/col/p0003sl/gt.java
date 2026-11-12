package com.amap.api.col.p0003sl;

import com.huawei.hms.network.embedded.k;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile gt f2591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, gu> f2592b = new HashMap<>();

    public static gt a() {
        if (f2591a == null) {
            synchronized (gt.class) {
                if (f2591a == null) {
                    f2591a = new gt();
                }
            }
        }
        return f2591a;
    }

    public final gu a(String str) {
        gu guVar;
        synchronized (this) {
            guVar = this.f2592b.get(str);
        }
        return guVar;
    }

    public final void a(String str, gu guVar) {
        synchronized (this) {
            this.f2592b.put(str, guVar);
        }
    }

    public final c a(b bVar) {
        c cVarA;
        if (bVar == null) {
            return null;
        }
        for (gu guVar : this.f2592b.values()) {
            if (guVar != null && (cVarA = guVar.a(bVar)) != null) {
                return cVarA;
            }
        }
        return null;
    }

    public final void a(b bVar, Object obj) {
        for (gu guVar : this.f2592b.values()) {
            if (guVar != null) {
                guVar.a(bVar, obj);
            }
        }
    }

    public final boolean b(b bVar) {
        if (bVar == null) {
            return false;
        }
        for (gu guVar : this.f2592b.values()) {
            if (guVar != null && guVar.b(bVar)) {
                return true;
            }
        }
        return false;
    }

    public final void a(a aVar) {
        if (aVar == null) {
            return;
        }
        for (gu guVar : this.f2592b.values()) {
            if (guVar != null) {
                guVar.a(aVar);
            }
        }
    }

    public final void a(String str, a aVar) {
        gu guVar;
        if (str == null || aVar == null || (guVar = this.f2592b.get(str)) == null) {
            return;
        }
        guVar.a(aVar);
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f2598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f2599b;

        public c(Object obj, boolean z) {
            this.f2598a = obj;
            this.f2599b = z;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f2596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f2597b;

        b() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                b bVar = (b) obj;
                String str = this.f2596a;
                if (str == null) {
                    return bVar.f2596a == null && this.f2597b == bVar.f2597b;
                }
                if (str.equals(bVar.f2596a) && this.f2597b == bVar.f2597b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f2596a;
            int iHashCode = str == null ? 0 : str.hashCode();
            Object obj = this.f2597b;
            return ((iHashCode + 31) * 31) + (obj != null ? obj.hashCode() : 0);
        }
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2593a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f2594b = k.b.m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2595c = 10;
        private double d = 0.0d;

        a() {
        }

        public final boolean a() {
            return this.f2593a;
        }

        public final void a(boolean z) {
            this.f2593a = z;
        }

        public final long b() {
            return this.f2594b;
        }

        public final void a(long j) {
            this.f2594b = j;
        }

        public final int c() {
            return this.f2595c;
        }

        public final void a(int i) {
            this.f2595c = i;
        }

        public final double d() {
            return this.d;
        }

        public final void a(double d) {
            this.d = d;
        }
    }
}
